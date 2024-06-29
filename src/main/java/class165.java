import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class165 extends class117 {

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "[I")
    public int[] field2658 = new int[16];

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "[I")
    public int[] field2671 = new int[16];

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "[I")
    private int[] field2685 = new int[16];

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "[I")
    private int[] field2665 = new int[16];

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "[I")
    private int[] field2670 = new int[16];

    @OriginalMember(owner = "client!ac", name = "db", descriptor = "[I")
    private int[] field2693 = new int[16];

    @OriginalMember(owner = "client!ac", name = "ob", descriptor = "[I")
    private int[] field2704 = new int[16];

    @OriginalMember(owner = "client!ac", name = "hb", descriptor = "[I")
    private int[] field2697 = new int[16];

    @OriginalMember(owner = "client!ac", name = "qb", descriptor = "[I")
    private int[] field2706 = new int[16];

    @OriginalMember(owner = "client!ac", name = "pb", descriptor = "I")
    private int field2705 = 1000000;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "[I")
    private int[] field2673 = new int[16];

    @OriginalMember(owner = "client!ac", name = "vb", descriptor = "[I")
    private int[] field2711 = new int[16];

    @OriginalMember(owner = "client!ac", name = "cb", descriptor = "[[Lwb;")
    private class220[][] field2692 = new class220[16][128];

    @OriginalMember(owner = "client!ac", name = "Ab", descriptor = "[[Lwb;")
    private class220[][] field2716 = new class220[16][128];

    @OriginalMember(owner = "client!ac", name = "wb", descriptor = "[I")
    private int[] field2712 = new int[16];

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
    private int field2687 = 256;

    @OriginalMember(owner = "client!ac", name = "Db", descriptor = "[I")
    private int[] field2719 = new int[16];

    @OriginalMember(owner = "client!ac", name = "Fb", descriptor = "[I")
    private int[] field2721 = new int[16];

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "[I")
    public int[] field2669 = new int[16];

    @OriginalMember(owner = "client!ac", name = "sb", descriptor = "Lmg;")
    private class124 field2708 = new class124();

    @OriginalMember(owner = "client!ac", name = "Pb", descriptor = "Lbc;")
    private class237 field2731 = new class237(this);

    @OriginalMember(owner = "client!ac", name = "yb", descriptor = "Ldf;")
    private class231 field2714 = new class231(128);

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
    public static int field2686 = 0;

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "Lqj;")
    public static class196 field2688 = class80.method502("huffman", -48);

    @OriginalMember(owner = "client!ac", name = "fb", descriptor = "[I")
    public static int[] field2695 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ac", name = "lb", descriptor = "Lqj;")
    public static class196 field2701 = class80.method502("Spieler kann nicht gefunden werden: ", -48);

    @OriginalMember(owner = "client!ac", name = "gb", descriptor = "I")
    public static int field2696 = 0;

    @OriginalMember(owner = "client!ac", name = "Bb", descriptor = "Lqj;")
    public static class196 field2717 = class80.method502("", -48);

    @OriginalMember(owner = "client!ac", name = "Jb", descriptor = "Lqj;")
    private static class196 field2725 = class80.method502("red:", -48);

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "Lqj;")
    public static class196 field2676 = field2725;

    @OriginalMember(owner = "client!ac", name = "ib", descriptor = "Lqj;")
    public static class196 field2698 = field2725;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!ac", name = "Z", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!ac", name = "ab", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ac", name = "eb", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ac", name = "jb", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ac", name = "kb", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ac", name = "mb", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!ac", name = "nb", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ac", name = "rb", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!ac", name = "tb", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!ac", name = "ub", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!ac", name = "xb", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ac", name = "Cb", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ac", name = "Eb", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ac", name = "Gb", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!ac", name = "Hb", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!ac", name = "Ib", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!ac", name = "Kb", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!ac", name = "Nb", descriptor = "I")
    private int field2729;

    @OriginalMember(owner = "client!ac", name = "Ob", descriptor = "I")
    private int field2730;

    @OriginalMember(owner = "client!ac", name = "Qb", descriptor = "J")
    private long field2732;

    @OriginalMember(owner = "client!ac", name = "Rb", descriptor = "J")
    private long field2733;

    @OriginalMember(owner = "client!ac", name = "zb", descriptor = "Z")
    public static boolean field2715;

    @OriginalMember(owner = "client!ac", name = "Mb", descriptor = "Z")
    private boolean field2728;

    @OriginalMember(owner = "client!ac", name = "Lb", descriptor = "[Z")
    public static boolean[] field2727;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BIII)V")
    private final void method1036(byte arg0, int arg1, int arg2, int arg3) {
        field2724++;
        if (arg0 >= -47) {
            method1068(-23);
        }
        class220 var5 = this.field2692[arg1][arg2];
        if (var5 == null) {
            return;
        }
        this.field2692[arg1][arg2] = null;
        if ((this.field2671[arg1] & 0x2) == 0) {
            var5.field3968 = 0;
            return;
        }
        for (class220 var6 = (class220) this.field2731.field4207.method1651((byte) -59); var6 != null; var6 = (class220) this.field2731.field4207.method1656(-103)) {
            if (var5.field3951 == var6.field3951 && var6.field3968 < 0 && var5 != var6) {
                var5.field3968 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)V")
    private final void method1037(int arg0, int arg1, int arg2, int arg3) {
        this.method1036((byte) -86, arg0, arg2, 64);
        field2679++;
        if ((this.field2671[arg0] & 0x2) != 0) {
            for (class220 var5 = (class220) this.field2731.field4207.method1659((byte) 70); var5 != null; var5 = (class220) this.field2731.field4207.method1654((byte) -122)) {
                if (var5.field3951 == arg0 && var5.field3968 < 0) {
                    this.field2692[arg0][var5.field3959] = null;
                    this.field2692[arg0][arg2] = var5;
                    int var6 = (var5.field3958 * var5.field3957 >> 12) + var5.field3972;
                    var5.field3957 = 4096;
                    var5.field3972 += arg2 - var5.field3959 << 8;
                    var5.field3958 = var6 - var5.field3972;
                    var5.field3959 = arg2;
                    return;
                }
            }
        }
        class225 var7 = (class225) this.field2714.method1551(32768, (long) this.field2693[arg0]);
        if (var7 == null) {
            return;
        }
        class89 var8 = var7.field4021[arg2];
        if (var8 == null) {
            return;
        }
        if (arg3 != 65) {
            this.field2712 = null;
        }
        class220 var9 = new class220();
        var9.field3951 = arg0;
        var9.field3950 = var7;
        var9.field3964 = var8;
        var9.field3956 = var7.field4033[arg2];
        var9.field3942 = var7.field4034[arg2];
        var9.field3959 = arg2;
        var9.field3973 = var7.field4022[arg2] * var7.field4025 * arg1 * arg1 + 1024 >> 11;
        var9.field3966 = var7.field4027[arg2] & 0xFF;
        var9.field3972 = (arg2 << 8) - (var7.field4031[arg2] & 0x7FFF);
        var9.field3963 = 0;
        var9.field3968 = -1;
        var9.field3962 = 0;
        var9.field3941 = 0;
        var9.field3952 = 0;
        if (this.field2669[arg0] == 0) {
            var9.field3945 = class239.method1621(var8, this.method1057(var9, (byte) 126), this.method1056(arg3 ^ 0xFFFFFFAF, var9), this.method1043(arg3 - 136, var9));
        } else {
            var9.field3945 = class239.method1621(var8, this.method1057(var9, (byte) 37), 0, this.method1043(-124, var9));
            this.method1066(var7.field4031[arg2] < 0, var9, true);
        }
        if (var7.field4031[arg2] < 0) {
            var9.field3945.method1611(-1);
        }
        if (var9.field3942 >= 0) {
            class220 var10 = this.field2716[arg0][var9.field3942];
            if (var10 != null && var10.field3968 < 0) {
                this.field2692[arg0][var10.field3959] = null;
                var10.field3968 = 0;
            }
            this.field2716[arg0][var9.field3942] = var9;
        }
        this.field2731.field4207.method1652(arg3 ^ 0x67E5, var9);
        this.field2692[arg0][arg2] = var9;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BZLfb;)V")
    public final synchronized void method1038(byte arg0, boolean arg1, class79 arg2) {
        this.method1069(123);
        field2680++;
        this.field2708.method764(arg2.field1144);
        this.field2732 = 0L;
        this.field2728 = arg1;
        if (arg0 != -16) {
            this.method1036((byte) 29, -110, -119, 59);
        }
        int var4 = this.field2708.method761();
        for (int var5 = 0; var5 < var4; var5++) {
            this.field2708.method758(var5);
            this.field2708.method765(var5);
            this.field2708.method769(var5);
        }
        this.field2730 = this.field2708.method763();
        this.field2729 = this.field2708.field1765[this.field2730];
        this.field2733 = this.field2708.method755(this.field2729);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
    public final synchronized void method1039(byte arg0) {
        int var2 = -47 % ((70 - arg0) / 36);
        for (class225 var3 = (class225) this.field2714.method1554(6539); var3 != null; var3 = (class225) this.field2714.method1547(342)) {
            var3.method797((byte) 101);
        }
        field2681++;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
    private final void method1040(int arg0, int arg1) {
        int var3 = 27 % ((-arg0 - 5) / 63);
        field2674++;
        for (class220 var4 = (class220) this.field2731.field4207.method1651((byte) -125); var4 != null; var4 = (class220) this.field2731.field4207.method1656(-23)) {
            if (arg1 < 0 || var4.field3951 == arg1) {
                if (var4.field3945 != null) {
                    var4.field3945.method1614(class216.field3884 / 100);
                    if (var4.field3945.method1600()) {
                        this.field2731.field4220.method697(var4.field3945);
                    }
                    var4.method1503((byte) 4);
                }
                if (var4.field3968 < 0) {
                    this.field2692[var4.field3951][var4.field3959] = null;
                }
                var4.method797((byte) 103);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
    public final synchronized void method1041(byte arg0, int arg1, int arg2) {
        this.method1052((byte) -100, arg2, arg1);
        field2683++;
        if (arg0 != -64) {
            this.method1050(6, -82);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
    private final void method1042(int arg0, int arg1, int arg2) {
        this.field2712[arg0] = arg2;
        field2682++;
        if (arg1 < 64) {
            this.field2669 = null;
        }
        this.field2658[arg0] = (int) (Math.pow(2.0D, (double) arg2 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILwb;)I")
    private final int method1043(int arg0, class220 arg1) {
        int var3 = this.field2685[arg1.field3951];
        if (arg0 >= -58) {
            this.field2721 = null;
        }
        field2691++;
        return var3 < 8192 ? arg1.field3966 * var3 + 32 >> 6 : 16384 - ((128 - arg1.field3966) * (-var3 + 16384) + 32 >> 6);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)V")
    private final void method1044(int arg0, byte arg1, int arg2) {
        field2668++;
        if (this.field2693[arg2] != arg0) {
            this.field2693[arg2] = arg0;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field2716[arg2][var4] = null;
            }
        }
        if (arg1 != -56) {
            field2676 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public final synchronized void method1045(int arg0) {
        class225 var2 = (class225) this.field2714.method1554(6539);
        if (arg0 != 240) {
            this.field2708 = null;
        }
        while (var2 != null) {
            var2.method1524(0);
            var2 = (class225) this.field2714.method1547(342);
        }
        field2684++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lwb;I)Z")
    public final boolean method1046(class220 arg0, int arg1) {
        if (arg1 > -75) {
            return true;
        }
        field2675++;
        if (arg0.field3945 != null) {
            return false;
        }
        if (arg0.field3968 >= 0) {
            arg0.method797((byte) 114);
            if (arg0.field3942 > 0 && this.field2716[arg0.field3951][arg0.field3942] == arg0) {
                this.field2716[arg0.field3951][arg0.field3942] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)Z")
    public final synchronized boolean method1047(byte arg0) {
        field2661++;
        return arg0 >= -116 ? true : this.field2708.method759();
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)V")
    private final void method1048(int arg0, int arg1) {
        field2677++;
        for (class220 var3 = (class220) this.field2731.field4207.method1651((byte) -110); var3 != null; var3 = (class220) this.field2731.field4207.method1656(-76)) {
            if ((arg0 < 0 || var3.field3951 == arg0) && var3.field3968 < 0) {
                this.field2692[var3.field3951][var3.field3959] = null;
                var3.field3968 = 0;
            }
        }
        if (arg1 > -97) {
            this.method1049(-70, 44);
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(II)V")
    private final void method1049(int arg0, int arg1) {
        if ((arg1 & this.field2671[arg0]) != 0) {
            for (class220 var3 = (class220) this.field2731.field4207.method1651((byte) -105); var3 != null; var3 = (class220) this.field2731.field4207.method1656(-48)) {
                if (var3.field3951 == arg0 && this.field2692[arg0][var3.field3959] == null && var3.field3968 < 0) {
                    var3.field3968 = 0;
                }
            }
        }
        field2709++;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(II)V")
    private final void method1050(int arg0, int arg1) {
        field2700++;
        if (arg1 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method1050(-25427, var3);
            }
            return;
        }
        this.field2721[arg1] = 12800;
        this.field2685[arg1] = 8192;
        this.field2711[arg1] = 16383;
        this.field2697[arg1] = 8192;
        this.field2706[arg1] = 0;
        this.field2665[arg1] = 8192;
        this.method1049(arg1, 2);
        this.method1058(arg1, true);
        this.field2671[arg1] = 0;
        this.field2673[arg1] = 32767;
        if (arg0 == -25427) {
            this.field2719[arg1] = 256;
            this.field2669[arg1] = 0;
            this.method1042(arg1, 104, 8192);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)V")
    private final void method1051(int arg0, int arg1, int arg2) {
        field2710++;
        if (arg0 != 0) {
            this.method699();
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(BII)V")
    private final void method1052(byte arg0, int arg1, int arg2) {
        field2694++;
        this.field2670[arg1] = arg2;
        if (arg0 != -100) {
            this.field2730 = 100;
        }
        this.field2704[arg1] = class65.method409(-128, arg2);
        this.method1044(arg2, (byte) -56, arg1);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()Lbe;")
    public final synchronized class117 method699() {
        field2672++;
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    private final void method1053(int arg0) {
        field2703++;
        this.method1040(-112, -1);
        this.method1050(-25427, -1);
        if (arg0 != 43) {
            this.method1059(-102, (byte) 25, null, null, null);
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2693[var2] = this.field2670[var2];
        }
        for (int var3 = 0; var3 < 16; var3++) {
            this.field2704[var3] = class65.method409(-128, this.field2670[var3]);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method1054(int arg0, String arg1, Throwable arg2) {
        field2663++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class111.method670((byte) -8, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace((char) arg0, '_');
            if (class27.field341.field3696 != null) {
                class139 var8 = class27.field341.method1391(new URL(class27.field341.field3696.getCodeBase(), "clienterror.ws?c=" + class237.field4213 + "&u=" + class22.field286 + "&v1=" + class205.field3683 + "&v2=" + class205.field3697 + "&e=" + var7), arg0 - 15621);
                while (var8.field2140 == 0) {
                    class73.method464((byte) 43, 1L);
                }
                if (var8.field2140 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2135;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)V")
    public final synchronized void method1055(int arg0, byte arg1) {
        if (arg1 <= -84) {
            this.field2687 = arg0;
            field2707++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(ILwb;)I")
    private final int method1056(int arg0, class220 arg1) {
        field2689++;
        int var3 = this.field2721[arg1.field3951] * this.field2711[arg1.field3951] + 4096 >> 13;
        class138 var4 = arg1.field3956;
        int var5 = var3 * var3 + 16384 >> 15;
        int var6 = arg1.field3973 * var5 + 16384 >> 15;
        int var7 = this.field2687 * var6 + 128 >> 8;
        if (var4.field2131 > 0) {
            var7 = (int) ((double) var7 * Math.pow(0.5D, (double) arg1.field3952 * 1.953125E-5D * (double) var4.field2131) + 0.5D);
        }
        if (var4.field2125 != null) {
            int var8 = arg1.field3941;
            int var9 = var4.field2125[arg1.field3963 + 1];
            if (arg1.field3963 < var4.field2125.length - 2) {
                int var10 = (var4.field2125[arg1.field3963] & 0xFF) << 8;
                int var11 = (var4.field2125[arg1.field3963 + 2] & 0xFF) << 8;
                var9 += (var8 - var10) * (var4.field2125[arg1.field3963 + 3] - var9) / (var11 - var10);
            }
            var7 = var7 * var9 + 32 >> 6;
        }
        int var12 = 70 / ((arg0 - 48) / 57);
        if (arg1.field3968 > 0 && var4.field2130 != null) {
            int var13 = arg1.field3968;
            int var14 = var4.field2130[arg1.field3962 + 1];
            if (arg1.field3962 < var4.field2130.length - 2) {
                int var15 = (var4.field2130[arg1.field3962] & 0xFF) << 8;
                int var16 = (var4.field2130[arg1.field3962 + 2] & 0xFF) << 8;
                var14 += (var4.field2130[arg1.field3962 + 3] - var14) * (var13 - var15) / (var16 - var15);
            }
            var7 = var7 * var14 + 32 >> 6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public final synchronized void method696(int arg0) {
        field2664++;
        if (this.field2708.method759()) {
            int var2 = this.field2708.field1764 * this.field2705 / class216.field3884;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2732;
                if (this.field2733 - var3 >= 0L) {
                    this.field2732 = var3;
                    break;
                }
                int var5 = (int) ((this.field2733 + (long) var2 - this.field2732 - 1L) / (long) var2);
                this.field2732 += (long) var2 * (long) var5;
                arg0 -= var5;
                this.field2731.method696(var5);
                this.method1061(false);
            } while (this.field2708.method759());
        }
        this.field2731.method696(arg0);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lwb;B)I")
    private final int method1057(class220 arg0, byte arg1) {
        field2726++;
        int var3 = (arg0.field3958 * arg0.field3957 >> 12) + arg0.field3972;
        int var4 = ((this.field2697[arg0.field3951] - 8192) * this.field2719[arg0.field3951] >> 12) + var3;
        class138 var5 = arg0.field3956;
        if (var5.field2117 > 0 && (var5.field2128 > 0 || this.field2706[arg0.field3951] > 0)) {
            int var6 = var5.field2128 << 2;
            int var7 = var5.field2126 << 1;
            if (arg0.field3975 < var7) {
                var6 = arg0.field3975 * var6 / var7;
            }
            int var8 = (this.field2706[arg0.field3951] >> 7) + var6;
            double var9 = Math.sin((double) (arg0.field3946 & 0x1FF) * 0.01227184630308513D);
            var4 += (int) ((double) var8 * var9);
        }
        if (arg1 <= 36) {
            this.method1065((byte) 63, 40, 20);
        }
        int var11 = (int) ((double) (arg0.field3964.field1306 * 256) * Math.pow(2.0D, (double) var4 * 3.255208333333333E-4D) / (double) class216.field3884 + 0.5D);
        return var11 < 1 ? 1 : var11;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
    private final void method1058(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field2659++;
        if ((this.field2671[arg0] & 0x4) == 0) {
            return;
        }
        for (class220 var3 = (class220) this.field2731.field4207.method1651((byte) -46); var3 != null; var3 = (class220) this.field2731.field4207.method1656(-33)) {
            if (var3.field3951 == arg0) {
                var3.field3953 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLfb;Lbk;Lhc;)Z")
    public final synchronized boolean method1059(int arg0, byte arg1, class79 arg2, class136 arg3, class173 arg4) {
        boolean var6 = true;
        int[] var7 = null;
        field2699++;
        arg2.method495();
        if (arg0 > 0) {
            var7 = new int[] { arg0 };
        }
        class210 var8 = (class210) arg2.field1145.method1554(6539);
        if (arg1 != 34) {
            this.method1056(-33, null);
        }
        while (var8 != null) {
            label30: {
                int var9 = (int) var8.field1850;
                class225 var10 = (class225) this.field2714.method1551(arg1 + 32734, (long) var9);
                if (var10 == null) {
                    var10 = class230.method1542(var9, true, arg3);
                    if (var10 == null) {
                        var6 = false;
                        break label30;
                    }
                    this.field2714.method1552(var10, (long) var9, 0);
                }
                if (!var10.method1523(var7, arg4, arg1 ^ 0x23, var8.field3782)) {
                    var6 = false;
                }
            }
            var8 = (class210) arg2.field1145.method1547(342);
        }
        if (var6) {
            arg2.method494();
        }
        return var6;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([III)V")
    public final synchronized void method688(int[] arg0, int arg1, int arg2) {
        if (this.field2708.method759()) {
            int var4 = this.field2708.field1764 * this.field2705 / class216.field3884;
            do {
                long var5 = this.field2732 + (long) arg2 * (long) var4;
                if (this.field2733 - var5 >= 0L) {
                    this.field2732 = var5;
                    break;
                }
                int var7 = (int) ((this.field2733 + (long) var4 - this.field2732 - 1L) / (long) var4);
                this.field2732 += (long) var4 * (long) var7;
                this.field2731.method688(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method1061(false);
            } while (this.field2708.method759());
        }
        this.field2731.method688(arg0, arg1, arg2);
        field2718++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)I")
    public final int method1060(boolean arg0) {
        field2660++;
        if (arg0) {
            this.method1047((byte) 21);
        }
        return this.field2687;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
    private final void method1061(boolean arg0) {
        if (arg0) {
            this.field2712 = null;
        }
        int var2 = this.field2730;
        int var3 = this.field2729;
        field2722++;
        long var4 = this.field2733;
        while (this.field2729 == var3) {
            while (this.field2708.field1765[var2] == var3) {
                this.field2708.method758(var2);
                int var6 = this.field2708.method766(var2);
                if (var6 == 1) {
                    this.field2708.method760();
                    this.field2708.method769(var2);
                    if (this.field2708.method762()) {
                        if (!this.field2728 || var3 == 0) {
                            this.method1053(43);
                            this.field2708.method770();
                            return;
                        }
                        this.field2708.method767(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method1062(var6, 67);
                }
                this.field2708.method765(var2);
                this.field2708.method769(var2);
            }
            var2 = this.field2708.method763();
            var3 = this.field2708.field1765[var2];
            var4 = this.field2708.method755(var3);
        }
        this.field2733 = var4;
        this.field2730 = var2;
        this.field2729 = var3;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()Lbe;")
    public final synchronized class117 method695() {
        field2678++;
        return this.field2731;
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(II)V")
    private final void method1062(int arg0, int arg1) {
        field2723++;
        int var3 = arg0 & 0xF0;
        if (var3 == 128) {
            int var4 = arg0 & 0xF;
            int var5 = arg0 >> 16 & 0x7F;
            int var6 = arg0 >> 8 & 0x7F;
            this.method1036((byte) -62, var4, var6, var5);
        } else if (var3 == 144) {
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 & 0xF;
            int var9 = arg0 >> 16 & 0x7F;
            if (var9 <= 0) {
                this.method1036((byte) -114, var8, var7, 64);
            } else {
                this.method1037(var8, var9, var7, 65);
            }
        } else if (var3 == 160) {
            int var10 = arg0 & 0xF;
            int var11 = arg0 >> 8 & 0x7F;
            int var12 = arg0 >> 16 & 0x7F;
            this.method1067(var10, var11, var12, 0);
        } else if (var3 == 176) {
            int var13 = arg0 & 0xF;
            int var14 = arg0 >> 16 & 0x7F;
            int var15 = arg0 >> 8 & 0x7F;
            if (var15 == 0) {
                this.field2704[var13] = (var14 << 14) + class65.method409(-2080769, this.field2704[var13]);
            }
            if (var15 == 32) {
                this.field2704[var13] = (var14 << 7) + class65.method409(-16257, this.field2704[var13]);
            }
            if (var15 == 1) {
                this.field2706[var13] = (var14 << 7) + class65.method409(this.field2706[var13], -16257);
            }
            if (var15 == 33) {
                this.field2706[var13] = var14 + class65.method409(-128, this.field2706[var13]);
            }
            if (var15 == 5) {
                this.field2665[var13] = class65.method409(-16257, this.field2665[var13]) + (var14 << 7);
            }
            if (var15 == 37) {
                this.field2665[var13] = class65.method409(-128, this.field2665[var13]) + var14;
            }
            if (var15 == 7) {
                this.field2721[var13] = (var14 << 7) + class65.method409(this.field2721[var13], -16257);
            }
            if (var15 == 39) {
                this.field2721[var13] = var14 + class65.method409(this.field2721[var13], -128);
            }
            if (var15 == 10) {
                this.field2685[var13] = class65.method409(this.field2685[var13], -16257) + (var14 << 7);
            }
            if (var15 == 42) {
                this.field2685[var13] = var14 + class65.method409(this.field2685[var13], -128);
            }
            if (var15 == 11) {
                this.field2711[var13] = class65.method409(-16257, this.field2711[var13]) + (var14 << 7);
            }
            if (var15 == 43) {
                this.field2711[var13] = class65.method409(-128, this.field2711[var13]) + var14;
            }
            if (var15 == 64) {
                if (var14 < 64) {
                    this.field2671[var13] = class65.method409(this.field2671[var13], -2);
                } else {
                    this.field2671[var13] = class1.method6(this.field2671[var13], 1);
                }
            }
            if (var15 == 65) {
                if (var14 >= 64) {
                    this.field2671[var13] = class1.method6(this.field2671[var13], 2);
                } else {
                    this.method1049(var13, 2);
                    this.field2671[var13] = class65.method409(this.field2671[var13], -3);
                }
            }
            if (var15 == 99) {
                this.field2673[var13] = (var14 << 7) + class65.method409(this.field2673[var13], 127);
            }
            if (var15 == 98) {
                this.field2673[var13] = class65.method409(16256, this.field2673[var13]) + var14;
            }
            if (var15 == 101) {
                this.field2673[var13] = class65.method409(this.field2673[var13], 127) + (var14 << 7) + 16384;
            }
            if (var15 == 100) {
                this.field2673[var13] = class65.method409(this.field2673[var13], 16256) + var14 + 16384;
            }
            if (var15 == 120) {
                this.method1040(123, var13);
            }
            if (var15 == 121) {
                this.method1050(-25427, var13);
            }
            if (var15 == 123) {
                this.method1048(var13, -102);
            }
            if (var15 == 6) {
                int var16 = this.field2673[var13];
                if (var16 == 16384) {
                    this.field2719[var13] = class65.method409(this.field2719[var13], -16257) + (var14 << 7);
                }
            }
            if (var15 == 38) {
                int var17 = this.field2673[var13];
                if (var17 == 16384) {
                    this.field2719[var13] = class65.method409(this.field2719[var13], -128) + var14;
                }
            }
            if (var15 == 16) {
                this.field2669[var13] = class65.method409(this.field2669[var13], -16257) + (var14 << 7);
            }
            if (var15 == 48) {
                this.field2669[var13] = class65.method409(-128, this.field2669[var13]) + var14;
            }
            if (var15 == 81) {
                if (var14 >= 64) {
                    this.field2671[var13] = class1.method6(this.field2671[var13], 4);
                } else {
                    this.method1058(var13, true);
                    this.field2671[var13] = class65.method409(this.field2671[var13], -5);
                }
            }
            if (var15 == 17) {
                this.method1042(var13, 104, (var14 << 7) + (this.field2712[var13] & 0xFFFFC07F));
            }
            if (var15 == 49) {
                this.method1042(var13, 75, (this.field2712[var13] & 0xFFFFFF80) + var14);
            }
        } else if (var3 == 192) {
            int var18 = arg0 & 0xF;
            int var19 = arg0 >> 8 & 0x7F;
            this.method1044(this.field2704[var18] + var19, (byte) -56, var18);
        } else if (var3 == 208) {
            int var20 = arg0 & 0xF;
            int var21 = arg0 >> 8 & 0x7F;
            this.method1051(0, var20, var21);
        } else if (var3 == 224) {
            int var22 = arg0 & 0xF;
            int var23 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method1065((byte) 7, var23, var22);
        } else {
            if (arg1 < 25) {
                this.method699();
            }
            int var24 = arg0 & 0xFF;
            if (var24 == 255) {
                this.method1053(43);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()I")
    public final synchronized int method689() {
        field2667++;
        return 0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lwb;[IIBI)Z")
    public final boolean method1063(class220 arg0, int[] arg1, int arg2, byte arg3, int arg4) {
        field2720++;
        arg0.field3969 = class216.field3884 / 100;
        if (arg0.field3968 >= 0 && (arg0.field3945 == null || arg0.field3945.method1635())) {
            arg0.method1503((byte) 4);
            arg0.method797((byte) 122);
            if (arg0.field3942 > 0 && this.field2716[arg0.field3951][arg0.field3942] == arg0) {
                this.field2716[arg0.field3951][arg0.field3942] = null;
            }
            return true;
        }
        boolean var6 = false;
        int var7 = arg0.field3957;
        if (var7 > 0) {
            int var8 = var7 - (int) (Math.pow(2.0D, (double) this.field2665[arg0.field3951] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var8 < 0) {
                var8 = 0;
            }
            arg0.field3957 = var8;
        }
        arg0.field3945.method1627(this.method1057(arg0, (byte) 113));
        int var9 = -123 % ((arg3 + 21) / 59);
        class138 var10 = arg0.field3956;
        arg0.field3946 += var10.field2117;
        double var11 = (double) ((arg0.field3959 - 60 << 8) + (arg0.field3958 * arg0.field3957 >> 12)) * 5.086263020833333E-6D;
        arg0.field3975++;
        if (var10.field2131 > 0) {
            if (var10.field2129 <= 0) {
                arg0.field3952 += 128;
            } else {
                arg0.field3952 += (int) (Math.pow(2.0D, (double) var10.field2129 * var11) * 128.0D + 0.5D);
            }
            if (arg0.field3952 * var10.field2131 >= 819200) {
                var6 = true;
            }
        }
        if (var10.field2125 != null) {
            if (var10.field2133 > 0) {
                arg0.field3941 += (int) (Math.pow(2.0D, (double) var10.field2133 * var11) * 128.0D + 0.5D);
            } else {
                arg0.field3941 += 128;
            }
            while (var10.field2125.length - 2 > arg0.field3963 && (var10.field2125[arg0.field3963 + 2] & 0xFF) << 8 < arg0.field3941) {
                arg0.field3963 += 2;
            }
            if (var10.field2125.length - 2 == arg0.field3963 && var10.field2125[arg0.field3963 + 1] == 0) {
                var6 = true;
            }
        }
        if (arg0.field3968 >= 0 && var10.field2130 != null && (this.field2671[arg0.field3951] & 0x1) == 0 && (arg0.field3942 < 0 || this.field2716[arg0.field3951][arg0.field3942] != arg0)) {
            if (var10.field2121 > 0) {
                arg0.field3968 += (int) (Math.pow(2.0D, (double) var10.field2121 * var11) * 128.0D + 0.5D);
            } else {
                arg0.field3968 += 128;
            }
            while (var10.field2130.length - 2 > arg0.field3962 && arg0.field3968 > (var10.field2130[arg0.field3962 + 2] & 0xFF) << 8) {
                arg0.field3962 += 2;
            }
            if (var10.field2130.length - 2 == arg0.field3962) {
                var6 = true;
            }
        }
        if (!var6) {
            arg0.field3945.method1612(arg0.field3969, this.method1056(-11, arg0), this.method1043(-90, arg0));
            return false;
        }
        arg0.field3945.method1614(arg0.field3969);
        if (arg1 == null) {
            arg0.field3945.method696(arg4);
        } else {
            arg0.field3945.method688(arg1, arg2, arg4);
        }
        if (arg0.field3945.method1600()) {
            this.field2731.field4220.method697(arg0.field3945);
        }
        arg0.method1503((byte) 4);
        if (arg0.field3968 >= 0) {
            arg0.method797((byte) 107);
            if (arg0.field3942 > 0 && this.field2716[arg0.field3951][arg0.field3942] == arg0) {
                this.field2716[arg0.field3951][arg0.field3942] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IZ)V")
    public static final void method1064(int arg0, boolean arg1) {
        field2662++;
        class72 var2 = (class72) class62.field852.method1651((byte) -35);
        if (arg0 != 16) {
            field2676 = null;
        }
        while (var2 != null) {
            if (var2.field1019 != null) {
                class161.field2589.method690(var2.field1019);
                var2.field1019 = null;
            }
            if (var2.field1017 != null) {
                class161.field2589.method690(var2.field1017);
                var2.field1017 = null;
            }
            var2.method797((byte) 109);
            var2 = (class72) class62.field852.method1656(-55);
        }
        if (!arg1) {
            return;
        }
        for (class72 var3 = (class72) class223.field3995.method1651((byte) -116); var3 != null; var3 = (class72) class223.field3995.method1656(-4)) {
            if (var3.field1019 != null) {
                class161.field2589.method690(var3.field1019);
                var3.field1019 = null;
            }
            var3.method797((byte) 104);
        }
        for (class72 var4 = (class72) class35.field423.method1554(arg0 + 6523); var4 != null; var4 = (class72) class35.field423.method1547(342)) {
            if (var4.field1019 != null) {
                class161.field2589.method690(var4.field1019);
                var4.field1019 = null;
            }
            var4.method797((byte) 114);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(BII)V")
    private final void method1065(byte arg0, int arg1, int arg2) {
        if (arg0 != 7) {
            this.method1041((byte) 86, 23, 16);
        }
        field2666++;
        this.field2697[arg2] = arg1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLwb;Z)V")
    public final void method1066(boolean arg0, class220 arg1, boolean arg2) {
        field2690++;
        int var4 = arg1.field3964.field1305.length;
        int var7;
        if (arg0 && arg1.field3964.field1303) {
            int var5 = var4 + var4 - arg1.field3964.field1304;
            int var6 = var4 << 8;
            var7 = (int) ((long) this.field2669[arg1.field3951] * (long) var5 >> 6);
            if (var6 <= var7) {
                arg1.field3945.method1617(true);
                var7 = var6 + var6 - var7 - 1;
            }
        } else {
            var7 = (int) ((long) this.field2669[arg1.field3951] * (long) var4 >> 6);
        }
        arg1.field3945.method1623(var7);
        if (!arg2) {
            this.field2708 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIII)V")
    private final void method1067(int arg0, int arg1, int arg2, int arg3) {
        field2702++;
        if (arg3 != 0) {
            method1054(3, null, null);
        }
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
    public static void method1068(int arg0) {
        field2695 = null;
        field2725 = null;
        field2701 = null;
        field2727 = null;
        field2688 = null;
        field2676 = null;
        field2698 = null;
        field2717 = null;
        if (arg0 != 20688) {
            method1064(101, true);
        }
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
    public final synchronized void method1069(int arg0) {
        this.field2708.method770();
        field2713++;
        if (arg0 != 123) {
            this.field2665 = null;
        }
        this.method1053(arg0 ^ 0x50);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class165() {
        this.method1053(43);
    }
}
