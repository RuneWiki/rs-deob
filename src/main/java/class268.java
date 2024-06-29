import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class268 extends class238 {

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "Loa;")
    public class262 field4671 = new class262();

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "Lji;")
    public class228 field4676 = new class228();

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Lhk;")
    private class33 field4666;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Lmb;")
    public static class96 field4661 = class243.method1708("", (byte) 98);

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "Lmb;")
    public static class96 field4669 = class243.method1708(": ", (byte) 120);

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field4655 = 0;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static volatile int field4664 = 0;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
    public static final void method1834(boolean arg0) {
        class137.field2450.method83(0);
        if (!arg0) {
            field4665 = -81;
        }
        field4662++;
        class24.field405.method83(0);
        class138.field2459.method83(0);
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public static final void method1835(int arg0) {
        int var1 = 33 % ((arg0 + 6) / 44);
        field4658++;
        class118.field2196++;
        class140.field2505.method1012((byte) -124, 136);
        class140.field2505.method1668(0L, -119);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILva;I)V")
    private final void method1836(int arg0, class181 arg1, int arg2) {
        field4663++;
        if ((this.field4666.field533[arg1.field3144] & 0x4) != arg0 && arg1.field3137 < 0) {
            int var4 = this.field4666.field560[arg1.field3144] / class139.field2490;
            int var5 = (var4 + 1048575 - arg1.field3129) / var4;
            arg1.field3129 = arg2 * var4 + arg1.field3129 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field4666.field545[arg1.field3144] == 0) {
                    arg1.field3132 = class72.method515(arg1.field3134, arg1.field3132.method502(), arg1.field3132.method494(), arg1.field3132.method522());
                } else {
                    arg1.field3132 = class72.method515(arg1.field3134, arg1.field3132.method502(), 0, arg1.field3132.method522());
                    this.field4666.method214(arg1, arg1.field3125.field2460[arg1.field3150] < 0, (byte) -118);
                }
                if (arg1.field3125.field2460[arg1.field3150] < 0) {
                    arg1.field3132.method527(-1);
                }
                arg2 = arg1.field3129 / var4;
            }
        }
        arg1.field3132.method235(arg2);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([III)V")
    public final void method255(int[] arg0, int arg1, int arg2) {
        this.field4676.method255(arg0, arg1, arg2);
        field4657++;
        for (class181 var4 = (class181) this.field4671.method1811(2); var4 != null; var4 = (class181) this.field4671.method1810(false)) {
            if (!this.field4666.method256(var4, -26299)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field3153) {
                        this.method1837(var5, arg0, var4, var5 + var6, -591, var6);
                        var4.field3153 -= var5;
                        break;
                    }
                    this.method1837(var4.field3153, arg0, var4, var6 + var5, -591, var6);
                    var5 -= var4.field3153;
                    var6 += var4.field3153;
                } while (!this.field4666.method221(-39, var6, arg0, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public final void method235(int arg0) {
        field4673++;
        this.field4676.method235(arg0);
        for (class181 var2 = (class181) this.field4671.method1811(2); var2 != null; var2 = (class181) this.field4671.method1810(false)) {
            if (!this.field4666.method256(var2, -26299)) {
                int var3 = arg0;
                do {
                    if (var2.field3153 >= var3) {
                        this.method1836(0, var2, var3);
                        var2.field3153 -= var3;
                        break;
                    }
                    this.method1836(0, var2, var2.field3153);
                    var3 -= var2.field3153;
                } while (!this.field4666.method221(-35, 0, (int[]) null, var3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()Lck;")
    public final class238 method237() {
        field4672++;
        class181 var1 = (class181) this.field4671.method1811(2);
        if (var1 == null) {
            return null;
        } else if (var1.field3132 == null) {
            return this.method225();
        } else {
            return var1.field3132;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()Lck;")
    public final class238 method225() {
        field4674++;
        class181 var1;
        do {
            var1 = (class181) this.field4671.method1810(false);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3132 == null);
        return var1.field3132;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[ILva;III)V")
    private final void method1837(int arg0, int[] arg1, class181 arg2, int arg3, int arg4, int arg5) {
        if ((this.field4666.field533[arg2.field3144] & 0x4) != 0 && arg2.field3137 < 0) {
            int var7 = this.field4666.field560[arg2.field3144] / class139.field2490;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field3129) / var7;
                if (arg0 < var8) {
                    arg2.field3129 += arg0 * var7;
                    break;
                }
                arg0 -= var8;
                arg2.field3132.method255(arg1, arg5, var8);
                int var9 = class139.field2490 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class72 var11 = arg2.field3132;
                arg5 += var8;
                arg2.field3129 += var7 * var8 - 1048576;
                if (this.field4666.field545[arg2.field3144] == 0) {
                    arg2.field3132 = class72.method515(arg2.field3134, var11.method502(), var11.method494(), var11.method522());
                } else {
                    arg2.field3132 = class72.method515(arg2.field3134, var11.method502(), 0, var11.method522());
                    this.field4666.method214(arg2, arg2.field3125.field2460[arg2.field3150] < 0, (byte) -96);
                    arg2.field3132.method520(var9, var11.method494());
                }
                if (arg2.field3125.field2460[arg2.field3150] < 0) {
                    arg2.field3132.method527(-1);
                }
                var11.method525(var9);
                var11.method255(arg1, arg5, arg3 - arg5);
                if (var11.method504()) {
                    this.field4676.method1554(var11);
                }
            }
        }
        field4668++;
        if (arg4 == -591) {
            arg2.field3132.method255(arg1, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
    public static final void method1838(int arg0) {
        class100.field1704 = new class107[class108.field2009.method40((byte) 126)][];
        int var1 = 72 / ((30 - arg0) / 60);
        field4667++;
        class154.field2715 = new boolean[class108.field2009.method40((byte) 125)];
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)V")
    public static void method1839(boolean arg0) {
        field4669 = null;
        if (!arg0) {
            field4661 = null;
        }
        field4661 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZII)I")
    public static final int method1840(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field4659++;
        if (var4 == 0) {
            return arg0;
        }
        if (arg1) {
            field4655 = -74;
        }
        if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)I")
    public static final int method1841(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field4669 = null;
        }
        field4670++;
        if (arg1 > arg3) {
            return arg1;
        } else if (arg0 >= arg3) {
            return arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()I")
    public final int method224() {
        field4656++;
        return 0;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    public static final void method1842(int arg0) {
        if (arg0 > -113) {
            field4655 = 54;
        }
        field4675++;
        class31.field491.method96(false);
        class91.field1504.method96(false);
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lhk;)V")
    public class268(class33 arg0) {
        this.field4666 = arg0;
    }
}
