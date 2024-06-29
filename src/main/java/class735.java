import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class735 {

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "Z")
    public boolean field10242 = false;

    @OriginalMember(owner = "client!sia", name = "q", descriptor = "Lfc;")
    private class262 field10256 = new class262(64);

    @OriginalMember(owner = "client!sia", name = "t", descriptor = "Lfc;")
    public class262 field10259 = new class262(500);

    @OriginalMember(owner = "client!sia", name = "w", descriptor = "Lfc;")
    public class262 field10262 = new class262(30);

    @OriginalMember(owner = "client!sia", name = "y", descriptor = "Lfc;")
    public class262 field10264 = new class262(50);

    @OriginalMember(owner = "client!sia", name = "i", descriptor = "Z")
    public boolean field10248;

    @OriginalMember(owner = "client!sia", name = "g", descriptor = "Lni;")
    private class522 field10246;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "Lni;")
    public class522 field10240;

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "Lea;")
    public static class547 field10243 = new class547(29, 5);

    @OriginalMember(owner = "client!sia", name = "r", descriptor = "Llga;")
    public static class712 field10257 = new class712(47, 3);

    @OriginalMember(owner = "client!sia", name = "s", descriptor = "[I")
    public static int[] field10258 = new int[4];

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "I")
    public static int field10241;

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "I")
    public static int field10244;

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "I")
    public static int field10245;

    @OriginalMember(owner = "client!sia", name = "h", descriptor = "I")
    public static int field10247;

    @OriginalMember(owner = "client!sia", name = "k", descriptor = "I")
    public static int field10250;

    @OriginalMember(owner = "client!sia", name = "l", descriptor = "I")
    public static int field10251;

    @OriginalMember(owner = "client!sia", name = "m", descriptor = "I")
    public static int field10252;

    @OriginalMember(owner = "client!sia", name = "n", descriptor = "I")
    public static int field10253;

    @OriginalMember(owner = "client!sia", name = "o", descriptor = "I")
    public static int field10254;

    @OriginalMember(owner = "client!sia", name = "p", descriptor = "I")
    public static int field10255;

    @OriginalMember(owner = "client!sia", name = "u", descriptor = "I")
    public static int field10260;

    @OriginalMember(owner = "client!sia", name = "v", descriptor = "I")
    public static int field10261;

    @OriginalMember(owner = "client!sia", name = "z", descriptor = "I")
    public int field10265;

    @OriginalMember(owner = "client!sia", name = "x", descriptor = "Z")
    public static boolean field10263;

    @OriginalMember(owner = "client!sia", name = "j", descriptor = "[I")
    public static int[] field10249;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IB)Lvha;", line = 5)
    public final class685 method4109(int arg0, byte arg1) {
        field10250++;
        class262 var3 = this.field10256;
        class685 var4;
        synchronized (this.field10256) {
            if (arg1 != 119) {
                this.field10246 = null;
            }
            var4 = (class685) this.field10256.method1571(-125, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field10246;
        byte[] var6;
        synchronized (this.field10246) {
            var6 = this.field10246.method2885(class283.method1699(arg0, -119), class416.method2394(-1035933944, arg0), false);
        }
        class685 var7 = new class685();
        var7.field9541 = arg0;
        var7.field9571 = this;
        if (var6 != null) {
            var7.method3873(new class611(var6), false);
        }
        var7.method3888(118);
        if (!this.field10248 && var7.field9527) {
            var7.field9539 = null;
            var7.field9544 = null;
        }
        if (var7.field9567) {
            var7.field9568 = false;
            var7.field9611 = 0;
        }
        class262 var8 = this.field10256;
        synchronized (this.field10256) {
            this.field10256.method1574((long) arg0, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)V", line = 54)
    public final void method4110(byte arg0) {
        field10241++;
        class262 var2 = this.field10256;
        synchronized (this.field10256) {
            this.field10256.method1575((byte) -90);
        }
        if (arg0 <= 126) {
            return;
        }
        class262 var3 = this.field10259;
        synchronized (this.field10259) {
            this.field10259.method1575((byte) -105);
        }
        class262 var4 = this.field10262;
        synchronized (this.field10262) {
            this.field10262.method1575((byte) 99);
        }
        class262 var5 = this.field10264;
        synchronized (this.field10264) {
            this.field10264.method1575((byte) 8);
        }
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(IB)V", line = 78)
    public final void method4111(int arg0, byte arg1) {
        field10244++;
        class262 var3 = this.field10256;
        synchronized (this.field10256) {
            this.field10256.method1569((byte) 62, arg0);
        }
        class262 var4 = this.field10259;
        synchronized (this.field10259) {
            this.field10259.method1569((byte) 62, arg0);
        }
        class262 var5 = this.field10262;
        synchronized (this.field10262) {
            this.field10262.method1569((byte) 62, arg0);
        }
        if (arg1 > 36) {
            class262 var6 = this.field10264;
            synchronized (this.field10264) {
                this.field10264.method1569((byte) 62, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(B)V", line = 102)
    public final void method4112(byte arg0) {
        field10254++;
        class262 var2 = this.field10256;
        synchronized (this.field10256) {
            this.field10256.method1563(72);
            int var3 = -76 % ((arg0 - 40) / 60);
        }
        class262 var4 = this.field10259;
        synchronized (this.field10259) {
            this.field10259.method1563(103);
        }
        class262 var5 = this.field10262;
        synchronized (this.field10262) {
            this.field10262.method1563(119);
        }
        class262 var6 = this.field10264;
        synchronized (this.field10264) {
            this.field10264.method1563(123);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)V", line = 124)
    public final void method4113(int arg0, int arg1) {
        field10255++;
        if (arg0 != -129) {
            field10260 = -114;
        }
        this.field10256 = new class262(arg1);
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V", line = 142)
    public static void method4114(int arg0) {
        field10257 = null;
        field10258 = null;
        field10243 = null;
        if (arg0 > -91) {
            method4114(92);
        }
        field10249 = null;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZI)V", line = 155)
    public final void method4115(boolean arg0, int arg1) {
        field10247++;
        if (this.field10242 == arg0) {
            return;
        }
        this.field10242 = arg0;
        this.method4112((byte) 100);
        if (arg1 <= 18) {
            this.field10262 = null;
        }
    }

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "(IB)Z", line = 174)
    public static final boolean method4116(int arg0, byte arg1) {
        field10245++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            return false;
        } else if (var2 >= 128 && var2 < 160 && class488.field6684[var2 - 128] == '\u0000') {
            return false;
        } else {
            if (arg0 > -116) {
                field10261 = 55;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(ZI)V", line = 202)
    public final void method4117(boolean arg0, int arg1) {
        field10251++;
        this.field10265 = arg1;
        class262 var3 = this.field10259;
        synchronized (this.field10259) {
            this.field10259.method1563(91);
        }
        class262 var4 = this.field10262;
        synchronized (this.field10262) {
            this.field10262.method1563(102);
            if (!arg0) {
                field10252 = 125;
            }
        }
        class262 var5 = this.field10264;
        synchronized (this.field10264) {
            this.field10264.method1563(14);
        }
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lrga;IZLni;Lni;)V", line = 268)
    public class735(class242 arg0, int arg1, boolean arg2, class522 arg3, class522 arg4) {
        this.field10248 = arg2;
        this.field10246 = arg3;
        this.field10240 = arg4;
        if (this.field10246 != null) {
            int var6 = this.field10246.method2892((byte) -11) - 1;
            this.field10246.method2901(0, var6);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(BZ)V", line = 227)
    public final void method4118(byte arg0, boolean arg1) {
        int var3 = 35 % ((-arg0 - 83) / 39);
        field10253++;
        if (arg1 != this.field10248) {
            this.field10248 = arg1;
            this.method4112((byte) 123);
        }
    }
}
