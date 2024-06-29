import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class34 extends class149 {

    @OriginalMember(owner = "client!ms", name = "K", descriptor = "[I")
    private int[] field528 = new int[3];

    @OriginalMember(owner = "client!ms", name = "M", descriptor = "I")
    private int field530 = 3216;

    @OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
    private int field527 = 4096;

    @OriginalMember(owner = "client!ms", name = "T", descriptor = "I")
    private int field537 = 3216;

    @OriginalMember(owner = "client!ms", name = "Q", descriptor = "Lpg;")
    public static class492 field534 = new class492(101, 7);

    @OriginalMember(owner = "client!ms", name = "U", descriptor = "[I")
    public static int[] field538 = new int[2];

    @OriginalMember(owner = "client!ms", name = "I", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ms", name = "L", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ms", name = "N", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!ms", name = "P", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!ms", name = "R", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!ms", name = "S", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!ms", name = "V", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!ms", name = "W", descriptor = "Lpu;")
    public static class408 field540;

    @OriginalMember(owner = "client!ms", name = "O", descriptor = "Lse;")
    public static class4 field532;

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
    public class34() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(B)V")
    public static void method255(byte arg0) {
        field534 = null;
        if (arg0 != 97) {
            method258((String) null, false, false, 74, -90L, -34, -124, -84, (String) null, true, (byte) 74);
        }
        field540 = null;
        field538 = null;
        field532 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
    public static final int method256(int arg0, String arg1, int arg2, String arg3) {
        ++field535;
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (-var8 + var6 < var4 || -var9 + var7 < var5) {
            if (~var4 >= ~(-var8 + var6)) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (~var8 != -1) {
                var22 = var8;
                boolean var23 = false;
            } else {
                var22 = arg1.charAt(var6++);
            }
            char var24;
            if (~var9 != -1) {
                var24 = var9;
                boolean var25 = false;
            } else {
                var24 = arg3.charAt(var7++);
            }
            var8 = class295.method1899(var22, -19091);
            var9 = class295.method1899(var24, -19091);
            char var26 = class493.method2927(arg0, var22, 121);
            char var27 = class493.method2927(arg0, var24, 121);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (~var28 != ~var29) {
                    return class127.method814(arg0, -109, var28) - class127.method814(arg0, -98, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var10 > var11; ++var11) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var16 = -var11 + -1 + var4;
                var17 = var5 + -1 + -var11;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg1.charAt(var16);
            char var19 = arg3.charAt(var17);
            if (var18 != var19 && ~Character.toUpperCase(var18) != ~Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (~var20 != ~var21) {
                    return class127.method814(arg0, -113, var20) + -class127.method814(arg0, -110, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (~var12 != -1) {
            return var12;
        } else {
            if (arg2 > -53) {
                method258((String) null, true, true, 58, 2L, -54, -67, -44, (String) null, true, (byte) 100);
            }
            for (int var13 = 0; var10 > var13; ++var13) {
                char var14 = arg1.charAt(var13);
                char var15 = arg3.charAt(var13);
                if (~var14 != ~var15) {
                    return class127.method814(arg0, -117, var14) + -class127.method814(arg0, -88, var15);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (arg0 >= -86) {
            method258((String) null, true, true, 13, 108L, 3, -127, 124, (String) null, false, (byte) -14);
        }
        this.method257((byte) 119);
        ++field531;
    }

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "(B)V")
    private final void method257(byte arg0) {
        ++field533;
        double var2 = Math.cos((double) ((float) this.field530 / 4096.0F));
        this.field528[0] = (int) (var2 * Math.sin((double) ((float) this.field537 / 4096.0F)) * 4096.0D);
        this.field528[1] = (int) (var2 * Math.cos((double) ((float) this.field537 / 4096.0F)) * 4096.0D);
        if (arg0 != 119) {
            this.method99(-51);
        }
        this.field528[2] = (int) (4096.0D * Math.sin((double) ((float) this.field530 / 4096.0F)));
        int var4 = this.field528[0] * this.field528[0] >> 12;
        int var5 = this.field528[1] * this.field528[1] >> 12;
        int var6 = this.field528[2] * this.field528[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field528[2] = (this.field528[2] << 12) / var7;
            this.field528[1] = (this.field528[1] << 12) / var7;
            this.field528[0] = (this.field528[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        ++field526;
        int[] var3 = super.field2152.method2891(arg1, (byte) 118);
        if (arg0 != -10835) {
            this.field537 = -95;
        }
        if (super.field2152.field7051) {
            int var4 = class331.field5121 * this.field527 >> 12;
            int[] var5 = this.method983(0, 24824, arg1 + -1 & class51.field694);
            int[] var6 = this.method983(0, 24824, arg1);
            int[] var7 = this.method983(0, 24824, class51.field694 & arg1 + 1);
            for (int var8 = 0; ~class316.field4838 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class320.field4897] + -var6[var8 - -1 & class320.field4897]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class180.field2569[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field528[2] * var16 >> 12;
                int var18 = this.field528[0] * var15 >> 12;
                int var19 = this.field528[1] * var14 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg1 != 35) {
            this.field527 = -90;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field530 = arg2.method631(10494);
                }
            } else {
                this.field537 = arg2.method631(arg1 + 10459);
            }
        } else {
            this.field527 = arg2.method631(10494);
        }
        ++field536;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/lang/String;ZZIJIIILjava/lang/String;ZB)V")
    public static final void method258(String arg0, boolean arg1, boolean arg2, int arg3, long arg4, int arg5, int arg6, int arg7, String arg8, boolean arg9, byte arg10) {
        ++field529;
        int[] var12 = new int[4];
        for (int var13 = 0; ~var13 > -4; ++var13) {
            var12[var13] = (int) (9.9999999E7D * Math.random());
        }
        class91 var14 = new class91(128);
        var14.method625(10, false);
        var14.method600((arg1 ? 2 : 0) | (arg2 ? 1 : 0) | (arg9 ? 4 : 0), -12891);
        var14.method614(arg4, false);
        var14.method615(28010, var12[0]);
        var14.method603(49, arg8);
        var14.method615(28010, var12[1]);
        var14.method600(class97.field1409, -12891);
        var14.method625(arg3, false);
        var14.method625(arg7, false);
        var14.method615(28010, var12[2]);
        var14.method600(arg5, -12891);
        var14.method600(arg6, -12891);
        var14.method615(28010, var12[3]);
        var14.method604(class353.field5470, class62.field883, true);
        class91 var15 = new class91(350);
        var15.method603(69, arg0);
        int var16 = -(class142.method951(-115, arg0) % 8) + 8;
        for (int var17 = 0; ~var16 < ~var17; ++var17) {
            var15.method625((int) (255.0D * Math.random()), false);
        }
        var15.method627(var12, (byte) -6);
        class75.field1006.field1292 = 0;
        class75.field1006.method625(class442.field6583.field2934, false);
        class75.field1006.method600(var14.field1292 - -var15.field1292 + 2, -12891);
        class75.field1006.method600(587, -12891);
        class75.field1006.method597(0, var14.field1277, false, var14.field1292);
        if (arg10 <= 100) {
            method258((String) null, true, false, 60, -93L, -104, 45, -49, (String) null, false, (byte) 78);
        }
        class75.field1006.method597(0, var15.field1277, false, var15.field1292);
        class35.field567 = 0;
        class443.field6602 = -3;
        class152.field2186 = 0;
        class16.field266 = 1;
    }

    static {
        new class375("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }
}
