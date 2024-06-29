import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class101 {

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lgk;")
    public static class331 field1422 = new class331("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field1423 = 20;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lgk;")
    public static class331 field1424 = new class331("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Lsl;")
    public static class318 field1425 = new class318(72, -1);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lba;")
    public class263 field1416;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Lt;")
    public class471 field1418;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1420++;
        if (arg4 > -77) {
            field1423 = -67;
        }
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg2 - arg5;
        int var12 = arg1 - arg5;
        int var13 = arg2 * arg2;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class141.field1996[arg0];
        class531.method3136(arg6 - arg2, 124, arg3, arg6 - var11, var39);
        class531.method3136(arg6 - var11, 118, arg7, arg6 + var11, var39);
        class531.method3136(arg6 + var11, -93, arg3, arg6 + arg2, var39);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var41 = arg0 - var9;
            int var42 = arg0 + var9;
            int var43 = arg6 + var8;
            int var44 = arg6 - var8;
            if (var40) {
                int var45 = arg6 + var10;
                int var46 = arg6 - var10;
                class531.method3136(var44, -99, arg3, var46, class141.field1996[var41]);
                class531.method3136(var46, 126, arg7, var45, class141.field1996[var41]);
                class531.method3136(var45, 126, arg3, var43, class141.field1996[var41]);
                class531.method3136(var44, -107, arg3, var46, class141.field1996[var42]);
                class531.method3136(var46, -127, arg7, var45, class141.field1996[var42]);
                class531.method3136(var45, -13, arg3, var43, class141.field1996[var42]);
            } else {
                class531.method3136(var44, -24, arg3, var43, class141.field1996[var41]);
                class531.method3136(var44, 127, arg3, var43, class141.field1996[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IC)Z", line = 173)
    public static final boolean method862(int arg0, char arg1) {
        field1421++;
        if (arg0 != 26959) {
            method861(-94, -48, 46, 98, 125, -50, 111, -26);
        }
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 186)
    public static void method863(byte arg0) {
        if (arg0 != 93) {
            method861(23, -85, -97, -109, 104, -54, -97, -74);
        }
        field1422 = null;
        field1425 = null;
        field1424 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 200)
    public static final void method864(byte arg0, String arg1, boolean arg2) {
        field1419++;
        class192.field2806.field5709 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class270.field3995.field13; var6++) {
            class72 var9 = class270.field3995.method6(arg0 + 22778, var6);
            if ((!arg2 || var9.field925) && var9.field980 == -1 && var9.field991 == -1 && var9.field952 == 0 && var9.field929.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class503.field7464 = null;
                    class402.field5967 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class206.field2996 = 0;
        class503.field7464 = var4;
        class402.field5967 = var5;
        String[] var7 = new String[class402.field5967];
        for (int var8 = 0; var8 < class402.field5967; var8++) {
            var7[var8] = class270.field3995.method6(arg0 + 22778, var4[var8]).field929;
        }
        class283.method1807(0, var7, class503.field7464);
        class192.field2806.method2377(0);
        if (arg0 != 105) {
            field1422 = null;
        }
        class192.field2806.field5709 = 2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V", line = 281)
    public static final void method865(int arg0, int arg1, int arg2) {
        field1417++;
        class215 var3 = class171.method1208(arg0, (byte) 116, arg2);
        var3.method1465(-25852);
        var3.field3082 = arg1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)I", line = 293)
    public static final int method866(int arg0, int arg1) {
        return class506.field7486 == null ? 0 : (class506.field7486[arg0][arg1] & 0xFF) << 3;
    }
}
