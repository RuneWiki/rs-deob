import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class713 {

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public int field9945 = -1;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public int field9947 = 64;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
    public int field9953 = 64;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "Z")
    public boolean field9950 = false;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "Z")
    public boolean field9957 = false;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    public int field9959 = 1;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
    public int field9952 = 2;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field9949 = 0;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "F")
    public static float field9951 = 1.0F;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "Lea;")
    public static class547 field9955 = new class547(5, 6);

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field9946;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
    public static int field9954;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    public static int field9958;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "Lgi;")
    public static class678 field9948;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "[Lufa;")
    public static class680[] field9956;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lji;III)V")
    private final void method3992(class611 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 6) {
            return;
        }
        field9958++;
        if (arg1 == 1) {
            this.field9945 = arg0.method3402((byte) 127);
            if (this.field9945 == 65535) {
                this.field9945 = -1;
            }
        } else if (arg1 == 2) {
            this.field9947 = arg0.method3402((byte) 127) + 1;
            this.field9953 = arg0.method3402((byte) 127) + 1;
        } else if (arg1 == 3) {
            arg0.method3390((byte) -19);
        } else if (arg1 == 4) {
            this.field9952 = arg0.method3428((byte) -100);
        } else if (arg1 == 5) {
            this.field9959 = arg0.method3428((byte) 22);
        } else if (arg1 == 6) {
            this.field9957 = true;
        } else if (arg1 == 7) {
            this.field9950 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lac;[Lv;Z)Luj;")
    public static final class387 method3993(class541 arg0, class580[] arg1, boolean arg2) {
        field9946++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field8133 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field8133);
        }
        OpenGL.glLinkProgramARB(var4);
        if (!arg2) {
            method3993(null, null, false);
        }
        OpenGL.glGetObjectParameterivARB(var4, 35714, class566.field7997, 0);
        if (class566.field7997[0] == 0) {
            if (class566.field7997[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class566.field7997, 1);
            if (class566.field7997[1] > 1) {
                byte[] var7 = new byte[class566.field7997[1]];
                OpenGL.glGetInfoLogARB(var4, class566.field7997[1], class566.field7997, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class566.field7997[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field8133);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class387(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
    public static void method3994(byte arg0) {
        field9956 = null;
        if (arg0 != 70) {
            method3993(null, null, false);
        }
        field9955 = null;
        field9948 = null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BLji;I)V")
    public final void method3995(byte arg0, class611 arg1, int arg2) {
        field9954++;
        while (true) {
            int var4 = arg1.method3428((byte) -125);
            if (var4 == 0) {
                if (arg0 <= 71) {
                    method3994((byte) -61);
                    return;
                } else {
                    return;
                }
            }
            this.method3992(arg1, var4, 6, arg2);
        }
    }
}
