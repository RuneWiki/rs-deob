import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class99 {

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "B")
    private byte field1507;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1503 = 0;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1505 = new CRC32();

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1515 = "white:";

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field1518 = 0;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "Lml;")
    public static class143 field1516;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BZ)V", line = 4)
    public static final void method697(byte arg0, boolean arg1) {
        field1510++;
        if (arg0 != 43) {
            method698((class39) null, -110);
        }
        if (class158.field2434 != arg1) {
            class158.field2434 = arg1;
            class131.method891(22);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lkb;I)V", line = 22)
    public static final void method698(class39 arg0, int arg1) {
        if (arg1 != 0) {
            field1515 = (String) null;
        }
        field1502++;
        class49.field684 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I", line = 35)
    public final int method699(int arg0) {
        if (arg0 == 7) {
            field1513++;
            return this.field1507 & 0x7;
        } else {
            return -100;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lim;I)V", line = 50)
    public static final void method700(class192 arg0, int arg1) {
        if (arg1 < 124) {
            method701(-117, -121, -28, -114, 118, -83, -21, -73);
        }
        field1504++;
        while (true) {
            while (arg0.field3128.length > arg0.field3129) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1399(-1172389784) == 1) {
                    var3 = arg0.method1399(-1172389784);
                    var4 = arg0.method1399(-1172389784);
                    var2 = true;
                }
                int var5 = arg0.method1399(-1172389784);
                int var6 = arg0.method1399(-1172389784);
                int var7 = var5 * 64 - class287.field4528;
                int var8 = class331.field5158 + class161.field2636 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && class240.field3815 > var7 + 63 && var8 < class331.field5158) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && var11 < var3 * 8 + 8 && var4 * 8 <= var12 && var4 * 8 + 8 > var12) {
                                int var13 = arg0.method1399(-1172389784);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method1399(-1172389784);
                                        if (class334.field5185[var9][var10] == null) {
                                            class334.field5185[var9][var10] = new byte[4096];
                                        }
                                        class334.field5185[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method1378(false);
                                        if (class254.field4030[var9][var10] == null) {
                                            class254.field4030[var9][var10] = new int[4096];
                                        }
                                        class254.field4030[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method1378(false);
                                        if (class34.field456[var9][var10] == null) {
                                            class34.field456[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class149 var17 = class291.method2043(var16, 23006);
                                        if (var17.field2223 != null) {
                                            var17 = var17.method1052(true);
                                            if (var17 == null || var17.field2227 == -1) {
                                                continue;
                                            }
                                        }
                                        class34.field456[var9][var10][(63 - var12 << 6) + var11] = var17.field2299 + 1;
                                        class115 var18 = new class115();
                                        var18.field1728 = var7;
                                        var18.field1735 = var17.field2227;
                                        var18.field1727 = var8;
                                        class17.field229.method1815((byte) -124, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method1399(-1172389784);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field3129++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field3129 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field3129 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIII)V", line = 198)
    public static final void method701(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1501++;
        int var8 = arg0;
        int var9 = arg4 - arg3;
        int var10 = 0;
        int var11 = arg0 - arg3;
        int var12 = 0;
        int var13 = arg4 * arg4;
        int var14 = arg0 * arg0;
        if (arg7 != -22030) {
            return;
        }
        int var15 = var9 * var9;
        int var16 = var11 * var11;
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = var11 << 1;
        int var21 = var15 << 1;
        int var22 = (1 - var20) * var15 + var19;
        int var23 = arg0 << 1;
        int var24 = (1 - var23) * var13 + var18;
        int var25 = var13 << 2;
        int var26 = var16 - (var20 - 1) * var21;
        int var27 = var14 - ((var23 - 1) * var17);
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var18 * 3;
        int var31 = var16 << 2;
        int var32 = (var23 - 3) * var17;
        int var33 = (var20 - 3) * var21;
        int var34 = var19 * 3;
        int var35 = var28;
        int var36 = (arg0 - 1) * var25;
        int var37 = var31;
        int var38 = (var11 - 1) * var29;
        if (arg6 >= class233.field3721 && class235.field3735 >= arg6) {
            int[] var39 = class310.field4841[arg6];
            int var40 = class235.method1685(arg1 - arg4, class231.field3697, class224.field3575, 122);
            int var41 = class235.method1685(arg1 + arg4, class231.field3697, class224.field3575, arg7 ^ 0xFFFFA981);
            int var42 = class235.method1685(arg1 - var9, class231.field3697, class224.field3575, 119);
            int var43 = class235.method1685(arg1 + var9, class231.field3697, class224.field3575, 113);
            class245.method1738(48, var39, var42, var40, arg5);
            class245.method1738(48, var39, var43, var42, arg2);
            class245.method1738(arg7 + 22078, var39, var41, var43, arg5);
        }
        while (var8 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var10++;
                    var24 += var30;
                    var30 += var28;
                    var27 += var35;
                    var35 += var28;
                }
            }
            boolean var44 = var8 <= var11;
            if (var27 < 0) {
                var24 += var30;
                var27 += var35;
                var35 += var28;
                var10++;
                var30 += var28;
            }
            var8--;
            if (var44) {
                if (var22 < 0) {
                    while (var22 < 0) {
                        var12++;
                        var26 += var37;
                        var37 += var31;
                        var22 += var34;
                        var34 += var31;
                    }
                }
                if (var26 < 0) {
                    var12++;
                    var22 += var34;
                    var26 += var37;
                    var34 += var31;
                    var37 += var31;
                }
                var26 += -var33;
                var33 -= var29;
                var22 += -var38;
                var38 -= var29;
            }
            var27 += -var32;
            var24 += -var36;
            var32 -= var25;
            int var45 = arg6 - var8;
            int var46 = arg6 + var8;
            var36 -= var25;
            if (var46 >= class233.field3721 && var45 <= class235.field3735) {
                int var47 = class235.method1685(arg1 + var10, class231.field3697, class224.field3575, arg7 ^ 0xFFFFA984);
                int var48 = class235.method1685(arg1 - var10, class231.field3697, class224.field3575, 115);
                if (var44) {
                    int var49 = class235.method1685(arg1 + var12, class231.field3697, class224.field3575, 113);
                    int var50 = class235.method1685(arg1 - var12, class231.field3697, class224.field3575, 102);
                    if (var45 >= class233.field3721) {
                        int[] var51 = class310.field4841[var45];
                        class245.method1738(arg7 ^ 0xFFFFA9C2, var51, var50, var48, arg5);
                        class245.method1738(arg7 + 22078, var51, var49, var50, arg2);
                        class245.method1738(48, var51, var47, var49, arg5);
                    }
                    if (class235.field3735 >= var46) {
                        int[] var52 = class310.field4841[var46];
                        class245.method1738(48, var52, var50, var48, arg5);
                        class245.method1738(48, var52, var49, var50, arg2);
                        class245.method1738(48, var52, var47, var49, arg5);
                    }
                } else {
                    if (var45 >= class233.field3721) {
                        class245.method1738(48, class310.field4841[var45], var47, var48, arg5);
                    }
                    if (class235.field3735 >= var46) {
                        class245.method1738(48, class310.field4841[var46], var47, var48, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)I", line = 403)
    public final int method702(byte arg0) {
        field1511++;
        if (arg0 == -124) {
            return (this.field1507 & 0x8) == 8 ? 1 : 0;
        } else {
            return -109;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 415)
    public static void method703(int arg0) {
        field1505 = null;
        field1516 = null;
        if (arg0 <= 92) {
            field1514 = -105;
        }
        field1515 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIJ)Z", line = 444)
    public static final boolean method704(int arg0, int arg1, int arg2, long arg3) {
        class230 var5 = class251.field3996[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3676 != null && var5.field3676.field263 == arg3) {
            return true;
        } else if (var5.field3678 != null && var5.field3678.field2175 == arg3) {
            return true;
        } else if (var5.field3675 != null && var5.field3675.field677 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3680; var6++) {
                if (var5.field3687[var6].field4294 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V", line = 475)
    public static final void method705(byte arg0) {
        if (class13.field159 != null && (class13.field159.field1980 - ((class13.field159.method910(-1) - 1) * 64) >> 7) == class174.field2784 && (class13.field159.field1944 + 64 - (class13.field159.method910(-1) * 64) >> 7) == class300.field4690) {
            class174.field2784 = 0;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class132.field2000[var1][var2] = 0;
            }
        }
        field1512++;
        int var3 = 0;
        int var4 = 17 / ((arg0 - 12) / 49);
        while (class24.field350 > var3) {
            class320 var5 = class100.field1523[class103.field1575[var3]];
            if (var5 != null) {
                var5.field2014 = false;
            }
            var3++;
        }
        for (int var6 = 0; var6 < class176.field2875; var6++) {
            class196 var7 = class297.field4657[class128.field1906[var6]];
            if (var7 != null) {
                var7.field2014 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 533)
    public class99() {
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lim;)V", line = 538)
    public class99(class192 arg0) {
        this.field1507 = arg0.method1377(true);
        this.field1509 = arg0.method1396(-63);
        this.field1517 = arg0.method1354((byte) -14);
        this.field1508 = arg0.method1354((byte) 110);
        this.field1506 = arg0.method1354((byte) -119);
        this.field1500 = arg0.method1354((byte) -13);
    }
}
