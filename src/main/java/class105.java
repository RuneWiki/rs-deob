import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class105 extends class259 {

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field1542 = 0;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "[Ljava/lang/String;")
    public static String[] field1556 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "Ljava/lang/String;")
    public static String field1552 = "Connecting to update server";

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field1554 = "Loading config - ";

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "I")
    public static int field1558 = 0;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "Lwi;")
    public static class192 field1555;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "Ljava/lang/String;")
    public String field1550;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)I")
    public final int method762(byte arg0) {
        if (arg0 != -31) {
            method770((class237) null, true);
        }
        ++field1557;
        return (int) (super.field2628 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public final void method763(boolean arg0) {
        ++field1544;
        if (arg0) {
            field1542 = -95;
        }
        super.field3978 |= Long.MIN_VALUE;
        if (this.method768(64) == 0L) {
            class173.field2528.method1315((byte) -48, this);
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
    public final void method764(byte arg0) {
        int var2 = 26 / ((-67 - arg0) / 41);
        super.field3978 = 500L + class257.method1736(14361) | super.field3978 & Long.MIN_VALUE;
        ++field1546;
        class130.field1908.method1315((byte) -48, this);
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
    public static void method765(int arg0) {
        field1555 = null;
        field1552 = null;
        field1556 = null;
        field1554 = null;
        if (arg0 != -31746) {
            method767(true, false, -113);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIILbg;Lbg;IIJ)V")
    public static final void method766(int arg0, int arg1, int arg2, int arg3, class264 arg4, class264 arg5, int arg6, int arg7, long arg8) {
        if (arg4 != null || arg5 != null) {
            class176 var10 = new class176();
            var10.field2583 = arg8;
            var10.field2573 = arg1 * 128 + 64;
            var10.field2588 = arg2 * 128 + 64;
            var10.field2590 = arg3;
            var10.field2575 = arg4;
            var10.field2580 = arg5;
            var10.field2589 = arg6;
            var10.field2582 = arg7;
            for (int var11 = arg0; var11 >= 0; --var11) {
                if (class3.field40[var11][arg1][arg2] == null) {
                    class3.field40[var11][arg1][arg2] = new class201(var11, arg1, arg2);
                }
            }
            class3.field40[arg0][arg1][arg2].field3024 = var10;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZZI)Ljava/lang/String;")
    public static final String method767(boolean arg0, boolean arg1, int arg2) {
        ++field1551;
        if (arg1 && arg2 >= 0) {
            if (arg0) {
                method771(false, (char) 65530);
            }
            return class111.method803((byte) 123, arg1, arg2, 10);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)J")
    public final long method768(int arg0) {
        if (arg0 != 64) {
            return 63L;
        } else {
            ++field1543;
            return super.field3978 & Long.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)I")
    public final int method769(int arg0) {
        ++field1541;
        if (arg0 != 0) {
            this.field1545 = 69;
        }
        return (int) super.field2628;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lpk;Z)V")
    public static final void method770(class237 arg0, boolean arg1) {
        if (arg1) {
            class1.field10 = arg0.method1621("runes", 1);
            ++field1547;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(II)V")
    public class105(int arg0, int arg1) {
        super.field2628 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZC)Z")
    public static final boolean method771(boolean arg0, char arg1) {
        ++field1548;
        if (arg0) {
            return false;
        } else {
            return arg1 >= '0' && ~arg1 >= -58;
        }
    }
}
