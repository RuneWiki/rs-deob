import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class721 extends class198 {

    @OriginalMember(owner = "client!fca", name = "t", descriptor = "I")
    private int field10065 = -1;

    @OriginalMember(owner = "client!fca", name = "u", descriptor = "Lsv;")
    public static class570 field10066 = new class570(65, -1);

    @OriginalMember(owner = "client!fca", name = "y", descriptor = "Lin;")
    public static class380 field10070 = new class380(46, -1);

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "I")
    public static int field10071 = 0;

    @OriginalMember(owner = "client!fca", name = "B", descriptor = "Lsv;")
    public static class570 field10073 = new class570(54, 3);

    @OriginalMember(owner = "client!fca", name = "r", descriptor = "I")
    public static int field10063;

    @OriginalMember(owner = "client!fca", name = "s", descriptor = "I")
    public static int field10064;

    @OriginalMember(owner = "client!fca", name = "v", descriptor = "I")
    public static int field10067;

    @OriginalMember(owner = "client!fca", name = "x", descriptor = "I")
    public static int field10069;

    @OriginalMember(owner = "client!fca", name = "w", descriptor = "Lgga;")
    public static class513 field10068;

    @OriginalMember(owner = "client!fca", name = "A", descriptor = "Z")
    public static boolean field10072;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)V", line = 4)
    public static void method4008(int arg0) {
        field10066 = null;
        if (arg0 != 0) {
            field10070 = null;
        }
        field10068 = null;
        field10073 = null;
        field10070 = null;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILgga;I)Ljea;", line = 18)
    public static final class250 method4009(int arg0, int arg1, class513 arg2, int arg3) {
        field10067++;
        class431 var4 = new class431(arg2.method3019(arg0, arg3, 98));
        class250 var5 = new class250(arg3, var4.method2532((byte) -124), var4.method2532((byte) -119), var4.method2526(17), var4.method2526(arg1 + 19), arg1 == ~var4.method2557(arg1 + 14931), var4.method2557(14929), var4.method2557(14929));
        int var6 = var4.method2557(14929);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field3598.method3728((byte) 100, new class48(var4.method2557(14929), var4.method2565((byte) -121), var4.method2565((byte) -118), var4.method2565((byte) -86), var4.method2565((byte) -107), var4.method2565((byte) -84), var4.method2565((byte) -96), var4.method2565((byte) -115), var4.method2565((byte) -100)));
        }
        var5.method1660((byte) 121);
        return var5;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZLol;)V", line = 48)
    public final void method855(boolean arg0, class431 arg1) {
        if (!arg0) {
            this.field10065 = 2;
        }
        this.field10065 = arg1.method2565((byte) -113);
        field10069++;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ILlm;)V", line = 63)
    public final void method858(int arg0, class50 arg1) {
        if (arg0 != 3) {
            field10066 = null;
        }
        field10064++;
        arg1.method398(11449, this.field10065);
    }
}
