import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class263 implements Runnable {

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Ltb;")
    private class69 field4685 = new class69();

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Z")
    private boolean field4686 = false;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public int field4689 = 0;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field4687;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lid;")
    public static class149 field4672 = class60.method382("Interfaces charg-Bes", (byte) 27);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field4671 = 0;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Laj;")
    public static class47 field4677 = null;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Lid;")
    public static class149 field4688 = class60.method382("Chargement des sprites )2 ", (byte) 84);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Lfb;")
    public static class29 field4682;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public final void method1827(boolean arg0) {
        field4681++;
        if (arg0) {
            return;
        }
        this.field4686 = true;
        class69 var2 = this.field4685;
        synchronized (this.field4685) {
            this.field4685.notifyAll();
        }
        try {
            this.field4687.join();
        } catch (InterruptedException var3) {
        }
        this.field4687 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILch;)V")
    public static final void method1828(int arg0, class282 arg1) {
        if (arg0 > -26) {
            return;
        }
        for (int var2 = 0; var2 < class67.field1177.length; var2++) {
            class67.field1177[var2] = 0;
        }
        field4679++;
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class67.field1177[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class36.field532[var15] = (class67.field1177[var15 - 1] + class67.field1177[var15 - 128] + class67.field1177[var15 - -128] + class67.field1177[var15 + 1]) / 4;
                }
            }
            int[] var13 = class67.field1177;
            class67.field1177 = class36.field532;
            class36.field532 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field3600; var7++) {
            for (int var8 = 0; var8 < arg1.field3598; var8++) {
                if (arg1.field5000[var6++] != 0) {
                    int var9 = arg1.field3588 + var8 + 16;
                    int var10 = var7 + arg1.field3596 + 16;
                    int var11 = (var10 << 7) + var9;
                    class67.field1177[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILcg;)Lqc;")
    public final class63 method1829(int arg0, int arg1, class166 arg2) {
        field4683++;
        class63 var4 = new class63();
        var4.field1128 = arg0;
        class69 var5 = this.field4685;
        synchronized (this.field4685) {
            class63 var6 = (class63) this.field4685.method426(104);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg1 == var6.field3174 && var6.field1131 == arg2 && var6.field1128 == 2) {
                    var4.field987 = false;
                    var4.field1135 = var6.field1135;
                    return var4;
                }
                var6 = (class63) this.field4685.method438(true);
            }
        }
        var4.field1135 = arg2.method1214(65280, arg1);
        var4.field988 = true;
        var4.field987 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4680++;
        if ((arg4 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg3;
            arg3 = var7;
        }
        int var8 = arg6 & 0x3;
        if (arg0 != 0) {
            method1830(57, 26, 94, -3, 122, 91, 45);
        }
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg5;
        } else {
            return 7 + 1 - arg1 - arg3;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1831(int arg0) {
        field4677 = null;
        field4688 = null;
        if (arg0 != 1) {
            field4682 = null;
        }
        field4672 = null;
        field4682 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lcg;II)Lqc;")
    public final class63 method1832(class166 arg0, int arg1, int arg2) {
        field4678++;
        class63 var4 = new class63();
        var4.field1131 = arg0;
        var4.field988 = false;
        if (arg2 != 17427) {
            field4688 = null;
        }
        var4.field3174 = (long) arg1;
        var4.field1128 = 3;
        this.method1833(arg2 ^ 0xFFFFDE79, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILqc;)V")
    private final void method1833(int arg0, class63 arg1) {
        class69 var3 = this.field4685;
        synchronized (this.field4685) {
            this.field4685.method433(arg1, -225);
            if (arg0 != -26006) {
                return;
            }
            this.field4689++;
            this.field4685.notifyAll();
        }
        field4674++;
    }

    @OriginalMember(owner = "client!ca", name = "run", descriptor = "()V")
    public final void run() {
        field4676++;
        while (!this.field4686) {
            class69 var1 = this.field4685;
            class63 var2;
            synchronized (this.field4685) {
                var2 = (class63) this.field4685.method427((byte) -112);
                if (var2 == null) {
                    try {
                        this.field4685.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4689--;
            }
            try {
                if (var2.field1128 == 2) {
                    var2.field1131.method1211(var2.field1135.length, (int) var2.field3174, var2.field1135, (byte) 57);
                } else if (var2.field1128 == 3) {
                    var2.field1135 = var2.field1131.method1214(65280, (int) var2.field3174);
                }
            } catch (Exception var6) {
                class100.method720(var6, (String) null, 1);
            }
            var2.field987 = false;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILcg;I[B)Lqc;")
    public final class63 method1834(int arg0, class166 arg1, int arg2, byte[] arg3) {
        field4675++;
        class63 var5 = new class63();
        if (arg2 != -2127) {
            return null;
        }
        var5.field988 = false;
        var5.field1131 = arg1;
        var5.field3174 = (long) arg0;
        var5.field1128 = 2;
        var5.field1135 = arg3;
        this.method1833(-26006, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class263() {
        class187 var1 = class272.field4900.method175(2, this, 5);
        while (var1.field3358 == 0) {
            class151.method1074(-122, 10L);
        }
        if (var1.field3358 == 2) {
            throw new RuntimeException();
        }
        this.field4687 = (Thread) var1.field3357;
    }
}
