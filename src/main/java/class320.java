import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class320 extends class220 {

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    private int field4570;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    private int field4572;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!t", name = "X", descriptor = "I")
    private int field4578;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "[I")
    public static int[] field4575;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "[Lqa;")
    public static class243[] field4573;

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(I)V", line = 4)
    private class320(int arg0) {
        super(0, false);
        this.method1986(1, arg0);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V", line = 14)
    public class320() {
        this(0);
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V", line = 17)
    public static void method1985(int arg0) {
        if (arg0 == 4080) {
            field4573 = null;
            field4575 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(II)V", line = 31)
    private final void method1986(int arg0, int arg1) {
        this.field4572 = arg1 >> 4 & 4080;
        this.field4578 = 4080 & arg1 << 4;
        ++field4571;
        this.field4570 = (16711680 & arg1) >> 12;
        if (arg0 != 1) {
            this.method2(8, (byte) 31, (class265) null);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)[[I", line = 44)
    public final int[][] method1(int arg0, int arg1) {
        ++field4574;
        if (arg1 != 0) {
            this.method2(-57, (byte) 95, (class265) null);
        }
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (super.field3135.field4087) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class344.field5043 > var7; ++var7) {
                var4[var7] = this.field4570;
                var5[var7] = this.field4572;
                var6[var7] = this.field4578;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBLil;)V", line = 90)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg1 == -49) {
            if (arg0 == 0) {
                this.method1986(arg1 ^ -50, arg2.method1691(false));
            }
            ++field4577;
        }
    }
}
