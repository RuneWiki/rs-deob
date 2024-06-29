import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class112 implements Runnable {

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Luk;")
    private class105 field1447 = new class105();

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Z")
    private boolean field1452 = false;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public int field1454 = 0;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field1456;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1441 = 0;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lfh;")
    public static class140 field1455;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "[I")
    public static int[] field1446;

    @OriginalMember(owner = "client!ja", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        while (!this.field1452) {
            class105 var1 = this.field1447;
            class254 var2;
            synchronized (this.field1447) {
                var2 = (class254) this.field1447.method743(false);
                if (var2 == null) {
                    try {
                        this.field1447.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1454--;
            }
            try {
                if (var2.field3703 == 2) {
                    var2.field3714.method1324(var2.field3709.length, var2.field3709, (int) var2.field3011, 1672431208);
                } else if (var2.field3703 == 3) {
                    var2.field3709 = var2.field3714.method1323((int) var2.field3011, 255);
                }
            } catch (Exception var6) {
                class347.method2409(var6, 3924, (String) null);
            }
            var2.field1109 = false;
        }
        field1445++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILfm;I)Lal;", line = 49)
    public final class254 method790(int arg0, class179 arg1, int arg2) {
        field1442++;
        class254 var4 = new class254();
        var4.field3703 = 3;
        var4.field3714 = arg1;
        var4.field1105 = false;
        if (arg0 != -10260) {
            this.run();
        }
        var4.field3011 = (long) arg2;
        this.method797(-377, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([BLjava/lang/String;IIII)I", line = 69)
    public static final int method791(byte[] arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg4;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg3 + var7] = -97;
            } else {
                arg0[arg3 + var7] = 63;
            }
        }
        field1457++;
        if (arg5 == 23422) {
            return var6;
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 206)
    public static void method792(int arg0) {
        field1446 = null;
        field1455 = null;
        if (arg0 != 31425) {
            field1453 = -67;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLfm;[BI)Lal;", line = 233)
    public final class254 method793(byte arg0, class179 arg1, byte[] arg2, int arg3) {
        int var5 = 106 % ((arg0 + 62) / 62);
        field1444++;
        class254 var6 = new class254();
        var6.field3011 = (long) arg3;
        var6.field3714 = arg1;
        var6.field1105 = false;
        var6.field3703 = 2;
        var6.field3709 = arg2;
        this.method797(-377, var6);
        return var6;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 251)
    public static final void method794(int arg0) {
        if (arg0 != -22906) {
            field1441 = -27;
        }
        class312.field4584.method2262(false);
        field1450++;
        class260.field3769.method2262(false);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBI)V", line = 264)
    public static final void method795(int arg0, byte arg1, int arg2) {
        class323.field4744 = class38.field461 + class38.field459 - arg2 - 1;
        int var3 = 32 % ((-arg1 - 62) / 43);
        class83.field1069 = arg0 - class38.field462;
        field1440++;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 355)
    public class112() {
        class188 var1 = class157.field2216.method494(5, true, this);
        while (var1.field2608 == 0) {
            class177.method1299((byte) 64, 10L);
        }
        if (var1.field2608 == 2) {
            throw new RuntimeException();
        }
        this.field1456 = (Thread) var1.field2606;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V", line = 283)
    public final void method796(boolean arg0) {
        field1449++;
        this.field1452 = arg0;
        class105 var2 = this.field1447;
        synchronized (this.field1447) {
            this.field1447.notifyAll();
        }
        try {
            this.field1456.join();
        } catch (InterruptedException var5) {
        }
        this.field1456 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILal;)V", line = 299)
    private final void method797(int arg0, class254 arg1) {
        field1443++;
        class105 var3 = this.field1447;
        synchronized (this.field1447) {
            this.field1447.method740(85, arg1);
            this.field1454++;
            this.field1447.notifyAll();
            if (arg0 != -377) {
                field1453 = 58;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLfm;I)Lal;", line = 323)
    public final class254 method798(byte arg0, class179 arg1, int arg2) {
        class254 var4 = new class254();
        field1451++;
        var4.field3703 = 1;
        class105 var5 = this.field1447;
        synchronized (this.field1447) {
            for (class254 var6 = (class254) this.field1447.method739((byte) 95); var6 != null; var6 = (class254) this.field1447.method747(1)) {
                if (((long) arg2) == var6.field3011 && var6.field3714 == arg1 && var6.field3703 == 2) {
                    var4.field3709 = var6.field3709;
                    var4.field1109 = false;
                    return var4;
                }
            }
        }
        if (arg0 >= -114) {
            this.field1447 = (class105) null;
        }
        var4.field3709 = arg1.method1323(arg2, 255);
        var4.field1109 = false;
        var4.field1105 = true;
        return var4;
    }
}
