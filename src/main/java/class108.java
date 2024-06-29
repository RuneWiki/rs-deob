import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class108 extends class149 {

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "Lvf;")
    public class296 field1837 = new class296();

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "Lbk;")
    public class59 field1844 = new class59();

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "Lpj;")
    private class173 field1840;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "Lmh;")
    private static class128 field1832 = class22.method156(126, "red:");

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "Lmh;")
    public static class128 field1834 = class22.method156(124, ":chalreq:");

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "Lmh;")
    public static class128 field1830 = field1832;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "[I")
    public static int[] field1839 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "Lmh;")
    public static class128 field1841 = class22.method156(127, "Schlie-8en");

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "Lmh;")
    public static class128 field1843 = field1832;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "Ldj;")
    public static class314 field1829;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IJ)V", line = 4)
    public static final void method660(int arg0, long arg1) {
        field1827++;
        if (arg1 == 0L) {
            return;
        }
        if (class218.field3847 >= 100) {
            class212.method1456(class276.field4777, 1, class273.field4733, 0);
            return;
        }
        class128 var3 = class260.method1827(true, arg1).method850(55);
        for (int var4 = 0; var4 < class218.field3847; var4++) {
            if (class208.field3646[var4] == arg1) {
                class212.method1456(class28.method177((byte) -62, new class128[] { var3, class165.field2829 }), 1, class273.field4733, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class214.field3779; var5++) {
            if (class34.field738[var5] == arg1) {
                class212.method1456(class28.method177((byte) -78, new class128[] { class64.field1240, var3, class58.field1118 }), 1, class273.field4733, 0);
                return;
            }
        }
        if (var3.method855(class163.field2796.field2079, 255)) {
            class212.method1456(class264.field4584, 1, class273.field4733, 0);
            return;
        }
        class81.field1458++;
        class208.field3646[class218.field3847] = arg1;
        if (arg0 <= -104) {
            class163.field2777[class218.field3847++] = class260.method1827(true, arg1);
            class208.field3708 = class104.field1788;
            class71.field1320.method570(96, -1);
            class71.field1320.method1344(60, arg1);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "([III)V", line = 68)
    public final void method392(int[] arg0, int arg1, int arg2) {
        this.field1844.method392(arg0, arg1, arg2);
        field1833++;
        for (class129 var4 = (class129) this.field1837.method2024(0); var4 != null; var4 = (class129) this.field1837.method2027(1211754408)) {
            if (!this.field1840.method1186(-82, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field2235 >= var5) {
                        this.method661(var5, arg0, var5 + var6, var6, -20485, var4);
                        var4.field2235 -= var5;
                        break;
                    }
                    this.method661(var4.field2235, arg0, var6 + var5, var6, -20485, var4);
                    var6 += var4.field2235;
                    var5 -= var4.field2235;
                } while (!this.field1840.method1167(arg0, var5, var6, var4, (byte) 70));
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[IIIILrh;)V", line = 110)
    private final void method661(int arg0, int[] arg1, int arg2, int arg3, int arg4, class129 arg5) {
        field1838++;
        if ((this.field1840.field3068[arg5.field2265] & 0x4) != 0 && arg5.field2249 < 0) {
            int var7 = this.field1840.field3057[arg5.field2265] / class10.field356;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field2247) / var7;
                if (var8 > arg0) {
                    arg5.field2247 += arg0 * var7;
                    break;
                }
                arg5.field2234.method392(arg1, arg3, var8);
                arg3 += var8;
                arg5.field2247 += var7 * var8 - 1048576;
                int var9 = class10.field356 / 100;
                arg0 -= var8;
                class251 var10 = arg5.field2234;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field1840.field3005[arg5.field2265] == 0) {
                    arg5.field2234 = class251.method1780(arg5.field2253, var10.method1782(), var10.method1779(), var10.method1754());
                } else {
                    arg5.field2234 = class251.method1780(arg5.field2253, var10.method1782(), 0, var10.method1754());
                    this.field1840.method1170((byte) 32, arg5, arg5.field2248.field898[arg5.field2240] < 0);
                    arg5.field2234.method1776(var9, var10.method1779());
                }
                if (arg5.field2248.field898[arg5.field2240] < 0) {
                    arg5.field2234.method1756(-1);
                }
                var10.method1769(var9);
                var10.method392(arg1, arg3, arg2 - arg3);
                if (var10.method1757()) {
                    this.field1844.method389(var10);
                }
            }
        }
        arg5.field2234.method392(arg1, arg3, arg0);
        if (arg4 != -20485) {
            this.field1840 = (class173) null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V", line = 195)
    public static void method662(byte arg0) {
        if (arg0 < 42) {
            field1843 = (class128) null;
        }
        field1832 = null;
        field1830 = null;
        field1834 = null;
        field1843 = null;
        field1841 = null;
        field1839 = null;
        field1829 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 211)
    public final void method388(int arg0) {
        this.field1844.method388(arg0);
        for (class129 var2 = (class129) this.field1837.method2024(0); var2 != null; var2 = (class129) this.field1837.method2027(1211754408)) {
            if (!this.field1840.method1186(108, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field2235 >= var3) {
                        this.method663(-1, var2, var3);
                        var2.field2235 -= var3;
                        break;
                    }
                    this.method663(-1, var2, var2.field2235);
                    var3 -= var2.field2235;
                } while (!this.field1840.method1167((int[]) null, var3, 0, var2, (byte) 70));
            }
        }
        field1836++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILrh;I)V", line = 247)
    private final void method663(int arg0, class129 arg1, int arg2) {
        field1835++;
        if (~(this.field1840.field3068[arg1.field2265] & 0x4) != arg0 && arg1.field2249 < 0) {
            int var4 = this.field1840.field3057[arg1.field2265] / class10.field356;
            int var5 = (var4 + 1048575 - arg1.field2247) / var4;
            arg1.field2247 = arg2 * var4 + arg1.field2247 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field1840.field3005[arg1.field2265] == 0) {
                    arg1.field2234 = class251.method1780(arg1.field2253, arg1.field2234.method1782(), arg1.field2234.method1779(), arg1.field2234.method1754());
                } else {
                    arg1.field2234 = class251.method1780(arg1.field2253, arg1.field2234.method1782(), 0, arg1.field2234.method1754());
                    this.field1840.method1170((byte) 32, arg1, arg1.field2248.field898[arg1.field2240] < 0);
                }
                if (arg1.field2248.field898[arg1.field2240] < 0) {
                    arg1.field2234.method1756(-1);
                }
                arg2 = arg1.field2247 / var4;
            }
        }
        arg1.field2234.method388(arg2);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()Lej;", line = 290)
    public final class149 method387() {
        field1842++;
        class129 var1 = (class129) this.field1837.method2024(0);
        if (var1 == null) {
            return null;
        } else if (var1.field2234 == null) {
            return this.method397();
        } else {
            return var1.field2234;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lpj;)V", line = 359)
    public class108(class173 arg0) {
        this.field1840 = arg0;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()I", line = 330)
    public final int method398() {
        field1828++;
        return 0;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "()Lej;", line = 338)
    public final class149 method397() {
        field1831++;
        class129 var1;
        do {
            var1 = (class129) this.field1837.method2027(1211754408);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2234 == null);
        return var1.field2234;
    }
}
