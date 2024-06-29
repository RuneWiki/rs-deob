import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class521 {

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public int field7303;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public int field7301;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "Lhm;")
    public static class223 field7308 = new class223(7, 2);

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "F")
    public static float field7309 = 0.0F;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public int field7299;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    public int field7305;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public int field7306;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "Lhv;")
    public class521 field7310;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "Lpda;")
    public class631 field7300;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static void method3025(int arg0) {
        field7308 = null;
        if (arg0 <= 101) {
            field7308 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(JJ)J")
    public static long method3026(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IB)Lhv;")
    public final class521 method3027(int arg0, byte arg1) {
        field7307++;
        int var3 = -77 / ((51 - arg1) / 58);
        return new class521(this.field7301, arg0);
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(IB)V")
    public static final void method3028(int arg0, byte arg1) {
        field7304++;
        if (arg1 == 109) {
            class37 var2 = class636.method3571(14, arg0, -115);
            var2.method230(-4);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)Lkt;")
    public final class160 method3029(byte arg0) {
        int var2 = 122 % ((17 - arg0) / 54);
        field7302++;
        return class409.method2286((byte) -88, this.field7301);
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(II)V")
    public class521(int arg0, int arg1) {
        this.field7303 = arg1;
        this.field7301 = arg0;
    }
}
