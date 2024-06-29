import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class168 {

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field2548 = 0;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "Lin;")
    public static class380 field2553 = new class380(49, -1);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public int field2546;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "Leaa;")
    public static class395 field2547;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Lbr;")
    public static class564 field2552;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static void method1243(byte arg0) {
        if (arg0 != -118) {
            method1244(true, 75, -76);
        }
        field2547 = null;
        field2552 = null;
        field2553 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1244(boolean arg0, int arg1, int arg2) {
        field2551++;
        if (arg0) {
            field2548 = 6;
        }
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILol;)V")
    public final void method1245(int arg0, class431 arg1) {
        while (true) {
            int var3 = arg1.method2557(14929);
            if (var3 == 0) {
                if (arg0 != 1) {
                    field2548 = 106;
                }
                field2549++;
                return;
            }
            this.method1246(arg0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IILol;)V")
    private final void method1246(int arg0, int arg1, class431 arg2) {
        field2550++;
        if (arg0 == arg1) {
            this.field2546 = arg2.method2565((byte) -84);
            this.field2545 = arg2.method2557(14929);
            this.field2543 = arg2.method2557(14929);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIJZ)Ljava/lang/String;")
    public static final String method1247(int arg0, int arg1, long arg2, boolean arg3) {
        field2544++;
        Calendar var5;
        if (arg3) {
            class765.method4230(2, arg2);
            var5 = class99.field1438;
        } else {
            class724.method4017((byte) 126, arg2);
            var5 = class99.field1449;
        }
        int var6 = var5.get(5);
        int var7 = var5.get(2) + 1;
        int var8 = var5.get(1);
        int var9 = var5.get(11);
        if (arg1 == 10) {
            int var10 = var5.get(12);
            return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
        } else {
            return null;
        }
    }
}
