import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class161 {

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lra;")
    private class179 field1875 = new class179();

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field1877 = 0;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lbb;")
    public static class270 field1871 = new class270();

    @OriginalMember(owner = "client!p", name = "m", descriptor = "[I")
    public static int[] field1878 = new int[256];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lra;")
    private class179 field1876;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1878[var0] = var1;
        }
        new class72(" days.", " Tage.", " jours.", " dias.");
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 3)
    public final void method1021(int arg0) {
        while (true) {
            class179 var2 = this.field1875.field2085;
            if (this.field1875 == var2) {
                field1874++;
                this.field1876 = null;
                if (arg0 != 20791) {
                    field1877 = -24;
                    return;
                }
                return;
            }
            var2.method1123((byte) -31);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)I", line = 27)
    public final int method1022(int arg0) {
        field1866++;
        int var2 = arg0;
        for (class179 var3 = this.field1875.field2085; var3 != this.field1875; var3 = var3.field2085) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)Lra;", line = 46)
    public final class179 method1023(int arg0) {
        int var2 = 42 % ((arg0 - 12) / 45);
        field1873++;
        class179 var3 = this.field1876;
        if (this.field1875 == var3) {
            this.field1876 = null;
            return null;
        } else {
            this.field1876 = var3.field2085;
            return var3;
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)Lra;", line = 67)
    public final class179 method1024(int arg0) {
        field1872++;
        class179 var2 = this.field1875.field2085;
        if (this.field1875 == var2) {
            return null;
        }
        var2.method1123((byte) -31);
        if (arg0 != 256) {
            field1867 = 59;
        }
        return var2;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V", line = 90)
    public static void method1025(boolean arg0) {
        if (arg0) {
            field1871 = null;
            field1878 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BZII)I", line = 107)
    public static final int method1026(byte arg0, boolean arg1, int arg2, int arg3) {
        field1868++;
        class391 var4 = class70.method415(Integer.MIN_VALUE, arg2, arg1);
        int var5 = 46 % ((arg0 + 22) / 38);
        if (var4 == null) {
            return 0;
        } else if (arg3 >= 0 && var4.field5332.length > arg3) {
            return var4.field5332[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)Lra;", line = 131)
    public final class179 method1027(int arg0) {
        field1869++;
        if (arg0 != -20578) {
            field1877 = -53;
        }
        class179 var2 = this.field1875.field2085;
        if (this.field1875 == var2) {
            this.field1876 = null;
            return null;
        } else {
            this.field1876 = var2.field2085;
            return var2;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 177)
    public class161() {
        this.field1875.field2085 = this.field1875;
        this.field1875.field2089 = this.field1875;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLra;)V", line = 160)
    public final void method1028(byte arg0, class179 arg1) {
        field1870++;
        if (arg1.field2089 != null) {
            arg1.method1123((byte) -31);
        }
        arg1.field2085 = this.field1875;
        arg1.field2089 = this.field1875.field2089;
        if (arg0 != 33) {
            field1867 = 98;
        }
        arg1.field2089.field2085 = arg1;
        arg1.field2085.field2089 = arg1;
    }
}
