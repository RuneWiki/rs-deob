import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class16 extends class281 {

    @OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
    public static int field246 = -1;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "I")
    public int field237;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "Laj;")
    public static class333 field241;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "Ljava/lang/String;")
    public String field236;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)J")
    public final long method117(int arg0) {
        ++field247;
        if (arg0 != 7) {
            this.method119(24);
        }
        return Long.MAX_VALUE & super.field4141;
    }

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)V")
    public final void method118(int arg0) {
        super.field4141 = 500L + class302.method1910(arg0 ^ arg0) | super.field4141 & Long.MIN_VALUE;
        ++field239;
        class695.field9727.method695(-103, this);
    }

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "(I)V")
    public final void method119(int arg0) {
        super.field4141 |= Long.MIN_VALUE;
        ++field238;
        if (this.method117(7) == 0L) {
            class124.field1798.method695(-125, this);
        }
        if (arg0 > -54) {
            this.method117(-24);
        }
    }

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "(I)I")
    public final int method120(int arg0) {
        if (arg0 != -3356) {
            return -72;
        } else {
            ++field240;
            return (int) (super.field1409 >>> 56 & 255L);
        }
    }

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "(I)J")
    public final long method121(int arg0) {
        ++field243;
        if (arg0 <= 64) {
            this.method119(-38);
        }
        return 72057594037927935L & super.field1409;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IJ)V")
    public class16(int arg0, long arg1) {
        super.field1409 = (long) arg0 << 56 | arg1;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)Z")
    public static final boolean method122(int arg0, int arg1) {
        ++field242;
        int var2 = 36 % ((76 - arg0) / 38);
        return ~arg1 == -4 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)V")
    public static void method123(byte arg0) {
        field241 = null;
        if (arg0 >= -47) {
            field241 = null;
        }
    }
}
