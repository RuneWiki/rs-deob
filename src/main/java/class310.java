import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class310 extends class45 {

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[La;")
    public class310[] field4941;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Z")
    public boolean field4940;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    public int field4948;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "Lwk;")
    public class118 field4950;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "Lel;")
    public class3 field4942;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "[I")
    public static int[] field4951;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V", line = 9)
    public final void method2197(int arg0, int arg1, int arg2) {
        field4954++;
        if (arg2 < 1) {
            this.method2197(-48, -18, 15);
        }
        int var4 = this.field4948 == 255 ? arg1 : this.field4948;
        if (this.field4940) {
            this.field4950 = new class118(var4, arg1, arg0);
        } else {
            this.field4942 = new class3(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lqm;II)V", line = 33)
    public void method75(class227 arg0, int arg1, int arg2) {
        if (arg1 != -2470) {
            this.field4948 = -58;
        }
        field4944++;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V", line = 43)
    public static void method2198(byte arg0) {
        if (arg0 != -66) {
            method2202(-9, (byte) 19);
        }
        field4951 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)[[I", line = 55)
    public int[][] method391(int arg0, boolean arg1) {
        field4947++;
        if (!arg1) {
            this.field4950 = (class118) null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(III)[[I", line = 70)
    public final int[][] method2199(int arg0, int arg1, int arg2) {
        if (arg0 != 21101) {
            return (int[][]) ((int[][]) null);
        }
        field4952++;
        if (!this.field4941[arg2].field4940) {
            return this.field4941[arg2].method391(arg1, true);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field4941[arg2].method77(arg1, arg0 ^ 0xFFFF9EB6);
        var4[0] = var5;
        var4[2] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIB)[I", line = 104)
    public final int[] method2200(int arg0, int arg1, byte arg2) {
        if (arg2 == 74) {
            field4936++;
            return this.field4941[arg0].field4940 ? this.field4941[arg0].method77(arg1, -13093) : this.field4941[arg0].method391(arg1, true)[0];
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[I", line = 129)
    public int[] method77(int arg0, int arg1) {
        field4943++;
        if (arg1 == -13093) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return (int[]) null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V", line = 140)
    public static final void method2201(int arg0, int arg1) {
        class319.field5080 = new int[arg0];
        if (arg1 != 32) {
            method2205((class171) null, -5, (class250) null, (String) null, 51, 23, -19, 17, 124, -95);
        }
        class298.field4777 = new int[arg0];
        class210.field3305 = new int[arg0];
        field4946++;
        class234.field3884 = new int[arg0];
        class21.field235 = new int[arg0];
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)La;", line = 162)
    public static final class310 method2202(int arg0, byte arg1) {
        field4945++;
        if (arg1 < 20) {
            return (class310) null;
        } else if (arg0 == 0) {
            return new class32();
        } else if (arg0 == 1) {
            return new class278();
        } else if (arg0 == 2) {
            return new class128();
        } else if (arg0 == 3) {
            return new class195();
        } else if (arg0 == 4) {
            return new class166();
        } else if (arg0 == 5) {
            return new class124();
        } else if (arg0 == 6) {
            return new class236();
        } else if (arg0 == 7) {
            return new class235();
        } else if (arg0 == 8) {
            return new class112();
        } else if (arg0 == 9) {
            return new class50();
        } else if (arg0 == 10) {
            return new class142();
        } else if (arg0 == 11) {
            return new class159();
        } else if (arg0 == 12) {
            return new class75();
        } else if (arg0 == 13) {
            return new class141();
        } else if (arg0 == 14) {
            return new class229();
        } else if (arg0 == 15) {
            return new class129();
        } else if (arg0 == 16) {
            return new class200();
        } else if (arg0 == 17) {
            return new class240();
        } else if (arg0 == 18) {
            return new class283();
        } else if (arg0 == 19) {
            return new class223();
        } else if (arg0 == 20) {
            return new class123();
        } else if (arg0 == 21) {
            return new class191();
        } else if (arg0 == 22) {
            return new class348();
        } else if (arg0 == 23) {
            return new class252();
        } else if (arg0 == 24) {
            return new class34();
        } else if (arg0 == 25) {
            return new class186();
        } else if (arg0 == 26) {
            return new class49();
        } else if (arg0 == 27) {
            return new class309();
        } else if (arg0 == 28) {
            return new class316();
        } else if (arg0 == 29) {
            return new class63();
        } else if (arg0 == 30) {
            return new class334();
        } else if (arg0 == 31) {
            return new class347();
        } else if (arg0 == 32) {
            return new class78();
        } else if (arg0 == 33) {
            return new class113();
        } else if (arg0 == 34) {
            return new class193();
        } else if (arg0 == 35) {
            return new class13();
        } else if (arg0 == 36) {
            return new class287();
        } else if (arg0 == 37) {
            return new class330();
        } else if (arg0 == 38) {
            return new class64();
        } else if (arg0 == 39) {
            return new class176();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(B)V", line = 482)
    public void method553(byte arg0) {
        field4938++;
        if (arg0 >= -82) {
            this.method75((class227) null, -124, -10);
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(III)V", line = 493)
    public static final void method2203(int arg0, int arg1, int arg2) {
        if (arg1 == 8) {
            arg1 = 4;
        }
        if (arg1 == 4 && !class193.field3083) {
            arg0 = 2;
            arg1 = 2;
        }
        field4935++;
        int var3 = -2 / ((arg2 + 61) / 63);
        if (class6.field46 != arg1) {
            if (class348.field5529) {
                return;
            }
            if (class6.field46 != 0) {
                class308.field4917[class6.field46].method18();
            }
            if (arg1 != 0) {
                class5 var4 = class308.field4917[arg1];
                var4.method21();
                var4.method19(arg0);
            }
            class54.field899 = arg0;
            class6.field46 = arg1;
        } else if (arg1 != 0 && class54.field899 != arg0) {
            class308.field4917[arg1].method19(arg0);
            class54.field899 = arg0;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)Ljg;", line = 542)
    public static final class352 method2204(int arg0, int arg1) {
        field4934++;
        class352 var2 = (class352) class137.field2273.method2147((byte) 24, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -19) {
            method2204(32, -122);
        }
        byte[] var3 = class13.field135.method472(arg1, 81, 5);
        class352 var4 = new class352();
        if (var3 != null) {
            var4.method2485(new class227(var3), 6);
        }
        class137.field2273.method2149(var4, -32563, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)I", line = 567)
    public int method2089(boolean arg0) {
        if (!arg0) {
            this.method553((byte) 110);
        }
        field4953++;
        return -1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ldf;ILwf;Ljava/lang/String;IIIIII)V", line = 578)
    public static final void method2205(class171 arg0, int arg1, class250 arg2, String arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4949++;
        int var10;
        if (class112.field1827 == 4) {
            var10 = (int) class261.field4396 & 0x7FF;
        } else {
            var10 = (int) class261.field4396 + class79.field1372 & 0x7FF;
        }
        int var11 = arg5 * arg5 + arg8 * arg8;
        int var12 = Math.max(arg2.field4081 / 2, arg2.field4157 / 2) + 10;
        if ((var12 * var12) < var11) {
            return;
        }
        int var13 = class153.field2438[var10];
        int var14 = class153.field2445[var10];
        if (class112.field1827 != 4) {
            var14 = var14 * 256 / (class4.field41 + 256);
            var13 = var13 * 256 / (class4.field41 + 256);
        }
        int var15 = arg0.method1330(arg3, 100);
        int var16 = arg5 * var13 + arg8 * var14 >> 16;
        int var17 = arg5 * var14 - (arg8 * var13) >> 16;
        int var18 = arg0.method1336(arg3, 100, 0);
        int var19 = var16 - var15 / 2;
        if (-arg2.field4081 > var19 || var19 > arg2.field4081 || var17 < -arg2.field4157 || var17 > arg2.field4157) {
            return;
        }
        if (class42.field607) {
            class244.method1864((class58) arg2.method1940((byte) 87, false));
        } else {
            class246.method1899(arg2.field4208, arg2.field4188);
        }
        arg0.method1345(arg3, arg2.field4081 / 2 + arg4 + var19, arg2.field4157 / 2 + -var17 + -arg6 + arg9 + -var18, var15, 50, arg7, 0, 256, 1, arg1, 0);
        if (class42.field607) {
            class244.method1867();
        } else {
            class246.method1898();
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I", line = 632)
    public int method1383(int arg0) {
        if (arg0 != 21076) {
            this.field4950 = (class118) null;
        }
        field4933++;
        return -1;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V", line = 649)
    public void method1388(int arg0) {
        if (this.field4940) {
            this.field4950.method929((byte) -50);
            this.field4950 = null;
        } else {
            this.field4942.method13(0);
            this.field4942 = null;
        }
        field4937++;
        int var2 = 116 / ((61 - arg0) / 41);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(IZ)V", line = 671)
    public class310(int arg0, boolean arg1) {
        this.field4941 = new class310[arg0];
        this.field4940 = arg1;
    }
}
