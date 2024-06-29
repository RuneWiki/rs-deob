import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class244 implements Runnable {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Laf;")
    private class68 field4417 = new class68();

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public int field4435 = 0;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "Z")
    private boolean field4436 = false;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "Ljava/lang/Thread;")
    private Thread field4437;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Z")
    public static boolean field4418 = false;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field4423 = 0;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field4428 = 0;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Lcc;")
    public static class209 field4434 = class95.method669(82, ":clanreq:");

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field4430 = 0;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!qf", name = "run", descriptor = "()V")
    public final void run() {
        field4421++;
        while (!this.field4436) {
            class68 var1 = this.field4417;
            class207 var2;
            synchronized (this.field4417) {
                var2 = (class207) this.field4417.method500(31480);
                if (var2 == null) {
                    try {
                        this.field4417.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4435--;
            }
            try {
                if (var2.field3697 == 2) {
                    var2.field3695.method1243((int) var2.field4681, var2.field3700.length, 139, var2.field3700);
                } else if (var2.field3697 == 3) {
                    var2.field3700 = var2.field3695.method1247(44, (int) var2.field4681);
                }
            } catch (Exception var6) {
                class78.method548((byte) -17, (String) null, var6);
            }
            var2.field2685 = false;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static final void method1696(int arg0) {
        class249.field4483 = null;
        class159.field2900 = null;
        class158.field2889 = null;
        class234.field4219 = null;
        if (arg0 < 78) {
            method1702(true);
        }
        class97.field1887 = null;
        class80.field1497 = null;
        class44.field868 = null;
        field4431++;
        class79.field1464 = null;
        class14.field266 = null;
        class47.field914 = null;
        class284.field5009 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([BIZLje;)Lqk;")
    public final class207 method1697(byte[] arg0, int arg1, boolean arg2, class182 arg3) {
        if (arg2) {
            return null;
        }
        class207 var5 = new class207();
        field4424++;
        var5.field3697 = 2;
        var5.field2682 = false;
        var5.field3695 = arg3;
        var5.field4681 = (long) arg1;
        var5.field3700 = arg0;
        this.method1705((byte) -115, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public final void method1698(int arg0) {
        field4419++;
        if (arg0 <= 59) {
            return;
        }
        this.field4436 = true;
        class68 var2 = this.field4417;
        synchronized (this.field4417) {
            this.field4417.notifyAll();
        }
        try {
            this.field4437.join();
        } catch (InterruptedException var3) {
        }
        this.field4437 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZII)V")
    public static final void method1699(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            field4428 = 91;
        }
        class155.field2847 = arg0;
        class230.field4184 = arg3;
        class102.field1957 = arg1;
        class262.field4723 = arg4;
        field4420++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Z")
    public static final boolean method1700(byte arg0) {
        if (arg0 <= 54) {
            return false;
        } else {
            field4429++;
            return field4428 == 0 ? class44.field873.method149(126) : true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILje;B)Lqk;")
    public final class207 method1701(int arg0, class182 arg1, byte arg2) {
        class207 var4 = new class207();
        field4432++;
        var4.field2682 = false;
        var4.field3697 = 3;
        var4.field4681 = (long) arg0;
        var4.field3695 = arg1;
        this.method1705((byte) -114, var4);
        int var5 = 27 / ((arg2 - 77) / 41);
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public static void method1702(boolean arg0) {
        if (!arg0) {
            method1700((byte) -26);
        }
        field4434 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lje;II)Lqk;")
    public final class207 method1703(class182 arg0, int arg1, int arg2) {
        field4426++;
        class207 var4 = new class207();
        var4.field3697 = arg1;
        class68 var5 = this.field4417;
        synchronized (this.field4417) {
            class207 var6 = (class207) this.field4417.method503(19852);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field4681 && var6.field3695 == arg0 && var6.field3697 == 2) {
                    var4.field3700 = var6.field3700;
                    var4.field2685 = false;
                    return var4;
                }
                var6 = (class207) this.field4417.method504(64);
            }
        }
        var4.field3700 = arg0.method1247(44, arg2);
        var4.field2682 = true;
        var4.field2685 = false;
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIILd;)V")
    public static final void method1704(int arg0, int arg1, int arg2, int arg3, class237 arg4) {
        field4422++;
        if (class98.field1912 >= 400) {
            return;
        }
        if (arg4.field4295 != null) {
            arg4 = arg4.method1636(67);
        }
        if (arg4 == null || !arg4.field4245) {
            return;
        }
        class209 var5 = arg4.field4287;
        if (arg4.field4258 != 0) {
            var5 = class229.method1604(new class209[] { var5, class13.method99(arg4.field4258, true, class223.field4069.field2171), class198.field3553, class239.field4316, class66.method485(arg4.field4258, (byte) 83), class228.field4154 }, (byte) 93);
        }
        if (arg1 >= -44) {
            return;
        }
        if (class25.field445 == 1) {
            class252.method1740((long) arg2, (byte) 90, class124.field2417, arg0, (short) 20, class229.method1604(new class209[] { class114.field2289, class52.field1024, var5 }, (byte) 122), arg3);
            class58.field1180++;
        } else if (!class260.field4689) {
            class157.field2864++;
            class209[] var6 = arg4.field4272;
            if (class252.field4533) {
                var6 = class40.method302((byte) -66, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class218.field3936 != 0 || !var6[var7].method1483(class131.field2508, (byte) -121))) {
                        class266.field4769++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 37;
                        }
                        if (var7 == 1) {
                            var8 = 30;
                        }
                        if (var7 == 2) {
                            var8 = 38;
                        }
                        if (var7 == 3) {
                            var8 = 22;
                        }
                        if (var7 == 4) {
                            var8 = 19;
                        }
                        class252.method1740((long) arg2, (byte) 90, var6[var7], arg0, var8, class229.method1604(new class209[] { class14.field259, var5 }, (byte) 78), arg3);
                    }
                }
            }
            if (class218.field3936 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1483(class131.field2508, (byte) -84)) {
                        class13.field245++;
                        short var10 = 0;
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 37;
                        }
                        if (var9 == 1) {
                            var11 = 30;
                        }
                        if (class223.field4069.field2171 < arg4.field4258) {
                            var10 = 2000;
                        }
                        if (var9 == 2) {
                            var11 = 38;
                        }
                        if (var9 == 3) {
                            var11 = 22;
                        }
                        if (var9 == 4) {
                            var11 = 19;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class252.method1740((long) arg2, (byte) 90, var6[var9], arg0, var11, class229.method1604(new class209[] { class14.field259, var5 }, (byte) 105), arg3);
                    }
                }
            }
            class252.method1740((long) arg2, (byte) 90, class33.field582, arg0, (short) 1006, class229.method1604(new class209[] { class14.field259, var5 }, (byte) 96), arg3);
        } else if ((class49.field948 & 0x2) == 2) {
            class252.method1740((long) arg2, (byte) 90, class184.field3318, arg0, (short) 26, class229.method1604(new class209[] { class44.field879, class52.field1024, var5 }, (byte) 48), arg3);
            class22.field417++;
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLqk;)V")
    private final void method1705(byte arg0, class207 arg1) {
        field4433++;
        class68 var3 = this.field4417;
        synchronized (this.field4417) {
            int var4 = -36 / ((arg0 + 64) / 43);
            this.field4417.method501(arg1, true);
            this.field4435++;
            this.field4417.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class244() {
        class203 var1 = class230.field4187.method996(this, 5, false);
        while (var1.field3646 == 0) {
            class174.method1196((byte) 82, 10L);
        }
        if (var1.field3646 == 2) {
            throw new RuntimeException();
        }
        this.field4437 = (Thread) var1.field3642;
    }
}
