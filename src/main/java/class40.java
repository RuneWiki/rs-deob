import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class40 {

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public int field419 = -1;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public int field421 = -1;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Z")
    public static boolean field415 = true;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lofa;")
    public static class347 field417 = null;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Z")
    public static boolean field414 = false;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[I")
    public int[] field420;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZLdt;)V", line = 3)
    private final void method228(int arg0, boolean arg1, class254 arg2) {
        field422++;
        if (arg0 == 1) {
            this.field421 = arg2.method1728((byte) 15);
        } else if (arg0 == 2) {
            this.field420 = new int[arg2.method1731((byte) 64)];
            for (int var4 = 0; var4 < this.field420.length; var4++) {
                this.field420[var4] = arg2.method1728((byte) 90);
            }
        } else if (arg0 == 3) {
            this.field419 = arg2.method1731((byte) 64);
        }
        if (arg1) {
            field415 = true;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILdt;)V", line = 40)
    public final void method229(int arg0, class254 arg1) {
        field418++;
        if (arg0 > -36) {
            this.field421 = 116;
        }
        while (true) {
            int var3 = arg1.method1731((byte) 64);
            if (var3 == 0) {
                return;
            }
            this.method228(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 61)
    public static void method230(byte arg0) {
        field417 = null;
        if (arg0 <= 57) {
            field417 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([Lmja;BLlf;)Lgw;", line = 85)
    public static final class182 method231(class440[] arg0, byte arg1, class250 arg2) {
        field416++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field6334 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        int var6 = 0;
        if (arg1 != -7) {
            field414 = true;
        }
        while (arg0.length > var6) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field6334);
            var6++;
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class637.field8587, 0);
        if (class637.field8587[0] == 0) {
            if (class637.field8587[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class637.field8587, 1);
            if (class637.field8587[1] > 1) {
                byte[] var7 = new byte[class637.field8587[1]];
                OpenGL.glGetInfoLogARB(var4, class637.field8587[1], class637.field8587, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class637.field8587[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field6334);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class182(arg2, var4, arg0);
    }
}
