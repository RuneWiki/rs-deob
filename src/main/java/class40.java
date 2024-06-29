import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class40 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[[I")
    public int[][] field804 = new int[6][258];

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public int field803 = 0;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[B")
    public byte[] field805 = new byte[256];

    @OriginalMember(owner = "client!df", name = "o", descriptor = "[Z")
    public boolean[] field816 = new boolean[256];

    @OriginalMember(owner = "client!df", name = "s", descriptor = "[[I")
    public int[][] field820 = new int[6][258];

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[B")
    public byte[] field806 = new byte[18002];

    @OriginalMember(owner = "client!df", name = "z", descriptor = "[I")
    public int[] field827 = new int[256];

    @OriginalMember(owner = "client!df", name = "q", descriptor = "[B")
    public byte[] field818 = new byte[18002];

    @OriginalMember(owner = "client!df", name = "A", descriptor = "[[B")
    public byte[][] field828 = new byte[6][258];

    @OriginalMember(owner = "client!df", name = "F", descriptor = "[I")
    public int[] field832 = new int[6];

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public int field833 = 0;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "[[I")
    public int[][] field815 = new int[6][258];

    @OriginalMember(owner = "client!df", name = "L", descriptor = "[Z")
    public boolean[] field838 = new boolean[16];

    @OriginalMember(owner = "client!df", name = "r", descriptor = "[I")
    public int[] field819 = new int[257];

    @OriginalMember(owner = "client!df", name = "P", descriptor = "[B")
    public byte[] field842 = new byte[4096];

    @OriginalMember(owner = "client!df", name = "S", descriptor = "[I")
    public int[] field845 = new int[16];

    @OriginalMember(owner = "client!df", name = "m", descriptor = "[I")
    public static int[] field814 = new int[25];

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Loc;")
    public static class151 field811 = class137.method873(2, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Z")
    public static boolean field825 = false;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field836 = 0;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field823 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!df", name = "T", descriptor = "Loc;")
    private static class151 field846 = class137.method873(2, "Connecting to update server");

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public static volatile int field844 = 0;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "Loc;")
    public static class151 field843 = field846;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "B")
    public byte field839;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Lnd;")
    public static class142 field829;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "[B")
    public byte[] field824;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "[B")
    public byte[] field837;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method289(int arg0) {
        field843 = null;
        field814 = null;
        field811 = null;
        field846 = null;
        field823 = null;
        if (arg0 != 2) {
            field836 = -25;
        }
        field829 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILjava/awt/Component;Lda;B)Lpg;")
    public static final class165 method290(int arg0, int arg1, Component arg2, class35 arg3, byte arg4) {
        field826++;
        if (class204.field3624 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class165 var5 = (class165) Class.forName("re").getDeclaredConstructor().newInstance();
                var5.field2983 = new int[(class149.field2668 ? 2 : 1) * 256];
                var5.field2987 = arg0;
                var5.method36(arg2);
                var5.field3001 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field3001 > 16384) {
                    var5.field3001 = 16384;
                }
                if (arg4 < 122) {
                    method291(-100, 87, -84, 38, -118, 111);
                }
                var5.method39(var5.field3001);
                if (class222.field3854 > 0 && class29.field612 == null) {
                    class29.field612 = new class63();
                    class29.field612.field1239 = arg3;
                    arg3.method263(class29.field612, class222.field3854, false);
                }
                if (class29.field612 != null) {
                    if (class29.field612.field1225[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class29.field612.field1225[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class6 var6 = new class6(arg3, arg1);
                    var6.field2983 = new int[(class149.field2668 ? 2 : 1) * 256];
                    var6.field2987 = arg0;
                    var6.method36(arg2);
                    var6.field3001 = 16384;
                    var6.method39(var6.field3001);
                    if (class222.field3854 > 0 && class29.field612 == null) {
                        class29.field612 = new class63();
                        class29.field612.field1239 = arg3;
                        arg3.method263(class29.field612, class222.field3854, false);
                    }
                    if (class29.field612 != null) {
                        if (class29.field612.field1225[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class29.field612.field1225[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class165();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIII)V")
    public static final void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -3) {
            return;
        }
        field830++;
        long var6 = class225.method1413(arg1, arg3, arg0);
        if (var6 != 0L) {
            int var8 = arg4;
            int var9 = (int) var6 >> 14 & 0x1F;
            if (var6 > 0L) {
                var8 = arg5;
            }
            int var10 = (int) var6 >> 20 & 0x3;
            int[] var11 = class216.field3775.field1590;
            int var12 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            int var13 = arg3 * 4 + (52736 - arg0 * 512) * 4 + 24624;
            class93 var14 = class5.method32((byte) 105, var12);
            if (var14.field1725 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var10 == 0) {
                        var11[var13] = var8;
                        var11[var13 + 512] = var8;
                        var11[var13 + 1024] = var8;
                        var11[var13 + 1536] = var8;
                    } else if (var10 == 1) {
                        var11[var13] = var8;
                        var11[var13 + 1] = var8;
                        var11[var13 + 2] = var8;
                        var11[var13 + 3] = var8;
                    } else if (var10 == 2) {
                        var11[var13 + 3] = var8;
                        var11[var13 + 3 + 512] = var8;
                        var11[var13 + 1024 + 3] = var8;
                        var11[var13 + 1539] = var8;
                    } else if (var10 == 3) {
                        var11[var13 + 1536] = var8;
                        var11[var13 + 1536 + 1] = var8;
                        var11[var13 + 1536 + 2] = var8;
                        var11[var13 + 1539] = var8;
                    }
                }
                if (var9 == 3) {
                    if (var10 == 0) {
                        var11[var13] = var8;
                    } else if (var10 == 1) {
                        var11[var13 + 3] = var8;
                    } else if (var10 == 2) {
                        var11[var13 + 3 + 1536] = var8;
                    } else if (var10 == 3) {
                        var11[var13 + 1536] = var8;
                    }
                }
                if (var9 == 2) {
                    if (var10 == 3) {
                        var11[var13] = var8;
                        var11[var13 + 512] = var8;
                        var11[var13 + 1024] = var8;
                        var11[var13 + 1536] = var8;
                    } else if (var10 == 0) {
                        var11[var13] = var8;
                        var11[var13 + 1] = var8;
                        var11[var13 + 2] = var8;
                        var11[var13 + 3] = var8;
                    } else if (var10 == 1) {
                        var11[var13 + 3] = var8;
                        var11[var13 + 512 + 3] = var8;
                        var11[var13 + 3 + 1024] = var8;
                        var11[var13 + 3 + 1536] = var8;
                    } else if (var10 == 2) {
                        var11[var13 + 1536] = var8;
                        var11[var13 + 1536 + 1] = var8;
                        var11[var13 + 1538] = var8;
                        var11[var13 + 3 + 1536] = var8;
                    }
                }
            } else {
                class30 var15 = class123.field2195[var14.field1725];
                if (var15 != null) {
                    int var16 = (var14.field1715 * 4 - var15.field634) / 2;
                    int var17 = (var14.field1697 * 4 - var15.field633) / 2;
                    var15.method229(arg3 * 4 + var17 + 48, (-arg0 + 104 + -var14.field1715) * 4 + var16 + 48);
                }
            }
        }
        long var18 = class229.method1448(arg1, arg3, arg0);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class93 var23 = class5.method32((byte) 26, var22);
            if (var23.field1725 != -1) {
                class30 var27 = class123.field2195[var23.field1725];
                if (var27 != null) {
                    int var28 = (var23.field1697 * 4 - var27.field633) / 2;
                    int var29 = (var23.field1715 * 4 - var27.field634) / 2;
                    var27.method229(arg3 * 4 + var28 + 48, (-arg0 + 104 - var23.field1715) * 4 + 48 + var29);
                }
            } else if (var21 == 9) {
                int var24 = 15658734;
                if (var18 > 0L) {
                    var24 = 15597568;
                }
                int var25 = (52736 - arg0 * 512) * 4 + arg3 * 4 + 24624;
                int[] var26 = class216.field3775.field1590;
                if (var20 == 0 || var20 == 2) {
                    var26[var25 + 1536] = var24;
                    var26[var25 + 1024 + 1] = var24;
                    var26[var25 + 512 + 2] = var24;
                    var26[var25 + 3] = var24;
                } else {
                    var26[var25] = var24;
                    var26[var25 + 512 + 1] = var24;
                    var26[var25 + 1026] = var24;
                    var26[var25 + 1536 + 3] = var24;
                }
            }
        }
        long var30 = class28.method219(arg1, arg3, arg0);
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class93 var33 = class5.method32((byte) 52, var32);
        if (var33.field1725 == -1) {
            return;
        }
        class30 var34 = class123.field2195[var33.field1725];
        if (var34 != null) {
            int var35 = (var33.field1715 * 4 - var34.field634) / 2;
            int var36 = (var33.field1697 * 4 - var34.field633) / 2;
            var34.method229(arg3 * 4 + var36 + 48, var35 + 48 - -((-var33.field1715 + 104 + -arg0) * 4));
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IIIIII)V")
    public static final void method292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field821++;
        if (arg1 == 48) {
            for (int var6 = arg0; var6 <= arg3; var6++) {
                class55.method380(arg5, 105, class43.field887[var6], arg4, arg2);
            }
        }
    }
}
