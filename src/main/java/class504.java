import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class504 {

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Ldb;")
    public static class298 field6725 = new class298(56, 7);

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field6729 = 0;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "J")
    public long field6724;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Lrc;")
    public class504 field6722;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lrc;")
    public class504 field6723;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
    public static void method2795(byte arg0) {
        field6725 = null;
        if (arg0 != 99) {
            method2796(4, null, (byte) 85, 113);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILgba;BI)V")
    public static final void method2796(int arg0, class625 arg1, byte arg2, int arg3) {
        if (arg1.field8293 == 0) {
            arg1.field8317 = arg1.field8349;
        } else if (arg1.field8293 == 1) {
            arg1.field8317 = (arg0 - arg1.field8361) / 2 + arg1.field8349;
        } else if (arg1.field8293 == 2) {
            arg1.field8317 = arg0 - arg1.field8349 - arg1.field8361;
        } else if (arg1.field8293 == 3) {
            arg1.field8317 = arg1.field8349 * arg0 >> 14;
        } else if (arg1.field8293 == 4) {
            arg1.field8317 = (arg1.field8349 * arg0 >> 14) + (arg0 - arg1.field8361) / 2;
        } else {
            arg1.field8317 = arg0 - arg1.field8361 - (arg1.field8349 * arg0 >> 14);
        }
        field6728++;
        if (arg1.field8305 == 0) {
            arg1.field8312 = arg1.field8297;
        } else if (arg1.field8305 == 1) {
            arg1.field8312 = (arg3 - arg1.field8350) / 2 + arg1.field8297;
        } else if (arg1.field8305 == 2) {
            arg1.field8312 = arg3 - arg1.field8350 - arg1.field8297;
        } else if (arg1.field8305 == 3) {
            arg1.field8312 = arg1.field8297 * arg3 >> 14;
        } else if (arg1.field8305 == 4) {
            arg1.field8312 = (arg1.field8297 * arg3 >> 14) + (arg3 - arg1.field8350) / 2;
        } else {
            arg1.field8312 = arg3 - (arg1.field8297 * arg3 >> 14) - arg1.field8350;
        }
        if (class295.field4171 && (client.method1701(arg1).field725 != 0 || arg1.field8421 == 0)) {
            if (arg1.field8312 < 0) {
                arg1.field8312 = 0;
            } else if (arg3 < arg1.field8312 + arg1.field8350) {
                arg1.field8312 = arg3 - arg1.field8350;
            }
            if (arg1.field8317 < 0) {
                arg1.field8317 = 0;
            } else if ((arg1.field8361 + arg1.field8317) > arg0) {
                arg1.field8317 = arg0 - arg1.field8361;
            }
        }
        if (arg2 != -32) {
            method2796(106, null, (byte) -28, 85);
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
    public final void method2797(int arg0) {
        field6727++;
        if (this.field6723 == null) {
            return;
        }
        this.field6723.field6722 = this.field6722;
        int var2 = -69 / ((-arg0 - 34) / 63);
        this.field6722.field6723 = this.field6723;
        this.field6722 = null;
        this.field6723 = null;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)Z")
    public final boolean method2798(int arg0) {
        if (arg0 == -1) {
            field6726++;
            return this.field6723 != null;
        } else {
            return false;
        }
    }
}
