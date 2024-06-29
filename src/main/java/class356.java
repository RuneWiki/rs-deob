import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class356 {

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
    public static int[] field5267 = new int[32];

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public int field5268;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public int field5273;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public int field5274;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public int field5275;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Z")
    public static boolean field5272;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[Lid;")
    public static class181[] field5270;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B[[[Lvt;)V")
    public static final void method2271(byte arg0, class281[][][] arg1) {
        field5271++;
        int var2 = 0;
        if (arg0 != -4) {
            field5270 = null;
        }
        while (var2 < arg1.length) {
            class281[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class281 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field4371 instanceof class161) {
                            ((class161) var6.field4371).method106(-19159);
                        }
                        if (var6.field4376 instanceof class161) {
                            ((class161) var6.field4376).method106(-19159);
                        }
                        if (var6.field4389 instanceof class161) {
                            ((class161) var6.field4389).method106(-19159);
                        }
                        if (var6.field4380 instanceof class161) {
                            ((class161) var6.field4380).method106(-19159);
                        }
                        if (var6.field4390 instanceof class161) {
                            ((class161) var6.field4390).method106(-19159);
                        }
                        for (class21 var7 = var6.field4381; var7 != null; var7 = var7.field235) {
                            class76 var8 = var7.field240;
                            if (var8 instanceof class161) {
                                ((class161) var8).method106(-19159);
                            }
                        }
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
    public static final void method2272(int arg0, int arg1) {
        field5269++;
        if (!class31.method189(14, arg1)) {
            return;
        }
        int var2 = 120 / ((arg0 - 35) / 61);
        class38[] var3 = class237.field3555[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class38 var5 = var3[var4];
            if (var5 != null) {
                var5.field487 = 1;
                var5.field486 = 0;
                var5.field509 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method2273(int arg0) {
        field5267 = null;
        if (arg0 > -32) {
            field5270 = null;
        }
        field5270 = null;
    }

    static {
        new class179(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
    }
}
