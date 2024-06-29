import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class783 implements class385 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lkh;")
    private class368 field10722;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Lmt;")
    private class469 field10723;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field10721;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field10724;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field10725;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field10726;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field10727;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field10728;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        if (arg0 > -93) {
            this.field10722 = null;
        }
        field10724++;
        return this.field10723.method2739((byte) 93);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/lang/String;ILda;B)I")
    private final int method4297(int arg0, int arg1, String arg2, int arg3, class443 arg4, byte arg5) {
        int var7 = 83 % ((8 - arg5) / 37);
        field10727++;
        return arg4.method2627(0, arg2, this.field10722.field5200, this.field10722.field5198 - (arg3 * 2), arg1 + arg3, 0, 0, this.field10722.field5204 - (arg3 * 2), 0, null, this.field10722.field5202, 0, null, -1609, arg0 + arg3, null);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Z")
    public static final boolean method4298(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            field10721++;
            return class535.method3111((byte) 88, arg0, arg1) | (arg1 & 0x70000) != 0 || class518.method3030(arg1, arg0, -98);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lmt;Lkh;)V")
    public class783(class469 arg0, class368 arg1) {
        this.field10722 = arg1;
        this.field10723 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public final void method20(int arg0) {
        field10726++;
        if (arg0 > -50) {
            field10725 = -116;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
    public final void method19(boolean arg0, int arg1) {
        field10728++;
        if (arg1 < 44) {
            method4298(-32, -65, -56);
        }
        class77 var3 = this.field10723.method2740((byte) 95, this.field10722.field5192);
        if (var3 == null) {
            return;
        }
        int var4 = this.field10722.field5201.method3291(this.field10722.field5198, 0, class499.field6858) + this.field10722.field5205;
        int var5 = this.field10722.field5197.method2110(class381.field5334, this.field10722.field5204, -29133) + this.field10722.field5208;
        if (this.field10722.field5213) {
            class686.field9702.method447(var4, var5, this.field10722.field5198, this.field10722.field5204, this.field10722.field5203, 0);
        }
        int var6 = var5 + this.method4297(var5, var4, var3.field1164, 5, class670.field9398, (byte) 122) * 12;
        int var9 = var6 + 8;
        if (this.field10722.field5213) {
            class686.field9702.method453(var4, var9, this.field10722.field5198 + var4 - 1, var9, this.field10722.field5203, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method4297(var6, var4, var3.field1157, 5, class670.field9398, (byte) -88) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method4297(var10, var4, var3.field1155, 5, class670.field9398, (byte) -59) * 12;
    }
}
