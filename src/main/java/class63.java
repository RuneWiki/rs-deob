import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class class63 extends class95 {

    @OriginalMember(owner = "gb", name = "kb", descriptor = "Z")
    private boolean field1214 = false;

    @OriginalMember(owner = "gb", name = "zb", descriptor = "I")
    private int field1229 = 0;

    @OriginalMember(owner = "gb", name = "yb", descriptor = "I")
    private int field1228 = 0;

    @OriginalMember(owner = "gb", name = "Bb", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "gb", name = "cb", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "gb", name = "Eb", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "gb", name = "Cb", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "gb", name = "vb", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "gb", name = "db", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "gb", name = "ob", descriptor = "I")
    public int field1218;

    @OriginalMember(owner = "gb", name = "Ab", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "gb", name = "ab", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "gb", name = "ub", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "gb", name = "Gb", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "gb", name = "sb", descriptor = "Lbi;")
    private class20 field1222;

    @OriginalMember(owner = "gb", name = "fb", descriptor = "I")
    public static int field1209 = 0;

    @OriginalMember(owner = "gb", name = "rb", descriptor = "I")
    public static int field1221 = 0;

    @OriginalMember(owner = "gb", name = "eb", descriptor = "D")
    private double field1208;

    @OriginalMember(owner = "gb", name = "gb", descriptor = "D")
    private double field1210;

    @OriginalMember(owner = "gb", name = "mb", descriptor = "D")
    private double field1216;

    @OriginalMember(owner = "gb", name = "nb", descriptor = "D")
    private double field1217;

    @OriginalMember(owner = "gb", name = "qb", descriptor = "D")
    public double field1220;

    @OriginalMember(owner = "gb", name = "tb", descriptor = "D")
    public double field1223;

    @OriginalMember(owner = "gb", name = "wb", descriptor = "D")
    public double field1226;

    @OriginalMember(owner = "gb", name = "Db", descriptor = "D")
    private double field1233;

    @OriginalMember(owner = "gb", name = "bb", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "gb", name = "hb", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "gb", name = "ib", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "gb", name = "jb", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "gb", name = "lb", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "gb", name = "pb", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "gb", name = "xb", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "gb", name = "Fb", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "gb", name = "a", descriptor = "(ZI)V")
    public static final void method408(boolean arg0, int arg1) {
        if (class157.field2955.field3549 >> 7 == class41.field860 && class157.field2955.field3609 >> 7 == class95.field1944) {
            class41.field860 = 0;
        }
        field1213++;
        int var2 = class157.field2956;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = arg1; var3 < var2; var3++) {
            long var4;
            class184 var6;
            if (arg0) {
                var6 = class157.field2955;
                var4 = 8791798054912L;
            } else {
                var4 = (long) class125.field2405[var3] << 32;
                var6 = class202.field3975[class125.field2405[var3]];
            }
            if (var6 != null && var6.method996(0)) {
                int var7 = var6.field3549 >> 7;
                var6.field3457 = false;
                if ((class181.field3420 && class157.field2956 > 50 || class157.field2956 > 200) && !arg0 && var6.field3579 == var6.field3544) {
                    var6.field3457 = true;
                }
                int var8 = var6.field3609 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field3456 == null || var6.field3483 > class143.field2754 || var6.field3466 <= class143.field2754) {
                        if ((var6.field3549 & 0x7F) == 64 && (var6.field3609 & 0x7F) == 64) {
                            if (class84.field1710[var7][var8] == class55.field1115) {
                                continue;
                            }
                            class84.field1710[var7][var8] = class55.field1115;
                        }
                        var6.field3584 = class19.method180(var6.field3609, false, class72.field1405, var6.field3549);
                        class95.method684(class72.field1405, var6.field3549, var6.field3609, var6.field3584, 60, var6, var6.field3556, var4, var6.field3601);
                    } else {
                        var6.field3457 = false;
                        var6.field3584 = class19.method180(var6.field3609, false, class72.field1405, var6.field3549);
                        class140.method1002(class72.field1405, var6.field3549, var6.field3609, var6.field3584, var6, var6.field3556, var4, var6.field3458, var6.field3449, var6.field3447, var6.field3472);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(IIIII)V")
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1212++;
        if (!this.field1214) {
            double var6 = (double) (arg4 - this.field1207);
            double var8 = (double) (arg2 - this.field1236);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1223 = (double) this.field1225 * var8 / var10 + (double) this.field1236;
            this.field1226 = (double) this.field1225 * var6 / var10 + (double) this.field1207;
            this.field1220 = this.field1231;
        }
        double var12 = (double) (this.field1234 + 1 - arg0);
        this.field1216 = ((double) arg2 - this.field1223) / var12;
        this.field1210 = ((double) arg4 - this.field1226) / var12;
        this.field1233 = Math.sqrt(this.field1216 * this.field1216 + this.field1210 * this.field1210);
        if (arg1 > 7) {
            if (!this.field1214) {
                this.field1208 = -this.field1233 * Math.tan((double) this.field1204 * 0.02454369D);
            }
            this.field1217 = ((double) arg3 - this.field1220 - this.field1208 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IB)V")
    public final void method410(int arg0, byte arg1) {
        this.field1223 += (double) arg0 * this.field1216;
        field1227++;
        this.field1214 = true;
        this.field1226 += (double) arg0 * this.field1210;
        this.field1220 += this.field1217 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1208;
        this.field1208 += (double) arg0 * this.field1217;
        this.field1215 = (int) (Math.atan2(this.field1210, this.field1216) * 325.949D) + 1024 & 0x7FF;
        this.field1235 = (int) (Math.atan2(this.field1208, this.field1233) * 325.949D) & 0x7FF;
        int var3 = 92 % ((arg1 - 42) / 34);
        if (this.field1222 == null) {
            return;
        }
        this.field1228 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1222.field442[this.field1229] >= this.field1228) {
                        return;
                    }
                    this.field1228 -= this.field1222.field442[this.field1229];
                    this.field1229++;
                } while (this.field1222.field440.length > this.field1229);
                this.field1229 -= this.field1222.field454;
            } while (this.field1229 >= 0 && this.field1222.field440.length > this.field1229);
            this.field1229 = 0;
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(I)Lue;")
    public final class189 method177(int arg0) {
        field1205++;
        int var2 = -56 / ((61 - arg0) / 46);
        class111 var3 = class193.method1297(this.field1224, -18753);
        class189 var4 = var3.method822(this.field1229, 127);
        if (var4 == null) {
            return null;
        } else {
            var4.method1275(this.field1235);
            return var4;
        }
    }

    @OriginalMember(owner = "gb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1231 = arg4;
        this.field1206 = arg10;
        this.field1234 = arg6;
        this.field1232 = arg9;
        this.field1225 = arg8;
        this.field1207 = arg2;
        this.field1218 = arg1;
        this.field1230 = arg5;
        this.field1204 = arg7;
        this.field1214 = false;
        this.field1224 = arg0;
        this.field1236 = arg3;
        int var12 = class193.method1297(this.field1224, -18753).field2207;
        if (var12 == -1) {
            this.field1222 = null;
        } else {
            this.field1222 = client.method246(12, var12);
        }
    }
}
