import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class66 {

    @OriginalMember(owner = "client!af", name = "k", descriptor = "B")
    private byte field1081;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[I")
    public static int[] field1074 = new int[1000];

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field1076 = -1;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "[I")
    public static int[] field1084 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field1078 = -1;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field1071 = 3353893;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field1089 = 0;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "[[B")
    public static byte[][] field1082;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method506(byte arg0, long arg1) {
        field1080++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        }
        if (arg0 != 20) {
            field1074 = null;
        }
        if (arg1 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
            var3++;
        }
        StringBuffer var6 = new StringBuffer(var3);
        while (arg1 != 0L) {
            long var7 = arg1;
            arg1 /= 37L;
            char var9 = class190.field3111[(int) (var7 - (arg1 * 37L))];
            if (var9 == '_') {
                var9 = ' ';
                int var10 = var6.length() - 1;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            var6.append(var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method507(byte arg0) {
        int var1 = 30 % ((arg0 + 68) / 42);
        field1084 = null;
        field1074 = null;
        field1082 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)I")
    public final int method508(boolean arg0) {
        if (!arg0) {
            field1084 = null;
        }
        field1085++;
        return this.field1081 & 0x7;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)V")
    public static final void method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1073++;
        if (class219.field3514 == 0) {
            int var7 = class144.field2381;
            int var8 = class161.field2625;
            int var9 = class19.field302;
            int var10 = class234.field3706;
            int var11 = (var10 - var7) * (arg4 - arg3) / arg1 + var7;
            int var12 = (arg2 - arg5) * (var8 - var9) / arg0 + var9;
            if (class239.field3761 && (class111.field1708 & 0x40) != 0) {
                class114 var13 = class129.method939(class33.field550, 36, class7.field90);
                if (var13 == null) {
                    class281.method1886(-39);
                } else {
                    class107.method798(0L, false, class110.field1702, (short) 7, var11, " ->", class135.field2226, var12);
                }
            } else {
                class134.field2218++;
                if (class238.field3752 == 1) {
                    class107.method798(0L, false, -1, (short) 13, var11, "", class204.field3286, var12);
                }
                class107.method798(0L, false, -1, (short) 5, var11, "", class139.field2328, var12);
            }
        }
        long var14 = -1L;
        int var16 = -29 % (arg6 / 42);
        for (int var17 = 0; var17 < class181.field3007; var17++) {
            long var18 = class274.field4386[var17];
            int var20 = ((int) var18 & 0x3FC5) >> 7;
            int var21 = (int) var18 & 0x7F;
            int var22 = ((int) var18 & 0x623096E0) >> 29;
            int var23 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            if (var14 != var18) {
                var14 = var18;
                if (var22 == 2 && class96.method729(class92.field1448, var21, var20, var18)) {
                    class248 var24 = class46.method396(var23, (byte) 63);
                    if (var24.field3897 != null) {
                        var24 = var24.method1656(0);
                    }
                    if (var24 == null) {
                        continue;
                    }
                    if (class219.field3514 == 1) {
                        class107.method798(var18, false, class286.field4556, (short) 28, var20, class236.field3730 + " -> <col=00ffff>" + var24.field3904, class131.field2169, var21);
                        class113.field1742++;
                    } else if (class239.field3761) {
                        class70 var25 = class172.field2912 == -1 ? null : class57.method455(class172.field2912, false);
                        if ((class111.field1708 & 0x4) != 0 && (var25 == null || var24.method1660(0, class172.field2912, var25.field1177) != var25.field1177)) {
                            class204.field3285++;
                            class107.method798(var18, false, class110.field1702, (short) 21, var20, class20.field314 + " -> <col=00ffff>" + var24.field3904, class135.field2226, var21);
                        }
                    } else {
                        class212.field3392++;
                        String[] var26 = var24.field3902;
                        if (class11.field156) {
                            var26 = class56.method449((byte) -30, var26);
                        }
                        if (var26 != null) {
                            for (int var27 = 4; var27 >= 0; var27--) {
                                if (var26[var27] != null) {
                                    short var28 = 0;
                                    int var29 = -1;
                                    if (var24.field3944 == var27) {
                                        var29 = var24.field3920;
                                    }
                                    if (var24.field3914 == var27) {
                                        var29 = var24.field3935;
                                    }
                                    if (var27 == 0) {
                                        var28 = 24;
                                    }
                                    class225.field3586++;
                                    if (var27 == 1) {
                                        var28 = 32;
                                    }
                                    if (var27 == 2) {
                                        var28 = 47;
                                    }
                                    if (var27 == 3) {
                                        var28 = 26;
                                    }
                                    if (var27 == 4) {
                                        var28 = 1006;
                                    }
                                    class107.method798(var18, false, var29, var28, var20, "<col=00ffff>" + var24.field3904, var26[var27], var21);
                                }
                            }
                        }
                        class107.method798((long) var24.field3893, false, class107.field1633, (short) 1005, var20, "<col=00ffff>" + var24.field3904, class32.field529, var21);
                    }
                }
                if (var22 == 1) {
                    class139 var30 = class3.field45[var23];
                    if ((var30.field2321.field2682 & 0x1) == 0 && (var30.field2849 & 0x7F) == 0 && (var30.field2887 & 0x7F) == 0 || (var30.field2321.field2682 & 0x1) == 1 && (var30.field2849 & 0x7F) == 64 && (var30.field2887 & 0x7F) == 64) {
                        int var31 = var30.field2849 - (var30.field2321.field2682 - 1) * 64;
                        int var32 = var30.field2887 + 64 - (var30.field2321.field2682 * 64);
                        for (int var33 = 0; var33 < class7.field88; var33++) {
                            class139 var38 = class3.field45[class287.field4587[var33]];
                            if (var38 != null && !var38.field2868 && var30 != var38 && var38.field2824) {
                                int var39 = var38.field2849 - ((var38.field2321.field2682 - 1) * 64);
                                int var40 = var38.field2887 - ((var38.field2321.field2682 - 1) * 64);
                                if (var31 <= var39 && (var30.field2321.field2682 - (var39 - var31 >> 7)) >= var38.field2321.field2682 && var32 <= var40 && var30.field2321.field2682 - (var40 - var32 >> 7) >= var38.field2321.field2682) {
                                    class201.method1359(var38.field2321, var20, class287.field4587[var33], var21, 0);
                                    var38.field2868 = true;
                                }
                            }
                        }
                        for (int var34 = 0; var34 < class144.field2386; var34++) {
                            class213 var35 = class191.field3129[class279.field4431[var34]];
                            if (var35 != null && !var35.field2868 && var35.field2824) {
                                int var36 = var35.field2849 + 64 - (var35.method1226((byte) -104) * 64);
                                int var37 = var35.field2887 + 64 - (var35.method1226((byte) -124) * 64);
                                if (var36 >= var31 && var35.method1226((byte) -85) <= var30.field2321.field2682 - (var36 - var31 >> 7) && var32 <= var37 && var35.method1226((byte) -118) <= var30.field2321.field2682 - (var37 - var32 >> 7)) {
                                    class193.method1322(var35, var20, var21, class279.field4431[var34], -95);
                                    var35.field2868 = true;
                                }
                            }
                        }
                    }
                    if (var30.field2868) {
                        continue;
                    }
                    class201.method1359(var30.field2321, var20, var23, var21, 0);
                    var30.field2868 = true;
                }
                if (var22 == 0) {
                    class213 var41 = class191.field3129[var23];
                    if ((var41.field2849 & 0x7F) == 64 && (var41.field2887 & 0x7F) == 64) {
                        int var42 = var41.field2849 + 64 - (var41.method1226((byte) -120) * 64);
                        int var43 = var41.field2887 - ((var41.method1226((byte) -93) - 1) * 64);
                        for (int var44 = 0; var44 < class7.field88; var44++) {
                            class139 var49 = class3.field45[class287.field4587[var44]];
                            if (var49 != null && !var49.field2868 && var49.field2824) {
                                int var50 = var49.field2849 - ((var49.field2321.field2682 - 1) * 64);
                                int var51 = 64 - (var49.field2321.field2682 * 64 - var49.field2887);
                                if (var42 <= var50 && var49.field2321.field2682 <= var41.method1226((byte) -115) - (var50 - var42 >> 7) && var51 >= var43 && var49.field2321.field2682 <= var41.method1226((byte) -98) - (var51 - var43 >> 7)) {
                                    class201.method1359(var49.field2321, var20, class287.field4587[var44], var21, 0);
                                    var49.field2868 = true;
                                }
                            }
                        }
                        for (int var45 = 0; var45 < class144.field2386; var45++) {
                            class213 var46 = class191.field3129[class279.field4431[var45]];
                            if (var46 != null && !var46.field2868 && var41 != var46 && var46.field2824) {
                                int var47 = var46.field2849 - ((var46.method1226((byte) -103) - 1) * 64);
                                int var48 = var46.field2887 + 64 - var46.method1226((byte) -116) * 64;
                                if (var47 >= var42 && var46.method1226((byte) -104) <= (var41.method1226((byte) -104) - (var47 - var42 >> 7)) && var43 <= var48 && var46.method1226((byte) -84) <= (var41.method1226((byte) -124) - (var48 - var43 >> 7))) {
                                    class193.method1322(var46, var20, var21, class279.field4431[var45], -102);
                                    var46.field2868 = true;
                                }
                            }
                        }
                    }
                    if (var41.field2868) {
                        continue;
                    }
                    class193.method1322(var41, var20, var21, var23, -85);
                    var41.field2868 = true;
                }
                if (var22 == 3) {
                    class266 var52 = class2.field23[class92.field1448][var21][var20];
                    if (var52 != null) {
                        for (class101 var53 = (class101) var52.method1813(2); var53 != null; var53 = (class101) var52.method1814(-1)) {
                            int var54 = var53.field1553.field3329;
                            class67 var55 = class190.method1314(var54, (byte) 68);
                            if (class219.field3514 == 1) {
                                class49.field902++;
                                class107.method798((long) var54, false, class286.field4556, (short) 33, var20, class236.field3730 + " -> <col=ff9040>" + var55.field1155, class131.field2169, var21);
                            } else if (class239.field3761) {
                                class70 var56 = class172.field2912 == -1 ? null : class57.method455(class172.field2912, false);
                                if ((class111.field1708 & 0x1) != 0 && (var56 == null || var55.method524(var56.field1177, class172.field2912, 62) != var56.field1177)) {
                                    class107.method798((long) var54, false, class110.field1702, (short) 11, var20, class20.field314 + " -> <col=ff9040>" + var55.field1155, class135.field2226, var21);
                                    class163.field2642++;
                                }
                            } else {
                                String[] var57 = var55.field1092;
                                if (class11.field156) {
                                    var57 = class56.method449((byte) -30, var57);
                                }
                                for (int var58 = 4; var58 >= 0; var58--) {
                                    if (var57 != null && var57[var58] != null) {
                                        class119.field2018++;
                                        int var59 = -1;
                                        if (var55.field1117 == var58) {
                                            var59 = var55.field1121;
                                        }
                                        byte var60 = 0;
                                        if (var58 == 0) {
                                            var60 = 3;
                                        }
                                        if (var55.field1128 == var58) {
                                            var59 = var55.field1145;
                                        }
                                        if (var58 == 1) {
                                            var60 = 49;
                                        }
                                        if (var58 == 2) {
                                            var60 = 50;
                                        }
                                        if (var58 == 3) {
                                            var60 = 9;
                                        }
                                        if (var58 == 4) {
                                            var60 = 46;
                                        }
                                        class107.method798((long) var54, false, var59, var60, var20, "<col=ff9040>" + var55.field1155, var57[var58], var21);
                                    }
                                }
                                class223.field3557++;
                                class107.method798((long) var54, false, class107.field1633, (short) 1007, var20, "<col=ff9040>" + var55.field1155, class32.field529, var21);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static final void method510(byte arg0) {
        field1079++;
        class26.field448.method1156(-101);
        if (arg0 != 56) {
            method510((byte) 37);
        }
        class152.field2489.method1156(-75);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
    public final int method511(int arg0) {
        field1077++;
        if (arg0 != 8) {
            method512((class78) null, (Object) null, (byte) 16);
        }
        return (this.field1081 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lne;Ljava/lang/Object;B)V")
    public static final void method512(class78 arg0, Object arg1, byte arg2) {
        if (arg2 != 43) {
            field1076 = 103;
        }
        field1083++;
        if (arg0.field1303 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field1303.peekEvent() != null; var3++) {
            class234.method1550(-28773, 1L);
        }
        if (arg1 != null) {
            arg0.field1303.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class66() {
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lig;)V")
    public class66(class136 arg0) {
        this.field1081 = arg0.method981(false);
        this.field1090 = arg0.method996(65280);
        this.field1086 = arg0.method1022(-127);
        this.field1087 = arg0.method1022(87);
        this.field1075 = arg0.method1022(109);
        this.field1072 = arg0.method1022(120);
    }
}
