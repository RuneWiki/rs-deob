import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class272 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[I")
    public static int[] field4348 = new int[5];

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "[[B")
    public static byte[][] field4350 = new byte[50][];

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
    public static final void method1846() {
        class226.field3601 = 0;
        label191: for (int var0 = 0; var0 < field4349; var0++) {
            class228 var1 = class193.field3164[var0];
            if (class191.field3127 != null) {
                for (int var2 = 0; var2 < class191.field3127.length; var2++) {
                    if (class191.field3127[var2] != -1000000 && (var1.field3619 <= class191.field3127[var2] || var1.field3638 <= class191.field3127[var2]) && (var1.field3625 <= class143.field2361[var2] || var1.field3645 <= class143.field2361[var2]) && (var1.field3625 >= class150.field2466[var2] || var1.field3645 >= class150.field2466[var2]) && (var1.field3617 <= class252.field4010[var2] || var1.field3641 <= class252.field4010[var2]) && (var1.field3617 >= class220.field3529[var2] || var1.field3641 >= class220.field3529[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field3631 == 1) {
                int var3 = var1.field3628 + class194.field3178 - class263.field4171;
                if (var3 >= 0 && var3 <= class194.field3178 + class194.field3178) {
                    int var4 = var1.field3632 + class194.field3178 - class239.field3766;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3618 + class194.field3178 - class239.field3766;
                    if (var5 > class194.field3178 + class194.field3178) {
                        var5 = class194.field3178 + class194.field3178;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class21.field324[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class282.field4477 - var1.field3625;
                        if (var7 > 32) {
                            var1.field3627 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3627 = 2;
                            var7 = -var7;
                        }
                        var1.field3634 = (var1.field3617 - class271.field4346 << 8) / var7;
                        var1.field3637 = (var1.field3641 - class271.field4346 << 8) / var7;
                        var1.field3639 = (var1.field3619 - class89.field1421 << 8) / var7;
                        var1.field3640 = (var1.field3638 - class89.field1421 << 8) / var7;
                        class179.field2971[class226.field3601++] = var1;
                    }
                }
            } else if (var1.field3631 == 2) {
                int var8 = var1.field3632 + class194.field3178 - class239.field3766;
                if (var8 >= 0 && var8 <= class194.field3178 + class194.field3178) {
                    int var9 = var1.field3628 + class194.field3178 - class263.field4171;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3622 + class194.field3178 - class263.field4171;
                    if (var10 > class194.field3178 + class194.field3178) {
                        var10 = class194.field3178 + class194.field3178;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class21.field324[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class271.field4346 - var1.field3617;
                        if (var12 > 32) {
                            var1.field3627 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3627 = 4;
                            var12 = -var12;
                        }
                        var1.field3624 = (var1.field3625 - class282.field4477 << 8) / var12;
                        var1.field3643 = (var1.field3645 - class282.field4477 << 8) / var12;
                        var1.field3639 = (var1.field3619 - class89.field1421 << 8) / var12;
                        var1.field3640 = (var1.field3638 - class89.field1421 << 8) / var12;
                        class179.field2971[class226.field3601++] = var1;
                    }
                }
            } else if (var1.field3631 == 4) {
                int var13 = var1.field3619 - class89.field1421;
                if (var13 > 128) {
                    int var14 = var1.field3632 + class194.field3178 - class239.field3766;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3618 + class194.field3178 - class239.field3766;
                    if (var15 > class194.field3178 + class194.field3178) {
                        var15 = class194.field3178 + class194.field3178;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3628 + class194.field3178 - class263.field4171;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3622 + class194.field3178 - class263.field4171;
                        if (var17 > class194.field3178 + class194.field3178) {
                            var17 = class194.field3178 + class194.field3178;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class21.field324[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3627 = 5;
                            var1.field3624 = (var1.field3625 - class282.field4477 << 8) / var13;
                            var1.field3643 = (var1.field3645 - class282.field4477 << 8) / var13;
                            var1.field3634 = (var1.field3617 - class271.field4346 << 8) / var13;
                            var1.field3637 = (var1.field3641 - class271.field4346 << 8) / var13;
                            class179.field2971[class226.field3601++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLig;Ljava/lang/String;)I")
    public static final int method1847(boolean arg0, class136 arg1, String arg2) {
        field4351++;
        int var3 = arg1.field2231;
        byte[] var4 = class268.method1826(arg2, -80);
        arg1.method1005(-90, var4.length);
        if (arg0) {
            field4349 = -114;
        }
        arg1.field2231 += class72.field1195.method1771(arg1.field2263, 0, arg1.field2231, 0, var4.length, var4);
        return arg1.field2231 - var3;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
    public static void method1848(boolean arg0) {
        field4348 = null;
        if (arg0) {
            field4348 = null;
        }
        field4350 = null;
    }
}
