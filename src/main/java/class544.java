import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class544 {

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static volatile int field7545 = -1;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "[I")
    public static int[] field7546 = new int[1];

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field7547 = 0;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field7541 = 0;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
    public static void method3214(byte arg0) {
        if (arg0 > 46) {
            field7546 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIII)Lkaa;")
    public static final class583 method3215(int arg0, int arg1, int arg2, int arg3) {
        field7548++;
        class583 var4 = null;
        if (arg3 == 0) {
            class729.field10146++;
            var4 = class54.method400(class213.field2800, (byte) -97, class124.field1707);
        }
        if (arg2 == arg3) {
            class126.field1729++;
            var4 = class54.method400(class213.field2800, (byte) -79, class236.field3488);
        }
        var4.field7963.method492(-2, class113.field1509 + arg1);
        var4.field7963.method488(arg2 - 129, class587.field7995 + arg0);
        var4.field7963.method444(class224.field3014.method129(82, 98) ? 1 : 0, 128);
        class171.field2378 = arg0;
        class486.field6806 = arg1;
        class684.field9516 = false;
        class744.method4143((byte) 126);
        return var4;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(FBFF)I")
    public static final int method3216(float arg0, byte arg1, float arg2, float arg3) {
        field7544++;
        if (arg1 > -25) {
            return 80;
        }
        float var4 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var5 = (arg2 < 0.0F) ? -arg2 : arg2;
        float var6 = arg3 < 0.0F ? -arg3 : arg3;
        if (var4 < var5 && var5 > var6) {
            return (arg2 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return (arg3 > 0.0F) ? 2 : 3;
        } else if ((arg0 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V")
    public static final void method3217(byte arg0) {
        class690 var1 = class63.field980;
        synchronized (class63.field980) {
            if (arg0 > -104) {
                field7547 = 81;
            }
            class63.field980.method3902(0);
        }
        field7542++;
    }
}
