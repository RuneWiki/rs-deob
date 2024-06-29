import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class49 {

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "[S")
    public static short[] field626 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "Ldp;")
    public static class347 field629 = new class347("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "Ljv;")
    public static class483 field630;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "Lok;")
    public static class74 field625;

    static {
        new class347("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 4)
    public static final void method367(int arg0) {
        field628++;
        if (class454.field6661.method1534(class113.field1723, (byte) 112) != 2) {
            return;
        }
        if (arg0 != -17675) {
            field625 = null;
        }
        byte var1 = (byte) (class439.field6459 - 4 & 0xFF);
        int var2 = class439.field6459 % class50.field640;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class448.field6611; var16++) {
                class274.field4082[var3][var2][var16] = var1;
            }
        }
        if (class521.field7651 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class349.field5380[var4] = -1000000;
            class52.field671[var4] = 1000000;
            class455.field6666[var4] = 0;
            class12.field119[var4] = 1000000;
            class170.field2499[var4] = 0;
        }
        if (class350.field5388 != 1) {
            int var15 = class50.method373(class521.field7651, 14966, class393.field5897, class282.field4263);
            if (var15 - class201.field2925 >= 800 || (class524.field7736[class521.field7651][class282.field4263 >> 7][class393.field5897 >> 7] & 0x4) == 0) {
                return;
            }
            class350.method2115(class393.field5897 >> 7, 1, false, (byte) 85, class236.field3305, class282.field4263 >> 7);
            return;
        }
        if ((class524.field7736[class521.field7651][class410.field6198.field7681 >> 7][class410.field6198.field7671 >> 7] & 0x4) != 0) {
            class350.method2115(class410.field6198.field7671 >> 7, 0, false, (byte) 85, class236.field3305, class410.field6198.field7681 >> 7);
        }
        if (class350.field5383 >= 2560) {
            return;
        }
        int var5 = class282.field4263 >> 7;
        int var6 = class393.field5897 >> 7;
        int var7 = class410.field6198.field7681 >> 7;
        int var8 = class410.field6198.field7671 >> 7;
        int var9;
        if (var7 > var5) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var8 > var6) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        if ((var9 != 0 || var10 != 0) && -class50.field640 < var9 && var9 < class50.field640 && var10 > -class448.field6611 && class448.field6611 > var10) {
            if (var9 <= var10) {
                int var11 = var9 * 65536 / var10;
                int var12 = 32768;
                while (var6 != var8) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class524.field7736[class521.field7651][var5][var6] & 0x4) != 0) {
                        class350.method2115(var6, 1, false, (byte) 85, class236.field3305, var5);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var5 < var7) {
                            var5++;
                        } else if (var7 < var5) {
                            var5--;
                        }
                        var12 -= 65536;
                        if ((class524.field7736[class521.field7651][var5][var6] & 0x4) != 0) {
                            class350.method2115(var6, 1, false, (byte) 85, class236.field3305, var5);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var10 * 65536 / var9;
            int var14 = 32768;
            while (var5 != var7) {
                if (var7 > var5) {
                    var5++;
                } else if (var7 < var5) {
                    var5--;
                }
                if ((class524.field7736[class521.field7651][var5][var6] & 0x4) != 0) {
                    class350.method2115(var6, 1, false, (byte) 85, class236.field3305, var5);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    var14 -= 65536;
                    if ((class524.field7736[class521.field7651][var5][var6] & 0x4) != 0) {
                        class350.method2115(var6, 1, false, (byte) 85, class236.field3305, var5);
                        return;
                    }
                }
            }
            return;
        }
        class488.method2913(0, null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class267.field3979 + "," + class241.field3358);
        return;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V", line = 198)
    public static void method368(int arg0) {
        field625 = null;
        field626 = null;
        if (arg0 == 0) {
            field629 = null;
            field630 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)Ljava/lang/String;", line = 212)
    public static final String method369(int arg0, int arg1) {
        field627++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class529.field7786.method2103(class30.field430, (byte) 34) + " (" + var2 + ")</col>";
        } else {
            if (arg0 != 0) {
                field629 = null;
            }
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class302.field4490.method2103(class30.field430, (byte) 34) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)I", line = 253)
    public static final int method370(int arg0, int arg1) {
        return class282.field4269 == null ? 0 : class282.field4269[arg0][arg1] & 0xFF;
    }
}
