import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class574 extends class573 {

    @OriginalMember(owner = "client!aaa", name = "L", descriptor = "I")
    public static int field8342 = 0;

    @OriginalMember(owner = "client!aaa", name = "N", descriptor = "J")
    public static long field8344 = 0L;

    @OriginalMember(owner = "client!aaa", name = "I", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!aaa", name = "J", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!aaa", name = "K", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!aaa", name = "M", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "(I)V")
    public static final void method3297(int arg0) {
        ++field8341;
        if (~class157.field2688 <= -1) {
            long var1 = class525.method3074((byte) -101);
            class157.field2688 = (int) ((long) class157.field2688 - (-class59.field1336 + var1));
            if (~class157.field2688 < -1) {
                int var3 = (class157.field2688 << 8) / class95.field1707;
                int var4 = -var3 + 255;
                float var5 = (float) var3 / 255.0F;
                class433.field6271 = ((65280 & class436.field6301) * var3 - -((65280 & class433.field6274.field6697) * var4) & 16711680) + ((16711935 & class436.field6301) * var3 + (16711935 & class433.field6274.field6697) * var4 & -16711936) >>> 8;
                float var6 = 1.0F - var5;
                class507.field7189 = (-class645.field9297 + class433.field6274.field6687) * var6 + class645.field9297;
                class161.field2718 = (class433.field6274.field6691 - class4.field458) * var6 + class4.field458;
                class527.field7431 = (16711680 & (class426.field6144 & 65280) * var3 + (class433.field6274.field6699 & 65280) * var4) + ((16711935 & class426.field6144) * var3 + (16711935 & class433.field6274.field6699) * var4 & -16711936) >>> 8;
                class592.field8515 = (-class144.field2514 + class433.field6274.field6696) * var6 + class144.field2514;
                class691.field9759 = (class433.field6274.field6700 - class637.field9184) * var6 + class637.field9184;
                class42.field1084 = (class433.field6274.field6693 - class374.field5578) * var6 + class374.field5578;
                class234.field3494 = (class433.field6274.field6688 - class36.field1035) * var6 + class36.field1035;
                class680.field9648 = class634.field9111 * var3 - -(class433.field6274.field6698 * var4) >> 8;
                if (class616.field8945 != class433.field6274.field6689) {
                    class310.field4625 = class140.field2463.method89(class616.field8945, class433.field6274.field6689, var6, class310.field4625);
                }
            } else {
                class42.field1084 = class433.field6274.field6693;
                class527.field7431 = class433.field6274.field6699;
                class433.field6271 = class433.field6274.field6697;
                class234.field3494 = class433.field6274.field6688;
                class157.field2688 = -1;
                class310.field4625 = class433.field6274.field6689;
                class161.field2718 = class433.field6274.field6691;
                class507.field7189 = class433.field6274.field6687;
                class592.field8515 = class433.field6274.field6696;
                class680.field9648 = class433.field6274.field6698;
                class691.field9759 = class433.field6274.field6700;
            }
            class59.field1336 = var1;
        }
        if (arg0 != 7477) {
            method3297(-73);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V")
    public class574() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field8343;
        int[] var3 = super.field8321.method3164(arg0, -121);
        if (arg1 != 1) {
            method3298(true, -33, 60, 98, -60, 89, -37, -5, 46);
        }
        if (super.field8321.field7825) {
            class692.method3878(var3, 0, class540.field7555, class230.field3460[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZIIIIIIII)V")
    public static final void method3298(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field8340;
        class237.field3522[class695.field9792++] = new class185(arg1, arg6, arg2, arg8, arg8, arg2, arg3, arg5, arg5, arg3, arg7, arg7, arg4, arg4);
        if (arg0) {
            method3297(92);
        }
    }
}
