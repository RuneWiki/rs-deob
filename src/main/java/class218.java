import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class218 implements Runnable {

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "La;")
    private class247 field3492 = new class247();

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Z")
    private boolean field3500 = false;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public int field3501 = 0;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field3499;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field3484 = 0;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field3494 = -1;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field3496 = 500;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "[Lve;")
    public static class240[] field3493;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method1445(int arg0) {
        if (arg0 <= 95) {
            field3494 = -46;
        }
        field3493 = null;
    }

    @OriginalMember(owner = "client!fe", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field3500) {
            class247 var1 = this.field3492;
            class1 var2;
            synchronized (this.field3492) {
                var2 = (class1) this.field3492.method1633((byte) -71);
                if (var2 == null) {
                    try {
                        this.field3492.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field3501--;
            }
            try {
                if (var2.field1 == 2) {
                    var2.field2.method55(var2.field12, (int) var2.field2817, 21101, var2.field12.length);
                } else if (var2.field1 == 3) {
                    var2.field12 = var2.field2.method51(512, (int) var2.field2817);
                }
            } catch (Exception var7) {
                class272.method1837((String) null, 1, var7);
            }
            var2.field998 = false;
        }
        field3490++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLaj;)V")
    private final void method1446(byte arg0, class1 arg1) {
        class247 var3 = this.field3492;
        synchronized (this.field3492) {
            this.field3492.method1634((byte) 38, arg1);
            if (arg0 != -5) {
                method1447(6, 83);
            }
            this.field3501++;
            this.field3492.notifyAll();
        }
        field3485++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)I")
    public static final int method1447(int arg0, int arg1) {
        double var2 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        field3495++;
        double var4 = (double) ((arg0 & 0xFF763C) >> 16) / 256.0D;
        double var6 = var4;
        if (var4 < var2) {
            var6 = var2;
        }
        double var8 = var4;
        double var10 = 0.0D;
        if (var4 > var2) {
            var8 = var2;
        }
        double var12 = (double) (arg0 & 0xFF) / 256.0D;
        double var14 = 0.0D;
        if (var12 > var6) {
            var6 = var12;
        }
        if (var8 > var12) {
            var8 = var12;
        }
        if (arg1 != -5641) {
            method1447(14, -58);
        }
        double var16 = (var6 + var8) / 2.0D;
        if (var6 != var8) {
            if (var16 < 0.5D) {
                var10 = (var6 - var8) / (var6 + var8);
            }
            if (var4 == var6) {
                var14 = (var2 - var12) / (var6 - var8);
            } else if (var2 == var6) {
                var14 = (var12 - var4) / (var6 - var8) + 2.0D;
            } else if (var6 == var12) {
                var14 = (var4 - var2) / (var6 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var10 = (var6 - var8) / (2.0D - var6 - var8);
            }
        }
        double var18 = var14 / 6.0D;
        int var20 = (int) (var10 * 256.0D);
        int var21 = (int) (var18 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var20 >>= 0x4;
        } else if (var22 > 217) {
            var20 >>= 0x3;
        } else if (var22 > 192) {
            var20 >>= 0x2;
        } else if (var22 > 179) {
            var20 >>= 0x1;
        }
        return (var21 >> 2 << 10) + (var20 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)Lbf;")
    public static final class297 method1448(int arg0, int arg1) {
        field3489++;
        class297 var2 = (class297) class161.field2620.method1579((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class223.field3543.method940((byte) 68, arg0, arg1);
        if (var3 == null) {
            return null;
        }
        class297 var4 = new class297();
        class264 var5 = new class264(var3);
        var5.field4195 = var5.field4198.length - 2;
        int var6 = var5.method1777(-103);
        int var7 = var5.field4198.length - var6 - 2 - 12;
        var5.field4195 = var7;
        int var8 = var5.method1765((byte) 106);
        var4.field4688 = var5.method1777(-47);
        var4.field4700 = var5.method1777(arg0 ^ 0xFFFFFFAF);
        var4.field4701 = var5.method1777(arg0 - 64);
        var4.field4707 = var5.method1777(arg0 - 73);
        int var9 = var5.method1779(-72);
        if (var9 > 0) {
            var4.field4705 = new class61[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1777(-67);
                class61 var12 = new class61(class290.method1941(var11, arg0 ^ 0x9C1C6628));
                var4.field4705[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1765((byte) 101);
                    int var14 = var5.method1765((byte) 97);
                    var12.method466((long) var13, new class119(var14), (byte) 93);
                }
            }
        }
        var5.field4195 = 0;
        int var15 = 0;
        var4.field4692 = var5.method1733((byte) -1);
        var4.field4689 = new int[var8];
        var4.field4703 = new int[var8];
        var4.field4696 = new String[var8];
        while (var7 > var5.field4195) {
            int var16 = var5.method1777(-37);
            if (var16 == 3) {
                var4.field4696[var15] = var5.method1750((byte) 102).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field4689[var15] = var5.method1779(arg0 - 66);
            } else {
                var4.field4689[var15] = var5.method1765((byte) 101);
            }
            var4.field4703[var15++] = var16;
        }
        class161.field2620.method1578(var4, (long) arg1, arg0 + 50);
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([BILwh;I)Laj;")
    public final class1 method1449(byte[] arg0, int arg1, class9 arg2, int arg3) {
        class1 var5 = new class1();
        var5.field2 = arg2;
        var5.field2817 = (long) arg3;
        field3498++;
        var5.field1 = arg1;
        var5.field12 = arg0;
        var5.field999 = false;
        this.method1446((byte) -5, var5);
        return var5;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)Z")
    public static final boolean method1450(int arg0) {
        field3486++;
        return ~class130.field2178 == arg0 ? class93.field1326.method772(true) : true;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILwh;I)Laj;")
    public final class1 method1451(int arg0, class9 arg1, int arg2) {
        class1 var4 = new class1();
        field3487++;
        var4.field1 = 1;
        class247 var5 = this.field3492;
        synchronized (this.field3492) {
            class1 var6 = (class1) this.field3492.method1635(-82);
            while (true) {
                if (var6 == null) {
                    if (arg2 != 0) {
                        field3493 = null;
                    }
                    break;
                }
                if ((long) arg0 == var6.field2817 && var6.field2 == arg1 && var6.field1 == 2) {
                    var4.field998 = false;
                    var4.field12 = var6.field12;
                    return var4;
                }
                var6 = (class1) this.field3492.method1636((byte) -120);
            }
        }
        var4.field12 = arg1.method51(arg2 + 512, arg0);
        var4.field998 = false;
        var4.field999 = true;
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public final void method1452(int arg0) {
        this.field3500 = true;
        int var2 = 119 / ((54 - arg0) / 48);
        class247 var3 = this.field3492;
        synchronized (this.field3492) {
            this.field3492.notifyAll();
        }
        try {
            this.field3499.join();
        } catch (InterruptedException var4) {
        }
        field3491++;
        this.field3499 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILwh;B)Laj;")
    public final class1 method1453(int arg0, class9 arg1, byte arg2) {
        class1 var4 = new class1();
        field3497++;
        var4.field2 = arg1;
        var4.field999 = false;
        int var5 = 3 / ((-arg2 - 24) / 33);
        var4.field2817 = (long) arg0;
        var4.field1 = 3;
        this.method1446((byte) -5, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)I")
    public static final int method1454(int arg0, int arg1, int arg2) {
        class204 var3 = (class204) class78.field1067.method457((long) arg1, (byte) -115);
        int var4 = 121 % ((arg2 + 22) / 60);
        field3483++;
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field3276.length > arg0) {
            return var3.field3276[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class218() {
        class137 var1 = class250.field4006.method1679(this, -118, 5);
        while (var1.field2271 == 0) {
            class208.method1408(-128, 10L);
        }
        if (var1.field2271 == 2) {
            throw new RuntimeException();
        }
        this.field3499 = (Thread) var1.field2266;
    }
}
