import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class88 extends class115 {

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    private int field1360 = 3216;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    private int field1373 = 4096;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "[I")
    private int[] field1363 = new int[3];

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    private int field1367 = 3216;

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lqe;")
    public static class168 field1374 = class66.method448("Abbrechen", -114);

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lnh;")
    public static class112 field1370;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "Loe;")
    public static class256 field1368;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "Lgd;")
    public static class65 field1361;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        if (arg1 < 37) {
            this.method170(-101);
        }
        ++field1364;
        int[] var3 = super.field1872.method182((byte) -118, arg0);
        if (super.field1872.field341) {
            int var4 = class71.field1094 * this.field1373 >> 12;
            int[] var5 = this.method792(0, 0, arg0 + -1 & class38.field522);
            int[] var6 = this.method792(0, 0, arg0);
            int[] var7 = this.method792(0, 0, arg0 + 1 & class38.field522);
            for (int var8 = 0; class130.field2297 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                int var11 = (var6[class134.field2350 & var8 + -1] - var6[var8 - -1 & class134.field2350]) * var4 >> 12;
                if (~var10 > -1) {
                    var10 = -var10;
                }
                if (~var10 < -256) {
                    var10 = 255;
                }
                int var12 = var11 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class199.field3445[var12 - -((var10 - -1) * var10 >> 1)] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var11 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field1363[2] * var14 >> 12;
                int var18 = this.field1363[1] * var16 >> 12;
                int var19 = this.field1363[0] * var15 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
    public final void method170(int arg0) {
        if (arg0 == 395462996) {
            ++field1365;
            this.method586((byte) 124);
        }
    }

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "(I)I")
    public static final int method583(int arg0) {
        if (arg0 != -3) {
            return 72;
        } else {
            ++field1375;
            return class123.field2026;
        }
    }

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "(I)V")
    public static void method584(int arg0) {
        field1368 = null;
        field1370 = null;
        if (arg0 == 2) {
            field1361 = null;
            field1374 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIZIIBI)Z")
    public static final boolean method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, byte arg10, int arg11) {
        ++field1371;
        if (arg10 != 26) {
            method583(-33);
        }
        if (~class7.field85.field171 != -3) {
            return ~class7.field85.field171 < -3 ? class70.method480(arg7, arg4, arg0, class7.field85.field171, arg8, arg1, arg2, arg11, arg3, arg6, arg5, 78, arg9) : class214.method1382(arg0, arg11, arg4, arg1, arg2, arg5, arg3, arg6, -37, arg7, arg9, arg8);
        } else {
            return class245.method1609(arg2, arg11, arg1, arg3, arg9, (byte) -76, arg5, arg6, arg7, arg4, arg8, arg0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
    private final void method586(byte arg0) {
        ++field1366;
        double var2 = Math.cos((double) ((float) this.field1367 / 4096.0F));
        this.field1363[0] = (int) (Math.sin((double) ((float) this.field1360 / 4096.0F)) * var2 * 4096.0D);
        int var4 = -47 % ((39 - arg0) / 46);
        this.field1363[1] = (int) (4096.0D * Math.cos((double) ((float) this.field1360 / 4096.0F)) * var2);
        this.field1363[2] = (int) (4096.0D * Math.sin((double) ((float) this.field1367 / 4096.0F)));
        int var5 = this.field1363[1] * this.field1363[1] >> 12;
        int var6 = this.field1363[2] * this.field1363[2] >> 12;
        int var7 = this.field1363[0] * this.field1363[0] >> 12;
        int var8 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var7 >> 12)));
        if (~var8 != -1) {
            this.field1363[2] = (this.field1363[2] << 12) / var8;
            this.field1363[0] = (this.field1363[0] << 12) / var8;
            this.field1363[1] = (this.field1363[1] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg0 != 107) {
            this.method170(-8);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field1367 = arg1.method731(false);
                }
            } else {
                this.field1360 = arg1.method731(false);
            }
        } else {
            this.field1373 = arg1.method731(false);
        }
        ++field1369;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class88() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public static final void method587(int arg0) {
        class65.field910.method14(false);
        ++field1359;
        if (arg0 != 25024) {
            field1370 = null;
        }
    }
}
