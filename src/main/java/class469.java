import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class469 extends class236 implements class463 {

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    private int field6771;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field6776;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)I")
    public final int method159(int arg0) {
        ++field6778;
        if (arg0 < 19) {
            method2830(-95);
        }
        return 0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB[B)V")
    public final void method153(int arg0, int arg1, byte arg2, byte[] arg3) {
        this.method1639(arg3, arg0);
        int var5 = -92 % ((-21 - arg2) / 41);
        ++field6780;
        this.field6771 = arg1;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lkd;I[BI)V")
    public class469(class188 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6771 = arg1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)Z")
    public static final boolean method2829(byte arg0, int arg1) {
        int var2 = 19 % ((arg0 - 56) / 62);
        ++field6772;
        if (~arg1 != -45 && arg1 != 9 && ~arg1 != -20 && ~arg1 != -17 && arg1 != 12) {
            return arg1 == 25 || ~arg1 == -1007;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)I")
    public final int method154(byte arg0) {
        int var2 = -20 / ((-19 - arg0) / 47);
        ++field6777;
        return this.field6771;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    public static void method2830(int arg0) {
        if (arg0 != -20) {
            field6773 = -31;
        }
        field6776 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
    public static final void method2831(int arg0, int arg1, int arg2) {
        ++field6774;
        class412 var3 = new class412(16);
        for (class433 var4 = (class433) class334.field4985.method2592(114); var4 != null; var4 = (class433) class334.field4985.method2589(-1)) {
            var4.method2677(arg2 + -52317);
            int var5 = (int) (var4.field6388 >> 28);
            int var6 = -arg0 + (int) (var4.field6388 >> 14 & 16383L);
            int var7 = (int) (var4.field6388 & 16383L) + -arg1;
            if (var7 >= 0 && ~var6 <= -1 && ~class69.field976 < ~var7 && var6 < class285.field4328) {
                var3.method2591((long) (var7 | var6 << 14 | var5 << 28), var4, (byte) 114);
            }
        }
        if (arg2 != 29826) {
            method2831(-30, 39, 19);
        }
        class334.field4985 = var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)J")
    public final long method157(int arg0) {
        int var2 = -8 / ((42 - arg0) / 43);
        ++field6779;
        return super.field3795.method2717();
    }
}
