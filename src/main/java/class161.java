import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class161 {

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "Z")
    public static boolean field1984 = false;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "J")
    public static long field1985;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BZ)V", line = 7)
    public static final void method1019(byte arg0, boolean arg1) {
        class326.method1895(class300.field4038, (byte) 114, class467.field6533, class127.field1619, arg1);
        field1986++;
        int var2 = -15 % ((27 - arg0) / 62);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([IB[Ljava/lang/Object;)V", line = 17)
    public static final void method1020(int[] arg0, byte arg1, Object[] arg2) {
        if (arg1 != 89) {
            field1985 = -16L;
        }
        field1988++;
        class184.method1146(0, arg2, arg0.length - 1, arg0, (byte) -107);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lkga;Ljava/lang/String;II)Lbba;", line = 29)
    public static final class97 method1021(class506 arg0, String arg1, int arg2, int arg3) {
        field1982++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        if (arg3 > -62) {
            field1984 = true;
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class21.field542, 0);
        if (class21.field542[0] == 0) {
            if (class21.field542[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class21.field542, 1);
            if (class21.field542[1] > 1) {
                byte[] var6 = new byte[class21.field542[1]];
                OpenGL.glGetInfoLogARB(var4, class21.field542[1], class21.field542, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class21.field542[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class97(arg0, var4, arg2);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([Ln;II)V", line = 74)
    public static final void method1022(class17[] arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class17 var5 = arg0[var3];
            if (var5 != null && var5.field469 == arg1 && !client.method1660(var5)) {
                if (var5.field379 == 0) {
                    method1022(arg0, var5.field465, 57);
                    if (var5.field429 != null) {
                        method1022(var5.field429, var5.field465, 75);
                    }
                    class21 var6 = (class21) class113.field1442.method3678((long) var5.field465, -119);
                    if (var6 != null) {
                        class591.method3430(-109, var6.field540);
                    }
                }
                if (var5.field379 == 6 && var5.field382 != -1) {
                    class282 var7 = class195.field2367.method3273(var5.field382, 0);
                    if (var7 != null) {
                        var5.field385 += class456.field6422;
                        int var8 = var5.field444;
                        while (var7.field3840[var5.field444] < var5.field385) {
                            var5.field385 -= var7.field3840[var5.field444];
                            var5.field444++;
                            if (var5.field444 >= var7.field3827.length) {
                                var5.field444 -= var7.field3821;
                                if (var5.field444 < 0 || var7.field3827.length <= var5.field444) {
                                    var5.field444 = 0;
                                }
                            }
                            var5.field415 = var5.field444 + 1;
                            if (var7.field3827.length <= var5.field415) {
                                var5.field415 -= var7.field3821;
                                if (var5.field415 < 0 || var5.field415 >= var7.field3827.length) {
                                    var5.field415 = -1;
                                }
                            }
                            class314.method1836(var5, false);
                        }
                        if (var5.field444 != var8) {
                            class32.method402(var5.field444, -1830945624, var7);
                        }
                    }
                }
            }
        }
        field1989++;
        int var4 = 61 % (-arg2 / 50);
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(II)V", line = 170)
    public class161(int arg0, int arg1) {
        this.field1987 = arg1;
    }

    @OriginalMember(owner = "client!sq", name = "toString", descriptor = "()Ljava/lang/String;", line = 181)
    public final String toString() {
        field1983++;
        throw new IllegalStateException();
    }
}
