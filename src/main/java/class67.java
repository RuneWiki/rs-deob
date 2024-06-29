import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class67 extends class252 {

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
    private int field1241 = 4096;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "Z")
    private boolean field1246 = true;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "Ljd;")
    private static class85 field1229 = class221.method1499("Loading )2 please wait)3", (byte) 127);

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "Ljd;")
    public static class85 field1235 = class221.method1499(" )2> <col=00ffff>", (byte) -51);

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public static int field1234 = 0;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field1239 = 0;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "Ljd;")
    public static class85 field1242 = field1229;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "Ljd;")
    private static class85 field1243 = class221.method1499("Ok", (byte) 87);

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "Ljd;")
    public static class85 field1237 = class221.method1499("lila:", (byte) 127);

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "Ljd;")
    public static class85 field1244 = field1243;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)J")
    public static final long method447(int arg0, int arg1, int arg2) {
        class208 var3 = class99.field1780[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field3646; ++var4) {
                class213 var5 = var3.field3650[var4];
                if ((var5.field3728 >> 29 & 3L) == 2L && var5.field3731 == arg1 && var5.field3729 == arg2) {
                    return var5.field3728;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
    public static void method448(byte arg0) {
        field1237 = null;
        field1229 = null;
        field1244 = null;
        int var1 = 30 / ((-49 - arg0) / 52);
        field1242 = null;
        field1235 = null;
        field1243 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IBI)Ljb;")
    public static final class255 method449(int arg0, byte arg1, int arg2) {
        ++field1231;
        int var3 = -78 % ((arg1 - -6) / 61);
        class255 var4 = class72.method506(arg2, 0);
        if (~arg0 == 0) {
            return var4;
        } else {
            return var4 != null && var4.field4549 != null && var4.field4549.length > arg0 ? var4.field4549[arg0] : null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        if (arg1 != -123) {
            method448((byte) -124);
        }
        int[][] var3 = super.field4350.method155(arg0, false);
        if (super.field4350.field338) {
            int[] var4 = this.method1742((byte) 8, 0, class25.field360 & arg0 + -1);
            int[] var5 = this.method1742((byte) 8, 0, arg0);
            int[] var6 = this.method1742((byte) 8, 0, class25.field360 & arg0 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; class5.field63 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1241;
                int var12 = (var5[var10 + 1 & field1233] + -var5[var10 - 1 & field1233]) * this.field1241;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                    var20 = var12 / var17;
                }
                if (this.field1246) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var20;
                var9[var10] = var19;
                var8[var10] = var18;
            }
        }
        ++field1245;
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class67() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field1240;
        if (arg2 == -99) {
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    this.field1246 = arg0.method1711((byte) -67) == 1;
                }
            } else {
                this.field1241 = arg0.method1694((byte) -100);
            }
        }
    }
}
