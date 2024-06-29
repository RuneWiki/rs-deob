import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class139 {

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Lbh;")
    private class538 field1914 = new class538(64);

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Lbh;")
    public class538 field1915 = new class538(64);

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lwu;")
    public class557 field1907;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Lwu;")
    private class557 field1909;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "[I")
    public static int[] field1905 = new int[200];

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "F")
    public static float field1908;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lnaa;")
    public static class631 field1910;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 3)
    public final void method893(int arg0) {
        class538 var2 = this.field1914;
        synchronized (this.field1914) {
            if (arg0 != -32199) {
                field1908 = -0.18342951F;
            }
            this.field1914.method3210(false);
        }
        field1902++;
        class538 var3 = this.field1915;
        synchronized (this.field1915) {
            this.field1915.method3210(false);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)Z", line = 19)
    public static final boolean method894(int arg0, byte arg1) {
        field1906++;
        int var2 = -55 / ((arg1 + 20) / 60);
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)V", line = 30)
    public final void method895(byte arg0, int arg1) {
        int var3 = 20 / ((-arg0 - 6) / 53);
        class538 var4 = this.field1914;
        synchronized (this.field1914) {
            this.field1914.method3204((byte) -90, arg1);
        }
        field1903++;
        class538 var5 = this.field1915;
        synchronized (this.field1915) {
            this.field1915.method3204((byte) -78, arg1);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBLwn;)V", line = 45)
    public static final void method896(int arg0, byte arg1, class583 arg2) {
        if (arg1 >= -28) {
            method899((byte) 61);
        }
        class550.field7783 = false;
        field1913++;
        class724.field10204 = 0;
        class511.method3044(arg2, 2);
        class586.method3486((byte) 110, arg2);
        if (class550.field7783) {
            System.out.println("---endgpp---");
        }
        if (arg2.field330 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg2.field330 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBI)V", line = 68)
    public final void method897(int arg0, byte arg1, int arg2) {
        this.field1914 = new class538(arg0);
        field1911++;
        this.field1915 = new class538(arg2);
        if (arg1 != -77) {
            method901((byte) -36);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 90)
    public final void method898(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1904++;
        class538 var2 = this.field1914;
        synchronized (this.field1914) {
            this.field1914.method3202((byte) 127);
        }
        class538 var3 = this.field1915;
        synchronized (this.field1915) {
            this.field1915.method3202((byte) 127);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 109)
    public static void method899(byte arg0) {
        field1905 = null;
        if (arg0 != 124) {
            method901((byte) 42);
        }
        field1910 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Lpq;", line = 122)
    public final class403 method900(int arg0, int arg1) {
        field1901++;
        class538 var3 = this.field1914;
        class403 var4;
        synchronized (this.field1914) {
            var4 = (class403) this.field1914.method3200((long) arg1, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field1909;
        byte[] var6;
        synchronized (this.field1909) {
            var6 = this.field1909.method3322(34, arg1, (byte) 126);
        }
        class403 var7 = new class403();
        if (arg0 != -29491) {
            return null;
        }
        var7.field5593 = this;
        if (var6 != null) {
            var7.method2448(new class26(var6), arg0 ^ 0xFFFF8C9F);
        }
        class538 var8 = this.field1914;
        synchronized (this.field1914) {
            this.field1914.method3199((byte) 78, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)I", line = 156)
    public static final int method901(byte arg0) {
        field1912++;
        class545 var1 = class96.field1401;
        boolean var2 = false;
        if (class674.field9500.field5158.method1006(arg0 ^ 0x32) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class524.method3130(0, 0, null, 25632, var3, null);
        }
        long var4 = class224.method1457((byte) -62);
        if (arg0 != 50) {
            return -44;
        }
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method2110(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class224.method1457((byte) -62) - var4);
        var1.method3255(100, 100, 0, -16777216, (byte) 117, 0);
        if (var2) {
            var1.method3253(-6102);
        }
        return var7;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lwj;ILwu;Lwu;)V", line = 208)
    public class139(class121 arg0, int arg1, class557 arg2, class557 arg3) {
        this.field1907 = arg3;
        this.field1909 = arg2;
        this.field1909.method3333(34, 3443);
    }
}
