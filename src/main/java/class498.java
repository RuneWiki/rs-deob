import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class498 extends class702 {

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "Lwca;")
    private class628 field6952;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "Lqt;")
    private class588 field6953;

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "Lwo;")
    public static class690 field6964 = new class690(82, 6);

    @OriginalMember(owner = "client!ur", name = "w", descriptor = "I")
    public static int field6966 = 0;

    @OriginalMember(owner = "client!ur", name = "x", descriptor = "Lwo;")
    public static class690 field6967 = new class690(0, 8);

    @OriginalMember(owner = "client!ur", name = "y", descriptor = "Ljk;")
    public static class585 field6968 = new class585(74, 4);

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!ur", name = "v", descriptor = "[I")
    public static int[] field6965;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V", line = 4)
    public final void method1002(boolean arg0) {
        ++field6955;
        if (arg0) {
            this.field6953.method3409((byte) 120, '\u0001');
            super.field9912.method2975(1, 114);
            super.field9912.method2932(arg0, (class197) null);
            super.field9912.method2975(0, 73);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Z)Z", line = 18)
    public final boolean method998(boolean arg0) {
        if (arg0) {
            field6965 = null;
        }
        ++field6956;
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)V", line = 30)
    public static final void method2899(int arg0, int arg1, int arg2) {
        ++field6961;
        if (class505.field7053 != 0) {
            if (arg0 < 0) {
                for (int var3 = 0; ~var3 > -17; ++var3) {
                    class505.field7051[var3] = arg1;
                }
            } else {
                class505.field7051[arg0] = arg1;
            }
        }
        class601.field8666.method2082(arg1, (byte) 1, arg0);
        if (arg2 >= -9) {
            field6967 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)V", line = 60)
    public final void method1001(int arg0, int arg1, int arg2) {
        ++field6958;
        float var4 = (float) ((3 & arg0) + 1) * -5.0E-4F;
        float var5 = (float) (((arg0 & 30) >> 3) + 1) * 5.0E-4F;
        float var6 = (64 & arg0) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        super.field9912.method2975(1, 70);
        boolean var7 = (128 & arg0) != 0;
        if (!var7) {
            class454.field6390[0] = 0.0F;
            class454.field6390[1] = 0.0F;
            class454.field6390[3] = 0.0F;
            class454.field6390[2] = var6;
        } else {
            class454.field6390[0] = var6;
            class454.field6390[3] = 0.0F;
            class454.field6390[1] = 0.0F;
            class454.field6390[2] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class454.field6390, 0);
        class454.field6390[3] = (float) super.field9912.field7264 * var4 % 1.0F;
        class454.field6390[1] = var6;
        class454.field6390[0] = 0.0F;
        class454.field6390[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class454.field6390, 0);
        if (this.field6952.field9008) {
            class454.field6390[2] = 0.0F;
            class454.field6390[3] = (float) super.field9912.field7264 * var5 % 1.0F;
            class454.field6390[1] = 0.0F;
            class454.field6390[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class454.field6390, 0);
        } else {
            int var8 = (int) ((float) super.field9912.field7264 * var5 * 16.0F);
            super.field9912.method2932(true, this.field6952.field9003[var8 % 16]);
        }
        int var9 = -111 % ((arg1 - 55) / 36);
        super.field9912.method2975(0, 121);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)V", line = 115)
    public final void method1005(boolean arg0, int arg1) {
        this.field6953.method3409((byte) 118, '\u0000');
        if (arg1 >= -102) {
            this.method1000(true, false);
        }
        ++field6959;
        if (this.field6952.field9008) {
            super.field9912.method2975(1, 106);
            super.field9912.method2932(true, this.field6952.field9001);
            super.field9912.method2975(0, 92);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lun;B)Lpv;", line = 134)
    public static final class63 method2900(class389 arg0, byte arg1) {
        if (arg1 < 57) {
            method2899(-7, 54, 6);
        }
        ++field6954;
        class514 var2 = class249.method1525(arg0, -1);
        int var3 = arg0.method2255(255);
        int var4 = arg0.method2255(255);
        int var5 = arg0.method2260(-44);
        return new class63(var2.field7533, var2.field7535, var2.field7530, var2.field7532, var2.field7540, var2.field7528, var2.field7529, var2.field7537, var2.field7538, var3, var4, var5);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V", line = 154)
    public static void method2901(int arg0) {
        field6968 = null;
        if (arg0 != 0) {
            method2902((char) 65479, (byte) 14);
        }
        field6967 = null;
        field6965 = null;
        field6964 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(CB)C", line = 174)
    public static final char method2902(char arg0, byte arg1) {
        if (arg1 != 107) {
            field6965 = null;
        }
        ++field6962;
        if (~arg0 == -199) {
            return 'E';
        } else if (arg0 == 230) {
            return 'e';
        } else if (arg0 == 223) {
            return 's';
        } else if (~arg0 == -339) {
            return 'E';
        } else {
            return (char) (arg0 == 339 ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljf;II)V", line = 206)
    public final void method1004(class197 arg0, int arg1, int arg2) {
        ++field6960;
        super.field9912.method2932(true, arg0);
        if (arg2 == 58) {
            super.field9912.method2985(arg1, -26973);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZZ)V", line = 218)
    public final void method1000(boolean arg0, boolean arg1) {
        ++field6963;
        if (!arg0) {
            this.field6952 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lkga;Lwca;)V", line = 229)
    public class498(class506 arg0, class628 arg1) {
        super(arg0);
        this.field6952 = arg1;
        this.field6953 = new class588(arg0, 2);
        this.field6953.method3405(0, (byte) 117);
        super.field9912.method2975(1, 96);
        if (this.field6952.field9008) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field9912.method2975(0, 125);
        this.field6953.method3410(1);
        this.field6953.method3405(1, (byte) 98);
        super.field9912.method2975(1, 86);
        if (this.field6952.field9008) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field9912.method2975(0, 92);
        this.field6953.method3410(1);
    }
}
