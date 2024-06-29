import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class53 extends class123 {

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
    private int field907 = 0;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
    private int field906 = 0;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "I")
    private int field905 = 16;

    @OriginalMember(owner = "client!nh", name = "jb", descriptor = "I")
    private int field917 = 4096;

    @OriginalMember(owner = "client!nh", name = "nb", descriptor = "I")
    private int field921 = 2000;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "Leb;")
    private static class230 field908 = class68.method589(0, "flash2:");

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "Leb;")
    public static class230 field910 = field908;

    @OriginalMember(owner = "client!nh", name = "gb", descriptor = "Z")
    public static boolean field914 = false;

    @OriginalMember(owner = "client!nh", name = "db", descriptor = "Leb;")
    public static class230 field911 = field908;

    @OriginalMember(owner = "client!nh", name = "pb", descriptor = "Leb;")
    public static class230 field923 = class68.method589(0, "null");

    @OriginalMember(owner = "client!nh", name = "qb", descriptor = "Leb;")
    public static class230 field924 = class68.method589(0, "hitmarks");

    @OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!nh", name = "fb", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!nh", name = "hb", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!nh", name = "kb", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!nh", name = "lb", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!nh", name = "mb", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "Lug;")
    public static class193 field909;

    @OriginalMember(owner = "client!nh", name = "ob", descriptor = "Lbh;")
    public static class7 field922;

    @OriginalMember(owner = "client!nh", name = "ib", descriptor = "[[[Lqf;")
    public static class233[][][] field916;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.field917 = arg1.method161(4);
                        }
                    } else {
                        this.field906 = arg1.method161(4);
                    }
                } else {
                    this.field905 = arg1.method200(255);
                }
            } else {
                this.field921 = arg1.method161(4);
            }
        } else {
            this.field907 = arg1.method200(255);
        }
        if (arg2 != 1876195788) {
            method421(58, (byte) -6);
        }
        ++field919;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)V")
    public static final void method420(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class225.field3892; ++var3) {
            for (int var4 = 0; var4 < class30.field553; ++var4) {
                for (int var5 = 0; var5 < class117.field2102; ++var5) {
                    class233 var6 = field916[var3][var4][var5];
                    if (var6 != null) {
                        class108 var7 = var6.field4056;
                        if (var7 != null && var7.field1951.method607()) {
                            class68.method591(var7.field1951, var3, var4, var5, 1, 1);
                            if (var7.field1950 != null && var7.field1950.method607()) {
                                class68.method591(var7.field1950, var3, var4, var5, 1, 1);
                                var7.field1951.method603(var7.field1950, 0, 0, 0, false);
                                var7.field1950 = var7.field1950.method605(arg0, arg1, arg2);
                            }
                            var7.field1951 = var7.field1951.method605(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field4058; ++var8) {
                            class111 var10 = var6.field4050[var8];
                            if (var10 != null && var10.field1993.method607()) {
                                class68.method591(var10.field1993, var3, var4, var5, var10.field1989 - var10.field1988 + 1, var10.field2002 - var10.field1994 + 1);
                                var10.field1993 = var10.field1993.method605(arg0, arg1, arg2);
                            }
                        }
                        class56 var9 = var6.field4052;
                        if (var9 != null && var9.field1026.method607()) {
                            class258.method1800(var9.field1026, var3, var4, var5);
                            var9.field1026 = var9.field1026.method605(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class53() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IB)V")
    public static final void method421(int arg0, byte arg1) {
        if (arg1 != -40) {
            field911 = null;
        }
        ++field915;
        class197 var2 = class164.method1228(5, arg0, -1665874464);
        var2.method1407(-123);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) {
        class210.method1466(true);
        ++field912;
        if (arg0 != 0) {
            this.field917 = 5;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field913;
        int var3 = -79 % ((arg1 - -24) / 57);
        int[] var4 = super.field2160.method1323((byte) -88, arg0);
        if (super.field2160.field3243) {
            int var5 = this.field917 >> 1;
            int[][] var6 = super.field2160.method1319(0);
            Random var7 = new Random((long) this.field907);
            for (int var8 = 0; ~var8 > ~this.field921; ++var8) {
                int var9 = this.field917 > 0 ? this.field906 - (var5 + -class51.method413(var7, this.field917, Integer.MIN_VALUE)) : this.field906;
                int var10 = class51.method413(var7, class140.field2505, Integer.MIN_VALUE);
                int var11 = class51.method413(var7, class255.field4540, Integer.MIN_VALUE);
                int var12 = (4087 & var9) >> 4;
                int var13 = (class72.field1320[var12] * this.field905 >> 12) + var10;
                int var14 = var13 - var10;
                int var15 = (class213.field3695[var12] * this.field905 >> 12) + var11;
                int var16 = -var11 + var15;
                if (var14 != 0 || var16 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    boolean var17 = ~var16 < ~var14;
                    if (var17) {
                        int var18 = var13;
                        int var19 = var10;
                        var13 = var15;
                        var10 = var11;
                        var11 = var19;
                        var15 = var18;
                    }
                    if (var10 > var13) {
                        int var20 = var10;
                        var10 = var13;
                        int var21 = var11;
                        var13 = var20;
                        var11 = var15;
                        var15 = var21;
                    }
                    int var22 = var11;
                    int var23 = -var11 + var15;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = var13 - var10;
                    int var25 = -var24 / 2;
                    int var26 = -(class51.method413(var7, 4096, Integer.MIN_VALUE) >> 2) + 1024;
                    int var27 = 2048 / var24;
                    int var28 = ~var15 >= ~var11 ? -1 : 1;
                    for (int var29 = var10; var13 > var29; ++var29) {
                        var25 += var23;
                        int var30 = (var29 - var10) * var27 + var26 + 1024;
                        int var31 = class217.field3743 & var29;
                        int var32 = var22 & class79.field1431;
                        if (~var25 < -1) {
                            var22 += var28;
                            var25 -= var24;
                        }
                        if (var17) {
                            var6[var32][var31] = var30;
                        } else {
                            var6[var31][var32] = var30;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(II)V")
    public static final void method422(int arg0, int arg1) {
        ++field918;
        class116.field2068 = 1000 / arg1;
        if (arg0 != 1) {
            method421(-125, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
    public static void method423(int arg0) {
        field924 = null;
        field911 = null;
        field923 = null;
        field910 = null;
        field909 = null;
        field916 = null;
        field922 = null;
        field908 = null;
        if (arg0 > -57) {
            field914 = true;
        }
    }
}
