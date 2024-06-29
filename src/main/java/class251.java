import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public abstract class class251 extends class69 {

    @OriginalMember(owner = "client!sca", name = "t", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!sca", name = "v", descriptor = "F")
    public float field3737;

    @OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
    private int field3732;

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!sca", name = "u", descriptor = "I")
    private int field3736;

    @OriginalMember(owner = "client!sca", name = "o", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!sca", name = "r", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!sca", name = "s", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)I")
    public final int method1683(int arg0) {
        if (arg0 != 10918) {
            this.field3737 = -1.086582F;
        }
        field3731++;
        return this.field3735;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)I")
    public final int method1684(int arg0) {
        if (arg0 != -1) {
            this.field3737 = 0.89238095F;
        }
        field3734++;
        return this.field3732;
    }

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)I")
    public final int method1685(int arg0) {
        field3733++;
        int var2 = -26 % ((arg0 - 25) / 49);
        return this.field3736;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)I")
    public final int method1686(boolean arg0) {
        if (arg0) {
            this.method1686(false);
        }
        field3727++;
        return this.field3730;
    }

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "(I)I")
    public final int method1687(int arg0) {
        if (arg0 != 1110) {
            this.method1688(24);
        }
        field3728++;
        return this.field3729;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IF)V")
    public abstract void method54(int arg0, float arg1);

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "(I)F")
    public final float method1688(int arg0) {
        field3726++;
        if (arg0 < 32) {
            this.field3735 = -43;
        }
        return this.field3737;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIII)V")
    public static final void method1689(int arg0, int arg1, int arg2, int arg3) {
        field3725++;
        int var4 = class444.field6151 + arg1;
        if (arg3 != 1066420873) {
            return;
        }
        int var5 = arg2 + class236.field3535;
        if (class59.field688 == null || arg1 < 0 || arg2 < 0 || arg1 >= class741.field10208 || arg2 >= class525.field7224 || class688.field9602.field8542.method1756((byte) -98) == 0 && class724.field10031.field3467 != arg0) {
            return;
        }
        long var6 = (long) (var4 | arg0 << 28 | var5 << 14);
        class656 var8 = (class656) class752.field10377.method3669(false, var6);
        if (var8 == null) {
            class250.method1682(arg0, arg1, arg2);
            return;
        }
        class728 var9 = (class728) var8.field9258.method1041(1048832);
        if (var9 == null) {
            class250.method1682(arg0, arg1, arg2);
            return;
        }
        class78 var10 = (class78) class250.method1682(arg0, arg1, arg2);
        if (var10 == null) {
            var10 = new class78(arg1 << 9, class661.field9303[arg0].method2525(arg1, arg2, (byte) 114), arg2 << 9, arg0, arg0);
        } else {
            var10.field882 = var10.field873 = -1;
        }
        var10.field877 = var9.field10064;
        var10.field879 = var9.field10066;
        label60: while (true) {
            class728 var11 = (class728) var8.field9258.method1033(-1);
            if (var11 == null) {
                break;
            }
            if (var10.field877 != var11.field10064) {
                var10.field882 = var11.field10064;
                var10.field875 = var11.field10066;
                while (true) {
                    class728 var12 = (class728) var8.field9258.method1033(-1);
                    if (var12 == null) {
                        break label60;
                    }
                    if (var10.field877 != var12.field10064 && var10.field882 != var12.field10064) {
                        var10.field876 = var12.field10066;
                        var10.field873 = var12.field10064;
                    }
                }
            }
        }
        int var13 = class373.method2316((arg1 << 9) + 256, arg0, (arg2 << 9) + 256, 124);
        var10.field3469 = (byte) arg0;
        var10.field3464 = var13;
        var10.field3467 = (byte) arg0;
        var10.field3470 = arg1 << 9;
        var10.field3460 = arg2 << 9;
        var10.field866 = 0;
        if (class123.method865(arg1, arg2, arg3 - 1066420976)) {
            var10.field3469++;
        }
        class373.method2317(arg0, arg1, arg2, var13, var10);
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(IIII)V")
    public abstract void method55(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(IIIIIF)V")
    public class251(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field3735 = arg0;
        this.field3737 = arg5;
        this.field3732 = arg4;
        this.field3729 = arg1;
        this.field3736 = arg3;
        this.field3730 = arg2;
    }
}
