import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class334 extends class30 {

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    private int field4499 = 4;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    private int field4497 = 4;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "[I")
    public static int[] field4498 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "Lgi;")
    public static class631 field4505 = new class631();

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "Lr;")
    public static class166 field4506;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "[Lct;")
    public static class130[] field4501;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 <= 100) {
            field4501 = null;
        }
        ++field4503;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field4499 = arg2.method2874((byte) -75);
            }
        } else {
            this.field4497 = arg2.method2874((byte) -75);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        if (arg1 != 7) {
            method1969(119);
        }
        ++field4500;
        int[][] var3 = super.field377.method3683(arg0, (byte) 123);
        if (super.field377.field9085) {
            int var4 = class31.field399 / this.field4497;
            int var5 = class148.field2197 / this.field4499;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method292(111, 0, class148.field2197 * var6 / var5);
            } else {
                var7 = this.method292(92, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class31.field399; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class31.field399 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class334() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field4504;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (arg0 != 1) {
            field4501 = null;
        }
        if (super.field374.field9032) {
            int var4 = class31.field399 / this.field4497;
            int var5 = class148.field2197 / this.field4499;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method294(0, 0, (byte) -80);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method294(class148.field2197 * var7 / var5, 0, (byte) -53);
            }
            for (int var8 = 0; ~var8 > ~class31.field399; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class31.field399 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
    public static void method1969(int arg0) {
        field4505 = null;
        field4501 = null;
        field4498 = null;
        field4506 = null;
        if (arg0 != 44) {
            field4501 = null;
        }
    }
}
