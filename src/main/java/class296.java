import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class296 extends class136 {

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "I")
    private int field4245 = 4;

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    private int field4249 = 4;

    @OriginalMember(owner = "client!ss", name = "I", descriptor = "Lbg;")
    public static class324 field4250 = new class324(6, 11);

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "[I")
    public static int[] field4252 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ss", name = "J", descriptor = "Lgk;")
    public static class331 field4251 = new class331("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "Lsl;")
    public static class318 field4254 = new class318(57, 4);

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIII)V")
    public static final void method1868(int arg0, int arg1, int arg2, int arg3) {
        class238.field3497 = new byte[arg3][arg2][arg1];
        ++field4253;
        if (arg0 != 0) {
            method1869((byte) -124);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field4247;
        if (arg0 != 4) {
            method1868(-22, 83, 45, -95);
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field4245 = arg2.method577(arg0 ^ 251);
            }
        } else {
            this.field4249 = arg2.method577(255);
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
    public class296() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)[[I")
    public final int[][] method272(byte arg0, int arg1) {
        if (arg0 <= 33) {
            this.field4249 = -106;
        }
        ++field4246;
        int[][] var3 = super.field1952.method3127((byte) 13, arg1);
        if (super.field1952.field7770) {
            int var4 = class467.field6889 / this.field4249;
            int var5 = class227.field3310 / this.field4245;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method1036(3, 0, class227.field3310 * var6 / var5);
            } else {
                var7 = this.method1036(3, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class467.field6889; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class467.field6889 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field4244;
        int var3 = 45 % ((67 - arg0) / 50);
        int[] var4 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            int var5 = class467.field6889 / this.field4249;
            int var6 = class227.field3310 / this.field4245;
            int[] var8;
            if (~var6 < -1) {
                int var7 = arg1 % var6;
                var8 = this.method1033(class227.field3310 * var7 / var6, 0, 0);
            } else {
                var8 = this.method1033(0, 0, 0);
            }
            for (int var9 = 0; var9 < class467.field6889; ++var9) {
                if (~var5 >= -1) {
                    var4[var9] = var8[0];
                } else {
                    int var10 = var9 % var5;
                    var4[var9] = var8[class467.field6889 * var10 / var5];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)V")
    public static void method1869(byte arg0) {
        field4250 = null;
        field4252 = null;
        field4251 = null;
        field4254 = null;
        int var1 = -22 % ((arg0 - -61) / 58);
    }
}
