import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class524 extends class41 {

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public int field7708;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public int field7706;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public int field7701;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public int field7709;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Lao;")
    public static class188 field7703 = new class188(51, -2);

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field7704 = 0;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "[I")
    public static int[] field7707 = new int[1000];

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field7705;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nh", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field7710;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3099(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lkf;", line = 3)
    public static final class165 method3094(int arg0, int arg1, int arg2) {
        if (class36.field545[arg0][arg1][arg2] == null) {
            boolean var3 = class36.field545[0][arg1][arg2] != null && class36.field545[0][arg1][arg2].field2477 != null;
            if (var3 && arg0 >= class334.field5130 - 1) {
                return null;
            }
            class16.method152(arg0, arg1, arg2);
        }
        return class36.field545[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()V", line = 18)
    public static final void method3095() {
        for (int var0 = 0; var0 < class224.field3245; var0++) {
            if (!class145.field2144[var0]) {
                class480 var1 = class242.field3512[var0];
                class131 var2 = var1.field7047;
                int var3 = var1.field7033;
                int var4 = var2.method964((byte) -91) - class495.field7211;
                int var5 = (var4 * 2 >> class225.field3278) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method966(-111) - var4 >> class225.field3278;
                int var9 = var2.method965(false) - var4 >> class225.field3278;
                int var10 = var2.method965(false) + var4 >> class225.field3278;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class254.field3675) {
                    var10 = class254.field3675 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field7032[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class246.field3560) {
                        var16 = class246.field3560 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class370 var19 = class51.method372(var3, var17, var11, field7710 == null ? (field7710 = method3099("tp")) : field7710);
                        if (var19 != null && var19.field5536 != 0) {
                            if (var19.field5536 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field7032[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field7032[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field7032[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field7032[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class145.field2144[var0] = true;
                class529.field7807[var3].method281(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JZII)V", line = 205)
    public static final void method3096(long arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field7704 = 124;
        }
        field7702++;
        int var5 = ((int) arg0 & 0x7CE78) >> 14;
        int var6 = (int) arg0 >> 20 & 0x3;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class303.method1925(arg2, arg3, 0, var5, true, 0, true, var6, 0);
            return;
        }
        class510 var8 = class246.field3567.method609(124, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field7459;
            var10 = var8.field7475;
        } else {
            var9 = var8.field7475;
            var10 = var8.field7459;
        }
        int var11 = var8.field7521;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class303.method1925(arg2, arg3, var11, 0, true, var9, arg1, 0, var10);
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V", line = 249)
    public static void method3097(int arg0) {
        field7707 = null;
        if (arg0 <= 119) {
            method3098(-107, 40, null);
        }
        field7703 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[B)[B", line = 261)
    public static final byte[] method3098(int arg0, int arg1, byte[] arg2) {
        field7700++;
        int var3 = -45 / ((arg0 + 30) / 60);
        byte[] var4 = new byte[arg1];
        class486.method2905(arg2, 0, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(IIII)V", line = 279)
    public class524(int arg0, int arg1, int arg2, int arg3) {
        this.field7708 = arg2;
        this.field7706 = arg0;
        this.field7701 = arg3;
        this.field7709 = arg1;
    }
}
