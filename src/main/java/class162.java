import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class162 {

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "Lne;")
    private class132 field2332 = null;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "Z")
    private boolean field2318;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "Laj;")
    private class306 field2334;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "[I")
    public static int[] field2327 = new int[32];

    @OriginalMember(owner = "client!mn", name = "R", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!mn", name = "S", descriptor = "Lvk;")
    public static class305 field2353;

    @OriginalMember(owner = "client!mn", name = "V", descriptor = "[I")
    public static int[] field2356;

    @OriginalMember(owner = "client!mn", name = "T", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!mn", name = "U", descriptor = "Llm;")
    public static class31 field2355;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!mn", name = "P", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!mn", name = "Q", descriptor = "Lmn;")
    public static class162 field2351;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "[Ljava/lang/Object;")
    private Object[] field2325;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field2341;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "([IIBI)Z")
    private final boolean method991(int[] arg0, int arg1, byte arg2, int arg3) {
        field2343++;
        if (!this.method1000((byte) -75, arg1)) {
            return false;
        } else if (this.field2325[arg1] == null) {
            return false;
        } else {
            int var5 = this.field2332.field1792[arg1];
            int[] var6 = this.field2332.field1795[arg1];
            if (this.field2341[arg1] == null) {
                this.field2341[arg1] = new Object[this.field2332.field1783[arg1]];
            }
            Object[] var7 = this.field2341[arg1];
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
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var11 = class153.method937(this.field2325[arg1], true, (byte) -53);
                class208 var12 = new class208(var11);
                var12.method1473(5, arg0, var12.field3193.length, -1640531527);
            } else {
                var11 = class153.method937(this.field2325[arg1], false, (byte) 118);
            }
            byte[] var13;
            try {
                var13 = class272.method1840(var11, -1);
            } catch (RuntimeException var49) {
                throw class104.method708(var49, "T3 - " + (arg0 != null) + "," + arg1 + "," + var11.length + "," + class225.method1623((byte) -19, var11.length, var11) + "," + class225.method1623((byte) -19, var11.length - 2, var11) + "," + this.field2332.field1793[arg1] + "," + this.field2332.field1782);
            }
            if (this.field2318) {
                this.field2325[arg1] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field2342 == 0) {
                    var7[var15] = class361.method2385(false, -29809, var13);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field2342 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var33 * 4 * var5;
                class208 var35 = new class208(var13);
                int var36 = 0;
                int var37 = 0;
                var35.field3162 = var34;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method1436((byte) 86);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg3 == var41) {
                            var37 = var41;
                            var36 += var39;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                var35.field3162 = var34;
                int var43 = 0;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method1436((byte) 87);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg3 == var48) {
                            class324.method2166(var13, var44, var42, var43, var46);
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
                int var18 = var50 - var5 * var17 * 4;
                class208 var19 = new class208(var13);
                var19.field3162 = var18;
                int[] var20 = new int[var5];
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method1436((byte) 109);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field3162 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method1436((byte) 109);
                        class324.method2166(var13, var26, var24[var29], var20[var29], var28);
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
                    if (this.field2342 == 0) {
                        var7[var31] = class361.method2385(false, -29809, var24[var30]);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            if (arg2 != 44) {
                field2351 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Z")
    public final boolean method992(int arg0) {
        field2345++;
        if (!this.method1006(true)) {
            return false;
        }
        if (arg0 != -10486) {
            this.method998(115, (byte) 14);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2332.field1791.length; var3++) {
            int var4 = this.field2332.field1791[var3];
            if (this.field2325[var4] == null) {
                this.method1005(true, var4);
                if (this.field2325[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)Z")
    public final boolean method993(int arg0, int arg1, int arg2) {
        field2340++;
        if (!this.method1021(arg2, -1, arg0)) {
            return false;
        }
        if (arg1 != 1939) {
            field2327 = null;
        }
        if (this.field2341[arg0] != null && this.field2341[arg0][arg2] != null) {
            return true;
        } else if (this.field2325[arg0] == null) {
            this.method1005(true, arg0);
            return this.field2325[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
    public final boolean method994(String arg0, byte arg1, String arg2) {
        field2309++;
        if (!this.method1006(true)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field2332.field1786.method3057(class535.method3170(125, var4), false);
        if (this.method1000((byte) -61, var6)) {
            int var7 = this.field2332.field1800[var6].method3057(class535.method3170(127, var5), false);
            return arg1 == -48 ? this.method993(var6, 1939, var7) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)I")
    public final int method995(int arg0, byte arg1) {
        field2348++;
        if (!this.method1006(true)) {
            return -1;
        }
        if (arg1 >= -79) {
            this.method992(104);
        }
        int var3 = this.field2332.field1786.method3057(arg0, false);
        return this.method1000((byte) -64, var3) ? var3 : -1;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lpb;IIIII)Ljava/awt/Frame;")
    public static final Frame method996(class2 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2338++;
        if (!arg0.method12((byte) -102)) {
            return null;
        }
        if (arg2 == 0) {
            class534[] var6 = class304.method2054(arg0, -122);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field7824 == arg1 && var6[var8].field7825 == arg5 && (arg3 == 0 || var6[var8].field7826 == arg3) && (!var7 || var6[var8].field7827 > arg2)) {
                    var7 = true;
                    arg2 = var6[var8].field7827;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class495 var9 = arg0.method30(arg5, -653598992, arg1, arg3, arg2);
        while (var9.field7458 == 0) {
            class208.method1464((byte) -117, 10L);
        }
        if (arg4 != 2015625216) {
            return null;
        }
        Frame var10 = (Frame) var9.field7462;
        if (var10 == null) {
            return null;
        } else if (var9.field7458 == 2) {
            class355.method2342((byte) 118, arg0, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
    public final void method997(int arg0) {
        if (arg0 < 14) {
            return;
        }
        if (this.field2325 != null) {
            for (int var2 = 0; var2 < this.field2325.length; var2++) {
                this.field2325[var2] = null;
            }
        }
        field2324++;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(IB)I")
    private final int method998(int arg0, byte arg1) {
        if (arg1 <= 101) {
            this.method1014(false, null);
        }
        field2317++;
        if (this.method1000((byte) -60, arg0)) {
            return this.field2325[arg0] == null ? this.field2334.method2064(93, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(IB)V")
    public final void method999(int arg0, byte arg1) {
        field2314++;
        if (arg1 != -84) {
            field2353 = null;
        }
        if (this.method1000((byte) -79, arg0) && this.field2341 != null) {
            this.field2341[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BI)Z")
    private final boolean method1000(byte arg0, int arg1) {
        field2335++;
        if (arg0 > -43) {
            this.method998(-111, (byte) 36);
        }
        if (!this.method1006(true)) {
            return false;
        } else if (arg1 >= 0 && this.field2332.field1783.length > arg1 && this.field2332.field1783[arg1] != 0) {
            return true;
        } else if (class80.field1188) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method1001(byte arg0, String arg1) {
        field2344++;
        if (!this.method1006(true)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field2332.field1786.method3057(class535.method3170(126, var3), false);
        if (arg0 != -56) {
            this.field2334 = null;
        }
        return this.method1002(arg0 ^ 0xFFFFFFC9, var4);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)Z")
    public final boolean method1002(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method994(null, (byte) -122, null);
        }
        field2350++;
        if (!this.method1000((byte) -96, arg1)) {
            return false;
        } else if (this.field2325[arg1] == null) {
            this.method1005(true, arg1);
            return this.field2325[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method1003(String arg0, int arg1) {
        field2321++;
        if (!this.method1006(true)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field2332.field1786.method3057(class535.method3170(127, var3), false);
        if (arg1 != 0) {
            this.field2318 = true;
        }
        return this.method998(var4, (byte) 115);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZI)[B")
    public final byte[] method1004(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1025(true);
        }
        field2329++;
        return this.method1011(null, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZI)V")
    private final void method1005(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        field2339++;
        if (this.field2318) {
            this.field2325[arg1] = this.field2334.method2061(arg1, 0);
        } else {
            this.field2325[arg1] = class361.method2385(false, -29809, this.field2334.method2061(arg1, 0));
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)Z")
    private final boolean method1006(boolean arg0) {
        field2328++;
        if (this.field2332 == null) {
            this.field2332 = this.field2334.method2060(24342);
            if (this.field2332 == null) {
                return false;
            }
            this.field2341 = new Object[this.field2332.field1796][];
            this.field2325 = new Object[this.field2332.field1796];
        }
        return arg0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1007(int arg0, String arg1) {
        field2337++;
        if (arg0 != 1) {
            return false;
        } else if (this.method1006(true)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2332.field1786.method3057(class535.method3170(127, var3), false);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(IB)I")
    public final int method1008(int arg0, byte arg1) {
        if (arg1 != -21) {
            this.method1006(true);
        }
        field2323++;
        return this.method1000((byte) -62, arg0) ? this.field2332.field1783[arg0] : 0;
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "(IB)V")
    private final void method1009(int arg0, byte arg1) {
        field2322++;
        if (arg1 != 97) {
            this.method1003(null, -42);
        }
        this.field2334.method2057(arg0, -26);
    }

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "(IB)[B")
    public final byte[] method1010(int arg0, byte arg1) {
        field2315++;
        if (arg1 < 95) {
            this.method1016(6, 22);
        }
        if (!this.method1006(true)) {
            return null;
        } else if (this.field2332.field1783.length == 1) {
            return this.method1004(0, false, arg0);
        } else if (!this.method1000((byte) -80, arg0)) {
            return null;
        } else if (this.field2332.field1783[arg0] == 1) {
            return this.method1004(arg0, false, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "([IZII)[B")
    public final byte[] method1011(int[] arg0, boolean arg1, int arg2, int arg3) {
        field2336++;
        if (!this.method1021(arg2, -1, arg3)) {
            return null;
        }
        if (this.field2341[arg3] == null || this.field2341[arg3][arg2] == null) {
            boolean var5 = this.method991(arg0, arg3, (byte) 44, arg2);
            if (!var5) {
                this.method1005(true, arg3);
                boolean var6 = this.method991(arg0, arg3, (byte) 44, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class153.method937(this.field2341[arg3][arg2], arg1, (byte) 102);
        if (this.field2342 == 1) {
            this.field2341[arg3][arg2] = null;
            if (this.field2332.field1783[arg3] == 1) {
                this.field2341[arg3] = null;
            }
        } else if (this.field2342 == 2) {
            this.field2341[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZ)Z")
    public final boolean method1012(int arg0, boolean arg1) {
        field2311++;
        if (!this.method1006(arg1)) {
            return false;
        } else if (this.field2332.field1783.length == 1) {
            return this.method993(0, 1939, arg0);
        } else if (!this.method1000((byte) -91, arg0)) {
            return false;
        } else if (this.field2332.field1783[arg0] == 1) {
            return this.method993(arg0, 1939, 0);
        } else {
            if (!arg1) {
                this.field2334 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
    public final void method1013(int arg0) {
        if (this.field2341 != null) {
            for (int var2 = 0; var2 < this.field2341.length; var2++) {
                this.field2341[var2] = null;
            }
        }
        field2313++;
        if (arg0 != 0) {
            this.method995(51, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public final int method1014(boolean arg0, String arg1) {
        field2349++;
        if (this.method1006(arg0)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2332.field1786.method3057(class535.method3170(126, var3), false);
            return this.method1000((byte) -102, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIZ)V")
    public final void method1015(boolean arg0, int arg1, boolean arg2) {
        field2346++;
        if (!this.method1006(true)) {
            return;
        }
        if (arg0) {
            this.field2332.field1786 = null;
            this.field2332.field1790 = null;
        }
        if (arg1 < 92) {
            this.method1023(-19);
        }
        if (arg2) {
            this.field2332.field1800 = null;
            this.field2332.field1789 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)[I")
    public final int[] method1016(int arg0, int arg1) {
        field2333++;
        if (!this.method1000((byte) -69, arg0)) {
            return null;
        }
        if (arg1 != 1) {
            field2327 = null;
        }
        int[] var3 = this.field2332.field1795[arg0];
        if (var3 == null) {
            var3 = new int[this.field2332.field1792[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I")
    public final int method1017(byte arg0) {
        field2319++;
        if (!this.method1006(true)) {
            throw new IllegalStateException("");
        }
        int var2 = -25 % ((arg0 - 55) / 48);
        return this.field2332.field1782;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)I")
    public final int method1018(byte arg0) {
        field2312++;
        if (!this.method1006(true)) {
            return 0;
        }
        int var2 = 120 % ((58 - arg0) / 45);
        int var3 = 0;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2325.length; var5++) {
            if (this.field2332.field1792[var5] > 0) {
                var4 += this.method998(var5, (byte) 118);
                var3 += 100;
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var4 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method1019(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field2330++;
        if (arg3 <= 108) {
            method1024(null, -9, -111, -48, 3, -51, -99, -70, -22, -89, -4, -81);
        }
        int var8 = arg5 + arg7;
        int var9 = arg4 - arg7;
        for (int var10 = arg5; var10 < var8; var10++) {
            class280.method1888(arg6, arg1, (byte) 82, class103.field1521[var10], arg0);
        }
        int var11 = arg6 + arg7;
        int var12 = arg1 - arg7;
        for (int var13 = arg4; var13 > var9; var13--) {
            class280.method1888(arg6, arg1, (byte) 82, class103.field1521[var13], arg0);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class103.field1521[var14];
            class280.method1888(arg6, var11, (byte) 82, var15, arg0);
            class280.method1888(var11, var12, (byte) 82, var15, arg2);
            class280.method1888(var12, arg1, (byte) 82, var15, arg0);
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(ILjava/lang/String;)V")
    public final void method1020(int arg0, String arg1) {
        field2320++;
        if (this.method1006(true)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2332.field1786.method3057(class535.method3170(126, var3), false);
            this.method1009(var4, (byte) 97);
            int var5 = -13 % ((52 - arg0) / 63);
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)Z")
    private final boolean method1021(int arg0, int arg1, int arg2) {
        field2331++;
        if (!this.method1006(true)) {
            return false;
        } else if (arg1 >= ~arg2 && arg0 >= 0 && arg2 < this.field2332.field1783.length && this.field2332.field1783[arg2] > arg0) {
            return true;
        } else if (class80.field1188) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Laj;ZI)V")
    public class162(class306 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field2342 = arg2;
        this.field2318 = arg1;
        this.field2334 = arg0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method1022(int arg0, String arg1, String arg2) {
        field2316++;
        if (!this.method1006(true)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        if (arg0 < 37) {
            return null;
        }
        String var5 = arg1.toLowerCase();
        int var6 = this.field2332.field1786.method3057(class535.method3170(125, var4), false);
        if (this.method1000((byte) -51, var6)) {
            int var7 = this.field2332.field1800[var6].method3057(class535.method3170(126, var5), false);
            return this.method1004(var6, false, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)I")
    public final int method1023(int arg0) {
        field2347++;
        if (arg0 <= 125) {
            this.method995(0, (byte) 102);
        }
        return this.method1006(true) ? this.field2332.field1783.length : -1;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lsj;IIIIIIIIIII)Z")
    public static final boolean method1024(class284 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2310++;
        int var12 = arg3;
        int var13 = arg2;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg3 - var14;
        class258.field4160[var14][var15] = 99;
        int var17 = arg2 - var15;
        class418.field6347[var14][var15] = 0;
        byte var18 = 0;
        class21.field248[var18] = arg3;
        int var19 = 0;
        int var35 = var18 + 1;
        class299.field4713[var18] = arg2;
        if (arg4 != -16491) {
            return false;
        }
        int[][] var20 = arg0.field4485;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class300.field4716 = var12;
                                    class525.field7746 = var13;
                                    return false;
                                }
                                var12 = class21.field248[var19];
                                var13 = class299.field4713[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var23 = var12 - arg0.field4494;
                                var24 = var13 - arg0.field4480;
                                if (arg6 == -4) {
                                    if (arg7 == var12 && arg5 == var13) {
                                        class300.field4716 = var12;
                                        class525.field7746 = var13;
                                        return true;
                                    }
                                } else if (arg6 == -3) {
                                    if (class263.method1805(var12, arg1, arg9, arg5, (byte) 80, arg7, arg1, var13, arg8)) {
                                        class525.field7746 = var13;
                                        class300.field4716 = var12;
                                        return true;
                                    }
                                } else if (arg6 == -2) {
                                    if (arg0.method1911(var13, arg9, arg7, arg1, arg5, arg8, var12, arg1, arg10, (byte) 84)) {
                                        class300.field4716 = var12;
                                        class525.field7746 = var13;
                                        return true;
                                    }
                                } else if (arg6 == -1) {
                                    if (arg0.method1912(arg9, (byte) 44, var12, var13, arg7, arg8, arg5, arg10, arg1)) {
                                        class300.field4716 = var12;
                                        class525.field7746 = var13;
                                        return true;
                                    }
                                } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                                    if (arg0.method1921(arg1, var13, arg5, arg7, arg11, var12, arg6, 2883872)) {
                                        class300.field4716 = var12;
                                        class525.field7746 = var13;
                                        return true;
                                    }
                                } else if (arg0.method1918(var12, arg5, arg1, arg7, arg11, arg6, var13, 60)) {
                                    class525.field7746 = var13;
                                    class300.field4716 = var12;
                                    return true;
                                }
                                var26 = class418.field6347[var22][var21] + 1;
                                if (var22 > 0 && class258.field4160[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg1 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg1 - 1) {
                                            class21.field248[var35] = var12 - 1;
                                            class299.field4713[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class258.field4160[var22 - 1][var21] = 2;
                                            class418.field6347[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < (128 - arg1) && class258.field4160[var22 + 1][var21] == 0 && (var20[arg1 + var23][var24] & 0x60E40000) == 0 && (var20[arg1 + var23][var24 + arg1 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg1 - 1) <= var28) {
                                            class21.field248[var35] = var12 + 1;
                                            class299.field4713[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class258.field4160[var22 + 1][var21] = 8;
                                            class418.field6347[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg1][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class258.field4160[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg1 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg1 - 1) <= var29) {
                                            class21.field248[var35] = var12;
                                            class299.field4713[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class258.field4160[var22][var21 - 1] = 1;
                                            class418.field6347[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg1) > var21 && class258.field4160[var22][var21 + 1] == 0 && (var20[var23][arg1 + var24] & 0x4E240000) == 0 && (var20[arg1 + var23 - 1][var24 + arg1] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg1 - 1) <= var30) {
                                            class21.field248[var35] = var12;
                                            class299.field4713[var35] = var13 + 1;
                                            class258.field4160[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class418.field6347[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg1 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class258.field4160[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg1 <= var31) {
                                            class21.field248[var35] = var12 - 1;
                                            class299.field4713[var35] = var13 - 1;
                                            class258.field4160[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class418.field6347[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < 128 - arg1 && var21 > 0 && class258.field4160[var22 + 1][var21 - 1] == 0 && (var20[arg1 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg1) {
                                            class21.field248[var35] = var12 + 1;
                                            class299.field4713[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class258.field4160[var22 + 1][var21 - 1] = 9;
                                            class418.field6347[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg1][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg1) && class258.field4160[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg1 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg1; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg1 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class21.field248[var35] = var12 - 1;
                                    class299.field4713[var35] = var13 + 1;
                                    class258.field4160[var22 - 1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class418.field6347[var22 - 1][var21 + 1] = var26;
                                }
                            } while ((128 - arg1) <= var22);
                        } while (var21 >= 128 - arg1);
                    } while (class258.field4160[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg1 + var23][arg1 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg1; var34++) {
                    if ((var20[var23 + var34][arg1 + var24] & 0x7E240000) != 0 || (var20[arg1 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class21.field248[var35] = var12 + 1;
                class299.field4713[var35] = var13 + 1;
                class258.field4160[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class418.field6347[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(Z)V")
    public static void method1025(boolean arg0) {
        field2351 = null;
        if (arg0) {
            field2355 = null;
        }
        field2327 = null;
        field2356 = null;
        field2353 = null;
        field2355 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2327[var1] = var0 - 1;
            var0 += var0;
        }
        field2352 = 0;
        field2353 = new class305(1);
        field2356 = new int[] { 0, -1, 0, 1 };
        field2354 = -2;
        field2355 = new class31(13, 7);
    }
}
