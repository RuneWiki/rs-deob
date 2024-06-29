import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class377 extends class513 {

    @OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
    private int field4905;

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
    private int field4911;

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
    private int field4910;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
    private int field4894;

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
    public static int field4898 = -2;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "[I")
    public static int[] field4907 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!nn", name = "B", descriptor = "Z")
    public static boolean field4901 = false;

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
    public static int field4897 = -1;

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "Lkfa;")
    public static class549 field4900 = new class549(37, 7);

    @OriginalMember(owner = "client!nn", name = "N", descriptor = "[I")
    public static int[] field4913 = new int[3];

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "F")
    public static float field4893;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
    private int field4892;

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
    private int field4902;

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
    private int field4906;

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
    private int field4909;

    @OriginalMember(owner = "client!nn", name = "M", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!nn", name = "O", descriptor = "Lpi;")
    public static class455 field4914;

    @OriginalMember(owner = "client!nn", name = "E", descriptor = "[B")
    private byte[] field4904;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "([BB)[B")
    public static final byte[] method2069(byte[] arg0, byte arg1) {
        int var2 = 119 % ((-arg1 - 18) / 46);
        field4903++;
        int var3 = arg0.length;
        byte[] var4 = new byte[var3];
        class652.method3679(arg0, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBI)V")
    public void method2070(int arg0, byte arg1, int arg2) {
        if (arg0 < -50) {
            this.field4904[arg2] = arg1;
            field4912++;
        }
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)V")
    public static void method2071(int arg0) {
        field4900 = null;
        field4907 = null;
        if (arg0 != 22195) {
            field4914 = null;
        }
        field4914 = null;
        field4913 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public final void method532(int arg0) {
        this.field4894 = this.field4910;
        if (arg0 != 16859) {
            method2072(-79, -37, -22, -66, 86, 88, true);
        }
        this.field4909 >>= 0x4;
        field4895++;
        if (this.field4909 < 0) {
            this.field4909 = 0;
        } else if (this.field4909 > 255) {
            this.field4909 = 255;
        }
        this.method2070(-56, (byte) this.field4909, this.field4892++);
        this.field4909 = 0;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)V")
    public final void method530(int arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            this.field4902 = this.field4905 - (arg0 >= 0 ? arg0 : -arg0);
            this.field4906 = 4096;
            this.field4902 = this.field4902 * this.field4902 >> 12;
            this.field4909 = this.field4902;
        } else {
            this.field4906 = this.field4911 * this.field4902 >> 12;
            if (this.field4906 < 0) {
                this.field4906 = 0;
            } else if (this.field4906 > 4096) {
                this.field4906 = 4096;
            }
            this.field4902 = this.field4905 - (arg0 >= 0 ? arg0 : -arg0);
            this.field4902 = this.field4902 * this.field4902 >> 12;
            this.field4902 = this.field4906 * this.field4902 >> 12;
            this.field4909 += this.field4902 * this.field4894 >> 12;
            this.field4894 = this.field4910 * this.field4894 >> 12;
        }
        field4908++;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class377(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4905 = (int) (arg6 * 4096.0F);
        this.field4911 = (int) (arg7 * 4096.0F);
        this.field4894 = this.field4910 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method2072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4899++;
        class67.field720 = arg0;
        class420.field5581 = arg4;
        class403.field5376 = arg5;
        class500.field7204 = arg1;
        class656.field9367 = arg2;
        if (arg3 != -3589) {
            method2071(-120);
        }
        if (arg6 && class420.field5581 >= 100) {
            class345.field4493 = class656.field9367 * 512 + 256;
            class662.field9411 = class67.field720 * 512 + 256;
            class150.field1707 = class363.method1995(class353.field4625, class662.field9411, -1327568407, class345.field4493) - class403.field5376;
        }
        class5.field41 = 2;
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V")
    public final void method531(int arg0) {
        field4891++;
        this.field4909 = 0;
        this.field4892 = 0;
        int var2 = 13 / ((3 - arg0) / 41);
    }
}
