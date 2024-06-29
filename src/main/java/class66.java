import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class66 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1267 = 0;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field1274 = 0;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Loh;")
    public static class156 field1268 = new class156(50);

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Loc;")
    public static class151 field1275 = class137.method873(2, "Benutzername: ");

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Loc;")
    public static class151 field1277 = class137.method873(2, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Loc;")
    public static class151 field1278 = class137.method873(2, "l");

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Luf;")
    public static class214 field1276;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1270++;
        int var8 = class116.method704(class154.field2793, arg0, 27104, class233.field4281);
        int var9 = class116.method704(class154.field2793, arg7, 27104, class233.field4281);
        int var10 = class116.method704(class25.field524, arg1, 27104, class79.field1526);
        int var11 = class116.method704(class25.field524, arg4, 27104, class79.field1526);
        int var12 = class116.method704(class154.field2793, arg0 + arg6, 27104, class233.field4281);
        int var13 = class116.method704(class154.field2793, arg7 - arg6, 27104, class233.field4281);
        if (arg2 != 19060) {
            field1271 = -58;
        }
        for (int var14 = var8; var14 < var12; var14++) {
            class55.method380(arg5, 105, class43.field887[var14], var11, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class55.method380(arg5, 122, class43.field887[var15], var11, var10);
        }
        int var16 = class116.method704(class25.field524, arg1 + arg6, arg2 + 8044, class79.field1526);
        int var17 = class116.method704(class25.field524, arg4 - arg6, arg2 + 8044, class79.field1526);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class43.field887[var18];
            class55.method380(arg5, 110, var19, var16, var10);
            class55.method380(arg3, arg2 - 18952, var19, var17, var16);
            class55.method380(arg5, 117, var19, var11, var17);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B[B)V")
    public static final void method436(byte arg0, byte[] arg1) {
        field1269++;
        int var2 = class177.field3195 >> 1;
        int var3 = class223.field3881 >> 2 << 10;
        byte[][] var4 = new byte[class217.field3788][class27.field581];
        int var5 = 0;
        while (true) {
            while (arg1.length > var5) {
                int var34 = (arg1[var5++] & 0xFF) * 64 - class63.field1228;
                int var35 = (arg1[var5++] & 0xFF) * 64 - class36.field759;
                if (var34 > 0 && var35 > 0 && class217.field3788 > var34 + 64 && var35 + 64 < class27.field581) {
                    for (int var36 = 0; var36 < 64; var36++) {
                        byte[] var37 = var4[var34 + var36];
                        int var38 = class27.field581 - var35 - 1;
                        for (int var39 = -64; var39 < 0; var39++) {
                            var37[var38--] = arg1[var5++];
                        }
                    }
                } else {
                    var5 += 4096;
                }
            }
            if (arg0 != -88) {
                method436((byte) 22, null);
            }
            int var6 = class27.field581;
            int[] var7 = new int[var6];
            int[] var8 = new int[var6];
            int var9 = class217.field3788;
            int[] var10 = new int[var6];
            int[] var11 = new int[var6];
            int[] var12 = new int[var6];
            for (int var13 = -5; var13 < var9; var13++) {
                for (int var14 = 0; var14 < var6; var14++) {
                    int var28 = var13 + 5;
                    int var10002;
                    if (var9 > var28) {
                        int var29 = var4[var28][var14] & 0xFF;
                        if (var29 > 0) {
                            class33 var30 = class57.method383(var29 - 1, 0);
                            var7[var14] += var30.field681;
                            var8[var14] += var30.field676;
                            var10[var14] += var30.field679;
                            var11[var14] += var30.field677;
                            var10002 = var12[var14]++;
                        }
                    }
                    int var31 = var13 - 5;
                    if (var31 >= 0) {
                        int var32 = var4[var31][var14] & 0xFF;
                        if (var32 > 0) {
                            class33 var33 = class57.method383(var32 - 1, arg0 + 88);
                            var7[var14] -= var33.field681;
                            var8[var14] -= var33.field676;
                            var10[var14] -= var33.field679;
                            var11[var14] -= var33.field677;
                            var10002 = var12[var14]--;
                        }
                    }
                }
                if (var13 >= 0) {
                    int[][] var15 = class43.field883[var13 >> 6];
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < var6; var21++) {
                        int var22 = var21 + 5;
                        int var23 = var21 - 5;
                        if (var22 < var6) {
                            var20 += var12[var22];
                            var16 += var7[var22];
                            var17 += var8[var22];
                            var18 += var10[var22];
                            var19 += var11[var22];
                        }
                        if (var23 >= 0) {
                            var16 -= var7[var23];
                            var17 -= var8[var23];
                            var19 -= var11[var23];
                            var18 -= var10[var23];
                            var20 -= var12[var23];
                        }
                        if (var21 >= 0 && var20 > 0) {
                            int var24 = var19 == 0 ? 0 : class113.method684(var17 / var20, var16 * 256 / var19, var18 / var20, -302);
                            int var25 = var21 >> 6;
                            if (var4[var13][var21] != 0) {
                                int var26 = (var24 & 0x7F) + var2;
                                if (var15[var25] == null) {
                                    var15[var25] = class43.field883[var13 >> 6][var25] = new int[4096];
                                }
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > 127) {
                                    var26 = 127;
                                }
                                int var27 = (var24 & 0x380) + (var3 + var24 & 0xFC00) + var26;
                                var15[var25][class26.method206(var13, 63) + (class26.method206(var21, 63) << 6)] = class61.field1207[class174.method1111(96, class112.method675(arg0, -11846), var27)];
                            } else if (var15[var25] != null) {
                                var15[var25][(class26.method206(var21, 63) << 6) + class26.method206(63, var13)] = 0;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Lue;")
    public static final class213 method437(int arg0, int arg1, int arg2) {
        class72 var3 = class95.field1776[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1419;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method438(int arg0) {
        field1275 = null;
        if (arg0 != 152227622) {
            method438(23);
        }
        field1277 = null;
        field1276 = null;
        field1268 = null;
        field1278 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIILwg;Lwg;IIJ)V")
    public static final void method439(int arg0, int arg1, int arg2, int arg3, class235 arg4, class235 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class23 var10 = new class23();
        var10.field503 = arg8;
        var10.field516 = arg1 * 128 + 64;
        var10.field508 = arg2 * 128 + 64;
        var10.field504 = arg3;
        var10.field518 = arg4;
        var10.field517 = arg5;
        var10.field510 = arg6;
        var10.field513 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class95.field1776[var11][arg1][arg2] == null) {
                class95.field1776[var11][arg1][arg2] = new class72(var11, arg1, arg2);
            }
        }
        class95.field1776[arg0][arg1][arg2].field1412 = var10;
    }
}
