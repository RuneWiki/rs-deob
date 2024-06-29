import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class305 extends class199 {

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
    public static int field4464 = 0;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "[I")
    public static int[] field4455 = new int[1024];

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "[I")
    public static int[] field4462 = new int[100];

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
    public static int field4465 = 0;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "[I")
    public static int[] field4456 = new int[128];

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "Lfh;")
    public static class140 field4458;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "Lfh;")
    public static class140 field4459;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "[I")
    public static int[] field4457;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "[[B")
    public static byte[][] field4461;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "[[[I")
    public static int[][][] field4460;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(B)V", line = 4)
    public static final void method2133(byte arg0) {
        class210.field2973.method2262(false);
        field4469++;
        int var1 = -81 % ((-arg0 - 68) / 54);
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(B)V", line = 14)
    public static void method2134(byte arg0) {
        field4459 = null;
        field4461 = (byte[][]) null;
        field4456 = null;
        if (arg0 != 27) {
            method2133((byte) -96);
        }
        field4457 = null;
        field4462 = null;
        field4455 = null;
        field4460 = (int[][][]) null;
        field4458 = null;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 31)
    public class305() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[[I", line = 43)
    public final int[][] method215(int arg0, int arg1) {
        int[][] var3 = this.field2796.method2187(arg0, -108);
        if (this.field2796.field4667) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class95.field1235; var7++) {
                this.method2138((byte) -51, arg0, var7);
                int[][] var8 = this.method1459(0, class126.field1685, (byte) -51);
                var4[var7] = var8[0][class268.field3865];
                var5[var7] = var8[1][class268.field3865];
                var6[var7] = var8[2][class268.field3865];
            }
        }
        field4471++;
        return arg1 == -29869 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V", line = 85)
    public static final void method2135(int arg0) {
        for (int var1 = arg0; var1 < class318.field4689; var1++) {
            int var2 = class35.field430[var1];
            class169 var3 = class251.field3688[var2];
            int var4 = class240.field3490.method2096((byte) -122);
            if ((var4 & 0x1) != 0) {
                var4 += class240.field3490.method2096((byte) -122) << 8;
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class240.field3490.method2056(94);
                int var6 = class240.field3490.method2072(arg0 - 101);
                var3.method2292(class313.field4603, 0, var6, var5);
                var3.field4880 = class313.field4603 + 300;
                var3.field4917 = class240.field3490.method2056(47);
            }
            if ((var4 & 0x100) != 0) {
                int var7 = class240.field3490.method2090(-128);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class240.field3490.method2102((byte) 70);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var10[var11] = var12;
                    var8[var11] = class240.field3490.method2056(-107);
                    var9[var11] = class240.field3490.method2055(arg0 - 66);
                }
                class33.method211(var10, var3, var9, 0, var8);
            }
            if ((var4 & 0x10) != 0) {
                int var13 = class240.field3490.method2090(-128);
                int var14 = class240.field3490.method2072(-44);
                var3.method2292(class313.field4603, 0, var14, var13);
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field2345.method1205(0)) {
                    class65.method478((byte) 111, var3);
                }
                var3.method1250((byte) 94, class148.method1138(arg0 ^ 0xFFFFFFFD, class240.field3490.method2097((byte) 120)));
                var3.method2302(23751, var3.field2345.field2224);
                var3.field4903 = var3.field2345.field2197;
                var3.field4871 = var3.field2345.field2223;
                if (var3.field2345.method1205(0)) {
                    class1.method2(arg0 ^ 0x80, (class219) null, var3.field4842[0], var3, var3.field4936[0], (class239) null, 0, class56.field724);
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field4909 = class240.field3490.method2055(-66);
                var3.field4895 = class240.field3490.method2083((byte) -91);
            }
            if ((var4 & 0x20) != 0) {
                int var15 = class240.field3490.method2083((byte) -104);
                if (var15 == 65535) {
                    var15 = -1;
                }
                int var16 = class240.field3490.method2072(-77);
                class154.method1191(var15, var3, (byte) -118, var16);
            }
            if ((var4 & 0x4) != 0) {
                int var17 = class240.field3490.method2097((byte) 120);
                int var18 = class240.field3490.method2062(-25795);
                boolean var19 = true;
                if (var17 == 65535) {
                    var17 = -1;
                }
                if (var17 != -1 && var3.field4839 != -1 && class207.method1516(class234.method1664(-128, var17).field169, 119).field4638 < class207.method1516(class234.method1664(-128, var3.field4839).field169, arg0 + 120).field4638) {
                    var19 = false;
                }
                if (var19) {
                    var3.field4848 = 0;
                    var3.field4921 = 0;
                    var3.field4857 = 1;
                    var3.field4868 = (var18 & 0xFFFF) + class313.field4603;
                    if (var3.field4868 > class313.field4603) {
                        var3.field4921 = -1;
                    }
                    var3.field4851 = var18 >> 16;
                    var3.field4839 = var17;
                    if (var3.field4839 != -1 && class313.field4603 == var3.field4868) {
                        int var20 = class234.method1664(-128, var3.field4839).field169;
                        if (var20 != -1) {
                            class314 var21 = class207.method1516(var20, 120);
                            if (var21 != null && var21.field4631 != null) {
                                class296.method2025(var21, var3.field4893, var3.field4855, 0, false, false);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field4870 = class240.field3490.method2102((byte) -123);
                if (var3.field4870 == 65535) {
                    var3.field4870 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field4864 = class240.field3490.method2060(-12482);
                var3.field4918 = 100;
            }
        }
        field4454++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)I", line = 266)
    public static final int method2136(boolean arg0, int arg1) {
        if (!arg0) {
            field4457 = (int[]) null;
        }
        field4470++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 285)
    public static final String[] method2137(int arg0, String[] arg1) {
        field4466++;
        if (arg0 != -6) {
            method2135(66);
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLfd;I)V", line = 315)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg0 != -43) {
            this.method190(-47, -15);
        }
        field4467++;
        if (arg2 == 0) {
            this.field2795 = arg1.method2096((byte) -122) == 1;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BII)V", line = 343)
    private final void method2138(byte arg0, int arg1, int arg2) {
        field4468++;
        int var4 = class82.field1062[arg2];
        int var5 = class274.field3919[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var6 && -2.356194490192345D >= (double) var6) {
            class268.field3865 = arg2;
            class126.field1685 = arg1;
        } else if (-1.5707963267948966D >= (double) var6 && (double) var6 >= -2.356194490192345D) {
            class126.field1685 = arg2;
            class268.field3865 = arg1;
        } else if (-0.7853981633974483D >= (double) var6 && (double) var6 >= -1.5707963267948966D) {
            class268.field3865 = class95.field1235 - arg1;
            class126.field1685 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class126.field1685 = class224.field3233 - arg1;
            class268.field3865 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class268.field3865 = class95.field1235 - arg2;
            class126.field1685 = class224.field3233 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class268.field3865 = class95.field1235 - arg1;
            class126.field1685 = class224.field3233 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class268.field3865 = arg1;
            class126.field1685 = class224.field3233 - arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class126.field1685 = arg1;
            class268.field3865 = class95.field1235 - arg2;
        }
        class268.field3865 &= class245.field3573;
        if (arg0 == -51) {
            class126.field1685 &= class156.field2165;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[I", line = 424)
    public final int[] method190(int arg0, int arg1) {
        if (arg0 != -1735) {
            field4460 = (int[][][]) ((int[][][]) null);
        }
        field4463++;
        int[] var3 = this.field2802.method2502(arg1, arg0 ^ 0xFFFFF96D);
        if (this.field2802.field5637) {
            for (int var4 = 0; var4 < class95.field1235; var4++) {
                this.method2138((byte) -51, arg1, var4);
                int[] var5 = this.method1467(-7764, class126.field1685, 0);
                var3[var4] = var5[class268.field3865];
            }
        }
        return var3;
    }
}
