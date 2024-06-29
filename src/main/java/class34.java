import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class34 {

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field666 = 0;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "[Lat;")
    public static class255[] field668 = new class255[32768];

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Lgs;")
    public class34 field667;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "Lgs;")
    public class34 field670;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public static void method358(int arg0) {
        if (arg0 != 9293) {
            method358(93);
        }
        field668 = null;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
    public static final void method359(int arg0) {
        class106.field1773.method1753(5, arg0 ^ 0xFA);
        field669++;
        class43.field831.method2259(1, 5);
        class217.field3125.method558((byte) 92, 5);
        if (arg0 != 50) {
            method361(97, null);
        }
        class319.field4807.method2871(5, (byte) 91);
        class61.field1070.method499(arg0 + 66, 5);
        class367.field5550.method1322(5, -14665);
        class431.field6419.method1132(5, true);
        class140.field2233.method2251(5, 30);
        class419.field6271.method1391(5, (byte) 105);
        class255.field3670.method2069(5, (byte) -39);
        class203.field2969.method1238(30163, 5);
        class160.field2479.method1816(5, (byte) -92);
        class397.field5996.method1190(5, -94);
        class162.field2506.method596(64, 5);
        class495.field7314.method978(5, 1);
        class519.field7721.method1994(5, -119);
        class2.field93.method1537(5, (byte) 103);
        class511.field7544.method2027(-3968, 5);
        class500.field7377.method1435(5, 0);
        class365.field5521.method1442(5, -14329);
        class13.method85(5, (byte) 80);
        class372.method2321((byte) 107, 50);
        class362.method2274(true, 5);
        class232.method1530(2, 5);
        class226.field3221.method493(false, 5);
        class268.field3851.method493(false, 5);
        class471.field7071.method493(false, 5);
        class171.field2647.method493(false, 5);
        class437.field6541.method493(false, 5);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
    public final void method360(boolean arg0) {
        field663++;
        if (this.field667 == null) {
            return;
        }
        if (!arg0) {
            method359(-76);
        }
        this.field667.field670 = this.field670;
        this.field670.field667 = this.field667;
        this.field670 = null;
        this.field667 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method361(int arg0, String[] arg1) {
        field664++;
        String[] var2 = new String[5];
        for (int var3 = arg0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }
}
