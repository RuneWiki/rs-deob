import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class173 {

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Z")
    private boolean field2673 = false;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    private int field2681 = 32;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "J")
    private long field2698 = class267.method1841((byte) 109);

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    private int field2703 = 0;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    private int field2700 = 0;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "J")
    private long field2701 = 0L;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "[Lgg;")
    private class206[] field2704 = new class206[8];

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    private int field2702 = 0;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "Z")
    private boolean field2709 = true;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "J")
    private long field2705 = 0L;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    private int field2708 = 0;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "[Lgg;")
    private class206[] field2707 = new class206[8];

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Laf;")
    public static class70 field2677 = class101.method662((byte) 94);

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field2687 = 0;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field2696 = new String[100];

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public int field2706;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public int field2710;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    private int field2711;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lgg;")
    private class206 field2672;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "Lfa;")
    public static class273 field2691;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "[I")
    public static int[] field2688;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "[I")
    public int[] field2695;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "[Lh;")
    public static class294[] field2689;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static final void method1151(byte arg0) {
        field2684++;
        if (!class70.field1017) {
            return;
        }
        int var1 = 121 / ((arg0 + 37) / 33);
        class254 var2 = class79.method529(class84.field1334, 30, class268.field4398);
        if (var2 != null && var2.field4141 != null) {
            class298 var3 = new class298();
            var3.field4905 = var2.field4141;
            var3.field4906 = var2;
            class126.method844(200000, var3);
        }
        class70.field1017 = false;
        class276.field4574 = -1;
        class58.method354(true, var2);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
    public final void method1152(byte arg0) {
        field2686++;
        if (arg0 == -17) {
            this.field2709 = true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([II)V")
    private final void method1153(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class287.field4787) {
            var3 = arg1 << 1;
        }
        class158.method1046(arg0, 0, var3);
        this.field2708 -= arg1;
        if (this.field2672 != null && this.field2708 <= 0) {
            this.field2708 += class131.field2018 >> 4;
            class280.method1950(this.field2672, true);
            this.method1157(-256, this.field2672, this.field2672.method1264());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class206 var10 = null;
                        class206 var11 = this.field2704[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class133 var12 = var11.field3305;
                                if (var12 == null || var12.field2097 <= var8) {
                                    var11.field3306 = true;
                                    int var13 = var11.method589();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2097 += var13;
                                    }
                                    if (var4 >= this.field2681) {
                                        break label107;
                                    }
                                    class206 var14 = var11.method596();
                                    if (var14 != null) {
                                        int var15 = var11.field3304;
                                        while (var14 != null) {
                                            this.method1157(-256, var14, var15 * var14.method1264() >> 8);
                                            var14 = var11.method587();
                                        }
                                    }
                                    class206 var16 = var11.field3303;
                                    var11.field3303 = null;
                                    if (var10 == null) {
                                        this.field2704[var7] = var16;
                                    } else {
                                        var10.field3303 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2707[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3303;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class206 var18 = this.field2704[var17];
                this.field2704[var17] = this.field2707[var17] = null;
                while (var18 != null) {
                    class206 var19 = var18.field3303;
                    var18.field3303 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2708 < 0) {
            this.field2708 = 0;
        }
        if (this.field2672 != null) {
            this.field2672.method594(arg0, 0, arg1);
        }
        this.field2698 = class267.method1841((byte) 114);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljk;IIIII)V")
    public static final void method1154(class276 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class277.field4590 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class183.field2835) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class90.field1391 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class154 var14 = class27.field346[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class242.field3842[var11][var12 + 1][var13] + class242.field3842[var11][var12][var13] + class242.field3842[var11][var12][var13 + 1] + class242.field3842[var11][var12 + 1][var13 + 1]) / 4 - (class242.field3842[arg1][arg2 + 1][arg3] + class242.field3842[arg1][arg2][arg3] + class242.field3842[arg1][arg2][arg3 + 1] + class242.field3842[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class169 var16 = var14.field2411;
                                    if (var16 != null) {
                                        if (var16.field2639.method1599()) {
                                            arg0.method1586(var16.field2639, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2634 != null && var16.field2634.method1599()) {
                                            arg0.method1586(var16.field2634, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2431; var17++) {
                                        class114 var18 = var14.field2418[var17];
                                        if (var18 != null && var18.field1726.method1599() && (var18.field1724 == var12 || var7 == var12) && (var18.field1719 == var13 || var9 == var13)) {
                                            int var19 = var18.field1715 + 1 - var18.field1724;
                                            int var20 = var18.field1714 + 1 - var18.field1719;
                                            arg0.method1586(var18.field1726, (var18.field1724 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1719 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V")
    public void method912() throws Exception {
        field2682++;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V")
    public static final void method1155(byte arg0) {
        field2685++;
        class143.field2237 = 0;
        class271.field4443 = 0;
        class76.field1196 = 0;
        class180.field2792 = -1;
        class281.field4649 = 0;
        if (arg0 <= 80) {
            field2691 = null;
        }
        client.field2582 = false;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
    private final void method1156(int arg0, int arg1) {
        this.field2708 -= arg1;
        if (arg0 != -256) {
            method1161(-55, 30);
        }
        field2697++;
        if (this.field2708 < 0) {
            this.field2708 = 0;
        }
        if (this.field2672 != null) {
            this.field2672.method593(arg1);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILgg;I)V")
    private final void method1157(int arg0, class206 arg1, int arg2) {
        int var4 = arg2 >> 5;
        if (arg0 != -256) {
            this.method1152((byte) -3);
        }
        field2674++;
        class206 var5 = this.field2707[var4];
        if (var5 == null) {
            this.field2704[var4] = arg1;
        } else {
            var5.field3303 = arg1;
        }
        this.field2707[var4] = arg1;
        arg1.field3304 = arg2;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public final synchronized void method1158(int arg0) {
        field2678++;
        if (class275.field4558 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class275.field4558.field4959[var3] == this) {
                    class275.field4558.field4959[var3] = null;
                }
                if (class275.field4558.field4959[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class275.field4558.field4964 = true;
                while (class275.field4558.field4958) {
                    class96.method614(0, 50L);
                }
                class275.field4558 = null;
            }
        }
        this.method911();
        this.field2673 = true;
        this.field2695 = null;
        int var4 = -84 / ((arg0 + 87) / 37);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()V")
    public void method911() {
        field2676++;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public void method910(int arg0) throws Exception {
        field2690++;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public final synchronized void method1159(int arg0) {
        field2693++;
        if (this.field2673) {
            return;
        }
        long var2 = class267.method1841((byte) 107);
        try {
            if ((this.field2698 + 500000L) < var2) {
                this.field2698 = var2 - 500000L;
            }
            while (this.field2698 + 5000L < var2) {
                this.method1156(-256, 256);
                this.field2698 += (long) (256000 / class131.field2018);
            }
        } catch (Exception var7) {
            this.field2698 = var2;
        }
        if (this.field2695 == null) {
            return;
        }
        try {
            if (this.field2701 != 0L) {
                if (var2 < this.field2701) {
                    return;
                }
                this.method910(this.field2706);
                this.field2701 = 0L;
                this.field2709 = true;
            }
            int var4 = this.method909();
            if ((this.field2703 - var4) > this.field2700) {
                this.field2700 = this.field2703 - var4;
            }
            int var5 = this.field2711 + this.field2710;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field2706 < (var5 + 256)) {
                this.field2706 += 1024;
                var4 = 0;
                if (this.field2706 > 16384) {
                    this.field2706 = 16384;
                }
                this.method911();
                this.method910(this.field2706);
                this.field2709 = true;
                if (var5 + 256 > this.field2706) {
                    var5 = this.field2706 - 256;
                    this.field2711 = var5 - this.field2710;
                }
            }
            if (arg0 == 17456) {
                while (var5 > var4) {
                    var4 += 256;
                    this.method1153(this.field2695, 256);
                    this.method913();
                }
                if (var2 > this.field2705) {
                    if (this.field2709) {
                        this.field2709 = false;
                    } else if (this.field2700 == 0 && this.field2702 == 0) {
                        this.method911();
                        this.field2701 = var2 + 2000L;
                        return;
                    } else {
                        this.field2711 = Math.min(this.field2702, this.field2700);
                        this.field2702 = this.field2700;
                    }
                    this.field2700 = 0;
                    this.field2705 = var2 + 2000L;
                }
                this.field2703 = var4;
            }
        } catch (Exception var6) {
            this.method911();
            this.field2701 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([IB)[I")
    public static final int[] method1160(int[] arg0, byte arg1) {
        if (arg1 != 43) {
            method1161(24, -93);
        }
        field2671++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class158.method1045(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)V")
    public static final void method1161(int arg0, int arg1) {
        field2679++;
        if (arg0 >= -84) {
            method1162(-79, false, (class208) null);
        }
        class66.field974.method147(arg1, (byte) -124);
        class50.field682.method147(arg1, (byte) -118);
        class276.field4561.method147(arg1, (byte) -122);
        class264.field4353.method147(arg1, (byte) -118);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZLcl;)V")
    public static final void method1162(int arg0, boolean arg1, class208 arg2) {
        if (!arg1) {
            method1155((byte) 8);
        }
        field2680++;
        class145 var3 = (class145) class89.field1371.method872((byte) -102, (long) arg0);
        if (var3 == null) {
            class16.method103(0, arg2, arg2.field849[0], class165.field2600, arg2.field804[0], arg0, (class74) null, 128, (class35) null);
        } else {
            var3.method973(0);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILgg;)V")
    public final synchronized void method1163(int arg0, class206 arg1) {
        if (arg0 > 125) {
            this.field2672 = arg1;
            field2694++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method907(Component arg0) throws Exception {
        field2692++;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "()V")
    public void method913() throws Exception {
        field2683++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
    public final synchronized void method1164(boolean arg0) {
        field2699++;
        this.field2709 = arg0;
        try {
            this.method912();
        } catch (Exception var2) {
            this.method911();
            this.field2701 = class267.method1841((byte) 108) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "()I")
    public int method909() throws Exception {
        field2675++;
        return this.field2706;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
    public static void method1165(int arg0) {
        if (arg0 != 16128) {
            field2696 = null;
        }
        field2677 = null;
        field2691 = null;
        field2688 = null;
        field2689 = null;
        field2696 = null;
    }
}
