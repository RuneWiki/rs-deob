import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 extends class67 {

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
    public int field500 = -1;

    @OriginalMember(owner = "client!d", name = "ob", descriptor = "I")
    public int field508 = 0;

    @OriginalMember(owner = "client!d", name = "nb", descriptor = "I")
    public int field507 = -1;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "Z")
    public boolean field501 = true;

    @OriginalMember(owner = "client!d", name = "rb", descriptor = "I")
    public static int field511 = 0;

    @OriginalMember(owner = "client!d", name = "pb", descriptor = "J")
    public static volatile long field509 = 0L;

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "[I")
    public static int[] field503 = new int[500];

    @OriginalMember(owner = "client!d", name = "zb", descriptor = "Lgd;")
    private static class40 field519 = class14.method90(false, "Loading game screen )2 ");

    @OriginalMember(owner = "client!d", name = "wb", descriptor = "Lgd;")
    private static class40 field516 = class14.method90(false, "wishes to trade with you)3");

    @OriginalMember(owner = "client!d", name = "ub", descriptor = "Lgd;")
    public static class40 field514 = field516;

    @OriginalMember(owner = "client!d", name = "Cb", descriptor = "Lgd;")
    private static class40 field522 = class14.method90(false, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!d", name = "mb", descriptor = "Lgd;")
    public static class40 field506 = class14.method90(false, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "Lgd;")
    public static class40 field502 = field522;

    @OriginalMember(owner = "client!d", name = "Db", descriptor = "Lgd;")
    public static class40 field523 = class14.method90(false, "@or3@");

    @OriginalMember(owner = "client!d", name = "Ab", descriptor = "Lgd;")
    public static class40 field520 = class14.method90(false, "");

    @OriginalMember(owner = "client!d", name = "lb", descriptor = "Lgd;")
    public static class40 field505 = field519;

    @OriginalMember(owner = "client!d", name = "Fb", descriptor = "Lgd;")
    public static class40 field525 = class14.method90(false, "(Z");

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "client!d", name = "qb", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!d", name = "sb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!d", name = "tb", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!d", name = "vb", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!d", name = "xb", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "client!d", name = "yb", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!d", name = "Bb", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "client!d", name = "Eb", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!d", name = "Gb", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "Lw;")
    public static class135 field494;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "Lmb;")
    public static class73 field492;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "Loc;")
    public static class86 field499;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method125(byte arg0, int arg1) {
        if (arg0 != -80) {
            field494 = null;
        }
        class118.method905((byte) -85);
        field513++;
        int var2 = class103.method746(arg0 + 96, arg1).field2753;
        if (var2 == 0) {
            return;
        }
        int var3 = class48.field1209[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class109.method840(0.9D);
                ((class92) class109.field2667).method622(0.9D, (byte) 64);
            }
            if (var3 == 2) {
                class109.method840(0.8D);
                ((class92) class109.field2667).method622(0.8D, (byte) 64);
            }
            if (var3 == 3) {
                class109.method840(0.7D);
                ((class92) class109.field2667).method622(0.7D, (byte) 64);
            }
            if (var3 == 4) {
                class109.method840(0.6D);
                ((class92) class109.field2667).method622(0.6D, (byte) 64);
            }
            class112.method864((byte) 103);
            class64.field1571 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class16.field418 != var4) {
                if (class16.field418 == 0 && class137.field3362 != -1) {
                    class94.method642(false, (byte) -119, var4, 0, class137.field3362, 0, class50.field1282);
                    class94.field2178 = 0;
                } else if (var4 == 0) {
                    class94.method637(arg0 - 3490);
                    class94.field2178 = 0;
                } else {
                    class61.method448(var4, true);
                }
                class16.field418 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class114.field2746 = 127;
            }
            if (var3 == 1) {
                class114.field2746 = 96;
            }
            if (var3 == 2) {
                class114.field2746 = 64;
            }
            if (var3 == 3) {
                class114.field2746 = 32;
            }
            if (var3 == 4) {
                class114.field2746 = 0;
            }
        }
        if (var2 == 6) {
            class8.field205 = var3;
        }
        if (var2 == 8) {
            class122.field2880 = true;
            class74.field1713 = var3;
        }
        if (var2 == 5) {
            class125.field2970 = var3;
        }
        if (var2 == 9) {
            class56.field1444 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            class125.field2954 = 127;
        }
        if (var3 == 1) {
            class125.field2954 = 96;
        }
        if (var3 == 2) {
            class125.field2954 = 64;
        }
        if (var3 == 3) {
            class125.field2954 = 32;
        }
        if (var3 == 4) {
            class125.field2954 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(BI)Lh;", line = 167)
    public static final class45 method126(byte arg0, int arg1) {
        field496++;
        class45 var2 = (class45) client.field459.method39(-110, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class8.field222.method731(arg1, 12, (byte) -125);
        class45 var4 = new class45();
        if (var3 != null) {
            var4.method318(0, new class104(var3));
        }
        var4.method315(-7767);
        int var5 = 41 % ((arg0 + 1) / 49);
        client.field459.method38(var4, (long) arg1, true);
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLrc;I)V", line = 191)
    public final void method127(byte arg0, class104 arg1, int arg2) {
        if (arg0 < 46) {
            return;
        }
        field493++;
        while (true) {
            int var4 = arg1.method798((byte) -124);
            if (var4 == 0) {
                return;
            }
            this.method132(4243, var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V", line = 215)
    public static void method128(int arg0) {
        field503 = null;
        field499 = null;
        field506 = null;
        field494 = null;
        field520 = null;
        field516 = null;
        field502 = null;
        field519 = null;
        field522 = null;
        field514 = null;
        field523 = null;
        field525 = null;
        if (arg0 != 0) {
            field522 = null;
        }
        field505 = null;
        field492 = null;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(Z)V", line = 240)
    public final void method129(boolean arg0) {
        field497++;
        if (arg0) {
            method125((byte) 64, -60);
        }
        if (this.field500 != -1) {
            this.method133((byte) 53, this.field500);
            this.field526 = this.field521;
            this.field510 = this.field504;
            this.field498 = this.field517;
        }
        this.method133((byte) 127, this.field508);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lrb;Z)V", line = 290)
    public static final void method130(class103 arg0, boolean arg1) {
        field524++;
        if (!arg1) {
            class16.field428 = arg0;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([Lee;IIIIZIIII)V", line = 309)
    public static final void method131(class30[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class30 var11 = arg0[var10];
            if (var11 != null && (var11.field660 == 0 || var11.field655) && var11 != null && var11.field722 == arg2 && (!var11.field638 || class98.field2334)) {
                int var12 = var11.field683 + arg9 - arg1;
                int var13 = var11.field688 + arg4 - arg6;
                int var14 = var13 + var11.field684;
                int var15 = var12 <= arg9 ? arg9 : var12;
                int var16 = arg4 >= var13 ? arg4 : var13;
                int var17 = var14 >= arg3 ? arg3 : var14;
                int var18 = var11.field700 + var12;
                int var19 = var18 >= arg7 ? arg7 : var18;
                if (var11.field660 == 0) {
                    method131(arg0, var11.field718, var11.field704, var17, var16, arg5, var11.field697, var19, arg8, var15);
                    if (var11.field745 != null) {
                        method131(var11.field745, var11.field718, var11.field704, var17, var16, false, var11.field697, var19, arg8, var15);
                    }
                }
                if (var11.field655) {
                    boolean var20;
                    if (class40.field1001 >= var15 && var16 <= class135.field3282 && class40.field1001 < var19 && var17 > class135.field3282) {
                        var20 = true;
                    } else {
                        var20 = false;
                    }
                    boolean var21 = false;
                    if (class106.field2572 == 1 && var20) {
                        var21 = true;
                    }
                    boolean var22 = false;
                    if (class80.field1841 == 1 && class132.field3191 >= var15 && var16 <= class90.field2041 && var19 > class132.field3191 && var17 > class90.field2041) {
                        var22 = true;
                    }
                    if (var11.field758 != -1 && var22 && class89.field2009 == null && (arg8 & 0x200) != 0 && !class90.field2040) {
                        class77.field1779 = 0;
                        class74.field1728 = false;
                        class89.field2009 = var11;
                        class67.field1647 = class135.field3282;
                        class108.field2643 = class40.field1001;
                    }
                    if (class89.field2009 != null || class90.field2040) {
                        var21 = false;
                        var22 = false;
                        var20 = false;
                    }
                    if (!var11.field639 && var22 && (arg8 & 0x1) != 0) {
                        var11.field639 = true;
                        if (var11.field667 != null) {
                            class45.method312(var11.field667, class90.field2041 - var13, -var12 + class132.field3191, var11, 66, 0);
                        }
                    }
                    if (var11.field639 && var21 && (arg8 & 0x4) != 0 && var11.field740 != null) {
                        class45.method312(var11.field740, class135.field3282 - var13, -var12 + class40.field1001, var11, 49, 0);
                    }
                    if (var11.field639 && !var21 && (arg8 & 0x2) != 0) {
                        var11.field639 = false;
                        if (var11.field736 != null) {
                            class45.method312(var11.field736, class135.field3282 - var13, class40.field1001 - var12, var11, 97, 0);
                        }
                    }
                    if (var21 && (arg8 & 0x8) != 0 && var11.field760 != null) {
                        class45.method312(var11.field760, class135.field3282 - var13, -var12 + class40.field1001, var11, 125, 0);
                    }
                    if (!var11.field640 && var20 && (arg8 & 0x10) != 0) {
                        var11.field640 = true;
                        if (var11.field721 != null) {
                            class45.method312(var11.field721, class135.field3282 - var13, class40.field1001 - var12, var11, 119, 0);
                        }
                    }
                    if (var11.field640 && var20 && (arg8 & 0x40) != 0 && var11.field755 != null) {
                        class45.method312(var11.field755, class135.field3282 - var13, -var12 + class40.field1001, var11, 65, 0);
                    }
                    if (var11.field640 && !var20 && (arg8 & 0x20) != 0) {
                        var11.field640 = false;
                        if (var11.field659 != null) {
                            class45.method312(var11.field659, class135.field3282 - var13, -var12 + class40.field1001, var11, 89, 0);
                        }
                    }
                    if (var11.field723 != null && (arg8 & 0x80) != 0) {
                        class45.method312(var11.field723, 0, 0, var11, 61, 0);
                    }
                    if ((arg8 & 0x100) != 0) {
                        if (var11.field678 < class130.field3096 && var11.field641 != null) {
                            class45.method312(var11.field641, 0, 0, var11, 95, 0);
                        }
                        if (class31.field833 > var11.field678 && var11.field699 != null) {
                            class45.method312(var11.field699, 0, 0, var11, 61, 0);
                        }
                        if (var11.field678 < class74.field1727 && var11.field703 != null) {
                            class45.method312(var11.field703, 0, 0, var11, 58, 0);
                        }
                        var11.field678 = class10.field242;
                    }
                }
            }
        }
        if (arg5) {
            method130(null, false);
        }
        field518++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIILrc;)V", line = 498)
    private final void method132(int arg0, int arg1, int arg2, class104 arg3) {
        if (arg1 == 1) {
            this.field508 = arg3.method770(-9409);
        } else if (arg1 == 2) {
            this.field507 = arg3.method798((byte) -67);
        } else if (arg1 == 5) {
            this.field501 = false;
        } else if (arg1 == 7) {
            this.field500 = arg3.method770(-9409);
        }
        field512++;
        if (arg0 != 4243) {
            method128(70);
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(BI)V", line = 571)
    private final void method133(byte arg0, int arg1) {
        field515++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        if (arg0 < 32) {
            field502 = null;
        }
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var7) {
            var9 = var7;
        }
        if (var5 < var9) {
            var9 = var5;
        }
        double var11 = var3;
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var7 > var3) {
            var11 = var7;
        }
        if (var11 < var5) {
            var11 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field521 = (int) (var17 * 256.0D);
        if (this.field521 < 0) {
            this.field521 = 0;
        } else if (this.field521 > 255) {
            this.field521 = 255;
        }
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var15 = (var7 - var5) / (var11 - var9);
            } else if (var7 == var11) {
                var15 = (var5 - var3) / (var11 - var9) + 2.0D;
            } else if (var5 == var11) {
                var15 = (var3 - var7) / (-var9 + var11) + 4.0D;
            }
        }
        this.field504 = (int) (var13 * 256.0D);
        double var19 = var15 / 6.0D;
        if (this.field504 < 0) {
            this.field504 = 0;
        } else if (this.field504 > 255) {
            this.field504 = 255;
        }
        this.field517 = (int) (var19 * 256.0D);
    }
}
