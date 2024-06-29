import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class127 extends class202 {

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Ljava/lang/String;")
    public String field2049;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Lqh;")
    public static class201 field2054;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "[Ld;")
    public static class238[] field2051;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BILf;)I")
    public static final int method902(byte arg0, int arg1, class36 arg2) {
        field2052++;
        if (arg2.field721 == null || arg1 >= arg2.field721.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg2.field721[arg1];
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var4[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class235.field3834[var4[var5++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 2) {
                    var8 = class189.field3064[var4[var5++]];
                }
                if (var7 == 3) {
                    var8 = class167.field2660[var4[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class36 var12 = class64.method455(var11, 592427152);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class83.method595(var13, -67).field203 || class1.field31)) {
                        for (int var14 = 0; var14 < var12.field638.length; var14++) {
                            if ((var13 + 1) == var12.field638[var14]) {
                                var8 += var12.field714[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class82.field1289[var4[var5++]];
                }
                if (var7 == 6) {
                    var8 = class16.field281[class189.field3064[var4[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class82.field1289[var4[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class167.field2655.field519;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class52.field912[var15]) {
                            var8 += class189.field3064[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class36 var18 = class64.method455(var17, 592427152);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class83.method595(var19, -94).field203 || class1.field31)) {
                        for (int var20 = 0; var20 < var18.field638.length; var20++) {
                            if ((var19 + 1) == var18.field638[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class107.field1762;
                }
                if (var7 == 12) {
                    var8 = class168.field2669;
                }
                if (var7 == 13) {
                    int var21 = class82.field1289[var4[var5++]];
                    int var22 = var4[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var5++];
                    var8 = class168.method1155(var23, 90);
                }
                if (var7 == 18) {
                    var8 = (class167.field2655.field3389 >> 7) + class50.field884;
                }
                if (var7 == 19) {
                    var8 = (class167.field2655.field3341 >> 7) + class214.field3501;
                }
                if (var7 == 20) {
                    var8 = var4[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var3 += var8;
                    }
                    if (var6 == 1) {
                        var3 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var3 /= var8;
                    }
                    if (var6 == 3) {
                        var3 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            if (arg0 != -52) {
                field2051 = null;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)I")
    public static final int method903(byte arg0, int arg1) {
        if (arg0 <= 56) {
            return 70;
        } else {
            field2055++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
    public static void method904(int arg0) {
        if (arg0 >= 56) {
            field2051 = null;
            field2054 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
    public static final void method905(int arg0, int arg1, int arg2) {
        field2053++;
        class173 var3 = class34.method289(arg2, (byte) -94);
        int var4 = var3.field2729;
        int var5 = var3.field2724;
        int var6 = var3.field2730;
        int var7 = class285.field4504[var6 - var5];
        if (arg1 > arg0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class71.method506(var4, (byte) 32, var8 & arg0 << var5 | ~var8 & class82.field1289[var4]);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIBIIII)V")
    public static final void method906(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field2050++;
        if (arg2 >= -23) {
            method906(32, -13, (byte) -58, 29, 25, 28, -61);
        }
        if (class255.field4055 <= arg6 - arg4 && arg4 + arg6 <= class9.field128 && class161.field2561 <= arg5 - arg4 && (arg5 + arg4) <= class51.field896) {
            class49.method387((byte) 47, arg0, arg5, arg6, arg4, arg1, arg3);
        } else {
            class198.method1342(arg6, arg5, arg0, arg4, arg3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class127() {
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class127(String arg0, int arg1) {
        this.field2049 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method907(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class253.field4033 * arg0 + class211.field3444 * arg3 >> 16;
        int var6 = class253.field4033 * arg3 - class211.field3444 * arg0 >> 16;
        int var7 = class28.field443 * var6 + class227.field3756 * arg1 >> 16;
        int var8 = class28.field443 * arg1 - class227.field3756 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class28.field443 * var6 + class227.field3756 * arg2 >> 16;
        int var12 = class28.field443 * arg2 - class227.field3756 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class199.field3169 && var13 < class199.field3169) {
            return false;
        } else if (var9 > class287.field4543 && var13 > class287.field4543) {
            return false;
        } else if (var10 < class63.field1032 && var14 < class63.field1032) {
            return false;
        } else {
            return var10 <= class96.field1572 || var14 <= class96.field1572;
        }
    }
}
