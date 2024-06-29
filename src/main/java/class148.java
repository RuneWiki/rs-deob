import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class148 extends class13 {

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "[J")
    private long[] field3502 = new long[10];

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field3479 = 0;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "Laf;")
    public static class7 field3485 = class48.method406(40, "Untersuchen");

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "Lgd;")
    public static class46 field3484 = new class46(64);

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "Laf;")
    public static class7 field3492 = class48.method406(40, "sl_button");

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "Laf;")
    public static class7 field3497 = class48.method406(40, "Fps:");

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "Laf;")
    public static class7 field3499 = class48.method406(40, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "Laf;")
    private static class7 field3500 = class48.method406(40, "red:");

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "Laf;")
    private static class7 field3494 = class48.method406(40, "This computers address has been blocked");

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "Laf;")
    public static class7 field3496 = field3494;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "Laf;")
    public static class7 field3503 = class48.method406(40, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "Laf;")
    public static class7 field3493 = field3500;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "Laf;")
    public static class7 field3498 = field3500;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    private int field3483;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    private int field3487;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    private int field3490;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    private int field3495;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "J")
    private long field3477;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "Ln;")
    public static class90 field3504;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public static final void method1188(int arg0) {
        field3476++;
        class68.field1479 = new class12(arg0);
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    public static final void method1189(int arg0) {
        field3484.method391((byte) -73);
        if (arg0 == -100) {
            field3478++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public static final void method1190(int arg0) {
        if (arg0 <= 23) {
            return;
        }
        field3480++;
        for (int var1 = 0; var1 < class42.field1009; var1++) {
            int var10002 = class24.field654[var1]--;
            if (class24.field654[var1] >= -10) {
                class61 var3 = class95.field2241[var1];
                if (var3 == null) {
                    var3 = class61.method515(class39.field984, class135.field3193[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class24.field654[var1] += var3.method518();
                    class95.field2241[var1] = var3;
                }
                if (class24.field654[var1] < 0) {
                    int var10;
                    if (class38.field949[var1] == 0) {
                        var10 = class78.field1813;
                    } else {
                        int var4 = class38.field949[var1] >> 16 & 0xFF;
                        int var5 = (class38.field949[var1] & 0xFF) * 128;
                        int var6 = var4 * 128 + 64 - class21.field531.field505;
                        int var7 = class38.field949[var1] >> 8 & 0xFF;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var8 = var7 * 128 + 64 - class21.field531.field491;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var6 - 128;
                        if (var9 > var5) {
                            class24.field654[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var5 - var9) * class27.field720 / var5;
                    }
                    if (var10 > 0) {
                        class146 var11 = var3.method517().method1180(class121.field2847);
                        class59 var12 = class59.method498(var11, 100, var10);
                        var12.method490(class86.field2012[var1] - 1);
                        class144.field3402.method3(var12);
                    }
                    class24.field654[var1] = -100;
                }
            } else {
                class42.field1009--;
                for (int var2 = var1; var2 < class42.field1009; var2++) {
                    class135.field3193[var2] = class135.field3193[var2 + 1];
                    class95.field2241[var2] = class95.field2241[var2 + 1];
                    class86.field2012[var2] = class86.field2012[var2 + 1];
                    class24.field654[var2] = class24.field654[var2 + 1];
                    class38.field949[var2] = class38.field949[var2 + 1];
                }
                var1--;
            }
        }
        if (class19.field440 && !class79.method667(true)) {
            if (class94.field2205 != 0 && class126.field3003 != -1) {
                client.method203(class94.field2205, 0, -11361, false, class126.field3003, class113.field2710);
            }
            class19.field440 = false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public final void method131(byte arg0) {
        field3488++;
        this.field3487 = 256;
        this.field3490 = 1;
        this.field3495 = 0;
        this.field3477 = class55.method445(0);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3502[var2] = this.field3477;
        }
        if (arg0 != 57) {
            method1189(-127);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public final void method136(int arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3502[var2] = 0L;
        }
        if (arg0 != 25593) {
            this.field3490 = -74;
        }
        field3489++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIILkb;)[Lfd;")
    public static final class40[] method1191(int arg0, int arg1, int arg2, class71 arg3) {
        field3501++;
        int var4 = -122 / ((arg1 + 72) / 32);
        return class67.method541(arg0, arg2, -117, arg3) ? class14.method139((byte) 54) : null;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V")
    public static void method1192(byte arg0) {
        field3484 = null;
        field3496 = null;
        field3492 = null;
        field3497 = null;
        int var1 = 75 % ((-arg0 - 69) / 46);
        field3494 = null;
        field3485 = null;
        field3493 = null;
        field3500 = null;
        field3504 = null;
        field3498 = null;
        field3503 = null;
        field3499 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBI)I")
    public final int method133(int arg0, byte arg1, int arg2) {
        field3491++;
        int var4 = this.field3487;
        this.field3487 = 300;
        int var5 = this.field3490;
        this.field3490 = 1;
        this.field3477 = class55.method445(0);
        if (this.field3502[this.field3483] == 0L) {
            this.field3490 = var5;
            this.field3487 = var4;
        } else if (this.field3502[this.field3483] < this.field3477) {
            this.field3487 = (int) ((long) (arg0 * 2560) / (this.field3477 - this.field3502[this.field3483]));
        }
        if (this.field3487 < 25) {
            this.field3487 = 25;
        }
        if (this.field3487 > 256) {
            this.field3487 = 256;
            this.field3490 = (int) ((long) arg0 - (this.field3477 - this.field3502[this.field3483]) / 10L);
        }
        if (this.field3490 > arg0) {
            this.field3490 = arg0;
        }
        this.field3502[this.field3483] = this.field3477;
        this.field3483 = (this.field3483 + 1) % 10;
        if (this.field3490 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3502[var6] != 0L) {
                    this.field3502[var6] += this.field3490;
                }
            }
        }
        if (arg1 >= -112) {
            this.method136(49);
        }
        if (this.field3490 < arg2) {
            this.field3490 = arg2;
        }
        class79.method673(2, (long) this.field3490);
        int var7 = 0;
        while (this.field3495 < 256) {
            var7++;
            this.field3495 += this.field3487;
        }
        this.field3495 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class148() {
        this.method131((byte) 57);
    }
}
