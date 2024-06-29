import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class64 extends class503 {

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "Ljava/lang/Object;")
    private Object field1017 = new Object();

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
    private int field1021 = 0;

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "[Lto;")
    private class174[] field1022 = new class174[0];

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
    private int field1024 = 0;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "Z")
    public static boolean field1015 = true;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "Lpn;")
    public static class49 field1006 = new class49(14, 3);

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "[[I")
    public static int[][] field1023 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "[I")
    public static int[] field1002;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lto;I)V", line = 7)
    public final void method428(class174 arg0, int arg1) {
        ++field1005;
        boolean var3 = false;
        boolean var25 = false;
        label385: {
            try {
                try {
                    label386: {
                        var25 = true;
                        boolean var4 = false;
                        float var5 = 0.0F;
                        Object var6 = this.field1017;
                        byte var7;
                        synchronized (this.field1017) {
                            if (arg1 >= -22) {
                                Object var10000 = null;
                                var25 = false;
                                break label386;
                            }
                            while (super.field7301 == 0) {
                                ++this.field1021;
                                this.field1017.wait();
                                --this.field1021;
                            }
                            var7 = super.field7302[super.field7299];
                            if (arg0.field2684 < 0) {
                                if (~var7 <= -1 && ~var7 >= -4) {
                                    var3 = true;
                                }
                            } else if (~var7 > -1 || var7 > 3) {
                                var3 = true;
                            }
                            if (var3) {
                                arg0.field7486 = super.field7308[super.field7299];
                                var5 = super.field7306[super.field7299];
                                super.field7308[super.field7299] = null;
                                ++super.field7299;
                                --super.field7301;
                                if (super.field7299 >= 5000) {
                                    super.field7299 = 0;
                                }
                            }
                        }
                        if (!var3) {
                            Thread.yield();
                            var25 = false;
                        } else if (~arg0.field2684 > -1) {
                            if (var7 >= 0) {
                                if (var7 <= 3) {
                                    arg0.field2684 = var7;
                                    class319.field4840.method549(var7);
                                    var25 = false;
                                } else {
                                    var25 = false;
                                }
                            } else {
                                var25 = false;
                            }
                        } else if (var7 == 21) {
                            class242.method1627(arg0, (class281) arg0.field7486);
                            var25 = false;
                        } else if (var7 == 20) {
                            class281 var8 = (class281) arg0.field7486;
                            if (var8.field4380 != null) {
                                var8.field4380.method98(31203, class319.field4840);
                            }
                            if (var8.field4390 != null) {
                                var8.field4390.method98(31203, class319.field4840);
                            }
                            if (var8.field4376 != null) {
                                var8.field4376.method98(31203, class319.field4840);
                            }
                            if (var8.field4389 != null) {
                                var8.field4389.method98(31203, class319.field4840);
                            }
                            if (var8.field4371 != null) {
                                var8.field4371.method98(31203, class319.field4840);
                            }
                            for (class21 var9 = var8.field4381; var9 != null; var9 = var9.field235) {
                                var9.field240.method98(31203, class319.field4840);
                            }
                            var25 = false;
                        } else if (~var7 <= -31 && ~var7 >= -34) {
                            class319.field4840.method606(3000.0F, var5 * 1.5F);
                            ((class11) arg0.field7486).method67(class144.field2126, class29.field323, class16.field166, class390.field5715, var7 + -30 == 0);
                            var25 = false;
                        } else if (var7 >= 40 && ~var7 >= -44) {
                            class319.field4840.method606(3000.0F, var5 * 1.5F);
                            ((class11) arg0.field7486).method67(class144.field2126, class29.field323, class16.field166, class63.field999, var7 - 40 == 0);
                            var25 = false;
                        } else if (var7 == 22) {
                            class319.field4840.method511(-1, 1583160, 40, 127);
                            var25 = false;
                        } else if (~var7 == -24) {
                            class319.field4840.method585();
                            var25 = false;
                        } else if (var7 == 24) {
                            class319.field4840.method519(0, (class344[]) null);
                            var25 = false;
                        } else if (~var7 <= -11) {
                            if (var7 <= 13) {
                                class319.field4840.method525(arg0.field2684);
                                arg0.field2684 = -1;
                                var25 = false;
                            } else {
                                var25 = false;
                            }
                        } else {
                            var25 = false;
                        }
                    }
                } catch (Exception var30) {
                    var25 = false;
                }
                break label385;
            } finally {
                if (var25) {
                    Object var17 = null;
                    if (var3) {
                        Object var18 = this.field1017;
                        synchronized (this.field1017) {
                            --super.field7294;
                            if (super.field7294 == 0) {
                                this.field1017.notifyAll();
                            }
                        }
                    }
                }
            }
            if (var3) {
                Object var14 = this.field1017;
                synchronized (this.field1017) {
                    --super.field7294;
                    if (super.field7294 == 0) {
                        this.field1017.notifyAll();
                    }
                }
            }
            return;
        }
        Object var15 = null;
        if (var3) {
            Object var16 = this.field1017;
            synchronized (this.field1017) {
                --super.field7294;
                if (super.field7294 == 0) {
                    this.field1017.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)V", line = 177)
    public static void method429(byte arg0) {
        field1023 = null;
        field1002 = null;
        field1006 = null;
        if (arg0 < 63) {
            method433(60);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 189)
    public final void method269(int arg0) {
        ++field1016;
        try {
            Object var2 = this.field1017;
            synchronized (this.field1017) {
                if (arg0 <= 30) {
                    this.field1022 = null;
                }
                while (super.field7294 != 0) {
                    this.field1017.wait();
                }
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB[JI[Ljava/lang/Object;)V", line = 214)
    public static final void method430(int arg0, byte arg1, long[] arg2, int arg3, Object[] arg4) {
        if (arg1 > -54) {
            method433(-124);
        }
        ++field1019;
        if (arg3 > arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var9;
            int var10 = var7 != Long.MAX_VALUE ? 1 : 0;
            for (int var11 = arg0; ~arg3 < ~var11; ++var11) {
                if (~arg2[var11] > ~(var7 - -((long) (var11 & var10)))) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var9;
            method430(arg0, (byte) -65, arg2, var6 + -1, arg4);
            method430(var6 + 1, (byte) -96, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lya;IIZF)V", line = 271)
    public final void method268(class11 arg0, int arg1, int arg2, boolean arg3, float arg4) {
        Object var6 = this.field1017;
        synchronized (this.field1017) {
            super.field7302[super.field7307] = (byte) (!arg3 ? arg2 + 30 : arg2 + 40);
            super.field7308[super.field7307] = arg0;
            super.field7306[super.field7307] = arg4;
            ++super.field7307;
            ++super.field7294;
            if (~super.field7307 <= -5001) {
                super.field7307 = 0;
            }
            ++super.field7301;
            if (arg1 > ~this.field1021) {
                this.field1017.notifyAll();
            }
        }
        ++field1014;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(BI)V", line = 294)
    private final void method431(byte arg0, int arg1) {
        super.field7302[super.field7307] = (byte) (arg1 + 10);
        int var3 = -32 / ((arg0 - 47) / 62);
        ++field1009;
        ++super.field7307;
        ++super.field7294;
        if (super.field7307 >= 5000) {
            super.field7307 = 0;
        }
        ++super.field7301;
        if (~this.field1021 < -1) {
            Object var4 = this.field1017;
            synchronized (this.field1017) {
                this.field1017.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILvt;)V", line = 319)
    public final void method276(int arg0, class281 arg1) {
        Object var3 = this.field1017;
        synchronized (this.field1017) {
            super.field7302[super.field7307] = 20;
            super.field7308[super.field7307] = arg1;
            ++super.field7307;
            ++super.field7301;
            ++super.field7294;
            if (super.field7307 >= 5000) {
                super.field7307 = 0;
            }
            if (arg0 > ~this.field1021) {
                this.field1017.notifyAll();
            }
        }
        ++field1004;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)V", line = 342)
    public final void method267(byte arg0, int arg1) {
        ++field1011;
        Object var3 = this.field1017;
        synchronized (this.field1017) {
            super.field7302[super.field7307] = (byte) arg1;
            ++super.field7307;
            ++super.field7294;
            ++super.field7301;
            if (super.field7307 >= 5000) {
                super.field7307 = 0;
            }
            if (arg0 > -47) {
                method432(35, 91, (byte) -76, 50, -111, 101, true, 11, -21);
            }
            if (this.field1021 > 0) {
                this.field1017.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lvt;I)V", line = 368)
    public final void method274(class281 arg0, int arg1) {
        ++field1010;
        int var3 = -69 / ((arg1 - 33) / 42);
        Object var4 = this.field1017;
        synchronized (this.field1017) {
            --super.field7299;
            if (~super.field7299 > -1) {
                super.field7299 = 4999;
            }
            super.field7302[super.field7299] = 21;
            super.field7308[super.field7299] = arg0;
            ++super.field7301;
            ++super.field7294;
            if (this.field1021 > 0) {
                this.field1017.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V", line = 391)
    public final void method270(int arg0, int arg1) {
        if (arg1 == 1) {
            ++field1012;
            int var3 = 0;
            Object var4 = this.field1017;
            synchronized (this.field1017) {
                if (this.field1024 == arg0) {
                    for (int var5 = 0; var5 < this.field1024; ++var5) {
                        this.method434((byte) 114, var3++);
                    }
                } else {
                    for (int var6 = 0; ~this.field1024 < ~var6; ++var6) {
                        this.field1022[var6].method1240(true);
                    }
                    this.field1024 = arg0;
                    this.field1022 = new class174[this.field1024];
                    for (int var7 = 0; this.field1024 > var7; ++var7) {
                        this.field1022[var7] = new class174(this);
                        this.field1022[var7].method1239(256);
                        this.method434((byte) 114, var3++);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 440)
    public final void method273(byte arg0) {
        Object var2 = this.field1017;
        synchronized (this.field1017) {
            if (arg0 >= -23) {
                this.field1017 = null;
            }
            int var3 = 0;
            while (true) {
                if (this.field1024 <= var3) {
                    break;
                }
                if (~this.field1022[var3].field2684 <= -1) {
                    this.method431((byte) 123, this.field1022[var3].field2684);
                }
                ++var3;
            }
        }
        ++field1013;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBIIIZII)Z", line = 463)
    public static final boolean method432(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        ++field1018;
        int var9 = class116.field1781.field7654[0];
        int var10 = class116.field1781.field7653[0];
        if (var9 >= 0 && class338.field5076 > var9 && var10 >= 0 && var10 < class250.field4077) {
            if (arg4 >= 0 && ~class338.field5076 < ~arg4 && ~arg7 <= -1 && ~arg7 > ~class250.field4077) {
                int var11 = 109 % ((9 - arg2) / 41);
                int var12 = class22.method137(arg0, var10, arg4, arg7, class106.field1619, var9, arg8, arg5, arg6, 99999999, arg3, arg1, class463.field6857[class116.field1781.field1274], class338.field5073, class116.field1781.method3045(0));
                if (~var12 > -2) {
                    return false;
                } else {
                    class521.field7646 = class338.field5073[var12 + -1];
                    class488.field7136 = class106.field1619[var12 + -1];
                    class339.field5081 = false;
                    class442.method2731(-113);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 498)
    public static final void method433(int arg0) {
        class314.field4777.method2146(65);
        ++field1007;
        class118.field1813.method889(false);
        class306.field4682.method1954(true);
        class247.field3693.method2282((byte) -123);
        class462.field6842.method1232(-125);
        class300.field4608.method2083((byte) 56);
        class393.field5735.method1535(16);
        class232.field3490.method2630((byte) 45);
        class529.field7739.method2098(63);
        class390.field5714.method50(-29654);
        class315.field4808.method152(76);
        class384.field5647.method771(false);
        class455.field6765.method2183((byte) 126);
        class389.field5702.method1827(20);
        class264.field4225.method2793(-2198);
        class335.field5044.method1981(true);
        class436.field6496.method2985(true);
        class61.field958.method201(true);
        class256.field4117.method3109((byte) 92);
        class420.field6176.method928(6297);
        class355.method2268(true);
        class364.method2327(0);
        class414.method2595((byte) 114);
        if (class62.field991 != class287.field4471) {
            for (int var1 = 0; var1 < class405.field5981.length; ++var1) {
                class405.field5981[var1] = null;
            }
            class311.field4749 = 0;
        }
        class286.method1919(0);
        class295.method1967(false);
        class321.method2118((byte) -98);
        class265.method1841((byte) 104);
        class80.method711(1);
        class152.field2295.method1637((byte) 13);
        class376.field5542.method580();
        class298.field4580.method3007(56);
        class344.method2213(true);
        class368.field5421.method728((byte) -83);
        if (arg0 > -67) {
            method433(2);
        }
        class415.field6098.method728((byte) -100);
        class103.field1596.method728((byte) 122);
        class397.field5860.method728((byte) 119);
        class365.field5379.method728((byte) -121);
        class130.field1931.method728((byte) 119);
        class417.field6135.method728((byte) 119);
        class59.field910.method728((byte) 126);
        class510.field7431.method728((byte) -60);
        class489.field7145.method728((byte) 124);
        class274.field4307.method728((byte) -82);
        class1.field8.method728((byte) 124);
        class151.field2261.method728((byte) 119);
        class312.field4754.method728((byte) 126);
        class144.field2122.method728((byte) -115);
        class470.field6896.method728((byte) -14);
        class472.field6932.method728((byte) -60);
        class105.field1610.method728((byte) 119);
        class83.field1337.method728((byte) 6);
        class93.field1495.method728((byte) 119);
        class55.field836.method728((byte) 127);
        class12.field133.method728((byte) 123);
        class1.field11.method728((byte) -47);
        class531.field7764.method728((byte) -126);
        class451.field6712.method728((byte) -83);
        class486.field7121.method728((byte) 124);
        class414.field6094.method728((byte) -109);
        class262.field4175.method728((byte) -80);
        class93.field1493.method728((byte) -8);
        class454.field6750.method728((byte) -113);
        class81.field1329.method1637((byte) 13);
        class531.field7750.method1637((byte) 13);
        class90.field1445.method1637((byte) 13);
        class194.field3030.method1637((byte) 13);
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(BI)V", line = 588)
    private final void method434(byte arg0, int arg1) {
        ++field1020;
        super.field7302[super.field7307] = (byte) arg1;
        ++super.field7307;
        ++super.field7301;
        if (arg0 != 114) {
            this.method431((byte) 1, 81);
        }
        if (~super.field7307 <= -5001) {
            super.field7307 = 0;
        }
        ++super.field7294;
        if (~this.field1021 < -1) {
            Object var3 = this.field1017;
            synchronized (this.field1017) {
                this.field1017.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(ILvt;)V", line = 619)
    public final void method278(int arg0, class281 arg1) {
        Object var3 = this.field1017;
        synchronized (this.field1017) {
            super.field7302[super.field7307] = 21;
            super.field7308[super.field7307] = arg1;
            ++super.field7307;
            ++super.field7301;
            ++super.field7294;
            if (~super.field7307 <= -5001) {
                super.field7307 = 0;
            }
            if (this.field1021 > arg0) {
                this.field1017.notifyAll();
            }
        }
        ++field1008;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLjava/lang/String;)J", line = 647)
    public static final long method435(boolean arg0, String arg1) {
        ++field1003;
        int var2 = arg1.length();
        if (arg0) {
            return 41L;
        } else {
            long var3 = 0L;
            for (int var5 = 0; var5 < var2; ++var5) {
                var3 = (long) arg1.charAt(var5) + (var3 << 5) + -var3;
            }
            return var3;
        }
    }
}
