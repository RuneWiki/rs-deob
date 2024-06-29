import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class160 extends class175 {

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    private int field2769 = 0;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    private int field2788 = 0;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    private int field2794 = 0;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    private int field2798 = -1;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    private int field2799 = -1;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "Z")
    private boolean field2776 = true;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    private int field2785 = -32768;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "Lti;")
    private class186 field2800 = null;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "Z")
    private boolean field2792 = false;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    private int field2803;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    private int field2782;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    private int field2773;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    private int field2796;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    private int field2775;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    private int field2801;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Lkl;")
    private class35 field2770;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    private int field2772;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    private int field2777;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "[Z")
    public static boolean[] field2780 = new boolean[200];

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "[J")
    public static long[] field2783 = new long[1000];

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Lhi;")
    public static class82 field2778 = class95.method664((byte) -32, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "Lhi;")
    public static class82 field2805 = class95.method664((byte) -105, "null");

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "Lhi;")
    public static class82 field2804 = class95.method664((byte) -55, "ondulation2:");

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "Lab;")
    private class295 field2784;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "[Ljf;")
    public static class86[] field2802;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "[[I")
    public static int[][] field2793;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Z", line = 7)
    public static final boolean method1155(int arg0, int arg1) {
        field2806++;
        if (arg1 < 123) {
            return true;
        } else {
            return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Lrm;", line = 26)
    private final class175 method1156(boolean arg0) {
        field2771++;
        if (!arg0) {
            this.field2800 = (class186) null;
        }
        return this.method1160(false, -1);
    }

    @OriginalMember(owner = "client!oj", name = "finalize", descriptor = "()V", line = 37)
    protected final void finalize() {
        field2808++;
        if (this.field2784 != null) {
            this.field2784.method2025();
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(III)V", line = 50)
    private final void method1157(int arg0, int arg1, int arg2) {
        if (arg1 != 1000) {
            return;
        }
        if (this.field2770 != null) {
            int var4 = class212.field3708 - this.field2772;
            if (var4 > 100 && this.field2770.field541 > 0) {
                int var5 = this.field2770.field547.length - this.field2770.field541;
                while (this.field2777 < var5 && var4 > this.field2770.field539[this.field2777]) {
                    var4 -= this.field2770.field539[this.field2777];
                    this.field2777++;
                }
                if (this.field2777 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2770.field547.length; var7++) {
                        var6 += this.field2770.field539[var7];
                    }
                    var4 %= var6;
                }
            }
            label63: {
                do {
                    do {
                        if (this.field2770.field539[this.field2777] >= var4) {
                            break label63;
                        }
                        class205.method1474(this.field2770, false, this.field2777, arg0, arg2, (byte) -90);
                        var4 -= this.field2770.field539[this.field2777];
                        this.field2777++;
                    } while (this.field2777 < this.field2770.field547.length);
                    this.field2777 -= this.field2770.field541;
                } while (this.field2777 >= 0 && this.field2777 < this.field2770.field547.length);
                this.field2770 = null;
            }
            this.field2772 = class212.field3708 - var4;
        }
        field2781++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 115)
    public static void method1158(byte arg0) {
        field2793 = (int[][]) null;
        field2783 = null;
        field2804 = null;
        if (arg0 > -11) {
            method1163(-111, -3, -34);
        }
        field2805 = null;
        field2802 = null;
        field2780 = null;
        field2778 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIIIIZLrm;)V", line = 831)
    public class160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class175 arg8) {
        this.field2803 = arg5;
        this.field2782 = arg2;
        this.field2773 = arg0;
        this.field2796 = arg3;
        this.field2775 = arg1;
        this.field2801 = arg4;
        if (class147.field2485 && arg8 != null) {
            if (arg8 instanceof class160) {
                ((class160) arg8).method1159(-1);
            } else {
                class157 var10 = class99.method682(this.field2773, (byte) -87);
                if (var10.field2688 != null) {
                    var10 = var10.method1119((byte) 125);
                }
                if (var10 != null) {
                    class232.method1642(this.field2796, 0, 120, this.field2801, this.field2803, this.field2782, 0, this.field2775, var10);
                }
            }
        }
        if (arg6 != -1) {
            this.field2770 = class284.method1973(arg6, false);
            this.field2772 = class212.field3708 - 1;
            this.field2777 = 0;
            if (this.field2770.field566 == 0 && arg8 != null && arg8 instanceof class160) {
                class160 var11 = (class160) arg8;
                if (this.field2770 == var11.field2770) {
                    this.field2777 = var11.field2777;
                    this.field2772 = var11.field2772;
                    return;
                }
            }
            if (arg7 && this.field2770.field541 != -1) {
                this.field2777 = (int) (Math.random() * (double) this.field2770.field547.length);
                this.field2772 -= (int) ((double) this.field2770.field539[this.field2777] * Math.random());
            }
        }
        if (class147.field2485 && arg8 != null) {
            this.method1160(true, -1);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "()I", line = 150)
    public final int method238() {
        field2774++;
        return this.field2785;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 166)
    public final void method1159(int arg0) {
        if (this.field2800 != null) {
            class248.method1785(this.field2800, this.field2794, this.field2769, this.field2788);
        }
        this.field2800 = null;
        this.field2798 = -1;
        field2787++;
        this.field2799 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)V", line = 179)
    public final void method301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2797++;
        class175 var6 = null;
        if (class147.field2485) {
            var6 = this.method1160(true, -1);
        } else {
            this.method1157(arg3, 1000, arg4);
        }
        if (!this.field2792) {
            if (var6 == null) {
                var6 = this.method1156(true);
            }
            if (var6 == null) {
                return;
            }
            this.method1164(var6, -14769);
        }
        if (this.field2784 != null) {
            this.field2784.method2034(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)Lrm;", line = 230)
    private final class175 method1160(boolean arg0, int arg1) {
        field2791++;
        boolean var3 = class245.field4255 != class180.field3073;
        class157 var4 = class99.method682(this.field2773, (byte) -95);
        if (var4.field2688 != null) {
            var4 = var4.method1119((byte) 120);
        }
        if (var4 == null) {
            if (class147.field2485 && !var3) {
                this.method1159(-1);
            }
            return null;
        }
        int var5 = this.field2782 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field2704;
            var6 = var4.field2725;
        } else {
            var6 = var4.field2704;
            var7 = var4.field2725;
        }
        int var8 = this.field2801 + (var6 >> 1);
        int var9 = this.field2803 + (var7 >> 1);
        int var10 = this.field2803 + (var7 - arg1 >> 1);
        int var11 = (var6 + 1 >> 1) + this.field2801;
        this.method1157(var8 * 128, 1000, var9 * 128);
        boolean var12 = !var3 && var4.field2683 && (this.field2799 != var4.field2676 || this.field2798 != this.field2777 && class33.field504 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class245.field4255[this.field2796];
        int var14 = (this.field2801 << 7) + (var6 << 6);
        int var15 = (this.field2803 << 7) + (var7 << 6);
        int var16 = var13[var8][var9] + var13[var11][var9] + var13[var8][var10] + var13[var11][var10] >> 2;
        int[][] var17 = (int[][]) null;
        if (var3) {
            var17 = class180.field3073[0];
        } else if (this.field2796 < 3) {
            var17 = class245.field4255[this.field2796 + 1];
        }
        if (class147.field2485 && var12) {
            class248.method1785(this.field2800, this.field2794, this.field2769, this.field2788);
        }
        boolean var18 = this.field2800 == null;
        class22 var19;
        if (this.field2770 == null) {
            var19 = var4.method1118(this.field2775, var12, var18 ? class280.field4698 : this.field2800, var16, false, this.field2782, var15, var17, var14, var13, (byte) -94);
        } else {
            var19 = var4.method1132(var18 ? class280.field4698 : this.field2800, var12, this.field2775, var16, var15, var13, this.field2777, -24294, var17, var14, this.field2782, this.field2770);
        }
        if (var19 == null) {
            return null;
        }
        if (class147.field2485 && var12) {
            if (var18) {
                class280.field4698 = var19.field299;
            }
            int var20 = 0;
            if (this.field2796 != 0) {
                int[][] var21 = class245.field4255[0];
                var20 = var16 - (var21[var8][var9] + var21[var11][var10] + var21[var11][var9] + var21[var8][var10] >> 2);
            }
            class186 var22 = var19.field299;
            if (this.field2776 && class248.method1782(var22, var14, var20, var15)) {
                this.field2776 = false;
            }
            if (!this.field2776) {
                class248.method1784(var22, var14, var20, var15);
                this.field2769 = var20;
                this.field2800 = var22;
                if (var18) {
                    class280.field4698 = null;
                }
                this.field2788 = var15;
                this.field2794 = var14;
            }
            this.field2798 = this.field2777;
            this.field2799 = var4.field2676;
        }
        return var19.field298;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 358)
    public static final void method1161(int arg0) {
        if (arg0 != 24909) {
            field2780 = (boolean[]) null;
        }
        boolean var1 = false;
        field2790++;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class309.field5262 - 1; var2++) {
                if (class135.field2333[var2] < 1000 && class135.field2333[var2 + 1] > 1000) {
                    var1 = false;
                    class82 var3 = class157.field2727[var2];
                    class157.field2727[var2] = class157.field2727[var2 + 1];
                    class157.field2727[var2 + 1] = var3;
                    class82 var4 = class327.field5589[var2];
                    class327.field5589[var2] = class327.field5589[var2 + 1];
                    class327.field5589[var2 + 1] = var4;
                    int var5 = class262.field4486[var2];
                    class262.field4486[var2] = class262.field4486[var2 + 1];
                    class262.field4486[var2 + 1] = var5;
                    int var6 = class28.field375[var2];
                    class28.field375[var2] = class28.field375[var2 + 1];
                    class28.field375[var2 + 1] = var6;
                    short var7 = class135.field2333[var2];
                    class135.field2333[var2] = class135.field2333[var2 + 1];
                    class135.field2333[var2 + 1] = var7;
                    long var8 = class40.field694[var2];
                    class40.field694[var2] = class40.field694[var2 + 1];
                    class40.field694[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lhi;I)V", line = 411)
    public static final void method1162(class82 arg0, int arg1) {
        field2807++;
        int var2 = -128 % ((14 - arg1) / 59);
        if (class323.field5545 >= 2) {
            if (arg0.method543(class306.field5218, (byte) 68)) {
                class182.method1267((byte) 127);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class200.method1406((class82) null, 0, class29.method182(-6039, new class82[] { class75.field1248, class327.method2240((byte) -74, var5), class300.field5119 }), 4);
            }
            if (class147.field2485 && arg0.method543(class217.field3776, (byte) -98)) {
                System.out.println("oncard_geometry:" + class6.field46);
                System.out.println("oncard_2d:" + class6.field48);
                System.out.println("oncard_texture:" + class6.field50);
            }
            if (arg0.method543(class297.field5053, (byte) -101)) {
                class171.method1207(-120);
            }
            if (arg0.method543(class316.field5430, (byte) 114)) {
                class244.field4238.method1376((byte) -36);
            }
            if (arg0.method543(class277.field4659, (byte) 103)) {
                class244.field4238.method1367(true);
            }
            if (arg0.method543(class227.field3924, (byte) 115)) {
                class55.field881.method812(5000);
                class66.field1036.method2090(83);
                class244.field4238.method1364(25405);
            }
            if (arg0.method543(class37.field609, (byte) 124)) {
                class144.field2454 = true;
            }
            if (arg0.method543(class54.field859, (byte) -104)) {
                class292.method2014(28, 25);
            }
            if (arg0.method543(class21.field285, (byte) -63)) {
                class52.field841 = true;
            }
            if (arg0.method543(class307.field5227, (byte) 61)) {
                class52.field841 = false;
            }
            if (arg0.method543(class202.field3463, (byte) -55)) {
                class129.method898(false, (byte) 112, -1, -1, 0);
            }
            if (arg0.method543(class143.field2437, (byte) 126)) {
                class129.method898(false, (byte) 74, -1, -1, 1);
            }
            if (arg0.method543(class28.field365, (byte) 126)) {
                class129.method898(false, (byte) 103, -1, -1, 2);
            }
            if (arg0.method543(class168.field2926, (byte) 101)) {
                class129.method898(false, (byte) 108, 1024, 768, 3);
            }
            if (arg0.method543(class215.field3755, (byte) -95)) {
                for (int var6 = 0; var6 < 4; var6++) {
                    for (int var7 = 1; var7 < 103; var7++) {
                        for (int var8 = 1; var8 < 103; var8++) {
                            class180.field3071[var6].field3159[var7][var8] = 0;
                        }
                    }
                }
            }
            if (arg0.method541(class277.field4655, 0) && class91.field1640 != 0) {
                class328.method2249(0, arg0.method558((byte) -66, 6).method540((byte) -114));
            }
            if (arg0.method543(class42.field733, (byte) -67) && class91.field1640 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method541(class331.field5641, 0)) {
                class207.field3620 = arg0.method558((byte) -66, 12).method550(-1).method540((byte) -114);
                class200.method1406((class82) null, 0, class29.method182(-6039, new class82[] { class23.field313, class327.method2240((byte) -74, class207.field3620) }), 4);
            }
            if (arg0.method543(class244.field4231, (byte) -53)) {
                class182.field3114 = true;
            }
        }
        class61.field957.method1504(144, -1);
        class61.field957.method1075(arg0.method535(true) - 1, -1);
        class323.field5556++;
        class61.field957.method1098((byte) 56, arg0.method558((byte) -66, 2));
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(III)Z", line = 571)
    public static final boolean method1163(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class312.field5328; var3++) {
            class60 var4 = class286.field4811[var3];
            if (var4.field935 == 1) {
                int var5 = var4.field932 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field930 * var5 >> 8) + var4.field942;
                    int var7 = (var4.field936 * var5 >> 8) + var4.field939;
                    int var8 = (var4.field934 * var5 >> 8) + var4.field937;
                    int var9 = (var4.field944 * var5 >> 8) + var4.field922;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field935 == 2) {
                int var10 = arg0 - var4.field932;
                if (var10 > 0) {
                    int var11 = (var4.field930 * var10 >> 8) + var4.field942;
                    int var12 = (var4.field936 * var10 >> 8) + var4.field939;
                    int var13 = (var4.field934 * var10 >> 8) + var4.field937;
                    int var14 = (var4.field944 * var10 >> 8) + var4.field922;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field935 == 3) {
                int var15 = var4.field942 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field928 * var15 >> 8) + var4.field932;
                    int var17 = (var4.field926 * var15 >> 8) + var4.field924;
                    int var18 = (var4.field934 * var15 >> 8) + var4.field937;
                    int var19 = (var4.field944 * var15 >> 8) + var4.field922;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field935 == 4) {
                int var20 = arg2 - var4.field942;
                if (var20 > 0) {
                    int var21 = (var4.field928 * var20 >> 8) + var4.field932;
                    int var22 = (var4.field926 * var20 >> 8) + var4.field924;
                    int var23 = (var4.field934 * var20 >> 8) + var4.field937;
                    int var24 = (var4.field944 * var20 >> 8) + var4.field922;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field935 == 5) {
                int var25 = arg1 - var4.field937;
                if (var25 > 0) {
                    int var26 = (var4.field928 * var25 >> 8) + var4.field932;
                    int var27 = (var4.field926 * var25 >> 8) + var4.field924;
                    int var28 = (var4.field930 * var25 >> 8) + var4.field942;
                    int var29 = (var4.field936 * var25 >> 8) + var4.field939;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIIIJILab;)V", line = 693)
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class295 arg10) {
        field2789++;
        class175 var13 = this.method1156(true);
        if (var13 != null) {
            this.method1164(var13, -14769);
            var13.method209(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2784);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lrm;I)V", line = 714)
    private final void method1164(class175 arg0, int arg1) {
        field2768++;
        if (class147.field2485) {
            class30 var5 = (class30) arg0;
            if ((this.field2784 == null || this.field2784.field4943) && (var5.field408 != null || var5.field436 != null)) {
                class157 var6 = class99.method682(this.field2773, (byte) -118);
                if (var6.field2688 != null) {
                    var6 = var6.method1119((byte) 122);
                }
                if (var6 != null) {
                    this.field2784 = new class295(class212.field3708, var6.field2704, var6.field2725);
                }
            }
            if (this.field2784 != null) {
                this.field2784.method2029(var5.field408, var5.field436, false, var5.field427, var5.field422, var5.field418);
            }
        } else {
            class318 var3 = (class318) arg0;
            if ((this.field2784 == null || this.field2784.field4943) && (var3.field5461 != null || var3.field5460 != null)) {
                class157 var4 = class99.method682(this.field2773, (byte) -93);
                if (var4.field2688 != null) {
                    var4 = var4.method1119((byte) 120);
                }
                if (var4 != null) {
                    this.field2784 = new class295(class212.field3708, var4.field2704, var4.field2725);
                }
            }
            if (this.field2784 != null) {
                this.field2784.method2029(var3.field5461, var3.field5460, false, var3.field5454, var3.field5474, var3.field5452);
            }
        }
        if (arg1 != -14769) {
            this.field2792 = true;
        }
        this.field2792 = true;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIIIII)V", line = 785)
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class200.field3443 <= arg9 && arg9 <= class207.field3623 && class200.field3443 <= arg2 && arg2 <= class207.field3623 && class200.field3443 <= arg1 && class207.field3623 >= arg1 && arg3 >= class200.field3443 && arg3 <= class207.field3623 && arg5 >= class60.field931 && arg5 <= class29.field399 && arg4 >= class60.field931 && class29.field399 >= arg4 && class60.field931 <= arg7 && arg7 <= class29.field399 && class60.field931 <= arg0 && arg0 <= class29.field399) {
            class212.method1523(arg4, arg9, arg7, arg2, arg3, -124, arg5, arg0, arg1, arg6);
        } else {
            class25.method163(arg0, arg5, arg9, arg6, arg4, arg7, arg1, 3, arg2, arg3);
        }
        if (arg8 >= -71) {
            method1155(-116, -93);
        }
        field2795++;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V", line = 815)
    public static final void method1166(int arg0) {
        class306.field5205.method2168(0);
        if (arg0 != 8) {
            field2780 = (boolean[]) null;
        }
        field2779++;
        class42.field738.method2168(0);
        class189.field3166.method2168(arg0 - 8);
    }
}
