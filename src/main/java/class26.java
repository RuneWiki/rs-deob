import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class26 extends class112 {

    @OriginalMember(owner = "client!na", name = "K", descriptor = "Lwm;")
    private static class152 field433 = class157.method1048("Opened title screen", 115);

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field435 = 0;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "Lwm;")
    public static class152 field434 = field433;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "Lwm;")
    private static class152 field442 = class157.method1048("Connecting to update server", 109);

    @OriginalMember(owner = "client!na", name = "O", descriptor = "Lwm;")
    private static class152 field436 = class157.method1048("flash1:", 95);

    @OriginalMember(owner = "client!na", name = "W", descriptor = "Lwm;")
    public static class152 field444 = class157.method1048("Verbindung mit Update)2Server)3)3)3", 94);

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "Lwm;")
    public static class152 field449 = class157.method1048(" ", 92);

    @OriginalMember(owner = "client!na", name = "X", descriptor = "[I")
    public static int[] field445 = new int[500];

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "Lwm;")
    public static class152 field448 = class157.method1048(")4a=", 104);

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "Lwm;")
    public static class152 field447 = field436;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "Lwm;")
    public static class152 field441 = field436;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "Lwm;")
    public static class152 field439 = field442;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "I")
    public static int field452 = 0;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "[I")
    public static int[] field450;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZII)I", line = 24)
    public static final int method216(int arg0, boolean arg1, int arg2, int arg3) {
        field438++;
        int var4 = class181.field2885[class21.method134(arg2, arg3)];
        if (arg1) {
            field436 = (class152) null;
        }
        if (arg0 > 0) {
            int var5 = class181.field2878.method1778(255, arg0 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg3 < 0) {
                    var6 = 0;
                } else if (arg3 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg3 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var6 & 0xFF00) * var5 + ((var4 & 0xFF00) * var8) & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class181.field2878.method1775(arg0 & 0xFFFF, 53);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF00) >> 8) * var9;
                int var11 = (var4 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 << 8 & 0xFF00AB) - (-(var10 & 0xFF00) - (var11 >> 8));
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "h", descriptor = "(I)V", line = 98)
    public static void method217(int arg0) {
        field449 = null;
        field433 = null;
        field434 = null;
        field450 = null;
        field442 = null;
        field445 = null;
        int var1 = -68 / ((arg0 + 32) / 62);
        field441 = null;
        field448 = null;
        field447 = null;
        field439 = null;
        field436 = null;
        field444 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)[I", line = 118)
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -3) {
            method217(24);
        }
        field437++;
        return class131.field1992;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)Ltj;", line = 152)
    public static final class179 method218(boolean arg0, int arg1) {
        field451++;
        class179 var2 = (class179) class228.field3716.method1663((long) arg1, (byte) -122);
        if (var2 != null) {
            return var2;
        }
        if (arg0) {
            method217(99);
        }
        byte[] var3 = class55.field861.method1381(5, arg1, 0);
        class179 var4 = new class179();
        if (var3 != null) {
            var4.method1179(-108, new class291(var3));
        }
        class228.field3716.method1662(var4, (long) arg1, -73);
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V", line = 194)
    public class26() {
        super(0, true);
    }
}
