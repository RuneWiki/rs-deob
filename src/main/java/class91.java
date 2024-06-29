import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class91 extends class200 {

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    private int field1622 = 585;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "S")
    public static short field1613 = 1;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "[I")
    public static int[] field1620 = new int[2000];

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field1614 = 0;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "Lid;")
    public static class149 field1624 = class60.method382("Update)2Liste geladen)3", (byte) 30);

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field1621 = 0;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int var4 = class93.field1644[arg0];
            for (int var5 = 0; ~class137.field2515 < ~var5; ++var5) {
                int var6 = class73.field1263[var5];
                if (this.field1622 < var6 && ~var6 > ~(4096 - this.field1622) && -this.field1622 + 2048 < var4 && var4 < this.field1622 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1622 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (var6 > -this.field1622 + 2048 && ~(this.field1622 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1622;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1622 + 2048);
                } else if (~var4 <= ~this.field1622 && ~(-this.field1622 + 4096) <= ~var4) {
                    if (~this.field1622 >= ~var6 && ~var6 >= ~(-this.field1622 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1622 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field1622;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1622 + 2048);
                }
            }
        }
        ++field1617;
        if (arg1 != 55) {
            field1613 = 32;
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lal;I)V")
    public static final void method666(class230 arg0, int arg1) {
        ++field1616;
        class195.field3491 = class84.method626(arg0, -110, class134.field2441);
        class197.field3566 = new int[256];
        for (int var2 = arg1; ~var2 > -4; ++var2) {
            int var4 = (16711680 & class248.field4349[var2 - -1]) >> 16;
            float var5 = (float) ((class248.field4349[var2] & 16711680) >> 16);
            float var6 = ((float) var4 - var5) / 64.0F;
            float var7 = (float) ((65280 & class248.field4349[var2]) >> 8);
            int var8 = (class248.field4349[var2 + 1] & 65280) >> 8;
            float var9 = ((float) var8 - var7) / 64.0F;
            float var10 = (float) (255 & class248.field4349[var2]);
            int var11 = 255 & class248.field4349[var2 + 1];
            float var12 = ((float) var11 + -var10) / 64.0F;
            for (int var13 = 0; ~var13 > -65; ++var13) {
                class197.field3566[var2 * 64 + var13] = class40.method238((int) var10, class40.method238((int) var7 << 8, (int) var5 << 16));
                var7 += var9;
                var10 += var12;
                var5 += var6;
            }
        }
        for (int var3 = 192; ~var3 > -256; ++var3) {
            class197.field3566[var3] = class248.field4349[3];
        }
        class67.field1177 = new int[32768];
        class36.field532 = new int[32768];
        class263.method1828(-48, (class282) null);
        class147.field2660 = new int[32768];
        class37.field553 = new int[32768];
        class173.field3185 = new class46(128, 254);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
    public static void method667(int arg0) {
        field1624 = null;
        if (arg0 != 2823) {
            field1614 = -99;
        }
        field1620 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        ++field1619;
        if (!arg1) {
            method666((class230) null, -62);
        }
        if (~arg2 == -1) {
            this.field1622 = arg0.method485(-2386);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lg;")
    public static final class276 method668(Throwable arg0, String arg1) {
        ++field1623;
        class276 var2;
        if (!(arg0 instanceof class276)) {
            var2 = new class276(arg0, arg1);
        } else {
            var2 = (class276) arg0;
            var2.field4940 = var2.field4940 + ' ' + arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V")
    public static final void method669(byte arg0) {
        ++field1618;
        for (class18 var1 = (class18) class193.field3456.method1140(0); var1 != null; var1 = (class18) class193.field3456.method1127(0)) {
            if (~var1.field258 < -1) {
                --var1.field258;
            }
            if (~var1.field258 != -1) {
                if (~var1.field272 < -1) {
                    --var1.field272;
                }
                if (~var1.field272 == -1 && var1.field263 >= 1 && ~var1.field280 <= -2 && ~var1.field263 >= -103 && ~var1.field280 >= -103 && (~var1.field278 > -1 || class175.method1242(var1.field278, 67, var1.field269))) {
                    class246.method1714(var1.field269, var1.field260, var1.field278, (byte) -26, var1.field266, var1.field263, var1.field281, var1.field280);
                    var1.field272 = -1;
                    if (~var1.field278 == ~var1.field277 && var1.field277 == -1) {
                        var1.method401((byte) -118);
                    } else if (~var1.field278 == ~var1.field277 && var1.field281 == var1.field268 && var1.field270 == var1.field269) {
                        var1.method401((byte) -118);
                    }
                }
            } else if (~var1.field277 > -1 || class175.method1242(var1.field277, 69, var1.field270)) {
                class246.method1714(var1.field270, var1.field260, var1.field277, (byte) -44, var1.field266, var1.field263, var1.field268, var1.field280);
                var1.method401((byte) -118);
            }
        }
        if (arg0 >= -102) {
            field1624 = null;
        }
    }
}
