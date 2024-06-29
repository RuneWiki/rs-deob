import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class31 extends class203 {

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public int field423 = 0;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "Lmh;")
    public static class62 field425 = class201.method1405(true, "blaugr-Un:");

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "[J")
    public static long[] field429 = new long[32];

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "Z")
    public static boolean field427 = false;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V", line = 5)
    public static final void method201(int arg0, int arg1) {
        field428++;
        if (arg0 != -22019) {
            field425 = (class62) null;
        }
        class184.field2941.method1390(arg1, -113);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lmi;BI)V", line = 18)
    private final void method202(class92 arg0, byte arg1, int arg2) {
        if (arg2 == 2) {
            this.field423 = arg0.method721(35);
        }
        if (arg1 >= -98) {
            field425 = (class62) null;
        }
        field420++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZIZZ)Lhi;", line = 36)
    public static final class26 method203(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg0 != 1000000) {
            return (class26) null;
        }
        field424++;
        class177 var5 = null;
        if (class36.field499 != null) {
            var5 = new class177(arg2, class36.field499, class107.field1732[arg2], 1000000);
        }
        class170.field2765[arg2] = class274.field4652.method1056(arg2, var5, class4.field44, (byte) 0);
        if (arg1) {
            class170.field2765[arg2].method878(2037);
        }
        return new class26(class170.field2765[arg2], arg4, arg3);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[IJ)Lmh;", line = 68)
    public static final class62 method204(int arg0, int arg1, int[] arg2, long arg3) {
        if (arg0 < 54) {
            method203(58, false, 45, true, true);
        }
        field426++;
        if (class297.field5075 != null) {
            class62 var5 = class297.field5075.method267(arg2, (byte) 86, arg1, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        return arg1 == 5 ? class170.method1227(0, arg3).method419(28768) : class246.method1718(10, arg3);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLmi;)V", line = 94)
    public final void method205(byte arg0, class92 arg1) {
        if (arg0 <= 45) {
            method203(-30, false, -67, false, true);
        }
        field419++;
        while (true) {
            int var3 = arg1.method702(-1);
            if (var3 == 0) {
                return;
            }
            this.method202(arg1, (byte) -121, var3);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)Ldf;", line = 117)
    public static final class258 method206(int arg0, boolean arg1) {
        field421++;
        class258 var2 = (class258) class4.field46.method263(2013, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class45.field680.method157(arg0, 1, (byte) 19);
        } else {
            var3 = class259.field4368.method157(arg0 & 0x7FFF, 1, (byte) 19);
        }
        class258 var4 = new class258();
        if (var3 != null) {
            var4.method1792(1, new class92(var3));
        }
        if (arg0 >= 32768) {
            var4.method1796((byte) -122);
        }
        class4.field46.method257(arg1, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(B)V", line = 172)
    public static void method207(byte arg0) {
        if (arg0 <= 108) {
            field425 = (class62) null;
        }
        field429 = null;
        field425 = null;
    }
}
