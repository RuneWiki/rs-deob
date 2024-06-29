import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class256 extends class339 {

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public int field3354;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "Ljava/lang/String;")
    public String field3352;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "[J")
    public static long[] field3357;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
    public static void method1545(byte arg0) {
        field3357 = null;
        if (arg0 != -105) {
            field3357 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V")
    public final void method1546(byte arg0) {
        ++field3355;
        super.field4564 = Long.MIN_VALUE & super.field4564 | class529.method2982((byte) -69) - -500L;
        int var2 = -9 / ((48 - arg0) / 62);
        class516.field7172.method879((byte) -79, this);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)I")
    public final int method1547(int arg0) {
        if (arg0 != 14380) {
            return 101;
        } else {
            ++field3356;
            return (int) super.field545;
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(B)J")
    public final long method1548(byte arg0) {
        if (arg0 != -102) {
            field3357 = null;
        }
        ++field3353;
        return super.field4564 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
    public final void method1549(int arg0) {
        if (arg0 != -32042) {
            method1545((byte) -94);
        }
        ++field3351;
        super.field4564 |= Long.MIN_VALUE;
        if (this.method1548((byte) -102) == 0L) {
            class53.field693.method879((byte) -100, this);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)I")
    public final int method1550(boolean arg0) {
        if (!arg0) {
            this.method1546((byte) 82);
        }
        ++field3360;
        return (int) (255L & super.field545 >>> 32);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(II)V")
    public class256(int arg0, int arg1) {
        super.field545 = (long) arg0 << 32 | (long) arg1;
    }
}
