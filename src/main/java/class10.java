import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class10 extends class51 {

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
    public static int field222 = 0;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "Lea;")
    public static class38 field225 = class9.method46((byte) 122, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "Lea;")
    public static class38 field219 = null;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "[Z")
    public static boolean[] field228 = new boolean[100];

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "[I")
    public static int[] field226 = new int[32];

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "Lea;")
    public static class38 field220 = null;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "Lea;")
    public static class38 field231 = class9.method46((byte) 124, "::fpsoff");

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "[I")
    public static int[] field227;

    @OriginalMember(owner = "client!b", name = "mb", descriptor = "[[[I")
    public static int[][][] field232;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            super.field1289 = ~arg0.method509(122) == -2;
        }
        ++field229;
        if (!arg2) {
            this.method51((class66) null, 55, false);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field221;
        if (arg0 < 111) {
            return null;
        } else {
            int[][] var3 = super.field1292.method720(false, arg1);
            if (super.field1292.field2032) {
                int[] var4 = this.method376(arg1, 2, -105);
                int[][] var5 = this.method377(0, arg1, (byte) -83);
                int[][] var6 = this.method377(1, arg1, (byte) -119);
                int[] var7 = var3[2];
                int[] var8 = var5[0];
                int[] var9 = var5[1];
                int[] var10 = var3[1];
                int[] var11 = var5[2];
                int[] var12 = var3[0];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~class86.field2008 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 != -4097) {
                        if (var17 != 0) {
                            int var18 = 4096 - var17;
                            var12[var16] = var8[var16] * var17 + var13[var16] * var18 >> 12;
                            var10[var16] = var9[var16] * var17 - -(var14[var16] * var18) >> 12;
                            var7[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                        } else {
                            var12[var16] = var13[var16];
                            var10[var16] = var14[var16];
                            var7[var16] = var15[var16];
                        }
                    } else {
                        var12[var16] = var8[var16];
                        var10[var16] = var9[var16];
                        var7[var16] = var11[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class10() {
        super(3, false);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static void method53(byte arg0) {
        field220 = null;
        int var1 = 113 % ((43 - arg0) / 55);
        field232 = null;
        field228 = null;
        field225 = null;
        field226 = null;
        field227 = null;
        field219 = null;
        field231 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 47 / ((27 - arg5) / 52);
        ++field230;
        class9 var11 = (class9) class165.field3411.method1020(0);
        class9 var12 = null;
        while (var11 != null) {
            if (~var11.field194 == ~arg4 && var11.field217 == arg8 && var11.field210 == arg6 && var11.field196 == arg3) {
                var12 = var11;
                break;
            }
            var11 = (class9) class165.field3411.method1027((byte) 89);
        }
        if (var12 == null) {
            var12 = new class9();
            var12.field210 = arg6;
            var12.field194 = arg4;
            var12.field217 = arg8;
            var12.field196 = arg3;
            class52.method379(var12, (byte) -80);
            class165.field3411.method1014((byte) -122, var12);
        }
        var12.field214 = arg0;
        var12.field218 = arg1;
        var12.field197 = arg9;
        var12.field209 = arg7;
        var12.field204 = arg2;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field223;
        if (arg0 >= -125) {
            field220 = null;
        }
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            int[] var4 = this.method376(arg1, 0, -98);
            int[] var5 = this.method376(arg1, 1, -51);
            int[] var6 = this.method376(arg1, 2, -71);
            for (int var7 = 0; ~var7 > ~class86.field2008; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }
}
