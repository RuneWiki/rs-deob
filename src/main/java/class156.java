import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class156 extends class243 {

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    private int field2675 = 4096;

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "Z")
    private boolean field2681 = true;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "Lub;")
    public static class227 field2674 = class257.method1749("AUS", 17263);

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
    public static int field2680 = 0;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
    public static int field2682 = 0;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!ke", name = "jb", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field2684;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field2681 = arg0.method1471(255) == 1;
            }
        } else {
            this.field2675 = arg0.method1447(0);
        }
        if (arg1) {
            this.method80(-66, -116);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BZ)V")
    public static final void method978(byte arg0, boolean arg1) {
        byte var2 = 4;
        byte[][] var3 = class38.field638;
        if (arg0 <= 99) {
            field2674 = null;
        }
        ++field2676;
        for (int var4 = 0; var4 < var2; ++var4) {
            class114.method725((byte) -118);
            for (int var5 = 0; var5 < 13; ++var5) {
                for (int var6 = 0; ~var6 > -14; ++var6) {
                    boolean var7 = false;
                    int var8 = class236.field4098[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (65111930 & var8) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = var8 >> 1 & 3;
                            int var11 = var8 >> 14 & 1023;
                            int var12 = var8 >> 3 & 2047;
                            int var13 = (var11 / 8 << 8) - -(var12 / 8);
                            for (int var14 = 0; ~class177.field2976.length < ~var14; ++var14) {
                                if (class177.field2976[var14] == var13 && var3[var14] != null) {
                                    class100.method613(true, var5 * 8, var4, arg1, class78.field1370, (7 & var11) * 8, var6 * 8, var3[var14], var9, (7 & var12) * 8, var10);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class79.method460(var4, var6 * 8, 8, var5 * 8, 100, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        if (arg0 != 230) {
            return null;
        } else {
            ++field2683;
            int[][] var3 = super.field4213.method1406(arg1, 0);
            if (super.field4213.field3771) {
                int[] var4 = this.method1614(0, class254.field4469 & arg1 + -1, 114);
                int[] var5 = this.method1614(0, arg1, 105);
                int[] var6 = this.method1614(0, arg1 + 1 & class254.field4469, 99);
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var3[0];
                for (int var10 = 0; ~class212.field3586 < ~var10; ++var10) {
                    int var11 = (var5[var10 + 1 & class179.field3062] - var5[var10 - 1 & class179.field3062]) * this.field2675;
                    int var12 = (var6[var10] + -var4[var10]) * this.field2675;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var14 * var14 >> 12;
                    int var16 = var13 * var13 >> 12;
                    int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                    int var18;
                    int var19;
                    int var20;
                    if (var17 == 0) {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    } else {
                        var18 = var11 / var17;
                        var19 = 16777216 / var17;
                        var20 = var12 / var17;
                    }
                    if (this.field2681) {
                        var19 = (var19 >> 1) + 2048;
                        var18 = (var18 >> 1) + 2048;
                        var20 = 2048 - -(var20 >> 1);
                    }
                    var9[var10] = var18;
                    var7[var10] = var20;
                    var8[var10] = var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class156() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILub;)I")
    public static final int method979(int arg0, class227 arg1) {
        ++field2678;
        if (arg1 == null) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class166.field2781; ++var2) {
                if (arg1.method1522(class201.field3442[var2], (byte) -56)) {
                    return var2;
                }
            }
            return arg0 > -19 ? 46 : -1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)V")
    public static void method980(int arg0) {
        field2674 = null;
        if (arg0 != -24937) {
            field2677 = 62;
        }
    }
}
