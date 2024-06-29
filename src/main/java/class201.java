import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class201 {

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Ljc;")
    private class480 field2612 = null;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "Ldh;")
    private class252 field2606;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "Z")
    private boolean field2604;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "Lpi;")
    public static class340 field2624 = new class340(32, -1);

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    public static int field2633 = 0;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "F")
    public static float field2626;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "[Ljava/lang/Object;")
    private Object[] field2603;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field2636;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)V", line = 4)
    public final void method1291(byte arg0, int arg1) {
        field2642++;
        if (this.method1301((byte) -102, arg1)) {
            int var3 = 46 % ((arg0 + 70) / 54);
            if (this.field2636 != null) {
                this.field2636[arg1] = null;
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)[I", line = 25)
    public final int[] method1292(int arg0, int arg1) {
        field2627++;
        if (arg0 > -68) {
            return null;
        } else if (this.method1301((byte) -111, arg1)) {
            int[] var3 = this.field2612.field6989[arg1];
            if (var3 == null) {
                var3 = new int[this.field2612.field6988[arg1]];
                int var4 = 0;
                while (var4 < var3.length) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 55)
    public final boolean method1293(String arg0, int arg1) {
        field2615++;
        if (!this.method1315(255)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != -24433) {
            this.field2606 = null;
        }
        int var4 = this.field2612.field6991.method341(class77.method446(var3, false), -1);
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)Z", line = 77)
    public final boolean method1294(int arg0, byte arg1) {
        field2621++;
        if (!this.method1315(255)) {
            return false;
        } else if (arg1 >= -112) {
            return true;
        } else if (this.field2612.field6990.length == 1) {
            return this.method1317(0, 0, arg0);
        } else if (!this.method1301((byte) 81, arg0)) {
            return false;
        } else if (this.field2612.field6990[arg0] == 1) {
            return this.method1317(0, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(BI)I", line = 105)
    public final int method1295(byte arg0, int arg1) {
        field2641++;
        if (!this.method1315(255)) {
            return -1;
        }
        if (arg0 != 55) {
            this.method1314(22, 97, 68);
        }
        int var3 = this.field2612.field6991.method341(arg1, -1);
        return this.method1301((byte) -114, var3) ? var3 : -1;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 136)
    public static void method1296(int arg0) {
        if (arg0 == -25059) {
            field2624 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 147)
    public final int method1297(String arg0, int arg1) {
        field2634++;
        if (!this.method1315(255)) {
            return -1;
        }
        if (arg1 != -5105) {
            this.method1302(-40, 50);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field2612.field6991.method341(class77.method446(var3, false), -1);
        return this.method1301((byte) 64, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III[I)Z", line = 168)
    private final boolean method1298(int arg0, int arg1, int arg2, int[] arg3) {
        field2611++;
        if (!this.method1301((byte) -119, arg2)) {
            return false;
        } else if (this.field2603[arg2] == null) {
            return false;
        } else {
            int var5 = this.field2612.field6988[arg2];
            int[] var6 = this.field2612.field6989[arg2];
            if (this.field2636[arg2] == null) {
                this.field2636[arg2] = new Object[this.field2612.field6990[arg2]];
            }
            if (arg0 < 12) {
                return false;
            }
            Object[] var7 = this.field2636[arg2];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg3 == null || arg3[0] == 0 && arg3[1] == 0 && arg3[2] == 0 && arg3[3] == 0) {
                var11 = class360.method2119(this.field2603[arg2], (byte) -86, false);
            } else {
                var11 = class360.method2119(this.field2603[arg2], (byte) 89, true);
                class88 var12 = new class88(var11);
                var12.method558(5, arg3, var12.field1223.length, -124);
            }
            byte[] var13;
            try {
                var13 = class295.method1773((byte) -1, var11);
            } catch (RuntimeException var49) {
                throw class260.method1632(var49, "T3 - " + (arg3 != null) + "," + arg2 + "," + var11.length + "," + class200.method1286(var11.length, var11, (byte) -81) + "," + class200.method1286(var11.length - 2, var11, (byte) -81) + "," + this.field2612.field6987[arg2] + "," + this.field2612.field6996);
            }
            if (this.field2604) {
                this.field2603[arg2] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field2617 == 0) {
                    var7[var15] = class28.method191(false, false, var13);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field2617 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * 4 * var33;
                class88 var35 = new class88(var13);
                int var36 = 0;
                int var37 = 0;
                var35.field1176 = var34;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method578(108);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg1 == var41) {
                            var36 += var39;
                            var37 = var41;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                int var43 = 0;
                var35.field1176 = var34;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method578(106);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg1 == var48) {
                            class526.method3113(var13, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var7[var37] = var42;
            } else {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var17 * 4 * var5;
                class88 var19 = new class88(var13);
                var19.field1176 = var18;
                int[] var20 = new int[var5];
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method578(112);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field1176 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method578(113);
                        class526.method3113(var13, var26, var24[var29], var20[var29], var28);
                        var26 += var28;
                        var20[var29] += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field2617 == 0) {
                        var7[var31] = class28.method191(false, false, var24[var30]);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)V", line = 455)
    private final void method1299(boolean arg0, int arg1) {
        this.field2606.method1573((byte) 94, arg1);
        if (arg0) {
            this.method1308(-36, (byte) -35);
        }
        field2618++;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B", line = 469)
    public final byte[] method1300(String arg0, byte arg1, String arg2) {
        field2638++;
        if (!this.method1315(255)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        if (arg1 <= 68) {
            return null;
        }
        String var5 = arg2.toLowerCase();
        int var6 = this.field2612.field6991.method341(class77.method446(var4, false), -1);
        if (this.method1301((byte) 41, var6)) {
            int var7 = this.field2612.field7001[var6].method341(class77.method446(var5, false), -1);
            return this.method1313((byte) -128, var6, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(BI)Z", line = 493)
    private final boolean method1301(byte arg0, int arg1) {
        int var3 = 63 / ((arg0 + 36) / 62);
        field2613++;
        if (!this.method1315(255)) {
            return false;
        } else if (arg1 >= 0 && this.field2612.field6990.length > arg1 && this.field2612.field6990[arg1] != 0) {
            return true;
        } else if (class411.field5488) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)I", line = 527)
    public final int method1302(int arg0, int arg1) {
        if (arg0 >= -54) {
            this.method1293(null, 22);
        }
        field2632++;
        return this.method1301((byte) -114, arg1) ? this.field2612.field6990[arg1] : 0;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(Ljava/lang/String;I)Z", line = 542)
    public final boolean method1303(String arg0, int arg1) {
        field2619++;
        if (!this.method1315(255)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 == -24051) {
            int var4 = this.field2612.field6991.method341(class77.method446(var3, false), -1);
            return this.method1308(var4, (byte) -25);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 560)
    public final void method1304(byte arg0) {
        if (this.field2603 != null) {
            for (int var2 = 0; var2 < this.field2603.length; var2++) {
                this.field2603[var2] = null;
            }
        }
        field2640++;
        if (arg0 > -75) {
            this.method1305(null, -125);
        }
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(Ljava/lang/String;I)V", line = 583)
    public final void method1305(String arg0, int arg1) {
        field2616++;
        if (!this.method1315(arg1 ^ 0xFB)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field2612.field6991.method341(class77.method446(var3, false), -1);
        this.method1299(false, var4);
        if (arg1 != 4) {
            this.field2636 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)I", line = 601)
    public final int method1306(int arg0) {
        field2643++;
        if (!this.method1315(255)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2603.length; var4++) {
            if (this.field2612.field6988[var4] > 0) {
                var3 += this.method1310(arg0 - 16971, var4);
                var2 += 100;
            }
        }
        if (arg0 == var2) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIZ)V", line = 642)
    public final void method1307(boolean arg0, int arg1, boolean arg2) {
        field2630++;
        if (!this.method1315(255)) {
            return;
        }
        if (arg0) {
            this.field2612.field6993 = null;
            this.field2612.field6991 = null;
        }
        if (arg1 != 3664) {
            field2633 = 5;
        }
        if (arg2) {
            this.field2612.field7001 = null;
            this.field2612.field6995 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(IB)Z", line = 670)
    public final boolean method1308(int arg0, byte arg1) {
        if (arg1 != -25) {
            field2626 = -0.6667794F;
        }
        field2631++;
        if (!this.method1301((byte) 77, arg0)) {
            return false;
        } else if (this.field2603[arg0] == null) {
            this.method1318(-3984, arg0);
            return this.field2603[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)I", line = 697)
    public final int method1309(byte arg0) {
        field2622++;
        if (arg0 == 31) {
            return this.method1315(255) ? this.field2612.field6990.length : -1;
        } else {
            return 6;
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)I", line = 713)
    private final int method1310(int arg0, int arg1) {
        field2625++;
        if (!this.method1301((byte) 69, arg1)) {
            return 0;
        } else if (this.field2603[arg1] == null) {
            if (arg0 != -16971) {
                this.method1303(null, 72);
            }
            return this.field2606.method1571((byte) -32, arg1);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)Z", line = 732)
    public final boolean method1311(byte arg0) {
        field2605++;
        if (!this.method1315(255)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 > -67) {
            this.method1307(true, 53, false);
        }
        for (int var3 = 0; var3 < this.field2612.field6999.length; var3++) {
            int var4 = this.field2612.field6999[var3];
            if (this.field2603[var4] == null) {
                this.method1318(-3984, var4);
                if (this.field2603[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)I", line = 770)
    public final int method1312(int arg0) {
        int var2 = 74 / ((arg0 + 40) / 53);
        field2637++;
        if (!this.method1315(255)) {
            throw new IllegalStateException("");
        }
        return this.field2612.field6996;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BII)[B", line = 790)
    public final byte[] method1313(byte arg0, int arg1, int arg2) {
        field2610++;
        return arg0 >= -98 ? null : this.method1321((byte) -27, arg1, arg2, null);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)Z", line = 802)
    private final boolean method1314(int arg0, int arg1, int arg2) {
        field2620++;
        if (!this.method1315(arg0 - 22806)) {
            return false;
        } else if (arg1 >= 0 && arg2 >= 0 && this.field2612.field6990.length > arg1 && arg2 < this.field2612.field6990[arg1]) {
            if (arg0 != 23061) {
                this.method1293(null, -78);
            }
            return true;
        } else if (class411.field5488) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)Z", line = 832)
    private final boolean method1315(int arg0) {
        if (arg0 != 255) {
            this.field2617 = -31;
        }
        field2635++;
        if (this.field2612 == null) {
            this.field2612 = this.field2606.method1574(0);
            if (this.field2612 == null) {
                return false;
            }
            this.field2603 = new Object[this.field2612.field6997];
            this.field2636 = new Object[this.field2612.field6997][];
        }
        return true;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 854)
    public final boolean method1316(String arg0, int arg1, String arg2) {
        field2607++;
        if (!this.method1315(255)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field2612.field6991.method341(class77.method446(var4, false), arg1 - 1);
        if (this.method1301((byte) -124, var6)) {
            int var7 = this.field2612.field7001[var6].method341(class77.method446(var5, false), ~arg1);
            return arg1 == 0 ? this.method1317(arg1, var6, var7) : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ldh;ZI)V", line = 927)
    public class201(class252 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field2606 = arg0;
        this.field2604 = arg1;
        this.field2617 = arg2;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(III)Z", line = 883)
    public final boolean method1317(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field2626 = 0.8091309F;
        }
        field2608++;
        if (!this.method1314(arg0 ^ 0x5A15, arg1, arg2)) {
            return false;
        } else if (this.field2636[arg1] != null && this.field2636[arg1][arg2] != null) {
            return true;
        } else if (this.field2603[arg1] == null) {
            this.method1318(-3984, arg1);
            return this.field2603[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(II)V", line = 910)
    private final void method1318(int arg0, int arg1) {
        field2628++;
        if (arg0 != -3984) {
            return;
        }
        if (this.field2604) {
            this.field2603[arg1] = this.field2606.method1570(arg1, true);
        } else {
            this.field2603[arg1] = class28.method191(false, false, this.field2606.method1570(arg1, true));
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)V", line = 941)
    public final void method1319(int arg0) {
        field2614++;
        if (this.field2636 != null) {
            for (int var2 = 0; var2 < this.field2636.length; var2++) {
                this.field2636[var2] = null;
            }
        }
        if (arg0 < 41) {
            this.method1309((byte) -122);
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(II)[B", line = 963)
    public final byte[] method1320(int arg0, int arg1) {
        field2609++;
        if (!this.method1315(255)) {
            return null;
        } else if (this.field2612.field6990.length == arg1) {
            return this.method1313((byte) -102, 0, arg0);
        } else if (!this.method1301((byte) -104, arg0)) {
            return null;
        } else if (this.field2612.field6990[arg0] == 1) {
            return this.method1313((byte) -121, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BII[I)[B", line = 986)
    public final byte[] method1321(byte arg0, int arg1, int arg2, int[] arg3) {
        field2623++;
        if (!this.method1314(arg0 ^ 0xFFFFA5F0, arg1, arg2)) {
            return null;
        }
        if (this.field2636[arg1] == null || this.field2636[arg1][arg2] == null) {
            boolean var5 = this.method1298(121, arg2, arg1, arg3);
            if (!var5) {
                this.method1318(arg0 ^ 0xF95, arg1);
                boolean var6 = this.method1298(58, arg2, arg1, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg0 != -27) {
            this.method1319(-101);
        }
        byte[] var7 = class360.method2119(this.field2636[arg1][arg2], (byte) 126, false);
        if (this.field2617 == 1) {
            this.field2636[arg1][arg2] = null;
            if (this.field2612.field6990[arg1] == 1) {
                this.field2636[arg1] = null;
            }
        } else if (this.field2617 == 2) {
            this.field2636[arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(Ljava/lang/String;I)I", line = 1042)
    public final int method1322(String arg0, int arg1) {
        field2629++;
        if (this.method1315(255)) {
            int var3 = 20 % ((arg1 + 27) / 55);
            String var4 = arg0.toLowerCase();
            int var5 = this.field2612.field6991.method341(class77.method446(var4, false), -1);
            return this.method1310(-16971, var5);
        } else {
            return 0;
        }
    }
}
