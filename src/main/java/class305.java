import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class305 extends class354 {

    @OriginalMember(owner = "client!os", name = "M", descriptor = "Z")
    private boolean field4374 = true;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "I")
    private int field4376 = 4096;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "[I")
    public static int[] field4371 = new int[250];

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "[S")
    public static short[] field4375;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg0 != 15180) {
            method1928((byte) -123);
        }
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field4374 = ~arg1.method1918((byte) 73) == -2;
            }
        } else {
            this.field4376 = arg1.method1868(0);
        }
        ++field4373;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)[[I")
    public final int[][] method207(byte arg0, int arg1) {
        ++field4369;
        int[][] var3 = super.field5351.method2819((byte) -17, arg1);
        if (super.field5351.field6959) {
            int[] var4 = this.method2293(0, arg1 + -1 & class30.field492, (byte) 69);
            int[] var5 = this.method2293(0, arg1, (byte) 69);
            int[] var6 = this.method2293(0, class30.field492 & arg1 - -1, (byte) 69);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class404.field5952 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field4376;
                int var12 = (var5[var10 + 1 & class168.field2527] + -var5[class168.field2527 & var10 + -1]) * this.field4376;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 - -var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var12 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                }
                if (this.field4374) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        if (arg0 > -40) {
            method1928((byte) 20);
        }
        return var3;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lks;Z)V")
    public static final void method1927(class301 arg0, boolean arg1) {
        if (arg1) {
            field4375 = null;
        }
        ++field4372;
        arg0.field4280 = null;
        if (class445.field6529 < 20) {
            class492.field7182.method1637((byte) -73, arg0);
            ++class445.field6529;
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(B)V")
    public static void method1928(byte arg0) {
        field4371 = null;
        if (arg0 <= 96) {
            field4371 = null;
        }
        field4375 = null;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
    public class305() {
        super(1, false);
    }
}
