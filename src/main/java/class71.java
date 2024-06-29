import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class71 {

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "[I")
    public static int[] field1166 = new int[1000];

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Loj;")
    public static class159 field1163;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "[[B")
    public static byte[][] field1161;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)V")
    public static final void method506(int arg0, byte arg1, int arg2) {
        field1162++;
        class82.field1289[arg0] = arg2;
        class117 var3 = (class117) class148.field2357.method1400((long) arg0, true);
        if (var3 == null) {
            class117 var4 = new class117(class276.method1861((byte) 122) + 500L);
            class148.field2357.method1399(7292, var4, (long) arg0);
        } else {
            var3.field1933 = class276.method1861((byte) 122) + 500L;
        }
        if (arg1 != 32) {
            field1161 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lcb;I)V")
    public static final void method507(class243 arg0, int arg1) {
        for (int var2 = 0; var2 < class228.field3771.length; var2++) {
            class228.field3771[var2] = 0;
        }
        if (arg1 < 77) {
            field1165 = -115;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class228.field3771[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var3 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class118.field1939[var15] = (class228.field3771[var15 - 128] + class228.field3771[var15 + 1] + class228.field3771[var15 + -1] + class228.field3771[var15 + 128]) / 4;
                }
            }
            int[] var13 = class228.field3771;
            class228.field3771 = class118.field1939;
            class118.field1939 = var13;
        }
        if (arg0 != null) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.field3740; var7++) {
                for (int var8 = 0; var8 < arg0.field3744; var8++) {
                    if (arg0.field3905[var6++] != 0) {
                        int var9 = var8 + arg0.field3739 + 16;
                        int var10 = var7 + arg0.field3749 + 16;
                        int var11 = (var10 << 7) + var9;
                        class228.field3771[var11] = 0;
                    }
                }
            }
        }
        field1160++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static void method508(int arg0) {
        if (arg0 != -128) {
            field1163 = null;
        }
        field1163 = null;
        field1161 = null;
        field1166 = null;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public static final void method509(int arg0) {
        int[] var1 = new int[class136.field2254];
        int var2 = 0;
        field1164++;
        for (int var3 = 0; var3 < class136.field2254; var3++) {
            class12 var5 = class83.method595(var3, -95);
            if (var5.field228 >= 0 || var5.field217 >= 0) {
                var1[var2++] = var3;
            }
        }
        if (arg0 <= 24) {
            field1165 = 0;
        }
        class278.field4387 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class278.field4387[var4] = var1[var4];
        }
    }
}
