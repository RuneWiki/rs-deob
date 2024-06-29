import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class477 implements class374 {

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lpw;")
    private class657 field6568;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "[Lco;")
    private class104[] field6570;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "Lr;")
    private class166 field6578;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Lsea;")
    public static class648 field6581;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "Z")
    private boolean field6575;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V", line = 8)
    public static void method2691(byte arg0) {
        field6581 = null;
        if (arg0 != 2) {
            field6581 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZ)V", line = 23)
    public final void method2149(int arg0, boolean arg1) {
        field6572++;
        boolean var3 = true;
        class104[] var4 = this.field6570;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class104 var6 = var4[var5];
            if (var6 != null) {
                var6.method647(var3 || this.field6575, true);
            }
        }
        this.field6575 = false;
        if (arg0 != 20582) {
            this.method2154(true, -114L);
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)I", line = 49)
    public final int method2153(int arg0) {
        if (arg0 != -5525) {
            method2694(null, (byte) -63, null);
        }
        field6571++;
        return this.field6568.field9130;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)I", line = 61)
    public final int method2152(boolean arg0) {
        field6582++;
        int var2 = 0;
        if (!arg0) {
            this.field6575 = true;
        }
        class104[] var3 = this.field6570;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class104 var5 = var3[var4];
            if (var5 == null || var5.method475((byte) -90)) {
                var2++;
            }
        }
        return var2 * 100 / this.field6570.length;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 90)
    public final void method2151(byte arg0) {
        if (class334.field4506 != this.field6578) {
            this.field6575 = true;
            this.field6578 = class334.field4506;
        }
        field6579++;
        this.field6578.method101(0);
        class104[] var2 = this.field6570;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class104 var5 = var2[var3];
            if (var5 != null) {
                var5.method476(-12935);
            }
        }
        int var4 = -18 % ((-arg0 - 33) / 38);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIIZ)V", line = 122)
    public static final void method2692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg5 > 83) {
            field6576++;
            if ((arg7 ? class366.field4875.field9381 : class366.field4875.field9346) != 0 && arg6 != 0 && class166.field2420 < 50 && arg3 != -1) {
                class130.field1873[class166.field2420++] = new class437((byte) (arg7 ? 3 : 2), arg3, arg6, arg4, arg1, arg2, arg0, null);
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZI)V", line = 139)
    public static final void method2693(int arg0, boolean arg1, int arg2) {
        field6577++;
        class51 var3 = class703.method3938(-1989279584, arg2, 12);
        var3.method402((byte) 124);
        var3.field603 = arg0;
        if (arg1) {
            field6581 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZJ)Z", line = 153)
    public final boolean method2154(boolean arg0, long arg1) {
        field6574++;
        if (arg0) {
            method2693(-101, false, -94);
        }
        return class577.method3295((byte) 15) >= arg1 + ((long) this.field6568.field9127);
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lpw;Lds;)V", line = 164)
    public class477(class657 arg0, class14 arg1) {
        this.field6568 = arg0;
        this.field6570 = new class104[this.field6568.field9128.length];
        for (int var3 = 0; var3 < this.field6570.length; var3++) {
            this.field6570[var3] = arg1.method69(this.field6568.field9128[var3], 2048);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 182)
    public final void method2150(int arg0) {
        field6569++;
        if (arg0 != -25602) {
            this.method2152(false);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lr;BLin;)V", line = 192)
    public static final void method2694(class166 arg0, byte arg1, class78 arg2) {
        field6573++;
        boolean var3 = class599.field8366.method3960(-21722, arg2.field1095, arg2.field1076, arg2.field1052, arg2.field1145, arg0, arg2.field1113 ? class143.field2063.field9689 : null, arg2.field1154 | 0xFF000000) == null;
        if (var3) {
            class473.field6500.method1441(new class275(arg2.field1145, arg2.field1095, arg2.field1076, arg2.field1154 | 0xFF000000, arg2.field1052, arg2.field1113), 0);
            class26.method255(arg2, -20229);
        }
        if (arg1 <= 112) {
            field6581 = null;
        }
    }
}
