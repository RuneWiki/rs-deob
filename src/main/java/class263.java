import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class263 extends class424 {

    @OriginalMember(owner = "client!js", name = "o", descriptor = "[I")
    public int[] field3523 = new int[] { -1 };

    @OriginalMember(owner = "client!js", name = "q", descriptor = "[I")
    public int[] field3525 = new int[1];

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!js", name = "r", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!js", name = "s", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BIILtc;)V", line = 3)
    public static final void method1627(byte arg0, int arg1, int arg2, class477 arg3) {
        if (arg0 == -62) {
            field3527++;
            class171.field2122 = arg2;
            class507.field6662 = arg3;
            class141.field1853 = arg1;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V", line = 23)
    public static final void method1628(int arg0) {
        field3522++;
        int[] var1 = new int[class232.field3109.field2558];
        int var2 = 0;
        for (int var3 = 0; var3 < class232.field3109.field2558; var3++) {
            class696 var5 = class232.field3109.method1292(0, var3);
            if (var5.field9568 >= 0 || var5.field9562 >= 0) {
                var1[var2++] = var3;
            }
        }
        class347.field4429 = new int[var2];
        if (arg0 == 1637396872) {
            for (int var4 = 0; var4 < var2; var4++) {
                class347.field4429[var4] = var1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([IZI[IB)J", line = 64)
    private final long method1629(int[] arg0, boolean arg1, int arg2, int[] arg3, byte arg4) {
        field3524++;
        long[] var6 = class64.field878;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg2 >> 8) ^ var7) & 0xFFL)];
        if (arg4 > -24) {
            return -3L;
        }
        long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg2) & 0xFFL)];
        for (int var13 = 0; var13 < arg3.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg3[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var6[(int) (((long) (arg3[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) (((long) (arg3[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg3[var13]) & 0xFFL)];
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var6[(int) ((var11 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IBLoa;IILto;ZLjq;II)Lba;", line = 107)
    public final class107 method1630(int arg0, byte arg1, class43 arg2, int arg3, int arg4, class210 arg5, boolean arg6, class348 arg7, int arg8, int arg9) {
        field3526++;
        class107 var11 = null;
        int var12 = arg8;
        class501 var13 = null;
        if (arg0 != -1) {
            var13 = class536.field6983.method92(arg0, (byte) 24);
        }
        int[] var14 = this.field3523;
        if (var13 != null && var13.field6571 != null) {
            var14 = new int[var13.field6571.length];
            for (int var15 = 0; var15 < var13.field6571.length; var15++) {
                int var16 = var13.field6571[var15];
                if (var16 >= 0 && var16 < this.field3523.length) {
                    var14[var15] = this.field3523[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -73 % ((arg1 + 43) / 48);
        boolean var21 = false;
        int var22 = -1;
        int var23 = -1;
        int var24 = 0;
        class63 var25 = null;
        class63 var26 = null;
        if (arg7 != null) {
            int var27 = arg7.field4463[arg3];
            var12 = arg8 | 0x20;
            int var28 = var27 >>> 16;
            var25 = class552.field7163.method3034(-50, var28);
            var22 = var27 & 0xFFFF;
            if (var25 != null) {
                var18 |= var25.method530(var22, 70);
                var17 |= var25.method532(var22, (byte) 126);
                var21 |= var25.method531(5858, var22);
                var19 |= arg7.field4448;
            }
            if ((arg7.field4459 || class673.field9330) && arg9 != -1 && arg7.field4463.length > arg9) {
                int var29 = arg7.field4463[arg9];
                var24 = arg7.field4453[arg3];
                int var30 = var29 >>> 16;
                var23 = var29 & 0xFFFF;
                if (var28 == var30) {
                    var26 = var25;
                } else {
                    var26 = class552.field7163.method3034(-29, var23 >>> 16);
                }
                if (var26 != null) {
                    var18 |= var26.method530(var23, 92);
                    var17 |= var26.method532(var23, (byte) 120);
                    var21 |= var26.method531(5858, var23);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var21) {
                var12 |= 0x400;
            }
        }
        long var31 = this.method1629(arg5 == null ? null : arg5.field2714, arg6, arg0, var14, (byte) -86);
        if (class311.field4034 != null) {
            var11 = (class107) class311.field4034.method3655(-118, var31);
        }
        if (var11 == null || arg2.method377(var11.method796(), var12) != 0) {
            if (var11 != null) {
                var12 = arg2.method370(var12, var11.method796());
            }
            int var33 = var12;
            boolean var34 = false;
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1 && !class232.field3109.method1292(0, var14[var35]).method3785(111, arg6)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class645[] var36 = new class645[var14.length];
            for (int var37 = 0; var37 < var14.length; var37++) {
                if (var14[var37] != -1) {
                    var36[var37] = class232.field3109.method1292(0, var14[var37]).method3789(arg6, 18782);
                }
            }
            if (var13 != null && var13.field6614 != null) {
                for (int var38 = 0; var38 < var13.field6614.length; var38++) {
                    if (var13.field6614[var38] != null && var36[var38] != null) {
                        int var39 = var13.field6614[var38][0];
                        int var40 = var13.field6614[var38][1];
                        int var41 = var13.field6614[var38][2];
                        int var42 = var13.field6614[var38][3];
                        int var43 = var13.field6614[var38][4];
                        int var44 = var13.field6614[var38][5];
                        if (var42 != 0 || var43 != 0 || var44 != 0) {
                            var36[var38].method3554(var43, var44, true, var42);
                        }
                        if (var39 != 0 || var40 != 0 || var41 != 0) {
                            var36[var38].method3541(var39, true, var41, var40);
                        }
                    }
                }
            }
            if (arg5 != null) {
                var33 = var12 | 0x4000;
            }
            class645 var45 = new class645(var36, var36.length);
            var11 = arg2.method410(var45, var33, class3.field23, 64, 850);
            if (arg5 != null) {
                for (int var46 = 0; var46 < 5; var46++) {
                    for (int var47 = 0; var47 < class432.field5579.length; var47++) {
                        if (class432.field5579[var47][var46].length > arg5.field2714[var46]) {
                            var11.method829(class524.field6828[var47][var46], class432.field5579[var47][var46][arg5.field2714[var46]]);
                        }
                    }
                }
            }
            if (class311.field4034 != null) {
                var11.method825(var12);
                class311.field4034.method3650(var31, -113, var11);
            }
        }
        if (arg7 == null || var25 == null) {
            return var11;
        } else {
            class107 var48 = var11.method479((byte) 1, var12, true);
            var48.method791(arg7.field4448, var26, var23, arg4 - 1, var22, 0, 10591, var25, var24);
            return var48;
        }
    }
}
