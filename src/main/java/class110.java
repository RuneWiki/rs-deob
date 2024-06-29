import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class110 extends class197 {

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    private final int field1909;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    private final int field1903;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    private final int field1906;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    private final int field1917;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Ldc;")
    private static class37 field1911 = class185.method1233((byte) 86, "Please try using a different world)3");

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Ldc;")
    private static class37 field1902 = class185.method1233((byte) 86, "Members object");

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Ldc;")
    public static class37 field1904 = field1911;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "Ldc;")
    public static class37 field1913 = field1911;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "Ldc;")
    public static class37 field1910 = field1911;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "Ldc;")
    public static class37 field1919 = field1911;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "Ldc;")
    public static class37 field1915 = class185.method1233((byte) 86, "gr-Un:");

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "Ldc;")
    public static class37 field1921 = field1902;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "Ldc;")
    public static class37 field1912 = class185.method1233((byte) 86, ":chalreq:");

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Ldc;")
    public static class37 field1907 = field1911;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public static int field1920 = -1;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "Ldc;")
    public static class37 field1918 = class185.method1233((byte) 86, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "Ldc;")
    public static class37 field1922 = field1911;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBLbi;Ljava/awt/Component;)Lbc;")
    public static final class15 method712(int arg0, int arg1, byte arg2, class21 arg3, Component arg4) {
        ++field1914;
        if (~class72.field1278 == -1) {
            throw new IllegalStateException();
        } else if (~arg1 <= -1 && ~arg1 > -3) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class15 var5 = (class15) Class.forName("ui").newInstance();
                var5.field221 = new int[(!class32.field650 ? 1 : 2) * 256];
                var5.field247 = arg0;
                var5.method106(arg4);
                var5.field239 = (arg0 & -1024) - -1024;
                if (arg2 <= 23) {
                    return null;
                } else {
                    if (var5.field239 > 16384) {
                        var5.field239 = 16384;
                    }
                    var5.method111(var5.field239);
                    if (~class136.field2540 < -1 && class65.field1176 == null) {
                        class65.field1176 = new class74();
                        class65.field1176.field1304 = arg3;
                        arg3.method141(class136.field2540, class65.field1176, (byte) 72);
                    }
                    if (class65.field1176 != null) {
                        if (class65.field1176.field1306[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class65.field1176.field1306[arg1] = var5;
                    }
                    return var5;
                }
            } catch (Throwable var8) {
                try {
                    class179 var6 = new class179(arg3, arg1);
                    var6.field247 = arg0;
                    var6.field221 = new int[256 * (class32.field650 ? 2 : 1)];
                    var6.method106(arg4);
                    var6.field239 = 16384;
                    var6.method111(var6.field239);
                    if (~class136.field2540 < -1 && class65.field1176 == null) {
                        class65.field1176 = new class74();
                        class65.field1176.field1304 = arg3;
                        arg3.method141(class136.field2540, class65.field1176, (byte) 72);
                    }
                    if (class65.field1176 != null) {
                        if (class65.field1176.field1306[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class65.field1176.field1306[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class15();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(IIIIIII)V")
    public class110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1909 = arg0;
        this.field1903 = arg3;
        this.field1906 = arg2;
        this.field1917 = arg1;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(III)V")
    public final void method713(int arg0, int arg1, int arg2) {
        ++field1916;
        if (arg1 <= 31) {
            method716((byte) 115);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)V")
    public final void method714(int arg0, int arg1, int arg2) {
        if (arg2 >= -101) {
            method712(-5, -52, (byte) -70, (class21) null, (Component) null);
        }
        ++field1908;
        int var4 = this.field1906 * arg0 >> 12;
        int var5 = this.field1909 * arg0 >> 12;
        int var6 = this.field1903 * arg1 >> 12;
        int var7 = this.field1917 * arg1 >> 12;
        class65.method481(var5, var6, super.field3681, var4, (byte) 120, super.field3675, var7, super.field3688);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
    public final void method715(int arg0, int arg1, int arg2) {
        ++field1905;
        int var4 = this.field1909 * arg2 >> 12;
        int var5 = this.field1917 * arg1 >> 12;
        if (arg0 != 1) {
            field1918 = null;
        }
        int var6 = this.field1906 * arg2 >> 12;
        int var7 = this.field1903 * arg1 >> 12;
        class180.method1196(var4, var6, var7, super.field3675, var5, -4838);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method716(byte arg0) {
        field1922 = null;
        field1918 = null;
        field1915 = null;
        field1904 = null;
        field1919 = null;
        field1902 = null;
        field1907 = null;
        field1910 = null;
        field1912 = null;
        field1911 = null;
        field1913 = null;
        field1921 = null;
        if (arg0 <= 44) {
            field1912 = null;
        }
    }
}
