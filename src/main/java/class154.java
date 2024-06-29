import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class154 extends class237 {

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field2363;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field2357 = -2;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "[I")
    public static int[] field2362 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "Lnl;")
    public static class385 field2359;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Lbw;")
    public static class483 field2356;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1032(int arg0) {
        if (arg0 != 0) {
            this.method1035(55);
        }
        field2355++;
        return this.field2363;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lsl;Ljava/lang/Object;I)V")
    public class154(class319 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2363 = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIB)I")
    public static final int method1033(int arg0, int arg1, byte arg2) {
        if (arg2 != -104) {
            method1034((byte) -47);
        }
        field2360++;
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method1034(byte arg0) {
        field2359 = null;
        field2356 = null;
        if (arg0 != -49) {
            method1033(-85, -46, (byte) -80);
        }
        field2362 = null;
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)Z")
    public final boolean method1035(int arg0) {
        field2361++;
        if (arg0 != 0) {
            this.method1035(86);
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z")
    public static final boolean method1036(int arg0, int arg1, int arg2) {
        field2364++;
        if (arg0 != 4) {
            field2359 = null;
        }
        return class102.method759(84, arg2, arg1) & class308.method1789(arg1, (byte) -118, arg2);
    }
}
