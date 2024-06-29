import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class229 {

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Z")
    public boolean field3045;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Lmea;")
    public static class355 field3034 = new class355("", 11);

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field3041 = 0;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "[I")
    public static int[] field3046 = new int[1];

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lvs;")
    public static class476 field3043 = new class476();

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Lip;")
    public class532 field3038;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lip;")
    public class532 field3039;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Z")
    public boolean field3033;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "[I")
    public static int[] field3042;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public final void method1426(byte arg0) {
        field3035++;
        if (this.field3039 != null) {
            this.field3039.method987(-126);
        }
        this.field3033 = false;
        if (arg0 < 68) {
            method1427(null, -81, null, 90);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([BILkd;I)Loh;")
    public static final class581 method1427(byte[] arg0, int arg1, class700 arg2, int arg3) {
        field3037++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceRawARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class267.field3481, 0);
        if (class267.field3481[0] == 0) {
            if (class267.field3481[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class267.field3481, 1);
            if (class267.field3481[1] > 1) {
                byte[] var6 = new byte[class267.field3481[1]];
                OpenGL.glGetInfoLogARB(var4, class267.field3481[1], class267.field3481, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class267.field3481[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        if (arg1 != -20947) {
            method1428(40);
        }
        return new class581(arg2, var4, arg3);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static final void method1428(int arg0) {
        if (arg0 != 65) {
            method1429((byte) 62);
        }
        field3047++;
        if (class500.field7079) {
            return;
        }
        class567.field8268 = true;
        class500.field7079 = true;
        if (class335.field4872.field9499) {
            class311.field4589 = ((int) class311.field4589 - 65 & 0xFFFFFF80);
        } else {
            class682.field9632 += (-24.0F - class682.field9632) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
    public static void method1429(byte arg0) {
        field3046 = null;
        if (arg0 != -10) {
            method1427(null, -77, null, -106);
        }
        field3042 = null;
        field3034 = null;
        field3043 = null;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)Z")
    public final boolean method1430(byte arg0) {
        if (arg0 != 108) {
            field3043 = null;
        }
        field3036++;
        return this.field3033 && !this.field3045;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Z)V")
    public class229(boolean arg0) {
        this.field3045 = arg0;
    }
}
