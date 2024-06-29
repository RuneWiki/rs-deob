import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class617 extends class86 {

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field7826 = 0;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "[I")
    public static int[] field7828 = new int[1];

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(ILsf;)V")
    public class617(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        if (arg0 == -65) {
            if (super.field1203.method2987(2) == class433.field5672) {
                if (super.field1203.method2981(-14)) {
                    super.field1200 = 0;
                }
            } else {
                super.field1200 = 1;
            }
            ++field7821;
            if (~super.field1200 != -1 && super.field1200 != 1) {
                super.field1200 = this.method73(arg0 + 65);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lsf;)V")
    public class617(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([Ll;Lck;I)Lfm;")
    public static final class477 method3302(class668[] arg0, class733 arg1, int arg2) {
        ++field7823;
        for (int var3 = 0; ~arg0.length < ~var3; ++var3) {
            if (arg0[var3] == null || arg0[var3].field8687 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; ~arg0.length < ~var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field8687);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class695.field8913, 0);
        if (class695.field8913[0] == 0) {
            if (~class695.field8913[0] == -1) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class695.field8913, 1);
            if (class695.field8913[1] > 1) {
                byte[] var7 = new byte[class695.field8913[1]];
                OpenGL.glGetInfoLogARB(var4, class695.field8913[1], class695.field8913, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (~class695.field8913[0] == -1) {
                for (int var8 = 0; ~arg0.length < ~var8; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field8687);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        if (arg2 > -109) {
            return null;
        } else {
            return new class477(arg1, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        ++field7825;
        if (arg1 != -2) {
            field7826 = -25;
        }
        if (super.field1203.method2987(2) == class433.field5672) {
            if (super.field1203.method2981(-14)) {
                return 3;
            } else {
                return arg0 != 0 && ~super.field1203.field6915.method2297(false) != -2 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)Z")
    public final boolean method3303(int arg0) {
        int var2 = 32 % ((arg0 - -57) / 57);
        ++field7827;
        if (super.field1203.method2987(2) == class433.field5672) {
            return !super.field1203.method2981(-14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        ++field7820;
        if (arg0 != 0) {
            this.method72(75, -100);
        }
        return 1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)I")
    public final int method3304(boolean arg0) {
        ++field7822;
        if (arg0) {
            field7828 = null;
        }
        return super.field1200;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        super.field1200 = arg0;
        ++field7824;
        if (arg1) {
            field7826 = 41;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Z)V")
    public static void method3305(boolean arg0) {
        field7828 = null;
        if (!arg0) {
            method3305(true);
        }
    }
}
