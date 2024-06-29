import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class125 {

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Ld;")
    private class242 field1867 = new class242(256);

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lum;")
    private class83 field1868;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field1864 = 0;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Lpu;")
    public static class179 field1873 = new class179("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "[[I")
    public static int[][] field1878 = new int[128][128];

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field1877 = -1;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBZI)I")
    public static final int method922(int arg0, byte arg1, boolean arg2, int arg3) {
        field1876++;
        class100 var4 = class48.method323(arg1 + 2147483594, arg2, arg3);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && var4.field1532.length > arg0) {
            if (arg1 != 54) {
                field1877 = -114;
            }
            return var4.field1532[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
    public static final void method923(int arg0, int arg1) {
        if (arg0 != -25967) {
            field1878 = null;
        }
        field1866++;
        class188 var2 = class10.method48((byte) 35, 6, arg1);
        var2.method1306(arg0 + 2839);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method924(int arg0) {
        if (arg0 != -1023760408) {
            method924(-49);
        }
        field1873 = null;
        field1878 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I")
    public static final int method925(int arg0, int arg1, int arg2) {
        field1865++;
        int var3 = arg1 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        int var6 = -89 / ((-arg2 - 10) / 33);
        return (((arg0 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg0 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)Lng;")
    public final class166 method926(int arg0, int arg1) {
        field1869++;
        class242 var3 = this.field1867;
        class166 var4;
        synchronized (this.field1867) {
            var4 = (class166) this.field1867.method1634((long) arg1, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field1868;
        byte[] var6;
        synchronized (this.field1868) {
            var6 = this.field1868.method731(0, arg1, 26);
        }
        class166 var7 = new class166();
        if (var6 != null) {
            var7.method1184(new class194(var6), (byte) 81);
        }
        class242 var8 = this.field1867;
        synchronized (this.field1867) {
            this.field1867.method1623((long) arg1, 17621, var7);
        }
        int var9 = 60 % ((arg0 - 37) / 47);
        return var7;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method927(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1871++;
        class193.method1331(arg7, arg2, arg5, arg1, (byte) 120, arg4, arg3, arg0, 0, arg8);
        if (arg6 >= -18) {
            field1864 = 45;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public final void method928(int arg0) {
        if (arg0 != 6297) {
            this.field1867 = null;
        }
        class242 var2 = this.field1867;
        synchronized (this.field1867) {
            this.field1867.method1637((byte) 13);
        }
        field1875++;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)V")
    public final void method929(int arg0, int arg1) {
        if (arg0 < 70) {
            this.field1868 = null;
        }
        field1872++;
        class242 var3 = this.field1867;
        synchronized (this.field1867) {
            this.field1867.method1631(arg1, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public final void method930(byte arg0) {
        field1874++;
        class242 var2 = this.field1867;
        synchronized (this.field1867) {
            if (arg0 == 119) {
                this.field1867.method1630(-89);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lum;Z)V")
    public static final void method931(class83 arg0, boolean arg1) {
        if (!arg1) {
            class444.field6614 = arg0.method737("titlebg", -1);
            field1870++;
            class264.field4223 = arg0.method737("logo", -1);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lpt;ILum;)V")
    public class125(class308 arg0, int arg1, class83 arg2) {
        this.field1868 = arg2;
        this.field1868.method748(26, 12408);
    }
}
