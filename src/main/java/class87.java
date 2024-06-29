import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class87 extends class273 {

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    private int field1308 = 0;

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "I")
    private int field1317 = 0;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "I")
    private int field1315 = 0;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!qh", name = "X", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!qh", name = "Y", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client!qh", name = "Z", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!qh", name = "ab", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "[Lph;")
    public static class79[] field1305;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V", line = 8)
    private final void method592(int arg0, int arg1, int arg2, int arg3) {
        field1320++;
        int var5 = arg2 > arg1 ? arg2 : arg1;
        int var6 = var5 < arg3 ? arg3 : var5;
        int var7 = arg2 >= arg1 ? arg1 : arg2;
        int var8 = var7 > arg3 ? arg3 : var7;
        int var9 = var6 - var8;
        if (arg0 < 103) {
            this.method592(-115, 124, 114, 45);
        }
        if (var9 > 0) {
            int var10 = (var6 - arg2 << 12) / var9;
            int var11 = (var6 - arg1 << 12) / var9;
            int var12 = (var6 - arg3 << 12) / var9;
            if (arg2 == var6) {
                this.field1319 = arg1 == var8 ? var12 + 20480 : -var11 + 4096;
            } else if (arg1 == var6) {
                this.field1319 = arg3 == var8 ? var10 + 4096 : 12288 - var12;
            } else {
                this.field1319 = arg2 == var8 ? var11 + 12288 : -var10 + 20480;
            }
            this.field1319 /= 6;
        } else {
            this.field1319 = 0;
        }
        this.field1312 = (var6 + var8) / 2;
        if (this.field1312 > 0 && this.field1312 < 4096) {
            this.field1309 = (var9 << 12) / (this.field1312 <= 2048 ? this.field1312 * 2 : 8192 - this.field1312 * 2);
        } else {
            this.field1309 = 0;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BILgn;)V", line = 62)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg0 < 27) {
            this.field1312 = -28;
        }
        if (arg1 == 0) {
            this.field1315 = arg2.method2042(7);
        } else if (arg1 == 1) {
            this.field1317 = (arg2.method2001(-3) << 12) / 100;
        } else if (arg1 == 2) {
            this.field1308 = (arg2.method2001(-3) << 12) / 100;
        }
        field1310++;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 213)
    public class87() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)V", line = 111)
    public static final void method593(int arg0) {
        field1314++;
        if (arg0 == 0) {
            class132.field2089.method1298((byte) 110);
            class274.field4214.method1298((byte) 110);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)[[I", line = 127)
    public final int[][] method170(int arg0, byte arg1) {
        if (arg1 != 68) {
            this.field1318 = -5;
        }
        field1307++;
        int[][] var3 = this.field4200.method539(arg1 + 84, arg0);
        if (this.field4200.field1147) {
            int[][] var4 = this.method1795(arg0, -126, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class27.field346; var11++) {
                this.method592(119, var7[var11], var5[var11], var6[var11]);
                this.field1309 += this.field1317;
                this.field1312 += this.field1308;
                for (this.field1319 += this.field1315; this.field1319 < 0; this.field1319 += 4096) {
                }
                if (this.field1312 < 0) {
                    this.field1312 = 0;
                }
                while (this.field1319 > 4096) {
                    this.field1319 -= 4096;
                }
                if (this.field1312 > 4096) {
                    this.field1312 = 4096;
                }
                if (this.field1309 < 0) {
                    this.field1309 = 0;
                }
                if (this.field1309 > 4096) {
                    this.field1309 = 4096;
                }
                this.method595(1, this.field1312, this.field1319, this.field1309);
                var9[var11] = this.field1318;
                var8[var11] = this.field1306;
                var10[var11] = this.field1313;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V", line = 203)
    public static void method594(int arg0) {
        field1305 = null;
        if (arg0 < 60) {
            method593(-120);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(IIII)V", line = 225)
    private final void method595(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1) {
            this.method167((byte) -79, 124, (class303) null);
        }
        field1321++;
        int var5 = arg1 > 2048 ? arg1 + arg3 - (arg1 * arg3 >> 12) : (arg3 + 4096) * arg1 >> 12;
        if (var5 <= 0) {
            this.field1318 = this.field1306 = this.field1313 = arg1;
            return;
        }
        int var6 = arg1 + arg1 - var5;
        int var7 = (var5 - var6 << 12) / var5;
        int var8 = arg2 * 6;
        int var10 = var7 * var5 >> 12;
        int var11 = var8 >> 12;
        int var12 = var8 - (var11 << 12);
        int var13 = var10 * var12 >> 12;
        int var14 = var6 + var13;
        int var15 = var5 - var13;
        if (var11 == 0) {
            this.field1318 = var5;
            this.field1306 = var14;
            this.field1313 = var6;
        } else if (var11 == 1) {
            this.field1318 = var15;
            this.field1306 = var5;
            this.field1313 = var6;
        } else if (var11 == 2) {
            this.field1318 = var6;
            this.field1306 = var5;
            this.field1313 = var14;
        } else if (var11 == 3) {
            this.field1313 = var5;
            this.field1306 = var15;
            this.field1318 = var6;
        } else if (var11 == 4) {
            this.field1306 = var6;
            this.field1313 = var5;
            this.field1318 = var14;
        } else if (var11 == 5) {
            this.field1318 = var5;
            this.field1306 = var6;
            this.field1313 = var15;
        }
    }
}
