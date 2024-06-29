import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class78 extends class68 {

    @OriginalMember(owner = "client!md", name = "y", descriptor = "[I")
    public static int[] field1875 = new int[1000];

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Z")
    public static volatile boolean field1877 = false;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "[J")
    public static long[] field1878 = new long[32];

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field1888 = 0;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "[I")
    public static int[] field1881 = new int[256];

    @OriginalMember(owner = "client!md", name = "T", descriptor = "Lae;")
    public static class6 field1896 = class64.method474(115, "overlay_multiway");

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "[J")
    public static long[] field1897;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "Lae;")
    public static class6 field1900;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "[I")
    public int[] field1882;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "[I")
    public int[] field1884;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "[I")
    public int[] field1886;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "[Lsc;")
    public class112[] field1883;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "[Lsc;")
    public class112[] field1895;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "[[[B")
    public byte[][][] field1889;

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
            field1881[var0] = var1;
        }
        field1898 = 0;
        field1897 = new long[100];
        field1899 = 10;
        field1900 = class64.method474(105, "mapfunction");
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[B)V", line = 17)
    public static final void method671(int arg0, byte[] arg1) {
        field1893++;
        class77 var2 = new class77(arg1);
        var2.field1821 = arg1.length - 2;
        class21.field507 = var2.method636(-80);
        class64.field1388 = new int[class21.field507];
        class47.field1068 = new byte[class21.field507][];
        class72.field1653 = new int[class21.field507];
        class139.field3369 = new int[class21.field507];
        class58.field1251 = new int[class21.field507];
        var2.field1821 = arg1.length - class21.field507 * 8 - 7;
        class19.field374 = var2.method636(-113);
        class90.field2154 = var2.method636(118);
        int var3 = (var2.method620((byte) -8) & 0xFF) + 1;
        for (int var4 = 0; var4 < class21.field507; var4++) {
            class58.field1251[var4] = var2.method636(-87);
        }
        for (int var5 = 0; var5 < class21.field507; var5++) {
            class72.field1653[var5] = var2.method636(-115);
        }
        for (int var6 = 0; var6 < class21.field507; var6++) {
            class64.field1388[var6] = var2.method636(-103);
        }
        for (int var7 = 0; var7 < class21.field507; var7++) {
            class139.field3369[var7] = var2.method636(-8);
        }
        var2.field1821 = arg1.length + 3 - class21.field507 * 8 - var3 * 3 - 7;
        class103.field2429 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class103.field2429[var8] = var2.method629((byte) -62);
            if (class103.field2429[var8] == 0) {
                class103.field2429[var8] = 1;
            }
        }
        var2.field1821 = 0;
        if (arg0 >= -118) {
            field1888 = 5;
        }
        for (int var9 = 0; var9 < class21.field507; var9++) {
            int var10 = class139.field3369[var9];
            int var11 = class64.field1388[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class47.field1068[var9] = var13;
            int var14 = var2.method620((byte) -8);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method638(67);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var10; var17++) {
                        var13[var11 * var17 + var16] = var2.method638(-94);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lmc;I)V", line = 151)
    public static final void method672(class76 arg0, int arg1) {
        arg0.field1778 = false;
        if (arg1 != 1000000) {
            method675(null, 39, null);
        }
        field1885++;
        if (arg0.field1785 != -1) {
            class85 var2 = class35.method314(arg0.field1785, (byte) 54);
            if (var2 == null || var2.field2049 == null) {
                arg0.field1785 = -1;
            } else {
                arg0.field1763++;
                if (arg0.field1788 < var2.field2049.length && var2.field2043[arg0.field1788] < arg0.field1763) {
                    arg0.field1788++;
                    arg0.field1763 = 1;
                }
                if (var2.field2049.length <= arg0.field1788) {
                    arg0.field1788 = 0;
                    arg0.field1763 = 0;
                }
            }
        }
        if (arg0.field1746 != -1 && class5.field61 >= arg0.field1748) {
            if (arg0.field1754 < 0) {
                arg0.field1754 = 0;
            }
            int var3 = class69.method500(arg1 ^ 0xF4240, arg0.field1746).field3275;
            if (var3 == -1) {
                arg0.field1746 = -1;
            } else {
                class85 var4 = class35.method314(var3, (byte) 54);
                if (var4 == null || var4.field2049 == null) {
                    arg0.field1746 = -1;
                } else {
                    arg0.field1786++;
                    if (arg0.field1754 < var4.field2049.length && arg0.field1786 > var4.field2043[arg0.field1754]) {
                        arg0.field1754++;
                        arg0.field1786 = 1;
                    }
                    if (var4.field2049.length <= arg0.field1754 && (arg0.field1754 < 0 || arg0.field1754 >= var4.field2049.length)) {
                        arg0.field1746 = -1;
                    }
                }
            }
        }
        if (arg0.field1744 != -1 && arg0.field1787 <= 1) {
            class85 var5 = class35.method314(arg0.field1744, (byte) 54);
            if (var5.field2057 == 1 && arg0.field1725 > 0 && class5.field61 >= arg0.field1727 && class5.field61 > arg0.field1736) {
                arg0.field1787 = 1;
                return;
            }
        }
        if (arg0.field1744 != -1 && arg0.field1787 == 0) {
            class85 var6 = class35.method314(arg0.field1744, (byte) 54);
            if (var6 == null || var6.field2049 == null) {
                arg0.field1744 = -1;
            } else {
                arg0.field1793++;
                if (var6.field2049.length > arg0.field1740 && var6.field2043[arg0.field1740] < arg0.field1793) {
                    arg0.field1740++;
                    arg0.field1793 = 1;
                }
                if (arg0.field1740 >= var6.field2049.length) {
                    arg0.field1771++;
                    if (arg0.field1771 >= var6.field2041) {
                        arg0.field1744 = -1;
                    }
                    arg0.field1740 -= var6.field2056;
                    if (arg0.field1740 < 0 || var6.field2049.length <= arg0.field1740) {
                        arg0.field1744 = -1;
                    }
                }
                arg0.field1778 = var6.field2055;
            }
        }
        if (arg0.field1787 > 0) {
            arg0.field1787--;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 284)
    public static void method673(byte arg0) {
        field1878 = null;
        field1881 = null;
        if (arg0 >= -5) {
            field1888 = 38;
        }
        field1897 = null;
        field1896 = null;
        field1900 = null;
        field1875 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBI)I", line = 306)
    public static final int method674(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 > -45) {
            method675(null, 101, null);
        }
        field1892++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 329)
    public static final void method675(Throwable arg0, int arg1, String arg2) {
        field1891++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class69.method503(arg0, (byte) -27);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            if (arg1 != 64) {
                method673((byte) -31);
            }
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class112 var8 = class12.field227.method277((byte) -71, new URL(class12.field227.field766.getCodeBase(), "clienterror.ws?c=" + class138.field3353 + "&u=" + client.field482 + "&v1=" + class31.field751 + "&v2=" + class31.field757 + "&e=" + var7));
            while (var8.field2686 == 0) {
                class82.method696(3, 1L);
            }
            if (var8.field2686 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2687;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZZZB)Lvb;", line = 377)
    public static final class129 method676(int arg0, boolean arg1, boolean arg2, boolean arg3, byte arg4) {
        field1887++;
        class8 var5 = null;
        if (class79.field1937 != null) {
            var5 = new class8(arg0, class79.field1937, class2.field23[arg0], 1000000);
        }
        return arg4 == 115 ? new class129(var5, class20.field410, arg0, arg3, arg1, arg2) : null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)I", line = 404)
    public static final int method677(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1879++;
        if (arg4 == -247888528) {
            int var5 = 65536 - class29.field689[arg0 * 1024 / arg3] >> 1;
            return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lae;Lbf;Lae;I)[Lq;", line = 431)
    public static final class101[] method678(class6 arg0, class14 arg1, class6 arg2, int arg3) {
        if (arg3 == -30253) {
            int var4 = arg1.method158(arg0, (byte) 30);
            field1880++;
            int var5 = arg1.method138(100, var4, arg2);
            return class37.method327(var5, (byte) -49, var4, arg1);
        } else {
            return null;
        }
    }
}
