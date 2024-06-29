import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class133 {

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field3248 = 0;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Lr;")
    public static class118 field3249 = new class118(30);

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Loc;")
    public static class99 field3254 = class48.method402((byte) -104, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "Loc;")
    public static class99 field3256 = class48.method402((byte) -104, "blaugr-Un:");

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "Loc;")
    public static class99 field3258 = class48.method402((byte) -104, "Ausw-=hlen");

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "Loc;")
    public static class99 field3257 = class48.method402((byte) -104, "Sprites geladen)3");

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Loc;")
    public static class99 field3255 = class48.method402((byte) -104, "::qa_op_test");

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "Loc;")
    public static class99 field3260 = class48.method402((byte) -104, "Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    private int field3233;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "J")
    private long field3234;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "J")
    private long field3242;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Z")
    public boolean field3235;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "Z")
    public static boolean field3261;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[I")
    private int[] field3232;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "[I")
    private int[] field3245;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "[[[B")
    public static byte[][][] field3259;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    private final void method1072(int arg0) {
        long var2 = this.field3242;
        int var4 = this.field3232[9];
        int var5 = this.field3232[5];
        this.field3242 = 0L;
        field3244++;
        this.field3232[9] = var5;
        this.field3232[5] = var4;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field3242 <<= 0x4;
            if (this.field3232[var6] >= 256) {
                this.field3242 += this.field3232[var6] - 256;
            }
        }
        if (this.field3232[0] >= 256) {
            this.field3242 += this.field3232[0] - 256 >> 4;
        }
        if (this.field3232[1] >= 256) {
            this.field3242 += this.field3232[1] - 256 >> 8;
        }
        int var7 = 0;
        if (arg0 <= 43) {
            return;
        }
        while (var7 < 5) {
            this.field3242 <<= 0x3;
            this.field3242 += this.field3245[var7];
            var7++;
        }
        this.field3242 <<= 0x1;
        this.field3232[9] = var4;
        this.field3242 += this.field3235 ? 1 : 0;
        this.field3232[5] = var5;
        if (var2 != 0L && this.field3242 != var2) {
            class1.field21.method1000(-87, var2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lpc;Lpc;Lpc;I)V")
    public static final void method1073(class105 arg0, class105 arg1, class105 arg2, int arg3) {
        class66.field1707 = arg2;
        if (arg3 == 12) {
            class11.field257 = arg1;
            class9.field235 = arg0;
            field3250++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIZ)V")
    public final void method1074(int arg0, int arg1, boolean arg2) {
        if (arg1 < 116) {
            return;
        }
        field3240++;
        if (arg0 == 1 && this.field3235) {
            return;
        }
        int var4 = this.field3232[class3.field60[arg0]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class93 var5;
        do {
            if (arg2) {
                var4++;
                if (var4 >= class132.field3228) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class132.field3228 - 1;
                }
            }
            var5 = class63.method556(true, var4);
        } while (var5 == null || var5.field2249 || arg0 + (this.field3235 ? 7 : 0) != var5.field2250);
        this.field3232[class3.field60[arg0]] = var4 + 256;
        this.method1072(117);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([IZ[IZI)V")
    public final void method1075(int[] arg0, boolean arg1, int[] arg2, boolean arg3, int arg4) {
        field3241++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class132.field3228; var7++) {
                    class93 var8 = class63.method556(arg1, var7);
                    if (var8 != null && !var8.field2249 && var6 + (arg3 ? 7 : 0) == var8.field2250) {
                        arg0[class3.field60[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field3232 = arg0;
        this.field3233 = arg4;
        if (!arg1) {
            field3249 = null;
        }
        this.field3235 = arg3;
        this.field3245 = arg2;
        this.method1072(65);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I")
    public final int method1076(int arg0) {
        field3251++;
        int var2 = 116 / ((79 - arg0) / 41);
        return this.field3233 == -1 ? (this.field3232[11] << 5) + (this.field3232[0] << 15) + (this.field3245[0] << 25) + (this.field3245[4] << 20) + (this.field3232[8] << 10) + this.field3232[1] : class149.method1206(this.field3233, (byte) 46).field1088 + 305419896;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILle;IILle;)Ldd;")
    public final class26 method1077(int arg0, class81 arg1, int arg2, int arg3, class81 arg4) {
        field3239++;
        if (this.field3233 != -1) {
            return class149.method1206(this.field3233, (byte) 46).method386(arg0, -119, arg2, arg4, arg1);
        }
        long var6 = this.field3242;
        int[] var8 = this.field3232;
        if (arg4 != null && (arg4.field2011 >= 0 || arg4.field2025 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field3232[var9];
            }
            if (arg4.field2011 >= 0) {
                var6 += arg4.field2011 - this.field3232[5] << 8;
                var8[5] = arg4.field2011;
            }
            if (arg4.field2025 >= 0) {
                var6 += arg4.field2025 - this.field3232[3] << 16;
                var8[3] = arg4.field2025;
            }
        }
        if (arg3 > -38) {
            field3255 = null;
        }
        class26 var10 = (class26) class1.field21.method997(-1, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class63.method556(true, var21 - 256).method767(106)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class1.method2((byte) -84, var21 - 512).method1175(8402, this.field3235)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3234 != -1L) {
                    var10 = (class26) class1.field21.method997(-1, this.field3234);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class129[] var13 = new class129[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class129 var19 = class63.method556(true, var18 - 256).method770((byte) -22);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class129 var20 = class1.method2((byte) -46, var18 - 512).method1174(this.field3235, -121);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class129 var16 = new class129(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field3245[var17] != 0) {
                        var16.method1043(class109.field2696[var17][0], class109.field2696[var17][this.field3245[var17]]);
                        if (var17 == 1) {
                            var16.method1043(class130.field3189[0], class130.field3189[this.field3245[var17]]);
                        }
                    }
                }
                var10 = var16.method1044(64, 850, -30, -50, -30);
                class1.field21.method993((byte) 100, var6, var10);
                this.field3234 = var6;
            }
        }
        if (arg4 == null && arg1 == null) {
            return var10;
        }
        class26 var22;
        if (arg4 != null && arg1 != null) {
            var22 = arg4.method703(var10, arg0, arg2, arg1, (byte) 94);
        } else if (arg4 == null) {
            var22 = arg1.method705((byte) -114, arg2, var10);
        } else {
            var22 = arg4.method705((byte) -114, arg0, var10);
        }
        return var22;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lib;B)V")
    public final void method1078(class57 arg0, byte arg1) {
        field3238++;
        if (arg1 >= -87) {
            return;
        }
        arg0.method514((byte) 73, this.field3235 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field3232[class3.field60[var3]];
            if (var5 == 0) {
                arg0.method514((byte) 73, -1);
            } else {
                arg0.method514((byte) 73, var5 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method514((byte) 73, this.field3245[var4]);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method1079(byte arg0) {
        field3236++;
        class12 var1 = class45.field1070;
        synchronized (class45.field1070) {
            class43.field1057 = class138.field3445;
            class148.field3656 = class16.field393;
            if (arg0 > -55) {
                field3256 = null;
            }
            class80.field1969 = class137.field3437;
            class49.field1179 = class58.field1527;
            class23.field540 = class45.field1071;
            class4.field75 = class48.field1172;
            class33.field803 = class57.field1510;
            class58.field1527 = 0;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V")
    public final void method1080(int arg0, boolean arg1) {
        field3237++;
        if (this.field3235 != arg1 && arg0 == -22500) {
            this.method1075(null, true, this.field3245, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public static void method1081(int arg0) {
        field3249 = null;
        field3260 = null;
        field3256 = null;
        field3258 = null;
        field3255 = null;
        field3257 = null;
        field3259 = null;
        field3254 = null;
        int var1 = -109 / ((15 - arg0) / 39);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)Ltc;")
    public final class129 method1082(byte arg0) {
        field3247++;
        if (this.field3233 != -1) {
            return class149.method1206(this.field3233, (byte) 46).method382(false);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field3232[var3];
            if (var12 >= 256 && var12 < 512 && !class63.method556(true, var12 - 256).method766(44)) {
                var2 = true;
            }
            if (var12 >= 512 && !class1.method2((byte) 120, var12 - 512).method1171(this.field3235, 0)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class129[] var4 = new class129[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field3232[var6];
            if (var9 >= 256 && var9 < 512) {
                class129 var10 = class63.method556(true, var9 - 256).method768(8936);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class129 var11 = class1.method2((byte) -46, var9 - 512).method1173((byte) 42, this.field3235);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class129 var7 = new class129(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field3245[var8] != 0) {
                var7.method1043(class109.field2696[var8][0], class109.field2696[var8][this.field3245[var8]]);
                if (var8 == 1) {
                    var7.method1043(class130.field3189[0], class130.field3189[this.field3245[var8]]);
                }
            }
        }
        if (arg0 >= -88) {
            return null;
        } else {
            return var7;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IIZ)V")
    public final void method1083(int arg0, int arg1, boolean arg2) {
        field3246++;
        int var4 = this.field3245[arg1];
        if (arg2) {
            var4++;
            if (class109.field2696[arg1].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class109.field2696[arg1].length - 1;
            }
        }
        this.field3245[arg1] = var4;
        int var5 = -123 % ((arg0 - 34) / 38);
        this.method1072(76);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILoc;Ljava/awt/Color;)V")
    public static final void method1084(int arg0, int arg1, class99 arg2, Color arg3) {
        field3243++;
        try {
            Graphics var4 = class5.field99.getGraphics();
            if (class74.field1897 == null) {
                class74.field1897 = new Font("Helvetica", 1, 13);
                class107.field2626 = class5.field99.getFontMetrics(class74.field1897);
            }
            if (class80.field1971) {
                class80.field1971 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class145.field3614, class99.field2404);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class93.field2264 == null) {
                    class93.field2264 = class5.field99.createImage(304, 34);
                }
                Graphics var5 = class93.field2264.getGraphics();
                var5.setColor(arg3);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(arg1, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class74.field1897);
                var5.setColor(Color.white);
                arg2.method832(var5, (304 - arg2.method814((byte) -117, class107.field2626)) / 2, 22, -50);
                var4.drawImage(class93.field2264, class145.field3614 / 2 - 152, class99.field2404 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class145.field3614 / 2 - 152;
                int var7 = class99.field2404 / 2 - 18;
                var4.setColor(arg3);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var6 + 2, var7 - -2, 300 - arg0 * 3, 30);
                var4.setFont(class74.field1897);
                var4.setColor(Color.white);
                arg2.method832(var4, var6 + (304 - arg2.method814((byte) -108, class107.field2626)) / 2, var7 - -22, -18);
            }
        } catch (Exception var9) {
            class5.field99.repaint();
        }
    }
}
