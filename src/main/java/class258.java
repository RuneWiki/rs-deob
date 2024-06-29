import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class258 {

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field3414 = 1;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public static int field3418 = 0;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Lff;")
    public static class9 field3416 = new class9(83, -2);

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "Lpc;")
    public static class473 field3420;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V", line = 4)
    public static void method1558(byte arg0) {
        if (arg0 >= -127) {
            field3414 = -32;
        }
        field3416 = null;
        field3420 = null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIB)I", line = 19)
    public static final int method1559(int arg0, int arg1, byte arg2) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        if (arg2 != -82) {
            return -5;
        }
        field3417++;
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(B)I", line = 50)
    public static final int method1560(byte arg0) {
        field3415++;
        if (arg0 != -11) {
            field3418 = 105;
        }
        if (class484.field6735 == null) {
            if (!class379.field5189 && class412.field5693 > 0) {
                if (class39.field597 && class32.field523.method305(81, (byte) 59) && class412.field5693 > 2) {
                    return ((class39) class415.field5733.field3684.field630.field630).field602;
                }
                return ((class39) class415.field5733.field3684.field630).field602;
            }
            int var1 = class267.field3526.method1302(-4362);
            int var2 = class267.field3526.method1297(true);
            int var3 = class232.field3126;
            int var4 = class462.field6398;
            int var5 = class381.field5207;
            if (var3 < var1 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class412.field5693; var7++) {
                    if (class206.field2843) {
                        int var11 = (class412.field5693 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > var11 - 13 && (var11 + 3) >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = var4 + ((-var7 + -1 + class412.field5693) * 16) + 31;
                        if (var2 > var12 - 13 && var2 <= var12 + 3) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class290 var9 = new class290(class415.field5733);
                    for (class39 var10 = (class39) var9.method1707((byte) 124); var10 != null; var10 = (class39) var9.method1703(-127)) {
                        if (var8++ == var6) {
                            return var10.field602;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/lang/String;ILbo;I)Ltr;", line = 146)
    public static final class191 method1561(String arg0, int arg1, class511 arg2, int arg3) {
        field3419++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceARB(var4, arg0);
        if (arg1 != 35716) {
            return null;
        }
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class165.field2409, 0);
        if (class165.field2409[0] == 0) {
            if (class165.field2409[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class165.field2409, 1);
            if (class165.field2409[1] > 1) {
                byte[] var6 = new byte[class165.field2409[1]];
                OpenGL.glGetInfoLogARB(var4, class165.field2409[1], class165.field2409, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class165.field2409[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class191(arg2, var4, arg3);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IB)V", line = 186)
    public static final void method1562(int arg0, byte arg1) {
        class211.method1338(125);
        field3412++;
        class9.method104(-1);
        class240.method1480((byte) -122, true, arg0);
        class127.method916(124, class370.field4984, class71.field1082, class201.field2790);
        class327.method1891(109, class71.field1082, class370.field4984);
        class21.method201(class514.field7590, (byte) -64);
        class233.method1447((byte) -94);
        if (arg1 <= 76) {
            return;
        }
        class260.method1570(124);
        if (class454.field6161 == 10) {
            class39.method291(false, -1);
        } else if (class454.field6161 == 30) {
            class507.method2898(1, 25);
        } else if (class454.field6161 == 5) {
            class21.method198(class71.field1082, class370.field4984, 2);
        }
    }
}
