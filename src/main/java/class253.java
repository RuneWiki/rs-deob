import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class253 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "S")
    public short field3698;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "B")
    public byte field3704;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "S")
    public short field3712;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "S")
    public short field3700;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Z")
    public boolean field3713;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public int field3699;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "[I")
    public static int[] field3708 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field3702 = 0;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILdc;)V")
    public static final void method1726(int arg0, int arg1, class63 arg2) {
        field3706++;
        if (arg0 != 24 || class630.field8466 == null) {
            return;
        }
        try {
            class630.field8466.method79(0L, (byte) -128);
            class630.field8466.method78(114, arg2.field954, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static final void method1727(byte arg0) {
        field3701++;
        if (class449.field6212) {
            return;
        }
        if (arg0 != 83) {
            field3708 = null;
        }
        class397.field5710 = true;
        class679.field9449 += (-12.0F - class679.field9449) / 2.0F;
        class449.field6212 = true;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public static void method1728(boolean arg0) {
        if (arg0) {
            method1727((byte) 1);
        }
        field3708 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
    public static final void method1729(int arg0, int arg1, int arg2) {
        field3707++;
        int var3 = 91 / ((42 - arg2) / 38);
        if (class712.field9955 == class289.field4140) {
            if (!class21.method112(arg1, false, 1, arg0, 0, 1, 1, 0, -2)) {
                class21.method112(arg1, false, 1, arg0, 0, 1, 1, 0, -3);
            }
        } else if (!class21.method112(arg1, false, 1, arg0, 0, 1, 1, 0, -3)) {
            class21.method112(arg1, false, 1, arg0, 0, 1, 1, 0, -2);
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field3698 = (short) arg5;
        this.field3709 = arg0;
        this.field3710 = arg1;
        this.field3704 = (byte) arg8;
        this.field3712 = (short) arg6;
        this.field3700 = (short) arg4;
        this.field3711 = arg3;
        this.field3713 = arg10;
        this.field3705 = arg2;
        this.field3699 = arg11;
    }
}
