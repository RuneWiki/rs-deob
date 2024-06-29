import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class134 implements Runnable {

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Lij;")
    private class242 field2427 = new class242();

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public int field2434 = 0;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "Z")
    private boolean field2433 = false;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Ljava/lang/Thread;")
    private Thread field2435;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field2421 = 0;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "Lpi;")
    public static class181 field2436;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Lkb;")
    public static class73 field2428;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static final void method1028(byte arg0) {
        field2426++;
        class180.field3211 = 0;
        int var1 = (class277.field4824.field2585 >> 7) + class29.field567;
        int var2 = (class277.field4824.field2546 >> 7) + class77.field1432;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class180.field3211 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class180.field3211 = 1;
        }
        if (class180.field3211 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class180.field3211 = 0;
        }
        int var3 = 92 / ((arg0 - 2) / 32);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lkb;BI)Lad;")
    public final class5 method1029(class73 arg0, byte arg1, int arg2) {
        field2431++;
        class5 var4 = new class5();
        var4.field85 = 1;
        class242 var5 = this.field2427;
        synchronized (this.field2427) {
            class5 var6 = (class5) this.field2427.method1658((byte) -51);
            while (true) {
                if (var6 == null) {
                    if (arg1 <= 24) {
                        method1036(-120, 111);
                    }
                    break;
                }
                if (((long) arg2) == var6.field3053 && var6.field88 == arg0 && var6.field85 == 2) {
                    var4.field80 = var6.field80;
                    var4.field1834 = false;
                    return var4;
                }
                var6 = (class5) this.field2427.method1662((byte) 56);
            }
        }
        var4.field80 = arg0.method532(false, arg2);
        var4.field1834 = false;
        var4.field1838 = true;
        return var4;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILkb;Z)Lad;")
    public final class5 method1030(int arg0, class73 arg1, boolean arg2) {
        if (!arg2) {
            return null;
        }
        field2437++;
        class5 var4 = new class5();
        var4.field85 = 3;
        var4.field3053 = (long) arg0;
        var4.field1838 = false;
        var4.field88 = arg1;
        this.method1033(var4, -104);
        return var4;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZIIIIIIII)V")
    public static final void method1031(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2432++;
        if (arg0) {
            field2425 = 66;
        }
        if (class175.method1259(arg2, (byte) 49)) {
            class113.field2144 = null;
            class124.method970(arg8, arg6, arg4, class215.field3809[arg2], -1, arg5, arg1, arg7, 1, arg3);
            if (class113.field2144 != null) {
                class124.method970(arg8, arg6, class221.field3886, class113.field2144, -1412584499, class42.field708, arg1, arg7, 1, arg3);
                class113.field2144 = null;
            }
        } else if (arg6 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class31.field592[var9] = true;
            }
        } else {
            class31.field592[arg6] = true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    public static void method1032(boolean arg0) {
        field2428 = null;
        if (!arg0) {
            method1031(false, -5, 119, 85, 74, 91, -69, -85, 124);
        }
        field2436 = null;
    }

    @OriginalMember(owner = "client!ji", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field2433) {
            class242 var1 = this.field2427;
            class5 var2;
            synchronized (this.field2427) {
                var2 = (class5) this.field2427.method1660(-119);
                if (var2 == null) {
                    try {
                        this.field2427.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field2434--;
            }
            try {
                if (var2.field85 == 2) {
                    var2.field88.method527((int) var2.field3053, (byte) 120, var2.field80, var2.field80.length);
                } else if (var2.field85 == 3) {
                    var2.field80 = var2.field88.method532(false, (int) var2.field3053);
                }
            } catch (Exception var7) {
                class272.method1835(var7, -82, (String) null);
            }
            var2.field1834 = false;
        }
        field2430++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lad;I)V")
    private final void method1033(class5 arg0, int arg1) {
        field2420++;
        class242 var3 = this.field2427;
        synchronized (this.field2427) {
            this.field2427.method1664(-113, arg0);
            this.field2434++;
            if (arg1 >= -96) {
                method1031(false, 50, -87, -51, -38, -46, -20, -58, -20);
            }
            this.field2427.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public final void method1034(int arg0) {
        this.field2433 = true;
        class242 var2 = this.field2427;
        synchronized (this.field2427) {
            this.field2427.notifyAll();
            if (arg0 != 96) {
                this.run();
            }
        }
        field2424++;
        try {
            this.field2435.join();
        } catch (InterruptedException var3) {
        }
        this.field2435 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
    public static final void method1035(int arg0, int arg1, int arg2) {
        if (arg1 != 64512) {
            method1028((byte) 80);
        }
        for (int var3 = 0; var3 < class115.field2172; var3++) {
            class194 var4 = class135.method1040((byte) -85, var3);
            if (var4 != null) {
                int var5 = var4.field3486;
                if (var5 >= 0 && !class62.field1040.method735(-1, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field3485 >= 0) {
                    int var10 = var4.field3485;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class62.field1041[class249.method1696(var12, (byte) 85, 96)];
                } else if (var5 >= 0) {
                    var6 = class62.field1041[class249.method1696(class62.field1040.method728(var5, (byte) -72), (byte) 108, 96)];
                } else if (var4.field3479 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field3479;
                    int var8 = (var7 & 0x7F) + arg0;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg2 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class62.field1041[class249.method1696(var9, (byte) 91, 96)];
                }
                class12.field188[var3 + 1] = var6;
            }
        }
        field2419++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)Z")
    public static final boolean method1036(int arg0, int arg1) {
        field2417++;
        int var2 = -84 / ((-arg1 - 43) / 59);
        return (arg0 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILmi;II)V")
    public static final void method1037(int arg0, class81 arg1, int arg2, int arg3) {
        field2423++;
        if (arg2 != 3118) {
            method1036(28, 2);
        }
        if (arg1.field2575 == arg0 && arg0 != -1) {
            class170 var4 = class119.method951(arg2 - 3118, arg0);
            int var5 = var4.field3035;
            if (var5 == 1) {
                arg1.field2579 = 0;
                arg1.field2570 = 0;
                arg1.field2528 = 0;
                arg1.field2533 = arg3;
                class146.method1084(arg1.field2546, var4, 102, arg1.field2585, class277.field4824 == arg1, arg1.field2579);
            }
            if (var5 == 2) {
                arg1.field2528 = 0;
                return;
            }
        } else if (arg0 == -1 || arg1.field2575 == -1 || class119.method951(0, arg0).field3044 >= class119.method951(0, arg1.field2575).field3044) {
            arg1.field2570 = 0;
            arg1.field2533 = arg3;
            arg1.field2575 = arg0;
            arg1.field2579 = 0;
            arg1.field2549 = arg1.field2547;
            arg1.field2528 = 0;
            if (arg1.field2575 == -1) {
                return;
            }
            class146.method1084(arg1.field2546, class119.method951(0, arg1.field2575), 96, arg1.field2585, class277.field4824 == arg1, arg1.field2579);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILkb;[B)Lad;")
    public final class5 method1038(int arg0, int arg1, class73 arg2, byte[] arg3) {
        field2418++;
        class5 var5 = new class5();
        var5.field3053 = (long) arg1;
        if (arg0 > -68) {
            return null;
        }
        var5.field85 = 2;
        var5.field80 = arg3;
        var5.field1838 = false;
        var5.field88 = arg2;
        this.method1033(var5, -118);
        return var5;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class134() {
        class165 var1 = class8.field130.method36(this, -96, 5);
        while (var1.field2925 == 0) {
            class187.method1360((byte) -89, 10L);
        }
        if (var1.field2925 == 2) {
            throw new RuntimeException();
        }
        this.field2435 = (Thread) var1.field2921;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)Lvc;")
    public static final class156 method1039(boolean arg0, int arg1) {
        class156 var2 = (class156) class216.field3818.method86(7961, (long) arg1);
        field2415++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class8.field123.method1293(arg1, 1, (byte) -93);
        class156 var4 = new class156();
        if (var3 != null) {
            var4.method1151(arg1, new class75(var3), 0);
        }
        if (!arg0) {
            method1037(-84, (class81) null, -3, 66);
        }
        class216.field3818.method80(var4, (long) arg1, (byte) 67);
        return var4;
    }
}
