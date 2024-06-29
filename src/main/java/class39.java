import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class39 extends class62 {

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "Z")
    public boolean field756 = true;

    @OriginalMember(owner = "client!gb", name = "lb", descriptor = "I")
    public int field768 = -1;

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "I")
    public int field760 = 0;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    public int field751 = -1;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "I")
    public static int field758 = 0;

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "Lfe;")
    public static class36 field761 = new class36(64);

    @OriginalMember(owner = "client!gb", name = "nb", descriptor = "Llc;")
    public static class69 field770 = class69.method470((byte) -101, "Dec");

    @OriginalMember(owner = "client!gb", name = "rb", descriptor = "Llc;")
    public static class69 field774 = class69.method470((byte) -100, "Accept challenge @whi@");

    @OriginalMember(owner = "client!gb", name = "sb", descriptor = "Llc;")
    public static class69 field775 = class69.method470((byte) -120, "Invalid loginserver requested");

    @OriginalMember(owner = "client!gb", name = "pb", descriptor = "Llc;")
    public static class69 field772 = class69.method470((byte) -109, "*6n*6nIf you do not remember making this request*6ncancel it immediately)1 and change your password)3");

    @OriginalMember(owner = "client!gb", name = "tb", descriptor = "Llc;")
    public static class69 field776 = class69.method470((byte) -110, "Loaded interfaces");

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!gb", name = "fb", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!gb", name = "gb", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!gb", name = "hb", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!gb", name = "ib", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!gb", name = "jb", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!gb", name = "kb", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!gb", name = "ob", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!gb", name = "qb", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!gb", name = "mb", descriptor = "Loa;")
    public static class85 field769;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLpd;I)V")
    private final void method231(int arg0, byte arg1, class94 arg2, int arg3) {
        field764++;
        if (arg0 == 1) {
            this.field760 = arg2.method677(-119);
        } else if (arg0 == 2) {
            this.field768 = arg2.method703((byte) -97);
        } else if (arg0 == 5) {
            this.field756 = false;
        } else if (arg0 == 7) {
            this.field751 = arg2.method677(-116);
        }
        if (arg1 != -68) {
            field772 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
    public static void method232(int arg0) {
        field770 = null;
        field775 = null;
        if (arg0 != -3794) {
            method234(-66);
        }
        field769 = null;
        field761 = null;
        field776 = null;
        field772 = null;
        field774 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lpd;II)V")
    public final void method233(class94 arg0, int arg1, int arg2) {
        if (arg2 != 31976) {
            method237((byte) 42);
        }
        field757++;
        while (true) {
            int var4 = arg0.method703((byte) 108);
            if (var4 == 0) {
                return;
            }
            this.method231(var4, (byte) -68, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "(I)V")
    public static final void method234(int arg0) {
        field754++;
        int var1 = class55.field1158 + class46.field974.field1058;
        int var2 = class63.field1338 + class46.field974.field1065;
        int var3 = 0;
        if (class75.field1691 - var1 < -500 || class75.field1691 - var1 > 500 || class89.field1942 - var2 < -500 || class89.field1942 - var2 > 500) {
            class89.field1942 = var2;
            class75.field1691 = var1;
        }
        if (class89.field1942 != var2) {
            class89.field1942 += (var2 - class89.field1942) / 16;
        }
        if (class75.field1691 != var1) {
            class75.field1691 += (var1 - class75.field1691) / 16;
        }
        int var4 = class75.field1691 >> 7;
        int var5 = class89.field1942 >> 7;
        if (arg0 != 24) {
            field761 = null;
        }
        if (class125.field2706[96]) {
            class29.field611 += (-class29.field611 - 24) / 2;
        } else if (class125.field2706[97]) {
            class29.field611 += (24 - class29.field611) / 2;
        } else {
            class29.field611 /= 2;
        }
        if (class125.field2706[98]) {
            class74.field1677 += (12 - class74.field1677) / 2;
        } else if (class125.field2706[99]) {
            class74.field1677 += (-class74.field1677 - 12) / 2;
        } else {
            class74.field1677 /= 2;
        }
        class122.field2654 += class74.field1677 / 2;
        if (class122.field2654 < 128) {
            class122.field2654 = 128;
        }
        if (class122.field2654 > 383) {
            class122.field2654 = 383;
        }
        class17.field342 = class29.field611 / 2 + class17.field342 & 0x7FF;
        int var6 = class53.method341(0, class75.field1691, class89.field1942, class71.field1588);
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class71.field1588;
                    if (var9 < 3 && (class43.field856[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class22.field451[var9][var7][var8];
                    if (var10 > var3) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (var11 > class106.field2312) {
            class106.field2312 += (var11 - class106.field2312) / 24;
        } else if (var11 < class106.field2312) {
            class106.field2312 += (var11 - class106.field2312) / 80;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
    private final void method235(int arg0, int arg1) {
        field752++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = 0.0D;
        double var11 = var3;
        double var13 = var3;
        if (var5 > var3) {
            var13 = var5;
        }
        if (var13 < var7) {
            var13 = var7;
        }
        if (var5 < var3) {
            var11 = var5;
        }
        double var15 = 0.0D;
        if (var11 > var7) {
            var11 = var7;
        }
        double var17 = (var11 + var13) / 2.0D;
        if (arg0 < 39) {
            return;
        }
        this.field763 = (int) (var17 * 256.0D);
        if (var11 != var13) {
            if (var3 == var13) {
                var9 = (var5 - var7) / (var13 - var11);
            } else if (var5 == var13) {
                var9 = (var7 - var3) / (-var11 + var13) + 2.0D;
            } else if (var7 == var13) {
                var9 = (var3 - var5) / (var13 - var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var13 - var11) / (var11 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var11) / (2.0D - var13 + -var11);
            }
        }
        this.field766 = (int) (var15 * 256.0D);
        double var19 = var9 / 6.0D;
        if (this.field763 < 0) {
            this.field763 = 0;
        } else if (this.field763 > 255) {
            this.field763 = 255;
        }
        this.field767 = (int) (var19 * 256.0D);
        if (this.field766 < 0) {
            this.field766 = 0;
        } else if (this.field766 > 255) {
            this.field766 = 255;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(Z)V")
    public final void method236(boolean arg0) {
        field755++;
        if (this.field751 != -1) {
            this.method235(49, this.field751);
            this.field762 = this.field766;
            this.field759 = this.field763;
            this.field765 = this.field767;
        }
        if (!arg0) {
            method234(68);
        }
        this.method235(81, this.field760);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static final void method237(byte arg0) {
        class119.field2554.method220((byte) -124);
        class62.field1270.method220((byte) -110);
        if (arg0 != 77) {
            method232(-74);
        }
        field753++;
        class55.field1159.method220((byte) -124);
    }
}
