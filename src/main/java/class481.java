import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class481 {

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public int field7011 = 0;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field7006 = 0;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "Lpi;")
    public static class340 field7007 = new class340(16, 6);

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "Z")
    public static volatile boolean field7012 = true;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method2879(int arg0, int arg1, int arg2, int arg3) {
        class510 var4 = class470.field6877[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class303 var5 = var4.field7485;
        class303 var6 = var4.field7497;
        if (var5 != null) {
            var5.field3931 = var5.field3931 * arg3 / (0x10 << class169.field2206 - 7);
            var5.field3924 = var5.field3924 * arg3 / (0x10 << class169.field2206 - 7);
        }
        if (var6 != null) {
            var6.field3931 = var6.field3931 * arg3 / (0x10 << class169.field2206 - 7);
            var6.field3924 = var6.field3924 * arg3 / (0x10 << class169.field2206 - 7);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lbt;II)V", line = 30)
    private final void method2880(class88 arg0, int arg1, int arg2) {
        if (arg2 != 18580) {
            field7007 = null;
        }
        if (arg1 == 5) {
            this.field7011 = arg0.method568((byte) 110);
        }
        field7008++;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLbt;)V", line = 46)
    public final void method2881(byte arg0, class88 arg1) {
        field7003++;
        if (arg0 != 54) {
            field7012 = false;
        }
        while (true) {
            int var3 = arg1.method617(2);
            if (var3 == 0) {
                return;
            }
            this.method2880(arg1, var3, 18580);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 68)
    public static final void method2882(int arg0) {
        field7004++;
        class206.field2684 = 0;
        if (arg0 != -2049) {
            return;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class514.field7559[var1] = null;
            class332.field4257[var1] = 1;
            class351.field4491[var1] = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIZ)V", line = 90)
    public static final void method2883(int arg0, int arg1, boolean arg2) {
        field7005++;
        class17 var3 = class521.field7736[arg0][arg1];
        if (arg2) {
            return;
        }
        if (var3 != null) {
            class64.field814 = var3.field289;
            class191.field2487 = var3.field282;
            class424.field5838 = var3.field280;
        }
        class96.method661((byte) -69);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V", line = 113)
    public static void method2884(byte arg0) {
        field7007 = null;
        if (arg0 != 86) {
            method2886(55);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)I", line = 127)
    public static final int method2885(int arg0, byte arg1) {
        field7010++;
        if (arg1 >= -113) {
            method2885(103, (byte) 76);
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)Llk;", line = 139)
    public static final class311 method2886(int arg0) {
        class249.field3182 = 0;
        field7009++;
        return arg0 > -103 ? null : class120.method765(1);
    }
}
