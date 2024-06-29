import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class132 implements Runnable {

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Lac;")
    private class198 field2377 = new class198();

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "Z")
    private boolean field2380 = false;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public int field2381 = 0;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "Ljava/lang/Thread;")
    private Thread field2379;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "Ldf;")
    public static class146 field2373 = new class146(32);

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public static int field2375 = 0;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "[[[B")
    public static byte[][][] field2376 = new byte[4][104][104];

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "Lmb;")
    public static class96 field2378 = class243.method1708("www)2wtrc", (byte) 121);

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "Lmb;")
    public static class96 field2374 = class243.method1708("Update)2Liste geladen)3", (byte) 103);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lff;")
    public static class3 field2364;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public final void method989(int arg0) {
        field2359++;
        this.field2380 = true;
        class198 var2 = this.field2377;
        synchronized (this.field2377) {
            this.field2377.notifyAll();
            if (arg0 != -1313409465) {
                field2376 = null;
            }
        }
        try {
            this.field2379.join();
        } catch (InterruptedException var3) {
        }
        this.field2379 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLib;)V")
    private final void method990(byte arg0, class53 arg1) {
        class198 var3 = this.field2377;
        synchronized (this.field2377) {
            this.field2377.method1390(arg1, -73);
            this.field2381++;
            this.field2377.notifyAll();
            if (arg0 >= -77) {
                this.method990((byte) 125, (class53) null);
            }
        }
        field2360++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLnh;I)Lib;")
    public final class53 method991(byte arg0, class276 arg1, int arg2) {
        field2361++;
        class53 var4 = new class53();
        var4.field932 = 3;
        var4.field923 = arg1;
        if (arg0 <= 50) {
            field2374 = null;
        }
        var4.field2400 = false;
        var4.field1664 = (long) arg2;
        this.method990((byte) -121, var4);
        return var4;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZLw;)I")
    public static final int method992(int arg0, boolean arg1, class107 arg2) {
        field2365++;
        if (!arg1) {
            field2364 = null;
        }
        if (arg2.field1877 == null || arg0 >= arg2.field1877.length) {
            return -2;
        }
        try {
            int[] var3 = arg2.field1877[arg0];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class168.field2958[var3[var5++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 2) {
                    var8 = class230.field3958[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class95.field1565[var3[var5++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class107 var12 = class55.method408(var11, 251234864);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class269.method1845(var13, (byte) 61).field2795 || class25.field423)) {
                        for (int var14 = 0; var14 < var12.field1873.length; var14++) {
                            if ((var13 + 1) == var12.field1873[var14]) {
                                var8 += var12.field1949[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class54.field937[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class253.field4373[class230.field3958[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class54.field937[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class236.field4047.field801;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class157.field2744[var15]) {
                            var8 += class230.field3958[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class107 var18 = class55.method408(var17, 251234864);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class269.method1845(var19, (byte) 61).field2795 || class25.field423)) {
                        for (int var20 = 0; var20 < var18.field1873.length; var20++) {
                            if ((var19 + 1) == var18.field1873[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class270.field4706;
                }
                if (var7 == 12) {
                    var8 = class186.field3252;
                }
                if (var7 == 13) {
                    int var21 = class54.field937[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class267.method1831(var23, true);
                }
                if (var7 == 18) {
                    var8 = (class236.field4047.field4511 >> 7) + class196.field3383;
                }
                if (var7 == 19) {
                    var8 = (class236.field4047.field4533 >> 7) + class225.field3832;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static void method993(int arg0) {
        field2376 = null;
        field2378 = null;
        field2374 = null;
        field2373 = null;
        if (arg0 == -1) {
            field2364 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILnh;[BI)Lib;")
    public final class53 method994(int arg0, class276 arg1, byte[] arg2, int arg3) {
        field2370++;
        if (arg3 != 0) {
            field2373 = null;
        }
        class53 var5 = new class53();
        var5.field932 = 2;
        var5.field923 = arg1;
        var5.field921 = arg2;
        var5.field1664 = (long) arg0;
        var5.field2400 = false;
        this.method990((byte) -110, var5);
        return var5;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Lrc;")
    public static final class196 method995(int arg0, int arg1) {
        class196 var2 = (class196) class15.field237.method84(arg1 - 128, (long) arg0);
        field2366++;
        if (arg1 != 0) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class214.field3685.method23(class242.method1707(arg0, true), 103, class210.method1462(arg0, (byte) -61));
            class196 var4 = new class196();
            var4.field3367 = arg0;
            if (var3 != null) {
                var4.method1374(new class239(var3), (byte) -2);
            }
            var4.method1375(arg1 - 1);
            if (!class177.field3072 && var4.field3397) {
                var4.field3387 = null;
            }
            if (var4.field3426) {
                var4.field3381 = false;
                var4.field3368 = 0;
            }
            class15.field237.method88(var4, 16518, (long) arg0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!eh", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field2380) {
            class198 var1 = this.field2377;
            class53 var2;
            synchronized (this.field2377) {
                var2 = (class53) this.field2377.method1385((byte) -120);
                if (var2 == null) {
                    try {
                        this.field2377.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field2381--;
            }
            try {
                if (var2.field932 == 2) {
                    var2.field923.method1867(var2.field921, (int) var2.field1664, (byte) -74, var2.field921.length);
                } else if (var2.field932 == 3) {
                    var2.field921 = var2.field923.method1868((int) var2.field1664, (byte) -122);
                }
            } catch (Exception var7) {
                client.method815((String) null, (byte) -114, var7);
            }
            var2.field2403 = false;
        }
        field2363++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILnh;)Lib;")
    public final class53 method996(int arg0, int arg1, class276 arg2) {
        field2371++;
        class53 var4 = new class53();
        var4.field932 = 1;
        class198 var5 = this.field2377;
        synchronized (this.field2377) {
            class53 var6 = (class53) this.field2377.method1391(44);
            while (true) {
                if (var6 == null) {
                    if (arg0 != 10284) {
                        field2369 = -128;
                    }
                    break;
                }
                if (((long) arg1) == var6.field1664 && var6.field923 == arg2 && var6.field932 == 2) {
                    var4.field921 = var6.field921;
                    var4.field2403 = false;
                    return var4;
                }
                var6 = (class53) this.field2377.method1382(-1);
            }
        }
        var4.field921 = arg2.method1868(arg1, (byte) -96);
        var4.field2400 = true;
        var4.field2403 = false;
        return var4;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)Z")
    public static final boolean method997(int arg0, int arg1) {
        if (arg0 != -1) {
            method997(-62, 125);
        }
        field2368++;
        return (arg1 & 0x3581AE1F) >> 29 != 0;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class132() {
        class263 var1 = class234.field4017.method946(5, 0, this);
        while (var1.field4605 == 0) {
            class226.method1543(10L, -738);
        }
        if (var1.field4605 == 2) {
            throw new RuntimeException();
        }
        this.field2379 = (Thread) var1.field4604;
    }
}
