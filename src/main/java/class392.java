import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class392 {

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "Z")
    public boolean field6128;

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "I")
    public int field6134;

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "B")
    public byte field6133;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    public int field6125;

    @OriginalMember(owner = "client!ifa", name = "l", descriptor = "S")
    public short field6135;

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "S")
    public short field6129;

    @OriginalMember(owner = "client!ifa", name = "m", descriptor = "B")
    public byte field6136;

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "S")
    public short field6127;

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "Lhga;")
    public static class158 field6131 = new class158(57, 8);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZJ)V")
    public static final void method2542(boolean arg0, long arg1) {
        field6130++;
        class165 var3 = class641.method3717(8592);
        if (arg0) {
            method2543(-107);
        }
        var3.field2776.method65(class434.field6606.field7155, -77);
        var3.field2776.method38(arg1, -18631);
        var3.field2776.method65(class135.field2206, -77);
        class642.method3726(-684096285, var3);
        class166.field2784 = 0;
        class205.field3403 = -3;
        class125.field2054 = 1;
        class528.field7708 = 0;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V")
    public static void method2543(int arg0) {
        field6131 = null;
        int var1 = 65 / ((-arg0 - 40) / 61);
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)Ldda;")
    public static final class349 method2544(int arg0) {
        field6124++;
        if (arg0 != 16278) {
            method2542(false, 41L);
        }
        class349 var1 = (class349) class672.field9474.method2758(72);
        if (var1 == null) {
            return new class349();
        } else {
            class186.field3116--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field6128 = arg9;
        this.field6134 = arg0;
        this.field6133 = (byte) arg8;
        this.field6125 = arg10;
        this.field6135 = (short) arg5;
        this.field6129 = (short) arg6;
        this.field6136 = (byte) arg7;
        this.field6127 = (short) arg4;
    }
}
