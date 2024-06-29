import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class47 extends class123 {

    @OriginalMember(owner = "client!a", name = "eb", descriptor = "Leb;")
    private static class230 field835 = class68.method589(0, "skill: ");

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "Leb;")
    public static class230 field829 = field835;

    @OriginalMember(owner = "client!a", name = "X", descriptor = "Lpk;")
    public static class98 field828 = new class98();

    @OriginalMember(owner = "client!a", name = "gb", descriptor = "Z")
    public static boolean field837 = true;

    @OriginalMember(owner = "client!a", name = "hb", descriptor = "Leb;")
    public static class230 field838 = class68.method589(0, ")1");

    @OriginalMember(owner = "client!a", name = "jb", descriptor = "I")
    public static int field840 = -1;

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!a", name = "db", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!a", name = "fb", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!a", name = "ib", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (~arg0 == -1) {
            super.field2147 = arg1.method200(255) == 1;
        }
        ++field830;
        if (arg2 != 1876195788) {
            field829 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        if (arg1 != 26080) {
            this.method6(-108, (class14) null, -38);
        }
        ++field836;
        int[][] var3 = super.field2152.method1106(arg0, -7034);
        if (super.field2152.field2616) {
            int[] var4 = this.method965(2, arg0, (byte) 105);
            int[][] var5 = this.method960(0, arg0, (byte) -18);
            int[][] var6 = this.method960(1, arg0, (byte) -106);
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var6[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            int[] var12 = var5[1];
            int[] var13 = var3[0];
            int[] var14 = var6[2];
            int[] var15 = var6[1];
            for (int var16 = 0; var16 < class140.field2505; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var13[var16] = var7[var16];
                    var10[var16] = var12[var16];
                    var11[var16] = var8[var16];
                } else if (~var17 != -1) {
                    int var18 = 4096 - var17;
                    var13[var16] = var7[var16] * var17 + var9[var16] * var18 >> 12;
                    var10[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    var11[var16] = var8[var16] * var17 + var14[var16] * var18 >> 12;
                } else {
                    var13[var16] = var9[var16];
                    var10[var16] = var15[var16];
                    var11[var16] = var14[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class47() {
        super(3, false);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int var3 = 33 % ((-24 - arg1) / 57);
        ++field834;
        int[] var4 = super.field2160.method1323((byte) -102, arg0);
        if (super.field2160.field3243) {
            int[] var5 = this.method965(0, arg0, (byte) 116);
            int[] var6 = this.method965(1, arg0, (byte) 55);
            int[] var7 = this.method965(2, arg0, (byte) 47);
            for (int var8 = 0; class140.field2505 > var8; ++var8) {
                int var9 = var7[var8];
                if (~var9 != -4097) {
                    if (var9 == 0) {
                        var4[var8] = var6[var8];
                    } else {
                        var4[var8] = var5[var8] * var9 - -((-var9 + 4096) * var6[var8]) >> 12;
                    }
                } else {
                    var4[var8] = var5[var8];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(II)V")
    public static final void method398(int arg0, int arg1) {
        class27.field503.method1121(0, arg1);
        ++field832;
        int var2 = 41 % ((arg0 - 16) / 60);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(B)V")
    public static void method399(byte arg0) {
        if (arg0 != -67) {
            method398(-35, -54);
        }
        field828 = null;
        field829 = null;
        field835 = null;
        field838 = null;
    }
}
