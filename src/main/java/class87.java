import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class87 {

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    private int field1402 = 128;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    private int field1417 = 0;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    private int field1407 = 0;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    private int field1412 = 0;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "Z")
    public boolean field1423 = false;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public int field1420 = -1;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    private int field1421 = 128;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lve;")
    public static class255 field1404 = method607(74, ")4j");

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "[I")
    public static int[] field1413 = new int[1000];

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field1415 = 0;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "Lve;")
    private static class255 field1411 = method607(46, "Hidden");

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lve;")
    public static class255 field1400 = field1411;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Ldg;")
    public static class307 field1410;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "Lrg;")
    public static class88 field1422;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
    public static int[] field1399;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "[S")
    private short[] field1398;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "[S")
    private short[] field1406;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "[S")
    private short[] field1408;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "[S")
    private short[] field1409;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLpb;)V", line = 5)
    public final void method603(boolean arg0, class70 arg1) {
        field1401++;
        if (arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method481(0);
            if (var3 == 0) {
                return;
            }
            this.method605(var3, arg1, -42);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZILn;BIIIIIILof;II)Lof;", line = 30)
    public static final class227 method604(int arg0, boolean arg1, int arg2, class271 arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class227 arg11, int arg12, int arg13) {
        field1418++;
        long var14 = ((long) arg5 << 48) + (long) ((arg2 << 24) + (arg13 << 16) + arg9) + ((long) arg10 << 32);
        class227 var16 = (class227) class101.field1708.method558(var14, true);
        if (var16 == null) {
            int[] var17 = new int[] { 64, 96, 128 };
            byte var18;
            if (arg9 == 1) {
                var18 = 9;
            } else if (arg9 == 2) {
                var18 = 12;
            } else if (arg9 == 3) {
                var18 = 15;
            } else if (arg9 == 4) {
                var18 = 18;
            } else {
                var18 = 21;
            }
            byte var19 = 3;
            int[][] var20 = new int[var19][var18];
            class200 var21 = new class200((var18 * var19) + 1, var18 * 2 * var19 + -var18, 0);
            int var22 = var21.method1446(0, 0, 0);
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var17[var23];
                int var25 = var17[var23];
                for (int var26 = 0; var26 < var18; var26++) {
                    int var27 = (var26 << 11) / var18;
                    int var28 = arg6 + (class283.field4877[var27] * var24) >> 16;
                    int var29 = arg8 + (class283.field4870[var27] * var25) >> 16;
                    var20[var23][var26] = var21.method1446(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                short var33 = (short) (((arg5 & 0x7F) * var31 + (arg10 & 0x7F) * var32 & 0x7F00) + ((arg5 & 0x380) * var31 + (arg10 & 0x380) * var32 & 0x38000) + ((arg5 & 0xFC00) * var31 + (arg10 & 0xFC00) * var32 & 0xFC0000) >> 8);
                byte var34 = (byte) (arg2 * var31 + arg13 * var32 >> 8);
                for (int var35 = 0; var35 < var18; var35++) {
                    if (var30 == 0) {
                        var21.method1453(var22, var20[0][(var35 + 1) % var18], var20[0][var35], (byte) 1, var33, var34);
                    } else {
                        var21.method1453(var20[var30 - 1][var35], var20[var30 - 1][(var35 + 1) % var18], var20[var30][(var35 + 1) % var18], (byte) 1, var33, var34);
                        var21.method1453(var20[var30 - 1][var35], var20[var30][(var35 + 1) % var18], var20[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var21.method1440(64, 768, -50, -10, -50);
            class101.field1708.method555(var16, var14, arg4 ^ 0x1);
        }
        int var36 = arg9 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        if (arg1) {
            if (arg12 > 1664 || arg12 < 384) {
                var38 -= 128;
            }
            if (arg12 > 640 && arg12 < 1408) {
                var40 = var36 + 128;
            }
            if (arg12 > 1152 && arg12 < 1920) {
                var39 = var36 + 128;
            }
            if (arg12 > 128 && arg12 < 896) {
                var37 -= 128;
            }
        }
        if (arg4 != 1) {
            field1411 = (class255) null;
        }
        int var41 = arg11.method1363();
        if (var37 > var41) {
            var41 = var37;
        }
        int var42 = arg11.method1339();
        int var43 = arg11.method1345();
        if (var39 < var42) {
            var42 = var39;
        }
        class42 var44 = null;
        int var45 = arg11.method1338();
        if (var40 < var45) {
            var45 = var40;
        }
        if (arg3 != null) {
            int var46 = arg3.field4667[arg7];
            var44 = class107.method828((byte) -40, var46 >> 16);
            arg7 = var46 & 0xFFFF;
        }
        if (var43 < var38) {
            var43 = var38;
        }
        class227 var47;
        if (var44 == null) {
            var47 = var16.method1360(true, true);
            var47.method1352((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method1353((var41 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method1360(!var44.method260(arg7, 121), true);
            var47.method1352((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method1353((var41 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method1374(var44, arg7);
        }
        if (arg12 != 0) {
            var47.method1349(arg12);
        }
        if (class281.field4827) {
            class193 var50 = (class193) var47;
            if (arg0 != class113.method861((byte) -117, arg6 + var41, arg8 - -var43, client.field4039) || class113.method861((byte) 123, arg6 + var42, arg8 - -var45, client.field4039) != arg0) {
                for (int var51 = 0; var51 < var50.field3137; var51++) {
                    var50.field3134[var51] += class113.method861((byte) 125, var50.field3136[var51] + arg6, var50.field3161[var51] - -arg8, client.field4039) - arg0;
                }
                var50.field3165.field2907 = false;
                var50.field3131.field523 = false;
            }
        } else {
            class267 var48 = (class267) var47;
            if (class113.method861((byte) -10, arg6 + var41, arg8 + var43, client.field4039) != arg0 || arg0 != class113.method861((byte) -123, arg6 + var42, arg8 - -var45, client.field4039)) {
                for (int var49 = 0; var49 < var48.field4523; var49++) {
                    var48.field4534[var49] += class113.method861((byte) -42, var48.field4532[var49] + arg6, var48.field4546[var49] + arg8, client.field4039) - arg0;
                }
                var48.field4529 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILpb;I)V", line = 268)
    private final void method605(int arg0, class70 arg1, int arg2) {
        if (arg2 != -42) {
            this.field1406 = (short[]) null;
        }
        field1419++;
        if (arg0 == 1) {
            this.field1403 = arg1.method423(arg2 ^ 0xFFFFFF29);
        } else if (arg0 == 2) {
            this.field1420 = arg1.method423(255);
        } else if (arg0 == 4) {
            this.field1402 = arg1.method423(255);
        } else if (arg0 == 5) {
            this.field1421 = arg1.method423(255);
        } else if (arg0 == 6) {
            this.field1412 = arg1.method423(255);
        } else if (arg0 == 7) {
            this.field1417 = arg1.method481(0);
        } else if (arg0 == 8) {
            this.field1407 = arg1.method481(arg2 ^ 0xFFFFFFD6);
        } else if (arg0 == 9) {
            this.field1423 = true;
        } else if (arg0 == 40) {
            int var4 = arg1.method481(0);
            this.field1409 = new short[var4];
            this.field1398 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1409[var5] = (short) arg1.method423(255);
                this.field1398[var5] = (short) arg1.method423(255);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method481(0);
            this.field1408 = new short[var6];
            this.field1406 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1408[var7] = (short) arg1.method423(255);
                this.field1406[var7] = (short) arg1.method423(255);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZIIIII)V", line = 355)
    public static final void method606(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1414++;
        int var7 = arg2 + arg5;
        int var8 = arg3 - arg2;
        int var9 = arg0 + arg2;
        int var10 = arg4 - arg2;
        for (int var11 = arg5; var11 < var7; var11++) {
            class30.method170(arg4, class250.field4213[var11], arg0, arg6, -30310);
        }
        for (int var12 = arg3; var12 > var8; var12--) {
            class30.method170(arg4, class250.field4213[var12], arg0, arg6, -30310);
        }
        if (arg1) {
            return;
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class250.field4213[var13];
            class30.method170(var9, var14, arg0, arg6, -30310);
            class30.method170(arg4, var14, var10, arg6, -30310);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;)Lve;", line = 409)
    public static final class255 method607(int arg0, String arg1) {
        field1397++;
        if (arg0 <= 23) {
            field1411 = (class255) null;
        }
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class255 var5 = new class255();
        var5.field4297 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field4297[var5.field4343++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field4297[var5.field4343++] = (byte) var6;
            }
        }
        var5.method1778(true);
        return var5.method1761((byte) -117);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 467)
    public static void method608(int arg0) {
        field1413 = null;
        field1410 = null;
        field1411 = null;
        if (arg0 != 1) {
            field1413 = (int[]) null;
        }
        field1404 = null;
        field1399 = null;
        field1400 = null;
        field1422 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Lof;", line = 488)
    public final class227 method609(int arg0, int arg1) {
        field1416++;
        if (arg1 > -17) {
            return (class227) null;
        }
        class227 var3 = (class227) class300.field5108.method558((long) this.field1405, true);
        if (var3 == null) {
            class200 var4 = class200.method1431(class275.field4728, this.field1403, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1409 != null) {
                for (int var5 = 0; var5 < this.field1409.length; var5++) {
                    var4.method1438(this.field1409[var5], this.field1398[var5]);
                }
            }
            if (this.field1408 != null) {
                for (int var6 = 0; var6 < this.field1408.length; var6++) {
                    var4.method1448(this.field1408[var6], this.field1406[var6]);
                }
            }
            var3 = var4.method1440(this.field1417 + 64, 850 - -this.field1407, -30, -50, -30);
            class300.field5108.method555(var3, (long) this.field1405, 0);
        }
        class227 var7;
        if (this.field1420 == -1 || arg0 == -1) {
            var7 = var3.method1360(true, true);
        } else {
            var7 = class181.method1269(110, this.field1420).method1884(var3, arg0, (byte) 118);
        }
        if (this.field1402 != 128 || this.field1421 != 128) {
            var7.method1352(this.field1402, this.field1421, this.field1402);
        }
        if (this.field1412 != 0) {
            if (this.field1412 == 90) {
                var7.method1332();
            }
            if (this.field1412 == 180) {
                var7.method1336();
            }
            if (this.field1412 == 270) {
                var7.method1356();
            }
        }
        return var7;
    }
}
