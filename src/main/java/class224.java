import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class224 {

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "Lhm;")
    private class208 field2910 = new class208(64);

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "Lpfa;")
    private class275 field2912;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)Z")
    public static final boolean method1354(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class510.field6382; var3++) {
            class352 var4 = class352.field4547[var3];
            if (var4.field4554 == 1) {
                int var5 = var4.field4553 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4550 * var5 >> 8) + var4.field4552;
                    int var7 = (var4.field4557 * var5 >> 8) + var4.field4551;
                    int var8 = (var4.field4543 * var5 >> 8) + var4.field4541;
                    int var9 = (var4.field4549 * var5 >> 8) + var4.field4558;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4554 == 2) {
                int var10 = arg0 - var4.field4553;
                if (var10 > 0) {
                    int var11 = (var4.field4550 * var10 >> 8) + var4.field4552;
                    int var12 = (var4.field4557 * var10 >> 8) + var4.field4551;
                    int var13 = (var4.field4543 * var10 >> 8) + var4.field4541;
                    int var14 = (var4.field4549 * var10 >> 8) + var4.field4558;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4554 == 3) {
                int var15 = var4.field4552 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4545 * var15 >> 8) + var4.field4553;
                    int var17 = (var4.field4548 * var15 >> 8) + var4.field4561;
                    int var18 = (var4.field4543 * var15 >> 8) + var4.field4541;
                    int var19 = (var4.field4549 * var15 >> 8) + var4.field4558;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4554 == 4) {
                int var20 = arg2 - var4.field4552;
                if (var20 > 0) {
                    int var21 = (var4.field4545 * var20 >> 8) + var4.field4553;
                    int var22 = (var4.field4548 * var20 >> 8) + var4.field4561;
                    int var23 = (var4.field4543 * var20 >> 8) + var4.field4541;
                    int var24 = (var4.field4549 * var20 >> 8) + var4.field4558;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4554 == 5) {
                int var25 = arg1 - var4.field4541;
                if (var25 > 0) {
                    int var26 = (var4.field4545 * var25 >> 8) + var4.field4553;
                    int var27 = (var4.field4548 * var25 >> 8) + var4.field4561;
                    int var28 = (var4.field4550 * var25 >> 8) + var4.field4552;
                    int var29 = (var4.field4557 * var25 >> 8) + var4.field4551;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I[[[BIBII)V")
    private static final void method1355(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class58.field745++;
        class238.field3091 = 0;
        for (int var6 = class631.field8559; var6 < class709.field9904; var6++) {
            class565[][] var15 = class407.field5237[var6];
            for (int var16 = class254.field3275; var16 < class683.field9311; var16++) {
                for (int var17 = class430.field5431; var17 < class711.field9935; var17++) {
                    class565 var18 = var15[var16][var17];
                    if (var18 != null) {
                        if (class82.field1060[var16 + class664.field9021 - class662.field8971][var17 + class664.field9021 - class513.field6440] && arg1 == null || var6 < arg2 || arg1[var6][var16][var17] != arg3) {
                            var18.field7088 = true;
                            var18.field7092 = true;
                            if (var18.field7074 == null) {
                                var18.field7076 = false;
                            } else {
                                var18.field7076 = true;
                            }
                            class238.field3091++;
                        } else {
                            var18.field7088 = false;
                            var18.field7092 = false;
                            var18.field7080 = 0;
                            if (var16 >= class662.field8971 - 16 && var16 <= class662.field8971 + 16 && var17 >= class513.field6440 - 16 && var17 <= class513.field6440 + 16 && (var18.field7079 != null || var18.field7087 != null || var18.field7082 != null || var18.field7073 != null || var18.field7085 != null || var18.field7074 != null)) {
                                class489.field6114.method1802(var18, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var7 = class631.field8559; var7 < class709.field9904; var7++) {
            if (class687.field9409.method419() && var7 >= arg2 && arg1 != null) {
                int var8 = class82.field1060.length;
                if (class82.field1060.length + class254.field3275 > class546.field6871) {
                    var8 -= class82.field1060.length + class254.field3275 - class546.field6871;
                }
                int var9 = class82.field1060[0].length;
                if (class82.field1060[0].length + class430.field5431 > class36.field538) {
                    var9 -= class82.field1060[0].length + class430.field5431 - class36.field538;
                }
                int var10 = class686.field9365;
                while (true) {
                    if (var10 >= var8) {
                        class489.field6114.method1803((byte) 114, true, var7, class299.field3801[var7]);
                        break;
                    }
                    int var11 = class254.field3275 + var10 - class686.field9365;
                    for (int var12 = class617.field8373; var12 < var9; var12++) {
                        class42.field597[var10][var12] = false;
                        if (class82.field1060[var10][var12]) {
                            int var13 = class430.field5431 + var12 - class617.field8373;
                            for (int var14 = var7; var14 >= 0; var14--) {
                                if (class407.field5237[var14][var11][var13] != null && class407.field5237[var14][var11][var13].field7083 == var7) {
                                    class42.field597[var10][var12] = class407.field5237[var14][var11][var13].field7088;
                                    break;
                                }
                            }
                        }
                    }
                    var10++;
                }
            } else {
                class489.field6114.method1803((byte) -80, false, var7, class299.field3801[var7]);
            }
            class489.field6114.method1808(3);
        }
        if (!class175.method1050(true)) {
            class175.method1050(false);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V")
    public final void method1356(boolean arg0) {
        class208 var2 = this.field2910;
        synchronized (this.field2910) {
            this.field2910.method1224(arg0);
        }
        field2909++;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II[F)[F")
    public static final float[] method1357(int arg0, int arg1, float[] arg2) {
        field2908++;
        float[] var3 = new float[arg0];
        int var4 = 63 % ((-arg1 - 13) / 49);
        class70.method554(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILd;)V")
    public static final void method1358(int arg0, class140 arg1) {
        class299.field3801[arg0] = arg1;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IB)V")
    public final void method1359(int arg0, byte arg1) {
        class208 var3 = this.field2910;
        synchronized (this.field2910) {
            this.field2910.method1218(112);
            if (arg1 < 38) {
                this.method1362(26, -58);
            }
            this.field2910 = new class208(arg0);
        }
        field2905++;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
    public final void method1360(int arg0) {
        if (arg0 != 23814) {
            this.field2910 = null;
        }
        class208 var2 = this.field2910;
        synchronized (this.field2910) {
            this.field2910.method1218(109);
        }
        field2911++;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(BI)V")
    public final void method1361(byte arg0, int arg1) {
        field2907++;
        if (arg0 >= 81) {
            class208 var3 = this.field2910;
            synchronized (this.field2910) {
                this.field2910.method1222(14564, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)Lega;")
    public final class666 method1362(int arg0, int arg1) {
        field2906++;
        if (arg0 != 21370) {
            return null;
        }
        class208 var3 = this.field2910;
        class666 var4;
        synchronized (this.field2910) {
            var4 = (class666) this.field2910.method1221((long) arg1, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field2912;
        byte[] var6;
        synchronized (this.field2912) {
            var6 = this.field2912.method1659(89, class382.method2202(arg1, (byte) 55), class64.method512(arg1, (byte) -73));
        }
        class666 var7 = new class666();
        if (var6 != null) {
            var7.method3703(new class572(var6), 0);
        }
        class208 var8 = this.field2910;
        synchronized (this.field2910) {
            this.field2910.method1230((byte) 8, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Loa;IILq;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method1363(class650 arg0, int arg1, int arg2, class396 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class687.field9409 = arg0;
        class592.field7956 = arg1;
        class5.field39 = arg3;
        class24.field281 = class687.field9409.method430() > 0;
        class662.field8971 = arg4 >> class480.field5972;
        class513.field6440 = arg6 >> class480.field5972;
        class424.field5373 = arg4;
        class370.field4786 = arg6;
        class303.field3847 = arg5;
        class254.field3275 = class662.field8971 - class664.field9021;
        if (class254.field3275 < 0) {
            class686.field9365 = -class254.field3275;
            class254.field3275 = 0;
        } else {
            class686.field9365 = 0;
        }
        class430.field5431 = class513.field6440 - class664.field9021;
        if (class430.field5431 < 0) {
            class617.field8373 = -class430.field5431;
            class430.field5431 = 0;
        } else {
            class617.field8373 = 0;
        }
        class683.field9311 = class664.field9021 + class662.field8971;
        if (class683.field9311 > class546.field6871) {
            class683.field9311 = class546.field6871;
        }
        class711.field9935 = class664.field9021 + class513.field6440;
        if (class711.field9935 > class36.field538) {
            class711.field9935 = class36.field538;
        }
        for (int var18 = 0; var18 < class664.field9021 + class664.field9021 + 2; var18++) {
            for (int var23 = 0; var23 < class664.field9021 + class664.field9021 + 2; var23++) {
                int var24 = class662.field8971 + var18 - class664.field9021;
                int var25 = class513.field6440 + var23 - class664.field9021;
                if (var24 >= 0 && var25 >= 0 && var24 < class546.field6871 && var25 < class36.field538) {
                    int var26 = var24 << class480.field5972;
                    int var27 = var25 << class480.field5972;
                    int var28 = class252.field3250[class252.field3250.length - 1].method201(var24, var25) - (0x3E8 << class480.field5972 - 7);
                    int var29 = class286.field3633 == null ? class252.field3250[0].method201(var24, var25) + class97.field1256 : class286.field3633[0].method201(var24, var25) + class97.field1256;
                    class42.field597[var18][var23] = class687.field9409.method467(var26, var28, var27, var26, var29, var27);
                } else {
                    class42.field597[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class664.field9021 + class664.field9021 + 1; var19++) {
            for (int var22 = 0; var22 < class664.field9021 + class664.field9021 + 1; var22++) {
                class82.field1060[var19][var22] = class42.field597[var19][var22] || class42.field597[var19 + 1][var22] || class42.field597[var19][var22 + 1] || class42.field597[var19 + 1][var22 + 1];
            }
        }
        class197.field2322 = arg8;
        class643.field8726 = arg9;
        class128.field1556 = arg10;
        class410.field5274 = arg11;
        class610.field8307 = arg12;
        class42.method258();
        class159.method984(3351159, class687.field9409);
        for (class686 var20 = (class686) class14.field136.method1715((byte) 123); var20 != null; var20 = (class686) class14.field136.method1712((byte) 0)) {
            var20.method1619((byte) -88);
            class213.method1246(var20, 79);
        }
        if (class24.field281) {
            for (int var21 = 0; var21 < class303.field3838; var21++) {
                class370.field4785[var21].method3680(arg17, false, arg1);
            }
        }
        if (arg2 > 1) {
            class687.field9409.method476(0);
            if (class489.field6114 == null || class489.field6114 instanceof class303) {
                class489.field6114 = new class437();
            }
        } else if (class489.field6114 == null || class489.field6114 instanceof class437) {
            class489.field6114 = new class303();
        }
        class489.field6114.method1804(arg2, -99);
        class489.field6114.method1808(3);
        if (class19.field205 != null) {
            class689.method3809(true);
            class489.field6114.method1806(22, true);
            method1355(arg2, null, 0, (byte) 0, arg15, arg16);
            class489.field6114.method1808(3);
            class489.field6114.method1806(23, true);
            class689.method3809(false);
        }
        method1355(arg2, arg7, arg13, arg14, arg15, arg16);
        class489.field6114.method1808(3);
        class489.field6114.method1801(0);
        class489.field6114.method1808(3);
        if (arg2 > 1) {
            class687.field9409.method494(0);
        }
        class687.field9409.method473(0, null);
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lbs;ILpfa;)V")
    public class224(class643 arg0, int arg1, class275 arg2) {
        this.field2912 = arg2;
        if (this.field2912 != null) {
            int var4 = this.field2912.method1642(84) - 1;
            this.field2912.method1655(var4, (byte) -82);
        }
    }
}
