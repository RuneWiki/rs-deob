import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class125 {

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "Llda;")
    private class513 field2208 = new class513();

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "Loaa;")
    private class305 field2217 = new class305();

    @OriginalMember(owner = "client!bba", name = "m", descriptor = "I")
    private int field2220;

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "I")
    private int field2218;

    @OriginalMember(owner = "client!bba", name = "l", descriptor = "Lcja;")
    private class46 field2219;

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "[I")
    public static int[] field2213 = new int[4];

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2212 = new Rectangle[100];

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Z", line = 5)
    public static final boolean method1074(int arg0) {
        field2209++;
        int var1 = -85 % ((53 - arg0) / 48);
        return class35.method208((byte) 43, "jaclib") ? class35.method208((byte) -91, "hw3d") : false;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(BJ)V", line = 27)
    public final void method1075(byte arg0, long arg1) {
        field2215++;
        class513 var4 = (class513) this.field2219.method337(arg1, 1);
        if (var4 != null) {
            var4.method1207(124);
            var4.method2942(false);
            this.field2220++;
        }
        if (arg0 > -41) {
            this.method1075((byte) -23, -99L);
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Z)V", line = 48)
    public static void method1076(boolean arg0) {
        field2212 = null;
        field2213 = null;
        if (arg0) {
            method1076(true);
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(JB)Llda;", line = 65)
    public final class513 method1077(long arg0, byte arg1) {
        field2216++;
        if (arg1 < 105) {
            return null;
        }
        class513 var4 = (class513) this.field2219.method337(arg0, 1);
        if (var4 != null) {
            this.field2217.method1953((byte) 83, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "([Lwja;Loia;I)Loca;", line = 89)
    public static final class278 method1078(class283[] arg0, class97 arg1, int arg2) {
        field2214++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field3921 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field3921);
        }
        if (arg2 != 13286) {
            method1074(58);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class23.field476, 0);
        if (class23.field476[0] == 0) {
            if (class23.field476[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class23.field476, 1);
            if (class23.field476[1] > 1) {
                byte[] var7 = new byte[class23.field476[1]];
                OpenGL.glGetInfoLogARB(var4, class23.field476[1], class23.field476, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class23.field476[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field3921);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class278(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Llda;JB)V", line = 162)
    public final void method1079(class513 arg0, long arg1, byte arg2) {
        field2210++;
        if (this.field2220 == 0) {
            class513 var5 = this.field2217.method1948(true);
            var5.method1207(112);
            var5.method2942(false);
            if (this.field2208 == var5) {
                class513 var6 = this.field2217.method1948(true);
                var6.method1207(85);
                var6.method2942(false);
            }
        } else {
            this.field2220--;
        }
        this.field2219.method341(arg1, arg0, (byte) 52);
        int var7 = 114 / ((-arg2 - 10) / 60);
        this.field2217.method1953((byte) 83, arg0);
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(I)V", line = 228)
    public class125(int arg0) {
        this.field2220 = arg0;
        this.field2218 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field2219 = new class46(var2);
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V", line = 208)
    public final void method1080(int arg0) {
        field2211++;
        if (arg0 == 90) {
            this.field2217.method1950(0);
            this.field2219.method338((byte) -111);
            this.field2208 = new class513();
            this.field2220 = this.field2218;
        }
    }
}
