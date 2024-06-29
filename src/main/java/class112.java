import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class112 extends class33 {

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[J")
    private long[] field1901 = new long[10];

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    private int field1899 = 256;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    private int field1905 = 0;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    private int field1907 = 1;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "J")
    private long field1903 = class130.method935(false);

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field1900 = 0;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "J")
    public static long field1906 = 0L;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1895 = 0;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Lph;")
    public static class229 field1910 = class266.method1858("<)4col>", 0);

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    private int field1896;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V", line = 5)
    public static final void method853(int arg0, byte arg1) {
        if (arg1 <= 19) {
            field1900 = -23;
        }
        class281 var2 = class135.method957(0, arg0, 9);
        var2.method1933(0);
        field1908++;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V", line = 20)
    public static void method854(int arg0) {
        field1910 = null;
        if (arg0 != 7293) {
            method855(50, 7);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 37)
    public final void method278(int arg0) {
        int var2 = 0;
        if (arg0 != -22393) {
            return;
        }
        while (var2 < 10) {
            this.field1901[var2] = 0L;
            var2++;
        }
        field1911++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I", line = 57)
    public final int method277(int arg0, int arg1, int arg2) {
        field1898++;
        int var4 = this.field1899;
        this.field1899 = 300;
        int var5 = this.field1907;
        this.field1907 = 1;
        this.field1903 = class130.method935(false);
        if (this.field1901[this.field1896] == 0L) {
            this.field1907 = var5;
            this.field1899 = var4;
        } else if (this.field1903 > this.field1901[this.field1896]) {
            this.field1899 = (int) ((long) (arg1 * 2560) / (this.field1903 - this.field1901[this.field1896]));
        }
        if (this.field1899 < 25) {
            this.field1899 = 25;
        }
        if (this.field1899 > 256) {
            this.field1899 = 256;
            this.field1907 = (int) ((long) arg1 - ((this.field1903 - this.field1901[this.field1896]) / 10L));
        }
        if (this.field1907 > arg1) {
            this.field1907 = arg1;
        }
        this.field1901[this.field1896] = this.field1903;
        this.field1896 = (this.field1896 + 1) % 10;
        if (this.field1907 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1901[var6] != 0L) {
                    this.field1901[var6] -= -((long) this.field1907);
                }
            }
        }
        if (this.field1907 < arg2) {
            this.field1907 = arg2;
        }
        int var7 = 0;
        class288.method1976((byte) 67, (long) this.field1907);
        while (this.field1905 < 256) {
            this.field1905 += this.field1899;
            var7++;
        }
        int var8 = 3 % ((16 - arg0) / 56);
        this.field1905 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 232)
    public class112() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1901[var1] = this.field1903;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Z", line = 137)
    public static final boolean method855(int arg0, int arg1) {
        if (arg1 != 25) {
            field1910 = (class229) null;
        }
        field1904++;
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIILv;II)Lv;", line = 152)
    public static final class286 method856(int arg0, int arg1, int arg2, int arg3, class286 arg4, int arg5, int arg6) {
        field1897++;
        long var7 = (long) arg3;
        class286 var9 = (class286) class39.field614.method1413(var7, true);
        if (var9 == null) {
            class28 var10 = class28.method214(class281.field4649, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method193(64, 768, -50, -10, -50);
            class39.field614.method1419(var7, 5216, var9);
        }
        int var11 = 40 % ((-arg6 - 22) / 54);
        int var12 = arg4.method1729();
        int var13 = arg4.method1726();
        int var14 = arg4.method1723();
        int var15 = arg4.method1720();
        class286 var16 = var9.method1727(true, true);
        if (arg2 != 0) {
            var16.method1732(arg2);
        }
        if (class99.field1675) {
            class322 var19 = (class322) var16;
            if (class259.method1801(arg5 + var14, -20428, class298.field4849, arg1 + var12) != arg0 || class259.method1801(arg5 + var15, -20428, class298.field4849, arg1 + var13) != arg0) {
                for (int var20 = 0; var20 < var19.field5480; var20++) {
                    var19.field5461[var20] += class259.method1801(var19.field5459[var20] + arg5, -20428, class298.field4849, var19.field5448[var20] + arg1) - arg0;
                }
                var19.field5469.field1619 = false;
                var19.field5455.field58 = false;
            }
        } else {
            class246 var17 = (class246) var16;
            if (arg0 != class259.method1801(arg5 + var14, -20428, class298.field4849, arg1 + var12) || arg0 != class259.method1801(arg5 + var15, -20428, class298.field4849, arg1 + var13)) {
                for (int var18 = 0; var18 < var17.field4060; var18++) {
                    var17.field4080[var18] += class259.method1801(var17.field4068[var18] + arg5, -20428, class298.field4849, var17.field4072[var18] + arg1) - arg0;
                }
                var17.field4067 = false;
            }
        }
        return var16;
    }
}
