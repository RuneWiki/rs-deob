import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class127 extends class43 {

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
    private int field2355 = 4;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "I")
    private int field2359 = 4;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "Lmb;")
    public static class132 field2353 = class166.method1092("Ung-Ultige Session)2ID)3", 114);

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "Lpb;")
    public static class165 field2360;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "[Lii;")
    public static class96[] field2352;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)V")
    public static void method833(boolean arg0) {
        field2353 = null;
        field2352 = null;
        field2360 = null;
        if (arg0) {
            field2360 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)Lmb;")
    public static final class132 method834(int arg0, boolean arg1) {
        ++field2358;
        if (arg1) {
            return null;
        } else {
            return class95.field1679[arg0].method902((byte) -4) <= 0 ? class8.field82[arg0] : class187.method1197(new class132[] { class8.field82[arg0], class231.field4173, class95.field1679[arg0] }, -123);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field2354;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            int var4 = class42.field689 / this.field2359;
            int var5 = class131.field2427 / this.field2355;
            int[] var6;
            if (~var4 >= -1) {
                var6 = this.method300(arg1 + 69, 0, 0);
            } else {
                int var7 = arg0 % var4;
                var6 = this.method300(-117, 0, class42.field689 * var7 / var4);
            }
            for (int var8 = 0; var8 < class131.field2427; ++var8) {
                if (var5 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var5;
                    var3[var8] = var6[class131.field2427 * var9 / var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        if (arg0 != -1893) {
            return null;
        } else {
            int[][] var3 = super.field764.method1350((byte) 125, arg1);
            if (super.field764.field3960) {
                int var4 = class131.field2427 / this.field2355;
                int var5 = class42.field689 / this.field2359;
                int[][] var7;
                if (~var5 < -1) {
                    int var6 = arg1 % var5;
                    var7 = this.method301(class42.field689 * var6 / var5, (byte) 55, 0);
                } else {
                    var7 = this.method301(0, (byte) 87, 0);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[1];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; ~class131.field2427 < ~var14; ++var14) {
                    int var15;
                    if (var4 <= 0) {
                        var15 = 0;
                    } else {
                        int var16 = var14 % var4;
                        var15 = class131.field2427 * var16 / var4;
                    }
                    var11[var14] = var8[var15];
                    var12[var14] = var9[var15];
                    var13[var14] = var10[var15];
                }
            }
            ++field2356;
            return var3;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class127() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(III)V")
    public static final void method835(int arg0, int arg1, int arg2) {
        class169 var3 = class101.field1900[arg0][arg1][arg2];
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field3096; ++var4) {
                class78 var5 = var3.field3103[var4];
                if ((var5.field1355 >> 29 & 3L) == 2L && var5.field1353 == arg1 && var5.field1362 == arg2) {
                    class130.method854(var5);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)V")
    public static final void method836(int arg0, int arg1) {
        if (arg0 == -1 && !class182.field3345) {
            class208.method1289((byte) 81);
        } else if (~arg0 != 0 && (~class182.field3335 != ~arg0 || !class55.method375(true)) && ~class104.field1951 != -1 && !class182.field3345) {
            class192.method1226(class69.field1161, class104.field1951, arg0, false, true, 0, 2);
        }
        class182.field3335 = arg0;
        ++field2357;
        if (arg1 != 2) {
            field2353 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg1 != -73) {
            this.field2355 = 72;
        }
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field2359 = arg2.method716(arg1 + -1235);
            }
        } else {
            this.field2355 = arg2.method716(-1308);
        }
        ++field2361;
    }
}
