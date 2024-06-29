import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class141 {

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    private int field2634 = 0;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    private int field2637 = -1;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Ltj;")
    public static class258 field2626 = new class258();

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static volatile int field2635 = 0;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field2640 = -1;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "Lhj;")
    public static class69 field2639 = class181.method1318("Eingabeprozedur geladen)3", (byte) -124);

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "[J")
    public static long[] field2642 = new long[200];

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public int field2625;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public int field2628;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Lnc;")
    public static class83 field2636;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "Lnc;")
    public static class83 field2643;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "[Lhk;")
    public static class121[] field2638;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "[S")
    public static short[] field2641;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lfh;IZI)V")
    private final void method1079(class128 arg0, int arg1, boolean arg2, int arg3) {
        field2633++;
        if (arg3 == 1) {
            this.field2634 = arg0.method952((byte) -126);
            this.method1083((byte) 122, this.field2634);
        } else if (arg3 == 2) {
            this.field2637 = arg0.method912(-82);
            if (this.field2637 == 65535) {
                this.field2637 = -1;
            }
        } else if (arg3 == 3) {
            arg0.method912(-106);
        }
        if (arg2) {
            this.method1079((class128) null, -11, false, 43);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lfh;II)V")
    public final void method1080(class128 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method937(false);
            if (var4 == 0) {
                field2630++;
                if (arg1 != 16711680) {
                    this.method1083((byte) 30, -46);
                    return;
                }
                return;
            }
            this.method1079(arg0, arg2, false, var4);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method1081(int arg0) {
        field2642 = null;
        field2639 = null;
        field2641 = null;
        if (arg0 < -1) {
            field2636 = null;
            field2643 = null;
            field2638 = null;
            field2626 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V")
    public static final void method1082(int arg0, int arg1, int arg2) {
        field2631++;
        if (class253.field4569 > 0) {
            class61.method368(class253.field4569, 292);
            class253.field4569 = 0;
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = class15.field206 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class69.field1308[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class15.field201[var5++ + arg0];
                int var12 = class13.field186[var4++];
                if (var12 == 0) {
                    class194.field3533.field4704[var6++] = var11;
                } else {
                    int var13 = 256 - var12 - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = var12 + 18;
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class258.field4636[var12];
                    class194.field3533.field4704[var6++] = class69.method443(-16711936, var13 * class69.method443(16711935, var11) + var14 * class69.method443(16711935, var15)) + class69.method443(var13 * class69.method443(65280, var11) + class69.method443(var15, 65280) * var14, 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class194.field3533.field4704[var6++] = class15.field201[var5++ + arg0];
            }
            var5 += class15.field206 - 128;
        }
        class194.field3533.method333(arg0, arg2);
        if (arg1 <= 89) {
            method1081(119);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)V")
    private final void method1083(byte arg0, int arg1) {
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field2632++;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var5;
        if (var3 < var5) {
            var9 = var3;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var5;
        double var13 = 0.0D;
        if (var3 > var5) {
            var11 = var3;
        }
        if (arg0 < 101) {
            field2636 = null;
        }
        double var15 = 0.0D;
        if (var7 > var11) {
            var11 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field2625 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9);
            } else if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field2628 = (int) (var15 * 256.0D);
        if (this.field2625 < 0) {
            this.field2625 = 0;
        } else if (this.field2625 > 255) {
            this.field2625 = 255;
        }
        double var19 = var13 / 6.0D;
        if (this.field2628 < 0) {
            this.field2628 = 0;
        } else if (this.field2628 > 255) {
            this.field2628 = 255;
        }
        if (var17 > 0.5D) {
            this.field2627 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2627 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2627 < 1) {
            this.field2627 = 1;
        }
        this.field2629 = (int) ((double) this.field2627 * var19);
    }
}
