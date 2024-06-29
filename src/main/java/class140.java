import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class140 {

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
    private int field1902;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "B")
    public byte field1899;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "Lwh;")
    public static class546 field1903 = new class546(16);

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "Ltt;")
    public static class338 field1907 = new class338(36, 0);

    @OriginalMember(owner = "client!mp", name = "w", descriptor = "Leba;")
    public static class550 field1909 = new class550(41, 3);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public int field1889;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public int field1893;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public int field1895;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Lmp;")
    public class140 field1891;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mp", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field1910;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method792(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIIIIIII)V", line = 6)
    public static final void method786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1900++;
        if (arg7 < 2 || !class60.method341(arg4, 0)) {
            return;
        }
        if (class651.field9139[arg4] == null) {
            client.method3860(class124.field1729[arg4], -1, arg5, arg1, arg2, arg9, arg8, arg0, arg6, arg3);
        } else {
            client.method3860(class651.field9139[arg4], -1, arg5, arg1, arg2, arg9, arg8, arg0, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)Lefa;", line = 26)
    public final class153 method787(byte arg0) {
        field1901++;
        return arg0 == -12 ? class35.method204((byte) -75, this.field1902) : null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BIII)Lmp;", line = 38)
    public final class140 method788(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = 20 % ((arg0 + 25) / 56);
        field1888++;
        return new class140(this.field1902, arg1, arg2, arg3, this.field1899);
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)V", line = 48)
    public static void method789(byte arg0) {
        if (arg0 <= 109) {
            method789((byte) 53);
        }
        field1909 = null;
        field1903 = null;
        field1907 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V", line = 67)
    public static final void method790(int arg0) {
        if (arg0 < 26) {
            method786(-52, 123, 98, 12, -6, -45, -8, -98, -9, 29);
        }
        if (class312.field4206.field5192) {
            client.field9616 = 96;
        } else {
            try {
                Method var1 = (field1910 == null ? (field1910 = method792("java.lang.Runtime")) : field1910).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        client.field9616 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field1890++;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIZ)I", line = 105)
    public static final int method791(int arg0, int arg1, int arg2, boolean arg3) {
        field1898++;
        class16 var4 = class351.method2078(0, arg3, arg1);
        if (var4 == null) {
            return -1;
        } else {
            int var5 = 5 % ((69 - arg2) / 37);
            return arg0 >= 0 && arg0 < var4.field213.length ? var4.field213[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(IIIIB)V", line = 135)
    public class140(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field1904 = arg2;
        this.field1902 = arg0;
        this.field1899 = arg4;
        this.field1894 = arg3;
        this.field1908 = arg1;
    }
}
