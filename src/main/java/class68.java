import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class68 extends class273 {

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    private int field1334 = 3072;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    private int field1337 = 1024;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    private int field1336 = 2048;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "[J")
    public static long[] field1333 = new long[500];

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field1328 = 0;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "[I")
    public static int[] field1330 = new int[1000];

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "Z")
    public static boolean field1327 = false;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "Ljd;")
    public static class86 field1341 = class122.method868("RuneScape wird geladen )2 bitte warten)3)3)3", true);

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "Ljd;")
    public static class86 field1338 = class122.method868("Wordpack geladen)3", true);

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
    public static int field1343 = -8 + (int) (Math.random() * 17.0D);

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "S")
    public static short field1332 = 1;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "[I")
    public static int[] field1339;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method480(boolean arg0) {
        field1333 = null;
        field1341 = null;
        field1339 = null;
        field1330 = null;
        if (!arg0) {
            field1338 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        if (arg0 != -7420) {
            field1343 = 119;
        }
        ++field1335;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            int[] var4 = this.method1863(arg0 + 7310, 0, arg1);
            for (int var5 = 0; ~class176.field3200 < ~var5; ++var5) {
                var3[var5] = this.field1337 - -(var4[var5] * this.field1336 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        ++field1329;
        int[][] var3 = super.field4787.method1657(arg0, (byte) -106);
        int var4 = 28 % ((12 - arg1) / 58);
        if (super.field4787.field4355) {
            int[][] var5 = this.method1859(arg0, 0, 3);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            int[] var11 = var3[1];
            for (int var12 = 0; ~var12 > ~class176.field3200; ++var12) {
                var9[var12] = (var6[var12] * this.field1336 >> 12) + this.field1337;
                var11[var12] = (var7[var12] * this.field1336 >> 12) + this.field1337;
                var10[var12] = this.field1337 - -(var8[var12] * this.field1336 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field1331;
        if (arg2 >= -16) {
            field1343 = -120;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field4778 = ~arg1.method1408((byte) -98) == -2;
                }
            } else {
                this.field1334 = arg1.method1410(-59);
            }
        } else {
            this.field1337 = arg1.method1410(-89);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class68() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(III)V")
    public static final void method481(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class194.field3462; ++var3) {
            for (int var4 = 0; var4 < class70.field1424; ++var4) {
                for (int var5 = 0; var5 < class126.field2436; ++var5) {
                    class249 var6 = class248.field4406[var3][var4][var5];
                    if (var6 != null) {
                        class221 var7 = var6.field4435;
                        if (var7 != null && var7.field3966.method563()) {
                            class215.method1527(var7.field3966, var3, var4, var5, 1, 1);
                            if (var7.field3976 != null && var7.field3976.method563()) {
                                class215.method1527(var7.field3976, var3, var4, var5, 1, 1);
                                var7.field3966.method562(var7.field3976, 0, 0, 0, false);
                                var7.field3976 = var7.field3976.method559(arg0, arg1, arg2);
                            }
                            var7.field3966 = var7.field3966.method559(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field4445; ++var8) {
                            class228 var10 = var6.field4429[var8];
                            if (var10 != null && var10.field4134.method563()) {
                                class215.method1527(var10.field4134, var3, var4, var5, var10.field4135 - var10.field4137 + 1, var10.field4128 - var10.field4127 + 1);
                                var10.field4134 = var10.field4134.method559(arg0, arg1, arg2);
                            }
                        }
                        class107 var9 = var6.field4437;
                        if (var9 != null && var9.field2051.method563()) {
                            class22.method163(var9.field2051, var3, var4, var5);
                            var9.field2051 = var9.field2051.method559(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        this.field1336 = -this.field1337 + this.field1334;
        if (arg0 == 4095) {
            ++field1342;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
    public static final void method482(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1326;
        class161 var5 = class204.method1456(true, arg2, arg0);
        var5.method1174(0);
        var5.field3027 = arg4;
        var5.field3015 = arg1;
        var5.field3016 = arg3;
    }
}
