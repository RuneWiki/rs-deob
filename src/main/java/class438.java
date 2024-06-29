import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class438 {

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "Z")
    public boolean field6245 = false;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "Lfba;")
    private class348 field6241 = new class348(64);

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "Lfba;")
    public class348 field6256 = new class348(500);

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "Lfba;")
    public class348 field6259 = new class348(30);

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "Lfba;")
    public class348 field6260 = new class348(50);

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "Z")
    public boolean field6246;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "Lla;")
    private class423 field6251;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "Lla;")
    public class423 field6243;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "Lhr;")
    public static class57 field6242 = new class57(2, 2);

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "Z")
    public static boolean field6255 = false;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "Lhr;")
    public static class57 field6249 = new class57(7, 2);

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
    public static int field6258 = 0;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
    public int field6261;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V", line = 6)
    public final void method2676(byte arg0) {
        if (arg0 <= 41) {
            this.field6260 = null;
        }
        class348 var2 = this.field6241;
        synchronized (this.field6241) {
            this.field6241.method2219(-5300);
        }
        field6248++;
        class348 var3 = this.field6256;
        synchronized (this.field6256) {
            this.field6256.method2219(-5300);
        }
        class348 var4 = this.field6259;
        synchronized (this.field6259) {
            this.field6259.method2219(-5300);
        }
        class348 var5 = this.field6260;
        synchronized (this.field6260) {
            this.field6260.method2219(-5300);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZB)V", line = 31)
    public final void method2677(boolean arg0, byte arg1) {
        field6253++;
        if (arg0 == this.field6245) {
            return;
        }
        this.field6245 = arg0;
        this.method2683(60);
        if (arg1 != -45) {
            this.method2681(32, 65);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILtd;Laa;IIILqk;I)V", line = 51)
    public static final void method2678(int arg0, class515 arg1, class569 arg2, int arg3, int arg4, int arg5, class146 arg6, int arg7) {
        if (arg7 >= -52) {
            return;
        }
        field6257++;
        if (arg1 == null) {
            return;
        }
        int var8;
        if (class165.field2351 == 4) {
            var8 = (int) class680.field9668 & 0x3FFF;
        } else {
            var8 = (int) class680.field9668 + class225.field3350 & 0x3FFF;
        }
        int var9 = Math.max(arg6.field2016 / 2, arg6.field1997 / 2) + 10;
        int var10 = arg3 * arg3 + (arg4 * arg4);
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class125.field1736[var8];
        int var12 = class125.field1729[var8];
        if (class165.field2351 != 4) {
            var12 = var12 * 256 / (class17.field162 + 256);
            var11 = var11 * 256 / (class17.field162 + 256);
        }
        int var13 = arg3 * var12 + arg4 * var11 >> 14;
        int var14 = arg4 * var12 - (arg3 * var11) >> 14;
        arg1.method781(arg6.field2016 / 2 + arg0 + (var13 - arg1.method784() / 2), arg6.field1997 / 2 + arg5 - var14 + -(arg1.method780() / 2), arg2, arg0, arg5);
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lmp;IZLla;Lla;)V", line = 284)
    public class438(class315 arg0, int arg1, boolean arg2, class423 arg3, class423 arg4) {
        this.field6246 = arg2;
        this.field6251 = arg3;
        this.field6243 = arg4;
        if (this.field6251 != null) {
            int var6 = this.field6251.method2623(-1) - 1;
            this.field6251.method2616(var6, 0);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V", line = 103)
    public final void method2679(int arg0, int arg1) {
        class348 var3 = this.field6241;
        synchronized (this.field6241) {
            this.field6241.method2207(arg1, 1);
        }
        field6254++;
        class348 var4 = this.field6256;
        synchronized (this.field6256) {
            this.field6256.method2207(arg1, 1);
            if (arg0 != 2) {
                field6258 = 5;
            }
        }
        class348 var5 = this.field6259;
        synchronized (this.field6259) {
            this.field6259.method2207(arg1, arg0 - 1);
        }
        class348 var6 = this.field6260;
        synchronized (this.field6260) {
            this.field6260.method2207(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)Lrq;", line = 126)
    public final class482 method2680(int arg0, byte arg1) {
        field6247++;
        class348 var3 = this.field6241;
        class482 var4;
        synchronized (this.field6241) {
            var4 = (class482) this.field6241.method2216(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field6251;
        byte[] var6;
        synchronized (this.field6251) {
            var6 = this.field6251.method2600(0, class674.method3830(825638312, arg0), class73.method630((byte) -90, arg0));
        }
        class482 var7 = new class482();
        var7.field6958 = this;
        var7.field6965 = arg0;
        if (var6 != null) {
            var7.method2937((byte) 120, new class479(var6));
        }
        var7.method2941(0);
        if (var7.field6935) {
            var7.field6895 = 0;
            var7.field6910 = false;
        }
        if (!this.field6246 && var7.field6918) {
            var7.field6940 = null;
            var7.field6961 = null;
        }
        class348 var8 = this.field6241;
        synchronized (this.field6241) {
            if (arg1 < 83) {
                this.method2682((byte) 84, 31);
            }
            this.field6241.method2213((byte) -16, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)V", line = 177)
    public final void method2681(int arg0, int arg1) {
        this.field6241 = new class348(arg1);
        if (arg0 != 16383) {
            this.field6245 = true;
        }
        field6250++;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)V", line = 194)
    public final void method2682(byte arg0, int arg1) {
        this.field6261 = arg1;
        field6244++;
        class348 var3 = this.field6256;
        synchronized (this.field6256) {
            this.field6256.method2220(false);
            if (arg0 < 7) {
                field6242 = null;
            }
        }
        class348 var4 = this.field6259;
        synchronized (this.field6259) {
            this.field6259.method2220(false);
        }
        class348 var5 = this.field6260;
        synchronized (this.field6260) {
            this.field6260.method2220(false);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 214)
    public final void method2683(int arg0) {
        field6240++;
        class348 var2 = this.field6241;
        synchronized (this.field6241) {
            this.field6241.method2220(false);
        }
        int var3 = 71 % ((-arg0 - 64) / 40);
        class348 var4 = this.field6256;
        synchronized (this.field6256) {
            this.field6256.method2220(false);
        }
        class348 var5 = this.field6259;
        synchronized (this.field6259) {
            this.field6259.method2220(false);
        }
        class348 var6 = this.field6260;
        synchronized (this.field6260) {
            this.field6260.method2220(false);
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(ZB)V", line = 236)
    public final void method2684(boolean arg0, byte arg1) {
        field6252++;
        if (this.field6246 == arg0) {
            return;
        }
        if (arg1 < 14) {
            this.method2680(37, (byte) 34);
        }
        this.field6246 = arg0;
        this.method2683(-112);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)V", line = 258)
    public static void method2685(boolean arg0) {
        if (!arg0) {
            field6249 = null;
        }
        field6242 = null;
        field6249 = null;
    }
}
