import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class61 extends class364 {

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field979 = new Object();

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    private int field985 = 0;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    private int field986 = 0;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "[Lqe;")
    private class147[] field992 = new class147[0];

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "Ljl;")
    public static class391 field981 = new class391();

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "Lfg;")
    public static class18 field984 = new class18(30);

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "Z")
    public static boolean field991 = false;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "[[B")
    public static byte[][] field983;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lsk;B)V")
    public final void method463(class168 arg0, byte arg1) {
        ++field977;
        Object var3 = this.field979;
        synchronized (this.field979) {
            if (arg1 != -4) {
                field991 = true;
            }
            super.field5192[super.field5189] = 21;
            super.field5180[super.field5189] = arg0;
            ++super.field5189;
            ++super.field5186;
            if (~super.field5189 <= -5001) {
                super.field5189 = 0;
            }
            ++super.field5179;
            if (~this.field985 < -1) {
                this.field979.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
    public final void method464(int arg0, int arg1) {
        ++field987;
        Object var3 = this.field979;
        synchronized (this.field979) {
            super.field5192[super.field5189] = (byte) arg1;
            ++super.field5189;
            ++super.field5186;
            if (~super.field5189 <= -5001) {
                super.field5189 = 0;
            }
            ++super.field5179;
            if (~this.field985 < -1) {
                this.field979.notifyAll();
            }
        }
        if (arg0 != 3797) {
            this.method464(-88, 66);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)V")
    public static final void method465(int arg0, int arg1) {
        ++field980;
        class42.field637 = arg1;
        class18 var2 = class39.field600;
        synchronized (class39.field600) {
            if (arg0 != -3) {
                field981 = null;
            }
            class39.field600.method106((byte) -118);
        }
        class18 var3 = class180.field2678;
        synchronized (class180.field2678) {
            class180.field2678.method106((byte) -114);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public final void method466(int arg0) {
        int var2 = -100 % ((47 - arg0) / 53);
        try {
            Object var3 = this.field979;
            synchronized (this.field979) {
                while (~super.field5186 != -1) {
                    this.field979.wait();
                }
            }
        } catch (Exception var5) {
        }
        ++field978;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
    public final void method467(int arg0) {
        ++field975;
        Object var2 = this.field979;
        synchronized (this.field979) {
            if (arg0 >= -86) {
                field981 = null;
            }
            for (int var3 = 0; var3 < this.field986; ++var3) {
                if (~this.field992[var3].field2274 <= -1) {
                    this.method470(2, this.field992[var3].field2274);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lsk;I)V")
    public final void method468(class168 arg0, int arg1) {
        Object var3 = this.field979;
        synchronized (this.field979) {
            super.field5192[super.field5189] = 20;
            super.field5180[super.field5189] = arg0;
            ++super.field5189;
            ++super.field5186;
            if (super.field5189 >= arg1) {
                super.field5189 = 0;
            }
            ++super.field5179;
            if (~this.field985 < -1) {
                this.field979.notifyAll();
            }
        }
        ++field976;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILqe;)V")
    public final void method469(int arg0, class147 arg1) {
        ++field993;
        boolean var3 = false;
        boolean var23 = false;
        label384: {
            try {
                var23 = true;
                boolean var4 = false;
                if (arg0 == -5001) {
                    float var5 = 0.0F;
                    Object var6 = this.field979;
                    byte var7;
                    synchronized (this.field979) {
                        while (super.field5179 == 0) {
                            ++this.field985;
                            this.field979.wait();
                            --this.field985;
                        }
                        var7 = super.field5192[super.field5190];
                        if (arg1.field2274 < 0) {
                            if (var7 >= 0 && ~var7 >= -4) {
                                var3 = true;
                            }
                        } else if (~var7 > -1 || ~var7 < -4) {
                            var3 = true;
                        }
                        if (var3) {
                            arg1.field4920 = super.field5180[super.field5190];
                            var5 = super.field5193[super.field5190];
                            super.field5180[super.field5190] = null;
                            ++super.field5190;
                            --super.field5179;
                            if (~super.field5190 <= -5001) {
                                super.field5190 = 0;
                            }
                        }
                    }
                    if (var3) {
                        if (~arg1.field2274 > -1) {
                            if (var7 >= 0) {
                                if (~var7 >= -4) {
                                    arg1.field2274 = var7;
                                    class73.field1222.method758(var7);
                                    var23 = false;
                                } else {
                                    var23 = false;
                                }
                            } else {
                                var23 = false;
                            }
                        } else if (var7 == 21) {
                            class391.method2490(arg1, (class168) arg1.field4920);
                            var23 = false;
                        } else if (~var7 != -21) {
                            if (~var7 <= -31 && ~var7 >= -34) {
                                class73.field1222.method693(3000.0F, var5 * 1.5F);
                                ((class126) arg1.field4920).method812(class415.field6013, class71.field1203, class46.field755, class207.field3035, var7 + -30 == 0);
                                var23 = false;
                            } else if (var7 >= 40 && ~var7 >= -44) {
                                class73.field1222.method693(3000.0F, var5 * 1.5F);
                                ((class126) arg1.field4920).method812(class415.field6013, class71.field1203, class46.field755, class15.field229, ~(var7 - 40) == -1);
                                var23 = false;
                            } else if (~var7 != -23) {
                                if (var7 == 23) {
                                    class73.field1222.method761();
                                    var23 = false;
                                } else if (var7 != 24) {
                                    if (~var7 <= -11) {
                                        if (~var7 >= -14) {
                                            class73.field1222.method701(arg1.field2274);
                                            arg1.field2274 = -1;
                                            var23 = false;
                                        } else {
                                            var23 = false;
                                        }
                                    } else {
                                        var23 = false;
                                    }
                                } else {
                                    class73.field1222.method755(0, (class59[]) null);
                                    var23 = false;
                                }
                            } else {
                                class73.field1222.method768(-1, 1583160, 40);
                                var23 = false;
                            }
                        } else {
                            class168 var8 = (class168) arg1.field4920;
                            if (var8.field2505 != null) {
                                var8.field2505.method137(arg0 ^ -5089, class73.field1222);
                            }
                            if (var8.field2510 != null) {
                                var8.field2510.method137(-110, class73.field1222);
                            }
                            if (var8.field2506 != null) {
                                var8.field2506.method137(-94, class73.field1222);
                            }
                            if (var8.field2507 != null) {
                                var8.field2507.method137(-88, class73.field1222);
                            }
                            if (var8.field2501 != null) {
                                var8.field2501.method137(-125, class73.field1222);
                            }
                            for (class36 var9 = var8.field2488; var9 != null; var9 = var9.field505) {
                                var9.field511.method137(-83, class73.field1222);
                            }
                            var23 = false;
                        }
                    } else {
                        Thread.yield();
                        var23 = false;
                    }
                    break label384;
                }
                Object var10000 = null;
                var23 = false;
            } catch (Exception var28) {
                var23 = false;
                break label384;
            } finally {
                if (var23) {
                    Object var15 = null;
                    if (var3) {
                        Object var16 = this.field979;
                        synchronized (this.field979) {
                            --super.field5186;
                            if (super.field5186 == 0) {
                                this.field979.notifyAll();
                            }
                        }
                    }
                }
            }
            if (var3) {
                Object var12 = this.field979;
                synchronized (this.field979) {
                    --super.field5186;
                    if (super.field5186 == 0) {
                        this.field979.notifyAll();
                    }
                }
            }
            return;
        }
        Object var13 = null;
        if (var3) {
            Object var14 = this.field979;
            synchronized (this.field979) {
                --super.field5186;
                if (super.field5186 == 0) {
                    this.field979.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(II)V")
    private final void method470(int arg0, int arg1) {
        super.field5192[super.field5189] = (byte) (arg1 + 10);
        ++field973;
        ++super.field5189;
        ++super.field5186;
        if (super.field5189 >= 5000) {
            super.field5189 = 0;
        }
        if (arg0 != 2) {
            this.method469(-78, (class147) null);
        }
        ++super.field5179;
        if (~this.field985 < -1) {
            Object var3 = this.field979;
            synchronized (this.field979) {
                this.field979.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
    public static void method471(int arg0) {
        field984 = null;
        if (arg0 != 29714) {
            method471(-3);
        }
        field981 = null;
        field983 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(FBIZLnc;)V")
    public final void method472(float arg0, byte arg1, int arg2, boolean arg3, class126 arg4) {
        int var6 = -110 % ((15 - arg1) / 37);
        ++field974;
        Object var7 = this.field979;
        synchronized (this.field979) {
            super.field5192[super.field5189] = (byte) (arg3 ? arg2 + 40 : arg2 + 30);
            super.field5180[super.field5189] = arg4;
            super.field5193[super.field5189] = arg0;
            ++super.field5189;
            if (~super.field5189 <= -5001) {
                super.field5189 = 0;
            }
            ++super.field5186;
            ++super.field5179;
            if (this.field985 > 0) {
                this.field979.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V")
    public final void method473(int arg0, byte arg1) {
        ++field989;
        int var3 = 0;
        Object var4 = this.field979;
        synchronized (this.field979) {
            if (arg1 == -66) {
                if (this.field986 == arg0) {
                    for (int var5 = 0; ~var5 > ~this.field986; ++var5) {
                        this.method474(true, var3++);
                    }
                } else {
                    for (int var6 = 0; this.field986 > var6; ++var6) {
                        this.field992[var6].method1152(12);
                    }
                    this.field986 = arg0;
                    this.field992 = new class147[this.field986];
                    for (int var7 = 0; this.field986 > var7; ++var7) {
                        this.field992[var7] = new class147(this);
                        this.field992[var7].method1154(12);
                        this.method474(true, var3++);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)V")
    private final void method474(boolean arg0, int arg1) {
        super.field5192[super.field5189] = (byte) arg1;
        ++field982;
        if (!arg0) {
            field984 = null;
        }
        ++super.field5189;
        if (super.field5189 >= 5000) {
            super.field5189 = 0;
        }
        ++super.field5179;
        ++super.field5186;
        if (this.field985 > 0) {
            Object var3 = this.field979;
            synchronized (this.field979) {
                this.field979.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILsk;)V")
    public final void method475(int arg0, class168 arg1) {
        ++field990;
        Object var3 = this.field979;
        synchronized (this.field979) {
            --super.field5190;
            if (~super.field5190 > -1) {
                super.field5190 = 4999;
            }
            super.field5192[super.field5190] = 21;
            super.field5180[super.field5190] = arg1;
            ++super.field5179;
            ++super.field5186;
            if (~this.field985 < -1) {
                this.field979.notifyAll();
            }
            if (arg0 < 10) {
                field981 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)I")
    public static final int method476(int arg0, int arg1, int arg2, int arg3) {
        ++field988;
        int var4 = arg1 & 3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (~var4 == -3) {
            return -arg2 + 1023;
        } else {
            if (arg3 <= 101) {
                field983 = null;
            }
            return -arg0 + 1023;
        }
    }
}
