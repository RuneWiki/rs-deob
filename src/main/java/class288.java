import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class288 extends class170 {

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
    public static int field4927 = 0;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "[I")
    public static int[] field4929 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "Lcb;")
    public static class270 field4925;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "Ldj;")
    public static class314 field4924;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "[Lvd;")
    public static class127[] field4921;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)V", line = 4)
    public static final void method1983(byte arg0) {
        class234.field4033 = 0;
        class56.field1085 = 0;
        class297.field5071 = null;
        class65.field1250 = 0;
        class181.field3174 = 0;
        class7.field149 = 2;
        field4930++;
        if (arg0 != 66) {
            field4927 = 22;
        }
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(B)V", line = 22)
    public static void method1984(byte arg0) {
        if (arg0 == 107) {
            field4925 = null;
            field4929 = null;
            field4921 = null;
            field4924 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 48)
    public class288() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIBIII)V", line = 52)
    public static final void method1985(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field4920++;
        for (int var6 = arg1; var6 <= arg1 + arg5; var6++) {
            for (int var7 = arg0; var7 <= arg0 + arg3; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class252.field4355[arg4][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg1; var8 < (arg1 + arg5); var8++) {
            for (int var9 = arg0; var9 < arg0 + arg3; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class250.field4334[arg4][var9][var8] = arg4 <= 0 ? 0 : class250.field4334[arg4 - 1][var9][var8];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var10 = arg1 + 1; var10 < arg1 + arg5; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class250.field4334[arg4][arg0][var10] = class250.field4334[arg4][arg0 - 1][var10];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var11 = arg0 + 1; var11 < (arg0 + arg3); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class250.field4334[arg4][var11][arg1] = class250.field4334[arg4][var11][arg1 - 1];
                }
            }
        }
        if (arg0 >= 0 && arg1 >= 0 && arg0 < 104 && arg1 < 104) {
            if (arg4 == 0) {
                if (arg0 > 0 && class250.field4334[arg4][arg0 - 1][arg1] != 0) {
                    class250.field4334[arg4][arg0][arg1] = class250.field4334[arg4][arg0 - 1][arg1];
                } else if (arg1 > 0 && class250.field4334[arg4][arg0][arg1 - 1] != 0) {
                    class250.field4334[arg4][arg0][arg1] = class250.field4334[arg4][arg0][arg1 - 1];
                } else if (arg0 > 0 && arg1 > 0 && class250.field4334[arg4][arg0 - 1][arg1 - 1] != 0) {
                    class250.field4334[arg4][arg0][arg1] = class250.field4334[arg4][arg0 - 1][arg1 - 1];
                }
            } else if (arg0 > 0 && class250.field4334[arg4 - 1][arg0 - 1][arg1] != class250.field4334[arg4][arg0 - 1][arg1]) {
                class250.field4334[arg4][arg0][arg1] = class250.field4334[arg4][arg0 - 1][arg1];
            } else if (arg1 > 0 && class250.field4334[arg4][arg0][arg1 - 1] != class250.field4334[arg4 - 1][arg0][arg1 - 1]) {
                class250.field4334[arg4][arg0][arg1] = class250.field4334[arg4][arg0][arg1 - 1];
            } else if (arg0 > 0 && arg1 > 0 && class250.field4334[arg4 - 1][arg0 - 1][arg1 - 1] != class250.field4334[arg4][arg0 - 1][arg1 - 1]) {
                class250.field4334[arg4][arg0][arg1] = class250.field4334[arg4][arg0 - 1][arg1 - 1];
            }
        }
        if (arg2 <= 58) {
            method1985(-24, 34, (byte) -74, 44, -45, 62);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(IBI)I", line = 174)
    public static final int method1986(int arg0, byte arg1, int arg2) {
        field4922++;
        if (arg1 != -53) {
            field4927 = 44;
        }
        class245 var3 = (class245) class151.field2591.method728(false, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field4184.length) {
            return var3.field4184[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V", line = 201)
    public static final void method1987(int arg0) {
        field4918++;
        class308.method2101((byte) 118);
        class42.method291(-119);
        class228.method1560((byte) 90);
        class26.method168(60);
        class94.method591((byte) -76);
        class187.method1258(0);
        class195.method1359(true);
        class196.method1360(-96);
        if (arg0 <= 84) {
            return;
        }
        class313.method2137(-113);
        class255.method1801(0);
        class215.method1487((byte) -127);
        class245.method1668(0);
        class233.method1600(126);
        class8.method65(-2);
        class93.field1575.method1834(17);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)[I", line = 228)
    public final int[] method69(byte arg0, int arg1) {
        field4923++;
        if (arg0 != 85) {
            field4928 = -112;
        }
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            class224.method1543(var3, 0, class185.field3225, class307.field5221[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V", line = 250)
    public static final void method1988(int arg0) {
        class37.field748.method1832((byte) 48);
        if (arg0 != -19681) {
            field4921 = (class127[]) null;
        }
        class99.field1713.method1832((byte) 99);
        field4917++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V", line = 263)
    public static final void method1989() {
        if (class96.field1632 != null) {
            for (int var0 = 0; var0 < class96.field1632.length; var0++) {
                for (int var1 = 0; var1 < class297.field5067; var1++) {
                    for (int var2 = 0; var2 < class155.field2670; var2++) {
                        class96.field1632[var0][var1][var2] = null;
                    }
                }
            }
        }
        class38.field762 = (class154[][]) null;
        if (class260.field4495 != null) {
            for (int var3 = 0; var3 < class260.field4495.length; var3++) {
                for (int var4 = 0; var4 < class297.field5067; var4++) {
                    for (int var5 = 0; var5 < class155.field2670; var5++) {
                        class260.field4495[var3][var4][var5] = null;
                    }
                }
            }
        }
        class146.field2502 = (class154[][]) null;
        class240.field4094 = 0;
        if (class266.field4612 != null) {
            for (int var6 = 0; var6 < class240.field4094; var6++) {
                class266.field4612[var6] = null;
            }
        }
        if (class298.field5087 != null) {
            for (int var7 = 0; var7 < class134.field2335; var7++) {
                class298.field5087[var7] = null;
            }
            class134.field2335 = 0;
        }
        if (class30.field677 != null) {
            for (int var8 = 0; var8 < class30.field677.length; var8++) {
                class30.field677[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)Ltj;", line = 374)
    public static final class170 method1990(int arg0, int arg1) {
        if (arg0 <= 52) {
            field4925 = (class270) null;
        }
        field4919++;
        if (arg1 == 0) {
            return new class255();
        } else if (arg1 == 1) {
            return new class31();
        } else if (arg1 == 2) {
            return new class53();
        } else if (arg1 == 3) {
            return new class288();
        } else if (arg1 == 4) {
            return new class260();
        } else if (arg1 == 5) {
            return new class117();
        } else if (arg1 == 6) {
            return new class8();
        } else if (arg1 == 7) {
            return new class142();
        } else if (arg1 == 8) {
            return new class69();
        } else if (arg1 == 9) {
            return new class107();
        } else if (arg1 == 10) {
            return new class148();
        } else if (arg1 == 11) {
            return new class192();
        } else if (arg1 == 12) {
            return new class278();
        } else if (arg1 == 13) {
            return new class146();
        } else if (arg1 == 14) {
            return new class11();
        } else if (arg1 == 15) {
            return new class139();
        } else if (arg1 == 16) {
            return new class156();
        } else if (arg1 == 17) {
            return new class169();
        } else if (arg1 == 18) {
            return new class307();
        } else if (arg1 == 19) {
            return new class39();
        } else if (arg1 == 20) {
            return new class12();
        } else if (arg1 == 21) {
            return new class15();
        } else if (arg1 == 22) {
            return new class298();
        } else if (arg1 == 23) {
            return new class86();
        } else if (arg1 == 24) {
            return new class295();
        } else if (arg1 == 25) {
            return new class268();
        } else if (arg1 == 26) {
            return new class166();
        } else if (arg1 == 27) {
            return new class84();
        } else if (arg1 == 28) {
            return new class216();
        } else if (arg1 == 29) {
            return new class276();
        } else if (arg1 == 30) {
            return new class187();
        } else if (arg1 == 31) {
            return new class248();
        } else if (arg1 == 32) {
            return new class211();
        } else if (arg1 == 33) {
            return new class273();
        } else if (arg1 == 34) {
            return new class279();
        } else if (arg1 == 35) {
            return new class70();
        } else if (arg1 == 36) {
            return new class219();
        } else if (arg1 == 37) {
            return new class114();
        } else if (arg1 == 38) {
            return new class113();
        } else if (arg1 == 39) {
            return new class63();
        } else {
            return null;
        }
    }
}
