import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class430 extends class30 {

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "[Ljg;")
    public static class186[] field6327 = new class186[2048];

    @OriginalMember(owner = "client!cp", name = "T", descriptor = "Ljava/lang/String;")
    public static String field6332 = "Members object";

    @OriginalMember(owner = "client!cp", name = "P", descriptor = "J")
    public static long field6328 = 0L;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!cp", name = "S", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!cp", name = "U", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!cp", name = "V", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!cp", name = "W", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!cp", name = "X", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!cp", name = "Y", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "Lmo;")
    public static class447 field6326;

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "Ljava/lang/String;")
    public static String field6323;

    @OriginalMember(owner = "client!cp", name = "R", descriptor = "[Lhf;")
    private class224[] field6330;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method2662(byte arg0, String arg1, boolean arg2) {
        ++field6336;
        class56.field698.field6510 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; ~var6 > ~class308.field4880; ++var6) {
            class97 var9 = class155.method1092(true, var6);
            if ((!arg2 || var9.field1337) && var9.field1291 == -1 && ~var9.field1296 == 0 && var9.field1324 == 0 && var9.field1370.toLowerCase().indexOf(var3) != -1) {
                if (~var5 <= -251) {
                    class32.field400 = -1;
                    class81.field1008 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; ~var5 < ~var11; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        if (arg0 <= 44) {
            field6323 = null;
        }
        class81.field1008 = var4;
        class334.field5215 = 0;
        class32.field400 = var5;
        String[] var7 = new String[class32.field400];
        for (int var8 = 0; ~var8 > ~class32.field400; ++var8) {
            var7[var8] = class155.method1092(true, var4[var8]).field1370;
        }
        class117.method851(var7, -1, class81.field1008);
        class56.field698.method2774(-10298);
        class56.field698.field6510 = 2;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)[[I")
    public final int[][] method203(byte arg0, int arg1) {
        ++field6334;
        if (arg0 != -93) {
            method2665(58, -127, 105);
        }
        int[][] var3 = super.field360.method2803(arg1, true);
        if (super.field360.field6566) {
            int var4 = class369.field5610;
            int var5 = class312.field4921;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field360.method2801(14371);
            this.method2663(var6, (byte) -81);
            for (int var8 = 0; var8 < class312.field4921; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class369.field5610; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class37.method242(4080, var15 << 4);
                    var12[var14] = class37.method242(var15, 65280) >> 4;
                    var11[var14] = class37.method242(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        ++field6325;
        if (arg1 < 49) {
            this.field6330 = null;
        }
        int[] var3 = super.field371.method2367((byte) -83, arg0);
        if (super.field371.field5586) {
            this.method2663(super.field371.method2364(19215), (byte) -98);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field376 = arg0.method1322(false) == 1;
            }
        } else {
            this.field6330 = new class224[arg0.method1322(false)];
            for (int var4 = 0; ~this.field6330.length < ~var4; ++var4) {
                int var5 = arg0.method1322(false);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field6330[var4] = class196.method1379(125, arg0);
                            }
                        } else {
                            this.field6330[var4] = class306.method2059(5, arg0);
                        }
                    } else {
                        this.field6330[var4] = class359.method2337(arg0, class121.method873(arg1, -1258));
                    }
                } else {
                    this.field6330[var4] = class61.method402(false, arg0);
                }
            }
        }
        if (arg1 != 6456) {
            field6328 = 49L;
        }
        ++field6333;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "([[IB)V")
    private final void method2663(int[][] arg0, byte arg1) {
        ++field6331;
        int var3 = class369.field5610;
        int var4 = class312.field4921;
        class297.method2006(false, arg0);
        int var5 = -109 % ((28 - arg1) / 52);
        class302.method2028((byte) 33, 0, class246.field4033, class106.field1492, 0);
        if (this.field6330 != null) {
            for (int var6 = 0; ~var6 > ~this.field6330.length; ++var6) {
                class224 var7 = this.field6330[var6];
                int var8 = var7.field3731;
                int var9 = var7.field3730;
                if (~var8 <= -1) {
                    if (~var9 <= -1) {
                        var7.method299(var3, var4, -1011);
                    } else {
                        var7.method298(var3, var4, true);
                    }
                } else if (var9 >= 0) {
                    var7.method302(-1011, var3, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
    public class430() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "(B)V")
    public static void method2664(byte arg0) {
        field6326 = null;
        field6327 = null;
        int var1 = -45 / ((26 - arg0) / 46);
        field6332 = null;
        field6323 = null;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)Lfn;")
    public static final class72 method2665(int arg0, int arg1, int arg2) {
        ++field6329;
        class72 var3 = new class72();
        if (arg0 != 0) {
            method2662((byte) -42, (String) null, false);
        }
        var3.field891 = arg1 + 1 - -5;
        var3.field911 = -1;
        var3.field896 = -1;
        var3.field908 = arg2 - -1 + 5;
        var3.field889 = new int[var3.field891][var3.field908];
        var3.method465(2097152);
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
    public static final void method2666(int arg0, int arg1) {
        ++field6337;
        class211 var2 = class281.method1921(arg0, arg1, (byte) -105);
        var2.method1489((byte) -100);
    }
}
