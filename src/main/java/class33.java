import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class33 {

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "Lgd;")
    public static class206 field501 = new class206(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "Lh;")
    public static class434 field504 = new class434(12, 3);

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "Lad;")
    public static class268 field505 = new class268(64);

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field506 = -1;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "S")
    public static short field509 = 320;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "S")
    public static short field507 = 32767;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public static int field510 = 0;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "Lr;")
    public static class110 field511;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ljava/lang/String;ILbt;)I")
    public static final int method250(String arg0, int arg1, class32 arg2) {
        field503++;
        int var3 = arg2.field456;
        byte[] var4 = class132.method806(arg0, (byte) 95);
        arg2.method210((byte) -115, var4.length);
        arg2.field456 += class187.field2561.method2857(arg2.field472, var4, -96, arg1, arg2.field456, var4.length);
        return arg2.field456 - var3;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public static final void method251(int arg0) {
        field498++;
        class30.field393 = new class100(8);
        class244.field3245 = arg0;
        for (class256 var1 = (class256) class125.field1822.method2764((byte) -121); var1 != null; var1 = (class256) class125.field1822.method2769(true)) {
            var1.method1439();
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([[BBLbu;)V")
    public static final void method252(byte[][] arg0, byte arg1, class17 arg2) {
        field499++;
        if (arg1 >= -9) {
            return;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field6813; var4++) {
            class183.method1073(-1);
            for (int var5 = 0; var5 < (class295.field3947 >> 3); var5++) {
                for (int var6 = 0; var6 < (class39.field567 >> 3); var6++) {
                    boolean var7 = false;
                    int var8 = class137.field1993[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3CB89D5) >> 24;
                        if (!arg2.field6802 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = (var8 & 0xFFC1EE) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class306.field4050.length; var14++) {
                                if (class306.field4050[var14] == var13 && arg0[var14] != null) {
                                    class32 var15 = new class32(arg0[var14]);
                                    arg2.method2843(var5 * 8, var12, var15, class60.field805, var11, var6 * 8, var10, var9, var4, 7);
                                    arg2.method105(var15, var6 * 8, var4, var9, var12, var11, class98.field1432, var3[0] == -1 ? var3 : null, var5 * 8, var10, -102);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        arg2.method2844(8, var6 * 8, var5 * 8, (byte) 90, 8, var4);
                    }
                }
            }
        }
        if (var3[0] == -1) {
            class11.field147 = null;
        } else {
            class11.field147 = class391.field5430.method1643(var3[0], var3[1], var3[2], class135.field1973, var3[3], (byte) -113);
            class143.field2057 = var3[4];
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
    public static void method253(boolean arg0) {
        field511 = null;
        if (arg0) {
            method254(-57, (byte) -82, 107);
        }
        field504 = null;
        field505 = null;
        field501 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IBI)V")
    public static final void method254(int arg0, byte arg1, int arg2) {
        field508++;
        if (arg1 <= 81) {
            field509 = 93;
        }
        class106 var3 = class250.method1400(12, -27, arg2);
        var3.method658(0);
        var3.field1589 = arg0;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILbt;B)Ljava/lang/String;")
    public static final String method255(int arg0, class32 arg1, byte arg2) {
        field502++;
        try {
            int var3 = arg1.method203((byte) -121);
            int var4 = 79 / ((arg2 - 16) / 62);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var5 = new byte[var3];
            arg1.field456 += class187.field2561.method2860(var3, var5, 0, arg1.field456, 106, arg1.field472);
            return class68.method450(0, var5, var3, 124);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }
}
