import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class612 {

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "Z")
    public boolean field8898 = false;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "Laj;")
    private class287 field8900 = new class287(64);

    @OriginalMember(owner = "client!dv", name = "t", descriptor = "Laj;")
    public class287 field8917 = new class287(500);

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "Laj;")
    public class287 field8918 = new class287(30);

    @OriginalMember(owner = "client!dv", name = "v", descriptor = "Laj;")
    public class287 field8919 = new class287(50);

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "Z")
    public boolean field8915;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "Lom;")
    private class344 field8908;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "Lom;")
    public class344 field8904;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "Z")
    public static boolean field8902 = false;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "Lsb;")
    public static class266 field8901 = new class266(5, -1);

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "Lqfa;")
    public static class85 field8914 = new class85(56, 4);

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!dv", name = "w", descriptor = "I")
    public int field8920;

    @OriginalMember(owner = "client!dv", name = "s", descriptor = "Ldaa;")
    public static class11 field8916;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)V")
    public static final void method3511(boolean arg0) {
        field8905++;
        if (!class65.field1435) {
            return;
        }
        if (!arg0) {
            field8902 = true;
        }
        class545 var1 = class183.method1339(class437.field6303, (byte) 117, class273.field4094);
        if (var1 != null && var1.field7605 != null) {
            class476 var2 = new class476();
            var2.field6842 = var1.field7605;
            var2.field6850 = var1;
            class683.method3847(var2);
        }
        class65.field1435 = false;
        class153.field2604 = -1;
        class139.field2461 = -1;
        if (var1 != null) {
            class531.method3088(var1, (byte) 49);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZ)V")
    public final void method3512(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method3520(51);
        }
        field8911++;
        if (this.field8898 != arg1) {
            this.field8898 = arg1;
            this.method3516(arg0 + 500);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IB)V")
    public final void method3513(int arg0, byte arg1) {
        this.field8900 = new class287(arg0);
        if (arg1 == -78) {
            field8907++;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
    public final void method3514(byte arg0) {
        field8909++;
        if (arg0 != 56) {
            return;
        }
        class287 var2 = this.field8900;
        synchronized (this.field8900) {
            this.field8900.method1912(-2552);
        }
        class287 var3 = this.field8917;
        synchronized (this.field8917) {
            this.field8917.method1912(-2552);
        }
        class287 var4 = this.field8918;
        synchronized (this.field8918) {
            this.field8918.method1912(arg0 - 2608);
        }
        class287 var5 = this.field8919;
        synchronized (this.field8919) {
            this.field8919.method1912(-2552);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)Lbd;")
    public final class56 method3515(int arg0, int arg1) {
        if (arg1 != 50) {
            this.field8918 = null;
        }
        field8906++;
        class287 var3 = this.field8900;
        class56 var4;
        synchronized (this.field8900) {
            var4 = (class56) this.field8900.method1900((long) arg0, -81);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field8908;
        byte[] var6;
        synchronized (this.field8908) {
            var6 = this.field8908.method2216(class277.method1833(arg1 - 50, arg0), class494.method2958(arg0, -127), true);
        }
        class56 var7 = new class56();
        var7.field1272 = arg0;
        var7.field1275 = this;
        if (var6 != null) {
            var7.method659(new class61(var6), 32185);
        }
        var7.method664((byte) 123);
        if (!this.field8915 && var7.field1254) {
            var7.field1309 = null;
            var7.field1237 = null;
        }
        if (var7.field1305) {
            var7.field1288 = 0;
            var7.field1276 = false;
        }
        class287 var8 = this.field8900;
        synchronized (this.field8900) {
            this.field8900.method1904(var7, (long) arg0, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public final void method3516(int arg0) {
        field8903++;
        class287 var2 = this.field8900;
        synchronized (this.field8900) {
            this.field8900.method1913(true);
            if (arg0 != 500) {
                this.field8904 = null;
            }
        }
        class287 var3 = this.field8917;
        synchronized (this.field8917) {
            this.field8917.method1913(true);
        }
        class287 var4 = this.field8918;
        synchronized (this.field8918) {
            this.field8918.method1913(true);
        }
        class287 var5 = this.field8919;
        synchronized (this.field8919) {
            this.field8919.method1913(true);
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(IZ)V")
    public final void method3517(int arg0, boolean arg1) {
        if (!arg1) {
            this.field8900 = null;
        }
        field8899++;
        class287 var3 = this.field8900;
        synchronized (this.field8900) {
            this.field8900.method1908(arg0, (byte) -11);
        }
        class287 var4 = this.field8917;
        synchronized (this.field8917) {
            this.field8917.method1908(arg0, (byte) -11);
        }
        class287 var5 = this.field8918;
        synchronized (this.field8918) {
            this.field8918.method1908(arg0, (byte) -11);
        }
        class287 var6 = this.field8919;
        synchronized (this.field8919) {
            this.field8919.method1908(arg0, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(II)V")
    public final void method3518(int arg0, int arg1) {
        this.field8920 = arg0;
        field8912++;
        class287 var3 = this.field8917;
        synchronized (this.field8917) {
            this.field8917.method1913(true);
        }
        class287 var4 = this.field8918;
        synchronized (this.field8918) {
            this.field8918.method1913(true);
            if (arg1 != -13456) {
                this.method3514((byte) 75);
            }
        }
        class287 var5 = this.field8919;
        synchronized (this.field8919) {
            this.field8919.method1913(true);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIII)V")
    public static final void method3519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8913++;
        if (arg5 != 4) {
            field8901 = null;
        }
        int var10002 = arg5 ^ 0x7684;
        int var10 = arg2 + 1;
        class705.method3938(arg1, arg4, var10002, arg3, class582.field8429[arg2]);
        int var9 = arg0 - 1;
        class705.method3938(arg1, arg4, 30336, arg3, class582.field8429[arg0]);
        for (int var6 = var10; var6 <= var9; var6++) {
            int[] var7 = class582.field8429[var6];
            var7[arg3] = var7[arg1] = arg4;
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
    public static void method3520(int arg0) {
        field8916 = null;
        field8901 = null;
        if (arg0 != -32260) {
            field8916 = null;
        }
        field8914 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(BZ)V")
    public final void method3521(byte arg0, boolean arg1) {
        field8910++;
        if (arg1 == this.field8915) {
            return;
        }
        this.field8915 = arg1;
        this.method3516(500);
        if (arg0 != 20) {
            this.method3512(-52, true);
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lmea;IZLom;Lom;)V")
    public class612(class398 arg0, int arg1, boolean arg2, class344 arg3, class344 arg4) {
        this.field8915 = arg2;
        this.field8908 = arg3;
        this.field8904 = arg4;
        if (this.field8908 != null) {
            int var6 = this.field8908.method2245(0) - 1;
            this.field8908.method2236(var6, 0);
        }
    }
}
