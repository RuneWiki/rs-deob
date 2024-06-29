import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class184 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field3372 = 0;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field3381 = 0;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3379 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Lsf;")
    public static class108 field3386 = class140.method973(255, "Hidden)2");

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "Lsf;")
    private static class108 field3389 = class140.method973(255, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field3387 = 0;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Lsf;")
    public static class108 field3385 = class140.method973(255, ": ");

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Lsf;")
    public static class108 field3390 = field3389;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "J")
    public long field3375;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lmc;")
    public class184 field3373;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lmc;")
    public class184 field3376;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Lik;")
    public static class262 field3374;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lrg;")
    public static class96 field3383;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "[La;")
    public static class278[] field3388;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V", line = 12)
    public static final void method1324(int arg0, int arg1) {
        field3378++;
        if (arg1 == 0) {
            class120 var2 = class248.method1704(1, 105, arg0);
            var2.method843((byte) 28);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 31)
    public final void method1325(int arg0) {
        field3370++;
        if (this.field3376 == null) {
            return;
        }
        this.field3376.field3373 = this.field3373;
        this.field3373.field3376 = this.field3376;
        this.field3376 = null;
        this.field3373 = null;
        if (arg0 != 0) {
            method1329(20, -86);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)Z", line = 49)
    public final boolean method1326(boolean arg0) {
        field3380++;
        if (!arg0) {
            this.method1325(87);
        }
        return this.field3376 != null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLik;)V", line = 67)
    public static final void method1327(byte arg0, class262 arg1) {
        class154.field2767 = arg1.method1887(-1, class210.field3749);
        if (arg0 >= -85) {
            field3384 = -88;
        }
        field3371++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 78)
    public static void method1328(byte arg0) {
        field3388 = null;
        field3383 = null;
        field3386 = null;
        field3390 = null;
        int var1 = -124 / ((arg0 - 14) / 35);
        field3379 = null;
        field3374 = null;
        field3389 = null;
        field3385 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)V", line = 109)
    public static final void method1329(int arg0, int arg1) {
        field3377++;
        class223.field3945.method637(arg0, 111);
        class157.field2829.method637(arg0, 126);
        class176.field3200.method637(arg0, 120);
        class151.field2732.method637(arg0, 121);
        int var2 = -20 / ((-arg1 - 37) / 49);
    }
}
