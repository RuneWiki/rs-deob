import jaggl.OpenGL;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class113 {

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "[F")
    private float[] field1398 = new float[16];

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "Lvw;")
    private class257 field1390 = new class257(786336);

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
    private int field1404 = class112.method688((byte) -125, 1600);

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "[I")
    private int[] field1405 = new int[1600];

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "[I")
    private int[] field1409 = new int[8191];

    @OriginalMember(owner = "client!hu", name = "x", descriptor = "I")
    private int field1407 = 0;

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "[[Lnba;")
    private class251[][] field1406 = new class251[64][768];

    @OriginalMember(owner = "client!hu", name = "y", descriptor = "[I")
    private int[] field1408 = new int[64];

    @OriginalMember(owner = "client!hu", name = "A", descriptor = "[[Lnba;")
    private class251[][] field1410 = new class251[1600][64];

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field1385 = 0;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "[[B")
    public static byte[][] field1391 = new byte[1000][];

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "Lgr;")
    private class371 field1400;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "Lgr;")
    private class371 field1401;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "Lgr;")
    private class371 field1402;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "Lbo;")
    private class632 field1403;

    static {
        new class474("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field1399 = -50;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lad;I)V", line = 6)
    private final void method695(class362 arg0, int arg1) {
        field1389++;
        arg0.method2285(-32, true);
        if (arg1 >= -83) {
            this.method695(null, -40);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class518.field7543 != arg0.field5386) {
            arg0.method315(class518.field7543);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)Z", line = 23)
    public static final boolean method696(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field1385 = -40;
        }
        field1388++;
        return (arg1 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 34)
    public static final String method697(byte arg0, long arg1) {
        field1393++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        }
        if (arg0 != -24) {
            method696(-74, 99, 65);
        }
        if (arg1 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
            var3++;
        }
        StringBuffer var6 = new StringBuffer(var3);
        while (arg1 != 0L) {
            long var7 = arg1;
            arg1 /= 37L;
            var6.append(class216.field2980[(int) (var7 - (arg1 * 37L))]);
        }
        return var6.reverse().toString();
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BLad;)V", line = 74)
    private final void method698(byte arg0, class362 arg1) {
        field1395++;
        class518.field7543 = arg1.field5386;
        arg1.method2253(false);
        if (arg0 < -99) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
            arg1.method2285(-32, false);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BLad;I)V", line = 90)
    private final void method699(byte arg0, class362 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field1398, 0);
        field1394++;
        float var4 = this.field1398[0];
        float var5 = this.field1398[4];
        float var6 = this.field1398[8];
        float var7 = this.field1398[1];
        float var8 = this.field1398[5];
        float var9 = this.field1398[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        if (arg0 >= -58) {
            method697((byte) 116, -121L);
        }
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field1390.field2610 = 0;
        if (arg1.field5468) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field1405[var44] > 64 ? 64 : this.field1405[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class251 var59 = this.field1410[var44][var46];
                        int var60 = var59.field3560;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field3569 >> 12);
                        float var66 = (float) (var59.field3568 >> 12);
                        float var67 = (float) (var59.field3559 >> 12);
                        int var68 = var59.field3556 >> 12;
                        this.field1390.method1716(0.0F, -111);
                        this.field1390.method1716(0.0F, -87);
                        this.field1390.method1716((float) (-var68) * var10 + var65, -99);
                        this.field1390.method1716((float) (-var68) * var11 + var66, -115);
                        this.field1390.method1716((float) (-var68) * var12 + var67, -97);
                        this.field1390.method1205((byte) -69, var61);
                        this.field1390.method1205((byte) -69, var62);
                        this.field1390.method1205((byte) -69, var63);
                        this.field1390.method1205((byte) -69, var64);
                        this.field1390.method1716(1.0F, -114);
                        this.field1390.method1716(0.0F, -123);
                        this.field1390.method1716((float) var68 * var13 + var65, -94);
                        this.field1390.method1716((float) var68 * var14 + var66, -98);
                        this.field1390.method1716((float) var68 * var15 + var67, -112);
                        this.field1390.method1205((byte) -69, var61);
                        this.field1390.method1205((byte) -69, var62);
                        this.field1390.method1205((byte) -69, var63);
                        this.field1390.method1205((byte) -69, var64);
                        this.field1390.method1716(1.0F, -109);
                        this.field1390.method1716(1.0F, -86);
                        this.field1390.method1716((float) var68 * var10 + var65, -99);
                        this.field1390.method1716((float) var68 * var11 + var66, -75);
                        this.field1390.method1716((float) var68 * var12 + var67, -108);
                        this.field1390.method1205((byte) -69, var61);
                        this.field1390.method1205((byte) -69, var62);
                        this.field1390.method1205((byte) -69, var63);
                        this.field1390.method1205((byte) -69, var64);
                        this.field1390.method1716(0.0F, -111);
                        this.field1390.method1716(1.0F, -97);
                        this.field1390.method1716((float) var68 * var16 + var65, -74);
                        this.field1390.method1716((float) var68 * var17 + var66, -86);
                        this.field1390.method1716((float) var68 * var18 + var67, -123);
                        this.field1390.method1205((byte) -69, var61);
                        this.field1390.method1205((byte) -69, var62);
                        this.field1390.method1205((byte) -69, var63);
                        this.field1390.method1205((byte) -69, var64);
                    }
                    if (this.field1405[var44] > 64) {
                        int var47 = this.field1405[var44] - 64 - 1;
                        for (int var48 = this.field1408[var47] - 1; var48 >= 0; var48--) {
                            class251 var49 = this.field1406[var47][var48];
                            int var50 = var49.field3560;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field3569 >> 12);
                            float var56 = (float) (var49.field3568 >> 12);
                            float var57 = (float) (var49.field3559 >> 12);
                            int var58 = var49.field3556 >> 12;
                            this.field1390.method1716(0.0F, -88);
                            this.field1390.method1716(0.0F, -119);
                            this.field1390.method1716((float) (-var58) * var10 + var55, -70);
                            this.field1390.method1716((float) (-var58) * var11 + var56, -101);
                            this.field1390.method1716((float) (-var58) * var12 + var57, -103);
                            this.field1390.method1205((byte) -69, var51);
                            this.field1390.method1205((byte) -69, var52);
                            this.field1390.method1205((byte) -69, var53);
                            this.field1390.method1205((byte) -69, var54);
                            this.field1390.method1716(1.0F, -72);
                            this.field1390.method1716(0.0F, -103);
                            this.field1390.method1716((float) var58 * var13 + var55, -84);
                            this.field1390.method1716((float) var58 * var14 + var56, -88);
                            this.field1390.method1716((float) var58 * var15 + var57, -81);
                            this.field1390.method1205((byte) -69, var51);
                            this.field1390.method1205((byte) -69, var52);
                            this.field1390.method1205((byte) -69, var53);
                            this.field1390.method1205((byte) -69, var54);
                            this.field1390.method1716(1.0F, -72);
                            this.field1390.method1716(1.0F, -101);
                            this.field1390.method1716((float) var58 * var10 + var55, -80);
                            this.field1390.method1716((float) var58 * var11 + var56, -95);
                            this.field1390.method1716((float) var58 * var12 + var57, -117);
                            this.field1390.method1205((byte) -69, var51);
                            this.field1390.method1205((byte) -69, var52);
                            this.field1390.method1205((byte) -69, var53);
                            this.field1390.method1205((byte) -69, var54);
                            this.field1390.method1716(0.0F, -106);
                            this.field1390.method1716(1.0F, -102);
                            this.field1390.method1716((float) var58 * var16 + var55, -118);
                            this.field1390.method1716((float) var58 * var17 + var56, -109);
                            this.field1390.method1716((float) var58 * var18 + var57, -95);
                            this.field1390.method1205((byte) -69, var51);
                            this.field1390.method1205((byte) -69, var52);
                            this.field1390.method1205((byte) -69, var53);
                            this.field1390.method1205((byte) -69, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field1405[var19] <= 64 ? this.field1405[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class251 var34 = this.field1410[var19][var21];
                        int var35 = var34.field3560;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field3569 >> 12);
                        float var41 = (float) (var34.field3568 >> 12);
                        float var42 = (float) (var34.field3559 >> 12);
                        int var43 = var34.field3556 >> 12;
                        this.field1390.method1715(0.0F, (byte) -6);
                        this.field1390.method1715(0.0F, (byte) -6);
                        this.field1390.method1715((float) (-var43) * var10 + var40, (byte) -6);
                        this.field1390.method1715((float) (-var43) * var11 + var41, (byte) -6);
                        this.field1390.method1715((float) (-var43) * var12 + var42, (byte) -6);
                        this.field1390.method1205((byte) -69, var36);
                        this.field1390.method1205((byte) -69, var37);
                        this.field1390.method1205((byte) -69, var38);
                        this.field1390.method1205((byte) -69, var39);
                        this.field1390.method1715(1.0F, (byte) -6);
                        this.field1390.method1715(0.0F, (byte) -6);
                        this.field1390.method1715((float) var43 * var13 + var40, (byte) -6);
                        this.field1390.method1715((float) var43 * var14 + var41, (byte) -6);
                        this.field1390.method1715((float) var43 * var15 + var42, (byte) -6);
                        this.field1390.method1205((byte) -69, var36);
                        this.field1390.method1205((byte) -69, var37);
                        this.field1390.method1205((byte) -69, var38);
                        this.field1390.method1205((byte) -69, var39);
                        this.field1390.method1715(1.0F, (byte) -6);
                        this.field1390.method1715(1.0F, (byte) -6);
                        this.field1390.method1715((float) var43 * var10 + var40, (byte) -6);
                        this.field1390.method1715((float) var43 * var11 + var41, (byte) -6);
                        this.field1390.method1715((float) var43 * var12 + var42, (byte) -6);
                        this.field1390.method1205((byte) -69, var36);
                        this.field1390.method1205((byte) -69, var37);
                        this.field1390.method1205((byte) -69, var38);
                        this.field1390.method1205((byte) -69, var39);
                        this.field1390.method1715(0.0F, (byte) -6);
                        this.field1390.method1715(1.0F, (byte) -6);
                        this.field1390.method1715((float) var43 * var16 + var40, (byte) -6);
                        this.field1390.method1715((float) var43 * var17 + var41, (byte) -6);
                        this.field1390.method1715((float) var43 * var18 + var42, (byte) -6);
                        this.field1390.method1205((byte) -69, var36);
                        this.field1390.method1205((byte) -69, var37);
                        this.field1390.method1205((byte) -69, var38);
                        this.field1390.method1205((byte) -69, var39);
                    }
                    if (this.field1405[var19] > 64) {
                        int var22 = this.field1405[var19] - 64 - 1;
                        for (int var23 = this.field1408[var22] - 1; var23 >= 0; var23--) {
                            class251 var24 = this.field1406[var22][var23];
                            int var25 = var24.field3560;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field3569 >> 12);
                            float var31 = (float) (var24.field3568 >> 12);
                            float var32 = (float) (var24.field3559 >> 12);
                            int var33 = var24.field3556 >> 12;
                            this.field1390.method1715(0.0F, (byte) -6);
                            this.field1390.method1715(0.0F, (byte) -6);
                            this.field1390.method1715((float) (-var33) * var10 + var30, (byte) -6);
                            this.field1390.method1715((float) (-var33) * var11 + var31, (byte) -6);
                            this.field1390.method1715((float) (-var33) * var12 + var32, (byte) -6);
                            this.field1390.method1205((byte) -69, var26);
                            this.field1390.method1205((byte) -69, var27);
                            this.field1390.method1205((byte) -69, var28);
                            this.field1390.method1205((byte) -69, var29);
                            this.field1390.method1715(1.0F, (byte) -6);
                            this.field1390.method1715(0.0F, (byte) -6);
                            this.field1390.method1715((float) var33 * var13 + var30, (byte) -6);
                            this.field1390.method1715((float) var33 * var14 + var31, (byte) -6);
                            this.field1390.method1715((float) var33 * var15 + var32, (byte) -6);
                            this.field1390.method1205((byte) -69, var26);
                            this.field1390.method1205((byte) -69, var27);
                            this.field1390.method1205((byte) -69, var28);
                            this.field1390.method1205((byte) -69, var29);
                            this.field1390.method1715(1.0F, (byte) -6);
                            this.field1390.method1715(1.0F, (byte) -6);
                            this.field1390.method1715((float) var33 * var10 + var30, (byte) -6);
                            this.field1390.method1715((float) var33 * var11 + var31, (byte) -6);
                            this.field1390.method1715((float) var33 * var12 + var32, (byte) -6);
                            this.field1390.method1205((byte) -69, var26);
                            this.field1390.method1205((byte) -69, var27);
                            this.field1390.method1205((byte) -69, var28);
                            this.field1390.method1205((byte) -69, var29);
                            this.field1390.method1715(0.0F, (byte) -6);
                            this.field1390.method1715(1.0F, (byte) -6);
                            this.field1390.method1715((float) var33 * var16 + var30, (byte) -6);
                            this.field1390.method1715((float) var33 * var17 + var31, (byte) -6);
                            this.field1390.method1715((float) var33 * var18 + var32, (byte) -6);
                            this.field1390.method1205((byte) -69, var26);
                            this.field1390.method1205((byte) -69, var27);
                            this.field1390.method1205((byte) -69, var28);
                            this.field1390.method1205((byte) -69, var29);
                        }
                    }
                }
            }
        }
        if (this.field1390.field2610 != 0) {
            this.field1403.method447(this.field1390.field2610, this.field1390.field2622, 24, (byte) 98);
            arg1.method2255(this.field1402, (byte) 4, null, this.field1401, this.field1400);
            arg1.method2281(7, this.field1390.field2610 / 24, 0, -34845);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZI)Z", line = 446)
    public static final boolean method700(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1387++;
            return (arg0 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V", line = 473)
    public static void method701(boolean arg0) {
        if (arg0) {
            field1385 = -5;
        }
        field1391 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lbe;ILad;)V", line = 487)
    public final void method702(class33 arg0, int arg1, class362 arg2) {
        field1384++;
        if (arg2.field5453 == null) {
            return;
        }
        this.method698((byte) -125, arg2);
        float var4 = arg2.field5453.field4451;
        float var5 = arg2.field5453.field4448;
        float var6 = arg2.field5453.field4449;
        float var7 = arg2.field5453.field4440;
        if (arg1 > -21) {
            method700(75, true, -101);
        }
        try {
            if (arg0.field381) {
                int var26 = arg0.field382 - arg0.field384;
                int var27;
                if (var26 + 2 > 1600) {
                    var27 = class112.method688((byte) -128, var26) + 1 - this.field1404;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var27 = 0;
                    var26 += 2;
                }
                class481 var28 = arg0.field378.field3242;
                class481 var29 = var28.field7068;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field1407 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field1405[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field1408[var34] = 0;
                    }
                    while (var28 != var29) {
                        class251 var35 = (class251) var29;
                        if (var32) {
                            var30 = var35.field3562;
                            var31 = var35.field3563;
                            var32 = false;
                        } else if (var35.field3562 != var30 || var35.field3563 != var31) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field3559 >> 12) * var6 + (float) (var35.field3569 >> 12) * var4 + (float) (var35.field3568 >> 12) * var5 + var7) - arg0.field384 >> var27;
                        if (var36 < 1600) {
                            if (this.field1405[var36] >= 64) {
                                label139: {
                                    if (this.field1405[var36] == 64) {
                                        if (this.field1407 == 64) {
                                            break label139;
                                        }
                                        this.field1405[var36] += this.field1407++ + 1;
                                    }
                                    class251[] var38 = this.field1406[this.field1405[var36] - 64 - 1];
                                    int var10002 = this.field1405[var36] - 65;
                                    int var10004 = this.field1408[this.field1405[var36] - 65];
                                    this.field1408[var10002] = this.field1408[this.field1405[var36] - 65] + 1;
                                    var38[var10004] = var35;
                                }
                            } else {
                                this.field1410[var36][this.field1405[var36]++] = var35;
                            }
                        }
                        var29 = var29.field7068;
                    }
                    if (var30 >= 0) {
                        arg2.method2286(var30, (byte) -83);
                    } else {
                        arg2.method2286(-1, (byte) -83);
                    }
                    if (var31 && class518.field7543 != arg2.field5386) {
                        arg2.method315(class518.field7543);
                    } else if (arg2.field5386 != 1.0F) {
                        arg2.method315(1.0F);
                    }
                    this.method699((byte) -127, arg2, var26);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class481 var11 = arg0.field378.field3242;
                for (class481 var12 = var11.field7068; var12 != var11; var12 = var12.field7068) {
                    class251 var13 = (class251) var12;
                    int var14 = (int) ((float) (var13.field3559 >> 12) * var6 + (float) (var13.field3569 >> 12) * var4 + (float) (var13.field3568 >> 12) * var5 + var7);
                    this.field1409[var8++] = var14;
                    if (var14 > var10) {
                        var10 = var14;
                    }
                    if (var9 > var14) {
                        var9 = var14;
                    }
                }
                int var15 = var10 - var9;
                int var16;
                if (var15 + 2 <= 1600) {
                    var16 = 0;
                    var15 += 2;
                } else {
                    var16 = class112.method688((byte) -122, var15) + 1 - this.field1404;
                    var15 = (var15 >> var16) + 2;
                }
                int var17 = 0;
                class481 var18 = var11.field7068;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var18) {
                    this.field1407 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field1405[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field1408[var23] = 0;
                    }
                    while (var11 != var18) {
                        class251 var24 = (class251) var18;
                        if (var21) {
                            var21 = false;
                            var20 = var24.field3563;
                            var19 = var24.field3562;
                        }
                        if (var17 > 0 && (var24.field3562 != var19 || var24.field3563 != var20)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field1409[var17++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field1405[var25] < 64) {
                                this.field1410[var25][this.field1405[var25]++] = var24;
                            } else {
                                label183: {
                                    if (this.field1405[var25] == 64) {
                                        if (this.field1407 == 64) {
                                            break label183;
                                        }
                                        this.field1405[var25] += this.field1407++ + 1;
                                    }
                                    this.field1406[this.field1405[var25] - 64 - 1][this.field1408[this.field1405[var25] - 1 - 64]++] = var24;
                                }
                            }
                        }
                        var18 = var18.field7068;
                    }
                    if (var19 < 0) {
                        arg2.method2286(-1, (byte) -89);
                    } else {
                        arg2.method2286(var19, (byte) -75);
                    }
                    if (var20 && class518.field7543 != arg2.field5386) {
                        arg2.method315(class518.field7543);
                    } else if (arg2.field5386 != 1.0F) {
                        arg2.method315(1.0F);
                    }
                    this.method699((byte) -75, arg2, var15);
                }
            }
        } catch (Exception var37) {
        }
        this.method695(arg2, -112);
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(BLad;)V", line = 771)
    public final void method703(byte arg0, class362 arg1) {
        field1386++;
        this.field1403 = arg1.method2317(24, true, true, 196584, null);
        this.field1400 = new class371(this.field1403, 5126, 2, 0);
        this.field1402 = new class371(this.field1403, 5126, 3, 8);
        this.field1401 = new class371(this.field1403, 5121, 4, 20);
        if (arg0 != 105) {
            method704(4, null, -69);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/io/File;I)[B", line = 785)
    public static final byte[] method704(int arg0, File arg1, int arg2) {
        field1396++;
        try {
            byte[] var3 = new byte[arg0];
            if (arg2 != 32584) {
                field1385 = -91;
            }
            class266.method1750(var3, arg1, -5341, arg0);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V", line = 811)
    public static final void method705(byte arg0) {
        for (class171 var1 = (class171) class1.field1.method3290(255); var1 != null; var1 = (class171) class1.field1.method3290(255)) {
            class239.method1598(true, var1);
        }
        field1397++;
        int var2;
        int var3;
        if (class595.field8694.method2426(class81.field908, -5)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class394.field6023;
            var3 = class394.field6023;
        }
        client.method1669();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1678();
            client.method1677(var4);
            client.method1666(var4);
        }
        client.method1679();
        int var5 = -37 % (arg0 / 56);
        client.method1681();
    }
}
