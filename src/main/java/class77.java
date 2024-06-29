import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class77 extends class264 {

    @OriginalMember(owner = "client!jn", name = "T", descriptor = "Z")
    private boolean field1142 = true;

    @OriginalMember(owner = "client!jn", name = "Z", descriptor = "I")
    private int field1148 = 4096;

    @OriginalMember(owner = "client!jn", name = "S", descriptor = "Z")
    public static boolean field1141 = false;

    @OriginalMember(owner = "client!jn", name = "N", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!jn", name = "P", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!jn", name = "Q", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!jn", name = "R", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!jn", name = "U", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!jn", name = "W", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!jn", name = "X", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!jn", name = "Y", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!jn", name = "O", descriptor = "[Lrn;")
    public static class417[] field1137;

    @OriginalMember(owner = "client!jn", name = "V", descriptor = "[Lrn;")
    public static class417[] field1144;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLgf;)I", line = 3)
    public static final int method677(byte arg0, class39 arg1) {
        ++field1139;
        int var2 = arg1.field510;
        int var3 = 82 % ((arg0 - -34) / 52);
        class389 var4 = arg1.method2506(-16338);
        if (!arg1.field5765) {
            if (arg1.field5763 != var4.field5343 && arg1.field5763 != var4.field5348 && arg1.field5763 != var4.field5351 && arg1.field5763 != var4.field5352) {
                if (~arg1.field5763 == ~var4.field5361 || ~arg1.field5763 == ~var4.field5344 || ~arg1.field5763 == ~var4.field5336 || arg1.field5763 == var4.field5350) {
                    var2 = arg1.field519;
                }
            } else {
                var2 = arg1.field513;
            }
        } else {
            var2 = arg1.field515;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)Lae;", line = 28)
    public static final class172 method678(int arg0, int arg1, int arg2) {
        ++field1136;
        class172 var3 = class361.method2217(arg2, -1060820048);
        if (~arg0 == 0) {
            return var3;
        } else {
            int var4 = -66 % ((arg1 - 57) / 56);
            return var3 != null && var3.field2541 != null && arg0 < var3.field2541.length ? var3.field2541[arg0] : null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLkk;I)V", line = 48)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg0 >= 31) {
            ++field1146;
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    this.field1142 = arg1.method1172((byte) -119) == 1;
                }
            } else {
                this.field1148 = arg1.method1134(-16848);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V", line = 84)
    public static final void method679(int arg0, int arg1, int arg2, int arg3) {
        class311.field4403.method1177(arg1, -128);
        ++field1140;
        class311.field4403.method1173(arg2, (byte) 116);
        class311.field4403.method1173(arg3, (byte) 120);
        if (arg0 != 30983) {
            field1141 = true;
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(BI)V", line = 99)
    public static final void method680(byte arg0, int arg1) {
        if (class486.field6878 == null) {
            class486.field6878 = new byte[4][class36.field388][class68.field998];
        }
        ++field1143;
        for (int var2 = arg1; var2 < 4; ++var2) {
            for (int var3 = 0; ~var3 > ~class36.field388; ++var3) {
                for (int var4 = 0; ~var4 > ~class68.field998; ++var4) {
                    class486.field6878[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(BI)[[I", line = 150)
    public final int[][] method5(byte arg0, int arg1) {
        ++field1145;
        if (arg0 != 116) {
            field1141 = false;
        }
        int[][] var3 = super.field3816.method1928((byte) 89, arg1);
        if (super.field3816.field4208) {
            int[] var4 = this.method1788(class301.field4265 & arg1 - 1, (byte) -106, 0);
            int[] var5 = this.method1788(arg1, (byte) -37, 0);
            int[] var6 = this.method1788(class301.field4265 & arg1 + 1, (byte) -66, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class478.field6792 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1148;
                int var12 = (var5[var10 - -1 & class205.field3007] + -var5[class205.field3007 & var10 - 1]) * this.field1148;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - (-var16 + -4096)) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                }
                if (this.field1142) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V", line = 231)
    public class77() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lis;B)V", line = 234)
    public static final void method681(class65 arg0, byte arg1) {
        ++field1138;
        class324 var2 = null;
        try {
            class275 var3 = arg0.method611(true);
            while (var3.field3979 == 0) {
                class89.method752(arg1 + -51, 1L);
            }
            if (arg1 != 51) {
                return;
            }
            if (~var3.field3979 == -2) {
                var2 = (class324) var3.field3984;
                class161 var4 = class289.method1901(arg1 + -51);
                var2.method2044(var4.field2262, 65, var4.field2298, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method2049(arg1 + -118);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V", line = 270)
    public static void method682(boolean arg0) {
        field1144 = null;
        if (arg0) {
            field1137 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(Ljava/lang/String;I)J", line = 281)
    public static final long method683(String arg0, int arg1) {
        ++field1147;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = arg1; ~var5 > ~var2; ++var5) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) + -var3;
        }
        return var3;
    }
}
