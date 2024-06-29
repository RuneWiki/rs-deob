import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class647 extends class72 {

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field9160 = 0;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "S")
    public static short field9162 = 32767;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "Lqe;")
    public static class465 field9165 = new class465(15, 20);

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field9166 = -1;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V", line = 9)
    public final void method59(int arg0, int arg1) {
        if (arg1 == 3) {
            ++field9163;
            super.field1282 = arg0;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lcq;)V", line = 23)
    public class647(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(ILcq;)V", line = 29)
    public class647(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIII)V", line = 32)
    public static final void method3673(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9164;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        if (arg2 > -13) {
            method3673(44, -114, -50, 82, -69);
        }
        int var9 = class498.method3000(false, class612.field8854, arg4 - -arg1, class156.field2337);
        int var10 = class498.method3000(false, class612.field8854, -arg1 + arg4, class156.field2337);
        class399.method2472(27113, var10, var9, arg0, class329.field4651[arg3]);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                --var6;
                var7 -= var6 << 1;
                int var11 = -var6 + arg3;
                int var12 = arg3 - -var6;
                if (~class558.field7940 >= ~var12 && ~var11 >= ~class748.field10458) {
                    int var13 = class498.method3000(false, class612.field8854, arg4 - -var5, class156.field2337);
                    int var14 = class498.method3000(false, class612.field8854, -var5 + arg4, class156.field2337);
                    if (~var12 >= ~class748.field10458) {
                        class399.method2472(27113, var14, var13, arg0, class329.field4651[var12]);
                    }
                    if (var11 >= class558.field7940) {
                        class399.method2472(27113, var14, var13, arg0, class329.field4651[var11]);
                    }
                }
            }
            ++var5;
            int var15 = -var5 + arg3;
            int var16 = arg3 + var5;
            if (~var16 <= ~class558.field7940 && class748.field10458 >= var15) {
                int var17 = class498.method3000(false, class612.field8854, arg4 + var6, class156.field2337);
                int var18 = class498.method3000(false, class612.field8854, -var6 + arg4, class156.field2337);
                if (~var16 >= ~class748.field10458) {
                    class399.method2472(27113, var18, var17, arg0, class329.field4651[var16]);
                }
                if (~class558.field7940 >= ~var15) {
                    class399.method2472(27113, var18, var17, arg0, class329.field4651[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V", line = 110)
    public static void method3674(int arg0) {
        field9165 = null;
        if (arg0 != 4672) {
            field9162 = -14;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I", line = 120)
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            this.method55(-128);
        }
        ++field9159;
        return 1;
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)I", line = 132)
    public final int method3675(int arg0) {
        ++field9158;
        if (arg0 != 27669) {
            this.method60(35);
        }
        return super.field1282;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 144)
    public final void method55(int arg0) {
        if (~super.field1282 != -2 && super.field1282 != 0) {
            super.field1282 = this.method60(-3271);
        }
        ++field9167;
        if (arg0 < 30) {
            this.method58(88, -11);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)I", line = 169)
    public final int method58(int arg0, int arg1) {
        if (arg1 != 11260) {
            field9166 = -31;
        }
        ++field9161;
        return 1;
    }
}
