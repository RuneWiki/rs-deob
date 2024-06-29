import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class405 {

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public int field6147 = -1;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "Lnj;")
    public static class164 field6145 = new class164(new byte[5000]);

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field6149 = 0;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "Lla;")
    public static class319 field6151 = new class319(106, 2);

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "Lof;")
    public static class446 field6153 = new class446("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    private int field6150;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "J")
    private long field6139;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "J")
    private long field6142;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Z")
    public boolean field6144;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "[I")
    public int[] field6141;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "[I")
    private int[] field6152;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "[[I")
    private int[][] field6146;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V")
    public final void method2492(int arg0, boolean arg1) {
        this.field6144 = arg1;
        if (arg0 != 2) {
            method2501(false);
        }
        field6134++;
        this.method2498(true);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLaj;II)V")
    public final void method2493(boolean arg0, class208 arg1, int arg2, int arg3) {
        field6135++;
        int var5 = class236.field3340[arg2];
        if (this.field6152[var5] != 0 && arg1.method1428(31348, arg3) != null) {
            this.field6152[var5] = class311.method1956(arg3, Integer.MIN_VALUE);
            this.method2498(arg0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class370 var7 = new class370();
        var7.field5655 = arg1 >> class10.field179;
        var7.field5644 = arg2 >> class10.field179;
        var7.field5642 = arg3 >> class10.field179;
        var7.field5641 = arg4 >> class10.field179;
        var7.field5638 = arg0;
        var7.field5652 = arg1;
        var7.field5654 = arg2;
        var7.field5651 = arg3;
        var7.field5649 = arg4;
        var7.field5643 = arg5;
        var7.field5658 = arg6;
        class306.field4446[class526.field7715++] = var7;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static final void method2495(int arg0) {
        class112.method699((byte) 72, (long) class393.field6017, class400.field6090);
        field6137++;
        if (class337.field5232 != -1) {
            class536.method3167(false, class337.field5232);
        }
        for (int var1 = 0; var1 < class428.field6506; var1++) {
            if (class430.field6553[var1]) {
                class106.field1497[var1] = true;
            }
            class447.field6721[var1] = class430.field6553[var1];
            class430.field6553[var1] = false;
        }
        class347.field5348 = class393.field6017;
        if (class400.field6090.method755()) {
            class347.field5367 = true;
        }
        if (class337.field5232 != -1) {
            class428.field6506 = 0;
            class230.method1549(false);
        }
        class400.field6090.method753();
        class142.method954(class400.field6090, 24307);
        int var2 = class78.method539(-27627);
        int var3 = -16 / ((-arg0 - 2) / 50);
        if (var2 == -1) {
            var2 = class449.field6752;
        }
        if (var2 == -1) {
            var2 = class271.field3768;
        }
        class278.method1789(-106, var2);
        class205.field2728 = 0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ[I[III)V")
    public final void method2496(int arg0, boolean arg1, int[] arg2, int[] arg3, int arg4, int arg5) {
        if (arg4 != 12) {
            method2499();
        }
        this.field6141 = arg3;
        this.field6144 = arg1;
        this.field6152 = arg2;
        if (this.field6150 != arg5) {
            this.field6150 = arg5;
            this.field6146 = null;
        }
        field6133++;
        this.field6147 = arg0;
        this.method2498(true);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILvr;Lws;ILaj;Leg;Lkd;ILbc;ILqa;I)Lka;")
    public final class334 method2497(int arg0, class91 arg1, class244 arg2, int arg3, class208 arg4, class70 arg5, class188 arg6, int arg7, class251 arg8, int arg9, class165 arg10, int arg11) {
        field6136++;
        if (this.field6147 != -1) {
            return arg8.method1626((byte) -15, this.field6147).method1663(arg6, (byte) 58, arg3, arg11, arg9, arg0, arg5, arg10, arg1);
        }
        int var13 = arg0;
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg1.field1315[arg11];
            Object var22 = null;
            var13 = arg0 | 0x20;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class425 var25 = arg5.method485(var23, 5);
            if (var25 != null) {
                var15 |= var25.method2591(-1123836575, var24);
                var14 |= var25.method2597(arg7 - 2147471638, var24);
                var17 |= var25.method2594(17729, var24);
                var16 |= arg1.field1336;
            }
            if ((arg1.field1339 || class275.field3867) && arg9 != -1 && arg9 < arg1.field1315.length) {
                int var26 = arg1.field1315[arg9];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class425 var29 = var23 == var27 ? var25 : arg5.method485(var27, 5);
                if (var29 != null) {
                    var15 |= var29.method2591(-1123836575, var28);
                    var14 |= var29.method2597(12010, var28);
                    var17 |= var29.method2594(17729, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        if (arg7 != Integer.MIN_VALUE) {
            field6153 = null;
        }
        class330 var30 = class491.field7249;
        class334 var31;
        synchronized (class491.field7249) {
            var31 = (class334) class491.field7249.method2133(this.field6139, (byte) 73);
        }
        if (var31 == null || arg10.method775(var31.method46(), var13) != 0) {
            if (var31 != null) {
                var13 = arg10.method781(var13, var31.method46());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field6152[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg4.method1428(31348, var35 & 0x3FFFFFFF).method364(false)) {
                        var33 = true;
                    }
                } else if (!arg2.method1603((byte) -99, var35 & 0x3FFFFFFF).method514(false, this.field6144)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class387[] var36 = new class387[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field6152[var38];
                if ((var39 & 0x40000000) != 0) {
                    class387 var41 = arg2.method1603((byte) -99, var39 & 0x3FFFFFFF).method507(-14090, this.field6144);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class387 var40 = arg4.method1428(arg7 - 2147452300, var39 & 0x3FFFFFFF).method363((byte) -128);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            class387 var42 = new class387(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg10.method833(var42, var43, class468.field7005, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (class410.field6229[var44].length > this.field6141[var44]) {
                    var31.method29(class538.field7885[var44], class410.field6229[var44][this.field6141[var44]]);
                }
                if (class509.field7487[var44].length > this.field6141[var44]) {
                    var31.method29(class1.field9[var44], class509.field7487[var44][this.field6141[var44]]);
                }
            }
            var31.method62(var13);
            class330 var45 = class491.field7249;
            synchronized (class491.field7249) {
                class491.field7249.method2131(var31, this.field6139, false);
            }
        }
        if (arg1 == null) {
            return var31;
        } else {
            var31.method47((byte) 4, var13, true);
            return arg1.method619(var31, -24429, arg9, arg3, arg11, arg0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    private final void method2498(boolean arg0) {
        field6140++;
        long[] var2 = class291.field4254;
        this.field6139 = -1L;
        this.field6139 = var2[(int) (((long) (this.field6150 >> 8) ^ this.field6139) & 0xFFL)] ^ this.field6139 >>> 8;
        this.field6139 = var2[(int) (((long) this.field6150 ^ this.field6139) & 0xFFL)] ^ this.field6139 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field6139 = this.field6139 >>> 8 ^ var2[(int) (((long) (this.field6152[var3] >> 24) ^ this.field6139) & 0xFFL)];
            this.field6139 = this.field6139 >>> 8 ^ var2[(int) (((long) (this.field6152[var3] >> 16) ^ this.field6139) & 0xFFL)];
            this.field6139 = var2[(int) (((long) (this.field6152[var3] >> 8) ^ this.field6139) & 0xFFL)] ^ this.field6139 >>> 8;
            this.field6139 = this.field6139 >>> 8 ^ var2[(int) (((long) this.field6152[var3] ^ this.field6139) & 0xFFL)];
        }
        int var4 = 0;
        if (!arg0) {
            this.method2498(true);
        }
        while (var4 < 5) {
            this.field6139 = this.field6139 >>> 8 ^ var2[(int) (((long) this.field6141[var4] ^ this.field6139) & 0xFFL)];
            var4++;
        }
        this.field6139 = var2[(int) (((long) (this.field6144 ? 1 : 0) ^ this.field6139) & 0xFFL)] ^ this.field6139 >>> 8;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()V")
    public static final void method2499() {
        class300.field4404 = 0;
        label212: for (int var0 = 0; var0 < class526.field7715; var0++) {
            class370 var1 = class306.field4446[var0];
            if (class372.field5666 != null) {
                for (int var2 = 0; var2 < class372.field5666.length; var2++) {
                    if (class372.field5666[var2] != -1000000 && (var1.field5643 <= class372.field5666[var2] || var1.field5658 <= class372.field5666[var2]) && (var1.field5652 <= class175.field2343[var2] || var1.field5654 <= class175.field2343[var2]) && (var1.field5652 >= class484.field7135[var2] || var1.field5654 >= class484.field7135[var2]) && (var1.field5651 <= class249.field3473[var2] || var1.field5649 <= class249.field3473[var2]) && (var1.field5651 >= class79.field1129[var2] || var1.field5649 >= class79.field1129[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field5638 == 1) {
                int var3 = var1.field5655 + class28.field408 - class187.field2514;
                if (var3 >= 0 && var3 <= class28.field408 + class28.field408) {
                    int var4 = var1.field5642 + class28.field408 - class25.field358;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class28.field408 + class28.field408) {
                        continue;
                    }
                    int var5 = var1.field5641 + class28.field408 - class25.field358;
                    if (var5 > class28.field408 + class28.field408) {
                        var5 = class28.field408 + class28.field408;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class203.field2720[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class453.field6827 - var1.field5652;
                        if (var7 > class430.field6554) {
                            var1.field5650 = 1;
                        } else {
                            if (var7 >= -class430.field6554) {
                                continue;
                            }
                            var1.field5650 = 2;
                            var7 = -var7;
                        }
                        var1.field5647 = (var1.field5651 - class46.field662 << 8) / var7;
                        var1.field5646 = (var1.field5649 - class46.field662 << 8) / var7;
                        var1.field5645 = (var1.field5643 - class88.field1264 << 8) / var7;
                        var1.field5660 = (var1.field5658 - class88.field1264 << 8) / var7;
                        class194.field2601[class300.field4404++] = var1;
                    }
                }
            } else if (var1.field5638 == 2) {
                int var8 = var1.field5642 + class28.field408 - class25.field358;
                if (var8 >= 0 && var8 <= class28.field408 + class28.field408) {
                    int var9 = var1.field5655 + class28.field408 - class187.field2514;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class28.field408 + class28.field408) {
                        continue;
                    }
                    int var10 = var1.field5644 + class28.field408 - class187.field2514;
                    if (var10 > class28.field408 + class28.field408) {
                        var10 = class28.field408 + class28.field408;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class203.field2720[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class46.field662 - var1.field5651;
                        if (var12 > class430.field6554) {
                            var1.field5650 = 3;
                        } else {
                            if (var12 >= -class430.field6554) {
                                continue;
                            }
                            var1.field5650 = 4;
                            var12 = -var12;
                        }
                        var1.field5656 = (var1.field5652 - class453.field6827 << 8) / var12;
                        var1.field5648 = (var1.field5654 - class453.field6827 << 8) / var12;
                        var1.field5645 = (var1.field5643 - class88.field1264 << 8) / var12;
                        var1.field5660 = (var1.field5658 - class88.field1264 << 8) / var12;
                        class194.field2601[class300.field4404++] = var1;
                    }
                }
            } else if (var1.field5638 == 4) {
                int var13 = var1.field5643 - class88.field1264;
                if (var13 > class32.field468) {
                    int var14 = var1.field5642 + class28.field408 - class25.field358;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class28.field408 + class28.field408) {
                        continue;
                    }
                    int var15 = var1.field5641 + class28.field408 - class25.field358;
                    if (var15 > class28.field408 + class28.field408) {
                        var15 = class28.field408 + class28.field408;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field5655 + class28.field408 - class187.field2514;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class28.field408 + class28.field408) {
                        continue;
                    }
                    int var17 = var1.field5644 + class28.field408 - class187.field2514;
                    if (var17 > class28.field408 + class28.field408) {
                        var17 = class28.field408 + class28.field408;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class203.field2720[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field5650 = 5;
                        var1.field5656 = (var1.field5652 - class453.field6827 << 8) / var13;
                        var1.field5648 = (var1.field5654 - class453.field6827 << 8) / var13;
                        var1.field5647 = (var1.field5651 - class46.field662 << 8) / var13;
                        var1.field5646 = (var1.field5649 - class46.field662 << 8) / var13;
                        class194.field2601[class300.field4404++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBLvr;Lqa;ILeg;Lws;ILtk;IZ[Lel;Lkd;IILaj;Lvr;ILbc;)Lka;")
    public final class334 method2500(int arg0, byte arg1, class91 arg2, class165 arg3, int arg4, class70 arg5, class244 arg6, int arg7, class233 arg8, int arg9, boolean arg10, class389[] arg11, class188 arg12, int arg13, int arg14, class208 arg15, class91 arg16, int arg17, class251 arg18) {
        field6131++;
        if (this.field6147 != -1) {
            return arg18.method1626((byte) -15, this.field6147).method1659(arg4, arg14, arg5, arg13, arg16, arg3, arg17, arg7, arg0, arg2, arg11, arg12, arg9, 9, arg8);
        }
        int var20 = arg17;
        long var21 = this.field6139;
        int[] var23 = this.field6152;
        if (arg2 != null && (arg2.field1326 >= 0 || arg2.field1324 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field6152[var24];
            }
            if (arg2.field1326 >= 0) {
                if (arg2.field1326 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class311.method1956(1073741824, arg2.field1326);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg2.field1324 >= 0) {
                if (arg2.field1324 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class311.method1956(arg2.field1324, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg2 != null || arg16 != null;
        int var29 = arg11 == null ? 0 : arg11.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class84.field1237[var30] = null;
            if (arg11[var30] != null) {
                class91 var31 = arg5.method489(22, arg11[var30].field5937);
                if (var31.field1315 != null) {
                    class250.field3482[var30] = var31;
                    var28 = true;
                    int var32 = arg11[var30].field5940;
                    int var33 = arg11[var30].field5941;
                    int var34 = var31.field1315[var32];
                    class84.field1237[var30] = arg5.method485(var34 >>> 16, 5);
                    int var35 = var34 & 0xFFFF;
                    class2.field18[var30] = var35;
                    if (class84.field1237[var30] != null) {
                        var26 |= class84.field1237[var30].method2591(-1123836575, var35);
                        var25 |= class84.field1237[var30].method2597(12010, var35);
                        var27 |= class84.field1237[var30].method2594(17729, var35);
                    }
                    if ((var31.field1339 || class275.field3867) && var33 != -1 && var31.field1315.length > var33) {
                        class308.field4465[var30] = var31.field1313[var32];
                        class392.field5987[var30] = arg11[var30].field5946;
                        int var36 = var31.field1315[var33];
                        class536.field7871[var30] = arg5.method485(var36 >>> 16, 5);
                        int var37 = var36 & 0xFFFF;
                        class174.field2330[var30] = var37;
                        if (class536.field7871[var30] != null) {
                            var26 |= class536.field7871[var30].method2591(-1123836575, var37);
                            var25 |= class536.field7871[var30].method2597(12010, var37);
                            var27 |= class536.field7871[var30].method2594(17729, var37);
                        }
                    } else {
                        class308.field4465[var30] = 0;
                        class392.field5987[var30] = 0;
                        class536.field7871[var30] = null;
                        class174.field2330[var30] = -1;
                    }
                }
            }
        }
        int var38 = -21 / ((arg1 + 22) / 35);
        int var39 = -1;
        int var40 = -1;
        int var41 = 0;
        class425 var42 = null;
        class425 var43 = null;
        int var44 = -1;
        int var45 = -1;
        int var46 = 0;
        class425 var47 = null;
        class425 var48 = null;
        if (var28) {
            var20 = arg17 | 0x20;
            if (arg2 != null) {
                int var49 = arg2.field1315[arg0];
                int var50 = var49 >>> 16;
                var39 = var49 & 0xFFFF;
                var42 = arg5.method485(var50, 5);
                if (var42 != null) {
                    var26 |= var42.method2591(-1123836575, var39);
                    var25 |= var42.method2597(12010, var39);
                    var27 |= var42.method2594(17729, var39);
                }
                if ((arg2.field1339 || class275.field3867) && arg4 != -1 && arg4 < arg2.field1315.length) {
                    var41 = arg2.field1313[arg0];
                    int var51 = arg2.field1315[arg4];
                    int var52 = var51 >>> 16;
                    var40 = var51 & 0xFFFF;
                    var43 = var50 == var52 ? var42 : arg5.method485(var52, 5);
                    if (var43 != null) {
                        var26 |= var43.method2591(-1123836575, var40);
                        var25 |= var43.method2597(12010, var40);
                        var27 |= var43.method2594(17729, var40);
                    }
                }
            }
            if (arg16 != null) {
                int var53 = arg16.field1315[arg9];
                int var54 = var53 >>> 16;
                var44 = var53 & 0xFFFF;
                var47 = arg5.method485(var54, 5);
                if (var47 != null) {
                    var26 |= var47.method2591(-1123836575, var44);
                    var25 |= var47.method2597(12010, var44);
                    var27 |= var47.method2594(17729, var44);
                }
                if ((arg16.field1339 || class275.field3867) && arg14 != -1 && arg14 < arg16.field1315.length) {
                    var46 = arg16.field1313[arg9];
                    int var55 = arg16.field1315[arg14];
                    int var56 = var55 >>> 16;
                    var45 = var55 & 0xFFFF;
                    var48 = var54 == var56 ? var47 : arg5.method485(var56, 5);
                    if (var48 != null) {
                        var26 |= var48.method2591(-1123836575, var45);
                        var25 |= var48.method2597(12010, var45);
                        var27 |= var48.method2594(17729, var45);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class330 var57 = class112.field1560;
        class334 var58;
        synchronized (class112.field1560) {
            var58 = (class334) class112.field1560.method2133(var21, (byte) 34);
        }
        class485 var59 = null;
        if (this.field6150 != -1) {
            var59 = arg8.method1556(this.field6150, false);
        }
        if (var58 == null || arg3.method775(var58.method46(), var20) != 0 || var59 != null && var59.field7154 != null && this.field6146 == null) {
            if (var58 != null) {
                var20 = arg3.method781(var20, var58.method46());
            }
            boolean var61 = false;
            int var62 = 0;
            while (true) {
                if (var62 >= 12) {
                    if (var61) {
                        if (this.field6142 != -1L) {
                            class330 var64 = class112.field1560;
                            synchronized (class112.field1560) {
                                var58 = (class334) class112.field1560.method2133(this.field6142, (byte) 34);
                            }
                        }
                        if (var58 == null || arg3.method775(var58.method46(), var20) != 0 || var59 != null && var59.field7154 != null && this.field6146 == null) {
                            return null;
                        }
                    } else {
                        class387[] var65 = new class387[12];
                        for (int var66 = 0; var66 < 12; var66++) {
                            int var67 = var23[var66];
                            if ((var67 & 0x40000000) != 0) {
                                class387 var68 = arg6.method1603((byte) -99, var67 & 0x3FFFFFFF).method524(this.field6144, (byte) -90);
                                if (var68 != null) {
                                    var65[var66] = var68;
                                }
                            } else if ((Integer.MIN_VALUE & var67) != 0) {
                                class387 var69 = arg15.method1428(31348, var67 & 0x3FFFFFFF).method362(-5861);
                                if (var69 != null) {
                                    var65[var66] = var69;
                                }
                            }
                        }
                        if (var59 != null && var59.field7154 != null) {
                            for (int var70 = 0; var70 < var59.field7154.length; var70++) {
                                if (var59.field7154[var70] != null && var65[var70] != null) {
                                    int var71 = var59.field7154[var70][0];
                                    int var72 = var59.field7154[var70][1];
                                    int var73 = var59.field7154[var70][2];
                                    int var74 = var59.field7154[var70][3] << 3;
                                    int var75 = var59.field7154[var70][4] << 3;
                                    int var76 = var59.field7154[var70][5] << 3;
                                    if (this.field6146 == null) {
                                        this.field6146 = new int[var59.field7154.length][];
                                    }
                                    if (this.field6146[var70] == null) {
                                        int[] var77 = this.field6146[var70] = new int[15];
                                        if (var74 == 0 && var75 == 0 && var76 == 0) {
                                            var77[12] = -var71;
                                            var77[0] = var77[4] = var77[8] = 32768;
                                            var77[14] = -var73;
                                            var77[13] = -var72;
                                        } else {
                                            int var78 = class428.field6501[var74];
                                            int var79 = class428.field6502[var74];
                                            int var80 = class428.field6501[var75];
                                            int var81 = class428.field6502[var75];
                                            int var82 = class428.field6501[var76];
                                            int var83 = class428.field6502[var76];
                                            int var84 = var79 * var82 + 16384 >> 15;
                                            int var85 = var79 * var83 + 16384 >> 15;
                                            var77[6] = -var81 * var82 + var80 * var85 + 16384 >> 15;
                                            var77[7] = var80 * var84 + (-var81 * -var83 + 16384) >> 15;
                                            var77[2] = var78 * var81 + 16384 >> 15;
                                            var77[0] = var80 * var82 + var81 * var85 + 16384 >> 15;
                                            var77[1] = -var83 * var80 + var81 * var84 + 16384 >> 15;
                                            var77[5] = -var79;
                                            var77[4] = var78 * var82 + 16384 >> 15;
                                            var77[3] = var78 * var83 + 16384 >> 15;
                                            var77[8] = var78 * var80 + 16384 >> 15;
                                            var77[13] = var77[1] * -var71 + var77[4] * -var72 + var77[7] * -var73 + 16384 >> 15;
                                            var77[12] = var77[6] * -var73 + var77[0] * -var71 + (var77[3] * -var72) + 16384 >> 15;
                                            var77[14] = var77[2] * -var71 + (var77[5] * -var72 + (var77[8] * -var73)) + 16384 >> 15;
                                        }
                                        var77[9] = var71;
                                        var77[10] = var72;
                                        var77[11] = var73;
                                    }
                                    if (var74 != 0 || var75 != 0 || var76 != 0) {
                                        var65[var70].method2430(var76, var74, var75, -1);
                                    }
                                    if (var71 != 0 || var72 != 0 || var73 != 0) {
                                        var65[var70].method2423((byte) 127, var72, var73, var71);
                                    }
                                }
                            }
                        }
                        int var86 = var20 | 0x4000;
                        class387 var87 = new class387(var65, var65.length);
                        var58 = arg3.method833(var87, var86, class468.field7005, 64, 850);
                        for (int var88 = 0; var88 < 5; var88++) {
                            if (this.field6141[var88] < class410.field6229[var88].length) {
                                var58.method29(class538.field7885[var88], class410.field6229[var88][this.field6141[var88]]);
                            }
                            if (class509.field7487[var88].length > this.field6141[var88]) {
                                var58.method29(class1.field9[var88], class509.field7487[var88][this.field6141[var88]]);
                            }
                        }
                        if (arg10) {
                            var58.method62(var20);
                            class330 var89 = class112.field1560;
                            synchronized (class112.field1560) {
                                class112.field1560.method2131(var58, var21, false);
                            }
                            this.field6142 = var21;
                        }
                    }
                    break;
                }
                int var63 = var23[var62];
                if ((var63 & 0x40000000) == 0) {
                    if ((var63 & Integer.MIN_VALUE) != 0 && !arg15.method1428(31348, var63 & 0x3FFFFFFF).method370(-95)) {
                        var61 = true;
                    }
                } else if (!arg6.method1603((byte) -99, var63 & 0x3FFFFFFF).method513(this.field6144, (byte) -61)) {
                    var61 = true;
                }
                var62++;
            }
        }
        class334 var90 = var58.method47((byte) 4, var20, true);
        if (!var28) {
            return var90;
        }
        int var91 = 0;
        int var92 = 1;
        while (var29 > var91) {
            if (class84.field1237[var91] != null) {
                var90.method2156(class174.field2330[var91], class392.field5987[var91] - 1, this.field6146 == null ? null : this.field6146[var91], class84.field1237[var91], class308.field4465[var91], class2.field18[var91], 0, class536.field7871[var91], var92, false, (byte) 115);
            }
            var91++;
            var92 <<= 0x1;
        }
        if (var42 != null && var47 != null) {
            var90.method2160(var43, var40, var39, var47, var46, (byte) 96, var44, arg2.field1343, var48, arg7 - 1, var42, arg13 - 1, var45, false, var41);
        } else if (var42 != null) {
            var90.method2161(false, var43, var40, var42, var41, var39, arg13 - 1, 0, (byte) -79);
        } else if (var47 != null) {
            var90.method2161(false, var48, var45, var47, var46, var44, arg7 - 1, 0, (byte) -79);
        }
        for (int var93 = 0; var93 < var29; var93++) {
            class84.field1237[var93] = null;
            class536.field7871[var93] = null;
            class250.field3482[var93] = null;
        }
        return var90;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)Lcl;")
    public static final class177 method2501(boolean arg0) {
        field6148++;
        if (arg0) {
            field6153 = null;
        }
        class177 var1 = (class177) class411.field6247.method2611((byte) 120);
        if (var1 != null) {
            var1.method25(-13489);
            var1.method705(6511);
            return var1;
        }
        class177 var2;
        do {
            var2 = (class177) class18.field298.method2611((byte) 86);
            if (var2 == null) {
                return null;
            }
            if (var2.method1189((byte) 97) > class58.method427((byte) -19)) {
                return null;
            }
            var2.method25(-13489);
            var2.method705(6511);
        } while ((Long.MIN_VALUE & var2.field1579) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILaj;IIIILqa;IILeg;ILvr;)Lka;")
    public final class334 method2502(int arg0, class208 arg1, int arg2, int arg3, int arg4, int arg5, class165 arg6, int arg7, int arg8, class70 arg9, int arg10, class91 arg11) {
        field6143++;
        if (arg8 <= 79) {
            return null;
        }
        int var13 = arg10;
        if (arg11 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg11.field1315[arg4];
            Object var22 = null;
            var13 = arg10 | 0x20;
            int var23 = var21 >>> 16;
            class425 var24 = arg9.method485(var23, 5);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2591(-1123836575, var25);
                var14 |= var24.method2597(12010, var25);
                var17 |= var24.method2594(17729, var25);
                var16 |= arg11.field1336;
            }
            if ((arg11.field1339 || class275.field3867) && arg0 != -1 && arg11.field1315.length > arg0) {
                int var26 = arg11.field1315[arg0];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class425 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg9.method485(var28 >>> 16, 5);
                }
                if (var29 != null) {
                    var15 |= var29.method2591(-1123836575, var28);
                    var14 |= var29.method2597(12010, var28);
                    var17 |= var29.method2594(17729, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg3 | (long) (arg7 << 16) | (long) arg2 << 32;
        class330 var32 = class491.field7249;
        class334 var33;
        synchronized (class491.field7249) {
            var33 = (class334) class491.field7249.method2133(var30, (byte) 57);
        }
        if (var33 == null || arg6.method775(var33.method46(), var13) != 0) {
            if (var33 != null) {
                var13 = arg6.method781(var13, var33.method46());
            }
            class387[] var35 = new class387[3];
            int var36 = 0;
            if (!arg1.method1428(31348, arg3).method364(false) || !arg1.method1428(31348, arg7).method364(false) || !arg1.method1428(31348, arg2).method364(false)) {
                return null;
            }
            class387 var37 = arg1.method1428(31348, arg3).method363((byte) -128);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class387 var38 = arg1.method1428(31348, arg7).method363((byte) -128);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class387 var39 = arg1.method1428(31348, arg2).method363((byte) -128);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class387 var40 = new class387(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg6.method833(var40, var41, class468.field7005, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field6141[var42] < class410.field6229[var42].length) {
                    var33.method29(class538.field7885[var42], class410.field6229[var42][this.field6141[var42]]);
                }
                if (class509.field7487[var42].length > this.field6141[var42]) {
                    var33.method29(class1.field9[var42], class509.field7487[var42][this.field6141[var42]]);
                }
            }
            var33.method62(var13);
            class330 var43 = class491.field7249;
            synchronized (class491.field7249) {
                class491.field7249.method2131(var33, var30, false);
            }
        }
        if (arg11 == null) {
            return var33;
        } else {
            class334 var44 = var33.method47((byte) 4, var13, true);
            return arg11.method619(var44, -24429, arg0, arg5, arg4, arg10);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static final void method2503(byte arg0) {
        field6138++;
        class35.field515.method1971(123);
        if (arg0 >= -115) {
            method2495(-106);
        }
        class502.field7404.method2318(101);
        class168.field2261.method3130(false);
        class85.field1245.setBackground(Color.black);
        class491.field7253 = -1;
        class35.field515 = class348.method2250((byte) -125, class85.field1245);
        class502.field7404 = class436.method2648(true, class85.field1245, true);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
    public final void method2504(int arg0, int arg1, int arg2) {
        field6132++;
        if (arg2 > -49) {
            this.method2504(-29, -2, 48);
        }
        this.field6141[arg1] = arg0;
        this.method2498(true);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static void method2505(int arg0) {
        if (arg0 > 123) {
            field6153 = null;
            field6151 = null;
            field6145 = null;
        }
    }
}
