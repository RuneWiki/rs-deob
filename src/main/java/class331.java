import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class331 extends class747 {

    @OriginalMember(owner = "client!eca", name = "I", descriptor = "Lst;")
    public static class335 field4699 = new class335(38, 8);

    @OriginalMember(owner = "client!eca", name = "K", descriptor = "Z")
    public static boolean field4701 = false;

    @OriginalMember(owner = "client!eca", name = "J", descriptor = "I")
    public static int field4700 = 0;

    @OriginalMember(owner = "client!eca", name = "L", descriptor = "Lfv;")
    public static class718 field4702 = new class718();

    @OriginalMember(owner = "client!eca", name = "F", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!eca", name = "G", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!eca", name = "H", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "()V")
    public class331() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lhj;[Lws;B)Ljp;")
    public static final class471 method2122(class47 arg0, class696[] arg1, byte arg2) {
        ++field4698;
        for (int var3 = 0; ~var3 > ~arg1.length; ++var3) {
            if (arg1[var3] == null || ~arg1[var3].field9692 >= -1L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; arg1.length > var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field9692);
        }
        OpenGL.glLinkProgramARB(var4);
        if (arg2 < 78) {
            method2123(-128, -98L);
        }
        OpenGL.glGetObjectParameterivARB(var4, 35714, class230.field3111, 0);
        if (~class230.field3111[0] == -1) {
            if (class230.field3111[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class230.field3111, 1);
            if (~class230.field3111[1] < -2) {
                byte[] var7 = new byte[class230.field3111[1]];
                OpenGL.glGetInfoLogARB(var4, class230.field3111[1], class230.field3111, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (~class230.field3111[0] == -1) {
                for (int var8 = 0; arg1.length > var8; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field9692);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class471(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method2123(int arg0, long arg1) {
        ++field4696;
        if (~arg1 < -1L && ~arg1 > -6582952005840035282L) {
            if (~(arg1 % 37L) == -1L) {
                return null;
            } else {
                int var3 = arg0;
                for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg1 != 0L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    char var9 = class507.field7039[(int) (-(arg1 * 37L) + var7)];
                    if (var9 == '_') {
                        int var10 = -1 + var6.length();
                        var9 = 160;
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    }
                    var6.append(var9);
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(I)V")
    public static void method2124(int arg0) {
        if (arg0 != 160) {
            field4701 = false;
        }
        field4702 = null;
        field4699 = null;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)[I")
    public final int[] method182(int arg0, int arg1) {
        ++field4697;
        if (arg1 > -89) {
            return null;
        } else {
            int[] var3 = super.field10279.method3479(true, arg0);
            if (super.field10279.field8263) {
                class245.method1648(var3, 0, class73.field1095, class515.field7103[arg0]);
            }
            return var3;
        }
    }
}
