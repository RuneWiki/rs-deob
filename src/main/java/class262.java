import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class262 extends class525 implements class205 {

    @OriginalMember(owner = "client!at", name = "E", descriptor = "I")
    private int field3948 = -1;

    @OriginalMember(owner = "client!at", name = "M", descriptor = "I")
    private int field3956 = -1;

    @OriginalMember(owner = "client!at", name = "D", descriptor = "I")
    public int field3947;

    @OriginalMember(owner = "client!at", name = "A", descriptor = "Lbt;")
    private class33 field3944;

    @OriginalMember(owner = "client!at", name = "B", descriptor = "I")
    private int field3945;

    @OriginalMember(owner = "client!at", name = "J", descriptor = "I")
    public int field3953;

    @OriginalMember(owner = "client!at", name = "G", descriptor = "I")
    private int field3950;

    @OriginalMember(owner = "client!at", name = "C", descriptor = "I")
    private int field3946;

    @OriginalMember(owner = "client!at", name = "K", descriptor = "Lqv;")
    public static class316 field3954 = new class316(40, 0);

    @OriginalMember(owner = "client!at", name = "Q", descriptor = "[Loo;")
    public static class450[] field3960 = new class450[100];

    @OriginalMember(owner = "client!at", name = "P", descriptor = "Lqv;")
    public static class316 field3959 = new class316(79, 12);

    @OriginalMember(owner = "client!at", name = "S", descriptor = "I")
    public static int field3962 = 0;

    @OriginalMember(owner = "client!at", name = "R", descriptor = "[I")
    public static int[] field3961 = new int[13];

    @OriginalMember(owner = "client!at", name = "F", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!at", name = "H", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!at", name = "I", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!at", name = "L", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!at", name = "N", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!at", name = "O", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IBI)V", line = 8)
    public final void method1693(int arg0, byte arg1, int arg2) {
        if (arg1 != 89) {
            method1697(-73, 49L);
        }
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field3950);
        field3957++;
        this.field3956 = arg0;
        this.field3948 = arg2;
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)V", line = 22)
    public static final void method1694(int arg0) {
        class413.method2469(arg0 ^ 0x3AAD);
        field3952++;
        if (arg0 != 15013) {
            field3962 = 107;
        }
        class259.method1668(8101);
    }

    @OriginalMember(owner = "client!at", name = "e", descriptor = "(I)V", line = 34)
    public static void method1695(int arg0) {
        field3961 = null;
        field3960 = null;
        field3954 = null;
        if (arg0 != 13) {
            field3954 = null;
        }
        field3959 = null;
    }

    @OriginalMember(owner = "client!at", name = "f", descriptor = "(I)V", line = 47)
    public final void method1696(int arg0) {
        if (this.field3950 > 0) {
            this.field3944.method347(this.field3950, this.field3946, (byte) 83);
            this.field3950 = 0;
        }
        field3951++;
        if (arg0 != 0) {
            field3959 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IJ)V", line = 67)
    public static final void method1697(int arg0, long arg1) {
        if (arg0 != -1) {
            return;
        }
        field3955++;
        int var3 = class319.field4735 + class364.field5293.field6961;
        int var4 = class342.field5053 + class364.field5293.field6965;
        if ((class78.field1279 - var3) < -500 || class78.field1279 - var3 > 500 || class486.field7048 - var4 < -500 || (class486.field7048 - var4) > 500) {
            class78.field1279 = var3;
            class486.field7048 = var4;
        }
        if (class78.field1279 != var3) {
            int var5 = var3 - class78.field1279;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class78.field1279 += var6;
        }
        if (!class220.field3371.field2554) {
            class508.field7354 += (float) arg1 * class253.field3748 / 6.0F;
            class524.field7655 += (float) arg1 * class294.field4384 / 6.0F;
        }
        if (class486.field7048 != var4) {
            int var7 = var4 - class486.field7048;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class486.field7048 += var8;
        }
        class289.method1849(arg0 ^ 0xC0000);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V", line = 158)
    public final void method889(boolean arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field3956, this.field3948, 36161, 0);
        field3958++;
        this.field3948 = -1;
        if (arg0) {
            this.field3956 = -1;
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lbt;III)V", line = 197)
    public class262(class33 arg0, int arg1, int arg2, int arg3) {
        this.field3947 = arg2;
        this.field3944 = arg0;
        this.field3945 = arg1;
        this.field3953 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class238.field3596, 0);
        this.field3950 = class238.field3596[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3950);
        OpenGL.glRenderbufferStorageEXT(36161, this.field3945, this.field3947, this.field3953);
        this.field3946 = this.field3953 * this.field3947 * this.field3944.method219(-34848, this.field3945);
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lbt;IIII)V", line = 214)
    public class262(class33 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3944 = arg0;
        this.field3947 = arg2;
        this.field3945 = arg1;
        this.field3953 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class238.field3596, 0);
        this.field3950 = class238.field3596[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3950);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field3945, this.field3947, this.field3953);
        this.field3946 = this.field3953 * this.field3947 * this.field3944.method219(-34848, this.field3945);
    }

    @OriginalMember(owner = "client!at", name = "finalize", descriptor = "()V", line = 179)
    protected final void finalize() throws Throwable {
        this.method1696(0);
        field3949++;
        super.finalize();
    }
}
