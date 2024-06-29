import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class class293 extends class544 {

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Ljw;")
    public static class581 field4274 = new class581(27, 6);

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lmga;")
    public static class739 field4278 = new class739(58, 6);

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field4281 = 0;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Ld;")
    public static class161 field4280;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Lefa;")
    public abstract class196 method1852(int arg0);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Z")
    public static final boolean method1853(int arg0, int arg1, int arg2) {
        field4276++;
        if (arg0 != 35716) {
            method1853(-78, -16, -123);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static final void method1854(int arg0) {
        if (arg0 != 1) {
            method1857(null, 20);
        }
        field4277++;
        int var1 = class381.field5565.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class381.field5565[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class729.field10121; var4++) {
                    if (class186.field2487[var2] == class138.field2015[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class138.field2015[class729.field10121] = class186.field2487[var2];
                    var3 = class729.field10121++;
                }
                class376 var5 = new class376(class381.field5565[var2]);
                int var6 = 0;
                while (var5.field5459 < class381.field5565[var2].length && var6 < 511 && class688.field9678 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method2359(-1);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class186.field2487[var2] >> 8) * 64 + var10 - class121.field1765;
                    int var13 = (class186.field2487[var2] & 0xFF) * 64 + var11 - class230.field3147;
                    class220 var14 = class364.field5309.method3338((byte) -109, var5.method2359(-1));
                    class174 var15 = (class174) class234.field3169.method3953((long) var7, 14);
                    if (var15 == null && (var14.field2988 & 0x1) > 0 && class387.field5634 == var9 && var12 >= 0 && var12 + var14.field2960 < class597.field8132 && var13 >= 0 && class628.field8800 > var14.field2960 + var13) {
                        class192 var16 = new class192();
                        var16.field1812 = var7;
                        class174 var17 = new class174(var16);
                        class234.field3169.method3962((long) var7, var17, -127);
                        class495.field6850[class184.field2457++] = var17;
                        class382.field5588[class688.field9678++] = var7;
                        var16.field1844 = class100.field1401;
                        var16.method1328(var14, false);
                        var16.method1020(-1, var16.field2577.field2960);
                        var16.field1790 = var16.field2577.field2961 << 3;
                        var16.method1021(16383, true, (var16.field2577.field2993 + 4 & 0xE4400007) << 11);
                        var16.method1327(var9, (byte) -82, var12, var13, var16.method655(arg0 - 127), true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static void method1855(byte arg0) {
        if (arg0 < 61) {
            field4280 = null;
        }
        field4280 = null;
        field4278 = null;
        field4274 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILdia;ILjava/lang/String;)Lkd;")
    public static final class298 method1856(int arg0, class246 arg1, int arg2, String arg3) {
        if (arg2 >= -116) {
            method1855((byte) 96);
        }
        field4279++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class387.field5633, 0);
        if (class387.field5633[0] == 0) {
            if (class387.field5633[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class387.field5633, 1);
            if (class387.field5633[1] > 1) {
                byte[] var6 = new byte[class387.field5633[1]];
                OpenGL.glGetInfoLogARB(var4, class387.field5633[1], class387.field5633, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class387.field5633[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class298(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lwc;I)V")
    public static final void method1857(class73 arg0, int arg1) {
        if (arg1 != -9269) {
            field4278 = null;
        }
        field4275++;
        class39 var2 = (class39) class680.field9518.method3953((long) arg0.field1812, arg1 ^ 0xFFFFDBC5);
        if (var2 == null) {
            return;
        }
        if (var2.field611 != null) {
            class686.field9647.method590(var2.field611);
            var2.field611 = null;
        }
        var2.method792((byte) -114);
    }
}
