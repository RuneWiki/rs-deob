import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class26 extends class170 {

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field325 = 12;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "[I")
    public static int[] field326 = new int[500];

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field340 = 0;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Ljava/lang/String;")
    public String field332;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "Z")
    public static boolean field329;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)I")
    public final int method157(int arg0) {
        ++field327;
        return arg0 != -10495 ? 118 : (int) super.field4226;
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public final void method158(int arg0) {
        ++field333;
        super.field2411 |= Long.MIN_VALUE;
        if (arg0 != 28194) {
            this.method161(78);
        }
        if (~this.method163(10) == -1L) {
            class191.field2750.method145(this, false);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B[Lwn;)V")
    public static final void method159(byte arg0, class77[] arg1) {
        class66.field917 = arg1.length;
        ++field328;
        class406.field5627 = new class77[class66.field917 + 10];
        class160.field2277 = new int[class66.field917 + 10];
        class79.method641(arg1, 0, class406.field5627, 0, class66.field917);
        int var2 = 0;
        if (arg0 <= 49) {
            field335 = -89;
        }
        while (~class66.field917 < ~var2) {
            class160.field2277[var2] = class406.field5627[var2].method619();
            ++var2;
        }
        for (int var3 = class66.field917; ~class406.field5627.length < ~var3; ++var3) {
            class160.field2277[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public static void method160(int arg0) {
        field326 = null;
        if (arg0 > -13) {
            field326 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)I")
    public final int method161(int arg0) {
        ++field330;
        if (arg0 != 0) {
            field340 = 7;
        }
        return (int) (255L & super.field4226 >>> 32);
    }

    @OriginalMember(owner = "client!db", name = "i", descriptor = "(I)I")
    public static final int method162(int arg0) {
        ++field338;
        return arg0 != 12 ? -43 : 6;
    }

    @OriginalMember(owner = "client!db", name = "j", descriptor = "(I)J")
    public final long method163(int arg0) {
        if (arg0 != 10) {
            method162(112);
        }
        ++field334;
        return Long.MAX_VALUE & super.field2411;
    }

    @OriginalMember(owner = "client!db", name = "k", descriptor = "(I)V")
    public final void method164(int arg0) {
        super.field2411 = 500L + class199.method1372(30938) | super.field2411 & Long.MIN_VALUE;
        ++field331;
        if (arg0 != 12) {
            this.field341 = 126;
        }
        class334.field4527.method145(this, false);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(II)V")
    public class26(int arg0, int arg1) {
        super.field4226 = (long) arg0 << 32 | (long) arg1;
    }
}
