import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class8 {

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Z")
    public boolean field95 = false;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "[I")
    public static int[] field99 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Lce;")
    public static class126 field96 = class206.method1445(-7923, "showingVideoAd");

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Lce;")
    private static class126 field97 = class206.method1445(-7923, "scroll:");

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Lce;")
    public static class126 field92 = field97;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Lce;")
    public static class126 field100 = field97;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "J")
    public long field101;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Lja;")
    public class114 field103;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Z", line = 11)
    public static final boolean method43(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class306.field5134; var3++) {
            class76 var4 = class286.field4749[var3];
            if (var4.field1240 == 1) {
                int var5 = var4.field1244 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1225 * var5 >> 8) + var4.field1233;
                    int var7 = (var4.field1230 * var5 >> 8) + var4.field1231;
                    int var8 = (var4.field1227 * var5 >> 8) + var4.field1235;
                    int var9 = (var4.field1237 * var5 >> 8) + var4.field1232;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1240 == 2) {
                int var10 = arg0 - var4.field1244;
                if (var10 > 0) {
                    int var11 = (var4.field1225 * var10 >> 8) + var4.field1233;
                    int var12 = (var4.field1230 * var10 >> 8) + var4.field1231;
                    int var13 = (var4.field1227 * var10 >> 8) + var4.field1235;
                    int var14 = (var4.field1237 * var10 >> 8) + var4.field1232;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1240 == 3) {
                int var15 = var4.field1233 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1228 * var15 >> 8) + var4.field1244;
                    int var17 = (var4.field1222 * var15 >> 8) + var4.field1229;
                    int var18 = (var4.field1227 * var15 >> 8) + var4.field1235;
                    int var19 = (var4.field1237 * var15 >> 8) + var4.field1232;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1240 == 4) {
                int var20 = arg2 - var4.field1233;
                if (var20 > 0) {
                    int var21 = (var4.field1228 * var20 >> 8) + var4.field1244;
                    int var22 = (var4.field1222 * var20 >> 8) + var4.field1229;
                    int var23 = (var4.field1227 * var20 >> 8) + var4.field1235;
                    int var24 = (var4.field1237 * var20 >> 8) + var4.field1232;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1240 == 5) {
                int var25 = arg1 - var4.field1235;
                if (var25 > 0) {
                    int var26 = (var4.field1228 * var25 >> 8) + var4.field1244;
                    int var27 = (var4.field1222 * var25 >> 8) + var4.field1229;
                    int var28 = (var4.field1225 * var25 >> 8) + var4.field1233;
                    int var29 = (var4.field1230 * var25 >> 8) + var4.field1231;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([Ljava/lang/Object;Z[J)V", line = 133)
    public static final void method44(Object[] arg0, boolean arg1, long[] arg2) {
        class139.method1017(arg2, 1, arg2.length - 1, arg0, 0);
        if (arg1) {
            method44((Object[]) null, false, (long[]) null);
        }
        field89++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 164)
    public static final void method45(int arg0) {
        if (arg0 != -18564) {
            method47((byte) -74);
        }
        field98++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class173.field3067 - 1; var2++) {
                if (class84.field1341[var2] < 1000 && class84.field1341[var2 + 1] > 1000) {
                    class126 var3 = class214.field3636[var2];
                    var1 = false;
                    class214.field3636[var2] = class214.field3636[var2 + 1];
                    class214.field3636[var2 + 1] = var3;
                    class126 var4 = class296.field4932[var2];
                    class296.field4932[var2] = class296.field4932[var2 + 1];
                    class296.field4932[var2 + 1] = var4;
                    int var5 = class34.field506[var2];
                    class34.field506[var2] = class34.field506[var2 + 1];
                    class34.field506[var2 + 1] = var5;
                    int var6 = class9.field115[var2];
                    class9.field115[var2] = class9.field115[var2 + 1];
                    class9.field115[var2 + 1] = var6;
                    int var7 = class131.field2247[var2];
                    class131.field2247[var2] = class131.field2247[var2 + 1];
                    class131.field2247[var2 + 1] = var7;
                    short var8 = class84.field1341[var2];
                    class84.field1341[var2] = class84.field1341[var2 + 1];
                    class84.field1341[var2 + 1] = var8;
                    long var9 = class194.field3304[var2];
                    class194.field3304[var2] = class194.field3304[var2 + 1];
                    class194.field3304[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 229)
    public static final void method46(boolean arg0) {
        if (!arg0) {
            return;
        }
        class10.field134 = 0;
        class7.field76 = 0;
        field93++;
        class289.field4792 = -3;
        class223.field3764 = 0;
        class85.field1347 = -1;
        class281.field4680 = 1;
        class260.field4370 = false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 246)
    public static void method47(byte arg0) {
        field92 = null;
        field97 = null;
        field100 = null;
        field99 = null;
        int var1 = -76 / ((24 - arg0) / 36);
        field96 = null;
    }
}
