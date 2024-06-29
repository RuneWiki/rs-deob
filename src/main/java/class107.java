import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class107 extends class81 {

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Z")
    public boolean field1897;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "[Lde;")
    public class107[] field1919;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Lpj;")
    public static class237 field1898 = class33.method353("gelb:", 100);

    @OriginalMember(owner = "client!de", name = "y", descriptor = "Lpj;")
    public static class237 field1905 = class33.method353("Wordpack geladen)3", 62);

    @OriginalMember(owner = "client!de", name = "F", descriptor = "Lpj;")
    public static class237 field1912 = class33.method353("(U4", 97);

    @OriginalMember(owner = "client!de", name = "J", descriptor = "Lpj;")
    public static class237 field1916 = class33.method353("Ausw-=hlen", 102);

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "Lhb;")
    public class207 field1921;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Lfa;")
    public static class239 field1900;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Lb;")
    public class82 field1903;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "[Lgk;")
    public static class154[] field1907;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)[[I")
    public int[][] method240(byte arg0, int arg1) {
        field1911++;
        int var3 = -78 / ((26 - arg0) / 45);
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(BI)[I")
    public int[] method123(byte arg0, int arg1) {
        field1904++;
        if (arg0 == -17) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public void method793(byte arg0) {
        field1910++;
        if (this.field1897) {
            this.field1921.method1390(-117);
            this.field1921 = null;
        } else {
            this.field1903.method635((byte) 113);
            this.field1903 = null;
        }
        if (arg0 > -21) {
            this.field1906 = 127;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BZ)V")
    public static final void method794(byte arg0, boolean arg1) {
        class182.field3209 = 99;
        class233.field4029 = new int[104];
        class54.field1130 = new int[104];
        field1901++;
        if (arg0 >= -58) {
            method795(89);
        }
        class65.field1294 = new int[104];
        class64.field1284 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class70.field1386 = new int[var2][105][105];
        class3.field26 = new byte[var2][104][104];
        class25.field446 = new byte[var2][104][104];
        class218.field3766 = new byte[var2][104][104];
        class185.field3250 = new byte[var2][104][104];
        class148.field2639 = new byte[var2][105][105];
        class204.field3496 = new int[104];
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public static final void method795(int arg0) {
        field1899++;
        Container var1;
        if (class24.field433 != null) {
            var1 = class24.field433;
        } else if (class43.field946 == null) {
            var1 = class268.field4572.field1306;
        } else {
            var1 = class43.field946;
        }
        class170.field2976 = var1.getSize().width;
        class231.field3976 = var1.getSize().height;
        if (class43.field946 == var1) {
            Insets var2 = class43.field946.getInsets();
            class231.field3976 -= var2.top + var2.bottom;
            class170.field2976 -= var2.right + var2.left;
        }
        if (arg0 <= class37.method381(arg0 - 2)) {
            class129.field2255 = 0;
            class142.field2585 = class170.field2976;
            class119.field2087 = class231.field3976;
            class245.field4296 = 0;
        } else {
            class129.field2255 = (class170.field2976 - 765) / 2;
            class245.field4296 = 0;
            class119.field2087 = 503;
            class142.field2585 = 765;
        }
        class20.field379.setSize(class142.field2585, class119.field2087);
        if (class43.field946 == var1) {
            Insets var3 = class43.field946.getInsets();
            class20.field379.setLocation(class129.field2255 + var3.left, class245.field4296 + var3.top);
        } else {
            class20.field379.setLocation(class129.field2255, class245.field4296);
        }
        if (class84.field1573 != -1) {
            class101.method769((byte) -128, true);
        }
        class256.method1737(arg0 + 15373);
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)I")
    public int method796(int arg0) {
        if (arg0 >= -65) {
            return 91;
        } else {
            field1918++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIB)[I")
    public final int[] method797(int arg0, int arg1, byte arg2) {
        field1917++;
        int var4 = -40 % ((arg2 - 46) / 43);
        return this.field1919[arg0].field1897 ? this.field1919[arg0].method123((byte) -17, arg1) : this.field1919[arg0].method240((byte) 98, arg1)[0];
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    public static void method798(byte arg0) {
        field1898 = null;
        field1916 = null;
        field1900 = null;
        field1912 = null;
        if (arg0 == -98) {
            field1907 = null;
            field1905 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
    public static final void method799(byte arg0) {
        if (arg0 != 119) {
            method794((byte) -81, true);
        }
        field1908++;
        class174.field3043.method942(arg0 - 119);
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)I")
    public int method800(int arg0) {
        field1920++;
        return arg0 == 6249 ? -1 : 89;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IZ)V")
    public class107(int arg0, boolean arg1) {
        this.field1897 = arg1;
        this.field1919 = new class107[arg0];
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lie;II)V")
    public void method122(class32 arg0, int arg1, int arg2) {
        if (arg2 != -32513) {
            field1900 = null;
        }
        field1913++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BII)V")
    public final void method801(byte arg0, int arg1, int arg2) {
        if (arg0 <= 120) {
            field1898 = null;
        }
        int var4 = this.field1906 == 255 ? arg1 : this.field1906;
        if (this.field1897) {
            this.field1921 = new class207(var4, arg1, arg2);
        } else {
            this.field1903 = new class82(var4, arg1, arg2);
        }
        field1914++;
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
    public void method124(int arg0) {
        if (arg0 != 31) {
            this.method802(44, 84, -114);
        }
        field1902++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)[[I")
    public final int[][] method802(int arg0, int arg1, int arg2) {
        if (arg0 != 3) {
            return null;
        }
        field1896++;
        if (this.field1919[arg2].field1897) {
            int[] var4 = this.field1919[arg2].method123((byte) -17, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1919[arg2].method240((byte) -66, arg1);
        }
    }
}
