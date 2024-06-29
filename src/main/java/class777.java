import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class777 {

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field10680 = -1;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "Ljw;")
    public static class581 field10676 = new class581(6, -2);

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field10677;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field10679;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field10681;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field10682;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "Laj;")
    public static class333 field10678;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public static final void method4300(int arg0) {
        field10679++;
        class584.field7794 = false;
        class73.field1056 = null;
        class498.field6876 = null;
        class782.field10790 = null;
        if (arg0 != -201) {
            field10680 = 57;
        }
        class565.field7570 = null;
        class494.field6838 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method4301(int arg0, String arg1) {
        field10677++;
        if (arg1 == null) {
            return;
        }
        if (arg0 <= 119) {
            field10680 = -33;
        }
        if (!(class671.field9452 < 200 || class238.field3212) || class671.field9452 >= 200) {
            class780.method4307((byte) 102, class474.field6550.method2780(119, class38.field589), 4);
            return;
        }
        String var2 = class194.method1339(18123, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class671.field9452; var3++) {
            String var8 = class194.method1339(18123, class42.field653[var3]);
            if (var8 != null && var8.equals(var2)) {
                class780.method4307((byte) 115, arg1 + class474.field6577.method2780(102, class38.field589), 4);
                return;
            }
            if (class246.field3374[var3] != null) {
                String var9 = class194.method1339(18123, class246.field3374[var3]);
                if (var9 != null && var9.equals(var2)) {
                    class780.method4307((byte) 91, arg1 + class474.field6577.method2780(97, class38.field589), 4);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class5.field54; var4++) {
            String var6 = class194.method1339(18123, class255.field3798[var4]);
            if (var6 != null && var6.equals(var2)) {
                class780.method4307((byte) 90, class474.field6582.method2780(100, class38.field589) + arg1 + class474.field6583.method2780(125, class38.field589), 4);
                return;
            }
            if (class424.field6053[var4] != null) {
                String var7 = class194.method1339(18123, class424.field6053[var4]);
                if (var7 != null && var7.equals(var2)) {
                    class780.method4307((byte) 94, class474.field6582.method2780(97, class38.field589) + arg1 + class474.field6583.method2780(101, class38.field589), 4);
                    return;
                }
            }
        }
        if (class194.method1339(18123, class551.field7456.field1020).equals(var2)) {
            class780.method4307((byte) 76, class474.field6580.method2780(95, class38.field589), 4);
            return;
        }
        class487.field6740++;
        class267 var5 = class545.method3099((byte) 50, class269.field3966, class106.field1461);
        var5.field3938.method2380(65280, class469.method2769(arg1, (byte) 91));
        var5.field3938.method2349(77, arg1);
        class617.method3392(var5, true);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method4302(byte arg0) {
        field10682++;
        int var1 = 65 / ((74 - arg0) / 47);
        String var2 = "www";
        if (class739.field10203 == class731.field10141) {
            var2 = "www-wtrc";
        } else if (class731.field10141 == class469.field6504) {
            var2 = "www-wtqa";
        } else if (class731.field10141 == class165.field2232) {
            var2 = "www-wtwip";
        }
        String var3 = "";
        if (class251.field3720 != null) {
            var3 = "/p=" + class251.field3720;
        }
        return "http://" + var2 + "." + class21.field332.field4209 + ".com/l=" + class38.field589 + "/a=" + class444.field6231 + var3 + "/";
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
    public static void method4303(int arg0) {
        field10676 = null;
        field10678 = null;
        int var1 = -112 / ((arg0 - 7) / 53);
    }
}
