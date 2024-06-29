import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class194 {

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lui;")
    public static class194 field2868 = new class194(1);

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Lui;")
    public static class194 field2872 = new class194(2);

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Lui;")
    public static class194 field2873 = new class194(4);

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Lui;")
    public static class194 field2874 = new class194(1);

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lui;")
    public static class194 field2875 = new class194(2);

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Lui;")
    public static class194 field2876 = new class194(4);

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lui;")
    public static class194 field2877 = new class194(2);

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lui;")
    public static class194 field2878 = new class194(4);

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field2881 = -1;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Lbo;")
    public static class623 field2879;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Ljava/lang/Object;")
    public static Object field2880;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Z")
    public static final boolean method1312(int arg0, int arg1, int arg2) {
        field2867++;
        return arg1 != 9;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1313(int arg0) {
        int var1 = 111 / ((arg0 - 67) / 44);
        field2878 = null;
        field2868 = null;
        field2880 = null;
        field2874 = null;
        field2879 = null;
        field2877 = null;
        field2875 = null;
        field2873 = null;
        field2872 = null;
        field2876 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILvp;II)V")
    public static final void method1314(int arg0, class162 arg1, int arg2, int arg3) {
        if (arg2 != 5003) {
            field2880 = null;
        }
        if (class606.field9002) {
            class178 var4 = class247.field3553 == -1 ? null : class516.field7358.method1274(-119, class247.field3553);
            if (client.method1599(arg1).method3657(111) && (class364.field4945 & 0x20) != 0 && (var4 == null || arg1.method1156(var4.field2720, (byte) 124, class247.field3553) != var4.field2720)) {
                class335.method2049(arg1.field2456, class402.field5501, 0L, 127, true, 5, class217.field3182, false, arg1.field2434, arg1.field2415, class537.field8008 + " -> " + arg1.field2535);
                class46.field548++;
            }
        } else {
            for (int var5 = 9; var5 >= 5; var5--) {
                String var9 = class395.method2342(arg1, (byte) -78, var5);
                if (var9 != null) {
                    class27.field310++;
                    class335.method2049(arg1.field2456, class626.method3661(var5, arg1, (byte) -117), (long) (var5 + 1), 123, true, 1002, var9, false, arg1.field2434, arg1.field2415, arg1.field2535);
                }
            }
            String var6 = class379.method2263(32694, arg1);
            if (var6 != null) {
                class335.method2049(arg1.field2456, arg1.field2550, 0L, 126, true, 2, var6, false, arg1.field2434, arg1.field2415, arg1.field2535);
                class536.field7971++;
            }
            for (int var7 = 4; var7 >= 0; var7--) {
                String var8 = class395.method2342(arg1, (byte) 122, var7);
                if (var8 != null) {
                    class335.method2049(arg1.field2456, class626.method3661(var7, arg1, (byte) -124), (long) (var7 + 1), 126, true, 16, var8, false, arg1.field2434, arg1.field2415, arg1.field2535);
                    class27.field310++;
                }
            }
            if (client.method1599(arg1).method3653(arg2 ^ 0xB78E7D1D)) {
                class170.field2648++;
                if (arg1.field2478 == null) {
                    class335.method2049(arg1.field2456, -1, 0L, 126, true, 10, class111.field1581.method3408(arg2 ^ 0x13C0, class63.field795), false, arg1.field2434, arg1.field2415, "");
                } else {
                    class335.method2049(arg1.field2456, -1, 0L, 127, true, 10, arg1.field2478, false, arg1.field2434, arg1.field2415, "");
                }
            }
        }
        field2869++;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V")
    private class194(int arg0) {
        this.field2870 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2871++;
        throw new IllegalStateException();
    }
}
