import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class66 extends class93 {

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "I")
    private int field1341 = 4096;

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "Z")
    private boolean field1343 = true;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "Ljd;")
    private static class92 field1337 = class202.method1325((byte) 90, "wishes to trade with you)3");

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
    public static int field1336 = 0;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "Ljd;")
    public static class92 field1335 = field1337;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "Ljd;")
    private static class92 field1338 = class202.method1325((byte) 90, "World");

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "Ljd;")
    public static class92 field1342 = field1338;

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "Ljd;")
    public static class92 field1344 = field1338;

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "Lge;")
    public static class65 field1340 = new class65();

    @OriginalMember(owner = "client!gf", name = "gb", descriptor = "I")
    public static int field1346 = 0;

    @OriginalMember(owner = "client!gf", name = "ib", descriptor = "Loe;")
    public static class139 field1348 = new class139(100);

    @OriginalMember(owner = "client!gf", name = "jb", descriptor = "Lbg;")
    public static class18 field1349 = new class18();

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!gf", name = "fb", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!gf", name = "hb", descriptor = "Lv;")
    public static class197 field1347;

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "Lfd;")
    public static class55 field1334;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "(B)[Lsc;")
    public static final class173[] method391(byte arg0) {
        ++field1333;
        class173[] var1 = new class173[class30.field661];
        for (int var2 = 0; var2 < class30.field661; ++var2) {
            class173 var3 = new class173();
            var3.field3356 = class147.field2917;
            var3.field3352 = class153.field3029;
            var3.field3355 = class153.field3039[var2];
            var3.field3357 = class61.field1275[var2];
            var3.field3354 = class119.field2419[var2];
            var3.field3351 = class39.field876[var2];
            var3.field3358 = class123.field2503;
            var3.field3353 = class14.field401[var2];
            var1[var2] = var3;
        }
        if (arg0 <= 82) {
            method392(false);
        }
        class146.method955(true);
        return var1;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V")
    public static void method392(boolean arg0) {
        field1349 = null;
        field1348 = null;
        field1342 = null;
        field1337 = null;
        field1338 = null;
        if (!arg0) {
            method392(false);
        }
        field1334 = null;
        field1335 = null;
        field1340 = null;
        field1344 = null;
        field1347 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field1343 = ~arg1.method443(255) == -2;
            }
        } else {
            this.field1341 = arg1.method442(-21351);
        }
        ++field1339;
        if (arg2 != 0) {
            this.method62(78, 3);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)I")
    public static final int method393(int arg0, int arg1) {
        ++field1345;
        if (arg1 >= -122) {
            method392(false);
        }
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field1332;
        int[][] var3 = super.field1873.method553(arg0, 0);
        if (super.field1873.field1656) {
            int[] var4 = this.method648((byte) 121, arg0 + -1 & class5.field279, 0);
            int[] var5 = this.method648((byte) 79, arg0, 0);
            int[] var6 = this.method648((byte) 70, class5.field279 & arg0 + 1, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class150.field2985; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1341;
                int var12 = (var5[class2.field163 & var10 + 1] + -var5[class2.field163 & var10 + -1]) * this.field1341;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((var15 - (-var16 + -4096)) / 4096)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var11 / var17;
                    var20 = var12 / var17;
                    var19 = 16777216 / var17;
                }
                if (this.field1343) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        if (arg1 != 4096) {
            method391((byte) -43);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class66() {
        super(1, false);
    }
}
