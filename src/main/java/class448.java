import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class448 {

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "Luf;")
    private class380 field5931 = new class380(64);

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "Lga;")
    private class332 field5933;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public int field5927;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "Leba;")
    public static class550 field5929 = new class550(69, 12);

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field5935 = 0;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "Loca;")
    public static class592 field5932;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(III[BIZ)Z")
    public static final boolean method2520(int arg0, int arg1, int arg2, byte[] arg3, int arg4, boolean arg5) {
        field5936++;
        boolean var6 = true;
        class157 var7 = new class157(arg3);
        int var8 = -1;
        label72: while (true) {
            int var9 = var7.method910(38);
            if (var9 == 0) {
                if (arg5) {
                    return true;
                }
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class600 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method964(73);
                                        if (var19 == 0) {
                                            continue label72;
                                        }
                                        var7.method930(255);
                                    }
                                    int var12 = var7.method964(112);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method930(255) >> 2;
                                    var16 = arg0 + var14;
                                    var17 = var13 + arg1;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (var16 >= arg2 - 1);
                    } while (var17 >= arg4 - 1);
                    var18 = class118.field1510.method3921(var8, -57);
                } while (var15 == 22 && !class602.field8408.field4300 && var18.field8293 == 0 && var18.field8327 != 1 && !var18.field8266);
                var11 = true;
                if (!var18.method3332(false)) {
                    class623.field8632++;
                    var6 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
    public final void method2521(int arg0, int arg1) {
        field5923++;
        class380 var3 = this.field5931;
        synchronized (this.field5931) {
            this.field5931.method2179(false, arg1);
            if (arg0 != 2) {
                method2528(true);
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
    public final void method2522(byte arg0) {
        int var2 = -106 / ((-arg0 - 31) / 55);
        field5925++;
        class380 var3 = this.field5931;
        synchronized (this.field5931) {
            this.field5931.method2168((byte) -83);
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V")
    public static void method2523(byte arg0) {
        field5932 = null;
        if (arg0 < -74) {
            field5929 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public static final void method2524(int arg0) {
        class249.field3225.method2168((byte) -107);
        field5928++;
        int var1 = -49 % ((33 - arg0) / 53);
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)Lvf;")
    public final class76 method2525(int arg0, int arg1) {
        field5926++;
        class380 var3 = this.field5931;
        class76 var4;
        synchronized (this.field5931) {
            var4 = (class76) this.field5931.method2176(-127, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field5933;
        byte[] var6;
        synchronized (this.field5933) {
            var6 = this.field5933.method1938(arg0, arg1, -17);
        }
        class76 var7 = new class76();
        if (var6 != null) {
            var7.method417(new class157(var6), 0);
        }
        class380 var8 = this.field5931;
        synchronized (this.field5931) {
            this.field5931.method2174(var7, (long) arg0, (byte) 127);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
    public static final void method2526(int arg0) {
        if (arg0 == 0) {
            if (class143.field1940 == 2) {
                class595.field8212[0].method3533(class99.field1197[0]);
                class595.field8212[1].method3533(class99.field1197[1]);
            } else if (class143.field1940 == 3) {
                class595.field8212[0].method3533(class99.field1197[0]);
                class595.field8212[1].method3533(class99.field1197[1]);
                class595.field8212[2].method3533(class99.field1197[2]);
            } else {
                class595.field8212[0].method3533(class99.field1197[0]);
                class595.field8212[1].method3533(class99.field1197[1]);
                class595.field8212[2].method3533(class99.field1197[2]);
                class595.field8212[3].method3533(class99.field1197[3]);
            }
        } else if (arg0 == 1) {
            if (class143.field1940 == 2) {
                class595.field8212[0].method3533(class99.field1197[2]);
            } else if (class143.field1940 == 3) {
                class595.field8212[0].method3533(class99.field1197[3]);
                class595.field8212[1].method3533(class99.field1197[4]);
            } else {
                class595.field8212[0].method3533(class99.field1197[4]);
                class595.field8212[1].method3533(class99.field1197[5]);
                class595.field8212[2].method3533(class99.field1197[6]);
            }
        } else if (arg0 == 2) {
            if (class143.field1940 == 2) {
                class595.field8212[0].method3533(class99.field1197[3]);
                return;
            }
            if (class143.field1940 == 3) {
                class595.field8212[0].method3533(class99.field1197[5]);
                return;
            }
            class595.field8212[0].method3533(class99.field1197[7]);
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V")
    public final void method2527(int arg0) {
        field5934++;
        class380 var2 = this.field5931;
        synchronized (this.field5931) {
            this.field5931.method2172(-15112);
        }
        if (arg0 != 0) {
            field5932 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)I")
    public static final int method2528(boolean arg0) {
        field5930++;
        if (class674.field9590) {
            return 6;
        }
        if (!arg0) {
            method2528(true);
        }
        if (class572.field7773 == null) {
            return 0;
        }
        int var1 = class572.field7773.field4729;
        if (class471.method2721(var1, (byte) 100)) {
            return 1;
        } else if (class198.method1280(var1, -1007)) {
            return 2;
        } else if (class125.method744(var1, 45)) {
            return 3;
        } else if (class258.method1561(var1, -106)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(II)Lbda;")
    public static final class437 method2529(int arg0, int arg1) {
        if (arg1 > -93) {
            return null;
        }
        field5924++;
        if (arg0 == 0) {
            if ((double) class672.field9558 == 3.0D) {
                return class46.field553;
            }
            if ((double) class672.field9558 == 4.0D) {
                return class545.field7458;
            }
            if ((double) class672.field9558 == 6.0D) {
                return class428.field5770;
            }
            if ((double) class672.field9558 >= 8.0D) {
                return class565.field7710;
            }
        } else if (arg0 == 1) {
            if ((double) class672.field9558 == 3.0D) {
                return class428.field5770;
            }
            if ((double) class672.field9558 == 4.0D) {
                return class565.field7710;
            }
            if ((double) class672.field9558 == 6.0D) {
                return class24.field287;
            }
            if ((double) class672.field9558 >= 8.0D) {
                return class200.field2711;
            }
        } else if (arg0 == 2) {
            if ((double) class672.field9558 == 3.0D) {
                return class24.field287;
            }
            if ((double) class672.field9558 == 4.0D) {
                return class200.field2711;
            }
            if ((double) class672.field9558 == 6.0D) {
                return class209.field2790;
            }
            if ((double) class672.field9558 >= 8.0D) {
                return class235.field3119;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lnq;ILga;)V")
    public class448(class650 arg0, int arg1, class332 arg2) {
        this.field5933 = arg2;
        if (this.field5933 == null) {
            this.field5927 = 0;
        } else {
            this.field5927 = this.field5933.method1939(0, 16);
        }
    }
}
