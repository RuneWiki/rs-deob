import java.awt.Component;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class91 extends class12 {

    @OriginalMember(owner = "client!ec", name = "Ob", descriptor = "I")
    private int field1357 = 0;

    @OriginalMember(owner = "client!ec", name = "Xb", descriptor = "Z")
    public boolean field1366 = false;

    @OriginalMember(owner = "client!ec", name = "Wb", descriptor = "I")
    public int field1365 = -1;

    @OriginalMember(owner = "client!ec", name = "Rb", descriptor = "S")
    private short field1360 = 0;

    @OriginalMember(owner = "client!ec", name = "Tb", descriptor = "I")
    public int field1362 = 0;

    @OriginalMember(owner = "client!ec", name = "cc", descriptor = "I")
    public int field1371 = -1;

    @OriginalMember(owner = "client!ec", name = "kc", descriptor = "I")
    public int field1379 = -1;

    @OriginalMember(owner = "client!ec", name = "ic", descriptor = "I")
    public int field1377 = 0;

    @OriginalMember(owner = "client!ec", name = "Ib", descriptor = "I")
    public int field1351 = 0;

    @OriginalMember(owner = "client!ec", name = "dc", descriptor = "I")
    public int field1372 = -1;

    @OriginalMember(owner = "client!ec", name = "lc", descriptor = "I")
    public int field1380 = 0;

    @OriginalMember(owner = "client!ec", name = "gc", descriptor = "I")
    public int field1375 = 0;

    @OriginalMember(owner = "client!ec", name = "jc", descriptor = "S")
    private short field1378 = 0;

    @OriginalMember(owner = "client!ec", name = "Lb", descriptor = "I")
    public int field1354 = 0;

    @OriginalMember(owner = "client!ec", name = "Zb", descriptor = "I")
    public int field1368 = -1;

    @OriginalMember(owner = "client!ec", name = "Pb", descriptor = "[[[Lel;")
    public static class218[][][] field1358 = new class218[4][104][104];

    @OriginalMember(owner = "client!ec", name = "hc", descriptor = "[I")
    public static int[] field1376 = new int[200];

    @OriginalMember(owner = "client!ec", name = "rc", descriptor = "Lma;")
    public static class5 field1386 = class12.method119("(U5", (byte) 52);

    @OriginalMember(owner = "client!ec", name = "Jb", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client!ec", name = "Kb", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ec", name = "Mb", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ec", name = "Nb", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ec", name = "Qb", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!ec", name = "Sb", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ec", name = "Ub", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ec", name = "bc", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!ec", name = "ec", descriptor = "I")
    public int field1373;

    @OriginalMember(owner = "client!ec", name = "fc", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client!ec", name = "mc", descriptor = "I")
    public int field1381;

    @OriginalMember(owner = "client!ec", name = "nc", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client!ec", name = "oc", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ec", name = "pc", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ec", name = "sc", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ec", name = "tc", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!ec", name = "ac", descriptor = "Ldb;")
    public class126 field1369;

    @OriginalMember(owner = "client!ec", name = "qc", descriptor = "Lkl;")
    public class34 field1385;

    @OriginalMember(owner = "client!ec", name = "Yb", descriptor = "Lma;")
    public class5 field1367;

    @OriginalMember(owner = "client!ec", name = "Vb", descriptor = "[I")
    public static int[] field1364;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Z", line = 6)
    public final boolean method117(byte arg0) {
        field1356++;
        if (this.field1369 == null) {
            return false;
        } else {
            return arg0 <= -114;
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)Lma;", line = 22)
    public final class5 method596(byte arg0) {
        class5 var2 = this.field1367;
        field1355++;
        if (arg0 != -126) {
            return (class5) null;
        }
        if (class89.field1328 != null) {
            var2 = class288.method1940((byte) 66, new class5[] { class89.field1328[this.field1357], var2 });
        }
        if (class186.field2933 != null) {
            var2 = class288.method1940((byte) 68, new class5[] { var2, class186.field2933[this.field1357] });
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()V", line = 48)
    public static final void method597() {
        GL var0 = class45.field688;
        var0.glDisableClientState(32886);
        class45.method314(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class45.method340();
        for (int var1 = 0; var1 < class110.field1635[0].length; var1++) {
            class56 var2 = class110.field1635[0][var1];
            if (var2.field883 >= 0 && class229.field3802.method1099((byte) -127, var2.field883) == 4) {
                var0.glColor4fv(class188.method1235(var2.field896, true), 0);
                float var3 = 201.5F - (var2.field870 ? 1.0F : 0.5F);
                var2.method427(class43.field646, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class45.method306();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class45.method341();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIIIJ)V", line = 92)
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1383++;
        if (this.field1369 == null) {
            return;
        }
        class33 var11 = this.field238 != -1 && this.field214 == 0 ? class171.method1136(this.field238, -6722) : null;
        class33 var12 = this.field173 == -1 || this.field1366 || this.field202 == this.field173 && var11 != null ? null : class171.method1136(this.field173, -6722);
        class34 var13 = this.field1369.method845(-1, var12, var11, this.field221, this.field237);
        if (var13 == null) {
            return;
        }
        this.field180 = var13.method248();
        if (class77.field1208 && (this.field1369.field1883 == -1 || class186.method1230(29, this.field1369.field1883).field4860)) {
            class34 var14 = class158.method1020(this.field178, 240, var12 == null ? var11 : var12, var13, this.field211, var12 == null ? this.field221 : this.field237, 0, arg0, 160, 0, this.field185, 1, this.field225, true);
            float var15 = class45.method318();
            float var16 = class45.method335();
            class45.method340();
            class45.method324(var15, var16 - 150.0F);
            var14.method242(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            class45.method341();
            class45.method324(var15, var16);
        }
        if (class151.field2183 == this) {
            for (int var17 = class226.field3714.length - 1; var17 >= 0; var17--) {
                class81 var18 = class226.field3714[var17];
                if (var18 != null && var18.field1255 != -1) {
                    if (var18.field1259 == 1 && var18.field1250 >= 0 && class119.field1804.length > var18.field1250) {
                        class177 var19 = class119.field1804[var18.field1250];
                        if (var19 != null) {
                            int var20 = var19.field178 / 32 - (class151.field2183.field178 / 32);
                            int var21 = var19.field211 / 32 - (class151.field2183.field211 / 32);
                            this.method602(var13, 92, arg1, arg6, var20, arg2, arg5, arg4, arg7, var21, var18.field1255, arg0, arg3);
                        }
                    }
                    if (var18.field1259 == 2) {
                        int var22 = (var18.field1258 - class193.field3017) * 4 + 2 - (class151.field2183.field178 / 32);
                        int var23 = (var18.field1254 - class74.field1158) * 4 + 2 - (class151.field2183.field211 / 32);
                        this.method602(var13, 66, arg1, arg6, var22, arg2, arg5, arg4, arg7, var23, var18.field1255, arg0, arg3);
                    }
                    if (var18.field1259 == 10 && var18.field1250 >= 0 && var18.field1250 < class267.field4593.length) {
                        class91 var24 = class267.field4593[var18.field1250];
                        if (var24 != null) {
                            int var25 = var24.field178 / 32 - (class151.field2183.field178 / 32);
                            int var26 = var24.field211 / 32 - (class151.field2183.field211 / 32);
                            this.method602(var13, 112, arg1, arg6, var25, arg2, arg5, arg4, arg7, var26, var18.field1255, arg0, arg3);
                        }
                    }
                }
            }
        }
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        if (this.field1378 != 0 && this.field1360 != 0) {
            int var30 = class229.field3805[arg0];
            int var31 = class229.field3806[arg0];
            short var32 = this.field1360;
            short var33 = this.field1378;
            int var34 = -var32 / 2;
            int var35 = -var33 / 2;
            int var36 = var30 * var34 + var31 * var35 >> 16;
            int var37 = -var32 / 2;
            int var38 = var31 * var34 - var30 * var35 >> 16;
            int var39 = var33 / 2;
            int var40 = var31 * var37 - (var30 * var39) >> 16;
            int var41 = class20.method161(this.field211 + var38, this.field178 + var36, 1, class276.field4701);
            int var42 = var30 * var37 + var31 * var39 >> 16;
            int var43 = class20.method161(this.field211 + var40, this.field178 + var42, 1, class276.field4701);
            int var44 = -var33 / 2;
            int var45 = var32 / 2;
            int var46 = var30 * var45 + var31 * var44 >> 16;
            int var47 = var33 / 2;
            int var48 = var32 / 2;
            int var49 = var31 * var45 - (var30 * var44) >> 16;
            int var50 = class20.method161(this.field211 + var49, this.field178 + var46, 1, class276.field4701);
            int var51 = var30 * var48 + var31 * var47 >> 16;
            int var52 = var31 * var48 - (var30 * var47) >> 16;
            int var53 = var41 < var43 ? var41 : var43;
            int var54 = class20.method161(this.field211 + var52, this.field178 + var51, 1, class276.field4701);
            int var55 = var41 + var54;
            int var56 = var54 > var50 ? var50 : var54;
            if (var55 > (var43 + var50)) {
                var55 = var43 + var50;
            }
            int var57 = var41 < var50 ? var41 : var50;
            var28 = (int) (Math.atan2((double) (var53 - var56), (double) var32) * 325.95D) & 0x7FF;
            int var58 = var54 > var43 ? var43 : var54;
            if (var28 != 0) {
                var13.method252(var28);
            }
            var27 = (int) (Math.atan2((double) (var57 - var58), (double) var33) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                var13.method246(var27);
            }
            var29 = (var55 >> 1) - this.field185;
            if (var29 != 0) {
                var13.method243(0, var29, 0);
            }
        }
        class34 var59 = null;
        if (!this.field1366 && this.field222 != -1 && this.field236 != -1) {
            class48 var60 = class57.method430(this.field222, 22867872);
            var59 = var60.method360(this.field236, (byte) 61);
            if (var59 != null) {
                var59.method243(0, -this.field213, 0);
                if (var60.field754) {
                    if (var28 != 0) {
                        var59.method252(var28);
                    }
                    if (var27 != 0) {
                        var59.method246(var27);
                    }
                    if (var29 != 0) {
                        var59.method243(0, var29, 0);
                    }
                }
            }
        }
        class34 var61 = null;
        if (!this.field1366 && this.field1385 != null) {
            if (this.field1354 <= class50.field784) {
                this.field1385 = null;
            }
            if (this.field1375 <= class50.field784 && this.field1354 > class50.field784) {
                var61 = this.field1385;
                var61.method243(this.field1382 - this.field178, this.field1374 - this.field185, this.field1352 - this.field211);
                if (this.field215 == 512) {
                    var61.method230();
                } else if (this.field215 == 1024) {
                    var61.method240();
                } else if (this.field215 == 1536) {
                    var61.method234();
                }
            }
        }
        var13.field532 = true;
        var13.method242(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var59 != null) {
            var59.field532 = true;
            var59.method242(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
        if (var61 == null) {
            return;
        }
        if (this.field215 == 512) {
            var61.method234();
        } else if (this.field215 == 1024) {
            var61.method240();
        } else if (this.field215 == 1536) {
            var61.method230();
        }
        var61.method243(this.field178 - this.field1382, -this.field1374 + this.field185, this.field211 - this.field1352);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 379)
    public static final void method598(int arg0, Component arg1) {
        field1361++;
        arg1.addMouseListener(class265.field4536);
        if (arg0 != 32) {
            method598(-48, (Component) null);
        }
        arg1.addMouseMotionListener(class265.field4536);
        arg1.addFocusListener(class265.field4536);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 394)
    public static void method599(boolean arg0) {
        field1386 = null;
        field1358 = (class218[][][]) null;
        field1364 = null;
        field1376 = null;
        if (arg0) {
            field1376 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)Lv;", line = 412)
    public static final class232 method600(int arg0, int arg1) {
        field1370++;
        class232 var2 = (class232) class243.field4040.method964(-257, (long) arg1);
        int var3 = 82 / ((12 - arg0) / 36);
        if (var2 != null) {
            return var2;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = class174.field2662.method1342(-88, 1, arg1);
        } else {
            var4 = class185.field2865.method1342(78, 1, arg1 & 0x7FFF);
        }
        class232 var5 = new class232();
        if (var4 != null) {
            var5.method1657((byte) 45, new class221(var4));
        }
        if (arg1 >= 32768) {
            var5.method1656(126);
        }
        class243.field4040.method966(var5, (long) arg1, (byte) 73);
        return var5;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()I", line = 444)
    public final int method248() {
        field1353++;
        return this.field180;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILii;)V", line = 480)
    public final void method601(int arg0, class221 arg1) {
        arg1.field3610 = 0;
        int var3 = arg1.method1509(true);
        if ((var3 & 0x2) == 2) {
            this.field1378 = (short) (arg1.method1509(true) << 2);
            this.field1360 = (short) (arg1.method1509(true) << 2);
        } else {
            this.field1378 = 0;
            this.field1360 = 0;
        }
        field1384++;
        int var4 = var3 & 0x1;
        this.field1357 = (var3 & 0xFE) >> 6;
        boolean var5 = (var3 & 0x4) != 0;
        int var6 = this.field226;
        int[] var7 = new int[12];
        this.field226 = ((var3 & 0x3E) >> 3) + 1;
        int var8 = -1;
        this.field211 += (this.field226 - var6) * 64;
        this.field178 += (this.field226 - var6) * 64;
        this.field1368 = arg1.method1543(false);
        this.field1365 = arg1.method1543(false);
        this.field1377 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg1.method1509(true);
            if (var10 == 0) {
                var7[var9] = 0;
            } else {
                int var11 = arg1.method1509(true);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var8 = arg1.method1524((byte) 64);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class40.field606[var12 - 32768];
                    var7[var9] = class264.method1820(var13, 1073741824);
                    int var14 = class235.method1664(arg0 - 11062, var13).field3075;
                    if (var14 != 0) {
                        this.field1377 = var14;
                    }
                } else {
                    var7[var9] = class264.method1820(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg1.method1509(true);
            if (var17 < 0 || class260.field4435[var16].length <= var17) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field202 = arg1.method1524((byte) 95);
        if (this.field202 == 65535) {
            this.field202 = -1;
        }
        this.field210 = arg1.method1524((byte) 63);
        if (this.field210 == 65535) {
            this.field210 = -1;
        }
        this.field229 = this.field210;
        this.field206 = arg1.method1524((byte) 78);
        if (arg0 != 11186) {
            return;
        }
        if (this.field206 == 65535) {
            this.field206 = -1;
        }
        this.field230 = arg1.method1524((byte) 125);
        if (this.field230 == 65535) {
            this.field230 = -1;
        }
        this.field201 = arg1.method1524((byte) 47);
        if (this.field201 == 65535) {
            this.field201 = -1;
        }
        this.field233 = arg1.method1524((byte) 119);
        if (this.field233 == 65535) {
            this.field233 = -1;
        }
        this.field184 = arg1.method1524((byte) 57);
        if (this.field184 == 65535) {
            this.field184 = -1;
        }
        this.field1367 = class245.method1719(arg1.method1510(20396), (byte) -45).method30(arg0 ^ 0xFFFFD414);
        this.field1380 = arg1.method1509(true);
        if (var5) {
            this.field1351 = arg1.method1524((byte) 73);
        } else {
            this.field1351 = 0;
        }
        int var18 = this.field1362;
        this.field1362 = arg1.method1509(true);
        if (this.field1362 == 0) {
            class289.method1954(128, this);
        } else {
            int var19 = this.field1371;
            int var20 = this.field1372;
            int var21 = this.field1379;
            this.field1371 = arg1.method1524((byte) 118);
            this.field1372 = arg1.method1524((byte) 72);
            this.field1379 = arg1.method1524((byte) 92);
            if (this.field1362 != var18 || this.field1371 != var19 || this.field1372 != var20 || this.field1379 != var21) {
                class144.method917(this, (byte) -94);
            }
        }
        if (this.field1369 == null) {
            this.field1369 = new class126();
        }
        this.field1369.method834(var7, var4 == 1, var8, var15, -105);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lkl;IIIIIIIIIIII)V", line = 657)
    private final void method602(class34 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field1387++;
        int var14 = arg4 * arg4 + arg9 * arg9;
        if (var14 < 16 || var14 > 360000) {
            return;
        }
        int var15 = (int) (Math.atan2((double) arg4, (double) arg9) * 325.949D) & 0x7FF;
        class34 var16 = class282.method1907(this.field211, var15, -116, arg10, this.field178, arg0, this.field185);
        if (var16 != null) {
            float var17 = class45.method318();
            float var18 = class45.method335();
            class45.method340();
            class45.method324(var17, var18 - 150.0F);
            var16.method242(0, arg2, arg5, arg12, arg7, arg6, arg3, arg8, -1L);
            class45.method341();
            class45.method324(var17, var18);
        }
        if (arg1 < 57) {
            this.field1373 = -99;
        }
    }
}
