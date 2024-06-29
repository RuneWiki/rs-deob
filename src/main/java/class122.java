import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class122 extends class55 {

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    private int field2719 = 0;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "Lo;")
    public static class84 field2715 = class15.method124("wishes to duel with you)3", 255);

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field2717 = 0;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field2718 = -1;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "Lo;")
    public static class84 field2721 = class15.method124("Connecting to friendserver", 255);

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2711 = new CRC32();

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "Lo;")
    public static class84 field2729 = class15.method124("Loaded fonts", 255);

    @OriginalMember(owner = "client!vc", name = "lb", descriptor = "[I")
    public static int[] field2733 = new int[1000];

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
    public static int field2731 = 0;

    @OriginalMember(owner = "client!vc", name = "mb", descriptor = "Lo;")
    public static class84 field2734 = class15.method124("Sep", 255);

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "Lo;")
    public static class84 field2727 = class15.method124("*6n", 255);

    @OriginalMember(owner = "client!vc", name = "kb", descriptor = "[I")
    public static int[] field2732 = new int[128];

    @OriginalMember(owner = "client!vc", name = "ob", descriptor = "Lo;")
    public static class84 field2736 = class15.method124("Bad session id)3", 255);

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "I")
    public static int field2730 = 0;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public int field2710;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public int field2716;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
    public int field2722;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!vc", name = "nb", descriptor = "J")
    public static long field2735;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lqb;")
    public static class96 field2726;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "[I")
    public static int[] field2728;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILkc;III)V", line = 11)
    public static final void method952(int arg0, class63 arg1, int arg2, int arg3, int arg4) {
        field2725++;
        if (class107.field2271 == arg1 || class40.field805 >= 400) {
            return;
        }
        class84 var5;
        if (arg1.field1299 == 0) {
            var5 = class97.method746(0, new class84[] { arg1.field1312, class17.method139(class107.field2271.field1305, (byte) 9, arg1.field1305), class37.field723, class62.method489(arg1.field1305, (byte) -124), class109.field2358 });
        } else {
            var5 = class97.method746(0, new class84[] { arg1.field1312, class97.field2074, class62.method489(arg1.field1299, (byte) -125), class109.field2358 });
        }
        if (class93.field2048 == 1) {
            class93.field2041++;
            class26.method196(class97.method746(0, new class84[] { class33.field643, class106.field2255, class65.field1397, var5 }), 25, arg0, arg2, false, arg4);
        } else if (class30.field601 != 1) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class15.field283[var6] != null) {
                    class14.field252++;
                    short var7 = 0;
                    int var8 = 0;
                    if (class15.field283[var6].method669(class126.field2793, true)) {
                        if (class107.field2271.field1305 < arg1.field1305) {
                            var7 = 2000;
                        }
                        if (class107.field2271.field1311 != 0 && arg1.field1311 != 0) {
                            if (class107.field2271.field1311 == arg1.field1311) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class55.field1138[var6]) {
                        var7 = 2000;
                    }
                    if (var6 == 0) {
                        var8 = var7 + 15;
                    }
                    if (var6 == 1) {
                        var8 = var7 + 30;
                    }
                    if (var6 == 2) {
                        var8 = var7 + 43;
                    }
                    if (var6 == 3) {
                        var8 = var7 + 38;
                    }
                    if (var6 == 4) {
                        var8 = var7 + 33;
                    }
                    class26.method196(class97.method746(0, new class84[] { class15.field283[var6], class5.field94, var5 }), var8, arg0, arg2, false, arg4);
                }
            }
        } else if ((class105.field2220 & 0x8) == 8) {
            class26.method196(class97.method746(0, new class84[] { class101.field2141, class5.field94, var5 }), 36, arg0, arg2, false, arg4);
            class104.field2200++;
        }
        if (arg3 != 1000) {
            field2717 = 2;
        }
        for (int var9 = 0; var9 < class40.field805; var9++) {
            if (class63.field1306[var9] == 24) {
                class21.field385[var9] = class97.method746(0, new class84[] { class86.field1972, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBLeb;)V", line = 128)
    private final void method953(int arg0, int arg1, byte arg2, class27 arg3) {
        if (arg2 != -60) {
            this.method956(39, 79);
        }
        if (arg1 == 1) {
            this.field2719 = arg3.method241(2);
        }
        field2724++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Leb;II)V", line = 145)
    public final void method954(class27 arg0, int arg1, int arg2) {
        field2714++;
        while (true) {
            int var4 = arg0.method231(255);
            if (var4 == 0) {
                if (arg1 <= 120) {
                    this.method956(-126, -3);
                    return;
                } else {
                    return;
                }
            }
            this.method953(arg2, var4, (byte) -60, arg0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V", line = 176)
    public final void method955(byte arg0) {
        if (arg0 <= 38) {
            field2721 = null;
        }
        field2720++;
        this.method956(0, this.field2719);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V", line = 190)
    private final void method956(int arg0, int arg1) {
        field2713++;
        double var3 = (double) (arg1 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var9 = var7;
        if (var5 < var7) {
            var9 = var5;
        }
        if (var9 > var3) {
            var9 = var3;
        }
        double var11 = var7;
        double var13 = 0.0D;
        if (var7 < var5) {
            var11 = var5;
        }
        if (var3 > var11) {
            var11 = var3;
        }
        double var15 = (double) arg0;
        double var17 = (var9 + var11) / 2.0D;
        this.field2710 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9) + 2.0D;
            } else if (var3 == var11) {
                var13 = (var7 - var5) / (-var9 + var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field2712 = (int) (var15 * 256.0D);
        if (this.field2712 < 0) {
            this.field2712 = 0;
        } else if (this.field2712 > 255) {
            this.field2712 = 255;
        }
        if (var17 > 0.5D) {
            this.field2716 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2716 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2716 < 1) {
            this.field2716 = 1;
        }
        if (this.field2710 < 0) {
            this.field2710 = 0;
        } else if (this.field2710 > 255) {
            this.field2710 = 255;
        }
        double var19 = var13 / 6.0D;
        this.field2722 = (int) ((double) this.field2716 * var19);
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V", line = 297)
    public static void method957(int arg0) {
        field2733 = null;
        field2736 = null;
        if (arg0 != 7954) {
            field2721 = null;
        }
        field2715 = null;
        field2734 = null;
        field2728 = null;
        field2721 = null;
        field2729 = null;
        field2726 = null;
        field2727 = null;
        field2711 = null;
        field2732 = null;
    }
}
