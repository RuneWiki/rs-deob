import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class206 implements Runnable {

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Lm;")
    private class48 field3370 = new class48();

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Z")
    private boolean field3373 = false;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public int field3379 = 0;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field3376;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Lwm;")
    public static class152 field3365 = class157.method1048("vert:", 103);

    @OriginalMember(owner = "client!o", name = "c", descriptor = "[Z")
    public static boolean[] field3360 = new boolean[100];

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lwm;")
    private static class152 field3362 = class157.method1048("shake:", 97);

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lwm;")
    public static class152 field3366 = field3362;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "[J")
    public static long[] field3371 = new long[256];

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Lwm;")
    public static class152 field3372 = field3362;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "J")
    public static long field3377;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lbg;")
    public static class203 field3369;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Lah;")
    public static class205 field3380;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lth;")
    public static class86 field3359;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[BLsd;I)Lvm;", line = 7)
    public final class77 method1385(int arg0, byte[] arg1, class27 arg2, int arg3) {
        field3375++;
        int var5 = 44 / ((49 - arg0) / 46);
        class77 var6 = new class77();
        var6.field916 = (long) arg3;
        var6.field4825 = false;
        var6.field1102 = arg2;
        var6.field1094 = arg1;
        var6.field1099 = 2;
        this.method1389(var6, false);
        return var6;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILsd;)Lvm;", line = 27)
    public final class77 method1386(int arg0, int arg1, class27 arg2) {
        field3367++;
        class77 var4 = new class77();
        if (arg0 != 1) {
            this.method1385(-112, (byte[]) null, (class27) null, -25);
        }
        var4.field4825 = false;
        var4.field1099 = 3;
        var4.field1102 = arg2;
        var4.field916 = (long) arg1;
        this.method1389(var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 55)
    public final void method1387(int arg0) {
        field3361++;
        this.field3373 = true;
        class48 var2 = this.field3370;
        synchronized (this.field3370) {
            this.field3370.notifyAll();
            if (arg0 != 3) {
                this.method1385(-13, (byte[]) null, (class27) null, 22);
            }
        }
        try {
            this.field3376.join();
        } catch (InterruptedException var5) {
        }
        this.field3376 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 75)
    public static void method1388(byte arg0) {
        field3360 = null;
        field3372 = null;
        int var1 = -100 / ((arg0 - 60) / 61);
        field3371 = null;
        field3359 = null;
        field3380 = null;
        field3366 = null;
        field3362 = null;
        field3365 = null;
        field3369 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lvm;Z)V", line = 94)
    private final void method1389(class77 arg0, boolean arg1) {
        field3374++;
        class48 var3 = this.field3370;
        synchronized (this.field3370) {
            if (arg1) {
                this.method1389((class77) null, true);
            }
            this.field3370.method334((byte) 87, arg0);
            this.field3379++;
            this.field3370.notifyAll();
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3371[var0] = var1;
        }
        field3378 = 0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I", line = 124)
    public static final int method1390(int arg0, int arg1, int arg2) {
        if (arg2 != -26462) {
            return -40;
        }
        int var3 = class314.method2193(arg0 - 1, 57, arg1 - 1) - (-class314.method2193(arg0 + 1, arg2 ^ 0xFFFF989B, arg1 - 1) - class314.method2193(arg0 - 1, arg2 + 26519, arg1 + 1) - class314.method2193(arg0 + 1, arg2 + 26519, arg1 - -1));
        int var4 = class314.method2193(arg0 - 1, 57, arg1) + class314.method2193(arg0 + 1, arg2 ^ 0xFFFF989B, arg1) + (class314.method2193(arg0, 57, arg1 + -1) - -class314.method2193(arg0, 57, arg1 + 1));
        field3364++;
        int var5 = class314.method2193(arg0, 57, arg1);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 143)
    public static final void method1391(int arg0, int arg1) {
        field3368++;
        if (arg0 != 1) {
            method1390(17, -74, -5);
        }
        if (class197.method1315(71, arg1)) {
            class283.method1922(-1, class215.field3501[arg1], arg0 ^ 0xFFFFD407);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 299)
    public class206() {
        class188 var1 = class34.field572.method956(5, 0, this);
        while (var1.field2980 == 0) {
            class4.method19(0, 10L);
        }
        if (var1.field2980 == 2) {
            throw new RuntimeException();
        }
        this.field3376 = (Thread) var1.field2977;
    }

    @OriginalMember(owner = "client!o", name = "run", descriptor = "()V", line = 172)
    public final void run() {
        field3358++;
        while (!this.field3373) {
            class48 var1 = this.field3370;
            class77 var2;
            synchronized (this.field3370) {
                var2 = (class77) this.field3370.method335(-91);
                if (var2 == null) {
                    try {
                        this.field3370.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3379--;
            }
            try {
                if (var2.field1099 == 2) {
                    var2.field1102.method221(false, (int) var2.field916, var2.field1094, var2.field1094.length);
                } else if (var2.field1099 == 3) {
                    var2.field1094 = var2.field1102.method222(10926, (int) var2.field916);
                }
            } catch (Exception var6) {
                class169.method1109(var6, (byte) -79, (String) null);
            }
            var2.field4823 = false;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lsd;II)Lvm;", line = 223)
    public final class77 method1392(class27 arg0, int arg1, int arg2) {
        field3363++;
        class77 var4 = new class77();
        var4.field1099 = 1;
        class48 var5 = this.field3370;
        synchronized (this.field3370) {
            class77 var6 = (class77) this.field3370.method333((byte) 102);
            while (true) {
                if (var6 == null) {
                    if (arg1 <= 37) {
                        this.run();
                    }
                    break;
                }
                if ((long) arg2 == var6.field916 && var6.field1102 == arg0 && var6.field1099 == 2) {
                    var4.field4823 = false;
                    var4.field1094 = var6.field1094;
                    return var4;
                }
                var6 = (class77) this.field3370.method329(-13985);
            }
        }
        var4.field1094 = arg0.method222(10926, arg2);
        var4.field4823 = false;
        var4.field4825 = true;
        return var4;
    }
}
