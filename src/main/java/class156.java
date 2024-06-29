import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class156 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field2395;

    static {
        new class157("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        new class157("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lza;BILat;I)V", line = 12)
    public static final void method1120(class295 arg0, byte arg1, int arg2, class444 arg3, int arg4) {
        int var5 = -22 / ((-arg1 - 27) / 63);
        field2392++;
        class336 var6 = arg3.method2619(17042, arg0);
        if (var6 == null) {
            return;
        }
        arg0.method511(arg4, arg2, arg4 + arg3.field6470, arg3.field6453 + arg2);
        if (class195.field2827 == 2 || class195.field2827 == 5 || class527.field7694 == null) {
            arg0.method523(-16777216, var6, arg4, arg2);
            return;
        }
        int var7;
        int var8;
        int var9;
        int var10;
        if (class247.field3363 == 4) {
            var7 = class387.field5569;
            var8 = (int) (-class191.field2797) & 0x3FFF;
            var9 = class102.field1606;
            var10 = 4096;
        } else {
            var7 = class81.field1158.field6284;
            var10 = 4096 - (class532.field7816 * 16);
            var9 = class81.field1158.field6287;
            var8 = (int) (-class191.field2797) + class457.field6666 & 0x3FFF;
        }
        int var11 = var7 / 32 + 48 - ((class9.field111 - 104) * 2);
        int var12 = class192.field2809 * 4 + 48 - (var9 / 32) - ((class192.field2809 + -104) * 2);
        class527.field7694.method2139((float) arg3.field6470 / 2.0F + (float) arg4, (float) arg3.field6453 / 2.0F + (float) arg2, (float) var11, (float) var12, var10, var8 << 2, var6, arg4, arg2);
        for (class437 var13 = (class437) class265.field3570.method3137(0); var13 != null; var13 = (class437) class265.field3570.method3132(0)) {
            int var59 = var13.field6308;
            int var60 = ((class533.field7851.field6243[var59] & 0xFFFEA38) >> 14) - class110.field1775;
            int var61 = (class533.field7851.field6243[var59] & 0x3FFF) - class399.field5727;
            int var62 = var60 * 4 + 2 - (var7 / 32);
            int var63 = var61 * 4 + 2 - (var9 / 32);
            class319.method1833(class533.field7851.field6240[var59], 0, var6, var62, arg0, arg4, var63, arg2, arg3);
        }
        for (int var14 = 0; var14 < class137.field2069; var14++) {
            int var56 = class50.field713[var14] * 4 + 2 - (var7 / 32);
            int var57 = class373.field5357[var14] * 4 + 2 - var9 / 32;
            class103 var58 = class452.field6629.method603((byte) 94, class75.field1060[var14]);
            if (var58.field1613 != null) {
                var58 = var58.method795(-31036, class309.field4200);
                if (var58 == null || var58.field1636 == -1) {
                    continue;
                }
            }
            class319.method1833(var58.field1636, 0, var6, var56, arg0, arg4, var57, arg2, arg3);
        }
        for (class292 var15 = (class292) class484.field6966.method1588(14); var15 != null; var15 = (class292) class484.field6966.method1582(-119)) {
            int var51 = (int) (var15.field6883 >> 28 & 0x3L);
            if (class41.field615 == var51) {
                int var52 = (int) (var15.field6883 & 0x3FFFL) - class110.field1775;
                int var53 = (int) (var15.field6883 >> 14 & 0x3FFFL) - class399.field5727;
                int var54 = var52 * 4 + 2 - (var7 / 32);
                int var55 = var53 * 4 + 2 - var9 / 32;
                class419.method2475(var6, (byte) -115, arg3, arg4, class291.field3949[0], var54, var55, arg2);
            }
        }
        for (int var16 = 0; var16 < class273.field3692; var16++) {
            class326 var46 = (class326) class281.field3826.method1592((byte) -25, (long) class159.field2416[var16]);
            if (var46 != null) {
                class209 var47 = var46.field4455;
                if (var47.method1334((byte) -124) && class81.field1158.field6279 == var47.field6279) {
                    class83 var48 = var47.field2976;
                    if (var48 != null && var48.field1272 != null) {
                        var48 = var48.method655(class309.field4200, (byte) 122);
                    }
                    if (var48 != null && var48.field1282 && var48.field1277) {
                        int var49 = var47.field6284 / 32 - (var7 / 32);
                        int var50 = var47.field6287 / 32 - (var9 / 32);
                        if (var48.field1219 == -1) {
                            class419.method2475(var6, (byte) -94, arg3, arg4, class291.field3949[1], var49, var50, arg2);
                        } else {
                            class319.method1833(var48.field1219, 0, var6, var49, arg0, arg4, var50, arg2, arg3);
                        }
                    }
                }
            }
        }
        int var17 = class210.field3001;
        int[] var18 = class169.field2570;
        for (int var19 = 0; var19 < var17; var19++) {
            class487 var38 = class45.field642[var18[var19]];
            if (var38 != null && var38.method2884((byte) -75) && class81.field1158 != var38 && class81.field1158.field6279 == var38.field6279) {
                int var39 = var38.field6284 / 32 - (var7 / 32);
                int var40 = var38.field6287 / 32 - (var9 / 32);
                boolean var41 = false;
                for (int var42 = 0; var42 < class399.field5724; var42++) {
                    if (var38.field7036.equals(class494.field7148[var42]) && class423.field6155[var42] != 0) {
                        var41 = true;
                        break;
                    }
                }
                boolean var43 = false;
                for (int var44 = 0; var44 < class167.field2554; var44++) {
                    if (var38.field7036.equals(class347.field4994[var44].field3345)) {
                        var43 = true;
                        break;
                    }
                }
                boolean var45 = false;
                if (class81.field1158.field7005 != 0 && var38.field7005 != 0 && class81.field1158.field7005 == var38.field7005) {
                    var45 = true;
                }
                if (var38.field7046) {
                    class419.method2475(var6, (byte) -122, arg3, arg4, class291.field3949[6], var39, var40, arg2);
                } else if (var41) {
                    class419.method2475(var6, (byte) -125, arg3, arg4, class291.field3949[3], var39, var40, arg2);
                } else if (var43) {
                    class419.method2475(var6, (byte) -120, arg3, arg4, class291.field3949[5], var39, var40, arg2);
                } else if (var45) {
                    class419.method2475(var6, (byte) -116, arg3, arg4, class291.field3949[4], var39, var40, arg2);
                } else {
                    class419.method2475(var6, (byte) -98, arg3, arg4, class291.field3949[2], var39, var40, arg2);
                }
            }
        }
        class449[] var20 = class413.field5884;
        for (int var21 = 0; var21 < var20.length; var21++) {
            class449 var24 = var20[var21];
            if (var24 != null && var24.field6572 != 0 && class28.field417 % 20 < 10) {
                if (var24.field6572 == 1) {
                    class326 var25 = (class326) class281.field3826.method1592((byte) -25, (long) var24.field6581);
                    if (var25 != null) {
                        class209 var26 = var25.field4455;
                        int var27 = var26.field6284 / 32 - (var7 / 32);
                        int var28 = var26.field6287 / 32 - var9 / 32;
                        class9.method67(var6, 360000L, var28, arg2, var27, 21075, arg4, var24.field6577, arg3);
                    }
                }
                if (var24.field6572 == 2) {
                    int var29 = var24.field6571 / 32 - (var7 / 32);
                    int var30 = var24.field6574 / 32 - (var9 / 32);
                    long var31 = (long) (var24.field6580 << 5);
                    long var33 = var31 * var31;
                    class9.method67(var6, var33, var30, arg2, var29, 21075, arg4, var24.field6577, arg3);
                }
                if (var24.field6572 == 10 && var24.field6581 >= 0 && class45.field642.length > var24.field6581) {
                    class487 var35 = class45.field642[var24.field6581];
                    if (var35 != null) {
                        int var36 = var35.field6284 / 32 - (var7 / 32);
                        int var37 = var35.field6287 / 32 - (var9 / 32);
                        class9.method67(var6, 360000L, var37, arg2, var36, 21075, arg4, var24.field6577, arg3);
                    }
                }
            }
        }
        if (class247.field3363 == 4) {
            return;
        }
        if (class71.field1023 != 0) {
            int var22 = class71.field1023 * 4 + class81.field1158.method116(8569) * 2 - (var7 / 32);
            int var23 = class506.field7400 * 4 + 2 - var9 / 32 - (-(class81.field1158.method116(8569) * 2) - -2);
            class419.method2475(var6, (byte) -100, arg3, arg4, class239.field3301[class192.field2807 ? 1 : 0], var22, var23, arg2);
        }
        arg0.method1712(3, 0, -1, 3, arg3.field6453 / 2 + arg2 - 1, arg3.field6470 / 2 + arg4 + -1);
        return;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILmk;I)V", line = 318)
    public static final void method1121(int arg0, int arg1, class382 arg2, int arg3) {
        if (arg1 == 32) {
            class119.field1860[arg3][arg0] = arg2;
            field2394++;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 329)
    public static final void method1122(byte arg0) {
        field2395++;
        if (!class332.field4519) {
            return;
        }
        class526.field7675 = null;
        class61.field884 = null;
        class332.field4519 = false;
        if (arg0 != -8) {
            method1121(-70, 127, null, 77);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)S", line = 350)
    public static final short method1123(int arg0, int arg1) {
        field2393++;
        int var2 = arg0 >> 10 & 0x3F;
        if (arg1 >= -82) {
            return 91;
        }
        int var3 = (arg0 & 0x381) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }
}
