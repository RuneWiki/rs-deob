import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class24 extends class317 {

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field307 = "red:";

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field301 = 0;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field308 = 0;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "Z")
    public static boolean field302 = false;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(BI)Z", line = 9)
    public static final boolean method139(byte arg0, int arg1) {
        field305++;
        int var2 = 74 % ((arg0 + 49) / 62);
        return arg1 >= 0 && arg1 < class36.field418.length ? class36.field418[arg1] : false;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)[I", line = 26)
    public final int[] method140(int arg0, int arg1) {
        field304++;
        if (arg0 != 542) {
            field307 = (String) null;
        }
        int[] var3 = this.field4847.method1387(arg1, (byte) -38);
        if (this.field4847.field2751) {
            int var4 = class51.field693[arg1];
            for (int var5 = 0; var5 < class326.field4933; var5++) {
                var3[var5] = this.method144(class99.field1360[var5], 81, var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLjava/lang/String;Lcg;)I", line = 61)
    public static final int method141(boolean arg0, String arg1, class316 arg2) {
        if (!arg0) {
            field300 = 57;
        }
        int var3 = arg2.field4777;
        field306++;
        byte[] var4 = class65.method440(arg1, 30);
        arg2.method2182(var4.length, 8874);
        arg2.field4777 += class128.field1760.method1480(arg2.field4798, var4.length, var4, false, 0, arg2.field4777);
        return arg2.field4777 - var3;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(B)V", line = 86)
    public static void method142(byte arg0) {
        if (arg0 == 50) {
            field307 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 100)
    public static final boolean method143(String arg0, int arg1) {
        field309++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 != -23038) {
            return true;
        }
        while (class64.field826 > var2) {
            if (arg0.equalsIgnoreCase(class231.field3269[var2])) {
                return true;
            }
            var2++;
        }
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 125)
    public class24() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(III)I", line = 129)
    private final int method144(int arg0, int arg1, int arg2) {
        if (arg1 < 41) {
            field302 = false;
        }
        field303++;
        int var4 = arg2 * 57 + arg0;
        int var5 = var4 ^ var4 << 1;
        return 4096 - (((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }
}
