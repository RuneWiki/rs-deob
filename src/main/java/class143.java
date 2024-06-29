import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class143 extends class338 {

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "[Lwo;")
    public class52[] field1831;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "[B")
    public byte[] field1827;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "[B")
    public byte[] field1819;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "[B")
    public byte[] field1822;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "[I")
    private int[] field1829;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "[S")
    public short[] field1833;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "[Lqc;")
    public class94[] field1824;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public int field1821;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "[I")
    public static int[] field1826 = new int[2];

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1832 = new CRC32();

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field1835 = 0;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "Ljava/lang/String;")
    public static String field1836 = "flash1:";

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field1838 = 0;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1837 = "Please remove ";

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "Lib;")
    public static class247 field1834;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1820;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILqb;[I[B)Z", line = 5)
    public final boolean method775(int arg0, class85 arg1, int[] arg2, byte[] arg3) {
        field1825++;
        boolean var5 = true;
        int var6 = 0;
        class52 var7 = null;
        int var8 = 0;
        int var9 = -6 / ((arg0 + 17) / 56);
        while (var8 < 128) {
            if (arg3 == null || arg3[var8] != 0) {
                int var10 = this.field1829[var8];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg1.method467(arg2, 21, var10 >> 2);
                        } else {
                            var7 = arg1.method465(arg2, 128, var10 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1831[var8] = var7;
                        this.field1829[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V", line = 61)
    public static void method776(boolean arg0) {
        if (!arg0) {
            method780((class250) null, 12);
        }
        field1832 = null;
        field1834 = null;
        field1820 = null;
        field1826 = null;
        field1837 = null;
        field1836 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Lhs;", line = 78)
    public static final class420 method777(int arg0, int arg1, int arg2) {
        class96 var3 = class176.field2209[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class420 var4 = var3.field1124;
            var3.field1124 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 95)
    public static final void method778(Component arg0, int arg1) {
        if (arg1 != 2) {
            method776(true);
        }
        arg0.removeMouseListener(class110.field1351);
        field1816++;
        arg0.removeMouseMotionListener(class110.field1351);
        arg0.removeFocusListener(class110.field1351);
        class67.field687 = 0;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V", line = 118)
    public final void method779(int arg0) {
        if (arg0 != 0) {
            field1836 = null;
        }
        this.field1829 = null;
        field1828++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ltq;I)Lmr;", line = 129)
    public static final class83 method780(class250 arg0, int arg1) {
        if (arg1 >= -68) {
            return null;
        }
        arg0.method1350(31351);
        field1830++;
        int var2 = arg0.method1350(31351);
        class83 var3 = class411.method2563(-109, var2);
        var3.field919 = arg0.method1350(31351);
        int var4 = arg0.method1350(31351);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1350(31351);
            var3.method35(var6, (byte) 95, arg0);
        }
        var3.method120(false);
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 170)
    public class143() {
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([Lfd;II)V", line = 173)
    public static final void method781(class194[] arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class194 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field2492 == 0) {
                    if (var4.field2620 != null) {
                        method781(var4.field2620, 1315, arg2);
                    }
                    class141 var5 = (class141) class337.field4495.method308((long) var4.field2502, (byte) 112);
                    if (var5 != null) {
                        class345.method2011(var5.field1802, arg2, -13);
                    }
                }
                if (arg2 == 0 && var4.field2458 != null) {
                    class425 var6 = new class425();
                    var6.field6240 = var4.field2458;
                    var6.field6242 = var4;
                    class277.method1523(var6);
                }
                if (arg2 == 1 && var4.field2497 != null) {
                    if (var4.field2542 >= 0) {
                        class194 var7 = class57.method301(var4.field2502, (byte) 77);
                        if (var7 == null || var7.field2620 == null || var4.field2542 >= var7.field2620.length || var7.field2620[var4.field2542] != var4) {
                            continue;
                        }
                    }
                    class425 var8 = new class425();
                    var8.field6240 = var4.field2497;
                    var8.field6242 = var4;
                    class277.method1523(var8);
                }
            }
        }
        field1817++;
        if (arg1 != 1315) {
            field1836 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "([B)V", line = 244)
    public class143(byte[] arg0) {
        this.field1831 = new class52[128];
        this.field1827 = new byte[128];
        this.field1819 = new byte[128];
        this.field1822 = new byte[128];
        this.field1829 = new int[128];
        this.field1833 = new short[128];
        this.field1824 = new class94[128];
        class250 var2 = new class250(arg0);
        int var3;
        for (var3 = 0; var2.field3406[var2.field3389 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1363((byte) -99);
        }
        var3++;
        var2.field3389++;
        int var6 = var2.field3389;
        var2.field3389 += var3;
        int var7;
        for (var7 = 0; var2.field3406[var2.field3389 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1363((byte) 112);
        }
        var7++;
        var2.field3389++;
        int var10 = var2.field3389;
        var2.field3389 += var7;
        int var11;
        for (var11 = 0; var2.field3406[var2.field3389 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1363((byte) 1);
        }
        var2.field3389++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method1350(31351);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var105 <= var16) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class94[] var18 = new class94[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class94 var102 = var18[var19] = new class94();
            int var103 = var2.method1350(31351);
            if (var103 > 0) {
                var102.field1088 = new byte[var103 * 2];
            }
            int var104 = var2.method1350(31351);
            if (var104 > 0) {
                var102.field1084 = new byte[var104 * 2 + 2];
                var102.field1084[1] = 64;
            }
        }
        int var20 = var2.method1350(31351);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method1350(31351);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field3406[var2.field3389 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1363((byte) 116);
        }
        var24++;
        var2.field3389++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1350(31351);
            this.field1833[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1350(31351);
            this.field1833[var30] = (short) (this.field1833[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var32) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var2.method1329((byte) -18);
            }
            this.field1833[var34] = (short) (this.field1833[var34] + class262.method1461(var33 - 1 << 14, 32768));
            var31--;
            this.field1829[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1829[var38] != 0) {
                if (var36 == 0) {
                    if (var4.length > var35) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                    var37 = var2.field3406[var6++] - 1;
                }
                var36--;
                this.field1822[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1829[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field3406[var10++] + 16 << 2;
                    if (var8.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                }
                this.field1819[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class94 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1829[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                this.field1824[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var48 < var25.length) {
                    var47 = var25[var48++];
                } else {
                    var47 = -1;
                }
                if (this.field1829[var50] > 0) {
                    var49 = var2.method1350(31351) + 1;
                }
            }
            this.field1827[var50] = (byte) var49;
            var47--;
        }
        this.field1821 = var2.method1350(31351) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class94 var99 = var18[var51];
            if (var99.field1088 != null) {
                for (int var100 = 1; var100 < var99.field1088.length; var100 += 2) {
                    var99.field1088[var100] = var2.method1363((byte) -113);
                }
            }
            if (var99.field1084 != null) {
                for (int var101 = 3; var101 < (var99.field1084.length - 2); var101 += 2) {
                    var99.field1084[var101] = var2.method1363((byte) 119);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1363((byte) 1);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1363((byte) -126);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class94 var96 = var18[var54];
            if (var96.field1084 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1084.length; var98 += 2) {
                    var97 += var2.method1350(31351) + 1;
                    var96.field1084[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class94 var93 = var18[var55];
            if (var93.field1088 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1088.length; var95 += 2) {
                    var94 += var2.method1350(31351) + 1;
                    var93.field1088[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1350(31351);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method1350(31351) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field1827[var60] = (byte) (this.field1827[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class264.method1480((byte) -95, var66, var64 - var58);
                    var66 += var65 - var59;
                    this.field1827[var67] = (byte) (this.field1827[var67] * var68 + 32 >> 6);
                }
                var58 = var64;
                var61 += 2;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field1827[var62] = (byte) (this.field1827[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method1350(31351);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method1350(31351) + (var69 + 1);
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1819[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1819[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class264.method1480((byte) -126, var80, var78 - var71);
                    int var83 = (this.field1819[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1819[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var74 += 2;
                var71 = var78;
                var72 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field1819[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1819[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1096 = var2.method1350(31351);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class94 var92 = var18[var86];
            if (var92.field1088 != null) {
                var92.field1089 = var2.method1350(31351);
            }
            if (var92.field1084 != null) {
                var92.field1087 = var2.method1350(31351);
            }
            if (var92.field1096 > 0) {
                var92.field1092 = var2.method1350(31351);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1091 = var2.method1350(31351);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class94 var91 = var18[var88];
            if (var91.field1091 > 0) {
                var91.field1090 = var2.method1350(31351);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class94 var90 = var18[var89];
            if (var90.field1090 > 0) {
                var90.field1086 = var2.method1350(31351);
            }
        }
    }
}
