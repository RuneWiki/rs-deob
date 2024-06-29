import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class579 extends class486 implements class246 {

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "Ltm;")
    public class486 field8050;

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "Lim;")
    public static class353 field8049 = new class353(23, -1);

    @OriginalMember(owner = "client!wm", name = "T", descriptor = "Lvt;")
    public static class344 field8063 = new class344("M", "M", "M", "M");

    @OriginalMember(owner = "client!wm", name = "V", descriptor = "[I")
    public static int[] field8065 = new int[6];

    @OriginalMember(owner = "client!wm", name = "X", descriptor = "[I")
    public static int[] field8067 = new int[1];

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
    public static int field8052;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!wm", name = "U", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!wm", name = "W", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "Lqb;")
    public static class627 field8053;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)Z")
    public final boolean method55(byte arg0) {
        int var2 = -123 / ((-arg0 - 20) / 32);
        field8045++;
        return false;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;Luq;IZ)Lop;")
    public static final class364 method3253(String arg0, class313 arg1, int arg2, boolean arg3) {
        field8051++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class277.field3616, 0);
        if (arg3) {
            return null;
        }
        if (class277.field3616[0] == 0) {
            if (class277.field3616[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class277.field3616, 1);
            if (class277.field3616[1] > 1) {
                byte[] var6 = new byte[class277.field3616[1]];
                OpenGL.glGetInfoLogARB(var4, class277.field3616[1], class277.field3616, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class277.field3616[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class364(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(ILqa;)Lud;")
    public final class119 method58(int arg0, class167 arg1) {
        int var3 = 115 / ((arg0 - 4) / 47);
        field8047++;
        return this.field8050.method58(94, arg1);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)I")
    public final int method52(int arg0) {
        if (arg0 != -17817) {
            field8064 = 110;
        }
        field8043++;
        return 0;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIIIILtm;)V")
    public class579(int arg0, int arg1, int arg2, int arg3, int arg4, class486 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class196.method1258((byte) -75, arg1, arg0));
        this.field8050 = arg5;
    }

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)I")
    public final int method2135(int arg0) {
        if (arg0 != -1) {
            field8064 = -94;
        }
        field8061++;
        return 0;
    }

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "(I)V")
    public static void method3254(int arg0) {
        field8063 = null;
        if (arg0 != -24270) {
            method3256(70, -79);
        }
        field8053 = null;
        field8049 = null;
        field8067 = null;
        field8065 = null;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(Lqa;I)V")
    public final void method66(class167 arg0, int arg1) {
        if (arg1 == 0) {
            field8052++;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLqa;)Lqba;")
    public final class541 method59(byte arg0, class167 arg1) {
        field8054++;
        int var3 = 49 / ((arg0 + 30) / 63);
        return null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)I")
    public final int method57(int arg0) {
        if (arg0 != -29185) {
            field8065 = null;
        }
        field8059++;
        return 0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BII)Z")
    public static final boolean method3255(byte arg0, int arg1, int arg2) {
        field8046++;
        if (arg0 == -76) {
            return (arg2 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lqa;I)V")
    public final void method61(class167 arg0, int arg1) {
        field8048++;
        if (arg1 != -9785) {
            this.method57(79);
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)I")
    public final int method60(int arg0) {
        field8056++;
        if (arg0 != 1901) {
            this.method2135(-44);
        }
        return 0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILqa;)V")
    public final void method62(int arg0, class167 arg1) {
        if (arg0 != 22132) {
            field8067 = null;
        }
        field8055++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I")
    public static final int method3256(int arg0, int arg1) {
        field8057++;
        if (arg0 != 1725753323) {
            field8066 = -46;
        }
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        int var2 = 110 / ((-arg0 - 4) / 41);
        field8058++;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(ILjava/lang/String;)V")
    public static final void method3257(int arg0, String arg1) {
        field8042++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class22.method125(47, arg1);
        if (var2 == null) {
            return;
        }
        int var3 = -58 / ((32 - arg0) / 45);
        for (int var4 = 0; var4 < class466.field6613; var4++) {
            String var5 = class546.field7616[var4];
            if (var5.startsWith("*")) {
                var5 = var5.substring(1);
            }
            String var6 = class22.method125(39, var5);
            if (var6 != null && var6.equals(var2)) {
                class466.field6613--;
                for (int var7 = var4; var7 < class466.field6613; var7++) {
                    class546.field7616[var7] = class546.field7616[var7 + 1];
                    class126.field1572[var7] = class126.field1572[var7 + 1];
                    class282.field3694[var7] = class282.field3694[var7 + 1];
                    class321.field4442[var7] = class321.field4442[var7 + 1];
                    class404.field5535[var7] = class404.field5535[var7 + 1];
                }
                class8.field68++;
                class277.field3625 = class591.field8533;
                class118.method650(true, class108.field1400);
                class272.field3457.method3060(class194.method1241(arg1, -128), -25098);
                class272.field3457.method3040(false, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILqa;)Lr;")
    public final class521 method53(int arg0, int arg1, class167 arg2) {
        if (arg1 == 30307) {
            field8060++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)I")
    public static final int method3258(int arg0, int arg1, int arg2) {
        field8044++;
        if (arg0 < 85) {
            return -25;
        } else if (arg2 == 1 || arg2 == 3) {
            return class598.field8640[arg1 & 0x3];
        } else {
            return class20.field295[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method63(int arg0, int arg1, class167 arg2, int arg3) {
        if (arg3 > -35) {
            field8053 = null;
        }
        field8062++;
        return false;
    }
}
