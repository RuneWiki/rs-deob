import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class76 extends class20 {

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Z")
    public boolean field1286 = true;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Z")
    public boolean field1285 = false;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    private int field1294 = 0;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "Lq;")
    public class79 field1311;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "Ldc;")
    public class158 field1309;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Lqe;")
    public class38 field1290;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "J")
    private long field1322;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Lbh;")
    public class210 field1288;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field1321 = "Loaded textures";

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1307 = Calendar.getInstance();

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "[I")
    public static int[] field1323 = new int[50];

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "Lth;")
    public static class57 field1305;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIIIII)V", line = 11)
    public final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1304++;
        this.field1298 = arg9;
        this.field1317 = arg3;
        this.field1297 = arg5;
        this.field1312 = arg7;
        this.field1299 = arg1;
        this.field1301 = arg2;
        this.field1292 = arg0;
        int var11 = (this.field1301 + this.field1292 + this.field1317) / 3 + this.field1309.field2508;
        this.field1287 = arg8;
        if (arg6 != 0) {
            method634((byte) 23);
        }
        int var12 = (this.field1297 + this.field1298 + this.field1287) / 3 + this.field1309.field2514;
        this.field1310 = arg4;
        int var13 = (this.field1310 + this.field1312 + this.field1299) / 3 + this.field1309.field2507;
        if (this.field1289 != var11 || this.field1314 != var13 || this.field1316 != var12) {
            this.field1289 = var11;
            this.field1286 = true;
            this.field1316 = var12;
            this.field1314 = var13;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lq;Ldc;J)V", line = 846)
    public class76(class79 arg0, class158 arg1, long arg2) {
        this.field1311 = arg0;
        this.field1309 = arg1;
        this.field1290 = new class38();
        this.field1322 = arg2;
        this.field1288 = this.field1311.field1363;
        this.field1294 = (int) ((double) this.field1294 + Math.random() * 64.0D);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZLjava/lang/String;Ljava/awt/Color;I)V", line = 51)
    public static final void method629(int arg0, boolean arg1, String arg2, Color arg3, int arg4) {
        field1302++;
        try {
            Graphics var5 = class151.field2402.getGraphics();
            if (class29.field393 == null) {
                class29.field393 = new Font("Helvetica", 1, 13);
                class161.field2565 = class151.field2402.getFontMetrics(class29.field393);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class298.field4779, class252.field4266);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class10.field84 == null) {
                    class10.field84 = class151.field2402.createImage(304, 34);
                }
                Graphics var6 = class10.field84.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                if (arg0 >= -91) {
                    field1321 = (String) null;
                }
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg4 * 3) + 2, 2, 300 - (arg4 * 3), 30);
                var6.setFont(class29.field393);
                var6.setColor(Color.white);
                var6.drawString(arg2, (304 - class161.field2565.stringWidth(arg2)) / 2, 22);
                var5.drawImage(class10.field84, class298.field4779 / 2 - 152, class252.field4266 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class298.field4779 / 2 - 152;
                int var9 = class252.field4266 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 - -2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(var8 + (arg4 * 3) + 2, var9 - -2, 300 - arg4 * 3, 30);
                var5.setFont(class29.field393);
                var5.setColor(Color.white);
                var5.drawString(arg2, (304 - class161.field2565.stringWidth(arg2)) / 2 + var8, var9 + 22);
            }
            if (class235.field3907 != null) {
                var5.setFont(class29.field393);
                var5.setColor(Color.white);
                var5.drawString(class235.field3907, class298.field4779 / 2 - (class161.field2565.stringWidth(class235.field3907) / 2), class252.field4266 / 2 - 26);
            }
        } catch (Exception var12) {
            class151.field2402.repaint();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(JIZIII)V", line = 127)
    public final void method630(long arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1308++;
        if (arg1 != 29275) {
            return;
        }
        if (this.field1285) {
            arg2 = false;
        } else if (this.field1288.field3366 > class158.field2524) {
            arg2 = false;
        } else if (class158.field2487 > class166.field2651[class158.field2524]) {
            arg2 = false;
        } else if (this.field1301 == this.field1292 && this.field1317 == this.field1292 && this.field1310 == this.field1299 && this.field1312 == this.field1299 && this.field1297 == this.field1287 && this.field1298 == this.field1287) {
            arg2 = false;
        } else if (this.field1288.field3317 != -1) {
            int var8 = (int) (arg0 - this.field1322);
            if (this.field1288.field3321 || this.field1288.field3317 >= var8) {
                var8 %= this.field1288.field3317;
            } else {
                arg2 = false;
            }
            if (!this.field1288.field3339 && var8 < this.field1288.field3365) {
                arg2 = false;
            }
            if (this.field1288.field3339 && this.field1288.field3365 <= var8) {
                arg2 = false;
            }
        }
        if (arg2) {
            this.field1294 += (int) ((double) arg4 * (Math.random() * (double) (this.field1288.field3354 - this.field1288.field3357) + (double) this.field1288.field3357));
            if (this.field1294 > 63) {
                int var9 = this.field1294 >> 6;
                this.field1294 &= 0x3F;
                if (this.field1286) {
                    int var10 = this.field1292 - this.field1301;
                    int var11 = this.field1287 - this.field1297;
                    int var12 = this.field1299 - this.field1310;
                    int var13 = this.field1317 - this.field1301;
                    int var14 = this.field1312 - this.field1310;
                    int var15 = this.field1298 - this.field1297;
                    this.field1320 = var12 * var15 - var11 * var14;
                    this.field1318 = var10 * var14 - (var12 * var13);
                    this.field1293 = var11 * var13 - (var10 * var15);
                    while (true) {
                        if (this.field1320 <= 32767 && this.field1293 <= 32767 && this.field1318 <= 32767 && this.field1320 >= -32767 && this.field1293 >= -32767 && this.field1318 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field1320 * this.field1320 + (this.field1293 * this.field1293 + (this.field1318 * this.field1318))));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field1320 = this.field1320 * 32767 / var16;
                            this.field1293 = this.field1293 * 32767 / var16;
                            this.field1318 = this.field1318 * 32767 / var16;
                            if (this.field1288.field3312 > 0 || this.field1288.field3351 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field1318, (double) this.field1320) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field1293, Math.sqrt((double) (this.field1320 * this.field1320 + this.field1318 * this.field1318))) * 2047.0D / 6.283185307179586D);
                                this.field1306 = this.field1288.field3351 - this.field1288.field3340;
                                int var20 = var18 - this.field1309.field2512;
                                this.field1303 = var19 + this.field1288.field3340 - (this.field1306 / 2);
                                this.field1319 = this.field1288.field3312 - this.field1288.field3360;
                                this.field1300 = var20 + this.field1288.field3360 - this.field1319 / 2;
                            } else if (this.field1309.field2512 != 0) {
                                int var17 = this.field1320 * arg5 + this.field1318 * arg3 >> 16;
                                this.field1318 = this.field1318 * arg5 - (this.field1320 * arg3) >> 16;
                                this.field1320 = var17;
                            }
                            this.field1286 = false;
                            break;
                        }
                        this.field1320 >>= 0x1;
                        this.field1318 >>= 0x1;
                        this.field1293 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field1288.field3312 <= 0 && this.field1288.field3351 <= 0) {
                        var22 = this.field1320;
                        var23 = this.field1318;
                        var24 = this.field1293;
                    } else {
                        int var25 = this.field1300 + ((int) ((double) this.field1319 * Math.random()));
                        int var26 = this.field1303 + (int) ((double) this.field1306 * Math.random());
                        int var27 = var25 & 0x7FF;
                        int var28 = class153.field2438[var27] >> 1;
                        int var29 = var26 & 0x3FF;
                        int var30 = class153.field2445[var27] >> 1;
                        int var31 = class153.field2438[var29] >> 1;
                        var23 = var28 * var31 >> 15;
                        int var32 = class153.field2445[var29] >> 1;
                        var22 = var30 * var31 >> 15;
                        var24 = var32 * -1;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var34) * var33 >> 8;
                    int var36 = 255 - var35 - var34;
                    int var37 = this.field1312 * var36 + this.field1310 * var34 + this.field1299 * var35 >> 8;
                    int var38 = this.field1301 * var34 + this.field1317 * var36 + this.field1292 * var35 >> 8;
                    int var39 = this.field1297 * var34 + (this.field1287 * var35 + (this.field1298 * var36)) >> 8;
                    if (this.field1309.field2512 != 0) {
                        int var40 = arg3 * var39 + arg5 * var38 >> 16;
                        var39 = arg5 * var39 - (arg3 * var38) >> 16;
                        var38 = var40;
                    }
                    int var41 = this.field1288.field3310 + ((int) ((double) (this.field1288.field3331 - this.field1288.field3310) * Math.random()));
                    int var42 = (int) ((double) (this.field1288.field3337 - this.field1288.field3369) * Math.random()) + this.field1288.field3369;
                    int var43;
                    if (this.field1288.field3320) {
                        double var44 = Math.random();
                        var43 = (int) ((double) this.field1288.field3359 * var44 + (double) this.field1288.field3333) | (int) ((double) this.field1288.field3336 * var44 + (double) this.field1288.field3324) << 16 | (int) ((double) this.field1288.field3348 * var44 + (double) this.field1288.field3306) << 8 | (int) ((double) this.field1288.field3309 * var44 + (double) this.field1288.field3352) << 24;
                    } else {
                        var43 = (int) ((double) this.field1288.field3309 * Math.random() + (double) this.field1288.field3352) << 24 | (int) (Math.random() * (double) this.field1288.field3359 + (double) this.field1288.field3333) | (int) ((double) this.field1288.field3348 * Math.random() + (double) this.field1288.field3306) << 8 | (int) ((double) this.field1288.field3324 + Math.random() * (double) this.field1288.field3336) << 16;
                    }
                    if (class158.field2498 == class158.field2488) {
                        new class262(this, this.field1309.field2508 + var38, this.field1309.field2507 + var37, this.field1309.field2514 + var39, var22, var24, var23, var41, var42, var43);
                    } else {
                        class262 var47 = class158.field2494[class158.field2498];
                        class158.field2498 = class158.field2498 + 1 & 0x3FF;
                        var47.method1999(this, this.field1309.field2508 + var38, this.field1309.field2507 - -var37, this.field1309.field2514 + var39, var22, var24, var23, var41, var42, var43);
                    }
                }
            }
        }
        this.field1291 = 0;
        for (class262 var48 = (class262) this.field1290.method254((byte) -96); var48 != null; var48 = (class262) this.field1290.method250(50)) {
            var48.method1996(arg0, arg4);
            this.field1291++;
        }
        class158.field2490 += this.field1291;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lkh;Lkh;B)V", line = 346)
    public static final void method631(class172 arg0, class172 arg1, byte arg2) {
        field1296++;
        if (arg0.field2749 != null) {
            arg0.method1352(-67);
        }
        arg0.field2749 = arg1;
        int var3 = 111 / ((arg2 + 55) / 63);
        arg0.field2746 = arg1.field2746;
        arg0.field2749.field2746 = arg0;
        arg0.field2746.field2749 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)I", line = 367)
    public static final int method632(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1313++;
        int var5 = arg0 - class153.field2445[arg3 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Lme;", line = 379)
    public static final class339 method633(int arg0, int arg1, int arg2) {
        class36 var3 = class129.field2184[arg0][arg1][arg2];
        return var3 == null ? null : var3.field526;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 397)
    public static void method634(byte arg0) {
        field1307 = null;
        int var1 = -73 % ((68 - arg0) / 45);
        field1305 = null;
        field1323 = null;
        field1321 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([Lic;IZIZI[BI)[I", line = 429)
    public static final int[] method635(class22[] arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, byte[] arg6, int arg7) {
        field1315++;
        if (!arg4) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg1 + var9) > 0 && arg1 + var9 < 103 && (arg3 + var10) > 0 && (arg3 + var10) < 103) {
                            arg0[var8].field266[arg1 + var9][arg3 + var10] = class343.method2418(arg0[var8].field266[arg1 + var9][arg3 + var10], -2097153);
                        }
                    }
                }
            }
        }
        if (!arg2) {
            field1305 = (class57) null;
        }
        class227 var11 = new class227(arg6);
        byte var12;
        if (arg4) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        int var13 = arg5 + arg1;
        int var14 = arg3 + arg7;
        for (int var15 = 0; var15 < var12; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class318.method2250(var15, 0, arg4, arg3 + var17, arg1 + var16, var14 + var17, var13 + var16, var11, false, 0, 3, 0);
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var11.field3760 < var11.field3793.length) {
            int var20 = var11.method1720((byte) -125);
            if (var20 == 128) {
                class11.field88[0] = var11.method1765(true);
                class11.field88[1] = var11.method1769(-30726);
                var18 = true;
                class11.field88[2] = var11.method1769(-30726);
                class11.field88[3] = var11.method1769(-30726);
                class11.field88[4] = var11.method1765(true);
            } else {
                if (var20 != 129) {
                    var11.field3760--;
                    break;
                }
                var19 = true;
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var11.method1733(0);
                    if (var22 == 0) {
                        int var23 = arg1;
                        if (arg1 < 0) {
                            var23 = 0;
                        } else if (arg1 >= 104) {
                            var23 = 104;
                        }
                        int var24 = arg1 + 64;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        int var25 = arg3 + 64;
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        int var26 = arg3;
                        if (arg3 < 0) {
                            var26 = 0;
                        } else if (arg3 >= 104) {
                            var26 = 104;
                        }
                        while (var23 < var24) {
                            while (var25 > var26) {
                                class187.field2999[var21][var23][var26] = 0;
                                var26++;
                            }
                            var23++;
                        }
                    } else if (var22 == 1) {
                        for (int var31 = 0; var31 < 64; var31 += 4) {
                            for (int var32 = 0; var32 < 64; var32 += 4) {
                                byte var33 = var11.method1733(0);
                                for (int var34 = var31 + arg1; var34 < arg1 + var31 + 4; var34++) {
                                    for (int var35 = var32 + arg3; var35 < arg3 + var32 + 4; var35++) {
                                        if (var34 >= 0 && var34 < 104 && var35 >= 0 && var35 < 104) {
                                            class187.field2999[var21][var34][var35] = var33;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var27 = arg1;
                        if (arg1 < 0) {
                            var27 = 0;
                        } else if (arg1 >= 104) {
                            var27 = 104;
                        }
                        int var28 = arg3;
                        if (arg3 < 0) {
                            var28 = 0;
                        } else if (arg3 >= 104) {
                            var28 = 104;
                        }
                        int var29 = arg1 + 64;
                        int var30 = arg3 + 64;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 >= 104) {
                            var30 = 104;
                        }
                        while (var29 > var27) {
                            while (var30 > var28) {
                                class187.field2999[var21][var27][var28] = class187.field2999[var21 - 1][var27][var28];
                                var28++;
                            }
                            var27++;
                        }
                    }
                }
            }
        }
        if (class42.field607 && !arg4) {
            class179 var36 = null;
            label289: while (true) {
                while (true) {
                    while (var11.field3760 < var11.field3793.length) {
                        int var37 = var11.method1720((byte) -41);
                        if (var37 == 0) {
                            var36 = new class179(var11);
                        } else if (var37 == 1) {
                            int var38 = var11.method1720((byte) -71);
                            if (var38 > 0) {
                                for (int var39 = 0; var39 < var38; var39++) {
                                    class314 var40 = new class314(var11);
                                    if (var40.field4987 == 31) {
                                        class318 var41 = class63.method550(10864, var11.method1765(true));
                                        var40.method2225(var41.field5069, var41.field5073, var41.field5074, var41.field5068, 122);
                                    }
                                    var40.field5008 += arg1 << 7;
                                    int var42 = var40.field5008 >> 7;
                                    var40.field4999 += arg3 << 7;
                                    int var43 = var40.field4999 >> 7;
                                    if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                                        var40.field5015 = (class178.field2856[1][var42][var43] & 0x2) != 0;
                                        var40.field5002 = class101.field1656[var40.field5007][var42][var43] - var40.field5002;
                                        class30.method209(var40);
                                    }
                                }
                            }
                        } else if (var37 == 2) {
                            if (var36 == null) {
                                var36 = new class179();
                            }
                            var36.method1411(arg2, var11);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (var36 == null) {
                        var36 = new class179();
                    }
                    for (int var44 = 0; var44 < 8; var44++) {
                        for (int var45 = 0; var45 < 8; var45++) {
                            int var46 = (arg1 >> 3) + var44;
                            int var47 = (arg3 >> 3) + var45;
                            if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                                class235.field3904[var46][var47] = var36;
                            }
                        }
                    }
                    break label289;
                }
            }
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg1 >> 2) + var49;
                        int var52 = (arg3 >> 2) + var50;
                        if (var51 >= 0 && var51 < 26 && var52 >= 0 && var52 < 26) {
                            class187.field2999[var48][var51][var52] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class11.field88 : null;
    }
}
