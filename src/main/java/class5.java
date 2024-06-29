import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class5 {

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "J")
    public long field89 = 0L;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Lmh;")
    public static class128 field95 = class22.method156(127, "Ausw-=hlen");

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field91 = 0;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Z")
    public static boolean field104 = true;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lmh;")
    private static class128 field85 = class22.method156(127, "Loaded input handler");

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "Lmh;")
    private static class128 field109 = class22.method156(127, "Loading)3)3)3");

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Lmh;")
    public static class128 field87 = field85;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Lmh;")
    public static class128 field98 = field109;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "Ljm;")
    public class226 field105;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "Lfb;")
    public static class55 field101;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 22)
    public static void method27(int arg0) {
        field101 = null;
        field87 = null;
        if (arg0 == 128) {
            field98 = null;
            field109 = null;
            field95 = null;
            field85 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lql;I)V", line = 53)
    public static final void method28(class16 arg0, int arg1) {
        field99++;
        if (class293.field5011 == arg0.field447 || arg0.field451 == -1 || arg0.field463 != 0 || (arg0.field430 + 1) > class167.method1091(arg1 - 93, arg0.field451).field7[arg0.field461]) {
            int var2 = class293.field5011 - arg0.field426;
            int var3 = arg0.field447 - arg0.field426;
            int var4 = arg0.field421 * 128 + (arg0.method118(-1) * 64);
            int var5 = arg0.field440 * 128 + arg0.method118(-1) * 64;
            int var6 = arg0.field412 * 128 + (arg0.method118(~arg1) * 64);
            int var7 = arg0.field472 * 128 + arg0.method118(-1) * 64;
            arg0.field418 = ((var3 - var2) * var5 + (var2 * var7)) / var3;
            arg0.field478 = ((var3 - var2) * var4 + var2 * var6) / var3;
        }
        if (arg0.field413 == 0) {
            arg0.field476 = 1024;
        }
        arg0.field459 = arg1;
        if (arg0.field413 == 1) {
            arg0.field476 = 1536;
        }
        if (arg0.field413 == 2) {
            arg0.field476 = 0;
        }
        if (arg0.field413 == 3) {
            arg0.field476 = 512;
        }
        arg0.field460 = arg0.field476;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lbg;B)V", line = 97)
    public static final void method29(class194 arg0, byte arg1) {
        if (arg1 < 81) {
            field110 = 49;
        }
        field90++;
        while (true) {
            while (arg0.field3380 < arg0.field3417.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1325(7627) == 1) {
                    var4 = arg0.method1325(7627);
                    var2 = true;
                    var3 = arg0.method1325(7627);
                }
                int var5 = arg0.method1325(7627);
                int var6 = arg0.method1325(7627);
                int var7 = class39.field836 + class155.field2671 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class212.field3754;
                if (var8 >= 0 && (var7 - 63) >= 0 && field110 > var8 + 63 && class155.field2671 > var7) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var4 * 8 <= var11 && var11 < var4 * 8 + 8 && var12 >= var3 * 8 && var12 < (var3 * 8 + 8)) {
                                int var13 = arg0.method1325(7627);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method1325(7627);
                                        if (class183.field3213[var10][var9] == null) {
                                            class183.field3213[var10][var9] = new byte[4096];
                                        }
                                        class183.field3213[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method1308(-89);
                                        if (class206.field3626[var10][var9] == null) {
                                            class206.field3626[var10][var9] = new short[4096];
                                        }
                                        class206.field3626[var10][var9][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg0.method1325(7627) & 0xFF << 16) + ((arg0.method1325(7627) & 0xFF << 8) + (arg0.method1325(7627) & 0xFF));
                                        if (class173.field3047[var10][var9] == null) {
                                            class173.field3047[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class38 var17 = class239.method1629((byte) 89, var16);
                                        if (var17.field817 != null) {
                                            var17 = var17.method258(-121);
                                            if (var17 == null || var17.field791 == -1) {
                                                continue;
                                            }
                                        }
                                        class173.field3047[var10][var9][(63 - var12 << 6) + var11] = var17.field819 + 1;
                                        class228 var18 = new class228();
                                        var18.field3976 = var7;
                                        var18.field3975 = var17.field791;
                                        var18.field3974 = var8;
                                        class223.field3916.method2029((byte) -34, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method1325(7627);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field3380++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field3380 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field3380 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
