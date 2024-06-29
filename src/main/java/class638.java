import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class638 extends class334 {

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field8975 = 0;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "Lke;")
    public static class622 field8977 = new class622(120, 4);

    @OriginalMember(owner = "client!te", name = "F", descriptor = "B")
    public byte field8976;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public int field8972;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "Lrv;")
    public class120 field8971;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "Leh;")
    public static class378 field8978;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Lha;")
    public static class66 field8979;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I")
    public final int method2159(int arg0) {
        if (arg0 != 0) {
            field8979 = null;
        }
        ++field8973;
        return this.field8971 == null ? 0 : this.field8971.field1521 * 100 / (this.field8971.field1556.length + -this.field8976);
    }

    @OriginalMember(owner = "client!te", name = "h", descriptor = "(I)I")
    public static final int method3629(int arg0) {
        ++field8970;
        if (class463.field6612 == 1) {
            return class364.field5265;
        } else {
            if (arg0 != 19728) {
                method3631(-114);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(JJ)J")
    public static long method3630(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!te", name = "i", descriptor = "(I)V")
    public static void method3631(int arg0) {
        field8979 = null;
        field8977 = null;
        if (arg0 >= 64) {
            field8978 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)[B")
    public final byte[] method2160(int arg0) {
        ++field8974;
        if (arg0 != -879) {
            return null;
        } else if (!super.field4984 && ~(this.field8971.field1556.length + -this.field8976) >= ~this.field8971.field1521) {
            return this.field8971.field1556;
        } else {
            throw new RuntimeException();
        }
    }
}
