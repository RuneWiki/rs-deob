import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class205 extends class5 {

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public int field3997 = 2;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
    public int field3995 = 99;

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "Z")
    public boolean field4000 = false;

    @OriginalMember(owner = "client!wf", name = "fb", descriptor = "I")
    public int field4006 = -1;

    @OriginalMember(owner = "client!wf", name = "bb", descriptor = "I")
    public int field4002 = -1;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public int field3983 = 5;

    @OriginalMember(owner = "client!wf", name = "ab", descriptor = "I")
    public int field4001 = -1;

    @OriginalMember(owner = "client!wf", name = "ib", descriptor = "I")
    public int field4009 = -1;

    @OriginalMember(owner = "client!wf", name = "eb", descriptor = "I")
    public int field4005 = -1;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "I")
    public static int field3998 = 0;

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
    public static int field3999 = 0;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3985 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!wf", name = "db", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!wf", name = "gb", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!wf", name = "hb", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!wf", name = "jb", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "[I")
    public int[] field3982;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "[I")
    private int[] field3984;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "[I")
    public int[] field3991;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "[I")
    public int[] field3996;

    @OriginalMember(owner = "client!wf", name = "cb", descriptor = "[I")
    private int[] field4003;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)V")
    public static final void method1318(byte arg0, int arg1) {
        field4008++;
        class153.field3108 = -1;
        class158.field3206 = 1;
        if (arg0 >= -48) {
            method1323(-85, 50);
        }
        class104.field1971 = arg1;
        class5.field113 = null;
        class7.field152 = 0;
        class92.field1825 = false;
        class1.field32 = -1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILw;I)Lw;")
    public final class199 method1319(int arg0, int arg1, class199 arg2, int arg3) {
        field3988++;
        int var5 = this.field3996[arg0];
        class101 var6 = class69.method428(13051, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method401(true);
        }
        int var8 = arg3 & 0x3;
        class199 var9 = arg2.method401(!var6.method630(var7, (byte) 108));
        if (var8 == 1) {
            var9.method1302();
        } else if (var8 == 2) {
            var9.method1295();
        } else if (var8 == 3) {
            var9.method1298();
        }
        if (arg1 <= 62) {
            method1328((byte) -29);
        }
        var9.method395(var6, var7);
        if (var8 == 1) {
            var9.method1298();
        } else if (var8 == 2) {
            var9.method1295();
        } else if (var8 == 3) {
            var9.method1302();
        }
        return var9;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lw;BI)Lw;")
    public final class199 method1320(class199 arg0, byte arg1, int arg2) {
        field3993++;
        int var4 = this.field3996[arg2];
        class101 var5 = class69.method428(13051, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method401(true);
        }
        int var7 = 0;
        class101 var8 = null;
        if (this.field3984 != null && arg2 < this.field3984.length) {
            int var9 = this.field3984[arg2];
            var8 = class69.method428(arg1 + 13108, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class199 var11 = arg0.method401(!var5.method630(var6, (byte) 120));
            var11.method395(var5, var6);
            return var11;
        }
        class199 var10 = arg0.method401(!var5.method630(var6, (byte) 114) & !var8.method630(var7, (byte) 118));
        if (arg1 == -57) {
            var10.method395(var5, var6);
            var10.method395(var8, var7);
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lwf;IILw;B)Lw;")
    public final class199 method1321(class205 arg0, int arg1, int arg2, class199 arg3, byte arg4) {
        field3987++;
        int var6 = this.field3996[arg2];
        if (arg4 > -117) {
            return null;
        }
        class101 var7 = class69.method428(13051, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method1322(arg3, arg1, (byte) -119);
        }
        int var9 = arg0.field3996[arg1];
        class101 var10 = class69.method428(13051, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class199 var12 = arg3.method401(!var7.method630(var8, (byte) 117));
            var12.method395(var7, var8);
            return var12;
        } else {
            class199 var13 = arg3.method401(!var7.method630(var8, (byte) 125) & !var10.method630(var11, (byte) 126));
            var13.method398(var7, var8, var10, var11, this.field4003);
            return var13;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lw;IB)Lw;")
    public final class199 method1322(class199 arg0, int arg1, byte arg2) {
        field4004++;
        int var4 = this.field3996[arg1];
        class101 var5 = class69.method428(13051, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method401(true);
        }
        class199 var7 = arg0.method401(!var5.method630(var6, (byte) 109));
        if (arg2 >= -83) {
            this.method1320(null, (byte) -69, -93);
        }
        var7.method395(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
    public static final void method1323(int arg0, int arg1) {
        if (arg1 != 0) {
            method1325((byte) -13, -2, null, 12, -26, -21, null, 125, 19);
        }
        if (class158.field3206 == 0) {
            class38.field725.method722(arg0, 1);
        } else {
            class7.field152 = arg0;
        }
        field3992++;
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V")
    public final void method1324(int arg0) {
        if (this.field4005 == -1) {
            if (this.field4003 == null) {
                this.field4005 = 0;
            } else {
                this.field4005 = 2;
            }
        }
        if (this.field4002 == -1) {
            if (this.field4003 == null) {
                this.field4002 = 0;
            } else {
                this.field4002 = 2;
            }
        }
        field3994++;
        if (arg0 != -15232) {
            this.field3991 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BILqh;IIILte;II)V")
    public static final void method1325(byte arg0, int arg1, class153 arg2, int arg3, int arg4, int arg5, class177 arg6, int arg7, int arg8) {
        field3986++;
        if (class9.field163 && (class15.field232[0][arg1][arg4] & 0x2) == 0) {
            if ((class15.field232[arg7][arg1][arg4] & 0x10) != 0) {
                return;
            }
            if (class32.method181(arg4, arg7, arg1, false) != class109.field2114) {
                return;
            }
        }
        if (arg7 < class7.field145) {
            class7.field145 = arg7;
        }
        class23 var9 = class92.method592(arg8, (byte) 84);
        int var10;
        int var11;
        if (arg3 == 1 || arg3 == 3) {
            var10 = var9.field424;
            var11 = var9.field423;
        } else {
            var10 = var9.field423;
            var11 = var9.field424;
        }
        int var12;
        int var13;
        if (arg1 + var10 > 104) {
            var12 = arg1;
            var13 = arg1 + 1;
        } else {
            var12 = (var10 >> 1) + arg1;
            var13 = (var10 + 1 >> 1) + arg1;
        }
        int[][] var14 = class158.field3203[arg7];
        int var15;
        int var16;
        if (arg4 + var11 <= 104) {
            var15 = (var11 + 1 >> 1) + arg4;
            var16 = (var11 >> 1) + arg4;
        } else {
            var15 = arg4 + 1;
            var16 = arg4;
        }
        int var17 = -75 / ((arg0 - 64) / 53);
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg4 << 7) + (var11 << 6);
        int var20 = arg1 + (arg8 << 14) + (arg4 << 7) + 1073741824;
        int var21 = (arg3 << 6) + arg5;
        int var22 = var14[var12][var16] + var14[var13][var16] + var14[var13][var15] + var14[var12][var15] >> 2;
        if (var9.field422 == 0) {
            var20 += Integer.MIN_VALUE;
        }
        if (var9.field421 == 1) {
            var21 += 256;
        }
        if (var9.method113(true)) {
            class15.method66(119, arg7, var9, arg3, arg1, arg4);
        }
        if (arg5 == 22) {
            if (!class9.field163 || var9.field422 != 0 || var9.field406 == 1 || var9.field444) {
                class92 var23;
                if (var9.field417 == -1 && var9.field438 == null) {
                    var23 = var9.method121(var19, 22, var18, var22, arg3, -50, var14);
                } else {
                    var23 = new class157(arg8, 22, arg3, arg7, arg1, arg4, var9.field417, true, null);
                }
                arg6.method1140(arg7, arg1, arg4, var22, var23, var20, var21);
                if (var9.field406 == 1 && arg2 != null) {
                    arg2.method973((byte) -18, arg1, arg4);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class92 var46;
            if (var9.field417 == -1 && var9.field438 == null) {
                var46 = var9.method121(var19, 10, var18, var22, arg3, -50, var14);
            } else {
                var46 = new class157(arg8, 10, arg3, arg7, arg1, arg4, var9.field417, true, null);
            }
            if (var46 != null && arg6.method1132(arg7, arg1, arg4, var22, var10, var11, var46, arg5 == 11 ? 256 : 0, var20, var21) && var9.field446) {
                int var47 = 15;
                if (var46 instanceof class199) {
                    var47 = ((class199) var46).method1301() / 4;
                    if (var47 > 30) {
                        var47 = 30;
                    }
                }
                for (int var48 = 0; var48 <= var10; var48++) {
                    for (int var49 = 0; var49 <= var11; var49++) {
                        if (var47 > class67.field1351[arg7][arg1 + var48][arg4 + var49]) {
                            class67.field1351[arg7][arg1 + var48][arg4 + var49] = (byte) var47;
                        }
                    }
                }
            }
            if (var9.field406 != 0 && arg2 != null) {
                arg2.method971(arg4, var9.field396, arg1, (byte) -18, var10, var11);
            }
        } else if (arg5 >= 12) {
            class92 var24;
            if (var9.field417 == -1 && var9.field438 == null) {
                var24 = var9.method121(var19, arg5, var18, var22, arg3, -50, var14);
            } else {
                var24 = new class157(arg8, arg5, arg3, arg7, arg1, arg4, var9.field417, true, null);
            }
            arg6.method1132(arg7, arg1, arg4, var22, 1, 1, var24, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg7 > 0) {
                class161.field3256[arg7][arg1][arg4] = class33.method189(class161.field3256[arg7][arg1][arg4], 2340);
            }
            if (var9.field406 != 0 && arg2 != null) {
                arg2.method971(arg4, var9.field396, arg1, (byte) 25, var10, var11);
            }
        } else if (arg5 == 0) {
            class92 var25;
            if (var9.field417 == -1 && var9.field438 == null) {
                var25 = var9.method121(var19, 0, var18, var22, arg3, -50, var14);
            } else {
                var25 = new class157(arg8, 0, arg3, arg7, arg1, arg4, var9.field417, true, null);
            }
            arg6.method1138(arg7, arg1, arg4, var22, var25, null, class184.field3625[arg3], 0, var20, var21);
            if (arg3 == 0) {
                if (var9.field446) {
                    class67.field1351[arg7][arg1][arg4] = 50;
                    class67.field1351[arg7][arg1][arg4 + 1] = 50;
                }
                if (var9.field403) {
                    class161.field3256[arg7][arg1][arg4] = class33.method189(class161.field3256[arg7][arg1][arg4], 585);
                }
            } else if (arg3 == 1) {
                if (var9.field446) {
                    class67.field1351[arg7][arg1][arg4 + 1] = 50;
                    class67.field1351[arg7][arg1 + 1][arg4 + 1] = 50;
                }
                if (var9.field403) {
                    class161.field3256[arg7][arg1][arg4 + 1] = class33.method189(class161.field3256[arg7][arg1][arg4 + 1], 1170);
                }
            } else if (arg3 == 2) {
                if (var9.field446) {
                    class67.field1351[arg7][arg1 + 1][arg4] = 50;
                    class67.field1351[arg7][arg1 + 1][arg4 + 1] = 50;
                }
                if (var9.field403) {
                    class161.field3256[arg7][arg1 + 1][arg4] = class33.method189(class161.field3256[arg7][arg1 + 1][arg4], 585);
                }
            } else if (arg3 == 3) {
                if (var9.field446) {
                    class67.field1351[arg7][arg1][arg4] = 50;
                    class67.field1351[arg7][arg1 + 1][arg4] = 50;
                }
                if (var9.field403) {
                    class161.field3256[arg7][arg1][arg4] = class33.method189(class161.field3256[arg7][arg1][arg4], 1170);
                }
            }
            if (var9.field406 != 0 && arg2 != null) {
                arg2.method963(-25812, arg3, arg1, arg4, var9.field396, arg5);
            }
            if (var9.field430 != 16) {
                arg6.method1155(arg7, arg1, arg4, var9.field430);
            }
        } else if (arg5 == 1) {
            class92 var26;
            if (var9.field417 == -1 && var9.field438 == null) {
                var26 = var9.method121(var19, 1, var18, var22, arg3, -50, var14);
            } else {
                var26 = new class157(arg8, 1, arg3, arg7, arg1, arg4, var9.field417, true, null);
            }
            arg6.method1138(arg7, arg1, arg4, var22, var26, null, class61.field1251[arg3], 0, var20, var21);
            if (var9.field446) {
                if (arg3 == 0) {
                    class67.field1351[arg7][arg1][arg4 + 1] = 50;
                } else if (arg3 == 1) {
                    class67.field1351[arg7][arg1 + 1][arg4 + 1] = 50;
                } else if (arg3 == 2) {
                    class67.field1351[arg7][arg1 + 1][arg4] = 50;
                } else if (arg3 == 3) {
                    class67.field1351[arg7][arg1][arg4] = 50;
                }
            }
            if (var9.field406 != 0 && arg2 != null) {
                arg2.method963(-25812, arg3, arg1, arg4, var9.field396, arg5);
            }
        } else if (arg5 == 2) {
            int var27 = arg3 + 1 & 0x3;
            class92 var28;
            class92 var29;
            if (var9.field417 == -1 && var9.field438 == null) {
                var28 = var9.method121(var19, 2, var18, var22, arg3 + 4, -50, var14);
                var29 = var9.method121(var19, 2, var18, var22, var27, -50, var14);
            } else {
                var28 = new class157(arg8, 2, arg3 + 4, arg7, arg1, arg4, var9.field417, true, null);
                var29 = new class157(arg8, 2, var27, arg7, arg1, arg4, var9.field417, true, null);
            }
            arg6.method1138(arg7, arg1, arg4, var22, var28, var29, class184.field3625[arg3], class184.field3625[var27], var20, var21);
            if (var9.field403) {
                if (arg3 == 0) {
                    class161.field3256[arg7][arg1][arg4] = class33.method189(class161.field3256[arg7][arg1][arg4], 585);
                    class161.field3256[arg7][arg1][arg4 + 1] = class33.method189(class161.field3256[arg7][arg1][arg4 + 1], 1170);
                } else if (arg3 == 1) {
                    class161.field3256[arg7][arg1][arg4 + 1] = class33.method189(class161.field3256[arg7][arg1][arg4 + 1], 1170);
                    class161.field3256[arg7][arg1 + 1][arg4] = class33.method189(class161.field3256[arg7][arg1 + 1][arg4], 585);
                } else if (arg3 == 2) {
                    class161.field3256[arg7][arg1 + 1][arg4] = class33.method189(class161.field3256[arg7][arg1 + 1][arg4], 585);
                    class161.field3256[arg7][arg1][arg4] = class33.method189(class161.field3256[arg7][arg1][arg4], 1170);
                } else if (arg3 == 3) {
                    class161.field3256[arg7][arg1][arg4] = class33.method189(class161.field3256[arg7][arg1][arg4], 1170);
                    class161.field3256[arg7][arg1][arg4] = class33.method189(class161.field3256[arg7][arg1][arg4], 585);
                }
            }
            if (var9.field406 != 0 && arg2 != null) {
                arg2.method963(-25812, arg3, arg1, arg4, var9.field396, arg5);
            }
            if (var9.field430 != 16) {
                arg6.method1155(arg7, arg1, arg4, var9.field430);
            }
        } else if (arg5 == 3) {
            class92 var30;
            if (var9.field417 == -1 && var9.field438 == null) {
                var30 = var9.method121(var19, 3, var18, var22, arg3, -50, var14);
            } else {
                var30 = new class157(arg8, 3, arg3, arg7, arg1, arg4, var9.field417, true, null);
            }
            arg6.method1138(arg7, arg1, arg4, var22, var30, null, class61.field1251[arg3], 0, var20, var21);
            if (var9.field446) {
                if (arg3 == 0) {
                    class67.field1351[arg7][arg1][arg4 + 1] = 50;
                } else if (arg3 == 1) {
                    class67.field1351[arg7][arg1 + 1][arg4 + 1] = 50;
                } else if (arg3 == 2) {
                    class67.field1351[arg7][arg1 + 1][arg4] = 50;
                } else if (arg3 == 3) {
                    class67.field1351[arg7][arg1][arg4] = 50;
                }
            }
            if (var9.field406 != 0 && arg2 != null) {
                arg2.method963(-25812, arg3, arg1, arg4, var9.field396, arg5);
            }
        } else if (arg5 == 9) {
            class92 var31;
            if (var9.field417 == -1 && var9.field438 == null) {
                var31 = var9.method121(var19, arg5, var18, var22, arg3, -50, var14);
            } else {
                var31 = new class157(arg8, arg5, arg3, arg7, arg1, arg4, var9.field417, true, null);
            }
            arg6.method1132(arg7, arg1, arg4, var22, 1, 1, var31, 0, var20, var21);
            if (var9.field406 != 0 && arg2 != null) {
                arg2.method971(arg4, var9.field396, arg1, (byte) -128, var10, var11);
            }
            if (var9.field430 != 16) {
                arg6.method1155(arg7, arg1, arg4, var9.field430);
            }
        } else if (arg5 == 4) {
            class92 var32;
            if (var9.field417 == -1 && var9.field438 == null) {
                var32 = var9.method121(var19, 4, var18, var22, arg3, -50, var14);
            } else {
                var32 = new class157(arg8, 4, arg3, arg7, arg1, arg4, var9.field417, true, null);
            }
            arg6.method1115(arg7, arg1, arg4, var22, var32, null, class184.field3625[arg3], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var33 = 16;
            int var34 = arg6.method1113(arg7, arg1, arg4);
            if (var34 != 0) {
                var33 = class92.method592(var34 >> 14 & 0x7FFF, (byte) 42).field430;
            }
            class92 var35;
            if (var9.field417 == -1 && var9.field438 == null) {
                var35 = var9.method121(var19, 4, var18, var22, arg3, -50, var14);
            } else {
                var35 = new class157(arg8, 4, arg3, arg7, arg1, arg4, var9.field417, true, null);
            }
            arg6.method1115(arg7, arg1, arg4, var22, var35, null, class184.field3625[arg3], 0, class23.field452[arg3] * var33, class171.field3425[arg3] * var33, var20, var21);
        } else if (arg5 == 6) {
            int var36 = arg6.method1113(arg7, arg1, arg4);
            int var37 = 8;
            if (var36 != 0) {
                var37 = class92.method592(var36 >> 14 & 0x7FFF, (byte) 104).field430 / 2;
            }
            class92 var38;
            if (var9.field417 == -1 && var9.field438 == null) {
                var38 = var9.method121(var19, 4, var18, var22, arg3 + 4, -50, var14);
            } else {
                var38 = new class157(arg8, 4, arg3 + 4, arg7, arg1, arg4, var9.field417, true, null);
            }
            arg6.method1115(arg7, arg1, arg4, var22, var38, null, 256, arg3, class57.field1117[arg3] * var37, class108.field2060[arg3] * var37, var20, var21);
        } else if (arg5 == 7) {
            int var39 = arg3 + 2 & 0x3;
            class92 var40;
            if (var9.field417 == -1 && var9.field438 == null) {
                var40 = var9.method121(var19, 4, var18, var22, var39 + 4, -50, var14);
            } else {
                var40 = new class157(arg8, 4, var39 + 4, arg7, arg1, arg4, var9.field417, true, null);
            }
            arg6.method1115(arg7, arg1, arg4, var22, var40, null, 256, var39, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var41 = 8;
            int var42 = arg6.method1113(arg7, arg1, arg4);
            if (var42 != 0) {
                var41 = class92.method592(var42 >> 14 & 0x7FFF, (byte) 107).field430 / 2;
            }
            int var43 = arg3 + 2 & 0x3;
            class92 var44;
            class92 var45;
            if (var9.field417 == -1 && var9.field438 == null) {
                var44 = var9.method121(var19, 4, var18, var22, arg3 + 4, -50, var14);
                var45 = var9.method121(var19, 4, var18, var22, var43 + 4, -50, var14);
            } else {
                var44 = new class157(arg8, 4, arg3 + 4, arg7, arg1, arg4, var9.field417, true, null);
                var45 = new class157(arg8, 4, var43 + 4, arg7, arg1, arg4, var9.field417, true, null);
            }
            arg6.method1115(arg7, arg1, arg4, var22, var44, var45, 256, arg3, class57.field1117[arg3] * var41, class108.field2060[arg3] * var41, var20, var21);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILw;I)Lw;")
    public final class199 method1326(int arg0, class199 arg1, int arg2) {
        field3989++;
        int var4 = this.field3996[arg2];
        class101 var5 = class69.method428(13051, var4 >> 16);
        int var6 = var4 & arg0;
        if (var5 == null) {
            return arg1.method389(true);
        } else {
            class199 var7 = arg1.method389(!var5.method630(var6, (byte) 118));
            var7.method395(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BILjg;)V")
    private final void method1327(byte arg0, int arg1, class89 arg2) {
        if (arg1 == 1) {
            int var11 = arg2.method555(-1113627096);
            this.field3991 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3991[var12] = arg2.method555(-1113627096);
            }
            this.field3996 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field3996[var13] = arg2.method555(-1113627096);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field3996[var14] += arg2.method555(-1113627096) << 16;
            }
        } else if (arg1 == 2) {
            this.field4006 = arg2.method555(-1113627096);
        } else if (arg1 == 3) {
            int var9 = arg2.method538((byte) -45);
            this.field4003 = new int[var9 + 1];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field4003[var10] = arg2.method538((byte) 100);
            }
            this.field4003[var9] = 9999999;
        } else if (arg1 == 4) {
            this.field4000 = true;
        } else if (arg1 == 5) {
            this.field3983 = arg2.method538((byte) 80);
        } else if (arg1 == 6) {
            this.field4001 = arg2.method555(arg0 - 1113627092);
        } else if (arg1 == 7) {
            this.field4009 = arg2.method555(arg0 - 1113627092);
        } else if (arg1 == 8) {
            this.field3995 = arg2.method538((byte) 106);
        } else if (arg1 == 9) {
            this.field4005 = arg2.method538((byte) -94);
        } else if (arg1 == 10) {
            this.field4002 = arg2.method538((byte) -119);
        } else if (arg1 == 11) {
            this.field3997 = arg2.method538((byte) -97);
        } else if (arg1 == 12) {
            int var4 = arg2.method538((byte) 100);
            this.field3984 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3984[var5] = arg2.method555(-1113627096);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3984[var6] = (arg2.method555(-1113627096) << 16) + this.field3984[var6];
            }
        } else if (arg1 == 13) {
            int var7 = arg2.method538((byte) 81);
            this.field3982 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3982[var8] = arg2.method565(3);
            }
        }
        field4007++;
        if (arg0 != -4) {
            this.method1320(null, (byte) 111, 41);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static final void method1328(byte arg0) {
        field4010++;
        if (class175.field3490 > 0) {
            class175.field3490--;
        }
        if (class204.field3970 > 1) {
            class204.field3970--;
        }
        if (class40.field757) {
            class40.field757 = false;
            class54.method332((byte) 30);
            return;
        }
        for (int var1 = 0; var1 < 100 && class176.method1105(arg0 ^ 0xFFFFABA8); var1++) {
        }
        if (class174.field3473 != 30) {
            return;
        }
        class64.method406(-110, class29.field522, 113);
        Object var2 = class23.field453.field3215;
        synchronized (class23.field453.field3215) {
            if (!class58.field1174) {
                class23.field453.field3220 = 0;
            } else if (class185.field3649 != 0 || class23.field453.field3220 >= 40) {
                int var3 = 0;
                class29.field522.method338(253, 236);
                class50.field1006++;
                class29.field522.method539(0, 27678);
                int var4 = class29.field522.field1727;
                for (int var5 = 0; var5 < class23.field453.field3220 && class29.field522.field1727 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class23.field453.field3221[var5];
                    int var7 = class23.field453.field3219[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class23.field453.field3221[var5] == -1 && class23.field453.field3219[var5] == -1) {
                        var6 = -1;
                        var8 = 524287;
                        var7 = -1;
                    }
                    if (class193.field3760 != var7 || class93.field1840 != var6) {
                        int var9 = var7 - class193.field3760;
                        class193.field3760 = var7;
                        int var10 = var6 - class93.field1840;
                        class93.field1840 = var6;
                        if (class81.field1601 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class29.field522.method546(false, (class81.field1601 << 12) + (var9 << 6) + var10);
                            class81.field1601 = 0;
                        } else if (class81.field1601 < 8) {
                            class29.field522.method549((class81.field1601 << 19) + var8 + 8388608, (byte) 124);
                            class81.field1601 = 0;
                        } else {
                            class29.field522.method581((class81.field1601 << 19) + var8 - 1073741824, arg0 + -268435555);
                            class81.field1601 = 0;
                        }
                    } else if (class81.field1601 < 2047) {
                        class81.field1601++;
                    }
                }
                class29.field522.method554(class29.field522.field1727 - var4, (byte) -111);
                if (class23.field453.field3220 <= var3) {
                    class23.field453.field3220 = 0;
                } else {
                    class23.field453.field3220 -= var3;
                    for (int var11 = 0; var11 < class23.field453.field3220; var11++) {
                        class23.field453.field3219[var11] = class23.field453.field3219[var11 + var3];
                        class23.field453.field3221[var11] = class23.field453.field3221[var3 + var11];
                    }
                }
            }
        }
        if (class185.field3649 != 0) {
            class148.field3019++;
            int var12 = class187.field3673;
            long var13 = (class103.field1959 - class189.field3701) / 50L;
            int var15 = class41.field814;
            class189.field3701 = class103.field1959;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 502) {
                var12 = 502;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var12 * 765 + var15;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            byte var17 = 0;
            if (class185.field3649 == 2) {
                var17 = 1;
            }
            int var18 = (int) var13;
            class29.field522.method338(253, 220);
            class29.field522.method573((var18 << 20) + ((var17 << 19) + var16), (byte) 58);
        }
        if (class49.field993 > 0) {
            class49.field993--;
        }
        if (class101.field1935[96] || class101.field1935[97] || class101.field1935[98] || class101.field1935[99]) {
            class122.field2439 = true;
        }
        if (class122.field2439 && class49.field993 <= 0) {
            class124.field2456++;
            class49.field993 = 20;
            class122.field2439 = false;
            class29.field522.method338(arg0 ^ 0x9E, 148);
            class29.field522.method572((byte) 57, class88.field1715);
            class29.field522.method556(108, class142.field2933);
        }
        if (class119.field2376 && !class27.field481) {
            class27.field481 = true;
            class29.field522.method338(arg0 ^ 0x9E, 26);
            class60.field1228++;
            class29.field522.method539(1, 27678);
        }
        if (!class119.field2376 && class27.field481) {
            class60.field1228++;
            class27.field481 = false;
            class29.field522.method338(253, 26);
            class29.field522.method539(0, arg0 ^ 0x6C7D);
        }
        class93.method597(0);
        if (class174.field3473 != 30) {
            return;
        }
        class194.method1238(false);
        class88.method527(112);
        class20.field343++;
        if (class20.field343 > 750) {
            class54.method332((byte) 30);
            return;
        }
        class154.method978(arg0 - 4);
        class175.method1100(32286);
        class101.method627(-10542);
        if (class148.field3024 != 0) {
            class13.field201 += 20;
            if (class13.field201 >= 400) {
                class148.field3024 = 0;
            }
        }
        class65.field1325++;
        if (class75.field1482 != null) {
            class90.field1793++;
            if (class90.field1793 >= 15) {
                class43.method265(false, class75.field1482);
                class75.field1482 = null;
            }
        }
        if (class121.field2417 != null) {
            class43.method265(false, class121.field2417);
            class88.field1714++;
            if (class185.field3654 > class194.field3807 + 5 || class194.field3807 - 5 > class185.field3654 || class167.field3316 + 5 < class105.field1998 || class105.field1998 < class167.field3316 - 5) {
                class18.field307 = true;
            }
            if (class21.field357 == 0) {
                if (class18.field307 && class88.field1714 >= 5) {
                    if (class167.field3323 == class121.field2417 && class161.field3254 != class16.field251) {
                        class114.field2157++;
                        byte var19 = 0;
                        class129 var20 = class121.field2417;
                        if (class121.field2399 == 1 && var20.field2646 == 206) {
                            var19 = 1;
                        }
                        if (var20.field2597[class16.field251] <= 0) {
                            var19 = 0;
                        }
                        if (class40.method220((byte) 48, class193.method1231((byte) -120, var20))) {
                            int var21 = class161.field3254;
                            int var22 = class16.field251;
                            var20.field2597[var22] = var20.field2597[var21];
                            var20.field2609[var22] = var20.field2609[var21];
                            var20.field2597[var21] = -1;
                            var20.field2609[var21] = 0;
                        } else if (var19 == 1) {
                            int var23 = class161.field3254;
                            int var24 = class16.field251;
                            while (var23 != var24) {
                                if (var24 < var23) {
                                    var20.method838(var23, var23 - 1, true);
                                    var23--;
                                } else if (var23 < var24) {
                                    var20.method838(var23, var23 + 1, true);
                                    var23++;
                                }
                            }
                        } else {
                            var20.method838(class161.field3254, class16.field251, true);
                        }
                        class29.field522.method338(253, 104);
                        class29.field522.method556(122, class161.field3254);
                        class29.field522.method546(false, class16.field251);
                        class29.field522.method571((byte) -81, class121.field2417.field2664);
                        class29.field522.method580(22265, var19);
                    }
                } else if ((class99.field1904 == 1 || class97.method612(-25553, class41.field799 - 1)) && class41.field799 > 2) {
                    class100.method622((byte) -105);
                } else if (class41.field799 > 0) {
                    class114.method714((byte) 116, class41.field799 - 1);
                }
                class121.field2417 = null;
                class185.field3649 = 0;
                class90.field1793 = 10;
            }
        }
        class100.field1909 = null;
        class55.field1106 = false;
        class108.field2081 = 0;
        class85.field1664 = false;
        class129 var25 = class118.field2299;
        class118.field2299 = null;
        class129 var26 = class82.field1625;
        class82.field1625 = null;
        while (class66.method414(1) && class108.field2081 < 128) {
            class4.field94[class108.field2081] = class112.field2148;
            class167.field3305[class108.field2081] = class116.field2271;
            class108.field2081++;
        }
        if (class187.field3666 != -1) {
            class174.method1097(arg0 ^ 0x63C5, 765, 0, 503, class187.field3666, 0, 0, 0);
        }
        class200.field3940++;
        while (true) {
            class115 var27;
            class129 var28;
            class129 var29;
            do {
                var27 = (class115) class73.field1448.method757(false);
                if (var27 == null) {
                    while (true) {
                        class115 var30;
                        class129 var31;
                        class129 var32;
                        do {
                            var30 = (class115) class109.field2105.method757(false);
                            if (var30 == null) {
                                while (true) {
                                    class115 var33;
                                    class129 var34;
                                    class129 var35;
                                    do {
                                        var33 = (class115) class171.field3407.method757(false);
                                        if (var33 == null) {
                                            if (class148.field3021 != null) {
                                                class5.method29(arg0 - 54);
                                            }
                                            if (class177.field3543 != -1) {
                                                int var36 = class177.field3543;
                                                int var37 = class177.field3546;
                                                boolean var38 = class104.method642(0, arg0 ^ 0xFFFFFFF8, class67.field1348.field2335[0], var37, var36, 0, class67.field1348.field2357[0], 0, true, 0, 0, 0);
                                                class177.field3543 = -1;
                                                if (var38) {
                                                    class99.field1901 = class187.field3673;
                                                    class148.field3024 = 1;
                                                    class13.field201 = 0;
                                                    class52.field1050 = class41.field814;
                                                }
                                            }
                                            class4.method26((byte) -117);
                                            if (class118.field2299 != var25) {
                                                if (var25 != null) {
                                                    class43.method265(false, var25);
                                                }
                                                if (class118.field2299 != null) {
                                                    class43.method265(false, class118.field2299);
                                                }
                                            }
                                            if (class82.field1625 != var26 && class97.field1884 == class36.field670) {
                                                if (var26 != null) {
                                                    class43.method265(false, var26);
                                                }
                                                if (class82.field1625 != null) {
                                                    class43.method265(false, class82.field1625);
                                                }
                                            }
                                            if (arg0 != 99) {
                                                method1328((byte) -76);
                                            }
                                            if (class82.field1625 == null) {
                                                if (class97.field1884 > 0) {
                                                    class97.field1884--;
                                                }
                                            } else if (class97.field1884 < class36.field670) {
                                                class97.field1884++;
                                                if (class97.field1884 == class36.field670) {
                                                    class43.method265(false, class82.field1625);
                                                }
                                            }
                                            class157.method992((byte) -16);
                                            if (class117.field2282) {
                                                class106.method659(9405);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class156.field3155[var39]++;
                                            }
                                            int var40 = class61.method387(108);
                                            int var41 = class137.method887(30);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class171.field3421++;
                                                class175.field3490 = 250;
                                                class39.method213(4000, 119);
                                                class29.field522.method338(253, 90);
                                            }
                                            class68.field1365++;
                                            class22.field373++;
                                            class26.field478++;
                                            if (class26.field478 > 500) {
                                                class26.field478 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x2) == 2) {
                                                    class48.field978 += class180.field3587;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class149.field3026 += class55.field1107;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class24.field456 += class186.field3662;
                                                }
                                            }
                                            if (class48.field978 < -55) {
                                                class180.field3587 = 2;
                                            }
                                            if (class68.field1365 > 500) {
                                                class68.field1365 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x1) == 1) {
                                                    class204.field3967 += class136.field2826;
                                                }
                                                if ((var43 & 0x2) == 2) {
                                                    class54.field1091 += class95.field1858;
                                                }
                                            }
                                            if (class54.field1091 < -20) {
                                                class95.field1858 = 1;
                                            }
                                            if (class204.field3967 < -60) {
                                                class136.field2826 = 2;
                                            }
                                            if (class24.field456 < -50) {
                                                class186.field3662 = 2;
                                            }
                                            if (class149.field3026 < -40) {
                                                class55.field1107 = 1;
                                            }
                                            if (class24.field456 > 50) {
                                                class186.field3662 = -2;
                                            }
                                            if (class149.field3026 > 40) {
                                                class55.field1107 = -1;
                                            }
                                            if (class54.field1091 > 10) {
                                                class95.field1858 = -1;
                                            }
                                            if (class204.field3967 > 60) {
                                                class136.field2826 = -2;
                                            }
                                            if (class48.field978 > 55) {
                                                class180.field3587 = -2;
                                            }
                                            if (class22.field373 > 50) {
                                                class194.field3780++;
                                                class29.field522.method338(253, 221);
                                            }
                                            try {
                                                if (class48.field977 != null && class29.field522.field1727 > 0) {
                                                    class48.field977.method524(class29.field522.field1769, class29.field522.field1727, (byte) 122, 0);
                                                    class29.field522.field1727 = 0;
                                                    class22.field373 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class54.method332((byte) 30);
                                                return;
                                            }
                                        }
                                        var34 = var33.field2249;
                                        if (var34.field2661 < 0) {
                                            break;
                                        }
                                        var35 = class124.method801((byte) -36, var34.field2576);
                                    } while (var35 == null || var35.field2626 == null || var34.field2661 >= var35.field2626.length || var35.field2626[var34.field2661] != var34);
                                    class203.method1311(var33, 3538);
                                }
                            }
                            var31 = var30.field2249;
                            if (var31.field2661 < 0) {
                                break;
                            }
                            var32 = class124.method801((byte) -36, var31.field2576);
                        } while (var32 == null || var32.field2626 == null || var32.field2626.length <= var31.field2661 || var32.field2626[var31.field2661] != var31);
                        class203.method1311(var30, 3538);
                    }
                }
                var28 = var27.field2249;
                if (var28.field2661 < 0) {
                    break;
                }
                var29 = class124.method801((byte) -36, var28.field2576);
            } while (var29 == null || var29.field2626 == null || var29.field2626.length <= var28.field2661 || var29.field2626[var28.field2661] != var28);
            class203.method1311(var27, 3538);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
    public static void method1329(byte arg0) {
        if (arg0 > -119) {
            field3985 = null;
        }
        field3985 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjg;)V")
    public final void method1330(int arg0, class89 arg1) {
        if (arg0 != -1) {
            this.method1326(-29, null, 27);
        }
        field3990++;
        while (true) {
            int var3 = arg1.method538((byte) 97);
            if (var3 == 0) {
                return;
            }
            this.method1327((byte) -4, var3, arg1);
        }
    }
}
