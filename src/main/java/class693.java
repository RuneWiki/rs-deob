import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class693 extends class314 {

    @OriginalMember(owner = "client!kr", name = "P", descriptor = "I")
    private int field9710 = 4096;

    @OriginalMember(owner = "client!kr", name = "O", descriptor = "I")
    private int field9709 = 4096;

    @OriginalMember(owner = "client!kr", name = "R", descriptor = "[I")
    private int[] field9712 = new int[3];

    @OriginalMember(owner = "client!kr", name = "Q", descriptor = "I")
    private int field9711 = 4096;

    @OriginalMember(owner = "client!kr", name = "N", descriptor = "I")
    private int field9708 = 409;

    @OriginalMember(owner = "client!kr", name = "L", descriptor = "Lnaa;")
    public static class64 field9706 = new class64();

    @OriginalMember(owner = "client!kr", name = "V", descriptor = "Z")
    public static boolean field9716 = false;

    @OriginalMember(owner = "client!kr", name = "S", descriptor = "F")
    public static float field9713;

    @OriginalMember(owner = "client!kr", name = "M", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!kr", name = "T", descriptor = "I")
    public static int field9714;

    @OriginalMember(owner = "client!kr", name = "U", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!kr", name = "W", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V", line = 5)
    public class693() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "([IB)Ljava/lang/String;", line = 8)
    public static final String method3919(int[] arg0, byte arg1) {
        int var2 = 19 / ((24 - arg1) / 57);
        ++field9714;
        StringBuffer var3 = new StringBuffer();
        int var4 = class615.field8741;
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            class490 var6 = class690.field9681.method1041(-116, arg0[var5]);
            if (var6.field7185 != -1) {
                class702 var7 = (class702) class300.field4688.method560(false, (long) var6.field7185);
                if (var7 == null) {
                    class284 var8 = class284.method2027(class158.field2699, var6.field7185, 0);
                    if (var8 != null) {
                        var7 = class627.field8857.method265(var8, true);
                        class300.field4688.method559(var7, (long) var6.field7185, 0);
                    }
                }
                if (var7 != null) {
                    class114.field1790[var4] = var7;
                    var3.append(" <img=").append(var4).append(">");
                    ++var4;
                }
            }
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)[[I", line = 60)
    public final int[][] method4(int arg0, byte arg1) {
        if (arg1 <= 68) {
            this.method5((byte) -13, (class6) null, -45);
        }
        ++field9715;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (super.field4931.field2799) {
            int[][] var4 = this.method2143(0, arg0, (byte) -4);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class81.field1009 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field9712[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field9708) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field9712[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field9708 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field9712[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field9708 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field9709 * var12 >> 12;
                            var9[var11] = this.field9710 * var14 >> 12;
                            var10[var11] = this.field9711 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLie;I)V", line = 164)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var5 = arg1.method86(-85);
                            this.field9712[2] = class453.method2846(0, var5 >> 12);
                            this.field9712[1] = class453.method2846(var5, 65280) >> 4;
                            this.field9712[0] = class453.method2846(var5 << 4, 267386880);
                        }
                    } else {
                        this.field9709 = arg1.method67(12021);
                    }
                } else {
                    this.field9710 = arg1.method67(12021);
                }
            } else {
                this.field9711 = arg1.method67(12021);
            }
        } else {
            this.field9708 = arg1.method67(12021);
        }
        if (arg0 >= -1) {
            field9706 = null;
        }
        ++field9707;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)V", line = 247)
    public static void method3920(boolean arg0) {
        if (arg0) {
            field9706 = null;
        }
    }
}
