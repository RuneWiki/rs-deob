import jaggl.OpenGL;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class568 extends class176 {

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "Ljava/lang/String;")
    public String field7839;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field7840 = new String[100];

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "([IIZILgi;Z)Les;")
    public static final class320 method3227(int[] arg0, int arg1, boolean arg2, int arg3, class583 arg4, boolean arg5) {
        field7838++;
        if (arg2) {
            return null;
        } else if (!arg4.field8249 && (!class130.method886(1, arg3) || !class130.method886(1, arg1))) {
            return arg4.field8253 ? new class320(arg4, 34037, arg3, arg1, arg5, arg0) : new class320(arg4, arg3, arg1, class32.method326(arg3, arg2), class32.method326(arg1, false), arg0);
        } else {
            return new class320(arg4, 3553, arg3, arg1, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(III)I")
    public static final int method3228(int arg0, int arg1, int arg2) {
        field7837++;
        if (class335.field4464 == -1) {
            return 1;
        }
        if (class103.field1570 != arg1) {
            class452.method2658(7, arg1);
            if (class103.field1570 != arg1) {
                return -1;
            }
        }
        try {
            Dimension var3 = class166.field2390.getSize();
            class639.method3699(class633.field9249.method739(class173.field2491, -93), true, class206.field2905, (byte) 82);
            class317 var4 = class428.method2544(-125, 0, class335.field4464, class566.field7830);
            int var5 = 20 % ((-arg0 - 65) / 46);
            long var6 = class488.method2835(30160);
            class69.field1165.method1269();
            class333.field4459.method1054(0, class194.field2745, 0);
            class69.field1165.method1355(class333.field4459);
            class69.field1165.method1365(var3.width / 2, var3.height / 2, 512, 512);
            class69.field1165.method1295(1.0F);
            class69.field1165.method1298(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class157 var8 = class69.field1165.method1293(var4, 2048, 64, 64, 768);
            int var9 = 0;
            label41: for (int var10 = 0; var10 < 500; var10++) {
                class69.field1165.method1274(0);
                class69.field1165.method1265();
                for (int var11 = 15; var11 >= 0; var11--) {
                    for (int var12 = 0; var12 <= var11; var12++) {
                        class84.field1366.method1054((int) (((float) var12 - ((float) var11 / 2.0F)) * (float) class41.field808), 0, (var11 + 1) * class41.field808);
                        var8.method154(class84.field1366, null, 0);
                        var9++;
                        if ((long) arg2 <= class488.method2835(30160) - var6) {
                            break label41;
                        }
                    }
                }
            }
            class69.field1165.method1289();
            long var13 = (long) (var9 * 1000) / (class488.method2835(30160) - var6);
            class69.field1165.method1274(0);
            class69.field1165.method1265();
            return (int) var13;
        } catch (Throwable var16) {
            var16.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IBZ)Lib;")
    public static final class133 method3229(int arg0, byte arg1, boolean arg2) {
        if (arg1 == -88) {
            field7841++;
            long var3 = (long) (arg0 | (arg2 ? Integer.MIN_VALUE : 0));
            return (class133) class641.field9319.method1242(0, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILjava/lang/String;ILgi;)Lmv;")
    public static final class313 method3230(int arg0, String arg1, int arg2, class583 arg3) {
        field7842++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class523.field7351, 0);
        if (~class523.field7351[0] == arg0) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class313(arg3, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZZ)V")
    public static final void method3231(int arg0, boolean arg1, boolean arg2) {
        int var3 = 93 / ((-arg0 - 44) / 38);
        if (arg2) {
            class109.field1683++;
            class425.method2534(107);
        }
        field7843++;
        if (arg1) {
            class316.field4244++;
            class193.method1200((byte) 122);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)V")
    public static void method3232(boolean arg0) {
        if (!arg0) {
            field7840 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "()V")
    public class568() {
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class568(String arg0, int arg1) {
        this.field7839 = arg0;
    }
}
