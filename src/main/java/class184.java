import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class184 extends class114 {

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    private int field2790 = 4096;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "Z")
    private boolean field2787 = true;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2792 = "glow3:";

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "[[[B")
    public static byte[][][] field2796;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "[[[Lbe;")
    public static class91[][][] field2793;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILnh;)Lnl;")
    public static final class258 method1171(byte arg0, int arg1, class305 arg2) {
        if (arg0 >= -66) {
            field2796 = null;
        }
        ++field2795;
        byte[] var3 = arg2.method2059(0, arg1);
        return var3 == null ? null : new class258(var3);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILjava/lang/String;Z)I")
    public static final int method1172(byte arg0, int arg1, String arg2, boolean arg3) {
        ++field2786;
        if (~arg1 <= -3 && ~arg1 >= -37) {
            boolean var4 = false;
            int var5 = 0;
            if (arg0 <= 22) {
                return -119;
            } else {
                int var6 = arg2.length();
                boolean var7 = false;
                for (int var8 = 0; ~var6 < ~var8; ++var8) {
                    char var9 = arg2.charAt(var8);
                    if (~var8 == -1) {
                        if (~var9 == -46) {
                            var4 = true;
                            continue;
                        }
                        if (~var9 == -44 && arg3) {
                            continue;
                        }
                    }
                    int var11;
                    if (~var9 <= -49 && var9 <= '9') {
                        var11 = var9 - '0';
                    } else if (var9 >= 'A' && var9 <= 'Z') {
                        var11 = var9 - '7';
                    } else {
                        if (~var9 > -98 || var9 > 'z') {
                            throw new NumberFormatException();
                        }
                        var11 = var9 - 'W';
                    }
                    if (var11 >= arg1) {
                        throw new NumberFormatException();
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg1 * var5 + var11;
                    if (var10 / arg1 != var5) {
                        throw new NumberFormatException();
                    }
                    var5 = var10;
                    var7 = true;
                }
                if (!var7) {
                    throw new NumberFormatException();
                } else {
                    return var5;
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!la", name = "h", descriptor = "(I)V")
    public static final void method1173(int arg0) {
        ++field2784;
        class297.method2000(class221.field3441, 89);
        byte var1 = 0;
        byte var2 = 8;
        int var3 = (class188.field2848 >> 10) + (class170.field2421 >> 3);
        byte var4 = 8;
        byte var5 = 18;
        int var6 = (class178.field2603 >> 10) - -(class228.field3570 >> 3);
        class240.field3705 = new byte[var5][];
        class110.field1583 = new byte[var5][];
        class37.field571 = new int[var5];
        class261.field4205 = new int[var5];
        class275.field4364 = new int[var5][4];
        class225.field3525 = new int[var5];
        class267.field4285 = new int[var5];
        class34.field510 = new int[var5];
        class213.field3218 = new int[var5];
        class117.field1685 = new byte[var5][];
        int var7 = arg0;
        for (int var8 = (var6 + -6) / 8; ~((var6 - -6) / 8) <= ~var8; ++var8) {
            for (int var10 = (var3 + -6) / 8; ~var10 >= ~((var3 + 6) / 8); ++var10) {
                int var11 = (var8 << 8) - -var10;
                class213.field3218[var7] = var11;
                class261.field4205[var7] = class307.field4932.method2081(arg0 + -128, "m" + var8 + "_" + var10);
                class267.field4285[var7] = class307.field4932.method2081(arg0 + -126, "l" + var8 + "_" + var10);
                class225.field3525[var7] = class307.field4932.method2081(class207.method1290(arg0, -124), "n" + var8 + "_" + var10);
                class37.field571[var7] = class307.field4932.method2081(arg0 + -127, "um" + var8 + "_" + var10);
                class34.field510[var7] = class307.field4932.method2081(-126, "ul" + var8 + "_" + var10);
                if (class225.field3525[var7] == -1) {
                    class261.field4205[var7] = -1;
                    class267.field4285[var7] = -1;
                    class37.field571[var7] = -1;
                    class34.field510[var7] = -1;
                }
                ++var7;
            }
        }
        for (int var9 = var7; class225.field3525.length > var9; ++var9) {
            class225.field3525[var9] = -1;
            class261.field4205[var9] = -1;
            class267.field4285[var9] = -1;
            class37.field571[var9] = -1;
            class34.field510[var9] = -1;
        }
        class126.method812(var1, var4, var2, (byte) -113, var3, true, var6, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        if (arg0 != -112) {
            this.field2787 = true;
        }
        ++field2785;
        int[][] var3 = super.field1627.method104(arg1, (byte) 119);
        if (super.field1627.field280) {
            int[] var4 = this.method729(arg1 + -1 & class134.field1840, 0, 0);
            int[] var5 = this.method729(arg1, 0, 0);
            int[] var6 = this.method729(class134.field1840 & arg1 - -1, 0, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; ~class145.field2009 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2790;
                int var12 = (var5[var10 + 1 & class309.field4977] + -var5[var10 - 1 & class309.field4977]) * this.field2790;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                }
                if (this.field2787) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                }
                var7[var10] = var18;
                var9[var10] = var19;
                var8[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "i", descriptor = "(I)V")
    public static final void method1174(int arg0) {
        ++field2794;
        if (arg0 == 57) {
            if (!class29.field453) {
                class29.field453 = true;
                if (class78.field1085) {
                    class160.field2239 = (float) ((int) class160.field2239 + -17 & -16);
                } else {
                    class254.field3960 += (-12.0F - class254.field3960) / 2.0F;
                }
                class115.field1653 = true;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg2 != 12953) {
            this.method73((byte) 13, -104);
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field2787 = arg0.method1374((byte) -60) == 1;
            }
        } else {
            this.field2790 = arg0.method1379(-99);
        }
        ++field2789;
    }

    @OriginalMember(owner = "client!la", name = "j", descriptor = "(I)V")
    public static void method1175(int arg0) {
        field2793 = null;
        field2796 = null;
        field2792 = null;
        if (arg0 != 1) {
            method1176((byte) -10);
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class184() {
        super(1, false);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(B)V")
    public static final void method1176(byte arg0) {
        ++field2791;
        if (arg0 == -60) {
            for (int var1 = -1; class171.field2437 > var1; ++var1) {
                int var5;
                if (~var1 != 0) {
                    var5 = class160.field2235[var1];
                } else {
                    var5 = 2047;
                }
                class314 var6 = class48.field689[var5];
                if (var6 != null && var6.field4109 > 0) {
                    --var6.field4109;
                    if (var6.field4109 == 0) {
                        var6.field4074 = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class306.field4921; ++var2) {
                int var3 = class131.field1834[var2];
                class310 var4 = class88.field1274[var3];
                if (var4 != null && var4.field4109 > 0) {
                    --var4.field4109;
                    if (~var4.field4109 == -1) {
                        var4.field4074 = null;
                    }
                }
            }
        }
    }
}
