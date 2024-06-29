import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class68 extends class23 {

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    private int field1298 = 1024;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    private int field1297 = 8;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    private int field1295 = 409;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
    private int field1302 = 204;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    private int field1304 = 4;

    @OriginalMember(owner = "client!ij", name = "eb", descriptor = "I")
    private int field1308 = 81;

    @OriginalMember(owner = "client!ij", name = "hb", descriptor = "I")
    private int field1311 = 0;

    @OriginalMember(owner = "client!ij", name = "ib", descriptor = "I")
    private int field1312 = 1024;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "Llc;")
    public static class143 field1293 = class66.method374("<col=ffffff>", -1);

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "Llc;")
    public static class143 field1299 = class66.method374("(U0a )2 non)2existant gosub script)2num: ", -1);

    @OriginalMember(owner = "client!ij", name = "cb", descriptor = "[[I")
    public static int[][] field1306 = new int[104][104];

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ij", name = "bb", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ij", name = "fb", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ij", name = "gb", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "[I")
    private int[] field1288;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "[[I")
    private int[][] field1289;

    @OriginalMember(owner = "client!ij", name = "db", descriptor = "[[I")
    private int[][] field1307;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
    public static void method395(int arg0) {
        field1293 = null;
        field1306 = null;
        field1299 = null;
        if (arg0 != -7) {
            field1293 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V")
    public final void method85(byte arg0) {
        this.method397((byte) 113);
        ++field1292;
        int var2 = 113 / ((22 - arg0) / 60);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field1303;
        if (!arg2) {
            this.method86(77, -84);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (~arg1 == -8) {
                                        this.field1312 = arg0.method1275(128);
                                    }
                                } else {
                                    this.field1308 = arg0.method1275(128);
                                }
                            } else {
                                this.field1311 = arg0.method1275(128);
                            }
                        } else {
                            this.field1298 = arg0.method1275(128);
                        }
                    } else {
                        this.field1302 = arg0.method1275(128);
                    }
                } else {
                    this.field1295 = arg0.method1275(128);
                }
            } else {
                this.field1297 = arg0.method1265(122);
            }
        } else {
            this.field1304 = arg0.method1265(126);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIJ[I)Llc;")
    public static final class143 method396(int arg0, int arg1, long arg2, int[] arg3) {
        if (arg0 != 204) {
            return null;
        } else {
            ++field1305;
            if (class79.field1442 != null) {
                class143 var5 = class79.field1442.method737(arg1, -116, arg2, arg3);
                if (var5 != null) {
                    return var5;
                }
            }
            return ~arg1 == -6 ? class64.method364((byte) 97, arg2).method878(arg0 ^ -27914) : class218.method1495(arg2, 10);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field1301;
        if (arg0 > -13) {
            field1299 = null;
        }
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int var4 = 0;
            int var5;
            for (var5 = class31.field495[arg1] + this.field1311; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field1297 > var4 && ~this.field1288[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field1288[var4];
            int var9 = this.field1288[var4 + -1];
            if (var5 > this.field1300 + var9 && ~(-this.field1300 + var8) < ~var5) {
                for (int var10 = 0; class72.field1359 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field1298 : this.field1298;
                    int var13;
                    for (var13 = class3.field43[var10] - -(this.field1290 * var12 >> 12); ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~this.field1304 < ~var11 && this.field1289[var6][var11] <= var13) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field1289[var6][var14];
                    int var16 = this.field1289[var6][var11];
                    if (var13 > var15 - -this.field1300 && var13 < -this.field1300 + var16) {
                        var3[var10] = this.field1307[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class275.method1812(var3, 0, class72.field1359, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)V")
    private final void method397(byte arg0) {
        ++field1294;
        Random var2 = new Random((long) this.field1297);
        this.field1307 = new int[this.field1297][this.field1304];
        this.field1289 = new int[this.field1297][this.field1304 + 1];
        this.field1300 = this.field1308 / 2;
        this.field1310 = 4096 / this.field1297;
        this.field1290 = 4096 / this.field1304;
        int var3 = this.field1310 / 2;
        this.field1288 = new int[this.field1297 + 1];
        this.field1288[0] = 0;
        int var4 = this.field1290 / 2;
        if (arg0 > 64) {
            for (int var5 = 0; var5 < this.field1297; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field1310;
                    int var7 = (-2048 + class139.method834((byte) -54, 4096, var2)) * this.field1302 >> 12;
                    int var8 = (var3 * var7 >> 12) + var6;
                    this.field1288[var5] = this.field1288[var5 - 1] + var8;
                }
                this.field1289[var5][0] = 0;
                for (int var9 = 0; ~this.field1304 < ~var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field1290;
                        int var11 = (class139.method834((byte) -54, 4096, var2) - 2048) * this.field1295 >> 12;
                        int var12 = (var4 * var11 >> 12) + var10;
                        this.field1289[var5][var9] = this.field1289[var5][var9 + -1] + var12;
                    }
                    this.field1307[var5][var9] = this.field1312 <= 0 ? 4096 : 4096 + -class139.method834((byte) -54, this.field1312, var2);
                }
                this.field1289[var5][this.field1304] = 4096;
            }
            this.field1288[this.field1297] = 4096;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class68() {
        super(0, true);
    }
}
