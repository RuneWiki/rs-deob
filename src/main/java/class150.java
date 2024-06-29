import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class150 {

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Lvi;")
    private class560 field1889 = new class560(64);

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "Lvi;")
    public class560 field1896 = new class560(64);

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Lpq;")
    private class159 field1891;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Lpq;")
    public class159 field1892;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field1886 = 0;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Z")
    public static boolean field1885 = false;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "[I")
    public static int[] field1894 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Lrp;")
    public static class280 field1893;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Ler;")
    public static class528 field1888;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V", line = 5)
    public final void method1011(int arg0, int arg1, int arg2) {
        if (arg1 != 34) {
            this.field1891 = null;
        }
        field1887++;
        this.field1889 = new class560(arg2);
        this.field1896 = new class560(arg0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 18)
    public final void method1012(int arg0) {
        field1890++;
        class560 var2 = this.field1889;
        synchronized (this.field1889) {
            this.field1889.method3142(false);
        }
        class560 var3 = this.field1896;
        synchronized (this.field1896) {
            this.field1896.method3142(false);
            if (arg0 >= -89) {
                this.method1011(-96, -69, -61);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)Lft;", line = 37)
    public final class677 method1013(int arg0, byte arg1) {
        field1895++;
        class560 var3 = this.field1889;
        class677 var4;
        synchronized (this.field1889) {
            var4 = (class677) this.field1889.method3134((long) arg0, -116);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field1891;
        byte[] var6;
        synchronized (this.field1891) {
            var6 = this.field1891.method1087(34, arg0, 1);
        }
        class677 var7 = new class677();
        int var8 = 90 / ((arg1 + 9) / 50);
        var7.field9603 = this;
        if (var6 != null) {
            var7.method3744((byte) 17, new class138(var6));
        }
        class560 var9 = this.field1889;
        synchronized (this.field1889) {
            this.field1889.method3130((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 71)
    public static void method1014(byte arg0) {
        field1894 = null;
        field1893 = null;
        if (arg0 >= -56) {
            field1894 = null;
        }
        field1888 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V", line = 85)
    public final void method1015(byte arg0, int arg1) {
        field1884++;
        if (arg0 >= -114) {
            this.field1896 = null;
        }
        class560 var3 = this.field1889;
        synchronized (this.field1889) {
            this.field1889.method3129(arg1, 14583);
        }
        class560 var4 = this.field1896;
        synchronized (this.field1896) {
            this.field1896.method3129(arg1, 14583);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V", line = 111)
    public final void method1016(byte arg0) {
        field1883++;
        class560 var2 = this.field1889;
        synchronized (this.field1889) {
            if (arg0 >= -14) {
                this.field1896 = null;
            }
            this.field1889.method3144(true);
        }
        class560 var3 = this.field1896;
        synchronized (this.field1896) {
            this.field1896.method3144(true);
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Luea;ILpq;Lpq;)V", line = 144)
    public class150(class484 arg0, int arg1, class159 arg2, class159 arg3) {
        this.field1891 = arg2;
        this.field1892 = arg3;
        this.field1891.method1076(34, 0);
    }
}
