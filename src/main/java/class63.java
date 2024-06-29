import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class63 {

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "[I")
    public static int[] field996;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "[[Z")
    public static boolean[][] field999;

    static {
        new class179("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field996 = new int[4096];
        field998 = 0;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 11)
    public static final void method424(int arg0) {
        field997++;
        int var1 = class424.field6231.method1389(255);
        class91.field1475 = class424.field6231.method1337((byte) 76);
        int var2 = class424.field6231.method1376(255);
        int var3 = class424.field6231.method1391(-118);
        boolean var4 = class424.field6231.method1392(arg0 ^ 0xBD7616CE) == 1;
        class523.method3118((byte) 54);
        class296.method1969((byte) 66, var2);
        class424.field6231.method2666(arg0 + 1116334484);
        int var5 = 0;
        if (arg0 != -1116334386) {
            method427((byte) 34, null, 29);
        }
        while (var5 < 4) {
            for (int var20 = 0; var20 < class338.field5076 >> 3; var20++) {
                for (int var21 = 0; var21 < class250.field4077 >> 3; var21++) {
                    int var22 = class424.field6231.method2671(-115, 1);
                    if (var22 == 1) {
                        class349.field5201[var5][var20][var21] = class424.field6231.method2671(-113, 26);
                    } else {
                        class349.field5201[var5][var20][var21] = -1;
                    }
                }
            }
            var5++;
        }
        class424.field6231.method2673((byte) 112);
        int var6 = (class429.field6369 - class424.field6231.field2982) / 16;
        class258.field4150 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class258.field4150[var7][var19] = class424.field6231.method1401(-69);
            }
        }
        class254.field4107 = new int[var6];
        class285.field4436 = new byte[var6][];
        class406.field6003 = new int[var6];
        class348.field5193 = null;
        class247.field3692 = new int[var6];
        class347.field5175 = new byte[var6][];
        class83.field1372 = new byte[var6][];
        class277.field4348 = new int[var6];
        class83.field1371 = null;
        class455.field6766 = new int[var6];
        class489.field7139 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class338.field5076 >> 3); var10++) {
                for (int var11 = 0; var11 < (class250.field4077 >> 3); var11++) {
                    int var12 = class349.field5201[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFF3B0) >> 14;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class277.field4348[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class277.field4348[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class254.field4107[var8] = class130.field1931.method737("m" + var17 + "_" + var18, arg0 + 1116334385);
                            class406.field6003[var8] = class130.field1931.method737("l" + var17 + "_" + var18, -1);
                            class247.field3692[var8] = class130.field1931.method737("um" + var17 + "_" + var18, -1);
                            class455.field6766[var8] = class130.field1931.method737("ul" + var17 + "_" + var18, -1);
                            var8++;
                        }
                    }
                }
            }
        }
        class182.method1273(var4, 10, var3, var1, -1);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V", line = 162)
    public static final void method425(int arg0, int arg1) {
        field1001++;
        class242 var2 = class13.field144;
        synchronized (class13.field144) {
            class13.field144.method1631(arg1, (byte) -19);
        }
        if (arg0 != 0) {
            field996 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V", line = 177)
    public static void method426(boolean arg0) {
        if (!arg0) {
            field999 = null;
            field996 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLum;I)Luj;", line = 197)
    public static final class480 method427(byte arg0, class83 arg1, int arg2) {
        field995++;
        byte[] var3 = arg1.method735(arg2, 0);
        if (arg0 < 112) {
            method426(true);
        }
        return var3 == null ? null : new class480(var3);
    }
}
