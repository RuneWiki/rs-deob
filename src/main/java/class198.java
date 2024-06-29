import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class198 extends class35 {

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public int field2987 = 0;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public int field2983 = -1;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "Lct;")
    public static class285 field2975 = new class285(74, 8);

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "Z")
    public static boolean field2979 = false;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field2984 = 0;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "[Lnh;")
    public static class478[] field2985 = new class478[29];

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "J")
    public static long field2990 = -1L;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "Lsh;")
    public static class472 field2982 = new class472(1, 3);

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "Lsh;")
    public static class472 field2993 = new class472(68, 20);

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public int field2974;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public int field2986;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    public int field2991;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)V", line = 36)
    public static void method1346(int arg0) {
        field2982 = null;
        field2985 = null;
        if (arg0 >= -67) {
            field2979 = false;
        }
        field2993 = null;
        field2975 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 63)
    public static final void method1347(byte arg0) {
        if (arg0 != 106) {
            field2993 = null;
        }
        class250[] var1 = class96.field1390;
        synchronized (class96.field1390) {
            int var2 = 0;
            while (true) {
                if (var2 >= class96.field1390.length) {
                    break;
                }
                class96.field1390[var2] = new class250();
                class456.field6470[var2] = 0;
                var2++;
            }
        }
        field2981++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 86)
    public static final void method1348(String arg0, int arg1, int arg2) {
        field2992++;
        if (arg1 != -28225) {
            field2985 = null;
        }
        class186 var3 = class275.method1789(arg2, (byte) 123, 3);
        var3.method1285(0);
        var3.field2825 = arg0;
    }
}
