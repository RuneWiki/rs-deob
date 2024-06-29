import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class129 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lei;")
    public class68 field2209 = new class68();

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lce;")
    public static class126 field2211 = class206.method1445(-7923, "::wm0");

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Lei;")
    private class68 field2224;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 18)
    public static final Class method892(int arg0, String arg1) throws ClassNotFoundException {
        field2217++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        }
        if (arg0 > -31) {
            method903(96, -73, 32, -28, -88, -94, -25);
        }
        if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Lei;", line = 63)
    public final class68 method893(byte arg0) {
        int var2 = -117 / ((arg0 + 33) / 33);
        field2222++;
        class68 var3 = this.field2224;
        if (this.field2209 == var3) {
            this.field2224 = null;
            return null;
        } else {
            this.field2224 = var3.field1129;
            return var3;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)Lei;", line = 81)
    public final class68 method894(int arg0) {
        field2221++;
        class68 var2 = this.field2224;
        if (this.field2209 == var2) {
            this.field2224 = null;
            return null;
        } else {
            int var3 = 0 / ((arg0 - 75) / 50);
            this.field2224 = var2.field1114;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)Lei;", line = 106)
    public final class68 method895(int arg0) {
        field2213++;
        if (arg0 != 14189) {
            return (class68) null;
        }
        class68 var2 = this.field2209.field1129;
        if (this.field2209 == var2) {
            return null;
        } else {
            var2.method499((byte) 64);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)Z", line = 123)
    public static final boolean method896(int arg0, boolean arg1) {
        field2223++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class84.field1341[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1005) {
            return true;
        } else {
            if (arg1) {
                method900(55, 111);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILei;)V", line = 157)
    public final void method897(int arg0, class68 arg1) {
        if (arg1.field1114 != null) {
            arg1.method499((byte) 64);
        }
        field2216++;
        arg1.field1129 = this.field2209.field1129;
        arg1.field1114 = this.field2209;
        arg1.field1114.field1129 = arg1;
        arg1.field1129.field1114 = arg1;
        if (arg0 != 0) {
            this.field2209 = (class68) null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Lei;", line = 174)
    public final class68 method898(byte arg0) {
        field2210++;
        class68 var2 = this.field2209.field1129;
        if (arg0 >= -49) {
            return (class68) null;
        } else if (this.field2209 == var2) {
            this.field2224 = null;
            return null;
        } else {
            this.field2224 = var2.field1129;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lei;I)V", line = 199)
    public final void method899(class68 arg0, int arg1) {
        if (arg1 != -28) {
            this.field2224 = (class68) null;
        }
        if (arg0.field1114 != null) {
            arg0.method499((byte) 64);
        }
        field2212++;
        arg0.field1114 = this.field2209.field1114;
        arg0.field1129 = this.field2209;
        arg0.field1114.field1129 = arg0;
        arg0.field1129.field1114 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V", line = 221)
    public static final void method900(int arg0, int arg1) {
        if (arg0 != -1054795711) {
            field2211 = (class126) null;
        }
        class203.field3480.method1175(true, arg1);
        field2208++;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V", line = 234)
    public static void method901(byte arg0) {
        field2211 = null;
        if (arg0 > -41) {
            field2218 = -90;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIILvh;I)Ljava/awt/Frame;", line = 245)
    public static final Frame method902(int arg0, int arg1, int arg2, int arg3, class147 arg4, int arg5) {
        field2214++;
        if (!arg4.method1094(116)) {
            return null;
        }
        if (arg3 == 0) {
            class161[] var6 = class160.method1177(arg4, -118);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field2911 == arg2 && var6[var8].field2906 == arg1 && (arg0 == 0 || var6[var8].field2908 == arg0) && (!var7 || arg3 < var6[var8].field2914)) {
                    arg3 = var6[var8].field2914;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class60 var9 = arg4.method1108((byte) 63, arg0, arg1, arg3, arg2);
        while (var9.field965 == 0) {
            class313.method2158(10L, true);
        }
        Frame var10 = (Frame) var9.field967;
        if (arg5 >= -67) {
            return (Frame) null;
        } else if (var10 == null) {
            return null;
        } else if (var9.field965 == 2) {
            class244.method1680(var10, (byte) 111, arg4);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIII)V", line = 318)
    public static final void method903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2219++;
        int var7 = 0;
        int var8 = 107 / ((-arg3 - 29) / 41);
        class190[] var9 = class100.field1623;
        while (var7 < var9.length) {
            class190 var10 = var9[var7];
            if (var10 != null && var10.field3268 == 2) {
                class161.method1188(arg5 >> 1, true, arg2 >> 1, (var10.field3266 - class138.field2473 << 7) + var10.field3254, arg1, (var10.field3270 - class58.field914 << 7) + var10.field3265, arg6, var10.field3251 * 2);
                if (class313.field5365 > -1 && (class249.field4174 % 20) < 10) {
                    class315.field5406[var10.field3263].method1333(arg4 + class313.field5365 - 12, class15.field215 + arg0 + -28);
                }
            }
            var7++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)Lei;", line = 352)
    public final class68 method904(int arg0) {
        field2220++;
        if (arg0 > -30) {
            this.method904(-61);
        }
        class68 var2 = this.field2209.field1114;
        if (this.field2209 == var2) {
            this.field2224 = null;
            return null;
        } else {
            this.field2224 = var2.field1114;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V", line = 373)
    public final void method905(byte arg0) {
        field2215++;
        if (arg0 <= 39) {
            return;
        }
        while (true) {
            class68 var2 = this.field2209.field1129;
            if (this.field2209 == var2) {
                this.field2224 = null;
                return;
            }
            var2.method499((byte) 64);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 401)
    public class129() {
        this.field2209.field1129 = this.field2209;
        this.field2209.field1114 = this.field2209;
    }
}
