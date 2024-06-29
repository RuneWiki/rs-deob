import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class96 {

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Z")
    public static boolean field1306 = false;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field1309 = -1;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "B")
    public static byte field1305;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZLr;Loe;I)V")
    public static final void method733(int arg0, boolean arg1, class165 arg2, class183 arg3, int arg4) {
        field1310++;
        class356.field4756.method1131((byte) -109);
        if (class230.field2989 || !arg1) {
            return;
        }
        for (class9 var5 = (class9) arg3.method1132((byte) -122); var5 != null; var5 = (class9) arg3.method1134(8446)) {
            class289 var6 = class550.field7973.method3816(-116, var5.field90);
            if (class704.method3945(var6, -22236)) {
                boolean var7 = class634.method3622(arg0, (byte) 95, var6, arg2, var5, arg4);
                if (var7) {
                    class163.method1027(2, var5, arg2, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
    public static final void method734(int arg0) {
        class78.field1141 = 0;
        field1307++;
        class10.field100 = 0;
        class516.field7558 = 0;
        class692.field9848 = class454.field6392;
        if (arg0 < 45) {
            method734(-31);
        }
        class683.field9755 = new class568[1000];
        class133.field1693 = 0;
        class395.field5587 = new int[class663.field9391][class455.field6393 + 1][class302.field4057 + 1];
        class677.field9705 = new class568[500];
        class147.field1801 = new class568[500];
        class463.field6471 = false;
        class436.field6246 = new class568[2000];
        class214.field2718 = class454.field6392;
        if (class298.field4017 instanceof class18) {
            class186.field2276 = false;
        } else {
            class186.field2276 = true;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBI)V")
    public static final void method735(int arg0, byte arg1, int arg2) {
        field1308++;
        if (class588.field8518 == class356.field4753) {
            if (class674.method3833(0, -1, arg2, 0, -2, false, 1, arg0, 1)) {
                return;
            }
            class674.method3833(0, -1, arg2, 0, -3, false, 1, arg0, 1);
        } else if (class674.method3833(0, -1, arg2, 0, -3, false, 1, arg0, 1)) {
            return;
        } else {
            class674.method3833(0, -1, arg2, 0, -2, false, 1, arg0, 1);
        }
        if (arg1 >= -66) {
            field1306 = true;
        }
    }
}
