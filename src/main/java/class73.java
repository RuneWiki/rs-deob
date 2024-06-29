import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class73 extends class270 {

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public static int field1111 = 0;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "Lmh;")
    private static class62 field1115 = class201.method1405(true, "Use");

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "[F")
    public static float[] field1119 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!l", name = "V", descriptor = "Lmh;")
    public static class62 field1114 = class201.method1405(true, ":tradereq:");

    @OriginalMember(owner = "client!l", name = "U", descriptor = "Lmh;")
    public static class62 field1113 = field1115;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!l", name = "db", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!l", name = "gb", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!l", name = "hb", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "[Lrf;")
    private class46[] field1112;

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "[[Lmk;")
    public static class224[][] field1124;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lmi;II)V", line = 6)
    public final void method8(class92 arg0, int arg1, int arg2) {
        int var4 = 110 / ((arg2 + 8) / 53);
        if (arg1 == 0) {
            this.field1112 = new class46[arg0.method702(-1)];
            for (int var5 = 0; var5 < this.field1112.length; var5++) {
                int var6 = arg0.method702(-1);
                if (var6 == 0) {
                    this.field1112[var5] = class170.method1222((byte) 20, arg0);
                } else if (var6 == 1) {
                    this.field1112[var5] = class197.method1379(arg0, false);
                } else if (var6 == 2) {
                    this.field1112[var5] = class297.method2008((byte) -109, arg0);
                } else if (var6 == 3) {
                    this.field1112[var5] = class283.method1925(-11844, arg0);
                }
            }
        } else if (arg1 == 1) {
            this.field4588 = arg0.method702(-1) == 1;
        }
        field1126++;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(II)Z", line = 80)
    public static final boolean method521(int arg0, int arg1) {
        if (arg1 != 0) {
            method526((byte) 21);
        }
        field1120++;
        return (arg0 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 90)
    public class73() {
        super(0, true);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V", line = 94)
    public static void method522(int arg0) {
        field1115 = null;
        if (arg0 != 1878053152) {
            method522(27);
        }
        field1119 = null;
        field1124 = (class224[][]) null;
        field1113 = null;
        field1114 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[[I)V", line = 116)
    private final void method523(int arg0, int[][] arg1) {
        int var3 = class109.field1770;
        field1122++;
        int var4 = class266.field4496;
        class306.method2088(arg1, arg0 - 2147);
        class261.method1805(class49.field717, class307.field5268, (byte) 125, 0, arg0);
        if (this.field1112 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field1112.length; var5++) {
            class46 var6 = this.field1112[var5];
            int var7 = var6.field690;
            int var8 = var6.field687;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method301(var3, (byte) -13, var4);
                }
            } else if (var8 < 0) {
                var6.method298(var3, false, var4);
            } else {
                var6.method297(var3, var4, 31462);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(ZI)V", line = 168)
    public static final void method524(boolean arg0, int arg1) {
        class148.field2348 = arg1;
        if (!arg0) {
            method525(-17, (Random) null, true);
        }
        class15.field122 = -1;
        class246.field4180 = 0;
        class237.field4064 = -1;
        class289.field4925 = null;
        class24.field273 = false;
        field1118++;
        class60.field876 = 1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/util/Random;Z)I", line = 188)
    public static final int method525(int arg0, Random arg1, boolean arg2) {
        field1117++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (!arg2) {
            return -33;
        } else if (class220.method1570(arg0, 83)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class96.method768((byte) -86, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)[[I", line = 225)
    public final int[][] method11(boolean arg0, int arg1) {
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320) {
            int var4 = class109.field1770;
            int var5 = class266.field4496;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field4589.method608(68);
            this.method523(0, var6);
            for (int var8 = 0; var8 < class266.field4496; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; var14 < class109.field1770; var14++) {
                    int var15 = var9[var14];
                    var12[var14] = class234.method1648(var15 << 4, 4080);
                    var13[var14] = class234.method1648(4080, var15 >> 4);
                    var11[var14] = class234.method1648(var15, 16711680) >> 12;
                }
            }
        }
        field1121++;
        if (arg0) {
            method524(true, -12);
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[I", line = 287)
    public final int[] method6(int arg0, int arg1) {
        field1123++;
        if (arg0 != 18693) {
            field1125 = -72;
        }
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            this.method523(0, this.field4573.method920(-101));
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "(B)V", line = 324)
    public static final void method526(byte arg0) {
        field1116++;
        class307 var1 = new class307();
        if (arg0 != -36) {
            return;
        }
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class215.field3648[var2][var3] = var1;
            }
        }
    }
}
