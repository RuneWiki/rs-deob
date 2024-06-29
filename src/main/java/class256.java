import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class256 {

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Lde;")
    public static class109 field4417 = null;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Loa;")
    public static class99 field4415 = class221.method1463(2844, ")2");

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Loa;")
    public static class99 field4418 = class221.method1463(2844, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public int field4423;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "Loa;")
    public class99 field4421;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static final void method1652(int arg0) {
        field4416++;
        if (arg0 != 0) {
            return;
        }
        for (class288 var1 = (class288) class254.field4397.method529(10); var1 != null; var1 = (class288) class254.field4397.method533(-106)) {
            if (var1.field5049 == -1) {
                var1.field5038 = 0;
                class189.method1289(var1, 0);
            } else {
                var1.method828((byte) 2);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZB)V")
    public static final void method1653(boolean arg0, byte arg1) {
        field4425++;
        int var2 = -25 / ((84 - arg1) / 37);
        byte var3 = 4;
        byte[][] var4 = class123.field2155;
        for (int var5 = 0; var5 < var3; var5++) {
            class225.method1485(0);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class119.field2106[var5][var6][var7];
                    boolean var9 = false;
                    if (var8 != -1) {
                        int var10 = var8 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = var8 >> 1 & 0x3;
                            int var12 = (var8 & 0xFFD03D) >> 14;
                            int var13 = (var8 & 0x3FFC) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class171.field3042.length; var15++) {
                                if (class171.field3042[var15] == var14 && var4[var15] != null) {
                                    var9 = true;
                                    class12.method79(var11, var5, var4[var15], class177.field3091, var6 * 8, var7 * 8, 4, var10, (var12 & 0x7) * 8, arg0, (var13 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var9) {
                        class107.method743(var5, var6 * 8, 8, (byte) -55, var7 * 8, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)Z")
    public static final boolean method1654(byte arg0, int arg1) {
        if (arg0 < 100) {
            method1655(28, (byte) -121);
        }
        field4420++;
        return ((arg1 & 0x2FE1BE0B) >> 29) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V")
    public static final void method1655(int arg0, byte arg1) {
        field4422++;
        class65 var2 = class152.method1010(arg0, 12, (byte) -115);
        int var3 = -100 % ((arg1 + 64) / 37);
        var2.method426((byte) -115);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(BI)I")
    public static final int method1656(byte arg0, int arg1) {
        if (arg0 != 18) {
            field4424 = 39;
        }
        field4419++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static void method1657(int arg0) {
        field4418 = null;
        if (arg0 != 8) {
            method1653(false, (byte) 34);
        }
        field4415 = null;
        field4417 = null;
    }
}
