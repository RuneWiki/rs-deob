import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class524 {

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "F")
    public float field7742 = 0.25F;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "F")
    public float field7746 = 1.0F;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "F")
    public float field7739 = 1.0F;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public int field7735;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public int field7747;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public int field7745;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Lkc;")
    public class87 field7734;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public int field7740;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "F")
    public float field7736;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public int field7748;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "F")
    public float field7741;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public int field7738;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "F")
    public float field7733;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lud;")
    public static class27 field7737 = new class27(8, 0, 4, 1);

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field7751 = 0;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "[I")
    public static int[] field7752 = new int[4];

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "Lkg;")
    public static class179 field7755;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field7753;

    static {
        new class335("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field7754 = -1;
        new class335("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field7755 = new class179(53, 7);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)Z", line = 10)
    public static final boolean method3124(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field7749++;
            return (arg2 & 0x180) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILqc;)Z", line = 21)
    public final boolean method3125(int arg0, class524 arg1) {
        if (arg0 != -7348) {
            field7755 = null;
        }
        field7750++;
        return this.field7748 == arg1.field7748 && this.field7736 == arg1.field7736 && this.field7733 == arg1.field7733 && this.field7741 == arg1.field7741 && this.field7742 == arg1.field7742 && this.field7746 == arg1.field7746 && this.field7739 == arg1.field7739 && this.field7745 == arg1.field7745 && this.field7740 == arg1.field7740 && this.field7734 == arg1.field7734;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lfh;B)V", line = 37)
    public final void method3126(class463 arg0, byte arg1) {
        field7744++;
        if (arg1 < 18) {
            method3129((byte) -5);
        }
        this.field7746 = (float) (arg0.method2737(false) * 8) / 255.0F;
        this.field7742 = (float) (arg0.method2737(false) * 8) / 255.0F;
        this.field7739 = (float) (arg0.method2737(false) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lkv;)V", line = 53)
    public static final void method3127(class177 arg0) {
        if (class180.field2382 >= 65535) {
            return;
        }
        class256 var1 = arg0.field2337;
        class187.field2441[class180.field2382] = arg0;
        class119.field1615[class180.field2382] = false;
        class180.field2382++;
        int var2 = arg0.field2343;
        if (arg0.field2340) {
            var2 = 0;
        }
        int var3 = arg0.field2343;
        if (arg0.field2332) {
            var3 = field7753 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method1537(-409134460) + class59.field772 - var1.method1534((byte) 88) >> class94.field1144;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method1537(-409134460) + var1.method1534((byte) -94) - class59.field772 >> class94.field1144;
            if (var7 >= class105.field1336) {
                var7 = class105.field1336 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field2345[var5++];
                int var10 = (var1.method1539((byte) 60) + class59.field772 - var1.method1534((byte) 58) >> class94.field1144) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class470.field6825) {
                    var11 = class470.field6825 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class470.field6828[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class470.field6828[var4][var12][var8] = var13 | (long) class180.field2382;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class470.field6828[var4][var12][var8] = var13 | (long) class180.field2382 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class470.field6828[var4][var12][var8] = var13 | (long) class180.field2382 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class470.field6828[var4][var12][var8] = var13 | (long) class180.field2382 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V", line = 260)
    public class524() {
        this.field7735 = -50;
        this.field7747 = -60;
        this.field7745 = class401.field5717;
        this.field7734 = class377.field4960;
        this.field7740 = 0;
        this.field7736 = 1.1523438F;
        this.field7748 = class60.field782;
        this.field7741 = 1.2F;
        this.field7738 = -50;
        this.field7733 = 0.69921875F;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lfh;)V", line = 288)
    public class524(class463 arg0) {
        int var2 = arg0.method2737(false);
        if (class407.field5817.method1684(-2, class377.field4959) && class303.field3890.method314() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field7748 = class60.field782;
            } else {
                this.field7748 = arg0.method2727(-126);
            }
            if ((var2 & 0x2) == 0) {
                this.field7736 = 1.1523438F;
            } else {
                this.field7736 = (float) arg0.method2758((byte) 90) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field7733 = 0.69921875F;
            } else {
                this.field7733 = (float) arg0.method2758((byte) 98) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field7741 = 1.2F;
            } else {
                this.field7741 = (float) arg0.method2758((byte) 108) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2727(-116);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2758((byte) 101);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2758((byte) 82);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2758((byte) 93);
            }
            this.field7736 = 1.1523438F;
            this.field7733 = 0.69921875F;
            this.field7748 = class60.field782;
            this.field7741 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field7735 = -50;
            this.field7747 = -60;
            this.field7738 = -50;
        } else {
            this.field7738 = arg0.method2791(true);
            this.field7747 = arg0.method2791(true);
            this.field7735 = arg0.method2791(true);
        }
        if ((var2 & 0x20) == 0) {
            this.field7745 = class401.field5717;
        } else {
            this.field7745 = arg0.method2727(-91);
        }
        if ((var2 & 0x40) == 0) {
            this.field7740 = 0;
        } else {
            this.field7740 = arg0.method2758((byte) 103);
        }
        if ((var2 & 0x80) == 0) {
            this.field7734 = class377.field4960;
        } else {
            int var3 = arg0.method2758((byte) 113);
            int var4 = arg0.method2758((byte) 121);
            int var5 = arg0.method2758((byte) 106);
            int var6 = arg0.method2758((byte) 102);
            int var7 = arg0.method2758((byte) 99);
            int var8 = arg0.method2758((byte) 112);
            this.field7734 = class350.method2010(var6, var4, var8, var3, var5, -8076, var7);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II[Lhd;)V", line = 149)
    public static final void method3128(int arg0, int arg1, class523[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class523 var4 = arg2[var3];
            if (var4 != null && var4.field7673 == arg1 && !client.method1238(var4)) {
                if (var4.field7632 == 0) {
                    method3128(24563, var4.field7723, arg2);
                    if (var4.field7717 != null) {
                        method3128(24563, var4.field7723, var4.field7717);
                    }
                    class175 var5 = (class175) class397.field5684.method2022(-1, (long) var4.field7723);
                    if (var5 != null) {
                        class200.method1266(3568, var5.field2279);
                    }
                }
                if (var4.field7632 == 6 && var4.field7703 != -1) {
                    class415 var6 = class404.field5756.method557(var4.field7703, 15);
                    if (var6 != null) {
                        var4.field7627 += class250.field3207;
                        while (var6.field5915[var4.field7698] < var4.field7627) {
                            var4.field7627 -= var6.field5915[var4.field7698];
                            var4.field7698++;
                            if (var4.field7698 >= var6.field5927.length) {
                                var4.field7698 -= var6.field5909;
                                if (var4.field7698 < 0 || var4.field7698 >= var6.field5927.length) {
                                    var4.field7698 = 0;
                                }
                            }
                            var4.field7691 = var4.field7698 + 1;
                            if (var4.field7691 >= var6.field5927.length) {
                                var4.field7691 -= var6.field5909;
                                if (var4.field7691 < 0 || var4.field7691 >= var6.field5927.length) {
                                    var4.field7691 = -1;
                                }
                            }
                            class136.method935(var4, -124);
                        }
                    }
                }
            }
        }
        if (arg0 == 24563) {
            field7743++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 246)
    public static void method3129(byte arg0) {
        if (arg0 <= 8) {
            field7751 = -61;
        }
        field7737 = null;
        field7755 = null;
        field7752 = null;
    }
}
