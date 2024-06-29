import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class338 extends class271 {

    @OriginalMember(owner = "client!np", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field4750 = new String[100];

    @OriginalMember(owner = "client!np", name = "I", descriptor = "Lso;")
    public static class327 field4753 = new class327(2, 15);

    @OriginalMember(owner = "client!np", name = "N", descriptor = "Lki;")
    public static class498 field4758 = new class498(3, 3);

    @OriginalMember(owner = "client!np", name = "P", descriptor = "I")
    public static int field4760 = 0;

    @OriginalMember(owner = "client!np", name = "O", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4759 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!np", name = "B", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!np", name = "C", descriptor = "I")
    public int field4748;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public int field4751;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!np", name = "J", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!np", name = "K", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!np", name = "L", descriptor = "I")
    public int field4756;

    @OriginalMember(owner = "client!np", name = "M", descriptor = "Ljava/lang/String;")
    public String field4757;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public static void method2051(int arg0) {
        field4753 = null;
        field4758 = null;
        field4759 = null;
        if (arg0 != 255) {
            method2051(123);
        }
        field4750 = null;
    }

    @OriginalMember(owner = "client!np", name = "f", descriptor = "(I)V")
    public final void method2052(int arg0) {
        if (arg0 == 100) {
            ++field4749;
            super.field3936 = 500L + class256.method1708((byte) 118) | super.field3936 & Long.MIN_VALUE;
            class225.field3302.method518(0, this);
        }
    }

    @OriginalMember(owner = "client!np", name = "g", descriptor = "(I)V")
    public final void method2053(int arg0) {
        ++field4752;
        super.field3936 |= Long.MIN_VALUE;
        if (arg0 > -69) {
            this.method2053(-114);
        }
        if (~this.method2056(true) == -1L) {
            class94.field1399.method518(0, this);
        }
    }

    @OriginalMember(owner = "client!np", name = "h", descriptor = "(I)I")
    public final int method2054(int arg0) {
        ++field4755;
        return arg0 != 0 ? -128 : (int) super.field4736;
    }

    @OriginalMember(owner = "client!np", name = "i", descriptor = "(I)I")
    public final int method2055(int arg0) {
        if (arg0 != 8332) {
            this.method2053(-126);
        }
        ++field4747;
        return (int) (255L & super.field4736 >>> 32);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)J")
    public final long method2056(boolean arg0) {
        if (!arg0) {
            this.field4748 = -49;
        }
        ++field4754;
        return Long.MAX_VALUE & super.field3936;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(II)V")
    public class338(int arg0, int arg1) {
        super.field4736 = (long) arg1 | (long) arg0 << 32;
    }
}
