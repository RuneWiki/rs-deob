import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class190 extends class137 {

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field3458 = 20;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "[I")
    public static int[] field3480 = new int[25];

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "Lqh;")
    public static class69 field3482 = null;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public int field3461;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public int field3465;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public int field3466;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public int field3468;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public int field3469;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public int field3470;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public int field3476;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public int field3479;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "I")
    public int field3485;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "Lbk;")
    public class140 field3462;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "Lqa;")
    public class167 field3481;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "Lri;")
    public class34 field3486;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "Lcd;")
    public class4 field3477;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBIIII)V")
    public static final void method1394(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2;
        if (arg1 >= -15) {
            method1398((byte) -78);
        }
        while (arg0 >= var6) {
            class227.method1585(arg3, (byte) -66, arg5, class85.field1605[var6], arg4);
            var6++;
        }
        field3472++;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V")
    public final void method1395(byte arg0) {
        this.field3481 = null;
        field3456++;
        this.field3462 = null;
        if (arg0 != 31) {
            method1397(-80, (class69) null);
        }
        this.field3486 = null;
        this.field3477 = null;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
    public static void method1396(int arg0) {
        if (arg0 < 1) {
            method1399(-107);
        }
        field3482 = null;
        field3480 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILqh;)Lqh;")
    public static final class69 method1397(int arg0, class69 arg1) {
        int var2 = -1 % ((arg0 + 72) / 33);
        field3483++;
        class69 var3 = client.method824(arg1);
        if (var3 == null) {
            var3 = arg1.field1158;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)Z")
    public static final boolean method1398(byte arg0) {
        if (arg0 >= -111) {
            method1394(2, (byte) 9, -46, -128, -101, -57);
        }
        field3478++;
        if (class135.field2617 != 0) {
            try {
                if ((Boolean) class16.field224.method1189(class169.field3090.field3055, (byte) -93)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
    public static final void method1399(int arg0) {
        class122.field2326.method111((byte) -52);
        if (arg0 != 20) {
            method1397(-43, (class69) null);
        }
        field3457++;
        class162.field2964.method111((byte) -52);
        class18.field285.method111((byte) -52);
    }
}
