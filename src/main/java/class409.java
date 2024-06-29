import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class409 {

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field6190 = -1;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "F")
    public static float field6192;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    private int field6187;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public int field6194;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public int field6196;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "Lml;")
    public class266 field6198;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLqi;I)La;")
    public static final class440 method2533(byte arg0, class402 arg1, int arg2) {
        field6191++;
        class440 var3;
        if (class381.field5580 == null) {
            var3 = new class440();
        } else {
            var3 = class381.field5580;
            class381.field5580 = class381.field5580.field6528;
            var3.field6528 = null;
            class119.field2096--;
        }
        var3.field6526 = arg2;
        var3.field6530 = arg1;
        if (arg0 > -62) {
            method2533((byte) -55, null, -53);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lnn;BI)V")
    private final void method2534(class289 arg0, byte arg1, int arg2) {
        if (arg1 <= 45) {
            this.method2537(-56);
        }
        field6193++;
        if (arg2 == 1) {
            this.field6187 = arg0.method1841((byte) -122);
        } else if (arg2 == 2) {
            this.field6196 = arg0.method1858(-3256);
            this.field6194 = arg0.method1858(-3256);
            return;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6188++;
        int var7 = arg4 + arg6;
        int var8 = arg2 - arg6;
        for (int var9 = arg4; var9 < var7; var9++) {
            class503.method3027(arg5, (byte) 127, arg1, arg3, class316.field4797[var9]);
        }
        int var10 = arg1 - arg6;
        for (int var11 = arg2; var11 > var8; var11--) {
            class503.method3027(arg5, (byte) 127, arg1, arg3, class316.field4797[var11]);
        }
        int var12 = arg5 + arg6;
        if (arg0 != -7039) {
            method2538(13, null);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class316.field4797[var13];
            class503.method3027(arg5, (byte) 127, var12, arg3, var14);
            class503.method3027(var10, (byte) 127, arg1, arg3, var14);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILnn;)V")
    public final void method2536(int arg0, class289 arg1) {
        if (arg0 != 0) {
            return;
        }
        field6195++;
        while (true) {
            int var3 = arg1.method1858(-3256);
            if (var3 == 0) {
                return;
            }
            this.method2534(arg1, (byte) 80, var3);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Lef;")
    public final synchronized class340 method2537(int arg0) {
        field6197++;
        class340 var2 = (class340) this.field6198.field4048.method2478(arg0 + 1, (long) this.field6187);
        if (var2 != null) {
            return var2;
        }
        class340 var3 = class340.method2139(this.field6198.field4045, this.field6187, arg0);
        if (var3 != null) {
            this.field6198.field4048.method2472(-81, var3, (long) this.field6187);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(ILnn;)Ljava/lang/String;")
    public static final String method2538(int arg0, class289 arg1) {
        field6189++;
        if (arg0 != -2) {
            method2535(45, -94, -91, -112, -101, -49, -3);
        }
        return class459.method2738(32767, arg1, true);
    }
}
