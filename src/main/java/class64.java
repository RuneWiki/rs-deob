import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class64 extends class293 {

    @OriginalMember(owner = "client!qu", name = "u", descriptor = "I")
    private int field809 = 256;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "[I")
    private int[] field803 = new int[16];

    @OriginalMember(owner = "client!qu", name = "v", descriptor = "[I")
    private int[] field810 = new int[16];

    @OriginalMember(owner = "client!qu", name = "x", descriptor = "[I")
    private int[] field812 = new int[16];

    @OriginalMember(owner = "client!qu", name = "G", descriptor = "[I")
    private int[] field821 = new int[16];

    @OriginalMember(owner = "client!qu", name = "K", descriptor = "[I")
    private int[] field825 = new int[16];

    @OriginalMember(owner = "client!qu", name = "db", descriptor = "I")
    private int field843 = 1000000;

    @OriginalMember(owner = "client!qu", name = "lb", descriptor = "[I")
    private int[] field851 = new int[16];

    @OriginalMember(owner = "client!qu", name = "eb", descriptor = "[I")
    private int[] field844 = new int[16];

    @OriginalMember(owner = "client!qu", name = "pb", descriptor = "[I")
    private int[] field855 = new int[16];

    @OriginalMember(owner = "client!qu", name = "H", descriptor = "[I")
    public int[] field822 = new int[16];

    @OriginalMember(owner = "client!qu", name = "tb", descriptor = "[I")
    private int[] field859 = new int[16];

    @OriginalMember(owner = "client!qu", name = "y", descriptor = "[I")
    public int[] field813 = new int[16];

    @OriginalMember(owner = "client!qu", name = "jb", descriptor = "[[Lps;")
    private class63[][] field849 = new class63[16][128];

    @OriginalMember(owner = "client!qu", name = "gb", descriptor = "[I")
    private int[] field846 = new int[16];

    @OriginalMember(owner = "client!qu", name = "w", descriptor = "[I")
    private int[] field811 = new int[16];

    @OriginalMember(owner = "client!qu", name = "A", descriptor = "[I")
    public int[] field815 = new int[16];

    @OriginalMember(owner = "client!qu", name = "zb", descriptor = "[I")
    private int[] field865 = new int[16];

    @OriginalMember(owner = "client!qu", name = "Ab", descriptor = "[[Lps;")
    private class63[][] field866 = new class63[16][128];

    @OriginalMember(owner = "client!qu", name = "bb", descriptor = "[I")
    private int[] field841 = new int[16];

    @OriginalMember(owner = "client!qu", name = "B", descriptor = "Lua;")
    private class470 field816 = new class470();

    @OriginalMember(owner = "client!qu", name = "Lb", descriptor = "Lgr;")
    private class299 field877 = new class299(this);

    @OriginalMember(owner = "client!qu", name = "R", descriptor = "Lmn;")
    private class247 field832 = new class247(128);

    @OriginalMember(owner = "client!qu", name = "sb", descriptor = "Lwj;")
    public static class270 field858 = new class270(9, -2);

    @OriginalMember(owner = "client!qu", name = "Db", descriptor = "Z")
    public static boolean field869 = false;

    @OriginalMember(owner = "client!qu", name = "Gb", descriptor = "I")
    public static int field872 = 0;

    @OriginalMember(owner = "client!qu", name = "Eb", descriptor = "Z")
    public static boolean field870 = false;

    @OriginalMember(owner = "client!qu", name = "Hb", descriptor = "[B")
    public static byte[] field873 = new byte[16384];

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!qu", name = "t", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!qu", name = "C", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!qu", name = "D", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!qu", name = "E", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!qu", name = "F", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!qu", name = "I", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!qu", name = "J", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!qu", name = "L", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!qu", name = "M", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!qu", name = "N", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!qu", name = "O", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!qu", name = "P", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!qu", name = "Q", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!qu", name = "S", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!qu", name = "U", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!qu", name = "V", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!qu", name = "W", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!qu", name = "X", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!qu", name = "Y", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!qu", name = "Z", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!qu", name = "ab", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!qu", name = "cb", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!qu", name = "fb", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!qu", name = "hb", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!qu", name = "ib", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!qu", name = "kb", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!qu", name = "mb", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!qu", name = "nb", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!qu", name = "ob", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!qu", name = "qb", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!qu", name = "rb", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!qu", name = "ub", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!qu", name = "vb", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!qu", name = "wb", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!qu", name = "xb", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!qu", name = "yb", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!qu", name = "Bb", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!qu", name = "Cb", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!qu", name = "Fb", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!qu", name = "Ib", descriptor = "I")
    private int field874;

    @OriginalMember(owner = "client!qu", name = "Jb", descriptor = "I")
    private int field875;

    @OriginalMember(owner = "client!qu", name = "Ob", descriptor = "I")
    private int field880;

    @OriginalMember(owner = "client!qu", name = "Mb", descriptor = "J")
    private long field878;

    @OriginalMember(owner = "client!qu", name = "Nb", descriptor = "J")
    private long field879;

    @OriginalMember(owner = "client!qu", name = "Qb", descriptor = "Lne;")
    private class208 field882;

    @OriginalMember(owner = "client!qu", name = "Kb", descriptor = "Z")
    private boolean field876;

    @OriginalMember(owner = "client!qu", name = "Pb", descriptor = "Z")
    private boolean field881;

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "[Ll;")
    public static class16[] field807;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZZLne;)V")
    private final synchronized void method516(int arg0, boolean arg1, boolean arg2, class208 arg3) {
        this.method527(arg2, -1);
        field830++;
        this.field816.method2766(arg3.field2900);
        this.field879 = 0L;
        this.field876 = arg1;
        if (arg0 != 32) {
            field807 = null;
        }
        int var5 = this.field816.method2760();
        for (int var6 = 0; var6 < var5; var6++) {
            this.field816.method2768(var6);
            this.field816.method2762(var6);
            this.field816.method2761(var6);
        }
        this.field875 = this.field816.method2756();
        this.field874 = this.field816.field6872[this.field875];
        this.field878 = this.field816.method2754(this.field874);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZZ)V")
    private final void method517(boolean arg0, boolean arg1) {
        if (arg0) {
            this.method531((byte) -126, -1);
        } else {
            this.method539((byte) -101, -1);
        }
        field847++;
        this.method533(-1, (byte) 3);
        int var3 = 0;
        if (arg1) {
            this.field815 = null;
        }
        while (var3 < 16) {
            this.field803[var3] = this.field821[var3];
            var3++;
        }
        for (int var4 = 0; var4 < 16; var4++) {
            this.field841[var4] = class251.method1501(this.field821[var4], -128);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)V")
    private final void method518(int arg0, int arg1) {
        field863++;
        int var3 = arg1 & 0xF0;
        if (arg0 >= -35) {
            return;
        }
        if (var3 == 128) {
            int var4 = arg1 & 0xF;
            int var5 = (arg1 & 0x7F06) >> 8;
            int var6 = arg1 >> 16 & 0x7F;
            this.method529(var4, 0, var6, var5);
        } else if (var3 == 144) {
            int var7 = arg1 & 0xF;
            int var8 = (arg1 & 0x7F73) >> 8;
            int var9 = arg1 >> 16 & 0x7F;
            if (var9 > 0) {
                this.method547((byte) -126, var9, var8, var7);
            } else {
                this.method529(var7, 0, 64, var8);
            }
        } else if (var3 == 160) {
            int var10 = arg1 & 0xF;
            int var11 = (arg1 & 0x7F9F) >> 8;
            int var12 = arg1 >> 16 & 0x7F;
            this.method525(var11, (byte) 117, var12, var10);
        } else if (var3 == 176) {
            int var13 = arg1 & 0xF;
            int var14 = arg1 >> 8 & 0x7F;
            int var15 = (arg1 & 0x7F21C4) >> 16;
            if (var14 == 0) {
                this.field841[var13] = class251.method1501(-2080769, this.field841[var13]) + (var15 << 14);
            }
            if (var14 == 32) {
                this.field841[var13] = class251.method1501(-16257, this.field841[var13]) + (var15 << 7);
            }
            if (var14 == 1) {
                this.field846[var13] = class251.method1501(-16257, this.field846[var13]) + (var15 << 7);
            }
            if (var14 == 33) {
                this.field846[var13] = class251.method1501(this.field846[var13], -128) + var15;
            }
            if (var14 == 5) {
                this.field810[var13] = (var15 << 7) + class251.method1501(-16257, this.field810[var13]);
            }
            if (var14 == 37) {
                this.field810[var13] = class251.method1501(this.field810[var13], -128) + var15;
            }
            if (var14 == 7) {
                this.field812[var13] = (var15 << 7) + class251.method1501(this.field812[var13], -16257);
            }
            if (var14 == 39) {
                this.field812[var13] = class251.method1501(-128, this.field812[var13]) + var15;
            }
            if (var14 == 10) {
                this.field844[var13] = (var15 << 7) + class251.method1501(this.field844[var13], -16257);
            }
            if (var14 == 42) {
                this.field844[var13] = class251.method1501(this.field844[var13], -128) + var15;
            }
            if (var14 == 11) {
                this.field859[var13] = class251.method1501(this.field859[var13], -16257) + (var15 << 7);
            }
            if (var14 == 43) {
                this.field859[var13] = class251.method1501(this.field859[var13], -128) + var15;
            }
            if (var14 == 64) {
                if (var15 < 64) {
                    this.field815[var13] = class251.method1501(this.field815[var13], -2);
                } else {
                    this.field815[var13] = class255.method1532(this.field815[var13], 1);
                }
            }
            if (var14 == 65) {
                if (var15 >= 64) {
                    this.field815[var13] = class255.method1532(this.field815[var13], 2);
                } else {
                    this.method542(var13, 124);
                    this.field815[var13] = class251.method1501(this.field815[var13], -3);
                }
            }
            if (var14 == 99) {
                this.field865[var13] = (var15 << 7) + class251.method1501(127, this.field865[var13]);
            }
            if (var14 == 98) {
                this.field865[var13] = var15 + class251.method1501(this.field865[var13], 16256);
            }
            if (var14 == 101) {
                this.field865[var13] = (var15 << 7) + class251.method1501(this.field865[var13], 127) + 16384;
            }
            if (var14 == 100) {
                this.field865[var13] = class251.method1501(16256, this.field865[var13]) + var15 + 16384;
            }
            if (var14 == 120) {
                this.method531((byte) -125, var13);
            }
            if (var14 == 121) {
                this.method533(var13, (byte) 3);
            }
            if (var14 == 123) {
                this.method539((byte) -64, var13);
            }
            if (var14 == 6) {
                int var16 = this.field865[var13];
                if (var16 == 16384) {
                    this.field825[var13] = (var15 << 7) + class251.method1501(-16257, this.field825[var13]);
                }
            }
            if (var14 == 38) {
                int var17 = this.field865[var13];
                if (var17 == 16384) {
                    this.field825[var13] = class251.method1501(this.field825[var13], -128) + var15;
                }
            }
            if (var14 == 16) {
                this.field822[var13] = class251.method1501(-16257, this.field822[var13]) + (var15 << 7);
            }
            if (var14 == 48) {
                this.field822[var13] = var15 + class251.method1501(this.field822[var13], -128);
            }
            if (var14 == 81) {
                if (var15 < 64) {
                    this.method522(113, var13);
                    this.field815[var13] = class251.method1501(this.field815[var13], -5);
                } else {
                    this.field815[var13] = class255.method1532(this.field815[var13], 4);
                }
            }
            if (var14 == 17) {
                this.method552((var15 << 7) + (this.field811[var13] & 0xFFFFC07F), true, var13);
            }
            if (var14 == 49) {
                this.method552((this.field811[var13] & 0xFFFFFF80) + var15, true, var13);
            }
        } else if (var3 == 192) {
            int var18 = arg1 & 0xF;
            int var19 = (arg1 & 0x7FF9) >> 8;
            this.method557(var18, this.field841[var18] + var19, -25966);
        } else if (var3 == 208) {
            int var20 = arg1 & 0xF;
            int var21 = arg1 >> 8 & 0x7F;
            this.method558(var20, var21, -128);
        } else if (var3 == 224) {
            int var22 = arg1 & 0xF;
            int var23 = ((arg1 & 0x7F8E) >> 8) + ((arg1 & 0x7F00A7) >> 9);
            this.method541(var22, var23, (byte) 96);
        } else {
            int var24 = arg1 & 0xFF;
            if (var24 == 255) {
                this.method517(true, false);
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)V")
    public final synchronized void method519(int arg0) {
        if (arg0 < -111) {
            for (class382 var2 = (class382) this.field832.method1494(0); var2 != null; var2 = (class382) this.field832.method1493((byte) 119)) {
                var2.method2270((byte) 123);
            }
            field831++;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V")
    public static final void method520(boolean arg0) {
        field860++;
        if (class66.field906 == 0) {
            return;
        }
        if (arg0) {
            field807 = null;
        }
        try {
            if ((++class522.field7733) > 2000) {
                if (class33.field438 != null) {
                    class33.field438.method2839(-20828);
                    class33.field438 = null;
                }
                if (class401.field5888 >= 1) {
                    class66.field906 = 0;
                    class377.field5530 = -5;
                    return;
                }
                class401.field5888++;
                class522.field7733 = 0;
                if (class314.field4277 == class27.field353) {
                    class314.field4277 = class223.field3177;
                } else {
                    class314.field4277 = class27.field353;
                }
                class66.field906 = 1;
            }
            if (class66.field906 == 1) {
                class85.field1262 = class202.field2840.method2952(class314.field4277, false, class494.field7216);
                class66.field906 = 2;
            }
            if (class66.field906 == 2) {
                if (class85.field1262.field667 == 2) {
                    throw new IOException();
                }
                if (class85.field1262.field667 != 1) {
                    return;
                }
                class33.field438 = new class483((Socket) class85.field1262.field670, class202.field2840);
                class85.field1262 = null;
                class33.field438.method2835((byte) 88, class481.field7027.field5719, class481.field7027.field5678, 0);
                class67.method570(-30266);
                int var1 = class33.field438.method2844(-76);
                class67.method570(-30266);
                if (var1 != 21) {
                    class66.field906 = 0;
                    class377.field5530 = var1;
                    class33.field438.method2839(-20828);
                    class33.field438 = null;
                    return;
                }
                class66.field906 = 3;
            }
            if (class66.field906 == 3) {
                if (class33.field438.method2842(0) < 1) {
                    return;
                }
                class194.field2762 = new String[class33.field438.method2844(61)];
                class66.field906 = 4;
            }
            if (class66.field906 == 4 && class33.field438.method2842(0) >= (class194.field2762.length * 8)) {
                class179.field2631.field5719 = 0;
                class33.field438.method2833(0, class179.field2631.field5678, class194.field2762.length * 8, (byte) -122);
                for (int var2 = 0; var2 < class194.field2762.length; var2++) {
                    class194.field2762[var2] = class344.method2043((byte) 72, class179.field2631.method2306((byte) -125));
                }
                class377.field5530 = 21;
                class66.field906 = 0;
                class33.field438.method2839(-20828);
                class33.field438 = null;
            }
        } catch (IOException var3) {
            if (class33.field438 != null) {
                class33.field438.method2839(-20828);
                class33.field438 = null;
            }
            if (class401.field5888 >= 1) {
                class377.field5530 = -4;
                class66.field906 = 0;
            } else {
                class66.field906 = 1;
                class522.field7733 = 0;
                class401.field5888++;
                if (class314.field4277 == class27.field353) {
                    class314.field4277 = class223.field3177;
                } else {
                    class314.field4277 = class27.field353;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "()Lad;")
    public final synchronized class293 method521() {
        field852++;
        return null;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(II)V")
    private final void method522(int arg0, int arg1) {
        field823++;
        if ((this.field815[arg1] & 0x4) != 0) {
            for (class63 var3 = (class63) this.field877.field4103.method2818((byte) 119); var3 != null; var3 = (class63) this.field877.field4103.method2820((byte) -58)) {
                if (var3.field783 == arg1) {
                    var3.field788 = 0;
                }
            }
        }
        if (arg0 < 51) {
            this.field865 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "([III)V")
    public final synchronized void method523(int[] arg0, int arg1, int arg2) {
        field840++;
        if (this.field816.method2765()) {
            int var4 = this.field816.field6870 * this.field843 / class188.field2724;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field879;
                if (this.field878 - var5 >= 0L) {
                    this.field879 = var5;
                    break;
                }
                int var7 = (int) (((long) var4 + this.field878 - this.field879 - 1L) / (long) var4);
                this.field879 += (long) var4 * (long) var7;
                this.field877.method523(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method536(-1);
            } while (this.field816.method2765());
        }
        this.field877.method523(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "(I)V")
    public final synchronized void method524(int arg0) {
        field835++;
        this.method527(true, -1);
        if (arg0 <= 16) {
            this.field812 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IBII)V")
    private final void method525(int arg0, byte arg1, int arg2, int arg3) {
        field814++;
        if (arg1 < 90) {
            this.field809 = -92;
        }
    }

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "(I)Z")
    public final synchronized boolean method526(int arg0) {
        int var2 = 20 % ((arg0 - 9) / 62);
        field837++;
        return this.field816.method2765();
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZI)V")
    private final synchronized void method527(boolean arg0, int arg1) {
        field853++;
        this.field816.method2759();
        this.field882 = null;
        if (arg1 == -1) {
            this.method517(arg0, false);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lne;ZI)V")
    public final synchronized void method528(class208 arg0, boolean arg1, int arg2) {
        this.method516(32, arg1, true, arg0);
        if (arg2 < -60) {
            field864++;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIII)V")
    private final void method529(int arg0, int arg1, int arg2, int arg3) {
        field839++;
        class63 var5 = this.field849[arg0][arg3];
        if (var5 == null) {
            return;
        }
        this.field849[arg0][arg3] = null;
        if ((this.field815[arg0] & 0x2) == arg1) {
            var5.field787 = 0;
            return;
        }
        for (class63 var6 = (class63) this.field877.field4103.method2818((byte) -10); var6 != null; var6 = (class63) this.field877.field4103.method2820((byte) -58)) {
            if (var5.field783 == var6.field783 && var6.field787 < 0 && var5 != var6) {
                var5.field787 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lps;I)I")
    private final int method530(class63 arg0, int arg1) {
        field827++;
        int var3 = (arg0.field798 * arg0.field779 >> 12) + arg0.field780;
        int var4 = ((this.field851[arg0.field783] + arg1) * this.field825[arg0.field783] >> 12) + var3;
        class423 var5 = arg0.field793;
        if (var5.field6188 > 0 && (var5.field6201 > 0 || this.field846[arg0.field783] > 0)) {
            int var6 = var5.field6201 << 2;
            int var7 = var5.field6193 << 1;
            if (arg0.field792 < var7) {
                var6 = arg0.field792 * var6 / var7;
            }
            int var8 = (this.field846[arg0.field783] >> 7) + var6;
            double var9 = Math.sin((double) (arg0.field785 & 0x1FF) * 0.01227184630308513D);
            var4 += (int) ((double) var8 * var9);
        }
        int var11 = (int) ((double) (arg0.field786.field6655 * 256) * Math.pow(2.0D, (double) var4 * 3.255208333333333E-4D) / (double) class188.field2724 + 0.5D);
        return var11 >= 1 ? var11 : 1;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BI)V")
    private final void method531(byte arg0, int arg1) {
        field833++;
        if (arg0 >= -102) {
            this.field851 = null;
        }
        for (class63 var3 = (class63) this.field877.field4103.method2818((byte) 115); var3 != null; var3 = (class63) this.field877.field4103.method2820((byte) -58)) {
            if (arg1 < 0 || var3.field783 == arg1) {
                if (var3.field797 != null) {
                    var3.field797.method3011(class188.field2724 / 100);
                    if (var3.field797.method3016()) {
                        this.field877.field4114.method583(var3.field797);
                    }
                    var3.method512(-5900);
                }
                if (var3.field787 < 0) {
                    this.field849[var3.field783][var3.field778] = null;
                }
                var3.method1565(0);
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "(I)V")
    public final synchronized void method532(int arg0) {
        field829++;
        for (class382 var2 = (class382) this.field832.method1494(arg0 ^ arg0); var2 != null; var2 = (class382) this.field832.method1493((byte) 119)) {
            var2.method1565(0);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IB)V")
    private final void method533(int arg0, byte arg1) {
        field805++;
        if (arg0 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method533(var3, (byte) 3);
            }
            return;
        }
        this.field812[arg0] = 12800;
        this.field844[arg0] = 8192;
        this.field859[arg0] = 16383;
        this.field851[arg0] = 8192;
        this.field846[arg0] = 0;
        this.field810[arg0] = 8192;
        if (arg1 != 3) {
            this.method529(-37, -115, -88, 85);
        }
        this.method542(arg0, 107);
        this.method522(83, arg0);
        this.field815[arg0] = 0;
        this.field865[arg0] = 32767;
        this.field825[arg0] = 256;
        this.field822[arg0] = 0;
        this.method552(8192, true, arg0);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V")
    private final synchronized void method534(int arg0, int arg1, int arg2) {
        if (arg1 < 0) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field855[var4] = arg0;
            }
        } else {
            this.field855[arg1] = arg0;
        }
        field819++;
        if (arg2 != 1) {
            method520(false);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILps;)I")
    private final int method535(int arg0, class63 arg1) {
        field862++;
        if (arg0 > -25) {
            this.method550();
        }
        int var3 = this.field844[arg1.field783];
        return var3 < 8192 ? arg1.field802 * var3 + 32 >> 6 : 16384 - ((128 - arg1.field802) * (16384 - var3) + 32 >> 6);
    }

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "(I)V")
    private final void method536(int arg0) {
        field828++;
        int var2 = this.field875;
        int var3 = this.field874;
        long var4 = this.field878;
        if (this.field882 != null && this.field880 == var3) {
            this.method516(32, this.field876, this.field881, this.field882);
            this.method536(arg0);
            return;
        }
        while (this.field874 == var3) {
            while (this.field816.field6872[var2] == var3) {
                this.field816.method2768(var2);
                int var6 = this.field816.method2758(var2);
                if (var6 == 1) {
                    this.field816.method2757();
                    this.field816.method2761(var2);
                    if (this.field816.method2763()) {
                        if (this.field882 != null) {
                            this.method528(this.field882, this.field876, arg0 ^ 0x74);
                            this.method536(-1);
                            return;
                        }
                        if (!this.field876 || var3 == 0) {
                            this.method517(true, false);
                            this.field816.method2759();
                            return;
                        }
                        this.field816.method2767(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method518(-99, var6);
                }
                this.field816.method2762(var2);
                this.field816.method2761(var2);
            }
            var2 = this.field816.method2756();
            var3 = this.field816.field6872[var2];
            var4 = this.field816.method2754(var3);
        }
        this.field878 = var4;
        this.field874 = var3;
        this.field875 = var2;
        if (this.field882 != null && this.field880 < var3) {
            this.field875 = -1;
            this.field874 = this.field880;
            this.field878 = this.field816.method2754(this.field874);
        }
        if (arg0 != -1) {
            field870 = false;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(Lps;I)I")
    private final int method537(class63 arg0, int arg1) {
        field845++;
        if (this.field855[arg0.field783] == 0) {
            return 0;
        }
        class423 var3 = arg0.field793;
        if (arg1 != -977816496) {
            return 26;
        }
        int var4 = this.field859[arg0.field783] * this.field812[arg0.field783] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg0.field795 * var5 + 16384 >> 15;
        int var7 = this.field809 * var6 + 128 >> 8;
        int var8 = this.field855[arg0.field783] * var7 + 128 >> 8;
        if (var3.field6191 > 0) {
            var8 = (int) (Math.pow(0.5D, (double) arg0.field801 * 1.953125E-5D * (double) var3.field6191) * (double) var8 + 0.5D);
        }
        if (var3.field6198 != null) {
            int var9 = arg0.field781;
            int var10 = var3.field6198[arg0.field789 + 1];
            if (arg0.field789 < var3.field6198.length - 2) {
                int var11 = var3.field6198[arg0.field789] & 0xFF << 8;
                int var12 = (var3.field6198[arg0.field789 + 2] & 0xFF) << 8;
                var10 += (var3.field6198[arg0.field789 + 3] - var10) * (var9 - var11) / (var12 - var11);
            }
            var8 = var8 * var10 + 32 >> 6;
        }
        if (arg0.field787 > 0 && var3.field6194 != null) {
            int var13 = arg0.field787;
            int var14 = var3.field6194[arg0.field794 + 1];
            if (arg0.field794 < (var3.field6194.length - 2)) {
                int var15 = var3.field6194[arg0.field794] & 0xFF << 8;
                int var16 = var3.field6194[arg0.field794 + 2] & 0xFF << 8;
                var14 += (var3.field6194[arg0.field794 + 3] - var14) * (var13 - var15) / (var16 - var15);
            }
            var8 = var8 * var14 + 32 >> 6;
        }
        return var8;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "()I")
    public final synchronized int method538() {
        field804++;
        return 0;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(BI)V")
    private final void method539(byte arg0, int arg1) {
        for (class63 var3 = (class63) this.field877.field4103.method2818((byte) -52); var3 != null; var3 = (class63) this.field877.field4103.method2820((byte) -58)) {
            if ((arg1 < 0 || var3.field783 == arg1) && var3.field787 < 0) {
                this.field849[var3.field783][var3.field778] = null;
                var3.field787 = 0;
            }
        }
        field817++;
        if (arg0 > -49) {
            this.field825 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "(I)I")
    public final int method540(int arg0) {
        if (arg0 == 2) {
            field848++;
            return this.field809;
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIB)V")
    private final void method541(int arg0, int arg1, byte arg2) {
        if (arg2 < 52) {
            this.field844 = null;
        }
        field850++;
        this.field851[arg0] = arg1;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(II)V")
    private final void method542(int arg0, int arg1) {
        field856++;
        if (arg1 <= 100 || (this.field815[arg0] & 0x2) == 0) {
            return;
        }
        for (class63 var3 = (class63) this.field877.field4103.method2818((byte) -39); var3 != null; var3 = (class63) this.field877.field4103.method2820((byte) -58)) {
            if (var3.field783 == arg0 && this.field849[arg0][var3.field778] == null && var3.field787 < 0) {
                var3.field787 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(III)I")
    public static final int method543(int arg0, int arg1, int arg2) {
        if (arg0 != 8525) {
            method544((byte) -69);
        }
        field826++;
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg1 >>>= 0x1;
            arg2--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
    public static void method544(byte arg0) {
        field873 = null;
        field858 = null;
        field807 = null;
        if (arg0 <= 116) {
            method544((byte) 89);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILps;I[I)Z")
    public final boolean method545(int arg0, int arg1, class63 arg2, int arg3, int[] arg4) {
        arg2.field796 = class188.field2724 / 100;
        if (arg3 < 120) {
            return true;
        }
        field854++;
        if (arg2.field787 >= 0 && (arg2.field797 == null || arg2.field797.method3014())) {
            arg2.method512(-5900);
            arg2.method1565(0);
            if (arg2.field791 > 0 && this.field866[arg2.field783][arg2.field791] == arg2) {
                this.field866[arg2.field783][arg2.field791] = null;
            }
            return true;
        }
        int var6 = arg2.field779;
        if (var6 > 0) {
            int var7 = var6 - (int) (Math.pow(2.0D, (double) this.field810[arg2.field783] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var7 < 0) {
                var7 = 0;
            }
            arg2.field779 = var7;
        }
        arg2.field797.method2999(this.method530(arg2, -8192));
        class423 var8 = arg2.field793;
        arg2.field792++;
        arg2.field785 += var8.field6188;
        boolean var9 = false;
        double var10 = (double) ((arg2.field778 - 60 << 8) + (arg2.field798 * arg2.field779 >> 12)) * 5.086263020833333E-6D;
        if (var8.field6191 > 0) {
            if (var8.field6192 <= 0) {
                arg2.field801 += 128;
            } else {
                arg2.field801 += (int) (Math.pow(2.0D, (double) var8.field6192 * var10) * 128.0D + 0.5D);
            }
            if ((arg2.field801 * var8.field6191) >= 819200) {
                var9 = true;
            }
        }
        if (var8.field6198 != null) {
            if (var8.field6189 > 0) {
                arg2.field781 += (int) (Math.pow(2.0D, (double) var8.field6189 * var10) * 128.0D + 0.5D);
            } else {
                arg2.field781 += 128;
            }
            while (var8.field6198.length - 2 > arg2.field789 && arg2.field781 > (var8.field6198[arg2.field789 + 2] & 0xFF) << 8) {
                arg2.field789 += 2;
            }
            if (var8.field6198.length - 2 == arg2.field789 && var8.field6198[arg2.field789 + 1] == 0) {
                var9 = true;
            }
        }
        if (arg2.field787 >= 0 && var8.field6194 != null && (this.field815[arg2.field783] & 0x1) == 0 && (arg2.field791 < 0 || this.field866[arg2.field783][arg2.field791] != arg2)) {
            if (var8.field6190 <= 0) {
                arg2.field787 += 128;
            } else {
                arg2.field787 += (int) (Math.pow(2.0D, (double) var8.field6190 * var10) * 128.0D + 0.5D);
            }
            while (arg2.field794 < var8.field6194.length - 2 && ((var8.field6194[arg2.field794 + 2] & 0xFF) << 8) < arg2.field787) {
                arg2.field794 += 2;
            }
            if (var8.field6194.length - 2 == arg2.field794) {
                var9 = true;
            }
        }
        if (!var9) {
            arg2.field797.method3007(arg2.field796, this.method537(arg2, -977816496), this.method535(-70, arg2));
            return false;
        }
        arg2.field797.method3011(arg2.field796);
        if (arg4 == null) {
            arg2.field797.method546(arg0);
        } else {
            arg2.field797.method523(arg4, arg1, arg0);
        }
        if (arg2.field797.method3016()) {
            this.field877.field4114.method583(arg2.field797);
        }
        arg2.method512(-5900);
        if (arg2.field787 >= 0) {
            arg2.method1565(0);
            if (arg2.field791 > 0 && this.field866[arg2.field783][arg2.field791] == arg2) {
                this.field866[arg2.field783][arg2.field791] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
    public final synchronized void method546(int arg0) {
        if (this.field816.method2765()) {
            int var2 = this.field816.field6870 * this.field843 / class188.field2724;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field879;
                if ((this.field878 - var3) >= 0L) {
                    this.field879 = var3;
                    break;
                }
                int var5 = (int) (((long) var2 + this.field878 - this.field879 - 1L) / (long) var2);
                this.field879 += (long) var2 * (long) var5;
                this.field877.method546(var5);
                arg0 -= var5;
                this.method536(-1);
            } while (this.field816.method2765());
        }
        field867++;
        this.field877.method546(arg0);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BIII)V")
    private final void method547(byte arg0, int arg1, int arg2, int arg3) {
        field824++;
        this.method529(arg3, 0, 64, arg2);
        if ((this.field815[arg3] & 0x2) != 0) {
            for (class63 var5 = (class63) this.field877.field4103.method2811(2); var5 != null; var5 = (class63) this.field877.field4103.method2813(29)) {
                if (var5.field783 == arg3 && var5.field787 < 0) {
                    this.field849[arg3][var5.field778] = null;
                    this.field849[arg3][arg2] = var5;
                    int var6 = (var5.field798 * var5.field779 >> 12) + var5.field780;
                    var5.field780 += arg2 - var5.field778 << 8;
                    var5.field779 = 4096;
                    var5.field798 = var6 - var5.field780;
                    var5.field778 = arg2;
                    return;
                }
            }
        }
        class382 var7 = (class382) this.field832.method1492((long) this.field803[arg3], 6340);
        if (var7 == null) {
            return;
        }
        if (arg0 > -109) {
            method543(-27, -61, 24);
        }
        class452 var8 = var7.field5591[arg2];
        if (var8 == null) {
            return;
        }
        class63 var9 = new class63();
        var9.field783 = arg3;
        var9.field786 = var8;
        var9.field800 = var7;
        var9.field793 = var7.field5578[arg2];
        var9.field791 = var7.field5575[arg2];
        var9.field778 = arg2;
        var9.field795 = var7.field5583 * arg1 * arg1 * var7.field5577[arg2] + 1024 >> 11;
        var9.field802 = var7.field5574[arg2] & 0xFF;
        var9.field780 = (arg2 << 8) - (var7.field5584[arg2] & 0x7FFF);
        var9.field801 = 0;
        var9.field787 = -1;
        var9.field781 = 0;
        var9.field794 = 0;
        var9.field789 = 0;
        if (this.field822[arg3] == 0) {
            var9.field797 = class505.method3015(var8, this.method530(var9, -8192), this.method537(var9, -977816496), this.method535(-45, var9));
        } else {
            var9.field797 = class505.method3015(var8, this.method530(var9, -8192), 0, this.method535(-42, var9));
            this.method549(var9, var7.field5584[arg2] < 0, false);
        }
        if (var7.field5584[arg2] < 0) {
            var9.field797.method3010(-1);
        }
        if (var9.field791 >= 0) {
            class63 var10 = this.field866[arg3][var9.field791];
            if (var10 != null && var10.field787 < 0) {
                this.field849[arg3][var10.field778] = null;
                var10.field787 = 0;
            }
            this.field866[arg3][var9.field791] = var9;
        }
        this.field877.field4103.method2809(var9, 2);
        this.field849[arg3][arg2] = var9;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZ)V")
    public final synchronized void method548(int arg0, boolean arg1) {
        this.field809 = arg0;
        if (arg1) {
            this.field809 = 42;
        }
        field838++;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lps;ZZ)V")
    public final void method549(class63 arg0, boolean arg1, boolean arg2) {
        field818++;
        if (arg2) {
            this.field878 = 21L;
        }
        int var4 = arg0.field786.field6656.length;
        int var7;
        if (arg1 && arg0.field786.field6657) {
            int var5 = var4 + var4 - arg0.field786.field6654;
            int var6 = var4 << 8;
            var7 = (int) ((long) this.field822[arg0.field783] * (long) var5 >> 6);
            if (var6 <= var7) {
                var7 = var6 + var6 - var7 - 1;
                arg0.field797.method2988(true);
            }
        } else {
            var7 = (int) ((long) this.field822[arg0.field783] * (long) var4 >> 6);
        }
        arg0.field797.method2980(var7);
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "()Lad;")
    public final synchronized class293 method550() {
        field861++;
        return this.field877;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZII)V")
    private final void method551(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method519(-28);
        }
        field820++;
        this.field821[arg2] = arg1;
        this.field841[arg2] = class251.method1501(arg1, -128);
        this.method557(arg2, arg1, -25966);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZI)V")
    private final void method552(int arg0, boolean arg1, int arg2) {
        field857++;
        if (!arg1) {
            this.method539((byte) -31, 31);
        }
        this.field811[arg2] = arg0;
        this.field813[arg2] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lmg;Lhf;IILne;)Z")
    public final synchronized boolean method553(class101 arg0, class271 arg1, int arg2, int arg3, class208 arg4) {
        arg4.method1290();
        field868++;
        boolean var6 = true;
        int[] var7 = null;
        if (arg3 < arg2) {
            var7 = new int[] { arg2 };
        }
        for (class273 var8 = (class273) arg4.field2899.method1494(0); var8 != null; var8 = (class273) arg4.field2899.method1493((byte) 85)) {
            int var9 = (int) var8.field3615;
            class382 var10 = (class382) this.field832.method1492((long) var9, 6340);
            if (var10 == null) {
                var10 = class230.method1424(12716, var9, arg0);
                if (var10 == null) {
                    var6 = false;
                    continue;
                }
                this.field832.method1487(arg3 ^ 0xFFFFFF9C, (long) var9, var10);
            }
            if (!var10.method2271(1, var7, var8.field3761, arg1)) {
                var6 = false;
            }
        }
        if (var6) {
            arg4.method1289();
        }
        return var6;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(III)V")
    public final synchronized void method554(int arg0, int arg1, int arg2) {
        if (arg2 != -65) {
            this.field811 = null;
        }
        field842++;
        this.method551(false, arg1, arg0);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lps;B)Z")
    public final boolean method555(class63 arg0, byte arg1) {
        if (arg1 != -7) {
            return false;
        }
        field834++;
        if (arg0.field797 != null) {
            return false;
        }
        if (arg0.field787 >= 0) {
            arg0.method1565(0);
            if (arg0.field791 > 0 && this.field866[arg0.field783][arg0.field791] == arg0) {
                this.field866[arg0.field783][arg0.field791] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILya;)V")
    public static final void method556(int arg0, class38 arg1) {
        field836++;
        if (arg0 != -455979096) {
            method544((byte) 70);
        }
        if (class181.field2659) {
            class451.method2661(arg1, 21497);
        } else {
            class243.method1469((byte) 14, arg1);
        }
    }

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "(III)V")
    private final void method557(int arg0, int arg1, int arg2) {
        if (this.field803[arg0] != arg1) {
            this.field803[arg0] = arg1;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field866[arg0][var4] = null;
            }
        }
        field806++;
        if (arg2 != -25966) {
            this.field813 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "(III)V")
    private final void method558(int arg0, int arg1, int arg2) {
        if (arg2 == -128) {
            field808++;
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
    public class64() {
        this.method534(256, -1, 1);
        this.method517(true, false);
    }
}
