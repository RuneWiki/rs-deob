import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class226 {

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lok;")
    private class266 field3478;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field3470 = 0;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
    public static int[] field3472 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lbu;")
    public static class21 field3475 = new class21(90, -2);

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Lmea;")
    public static class451 field3479 = null;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Llq;")
    private class577 field3477;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method1540(byte arg0) {
        field3479 = null;
        field3475 = null;
        field3472 = null;
        if (arg0 != -102) {
            method1540((byte) 10);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1541(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class263.field3856 = arg3;
        class353.field4969 = arg1;
        class488.field6904 = arg2;
        class591.field8329 = arg0;
        class256.field3763 = arg5;
        if (arg4) {
            return;
        }
        field3471++;
        if (class488.field6904 >= 100) {
            int var6 = class256.field3763 * 512 + 256;
            int var7 = class263.field3856 * 512 + 256;
            int var8 = class702.method3970(var6, class368.field5113, -20103, var7) - class353.field4969;
            int var9 = var6 - class614.field8619;
            int var10 = var8 - class546.field7862;
            int var11 = var7 - class472.field6622;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class589.field8310 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class544.field7813 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class565.field8018 = 0;
            if (class589.field8310 < 1024) {
                class589.field8310 = 1024;
            }
            if (class589.field8310 > 3072) {
                class589.field8310 = 3072;
            }
        }
        class375.field5176 = -1;
        class429.field5830 = -1;
        class416.field5704 = 2;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILok;)V")
    public final void method1542(int arg0, class266 arg1) {
        if (arg0 != -1025) {
            this.method1542(1, null);
        }
        field3473++;
        this.field3478 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Llq;")
    public final class577 method1543(int arg0) {
        field3476++;
        class577 var2 = this.field3478.field3876.field8131;
        if (arg0 != -256) {
            this.method1543(82);
        }
        if (this.field3478.field3876 == var2) {
            this.field3477 = null;
            return null;
        } else {
            this.field3477 = var2.field8131;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Llq;")
    public final class577 method1544(boolean arg0) {
        field3474++;
        if (arg0) {
            field3479 = null;
        }
        class577 var2 = this.field3477;
        if (this.field3478.field3876 == var2) {
            this.field3477 = null;
            return null;
        } else {
            this.field3477 = var2.field8131;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class226() {
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lok;)V")
    public class226(class266 arg0) {
        this.field3478 = arg0;
    }
}
