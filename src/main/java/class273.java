import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class273 extends class339 {

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "[B")
    public byte[] field3638;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "[[I")
    public static int[][] field3633 = new int[6][];

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "Ltt;")
    public static class338 field3636 = new class338(72, 3);

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Lch;")
    public static class216 field3635;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILnu;)I", line = 3)
    public static final int method1644(int arg0, class351 arg1) {
        field3632++;
        if (arg0 != 13600) {
            return 54;
        }
        class384 var2 = arg1.field4671;
        if (var2.field5121 != null) {
            var2 = var2.method2203(3, class564.field7696);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field5087;
        class266 var4 = arg1.method1432(-1);
        if (arg1.field3021) {
            var3 = var2.field5131;
        } else if (arg1.field3067 == var4.field3451 || arg1.field3067 == var4.field3454 || arg1.field3067 == var4.field3449 || arg1.field3067 == var4.field3460) {
            var3 = var2.field5098;
        } else if (arg1.field3067 == var4.field3442 || arg1.field3067 == var4.field3470 || arg1.field3067 == var4.field3487 || arg1.field3067 == var4.field3483) {
            var3 = var2.field5104;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V", line = 41)
    public static void method1645(byte arg0) {
        field3633 = null;
        field3636 = null;
        field3635 = null;
        if (arg0 >= -58) {
            method1646(true, (byte) 12, true, -121, -23);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZBZII)I", line = 60)
    public static final int method1646(boolean arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field3637++;
        class16 var5 = class351.method2078(0, arg2, arg4);
        if (var5 == null) {
            return 0;
        } else if (arg1 > -8) {
            return 0;
        } else {
            int var6 = 0;
            for (int var7 = 0; var7 < var5.field213.length; var7++) {
                if (var5.field213[var7] >= 0 && class87.field1058.field2902 > var5.field213[var7]) {
                    class584 var8 = class87.field1058.method1394(-66, var5.field213[var7]);
                    int var9 = var8.method3223(arg3, class15.field198.method3462((byte) -79, arg3).field1521, (byte) 112);
                    if (arg0) {
                        var6 += var5.field212[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBLni;II)V", line = 100)
    public static final void method1647(int arg0, byte arg1, class685 arg2, int arg3, int arg4) {
        field3634++;
        long var5 = (long) (arg0 << 14 | arg4 << 28 | arg3);
        class543 var7 = (class543) class290.field3835.method3057(1, var5);
        if (var7 == null) {
            class543 var8 = new class543();
            class290.field3835.method3061(127, var5, var8);
            var8.field7435.method2507(arg2, (byte) -125);
            return;
        }
        class584 var9 = class87.field1058.method1394(-61, arg2.field9690);
        int var10 = var9.field8043;
        if (var9.field8034 == 1) {
            var10 = (arg2.field9691 + 1) * var10;
        }
        if (arg1 != 27) {
            method1646(true, (byte) 30, true, -34, -22);
        }
        for (class685 var11 = (class685) var7.field7435.method2506(68); var11 != null; var11 = (class685) var7.field7435.method2505(-120)) {
            class584 var12 = class87.field1058.method1394(arg1 ^ 0xFFFFFFB0, var11.field9690);
            int var13 = var12.field8043;
            if (var12.field8034 == 1) {
                var13 = (var11.field9691 + 1) * var13;
            }
            if (var10 > var13) {
                class358.method2103(arg2, 13600, var11);
                return;
            }
        }
        var7.field7435.method2507(arg2, (byte) -121);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "([B)V", line = 157)
    public class273(byte[] arg0) {
        this.field3638 = arg0;
    }
}
