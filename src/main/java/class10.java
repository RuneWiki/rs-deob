import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class10 extends class83 {

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field121 = 127;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Lck;")
    public static class1 field120 = new class1(64);

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "I")
    public static int field148 = 7759444;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "[[B")
    public static byte[][] field151 = new byte[250][];

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public int field134;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public int field139;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "Lvh;")
    public static class108 field127;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "Lvh;")
    public static class108 field147;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "Lgd;")
    public class111 field138;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "Lph;")
    public class202 field131;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "Loh;")
    public class248 field128;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "Lc;")
    public class284 field142;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "Lgj;")
    public static class38 field149;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lte;")
    public static final class206 method64(int arg0, int arg1) {
        field126++;
        if (arg0 != 64) {
            method65(58, (class101) null);
        }
        class206 var2 = (class206) class239.field3925.method57((long) arg1, -113);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class45.field636.method746(class276.method1808(arg1, 1931665025), (byte) -128, class105.method709(true, arg1));
        class206 var4 = new class206();
        var4.field3384 = arg1;
        if (var3 != null) {
            var4.method1370(-121, new class101(var3));
        }
        var4.method1368(false);
        if (var4.field3406) {
            var4.field3403 = false;
            var4.field3387 = 0;
        }
        if (!class280.field4461 && var4.field3382) {
            var4.field3431 = null;
        }
        class239.field3925.method62(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILeh;)V")
    public static final void method65(int arg0, class101 arg1) {
        if (arg0 > -78) {
            field120 = null;
        }
        field140++;
        while (true) {
            while (arg1.field1762 < arg1.field1730.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method669((byte) 36) == 1) {
                    var3 = true;
                    var2 = arg1.method669((byte) 36);
                    var4 = arg1.method669((byte) 36);
                }
                int var5 = arg1.method669((byte) 36);
                int var6 = arg1.method669((byte) 36);
                int var7 = var5 * 64 - class124.field2184;
                int var8 = class83.field1514 + class193.field3114 - var6 * 64 - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class203.field3318 > var7 + 63 && class83.field1514 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var2 * 8 <= var11 && (var2 * 8 + 8) > var11 && var12 >= (var4 * 8) && (var4 * 8 + 8) > var12) {
                                byte var13 = arg1.method646(84);
                                if (var13 != 0) {
                                    if (class262.field4278[var9][var10] == null) {
                                        class262.field4278[var9][var10] = new byte[4096];
                                    }
                                    class262.field4278[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method646(80);
                                    if (class122.field2157[var9][var10] == null) {
                                        class122.field2157[var9][var10] = new byte[4096];
                                    }
                                    class122.field2157[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method646(-114);
                        if (var16 != 0) {
                            arg1.field1762++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public static void method66(int arg0) {
        if (arg0 != -956276121) {
            method64(97, -12);
        }
        field120 = null;
        field151 = null;
        field147 = null;
        field127 = null;
        field149 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
    public static final void method67(int arg0, int arg1, int arg2) {
        int var3 = 66 % ((arg2 + 28) / 62);
        field119++;
        class125.field2191[arg1] = arg0;
        class261 var4 = (class261) class143.field2456.method779(-92, (long) arg1);
        if (var4 == null) {
            class261 var5 = new class261(class232.method1544((byte) -118) + 500L);
            class143.field2456.method780((byte) -78, (long) arg1, var5);
        } else {
            var4.field4261 = class232.method1544((byte) -126) + 500L;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZIII)I")
    public static final int method68(boolean arg0, int arg1, int arg2, int arg3) {
        field144++;
        if (class95.field1642 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3 & 0x7F;
        int var7 = arg1;
        if (!arg0) {
            method68(true, -53, -97, 33);
        }
        int var8 = arg2 & 0x7F;
        if (arg1 < 3 && (class229.field3862[1][var4][var5] & 0x2) == 2) {
            var7 = arg1 + 1;
        }
        int var9 = (128 - var6) * class95.field1642[var7][var4][var5] + (class95.field1642[var7][var4 + 1][var5] * var6) >> 7;
        int var10 = (128 - var6) * class95.field1642[var7][var4][var5 + 1] + class95.field1642[var7][var4 + 1][var5 + 1] * var6 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
    public final void method69(boolean arg0) {
        field146++;
        this.field142 = null;
        if (arg0) {
            field151 = null;
        }
        this.field131 = null;
        this.field128 = null;
        this.field138 = null;
    }
}
