import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class171 extends class40 {

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "[I")
    public int[] field3059 = new int[16];

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "[I")
    private int[] field3064 = new int[16];

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "[I")
    private int[] field3060 = new int[16];

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "[I")
    public int[] field3054 = new int[16];

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "[I")
    public int[] field3079 = new int[16];

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "[I")
    private int[] field3065 = new int[16];

    @OriginalMember(owner = "client!dh", name = "eb", descriptor = "[I")
    private int[] field3085 = new int[16];

    @OriginalMember(owner = "client!dh", name = "kb", descriptor = "[I")
    private int[] field3091 = new int[16];

    @OriginalMember(owner = "client!dh", name = "ib", descriptor = "[I")
    private int[] field3089 = new int[16];

    @OriginalMember(owner = "client!dh", name = "yb", descriptor = "I")
    private int field3105 = 256;

    @OriginalMember(owner = "client!dh", name = "Db", descriptor = "[I")
    private int[] field3110 = new int[16];

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "[I")
    private int[] field3070 = new int[16];

    @OriginalMember(owner = "client!dh", name = "wb", descriptor = "[I")
    private int[] field3103 = new int[16];

    @OriginalMember(owner = "client!dh", name = "Bb", descriptor = "[I")
    private int[] field3108 = new int[16];

    @OriginalMember(owner = "client!dh", name = "qb", descriptor = "[[Ldk;")
    private class215[][] field3097 = new class215[16][128];

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "[[Ldk;")
    private class215[][] field3061 = new class215[16][128];

    @OriginalMember(owner = "client!dh", name = "zb", descriptor = "I")
    private int field3106 = 1000000;

    @OriginalMember(owner = "client!dh", name = "Kb", descriptor = "[I")
    private int[] field3117 = new int[16];

    @OriginalMember(owner = "client!dh", name = "mb", descriptor = "[I")
    private int[] field3093 = new int[16];

    @OriginalMember(owner = "client!dh", name = "Ib", descriptor = "[I")
    private int[] field3115 = new int[16];

    @OriginalMember(owner = "client!dh", name = "ob", descriptor = "Lvj;")
    private class107 field3095 = new class107();

    @OriginalMember(owner = "client!dh", name = "Rb", descriptor = "Llc;")
    private class167 field3124 = new class167(this);

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "Lof;")
    private class242 field3058 = new class242(128);

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "Lsf;")
    public static class108 field3066 = class140.method973(255, "K");

    @OriginalMember(owner = "client!dh", name = "Jb", descriptor = "I")
    public static int field3116 = 0;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!dh", name = "bb", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!dh", name = "cb", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!dh", name = "db", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!dh", name = "fb", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!dh", name = "gb", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!dh", name = "hb", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!dh", name = "jb", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!dh", name = "lb", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!dh", name = "nb", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!dh", name = "pb", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!dh", name = "rb", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!dh", name = "sb", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!dh", name = "tb", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!dh", name = "ub", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!dh", name = "xb", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!dh", name = "Ab", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!dh", name = "Cb", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!dh", name = "Eb", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!dh", name = "Fb", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!dh", name = "Gb", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!dh", name = "Hb", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!dh", name = "Lb", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!dh", name = "Mb", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!dh", name = "Nb", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!dh", name = "Ob", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!dh", name = "Pb", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!dh", name = "Ub", descriptor = "I")
    private int field3127;

    @OriginalMember(owner = "client!dh", name = "Vb", descriptor = "I")
    private int field3128;

    @OriginalMember(owner = "client!dh", name = "Wb", descriptor = "I")
    private int field3129;

    @OriginalMember(owner = "client!dh", name = "Sb", descriptor = "J")
    private long field3125;

    @OriginalMember(owner = "client!dh", name = "Tb", descriptor = "J")
    private long field3126;

    @OriginalMember(owner = "client!dh", name = "Xb", descriptor = "Lpk;")
    private class112 field3130;

    @OriginalMember(owner = "client!dh", name = "vb", descriptor = "Lik;")
    public static class262 field3102;

    @OriginalMember(owner = "client!dh", name = "Qb", descriptor = "Z")
    private boolean field3123;

    @OriginalMember(owner = "client!dh", name = "Yb", descriptor = "Z")
    private boolean field3131;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([III)V", line = 4)
    public final synchronized void method271(int[] arg0, int arg1, int arg2) {
        if (this.field3095.method741()) {
            int var4 = this.field3095.field1851 * this.field3106 / class210.field3755;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3125;
                if (this.field3126 - var5 >= 0L) {
                    this.field3125 = var5;
                    break;
                }
                int var7 = (int) ((this.field3126 + (long) var4 - this.field3125 - 1L) / (long) var4);
                this.field3125 += (long) var4 * (long) var7;
                arg2 -= var7;
                this.field3124.method271(arg0, arg1, var7);
                this.method1183((byte) -84);
                arg1 += var7;
            } while (this.field3095.method741());
        }
        field3112++;
        this.field3124.method271(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 41)
    public final synchronized void method272(int arg0) {
        field3071++;
        if (this.field3095.method741()) {
            int var2 = this.field3095.field1851 * this.field3106 / class210.field3755;
            do {
                long var3 = this.field3125 + ((long) arg0 * (long) var2);
                if ((this.field3126 - var3) >= 0L) {
                    this.field3125 = var3;
                    break;
                }
                int var5 = (int) (((long) var2 + this.field3126 - this.field3125 - 1L) / (long) var2);
                arg0 -= var5;
                this.field3125 += (long) var2 * (long) var5;
                this.field3124.method272(var5);
                this.method1183((byte) -111);
            } while (this.field3095.method741());
        }
        this.field3124.method272(arg0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V", line = 80)
    private final void method1180(int arg0, int arg1, int arg2) {
        if (this.field3115[arg2] != arg1) {
            this.field3115[arg2] = arg1;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field3097[arg2][var4] = null;
            }
        }
        if (arg0 == 6204) {
            field3055++;
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(II)V", line = 105)
    private final void method1181(int arg0, int arg1) {
        if (arg1 != 128) {
            this.method1199(false, 75, -101);
        }
        for (class215 var3 = (class215) this.field3124.field3002.method13(0); var3 != null; var3 = (class215) this.field3124.field3002.method15((byte) 47)) {
            if ((arg0 < 0 || var3.field3822 == arg0) && var3.field3825 < 0) {
                this.field3061[var3.field3822][var3.field3803] = null;
                var3.field3825 = 0;
            }
        }
        field3119++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)V", line = 134)
    public final synchronized void method1182(boolean arg0, int arg1) {
        field3096++;
        if (arg0) {
            this.field3105 = arg1;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V", line = 146)
    private final void method1183(byte arg0) {
        field3109++;
        int var2 = this.field3127;
        if (arg0 > -71) {
            this.field3103 = (int[]) null;
        }
        long var3 = this.field3126;
        int var5 = this.field3128;
        if (this.field3130 != null && this.field3129 == var5) {
            this.method1217(this.field3123, this.field3130, (byte) 111, this.field3131);
            this.method1183((byte) -117);
            return;
        }
        while (this.field3128 == var5) {
            while (this.field3095.field1848[var2] == var5) {
                this.field3095.method734(var2);
                int var6 = this.field3095.method735(var2);
                if (var6 == 1) {
                    this.field3095.method737();
                    this.field3095.method727(var2);
                    if (this.field3095.method729()) {
                        if (this.field3130 != null) {
                            this.method1184(false, this.field3123, this.field3130);
                            this.method1183((byte) -123);
                            return;
                        }
                        if (!this.field3123 || var5 == 0) {
                            this.method1189(-1, true);
                            this.field3095.method736();
                            return;
                        }
                        this.field3095.method739(var3);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method1200(true, var6);
                }
                this.field3095.method730(var2);
                this.field3095.method727(var2);
            }
            var2 = this.field3095.method738();
            var5 = this.field3095.field1848[var2];
            var3 = this.field3095.method733(var5);
        }
        this.field3128 = var5;
        this.field3127 = var2;
        this.field3126 = var3;
        if (this.field3130 != null && var5 > this.field3129) {
            this.field3127 = -1;
            this.field3128 = this.field3129;
            this.field3126 = this.field3095.method733(this.field3128);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZZLpk;)V", line = 227)
    public final synchronized void method1184(boolean arg0, boolean arg1, class112 arg2) {
        if (arg0) {
            this.field3059 = (int[]) null;
        }
        this.method1217(arg1, arg2, (byte) 110, true);
        field3081++;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 1638)
    public class171() {
        this.method1197(256, 0, -1);
        this.method1189(-1, true);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)V", line = 244)
    private final void method1185(int arg0, int arg1, int arg2, int arg3) {
        field3086++;
        this.method1212(-2013308888, arg0, arg1, 64);
        if ((this.field3054[arg1] & 0x2) != 0) {
            for (class215 var5 = (class215) this.field3124.field3002.method11((byte) 55); var5 != null; var5 = (class215) this.field3124.field3002.method1(-124)) {
                if (var5.field3822 == arg1 && var5.field3825 < 0) {
                    this.field3061[arg1][var5.field3803] = null;
                    this.field3061[arg1][arg0] = var5;
                    int var6 = (var5.field3831 * var5.field3805 >> 12) + var5.field3821;
                    var5.field3821 += arg0 - var5.field3803 << 8;
                    var5.field3803 = arg0;
                    var5.field3805 = var6 - var5.field3821;
                    var5.field3831 = 4096;
                    return;
                }
            }
        }
        class191 var7 = (class191) this.field3058.method1676((long) this.field3115[arg1], (byte) -104);
        if (var7 == null) {
            return;
        }
        class244 var8 = var7.field3468[arg0];
        if (var8 == null) {
            return;
        }
        class215 var9 = new class215();
        var9.field3822 = arg1;
        var9.field3808 = var8;
        var9.field3807 = var7;
        var9.field3816 = var7.field3462[arg0];
        if (arg2 < 119) {
            field3066 = (class108) null;
        }
        var9.field3812 = var7.field3470[arg0];
        var9.field3803 = arg0;
        var9.field3802 = var7.field3460 * arg3 * var7.field3464[arg0] * arg3 + 1024 >> 11;
        var9.field3818 = var7.field3469[arg0] & 0xFF;
        var9.field3821 = (arg0 << 8) - (var7.field3459[arg0] & 0x7FFF);
        var9.field3824 = 0;
        var9.field3825 = -1;
        var9.field3823 = 0;
        var9.field3815 = 0;
        var9.field3806 = 0;
        if (this.field3059[arg1] == 0) {
            var9.field3813 = class179.method1294(var8, this.method1207((byte) 78, var9), this.method1203(var9, 203712776), this.method1205(var9, 29388));
        } else {
            var9.field3813 = class179.method1294(var8, this.method1207((byte) 96, var9), 0, this.method1205(var9, 29388));
            this.method1201(var7.field3459[arg0] < 0, 8, var9);
        }
        if (var7.field3459[arg0] < 0) {
            var9.field3813.method1297(-1);
        }
        if (var9.field3812 >= 0) {
            class215 var10 = this.field3097[arg1][var9.field3812];
            if (var10 != null && var10.field3825 < 0) {
                this.field3061[arg1][var10.field3803] = null;
                var10.field3825 = 0;
            }
            this.field3097[arg1][var9.field3812] = var9;
        }
        this.field3124.field3002.method5(var9, (byte) -9);
        this.field3061[arg1][arg0] = var9;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V", line = 341)
    public static final void method1186(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3063++;
        for (int var5 = 0; var5 < class273.field4806; var5++) {
            if (class39.field545[var5] + class26.field399[var5] > arg3 && class39.field545[var5] < (arg1 + arg3) && arg4 < (class313.field5409[var5] + class242.field4216[var5]) && class242.field4216[var5] < (arg2 + arg4)) {
                class280.field4910[var5] = true;
            }
        }
        if (arg0 != 31962) {
            field3066 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)V", line = 367)
    public static final void method1187(byte arg0) {
        class223.field3945.method644((byte) 112);
        field3099++;
        class157.field2829.method644((byte) 104);
        if (arg0 != -100) {
            method1213((byte) -110);
        }
        class176.field3200.method644((byte) 123);
        class151.field2732.method644((byte) 94);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 383)
    public static final void method1188(int arg0, String arg1, Throwable arg2) {
        field3092++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class62.method430(arg2, 85);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            client.method1824((byte) -49, var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace((char) arg0, '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class137.field2428.field2441 == null) {
                return;
            }
            class205 var8 = class137.field2428.method963(new URL(class137.field2428.field2441.getCodeBase(), "clienterror.ws?c=" + class46.field689 + "&u=" + class46.field661 + "&v1=" + class139.field2455 + "&v2=" + class139.field2451 + "&e=" + var7), 109);
            while (var8.field3686 == 0) {
                class83.method556(1L, arg0 + 59);
            }
            if (var8.field3686 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field3685;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)V", line = 438)
    private final void method1189(int arg0, boolean arg1) {
        if (arg1) {
            this.method1191(false, -1);
        } else {
            this.method1181(-1, 128);
        }
        this.method1198(arg0, 112);
        for (int var3 = 0; var3 < 16; var3++) {
            this.field3115[var3] = this.field3110[var3];
        }
        for (int var4 = 0; var4 < 16; var4++) {
            this.field3070[var4] = class162.method1118(this.field3110[var4], -128);
        }
        field3068++;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(II)V", line = 472)
    public static final void method1190(int arg0, int arg1) {
        field3101++;
        class141.field2483.method637(arg1, 121);
        if (arg0 != -6464) {
            method1208((byte) 24);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(ZI)V", line = 484)
    private final void method1191(boolean arg0, int arg1) {
        field3100++;
        for (class215 var3 = (class215) this.field3124.field3002.method13(0); var3 != null; var3 = (class215) this.field3124.field3002.method15((byte) 47)) {
            if (arg1 < 0 || var3.field3822 == arg1) {
                if (var3.field3813 != null) {
                    var3.field3813.method1271(class210.field3755 / 100);
                    if (var3.field3813.method1296()) {
                        this.field3124.field3016.method2191(var3.field3813);
                    }
                    var3.method1476((byte) 90);
                }
                if (var3.field3825 < 0) {
                    this.field3061[var3.field3822][var3.field3803] = null;
                }
                var3.method1325(0);
            }
        }
        if (arg0) {
            this.field3093 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V", line = 523)
    private final void method1192(int arg0, byte arg1) {
        if ((this.field3054[arg0] & 0x4) != 0) {
            for (class215 var3 = (class215) this.field3124.field3002.method13(0); var3 != null; var3 = (class215) this.field3124.field3002.method15((byte) 47)) {
                if (var3.field3822 == arg0) {
                    var3.field3800 = 0;
                }
            }
        }
        if (arg1 <= 28) {
            this.field3130 = (class112) null;
        }
        field3087++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZILik;Lpk;Lnh;)Z", line = 555)
    public final synchronized boolean method1193(boolean arg0, int arg1, class262 arg2, class112 arg3, class115 arg4) {
        field3104++;
        boolean var6 = arg0;
        int[] var7 = null;
        arg3.method805();
        if (arg1 > 0) {
            var7 = new int[] { arg1 };
        }
        for (class224 var8 = (class224) arg3.field1948.method1672(0); var8 != null; var8 = (class224) arg3.field1948.method1678(-5)) {
            int var9 = (int) var8.field3375;
            class191 var10 = (class191) this.field3058.method1676((long) var9, (byte) -107);
            if (var10 == null) {
                var10 = class140.method976(arg2, 28310, var9);
                if (var10 == null) {
                    var6 = false;
                    continue;
                }
                this.field3058.method1681(1, var10, (long) var9);
            }
            if (!var10.method1354(-13249, var8.field3958, arg4, var7)) {
                var6 = false;
            }
        }
        if (var6) {
            arg3.method806();
        }
        return var6;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V", line = 607)
    public final synchronized void method1194(int arg0) {
        field3122++;
        class191 var2 = (class191) this.field3058.method1672(0);
        if (arg0 != -26612) {
            this.field3095 = (class107) null;
        }
        while (var2 != null) {
            var2.method1325(0);
            var2 = (class191) this.field3058.method1678(67);
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)I", line = 626)
    public final int method1195(int arg0) {
        if (arg0 >= -106) {
            this.method275();
        }
        field3098++;
        return this.field3105;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ldk;B)Z", line = 637)
    public final boolean method1196(class215 arg0, byte arg1) {
        if (arg1 != 107) {
            this.field3108 = (int[]) null;
        }
        field3077++;
        if (arg0.field3813 != null) {
            return false;
        }
        if (arg0.field3825 >= 0) {
            arg0.method1325(0);
            if (arg0.field3812 > 0 && this.field3097[arg0.field3822][arg0.field3812] == arg0) {
                this.field3097[arg0.field3822][arg0.field3812] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(III)V", line = 663)
    private final synchronized void method1197(int arg0, int arg1, int arg2) {
        if (arg2 >= arg1) {
            this.field3117[arg2] = arg0;
        } else {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field3117[var4] = arg0;
            }
        }
        field3111++;
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(II)V", line = 683)
    private final void method1198(int arg0, int arg1) {
        field3075++;
        if (arg0 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method1198(var3, 118);
            }
            return;
        }
        this.field3103[arg0] = 12800;
        this.field3091[arg0] = 8192;
        this.field3060[arg0] = 16383;
        this.field3085[arg0] = 8192;
        this.field3093[arg0] = 0;
        this.field3108[arg0] = 8192;
        this.method1202(arg0, 0);
        this.method1192(arg0, (byte) 108);
        if (arg1 < 7) {
            this.method1193(false, 80, (class262) null, (class112) null, (class115) null);
        }
        this.field3054[arg0] = 0;
        this.field3064[arg0] = 32767;
        this.field3065[arg0] = 256;
        this.field3059[arg0] = 0;
        this.method1204(arg0, 8192, true);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZII)V", line = 720)
    private final void method1199(boolean arg0, int arg1, int arg2) {
        field3118++;
        this.field3110[arg2] = arg1;
        this.field3070[arg2] = class162.method1118(-128, arg1);
        if (arg0) {
            this.method1204(72, -72, false);
        }
        this.method1180(6204, arg1, arg2);
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(ZI)V", line = 742)
    private final void method1200(boolean arg0, int arg1) {
        int var3 = arg1 & 0xF0;
        field3067++;
        if (var3 == 128) {
            int var4 = arg1 & 0xF;
            int var5 = (arg1 & 0x7FE348) >> 16;
            int var6 = (arg1 & 0x7F62) >> 8;
            this.method1212(-2013308888, var6, var4, var5);
        } else if (var3 == 144) {
            int var7 = arg1 & 0xF;
            int var8 = arg1 >> 8 & 0x7F;
            int var9 = (arg1 & 0x7FB419) >> 16;
            if (var9 > 0) {
                this.method1185(var8, var7, 125, var9);
            } else {
                this.method1212(-2013308888, var8, var7, 64);
            }
        } else if (var3 == 160) {
            int var22 = arg1 >> 8 & 0x7F;
            int var23 = arg1 & 0xF;
            int var24 = arg1 >> 16 & 0x7F;
            this.method1218(var22, var24, var23, (byte) -123);
        } else if (var3 == 176) {
            int var17 = (arg1 & 0x7FCD) >> 8;
            int var18 = arg1 & 0xF;
            int var19 = (arg1 & 0x7FD974) >> 16;
            if (var17 == 0) {
                this.field3070[var18] = (var19 << 14) + class162.method1118(this.field3070[var18], -2080769);
            }
            if (var17 == 32) {
                this.field3070[var18] = (var19 << 7) + class162.method1118(-16257, this.field3070[var18]);
            }
            if (var17 == 1) {
                this.field3093[var18] = (var19 << 7) + class162.method1118(-16257, this.field3093[var18]);
            }
            if (var17 == 33) {
                this.field3093[var18] = class162.method1118(-128, this.field3093[var18]) + var19;
            }
            if (var17 == 5) {
                this.field3108[var18] = (var19 << 7) + class162.method1118(-16257, this.field3108[var18]);
            }
            if (var17 == 37) {
                this.field3108[var18] = var19 + class162.method1118(-128, this.field3108[var18]);
            }
            if (var17 == 7) {
                this.field3103[var18] = (var19 << 7) + class162.method1118(this.field3103[var18], -16257);
            }
            if (var17 == 39) {
                this.field3103[var18] = class162.method1118(-128, this.field3103[var18]) + var19;
            }
            if (var17 == 10) {
                this.field3091[var18] = class162.method1118(-16257, this.field3091[var18]) + (var19 << 7);
            }
            if (var17 == 42) {
                this.field3091[var18] = class162.method1118(-128, this.field3091[var18]) + var19;
            }
            if (var17 == 11) {
                this.field3060[var18] = class162.method1118(-16257, this.field3060[var18]) + (var19 << 7);
            }
            if (var17 == 43) {
                this.field3060[var18] = var19 + class162.method1118(this.field3060[var18], -128);
            }
            if (var17 == 64) {
                if (var19 < 64) {
                    this.field3054[var18] = class162.method1118(this.field3054[var18], -2);
                } else {
                    this.field3054[var18] = class242.method1674(this.field3054[var18], 1);
                }
            }
            if (var17 == 65) {
                if (var19 >= 64) {
                    this.field3054[var18] = class242.method1674(this.field3054[var18], 2);
                } else {
                    this.method1202(var18, 0);
                    this.field3054[var18] = class162.method1118(this.field3054[var18], -3);
                }
            }
            if (var17 == 99) {
                this.field3064[var18] = class162.method1118(this.field3064[var18], 127) + (var19 << 7);
            }
            if (var17 == 98) {
                this.field3064[var18] = class162.method1118(this.field3064[var18], 16256) + var19;
            }
            if (var17 == 101) {
                this.field3064[var18] = class162.method1118(127, this.field3064[var18]) + (var19 << 7) + 16384;
            }
            if (var17 == 100) {
                this.field3064[var18] = var19 + class162.method1118(this.field3064[var18], 16256) + 16384;
            }
            if (var17 == 120) {
                this.method1191(false, var18);
            }
            if (var17 == 121) {
                this.method1198(var18, 114);
            }
            if (var17 == 123) {
                this.method1181(var18, 128);
            }
            if (var17 == 6) {
                int var20 = this.field3064[var18];
                if (var20 == 16384) {
                    this.field3065[var18] = class162.method1118(-16257, this.field3065[var18]) + (var19 << 7);
                }
            }
            if (var17 == 38) {
                int var21 = this.field3064[var18];
                if (var21 == 16384) {
                    this.field3065[var18] = class162.method1118(this.field3065[var18], -128) + var19;
                }
            }
            if (var17 == 16) {
                this.field3059[var18] = (var19 << 7) + class162.method1118(this.field3059[var18], -16257);
            }
            if (var17 == 48) {
                this.field3059[var18] = var19 + class162.method1118(this.field3059[var18], -128);
            }
            if (var17 == 81) {
                if (var19 >= 64) {
                    this.field3054[var18] = class242.method1674(this.field3054[var18], 4);
                } else {
                    this.method1192(var18, (byte) 79);
                    this.field3054[var18] = class162.method1118(this.field3054[var18], -5);
                }
            }
            if (var17 == 17) {
                this.method1204(var18, (var19 << 7) + (this.field3089[var18] & 0xFFFFC07F), arg0);
            }
            if (var17 == 49) {
                this.method1204(var18, (this.field3089[var18] & 0xFFFFFF80) + var19, true);
            }
        } else if (var3 == 192) {
            int var10 = arg1 & 0xF;
            int var11 = arg1 >> 8 & 0x7F;
            this.method1180(6204, this.field3070[var10] + var11, var10);
        } else {
            if (!arg0) {
                this.method271((int[]) null, 85, -60);
            }
            if (var3 == 208) {
                int var12 = arg1 & 0xF;
                int var13 = arg1 >> 8 & 0x7F;
                this.method1210(var13, var12, false);
            } else if (var3 == 224) {
                int var15 = arg1 & 0xF;
                int var16 = (arg1 >> 8 & 0x7F) + (arg1 >> 9 & 0x3F80);
                this.method1216(var16, var15, true);
            } else {
                int var14 = arg1 & 0xFF;
                if (var14 == 255) {
                    this.method1189(-1, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZILdk;)V", line = 983)
    public final void method1201(boolean arg0, int arg1, class215 arg2) {
        field3062++;
        int var4 = arg2.field3808.field4230.length;
        if (arg1 != 8) {
            return;
        }
        int var7;
        if (arg0 && arg2.field3808.field4232) {
            int var5 = var4 + var4 - arg2.field3808.field4231;
            int var6 = var4 << 8;
            var7 = (int) ((long) this.field3059[arg2.field3822] * (long) var5 >> 6);
            if (var7 >= var6) {
                var7 = var6 + var6 - var7 - 1;
                arg2.field3813.method1283(true);
            }
        } else {
            var7 = (int) ((long) this.field3059[arg2.field3822] * (long) var4 >> 6);
        }
        arg2.field3813.method1298(var7);
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(II)V", line = 1025)
    private final void method1202(int arg0, int arg1) {
        field3078++;
        if ((this.field3054[arg0] & 0x2) == arg1) {
            return;
        }
        for (class215 var3 = (class215) this.field3124.field3002.method13(arg1 ^ 0x0); var3 != null; var3 = (class215) this.field3124.field3002.method15((byte) 47)) {
            if (var3.field3822 == arg0 && this.field3061[arg0][var3.field3803] == null && var3.field3825 < 0) {
                var3.field3825 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ldk;I)I", line = 1055)
    private final int method1203(class215 arg0, int arg1) {
        field3069++;
        if (this.field3117[arg0.field3822] == 0) {
            return 0;
        }
        class297 var3 = arg0.field3816;
        int var4 = this.field3103[arg0.field3822] * this.field3060[arg0.field3822] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg0.field3802 * var5 + 16384 >> 15;
        int var7 = this.field3105 * var6 + 128 >> 8;
        int var8 = this.field3117[arg0.field3822] * var7 + 128 >> 8;
        if (var3.field5175 > 0) {
            var8 = (int) (Math.pow(0.5D, (double) arg0.field3806 * 1.953125E-5D * (double) var3.field5175) * (double) var8 + 0.5D);
        }
        if (arg1 != 203712776) {
            return -99;
        }
        if (var3.field5181 != null) {
            int var9 = var3.field5181[arg0.field3824 + 1];
            int var10 = arg0.field3815;
            if (arg0.field3824 < (var3.field5181.length - 2)) {
                int var11 = (var3.field5181[arg0.field3824] & 0xFF) << 8;
                int var12 = var3.field5181[arg0.field3824 + 2] & 0xFF << 8;
                var9 += (var3.field5181[arg0.field3824 + 3] - var9) * (var10 - var11) / (var12 - var11);
            }
            var8 = var8 * var9 + 32 >> 6;
        }
        if (arg0.field3825 > 0 && var3.field5177 != null) {
            int var13 = var3.field5177[arg0.field3823 + 1];
            int var14 = arg0.field3825;
            if (arg0.field3823 < var3.field5177.length - 2) {
                int var15 = var3.field5177[arg0.field3823] & 0xFF << 8;
                int var16 = var3.field5177[arg0.field3823 + 2] & 0xFF << 8;
                var13 += (var3.field5177[arg0.field3823 + 3] - var13) * (var14 - var15) / (var16 - var15);
            }
            var8 = var8 * var13 + 32 >> 6;
        }
        return var8;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIZ)V", line = 1126)
    private final void method1204(int arg0, int arg1, boolean arg2) {
        this.field3089[arg0] = arg1;
        if (!arg2) {
            this.field3125 = -55L;
        }
        this.field3079[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
        field3094++;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(Ldk;I)I", line = 1143)
    private final int method1205(class215 arg0, int arg1) {
        field3056++;
        int var3 = this.field3091[arg0.field3822];
        if (arg1 != 29388) {
            method1190(-50, 32);
        }
        return var3 >= 8192 ? 16384 - ((128 - arg0.field3818) * (16384 - var3) + 32 >> 6) : arg0.field3818 * var3 + 32 >> 6;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "()I", line = 1160)
    public final synchronized int method275() {
        field3084++;
        return 0;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "()Lec;", line = 1169)
    public final synchronized class40 method276() {
        field3120++;
        return null;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(III)V", line = 1178)
    public final synchronized void method1206(int arg0, int arg1, int arg2) {
        if (arg2 >= -91) {
            this.method272(59);
        }
        this.method1199(false, arg0, arg1);
        field3072++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLdk;)I", line = 1194)
    private final int method1207(byte arg0, class215 arg1) {
        field3082++;
        int var3 = arg1.field3821 + (arg1.field3831 * arg1.field3805 >> 12);
        int var4 = ((this.field3085[arg1.field3822] - 8192) * this.field3065[arg1.field3822] >> 12) + var3;
        class297 var5 = arg1.field3816;
        if (var5.field5178 > 0 && (var5.field5173 > 0 || this.field3093[arg1.field3822] > 0)) {
            int var6 = var5.field5173 << 2;
            int var7 = var5.field5170 << 1;
            if (arg1.field3826 < var7) {
                var6 = arg1.field3826 * var6 / var7;
            }
            int var8 = (this.field3093[arg1.field3822] >> 7) + var6;
            double var9 = Math.sin((double) (arg1.field3814 & 0x1FF) * 0.01227184630308513D);
            var4 += (int) ((double) var8 * var9);
        }
        if (arg0 < 59) {
            return 27;
        } else {
            int var11 = (int) ((double) (arg1.field3808.field4229 * 256) * Math.pow(2.0D, (double) var4 * 3.255208333333333E-4D) / (double) class210.field3755 + 0.5D);
            return var11 >= 1 ? var11 : 1;
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)V", line = 1230)
    public static void method1208(byte arg0) {
        if (arg0 != -33) {
            field3066 = (class108) null;
        }
        field3066 = null;
        field3102 = null;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V", line = 1242)
    public final synchronized void method1209(boolean arg0) {
        field3080++;
        class191 var2 = (class191) this.field3058.method1672(0);
        if (arg0) {
            this.field3108 = (int[]) null;
        }
        while (var2 != null) {
            var2.method1358(false);
            var2 = (class191) this.field3058.method1678(-124);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(IIZ)V", line = 1259)
    private final void method1210(int arg0, int arg1, boolean arg2) {
        field3076++;
        if (arg2) {
            this.method1205((class215) null, -106);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(IZ)V", line = 1274)
    private final synchronized void method1211(int arg0, boolean arg1) {
        this.field3095.method736();
        if (arg0 == -1980) {
            field3073++;
            this.field3130 = null;
            this.method1189(arg0 ^ 0x7BB, arg1);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()Lec;", line = 1288)
    public final synchronized class40 method270() {
        field3114++;
        return this.field3124;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(IIII)V", line = 1300)
    private final void method1212(int arg0, int arg1, int arg2, int arg3) {
        field3074++;
        class215 var5 = this.field3061[arg2][arg1];
        if (var5 == null) {
            return;
        }
        this.field3061[arg2][arg1] = null;
        if ((this.field3054[arg2] & 0x2) == 0) {
            var5.field3825 = 0;
        } else {
            for (class215 var6 = (class215) this.field3124.field3002.method13(0); var6 != null; var6 = (class215) this.field3124.field3002.method15((byte) 47)) {
                if (var5.field3822 == var6.field3822 && var6.field3825 < 0 && var5 != var6) {
                    var5.field3825 = 0;
                    break;
                }
            }
        }
        if (arg0 != -2013308888) {
            this.method1201(false, 76, (class215) null);
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)V", line = 1346)
    public static final void method1213(byte arg0) {
        for (int var1 = 0; var1 < class185.field3393; var1++) {
            class212 var2 = class177.method1251(0, var1);
            if (var2 != null && var2.field3781 == 0) {
                class271.field4734[var1] = 0;
                class261.field4594[var1] = 0;
            }
        }
        class155.field2792 = new class242(16);
        field3057++;
        if (arg0 > -11) {
            field3102 = (class262) null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V", line = 1372)
    public final synchronized void method1214(int arg0) {
        if (arg0 != 0) {
            this.method1202(97, 72);
        }
        this.method1211(-1980, true);
        field3121++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ldk;BII[I)Z", line = 1387)
    public final boolean method1215(class215 arg0, byte arg1, int arg2, int arg3, int[] arg4) {
        arg0.field3804 = class210.field3755 / 100;
        field3083++;
        if (arg0.field3825 >= 0 && (arg0.field3813 == null || arg0.field3813.method1284())) {
            arg0.method1476((byte) 120);
            arg0.method1325(0);
            if (arg0.field3812 > 0 && this.field3097[arg0.field3822][arg0.field3812] == arg0) {
                this.field3097[arg0.field3822][arg0.field3812] = null;
            }
            return true;
        }
        int var6 = arg0.field3831;
        if (var6 > 0) {
            int var7 = var6 - (int) (Math.pow(2.0D, (double) this.field3108[arg0.field3822] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var7 < 0) {
                var7 = 0;
            }
            arg0.field3831 = var7;
        }
        arg0.field3813.method1275(this.method1207((byte) 63, arg0));
        class297 var8 = arg0.field3816;
        arg0.field3814 += var8.field5178;
        arg0.field3826++;
        int var9 = 81 % ((-arg1 - 71) / 43);
        double var10 = (double) ((arg0.field3803 - 60 << 8) + (arg0.field3831 * arg0.field3805 >> 12)) * 5.086263020833333E-6D;
        boolean var12 = false;
        if (var8.field5175 > 0) {
            if (var8.field5171 > 0) {
                arg0.field3806 += (int) (Math.pow(2.0D, (double) var8.field5171 * var10) * 128.0D + 0.5D);
            } else {
                arg0.field3806 += 128;
            }
            if ((arg0.field3806 * var8.field5175) >= 819200) {
                var12 = true;
            }
        }
        if (var8.field5181 != null) {
            if (var8.field5182 <= 0) {
                arg0.field3815 += 128;
            } else {
                arg0.field3815 += (int) (Math.pow(2.0D, (double) var8.field5182 * var10) * 128.0D + 0.5D);
            }
            while (var8.field5181.length - 2 > arg0.field3824 && arg0.field3815 > ((var8.field5181[arg0.field3824 + 2] & 0xFF) << 8)) {
                arg0.field3824 += 2;
            }
            if ((var8.field5181.length - 2) == arg0.field3824 && var8.field5181[arg0.field3824 + 1] == 0) {
                var12 = true;
            }
        }
        if (arg0.field3825 >= 0 && var8.field5177 != null && (this.field3054[arg0.field3822] & 0x1) == 0 && (arg0.field3812 < 0 || this.field3097[arg0.field3822][arg0.field3812] != arg0)) {
            if (var8.field5179 > 0) {
                arg0.field3825 += (int) (Math.pow(2.0D, (double) var8.field5179 * var10) * 128.0D + 0.5D);
            } else {
                arg0.field3825 += 128;
            }
            while ((var8.field5177.length - 2) > arg0.field3823 && arg0.field3825 > ((var8.field5177[arg0.field3823 + 2] & 0xFF) << 8)) {
                arg0.field3823 += 2;
            }
            if (var8.field5177.length - 2 == arg0.field3823) {
                var12 = true;
            }
        }
        if (!var12) {
            arg0.field3813.method1276(arg0.field3804, this.method1203(arg0, 203712776), this.method1205(arg0, 29388));
            return false;
        }
        arg0.field3813.method1271(arg0.field3804);
        if (arg4 == null) {
            arg0.field3813.method272(arg2);
        } else {
            arg0.field3813.method271(arg4, arg3, arg2);
        }
        if (arg0.field3813.method1296()) {
            this.field3124.field3016.method2191(arg0.field3813);
        }
        arg0.method1476((byte) -117);
        if (arg0.field3825 >= 0) {
            arg0.method1325(0);
            if (arg0.field3812 > 0 && this.field3097[arg0.field3822][arg0.field3812] == arg0) {
                this.field3097[arg0.field3822][arg0.field3812] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(IIZ)V", line = 1509)
    private final void method1216(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method1196((class215) null, (byte) -24);
        }
        this.field3085[arg1] = arg0;
        field3090++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLpk;BZ)V", line = 1543)
    private final synchronized void method1217(boolean arg0, class112 arg1, byte arg2, boolean arg3) {
        this.method1211(-1980, arg3);
        field3107++;
        this.field3095.method742(arg1.field1949);
        this.field3125 = 0L;
        this.field3123 = arg0;
        int var5 = this.field3095.method728();
        if (arg2 < 108) {
            this.field3091 = (int[]) null;
        }
        for (int var6 = 0; var6 < var5; var6++) {
            this.field3095.method734(var6);
            this.field3095.method730(var6);
            this.field3095.method727(var6);
        }
        this.field3127 = this.field3095.method738();
        this.field3128 = this.field3095.field1848[this.field3127];
        this.field3126 = this.field3095.method733(this.field3128);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIB)V", line = 1599)
    private final void method1218(int arg0, int arg1, int arg2, byte arg3) {
        field3113++;
        int var5 = 52 % ((arg3 + 65) / 57);
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)Z", line = 1611)
    public final synchronized boolean method1219(int arg0) {
        field3088++;
        return arg0 >= -53 ? false : this.field3095.method741();
    }
}
