import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class423 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lpc;")
    private class473 field5785;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public int field5788;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Lpp;")
    public static class267 field5791;

    static {
        new class304("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILhq;I)V", line = 4)
    public static final void method2434(int arg0, class108 arg1, int arg2) {
        field5784++;
        boolean var3 = arg1.method756(7, 1) == 1;
        if (var3) {
            class191.field2695[class371.field4995++] = arg2;
        }
        int var4 = arg1.method756(7, 2);
        class515 var5 = class499.field6901[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field7610 = false;
            } else if (class391.field5305 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class212 var6 = class449.field6120[arg2] = new class212();
                var6.field2885 = (var5.field6261[0] + class401.field5382 >> 6 << 14) + (var5.field573 << 28) + (var5.field6266[0] + class421.field5762 >> 6);
                if (var5.field7611 == -1) {
                    var6.field2880 = var5.field6233.method1692(true);
                } else {
                    var6.field2880 = var5.field7611;
                }
                var6.field2881 = var5.field6202;
                var6.field2889 = var5.field7639;
                if (var5.field7602 > 0) {
                    class196.method1275(var5, 23088);
                }
                class499.field6901[arg2] = null;
                if (arg1.method756(7, 1) != 0) {
                    class203.method1306(4, arg2, arg1);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method756(7, 3);
            int var8 = var5.field6261[0];
            int var9 = var5.field6266[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field7615 = var8;
                var5.field7635 = var9;
                var5.field7610 = true;
            } else {
                var5.method3031(class150.field2133[arg2], (byte) 0, var8, var9);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method756(7, 4);
            int var11 = var5.field6261[0];
            int var12 = var5.field6266[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field7610 = true;
                var5.field7615 = var11;
                var5.field7635 = var12;
            } else {
                var5.method3031(class150.field2133[arg2], (byte) 0, var11, var12);
            }
        } else {
            int var13 = arg1.method756(7, 1);
            if (var13 == 0) {
                int var14 = arg1.method756(7, 12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field6261[0] + var16;
                int var19 = var5.field6266[0] + var17;
                if (var3) {
                    var5.field7635 = var19;
                    var5.field7610 = true;
                    var5.field7615 = var18;
                } else {
                    var5.method3031(class150.field2133[arg2], (byte) 0, var18, var19);
                }
                var5.field573 = (byte) (var5.field573 + var15 & 0x3);
                if (class391.field5305 == arg2) {
                    class411.field5656 = var5.field573;
                }
            } else {
                int var20 = arg1.method756(7, 30);
                int var21 = var20 >> 28;
                if (arg0 <= 36) {
                    method2435(-21, -68, -16, -5);
                }
                int var22 = (var20 & 0xFFFD7D4) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field6261[0] + class401.field5382 + var22 & 0x3FFF) - class401.field5382;
                int var25 = (var5.field6266[0] + var23 + class421.field5762 & 0x3FFF) - class421.field5762;
                if (var3) {
                    var5.field7615 = var24;
                    var5.field7635 = var25;
                    var5.field7610 = true;
                } else {
                    var5.method3031(class150.field2133[arg2], (byte) 0, var24, var25);
                }
                var5.field573 = (byte) (var5.field573 + var21 & 0x3);
                if (class391.field5305 == arg2) {
                    class411.field5656 = var5.field573;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)V", line = 327)
    public static final void method2435(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 12) {
            field5794 = 66;
        }
        field5790++;
        if (arg0 == 0) {
            class273.field3580++;
            class118.method822(-128, class111.field1588);
        }
        if (arg0 == 1) {
            class118.method822(-91, class105.field1549);
            class96.field1441++;
        }
        class193.field2708.method2188(class421.field5762 + arg2, 120);
        class193.field2708.method2209(5484, class32.field523.method305(82, (byte) 59) ? 1 : 0);
        class193.field2708.method2246(class401.field5382 + arg3, (byte) -77);
        class11.field239 = arg3;
        class497.field6888 = arg2;
        class413.field5717 = false;
        class56.method404(0);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)Lbp;", line = 356)
    public static final class261 method2436(int arg0, boolean arg1) {
        if (!arg1) {
            field5791 = null;
        }
        field5786++;
        class261 var2 = (class261) class199.field2764.method1456((long) arg0, 127);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class518.field7682.method2708(1, arg0, (byte) 54);
        class261 var4 = new class261();
        var4.field3455 = arg0;
        if (var3 != null) {
            var4.method1573(new class379(var3), true);
        }
        var4.method1580(0);
        if (var4.field3457 == 2 && class117.field1676.method182((long) arg0, (byte) 78) == null) {
            class117.field1676.method173((long) arg0, new class387(class427.field5835), (byte) 79);
            class289.field3787[class427.field5835++] = var4;
        }
        class199.field2764.method1462(var4, (long) arg0, -79);
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Frame;ZLjs;)V", line = 394)
    public static final void method2437(Frame arg0, boolean arg1, class216 arg2) {
        field5789++;
        while (true) {
            class446 var3 = arg2.method1362(-81, arg0);
            while (var3.field6100 == 0) {
                class94.method674(10L, 1);
            }
            if (var3.field6100 == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                if (!arg1) {
                    method2434(88, null, 7);
                    return;
                }
                return;
            }
            class94.method674(100L, 1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 421)
    public static final long method2438(String arg0, int arg1) {
        field5793++;
        int var2 = -64 % ((arg1 + 48) / 58);
        int var3 = arg0.length();
        long var4 = 0L;
        for (int var6 = 0; var6 < var3; var6++) {
            var4 = (var4 << 5) + (long) arg0.charAt(var6) - var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;ILmd;)I", line = 449)
    public static final int method2439(String arg0, int arg1, class379 arg2) {
        field5787++;
        if (arg1 != -3097) {
            method2437(null, true, null);
        }
        int var3 = arg2.field5173;
        byte[] var4 = class316.method1830(18714, arg0);
        arg2.method2203(var4.length, arg1 ^ 0xFFFFF3A8);
        arg2.field5173 += class226.field3055.method1190(var4, 15936, var4.length, arg2.field5152, arg2.field5173, 0);
        return arg2.field5173 - var3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lrb;ILpc;)V", line = 546)
    public class423(class234 arg0, int arg1, class473 arg2) {
        new class236(64);
        this.field5785 = arg2;
        this.field5788 = this.field5785.method2710(15, (byte) -115);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILpc;)I", line = 480)
    public static final int method2440(int arg0, class473 arg1) {
        field5792++;
        int var2 = 0;
        if (arg1.method2721(class514.field7591, (byte) 94)) {
            var2++;
        }
        if (arg1.method2721(class347.field4680, (byte) 95)) {
            var2++;
        }
        if (arg1.method2721(class183.field2607, (byte) 81)) {
            var2++;
        }
        if (arg0 != 5900) {
            return 62;
        }
        if (arg1.method2721(class402.field5394, (byte) 126)) {
            var2++;
        }
        if (arg1.method2721(class288.field3774, (byte) 114)) {
            var2++;
        }
        if (arg1.method2721(class23.field414, (byte) 126)) {
            var2++;
        }
        if (arg1.method2721(class355.field4798, (byte) 113)) {
            var2++;
        }
        if (arg1.method2721(class399.field5367, (byte) 110)) {
            var2++;
        }
        if (arg1.method2721(class73.field1107, (byte) 109)) {
            var2++;
        }
        if (arg1.method2721(class431.field5900, (byte) 90)) {
            var2++;
        }
        if (arg1.method2721(class49.field764, (byte) 113)) {
            var2++;
        }
        if (arg1.method2721(class296.field3868, (byte) 111)) {
            var2++;
        }
        if (arg1.method2721(class162.field2363, (byte) 122)) {
            var2++;
        }
        if (arg1.method2721(class56.field878, (byte) 125)) {
            var2++;
        }
        if (arg1.method2721(class522.field7716, (byte) 81)) {
            var2++;
        }
        if (arg1.method2721(class292.field3826, (byte) 124)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 559)
    public static void method2441(int arg0) {
        field5791 = null;
        if (arg0 != -25366) {
            method2441(-42);
        }
    }
}
