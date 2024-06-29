import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class161 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Z")
    public static boolean field2611 = false;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public int field2610;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Ljava/lang/String;")
    public String field2613;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Z")
    public static boolean field2609;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILtk;I)I", line = 4)
    public static final int method1186(int arg0, class266 arg1, int arg2) {
        field2612++;
        if (arg1.field3938 == null || arg2 >= arg1.field3938.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field3938[arg2];
            int var4 = 0;
            int var5 = arg0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var6;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 1) {
                    var8 = class213.field3331[var3[var4++]];
                }
                if (var7 == 2) {
                    var8 = class339.field5240[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class284.field4437[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class266 var12 = class171.method1276(var11, (byte) 19);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class188.method1361(true, var13).field2191 || class179.field2854)) {
                        for (int var14 = 0; var14 < var12.field3928.length; var14++) {
                            if ((var13 + 1) == var12.field3928[var14]) {
                                var8 += var12.field3976[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class123.field1998[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class190.field2979[class339.field5240[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class123.field1998[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class345.field5363.field1475;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class93.field1513[var15]) {
                            var8 += class339.field5240[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class266 var18 = class171.method1276(var17, (byte) 50);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class188.method1361(true, var19).field2191 || class179.field2854)) {
                        for (int var20 = 0; var20 < var18.field3928.length; var20++) {
                            if (var19 + 1 == var18.field3928[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class89.field1428;
                }
                if (var7 == 12) {
                    var8 = class155.field2532;
                }
                if (var7 == 13) {
                    int var21 = class123.field1998[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class228.method1663(var23, 1);
                }
                if (var7 == 18) {
                    var8 = (class345.field5363.field4671 >> 7) + class117.field1902;
                }
                if (var7 == 19) {
                    var8 = (class345.field5363.field4672 >> 7) + class133.field2118;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var6 += var8;
                    }
                    if (var5 == 1) {
                        var6 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var6 /= var8;
                    }
                    if (var5 == 3) {
                        var6 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIILeh;Leh;IIJ)V", line = 217)
    public static final void method1187(int arg0, int arg1, int arg2, int arg3, class179 arg4, class179 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class105 var10 = new class105();
        var10.field1721 = arg8;
        var10.field1727 = arg1 * 128 + 64;
        var10.field1725 = arg2 * 128 + 64;
        var10.field1726 = arg3;
        var10.field1723 = arg4;
        var10.field1724 = arg5;
        var10.field1722 = arg6;
        var10.field1730 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class34.field521[var11][arg1][arg2] == null) {
                class34.field521[var11][arg1][arg2] = new class42(var11, arg1, arg2);
            }
        }
        class34.field521[arg0][arg1][arg2].field665 = var10;
    }
}
