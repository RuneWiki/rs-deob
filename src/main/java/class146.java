import java.awt.Canvas;
import java.awt.Dimension;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class146 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lgj;")
    private class662 field2450;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    private int field2454;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "[[I")
    private int[][] field2458;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[Z")
    private boolean[] field2452;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lfja;")
    public static class783 field2455 = new class783(99, 2);

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Ljava/lang/Thread;")
    public static Thread field2463;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "[Lnf;")
    public static class604[] field2462;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Z")
    public final boolean method1174(int arg0) {
        field2460++;
        if (arg0 != 0) {
            this.method1174(76);
        }
        return this.field2454 != -1;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)I")
    public static final int method1175(int arg0) {
        if (arg0 == -29909) {
            field2451++;
            return class278.field3847 == 1 ? class112.field2110 : 0;
        } else {
            return 92;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1176(String arg0, byte arg1) {
        field2456++;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1 != -41) {
            return 87L;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Lrm;")
    public final class433 method1177(int arg0, int arg1) {
        field2457++;
        if (arg0 <= 124) {
            this.field2458 = null;
        }
        byte[] var3 = this.field2450.method3732(arg1, 8906, 1);
        class433 var4 = new class433();
        var4.method2539(new class93(var3), -22917);
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lim;ILgj;)V")
    public class146(class598 arg0, int arg1, class662 arg2) {
        this.field2450 = arg2;
        this.field2450.method3730((byte) 34, 1);
        class93 var4 = new class93(this.field2450.method3732(0, 8906, 0));
        int var5 = var4.method793((byte) 71);
        if (var5 > 3) {
            this.field2458 = new int[0][];
            this.field2452 = new boolean[0];
            this.field2454 = -1;
        } else {
            int var6 = var4.method793((byte) 77);
            class758[] var7 = class357.method2205(21959);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method793((byte) 84);
                    if (var7[var9].field10443 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method793((byte) 25);
                int var12 = var4.method793((byte) 102);
                if (var5 <= 2) {
                    this.field2454 = -1;
                } else {
                    this.field2454 = var4.method774(-4);
                }
                this.field2458 = new int[var12 + 1][];
                this.field2452 = new boolean[var12 + 1];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method793((byte) 62);
                    this.field2452[var15] = var4.method793((byte) 113) == 1;
                    int var16 = var4.method763(92);
                    if (this.field2454 == -1) {
                        this.field2458[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field2458[var15][var18] = var4.method763(3);
                        }
                    } else {
                        this.field2458[var15] = new int[var16 + 1];
                        this.field2458[var15][0] = this.field2454;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field2458[var15][var17 + 1] = var4.method763(-35);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field2458[var14] == null) {
                        if (this.field2454 == -1) {
                            this.field2458[var14] = new int[0];
                        } else {
                            this.field2458[var14] = new int[] { this.field2454 };
                        }
                    }
                }
            } else {
                this.field2452 = new boolean[0];
                this.field2458 = new int[0][];
                this.field2454 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)[I")
    public final int[] method1178(int arg0, byte arg1) {
        field2459++;
        if (arg0 < 0 || arg0 >= this.field2458.length) {
            return this.field2454 == -1 ? new int[0] : new int[] { this.field2454 };
        } else if (this.field2452[arg0] && this.field2458[arg0].length > 1) {
            int var3 = this.field2454 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field2458[arg0].length];
            class275.method1770(this.field2458[arg0], 0, var5, 0, var5.length);
            if (arg1 < 48) {
                this.method1177(122, 122);
            }
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = var3 + class38.method235(var5.length - var3, -113, var4);
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field2458[arg0];
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method1179(byte arg0) {
        field2463 = null;
        field2455 = null;
        field2462 = null;
        int var1 = -61 / ((arg0 + 5) / 49);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public static final void method1180(Canvas arg0, int arg1) {
        field2461++;
        Dimension var2 = arg0.getSize();
        class544.method3067(arg1 - 21046, var2.width, var2.height);
        if (class278.field3847 == 1) {
            class369.field5000.method477(arg0, class256.field3597, class663.field9209);
        } else {
            class369.field5000.method477(arg0, class547.field7439, class747.field10318);
        }
        if (arg1 != 21047) {
            field2455 = null;
        }
    }
}
