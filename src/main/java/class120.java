import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class120 extends class313 {

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    private int field2071 = 0;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    private int field2075 = 2048;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    private int field2078 = 0;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
    private int field2089 = 4096;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    private int field2079 = 12288;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
    private int field2093 = 8192;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
    private int field2094 = 2048;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "[I")
    public static int[] field2072 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2077 = "Examine";

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field2082 = -1;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "J")
    public static long field2086 = 0L;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "Ljava/lang/String;")
    public static String field2085 = "Loading textures - ";

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "Ljava/awt/Frame;")
    public static Frame field2076;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)Z", line = 6)
    private final boolean method1015(int arg0, int arg1, byte arg2) {
        field2073++;
        int var4 = (arg0 + arg1) * this.field2079 >> 12;
        if (arg2 != 101) {
            field2086 = 50L;
        }
        int var5 = class209.field3548[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field2079;
        int var7 = (var6 << 12) / this.field2093;
        int var8 = this.field2089 * var7 >> 12;
        return var8 > arg0 - arg1 && -var8 < arg0 - arg1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIILie;)V", line = 24)
    public static final void method1016(int arg0, int arg1, int arg2, int arg3, class97 arg4) {
        field2091++;
        if (arg2 != 92) {
            method1017((byte) -66);
        }
        for (class261 var5 = (class261) class262.field4251.method2297(14204); var5 != null; var5 = (class261) class262.field4251.method2291(-85)) {
            if (var5.field4219 == arg1 && (arg0 * 128) == var5.field4230 && arg3 * 128 == var5.field4228 && var5.field4232.field1522 == arg4.field1522) {
                if (var5.field4229 != null) {
                    class1.field9.method1839(var5.field4229);
                    var5.field4229 = null;
                }
                if (var5.field4215 != null) {
                    class1.field9.method1839(var5.field4215);
                    var5.field4215 = null;
                }
                var5.method2195(-1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V", line = 68)
    public static final void method1017(byte arg0) {
        if (class59.field919.toLowerCase().indexOf("microsoft") == -1) {
            class239.field3910[47] = 73;
            class239.field3910[91] = 42;
            class239.field3910[46] = 72;
            class239.field3910[92] = 74;
            if (class59.field922 == null) {
                class239.field3910[192] = 58;
                class239.field3910[222] = 59;
            } else {
                class239.field3910[192] = 28;
                class239.field3910[222] = 58;
                class239.field3910[520] = 59;
            }
            class239.field3910[93] = 43;
            class239.field3910[61] = 27;
            class239.field3910[45] = 26;
            class239.field3910[44] = 71;
            class239.field3910[59] = 57;
        } else {
            class239.field3910[189] = 26;
            class239.field3910[222] = 59;
            class239.field3910[186] = 57;
            class239.field3910[188] = 71;
            class239.field3910[223] = 28;
            class239.field3910[192] = 58;
            class239.field3910[187] = 27;
            class239.field3910[220] = 74;
            class239.field3910[221] = 43;
            class239.field3910[191] = 73;
            class239.field3910[190] = 72;
            class239.field3910[219] = 42;
        }
        field2088++;
        int var1 = -56 / ((arg0 - 13) / 40);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V", line = 390)
    public class120() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)J", line = 122)
    public static final long method1018(boolean arg0) {
        if (!arg0) {
            method1020((byte) -120, 71);
        }
        field2092++;
        return class146.field2637.method822(32234);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 135)
    public static final void method1019(int arg0, String arg1, boolean arg2) {
        field2081++;
        if (arg0 != 23516) {
            return;
        }
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class241.field3926.method2236(arg1, 250);
        int var6 = var3 + 6;
        int var7 = class241.field3926.method2233(arg1, 250) * 13;
        if (class43.field680) {
            class169.method1337(var6 - var3, -var3 + var4, var5 + var3 + var3, var3 + var3 + var7, 0);
            class169.method1325(var6 - var3, var4 - var3, var3 + var3 + var5, var3 + var7 + var3, 16777215);
        } else {
            class47.method422(var6 - var3, -var3 + var4, var3 + var3 + var5, var7 - (-var3 - var3), 0);
            class47.method416(var6 - var3, -var3 + var4, var3 + var5 + var3, var7 - (-var3 - var3), 16777215);
        }
        class241.field3926.method2232(arg1, var6, var4, var5, var7, 16777215, -1, 1, 1, 0);
        class33.method300(var3 + var7 + var3, 11314, var4 - var3, var3 + var5 + var3, var6 - var3);
        if (!arg2) {
            class89.method781(var6, var5, var7, 0, var4);
        } else if (class43.field680) {
            class43.method385();
        } else {
            try {
                Graphics var8 = class42.field616.getGraphics();
                class256.field4119.method959(var8, 0, 0, (byte) 124);
            } catch (Exception var10) {
                class42.field616.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)I", line = 191)
    public static final int method1020(byte arg0, int arg1) {
        field2090++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0 >= -101) {
            method1018(false);
        }
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 207)
    public static final void method1021(String arg0, boolean arg1) {
        field2087++;
        if (class295.field4720 == null) {
            return;
        }
        int var2 = 0;
        if (!arg1) {
            return;
        }
        long var3 = class142.method1151(arg0, -113);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class295.field4720.length && class295.field4720[var2].field5062 != var3) {
            var2++;
        }
        if (class295.field4720.length > var2 && class295.field4720[var2] != null) {
            class215.field3608++;
            class341.field5443.method26(176, 7);
            class341.field5443.method2333(class295.field4720[var2].field5062, 64);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILpi;)V", line = 260)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg0 == 0) {
            this.field2075 = arg2.method2339((byte) -46);
        } else if (arg0 == 1) {
            this.field2078 = arg2.method2339((byte) -46);
        } else if (arg0 == 2) {
            this.field2071 = arg2.method2339((byte) -46);
        } else if (arg0 == 3) {
            this.field2094 = arg2.method2339((byte) -46);
        } else if (arg0 == 4) {
            this.field2079 = arg2.method2339((byte) -46);
        } else if (arg0 == 5) {
            this.field2089 = arg2.method2339((byte) -46);
        } else if (arg0 == 6) {
            this.field2093 = arg2.method2339((byte) -46);
        }
        if (arg1 != -17848) {
            method1017((byte) 90);
        }
        field2083++;
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V", line = 327)
    public static void method1022(int arg0) {
        if (arg0 != 0) {
            field2076 = (Frame) null;
        }
        field2072 = null;
        field2076 = null;
        field2077 = null;
        field2085 = null;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(III)Z", line = 344)
    private final boolean method1023(int arg0, int arg1, int arg2) {
        field2084++;
        int var4 = (arg1 - arg0) * this.field2079 >> 12;
        int var5 = class209.field3548[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field2079;
        if (arg2 != 25411) {
            this.method182(-85);
        }
        int var7 = (var6 << 12) / this.field2093;
        int var8 = this.field2089 * var7 >> 12;
        return var8 > arg0 + arg1 && (arg0 + arg1) > (-var8);
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V", line = 372)
    public final void method182(int arg0) {
        class154.method1238(0);
        field2080++;
        if (arg0 != 25833) {
            this.method185(-82, 69, (class336) null);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)[I", line = 397)
    public final int[] method111(int arg0, int arg1) {
        if (arg0 != 4) {
            return (int[]) null;
        }
        field2074++;
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int var4 = class1.field6[arg1] - 2048;
            for (int var5 = 0; var5 < class133.field2269; var5++) {
                int var6 = class8.field104[var5] - 2048;
                int var7 = this.field2094 + var4;
                int var8 = this.field2078 + var4;
                int var9 = var7 >= -2048 ? var7 : var7 + 4096;
                int var10 = var9 > 2048 ? var9 - 4096 : var9;
                int var11 = this.field2075 + var6;
                int var12 = this.field2071 + var6;
                int var13 = var12 < -2048 ? var12 + 4096 : var12;
                int var14 = var11 >= -2048 ? var11 : var11 + 4096;
                int var15 = var14 > 2048 ? var14 - 4096 : var14;
                int var16 = var13 > 2048 ? var13 - 4096 : var13;
                int var17 = var8 < -2048 ? var8 + 4096 : var8;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = this.method1023(var15, var18, 25411) || this.method1015(var10, var16, (byte) 101) ? 4096 : 0;
            }
        }
        return var3;
    }
}
