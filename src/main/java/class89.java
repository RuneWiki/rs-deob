import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class89 extends class128 {

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field1407 = 0;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "[I")
    public static int[] field1405 = new int[100];

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1410 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "Ljava/lang/String;")
    public String field1416;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "[C")
    public char[] field1400;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "[C")
    public char[] field1401;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "[I")
    public int[] field1398;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "[I")
    public int[] field1406;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILpi;)V", line = 4)
    public final void method777(int arg0, class336 arg1) {
        if (arg0 != 0) {
            method781(-28, -96, 115, 78, 125);
        }
        field1408++;
        while (true) {
            int var3 = arg1.method2364(-9069);
            if (var3 == 0) {
                return;
            }
            this.method780(arg1, var3, 15212);
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)V", line = 29)
    public static final void method778(int arg0, int arg1) {
        short var2 = 256;
        field1412++;
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class185.field3139 += arg0 * 128;
        if (class116.field2033.length < class185.field3139) {
            class185.field3139 -= class116.field2033.length;
            int var3 = (int) (Math.random() * 12.0D);
            class90.method790(class338.field5409[var3], -113);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class70.field1156[var4 + var5] - (class116.field2033[class185.field3139 + var4 & class116.field2033.length + -1] * arg0 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class70.field1156[var4++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class70.field1156[var10 + var11] = 255;
                } else {
                    class70.field1156[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < (var2 - arg0); var13++) {
            class296.field4728[var13] = class296.field4728[arg0 + var13];
        }
        int var14 = var2 - arg0;
        if (arg1 > -52) {
            return;
        }
        while (var14 < var2) {
            class296.field4728[var14] = (int) (Math.sin((double) class322.field5118 / 14.0D) * 16.0D + Math.sin((double) class322.field5118 / 15.0D) * 14.0D + Math.sin((double) class322.field5118 / 16.0D) * 12.0D);
            class322.field5118++;
            var14++;
        }
        int var15 = ((class181.field3045 & 0x1) + arg0) / 2;
        client.field4380 += arg0;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < client.field4380; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class70.field1156[(var18 << 7) + var17] = 192;
        }
        client.field4380 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += class70.field1156[var21 + var22 + var15];
                }
                if (var22 - var15 - 1 >= 0) {
                    var20 -= class70.field1156[var22 + var21 - var15 - 1];
                }
                if (var22 >= 0) {
                    class21.field318[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > (var15 + var25)) {
                    var24 += class21.field318[var15 * 128 + var23 + var26];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class21.field318[var26 + var23 - var15 * 128 - 128];
                }
                if (var25 >= 0) {
                    class70.field1156[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V", line = 213)
    public static void method779(int arg0) {
        if (arg0 != 10) {
            method781(21, 126, 97, 6, -16);
        }
        field1405 = null;
        field1410 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lpi;II)V", line = 224)
    private final void method780(class336 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1416 = arg0.method2365(118);
        } else if (arg1 == 2) {
            int var4 = arg0.method2364(-9069);
            this.field1400 = new char[var4];
            this.field1398 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1398[var5] = arg0.method2339((byte) -46);
                byte var6 = arg0.method2323(arg2 - 15268);
                this.field1400[var5] = var6 == 0 ? 0 : class99.method860((byte) 29, var6);
            }
        } else if (arg1 == 3) {
            int var7 = arg0.method2364(arg2 ^ 0xFFFFE7FF);
            this.field1401 = new char[var7];
            this.field1406 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1406[var8] = arg0.method2339((byte) -46);
                byte var9 = arg0.method2323(117);
                this.field1401[var8] = var9 == 0 ? 0 : class99.method860((byte) 29, var9);
            }
        } else if (arg1 != 4) {
        }
        if (arg2 == 15212) {
            field1415++;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V", line = 294)
    public static final void method781(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1399++;
        for (int var5 = arg3; var5 < class215.field3602; var5++) {
            if ((class328.field5227[var5] + class15.field231[var5]) > arg0 && (arg0 + arg1) > class328.field5227[var5] && (class213.field3579[var5] + class15.field225[var5]) > arg4 && class213.field3579[var5] < (arg2 + arg4)) {
                class224.field3746[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(ILpi;)Leg;", line = 322)
    public static final class327 method782(int arg0, class336 arg1) {
        if (arg0 >= -15) {
            field1405 = (int[]) null;
        }
        field1404++;
        return new class327(arg1.method2326(58), arg1.method2326(-35), arg1.method2326(-46), arg1.method2326(-104), arg1.method2317(21803), arg1.method2317(21803), arg1.method2364(-9069));
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(CI)I", line = 337)
    public final int method783(char arg0, int arg1) {
        field1414++;
        if (this.field1406 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1406.length; var3++) {
            if (this.field1401[var3] == arg0) {
                return this.field1406[var3];
            }
        }
        if (arg1 != 15491) {
            method778(59, 11);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIBI)Ltl;", line = 363)
    public static final class228 method784(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = 51 % ((arg2 + 32) / 62);
        class228 var5 = new class228();
        var5.field3824 = arg1;
        field1411++;
        var5.field3833 = arg0;
        class172.field2972.method725((long) arg3, var5, 1);
        class81.method741(arg0, (byte) -120);
        class137 var6 = class146.method1167(1169843632, arg3);
        if (var6 != null) {
            class258.method1793(var6, 0);
        }
        if (class107.field1783 != null) {
            class258.method1793(class107.field1783, 0);
            class107.field1783 = null;
        }
        int var7 = class293.field4708;
        for (int var8 = 0; var8 < var7; var8++) {
            if (class17.method171((byte) -114, class276.field4401[var8])) {
                class172.method1351(var8, (byte) -65);
            }
        }
        if (class293.field4708 == 1) {
            class207.field3515 = false;
            class33.method300(class292.field4678, 11314, class42.field621, class68.field1114, class213.field3590);
        } else {
            class33.method300(class292.field4678, 11314, class42.field621, class68.field1114, class213.field3590);
            int var9 = class177.field3014.method2223(class5.field74);
            for (int var10 = 0; var10 < class293.field4708; var10++) {
                int var11 = class177.field3014.method2223(class352.method2453(var10, 27884));
                if (var9 < var11) {
                    var9 = var11;
                }
            }
            class68.field1114 = var9 + 8;
            class292.field4678 = class293.field4708 * 15 + (class177.field3007 ? 26 : 22);
        }
        if (var6 != null) {
            class185.method1425(var6, 90, false);
        }
        class86.method769(arg0, (byte) 95);
        if (class311.field4933 != -1) {
            class291.method1991(class311.field4933, -28554, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BC)I", line = 437)
    public final int method785(byte arg0, char arg1) {
        field1402++;
        if (this.field1398 == null) {
            return -1;
        } else if (arg0 == -17) {
            for (int var3 = 0; var3 < this.field1398.length; var3++) {
                if (this.field1400[var3] == arg1) {
                    return this.field1398[var3];
                }
            }
            return -1;
        } else {
            return 33;
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V", line = 461)
    public final void method786(int arg0) {
        if (arg0 != 32768) {
            return;
        }
        field1403++;
        if (this.field1406 != null) {
            for (int var2 = 0; var2 < this.field1406.length; var2++) {
                this.field1406[var2] = class144.method1159(this.field1406[var2], 32768);
            }
        }
        if (this.field1398 != null) {
            for (int var3 = 0; var3 < this.field1398.length; var3++) {
                this.field1398[var3] = class144.method1159(this.field1398[var3], 32768);
            }
        }
    }
}
