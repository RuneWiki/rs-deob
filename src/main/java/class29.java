import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class29 extends OutputStream {

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field399 = 100;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "[Lpd;")
    public static class106[] field394 = new class106[6];

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "[I")
    public static int[] field395 = new int[32];

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Lhi;")
    public static class82 field400 = class95.method664((byte) -53, " ");

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Lhi;")
    public static class82 field389 = class95.method664((byte) -53, "voudrait faire un -Bchange avec vous)3");

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "[Lsa;")
    public static class81[] field405 = new class81[2048];

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Lum;")
    public static class222 field390;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "[I")
    public static int[] field401;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "[[S")
    public static short[][] field392;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 5)
    public static final void method177(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(arg1);
        field393++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 19)
    public static final void method178(int arg0) {
        field398++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class286.method1987(var2, class15.field120, arg0 + 105, var3, var1, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != -105) {
            method181(114, (class93) null);
        }
    }

    @OriginalMember(owner = "client!dl", name = "write", descriptor = "(I)V", line = 54)
    public final void write(int arg0) throws IOException {
        field397++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIII)V", line = 73)
    public static final void method179(int arg0, int arg1, int arg2, int arg3) {
        field404++;
        if (arg3 != 1) {
            method182(75, (class82[]) null);
        }
        class227 var4 = class215.method1531(-1, 9, arg2);
        var4.method1616(64);
        var4.field3923 = arg1;
        var4.field3929 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lhi;ILhi;I)V", line = 89)
    public static final void method180(class82 arg0, int arg1, class82 arg2, int arg3) {
        class233.field4042 = arg1;
        class129.field2239 = arg2;
        field391++;
        class129.field2248 = arg0;
        if (class129.field2248.method534(-17, class129.field2247) || class129.field2239.method534(-68, class129.field2247)) {
            class95.field1735 = 3;
            return;
        }
        if (arg3 != 23284) {
            method183(true, 5, 19, -102);
        }
        if (class47.field786 != -1) {
            class212.method1522(6127);
            return;
        }
        class83.field1481 = 0;
        class95.field1735 = -3;
        class221.field3835 = 0;
        class285.field4791 = 1;
        class153 var4 = new class153(128);
        var4.method1075(10, arg3 - 23285);
        var4.method1102((byte) -13, (int) (Math.random() * 99999.0D));
        var4.method1102((byte) -41, 522);
        var4.method1057((byte) 43, class129.field2248.method568(arg3 - 808));
        var4.method1065(178808912, (int) (Math.random() * 9.9999999E7D));
        var4.method1098((byte) 56, class129.field2239);
        var4.method1065(178808912, (int) (Math.random() * 9.9999999E7D));
        var4.method1079(class17.field180, class276.field4647, false);
        class61.field957.field2611 = 0;
        class61.field957.method1075(107, -1);
        class61.field957.method1075(var4.field2611, -1);
        class61.field957.method1106(var4.field2598, var4.field2611, (byte) 16, 0);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILtg;)V", line = 140)
    public static final void method181(int arg0, class93 arg1) {
        int var2 = arg1.field1690 - class212.field3708;
        int var3 = arg1.field1651 * 128 + arg1.method520(true) * 64;
        field402++;
        int var4 = arg1.field1670 * 128 + arg1.method520(true) * 64;
        arg1.field1689 += (var4 - arg1.field1689) / var2;
        arg1.field1652 = 0;
        arg1.field1685 += (var3 - arg1.field1685) / var2;
        if (arg1.field1699 == 0) {
            arg1.field1673 = 1024;
        }
        if (arg1.field1699 == 1) {
            arg1.field1673 = 1536;
        }
        if (arg1.field1699 == 2) {
            arg1.field1673 = 0;
        }
        if (arg1.field1699 == 3) {
            arg1.field1673 = 512;
        }
        if (arg0 >= -64) {
            field395 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I[Lhi;)Lhi;", line = 170)
    public static final class82 method182(int arg0, class82[] arg1) {
        field406++;
        if (arg0 != -6039) {
            method185(-27);
        }
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class222.method1596(true, 0, arg1, arg1.length);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIII)I", line = 197)
    public static final int method183(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            field399 = 57;
        }
        field403++;
        int var4 = class102.field1805[class318.method2180(arg2, arg3)];
        if (arg1 > 0) {
            int var5 = class102.field1821.method632(arg1 & 0xFFFF, (byte) -62);
            if (var5 != 0) {
                int var6;
                if (arg3 < 0) {
                    var6 = 0;
                } else if (arg3 <= 127) {
                    var6 = arg3 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class102.field1821.method634(arg1 & 0xFFFF, 64);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                int var11 = (var4 >> 8 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = ((var10 & 0x8000FF00) << 8) + (var12 >> 8) + (var11 & 0xFF00);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZB)V", line = 268)
    public static final void method184(boolean arg0, byte arg1) {
        int var2 = -21 / ((arg1 + 50) / 36);
        for (int var3 = 0; var3 < class25.field333; var3++) {
            class275 var4 = class99.field1777[class43.field749[var3]];
            long var5 = (long) class43.field749[var3] << 32 | 0x20000000L;
            if (var4 != null && var4.method516(0) && var4.field4628.field4055 == arg0 && var4.field4628.method1660(-122)) {
                int var7 = var4.field1685 >> 7;
                int var8 = var4.field1689 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.method520(true) == 1 && (var4.field1685 & 0x7F) == 64 && (var4.field1689 & 0x7F) == 64) {
                        if (class34.field532[var7][var8] == class47.field789) {
                            continue;
                        }
                        class34.field532[var7][var8] = class47.field789;
                    }
                    if (!var4.field4628.field4071) {
                        var5 |= Long.MIN_VALUE;
                    }
                    var4.field1657 = class21.method145(var4.field1685, var4.field1689, class297.field5058, (byte) 28);
                    class321.method2224(class297.field5058, var4.field1685, var4.field1689, var4.field1657, (var4.method520(true) - 1) * 64 + 60, var4, var4.field1704, var5, var4.field1705);
                }
            }
        }
        field396++;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V", line = 325)
    public static void method185(int arg0) {
        field400 = null;
        field394 = null;
        field390 = null;
        field389 = null;
        if (arg0 != 0) {
            field392 = (short[][]) ((short[][]) null);
        }
        field395 = null;
        field405 = null;
        field401 = null;
        field392 = (short[][]) null;
    }
}
