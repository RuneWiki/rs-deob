import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class99 {

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
    public int field1279 = 16777215;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public int field1269 = 8;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field1276 = 0;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field1264 = class505.method2756(1600, -65537);

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public int field1266;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public int field1268;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "Lue;")
    public static class218 field1273;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1281;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "Z")
    public boolean field1272;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLrr;)V", line = 4)
    public static final void method721(byte arg0, class337 arg1) {
        int var2 = -31 / ((51 - arg0) / 54);
        field1267++;
        if (class448.field5648 == arg1.field4188) {
            class58.field743[arg1.field4171] = true;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V", line = 22)
    public static void method722(byte arg0) {
        if (arg0 != 119) {
            method726(-78, -49, false);
        }
        field1273 = null;
        field1281 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIBIZ)Lcd;", line = 33)
    public static final class293 method723(int arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field1278++;
        class293 var5 = new class293();
        var5.field3727 = arg3;
        var5.field3729 = arg0;
        if (arg2 != 29) {
            method721((byte) -18, null);
        }
        class216.field2530.method3832(var5, (long) arg1, arg2 + 89);
        class46.method279((byte) 63, arg3);
        class337 var6 = class442.method2421(arg1, 79);
        if (var6 != null) {
            method721((byte) 109, var6);
        }
        if (class83.field1066 != null) {
            method721((byte) 127, class83.field1066);
            class83.field1066 = null;
        }
        class492.method2670(26);
        if (var6 != null) {
            class480.method2620(!arg4, var6, -1);
        }
        if (!arg4) {
            class620.method3449(arg3);
        }
        if (!arg4 && class305.field3866 != -1) {
            class654.method3657(class305.field3866, true, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lji;B)V", line = 74)
    public final void method724(class572 arg0, byte arg1) {
        field1271++;
        if (arg1 < 70) {
            return;
        }
        while (true) {
            int var3 = arg0.method3097((byte) 12);
            if (var3 == 0) {
                return;
            }
            this.method728(var3, arg0, -5);
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V", line = 105)
    public static final void method725(byte arg0) {
        field1277++;
        class71.field919.method449(((float) class611.field8310.field8711 * 0.1F + 0.7F) * class109.field1359);
        class71.field919.method445(class383.field4926, class293.field3730, class447.field5614, (float) (class206.field2387 << 2), (float) (class197.field2313 << 2), (float) (class196.field2307 << 2));
        if (arg0 == -42) {
            class71.field919.method458(class667.field9052);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZ)I", line = 118)
    public static final int method726(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field1264 = -103;
        }
        field1280++;
        int var3 = arg0 >> 31 & arg1 - 1;
        return (arg0 + (arg0 >>> 31)) % arg1 + var3;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)V", line = 137)
    public static final void method727(int arg0, int arg1, int arg2) {
        field1265++;
        if (arg2 == -10761) {
            class103.field1316 = arg1 - class604.field8128;
            class80.field1043 = arg0 - class604.field8140;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILji;I)V", line = 149)
    private final void method728(int arg0, class572 arg1, int arg2) {
        field1270++;
        if (arg2 != -5) {
            this.method724(null, (byte) 5);
        }
        if (arg0 == 1) {
            this.field1269 = arg1.method3031(-1);
        } else if (arg0 == 2) {
            this.field1272 = true;
        } else if (arg0 == 3) {
            this.field1275 = arg1.method3086(65280);
            this.field1268 = arg1.method3086(65280);
            this.field1266 = arg1.method3086(arg2 ^ 0xFFFF00FB);
        } else if (arg0 == 4) {
            this.field1282 = arg1.method3097((byte) 12);
        } else if (arg0 == 5) {
            this.field1274 = arg1.method3031(-1);
            return;
        } else if (arg0 == 6) {
            this.field1279 = arg1.method3059(1);
            return;
        }
    }
}
