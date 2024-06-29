import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class158 {

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "[Ljava/lang/String;")
    private static final String[] field5023 = new String[] { method2684(method2683("\nw\u000f\\4\u001d56\u0011")), method2684(method2683("I34\\9\u0006m\u0003K?\r2F")), method2684(method2683("\nw\u000f\\4\u001d5)xr")), method2684(method2683("\u0007z\u0012P,\fW\u000f[(\bi\u000f\\)")), method2684(method2683("\u0015-O")), method2684(method2683("\u0015*S\u0010")), method2684(method2683("Z2")), method2684(method2683("X/O")), method2684(method2683("\nw\u000f\\4\u001d")), method2684(method2683("\u0015.O")), method2684(method2683("\nw\u000f\\4\u001d5 \u0011")), method2684(method2683("\u0001z\b]6\f")), method2684(method2683("^2")), method2684(method2683("2*O")), method2684(method2683("X(O")), method2684(method2683("\u001a~\u0012x9\n~\u0015J3\u000bw\u0003")), method2684(method2683("[2")), method2684(method2683("\u0015*P\u0010")), method2684(method2683("\u0015/O")), method2684(method2683("\u0003z\u0010Xt\u0005z\b^t*w\u0007J)%t\u0007]?\u001b")), method2684(method2683("\u001alU]t\rw\n")), method2684(method2683("\u0003z\u0010Xt\u0005z\b^t\u001b~\u0000U?\noHx9\n~\u0015J3\u000bw\u0003v8\u0003~\u0005M")), method2684(method2683("X)O")), method2684(method2683("X*O")), method2684(method2683("X+O")), method2684(method2683("P2")), method2684(method2683("\u0007z\u000b\\")), method2684(method2683("Q2")), method2684(method2683("\nw\u000f\\4\u001d55\u0011")), method2684(method2683("\nw\u000f\\4\u001d5-xr")), method2684(method2683("\u0003h")), method2684(method2683("\nw\u000f\\4\u001d5\u000fW3\u001d3")), method2684(method2683("\b\u007f\u0010\\(\u001d")), method2684(method2683("\u000ez\u000b\\")), method2684(method2683("\u0004t\u0002\\-\u0001~\u0014\\")), method2684(method2683("\u001et\u0014U>\u0000\u007f")), method2684(method2683("\u001di\u0013\\")), method2684(method2683("\u0018n\u000fM/\u001bw")), method2684(method2683("\r~\u000bV3\r")), method2684(method2683("\b\u007f\u0002P.\u0000t\bX6 u\u0000V")), method2684(method2683("\b}\u0000P>")), method2684(method2683("\u000fi\tT8\u0000w\nP4\u000e")), method2684(method2683("\nt\u0013W.\u001bb")), method2684(method2683("\u001ar\u0012\\)\fo\u0012P4\u000eh9T?\u0004y\u0003K")), method2684(method2683("\u0004t\u0002\\-\u0001z\u0012")), method2684(method2683("\u0006y\f\\9\u001do\u0007^")), method2684(method2683("\u001a~\u0012M3\u0007|\u0015")), method2684(method2683("\u0005z\b^")), method2684(method2683("\nt\nV/\u001br\u0002")), method2684(method2683("\u001cu\u0002\\(")), method2684(method2683("\u0005t\u0004[#\b\u007f\u0002K?\u001ah")), method2684(method2683("\u001et\u0014U>\u000fw\u0007^)")), method2684(method2683("\u001ah\r\\#")), method2684(method2683("\u0005t\u0004[#\u0000\u007f")), method2684(method2683("\u001ch\u0003K\u001c\u0005t\u0011")), method2684(method2683("\u000ft\u0014Z?_/\u000b[")), method2684(method2683("\r~\u000bV;\r\u007f\u0014\\)\u001a")), method2684(method2683("\nw\u000f\\4\u001d5'xr")), method2684(method2683("\u0007n\nU")), method2684(method2683("\u00125H\u0017'")), method2684(method2683("\nw\u000f\\4\u001d5$xr")), method2684(method2683("\nw\u000f\\4\u001d52\u0011")), method2684(method2683("\nw\u000f\\4\u001d5!\u0011")), method2684(method2683("\nw\u000f\\4\u001d5\"xr")), method2684(method2683("\nw\u000f\\4\u001d51\u0011")), method2684(method2683("\nw\u000f\\4\u001d5.\u0011")), method2684(method2683("\nz\bO;\u001a")), method2684(method2683("Ux\tUg\u000f}\u0000_<\u000f%")), method2684(method2683("'n\nU")), method2684(method2683("I6X")), method2684(method2683("\u0005r\u0010\\")), method2684(method2683("\u000e~\u0014T;\u0007")), method2684(method2683("\fu\u0001U3\u001as")), method2684(method2683("\u000ez\u000b\\j")), method2684(method2683("\u000ez\u000b\\i")), method2684(method2683("\u001bx")), method2684(method2683("(i\u0001L7\fu\u0012\u00199\u0006n\bM")), method2684(method2683("\u000ez\u000b\\k")), method2684(method2683("\u000ez\u000b\\h")), method2684(method2683("\u001er\u0016")), method2684(method2683("\nw\u000f\\4\u001d5\u000bX3\u00073")), method2684(method2683("\u0005z\b^/\b|\u0003")), method2684(method2683("\nw\u000f\\4\u001d5#xr")), method2684(method2683("\u0003hSZ(\n")), method2684(method2683("\u0003hSI(\u0006c\u001ff")), method2684(method2683("\u0003hSZ5\u0007u\u0003Z.6t\u0013M5\u000f\u007f\u0007M?")), method2684(method2683("\u0003hSP5")), method2684(method2683("\u0003hSZ5\u0007u\u0003Z.6}\u0013U6")), method2684(method2683("\u0003hSZ5\u0007u\u0003Z.")), method2684(method2683("\nw\u000f\\4\u001d5(\u0011")), method2684(method2683("\nw\u000f\\4\u001d5+xr")), method2684(method2683("Uy\u0014\u0007r")), method2684(method2683("L2")), method2684(method2683("Uy\u0014\u0007")), method2684(method2683("\nw\u000f\\4\u001d5'\u0011")), method2684(method2683("#z\u0001\\\"")), method2684(method2683("X)Q\u0017jG+H\b")), method2684(method2683("\nw\u000f\\4\u001d54\u0011")) };

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field5013 = null;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field5019 = 1405;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Lla;")
    public static class476 field5001;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Ljava/lang/Class;")
    public static Class field5021;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method2662() {
        for (int var0 = 0; var0 < class648.field9378; var0++) {
            int[] var1 = class91.field1045[var0];
            for (int var2 = 0; var2 < class659.field9506; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method2663(int arg0) {
        try {
            field5007++;
            boolean var2 = class768.field11093.method1250(200);
            if (!var2) {
                this.method2677(18945);
            }
            if (arg0 > -63) {
                field5019 = -113;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5023[29] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1338(int arg0) {
        try {
            field5005++;
            if (class339.field5281) {
                class568.field8403 = 64;
            }
            Frame var2 = new Frame(field5023[95]);
            var2.pack();
            var2.dispose();
            class569.method4256(false);
            class751.field10930 = new class287(class580.field8601);
            class768.field11093 = new class149();
            class779.method5634(new int[] { 1000, 100 }, arg0 ^ 0x15, new int[] { 20, 260 });
            if (class64.field667 != class31.field364) {
                class98.field1100 = new byte[50][];
            }
            class289.field4305 = class209.method1843(arg0);
            if (class64.field667 == class31.field364) {
                class546.field8156.field250 = this.getCodeBase().getHost();
            } else if (class312.method2630(class64.field667, arg0 - 2374)) {
                class546.field8156.field250 = this.getCodeBase().getHost();
                class546.field8156.field242 = class546.field8156.field243 + 40000;
                class149.field1830.field242 = class149.field1830.field243 + 40000;
                class123.field1448.field242 = class123.field1448.field243 + 40000;
                class546.field8156.field252 = class546.field8156.field243 + 50000;
                class149.field1830.field252 = class149.field1830.field243 + 50000;
                class123.field1448.field252 = class123.field1448.field243 + 50000;
            } else if (class64.field667 == class3.field17) {
                class546.field8156.field250 = field5023[96];
                class149.field1830.field250 = field5023[96];
                class123.field1448.field250 = field5023[96];
                class546.field8156.field242 = class546.field8156.field243 + 40000;
                class149.field1830.field242 = class149.field1830.field243 + 40000;
                class123.field1448.field242 = class123.field1448.field243 + 40000;
                class546.field8156.field252 = class546.field8156.field243 + 50000;
                class149.field1830.field252 = class149.field1830.field243 + 50000;
                class123.field1448.field252 = class123.field1448.field243 + 50000;
            }
            if (class447.field6576 == class239.field3624) {
                class58.field621 = class673.field9768;
                class322.field5078 = class81.field919;
                class722.field10456 = 0;
                class7.field76 = 16777215;
                class308.field4836 = true;
            } else if (class669.field9713 == class447.field6576) {
                class58.field621 = class403.field6009;
                class322.field5078 = class89.field1016;
            } else {
                class322.field5078 = class80.field904;
                class58.field621 = class669.field9716;
            }
            if (class447.field6576 == class243.field3725) {
                class73.field851 = false;
            }
            class54.field592 = class546.field8156;
            class609.field8900 = class23.field273 = class762.field11041 = class447.field6572 = new short[256];
            try {
                class755.field10983 = class43.field504.getToolkit().getSystemClipboard();
            } catch (Exception var5) {
            }
            class597.field8749 = class492.method3716(class502.field7252, (byte) 116);
            class606.field8875 = class663.method4860(arg0 ^ 0xA, true, class502.field7252);
            try {
                if (class580.field8601.field373 != null) {
                    class122.field1441 = new class447(class580.field8601.field373, 5200, 0);
                    for (int var3 = 0; var3 < 37; var3++) {
                        class680.field9862[var3] = new class447(class580.field8601.field390[var3], 6000, 0);
                    }
                    class728.field10553 = new class447(class580.field8601.field376, 6000, 0);
                    class456.field6646 = new class411(255, class122.field1441, class728.field10553, 500000);
                    class605.field8870 = new class447(class580.field8601.field389, 24, 0);
                    class580.field8601.field389 = null;
                    class580.field8601.field373 = null;
                    class580.field8601.field376 = null;
                    class580.field8601.field390 = null;
                }
            } catch (IOException var6) {
                class728.field10553 = null;
                class605.field8870 = null;
                class456.field6646 = null;
                class122.field1441 = null;
            }
            if (class64.field667 != class31.field364) {
                class655.field9471 = true;
            }
            class353.field5447 = class309.field4859.method2616(false, class167.field2300);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5023[97] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            try {
                if (arg0.length != 6) {
                    class612.method4524((byte) 63, field5023[76]);
                }
                class546.field8156 = new class21();
                class546.field8156.field243 = Integer.parseInt(arg0[0]);
                class149.field1830 = new class21();
                class149.field1830.field243 = Integer.parseInt(arg0[1]);
                class123.field1448 = new class21();
                class123.field1448.field243 = Integer.parseInt(arg0[2]);
                class64.field667 = class3.field17;
                if (arg0[3].equals(field5023[70])) {
                    class787.field11486 = class655.field9467;
                } else if (arg0[3].equals(field5023[75])) {
                    class787.field11486 = class418.field6161;
                } else if (arg0[3].equals(field5023[79])) {
                    class787.field11486 = class546.field8150;
                } else {
                    class612.method4524((byte) 63, field5023[44]);
                }
                class167.field2300 = class275.method2271((byte) -31, arg0[4]);
                if (class167.field2300 == -1) {
                    if (arg0[4].equals(field5023[72])) {
                        class167.field2300 = 0;
                    } else if (arg0[4].equals(field5023[71])) {
                        class167.field2300 = 1;
                    } else {
                        class612.method4524((byte) 63, field5023[81]);
                    }
                }
                class294.field4335 = false;
                class296.field4464 = false;
                if (arg0[5].equals(field5023[73])) {
                    class447.field6576 = class243.field3725;
                } else if (arg0[5].equals(field5023[77])) {
                    class447.field6576 = class239.field3624;
                } else if (arg0[5].equals(field5023[78])) {
                    class447.field6576 = class572.field8456;
                } else if (arg0[5].equals(field5023[74])) {
                    class447.field6576 = class669.field9713;
                } else {
                    class612.method4524((byte) 63, field5023[33]);
                }
                class50.field566 = class447.field6576.field83;
                class315.field4985 = 0;
                class752.field10946 = null;
                class580.field8597 = 0L;
                class65.field673 = true;
                class233.field3519 = true;
                class373.field5697 = false;
                class676.field9805 = 0;
                class335.field5229 = "";
                class339.field5281 = false;
                class473.field6867 = 0;
                class205.field3172 = null;
                client var1 = new client();
                class43.field504 = var1;
                var1.method1331(768, class787.field11486.method4122((byte) 80) + 32, 37, (byte) 43, 652, false, 1024, class447.field6576.field87);
                class376.field5730.setLocation(40, 40);
            } catch (Exception var4) {
                class618.method4603((byte) 125, null, var4);
            }
            field5012++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5023[80] + (arg0 == null ? field5023[58] : field5023[59]) + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method1340(int arg0) {
        try {
            if (class39.field457) {
                class457.method3489(-28016);
            }
            field5002++;
            class762.method5517((byte) -17);
            if (class610.field8913 != null) {
                class610.field8913.method579((byte) -62);
            }
            if (class2.field14 != null) {
                class38.method250(class580.field8601, class2.field14, -117);
                class2.field14 = null;
            }
            if (class629.field9198 != null) {
                class629.field9198.method2700((byte) 112);
                class629.field9198 = null;
            }
            class277.method2281((byte) -126);
            class768.field11093.method1248(-13);
            class751.field10930.method2331((byte) -74);
            if (class624.field9131 != null) {
                class624.field9131.method3917(-17063);
                class624.field9131 = null;
            }
            try {
                class122.field1441.method3431(-1);
                for (int var2 = 0; var2 < 37; var2++) {
                    class680.field9862[var2].method3431(-1);
                }
                if (arg0 >= -70) {
                    field5019 = -29;
                }
                class728.field10553.method3431(-1);
                class605.field8870.method3431(-1);
                class762.method5519((byte) 100);
            } catch (Exception var4) {
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5023[89] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method2664() {
        class257.field3983 = 0;
        for (int var0 = 0; var0 < class6.field60; var0++) {
            class612 var1 = ((class383) class207.field3184.method977((long) class590.field8680[var0], 1)).field5799;
            if (var1.field3800 && var1.method2100((byte) -100) != -1) {
                int var2 = (var1.method2101(31463) - 1) * 256 + 252;
                int var3 = var1.field6197 - var2 >> 9;
                int var4 = var1.field6211 - var2 >> 9;
                class247 var5 = class81.method702(-41, var1.field6200, var4, var3);
                if (var5 != null) {
                    int var6 = var5.field3780;
                    if (var5 instanceof class612) {
                        var6 += 2048;
                    }
                    if (var5.field3801 == 0 && var5.method2100((byte) -96) != -1) {
                        class342.field5316[class257.field3983] = var6;
                        class12.field146[class257.field3983] = var6;
                        class257.field3983++;
                        var5.field3801++;
                    }
                    class342.field5316[class257.field3983] = var6;
                    class12.field146[class257.field3983] = var1.field3780 + 2048;
                    class257.field3983++;
                    var5.field3801++;
                }
            }
        }
        class46.method361(28494, class342.field5316, 0, class257.field3983 - 1, class12.field146);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method2665() {
        int var0 = class3.field34;
        int[] var1 = class358.field5483;
        int var2 = class726.field10479 ? var0 : class6.field60 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class247 var4;
            if (var3 < var0) {
                var4 = class197.field2685[var1[var3]];
            } else {
                var4 = ((class383) class207.field3184.method977((long) class590.field8680[var3 - var0], 1)).field5799;
            }
            if (var4.field3808 >= 0) {
                int var5 = var4.method2101(31463);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6197 & 0x1FF) == 0 && (var4.field6211 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field6197 & 0x1FF) == 256 && (var4.field6211 & 0x1FF) == 256) {
                    continue;
                }
                var4.field6199 = class316.method2656(var4.field6197, var4.field6200, var4.field6211, 0);
                class712.method5190(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method2666(int arg0) {
        try {
            field5000++;
            if (class138.field1645 != 14) {
                long var2 = class65.method463(arg0 ^ 0xFFFFFFF4) / 1000000L - class310.field4916;
                class310.field4916 = class65.method463(11) / 1000000L;
                boolean var4 = class367.method2975(~arg0);
                if (var4 && class719.field10416 && class646.field9353 != null) {
                    class646.field9353.method4046((byte) -121);
                }
                if (class511.method3852(class138.field1645, 12)) {
                    if (class223.field3420 != 0L && class430.method3299(arg0 + 87) > class223.field3420) {
                        class178.method1563(false, -102, class108.field1254, class400.field5970, class451.method3463(arg0 + 2));
                    } else if (!class610.field8913.method503() && class790.field11505) {
                        class512.method3857((byte) 41);
                    }
                }
                if (class2.field14 == null) {
                    Container var5;
                    if (class376.field5730 != null) {
                        var5 = class376.field5730;
                    } else if (class629.field9206 == null) {
                        var5 = class277.field4174;
                    } else {
                        var5 = class629.field9206;
                    }
                    int var6 = var5.getSize().width;
                    int var7 = var5.getSize().height;
                    if (class376.field5730 == var5) {
                        Insets var8 = class376.field5730.getInsets();
                        var6 -= var8.right + var8.left;
                        var7 -= var8.top + var8.bottom;
                    }
                    if (class650.field9404 != var6 || class101.field1118 != var7 || class431.field6338) {
                        if (class610.field8913 == null || class610.field8913.method542()) {
                            class569.method4256(false);
                        } else {
                            class650.field9404 = var6;
                            class101.field1118 = var7;
                        }
                        class223.field3420 = class430.method3299(98) + 500L;
                        class431.field6338 = false;
                    }
                }
                if (class2.field14 != null && !class377.field5750 && class511.method3852(class138.field1645, arg0 + 13)) {
                    class178.method1563(false, 117, -1, -1, class289.field4305.field829.method5551(false));
                }
                boolean var9 = false;
                if (class106.field1226) {
                    var9 = true;
                    class106.field1226 = false;
                }
                if (var9) {
                    class423.method3265((byte) -9);
                }
                if (class610.field8913 != null && class610.field8913.method503() || class451.method3463(1) != 1) {
                    class649.method4771((byte) 103);
                }
                if (class537.method4047(class138.field1645, -58)) {
                    class305.method2586(var9, arg0 + 110);
                } else if (class544.method4111(class138.field1645, true)) {
                    class129.method1125(7629);
                } else if (class725.method5280((byte) -92, class138.field1645)) {
                    class129.method1125(7629);
                } else if (class432.method3310(class138.field1645, 256)) {
                    if (class229.field3484 == 1) {
                        if (class316.field4997 < class117.field1395) {
                            class316.field4997 = class117.field1395;
                        }
                        int var10 = (class316.field4997 - class117.field1395) * 50 / class316.field4997;
                        class145.method1227(true, class309.field4859.method2616(false, class167.field2300) + field5023[91] + var10 + field5023[92], class309.field4911, class64.field664, class610.field8913, (byte) -126);
                    } else if (class229.field3484 == 2) {
                        if (class184.field2540 < class225.field3447) {
                            class184.field2540 = class225.field3447;
                        }
                        int var11 = (class184.field2540 - class225.field3447) * 50 / class184.field2540 + 50;
                        class145.method1227(true, class309.field4859.method2616(false, class167.field2300) + field5023[91] + var11 + field5023[92], class309.field4911, class64.field664, class610.field8913, (byte) -123);
                    } else {
                        class145.method1227(true, class309.field4859.method2616(false, class167.field2300), class309.field4911, class64.field664, class610.field8913, (byte) -128);
                    }
                } else if (class138.field1645 == 10) {
                    class74.method672(-2, var2);
                } else if (class138.field1645 == 13) {
                    class145.method1227(false, class309.field4861.method2616(false, class167.field2300) + field5023[93] + class309.field4862.method2616(false, class167.field2300), class309.field4911, class64.field664, class610.field8913, (byte) -125);
                }
                if (class209.field3210 == 3) {
                    for (int var12 = 0; var12 < class669.field9721; var12++) {
                        Rectangle var13 = class361.field5506[var12];
                        if (class419.field6166[var12]) {
                            class610.field8913.method580(var13.x, var13.height, -65281, var13.width, var13.y, 1);
                        } else if (class214.field3265[var12]) {
                            class610.field8913.method580(var13.x, var13.height, -65536, var13.width, var13.y, arg0 ^ 0xFFFFFFFE);
                        } else {
                            class610.field8913.method580(var13.x, var13.height, -16711936, var13.width, var13.y, arg0 ^ 0xFFFFFFFE);
                        }
                    }
                }
                if (class324.method2740(false)) {
                    class769.method5550(class610.field8913, arg0 - 92);
                }
                if (class580.field8601.field395 && class511.method3852(class138.field1645, 12) && class209.field3210 == 0 && class451.method3463(1) == 1 && !var9) {
                    int var16 = 0;
                    for (int var17 = 0; var17 < class669.field9721; var17++) {
                        if (class214.field3265[var17]) {
                            class214.field3265[var17] = false;
                            class114.field1355[var16++] = class361.field5506[var17];
                        }
                    }
                    try {
                        if (class235.field3549) {
                            class757.method5489(var16, class114.field1355, 0);
                        } else {
                            class610.field8913.method570(class114.field1355, 8297, var16);
                        }
                    } catch (class382 var20) {
                    }
                } else if (!class537.method4047(class138.field1645, -87)) {
                    for (int var14 = 0; var14 < class669.field9721; var14++) {
                        class214.field3265[var14] = false;
                    }
                    try {
                        if (class235.field3549) {
                            class639.method4688(arg0 + 30084);
                        } else {
                            class610.field8913.method540(0);
                        }
                    } catch (class382 var21) {
                        class618.method4603((byte) 125, var21.getMessage() + field5023[1] + this.method1325((byte) -86), var21);
                        class640.method4693(0, -13558, false);
                    }
                }
                class125.method1084(-35);
                int var18 = class289.field4305.field830.method4499(false);
                if (~var18 == arg0) {
                    class151.method1269(false, 15L);
                } else if (var18 == 1) {
                    class151.method1269(false, 10L);
                } else if (var18 == 2) {
                    class151.method1269(false, 5L);
                } else if (var18 == 3) {
                    class151.method1269(false, 2L);
                }
                if (class720.field10429) {
                    class245.method2085(91);
                }
                if (class289.field4305.field839.method1475(false) == 1 && class138.field1645 == 3 && class742.field10801 != -1) {
                    class289.field4305.method655(17, 0, class289.field4305.field839);
                    class124.method1077(-3);
                }
            }
        } catch (RuntimeException var22) {
            throw class759.method5498(var22, field5023[90] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method2667(byte arg0) {
        try {
            field5016++;
            if (class138.field1645 == 7 && !class491.method3713(-18653)) {
                if (class533.field7812 > 1) {
                    class533.field7812--;
                    class40.field473 = class28.field349;
                }
                if (!class216.field3297) {
                    class258.method2180(true);
                }
                for (int var2 = 0; var2 < 100 && class372.method2999((byte) -38); var2++) {
                }
            }
            class327.field5158++;
            class156.method1315(-1, -10213, null, -1);
            class50.method385(-1, -1, null, (byte) 108);
            class200.method1791(true);
            class28.field349++;
            for (int var3 = 0; var3 < class750.field10912; var3++) {
                class612 var4 = class753.field10966[var3].field5799;
                if (var4 != null) {
                    byte var5 = var4.field8947.field7178;
                    if ((var5 & 0x1) != 0) {
                        int var6 = var4.method2101(31463);
                        if ((var5 & 0x2) != 0 && var4.field3862 == 0 && Math.random() * 1000.0D < 10.0D) {
                            int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                            int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                            if (var7 != 0 || var8 != 0) {
                                int var9 = var4.field3859[0] + var7;
                                int var10 = var4.field3863[0] + var8;
                                if (var9 < 0) {
                                    var9 = 0;
                                } else if (var9 > (class648.field9378 - var6 - 1)) {
                                    var9 = class648.field9378 - var6 - 1;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                } else if (var10 > class659.field9506 - var6 - 1) {
                                    var10 = class659.field9506 - var6 - 1;
                                }
                                int var11 = class377.method3040(var4.field3863[0], class429.field6298[var4.field6200], var10, (byte) 79, 0, var6, class660.field9543, var6, -1, class85.field953, 0, var9, var6, true, var4.field3859[0]);
                                if (var11 > 0) {
                                    if (var11 > 9) {
                                        var11 = 9;
                                    }
                                    for (int var12 = 0; var12 < var11; var12++) {
                                        var4.field3859[var12] = class85.field953[var11 - (var12 + 1)];
                                        var4.field3863[var12] = class660.field9543[var11 - var12 - 1];
                                        var4.field3857[var12] = 1;
                                    }
                                    var4.field3862 = var11;
                                }
                            }
                        }
                        class215.method1880(false, var4, true);
                        int var13 = class11.method76(-1, var4);
                        class751.method5462(var4, (byte) -110);
                        class231.method1978((byte) -1, class458.field6669, var13, class372.field5672, var4);
                        class396.method3129(var4, 0, class372.field5672);
                        class234.method1996(-36, var4);
                    }
                }
            }
            if (!class491.method3713(-18653) && class545.field8147 == 0) {
                if (class185.field2559 == 2) {
                    class283.method2316(true);
                } else {
                    class93.method794(77);
                }
                if ((class271.field4116 >> 9) < 14 || class648.field9378 - 14 <= class271.field4116 >> 9 || (class683.field9899 >> 9) < 14 || (class659.field9506 - 14) <= (class683.field9899 >> 9)) {
                    class61.method444((byte) -81);
                }
            }
            while (true) {
                class86 var14;
                class541 var15;
                class541 var16;
                do {
                    var14 = (class86) class295.field4349.method3875(-113);
                    if (var14 == null) {
                        while (true) {
                            class86 var17;
                            class541 var18;
                            class541 var19;
                            do {
                                var17 = (class86) class610.field8911.method3875(-52);
                                if (var17 == null) {
                                    while (true) {
                                        class86 var20;
                                        class541 var21;
                                        class541 var22;
                                        do {
                                            var20 = (class86) class749.field10905.method3875(-126);
                                            if (var20 == null) {
                                                if (class69.field740 != null) {
                                                    class708.method5164((byte) -94);
                                                }
                                                if ((class375.field5711 % 1500) == 0) {
                                                    class706.method5161((byte) -36);
                                                }
                                                if (class138.field1645 == 7 && !class491.method3713(-18653)) {
                                                    class415.method3224((byte) 119);
                                                }
                                                class483.method3681(false);
                                                if (class39.field457 && class683.field9904 < (class430.method3299(116) - 60000L)) {
                                                    class457.method3489(-28016);
                                                }
                                                if (arg0 > -110) {
                                                    method2668(-14, null, false);
                                                }
                                                for (class75 var23 = (class75) class254.field3944.method4538(false); var23 != null; var23 = (class75) class254.field3944.method4543(0)) {
                                                    if ((long) var23.field869 < class430.method3299(77) / 1000L - 5L) {
                                                        if (var23.field866 > 0) {
                                                            class150.method1265("", var23.field868 + class309.field4866.method2616(false, class167.field2300), -1, "", 0, 5, "");
                                                        }
                                                        if (var23.field866 == 0) {
                                                            class150.method1265("", var23.field868 + class309.field4867.method2616(false, class167.field2300), -1, "", 0, 5, "");
                                                        }
                                                        var23.method4696(-99);
                                                    }
                                                }
                                                if (class138.field1645 == 7 && !class491.method3713(-18653)) {
                                                    if (class629.field9198 == null) {
                                                        class220.method1920(0, false);
                                                        return;
                                                    }
                                                    class157.field1961++;
                                                    if (class157.field1961 > 50) {
                                                        class375.field5713++;
                                                        class280 var24 = class610.method4508(class179.field2490, class279.field4190, (byte) -79);
                                                        class106.method934((byte) 53, var24);
                                                    }
                                                    try {
                                                        class443.method3401(-1);
                                                        return;
                                                    } catch (IOException var26) {
                                                        class220.method1920(0, false);
                                                        return;
                                                    }
                                                }
                                                return;
                                            }
                                            var21 = var20.field959;
                                            if (var21.field7999 < 0) {
                                                break;
                                            }
                                            var22 = class461.method3513(var21.field8079, 115);
                                        } while (var22 == null || var22.field7945 == null || var22.field7945.length <= var21.field7999 || var22.field7945[var21.field7999] != var21);
                                        class782.method5663(var20);
                                    }
                                }
                                var18 = var17.field959;
                                if (var18.field7999 < 0) {
                                    break;
                                }
                                var19 = class461.method3513(var18.field8079, 120);
                            } while (var19 == null || var19.field7945 == null || var19.field7945.length <= var18.field7999 || var19.field7945[var18.field7999] != var18);
                            class782.method5663(var17);
                        }
                    }
                    var15 = var14.field959;
                    if (var15.field7999 < 0) {
                        break;
                    }
                    var16 = class461.method3513(var15.field8079, 116);
                } while (var16 == null || var16.field7945 == null || var16.field7945.length <= var15.field7999 || var16.field7945[var15.field7999] != var15);
                class782.method5663(var14);
            }
        } catch (RuntimeException var27) {
            throw class759.method5498(var27, field5023[61] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        try {
            field5006++;
            if (this.method1333(-76)) {
                class546.field8156 = new class21();
                class546.field8156.field243 = Integer.parseInt(this.getParameter(field5023[35]));
                class149.field1830 = new class21();
                class149.field1830.field243 = Integer.parseInt(this.getParameter(field5023[53]));
                class149.field1830.field250 = this.getParameter(field5023[50]);
                class123.field1448 = new class21();
                class123.field1448.field243 = Integer.parseInt(this.getParameter(field5023[38]));
                class123.field1448.field250 = this.getParameter(field5023[56]);
                class64.field667 = class616.method4582(Integer.parseInt(this.getParameter(field5023[34])), 15182);
                if (class64.field667 == class3.field17) {
                    class64.field667 = class524.field7652;
                } else if (!class312.method2630(class64.field667, -2374) && class64.field667 != class31.field364) {
                    class64.field667 = class31.field364;
                }
                class787.field11486 = class536.method4039(Integer.parseInt(this.getParameter(field5023[44])), -95);
                if (class787.field11486 != class546.field8150 && class787.field11486 != class418.field6161 && class787.field11486 != class655.field9467) {
                    class787.field11486 = class655.field9467;
                }
                try {
                    class167.field2300 = Integer.parseInt(this.getParameter(field5023[47]));
                } catch (Exception var16) {
                    class167.field2300 = 0;
                }
                String var1 = this.getParameter(field5023[45]);
                if (var1 != null && var1.equals("1")) {
                    class294.field4335 = true;
                } else {
                    class294.field4335 = false;
                }
                String var2 = this.getParameter(field5023[30]);
                if (var2 != null && var2.equals("1")) {
                    class296.field4464 = true;
                } else {
                    class296.field4464 = false;
                }
                String var3 = this.getParameter(field5023[32]);
                if (var3 != null && var3.equals("1")) {
                    class586.field8634 = true;
                } else {
                    class586.field8634 = false;
                }
                String var4 = this.getParameter(field5023[33]);
                if (var4 != null) {
                    if (var4.equals("0")) {
                        class447.field6576 = class243.field3725;
                    } else if (var4.equals("1")) {
                        class447.field6576 = class239.field3624;
                    } else if (var4.equals("2")) {
                        class447.field6576 = class572.field8456;
                    } else if (var4.equals("3")) {
                        class447.field6576 = class669.field9713;
                    }
                }
                try {
                    class676.field9805 = Integer.parseInt(this.getParameter(field5023[40]));
                } catch (Exception var15) {
                    class676.field9805 = 0;
                }
                class208.field3188 = this.getParameter(field5023[37]);
                class335.field5229 = this.getParameter(field5023[46]);
                if (class335.field5229 == null) {
                    class335.field5229 = "";
                }
                class559.field8323 = "1".equals(this.getParameter(field5023[49]));
                String var5 = this.getParameter(field5023[42]);
                if (var5 != null) {
                    try {
                        class315.field4985 = Integer.parseInt(var5);
                    } catch (Exception var14) {
                        class315.field4985 = 0;
                    }
                }
                class50.field566 = Integer.parseInt(this.getParameter(field5023[48]));
                if (class50.field566 < 0 || class195.field2616.length <= class50.field566) {
                    class50.field566 = 0;
                }
                if (Integer.parseInt(this.getParameter(field5023[43])) == 1) {
                    class65.field673 = true;
                    class233.field3519 = true;
                }
                String var6 = this.getParameter(field5023[41]);
                if (var6 != null && var6.equals(field5023[36])) {
                    class373.field5697 = true;
                }
                String var7 = this.getParameter(field5023[52]);
                if (var7 != null) {
                    class752.field10946 = class58.method426(class506.method3814(48, var7), (byte) -100);
                    if (class752.field10946.length < 16) {
                        class752.field10946 = null;
                    }
                }
                String var8 = this.getParameter(field5023[55]);
                if (var8 != null && var8.equals(field5023[36])) {
                    class339.field5281 = true;
                }
                String var9 = this.getParameter(field5023[51]);
                if (var9 != null) {
                    try {
                        class473.field6867 = Integer.parseInt(var9);
                    } catch (Exception var13) {
                    }
                }
                String var10 = this.getParameter(field5023[54]);
                if (var10 != null) {
                    try {
                        class580.field8597 = Long.parseLong(var10);
                    } catch (NumberFormatException var12) {
                    }
                }
                class205.field3172 = this.getParameter(field5023[39]);
                if (class205.field3172 != null && class205.field3172.length() > 50) {
                    class205.field3172 = null;
                }
                if (class447.field6576 == class243.field3725) {
                    class524.field7654 = 503;
                    class604.field8861 = 765;
                } else if (class447.field6576 == class239.field3624) {
                    class524.field7654 = 480;
                    class604.field8861 = 640;
                }
                class43.field504 = this;
                this.method1337(37, class787.field11486.method4122((byte) 65) + 32, -11257, class524.field7654, class447.field6576.field87, class604.field8861, 652);
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field5023[31] + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BZ)V")
    public static final void method2668(int arg0, byte[] arg1, boolean arg2) {
        try {
            field5018++;
            if (arg0 > 104) {
                if (class663.field9576 == null) {
                    class663.field9576 = new class163(20000);
                }
                class663.field9576.method1454(arg1.length, 0, arg1, (byte) 127);
                if (arg2) {
                    class698.method5087(class663.field9576.field2209, false);
                    class192.field2592 = new class604[class748.field10895];
                    int var3 = 0;
                    for (int var4 = class29.field355; var4 <= class588.field8656; var4++) {
                        class604 var5 = class83.method712((byte) 115, var4);
                        if (var5 != null) {
                            class192.field2592[var3++] = var5;
                        }
                    }
                    class364.field5576 = false;
                    class251.field3899 = class430.method3299(95);
                    class663.field9576 = null;
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5023[60] + arg0 + ',' + (arg1 == null ? field5023[58] : field5023[59]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method2669(int arg0) {
        int var1 = class3.field34;
        int[] var2 = class358.field5483;
        for (int var3 = 0; var3 < class6.field60 + var1; var3++) {
            class247 var4;
            if (var3 < var1) {
                var4 = class197.field2685[var2[var3]];
            } else {
                var4 = ((class383) class207.field3184.method977((long) class590.field8680[var3 - var1], 1)).field5799;
            }
            if (var4.field6200 == arg0 && var4.field3808 >= 0) {
                int var5 = var4.method2101(31463);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6197 & 0x1FF) != 0 || (var4.field6211 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field6197 & 0x1FF) != 256 || (var4.field6211 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field6197 >> 9;
                    int var7 = var4.field6211 >> 9;
                    if (var4.field3808 > class91.field1045[var6][var7]) {
                        class91.field1045[var6][var7] = var4.field3808;
                        class686.field9951[var6][var7] = 1;
                    } else if (class91.field1045[var6][var7] == var4.field3808) {
                        var10002 = class686.field9951[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field6197 - var8 >> 9;
                    int var10 = var4.field6211 - var8 >> 9;
                    int var11 = var4.field6197 + var8 >> 9;
                    int var12 = var4.field6211 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field3808 > class91.field1045[var13][var14]) {
                                class91.field1045[var13][var14] = var4.field3808;
                                class686.field9951[var13][var14] = 1;
                            } else if (class91.field1045[var13][var14] == var4.field3808) {
                                var10002 = class686.field9951[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lcn;)Lqv;")
    public static final class469 method2670(class541 arg0) {
        class469 var1 = (class469) class704.field10226.method977(((long) arg0.field8034 << 32) + (long) arg0.field7999, 1);
        return var1 == null ? arg0.field8046 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method2671(int arg0, int arg1) {
        try {
            class768.field11093.field1853 = arg0;
            class768.field11093.field1850++;
            class171.field2378 = null;
            class698.field10159 = null;
            field5003++;
            class318.field5034 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5023[57] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method1330(byte arg0) {
        try {
            field5008++;
            int var2 = -36 / ((-arg0 - 9) / 51);
            if (class289.field4305.field812.method1610(false) == 2) {
                try {
                    this.method2666(-1);
                } catch (ThreadDeath var6) {
                    throw var6;
                } catch (Throwable var7) {
                    class618.method4603((byte) -101, var7.getMessage() + field5023[1] + this.method1325((byte) -91), var7);
                    class234.field3526 = true;
                    class640.method4693(0, -13558, false);
                }
            } else {
                this.method2666(-1);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field5023[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lcn;)Lcn;")
    public static final class541 method2672(class541 arg0) {
        int var1 = method2670(arg0).method3562(-766732782);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class461.method3513(arg0.field8079, 117);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method2673() {
        int var0 = class3.field34;
        int[] var1 = class358.field5483;
        int var2 = class289.field4305.field833.method3854(false);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class726 var14 = class197.field2685[var1[var4]];
            if (!var14.method5290((byte) -102)) {
                var14.field3808 = -1;
            } else if (var14.field10511) {
                var14.field3808 = -1;
            } else {
                var14.method1904(310992073);
                if (var14.field5330 >= 0 && var14.field5329 >= 0 && var14.field5335 < class648.field9378 && var14.field5325 < class659.field9506) {
                    var14.field10500 = var14.field3849 ? var3 : false;
                    if (class225.field3446 == var14) {
                        var14.field3808 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field3800) {
                            var15++;
                        }
                        if (var14.field3787 > class375.field5711) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method2101(31463) << 2);
                        if (var14.field10512 || var14.field10494) {
                            var16 += 512;
                        } else {
                            if (class279.field4192 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field3808 = var16 + 1;
                    }
                } else {
                    var14.field3808 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class6.field60; var5++) {
            class612 var11 = ((class383) class207.field3184.method977((long) class590.field8680[var5], 1)).field5799;
            if (var11.method4525((byte) -102) && var11.field8947.method3746(32073, class276.field4168)) {
                var11.method1904(310992073);
                if (var11.field5330 >= 0 && var11.field5329 >= 0 && var11.field5335 < class648.field9378 && var11.field5325 < class659.field9506) {
                    int var12 = 0;
                    if (!var11.field3800) {
                        var12++;
                    }
                    if (var11.field3787 > class375.field5711) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method2101(31463) << 2);
                    if (class279.field4192 == 0) {
                        if (var11.field8947.field7126) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class279.field4192 == 1) {
                        if (var11.field8947.field7126) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field8947.field7128) {
                        var13 += 1024;
                    } else if (!var11.field8947.field7169) {
                        var13 += 256;
                    }
                    var11.field3808 = var13 + 1;
                } else {
                    var11.field3808 = -1;
                }
            } else {
                var11.field3808 = -1;
            }
        }
        for (int var6 = 0; var6 < class708.field10260.length; var6++) {
            class352 var7 = class708.field10260[var6];
            if (var7 != null) {
                if (var7.field5432 == 1) {
                    class383 var8 = (class383) class207.field3184.method977((long) var7.field5435, 1);
                    if (var8 != null) {
                        class612 var9 = var8.field5799;
                        if (var9.field3808 >= 0) {
                            var9.field3808 += 2048;
                        }
                    }
                } else if (var7.field5432 == 10) {
                    class726 var10 = class197.field2685[var7.field5435];
                    if (var10 != null && class225.field3446 != var10 && var10.field3808 >= 0) {
                        var10.field3808 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1332(int arg0) {
        try {
            field5011++;
            method2674(arg0 - 1);
            class490.method3708(16384);
            class185.method1615(114);
            class313.method2639(-115);
            class309.method2617(true);
            class544.method4108((byte) -69);
            class134.method1146(99);
            class275.method2272((byte) 103);
            class55.method414((byte) 127);
            class176.method1540(false);
            class772.method5593(-107);
            class680.method4985(arg0 - 10633);
            class279.method2291(true);
            class91.method777(-8450);
            class437.method3347((byte) 37);
            class206.method1826(1);
            class540.method4066(-29448);
            class112.method975((byte) 8);
            class7.method53((byte) -114);
            class547.method4126(-816252050);
            class646.method4757((byte) -110);
            class8.method59(16384);
            class501.method3778(4);
            class66.method571(arg0 ^ 0xFFFFFFB4);
            class73.method657(false);
            class10.method70(14443);
            class352.method2886(2);
            class702.method5131((byte) -32);
            class513.method3870((byte) -125);
            class504.method3803(0);
            class149.method1251((byte) -28);
            class251.method2121(64);
            class499.method3771((byte) 115);
            class447.method3432(2);
            class411.method3201((byte) 127);
            class178.method1561(false);
            class661.method4845(arg0);
            class381.method3054((byte) 126);
            class389.method3099(-86);
            class196.method1665(45);
            class743.method5419((byte) -64);
            class656.method4815(828603369);
            class152.method1278((byte) -76);
            class45.method353((byte) 2);
            class376.method3031(arg0 + 112);
            class68.method618(2);
            class618.method4605((byte) -114);
            class569.method4252((byte) 46);
            class682.method4998(9369);
            class302.method2536(35);
            class271.method2245(1000);
            class107.method937(false);
            class11.method77(true);
            class297.method2507((byte) -77);
            class405.method3181((byte) 26);
            class334.method2802((byte) -112);
            class571.method4268(-14);
            class354.method2900(10);
            class9.method62(arg0);
            class674.method4956((byte) 108);
            class383.method3068((byte) 112);
            class319.method2699(12345678);
            class163.method1466((byte) -122);
            class216.method1887(false);
            class516.method3916(arg0 ^ 0x63A7);
            class321.method2720(arg0);
            class324.method2739((byte) 79);
            class89.method764(arg0 - 53);
            class408.method3189(-23866);
            class460.method3505(0);
            class614.method4544(21608);
            class541.method4076(0);
            class523.method3966(true);
            class241.method2060(20);
            class514.method3897((byte) 122);
            class705.method5152((byte) -79);
            class244.method2079(1);
            class247.method2104(arg0);
            class96.method809((byte) -114);
            class713.method5195((byte) -128);
            class719.method5242(95);
            class612.method4523(arg0 ^ 0x61);
            class454.method3478((byte) 103);
            class349.method2868(arg0 + 779);
            class28.method194(-35);
            class483.method3684(false);
            class534.method4032(arg0);
            class640.method4695(-24672);
            class58.method428(-1);
            class215.method1878(0);
            class430.method3300((byte) -128);
            class473.method3593(87);
            class708.method5165(31138);
            class604.method4480((byte) 127);
            class21.method143(arg0 + 443);
            class166.method1479(true);
            class651.method4782(-8);
            class744.method5424(123);
            class683.method5009(false);
            class727.method5303((byte) 21);
            class273.method2260(-94);
            class704.method5146(0);
            class116.method1021(-3);
            class87.method732(-78);
            class694.method5072((byte) -116);
            class497.method3758(0);
            class231.method1982(-48);
            class338.method2816((byte) 57);
            class299.method2521(true);
            class179.method1574(-8995);
            class781.method5643((byte) -117);
            class198.method1774(arg0 ^ 0xFFFF9E80);
            class137.method1168((byte) 95);
            class433.method3315(true);
            class294.method2405(-127);
            class282.method2311(116);
            class496.method3741(arg0 + 91);
            class530.method3998((byte) 117);
            class67.method607(0);
            class236.method2015(-6925);
            class595.method4429(false);
            class739.method5390(Integer.MIN_VALUE);
            class364.method2951(-26071);
            class224.method1940(-78);
            class340.method2829((byte) 69);
            class470.method3568((byte) -125);
            class762.method5515(false);
            class511.method3853((byte) 47);
            class117.method1029(58);
            class16.method114((byte) 20);
            class71.method647(false);
            class402.method3156(2);
            class647.method4762(-29994);
            class409.method3193((byte) -64);
            class754.method5475((byte) 62);
            class138.method1183(true);
            class184.method1611(arg0 + 3);
            class84.method718(122);
            class475.method3610(arg0 ^ 0xFFFFFFFD);
            class769.method5547(false);
            class154.method1286(64);
            class608.method4500(arg0 + 36);
            class465.method3534((byte) 46);
            class165.method1474(-1);
            class629.method4661(0);
            class54.method408(arg0 - 10);
            class593.method4417((byte) 95);
            class521.method3957(7689);
            class382.method3063(25632);
            class512.method3859(123);
            class434.method3320((byte) -105);
            class580.method4338(3692);
            class343.method2844(arg0 ^ 0x7F54);
            class420.method3251((byte) 59);
            class616.method4567((byte) 118);
            class391.method3107((byte) -44);
            class782.method5656();
            class790.method5705(-5882);
            class550.method4143(0);
            class732.method5338(false);
            class104.method916(0);
            class686.method5028(4);
            class20.method140(3);
            class415.method3217((byte) 35);
            class757.method5490((byte) -28);
            class626.method4645((byte) -111);
            class456.method3483((byte) 11);
            class186.method1620(true);
            class653.method4791(0);
            class336.method2811((byte) 45);
            class256.method2169(arg0 + 121);
            class477.method3654((byte) 7);
            class627.method4653(true);
            class146.method1233(-30339);
            class725.method5284((byte) -51);
            class161.method1392();
            class717.method5223(arg0 - 1);
            class48.method373((byte) 96);
            class98.method819(arg0 ^ 0xFFFFFFC8);
            class269.method2230((byte) 97);
            class601.method4464(-1782698960);
            class365.method2959((byte) -28);
            class598.method4449(true);
            class613.method4533(true);
            class288.method2340((byte) 48);
            class416.method3232((byte) 126);
            class214.method1875((byte) -24);
            class260.method2192(-13936);
            class49.method377((byte) 76);
            class199.method1788(2);
            class619.method4623();
            class144.method1219((byte) 111);
            class418.method3241(-124);
            class660.method4840((byte) 121);
            class128.method1115(4);
            class123.method1068((byte) -64);
            class561.method4194(false);
            class599.method4454((byte) -106);
            class342.method2839(0);
            class131.method1134(-51);
            class306.method2597((byte) 116);
            class718.method5239();
            class675.method4960((byte) 66);
            class39.method262((byte) 123);
            class263.method2205((byte) 48);
            class86.method726((byte) 125);
            class603.method4473(-127);
            class267.method2222(true);
            class574.method4282(arg0 ^ 0xFFFFFF8A);
            class440.method3380((byte) 122);
            class643.method4713(-54);
            class253.method2142(arg0 - 1);
            class749.method5449((byte) 97);
            class69.method632(107);
            class261.method2197(-13679);
            class535.method4036(5);
            class681.method4990(false);
            class194.method1658((byte) -118);
            class223.method1935((byte) 40);
            class404.method3180();
            class659.method4832(22796);
            class426.method3285(0);
            class254.method2151((byte) -93);
            class311.method2623(arg0 - 104);
            class18.method127();
            class590.method4390(arg0 - 96);
            class217.method1899((byte) -68);
            class57.method423((byte) -50);
            class495.method3736(true);
            class278.method2284((byte) 120);
            class142.method1212(-17552);
            class438.method3370();
            class133.method1142((byte) -125);
            class195.method1661((byte) 116);
            class180.method1578(-4);
            class502.method3781(arg0 + 3061);
            class403.method3160((byte) 99);
            class564.method4208((byte) 115);
            class77.method687(arg0 + 126);
            class314.method2645((byte) -103);
            class709.method5171((byte) 39);
            class181.method1584(1);
            class102.method838(103);
            class412.method3206((byte) 56);
            class740.method5395(-2);
            class242.method2067(false);
            class542.method4100(arg0 - 1);
            class316.method2657((byte) 43);
            class70.method639(1);
            class200.method1794((byte) -79);
            class93.method795((byte) -91);
            class400.method3148(2686);
            class622.method4631((byte) -91);
            class83.method711(-1);
            class356.method2917((byte) 41);
            class277.method2280((byte) -92);
            class115.method1017(false);
            class536.method4040((byte) -89);
            class218.method1909(true);
            class759.method5499(true);
            class672.method4942(arg0 ^ 0xFFFFFFB4);
            class31.method205(114);
            class41.method277(-113);
            class662.method4857(false);
            class207.method1830((byte) 125);
            class291.method2358(0);
            class295.method2413(-21061);
            class318.method2693(arg0);
            class289.method2350(10265);
            class748.method5445(107);
            class26.method184(arg0 - 8174);
            class125.method1092(2048);
            class677.method4968((byte) 70);
            class362.method2940((byte) 55);
            class520.method3954(112);
            class155.method1294((byte) 37);
            class13.method93((byte) 15);
            class745.method5435(0);
            class494.method3731(-341);
            class97.method814(0);
            class669.method4921((byte) 119);
            class668.method4918((byte) -39);
            class610.method4509(-111);
            class358.method2922(false);
            class783.method5669(80);
            class630.method4665(0);
            class265.method2215(76);
            class538.method4058(true);
            class50.method384(6825);
            class439.method3377(-1221431323);
            class443.method3407(false);
            class735.method5366(-4);
            class225.method1951((byte) -31);
            class298.method2514((byte) 44);
            class80.method695(6798);
            class248.method2114(arg0 - 84);
            class264.method2209((byte) -109);
            class385.method3077(34);
            class23.method162(false);
            class670.method4928(0);
            class222.method1925(false);
            class307.method2604(arg0 ^ 0xE);
            class189.method1639();
            class729.method5318(16);
            class90.method772(false);
            class283.method2315(1722197923);
            class459.method3498(-88);
            class742.method5410((byte) 70);
            class779.method5631((byte) -101);
            class150.method1266(arg0 + 2);
            class419.method3246(-112);
            class609.method4504(arg0 ^ 0xFFFF904B);
            class183.method1599(-20693);
            class43.method290(0);
            class245.method2082((byte) -98);
            class515.method3909(-23014);
            class575.method4288(1171);
            class436.method3345();
            class210.method1847(false);
            class266.method2219();
            class764.method5529();
            class545.method4114((byte) 94);
            class221.method1924();
            class101.method830((byte) -103);
            class140.method1202((byte) -29);
            class211.method1855(true);
            class274.method2265(-10);
            class262.method2202(-1592534046);
            class568.method4246(-6271);
            class74.method669(arg0 ^ 0x766FA608);
            class787.method5696((byte) 75);
            class47.method366(true);
            class387.method3088(true);
            class85.method722(-31019);
            class27.method189((byte) 78);
            class396.method3128(29896);
            class384.method3072(arg0 - 3436);
            class484.method3689((byte) 15);
            class315.method2651(0);
            class507.method3818((byte) -103);
            class422.method3260(true);
            class533.method4029((byte) 99);
            class596.method4438(103);
            class594.method4425(true);
            class606.method4488(2);
            class442.method3398();
            class785.method5681(arg0 + 419684);
            class554.method4171((byte) -33);
            class777.method5621(123);
            class255.method2163((byte) 118);
            class774.method5607(32);
            class232.method1986(-1);
            class203.method1807((byte) -41);
            class212.method1864(90);
            class751.method5460(0);
            class5.method31(2);
            class148.method1240(-18694);
            class205.method1820(86);
            class132.method1139(arg0 - 1);
            class678.method4971(0);
            class76.method680(109);
            class592.method4408((byte) -61);
            class784.method5672(-111);
            class666.method4907(17742);
            class559.method4185(arg0 ^ 0x1);
            class792.method5713((byte) -85);
            class197.method1735(true);
            class457.method3487(Integer.MAX_VALUE);
            class734.method5357((byte) 59);
            class638.method4680(0);
            class372.method3003((byte) 65);
            class768.method5542((byte) -126);
            class587.method4376(0);
            class113.method985(0);
            class156.method1308(-1);
            class517.method3924(120);
            class689.method5047(-29971);
            class758.method5493(arg0 + 115);
            class61.method443(-1);
            class519.method3943((byte) -30);
            class353.method2894(-75);
            class532.method4023(0);
            class296.method2480(arg0 + 77);
            class778.method5627(-124);
            class157.method1320(14394);
            class182.method1591(arg0 ^ 0xFFFFA733);
            class770.method5577(115);
            class139.method1190(-38140856);
            class290.method2355(arg0 ^ 0x3);
            class531.method4017((byte) 124);
            class129.method1122((byte) -74);
            class724.method5277((byte) -108);
            class301.method2529(91);
            class466.method3540(0);
            class728.method5311(0);
            class505.method3808((byte) 120);
            class239.method2047(false);
            class169.method1496(0);
            class259.method2186(arg0 ^ 0x69);
            class690.method5054(32);
            class458.method3493(16);
            class563.method4204();
            class463.method3522(true);
            class555.method4178(4096);
            class432.method3312(-1671730960);
            class553.method4161(-3);
            class151.method1270(0);
            class566.method4219(-15739);
            class671.method4938(false);
            class209.method1840(-5570);
            class374.method3012(true);
            class220.method1921(true);
            class366.method2966(-3);
            class167.method1484(arg0 ^ 0x8);
            class141.method1207((byte) -71);
            class750.method5455(arg0 + 13457);
            class617.method4597(124);
            class188.method1631(7365);
            class330.method2789(arg0 ^ 0x190A);
            class106.method932((byte) 109);
            class29.method198(arg0 + 4096);
            class60.method439(arg0 ^ 0x1);
            class565.method4216(3);
            class36.method237((byte) 101);
            class624.method4637(-2145518804);
            class153.method1282(false);
            class673.method4949(false);
            class172.method1530(715572492);
            class771.method5583(arg0 + 35);
            class522.method3963();
            class360.method2929(512);
            class741.method5404(77);
            class711.method5187((byte) 102);
            class737.method5380(-2);
            class369.method2984((byte) -128);
            class492.method3717(arg0 ^ 0x6D);
            class698.method5082(7435);
            class628.method4656((byte) -104);
            class170.method1511(arg0 ^ 0x58F98303);
            class335.method2805(arg0 ^ 0xFFFFBCDB);
            class322.method2729(1360262563);
            class486.method3694((byte) -126);
            class320.method2715(-24708);
            class657.method4821((byte) 94);
            class351.method2883(true);
            class493.method3727(arg0 + 31359);
            class786.method5691(13398);
            class130.method1128(arg0);
            class370.method2988((byte) -126);
            class524.method3969(true);
            class716.method5214(true);
            class114.method1006(arg0 ^ 0x1D4D);
            class208.method1834((byte) 87);
            class761.method5507((byte) -120);
            class204.method1813(arg0 + 6408);
            class64.method455(69);
            class667.method4913((byte) -95);
            class489.method3704(-64);
            class312.method2631((byte) 121);
            class423.method3267(96);
            class81.method704(10242);
            class1.method2(1);
            class663.method4863((byte) -25);
            class110.method964(arg0 ^ 0x2100);
            class286.method2325(arg0 ^ 0x2);
            class72.method650(35632);
            class414.method3212(95);
            class562.method4197((byte) 77);
            class589.method4386(false);
            class451.method3461((byte) 64);
            class747.method5440(arg0);
            class712.method5191(arg0 + 12);
            class192.method1650((byte) -109);
            class355.method2908((byte) 125);
            class100.method827((byte) 100);
            class722.method5272((byte) 127);
            class429.method3294(-114);
            class478.method3659(arg0);
            class597.method4443(98);
            class684.method5015(29653);
            class730.method5328((byte) -66);
            class548.method4132(6);
            class625.method4641(0);
            class300.method2526(47);
            class38.method255((byte) 71);
            class40.method273(true);
            class227.method1962((byte) -79);
            class2.method11((byte) -57);
            class88.method744(31524);
            class710.method5180(0);
            class108.method950(arg0 - 32541);
            class95.method806((byte) 21);
            class361.method2935(8070);
            class452.method3467(65535);
            class375.method3019((byte) 82);
            class3.method23(arg0 + 1);
            class549.method4139((byte) 81);
            class528.method3987(-16);
            class127.method1110((byte) 88);
            class121.method1053((byte) 30);
            class591.method4404(arg0 ^ 0xFFFFA44F);
            class65.method465(true);
            class715.method5203((byte) -62);
            class695.method5075(-15503);
            class226.method1954(128);
            class371.method2991((byte) 116);
            class143.method1215((byte) 119);
            class304.method2581((byte) -49);
            class329.method2785(arg0);
            class394.method3121((byte) -126);
            class753.method5472((byte) -44);
            class12.method85(0);
            class639.method4689((byte) 50);
            class474.method3601(-70);
            class327.method2767(true);
            class238.method2042(-6915);
            class655.method4805(arg0 + 32591);
            class417.method3236(-20679);
            class506.method3813(arg0 + 255);
            class546.method4119((byte) -70);
            class788.method5700(-115);
            class6.method42(4);
            class560.method4188(19524);
            class168.method1492((byte) -19);
            class341.method2834((byte) 118);
            class243.method2072((byte) 94);
            class518.method3934(-3301);
            class755.method5482(false);
            class551.method4150(68);
            class233.method1991(-1);
            class572.method4273(-83);
            class235.method2003(arg0 - 1);
            class733.method5347((byte) -65);
            class776.method5618(arg0);
            class645.method4747(10);
            class118.method1038((byte) 62);
            class272.method2252(true);
            class605.method4483(7);
            class109.method957(-127);
            class586.method4370(-7803);
            class94.method800(44);
            class187.method1625(115);
            class611.method4516(arg0 ^ 0x6E);
            class634.method4675((byte) -59);
            class234.method1998(16750);
            class339.method2824(3);
            class122.method1058((byte) -5);
            class276.method2276((byte) 70);
            class752.method5466(-1982613620);
            class398.method3139(-97);
            class171.method1520(false);
            class693.method5068(false);
            class579.method4329((byte) -91);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5023[94] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static void method2674(int arg0) {
        try {
            field5013 = null;
            if (arg0 != -1) {
                field5001 = null;
            }
            field5001 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5023[28] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lcn;IIIIIIIIIII)V")
    public static final void method2675(class541[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label824: for (int var12 = 0; var12 < arg0.length; var12++) {
            class541 var13 = arg0[var12];
            if (var13 != null && var13.field8079 == arg1) {
                int var14 = var13.field8019 + arg6;
                int var15 = var13.field8013 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field8042 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field8029 + var14;
                    int var21 = var13.field8045 + var15;
                    if (var13.field8042 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field8042 == 0 || var13.field7960 || method2670(var13).field6808 != 0 || class533.field7816 == var13 || class232.field3504 == var13.field8002 || class716.field10367 == var13.field8002) {
                    if (!method2679(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class235.field3549) {
                            var22 = class398.method3141(1);
                            var23 = class779.method5635((byte) 32);
                        }
                        if (class69.field740 == var13 && class714.method5200(class69.field740, (byte) 123) != null) {
                            class177.field2460 = true;
                            class219.field3392 = var14;
                            class491.field7037 = var15;
                        }
                        if (var13.field7942 || var16 < var18 && var17 < var19) {
                            if (var13.field8041 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class86 var24 = (class86) class749.field10905.method3863((byte) 64); var24 != null; var24 = (class86) class749.field10905.method3862(-353)) {
                                    if (var24.field963) {
                                        var24.method1824(1);
                                        var24.field959.field8083 = false;
                                    }
                                }
                                if (class31.field361 == 0) {
                                    class69.field740 = null;
                                    class533.field7816 = null;
                                }
                                class537.field7852 = 0;
                                class775.field11253 = false;
                                class22.field257 = false;
                                if (!class216.field3297) {
                                    class258.method2180(true);
                                }
                            }
                            boolean var25;
                            if (class606.field8875.method401(16428) + var22 >= var16 && class606.field8875.method391((byte) 94) + var23 >= var17 && class606.field8875.method401(16428) + var22 < var18 && class606.field8875.method391((byte) 94) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class728.field10555 && var25) {
                                if (var13.field7968 >= 0) {
                                    class311.field4926 = var13.field7968;
                                } else if (var13.field8041) {
                                    class311.field4926 = -1;
                                }
                            }
                            if (!class216.field3297 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class163.method1422((byte) -102, var13, arg10 - var14, arg11 - var15);
                            }
                            boolean var26 = false;
                            if (class606.field8875.method394(0) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class394 var28 = (class394) class417.field6150.method3863((byte) 64);
                            if (var28 != null && var28.method2182((byte) 117) == 0 && var28.method2178(false) + var22 >= var16 && var28.method2177((byte) 107) + var23 >= var17 && var28.method2178(false) + var22 < var18 && var28.method2177((byte) 107) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field8055 != null && !class324.method2740(false)) {
                                for (int var29 = 0; var29 < var13.field8055.length; var29++) {
                                    if (class597.field8749.method89(false, var13.field8055[var29])) {
                                        if (var13.field7978 == null || class375.field5711 >= var13.field7978[var29]) {
                                            byte var30 = var13.field8023[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class597.field8749.method89(false, 86) && !class597.field8749.method89(false, 82) && !class597.field8749.method89(false, 81)) && ((var30 & 0x2) == 0 || class597.field8749.method89(false, 86)) && ((var30 & 0x1) == 0 || class597.field8749.method89(false, 82)) && ((var30 & 0x4) == 0 || class597.field8749.method89(false, 81))) {
                                                if (var29 < 10) {
                                                    class663.method4861("", var13.field8034, -1, var29 + 1, 9);
                                                } else if (var29 == 10) {
                                                    class431.method3305(-1);
                                                    class469 var31 = method2670(var13);
                                                    class209.method1839(var31.field6817, false, var13, var31.method3564(122));
                                                    class10.field116 = class745.method5431(-1, var13);
                                                    if (class10.field116 == null) {
                                                        class10.field116 = field5023[68];
                                                    }
                                                    class740.field10757 = var13.field7985 + field5023[67];
                                                }
                                                int var32 = var13.field8038[var29];
                                                if (var13.field7978 == null) {
                                                    var13.field7978 = new int[var13.field8055.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field7978[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field7978[var29] = class375.field5711 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field7978 != null) {
                                        var13.field7978[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class307.method2607(var23 + var28.method2177((byte) 107) - var15, -116, var22 + var28.method2178(false) - var14, var13);
                            }
                            if (class69.field740 != null && class69.field740 != var13 && var25 && method2670(var13).method3560(-1)) {
                                class677.field9834 = var13;
                            }
                            if (class533.field7816 == var13) {
                                class199.field3115 = true;
                                class190.field2583 = var14;
                                class651.field9416 = var15;
                            }
                            if (var13.field7960 || var13.field8002 != 0) {
                                if (var25 && class166.field2291 != 0 && var13.field8105 != null) {
                                    class86 var33 = new class86();
                                    var33.field963 = true;
                                    var33.field959 = var13;
                                    var33.field961 = class166.field2291;
                                    var33.field957 = var13.field8105;
                                    class749.field10905.method3868(101, var33);
                                }
                                if (class69.field740 != null || class216.field3297 || class722.field10455 != var13.field8002 && class537.field7852 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field8002 != 0) {
                                    if (class768.field11116 == var13.field8002 || class418.field6162 == var13.field8002) {
                                        class647.field9375 = var13;
                                        if (class492.field7061 != null) {
                                            class492.field7061.method3506(var13.field8045, class610.field8913, 127);
                                        }
                                        if (class768.field11116 == var13.field8002) {
                                            if (class216.field3297 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class656.method4811(-105, class610.field8913, arg9, arg8);
                                            class536 var34 = (class536) class622.field9116.method4538(false);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label824;
                                                }
                                                if (arg10 >= var34.field7840 && arg10 < var34.field7841 && arg11 >= var34.field7845 && arg11 < var34.field7846) {
                                                    class258.method2180(true);
                                                    class657.method4823(var34.field7847, 23401);
                                                }
                                                var34 = (class536) class622.field9116.method4543(0);
                                            }
                                        }
                                    }
                                    if (class232.field3504 == var13.field8002) {
                                        if (var13.method4090(-28749, class610.field8913) == null || class582.field8619 != 0 && class582.field8619 != 3 || class216.field3297 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field7941[var36];
                                        if (var35 < var37 || var35 > var13.field8061[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field8029 / 2;
                                        int var39 = var36 - var13.field8045 / 2;
                                        int var40;
                                        if (class185.field2559 == 4) {
                                            var40 = (int) class377.field5748 & 0x3FFF;
                                        } else {
                                            var40 = (int) class377.field5748 + class550.field8201 & 0x3FFF;
                                        }
                                        int var41 = class298.field4704[var40];
                                        int var42 = class298.field4703[var40];
                                        if (class185.field2559 != 4) {
                                            var41 = (class681.field9866 + 256) * var41 >> 8;
                                            var42 = (class681.field9866 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class185.field2559 == 4) {
                                            var45 = (class194.field2605 >> 9) + (var43 >> 2);
                                            var46 = (class114.field1356 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class225.field3446.method2101(31463) - 1) * 256;
                                            var45 = (class225.field3446.field6197 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class225.field3446.field6211 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class728.field10555 && (class517.field7484 & 0x40) != 0) {
                                            class541 var48 = class211.method1854(class173.field2406, class729.field10569, false);
                                            if (var48 == null) {
                                                class431.method3305(-1);
                                            } else {
                                                class719.method5244(var45, (long) (var13.field7999 << 0 | var13.field8034), false, 1L, class10.field116, var46, true, field5023[69], class586.field8637, (byte) 123, 11, true, var13.field8100);
                                            }
                                            continue;
                                        }
                                        if (class447.field6576 == class239.field3624) {
                                            class719.method5244(var45, 0L, false, 1L, class309.field4874.method2616(false, class167.field2300), var46, true, "", -1, (byte) -19, 6, true, -1);
                                        }
                                        class719.method5244(var45, 0L, false, 1L, class212.field3246, var46, true, "", class706.field10253, (byte) 125, 12, true, -1);
                                        continue;
                                    }
                                    if (class722.field10455 == var13.field8002) {
                                        class67.field705 = var13;
                                        if (var25) {
                                            class775.field11253 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method2178(false) - var14 - var13.field8029 / 2) * 2.0D / (double) class161.field2163);
                                            int var50 = (int) (-((double) (var23 + var28.method2177((byte) 107) - var15 - var13.field8045 / 2) * 2.0D / (double) class161.field2163));
                                            int var51 = class494.field7096 + var49 + class161.field2171;
                                            int var52 = class560.field8334 + var50 + class161.field2167;
                                            class363 var53 = class258.method2175(7);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method2947(var51, var52, var54, 255);
                                            if (var54 != null) {
                                                if (class597.field8749.method89(false, 82) && class757.field10995 > 0) {
                                                    class385.method3075(1, var54[0], var54[2], var54[1]);
                                                    continue;
                                                }
                                                class22.field257 = true;
                                                class339.field5283 = var54[0];
                                                class569.field8416 = var54[1];
                                                class616.field9056 = var54[2];
                                            }
                                            class537.field7852 = 1;
                                            class382.field5794 = false;
                                            class491.field7041 = class606.field8875.method401(16428);
                                            class322.field5074 = class606.field8875.method391((byte) 94);
                                            continue;
                                        }
                                        if (var26 && class537.field7852 > 0) {
                                            if (class537.field7852 == 1 && (class491.field7041 != class606.field8875.method401(16428) || class322.field5074 != class606.field8875.method391((byte) 94))) {
                                                class678.field9837 = class494.field7096;
                                                class389.field5866 = class560.field8334;
                                                class537.field7852 = 2;
                                            }
                                            if (class537.field7852 == 2) {
                                                class382.field5794 = true;
                                                class618.method4606(125, class678.field9837 + (int) ((double) (class491.field7041 - class606.field8875.method401(16428)) * 2.0D / (double) class161.field2159));
                                                class288.method2341(class389.field5866 - (int) ((double) (class322.field5074 - class606.field8875.method391((byte) 94)) * 2.0D / (double) class161.field2159), (byte) -47);
                                            }
                                            continue;
                                        }
                                        if (class537.field7852 > 0 && !class382.field5794) {
                                            if ((class74.field864 == 1 || class370.method2987((byte) -18)) && class593.field8707 > 2) {
                                                class660.method4838(-19416, class491.field7041, class322.field5074);
                                            } else if (class761.method5509(-13078)) {
                                                class660.method4838(-19416, class491.field7041, class322.field5074);
                                            }
                                        }
                                        class537.field7852 = 0;
                                        continue;
                                    }
                                    if (class557.field8292 == var13.field8002) {
                                        if (var26) {
                                            class107.method943(var13.field8045, var22 + class606.field8875.method401(16428) - var14, var23 + class606.field8875.method391((byte) 94) - var15, 60, var13.field8029);
                                        }
                                        continue;
                                    }
                                    if (class716.field10367 == var13.field8002) {
                                        class50.method385(var15, var14, var13, (byte) 105);
                                        continue;
                                    }
                                }
                                if (!var13.field8006 && var27) {
                                    var13.field8006 = true;
                                    if (var13.field7946 != null) {
                                        class86 var55 = new class86();
                                        var55.field963 = true;
                                        var55.field959 = var13;
                                        var55.field956 = var22 + var28.method2178(false) - var14;
                                        var55.field961 = var23 + var28.method2177((byte) 107) - var15;
                                        var55.field957 = var13.field7946;
                                        class749.field10905.method3868(95, var55);
                                    }
                                }
                                if (var13.field8006 && var26 && var13.field7965 != null) {
                                    class86 var56 = new class86();
                                    var56.field963 = true;
                                    var56.field959 = var13;
                                    var56.field956 = var22 + class606.field8875.method401(16428) - var14;
                                    var56.field961 = var23 + class606.field8875.method391((byte) 94) - var15;
                                    var56.field957 = var13.field7965;
                                    class749.field10905.method3868(-101, var56);
                                }
                                if (var13.field8006 && !var26) {
                                    var13.field8006 = false;
                                    if (var13.field7933 != null) {
                                        class86 var57 = new class86();
                                        var57.field963 = true;
                                        var57.field959 = var13;
                                        var57.field956 = var22 + class606.field8875.method401(16428) - var14;
                                        var57.field961 = var23 + class606.field8875.method391((byte) 94) - var15;
                                        var57.field957 = var13.field7933;
                                        class610.field8911.method3868(90, var57);
                                    }
                                }
                                if (var26 && var13.field8072 != null) {
                                    class86 var58 = new class86();
                                    var58.field963 = true;
                                    var58.field959 = var13;
                                    var58.field956 = var22 + class606.field8875.method401(16428) - var14;
                                    var58.field961 = var23 + class606.field8875.method391((byte) 94) - var15;
                                    var58.field957 = var13.field8072;
                                    class749.field10905.method3868(106, var58);
                                }
                                if (!var13.field8083 && var25) {
                                    var13.field8083 = true;
                                    if (var13.field8064 != null) {
                                        class86 var59 = new class86();
                                        var59.field963 = true;
                                        var59.field959 = var13;
                                        var59.field956 = var22 + class606.field8875.method401(16428) - var14;
                                        var59.field961 = var23 + class606.field8875.method391((byte) 94) - var15;
                                        var59.field957 = var13.field8064;
                                        class749.field10905.method3868(-51, var59);
                                    }
                                }
                                if (var13.field8083 && var25 && var13.field7953 != null) {
                                    class86 var60 = new class86();
                                    var60.field963 = true;
                                    var60.field959 = var13;
                                    var60.field956 = var22 + class606.field8875.method401(16428) - var14;
                                    var60.field961 = var23 + class606.field8875.method391((byte) 94) - var15;
                                    var60.field957 = var13.field7953;
                                    class749.field10905.method3868(-76, var60);
                                }
                                if (var13.field8083 && !var25) {
                                    var13.field8083 = false;
                                    if (var13.field7940 != null) {
                                        class86 var61 = new class86();
                                        var61.field963 = true;
                                        var61.field959 = var13;
                                        var61.field956 = var22 + class606.field8875.method401(16428) - var14;
                                        var61.field961 = var23 + class606.field8875.method391((byte) 94) - var15;
                                        var61.field957 = var13.field7940;
                                        class610.field8911.method3868(-34, var61);
                                    }
                                }
                                if (var13.field8059 != null) {
                                    class86 var62 = new class86();
                                    var62.field959 = var13;
                                    var62.field957 = var13.field8059;
                                    class295.field4349.method3868(-75, var62);
                                }
                                if (var13.field8096 != null && class433.field6365 > var13.field7936) {
                                    if (var13.field8071 == null || class433.field6365 - var13.field7936 > 32) {
                                        class86 var67 = new class86();
                                        var67.field959 = var13;
                                        var67.field957 = var13.field8096;
                                        class749.field10905.method3868(-115, var67);
                                    } else {
                                        label711: for (int var63 = var13.field7936; var63 < class433.field6365; var63++) {
                                            int var64 = class541.field7990[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field8071.length; var65++) {
                                                if (var13.field8071[var65] == var64) {
                                                    class86 var66 = new class86();
                                                    var66.field959 = var13;
                                                    var66.field957 = var13.field8096;
                                                    class749.field10905.method3868(-36, var66);
                                                    break label711;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7936 = class433.field6365;
                                }
                                if (var13.field7949 != null && class708.field10262 > var13.field7959) {
                                    if (var13.field8089 == null || class708.field10262 - var13.field7959 > 32) {
                                        class86 var72 = new class86();
                                        var72.field959 = var13;
                                        var72.field957 = var13.field7949;
                                        class749.field10905.method3868(-122, var72);
                                    } else {
                                        label687: for (int var68 = var13.field7959; var68 < class708.field10262; var68++) {
                                            int var69 = class279.field4186[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field8089.length; var70++) {
                                                if (var13.field8089[var70] == var69) {
                                                    class86 var71 = new class86();
                                                    var71.field959 = var13;
                                                    var71.field957 = var13.field7949;
                                                    class749.field10905.method3868(102, var71);
                                                    break label687;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7959 = class708.field10262;
                                }
                                if (var13.field7977 != null && class320.field5060 > var13.field7984) {
                                    if (var13.field8088 == null || class320.field5060 - var13.field7984 > 32) {
                                        class86 var77 = new class86();
                                        var77.field959 = var13;
                                        var77.field957 = var13.field7977;
                                        class749.field10905.method3868(-72, var77);
                                    } else {
                                        label663: for (int var73 = var13.field7984; var73 < class320.field5060; var73++) {
                                            int var74 = class209.field3206[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field8088.length; var75++) {
                                                if (var13.field8088[var75] == var74) {
                                                    class86 var76 = new class86();
                                                    var76.field959 = var13;
                                                    var76.field957 = var13.field7977;
                                                    class749.field10905.method3868(-74, var76);
                                                    break label663;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7984 = class320.field5060;
                                }
                                if (var13.field7935 != null && class773.field11239 > var13.field7973) {
                                    if (var13.field8008 == null || class773.field11239 - var13.field7973 > 32) {
                                        class86 var82 = new class86();
                                        var82.field959 = var13;
                                        var82.field957 = var13.field7935;
                                        class749.field10905.method3868(83, var82);
                                    } else {
                                        label639: for (int var78 = var13.field7973; var78 < class773.field11239; var78++) {
                                            int var79 = class534.field7825[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field8008.length; var80++) {
                                                if (var13.field8008[var80] == var79) {
                                                    class86 var81 = new class86();
                                                    var81.field959 = var13;
                                                    var81.field957 = var13.field7935;
                                                    class749.field10905.method3868(99, var81);
                                                    break label639;
                                                }
                                            }
                                        }
                                    }
                                    var13.field7973 = class773.field11239;
                                }
                                if (var13.field8035 != null && class555.field8280 > var13.field8073) {
                                    if (var13.field7952 == null || class555.field8280 - var13.field8073 > 32) {
                                        class86 var87 = new class86();
                                        var87.field959 = var13;
                                        var87.field957 = var13.field8035;
                                        class749.field10905.method3868(-106, var87);
                                    } else {
                                        label615: for (int var83 = var13.field8073; var83 < class555.field8280; var83++) {
                                            int var84 = class151.field1864[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field7952.length; var85++) {
                                                if (var13.field7952[var85] == var84) {
                                                    class86 var86 = new class86();
                                                    var86.field959 = var13;
                                                    var86.field957 = var13.field8035;
                                                    class749.field10905.method3868(-52, var86);
                                                    break label615;
                                                }
                                            }
                                        }
                                    }
                                    var13.field8073 = class555.field8280;
                                }
                                if (class493.field7076 > var13.field8098 && var13.field7956 != null) {
                                    class86 var88 = new class86();
                                    var88.field959 = var13;
                                    var88.field957 = var13.field7956;
                                    class749.field10905.method3868(104, var88);
                                }
                                if (class117.field1392 > var13.field8098 && var13.field8075 != null) {
                                    class86 var89 = new class86();
                                    var89.field959 = var13;
                                    var89.field957 = var13.field8075;
                                    class749.field10905.method3868(-111, var89);
                                }
                                if (class584.field8622 > var13.field8098 && var13.field7989 != null) {
                                    class86 var90 = new class86();
                                    var90.field959 = var13;
                                    var90.field957 = var13.field7989;
                                    class749.field10905.method3868(86, var90);
                                }
                                if (class200.field3122 > var13.field8098 && var13.field7980 != null) {
                                    class86 var91 = new class86();
                                    var91.field959 = var13;
                                    var91.field957 = var13.field7980;
                                    class749.field10905.method3868(-56, var91);
                                }
                                if (class681.field9869 > var13.field8098 && var13.field8047 != null) {
                                    class86 var92 = new class86();
                                    var92.field959 = var13;
                                    var92.field957 = var13.field8047;
                                    class749.field10905.method3868(-121, var92);
                                }
                                if (class588.field8657 > var13.field8098 && var13.field8032 != null) {
                                    class86 var93 = new class86();
                                    var93.field959 = var13;
                                    var93.field957 = var13.field8032;
                                    class749.field10905.method3868(114, var93);
                                }
                                if (class40.field473 > var13.field8098 && var13.field8092 != null) {
                                    class86 var94 = new class86();
                                    var94.field959 = var13;
                                    var94.field957 = var13.field8092;
                                    class749.field10905.method3868(-49, var94);
                                }
                                var13.field8098 = class28.field349;
                                if (var13.field7928 != null) {
                                    for (int var95 = 0; var95 < class486.field7011; var95++) {
                                        class86 var96 = new class86();
                                        var96.field959 = var13;
                                        var96.field971 = class77.field889[var95].method3520((byte) 70);
                                        var96.field968 = class77.field889[var95].method3516(13112);
                                        var96.field957 = var13.field7928;
                                        class749.field10905.method3868(-42, var96);
                                    }
                                }
                                if (class176.field2457 && var13.field7972 != null) {
                                    class86 var97 = new class86();
                                    var97.field959 = var13;
                                    var97.field957 = var13.field7972;
                                    class749.field10905.method3868(-42, var97);
                                }
                            }
                            if (var13.field8042 == 5 && var13.field8085 != -1) {
                                var13.method4075(class13.field162, class596.field8739, 123).method3506(var13.field8045, class610.field8913, 117);
                            }
                            class254.method2153(var13, -6);
                            if (var13.field8042 == 0) {
                                method2675(arg0, var13.field8034, var16, var17, var18, var19, var14 - var13.field8014, var15 - var13.field7957, arg8, arg9, arg10, arg11);
                                if (var13.field7945 != null) {
                                    method2675(var13.field7945, var13.field8034, var16, var17, var18, var19, var14 - var13.field8014, var15 - var13.field7957, arg8, arg9, arg10, arg11);
                                }
                                class454 var98 = (class454) class661.field9563.method977((long) var13.field8034, 1);
                                if (var98 != null) {
                                    if (class447.field6576 == class243.field3725 && var98.field6635 == 0 && !class216.field3297 && var25 && !class90.field1028) {
                                        class258.method2180(true);
                                    }
                                    class561.method4192(var17, var19, var14, arg9, var18, arg8, arg11, var98.field6640, var16, -1, arg10, var15);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class254.method2153(var13, -6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method1323(byte arg0) {
        try {
            field5014++;
            if (class289.field4305.field812.method1610(false) == 2) {
                try {
                    this.method2676(-124);
                } catch (ThreadDeath var5) {
                    throw var5;
                } catch (Throwable var6) {
                    class618.method4603((byte) 125, var6.getMessage() + field5023[1] + this.method1325((byte) -83), var6);
                    class234.field3526 = true;
                    class640.method4693(0, -13558, false);
                }
            } else {
                this.method2676(-88);
            }
            if (arg0 > -65) {
                method2669(90);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5023[62] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method2676(int arg0) {
        try {
            field5017++;
            if (class138.field1645 != 14) {
                class375.field5711++;
                if (class375.field5711 % 1000 == 1) {
                    GregorianCalendar var2 = new GregorianCalendar();
                    class523.field7646 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
                    class717.field10397.setSeed((long) class523.field7646);
                }
                if ((class375.field5711 % 50) == 0) {
                    class384.field5817 = class311.field4932;
                    class293.field4329 = class653.field9442;
                    class311.field4932 = 0;
                    class653.field9442 = 0;
                }
                this.method2663(-124);
                if (class351.field5419 != null) {
                    class351.field5419.method2124((byte) -114);
                }
                class270.method2236(false);
                class256.method2168(-115);
                class597.field8749.method94((byte) -103);
                class606.field8875.method403(0);
                if (class610.field8913 != null) {
                    class610.field8913.method498((int) class430.method3299(92));
                }
                class8.method57(2);
                class486.field7011 = 0;
                class275.field4156 = 0;
                for (class462 var3 = class597.field8749.method97(5); var3 != null; var3 = class597.field8749.method97(5)) {
                    int var4 = var3.method3517((byte) 116);
                    if (var4 == 2 || var4 == 3) {
                        char var5 = var3.method3516(13112);
                        if (class336.method2810((byte) -128) && (var5 == '`' || var5 == '§' || var5 == '²')) {
                            if (class324.method2740(false)) {
                                class80.method697(0);
                            } else {
                                class156.method1314(0);
                            }
                        } else if (class486.field7011 < 128) {
                            class77.field889[class486.field7011] = var3;
                            class486.field7011++;
                        }
                    } else if (var4 == 0 && class275.field4156 < 75) {
                        class709.field10273[class275.field4156] = var3;
                        class275.field4156++;
                    }
                }
                class166.field2291 = 0;
                for (class394 var6 = class606.field8875.method396(15); var6 != null; var6 = class606.field8875.method396(15)) {
                    int var7 = var6.method2182((byte) 117);
                    if (var7 == -1) {
                        class118.field1405.method3868(-97, var6);
                    } else if (var7 == 6) {
                        class166.field2291 += var6.method2181(-2);
                    } else if (class675.method4959(var7, 1)) {
                        class417.field6150.method3868(-86, var6);
                        if (class417.field6150.method3874(-32154) > 10) {
                            class417.field6150.method3875(76);
                        }
                    }
                }
                if (arg0 > -65) {
                    field5013 = null;
                }
                if (class324.method2740(false)) {
                    class542.method4103((byte) 104);
                }
                if (class537.method4047(class138.field1645, -115)) {
                    class769.method5548(100);
                    class270.method2235(125);
                } else if (class432.method3310(class138.field1645, 256)) {
                    class375.method3020(-15815);
                }
                if (class197.method1677((byte) -92, class138.field1645) && !class432.method3310(class138.field1645, 256)) {
                    this.method2667((byte) -122);
                    class126.method1102(true);
                    class167.method1486(16);
                } else if (class212.method1866(4, class138.field1645) && !class432.method3310(class138.field1645, 256)) {
                    this.method2667((byte) -119);
                    class167.method1486(16);
                } else if (class138.field1645 == 12) {
                    class167.method1486(16);
                } else if (class179.method1573((byte) 59, class138.field1645) && !class432.method3310(class138.field1645, 256)) {
                    class138.method1181(true);
                } else if (class138.field1645 == 13) {
                    class167.method1486(16);
                    if (class684.field9918 != -3 && class684.field9918 != 2 && class684.field9918 != 15) {
                        class220.method1920(0, false);
                    }
                }
                class419.method3248(class610.field8913, (byte) 111);
                class417.field6150.method3875(122);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field5023[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;")
    public final String method1325(byte arg0) {
        try {
            field4999++;
            String var2 = null;
            try {
                var2 = field5023[13] + class494.field7101 + "," + class281.field4219 + "," + class648.field9378 + "," + class659.field9506 + "|";
                if (class225.field3446 != null) {
                    var2 = var2 + field5023[16] + class520.field7618 + "," + (class225.field3446.field3859[0] + class494.field7101) + "," + (class225.field3446.field3863[0] + class281.field4219) + "|";
                }
                var2 = var2 + field5023[6] + class289.field4305.field812.method1610(false) + field5023[18] + class289.field4305.field848.method4430(false) + field5023[9] + class451.method3463(1) + field5023[4] + class179.field2489 + "," + class94.field1062 + "|";
                var2 = var2 + field5023[12] + class289.field4305.field801.method1028(false) + "|";
                var2 = var2 + field5023[27] + class289.field4305.field810.method112(false) + "|";
                var2 = var2 + field5023[25] + class289.field4305.field799.method3608(false) + "|";
                if (arg0 > -82) {
                    field5015 = 34;
                }
                var2 = var2 + field5023[24] + class289.field4305.field835.method1184(false) + "|";
                var2 = var2 + field5023[23] + class289.field4305.field832.method5389(false) + "|";
                var2 = var2 + field5023[22] + class289.field4305.field825.method717(false) + "|";
                var2 = var2 + field5023[14] + class568.field8403 + "|";
                var2 = var2 + field5023[7] + class138.field1645;
                if (class306.field4779 != null) {
                    var2 = var2 + field5023[5] + class306.field4779.field99;
                }
                try {
                    if (class289.field4305.field812.method1610(false) == 2) {
                        Class var3 = Class.forName(field5023[19]);
                        Field var4 = var3.getDeclaredField(field5023[3]);
                        Class var5 = Class.forName(field5023[21]);
                        Method var6 = var5.getDeclaredMethod(field5023[15], Boolean.TYPE);
                        var6.invoke(var4, Boolean.TRUE);
                        Vector var7 = (Vector) var4.get((field5021 == null ? (field5021 = method2682(field5023[8])) : field5021).getClassLoader());
                        for (int var8 = 0; var8 < var7.size(); var8++) {
                            try {
                                Object var9 = var7.elementAt(var8);
                                Field var10 = var9.getClass().getDeclaredField(field5023[26]);
                                var6.invoke(var10, Boolean.TRUE);
                                try {
                                    String var11 = (String) var10.get(var9);
                                    if (var11 != null && var11.indexOf(field5023[20]) != -1) {
                                        Field var12 = var9.getClass().getDeclaredField(field5023[11]);
                                        var6.invoke(var12, Boolean.TRUE);
                                        var2 = var2 + field5023[17] + Long.toHexString(var12.getLong(var9));
                                        var6.invoke(var12, Boolean.FALSE);
                                    }
                                } catch (Throwable var14) {
                                }
                                var6.invoke(var10, Boolean.FALSE);
                            } catch (Throwable var15) {
                            }
                        }
                    }
                } catch (Throwable var16) {
                }
                var2 = var2 + "]";
            } catch (Throwable var17) {
            }
            return var2;
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field5023[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final synchronized void method1336(byte arg0) {
        try {
            field5004++;
            if (class629.field9206 != null && class502.field7252 == null && !class580.field8601.field395) {
                try {
                    Class var2 = class629.field9206.getClass();
                    Field var3 = var2.getDeclaredField(field5023[66]);
                    class502.field7252 = (Canvas) var3.get(class629.field9206);
                    var3.set(class629.field9206, null);
                    if (class502.field7252 != null) {
                        return;
                    }
                } catch (Exception var5) {
                }
            }
            if (arg0 <= -90) {
                super.method1336((byte) -97);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5023[65] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method2677(int arg0) {
        try {
            if (arg0 != 18945) {
                field5015 = 21;
            }
            field5009++;
            if (class588.field8652 < class768.field11093.field1850) {
                class54.field592.method145((byte) 114);
                class694.field10140 = (class768.field11093.field1850 - 1) * 50 * 5;
                if (class694.field10140 > 3000) {
                    class694.field10140 = 3000;
                }
                if (class768.field11093.field1850 >= 2 && class768.field11093.field1853 == 6) {
                    this.method1335(field5023[85], (byte) -26);
                    class138.field1645 = 14;
                    return;
                }
                if (class768.field11093.field1850 >= 4 && class768.field11093.field1853 == -1) {
                    this.method1335(field5023[83], (byte) -50);
                    class138.field1645 = 14;
                    return;
                }
                if (class768.field11093.field1850 >= 4 && class537.method4047(class138.field1645, arg0 - 19027)) {
                    if (class768.field11093.field1853 == 7 || class768.field11093.field1853 == 9) {
                        this.method1335(field5023[87], (byte) 124);
                    } else if (class768.field11093.field1853 <= 0) {
                        this.method1335(field5023[86], (byte) -35);
                    } else if (class492.field7063 == null) {
                        this.method1335(field5023[88], (byte) -47);
                    } else {
                        this.method1335(field5023[84] + class492.field7063.trim(), (byte) 122);
                    }
                    class138.field1645 = 14;
                    return;
                }
            }
            class588.field8652 = class768.field11093.field1850;
            if (class694.field10140 > 0) {
                class694.field10140--;
            } else {
                try {
                    if (class318.field5034 == 0) {
                        class698.field10159 = class54.field592.method146(class580.field8601, (byte) -128);
                        class318.field5034++;
                    }
                    if (class318.field5034 == 1) {
                        if (class698.field10159.field503 == 2) {
                            if (class698.field10159.field499 != null) {
                                class492.field7063 = (String) class698.field10159.field499;
                            }
                            this.method2671(1000, 0);
                            return;
                        }
                        if (class698.field10159.field503 == 1) {
                            class318.field5034++;
                        }
                    }
                    if (class318.field5034 == 2) {
                        class171.field2378 = new class504((Socket) class698.field10159.field499, class580.field8601, 25000);
                        class163 var2 = new class163(5);
                        var2.method1428((byte) -24, class27.field329.field9786);
                        var2.method1412(true, 652);
                        class171.field2378.method3799(0, var2.field2209, 5, (byte) -119);
                        class318.field5034++;
                        class182.field2521 = class430.method3299(79);
                    }
                    if (class318.field5034 == 3) {
                        if (class537.method4047(class138.field1645, -107) || class171.field2378.method3798(30000) > 0) {
                            int var3 = class171.field2378.method3796(arg0 - 19067);
                            if (var3 != 0) {
                                this.method2671(var3, 0);
                                return;
                            }
                            class318.field5034++;
                        } else if ((class430.method3299(arg0 ^ 0x4A70) - class182.field2521) > 30000L) {
                            this.method2671(1001, 0);
                            return;
                        }
                    }
                    if (class318.field5034 == 4) {
                        boolean var4 = class537.method4047(class138.field1645, -118) || class197.method1677((byte) -102, class138.field1645) || class212.method1866(4, class138.field1645);
                        class176[] var5 = class176.method1544((byte) -33);
                        class163 var6 = new class163(var5.length * 4);
                        class171.field2378.method3800(var6.field2209, var6.field2209.length, false, 0);
                        for (int var7 = 0; var7 < var5.length; var7++) {
                            var5[var7].method1542(arg0 - 11184, var6.method1453((byte) 86));
                        }
                        class768.field11093.method1255(class171.field2378, !var4, arg0 + 9378);
                        class318.field5034 = 0;
                        class698.field10159 = null;
                        class171.field2378 = null;
                    }
                } catch (IOException var9) {
                    this.method2671(1002, 0);
                }
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field5023[82] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public static final void method2678(Canvas arg0, int arg1) {
        try {
            field5020++;
            Dimension var2 = arg0.getSize();
            class428.method3288(true, var2.height, var2.width);
            int var3 = 15 / ((7 - arg1) / 39);
            if (class166.field2283 == 1) {
                class301.field4720.method551(arg0, class57.field613, class69.field742);
            } else {
                class301.field4720.method551(arg0, class757.field10994, class3.field31);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5023[64] + (arg0 == null ? field5023[58] : field5023[59]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lcn;)Z")
    public static final boolean method2679(class541 arg0) {
        if (class90.field1028) {
            if (method2670(arg0).field6808 != 0) {
                return false;
            }
            if (arg0.field8042 == 0) {
                return false;
            }
        }
        return arg0.field8011;
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public static final void method2680(int arg0) {
        int var1 = class3.field34;
        int[] var2 = class358.field5483;
        int var3 = class726.field10479 ? var1 : class6.field60 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class247 var5;
            if (var4 < var1) {
                var5 = class197.field2685[var2[var4]];
            } else {
                var5 = ((class383) class207.field3184.method977((long) class590.field8680[var4 - var1], 1)).field5799;
            }
            if (var5.field6200 == arg0) {
                var5.field3801 = 0;
                if (var5.field3808 < 0) {
                    var5.field3800 = false;
                } else {
                    int var6 = var5.method2101(31463);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field6197 & 0x1FF) != 0 || (var5.field6211 & 0x1FF) != 0) {
                            var5.field3800 = false;
                            continue;
                        }
                    } else if ((var5.field6197 & 0x1FF) != 256 || (var5.field6211 & 0x1FF) != 256) {
                        var5.field3800 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field6197 >> 9;
                        int var8 = var5.field6211 >> 9;
                        if (class91.field1045[var7][var8] != var5.field3808) {
                            var5.field3800 = true;
                            continue;
                        }
                        if (class686.field9951[var7][var8] > 1) {
                            var10002 = class686.field9951[var7][var8]--;
                            var5.field3800 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field6197 - var9 >> 9;
                        int var11 = var5.field6211 - var9 >> 9;
                        int var12 = var5.field6197 + var9 >> 9;
                        int var13 = var5.field6211 + var9 >> 9;
                        if (!class474.method3603(1, var5.field3808, var13, var12, var11, var10)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class91.field1045[var14][var15] == var5.field3808) {
                                        var10002 = class686.field9951[var14][var15]--;
                                    }
                                }
                            }
                            var5.field3800 = true;
                            continue;
                        }
                    }
                    var5.field3800 = false;
                    var5.field6199 = class316.method2656(var5.field6197, var5.field6200, var5.field6211, 0);
                    class712.method5190(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method2681(boolean arg0, String arg1) {
        try {
            if (!arg0) {
                method2681(false, null);
            }
            field5010++;
            return class646.method4755((byte) 17, 10, arg1, true);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5023[63] + arg0 + ',' + (arg1 == null ? field5023[58] : field5023[59]) + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2682(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2683(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2684(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 105;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
