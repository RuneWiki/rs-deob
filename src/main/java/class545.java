import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class545 extends class472 implements class544 {

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
    private int field8144;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
    public static int field8145 = 0;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "[I")
    public static int[] field8143 = new int[1];

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "Lha;")
    public static class53 field8140;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)J")
    public final long method3314(byte arg0) {
        ++field8142;
        if (arg0 != -38) {
            this.method3312((byte[]) null, (byte) 70, -119, -55);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lte;ILjaclib/memory/Buffer;IZ)V")
    public class545(class527 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field8144 = arg1;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method3316(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class115.field1626 = arg0;
        class96.field1409 = 1 << class115.field1626;
        class402.field5500 = class96.field1409 >> 1;
        class101.field1469 = (int) Math.sqrt((double) (class402.field5500 * class402.field5500 + class402.field5500 * class402.field5500));
        class536.field7978 = class96.field1409 >> 2;
        class595.field8800 = class96.field1409;
        class145.field2083 = arg2;
        class384.field5282 = arg3;
        class504.field7141 = arg4;
        class72.field988 = new class205[arg1][class145.field2083][class384.field5282];
        class207.field3077 = new class176[arg1];
        if (arg5) {
            class188.field2797 = new int[class145.field2083][class384.field5282];
            class557.field8282 = new byte[class145.field2083][class384.field5282];
            class188.field2803 = new short[class145.field2083][class384.field5282];
            class297.field4081 = new class205[1][class145.field2083][class384.field5282];
            class114.field1609 = new class176[1];
        } else {
            class188.field2797 = null;
            class557.field8282 = null;
            class188.field2803 = null;
            class297.field4081 = null;
            class114.field1609 = null;
        }
        if (arg6) {
            class22.field219 = new long[arg1][arg2][arg3];
            class148.field2163 = new class420[65535];
            class79.field1064 = new boolean[65535];
            class495.field7041 = 0;
        } else {
            class22.field219 = null;
            class148.field2163 = null;
            class79.field1064 = null;
            class495.field7041 = 0;
        }
        class626.method3663(false);
        class393.field5407 = new class521[1000];
        class441.field5889 = 0;
        class444.field6048 = new class521[1000];
        class466.field6568 = 0;
        class104.field1510 = new int[arg1][class145.field2083 + 1][class384.field5282 + 1];
        class583.field8562 = new class577[5000];
        class635.field9298 = 0;
        class222.field3230 = new boolean[class504.field7141 + class504.field7141 + 1][class504.field7141 + class504.field7141 + 1];
        class25.field245 = new boolean[class504.field7141 + class504.field7141 + 2][class504.field7141 + class504.field7141 + 2];
        class451.field6356 = null;
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(B)I")
    public final int method3315(byte arg0) {
        if (arg0 > -71) {
            return -51;
        } else {
            ++field8147;
            return this.field8144;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BII)Lvba;")
    public static final class37 method3317(byte arg0, int arg1, int arg2) {
        if (arg0 > -12) {
            field8143 = null;
        }
        ++field8141;
        class37 var3 = new class37();
        var3.field436 = arg1 + 1 + 5;
        var3.field458 = -1;
        var3.field435 = -1;
        var3.field447 = arg2 + 6;
        var3.field439 = new int[var3.field436][var3.field447];
        var3.method231(-3995);
        return var3;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)I")
    public final int method3313(byte arg0) {
        if (arg0 <= 15) {
            field8140 = null;
        }
        ++field8149;
        return super.field6665;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "([BBII)V")
    public final void method3312(byte[] arg0, byte arg1, int arg2, int arg3) {
        ++field8146;
        int var5 = -19 % ((arg1 - 22) / 36);
        this.method2842(arg0, true, arg3);
        this.field8144 = arg2;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
    public final void method1556(int arg0) {
        ++field8148;
        super.field6663.method3181(this, 34962);
        if (arg0 >= -35) {
            field8140 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "(B)V")
    public static void method3318(byte arg0) {
        field8143 = null;
        field8140 = null;
        if (arg0 <= 86) {
            method3318((byte) -53);
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lte;I[BIZ)V")
    public class545(class527 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field8144 = arg1;
    }
}
