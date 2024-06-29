import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class146 extends class183 {

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    private int field2533 = 1;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
    private int field2537 = 1;

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "I")
    private int field2542 = 204;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public static int field2531 = 0;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "S")
    public static short field2538 = 32767;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    public static int field2540 = 0;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "Lek;")
    public static class185 field2536;

    @OriginalMember(owner = "client!nc", name = "kb", descriptor = "Lkm;")
    public static class328 field2545;

    @OriginalMember(owner = "client!nc", name = "ib", descriptor = "Lkb;")
    public static class35 field2543;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "[I")
    public static int[] field2532;

    @OriginalMember(owner = "client!nc", name = "jb", descriptor = "[Z")
    public static boolean[] field2544;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(II)I", line = 5)
    public static final int method1011(int arg0, int arg1) {
        field2534++;
        if (arg0 != 32767) {
            field2536 = (class185) null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 21)
    public class146() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)Lbc;", line = 29)
    public static final class118 method1012(byte arg0) {
        if (arg0 != 125) {
            field2540 = -115;
        }
        field2541++;
        try {
            return (class118) Class.forName("pf").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class270();
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lkh;I)V", line = 44)
    public static final void method1013(class14 arg0, int arg1) {
        field2535++;
        for (int var2 = 0; var2 < class173.field3025; var2++) {
            int var3 = arg0.method104(arg1 ^ 0xFFFF0060);
            int var4 = arg0.method116(-1);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class282.field4835[var3] != null) {
                class282.field4835[var3].field4854 = var4;
            }
        }
        if (arg1 != 65535) {
            field2545 = (class328) null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)[I", line = 73)
    public final int[] method10(int arg0, int arg1) {
        field2529++;
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            for (int var4 = 0; var4 < class22.field393; var4++) {
                int var5 = class97.field1737[var4];
                int var6 = this.field2533 * var5 >> 12;
                int var7 = class42.field746[arg0];
                int var8 = var5 % (4096 / this.field2533) * this.field2533;
                int var9 = this.field2537 * var7 >> 12;
                int var10 = var7 % (4096 / this.field2537) * this.field2537;
                if (this.field2542 > var10) {
                    for (var6 -= var9; var6 < 0; var6 += 4) {
                    }
                    while (var6 > 3) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var8 < this.field2542) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var8 < this.field2542) {
                    int var11;
                    for (var11 = var6 - var9; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return arg1 == -1 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V", line = 166)
    public static void method1014(int arg0) {
        field2543 = null;
        field2544 = null;
        if (arg0 != 14793) {
            field2530 = -40;
        }
        field2532 = null;
        field2545 = null;
        field2536 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lwc;)V", line = 209)
    public static final void method1015(class104 arg0) {
        for (int var1 = arg0.field1800; var1 <= arg0.field1802; var1++) {
            for (int var2 = arg0.field1791; var2 <= arg0.field1812; var2++) {
                class125 var3 = class312.field5246[arg0.field1804][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2201; var4++) {
                        if (var3.field2204[var4] == arg0) {
                            var3.field2201--;
                            for (int var5 = var4; var5 < var3.field2201; var5++) {
                                var3.field2204[var5] = var3.field2204[var5 + 1];
                                var3.field2208[var5] = var3.field2208[var5 + 1];
                            }
                            var3.field2204[var3.field2201] = null;
                            break;
                        }
                    }
                    var3.field2194 = 0;
                    for (int var6 = 0; var6 < var3.field2201; var6++) {
                        var3.field2194 |= var3.field2208[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILkh;I)V", line = 280)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2533 = arg1.method93(false);
        } else if (arg2 == 1) {
            this.field2537 = arg1.method93(false);
        } else if (arg2 == 2) {
            this.field2542 = arg1.method116(-1);
        }
        if (arg0 >= -43) {
            field2544 = (boolean[]) null;
        }
        field2539++;
    }
}
