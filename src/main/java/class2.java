import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class23 {

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "Z")
    private boolean field14 = true;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    private int field17 = 4096;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "Li;")
    public static class88 field18 = class208.method1425(105, "<col=ff7000>");

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "Li;")
    public static class88 field12 = class208.method1425(105, "null");

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "Li;")
    private static class88 field20 = class208.method1425(105, "Started 3d library");

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "Li;")
    public static class88 field23 = class208.method1425(105, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "I")
    public static int field25 = -1;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "Li;")
    public static class88 field21 = class208.method1425(105, ")1p");

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "Li;")
    public static class88 field24 = field20;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        ++field16;
        int[][] var3 = super.field364.method1541(true, arg0);
        if (super.field364.field4312) {
            int[] var4 = this.method120(class220.field4160 & arg0 + -1, false, 0);
            int[] var5 = this.method120(arg0, false, 0);
            int[] var6 = this.method120(arg0 + 1 & class220.field4160, false, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; ~var10 > ~class70.field1276; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field17;
                int var12 = (var5[var10 + 1 & class45.field789] + -var5[var10 + -1 & class45.field789]) * this.field17;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - -var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                }
                if (this.field14) {
                    var19 = 2048 - -(var19 >> 1);
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var20;
                var9[var10] = var18;
                var8[var10] = var19;
            }
        }
        if (arg1 != 13) {
            field24 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
    public static void method8(byte arg0) {
        field20 = null;
        if (arg0 != -44) {
            method9((byte) -116);
        }
        field12 = null;
        field23 = null;
        field18 = null;
        field21 = null;
        field24 = null;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)V")
    public static final void method9(byte arg0) {
        ++field19;
        class230.field4314.method34(8);
        int var1 = class230.field4314.method28(8, -315);
        if (class55.field1041 > var1) {
            for (int var2 = var1; class55.field1041 > var2; ++var2) {
                class53.field999[class223.field4198++] = class25.field402[var2];
            }
        }
        if (var1 > class55.field1041) {
            throw new RuntimeException("gnpov1");
        } else {
            class55.field1041 = 0;
            int var3 = 0;
            int var4 = 56 % ((arg0 - 40) / 51);
            while (~var3 > ~var1) {
                int var5 = class25.field402[var3];
                class191 var6 = class225.field4225[var5];
                int var7 = class230.field4314.method28(1, -315);
                if (~var7 == -1) {
                    class25.field402[class55.field1041++] = var5;
                    var6.field4083 = class117.field2115;
                } else {
                    int var8 = class230.field4314.method28(2, -315);
                    if (var8 == 0) {
                        class25.field402[class55.field1041++] = var5;
                        var6.field4083 = class117.field2115;
                        class139.field2581[class192.field3704++] = var5;
                    } else if (var8 == 1) {
                        class25.field402[class55.field1041++] = var5;
                        var6.field4083 = class117.field2115;
                        int var9 = class230.field4314.method28(3, -315);
                        var6.method1478((byte) 127, false, var9);
                        int var10 = class230.field4314.method28(1, -315);
                        if (~var10 == -2) {
                            class139.field2581[class192.field3704++] = var5;
                        }
                    } else if (var8 == 2) {
                        class25.field402[class55.field1041++] = var5;
                        var6.field4083 = class117.field2115;
                        int var11 = class230.field4314.method28(3, -315);
                        var6.method1478((byte) 127, true, var11);
                        int var12 = class230.field4314.method28(3, -315);
                        var6.method1478((byte) 127, true, var12);
                        int var13 = class230.field4314.method28(1, -315);
                        if (~var13 == -2) {
                            class139.field2581[class192.field3704++] = var5;
                        }
                    } else if (var8 == 3) {
                        class53.field999[class223.field4198++] = var5;
                    }
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lq;B)V")
    public static final void method10(class174 arg0, byte arg1) {
        ++field13;
        class174 var2 = class205.method1415((byte) 114, arg0);
        int var3 = -58 / ((arg1 - 39) / 62);
        int var4;
        int var5;
        if (var2 == null) {
            var4 = class222.field4194;
            var5 = class145.field2727;
        } else {
            var5 = var2.field3424;
            var4 = var2.field3382;
        }
        class200.method1376(arg0, var4, (byte) -127, var5);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class2() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        ++field22;
        if (arg1 != -3) {
            field20 = null;
        }
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field14 = arg0.method347(26119) == 1;
            }
        } else {
            this.field17 = arg0.method301(105);
        }
    }
}
