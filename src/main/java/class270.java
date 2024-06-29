import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class270 extends class175 {

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "[I")
    public static int[] field4698 = new int[100];

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public static int field4699 = 0;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "Lmb;")
    public static class96 field4701 = class243.method1708("Untersuchen", (byte) 115);

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "Lmb;")
    public static class96 field4709 = class243.method1708("(U0a )2 via: ", (byte) 116);

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "Lmb;")
    public static class96 field4702 = class243.method1708("m", (byte) 108);

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "Lmb;")
    private static class96 field4707 = class243.method1708("Discard", (byte) 93);

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
    public static int field4706 = 0;

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "Lmb;")
    public static class96 field4710 = field4707;

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "I")
    public static int field4711 = -1;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!hb", name = "ab", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        int var4 = -53 / ((-22 - arg0) / 58);
        if (arg1 == 0) {
            super.field3034 = arg2.method1651(4139) == 1;
        }
        ++field4708;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class270() {
        super(3, false);
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)V")
    public static void method1846(byte arg0) {
        field4710 = null;
        field4707 = null;
        field4698 = null;
        field4702 = null;
        field4701 = null;
        field4709 = null;
        int var1 = 123 % ((arg0 - -14) / 58);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(III)Lmc;")
    public static final class43 method1847(int arg0, int arg1, int arg2) {
        ++field4697;
        class43 var3 = (class43) client.field1997.method1081(0, (long) arg0 | (long) arg2 << 32);
        if (var3 == null) {
            var3 = new class43(arg2, arg0);
            client.field1997.method1085(-1, var3, var3.field4304);
        }
        return arg1 != -10277 ? null : var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int[] var3 = super.field3044.method904((byte) 110, arg1);
        ++field4703;
        if (super.field3044.field2150) {
            int[] var4 = this.method1255(0, arg1, 128);
            int[] var5 = this.method1255(1, arg1, 128);
            int[] var6 = this.method1255(2, arg1, 128);
            for (int var7 = 0; class1.field11 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        int var9 = 73 / ((62 - arg0) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field4700;
        int[][] var3 = super.field3035.method637(arg0, false);
        if (arg1 != 64) {
            method1847(100, 116, 46);
        }
        if (super.field3035.field1493) {
            int[] var4 = this.method1255(2, arg0, 128);
            int[][] var5 = this.method1253(arg0, -2880, 0);
            int[][] var6 = this.method1253(arg0, arg1 ^ -2944, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var5[2];
            int[] var14 = var6[2];
            int[] var15 = var6[1];
            for (int var16 = 0; ~var16 > ~class1.field11; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var9[var16] = var11[var16];
                    var8[var16] = var13[var16];
                } else if (~var17 != -1) {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + var12[var16] * var18 >> 12;
                    var9[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                    var8[var16] = var13[var16] * var17 + var14[var16] * var18 >> 12;
                } else {
                    var7[var16] = var12[var16];
                    var9[var16] = var15[var16];
                    var8[var16] = var14[var16];
                }
            }
        }
        return var3;
    }
}
