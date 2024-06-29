import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class90 implements Runnable {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lo;")
    private class204 field1692 = new class204();

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public int field1706 = 0;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Z")
    private boolean field1709 = false;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "Ljava/lang/Thread;")
    private Thread field1712;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lud;")
    public static class279 field1696 = class130.method1024("<col=ff7000>", 255);

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field1707 = 0;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[Llg;")
    public static class123[] field1702 = new class123[4];

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field1703 = 0;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Lud;")
    private static class279 field1710 = class130.method1024("Choose Option", 255);

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lud;")
    public static class279 field1697 = field1710;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lok;")
    public static class149 field1695;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lvh;Z)V", line = 7)
    public static final void method771(class53 arg0, boolean arg1) {
        for (int var2 = 0; var2 < class57.field1212; var2++) {
            int var3 = arg0.method472((byte) 73);
            int var4 = arg0.method468(28214);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class251.field4485[var3] != null) {
                class251.field4485[var3].field2585 = var4;
            }
        }
        field1694++;
        if (!arg1) {
            field1703 = 37;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 404)
    public class90() {
        class206 var1 = class110.field2022.method2163(this, 5, 7159);
        while (var1.field3655 == 0) {
            class204.method1510(10L, 1);
        }
        if (var1.field3655 == 2) {
            throw new RuntimeException();
        }
        this.field1712 = (Thread) var1.field3657;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lok;I)V", line = 49)
    public static final void method772(class149 arg0, int arg1) {
        class262.field4690 = arg0;
        if (arg1 != -17841) {
            method778(false, 28L, -111, 78, (byte) -57);
        }
        field1698++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lda;II)Lba;", line = 73)
    public final class164 method773(class120 arg0, int arg1, int arg2) {
        class164 var4 = new class164();
        var4.field2954 = 1;
        field1704++;
        class204 var5 = this.field1692;
        synchronized (this.field1692) {
            class164 var6 = (class164) this.field1692.method1511((byte) 75);
            while (true) {
                if (var6 == null) {
                    if (arg1 != 2) {
                        method779(31, -55, -34, 10L);
                    }
                    break;
                }
                if (((long) arg2) == var6.field2103 && var6.field2952 == arg0 && var6.field2954 == 2) {
                    var4.field4920 = false;
                    var4.field2946 = var6.field2946;
                    return var4;
                }
                var6 = (class164) this.field1692.method1515(-114);
            }
        }
        var4.field2946 = arg0.method953(112, arg2);
        var4.field4920 = false;
        var4.field4914 = true;
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILba;)V", line = 111)
    private final void method774(int arg0, class164 arg1) {
        class204 var3 = this.field1692;
        synchronized (this.field1692) {
            this.field1692.method1513(arg1, arg0 - 546);
            this.field1706++;
            this.field1692.notifyAll();
        }
        field1711++;
        if (arg0 != 802) {
            this.method777(-120, (byte[]) null, (class120) null, -77);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLda;I)Lba;", line = 131)
    public final class164 method775(byte arg0, class120 arg1, int arg2) {
        if (arg0 != -76) {
            return (class164) null;
        }
        field1693++;
        class164 var4 = new class164();
        var4.field2103 = (long) arg2;
        var4.field4914 = false;
        var4.field2952 = arg1;
        var4.field2954 = 3;
        this.method774(arg0 ^ 0xFFFFFC96, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 150)
    public static void method776(int arg0) {
        if (arg0 >= -46) {
            field1696 = (class279) null;
        }
        field1710 = null;
        field1697 = null;
        field1702 = null;
        field1695 = null;
        field1696 = null;
    }

    @OriginalMember(owner = "client!ua", name = "run", descriptor = "()V", line = 166)
    public final void run() {
        while (!this.field1709) {
            class204 var1 = this.field1692;
            class164 var2;
            synchronized (this.field1692) {
                var2 = (class164) this.field1692.method1517(false);
                if (var2 == null) {
                    try {
                        this.field1692.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1706--;
            }
            try {
                if (var2.field2954 == 2) {
                    var2.field2952.method951(24947, var2.field2946, var2.field2946.length, (int) var2.field2103);
                } else if (var2.field2954 == 3) {
                    var2.field2946 = var2.field2952.method953(124, (int) var2.field2103);
                }
            } catch (Exception var6) {
                class94.method792(var6, (byte) -115, (String) null);
            }
            var2.field4920 = false;
        }
        field1700++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[BLda;I)Lba;", line = 210)
    public final class164 method777(int arg0, byte[] arg1, class120 arg2, int arg3) {
        field1705++;
        class164 var5 = new class164();
        var5.field4914 = false;
        var5.field2954 = 2;
        var5.field2946 = arg1;
        var5.field2952 = arg2;
        var5.field2103 = (long) arg3;
        this.method774(arg0 ^ 0x171C, var5);
        return arg0 == 5182 ? var5 : (class164) null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZJIIB)Lud;", line = 230)
    public static final class279 method778(boolean arg0, long arg1, int arg2, int arg3, byte arg4) {
        class279 var6 = class247.method1774(0, 4);
        if (arg1 < 0L) {
            arg1 = -arg1;
            var6.method1971(class63.field1296, true);
        }
        class279 var7 = class140.field2552;
        class279 var8 = class60.field1266;
        if (arg2 == 1) {
            var7 = class60.field1266;
            var8 = class140.field2552;
        }
        field1708++;
        if (arg4 > -45) {
            method772((class149) null, 40);
        }
        if (arg2 == 2) {
            var8 = class28.field661;
            var7 = class60.field1266;
        }
        if (arg2 == 3) {
            var8 = class140.field2552;
            var7 = class60.field1266;
        }
        class279 var9 = class247.method1774(0, 4);
        class279 var10 = class247.method1774(0, 4);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method1971(class191.method1447(5, (int) (arg1 % 10L)), true);
            arg1 /= 10L;
        }
        int var12 = 0;
        if (arg1 == 0L) {
            var9 = class162.field2930;
        }
        while (arg1 > 0L) {
            if (arg0 && var12 != 0 && var12 % 3 == 0) {
                var9.method1971(var8, true);
            }
            var12++;
            var9.method1971(class191.method1447(5, (int) (arg1 % 10L)), true);
            arg1 /= 10L;
        }
        if (var10.method1984(8) > 0) {
            var10.method1971(var7, true);
        }
        return class115.method929(new class279[] { var6, var9.method1996(15), var10.method1996(15) }, (byte) 60);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIJ)Z", line = 313)
    public static final boolean method779(int arg0, int arg1, int arg2, long arg3) {
        class191 var5 = class24.field619[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3439 != null && var5.field3439.field530 == arg3) {
            return true;
        } else if (var5.field3454 != null && var5.field3454.field4095 == arg3) {
            return true;
        } else if (var5.field3440 != null && var5.field3440.field4325 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3451; var6++) {
                if (var5.field3455[var6].field546 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 360)
    public final void method780(int arg0) {
        this.field1709 = true;
        class204 var2 = this.field1692;
        synchronized (this.field1692) {
            this.field1692.notifyAll();
        }
        try {
            this.field1712.join();
        } catch (InterruptedException var5) {
        }
        field1691++;
        this.field1712 = null;
        if (arg0 != 0) {
            this.field1706 = -20;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)V", line = 379)
    public static final void method781(long arg0, int arg1) {
        if (arg1 < 10) {
            return;
        }
        field1701++;
        class314.field5534.field1142 = 0;
        class314.field5534.method464(248, false);
        class314.field5534.method490(arg0, 14886);
        class180.field3280 = 0;
        class73.field1435 = -3;
        class182.field3332 = 0;
        class139.field2516 = 1;
    }
}
