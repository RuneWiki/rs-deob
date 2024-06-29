import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class91 extends class84 {

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    private int field1349 = 0;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    private int field1347 = 2000;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    private int field1342 = 0;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    private int field1350 = 4096;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    private int field1352 = 16;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "[S")
    public static short[] field1348 = new short[256];

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "J")
    public static long field1351 = 0L;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "Lcc;")
    public static class216 field1355 = new class216(64);

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "[J")
    public static long[] field1356 = new long[32];

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "[S")
    public static short[] field1357;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)Lak;")
    public static final class140 method713(byte arg0) {
        ++field1343;
        int var1 = -71 % ((-29 - arg0) / 53);
        int var2 = class201.field3220[0] * class19.field214[0];
        byte[] var3 = class152.field2505[0];
        class140 var6;
        if (!class186.field3003[0]) {
            int[] var4 = new int[var2];
            for (int var5 = 0; ~var2 < ~var5; ++var5) {
                var4[var5] = class101.field1476[class179.method1337(var3[var5], 255)];
            }
            var6 = new class140(class262.field4258, class62.field912, class217.field3457[0], class272.field4377[0], class19.field214[0], class201.field3220[0], var4);
        } else {
            int[] var7 = new int[var2];
            byte[] var8 = class8.field83[0];
            for (int var9 = 0; var9 < var2; ++var9) {
                var7[var9] = class244.method1747(class179.method1337(255, var8[var9]) << 24, class101.field1476[class179.method1337(255, var3[var9])]);
            }
            var6 = new class9(class262.field4258, class62.field912, class217.field3457[0], class272.field4377[0], class19.field214[0], class201.field3220[0], var7);
        }
        class188.method1398((byte) 122);
        return var6;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        ++field1346;
        class239.method1677((byte) 62);
        if (arg0) {
            this.method31((class152) null, (byte) 103, 15);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILlc;)V")
    public static final void method714(int arg0, class86 arg1) {
        int var2 = -11 / ((arg0 - -30) / 48);
        class254.field4197 = arg1;
        ++field1354;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
    public static void method715(byte arg0) {
        field1357 = null;
        field1355 = null;
        field1356 = null;
        if (arg0 != -74) {
            method716((class86) null, true);
        }
        field1348 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        ++field1344;
        if (arg1 <= 87) {
            field1356 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            this.field1350 = arg0.method1126(false);
                        }
                    } else {
                        this.field1342 = arg0.method1126(false);
                    }
                } else {
                    this.field1352 = arg0.method1111(255);
                }
            } else {
                this.field1347 = arg0.method1126(false);
            }
        } else {
            this.field1349 = arg0.method1111(255);
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Llc;Z)V")
    public static final void method716(class86 arg0, boolean arg1) {
        if (arg1) {
            ++field1353;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        if (arg0 >= -125) {
            this.method31((class152) null, (byte) 92, -124);
        }
        int[] var3 = super.field1228.method1627(-1, arg1);
        ++field1341;
        if (super.field1228.field3651) {
            int var4 = this.field1350 >> 1;
            int[][] var5 = super.field1228.method1623(-15578);
            Random var6 = new Random((long) this.field1349);
            for (int var7 = 0; ~var7 > ~this.field1347; ++var7) {
                int var8 = ~this.field1350 >= -1 ? this.field1342 : this.field1342 - (-class145.method1041(var6, (byte) 123, this.field1350) + var4);
                int var9 = (var8 & 4083) >> 4;
                int var10 = class145.method1041(var6, (byte) 123, class20.field221);
                int var11 = class145.method1041(var6, (byte) 126, class49.field718);
                int var12 = (class239.field3823[var9] * this.field1352 >> 12) + var11;
                int var13 = var10 - -(class24.field282[var9] * this.field1352 >> 12);
                int var14 = -var10 + var13;
                int var15 = var12 - var11;
                if (~var14 != -1 || var15 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 < ~var14;
                    if (var16) {
                        int var17 = var13;
                        var13 = var12;
                        int var18 = var10;
                        var10 = var11;
                        var11 = var18;
                        var12 = var17;
                    }
                    if (~var10 < ~var13) {
                        int var19 = var11;
                        var11 = var12;
                        var12 = var19;
                        int var20 = var10;
                        var10 = var13;
                        var13 = var20;
                    }
                    int var21 = -var10 + var13;
                    int var22 = var11;
                    int var23 = var12 - var11;
                    int var24 = -var21 / 2;
                    int var25 = 2048 / var21;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var26 = -(class145.method1041(var6, (byte) 124, 4096) >> 2) + 1024;
                    int var27 = ~var11 > ~var12 ? 1 : -1;
                    for (int var28 = var10; var13 > var28; ++var28) {
                        var24 += var23;
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = var28 & class36.field497;
                        int var31 = var22 & class58.field822;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var24 < -1) {
                            var24 -= var21;
                            var22 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
