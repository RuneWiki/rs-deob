import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class129 {

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "[F")
    private float[] field1746 = new float[16];

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "Lwm;")
    private class302 field1752 = new class302(786336);

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    private int field1756 = class241.method1678(1600, false);

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "[I")
    private int[] field1760 = new int[1600];

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "[[Lwu;")
    private class113[][] field1762 = new class113[1600][64];

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "[I")
    private int[] field1758 = new int[8191];

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    private int field1761 = 0;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "[I")
    private int[] field1759 = new int[64];

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "[[Lwu;")
    private class113[][] field1763 = new class113[64][768];

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "Lbi;")
    public static class104 field1742 = new class104(18, 6);

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "[I")
    public static int[] field1748 = new int[25];

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "[I")
    public static int[] field1750 = new int[14];

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "Lqu;")
    public static class219 field1751 = new class219(16, 8);

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "Lui;")
    private class383 field1755;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "Ldb;")
    private class67 field1753;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "Ldb;")
    private class67 field1754;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "Ldb;")
    private class67 field1757;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
    public static void method801(boolean arg0) {
        field1750 = null;
        field1748 = null;
        field1742 = null;
        field1751 = null;
        if (arg0) {
            field1742 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "()V")
    public static final void method802() {
        for (int var0 = 0; var0 < class518.field7686; var0++) {
            class423 var1 = class137.field1880[var0];
            class250.method1728(var1);
            class137.field1880[var0] = null;
        }
        class518.field7686 = 0;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lna;Z)V")
    public final void method803(class211 arg0, boolean arg1) {
        field1745++;
        this.field1755 = arg0.method1544(arg1, 24, 196584, null, true);
        this.field1754 = new class67(this.field1755, 5126, 2, 0);
        this.field1753 = new class67(this.field1755, 5126, 3, 8);
        this.field1757 = new class67(this.field1755, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILna;)V")
    private final void method804(int arg0, class211 arg1) {
        field1743++;
        arg1.method1571(true, (byte) -13);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (arg0 == -21997 && class83.field1218 != arg1.field3613) {
            arg1.method1301(class83.field1218);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lna;B)V")
    private final void method805(class211 arg0, byte arg1) {
        field1747++;
        class83.field1218 = arg0.field3613;
        arg0.method1559(-15631);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method1571(false, (byte) -4);
        arg0.method1553(-2, true);
        if (arg1 <= 13) {
            this.field1756 = -12;
        }
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBLna;)V")
    private final void method806(int arg0, byte arg1, class211 arg2) {
        field1744++;
        OpenGL.glGetFloatv(2982, this.field1746, 0);
        float var4 = this.field1746[0];
        float var5 = this.field1746[4];
        float var6 = this.field1746[8];
        float var7 = this.field1746[1];
        if (arg1 > -125) {
            this.field1763 = null;
        }
        float var8 = this.field1746[5];
        float var9 = this.field1746[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field1752.field3162 = 0;
        if (arg2.field3560) {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field1760[var19] <= 64 ? this.field1760[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class113 var34 = this.field1762[var19][var21];
                        int var35 = var34.field1584;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field1582 >> 12);
                        float var41 = (float) (var34.field1588 >> 12);
                        float var42 = (float) (var34.field1592 >> 12);
                        int var43 = var34.field1594 >> 12;
                        this.field1752.method2030(0.0F, 9);
                        this.field1752.method2030(0.0F, 9);
                        this.field1752.method2030((float) (-var43) * var10 + var40, 9);
                        this.field1752.method2030((float) (-var43) * var11 + var41, 9);
                        this.field1752.method2030((float) (-var43) * var12 + var42, 9);
                        this.field1752.method1479((byte) -94, var36);
                        this.field1752.method1479((byte) -88, var37);
                        this.field1752.method1479((byte) -128, var38);
                        this.field1752.method1479((byte) -104, var39);
                        this.field1752.method2030(1.0F, 9);
                        this.field1752.method2030(0.0F, 9);
                        this.field1752.method2030((float) var43 * var13 + var40, 9);
                        this.field1752.method2030((float) var43 * var14 + var41, 9);
                        this.field1752.method2030((float) var43 * var15 + var42, 9);
                        this.field1752.method1479((byte) -128, var36);
                        this.field1752.method1479((byte) -109, var37);
                        this.field1752.method1479((byte) -119, var38);
                        this.field1752.method1479((byte) -120, var39);
                        this.field1752.method2030(1.0F, 9);
                        this.field1752.method2030(1.0F, 9);
                        this.field1752.method2030((float) var43 * var10 + var40, 9);
                        this.field1752.method2030((float) var43 * var11 + var41, 9);
                        this.field1752.method2030((float) var43 * var12 + var42, 9);
                        this.field1752.method1479((byte) -114, var36);
                        this.field1752.method1479((byte) -115, var37);
                        this.field1752.method1479((byte) -117, var38);
                        this.field1752.method1479((byte) -124, var39);
                        this.field1752.method2030(0.0F, 9);
                        this.field1752.method2030(1.0F, 9);
                        this.field1752.method2030((float) var43 * var16 + var40, 9);
                        this.field1752.method2030((float) var43 * var17 + var41, 9);
                        this.field1752.method2030((float) var43 * var18 + var42, 9);
                        this.field1752.method1479((byte) -91, var36);
                        this.field1752.method1479((byte) -118, var37);
                        this.field1752.method1479((byte) -128, var38);
                        this.field1752.method1479((byte) -126, var39);
                    }
                    if (this.field1760[var19] > 64) {
                        int var22 = this.field1760[var19] - 64 - 1;
                        for (int var23 = this.field1759[var22] - 1; var23 >= 0; var23--) {
                            class113 var24 = this.field1763[var22][var23];
                            int var25 = var24.field1584;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field1582 >> 12);
                            float var31 = (float) (var24.field1588 >> 12);
                            float var32 = (float) (var24.field1592 >> 12);
                            int var33 = var24.field1594 >> 12;
                            this.field1752.method2030(0.0F, 9);
                            this.field1752.method2030(0.0F, 9);
                            this.field1752.method2030((float) (-var33) * var10 + var30, 9);
                            this.field1752.method2030((float) (-var33) * var11 + var31, 9);
                            this.field1752.method2030((float) (-var33) * var12 + var32, 9);
                            this.field1752.method1479((byte) -96, var26);
                            this.field1752.method1479((byte) -117, var27);
                            this.field1752.method1479((byte) -96, var28);
                            this.field1752.method1479((byte) -88, var29);
                            this.field1752.method2030(1.0F, 9);
                            this.field1752.method2030(0.0F, 9);
                            this.field1752.method2030((float) var33 * var13 + var30, 9);
                            this.field1752.method2030((float) var33 * var14 + var31, 9);
                            this.field1752.method2030((float) var33 * var15 + var32, 9);
                            this.field1752.method1479((byte) -110, var26);
                            this.field1752.method1479((byte) -94, var27);
                            this.field1752.method1479((byte) -103, var28);
                            this.field1752.method1479((byte) -125, var29);
                            this.field1752.method2030(1.0F, 9);
                            this.field1752.method2030(1.0F, 9);
                            this.field1752.method2030((float) var33 * var10 + var30, 9);
                            this.field1752.method2030((float) var33 * var11 + var31, 9);
                            this.field1752.method2030((float) var33 * var12 + var32, 9);
                            this.field1752.method1479((byte) -105, var26);
                            this.field1752.method1479((byte) -121, var27);
                            this.field1752.method1479((byte) -98, var28);
                            this.field1752.method1479((byte) -91, var29);
                            this.field1752.method2030(0.0F, 9);
                            this.field1752.method2030(1.0F, 9);
                            this.field1752.method2030((float) var33 * var16 + var30, 9);
                            this.field1752.method2030((float) var33 * var17 + var31, 9);
                            this.field1752.method2030((float) var33 * var18 + var32, 9);
                            this.field1752.method1479((byte) -94, var26);
                            this.field1752.method1479((byte) -102, var27);
                            this.field1752.method1479((byte) -110, var28);
                            this.field1752.method1479((byte) -112, var29);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field1760[var44] <= 64 ? this.field1760[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class113 var59 = this.field1762[var44][var46];
                        int var60 = var59.field1584;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field1582 >> 12);
                        float var66 = (float) (var59.field1588 >> 12);
                        float var67 = (float) (var59.field1592 >> 12);
                        int var68 = var59.field1594 >> 12;
                        this.field1752.method2034(0.0F, false);
                        this.field1752.method2034(0.0F, false);
                        this.field1752.method2034((float) (-var68) * var10 + var65, false);
                        this.field1752.method2034((float) (-var68) * var11 + var66, false);
                        this.field1752.method2034((float) (-var68) * var12 + var67, false);
                        this.field1752.method1479((byte) -110, var61);
                        this.field1752.method1479((byte) -106, var62);
                        this.field1752.method1479((byte) -120, var63);
                        this.field1752.method1479((byte) -109, var64);
                        this.field1752.method2034(1.0F, false);
                        this.field1752.method2034(0.0F, false);
                        this.field1752.method2034((float) var68 * var13 + var65, false);
                        this.field1752.method2034((float) var68 * var14 + var66, false);
                        this.field1752.method2034((float) var68 * var15 + var67, false);
                        this.field1752.method1479((byte) -128, var61);
                        this.field1752.method1479((byte) -108, var62);
                        this.field1752.method1479((byte) -126, var63);
                        this.field1752.method1479((byte) -95, var64);
                        this.field1752.method2034(1.0F, false);
                        this.field1752.method2034(1.0F, false);
                        this.field1752.method2034((float) var68 * var10 + var65, false);
                        this.field1752.method2034((float) var68 * var11 + var66, false);
                        this.field1752.method2034((float) var68 * var12 + var67, false);
                        this.field1752.method1479((byte) -108, var61);
                        this.field1752.method1479((byte) -89, var62);
                        this.field1752.method1479((byte) -126, var63);
                        this.field1752.method1479((byte) -93, var64);
                        this.field1752.method2034(0.0F, false);
                        this.field1752.method2034(1.0F, false);
                        this.field1752.method2034((float) var68 * var16 + var65, false);
                        this.field1752.method2034((float) var68 * var17 + var66, false);
                        this.field1752.method2034((float) var68 * var18 + var67, false);
                        this.field1752.method1479((byte) -98, var61);
                        this.field1752.method1479((byte) -89, var62);
                        this.field1752.method1479((byte) -113, var63);
                        this.field1752.method1479((byte) -108, var64);
                    }
                    if (this.field1760[var44] > 64) {
                        int var47 = this.field1760[var44] - 1 - 64;
                        for (int var48 = this.field1759[var47] - 1; var48 >= 0; var48--) {
                            class113 var49 = this.field1763[var47][var48];
                            int var50 = var49.field1584;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field1582 >> 12);
                            float var56 = (float) (var49.field1588 >> 12);
                            float var57 = (float) (var49.field1592 >> 12);
                            int var58 = var49.field1594 >> 12;
                            this.field1752.method2034(0.0F, false);
                            this.field1752.method2034(0.0F, false);
                            this.field1752.method2034((float) (-var58) * var10 + var55, false);
                            this.field1752.method2034((float) (-var58) * var11 + var56, false);
                            this.field1752.method2034((float) (-var58) * var12 + var57, false);
                            this.field1752.method1479((byte) -126, var51);
                            this.field1752.method1479((byte) -110, var52);
                            this.field1752.method1479((byte) -94, var53);
                            this.field1752.method1479((byte) -96, var54);
                            this.field1752.method2034(1.0F, false);
                            this.field1752.method2034(0.0F, false);
                            this.field1752.method2034((float) var58 * var13 + var55, false);
                            this.field1752.method2034((float) var58 * var14 + var56, false);
                            this.field1752.method2034((float) var58 * var15 + var57, false);
                            this.field1752.method1479((byte) -128, var51);
                            this.field1752.method1479((byte) -93, var52);
                            this.field1752.method1479((byte) -92, var53);
                            this.field1752.method1479((byte) -118, var54);
                            this.field1752.method2034(1.0F, false);
                            this.field1752.method2034(1.0F, false);
                            this.field1752.method2034((float) var58 * var10 + var55, false);
                            this.field1752.method2034((float) var58 * var11 + var56, false);
                            this.field1752.method2034((float) var58 * var12 + var57, false);
                            this.field1752.method1479((byte) -119, var51);
                            this.field1752.method1479((byte) -127, var52);
                            this.field1752.method1479((byte) -101, var53);
                            this.field1752.method1479((byte) -119, var54);
                            this.field1752.method2034(0.0F, false);
                            this.field1752.method2034(1.0F, false);
                            this.field1752.method2034((float) var58 * var16 + var55, false);
                            this.field1752.method2034((float) var58 * var17 + var56, false);
                            this.field1752.method2034((float) var58 * var18 + var57, false);
                            this.field1752.method1479((byte) -113, var51);
                            this.field1752.method1479((byte) -118, var52);
                            this.field1752.method1479((byte) -95, var53);
                            this.field1752.method1479((byte) -88, var54);
                        }
                    }
                }
            }
        }
        if (this.field1752.field3162 != 0) {
            this.field1755.method134(this.field1752.field3162, 24, (byte) 118, this.field1752.field3193);
            arg2.method1548(this.field1757, this.field1753, this.field1754, 32886, null);
            arg2.method1567(0, -100663297, this.field1752.field3162 / 24, 7);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lna;ILdm;)V")
    public final void method807(class211 arg0, int arg1, class519 arg2) {
        field1749++;
        if (arg0.field3585 == null) {
            return;
        }
        this.method805(arg0, (byte) 24);
        float var4 = arg0.field3585.field1297;
        float var5 = arg0.field3585.field1310;
        if (arg1 >= -95) {
            this.method803(null, false);
        }
        float var6 = arg0.field3585.field1299;
        float var7 = arg0.field3585.field1287;
        try {
            if (arg2.field7693) {
                int var26 = arg2.field7691 - arg2.field7692;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = (class241.method1678(var26, false) - this.field1756) + 1;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                class282 var28 = arg2.field7690.field5963;
                class282 var29 = var28.field4453;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field1761 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field1760[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field1759[var34] = 0;
                    }
                    while (var28 != var29) {
                        class113 var35 = (class113) var29;
                        if (var32) {
                            var30 = var35.field1591;
                            var32 = false;
                            var31 = var35.field1590;
                        } else if (var35.field1591 != var30 || var35.field1590 != var31) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field1592 >> 12) * var6 + (float) (var35.field1588 >> 12) * var5 + (float) (var35.field1582 >> 12) * var4 + var7) - arg2.field7692 >> var27;
                        if (var36 < 1600) {
                            if (this.field1760[var36] < 64) {
                                this.field1762[var36][this.field1760[var36]++] = var35;
                            } else {
                                label144: {
                                    if (this.field1760[var36] == 64) {
                                        if (this.field1761 == 64) {
                                            break label144;
                                        }
                                        this.field1760[var36] += (this.field1761++) + 1;
                                    }
                                    class113[] var38 = this.field1763[this.field1760[var36] - 64 - 1];
                                    int var10002 = this.field1760[var36] - 65;
                                    int var10004 = this.field1759[this.field1760[var36] - 65];
                                    this.field1759[var10002] = this.field1759[this.field1760[var36] - 65] + 1;
                                    var38[var10004] = var35;
                                }
                            }
                        }
                        var29 = var29.field4453;
                    }
                    if (var30 >= 0) {
                        arg0.method1540(35, arg0.field3466.method1886(true, var30));
                        arg0.method1494(arg0.field7480.method1366(var30, (byte) 62).field7275, -25951);
                    } else {
                        arg0.method1540(77, null);
                    }
                    if (var31 && class83.field1218 != arg0.field3613) {
                        arg0.method1301(class83.field1218);
                    } else if (arg0.field3613 != 1.0F) {
                        arg0.method1301(1.0F);
                    }
                    this.method806(var26, (byte) -126, arg0);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class282 var11 = arg2.field7690.field5963;
                for (class282 var12 = var11.field4453; var12 != var11; var12 = var12.field4453) {
                    class113 var13 = (class113) var12;
                    int var14 = (int) ((float) (var13.field1592 >> 12) * var6 + (float) (var13.field1588 >> 12) * var5 + (float) (var13.field1582 >> 12) * var4 + var7);
                    this.field1758[var8++] = var14;
                    if (var14 > var10) {
                        var10 = var14;
                    }
                    if (var9 > var14) {
                        var9 = var14;
                    }
                }
                int var15 = var10 - var9;
                int var16;
                if ((var15 + 2) > 1600) {
                    var16 = class241.method1678(var15, false) + 1 - this.field1756;
                    var15 = (var15 >> var16) + 2;
                } else {
                    var16 = 0;
                    var15 += 2;
                }
                class282 var17 = var11.field4453;
                int var18 = 0;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var17) {
                    this.field1761 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field1760[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field1759[var23] = 0;
                    }
                    while (var11 != var17) {
                        class113 var24 = (class113) var17;
                        if (var21) {
                            var21 = false;
                            var20 = var24.field1590;
                            var19 = var24.field1591;
                        }
                        if (var18 > 0 && (var24.field1591 != var19 || var24.field1590 != var20)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field1758[var18++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field1760[var25] < 64) {
                                this.field1762[var25][this.field1760[var25]++] = var24;
                            } else {
                                label189: {
                                    if (this.field1760[var25] == 64) {
                                        if (this.field1761 == 64) {
                                            break label189;
                                        }
                                        this.field1760[var25] += this.field1761++ + 1;
                                    }
                                    this.field1763[this.field1760[var25] - 65][this.field1759[this.field1760[var25] - 1 - 64]++] = var24;
                                }
                            }
                        }
                        var17 = var17.field4453;
                    }
                    if (var19 < 0) {
                        arg0.method1540(101, null);
                    } else {
                        arg0.method1540(106, arg0.field3466.method1886(true, var19));
                        arg0.method1494(arg0.field7480.method1366(var19, (byte) 59).field7275, -25951);
                    }
                    if (var20 && class83.field1218 != arg0.field3613) {
                        arg0.method1301(class83.field1218);
                    } else if (arg0.field3613 != 1.0F) {
                        arg0.method1301(1.0F);
                    }
                    this.method806(var15, (byte) -127, arg0);
                }
            }
        } catch (Exception var37) {
        }
        this.method804(-21997, arg0);
    }
}
