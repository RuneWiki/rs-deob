import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class86 extends class27 {

    @OriginalMember(owner = "client!hh", name = "eb", descriptor = "I")
    private int field1228 = 0;

    @OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
    private int field1227 = 0;

    @OriginalMember(owner = "client!hh", name = "gb", descriptor = "I")
    private int field1230 = 0;

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "Z")
    public static boolean field1219 = true;

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "[I")
    public static int[] field1218 = new int[14];

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "[I")
    public static int[] field1216 = new int[4];

    @OriginalMember(owner = "client!hh", name = "fb", descriptor = "[Ljava/lang/String;")
    public static String[] field1229 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "[I")
    public static int[] field1223 = new int[2];

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "Ljava/lang/String;")
    public static String field1221 = "Please remove ";

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "F")
    public static float field1222;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    private int field1217;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "[[I")
    public static int[][] field1209;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)V", line = 7)
    public static void method695(int arg0) {
        if (arg0 <= 19) {
            return;
        }
        field1218 = null;
        field1209 = (int[][]) null;
        field1229 = null;
        field1216 = null;
        field1221 = null;
        field1223 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIB)V", line = 23)
    private final void method696(int arg0, int arg1, int arg2, byte arg3) {
        field1212++;
        if (arg3 != 113) {
            field1216 = (int[]) null;
        }
        int var5 = arg2 < arg1 ? arg1 : arg2;
        int var6 = arg0 <= var5 ? var5 : arg0;
        int var7 = arg2 <= arg1 ? arg2 : arg1;
        int var8 = var7 > arg0 ? arg0 : var7;
        this.field1215 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (this.field1215 > 0 && this.field1215 < 4096) {
            this.field1217 = (var9 << 12) / (this.field1215 <= 2048 ? this.field1215 * 2 : 8192 - (this.field1215 * 2));
        } else {
            this.field1217 = 0;
        }
        if (var9 <= 0) {
            this.field1210 = 0;
            return;
        }
        int var10 = (var6 - arg1 << 12) / var9;
        int var11 = (var6 - arg0 << 12) / var9;
        int var12 = (var6 - arg2 << 12) / var9;
        if (arg1 == var6) {
            this.field1210 = arg2 == var8 ? var11 + 20480 : -var12 + 4096;
        } else if (arg2 == var6) {
            this.field1210 = arg0 == var8 ? var10 + 4096 : 12288 - var11;
        } else {
            this.field1210 = arg1 == var8 ? var12 + 12288 : -var10 + 20480;
        }
        this.field1210 /= 6;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[[I", line = 81)
    public final int[][] method19(int arg0, int arg1) {
        field1224++;
        if (arg0 != -28941) {
            this.method23(5, (class190) null, -2);
        }
        int[][] var3 = this.field379.method668(arg1, 0);
        if (this.field379.field1171) {
            int[][] var4 = this.method168(0, -124, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class209.field3053; var11++) {
                this.method696(var7[var11], var5[var11], var6[var11], (byte) 113);
                this.field1217 += this.field1230;
                for (this.field1210 += this.field1227; this.field1210 < 0; this.field1210 += 4096) {
                }
                this.field1215 += this.field1228;
                if (this.field1217 < 0) {
                    this.field1217 = 0;
                }
                if (this.field1217 > 4096) {
                    this.field1217 = 4096;
                }
                if (this.field1215 < 0) {
                    this.field1215 = 0;
                }
                while (this.field1210 > 4096) {
                    this.field1210 -= 4096;
                }
                if (this.field1215 > 4096) {
                    this.field1215 = 4096;
                }
                this.method698((byte) 108, this.field1217, this.field1210, this.field1215);
                var8[var11] = this.field1213;
                var9[var11] = this.field1211;
                var10[var11] = this.field1220;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILsb;I)V", line = 172)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1227 = arg1.method1347((byte) 61);
        } else if (arg2 == 1) {
            this.field1230 = (arg1.method1322(9813) << 12) / 100;
        } else if (arg2 == 2) {
            this.field1228 = (arg1.method1322(9813) << 12) / 100;
        }
        field1225++;
        if (arg0 != -5836) {
            field1208 = 39;
        }
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)V", line = 205)
    public static final void method697(int arg0) {
        class3.field101 = 0;
        class358.field5478 = 0;
        class352.field5426 = 0;
        class214.field3088 = 0;
        class50.field757 = false;
        field1214++;
        if (arg0 != -1) {
            method697(-127);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BIII)V", line = 240)
    private final void method698(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 107) {
            this.method698((byte) -74, 40, 95, -88);
        }
        field1226++;
        int var5 = arg3 > 2048 ? arg1 + arg3 - (arg1 * arg3 >> 12) : (arg1 + 4096) * arg3 >> 12;
        if (var5 <= 0) {
            this.field1213 = this.field1211 = this.field1220 = arg3;
            return;
        }
        int var6 = arg2 * 6;
        int var7 = arg3 + arg3 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var9 = var6 >> 12;
        int var10 = var6 - (var9 << 12);
        int var12 = var8 * var5 >> 12;
        int var13 = var10 * var12 >> 12;
        int var14 = var5 - var13;
        int var15 = var7 + var13;
        if (var9 == 0) {
            this.field1211 = var15;
            this.field1220 = var7;
            this.field1213 = var5;
        } else if (var9 == 1) {
            this.field1213 = var14;
            this.field1211 = var5;
            this.field1220 = var7;
        } else if (var9 == 2) {
            this.field1213 = var7;
            this.field1220 = var15;
            this.field1211 = var5;
        } else if (var9 == 3) {
            this.field1211 = var14;
            this.field1213 = var7;
            this.field1220 = var5;
        } else if (var9 == 4) {
            this.field1220 = var5;
            this.field1211 = var7;
            this.field1213 = var15;
        } else if (var9 == 5) {
            this.field1213 = var5;
            this.field1220 = var14;
            this.field1211 = var7;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 363)
    public class86() {
        super(1, false);
    }
}
