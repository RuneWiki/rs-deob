import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class488 {

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "Lfba;")
    private class348 field7027 = new class348(64);

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "Lla;")
    private class423 field7034;

    @OriginalMember(owner = "client!nba", name = "l", descriptor = "Lla;")
    private class423 field7038;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public static int field7033 = 0;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "Lvi;")
    public static class368 field7030 = new class368(16);

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "Loh;")
    public static class680 field7032;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "Ljava/lang/String;")
    public static String field7029;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2970(int arg0, boolean arg1) {
        field7036++;
        if (arg1) {
            method2970(21, false);
        }
        return arg0 == 7 || arg0 == 8 || arg0 == 9;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Lsba;")
    public final class554 method2971(int arg0, int arg1) {
        field7037++;
        class554 var3 = (class554) this.field7027.method2216(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        int var4 = -58 / ((42 - arg1) / 62);
        byte[] var5;
        if (arg0 < 32768) {
            var5 = this.field7034.method2600(0, 0, arg0);
        } else {
            var5 = this.field7038.method2600(0, 0, arg0 & 0x7FFF);
        }
        class554 var6 = new class554();
        if (var5 != null) {
            var6.method3331(new class479(var5), (byte) 26);
        }
        if (arg0 >= 32768) {
            var6.method3329(0);
        }
        this.field7027.method2213((byte) -16, (long) arg0, var6);
        return var6;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
    public static void method2972(byte arg0) {
        field7029 = null;
        field7032 = null;
        field7030 = null;
        if (arg0 != 72) {
            field7033 = -111;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "([BBII)I")
    public static final int method2973(byte[] arg0, byte arg1, int arg2, int arg3) {
        field7031++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = class275.field3880[(var4 ^ arg0[var5]) & 0xFF] ^ var4 >>> 8;
        }
        if (arg1 != -38) {
            field7029 = null;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIB)V")
    public static final void method2974(int arg0, int arg1, byte arg2) {
        if (arg2 == 113) {
            field7035++;
            class503 var3 = class512.method3112(13, arg0, 0);
            var3.method3075((byte) 126);
            var3.field7310 = arg1;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Luea;Lha;Lbm;I)V")
    public static final void method2975(class241 arg0, class543 arg1, class463 arg2, int arg3) {
        if (arg3 < 5) {
            return;
        }
        field7028++;
        class515 var4 = arg2.method2805(114, arg1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method777();
        if (var4.method787() > var5) {
            var5 = var4.method787();
        }
        byte var6 = 10;
        int var7 = arg0.field3569;
        int var8 = arg0.field3572;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg2.field6585 != null) {
            var9 = class426.field6164.method3064(null, arg2.field6585, class558.field8113, 0, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class558.field8113[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class611.field8741.method2074(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class611.field8741.method2070() * var9 + (class611.field8741.method2073() / 2);
        }
        int var15 = var5 / 2 + arg0.field3569;
        int var16 = arg0.field3572;
        if (var7 < (class664.field9506 + var5)) {
            var7 = class664.field9506;
            var15 = var5 / 2 + class664.field9506 + var6 + (var10 / 2) + 5;
        } else if (var7 > (class664.field9505 - var5)) {
            var15 = class664.field9505 - (var5 / 2) - var6 - (var10 / 2) - 5;
            var7 = class664.field9505 - var5;
        }
        if (var8 < (class664.field9504 + var5)) {
            var16 = class664.field9504 + var6 + (var5 / 2);
            var8 = class664.field9504;
        } else if (class664.field9510 - var5 < var8) {
            var8 = class664.field9510 - var5;
            var16 = class664.field9510 - var5 / 2 - var11 - var6;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg0.field3569), (double) (var8 - arg0.field3572)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method3134((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field6585 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = var9 * class611.field8741.method2070() + var16 + 3;
            var20 = var18 + var10 + 10;
            if (arg2.field6599 != 0) {
                arg1.method3263((byte) -114, var18, var21 - var16, -var18 + var20, var16, arg2.field6599);
            }
            if (arg2.field6589 != 0) {
                arg1.method3261(var18, var16, -21307, var21 - var16, -var18 + var20, arg2.field6589);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class558.field8113[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class611.field8741.method2069(arg1, var23, var15, var16, arg2.field6573, true);
                var16 += class611.field8741.method2070();
            }
        }
        if (arg2.field6580 == -1 && arg2.field6585 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class98 var25 = new class98(arg0);
        var25.field1404 = var18;
        var25.field1400 = var20;
        var25.field1402 = var7 - var24;
        var25.field1397 = var19;
        var25.field1403 = var8 - var24;
        var25.field1396 = var7 + var24;
        var25.field1406 = var21;
        var25.field1401 = var8 + var24;
        class524.field7613.method3559(var25, (byte) 12);
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(ILla;Lla;)V")
    public class488(int arg0, class423 arg1, class423 arg2) {
        this.field7034 = arg1;
        this.field7038 = arg2;
        if (this.field7034 != null) {
            this.field7034.method2616(0, 0);
        }
        if (this.field7038 != null) {
            this.field7038.method2616(0, 0);
        }
    }
}
