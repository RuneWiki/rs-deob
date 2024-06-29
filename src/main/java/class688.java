import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class688 implements Runnable {

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "Lth;")
    private class288 field9679 = new class288();

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public int field9689 = 0;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "Z")
    private boolean field9691 = false;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field9690;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "[I")
    public static int[] field9681 = new int[14];

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "[I")
    public static int[] field9676 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field9678;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public static int field9682;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
    public static int field9683;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public static int field9684;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    public static int field9685;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!mv", name = "r", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "[Lpt;")
    public static class411[] field9686;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)I", line = 3)
    public static final int method3801(int arg0, int arg1) {
        field9682++;
        return arg0 == -1365854454 ? arg1 >>> 10 : -95;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lat;II)Lbb;", line = 16)
    public final class421 method3802(class585 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field9676 = null;
        }
        field9683++;
        class421 var4 = new class421();
        var4.field2770 = false;
        var4.field5611 = arg0;
        var4.field8693 = arg2;
        var4.field5603 = 3;
        this.method3806(var4, arg1 - 113);
        return var4;
    }

    @OriginalMember(owner = "client!mv", name = "run", descriptor = "()V", line = 40)
    public final void run() {
        field9692++;
        while (!this.field9691) {
            class288 var1 = this.field9679;
            class421 var2;
            synchronized (this.field9679) {
                var2 = (class421) this.field9679.method1678(true);
                if (var2 == null) {
                    try {
                        this.field9679.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field9689--;
            }
            try {
                if (var2.field5603 == 2) {
                    var2.field5611.method3307(var2.field5606, (byte) -118, (int) var2.field8693, var2.field5606.length);
                } else if (var2.field5603 == 3) {
                    var2.field5606 = var2.field5611.method3309((int) var2.field8693, -21015);
                }
            } catch (Exception var6) {
                class333.method1923(var6, true, null);
            }
            var2.field2767 = false;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V", line = 85)
    public static void method3803(int arg0) {
        field9676 = null;
        field9681 = null;
        field9686 = null;
        if (arg0 >= -97) {
            field9678 = 63;
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V", line = 97)
    public final void method3804(int arg0) {
        field9680++;
        this.field9691 = true;
        class288 var2 = this.field9679;
        synchronized (this.field9679) {
            this.field9679.notifyAll();
        }
        try {
            this.field9690.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 <= 32) {
            this.field9691 = true;
        }
        this.field9690 = null;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILjava/lang/String;)I", line = 116)
    public static final int method3805(int arg0, String arg1) {
        field9684++;
        if (!class474.field6836.field6614) {
            return -1;
        } else if (class673.field9364.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class331.method1920(27893, arg1);
            if (var2 == null) {
                return -1;
            }
            String var3 = class79.field809 + var2;
            if (!class316.field3928.method3874("", (byte) -120, var3)) {
                return -1;
            } else if (class316.field3928.method3870(var3, 8081)) {
                byte[] var4 = class316.field3928.method3862("", var3, (byte) -128);
                Object var5 = null;
                File var6;
                try {
                    var6 = class195.method1184(22591, var2);
                    if (arg0 >= -67) {
                        field9687 = -60;
                    }
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class501.method2882(false, var6);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class474.field6836.method2666(false, var6, var4);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class147.method809(var6, arg1, (byte) 47);
                return 100;
            } else {
                return class316.field3928.method3880(var3, true);
            }
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lbb;I)V", line = 210)
    private final void method3806(class421 arg0, int arg1) {
        field9685++;
        class288 var3 = this.field9679;
        synchronized (this.field9679) {
            this.field9679.method1680(82, arg0);
            this.field9689++;
            if (arg1 < -55) {
                this.field9679.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BILat;[B)Lbb;", line = 232)
    public final class421 method3807(byte arg0, int arg1, class585 arg2, byte[] arg3) {
        field9675++;
        class421 var5 = new class421();
        var5.field5606 = arg3;
        var5.field5611 = arg2;
        var5.field5603 = 2;
        if (arg0 != 122) {
            this.field9690 = null;
        }
        var5.field8693 = arg1;
        var5.field2770 = false;
        this.method3806(var5, -106);
        return var5;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILat;)Lbb;", line = 251)
    public final class421 method3808(int arg0, int arg1, class585 arg2) {
        field9677++;
        class421 var4 = new class421();
        var4.field5603 = 1;
        class288 var5 = this.field9679;
        synchronized (this.field9679) {
            class421 var6 = (class421) this.field9679.method1677(-102);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field8693 && var6.field5611 == arg2 && var6.field5603 == 2) {
                    var4.field2767 = false;
                    var4.field5606 = var6.field5606;
                    return var4;
                }
                var6 = (class421) this.field9679.method1681(114);
            }
        }
        var4.field5606 = arg2.method3309(arg0, -21015);
        var4.field2767 = false;
        if (arg1 == -17853) {
            var4.field2770 = true;
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lpi;)V", line = 303)
    public class688(class464 arg0) {
        class88 var2 = arg0.method2668(this, 5, -108);
        while (var2.field884 == 0) {
            class452.method2602(10L, (byte) -97);
        }
        if (var2.field884 == 2) {
            throw new RuntimeException();
        }
        this.field9690 = (Thread) var2.field886;
    }
}
