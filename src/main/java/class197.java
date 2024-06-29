import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class197 extends class242 {

    @OriginalMember(owner = "client!si", name = "S", descriptor = "Z")
    public static boolean field3442 = false;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "[Lp;")
    public static class280[] field3441 = new class280[500];

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "Lp;")
    public static class280 field3448 = class18.method140((byte) -120, ")2");

    @OriginalMember(owner = "client!si", name = "db", descriptor = "I")
    public static int field3453 = -1;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!si", name = "X", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
    private int field3451;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
    private int field3452;

    @OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!si", name = "fb", descriptor = "I")
    private int field3455;

    @OriginalMember(owner = "client!si", name = "gb", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class197() {
        this(0);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
    private class197(int arg0) {
        super(0, false);
        this.method1344(false, arg0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        ++field3444;
        if (arg0 > -119) {
            field3448 = null;
        }
        if (~arg1 == -1) {
            this.method1344(false, arg2.method230(15046));
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(ZI)V")
    private final void method1344(boolean arg0, int arg1) {
        this.field3452 = (arg1 & 65280) >> 4;
        ++field3454;
        if (!arg0) {
            this.field3455 = (255 & arg1) << 4;
            this.field3451 = arg1 >> 12 & 4080;
        }
    }

    @OriginalMember(owner = "client!si", name = "i", descriptor = "(I)V")
    public static void method1345(int arg0) {
        field3448 = null;
        field3441 = null;
        int var1 = -96 % ((arg0 - -7) / 55);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
    public static final void method1346(int arg0, byte arg1) {
        class266.field4673.method1478(arg0, 100);
        if (arg1 != 41) {
            method1346(91, (byte) 92);
        }
        ++field3446;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lp;ZI)V")
    public static final void method1347(class280 arg0, boolean arg1, int arg2) {
        ++class246.field4327;
        ++field3447;
        class34.field627.method551(204, true);
        class34.field627.method186(1693383072, arg2);
        if (!arg1) {
            class34.field627.method219(arg0.method1896(70), -87);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        if (!arg0) {
            this.method49(61, -106, (class25) null);
        }
        int[][] var3 = super.field4257.method917(arg1, 1);
        ++field3443;
        if (super.field4257.field2357) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class264.field4654; ++var7) {
                var4[var7] = this.field3451;
                var5[var7] = this.field3452;
                var6[var7] = this.field3455;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)Lhf;")
    public static final class136 method1348(byte arg0, int arg1) {
        ++field3450;
        class136 var2 = (class136) class24.field439.method1480((byte) 50, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 != 91) {
            return null;
        } else {
            byte[] var3 = class100.field1625.method1258(3, arg1, (byte) 102);
            class136 var4 = new class136();
            if (var3 != null) {
                var4.method933(new class25(var3), (byte) 85);
            }
            class24.field439.method1483((byte) -103, (long) arg1, var4);
            return var4;
        }
    }
}
