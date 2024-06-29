import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class133 extends class218 {

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    private int field1836;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    private int field1820;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    private int field1825;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    private int field1830;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    private int field1839;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    private int field1829;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    private int field1833;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    private int field1823;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "J")
    public static long field1832 = 0L;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "[I")
    public static int[] field1838 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "Ldh;")
    public static class179 field1826 = new class179(50);

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V", line = 6)
    public static void method880(byte arg0) {
        if (arg0 <= -63) {
            field1838 = null;
            field1826 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)V", line = 29)
    public final void method881(byte arg0, int arg1, int arg2) {
        if (arg0 <= 96) {
            this.field1836 = -110;
        }
        field1824++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V", line = 40)
    public final void method882(int arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            return;
        }
        int var4 = this.field1830 * arg1 >> 12;
        int var5 = this.field1836 * arg0 >> 12;
        field1834++;
        int var6 = this.field1823 * arg0 >> 12;
        int var7 = this.field1833 * arg1 >> 12;
        int var8 = this.field1825 * arg1 >> 12;
        int var9 = this.field1839 * arg1 >> 12;
        int var10 = this.field1829 * arg0 >> 12;
        int var11 = this.field1820 * arg0 >> 12;
        class286.method2047(this.field3071, var7, var6, var8, arg2 ^ 0x4F54, var5, var10, var9, var11, var4);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I", line = 69)
    public static final int method883(int arg0) {
        field1822++;
        int var1 = -39 / ((52 - arg0) / 40);
        return 2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)V", line = 79)
    public final void method884(int arg0, int arg1, boolean arg2) {
        field1831++;
        if (arg2) {
            this.field1839 = 4;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)Lfj;", line = 91)
    public static final class254 method885(boolean arg0, int arg1) {
        field1837++;
        class254 var2 = (class254) class314.field4844.method1562(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class179.field2592.method1199(28815, arg1 & 0x7FFF, 0);
        } else {
            var3 = class43.field505.method1199(28815, arg1, 0);
        }
        class254 var4 = new class254();
        if (!arg0) {
            method880((byte) 33);
        }
        if (var3 != null) {
            var4.method1849(-1, new class107(var3));
        }
        if (arg1 >= 32768) {
            var4.method1847((byte) 127);
        }
        class314.field4844.method1565((long) arg1, var4, (byte) -117);
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 130)
    public static final String method886(long arg0, byte arg1) {
        int var3 = 10 % ((-arg1 - 75) / 32);
        field1828++;
        return class248.method1783(arg0, 0);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V", line = 139)
    public static final void method887(int arg0, int arg1) {
        class213.field2998.method1236(-495037017, arg1);
        field1826.method1236(-495037017, arg1);
        class301.field4689.method1236(-495037017, arg1);
        field1840++;
        if (arg0 >= -126) {
            field1832 = -49L;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 155)
    public class133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1836 = arg1;
        this.field1820 = arg7;
        this.field1825 = arg4;
        this.field1830 = arg0;
        this.field1839 = arg6;
        this.field1829 = arg5;
        this.field1833 = arg2;
        this.field1823 = arg3;
    }
}
