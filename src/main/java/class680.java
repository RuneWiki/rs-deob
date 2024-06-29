import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class680 extends class739 {

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "Lkg;")
    public static class275 field9493 = new class275(95, 7);

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field9490;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field9491;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field9492;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "Lwn;")
    public static class725 field9495;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "[Liea;")
    public static class481[] field9496;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method215(int arg0, int arg1) {
        ++field9491;
        int[] var3 = super.field10311.method2116(arg1, (byte) 85);
        if (arg0 != -23347) {
            field9495 = null;
        }
        if (super.field10311.field4728) {
            class135.method997(var3, 0, class29.field523, class287.field3604[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ltk;B[Ldc;)Lpt;", line = 27)
    public static final class533 method3830(class347 arg0, byte arg1, class5[] arg2) {
        ++field9494;
        for (int var3 = 0; ~arg2.length < ~var3; ++var3) {
            if (arg2[var3] == null || arg2[var3].field46 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; ~arg2.length < ~var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field46);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class353.field4540, 0);
        if (class353.field4540[0] == 0) {
            if (class353.field4540[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class353.field4540, 1);
            if (class353.field4540[1] > 1) {
                byte[] var7 = new byte[class353.field4540[1]];
                OpenGL.glGetInfoLogARB(var4, class353.field4540[1], class353.field4540, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (~class353.field4540[0] == -1) {
                for (int var8 = 0; var8 < arg2.length; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field46);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        if (arg1 >= -108) {
            method3831(-50);
        }
        return new class533(arg0, var4, arg2);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V", line = 96)
    public class680() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V", line = 100)
    public static void method3831(int arg0) {
        field9495 = null;
        field9496 = null;
        field9493 = null;
        if (arg0 >= -2) {
            field9496 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)[Loea;", line = 112)
    public static final class599[] method3832(int arg0) {
        ++field9492;
        if (arg0 != -17399) {
            field9495 = null;
        }
        return new class599[] { class108.field1545, class35.field555, class346.field4369 };
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)I", line = 126)
    public static final int method3833(int arg0, int arg1, int arg2, int arg3) {
        ++field9490;
        int var4 = arg1 / arg3;
        int var5 = arg3 - 1 & arg1;
        int var6 = arg2 / arg3;
        int var7 = arg2 & arg3 + -1;
        int var8 = class14.method104(var4, arg0 + -2, var6);
        int var9 = class14.method104(var4 - -1, arg0 + -2, var6);
        int var10 = class14.method104(var4, arg0 + -2, arg0 + var6);
        int var11 = class14.method104(var4 - -1, -1, var6 + 1);
        int var12 = class436.method2483(arg3, 3700, var9, var5, var8);
        int var13 = class436.method2483(arg3, 3700, var11, var5, var10);
        return class436.method2483(arg3, arg0 + 3699, var13, var7, var12);
    }
}
