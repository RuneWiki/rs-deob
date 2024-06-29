import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class53 extends class285 {

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
    public static int field747 = 0;

    @OriginalMember(owner = "client!fm", name = "Y", descriptor = "I")
    public static int field753 = 0;

    @OriginalMember(owner = "client!fm", name = "ab", descriptor = "[I")
    public static int[] field755 = new int[32];

    @OriginalMember(owner = "client!fm", name = "Z", descriptor = "Lqd;")
    public static class195 field754 = class39.method207(0);

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "F")
    public static float field748;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!fm", name = "bb", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!fm", name = "X", descriptor = "[Loj;")
    private class196[] field752;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLjj;I)V", line = 8)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (!arg0) {
            this.method63(true, (class44) null, 21);
        }
        field746++;
        if (arg2 == 0) {
            this.field752 = new class196[arg1.method286((byte) -79)];
            for (int var4 = 0; var4 < this.field752.length; var4++) {
                int var5 = arg1.method286((byte) -64);
                if (var5 == 0) {
                    this.field752[var4] = class128.method931(arg1, (byte) 113);
                } else if (var5 == 1) {
                    this.field752[var4] = class48.method312((byte) -107, arg1);
                } else if (var5 == 2) {
                    this.field752[var4] = class258.method1849(-15032, arg1);
                } else if (var5 == 3) {
                    this.field752[var4] = class199.method1462((byte) 14, arg1);
                }
            }
        } else if (arg2 == 1) {
            this.field4572 = arg1.method286((byte) -112) == 1;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 82)
    public class53() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)[I", line = 92)
    public final int[] method60(boolean arg0, int arg1) {
        if (!arg0) {
            field753 = -68;
        }
        field744++;
        int[] var3 = this.field4573.method1116(101, arg1);
        if (this.field4573.field2420) {
            this.method343(this.field4573.method1117((byte) 110), 22019);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)Z", line = 113)
    public static final boolean method339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class130.field2057[arg0][var8][var9] == -class146.field2275) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class110.field1642[arg0][arg1][arg3] + arg5;
            if (!class66.method442(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class66.method442(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class66.method442(var10, var12, var14)) {
                return false;
            } else if (class66.method442(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class13.method77(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class66.method442(var6 + 1, class110.field1642[arg0][arg1][arg3] + arg5, var7 + 1) && class66.method442(var6 + 128 - 1, class110.field1642[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class66.method442(var6 + 128 - 1, class110.field1642[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class66.method442(var6 + 1, class110.field1642[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)[[I", line = 183)
    public final int[][] method62(byte arg0, int arg1) {
        field743++;
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (arg0 < 121) {
            field748 = 0.82437235F;
        }
        if (this.field4564.field3529) {
            int var4 = class287.field4599;
            int var5 = class27.field372;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field4564.method1554(-32648);
            this.method343(var6, 22019);
            for (int var8 = 0; var8 < class27.field372; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; var14 < class287.field4599; var14++) {
                    int var15 = var9[var14];
                    var12[var14] = client.method767(var15 << 4, 4080);
                    var13[var14] = client.method767(var15 >> 4, 4080);
                    var11[var14] = client.method767(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "(I)V", line = 240)
    public static void method340(int arg0) {
        if (arg0 != -1188982228) {
            method341(103, 96);
        }
        field754 = null;
        field755 = null;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)I", line = 251)
    public static final int method341(int arg0, int arg1) {
        field749++;
        return ~arg1 == arg0 ? -1 : class187.method1394(arg1, 127);
    }

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "(I)V", line = 263)
    public static final void method342(int arg0) {
        class106.field1579.method164(arg0 ^ arg0);
        for (int var1 = 0; var1 < 32; var1++) {
            class65.field943[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class295.field4679[var2] = 0L;
        }
        class142.field2231 = 0;
        field750++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([[II)V", line = 295)
    private final void method343(int[][] arg0, int arg1) {
        field751++;
        int var3 = class287.field4599;
        int var4 = class27.field372;
        class274.method1982(49, arg0);
        if (arg1 != 22019) {
            field755 = (int[]) null;
        }
        class219.method1556(class32.field432, 0, arg1 - 22119, class112.field1717, 0);
        if (this.field752 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field752.length; var5++) {
            class196 var6 = this.field752[var5];
            int var7 = var6.field3203;
            int var8 = var6.field3196;
            if (var7 >= 0) {
                if (var8 < 0) {
                    var6.method1081(var3, var4, 31947);
                } else {
                    var6.method1083(var4, var3, true);
                }
            } else if (var8 >= 0) {
                var6.method1080(var3, arg1 - 28596, var4);
            }
        }
    }
}
