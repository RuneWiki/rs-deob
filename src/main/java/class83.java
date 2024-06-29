import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class83 {

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "[I")
    private int[] field1167;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
    private int[] field1154;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "Lkj;")
    private class177 field1164;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Lkj;")
    private class177 field1157;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "[Lkj;")
    private class177[] field1162;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1160 = " is already on your friend list.";

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "Lhj;")
    public static class29 field1161 = new class29(16);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "Llb;")
    public static class211 field1165;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I", line = 4)
    public static final int method679(byte arg0) {
        field1153++;
        if (class213.field3390 == null) {
            return -1;
        } else if (arg0 == 83) {
            while (class3.field10 < class213.field3390.field112) {
                if (class213.field3390.method83(class3.field10, -71)) {
                    return class3.field10++;
                }
                class3.field10++;
            }
            return -1;
        } else {
            return 52;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ltk;ZLlb;)Z", line = 29)
    public final boolean method680(class251 arg0, boolean arg1, class211 arg2) {
        field1166++;
        if (!arg1) {
            this.method687(43, (class251) null, (byte) 69, false, -28, 0.819811385130382D, (class211) null);
        }
        if (class211.field3342 <= 0) {
            for (int var4 = 0; var4 < this.field1154.length; var4++) {
                if (!arg2.method1531(116, this.field1154[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1154.length; var5++) {
                if (!arg2.method1506(-121, class211.field3342, this.field1154[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1167.length; var6++) {
            if (!arg0.method1747((byte) 77, this.field1167[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Lbb;", line = 83)
    public static final class91 method681(int arg0, int arg1, int arg2) {
        class99 var3 = class250.field3746[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1488; var4++) {
            class91 var5 = var3.field1471[var4];
            if ((var5.field1327 >> 29 & 0x3L) == 2L && var5.field1329 == arg1 && var5.field1323 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)Z", line = 110)
    public static final boolean method682(int arg0, int arg1) {
        byte var2 = 0;
        field1155++;
        byte var3 = 0;
        if (class7.field66 == null) {
            if (class36.field534 || class188.field3000 == null) {
                class7.field66 = new class134(512, 512);
            } else {
                class7.field66 = (class134) class188.field3000;
            }
            int[] var4 = class7.field66.field2101;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < (103 - var3); var7++) {
                int var8 = (var3 + 103 - var7) * 512 * 4 + 24628;
                for (int var9 = var2 + 1; var9 < (104 - (var2 + 1)); var9++) {
                    if ((class208.field3272[arg0][var9][var7] & 0x18) == 0) {
                        class170.method1249(var4, var8, 512, arg0, var9, var7);
                    }
                    if (arg0 < 3 && (class208.field3272[arg0 + 1][var9][var7] & 0x8) != 0) {
                        class170.method1249(var4, var8, 512, arg0 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class156.field2340 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class136.method1039(class50.field775, var10 + var2, var11 - -var3);
                    if (var12 != 0L) {
                        class101 var14 = class281.method1984(Integer.MAX_VALUE & (int) (var12 >>> 32), false);
                        int var15 = var14.field1566;
                        if (var14.field1542 != null) {
                            for (int var16 = 0; var16 < var14.field1542.length; var16++) {
                                if (var14.field1542[var16] != -1) {
                                    class101 var17 = class281.method1984(var14.field1542[var16], false);
                                    if (var17.field1566 >= 0) {
                                        var15 = var17.field1566;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var2 + var10;
                            int var19 = var3 + var11;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class90.field1309[class50.field775].field5037;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var18 > 0 && var10 - 3 < var18 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 1 && var18 < 103 && var18 < (var10 + 3) && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                        var18++;
                                    }
                                    if (var22 == 2 && var19 > 0 && var11 - 3 < var19 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 3 && var19 < 103 && var19 < (var11 + 3) && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                        var19++;
                                    }
                                }
                            }
                            class160.field2381[class156.field2340] = var14.field1570;
                            class147.field2246[class156.field2340] = var18 - var2;
                            class212.field3373[class156.field2340] = var19 - var3;
                            class156.field2340++;
                        }
                    }
                }
            }
        }
        class7.field66.method1026();
        int var23 = -(-((int) (Math.random() * 20.0D)) + (-((int) (Math.random() * 20.0D) + 228 << 8) - 238)) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) - 10;
        int var24 = 238 - (10 - ((int) (Math.random() * 20.0D))) << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class208.field3272[arg0][var2 + var26][var3 + var25] & 0x18) == 0 && !class244.method1695(var25, var3, var24, var2, var26, var23, arg1 - 14080, arg0)) {
                    if (class36.field534) {
                        class168.field2525 = null;
                    } else {
                        class128.field2023.method1474((byte) -105);
                    }
                    return false;
                }
                if (arg0 < 3 && (class208.field3272[arg0 + 1][var26 + var2][var3 + var25] & 0x8) != 0 && !class244.method1695(var25, var3, var24, var2, var26, var23, 2, arg0 + 1)) {
                    if (class36.field534) {
                        class168.field2525 = null;
                    } else {
                        class128.field2023.method1474((byte) -105);
                    }
                    return false;
                }
            }
        }
        if (class36.field534) {
            int[] var27 = class7.field66.field2101;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                if (var27[var29] == 0) {
                    var27[var29] = 1;
                }
            }
            class188.field3000 = new class221(class7.field66);
        } else {
            class188.field3000 = class7.field66;
        }
        if (class36.field534) {
            class168.field2525 = null;
        } else {
            class128.field2023.method1474((byte) -105);
        }
        class7.field66 = null;
        if (arg1 != 14082) {
            field1165 = (class211) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 343)
    public static void method683(int arg0) {
        field1160 = null;
        field1161 = null;
        field1165 = null;
        if (arg0 != 0) {
            field1160 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIILgd;JLgd;Lgd;)V", line = 359)
    public static final void method684(int arg0, int arg1, int arg2, int arg3, class310 arg4, long arg5, class310 arg6, class310 arg7) {
        class189 var9 = new class189();
        var9.field3005 = arg4;
        var9.field3013 = arg1 * 128 + 64;
        var9.field3008 = arg2 * 128 + 64;
        var9.field3009 = arg3;
        var9.field3012 = arg5;
        var9.field3007 = arg6;
        var9.field3004 = arg7;
        int var10 = 0;
        class99 var11 = class250.field3746[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1488; var12++) {
                class91 var13 = var11.field1471[var12];
                if ((var13.field1327 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1326.method19();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3006 = -var10;
        if (class250.field3746[arg0][arg1][arg2] == null) {
            class250.field3746[arg0][arg1][arg2] = new class99(arg0, arg1, arg2);
        }
        class250.field3746[arg0][arg1][arg2].field1478 = var9;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZIDLlb;IZLtk;)[I", line = 404)
    public final int[] method685(int arg0, boolean arg1, int arg2, double arg3, class211 arg4, int arg5, boolean arg6, class251 arg7) {
        field1159++;
        class225.method1605(arg3, (byte) -88);
        class244.field3677 = arg7;
        class146.field2236 = arg4;
        class153.method1126(arg0, arg5, 97);
        for (int var10 = 0; var10 < this.field1162.length; var10++) {
            this.field1162[var10].method1287(arg5, arg0, true);
        }
        int[] var11 = new int[arg0 * arg5];
        int var12 = 0;
        byte var13;
        int var14;
        int var15;
        if (arg1) {
            var13 = -1;
            var14 = arg5 - 1;
            var15 = -1;
        } else {
            var15 = arg5;
            var14 = 0;
            var13 = 1;
        }
        int var16 = 0;
        if (arg2 >= -4) {
            field1161 = (class29) null;
        }
        while (var16 < arg0) {
            if (arg6) {
                var12 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field1164.field2649) {
                int[] var17 = this.field1164.method95(-109, var16);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field1164.method99(var16, -23387);
                var18 = var21[1];
                var20 = var21[0];
                var19 = var21[2];
            }
            for (int var22 = var14; var22 != var15; var22 += var13) {
                int var23 = var20[var22] >> 4;
                int var24 = var18[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = class98.field1454[var23];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class98.field1454[var24];
                int var27 = var19[var22] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class98.field1454[var27];
                var11[var12++] = (var25 << 16) + (var26 << 8) + var28;
                if (arg6) {
                    var12 += arg5 - 1;
                }
            }
            var16++;
        }
        for (int var29 = 0; var29 < this.field1162.length; var29++) {
            this.field1162[var29].method115(false);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)I", line = 534)
    public static final int method686(byte arg0) {
        if (arg0 != -105) {
            method682(20, -83);
        }
        field1158++;
        return 2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILtk;BZIDLlb;)[B", line = 554)
    public final byte[] method687(int arg0, class251 arg1, byte arg2, boolean arg3, int arg4, double arg5, class211 arg6) {
        field1163++;
        byte[] var9 = new byte[arg0 * arg4 * 4];
        class225.method1605(arg5, (byte) -88);
        class146.field2236 = arg6;
        class244.field3677 = arg1;
        class153.method1126(arg4, arg0, -116);
        for (int var10 = 0; var10 < this.field1162.length; var10++) {
            this.field1162[var10].method1287(arg0, arg4, true);
        }
        if (arg2 < 109) {
            method681(-28, -80, 43);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1164.field2649) {
                int[] var13 = this.field1164.method95(-126, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field1164.method99(var12, -23387);
                var15 = var17[1];
                var14 = var17[2];
                var16 = var17[0];
            }
            if (arg3) {
                var11 = var12 << 2;
            }
            int[] var18;
            if (this.field1157.field2649) {
                var18 = this.field1157.method95(-103, var12);
            } else {
                var18 = this.field1157.method99(var12, -23387)[0];
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = class98.field1454[var20];
                int var22 = var16[var19] >> 4;
                int var23 = var15[var19] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class98.field1454[var23];
                int var25 = class98.field1454[var22];
                int var26;
                if (var25 == 0 && var24 == 0 && var21 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var21;
                var9[var11++] = (byte) var26;
                if (arg3) {
                    var11 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field1162.length; var27++) {
            this.field1162[var27].method115(false);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 706)
    public class83() {
        this.field1167 = new int[0];
        this.field1154 = new int[0];
        this.field1164 = new class38();
        this.field1164.field2648 = 1;
        this.field1157 = new class38();
        this.field1157.field2648 = 1;
        this.field1162 = new class177[] { this.field1164, this.field1157 };
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lhb;)V", line = 719)
    public class83(class35 arg0) {
        int var2 = arg0.method273(65280);
        this.field1162 = new class177[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class177 var7 = class190.method1373((byte) 114, arg0);
            if (var7.method1281((byte) 96) >= 0) {
                var3++;
            }
            if (var7.method111(119) >= 0) {
                var5++;
            }
            int var8 = var7.field2646.length;
            var4[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var4[var6][var9] = arg0.method273(65280);
            }
            this.field1162[var6] = var7;
        }
        this.field1154 = new int[var3];
        int var10 = 0;
        this.field1167 = new int[var5];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class177 var13 = this.field1162[var12];
            int var14 = var13.field2646.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field2646[var15] = this.field1162[var4[var12][var15]];
            }
            int var16 = var13.method1281((byte) 64);
            int var17 = var13.method111(-116);
            if (var16 > 0) {
                this.field1154[var10++] = var16;
            }
            if (var17 > 0) {
                this.field1167[var11++] = var17;
            }
            var4[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field1164 = this.field1162[arg0.method273(65280)];
        this.field1157 = this.field1162[arg0.method273(65280)];
    }
}
