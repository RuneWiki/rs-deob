import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class98 {

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public int field1394 = -1;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public int field1397 = -1;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public int field1393 = 99;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public int field1407 = 5;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field1395 = -1;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public int field1392 = 2;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Z")
    public boolean field1406 = false;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Z")
    public boolean field1399 = false;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Z")
    public boolean field1400 = false;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public int field1412 = -1;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "Z")
    public boolean field1418 = false;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public int field1411 = -1;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lsv;")
    public static class570 field1391 = new class570(90, 8);

    @OriginalMember(owner = "client!je", name = "J", descriptor = "F")
    public static float field1423;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lbr;")
    public class564 field1404;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[I")
    public int[] field1388;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "[I")
    public int[] field1389;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "[I")
    public int[] field1402;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
    public int[] field1403;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "[I")
    private int[] field1417;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "[I")
    public int[] field1422;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "[Z")
    public boolean[] field1415;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "[[I")
    public int[][] field1424;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLea;Z)V")
    public static final void method802(byte arg0, class21 arg1, boolean arg2) {
        field1416++;
        if (class624.field8863 >= 400) {
            return;
        }
        if (class719.field10041 != arg1) {
            String var7;
            if (arg1.field251 == 0) {
                boolean var3 = true;
                if (class719.field10041.field226 != -1 && arg1.field226 != -1) {
                    int var4 = arg1.field226 <= class719.field10041.field226 ? arg1.field226 : class719.field10041.field226;
                    int var5 = class719.field10041.field249 - arg1.field249;
                    if (var5 < 0) {
                        var5 = -var5;
                    }
                    if (var5 > var4) {
                        var3 = false;
                    }
                }
                String var6 = class429.field5944 == class113.field1647 ? class563.field7828.method3281(class423.field5892, -1) : class563.field7826.method3281(class423.field5892, arg0 - 64);
                if (arg1.field227 > arg1.field249) {
                    var7 = arg1.method190(true, -116) + (var3 ? class735.method4064(123, arg1.field249, class719.field10041.field249) : "<col=ffffff>") + " (" + var6 + arg1.field249 + "+" + (arg1.field227 - arg1.field249) + ")";
                } else {
                    var7 = arg1.method190(true, -116) + (var3 ? class735.method4064(arg0 ^ 0x5B, arg1.field249, class719.field10041.field249) : "<col=ffffff>") + " (" + var6 + arg1.field249 + ")";
                }
            } else if (arg1.field251 == -1) {
                var7 = arg1.method190(true, -116);
            } else {
                var7 = arg1.method190(true, -116) + " (" + class563.field7827.method3281(class423.field5892, -1) + arg1.field251 + ")";
            }
            if (class295.field4298 && !arg2 && (class345.field4896 & 0x8) != 0) {
                class526.method3076(-1, false, (long) arg1.field4051, 500, class460.field6275 + " -> <col=ffffff>" + var7, 0, 0, false, true, class745.field10364, (long) arg1.field4051, 16, class470.field6405);
                class717.field10017++;
            }
            if (arg2) {
                class526.method3076(0, false, 0L, 500, "", 0, 0, true, false, -1, (long) arg1.field4051, -1, "<col=cccccc>" + var7);
            } else {
                for (int var8 = 7; var8 >= 0; var8--) {
                    if (class402.field5552[var8] != null) {
                        short var10 = 0;
                        if (class448.field6175 == class113.field1647 && class402.field5552[var8].equalsIgnoreCase(class563.field7821.method3281(class423.field5892, -1))) {
                            if (class421.field5859 && arg1.field249 > class719.field10041.field249) {
                                var10 = 2000;
                            }
                            if (class719.field10041.field204 == 0 || arg1.field204 == 0) {
                                if (arg1.field215) {
                                    var10 = 2000;
                                }
                            } else if (class719.field10041.field204 == arg1.field204) {
                                var10 = 2000;
                            } else {
                                var10 = 0;
                            }
                        } else if (class454.field6216[var8]) {
                            var10 = 2000;
                        }
                        short var11 = (short) (class549.field7633[var8] + var10);
                        int var12 = class762.field10563[var8] == -1 ? class28.field297 : class762.field10563[var8];
                        class611.field8670++;
                        class526.method3076(-1, false, (long) arg1.field4051, 500, "<col=ffffff>" + var7, 0, 0, false, true, var12, (long) arg1.field4051, var11, class402.field5552[var8]);
                    }
                }
            }
            if (!arg2) {
                for (class554 var9 = (class554) class521.field7310.method3731((byte) -120); var9 != null; var9 = (class554) class521.field7310.method3729((byte) -121)) {
                    if (var9.field7682 == 2) {
                        var9.field7689 = "<col=ffffff>" + var7;
                        break;
                    }
                }
            }
            if (arg0 != 63) {
                method807(-41, -105, 22);
            }
        } else if (class295.field4298 && (class345.field4896 & 0x10) != 0) {
            class526.method3076(-1, false, 0L, 500, class460.field6275 + " -> <col=ffffff>" + class563.field7835.method3281(class423.field5892, -1), 0, 0, false, true, class745.field10364, (long) arg1.field4051, 18, class470.field6405);
            class302.field4333++;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILka;IZII)Lka;")
    public final class233 method803(int arg0, class233 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1414++;
        int var7 = this.field1388[arg4];
        int var8 = this.field1402[arg4];
        if (arg3) {
            method802((byte) -46, null, false);
        }
        class495 var9 = this.field1404.method3284(var8 >> 16, (byte) -114);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method585((byte) 1, arg2, true);
        }
        class495 var11 = null;
        if ((this.field1418 || class568.field7904) && arg5 != -1 && this.field1402.length > arg5) {
            int var12 = this.field1402[arg5];
            var11 = this.field1404.method3284(var12 >> 16, (byte) -116);
            arg5 = var12 & 0xFFFF;
        }
        class495 var13 = null;
        class495 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field1417 != null) {
            if (arg4 < this.field1417.length) {
                var15 = this.field1417[arg4];
                if (var15 != 65535) {
                    var13 = this.field1404.method3284(var15 >> 16, (byte) -123);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1418 || class568.field7904) && arg5 != -1 && arg5 < this.field1417.length) {
                var16 = this.field1417[arg5];
                if (var16 != 65535) {
                    var14 = this.field1404.method3284(var16 >> 16, (byte) -108);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field1406) {
            arg2 |= 0x200;
        }
        if (var9.method2899(var10, 44)) {
            arg2 |= 0x80;
        }
        if (var9.method2900((byte) -111, var10)) {
            arg2 |= 0x100;
        }
        if (var9.method2898(var10, -124)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2899(var15, 59)) {
                arg2 |= 0x80;
            }
            if (var13.method2900((byte) -111, var15)) {
                arg2 |= 0x100;
            }
            if (var13.method2898(var15, -121)) {
                arg2 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2899(arg5, 37)) {
                arg2 |= 0x80;
            }
            if (var11.method2900((byte) -111, arg5)) {
                arg2 |= 0x100;
            }
            if (var11.method2898(arg5, -123)) {
                arg2 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2899(var16, 48)) {
                arg2 |= 0x80;
            }
            if (var14.method2900((byte) -111, var16)) {
                arg2 |= 0x100;
            }
            if (var14.method2898(var16, 27)) {
                arg2 |= 0x400;
            }
        }
        int var17 = arg2 | 0x20;
        class233 var18 = arg1.method585((byte) 1, var17, true);
        var18.method1581(0, var9, arg0 - 1, this.field1406, var10, 0, var11, arg5, var7);
        if (var13 != null) {
            var18.method1581(0, var13, arg0 - 1, this.field1406, var15, 0, var14, var16, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static final void method804(byte arg0) {
        field1396++;
        class321.field4568.method516(((float) class420.field5820.field9467.method1145(arg0 ^ 0x449B) * 0.1F + 0.7F) * 1.1523438F);
        class321.field4568.method517(class277.field4005, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class321.field4568.method511(class792.field10857, -1, 0);
        class321.field4568.method458(class726.field10109);
        if (arg0 != 24) {
            method807(-63, 108, -128);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILol;)V")
    public final void method805(int arg0, class431 arg1) {
        field1408++;
        if (arg0 != -1) {
            method807(59, 30, 64);
        }
        while (true) {
            int var3 = arg1.method2557(14929);
            if (var3 == 0) {
                return;
            }
            this.method806((byte) -92, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLol;I)V")
    private final void method806(byte arg0, class431 arg1, int arg2) {
        field1409++;
        if (arg2 == 1) {
            int var16 = arg1.method2565((byte) -89);
            this.field1388 = new int[var16];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field1388[var17] = arg1.method2565((byte) -126);
            }
            this.field1402 = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                this.field1402[var18] = arg1.method2565((byte) -110);
            }
            for (int var19 = 0; var19 < var16; var19++) {
                this.field1402[var19] = (arg1.method2565((byte) -84) << 16) + this.field1402[var19];
            }
        } else if (arg2 == 2) {
            this.field1411 = arg1.method2565((byte) -85);
        } else if (arg2 == 3) {
            this.field1415 = new boolean[256];
            int var4 = arg1.method2557(14929);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1415[arg1.method2557(class172.method1269(arg0, -14859))] = true;
            }
        } else if (arg2 == 5) {
            this.field1407 = arg1.method2557(14929);
        } else if (arg2 == 6) {
            this.field1394 = arg1.method2565((byte) -114);
        } else if (arg2 == 7) {
            this.field1395 = arg1.method2565((byte) -106);
        } else if (arg2 == 8) {
            this.field1393 = arg1.method2557(arg0 + 15021);
        } else if (arg2 == 9) {
            this.field1412 = arg1.method2557(14929);
        } else if (arg2 == 10) {
            this.field1397 = arg1.method2557(14929);
        } else if (arg2 == 11) {
            this.field1392 = arg1.method2557(14929);
        } else if (arg2 == 12) {
            int var6 = arg1.method2557(14929);
            this.field1417 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1417[var7] = arg1.method2565((byte) -126);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field1417[var8] = (arg1.method2565((byte) -128) << 16) + this.field1417[var8];
            }
        } else if (arg2 == 13) {
            int var9 = arg1.method2565((byte) -118);
            this.field1424 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg1.method2557(14929);
                if (var11 > 0) {
                    this.field1424[var10] = new int[var11];
                    this.field1424[var10][0] = arg1.method2515(arg0 + 203);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field1424[var10][var12] = arg1.method2565((byte) -108);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field1406 = true;
        } else if (arg2 == 15) {
            this.field1418 = true;
        } else if (arg2 == 16) {
            this.field1400 = true;
        } else if (arg2 == 18) {
            this.field1399 = true;
        } else if (arg2 == 19) {
            if (this.field1403 == null) {
                this.field1403 = new int[this.field1424.length];
                for (int var13 = 0; var13 < this.field1424.length; var13++) {
                    this.field1403[var13] = 255;
                }
            }
            this.field1403[arg1.method2557(14929)] = arg1.method2557(14929);
        } else if (arg2 == 20) {
            if (this.field1389 == null || this.field1422 == null) {
                this.field1389 = new int[this.field1424.length];
                this.field1422 = new int[this.field1424.length];
                for (int var14 = 0; var14 < this.field1424.length; var14++) {
                    this.field1389[var14] = 256;
                    this.field1422[var14] = 256;
                }
            }
            int var15 = arg1.method2557(14929);
            this.field1389[var15] = arg1.method2565((byte) -96);
            this.field1422[var15] = arg1.method2565((byte) -97);
        }
        if (arg0 != -92) {
            this.method810(49);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)B")
    public static final byte method807(int arg0, int arg1, int arg2) {
        field1410++;
        if (arg1 == 9) {
            return (byte) ((arg2 & arg0) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBLka;III)Lka;")
    public final class233 method808(int arg0, int arg1, int arg2, byte arg3, class233 arg4, int arg5, int arg6, int arg7) {
        field1398++;
        int var9 = this.field1388[arg6];
        int var10 = this.field1402[arg6];
        class495 var11 = this.field1404.method3284(var10 >> 16, (byte) -112);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg4.method585(arg3, arg0, true);
        }
        class495 var13 = null;
        if ((this.field1418 || class568.field7904) && arg5 != -1 && this.field1402.length > arg5) {
            int var14 = this.field1402[arg5];
            var13 = this.field1404.method3284(var14 >> 16, (byte) -107);
            arg5 = var14 & 0xFFFF;
        }
        if (this.field1406) {
            arg0 |= 0x200;
        }
        if (var11.method2899(var12, arg1 ^ 0x2C)) {
            arg0 |= 0x80;
        }
        if (var11.method2900((byte) -111, var12)) {
            arg0 |= 0x100;
        }
        if (var11.method2898(var12, arg1 ^ 0x3B)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2899(arg5, arg1 ^ 0x47)) {
                arg0 |= 0x80;
            }
            if (var13.method2900((byte) -111, arg5)) {
                arg0 |= 0x100;
            }
            if (var13.method2898(arg5, 105)) {
                arg0 |= 0x400;
            }
        }
        int var15 = arg0 | 0x20;
        class233 var16 = arg4.method585(arg3, var15, true);
        var16.method1581(arg1, var11, arg2 - 1, this.field1406, var12, arg7, var13, arg5, var9);
        return var16;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    public static void method809(byte arg0) {
        field1391 = null;
        if (arg0 > -77) {
            method804((byte) 127);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public final void method810(int arg0) {
        if (this.field1397 == -1) {
            if (this.field1415 == null) {
                this.field1397 = 0;
            } else {
                this.field1397 = 2;
            }
        }
        if (this.field1412 == -1) {
            if (this.field1415 == null) {
                this.field1412 = 0;
            } else {
                this.field1412 = 2;
            }
        }
        field1421++;
        if (arg0 != 2) {
            this.field1392 = 10;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZB)V")
    public static final void method811(boolean arg0, byte arg1) {
        if (arg0) {
            if (class379.field5314 != -1) {
                class604.method3507(class379.field5314, arg1 ^ 0xFFFFFFD5);
            }
            for (class27 var2 = (class27) class37.field437.method4254((byte) 8); var2 != null; var2 = (class27) class37.field437.method4251(-56)) {
                if (!var2.method4235(-128)) {
                    var2 = (class27) class37.field437.method4254((byte) 8);
                    if (var2 == null) {
                        break;
                    }
                }
                class251.method1663(false, false, var2, true);
            }
            class379.field5314 = -1;
            class37.field437 = new class769(8);
            class416.method2446(-111);
            class379.field5314 = class222.field3265;
            class106.method857(false, 0);
            class31.method262((byte) -79);
            class46.method354(class379.field5314);
        }
        if (arg1 != 42) {
            method811(false, (byte) 57);
        }
        field1401++;
        class759.field10515 = false;
        class110.field1563 = "";
        class599.field8546 = "";
        class717.method3993((byte) 124);
        class578.field8338 = -1;
        class760.method4196(class25.field274, true);
        class719.field10041 = new class21();
        class719.field10041.field10350 = class456.field6225 * 512 / 2;
        class719.field10041.field4142[0] = class192.field2891 / 2;
        class719.field10041.field10347 = class192.field2891 * 512 / 2;
        class719.field10041.field4136[0] = class456.field6225 / 2;
        class286.field4204 = 0;
        class733.field10199 = 0;
        if (class783.field10725 == 2) {
            class733.field10199 = class337.field4787 << 9;
            class286.field4204 = class427.field5930 << 9;
        } else {
            class198.method1409(false);
        }
        class166.method1239(false);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZIZI)I")
    public final int method812(boolean arg0, int arg1, boolean arg2, int arg3) {
        field1405++;
        if (arg2) {
            return -17;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field1402[arg3];
        class495 var8 = null;
        class495 var9 = this.field1404.method3284(var7 >> 16, (byte) -127);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field1418 || class568.field7904) && arg1 != -1 && arg1 < this.field1402.length) {
            int var11 = this.field1402[arg1];
            var8 = this.field1404.method3284(var11 >> 16, (byte) -114);
            var6 = var11 & 0xFFFF;
        }
        if (this.field1406) {
            var5 |= 0x200;
        }
        if (var9.method2899(var10, 123)) {
            var5 |= 0x80;
        }
        if (var9.method2900((byte) -111, var10)) {
            var5 |= 0x100;
        }
        if (var9.method2898(var10, -97)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2899(var6, 90)) {
                var5 |= 0x80;
            }
            if (var8.method2900((byte) -111, var6)) {
                var5 |= 0x100;
            }
            if (var8.method2898(var6, 122)) {
                var5 |= 0x400;
            }
        }
        if (this.field1417 != null && arg0) {
            if (this.field1417.length > arg3) {
                int var12 = this.field1417[arg3];
                if (var12 != 65535) {
                    class495 var13 = this.field1404.method3284(var12 >> 16, (byte) -117);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2899(var14, 15)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2900((byte) -111, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2898(var14, 52)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field1418 || class568.field7904) && arg1 != -1 && this.field1417.length > arg1) {
                int var15 = this.field1417[arg1];
                if (var15 != 65535) {
                    class495 var16 = this.field1404.method3284(var15 >> 16, (byte) -120);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2899(var17, 69)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2900((byte) -111, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2898(var17, 50)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method813(String arg0, int arg1) {
        field1390++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (arg1 != -16332) {
            method813(null, -27);
        }
        while (var4 < var2) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
            var4++;
        }
        return var3;
    }

    static {
        new BitSet(65536);
        field1423 = 0.0F;
    }
}
