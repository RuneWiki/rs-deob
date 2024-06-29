import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class218 extends class80 {

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public int field3582 = -1;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public int field3592 = 0;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Lph;")
    public static class229 field3574 = class266.method1858(":clanreq:", 0);

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field3586 = 0;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "Lph;")
    private static class229 field3578 = class266.method1858("purple:", 0);

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Lph;")
    public static class229 field3583 = field3578;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "Lph;")
    public static class229 field3589 = field3578;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "Z")
    public static boolean field3591 = true;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public int field3577;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public int field3579;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public int field3581;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public int field3584;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public int field3588;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public int field3590;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V", line = 5)
    public static void method1524(byte arg0) {
        if (arg0 != 0) {
            field3586 = 4;
        }
        field3574 = null;
        field3583 = null;
        field3589 = null;
        field3578 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIFZIZI)[I", line = 43)
    public static final int[] method1525(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        field3585++;
        int[] var8 = new int[arg1];
        class262 var9 = new class262();
        var9.field4381 = arg0;
        var9.field4386 = arg7;
        var9.field4371 = arg5;
        var9.field4377 = (int) (arg3 * 4096.0F);
        var9.field4389 = arg6;
        var9.field4378 = arg2;
        var9.method65(116);
        class176.method1268(1, arg4, arg1);
        var9.method1826((byte) -122, var8, 0);
        return var8;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLsi;)V", line = 66)
    public static final void method1526(boolean arg0, class66 arg1) {
        if (arg0) {
            field3591 = true;
        }
        field3580++;
        class195.field3270 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IB)I", line = 77)
    public static final int method1527(int arg0, byte arg1) {
        field3587++;
        int var2 = 24 % ((arg1 + 78) / 38);
        class156 var3 = class6.method38(-31037, arg0);
        int var4 = var3.field2533;
        int var5 = var3.field2543;
        int var6 = var3.field2531;
        int var7 = class15.field176[var5 - var6];
        return var7 & class166.field2711[var4] >> var6;
    }
}
