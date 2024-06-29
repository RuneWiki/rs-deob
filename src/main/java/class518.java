import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class518 implements Runnable {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lca;")
    private class119 field6777 = new class119();

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Z")
    private boolean field6783 = false;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public int field6786 = 0;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field6785;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lra;")
    public static class361 field6775 = new class361(1, 3);

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field6789 = -1;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "[B")
    public static byte[] field6790 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lsd;IB)Lkaa;")
    public final class628 method2784(class264 arg0, int arg1, byte arg2) {
        field6779++;
        class628 var4 = new class628();
        var4.field8770 = 1;
        class119 var5 = this.field6777;
        synchronized (this.field6777) {
            class628 var6 = (class628) this.field6777.method887(-77);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg1 == var6.field437 && var6.field8766 == arg0 && var6.field8770 == 2) {
                    var4.field8771 = var6.field8771;
                    var4.field20 = false;
                    return var4;
                }
                var6 = (class628) this.field6777.method892(true);
            }
        }
        if (arg2 < 78) {
            return null;
        } else {
            var4.field8771 = arg0.method1634(12123, arg1);
            var4.field20 = false;
            var4.field19 = true;
            return var4;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
    public static final int method2785(int arg0) {
        if (arg0 != 1) {
            field6775 = null;
        }
        field6787++;
        if (class645.field8994 == 0) {
            class318.field4123.method1852(new class145("jaclib"), (byte) 63);
            if (class318.field4123.method1856(-55).method901(false) != 100) {
                return 1;
            }
            if (!((class145) class318.field4123.method1856(arg0 ^ 0xFFFFFFAA)).method1080((byte) -118)) {
                class381.field4890.method3605(16);
            }
            class645.field8994 = 1;
        }
        if (class645.field8994 == 1) {
            class364.field4700 = class318.method1850((byte) -105);
            class318.field4117.method1852(new class378(class418.field5354), (byte) 66);
            class318.field4124.method1852(new class145("jaggl"), (byte) 91);
            class318.field4125.method1852(new class145("jagdx"), (byte) 42);
            class318.field4126.method1852(new class145("jagmisc"), (byte) 50);
            class318.field4127.method1852(new class145("sw3d"), (byte) 15);
            class318.field4128.method1852(new class145("hw3d"), (byte) 114);
            class318.field4129.method1852(new class378(class650.field9053), (byte) 24);
            class318.field4130.method1852(new class378(class536.field6979), (byte) 86);
            class318.field4131.method1852(new class378(class262.field3517), (byte) 47);
            class318.field4132.method1852(new class378(class253.field3452), (byte) 50);
            class318.field4133.method1852(new class378(class187.field2382), (byte) 89);
            class318.field4134.method1852(new class378(class129.field1647), (byte) 21);
            class318.field4135.method1852(new class378(class493.field6524), (byte) 67);
            class318.field4136.method1852(new class378(class278.field3647), (byte) 49);
            class318.field4137.method1852(new class378(class331.field4309), (byte) 61);
            class318.field4138.method1852(new class378(class270.field3586), (byte) 83);
            class318.field4139.method1852(new class378(class95.field1249), (byte) 36);
            class318.field4140.method1852(new class378(class307.field4024), (byte) 42);
            class318.field4141.method1852(new class378(class186.field2370), (byte) 97);
            class318.field4142.method1852(new class378(class378.field4844), (byte) 73);
            class318.field4143.method1852(new class224(class331.field4307, "huffman"), (byte) 77);
            class318.field4144.method1852(new class378(class352.field4521), (byte) 100);
            class318.field4145.method1852(new class378(class517.field6774), (byte) 96);
            class318.field4146.method1852(new class378(class261.field3511), (byte) 106);
            class318.field4147.method1852(new class478(class52.field716, "details"), (byte) 41);
            for (int var1 = 0; var1 < class364.field4700.length; var1++) {
                if (class364.field4700[var1].method1856(arg0 + 75) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class318[] var3 = class364.field4700;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class318 var5 = var3[var4];
                int var6 = var5.method1854(arg0 + 16383);
                int var7 = var5.method1856(111).method901(false);
                var2 += var6 * var7 / 100;
            }
            class298.field3901 = var2;
            class645.field8994 = 2;
        }
        if (class364.field4700 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class318[] var11 = class364.field4700;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class318 var16 = var11[var12];
            int var17 = var16.method1854(arg0 ^ 0x4001);
            int var18 = var16.method1856(27).method901(false);
            var9 += var17 * var18 / 100;
            if (var18 < 100) {
                var10 = false;
            }
            var8 += var17;
        }
        if (var10) {
            if (!((class145) class318.field4126.method1856(54)).method1080((byte) -118)) {
                class381.field4890.method3603(arg0 - 122);
            }
            class364.field4700 = null;
        }
        int var13 = var8 - class298.field3901;
        int var14 = var9 - class298.field3901;
        int var15 = var13 > 0 ? var14 * 100 / var13 : 100;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lsd;IB)Lkaa;")
    public final class628 method2786(class264 arg0, int arg1, byte arg2) {
        field6788++;
        class628 var4 = new class628();
        var4.field8766 = arg0;
        var4.field19 = false;
        var4.field437 = arg1;
        if (arg2 == -24) {
            var4.field8770 = 3;
            this.method2792(false, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILsd;[BI)Lkaa;")
    public final class628 method2787(int arg0, class264 arg1, byte[] arg2, int arg3) {
        field6778++;
        class628 var5 = new class628();
        var5.field8771 = arg2;
        var5.field8770 = arg3;
        var5.field8766 = arg1;
        var5.field437 = arg0;
        var5.field19 = false;
        this.method2792(false, var5);
        return var5;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public final void method2788(int arg0) {
        this.field6783 = true;
        field6782++;
        class119 var2 = this.field6777;
        synchronized (this.field6777) {
            this.field6777.notifyAll();
        }
        try {
            this.field6785.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 == 3) {
            this.field6785 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method2789(byte arg0) {
        field6790 = null;
        if (arg0 == -65) {
            field6775 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field6783) {
            class119 var1 = this.field6777;
            class628 var2;
            synchronized (this.field6777) {
                var2 = (class628) this.field6777.method893((byte) 122);
                if (var2 == null) {
                    try {
                        this.field6777.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field6786--;
            }
            try {
                if (var2.field8770 == 2) {
                    var2.field8766.method1632(var2.field8771, var2.field8771.length, 0, (int) var2.field437);
                } else if (var2.field8770 == 3) {
                    var2.field8771 = var2.field8766.method1634(12123, (int) var2.field437);
                }
            } catch (Exception var6) {
                class698.method3809(null, (byte) 114, var6);
            }
            var2.field20 = false;
        }
        field6780++;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public static final void method2790(int arg0) {
        if (class412.field5313 != null) {
            class412.field5313.method763((byte) 116);
        }
        field6781++;
        if (arg0 != 0) {
            method2790(-88);
        }
        while (true) {
            try {
                class476.field6190.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)Lhea;")
    public static final class374 method2791(byte arg0) {
        if (arg0 == -23) {
            field6784++;
            return class53.method463(1, 100);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lufa;)V")
    public class518(class140 arg0) {
        class548 var2 = arg0.method1057(this, 5, (byte) 121);
        while (var2.field7108 == 0) {
            class122.method905(10L, -6145);
        }
        if (var2.field7108 == 2) {
            throw new RuntimeException();
        }
        this.field6785 = (Thread) var2.field7113;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLkaa;)V")
    private final void method2792(boolean arg0, class628 arg1) {
        class119 var3 = this.field6777;
        synchronized (this.field6777) {
            this.field6777.method890((byte) -16, arg1);
            if (arg0) {
                field6789 = -57;
            }
            this.field6786++;
            this.field6777.notifyAll();
        }
        field6776++;
    }
}
