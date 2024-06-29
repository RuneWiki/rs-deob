import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class211 {

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field2980 = 0;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Z")
    public static boolean field2978 = false;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field2987 = 0;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "[Z")
    public static boolean[] field2985 = new boolean[100];

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1445(int arg0) {
        if (arg0 != 0) {
            field2980 = 39;
        }
        field2982++;
        class221.method1522(false, -1);
        System.gc();
        class97.method587(arg0 ^ 0xFFFFC35B, 25);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)I", line = 30)
    public static final int method1446(byte arg0, int arg1) {
        if (arg0 != -69) {
            method1446((byte) 5, 104);
        }
        field2986++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)I", line = 44)
    public static final int method1447(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field2983++;
        if (var4 == 0) {
            return arg2;
        }
        if (arg0 != 3146) {
            method1445(44);
        }
        if (var4 == 1) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 68)
    public static void method1448(int arg0) {
        if (arg0 == 1023) {
            field2985 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 88)
    public static final void method1449(byte arg0) {
        field2984++;
        int var1 = 0;
        int[] var2 = new int[class342.field5316];
        for (int var3 = 0; var3 < class342.field5316; var3++) {
            class93 var4 = class60.method353(var3, (byte) -81);
            if (var4.field1177 >= 0 || var4.field1217 >= 0) {
                var2[var1++] = var3;
            }
        }
        class318.field4878 = new int[var1];
        for (int var5 = 0; var5 < var1; var5++) {
            class318.field4878[var5] = var2[var5];
        }
        int var6 = 1 / ((24 - arg0) / 58);
    }
}
