import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class196 extends class132 {

    @OriginalMember(owner = "client!ek", name = "yc", descriptor = "Z")
    public static boolean field3219 = true;

    @OriginalMember(owner = "client!ek", name = "lc", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!ek", name = "mc", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ek", name = "nc", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!ek", name = "oc", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ek", name = "qc", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!ek", name = "rc", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ek", name = "sc", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ek", name = "tc", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!ek", name = "uc", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!ek", name = "vc", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ek", name = "wc", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!ek", name = "xc", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!ek", name = "pc", descriptor = "Lsa;")
    public class118 field3210;

    @OriginalMember(owner = "client!ek", name = "zc", descriptor = "[[[I")
    public static int[][][] field3220;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BII)I", line = 6)
    public static final int method1434(byte arg0, int arg1, int arg2) {
        field3211++;
        if (arg0 <= 16) {
            field3220 = (int[][][]) ((int[][][]) null);
        }
        class227 var3 = (class227) class164.field2664.method1743((long) arg2, (byte) 99);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field3606.length) {
            return var3.field3606[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILkb;Lkb;)V", line = 26)
    public static final void method1435(int arg0, class39 arg1, class39 arg2) {
        class5.field51 = arg1;
        field3214++;
        if (arg0 != -1) {
            method1434((byte) -128, -50, -49);
        }
        class3.field22 = arg2;
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)Lha;", line = 42)
    public static final class318 method1436(int arg0) {
        field3215++;
        return arg0 == -16199 ? class124.field1855 : (class318) null;
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V", line = 55)
    public static void method1437(int arg0) {
        int var1 = -59 / ((arg0 + 73) / 34);
        field3220 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)Z", line = 67)
    public static final boolean method1438(int arg0, byte arg1) {
        field3218++;
        class255 var2 = class128.method874(120, arg0);
        if (var2 == null) {
            return false;
        } else if (class6.field62 == 1 || class6.field62 == 2 || class71.field917 == 2) {
            class94.field1452 = var2.field4049;
            class246.field3908 = var2.field4052;
            if (class71.field917 != 0) {
                class127.field1890 = class94.field1452 + 40000;
                class206.field3366 = class127.field1890;
                class130.field1920 = class94.field1452 + 50000;
            }
            return true;
        } else {
            String var3 = "";
            if (class147.field2204 != null) {
                var3 = "/p=" + class147.field2204;
            }
            String var4 = "";
            if (arg1 >= -4) {
                return true;
            }
            if (class71.field917 != 0) {
                var4 = ":" + (var2.field4049 + 7000);
            }
            String var5 = "http://" + var2.field4052 + var4 + "/l=" + class136.field2054 + "/a=" + class240.field3807 + var3 + "/j" + (class114.field1706 ? "1" : "0") + ",o" + (class242.field3844 ? "1" : "0") + ",a2,m" + (class152.field2329 ? "1" : "0");
            try {
                class320.field4997.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)I", line = 115)
    public final int method898(byte arg0) {
        field3209++;
        int var2 = 9 % ((arg0 - 38) / 42);
        if (this.field3210.field1786 != null) {
            class118 var3 = this.field3210.method819((byte) -9);
            if (var3 != null && var3.field1803 != -1) {
                return var3.field1803;
            }
        }
        return this.field1989;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLsa;)V", line = 137)
    public final void method1439(byte arg0, class118 arg1) {
        if (arg0 != 21) {
            return;
        }
        field3217++;
        this.field3210 = arg1;
        if (this.field1984 != null) {
            this.field1984.method1149();
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([J[Ljava/lang/Object;IBI)V", line = 152)
    public static final void method1440(long[] arg0, Object[] arg1, int arg2, byte arg3, int arg4) {
        if (arg4 < arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var9;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (var7 + ((long) (var10 & 0x1)) > arg0[var10]) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    Object var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var9;
            method1440(arg0, arg1, var6 - 1, (byte) -74, arg4);
            method1440(arg0, arg1, arg2, (byte) -74, var6 + 1);
        }
        field3208++;
        if (arg3 != -74) {
            method1436(80);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()I", line = 206)
    public final int method152() {
        field3212++;
        return this.field1997;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)Z", line = 216)
    public final boolean method911(int arg0) {
        field3213++;
        int var2 = 103 / ((arg0 - 28) / 63);
        return this.field3210 != null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V", line = 230)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3216++;
        if (this.field3210 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!ek", name = "finalize", descriptor = "()V", line = 246)
    protected final void finalize() {
        field3206++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIIIJILll;)V", line = 261)
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class167 arg10) {
        field3207++;
        if (this.field3210 == null) {
            return;
        }
        class80 var13 = this.field1968 != -1 && this.field2002 == 0 ? class37.method236(this.field1968, 20254) : null;
        class80 var14 = this.field1994 == -1 || this.field1994 == this.method899(true).field3354 && var13 != null ? null : class37.method236(this.field1994, 20254);
        class134 var15 = this.field3210.method826(119, var14, this.field1948, this.field1987, this.field2031, this.field2012, this.field1955, this.field1960, this.field1996, var13);
        if (var15 == null) {
            return;
        }
        this.field1997 = var15.method152();
        class118 var16 = this.field3210;
        if (var16.field1786 != null) {
            var16 = var16.method819((byte) -9);
        }
        if (class202.field3302 && var16.field1782) {
            class134 var17 = class19.method124(var14 == null ? this.field1948 : this.field1987, arg0, this.field3210.field1785, this.field1943, this.field1980, var15, this.field1944, 54, this.field3210.field1812, this.field3210.field1791, this.field1965, this.field3210.field1815, this.field3210.field1808, var14 == null ? var13 : var14);
            if (class186.field2991) {
                float var18 = class186.method1305();
                float var19 = class186.method1307();
                class186.method1284();
                class186.method1306(var18, var19 - 150.0F);
                var17.method153(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1984);
                class186.method1289();
                class186.method1306(var18, var19);
            } else {
                var17.method153(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1984);
            }
        }
        this.method908(var15, 100);
        this.method905(var15, arg0, false);
        class134 var20 = null;
        if (this.field2022 != -1 && this.field1957 != -1) {
            class20 var21 = class264.method1881((byte) 125, this.field2022);
            var20 = var21.method136(this.field1993, (byte) 80, this.field2024, this.field1957);
            if (var20 != null) {
                var20.method519(0, -this.field2010, 0);
                if (var21.field283) {
                    if (class98.field1497 != 0) {
                        var20.method520(class98.field1497);
                    }
                    if (class303.field4729 != 0) {
                        var20.method515(class303.field4729);
                    }
                    if (class327.field5091 != 0) {
                        var20.method519(0, class327.field5091, 0);
                    }
                }
            }
        }
        if (!class186.field2991) {
            if (var20 != null) {
                var15 = ((class76) var15).method559(var20);
            }
            if (this.field3210.field1808 == 1) {
                var15.field2042 = true;
            }
            var15.method153(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1984);
            return;
        }
        if (this.field3210.field1808 == 1) {
            var15.field2042 = true;
        }
        var15.method153(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1984);
        if (var20 != null) {
            if (this.field3210.field1808 == 1) {
                var20.field2042 = true;
            }
            var20.method153(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1984);
        }
    }
}
