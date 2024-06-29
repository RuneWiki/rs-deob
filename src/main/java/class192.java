import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class192 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2756 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2761 = 2;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[B")
    public static byte[] field2762 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field2760;

    static {
        new class362((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 14)
    public static void method1300(byte arg0) {
        field2762 = null;
        if (arg0 == 103) {
            field2756 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)I", line = 25)
    public static final int method1301(byte arg0, int arg1) {
        if (arg0 == -116) {
            field2759++;
            return arg1 >>> 7;
        } else {
            return -3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIBIII)V", line = 39)
    public static final void method1302(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2760++;
        int var8 = arg0 + arg5;
        int var9 = arg6 - arg5;
        for (int var10 = arg0; var10 < var8; var10++) {
            class296.method1954(arg2, arg3, class291.field4067[var10], arg7, -1);
        }
        int var11 = arg6;
        int var12 = 24 / ((66 - arg4) / 51);
        while (var11 > var9) {
            class296.method1954(arg2, arg3, class291.field4067[var11], arg7, -1);
            var11--;
        }
        int var13 = arg3 - arg5;
        int var14 = arg5 + arg7;
        for (int var15 = var8; var15 <= var9; var15++) {
            int[] var16 = class291.field4067[var15];
            class296.method1954(arg2, var14, var16, arg7, -1);
            class296.method1954(arg1, var13, var16, var14, -1);
            class296.method1954(arg2, arg3, var16, var13, -1);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V", line = 84)
    public static final void method1303(byte arg0) {
        class237 var1 = class141.field1742;
        synchronized (class141.field1742) {
            class141.field1742.method1618(0);
        }
        field2755++;
        if (arg0 != 4) {
            method1301((byte) 42, -36);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(BI)V", line = 100)
    public static final void method1304(byte arg0, int arg1) {
        class255.field3677 = new class237(arg1);
        if (arg0 != 4) {
            field2762 = null;
        }
        field2757++;
    }
}
