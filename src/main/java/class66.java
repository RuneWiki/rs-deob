import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class66 extends class103 {

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Z")
    public static boolean field1080 = true;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "J")
    public static long field1087 = 0L;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "Lda;")
    private static class275 field1084 = class255.method1672(101, "Loading)3)3)3");

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "Lda;")
    public static class275 field1089 = class255.method1672(123, "(Z");

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field1093 = 0;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "Lda;")
    public static class275 field1092 = field1084;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "Lda;")
    public static class275 field1090 = class255.method1672(104, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "Lfb;")
    public static class109 field1094;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "[Lrk;")
    public static class20[] field1082;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZIII)I")
    public static final int method447(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 49) {
            return -18;
        }
        field1091++;
        class248 var4 = (class248) class118.field2125.method1871(0, (long) arg2);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field4372.length; var6++) {
            if (var4.field4372[var6] >= 0 && class11.field159 > var4.field4372[var6]) {
                class245 var7 = class210.method1352(36, var4.field4372[var6]);
                if (var7.field4281 != null) {
                    class216 var8 = (class216) var7.field4281.method1871(0, (long) arg3);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field4365[var6] * var8.field3692;
                        } else {
                            var5 += var8.field3692;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
    public static void method448(int arg0) {
        field1092 = null;
        field1089 = null;
        if (arg0 == -10786) {
            field1084 = null;
            field1094 = null;
            field1082 = null;
            field1090 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIB)V")
    public static final void method449(int arg0, int arg1, byte arg2) {
        field1083++;
        int var3 = 38 % ((arg2 + 60) / 63);
        if (class65.field1070 != arg0) {
            class185.field3172 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class185.field3172[var4] = (var4 << 12) / arg0;
            }
            class65.field1070 = arg0;
            class108.field1882 = arg0 == 64 ? 2048 : 4096;
            class1.field11 = arg0 - 1;
        }
        if (class16.field242 == arg1) {
            return;
        }
        if (class65.field1070 == arg1) {
            class91.field1552 = class185.field3172;
        } else {
            class91.field1552 = new int[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                class91.field1552[var5] = (var5 << 12) / arg1;
            }
        }
        class16.field242 = arg1;
        class277.field4837 = arg1 - 1;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(II)V")
    public class66(int arg0, int arg1) {
        this.field1081 = arg0;
        this.field1088 = arg1;
    }
}
