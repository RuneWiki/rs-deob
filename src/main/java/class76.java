import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class76 extends class71 {

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Lvb;")
    private class124 field1923;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Lmc;")
    public static class75 field1920 = class30.method234(true, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field1935 = -1;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field1932 = 0;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "Lmc;")
    private static class75 field1936 = class30.method234(true, " has logged out)3");

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public static int field1931 = 0;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "J")
    public static volatile long field1943 = 0L;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "Lmc;")
    public static class75 field1933 = field1936;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field1921 = 0;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field1942 = 0;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "Lmc;")
    private static class75 field1948 = class30.method234(true, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!md", name = "y", descriptor = "Lmc;")
    public static class75 field1922 = field1948;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    private int field1944;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Lud;")
    private class121 field1929;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "Laa;")
    public static class2 field1940;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Z")
    public static boolean field1926;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "Z")
    private boolean field1928;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "Z")
    private boolean field1939;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "[B")
    private byte[] field1941;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V", line = 4)
    public final void method141(byte arg0) {
        field1945++;
        if (this.field1939) {
            try {
                class18.method124("midibox.src=\"c:/silence.mid\";", this.field1923.field3036, false);
            } catch (Throwable var2) {
            }
            this.field1939 = false;
        }
        if (arg0 == 105) {
            this.field1929 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V", line = 36)
    public static final void method659(int arg0) {
        field1947++;
        try {
            Graphics var1 = class108.field2738.getGraphics();
            class40.field958.method403(0, (byte) 122, var1, 4);
            class38.field897.method403(0, (byte) 90, var1, 357);
            class36.field872.method403(722, (byte) 81, var1, 4);
            class91.field2250.method403(743, (byte) -62, var1, 205);
            class119.field2947.method403(0, (byte) 127, var1, 0);
            if (arg0 != 247) {
                method660(-125);
            }
            class5.field72.method403(516, (byte) -101, var1, 4);
            class131.field3195.method403(516, (byte) 114, var1, 205);
            class45.field1074.method403(496, (byte) 100, var1, 357);
            class8.field131.method403(0, (byte) -109, var1, 338);
        } catch (Exception var2) {
            class108.field2738.repaint();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 61)
    public final void method136(int arg0) {
        field1934++;
        int var2 = 73 % ((arg0 + 13) / 33);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V", line = 71)
    public final void method142(byte arg0) {
        int var2 = 106 % ((arg0 + 16) / 49);
        field1927++;
        if (this.field1929 == null || this.field1929.field2964 == 0) {
            return;
        }
        if (this.field1929.field2964 == 1) {
            class60 var3 = (class60) this.field1929.field2959;
            try {
                var3.method487((byte) 122, this.field1941, this.field1941.length, 0);
                var3.method482(-29352);
                try {
                    class18.method124("midibox.loop=" + (this.field1928 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var3.method484(-31).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field1944 + ";", this.field1923.field3036, false);
                    this.field1939 = true;
                } catch (Throwable var5) {
                }
            } catch (Exception var6) {
                try {
                    var3.method482(-29352);
                } catch (Exception var4) {
                }
            }
        }
        this.field1929 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)V", line = 110)
    public final void method138(int arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = 1;
        }
        field1918++;
        int var4 = class104.method858((byte) 117, arg2) - arg0;
        int var5 = 36 / ((-arg1 - 75) / 40);
        if (this.field1929 != null) {
            this.field1944 = var4;
        } else if (this.field1939) {
            try {
                class18.method124("midibox.volume=" + var4 + ";", this.field1923.field3036, false);
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V", line = 139)
    public static void method660(int arg0) {
        field1920 = null;
        field1933 = null;
        field1940 = null;
        if (arg0 != 2) {
            method663(26);
        }
        field1948 = null;
        field1936 = null;
        field1922 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[BIZ)V", line = 160)
    public final void method137(int arg0, byte[] arg1, int arg2, boolean arg3) {
        field1930++;
        this.field1929 = this.field1923.method985(arg0 - 13797);
        if (this.field1929 == null) {
            return;
        }
        if (arg2 == 0) {
            arg2 = 1;
        }
        if (arg0 != 13701) {
            this.method142((byte) 106);
        }
        this.field1944 = class104.method858((byte) -61, arg2);
        this.field1928 = arg3;
        this.field1941 = arg1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 185)
    public static final void method661(boolean arg0, Component arg1) {
        field1938++;
        arg1.removeKeyListener(class129.field3136);
        if (arg0) {
            arg1.removeFocusListener(class129.field3136);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V", line = 207)
    public final void method140(int arg0, byte arg1) {
        int var3 = -41 / ((arg1 - 52) / 36);
        field1919++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIZII)V", line = 216)
    public static final void method662(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            field1932 = -29;
        }
        field1946++;
        if (arg3 < 1 || arg2 < 1 || arg3 > 102 || arg2 > 102) {
            return;
        }
        if (class92.field2270 && class99.field2510 != arg0) {
            return;
        }
        int var8 = 0;
        if (arg7 == 0) {
            var8 = class107.field2679.method207(arg0, arg3, arg2);
        }
        boolean var9 = false;
        if (arg7 == 1) {
            var8 = class107.field2679.method203(arg0, arg3, arg2);
        }
        if (arg7 == 2) {
            var8 = class107.field2679.method200(arg0, arg3, arg2);
        }
        if (arg7 == 3) {
            var8 = class107.field2679.method214(arg0, arg3, arg2);
        }
        boolean var10 = true;
        boolean var11 = false;
        if (var8 != 0) {
            int var12 = class107.field2679.method193(arg0, arg3, arg2, var8);
            int var13 = var8 >> 14 & 0x7FFF;
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg7 == 0) {
                class107.field2679.method221(arg0, arg3, arg2);
                class59 var16 = class50.method387(-26274, var13);
                if (var16.field1508) {
                    class110.field2783[arg0].method45(var14, arg3, var15, var16.field1486, 32768, arg2);
                }
            }
            if (arg7 == 1) {
                class107.field2679.method211(arg0, arg3, arg2);
            }
            if (arg7 == 2) {
                class107.field2679.method224(arg0, arg3, arg2);
                class59 var17 = class50.method387(-26274, var13);
                if (var17.field1530 + arg3 > 103 || arg2 + var17.field1530 > 103 || var17.field1525 + arg3 > 103 || var17.field1525 + arg2 > 103) {
                    return;
                }
                if (var17.field1508) {
                    class110.field2783[arg0].method42(var17.field1486, 131072, var17.field1530, arg2, var17.field1525, arg3, var15);
                }
            }
            if (arg7 == 3) {
                class107.field2679.method195(arg0, arg3, arg2);
                class59 var18 = class50.method387(-26274, var13);
                if (var18.field1508 && var18.field1521 == 1) {
                    class110.field2783[arg0].method51(arg3, arg5, arg2);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class74.field1836[1][arg3][arg2] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class87.method726(class107.field2679, arg4, arg2, var19, arg0, arg3, class110.field2783[arg0], arg5, arg6, arg1);
        return;
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V", line = 318)
    public static final void method663(int arg0) {
        field1924++;
        if (class100.field2585 < 2 && class42.field1013 == 0 && class17.field332 == 0) {
            return;
        }
        class75 var1;
        if (class42.field1013 == 1 && class100.field2585 < 2) {
            var1 = class69.method586(new class75[] { class82.field2041, class5.field71, class64.field1688, class56.field1434 }, (byte) 99);
        } else if (class17.field332 == 1 && class100.field2585 < 2) {
            var1 = class69.method586(new class75[] { class100.field2596, class5.field71, class86.field2126, class56.field1434 }, (byte) 35);
        } else {
            var1 = class43.field1036[class100.field2585 - 1];
        }
        if (class100.field2585 > 2) {
            var1 = class69.method586(new class75[] { var1, class90.field2214, class45.method345(22978, class100.field2585 - 2), class63.field1669 }, (byte) 59);
        }
        if (arg0 != 488) {
            field1935 = -115;
        }
        class5.field77.method418(var1, 4, 15, 16777215, true, class34.field781 / 1000);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lvb;)V", line = 371)
    public class76(class124 arg0) {
        this.field1923 = arg0;
    }
}
