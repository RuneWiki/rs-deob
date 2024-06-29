import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class25 {

    @OriginalMember(owner = "client!aaa", name = "o", descriptor = "Leda;")
    private class14 field261 = new class14(256);

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "Lla;")
    private class422 field251;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "Lraa;")
    public static class353 field249 = null;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
    public static int field252 = 0;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "[I")
    public static int[] field254 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "F")
    public static float field257;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!aaa", name = "n", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field250++;
        if (arg1 > arg3) {
            for (int var5 = arg3; var5 < arg1; var5++) {
                class77.field1131[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg3; var6++) {
                class77.field1131[var6][arg0] = arg2;
            }
        }
        if (arg4 != 26) {
            method139(-34, -16, 127, -70, (byte) 57);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V", line = 40)
    public final void method138(int arg0) {
        class14 var2 = this.field261;
        synchronized (this.field261) {
            if (arg0 != 100) {
                return;
            }
            this.field261.method76(9);
        }
        field253++;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIIB)V", line = 54)
    public static final void method139(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = 60 % ((36 - arg4) / 42);
        field256++;
        class118 var6 = class86.method755(true, 8, arg3);
        var6.method933((byte) 100);
        var6.field1821 = arg0;
        var6.field1811 = arg2;
        var6.field1817 = arg1;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILofa;)Ljr;", line = 73)
    public static final class130 method140(int arg0, class301 arg1) {
        if (arg0 < 114) {
            return null;
        } else {
            field258++;
            int var2 = arg1.method1989((byte) -35);
            return new class130(var2);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V", line = 89)
    public static void method141(byte arg0) {
        if (arg0 != 23) {
            method146((byte) -14);
        }
        field249 = null;
        field254 = null;
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V", line = 100)
    public final void method142(int arg0) {
        field247++;
        class14 var2 = this.field261;
        synchronized (this.field261) {
            this.field261.method71((byte) 44);
        }
        if (arg0 != 7358) {
            method137(89, 99, 58, 53, 52);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IB)Ler;", line = 120)
    public final class297 method143(int arg0, byte arg1) {
        if (arg1 != -94) {
            method144((byte) -93);
        }
        field259++;
        class14 var3 = this.field261;
        class297 var4;
        synchronized (this.field261) {
            var4 = (class297) this.field261.method80((byte) -54, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field251;
        byte[] var6;
        synchronized (this.field251) {
            var6 = this.field251.method2624(0, 26, arg0);
        }
        class297 var7 = new class297();
        if (var6 != null) {
            var7.method1912(new class301(var6), (byte) -16);
        }
        class14 var8 = this.field261;
        synchronized (this.field261) {
            this.field261.method67((long) arg0, var7, -6772);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)I", line = 152)
    public static final int method144(byte arg0) {
        field255++;
        if ((double) class729.field10217 == 3.0D) {
            return 37;
        } else if ((double) class729.field10217 == 4.0D) {
            return 50;
        } else if ((double) class729.field10217 == 6.0D) {
            return 75;
        } else if ((double) class729.field10217 == 8.0D) {
            return 100;
        } else if (arg0 == -73) {
            return 200;
        } else {
            return -116;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BI)V", line = 180)
    public final void method145(byte arg0, int arg1) {
        class14 var3 = this.field261;
        synchronized (this.field261) {
            this.field261.method68(-16878, arg1);
        }
        field260++;
        if (arg0 <= 114) {
            method146((byte) -11);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(B)V", line = 193)
    public static final void method146(byte arg0) {
        class637.method3608((byte) 101);
        field248++;
        class32.field304 = false;
        if (arg0 <= 41) {
            method144((byte) 74);
        }
        class598.method3436(class713.field10029, class232.field3742, (byte) -123, class662.field9427, class677.field9542);
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lcr;ILla;)V", line = 215)
    public class25(class292 arg0, int arg1, class422 arg2) {
        this.field251 = arg2;
        this.field251.method2615(0, 26);
    }
}
