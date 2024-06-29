import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class231 {

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "J")
    public long field3302 = 0L;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lcc;")
    public static class327 field3307 = new class327(30);

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[Lch;")
    public static class8[] field3312 = new class8[4];

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field3299;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public int field3306;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public int field3310;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lvc;")
    public class260 field3305;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lvc;")
    public class260 field3309;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3301;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 10)
    public static void method1647(byte arg0) {
        field3307 = null;
        if (arg0 >= 8) {
            field3312 = null;
            field3301 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIII)Z", line = 25)
    public static final boolean method1648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3311++;
        if (arg1 + arg5 <= arg7 || arg7 + arg8 <= arg1) {
            return false;
        } else if (arg0 < (arg2 + arg4) && arg4 < (arg0 + arg3)) {
            int var9 = -13 / ((arg6 - 2) / 59);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I", line = 43)
    public static final int method1649(int arg0) {
        field3300++;
        return arg0 == 0 ? class193.field2671 : 39;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Z", line = 57)
    public static final boolean method1650(int arg0) {
        field3303++;
        if (arg0 != 0) {
            field3301 = (String[]) null;
        }
        try {
            return class265.method1824(arg0);
        } catch (IOException var5) {
            class359.method2494((byte) -18);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class154.field2147 + "," + class287.field4124 + "," + class314.field4618 + " - " + class315.field4648 + "," + (class359.field5616.field4842[0] + class331.field4867) + "," + (class355.field5556 + class359.field5616.field4936[0]) + " - ";
            for (int var4 = 0; class315.field4648 > var4 && var4 < 50; var4++) {
                var3 = var3 + class240.field3490.field4350[var4] + ",";
            }
            class347.method2409(var6, 3924, var3);
            class344.method2389(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIIII)I", line = 95)
    public static final int method1651(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 102) {
            method1649(45);
        }
        int var5 = arg3 & 0xF;
        field3298++;
        int var6 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg4) : arg1;
        int var7 = var5 < 8 ? arg2 : arg1;
        return ((var5 & 0x2) == 0 ? var6 : -var6) + ((var5 & 0x1) == 0 ? var7 : -var7);
    }
}
