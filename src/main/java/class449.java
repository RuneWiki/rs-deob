import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class449 extends class459 implements class736 {

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    private int field6959 = -1;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    private int field6967 = -1;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public int field6972;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Lvf;")
    private class159 field6968;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    private int field6971;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public int field6957;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    private int field6966;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    private int field6961;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field6975 = new String[] { method3503(method3502("\u007f3Ba\u0005")), method3503(method3502("\u007f3Bb\u0005")), method3503(method3502("\u007f3B\u001bDp>\u0018\u0019\u0005")), method3503(method3502("p\"\u0000K")), method3503(method3502("eyB\tP")), method3503(method3502("\u007f3Bd\u0005")), method3503(method3502("\u007f3Be\u0005")), method3503(method3502("\u007f3BADp6\u0000NW{\u007f")), method3503(method3502("\u007f3Bf\u0005")), method3503(method3502("\u007f3Bc\u0005")) };

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field6963 = new String[200];

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Lqa;")
    public static class259 field6964 = new class259(8);

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "[J")
    public static long[] field6973 = new long[32];

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "Lgda;")
    public static class58 field6960;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 4)
    public static void method3497(int arg0) {
        try {
            field6973 = null;
            field6964 = null;
            if (arg0 == 0) {
                field6960 = null;
                field6963 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6975[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 21)
    public final void method86(int arg0) {
        try {
            OpenGL.glFramebufferRenderbufferEXT(this.field6967, this.field6959, 36161, arg0);
            field6962++;
            this.field6959 = -1;
            this.field6967 = -1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6975[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V", line = 31)
    public final void method3498(boolean arg0) {
        try {
            if (this.field6966 > 0) {
                this.field6968.method1503(this.field6966, -106, this.field6961);
                this.field6966 = 0;
            }
            field6958++;
            if (!arg0) {
                this.method3498(false);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6975[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V", line = 53)
    public static final void method3499(byte arg0) {
        try {
            class439.field6856 = null;
            field6965++;
            if (arg0 != -2) {
                method3500(41, -42);
            }
            if (class316.field5141 && class466.method3598(1) != 1) {
                class763.method5507(0, 0, class168.method1567((byte) 66), class740.method5391((byte) 24), class315.field5127 == 3 || class315.field5127 == 7, arg0 ^ 0xFFFFFFA9);
            }
            int var1 = 0;
            int var2 = 0;
            if (class316.field5141) {
                var1 = class50.method516(false);
                var2 = class568.method4171(arg0 + 2);
            }
            class119.method1172(var2, -1, arg0 - 111, class333.field5444 + var2, var1 + class64.field881, var2, class317.field5175, var1, var1);
            if (class439.field6856 != null) {
                class75.method787(76, class333.field5444 + var2, var1, -1412584499, class439.field6856, true, class345.field5600, var2, class762.field11188, class546.field8028.field9749, class64.field881 + var1);
                class439.field6856 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6975[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)V", line = 89)
    public static final void method3500(int arg0, int arg1) {
        try {
            field6956++;
            if (arg0 == -13314) {
                class551 var2 = class380.method3113(arg0 + 13315, (long) arg1, 6);
                var2.method4089(63);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6975[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lvf;III)V", line = 153)
    public class449(class159 arg0, int arg1, int arg2, int arg3) {
        try {
            this.field6972 = arg2;
            this.field6968 = arg0;
            this.field6971 = arg1;
            this.field6957 = arg3;
            OpenGL.glGenRenderbuffersEXT(1, class25.field275, 0);
            this.field6966 = class25.field275[0];
            OpenGL.glBindRenderbufferEXT(36161, this.field6966);
            OpenGL.glRenderbufferStorageEXT(36161, this.field6971, this.field6972, this.field6957);
            this.field6961 = this.field6957 * this.field6972 * this.field6968.method1480((byte) -44, this.field6971);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6975[2] + (arg0 == null ? field6975[3] : field6975[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lvf;IIII)V", line = 168)
    public class449(class159 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.field6972 = arg2;
            this.field6968 = arg0;
            this.field6957 = arg3;
            this.field6971 = arg1;
            OpenGL.glGenRenderbuffersEXT(1, class25.field275, 0);
            this.field6966 = class25.field275[0];
            OpenGL.glBindRenderbufferEXT(36161, this.field6966);
            OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field6971, this.field6972, this.field6957);
            this.field6961 = this.field6972 * this.field6957 * this.field6968.method1480((byte) -39, this.field6971);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6975[2] + (arg0 == null ? field6975[3] : field6975[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V", line = 125)
    public final void method3501(int arg0, int arg1, int arg2) {
        try {
            OpenGL.glFramebufferRenderbufferEXT(arg2, arg0, 36161, this.field6966);
            field6974++;
            this.field6959 = arg0;
            this.field6967 = arg2;
            int var4 = -124 % ((arg1 + 52) / 52);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6975[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "finalize", descriptor = "()V", line = 138)
    protected final void finalize() throws Throwable {
        try {
            this.method3498(true);
            field6970++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6975[7] + ')');
        }
    }

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3502(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3503(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
