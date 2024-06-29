import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class178 extends class13 {

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
    private int field2444 = 3216;

    @OriginalMember(owner = "client!hs", name = "N", descriptor = "I")
    private int field2452 = 4096;

    @OriginalMember(owner = "client!hs", name = "O", descriptor = "I")
    private int field2453 = 3216;

    @OriginalMember(owner = "client!hs", name = "T", descriptor = "[I")
    private int[] field2458 = new int[3];

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "[I")
    public static int[] field2449 = new int[32];

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
    public static int field2447 = 10;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!hs", name = "M", descriptor = "I")
    public static int field2451 = -1;

    @OriginalMember(owner = "client!hs", name = "R", descriptor = "I")
    public static int field2456 = 2;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!hs", name = "P", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!hs", name = "Q", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!hs", name = "S", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V", line = 5)
    public class178() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIII)V", line = 11)
    public static final void method1170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; ~arg0 <= ~var6; ++var6) {
            class295.method1924(3289650, class296.field4138[var6], arg1, arg2, arg4);
        }
        ++field2457;
        if (arg3 < 20) {
            field2451 = -23;
        }
    }

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "(B)V", line = 31)
    public static void method1171(byte arg0) {
        field2449 = null;
        if (arg0 >= -42) {
            method1171((byte) -64);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)[I", line = 50)
    public final int[] method29(boolean arg0, int arg1) {
        ++field2443;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            int var4 = class191.field2634 * this.field2452 >> 12;
            int[] var5 = this.method223(0, -11541, class123.field1710 & arg1 + -1);
            int[] var6 = this.method223(0, -11541, arg1);
            int[] var7 = this.method223(0, -11541, arg1 + 1 & class123.field1710);
            for (int var8 = 0; class269.field3751 > var8; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class343.field4677 & var8 + -1] + -var6[class343.field4677 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class19.field359[((var12 - -1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field2458[0] * var15 >> 12;
                int var18 = this.field2458[1] * var16 >> 12;
                int var19 = this.field2458[2] * var14 >> 12;
                var3[var8] = var17 + var19 - -var18;
            }
        }
        if (!arg0) {
            field2448 = 109;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V", line = 122)
    private final void method1172(int arg0) {
        ++field2450;
        double var2 = Math.cos((double) ((float) this.field2453 / 4096.0F));
        this.field2458[0] = (int) (4096.0D * Math.sin((double) ((float) this.field2444 / 4096.0F)) * var2);
        this.field2458[1] = (int) (Math.cos((double) ((float) this.field2444 / 4096.0F)) * var2 * 4096.0D);
        if (arg0 == 10) {
            this.field2458[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2453 / 4096.0F)));
            int var4 = this.field2458[0] * this.field2458[0] >> 12;
            int var5 = this.field2458[1] * this.field2458[1] >> 12;
            int var6 = this.field2458[2] * this.field2458[2] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
            if (var7 != 0) {
                this.field2458[1] = (this.field2458[1] << 12) / var7;
                this.field2458[2] = (this.field2458[2] << 12) / var7;
                this.field2458[0] = (this.field2458[0] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILnq;)V", line = 161)
    public static final void method1173(int arg0, class268 arg1) {
        ++field2445;
        class61.field847 = arg1;
        int var2 = -7 % ((-68 - arg0) / 36);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lkh;BI)V", line = 174)
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field2453 = arg0.method174(255);
                }
            } else {
                this.field2444 = arg0.method174(255);
            }
        } else {
            this.field2452 = arg0.method174(255);
        }
        if (arg1 < 50) {
            this.field2444 = 0;
        }
        ++field2454;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V", line = 220)
    public final void method33(int arg0) {
        int var2 = -4 / ((2 - arg0) / 51);
        ++field2455;
        this.method1172(10);
    }
}
