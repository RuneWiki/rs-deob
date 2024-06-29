import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class49 extends class202 {

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "[J")
    private long[] field1022 = new long[10];

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    private int field1029 = 0;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    private int field1017 = 256;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    private int field1024 = 1;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "J")
    private long field1025 = class4.method31((byte) 47);

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lkh;")
    public static class117 field1020 = class224.method1450((byte) -86, "leuchten2:");

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Lge;")
    public static class71 field1028 = new class71(64);

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "Lkh;")
    public static class117 field1031 = class224.method1450((byte) 8, "mapflag");

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Lkh;")
    public static class117 field1032 = class224.method1450((byte) -6, "title)3jpg");

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "[I")
    public static int[] field1034 = new int[256];

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field1033 = 0;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    private int field1027;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[B)V")
    public static final void method383(int arg0, byte[] arg1) {
        field1021++;
        int var2 = 0;
        if (arg0 >= -21) {
            return;
        }
        while (true) {
            while (var2 < arg1.length) {
                int var3 = arg1[var2++] * 64 - class80.field1501;
                int var4 = arg1[var2++] * 64 - class173.field3116;
                if (var3 > 0 && var4 > 0 && class237.field4284 > var3 + 64 && class33.field773 > var4 + 64) {
                    int var5 = class33.field773 - var4 - 1 >> 6;
                    int var6 = var3 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg1[var2++];
                            if (var9 != 0) {
                                if ((var9 & 0x1) == 1) {
                                    byte var10 = arg1[var2++];
                                    if (class173.field3117[var6][var5] == null) {
                                        class173.field3117[var6][var5] = new byte[4096];
                                    }
                                    class173.field3117[var6][var5][(-(var8 + 1) << 6) + var7] = (byte) var10;
                                }
                                if ((var9 & 0x2) == 2) {
                                    byte var11 = arg1[var2++];
                                    if (class208.field3738[var6][var5] == null) {
                                        class208.field3738[var6][var5] = new byte[4096];
                                    }
                                    class208.field3738[var6][var5][(-(var8 + 1) << 6) + var7] = (byte) (var11 - 28);
                                }
                                if ((var9 & 0x4) == 4) {
                                    var2 += 3;
                                    int var12 = (arg1[var2 - 1] & 0xFF) + (((arg1[var2 - 3] & 0xFF) << 16) + ((arg1[var2 - 2] & 0xFF) << 8));
                                    if (class56.field1155[var6][var5] == null) {
                                        class56.field1155[var6][var5] = new int[4096];
                                    }
                                    var12--;
                                    class211 var13 = class48.method379(114, var12);
                                    if (var13.field3792 != null) {
                                        var13 = var13.method1378((byte) 116);
                                        if (var13 == null || var13.field3833 == -1) {
                                            continue;
                                        }
                                    }
                                    class56.field1155[var6][var5][(-(var8 + 1) << 6) + var7] = var13.field3830 + 1;
                                    class157 var14 = new class157();
                                    var14.field2854 = var13.field3833;
                                    var14.field2856 = class33.field773 - var4;
                                    var14.field2852 = var3;
                                    class155.field2828.method325(123, var14);
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < 64; var15++) {
                        for (int var16 = -64; var16 < 0; var16++) {
                            byte var17 = arg1[var2++];
                            if (var17 != 0) {
                                if ((var17 & 0x1) == 1) {
                                    var2++;
                                }
                                if ((var17 & 0x2) == 2) {
                                    var2++;
                                }
                                if ((var17 & 0x4) == 4) {
                                    var2 += 3;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method384(int arg0) {
        field1020 = null;
        field1032 = null;
        field1028 = null;
        if (arg0 != 1) {
            method383(89, null);
        }
        field1034 = null;
        field1031 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public final void method385(byte arg0) {
        field1026++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1022[var2] = 0L;
        }
        if (arg0 != -115) {
            method387(null, (byte) -21);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)I")
    public final int method386(int arg0, int arg1, int arg2) {
        int var4 = this.field1017;
        int var5 = this.field1024;
        if (arg2 != -19769) {
            method383(18, null);
        }
        this.field1017 = 300;
        this.field1024 = 1;
        field1019++;
        this.field1025 = class4.method31((byte) 47);
        if (this.field1022[this.field1027] == 0L) {
            this.field1024 = var5;
            this.field1017 = var4;
        } else if (this.field1025 > this.field1022[this.field1027]) {
            this.field1017 = (int) ((long) (arg1 * 2560) / (this.field1025 - this.field1022[this.field1027]));
        }
        if (this.field1017 < 25) {
            this.field1017 = 25;
        }
        if (this.field1017 > 256) {
            this.field1017 = 256;
            this.field1024 = (int) ((long) arg1 - (this.field1025 - this.field1022[this.field1027]) / 10L);
        }
        if (this.field1024 > arg1) {
            this.field1024 = arg1;
        }
        this.field1022[this.field1027] = this.field1025;
        this.field1027 = (this.field1027 + 1) % 10;
        if (this.field1024 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1022[var6] != 0L) {
                    this.field1022[var6] -= -((long) this.field1024);
                }
            }
        }
        if (this.field1024 < arg0) {
            this.field1024 = arg0;
        }
        class165.method1167(-22942, (long) this.field1024);
        int var7 = 0;
        while (this.field1029 < 256) {
            this.field1029 += this.field1017;
            var7++;
        }
        this.field1029 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lah;B)V")
    public static final void method387(class9 arg0, byte arg1) {
        if (arg1 > -88) {
            method384(-33);
        }
        field1030++;
        int var2 = arg0.field244;
        if (var2 == 324) {
            if (class151.field2743 == -1) {
                class151.field2743 = arg0.field269;
                class151.field2749 = arg0.field164;
            }
            if (class10.field364.field1781) {
                arg0.field269 = class151.field2743;
            } else {
                arg0.field269 = class151.field2749;
            }
        } else if (var2 == 325) {
            if (class151.field2743 == -1) {
                class151.field2743 = arg0.field269;
                class151.field2749 = arg0.field164;
            }
            if (class10.field364.field1781) {
                arg0.field269 = class151.field2749;
            } else {
                arg0.field269 = class151.field2743;
            }
        } else if (var2 == 327) {
            arg0.field229 = 150;
            arg0.field209 = (int) (Math.sin((double) class44.field966 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field245 = 5;
            arg0.field235 = -1;
        } else if (var2 == 328) {
            if (class93.field1712.field1141 == null) {
                arg0.field235 = 0;
            } else {
                arg0.field229 = 150;
                arg0.field209 = (int) (Math.sin((double) class44.field966 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field245 = 5;
                arg0.field235 = ((int) class93.field1712.field1141.method813((byte) 93) << 11) + 2047;
                arg0.field291 = class93.field1712.field4224;
                arg0.field299 = class93.field1712.field4214;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class49() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1022[var1] = this.field1025;
        }
    }
}
