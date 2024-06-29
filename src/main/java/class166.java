import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class166 extends class252 {

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public int field2742 = -1;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public int field2745 = 0;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public int field2754 = 12800;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    public int field2755 = -1;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public int field2748 = 12800;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "Z")
    public boolean field2749 = true;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    public int field2741 = 0;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "Ljava/lang/String;")
    public String field2752;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public int field2735;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "Ljava/lang/String;")
    public String field2744;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "Lnb;")
    public class223 field2743;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "[I")
    public static int[] field2737 = new int[128];

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "[I")
    public static int[] field2750;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "[[[I")
    public static int[][][] field2746;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)V")
    public final void method1178(byte arg0) {
        this.field2748 = 12800;
        field2736++;
        this.field2754 = 12800;
        this.field2741 = 0;
        this.field2745 = 0;
        class76 var2 = (class76) this.field2743.method1553(true);
        if (arg0 != -56) {
            return;
        }
        while (var2 != null) {
            if (this.field2741 < var2.field1231) {
                this.field2741 = var2.field1231;
            }
            if (var2.field1223 < this.field2754) {
                this.field2754 = var2.field1223;
            }
            if (this.field2748 > var2.field1219) {
                this.field2748 = var2.field1219;
            }
            if (this.field2745 < var2.field1234) {
                this.field2745 = var2.field1234;
            }
            var2 = (class76) this.field2743.method1551(0);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBI[I)Z")
    public final boolean method1179(int arg0, byte arg1, int arg2, int[] arg3) {
        field2757++;
        class76 var5 = (class76) this.field2743.method1553(true);
        if (arg1 < 95) {
            return true;
        }
        while (var5 != null) {
            if (var5.method547(arg0, (byte) 88, arg2)) {
                var5.method551(arg0, arg3, 63, arg2);
                return true;
            }
            var5 = (class76) this.field2743.method1551(0);
        }
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)Z")
    public final boolean method1180(int arg0, int arg1, int arg2) {
        field2739++;
        for (class76 var4 = (class76) this.field2743.method1553(true); var4 != null; var4 = (class76) this.field2743.method1551(arg0 ^ 0x3200)) {
            if (var4.method556(arg1, (byte) 100, arg2)) {
                return true;
            }
        }
        return arg0 == 12800 ? false : false;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILfj;)Lim;")
    public static final class237 method1181(int arg0, class274 arg1) {
        field2738++;
        int var2 = -101 / ((45 - arg0) / 44);
        return new class237(arg1.method1847(-404), arg1.method1847(-404), arg1.method1847(-404), arg1.method1847(-404), arg1.method1847(-404), arg1.method1847(-404), arg1.method1847(-404), arg1.method1847(-404), arg1.method1812(true), arg1.method1849(255));
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lgb;")
    public static final class156 method1182(int arg0, int arg1) {
        class156 var2 = (class156) class146.field2336.method1879(8887, (long) arg1);
        field2756++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class46.field686.method1156(class71.method494(-1264023672, arg1), class82.method589(23478, arg1), (byte) -16);
        if (arg0 != 1) {
            return null;
        }
        class156 var4 = new class156();
        var4.field2483 = arg1;
        if (var3 != null) {
            var4.method1057(new class274(var3), 0);
        }
        class146.field2336.method1883((long) arg1, 72, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIILie;Lie;IIJ)V")
    public static final void method1183(int arg0, int arg1, int arg2, int arg3, class34 arg4, class34 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class138 var10 = new class138();
        var10.field2230 = arg8;
        var10.field2225 = arg1 * 128 + 64;
        var10.field2228 = arg2 * 128 + 64;
        var10.field2229 = arg3;
        var10.field2226 = arg4;
        var10.field2227 = arg5;
        var10.field2221 = arg6;
        var10.field2224 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class307.field4991[var11][arg1][arg2] == null) {
                class307.field4991[var11][arg1][arg2] = new class116(var11, arg1, arg2);
            }
        }
        class307.field4991[arg0][arg1][arg2].field1775 = var10;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(B)V")
    public static void method1184(byte arg0) {
        if (arg0 != 88) {
            field2737 = null;
        }
        field2737 = null;
        field2750 = null;
        field2746 = null;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V")
    public static final void method1185(int arg0) {
        field2758++;
        int var1 = class90.field1414 * 128 + 64;
        int var2 = class272.field4377 * 128 + 64;
        int var3 = class60.method387(-18796, var2, var1, class214.field3389) - class117.field1806;
        if (class179.field2965 >= 100) {
            class135.field2184 = class90.field1414 * 128 + 64;
            class123.field1960 = class272.field4377 * 128 + 64;
            class182.field3028 = class60.method387(-18796, class123.field1960, class135.field2184, class214.field3389) - class117.field1806;
        } else {
            if (class135.field2184 < var1) {
                class135.field2184 += (var1 - class135.field2184) * class179.field2965 / 1000 + class70.field1121;
                if (class135.field2184 > var1) {
                    class135.field2184 = var1;
                }
            }
            if (var1 < class135.field2184) {
                class135.field2184 -= (class135.field2184 - var1) * class179.field2965 / 1000 + class70.field1121;
                if (class135.field2184 < var1) {
                    class135.field2184 = var1;
                }
            }
            if (var2 > class123.field1960) {
                class123.field1960 += (var2 - class123.field1960) * class179.field2965 / 1000 + class70.field1121;
                if (var2 < class123.field1960) {
                    class123.field1960 = var2;
                }
            }
            if (class123.field1960 > var2) {
                class123.field1960 -= class70.field1121 + ((class123.field1960 - var2) * class179.field2965 / 1000);
                if (var2 > class123.field1960) {
                    class123.field1960 = var2;
                }
            }
            if (class182.field3028 < var3) {
                class182.field3028 += (var3 - class182.field3028) * class179.field2965 / 1000 + class70.field1121;
                if (var3 < class182.field3028) {
                    class182.field3028 = var3;
                }
            }
            if (var3 < class182.field3028) {
                class182.field3028 -= (class182.field3028 - var3) * class179.field2965 / 1000 + class70.field1121;
                if (class182.field3028 < var3) {
                    class182.field3028 = var3;
                }
            }
        }
        int var4 = class135.field2182 * 128 + 64;
        int var5 = class8.field176 * 128 + 64;
        int var6 = class60.method387(-18796, var4, var5, class214.field3389) - class296.field4840;
        int var7 = var5 - class135.field2184;
        int var8 = var6 - class182.field3028;
        int var9 = var4 - class123.field1960;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var9)) & 0x7FF;
        if (arg0 < 108) {
            field2750 = null;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class95.field1506) {
            class95.field1506 += (var11 - class95.field1506) * class74.field1189 / 1000 + class251.field4132;
            if (class95.field1506 > var11) {
                class95.field1506 = var11;
            }
        }
        int var13 = var12 - class211.field3361;
        if (class95.field1506 > var11) {
            class95.field1506 -= (class95.field1506 - var11) * class74.field1189 / 1000 + class251.field4132;
            if (class95.field1506 < var11) {
                class95.field1506 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class211.field3361 += class74.field1189 * var13 / 1000 + class251.field4132;
            class211.field3361 &= 0x7FF;
        }
        if (var13 < 0) {
            class211.field3361 -= -var13 * class74.field1189 / 1000 + class251.field4132;
            class211.field3361 &= 0x7FF;
        }
        int var14 = var12 - class211.field3361;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class211.field3361 = var12;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III[II)Z")
    public final boolean method1186(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg2 != 2048) {
            this.field2749 = false;
        }
        field2740++;
        for (class76 var6 = (class76) this.field2743.method1553(true); var6 != null; var6 = (class76) this.field2743.method1551(arg2 - 2048)) {
            if (var6.method550(true, arg1, arg4, arg0)) {
                var6.method546((byte) -112, arg4, arg3, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Z")
    public static final boolean method1187(int arg0, int arg1) {
        field2753++;
        class104.field1644 = arg1 & arg0 + 1;
        class70.field1119 = true;
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[II)Z")
    public final boolean method1188(int arg0, int arg1, int[] arg2, int arg3) {
        field2747++;
        for (class76 var5 = (class76) this.field2743.method1553(true); var5 != null; var5 = (class76) this.field2743.method1551(0)) {
            if (var5.method556(arg0, (byte) 110, arg1)) {
                var5.method546((byte) -112, arg1, arg2, arg0);
                return true;
            }
        }
        if (arg3 != 0) {
            this.field2752 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class166(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field2751 = arg3;
        this.field2755 = arg6;
        this.field2752 = arg1;
        this.field2749 = arg5;
        this.field2735 = arg0;
        this.field2742 = arg4;
        this.field2744 = arg2;
        if (this.field2755 == 255) {
            this.field2755 = 0;
        }
        this.field2743 = new class223();
    }
}
