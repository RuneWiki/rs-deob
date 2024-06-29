import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class124 extends class127 {

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "Lsf;")
    public class33 field2230 = new class33();

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "Ln;")
    public class61 field2231 = new class61();

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "Lbh;")
    private class2 field2227;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "[Z")
    public static boolean[] field2223 = new boolean[8];

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public static int field2228 = -1;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "Lia;")
    public static class257 field2229 = class28.method234(-104, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "Lia;")
    public static class257 field2226 = class28.method234(90, "loc)3dat");

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
    public static void method863(byte arg0) {
        field2226 = null;
        if (arg0 > 47) {
            field2229 = null;
            field2223 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "()I")
    public final int method37() {
        field2217++;
        return 0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lbc;III[II)V")
    private final void method864(class102 arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
        if (arg3 != -30016) {
            return;
        }
        if ((this.field2227.field34[arg0.field1876] & 0x4) != 0 && arg0.field1900 < 0) {
            int var7 = this.field2227.field32[arg0.field1876] / class134.field2399;
            while (true) {
                int var8 = (1048575 - (arg0.field1884 - var7)) / var7;
                if (var8 > arg5) {
                    arg0.field1884 += arg5 * var7;
                    break;
                }
                arg5 -= var8;
                arg0.field1877.method12(arg4, arg1, var8);
                int var9 = class134.field2399 / 100;
                arg1 += var8;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                arg0.field1884 += var7 * var8 - 1048576;
                class4 var11 = arg0.field1877;
                if (this.field2227.field76[arg0.field1876] == 0) {
                    arg0.field1877 = class4.method65(arg0.field1889, var11.method79(), var11.method85(), var11.method50());
                } else {
                    arg0.field1877 = class4.method65(arg0.field1889, var11.method79(), 0, var11.method50());
                    this.field2227.method5(arg0.field1888.field4354[arg0.field1895] < 0, -830550266, arg0);
                    arg0.field1877.method83(var9, var11.method85());
                }
                if (arg0.field1888.field4354[arg0.field1895] < 0) {
                    arg0.field1877.method77(-1);
                }
                var11.method82(var9);
                var11.method12(arg4, arg1, arg2 - arg1);
                if (var11.method81()) {
                    this.field2231.method461(var11);
                }
            }
        }
        field2221++;
        arg0.field1877.method12(arg4, arg1, arg5);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lia;I)V")
    public static final void method865(class257 arg0, int arg1) {
        class194.field3290 = arg0;
        field2216++;
        if (class72.field1404.field1855 == null) {
            return;
        }
        try {
            class257 var2 = class12.field238.method1692(class72.field1404.field1855, (byte) -69);
            class257 var3 = class242.field4198.method1692(class72.field1404.field1855, (byte) 73);
            class257 var4 = class233.method1528(new class257[] { var2, class233.field4023, arg0, class151.field2612, var3 }, 0);
            class257 var5;
            if (arg0.method1679((byte) -60) == 0) {
                var5 = class233.method1528(new class257[] { var4, class206.field3539 }, 0);
            } else {
                var5 = class233.method1528(new class257[] { var4, class259.field4503, class94.method689(10, class80.method600(arg1 ^ 0x41AC) + 94608000000L), class80.field1564, class39.method321(11901, 94608000L) }, 0);
            }
            class233.method1528(new class257[] { class248.field4275, var5, class170.field2928 }, 0).method1701(class72.field1404.field1855, (byte) 104);
            if (arg1 != -16770) {
                field2229 = null;
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lk;Z)Lag;")
    public static final class259 method866(class152 arg0, boolean arg1) {
        field2218++;
        class259 var2 = new class259();
        var2.field4496 = arg0.method1063(-17162);
        var2.field4505 = class38.method307(32768, var2.field4496);
        return arg1 ? null : var2;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "()Lr;")
    public final class127 method24() {
        field2224++;
        class102 var1;
        do {
            var1 = (class102) this.field2230.method277(1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1877 == null);
        return var1.field1877;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
    public final void method40(int arg0) {
        field2219++;
        this.field2231.method40(arg0);
        for (class102 var2 = (class102) this.field2230.method288(26111); var2 != null; var2 = (class102) this.field2230.method277(1)) {
            if (!this.field2227.method19(var2, 3)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1905) {
                        this.method867(0, var2, var3);
                        var2.field1905 -= var3;
                        break;
                    }
                    this.method867(0, var2, var2.field1905);
                    var3 -= var2.field1905;
                } while (!this.field2227.method23(0, true, (int[]) null, var3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()Lr;")
    public final class127 method27() {
        field2222++;
        class102 var1 = (class102) this.field2230.method288(26111);
        if (var1 == null) {
            return null;
        } else if (var1.field1877 == null) {
            return this.method24();
        } else {
            return var1.field1877;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([III)V")
    public final void method12(int[] arg0, int arg1, int arg2) {
        field2220++;
        this.field2231.method12(arg0, arg1, arg2);
        for (class102 var4 = (class102) this.field2230.method288(26111); var4 != null; var4 = (class102) this.field2230.method277(1)) {
            if (!this.field2227.method19(var4, 125)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field1905 >= var5) {
                        this.method864(var4, var6, var6 + var5, -30016, arg0, var5);
                        var4.field1905 -= var5;
                        break;
                    }
                    this.method864(var4, var6, var5 + var6, -30016, arg0, var4.field1905);
                    var6 += var4.field1905;
                    var5 -= var4.field1905;
                } while (!this.field2227.method23(var6, true, arg0, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILbc;I)V")
    private final void method867(int arg0, class102 arg1, int arg2) {
        if ((this.field2227.field34[arg1.field1876] & 0x4) != arg0 && arg1.field1900 < 0) {
            int var4 = this.field2227.field32[arg1.field1876] / class134.field2399;
            int var5 = (var4 + 1048575 - arg1.field1884) / var4;
            arg1.field1884 = arg2 * var4 + arg1.field1884 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field2227.field76[arg1.field1876] == 0) {
                    arg1.field1877 = class4.method65(arg1.field1889, arg1.field1877.method79(), arg1.field1877.method85(), arg1.field1877.method50());
                } else {
                    arg1.field1877 = class4.method65(arg1.field1889, arg1.field1877.method79(), 0, arg1.field1877.method50());
                    this.field2227.method5(arg1.field1888.field4354[arg1.field1895] < 0, -830550266, arg1);
                }
                if (arg1.field1888.field4354[arg1.field1895] < 0) {
                    arg1.field1877.method77(-1);
                }
                arg2 = arg1.field1884 / var4;
            }
        }
        arg1.field1877.method40(arg2);
        field2225++;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lbh;)V")
    public class124(class2 arg0) {
        this.field2227 = arg0;
    }
}
