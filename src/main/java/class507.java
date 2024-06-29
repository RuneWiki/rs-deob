import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class507 extends class14 {

    @OriginalMember(owner = "client!wga", name = "p", descriptor = "I")
    public int field6477;

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
    public int field6474;

    @OriginalMember(owner = "client!wga", name = "t", descriptor = "J")
    public static long field6481 = 20000000L;

    @OriginalMember(owner = "client!wga", name = "v", descriptor = "Lrn;")
    public static class633 field6483 = new class633(36, 7);

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!wga", name = "o", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!wga", name = "q", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!wga", name = "s", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!wga", name = "u", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!wga", name = "r", descriptor = "[I")
    public static int[] field6479;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IBLbha;)Z")
    public static final boolean method2804(int arg0, byte arg1, class318 arg2) {
        class435.field5711.method446(arg2.field3960[arg0], arg2.field3958[arg0], arg2.field3968[arg0], class120.field1609);
        field6475++;
        int var3 = class120.field1609[2];
        if (var3 < 50) {
            return false;
        }
        arg2.field3973[arg0] = (short) (class120.field1609[0] * class350.field4278 / var3 + class365.field4462);
        if (arg1 < 56) {
            field6476 = -96;
        }
        arg2.field3971[arg0] = (short) (class120.field1609[1] * class364.field4458 / var3 + class377.field4621);
        arg2.field3967[arg0] = (short) var3;
        return true;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;I)V")
    public static final void method2805(int arg0, String arg1, boolean arg2, String arg3, int arg4) {
        field6480++;
        if (arg0 != 0) {
            field6481 = 37L;
        }
        class48.method313((byte) 2, arg1, true, arg2, arg3, -1, arg4);
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(B)I")
    public static final int method2806(byte arg0) {
        field6478++;
        if (arg0 >= -54) {
            return -62;
        } else if (class596.field7567 == 1) {
            return class329.field4033;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
    public static void method2807(int arg0) {
        if (arg0 != 7) {
            field6481 = -11L;
        }
        field6483 = null;
        field6479 = null;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)Lgp;")
    public final class576 method3(byte arg0) {
        if (arg0 >= -15) {
            method2807(103);
        }
        field6482++;
        return class730.field9570;
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lpf;Ldg;IIIIIIIII)V")
    public class507(class759 arg0, class20 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field6477 = arg10;
        this.field6474 = arg9;
    }
}
