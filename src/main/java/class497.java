import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class497 extends class34 {

    @OriginalMember(owner = "client!em", name = "C", descriptor = "Z")
    public static boolean field7270 = false;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "[I")
    public static int[] field7279 = new int[25];

    @OriginalMember(owner = "client!em", name = "E", descriptor = "Lsn;")
    public static class205 field7272 = new class205(12, 7);

    @OriginalMember(owner = "client!em", name = "O", descriptor = "Lde;")
    public static class10 field7281 = new class10(12, 0, 1, 0);

    @OriginalMember(owner = "client!em", name = "P", descriptor = "[I")
    public static int[] field7282 = new int[8];

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!em", name = "I", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "[Lth;")
    private class208[] field7274;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(B)V")
    public static void method2950(byte arg0) {
        if (arg0 <= 92) {
            field7279 = null;
        }
        field7279 = null;
        field7272 = null;
        field7282 = null;
        field7281 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)[[I")
    public final int[][] method66(byte arg0, int arg1) {
        ++field7277;
        if (arg0 != -11) {
            this.method2952((int[][]) null, -60);
        }
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (super.field536.field726) {
            int var4 = class383.field5502;
            int var5 = class494.field7150;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field536.method334(-4324);
            this.method2952(var6, 10160);
            for (int var8 = 0; class494.field7150 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class383.field5502; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class375.method2245(4080, var15 << 4);
                    var12[var14] = class375.method2245(4080, var15 >> 4);
                    var11[var14] = class375.method2245(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(IB)I")
    public static final int method2951(int arg0, byte arg1) {
        if (arg1 > -62) {
            field7280 = 42;
        }
        ++field7271;
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field7276;
        int var3 = 90 % (arg1 / 50);
        int[] var4 = super.field537.method1780(arg0, (byte) 48);
        if (super.field537.field4191) {
            this.method2952(super.field537.method1781(false), 10160);
        }
        return var4;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field533 = ~arg0.method1869(-96) == -2;
            }
        } else {
            this.field7274 = new class208[arg0.method1869(-99)];
            for (int var4 = 0; this.field7274.length > var4; ++var4) {
                int var5 = arg0.method1869(-110);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field7274[var4] = class231.method1413(-21294, arg0);
                            }
                        } else {
                            this.field7274[var4] = class93.method761(63, arg0);
                        }
                    } else {
                        this.field7274[var4] = class125.method906(arg0, (byte) -95);
                    }
                } else {
                    this.field7274[var4] = class366.method2190(arg0, -1);
                }
            }
        }
        if (arg1 <= 16) {
            this.method64(76, (byte) -67);
        }
        ++field7273;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
    public class497() {
        super(0, true);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([[II)V")
    private final void method2952(int[][] arg0, int arg1) {
        ++field7275;
        if (arg1 != 10160) {
            this.method69((class319) null, -117, 43);
        }
        int var3 = class383.field5502;
        int var4 = class494.field7150;
        class168.method1161(arg0, (byte) -121);
        class186.method1249(true, 0, 0, class343.field4968, class120.field1872);
        if (this.field7274 != null) {
            for (int var5 = 0; this.field7274.length > var5; ++var5) {
                class208 var6 = this.field7274[var5];
                int var7 = var6.field2971;
                int var8 = var6.field2972;
                if (~var7 > -1) {
                    if (var8 >= 0) {
                        var6.method820(var3, var4, arg1 ^ 23927);
                    }
                } else if (var8 >= 0) {
                    var6.method814(false, var4, var3);
                } else {
                    var6.method818(var3, var4, 32627);
                }
            }
        }
    }
}
