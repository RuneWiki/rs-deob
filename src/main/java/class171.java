import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class171 {

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    private int field3139 = -1;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    private int field3147 = 0;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lrk;")
    private class257 field3144 = new class257();

    @OriginalMember(owner = "client!di", name = "y", descriptor = "Z")
    public boolean field3160 = false;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    private int field3141;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "[Lnj;")
    private class138[] field3153;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    private int field3136;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "[[I")
    private int[][] field3150;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Ljd;")
    public static class86 field3137 = class122.method868(")3", true);

    @OriginalMember(owner = "client!di", name = "k", descriptor = "[I")
    public static int[] field3146 = new int[256];

    @OriginalMember(owner = "client!di", name = "t", descriptor = "Ljd;")
    private static class86 field3155;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "Ljd;")
    public static class86 field3162;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "Ljd;")
    public static class86 field3156;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "Ljd;")
    public static class86 field3164;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "J")
    public static volatile long field3163;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "F")
    public static float field3157;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "Lbj;")
    public static class151 field3161;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "[[I")
    public static int[][] field3165;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)I")
    public static final int method1221(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 21419) {
            return -22;
        }
        field3138++;
        if (arg1 <= arg3) {
            return arg3 > arg0 ? arg0 : arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)V")
    public static final void method1222(byte arg0, int arg1) {
        if (arg0 != -75) {
            return;
        }
        field3151++;
        if (class45.field1007 == 0) {
            class253.field4504.method308(arg1, arg0 ^ 0xFFFF94C8);
        } else {
            class135.field2592 = arg1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIII)V")
    public static final void method1223(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3142++;
        class161 var5 = class204.method1456(true, 8, arg0);
        var5.method1174(0);
        int var6 = 60 % ((-arg1 - 10) / 58);
        var5.field3015 = arg4;
        var5.field3027 = arg3;
        var5.field3016 = arg2;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[I")
    public final int[] method1224(int arg0, int arg1) {
        if (arg1 != 0) {
            method1229(-73, -23, 58, -55, 37, (byte) -67);
        }
        field3148++;
        if (this.field3141 == this.field3136) {
            this.field3160 = this.field3153[arg0] == null;
            this.field3153[arg0] = class33.field735;
            return this.field3150[arg0];
        } else if (this.field3136 == 1) {
            this.field3160 = this.field3139 != arg0;
            this.field3139 = arg0;
            return this.field3150[0];
        } else {
            class138 var3 = this.field3153[arg0];
            if (var3 == null) {
                this.field3160 = true;
                if (this.field3147 < this.field3136) {
                    var3 = new class138(arg0, this.field3147);
                    this.field3147++;
                } else {
                    class138 var4 = (class138) this.field3144.method1730((byte) 94);
                    var3 = new class138(arg0, var4.field2639);
                    this.field3153[var4.field2640] = null;
                    var4.method1477(1);
                }
                this.field3153[arg0] = var3;
            } else {
                this.field3160 = false;
            }
            this.field3144.method1738(var3, (byte) -68);
            return this.field3150[var3.field2639];
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)Z")
    public static final boolean method1225(int arg0) {
        int var1 = 88 % ((arg0 + 59) / 62);
        field3152++;
        return class239.field4304;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static void method1226(byte arg0) {
        field3155 = null;
        if (arg0 != 115) {
            field3155 = null;
        }
        field3165 = null;
        field3137 = null;
        field3156 = null;
        field3164 = null;
        field3162 = null;
        field3161 = null;
        field3146 = null;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    public final void method1227(int arg0) {
        field3149++;
        for (int var2 = 0; var2 < this.field3136; var2++) {
            this.field3150[var2] = null;
        }
        this.field3150 = null;
        this.field3153 = null;
        if (arg0 != 1) {
            method1231(39, (byte) -35);
        }
        this.field3144.method1739(true);
        this.field3144 = null;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(BI)V")
    public static final void method1228(byte arg0, int arg1) {
        field3158++;
        if (!class179.method1258(arg1, (byte) -36)) {
            return;
        }
        class6[] var2 = class108.field2070[arg1];
        if (arg0 <= 81) {
            method1225(-95);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class6 var4 = var2[var3];
            if (var4 != null) {
                var4.field88 = 0;
                var4.field119 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1229(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3140++;
        if (arg5 < 71 || arg2 > class56.field1143 || arg1 < class50.field1050) {
            return;
        }
        boolean var6;
        if (arg0 < class49.field1044) {
            var6 = false;
            arg0 = class49.field1044;
        } else if (class129.field2473 < arg0) {
            var6 = false;
            arg0 = class129.field2473;
        } else {
            var6 = true;
        }
        boolean var7;
        if (class49.field1044 > arg3) {
            var7 = false;
            arg3 = class49.field1044;
        } else if (class129.field2473 < arg3) {
            arg3 = class129.field2473;
            var7 = false;
        } else {
            var7 = true;
        }
        if (arg2 < class50.field1050) {
            arg2 = class50.field1050;
        } else {
            class56.method412(arg4, (byte) -108, arg3, class249.field4420[arg2++], arg0);
        }
        if (class56.field1143 < arg1) {
            arg1 = class56.field1143;
        } else {
            class56.method412(arg4, (byte) -101, arg3, class249.field4420[arg1--], arg0);
        }
        if (var6 && var7) {
            for (int var8 = arg2; var8 <= arg1; var8++) {
                int[] var9 = class249.field4420[var8];
                var9[arg0] = var9[arg3] = arg4;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg2; var10 <= arg1; var10++) {
                class249.field4420[var10][arg0] = arg4;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg2; var11 <= arg1; var11++) {
                class249.field4420[var11][arg3] = arg4;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(III)V")
    public class171(int arg0, int arg1, int arg2) {
        this.field3141 = arg1;
        this.field3153 = new class138[this.field3141];
        this.field3136 = arg0;
        this.field3150 = new int[this.field3136][arg2];
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)[[I")
    public final int[][] method1230(int arg0) {
        field3154++;
        if (this.field3141 != this.field3136) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -18226) {
            for (int var2 = 0; var2 < this.field3136; var2++) {
                this.field3153[var2] = class33.field735;
            }
            return this.field3150;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)V")
    public static final void method1231(int arg0, byte arg1) {
        field3145++;
        class137.field2609.method693(6, arg0);
        int var2 = 84 % ((arg1 - 21) / 52);
        class4.field60.method693(6, arg0);
        class158.field2973.method693(6, arg0);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3146[var0] = var1;
        }
        field3155 = class122.method868("Members object", true);
        field3162 = field3155;
        field3156 = class122.method868("ul", true);
        field3164 = class122.method868(" zuerst von Ihrer Freunde)2Liste(Q", true);
        field3163 = 0L;
    }
}
