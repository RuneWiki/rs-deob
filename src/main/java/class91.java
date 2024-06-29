import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class91 implements Runnable {

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "Lld;")
    private class114 field1381 = new class114();

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public int field1383 = 0;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "Z")
    private boolean field1388 = false;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field1384;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "Lok;")
    public static class166 field1378 = new class166(12, 14);

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "J")
    public static long field1382 = -1L;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "Lsl;")
    public static class317 field1385 = new class317("", 13);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "[Lf;")
    public static class529[] field1387;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIILcr;)V")
    public static final void method657(int arg0, int arg1, int arg2, class403 arg3) {
        if (class32.field529) {
            class495 var9 = class450.field6125 == -1 ? null : class270.field3546.method693(class450.field6125, -65);
            if (client.method1255(arg3).method2049((byte) 98) && (class351.field4740 & 0x20) != 0 && (var9 == null || arg3.method2347(1, var9.field6873, class450.field6125) != var9.field6873)) {
                class70.method459(arg3.field5530, class455.field6214 + " -> " + arg3.field5544, true, arg3.field5431, 46, 23856, class59.field925, class394.field5341, 0L, arg3.field5553, false);
                class433.field5924++;
            }
        } else {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class255.method1541(var4, (byte) 116, arg3);
                if (var8 != null) {
                    class70.method459(arg3.field5530, arg3.field5544, true, arg3.field5431, 1007, 23856, var8, class240.method1481(-10108, arg3, var4), (long) (var4 + 1), arg3.field5553, false);
                    class196.field2746++;
                }
            }
            String var5 = class228.method1420(-2, arg3);
            if (var5 != null) {
                class421.field5769++;
                class70.method459(arg3.field5530, arg3.field5544, true, arg3.field5431, 3, 23856, var5, arg3.field5515, 0L, arg3.field5553, false);
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class255.method1541(var6, (byte) 116, arg3);
                if (var7 != null) {
                    class70.method459(arg3.field5530, arg3.field5544, true, arg3.field5431, 12, 23856, var7, class240.method1481(-10108, arg3, var6), (long) (var6 + 1), arg3.field5553, false);
                    class196.field2746++;
                }
            }
            if (client.method1255(arg3).method2047(-25257)) {
                class429.field5882++;
                if (arg3.field5403 == null) {
                    class70.method459(arg3.field5530, "", true, arg3.field5431, 58, 23856, class196.field2748.method1764(class489.field6789, false), -1, 0L, arg3.field5553, false);
                } else {
                    class70.method459(arg3.field5530, "", true, arg3.field5431, 58, 23856, arg3.field5403, -1, 0L, arg3.field5553, false);
                }
            }
        }
        int var10 = 40 % ((arg1 - 24) / 32);
        field1379++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([BIILoc;)Lrh;")
    public final class172 method658(byte[] arg0, int arg1, int arg2, class135 arg3) {
        field1374++;
        class172 var5 = new class172();
        var5.field6896 = arg2;
        var5.field2506 = arg0;
        var5.field2504 = 2;
        if (arg1 < 85) {
            this.field1383 = 35;
        }
        var5.field455 = false;
        var5.field2501 = arg3;
        this.method662(var5, 78);
        return var5;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method659(int arg0) {
        if (arg0 <= 34) {
            method659(-16);
        }
        field1378 = null;
        field1385 = null;
        field1387 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILoc;)Lrh;")
    public final class172 method660(int arg0, int arg1, class135 arg2) {
        field1380++;
        class172 var4 = new class172();
        var4.field2504 = arg0;
        class114 var5 = this.field1381;
        synchronized (this.field1381) {
            class172 var6 = (class172) this.field1381.method786(1);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field6896 && var6.field2501 == arg2 && var6.field2504 == 2) {
                    var4.field2506 = var6.field2506;
                    var4.field456 = false;
                    return var4;
                }
                var6 = (class172) this.field1381.method780((byte) -78);
            }
        }
        var4.field2506 = arg2.method956(arg0 ^ 0x91A2EA9, arg1);
        var4.field455 = true;
        var4.field456 = false;
        return var4;
    }

    @OriginalMember(owner = "client!fn", name = "run", descriptor = "()V")
    public final void run() {
        field1375++;
        while (!this.field1388) {
            class114 var1 = this.field1381;
            class172 var2;
            synchronized (this.field1381) {
                var2 = (class172) this.field1381.method787((byte) 127);
                if (var2 == null) {
                    try {
                        this.field1381.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1383--;
            }
            try {
                if (var2.field2504 == 2) {
                    var2.field2501.method953(var2.field2506, var2.field2506.length, (int) var2.field6896, false);
                } else if (var2.field2504 == 3) {
                    var2.field2506 = var2.field2501.method956(152710824, (int) var2.field6896);
                }
            } catch (Exception var6) {
                class504.method2879(var6, null, -19638);
            }
            var2.field456 = false;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILoc;I)Lrh;")
    public final class172 method661(int arg0, class135 arg1, int arg2) {
        field1376++;
        class172 var4 = new class172();
        var4.field2504 = arg2;
        var4.field6896 = arg0;
        var4.field455 = false;
        var4.field2501 = arg1;
        this.method662(var4, 100);
        return var4;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lrh;I)V")
    private final void method662(class172 arg0, int arg1) {
        field1386++;
        class114 var3 = this.field1381;
        synchronized (this.field1381) {
            this.field1381.method783(arg0, (byte) -88);
            if (arg1 <= 61) {
                this.field1388 = true;
            }
            this.field1383++;
            this.field1381.notifyAll();
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
    public final void method663(byte arg0) {
        int var2 = 27 / ((-arg0 - 11) / 33);
        field1377++;
        this.field1388 = true;
        class114 var3 = this.field1381;
        synchronized (this.field1381) {
            this.field1381.notifyAll();
        }
        try {
            this.field1384.join();
        } catch (InterruptedException var4) {
        }
        this.field1384 = null;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Ljs;)V")
    public class91(class216 arg0) {
        class446 var2 = arg0.method1353(5, -34, this);
        while (var2.field6100 == 0) {
            class94.method674(10L, 1);
        }
        if (var2.field6100 == 2) {
            throw new RuntimeException();
        }
        this.field1384 = (Thread) var2.field6104;
    }
}
