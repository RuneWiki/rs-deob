import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class99 extends class32 {

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "[I")
    public int[] field1822 = new int[1];

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "[I")
    public int[] field1829 = new int[] { -1 };

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Lpe;")
    public static class100 field1821 = new class100(64);

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field1827 = 0;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Lij;")
    public static class50 field1826 = class78.method578(123, "rect_debug=");

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Lij;")
    public static class50 field1823 = class78.method578(121, ")3)3)3");

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "[Lwi;")
    public static class21[] field1825 = new class21[256];

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "[Lij;")
    public static class50[] field1830 = new class50[8];

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field1828 = 3;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "J")
    public static long field1824;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "[Ljd;")
    public static class85[] field1832;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lii;B)V")
    public static final void method756(class183 arg0, byte arg1) {
        class151.field2629 = arg0;
        if (arg1 < 122) {
            method756((class183) null, (byte) 90);
        }
        field1831++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static final void method757(byte arg0) {
        field1819++;
        int var1 = class243.field4234 * 128 + 64;
        int var2 = class224.field3772 * 128 + 64;
        int var3 = class187.method1260((byte) 108, var1, var2, class201.field3312) - class249.field4328;
        if (class69.field1317 >= 100) {
            class32.field644 = class243.field4234 * 128 + 64;
            class1.field15 = class224.field3772 * 128 + 64;
            class129.field2268 = class187.method1260((byte) 64, class32.field644, class1.field15, class201.field3312) - class249.field4328;
        } else {
            if (class32.field644 < var1) {
                class32.field644 += (var1 - class32.field644) * class69.field1317 / 1000 + class29.field607;
                if (class32.field644 > var1) {
                    class32.field644 = var1;
                }
            }
            if (var3 > class129.field2268) {
                class129.field2268 += class29.field607 + ((var3 - class129.field2268) * class69.field1317 / 1000);
                if (var3 < class129.field2268) {
                    class129.field2268 = var3;
                }
            }
            if (class1.field15 < var2) {
                class1.field15 += (var2 - class1.field15) * class69.field1317 / 1000 + class29.field607;
                if (class1.field15 > var2) {
                    class1.field15 = var2;
                }
            }
            if (var1 < class32.field644) {
                class32.field644 -= class29.field607 + ((class32.field644 - var1) * class69.field1317 / 1000);
                if (var1 > class32.field644) {
                    class32.field644 = var1;
                }
            }
            if (var3 < class129.field2268) {
                class129.field2268 -= class29.field607 + ((class129.field2268 - var3) * class69.field1317 / 1000);
                if (var3 > class129.field2268) {
                    class129.field2268 = var3;
                }
            }
            if (class1.field15 > var2) {
                class1.field15 -= (class1.field15 - var2) * class69.field1317 / 1000 + class29.field607;
                if (var2 > class1.field15) {
                    class1.field15 = var2;
                }
            }
        }
        int var4 = class109.field1963 * 128 + 64;
        int var5 = class174.field2914 * 128 + 64;
        int var6 = class187.method1260((byte) 60, var5, var4, class201.field3312) - class137.field2371;
        int var7 = var6 - class129.field2268;
        int var8 = var4 - class1.field15;
        int var9 = var5 - class32.field644;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        if (class221.field3723 < var11) {
            class221.field3723 += (var11 - class221.field3723) * class43.field789 / 1000 + class106.field1915;
            if (class221.field3723 > var11) {
                class221.field3723 = var11;
            }
        }
        if (var11 < class221.field3723) {
            class221.field3723 -= class106.field1915 + ((class221.field3723 - var11) * class43.field789 / 1000);
            if (var11 > class221.field3723) {
                class221.field3723 = var11;
            }
        }
        int var13 = var12 - class68.field1286;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class68.field1286 += class43.field789 * var13 / 1000 + class106.field1915;
            class68.field1286 &= 0x7FF;
        }
        if (var13 < 0) {
            class68.field1286 -= class106.field1915 + (-var13 * class43.field789 / 1000);
            class68.field1286 &= 0x7FF;
        }
        int var14 = var12 - class68.field1286;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (arg0 <= -76 && var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class68.field1286 = var12;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public static void method758(int arg0) {
        field1825 = null;
        field1830 = null;
        field1832 = null;
        field1821 = null;
        if (arg0 != 1000) {
            field1825 = null;
        }
        field1826 = null;
        field1823 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILce;)Z")
    public static final boolean method759(int arg0, class10 arg1) {
        field1818++;
        if (arg1.field221 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field221.length; var2++) {
            int var3 = class194.method1312(arg1, 100, var2);
            int var4 = arg1.field211[var2];
            if (arg1.field221[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field221[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field221[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 != 128) {
            method757((byte) -118);
        }
        return true;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILce;)Lij;")
    public static final class50 method760(int arg0, int arg1, class10 arg2) {
        field1820++;
        if (!class22.method177(77, client.method605(arg2), arg0) && arg2.field240 == null) {
            return null;
        } else if (arg2.field199 == null || arg2.field199.length <= arg0 || arg2.field199[arg0] == null || arg2.field199[arg0].method399(false).method396(1) == 0) {
            return class126.field2206 ? class80.method589(new class50[] { class89.field1702, class78.method579(arg0, -26225) }, 28743) : null;
        } else {
            if (arg1 > -45) {
                method757((byte) 68);
            }
            return arg2.field199[arg0];
        }
    }
}
