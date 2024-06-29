import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class321 extends class194 {

    @OriginalMember(owner = "client!q", name = "J", descriptor = "Z")
    private boolean field4303 = true;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    private int field4307 = 4096;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "[Lqg;")
    public static class140[] field4305 = new class140[14];

    @OriginalMember(owner = "client!q", name = "O", descriptor = "Lhq;")
    public static class365 field4308 = new class365(64);

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "Ltm;")
    public static class349 field4310 = new class349(16);

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field4304;
        int var4 = 85 / ((arg1 - 52) / 61);
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field4303 = arg2.method1563(-128) == 1;
            }
        } else {
            this.field4307 = arg2.method1587((byte) -102);
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class321() {
        super(1, false);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Luo;B)V")
    public static final void method2002(class118 arg0, byte arg1) {
        if (arg1 < 24) {
            method2003((byte) -31);
        }
        ++field4302;
        if (~class68.field818 != ~class43.field513) {
            if (class347.field4722 != null) {
                if (class338.method2169(-99, arg0, class43.field513)) {
                    class68.field818 = class43.field513;
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field4306;
        if (arg0 != -730) {
            this.method59(12, 12);
        }
        int[][] var3 = super.field2283.method1667(arg1, -65);
        if (super.field2283.field3451) {
            int[] var4 = this.method1203(0, arg0 ^ -660, class210.field2551 & arg1 - 1);
            int[] var5 = this.method1203(0, arg0 + 840, arg1);
            int[] var6 = this.method1203(0, 123, arg1 + 1 & class210.field2551);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class138.field1579; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field4307;
                int var12 = (var5[var10 + 1 & class442.field6113] - var5[var10 + -1 & class442.field6113]) * this.field4307;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                } else {
                    var19 = 0;
                    var18 = 0;
                    var20 = 0;
                }
                if (this.field4303) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
    public static void method2003(byte arg0) {
        field4310 = null;
        field4305 = null;
        int var1 = -100 / ((-34 - arg0) / 34);
        field4308 = null;
    }
}
