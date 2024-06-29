import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class77 extends class88 {

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field1305 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "[Lab;")
    public static class249[] field1309 = new class249[2048];

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Z")
    public static boolean field1310 = false;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "[[I")
    public static int[][] field1308;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static final void method543(int arg0) {
        int var1 = 0;
        if (arg0 < 125) {
            field1310 = false;
        }
        while (var1 < class289.field4761) {
            int var2 = class41.field619[var1];
            class123 var3 = class15.field300[var2];
            int var4 = class136.field2239.method1802((byte) 38);
            if ((var4 & 0x40) != 0) {
                var4 += class136.field2239.method1802((byte) -119) << 8;
            }
            class49.method320(115, var3, var4, var2);
            var1++;
        }
        field1311++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BIIII)V")
    public static final void method544(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class36 var5 = class136.method1013(10, arg2, (byte) -90);
        var5.method224(false);
        int var6 = -119 / ((42 - arg0) / 63);
        var5.field577 = arg1;
        field1307++;
        var5.field562 = arg3;
        var5.field560 = arg4;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Z")
    public static final boolean method545(int arg0) {
        field1304++;
        if (class147.field2425) {
            try {
                if ((Boolean) class288.method2005(class142.field2344.field1380, (byte) 100, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 1353054567) {
            field1309 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I")
    public static final int method546(int arg0, int arg1) {
        int var2 = -80 / ((arg1 - 50) / 33);
        field1306++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method547(byte arg0) {
        field1308 = null;
        field1309 = null;
        if (arg0 < 6) {
            field1308 = null;
        }
        field1305 = null;
    }
}
