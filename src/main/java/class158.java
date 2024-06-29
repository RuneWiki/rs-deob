import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class158 extends class147 {

    @OriginalMember(owner = "client!ws", name = "C", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!ws", name = "B", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "Z")
    public boolean field1878;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "J")
    public long field1883;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "Z")
    public boolean field1879;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
    public int field1881;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "Ljava/lang/String;")
    public String field1874;

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
    public int field1889;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "Ljava/lang/String;")
    public String field1885;

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
    public int field1884;

    @OriginalMember(owner = "client!ws", name = "A", descriptor = "I")
    public static int field1886 = -1;

    @OriginalMember(owner = "client!ws", name = "F", descriptor = "Lud;")
    public static class2 field1891 = new class2("WIP", 2);

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ws", name = "E", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
    public static int field1892;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ws", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field1893;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
    public static final void method761(int arg0) {
        if (arg0 != 16882) {
            method764(13, -36, 10);
        }
        field1890++;
        if (class355.field5092 == 2) {
            class275.field3918 = 96;
            return;
        }
        try {
            Method var1 = (field1893 == null ? (field1893 = method765("java.lang.Runtime")) : field1893).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class275.field3918 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)V")
    public static final void method762(int arg0) {
        if (arg0 != -7090) {
            return;
        }
        field1875++;
        if (class231.field3206 < 0) {
            return;
        }
        long var1 = class434.method2591(arg0 - 12220);
        class231.field3206 = (int) ((long) class231.field3206 - (var1 - class186.field2444));
        if (class231.field3206 <= 0) {
            class231.field3206 = -1;
            class71.field869 = class93.field1153.field1911;
            class458.field6449 = class93.field1153.field1923;
            class88.field1098 = class93.field1153.field1927;
            class180.field2275 = class93.field1153.field1919;
            class484.field6869 = class93.field1153.field1912;
            class234.field3249 = class93.field1153.field1922;
            class397.field5643 = class93.field1153.field1924;
            class324.field4682 = class93.field1153.field1916;
            class121.field1507 = class93.field1153.field1913;
            class27.field361 = class93.field1153.field1920;
        } else {
            int var3 = (class231.field3206 << 8) / class215.field2966;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            class234.field3249 = ((class415.field5969 & 0xFF00) * var3 + (class93.field1153.field1922 & 0xFF00) * var4 & 0xFF0000) + ((class415.field5969 & 0xFF00FF) * var3 + (class93.field1153.field1922 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            float var6 = 1.0F - var5;
            class397.field5643 = (class93.field1153.field1924 - class403.field5736) * var6 + class403.field5736;
            class71.field869 = (class93.field1153.field1911 - class381.field5406) * var6 + class381.field5406;
            class180.field2275 = class184.field2402 * var3 + class93.field1153.field1919 * var4 >> 8;
            class324.field4682 = (class93.field1153.field1916 - class421.field6075) * var6 + class421.field6075;
            class88.field1098 = ((class427.field6146 & 0xFF00) * var3 + (class93.field1153.field1927 & 0xFF00) * var4 & 0xFF0000) + ((class427.field6146 & 0xFF00FF) * var3 + (class93.field1153.field1927 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            class458.field6449 = (class93.field1153.field1923 - class283.field4118) * var6 + class283.field4118;
            class121.field1507 = (class93.field1153.field1913 - class450.field6374) * var6 + class450.field6374;
            class484.field6869 = (class93.field1153.field1912 - class185.field2442) * var6 + class185.field2442;
            if (class110.field1347 != class93.field1153.field1920) {
                class27.field361 = class274.field3912.method1385(class110.field1347, class93.field1153.field1920, var6, class27.field361);
            }
        }
        class186.field2444 = var1;
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(I)V")
    public static void method763(int arg0) {
        if (arg0 == 2) {
            field1891 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)I")
    public static final int method764(int arg0, int arg1, int arg2) {
        field1876++;
        if (arg0 != -102789817) {
            method761(31);
        }
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class158(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field1888 = arg2;
        this.field1887 = arg4;
        this.field1878 = arg8;
        this.field1883 = arg5;
        this.field1879 = arg9;
        this.field1881 = arg7;
        this.field1874 = arg1;
        this.field1889 = arg3;
        this.field1885 = arg0;
        this.field1884 = arg6;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method765(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
