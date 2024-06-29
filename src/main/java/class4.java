import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class297 {

    @OriginalMember(owner = "client!ft", name = "M", descriptor = "Lkf;")
    public static class255 field31 = new class255();

    @OriginalMember(owner = "client!ft", name = "J", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ft", name = "K", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ft", name = "L", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ft", name = "N", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ft", name = "I", descriptor = "[Liu;")
    private class578[] field27;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "([[IB)V", line = 4)
    private final void method13(int[][] arg0, byte arg1) {
        ++field33;
        if (arg1 != -27) {
            method14(86);
        }
        int var3 = class525.field7275;
        int var4 = class128.field2169;
        class739.method4063((byte) -40, arg0);
        class55.method605(class677.field9204, 0, class319.field4394, 0, arg1 ^ 40);
        if (this.field27 != null) {
            for (int var5 = 0; this.field27.length > var5; ++var5) {
                class578 var6 = this.field27[var5];
                int var7 = var6.field7936;
                int var8 = var6.field7937;
                if (~var7 > -1) {
                    if (~var8 <= -1) {
                        var6.method400(var4, var3, -43);
                    }
                } else if (~var8 > -1) {
                    var6.method402(arg1 ^ -107, var3, var4);
                } else {
                    var6.method399(var3, var4, -124);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "(I)V", line = 57)
    public static void method14(int arg0) {
        field31 = null;
        if (arg0 != 255) {
            method14(-42);
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(II)[I", line = 68)
    public final int[] method15(int arg0, int arg1) {
        ++field32;
        int[] var3 = super.field4165.method127(arg1 + -255, arg0);
        if (super.field4165.field266) {
            this.method13(super.field4165.method121((byte) 16), (byte) -27);
        }
        if (arg1 != 255) {
            this.method17((class215) null, 66, -50);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)V", line = 90)
    public static final void method16(int arg0) {
        ++field28;
        for (class462 var1 = (class462) class631.field8684.method2344(-49); var1 != null; var1 = (class462) class631.field8684.method2336((byte) 51)) {
            if (var1.field6497 > 1) {
                var1.field6497 = 0;
                class318.field4387.method991(var1, ((class324) var1.field6503.field5243.field241).field4497, (byte) -108);
                var1.field6503.method2342(arg0 ^ 2110355138);
            }
        }
        class436.field6235 = 0;
        class192.field2844 = arg0;
        class528.field7301.method1270(125);
        class324.field4500.method1466(0);
        class631.field8684.method2342(2110355138);
        class311.field4321 = false;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lcea;II)V", line = 121)
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg2 != 31015) {
            field31 = null;
        }
        if (arg1 == 0) {
            this.field27 = new class578[arg0.method1535(255)];
            for (int var4 = 0; this.field27.length > var4; ++var4) {
                int var5 = arg0.method1535(255);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field27[var4] = class262.method1759(arg0, 0);
                            }
                        } else {
                            this.field27[var4] = class297.method1946(arg0, class710.method3948(arg2, -31102));
                        }
                    } else {
                        this.field27[var4] = class689.method3849(class710.method3948(arg2, 31013), arg0);
                    }
                } else {
                    this.field27[var4] = class117.method1028(107, arg0);
                }
            }
        } else if (arg1 == 1) {
            super.field4178 = arg0.method1535(255) == 1;
        }
        ++field30;
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(II)[[I", line = 206)
    public final int[][] method18(int arg0, int arg1) {
        ++field29;
        int[][] var3 = super.field4166.method2180(arg1 + 1564598923, arg0);
        if (arg1 != -1564599039) {
            field31 = null;
        }
        if (super.field4166.field4849) {
            int var4 = class525.field7275;
            int var5 = class128.field2169;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field4166.method2176(0);
            this.method13(var6, (byte) -27);
            for (int var8 = 0; ~var8 > ~class128.field2169; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class525.field7275; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class263.method1762(var15, 255) << 4;
                    var12[var14] = class263.method1762(var15 >> 4, 4080);
                    var11[var14] = class263.method1762(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V", line = 269)
    public class4() {
        super(0, true);
    }
}
