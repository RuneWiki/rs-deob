import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class466 {

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public int field6401 = 64;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public int field6403 = 0;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "Z")
    public boolean field6398 = false;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public int field6399 = -1;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public int field6410 = 512;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "Z")
    public boolean field6397 = true;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public int field6411 = 127;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public int field6413 = 1190717;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public int field6404 = 8;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public int field6414 = -1;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "Z")
    public boolean field6405 = true;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "Len;")
    public static class290 field6408 = new class290("", 12);

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "Llga;")
    public static class663 field6416 = new class663(5);

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public int field6407;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "Lew;")
    public class456 field6415;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "[I")
    public static int[] field6417;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lct;)V", line = 3)
    public static final void method2629(class130 arg0) {
        if (class53.field609 >= 65535) {
            return;
        }
        class186 var1 = arg0.field1852;
        class334.field4501[class53.field609] = arg0;
        class706.field9975[class53.field609] = false;
        class53.field609++;
        int var2 = arg0.field1870;
        if (arg0.field1865) {
            var2 = 0;
        }
        int var3 = arg0.field1870;
        if (arg0.field1856) {
            var3 = class107.field1493 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method1279(0) + class265.field3586 - var1.method1281(42) >> class588.field8259;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method1279(0) + var1.method1281(81) - class265.field3586 >> class588.field8259;
            if (var7 >= class643.field8878) {
                var7 = class643.field8878 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field1863[var5++];
                int var10 = (var1.method1280(true) + class265.field3586 - var1.method1281(98) >> class588.field8259) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class335.field4511) {
                    var11 = class335.field4511 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class508.field6965[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class508.field6965[var4][var12][var8] = var13 | (long) class53.field609;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class508.field6965[var4][var12][var8] = var13 | (long) class53.field609 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class508.field6965[var4][var12][var8] = var13 | (long) class53.field609 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class508.field6965[var4][var12][var8] = var13 | (long) class53.field609 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILac;B)V", line = 95)
    private final void method2630(int arg0, class501 arg1, byte arg2) {
        if (arg2 != 11) {
            this.field6415 = null;
        }
        field6400++;
        if (arg0 == 1) {
            this.field6403 = class219.method1397(0, arg1.method2819((byte) 72));
        } else if (arg0 == 2) {
            this.field6399 = arg1.method2874((byte) -75);
        } else if (arg0 == 3) {
            this.field6399 = arg1.method2845(-1);
            if (this.field6399 == 65535) {
                this.field6399 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field6405 = false;
            return;
        } else if (arg0 == 7) {
            this.field6414 = class219.method1397(0, arg1.method2819((byte) 72));
        } else if (arg0 == 8) {
            this.field6415.field6339 = this.field6407;
            return;
        } else if (arg0 == 9) {
            this.field6410 = arg1.method2845(-1) << 2;
            return;
        } else if (arg0 == 10) {
            this.field6397 = false;
            return;
        } else if (arg0 == 11) {
            this.field6404 = arg1.method2874((byte) -75);
            return;
        } else if (arg0 == 12) {
            this.field6398 = true;
            return;
        } else {
            if (arg0 == 13) {
                this.field6413 = arg1.method2819((byte) 72);
            } else if (arg0 == 14) {
                this.field6401 = arg1.method2874((byte) -75) << 2;
                return;
            } else if (arg0 == 16) {
                this.field6411 = arg1.method2874((byte) -75);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V", line = 164)
    public final void method2631(byte arg0) {
        int var2 = 92 % ((arg0 - 46) / 52);
        this.field6404 = this.field6407 | this.field6404 << 8;
        field6409++;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 176)
    public static final void method2632(int arg0) {
        if (class9.field72 != null) {
            for (int var1 = 0; var1 < class631.field8755; var1++) {
                class9.field72[var1] = null;
            }
            class9.field72 = null;
        }
        field6406++;
        if (class598.field8361 != null) {
            for (int var2 = 0; var2 < class325.field4430; var2++) {
                class598.field8361[var2] = null;
            }
            class598.field8361 = null;
        }
        if (class184.field2659 != null) {
            for (int var3 = 0; var3 < class111.field1542; var3++) {
                class184.field2659[var3] = null;
            }
            class184.field2659 = null;
        }
        class129.field1838 = null;
        class91.field1307 = null;
        class672.field9426 = -1;
        class12.field125 = -1;
        if (arg0 != 32) {
            method2635(-107, -117, -44, 23, null);
        }
        class63.field713 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V", line = 236)
    public static void method2633(boolean arg0) {
        field6417 = null;
        field6416 = null;
        if (!arg0) {
            method2633(false);
        }
        field6408 = null;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V", line = 261)
    public static final void method2634(int arg0) {
        if (arg0 != 5) {
            return;
        }
        if (class11.field99 != null) {
            class11.field99.method3557((byte) -101);
        }
        field6402++;
        if (class681.field9723 != null) {
            class681.field9723.method3557((byte) -101);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIILcba;)V", line = 301)
    public static final void method2635(int arg0, int arg1, int arg2, int arg3, class511 arg4) {
        class390 var5 = class568.method3255(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field4042 = (arg1 << class588.field8259) + class265.field3586;
        arg4.field4052 = arg3;
        arg4.field4047 = (arg2 << class588.field8259) + class265.field3586;
        if (var5.field5524 != null) {
            arg4.field4052 -= var5.field5524.field6341;
        }
        var5.field5531 = arg4;
        int var6 = class52.field606 == class409.field5812 ? 1 : 0;
        if (arg4.method216(true)) {
            if (arg4.method209((byte) -29)) {
                class216.field3061[var6][class582.field8197[var6]++] = arg4;
                return;
            }
            class383.field5425[var6][class89.field1287[var6]++] = arg4;
            return;
        }
        class420.field5921[var6][field6417[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lac;I)V", line = 335)
    public final void method2636(class501 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field6412++;
        while (true) {
            int var3 = arg0.method2874((byte) -75);
            if (var3 == 0) {
                return;
            }
            this.method2630(var3, arg0, (byte) 11);
        }
    }
}
