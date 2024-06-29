import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class657 {

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public int field9150 = -1;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lla;")
    public static class455 field9147 = class71.method636(true);

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "[I")
    public static int[] field9156 = new int[2];

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
    public static int[] field9155 = new int[2048];

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lpc;")
    public class672 field9146;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "[B")
    public static byte[] field9154;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
    public int[] field9149;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field9151;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)I")
    public static final int method3703(int arg0, boolean arg1) {
        if (arg0 <= 117) {
            method3705(-61);
        }
        field9148++;
        int var2 = class259.field3281;
        if (var2 == 0) {
            return arg1 ? 0 : class480.field6536;
        } else if (var2 == 1) {
            return class480.field6536;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;II)Z")
    public static final boolean method3704(String arg0, int arg1, int arg2) {
        field9153++;
        if (class162.field2227.field6256) {
            class292.field3842 = new class134();
            class292.field3842.field1929 = arg1;
            class292.field3842.field1938 = arg0;
            if (class7.field75 != class225.field2991) {
                class292.field3842.field1927 = class292.field3842.field1929 + 50000;
                class292.field3842.field1933 = class292.field3842.field1929 + 40000;
            }
            for (int var3 = 0; var3 < class411.field5232.length; var3++) {
                if (class411.field5232[var3].field1979 == arg1) {
                    class555.field7732 = class411.field5232[var3].field2102;
                }
            }
            return true;
        }
        String var4 = "";
        if (arg2 != -8755) {
            return false;
        }
        if (class7.field75 != class225.field2991) {
            var4 = ":" + (arg1 + 7000);
        }
        String var5 = "";
        if (class722.field10043 != null) {
            var5 = "/p=" + class722.field10043;
        }
        String var6 = "http://" + arg0 + var4 + "/l=" + class243.field3143 + "/a=" + class313.field4096 + var5 + "/j" + (class760.field10602 ? "1" : "0") + ",o" + (class91.field1252 ? "1" : "0") + ",a2";
        try {
            class654.field9104.getAppletContext().showDocument(new URL(var6), "_self");
            return true;
        } catch (Exception var7) {
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method3705(int arg0) {
        field9155 = null;
        field9156 = null;
        field9147 = null;
        field9154 = null;
        if (arg0 != 0) {
            field9156 = null;
        }
    }
}
