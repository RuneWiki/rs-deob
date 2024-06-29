import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class137 implements Runnable {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lwa;")
    public static class200 field2569 = null;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "[I")
    public static int[] field2573 = new int[256];

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lai;")
    public static class10 field2575 = class44.method278("::", 102);

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lai;")
    private static class10 field2571 = class44.method278("The server is being updated)3", -72);

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lai;")
    public static class10 field2580 = field2571;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Lai;")
    public static class10 field2579 = class44.method278("Ausw-=hlen", 93);

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lai;")
    public static class10 field2577 = class44.method278("welle:", 96);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Lmb;")
    public static class111 field2581;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)V")
    public static final void method930(boolean arg0, int arg1) {
        if (arg1 >= -74) {
            field2575 = null;
        }
        field2576++;
        class67.method441(-1);
        class205.field3976++;
        if (class205.field3976 < 50 && !arg0) {
            return;
        }
        class205.field3976 = 0;
        if (class172.field3322 || class188.field3593 == null) {
            return;
        }
        class76.field1323.method635((byte) -66, 87);
        try {
            class188.field3593.method557(class76.field1323.field2170, class76.field1323.field2160, 0, 124);
            class76.field1323.field2170 = 0;
        } catch (IOException var2) {
            class172.field3322 = true;
        }
        class76.field1316++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)Z")
    public static final boolean method931(int arg0, byte arg1) {
        if (arg1 <= 77) {
            return false;
        } else {
            field2572++;
            return (-arg0 & arg0) == arg0;
        }
    }

    @OriginalMember(owner = "client!pa", name = "run", descriptor = "()V")
    public final void run() {
        field2578++;
        try {
            while (true) {
                class192 var1 = class30.field460;
                class82 var2;
                synchronized (class30.field460) {
                    var2 = (class82) class30.field460.method1223(true);
                }
                if (var2 == null) {
                    class172.method1130(100L, (byte) -79);
                    Object var6 = class149.field2871;
                    synchronized (class149.field2871) {
                        if (class134.field2507 <= 1) {
                            class134.field2507 = 0;
                            class149.field2871.notifyAll();
                            return;
                        }
                        class134.field2507--;
                    }
                } else {
                    if (var2.field1441 == 0) {
                        var2.field1439.method536((int) var2.field2291, var2.field1440, var2.field1440.length, 0);
                        class192 var3 = class30.field460;
                        synchronized (class30.field460) {
                            var2.method848(false);
                        }
                    } else if (var2.field1441 == 1) {
                        var2.field1440 = var2.field1439.method537((int) var2.field2291, -126);
                        class192 var4 = class30.field460;
                        synchronized (class30.field460) {
                            class131.field2484.method1230(var2, true);
                        }
                    }
                    Object var5 = class149.field2871;
                    synchronized (class149.field2871) {
                        if (class134.field2507 <= 1) {
                            class134.field2507 = 0;
                            class149.field2871.notifyAll();
                            return;
                        }
                        class134.field2507 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class109.method700(var17, null, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method932(int arg0) {
        field2571 = null;
        field2577 = null;
        if (arg0 != 19246) {
            field2577 = null;
        }
        field2575 = null;
        field2579 = null;
        field2573 = null;
        field2569 = null;
        field2580 = null;
        field2581 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Z")
    public static final boolean method933(int arg0, int arg1) {
        if (arg0 != 0) {
            field2569 = null;
        }
        field2570++;
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)Z")
    public static final boolean method934(int arg0) {
        field2574++;
        long var1 = class80.method491(2);
        int var3 = (int) (var1 - class99.field1820);
        if (var3 > 200) {
            var3 = 200;
        }
        if (arg0 != -1) {
            method931(-41, (byte) 88);
        }
        class99.field1820 = var1;
        class116.field2234 += var3;
        if (class188.field3588 == 0 && class182.field3471 == 0 && class101.field1900 == 0 && class89.field1570 == 0) {
            return true;
        } else if (class20.field297 == null) {
            return false;
        } else {
            try {
                if (class116.field2234 > 30000) {
                    throw new IOException();
                }
                while (class182.field3471 < 20 && class89.field1570 > 0) {
                    class194 var4 = (class194) class176.field3374.method212((byte) -120);
                    class114 var5 = new class114(4);
                    var5.method781(0, 1);
                    var5.method805((int) var4.field2291, (byte) -128);
                    class20.field297.method557(4, var5.field2160, 0, 125);
                    class170.field3287.method214(var4, (byte) 118, var4.field2291);
                    class89.field1570--;
                    class182.field3471++;
                }
                while (class188.field3588 < 20 && class101.field1900 > 0) {
                    class194 var6 = (class194) class42.field697.method895(9195);
                    class114 var7 = new class114(4);
                    var7.method781(0, 0);
                    var7.method805((int) var6.field2291, (byte) -124);
                    class20.field297.method557(4, var7.field2160, 0, 117);
                    var6.method1247(0);
                    class97.field1792.method214(var6, (byte) 127, var6.field2291);
                    class188.field3588++;
                    class101.field1900--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class20.field297.method551(false);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class116.field2234 = 0;
                    byte var10 = 0;
                    if (class154.field2983 == null) {
                        var10 = 8;
                    } else if (class68.field1194 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class30.field468.field2170;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class20.field297.method556((byte) -88, var11, class30.field468.field2160, class30.field468.field2170);
                        if (class124.field2374 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class30.field468.field2160[class30.field468.field2170 + var12] = (byte) class34.method227(class30.field468.field2160[class30.field468.field2170 + var12], class124.field2374);
                            }
                        }
                        class30.field468.field2170 += var11;
                        if (var10 > class30.field468.field2170) {
                            break;
                        }
                        if (class154.field2983 == null) {
                            class30.field468.field2170 = 0;
                            int var13 = class30.field468.method767(true);
                            int var14 = class30.field468.method762((byte) 86);
                            long var15 = (long) ((var13 << 16) + var14);
                            int var17 = class30.field468.method767(true);
                            int var18 = class30.field468.method761(255);
                            class194 var19 = (class194) class170.field3287.method213(120, var15);
                            class108.field1995 = true;
                            if (var19 == null) {
                                var19 = (class194) class97.field1792.method213(121, var15);
                                class108.field1995 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class154.field2983 = var19;
                            int var20 = var17 == 0 ? 5 : 9;
                            class100.field1872 = new class114(class154.field2983.field3695 + var18 + var20);
                            class100.field1872.method781(0, var17);
                            class100.field1872.method786(var18, (byte) -55);
                            class68.field1194 = 8;
                            class30.field468.field2170 = 0;
                        } else if (class68.field1194 == 0) {
                            if (class30.field468.field2160[0] == -1) {
                                class68.field1194 = 1;
                                class30.field468.field2170 = 0;
                            } else {
                                class154.field2983 = null;
                            }
                        }
                    } else {
                        int var21 = class100.field1872.field2160.length - class154.field2983.field3695;
                        int var22 = 512 - class68.field1194;
                        if (var22 > var21 - class100.field1872.field2170) {
                            var22 = var21 - class100.field1872.field2170;
                        }
                        if (var9 < var22) {
                            var22 = var9;
                        }
                        class20.field297.method556((byte) -114, var22, class100.field1872.field2160, class100.field1872.field2170);
                        if (class124.field2374 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class100.field1872.field2160[class100.field1872.field2170 + var23] = (byte) class34.method227(class100.field1872.field2160[class100.field1872.field2170 + var23], class124.field2374);
                            }
                        }
                        class100.field1872.field2170 += var22;
                        class68.field1194 += var22;
                        if (class100.field1872.field2170 == var21) {
                            if (class154.field2983.field2291 == 16711935L) {
                                class117.field2266 = class100.field1872;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class111 var25 = class2.field9[var24];
                                    if (var25 != null) {
                                        class117.field2266.field2170 = var24 * 8 + 5;
                                        int var26 = class117.field2266.method761(255);
                                        int var27 = class117.field2266.method761(255);
                                        var25.method714(var26, 126, var27);
                                    }
                                }
                            } else {
                                class39.field658.reset();
                                class39.field658.update(class100.field1872.field2160, 0, var21);
                                int var28 = (int) class39.field658.getValue();
                                if (class154.field2983.field3691 != var28) {
                                    try {
                                        class20.field297.method552(arg0 - 5033);
                                    } catch (Exception var30) {
                                    }
                                    class44.field723++;
                                    class124.field2374 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class20.field297 = null;
                                    return false;
                                }
                                class64.field1066 = 0;
                                class44.field723 = 0;
                                class154.field2983.field3688.method717(class100.field1872.field2160, class108.field1995, (class154.field2983.field2291 & 0xFF0000L) == 16711680L, (byte) -126, (int) (class154.field2983.field2291 & 0xFFFFL));
                            }
                            class154.field2983.method848(false);
                            if (class108.field1995) {
                                class182.field3471--;
                            } else {
                                class188.field3588--;
                            }
                            class154.field2983 = null;
                            class68.field1194 = 0;
                            class100.field1872 = null;
                        } else {
                            if (class68.field1194 != 512) {
                                break;
                            }
                            class68.field1194 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class20.field297.method552(arg0 - 5033);
                } catch (Exception var29) {
                }
                class20.field297 = null;
                class64.field1066++;
                return false;
            }
        }
    }
}
