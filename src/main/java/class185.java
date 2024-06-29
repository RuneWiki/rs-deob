import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class185 extends class176 {

    @OriginalMember(owner = "client!qga", name = "w", descriptor = "Z")
    public static boolean field2825 = false;

    @OriginalMember(owner = "client!qga", name = "t", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!qga", name = "u", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!qga", name = "v", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!qga", name = "x", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!qga", name = "y", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!qga", name = "z", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!qga", name = "s", descriptor = "Lpga;")
    private class536 field2821;

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lvd;Lvd;Lfq;)V", line = 4)
    public class185(class39 arg0, class39 arg1, class202 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)Z", line = 8)
    public final boolean method1251(int arg0) {
        if (arg0 != -24346) {
            method1305(-36, true, 98, -125, 1, 31);
        }
        ++field2823;
        return !super.method1251(arg0) ? false : super.field2716.method208(((class202) super.field2722).field3023, (byte) 70);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IZIIII)V", line = 23)
    public static final void method1305(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2822;
        class726.field10139 = arg2;
        class583.field8297 = arg0;
        class153.field2476 = arg4;
        class517.field7387 = arg5;
        class762.field10618 = arg3;
        if (~class583.field8297 <= -101) {
            int var6 = class517.field7387 * 512 + 256;
            int var7 = class726.field10139 * 512 - -256;
            int var8 = class384.method2468(arg1, var6, class341.field4946, var7) - class153.field2476;
            int var9 = -class364.field5254 + var6;
            int var10 = -class259.field3700 + var8;
            int var11 = -class460.field6783 + var7;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class120.field1650 = (int) (2607.5945876176133D * Math.atan2((double) var10, (double) var12)) & 16383;
            class660.field9234 = 16383 & (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D);
            class253.field3649 = 0;
            if (class120.field1650 < 1024) {
                class120.field1650 = 1024;
            }
            if (class120.field1650 > 3072) {
                class120.field1650 = 3072;
            }
        }
        class67.field967 = -1;
        class656.field9191 = -1;
        if (arg1) {
            class264.field3784 = 2;
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V", line = 72)
    public final void method1253(int arg0) {
        ++field2827;
        super.method1253(arg0);
        this.field2821 = class355.method2222(((class202) super.field2722).field3023, super.field2716, (byte) -55);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIZ)V", line = 83)
    public final void method1248(int arg0, int arg1, int arg2, boolean arg3) {
        ++field2826;
        int var5 = this.method1250((byte) -25) * super.field2722.field10371 / 10000;
        int[] var6 = new int[4];
        class736.field10316.method530(var6);
        class736.field10316.method476(arg0, arg1 + arg2, arg0 - -var5, arg2 - -super.field2722.field10364);
        this.field2821.method3150(arg0, arg2 + 2, super.field2722.field10371, super.field2722.field10364);
        class736.field10316.method476(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IZBI)V", line = 100)
    public final void method1254(int arg0, boolean arg1, byte arg2, int arg3) {
        class736.field10316.method525(arg0 + -2, arg3, super.field2722.field10371 + 4, super.field2722.field10364 - -2, ((class202) super.field2722).field3021, 0);
        if (arg2 != 82) {
            this.method1254(127, true, (byte) 80, 24);
        }
        ++field2828;
        class736.field10316.method525(arg0 - 1, arg3 + 1, super.field2722.field10371 - -2, super.field2722.field10364, 0, 0);
    }
}
