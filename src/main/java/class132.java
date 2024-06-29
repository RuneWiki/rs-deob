import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class132 extends class47 {

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field3211 = 0;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field3215 = 0;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field3214 = 0;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "Loc;")
    public static class99 field3217 = class48.method402((byte) -104, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!te", name = "H", descriptor = "Loc;")
    public static class99 field3221 = class48.method402((byte) -104, "(Udns");

    @OriginalMember(owner = "client!te", name = "J", descriptor = "Loc;")
    public static class99 field3223 = class48.method402((byte) -104, "Angreifen");

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3222 = Calendar.getInstance();

    @OriginalMember(owner = "client!te", name = "P", descriptor = "Loc;")
    public static class99 field3229 = class48.method402((byte) -104, "Freunde)2Server)3)3)3");

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "Lve;")
    public class144 field3212;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "Lef;")
    public class35 field3216;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "[B")
    public byte[] field3219;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "[Ljc;")
    public static class64[] field3226;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "[[Lhe;")
    public static class54[][] field3230;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([BII)I")
    public static final int method1064(byte[] arg0, int arg1, int arg2) {
        if (arg2 > -104) {
            method1071((byte) 109);
        }
        field3224++;
        return class142.method1160(0, arg1, true, arg0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)I")
    public static final int method1065(int arg0, byte arg1) {
        field3209++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 != -35) {
            field3214 = -63;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
    public static final void method1066(boolean arg0, int arg1) {
        field3210++;
        class9.field226 = arg0;
        if (class9.field226) {
            int var15 = class39.field965.method475(2);
            int var16 = class39.field965.method478(false);
            int var17 = class39.field965.method497(29);
            class39.field965.method865(false);
            for (int var18 = 0; var18 < 4; var18++) {
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        int var37 = class39.field965.method864(1, arg1 - 25648);
                        if (var37 == 1) {
                            class140.field3484[var18][var35][var36] = class39.field965.method864(26, -25644);
                        } else {
                            class140.field3484[var18][var35][var36] = -1;
                        }
                    }
                }
            }
            class39.field965.method872((byte) -73);
            int var19 = (class77.field1903 - class39.field965.field1477) / 16;
            class1.field23 = new int[var19][4];
            for (int var20 = 0; var20 < var19; var20++) {
                for (int var34 = 0; var34 < 4; var34++) {
                    class1.field23[var20][var34] = class39.field965.method513(Integer.MAX_VALUE);
                }
            }
            int var21 = class39.field965.method497(29);
            int var22 = class39.field965.method504((byte) 49);
            class69.field1781 = new int[var19];
            class143.field3543 = new byte[var19][];
            class114.field2841 = new int[var19];
            class82.field2038 = new byte[var19][];
            class144.field3608 = new int[var19];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        int var27 = class140.field3484[var24][var25][var26];
                        if (var27 != -1) {
                            int var28 = var27 >> 14 & 0x3FF;
                            int var29 = var27 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + (var29 / 8);
                            for (int var31 = 0; var31 < var23; var31++) {
                                if (class69.field1781[var31] == var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (var30 != -1) {
                                int var32 = var30 >> 8 & 0xFF;
                                int var33 = var30 & 0xFF;
                                class69.field1781[var23] = var30;
                                class114.field2841[var23] = class16.field410.method883(class20.method189(new class99[] { class91.field2222, class5.method31(var32, class69.method609(arg1, 14)), class83.field2073, class5.method31(var33, 10) }, arg1 + 25), arg1 + 94);
                                class144.field3608[var23] = class16.field410.method883(class20.method189(new class99[] { class53.field1269, class5.method31(var32, 10), class83.field2073, class5.method31(var33, arg1 + 6) }, 23), 98);
                                var23++;
                            }
                        }
                    }
                }
            }
            class136.method1134(var15, var21, var22, 115, var17, var16);
        } else {
            int var2 = class39.field965.method489(arg1 ^ 0x4);
            int var3 = (class77.field1903 - class39.field965.field1477) / 16;
            class1.field23 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class1.field23[var4][var14] = class39.field965.method513(Integer.MAX_VALUE);
                }
            }
            int var5 = class39.field965.method478(false);
            int var6 = class39.field965.method506(arg1 - 5);
            int var7 = class39.field965.method478(false);
            int var8 = class39.field965.method478(false);
            class144.field3608 = new int[var3];
            class114.field2841 = new int[var3];
            class82.field2038 = new byte[var3][];
            class69.field1781 = new int[var3];
            class143.field3543 = new byte[var3][];
            boolean var9 = false;
            if ((var5 / 8 == 48 || var5 / 8 == 49) && (var8 / 8) == 48) {
                var9 = true;
            }
            int var10 = 0;
            if (var5 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            for (int var11 = (var5 - 6) / 8; var11 <= (var5 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class69.field1781[var10] = var13;
                        class114.field2841[var10] = class16.field410.method883(class20.method189(new class99[] { class91.field2222, class5.method31(var11, 10), class83.field2073, class5.method31(var12, 10) }, 109), class69.method609(arg1, 109));
                        class144.field3608[var10] = class16.field410.method883(class20.method189(new class99[] { class53.field1269, class5.method31(var11, 10), class83.field2073, class5.method31(var12, arg1 + 6) }, 110), 125);
                        var10++;
                    }
                }
            }
            class136.method1134(var2, var8, var7, arg1 + 116, var5, var6);
        }
        if (arg1 != 4) {
            field3214 = -123;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Loc;Loc;BLpc;)[Ljc;")
    public static final class64[] method1067(class99 arg0, class99 arg1, byte arg2, class105 arg3) {
        field3225++;
        int var4 = arg3.method883(arg1, arg2 ^ 0x46);
        int var5 = arg3.method898(arg0, 60, var4);
        if (arg2 != 50) {
            field3223 = null;
        }
        return class27.method255(var4, var5, (byte) -77, arg3);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILae;IILee;III)V")
    public static final void method1068(int arg0, int arg1, class6 arg2, int arg3, int arg4, class34 arg5, int arg6, int arg7, int arg8) {
        field3220++;
        if (class27.field684 && (class81.field2028[0][arg3][arg0] & 0x2) == 0) {
            if ((class81.field2028[arg1][arg3][arg0] & 0x10) != 0) {
                return;
            }
            if (class77.method680(arg1, arg3, -99, arg0) != class23.field560) {
                return;
            }
        }
        if (arg1 < class12.field290) {
            class12.field290 = arg1;
        }
        int var9 = class121.field2964[arg1][arg3][arg0];
        int var10 = class121.field2964[arg1][arg3 + 1][arg0 + 1];
        int var11 = class121.field2964[arg1][arg3 + 1][arg0];
        int var12 = class121.field2964[arg1][arg3][arg0 + 1];
        int var13 = arg3 + (arg0 << 7) + (arg6 << 14) + 1073741824;
        class16 var14 = class83.method717(arg7 ^ 0xFFFFEEDA, arg6);
        int var15 = var11 + var12 + var9 + var10 >> 2;
        if (var14.field395 == 0) {
            var13 += Integer.MIN_VALUE;
        }
        int var16 = (arg8 << 6) + arg4;
        if (var14.field389 == 1) {
            var16 += 256;
        }
        if (var14.method165((byte) -116)) {
            class58.method522(arg3, -125, arg0, var14, arg8, arg1);
        }
        if (arg4 == 22) {
            if (!class27.field684 || var14.field395 != 0 || var14.field428) {
                class88 var17;
                if (var14.field405 == -1 && var14.field404 == null) {
                    var17 = var14.method161(var10, (byte) -105, arg8, 22, var9, var12, var11);
                } else {
                    var17 = new class32(arg6, 22, arg8, var9, var11, var10, var12, var14.field405, true, null);
                }
                arg2.method67(arg1, arg3, arg0, var15, var17, var13, var16);
                if (var14.field403 && var14.field395 == 1 && arg5 != null) {
                    arg5.method287(arg0, arg3, arg7 + 2101540);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class88 var37;
            if (var14.field405 == -1 && var14.field404 == null) {
                var37 = var14.method161(var10, (byte) -60, arg8, 10, var9, var12, var11);
            } else {
                var37 = new class32(arg6, 10, arg8, var9, var11, var10, var12, var14.field405, true, null);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg8 == 1 || arg8 == 3) {
                    var38 = var14.field376;
                    var39 = var14.field425;
                } else {
                    var38 = var14.field425;
                    var39 = var14.field376;
                }
                int var40 = 0;
                if (arg4 == 11) {
                    var40 += 256;
                }
                if (arg2.method35(arg1, arg3, arg0, var15, var38, var39, var37, var40, var13, var16) && var14.field442) {
                    int var41 = 15;
                    if (var37 instanceof class26) {
                        var41 = ((class26) var37).method237() / 4;
                        if (var41 > 30) {
                            var41 = 30;
                        }
                    }
                    for (int var42 = 0; var42 <= var38; var42++) {
                        for (int var43 = 0; var43 <= var39; var43++) {
                            if (var41 > class9.field227[arg1][arg3 + var42][arg0 + var43]) {
                                class9.field227[arg1][arg3 + var42][arg0 + var43] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var14.field403 && arg5 != null) {
                arg5.method298(var14.field376, var14.field425, var14.field441, (byte) 36, arg3, arg0, arg8);
            }
        } else if (arg4 >= 12) {
            class88 var18;
            if (var14.field405 == -1 && var14.field404 == null) {
                var18 = var14.method161(var10, (byte) -125, arg8, arg4, var9, var12, var11);
            } else {
                var18 = new class32(arg6, arg4, arg8, var9, var11, var10, var12, var14.field405, true, null);
            }
            arg2.method35(arg1, arg3, arg0, var15, 1, 1, var18, 0, var13, var16);
            if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg1 > 0) {
                class2.field31[arg1][arg3][arg0] = class88.method744(class2.field31[arg1][arg3][arg0], 2340);
            }
            if (var14.field403 && arg5 != null) {
                arg5.method298(var14.field376, var14.field425, var14.field441, (byte) 36, arg3, arg0, arg8);
            }
        } else if (arg4 == 0) {
            class88 var19;
            if (var14.field405 == -1 && var14.field404 == null) {
                var19 = var14.method161(var10, (byte) -103, arg8, 0, var9, var12, var11);
            } else {
                var19 = new class32(arg6, 0, arg8, var9, var11, var10, var12, var14.field405, true, null);
            }
            arg2.method83(arg1, arg3, arg0, var15, var19, null, class87.field2173[arg8], 0, var13, var16);
            if (arg8 == 0) {
                if (var14.field442) {
                    class9.field227[arg1][arg3][arg0] = 50;
                    class9.field227[arg1][arg3][arg0 + 1] = 50;
                }
                if (var14.field375) {
                    class2.field31[arg1][arg3][arg0] = class88.method744(class2.field31[arg1][arg3][arg0], 585);
                }
            } else if (arg8 == 1) {
                if (var14.field442) {
                    class9.field227[arg1][arg3][arg0 + 1] = 50;
                    class9.field227[arg1][arg3 + 1][arg0 + 1] = 50;
                }
                if (var14.field375) {
                    class2.field31[arg1][arg3][arg0 + 1] = class88.method744(class2.field31[arg1][arg3][arg0 + 1], 1170);
                }
            } else if (arg8 == 2) {
                if (var14.field442) {
                    class9.field227[arg1][arg3 + 1][arg0] = 50;
                    class9.field227[arg1][arg3 + 1][arg0 + 1] = 50;
                }
                if (var14.field375) {
                    class2.field31[arg1][arg3 + 1][arg0] = class88.method744(class2.field31[arg1][arg3 + 1][arg0], 585);
                }
            } else if (arg8 == 3) {
                if (var14.field442) {
                    class9.field227[arg1][arg3][arg0] = 50;
                    class9.field227[arg1][arg3 + 1][arg0] = 50;
                }
                if (var14.field375) {
                    class2.field31[arg1][arg3][arg0] = class88.method744(class2.field31[arg1][arg3][arg0], 1170);
                }
            }
            if (var14.field403 && arg5 != null) {
                arg5.method291(arg3, (byte) 12, arg0, arg8, var14.field441, arg4);
            }
            if (var14.field430 != 16) {
                arg2.method58(arg1, arg3, arg0, var14.field430);
            }
        } else if (arg4 == 1) {
            class88 var20;
            if (var14.field405 == -1 && var14.field404 == null) {
                var20 = var14.method161(var10, (byte) -38, arg8, 1, var9, var12, var11);
            } else {
                var20 = new class32(arg6, 1, arg8, var9, var11, var10, var12, var14.field405, true, null);
            }
            arg2.method83(arg1, arg3, arg0, var15, var20, null, class95.field2324[arg8], 0, var13, var16);
            if (var14.field442) {
                if (arg8 == 0) {
                    class9.field227[arg1][arg3][arg0 + 1] = 50;
                } else if (arg8 == 1) {
                    class9.field227[arg1][arg3 + 1][arg0 + 1] = 50;
                } else if (arg8 == 2) {
                    class9.field227[arg1][arg3 + 1][arg0] = 50;
                } else if (arg8 == 3) {
                    class9.field227[arg1][arg3][arg0] = 50;
                }
            }
            if (var14.field403 && arg5 != null) {
                arg5.method291(arg3, (byte) 12, arg0, arg8, var14.field441, arg4);
            }
        } else if (arg4 == 2) {
            int var21 = arg8 + 1 & 0x3;
            class88 var22;
            class88 var23;
            if (var14.field405 == -1 && var14.field404 == null) {
                var22 = var14.method161(var10, (byte) -103, arg8 + 4, 2, var9, var12, var11);
                var23 = var14.method161(var10, (byte) -81, var21, 2, var9, var12, var11);
            } else {
                var22 = new class32(arg6, 2, arg8 + 4, var9, var11, var10, var12, var14.field405, true, null);
                var23 = new class32(arg6, 2, var21, var9, var11, var10, var12, var14.field405, true, null);
            }
            arg2.method83(arg1, arg3, arg0, var15, var22, var23, class87.field2173[arg8], class87.field2173[var21], var13, var16);
            if (var14.field375) {
                if (arg8 == 0) {
                    class2.field31[arg1][arg3][arg0] = class88.method744(class2.field31[arg1][arg3][arg0], 585);
                    class2.field31[arg1][arg3][arg0 + 1] = class88.method744(class2.field31[arg1][arg3][arg0 + 1], 1170);
                } else if (arg8 == 1) {
                    class2.field31[arg1][arg3][arg0 + 1] = class88.method744(class2.field31[arg1][arg3][arg0 + 1], 1170);
                    class2.field31[arg1][arg3 + 1][arg0] = class88.method744(class2.field31[arg1][arg3 + 1][arg0], 585);
                } else if (arg8 == 2) {
                    class2.field31[arg1][arg3 + 1][arg0] = class88.method744(class2.field31[arg1][arg3 + 1][arg0], 585);
                    class2.field31[arg1][arg3][arg0] = class88.method744(class2.field31[arg1][arg3][arg0], 1170);
                } else if (arg8 == 3) {
                    class2.field31[arg1][arg3][arg0] = class88.method744(class2.field31[arg1][arg3][arg0], 1170);
                    class2.field31[arg1][arg3][arg0] = class88.method744(class2.field31[arg1][arg3][arg0], 585);
                }
            }
            if (var14.field403 && arg5 != null) {
                arg5.method291(arg3, (byte) 12, arg0, arg8, var14.field441, arg4);
            }
            if (var14.field430 != 16) {
                arg2.method58(arg1, arg3, arg0, var14.field430);
            }
        } else if (arg4 == 3) {
            class88 var24;
            if (var14.field405 == -1 && var14.field404 == null) {
                var24 = var14.method161(var10, (byte) -17, arg8, 3, var9, var12, var11);
            } else {
                var24 = new class32(arg6, 3, arg8, var9, var11, var10, var12, var14.field405, true, null);
            }
            arg2.method83(arg1, arg3, arg0, var15, var24, null, class95.field2324[arg8], 0, var13, var16);
            if (var14.field442) {
                if (arg8 == 0) {
                    class9.field227[arg1][arg3][arg0 + 1] = 50;
                } else if (arg8 == 1) {
                    class9.field227[arg1][arg3 + 1][arg0 + 1] = 50;
                } else if (arg8 == 2) {
                    class9.field227[arg1][arg3 + 1][arg0] = 50;
                } else if (arg8 == 3) {
                    class9.field227[arg1][arg3][arg0] = 50;
                }
            }
            if (var14.field403 && arg5 != null) {
                arg5.method291(arg3, (byte) 12, arg0, arg8, var14.field441, arg4);
            }
        } else if (arg4 == 9) {
            class88 var25;
            if (var14.field405 == -1 && var14.field404 == null) {
                var25 = var14.method161(var10, (byte) -94, arg8, arg4, var9, var12, var11);
            } else {
                var25 = new class32(arg6, arg4, arg8, var9, var11, var10, var12, var14.field405, true, null);
            }
            arg2.method35(arg1, arg3, arg0, var15, 1, 1, var25, 0, var13, var16);
            if (var14.field403 && arg5 != null) {
                arg5.method298(var14.field376, var14.field425, var14.field441, (byte) 36, arg3, arg0, arg8);
            }
        } else {
            if (var14.field423) {
                if (arg8 == 1) {
                    int var26 = var12;
                    var12 = var10;
                    var10 = var11;
                    var11 = var9;
                    var9 = var26;
                } else if (arg8 == 2) {
                    int var27 = var12;
                    var12 = var11;
                    var11 = var27;
                    int var28 = var10;
                    var10 = var9;
                    var9 = var28;
                } else if (arg8 == 3) {
                    int var29 = var12;
                    var12 = var9;
                    var9 = var11;
                    var11 = var10;
                    var10 = var29;
                }
            }
            if (arg4 == 4) {
                class88 var30;
                if (var14.field405 == -1 && var14.field404 == null) {
                    var30 = var14.method161(var10, (byte) -22, 0, 4, var9, var12, var11);
                } else {
                    var30 = new class32(arg6, 4, 0, var9, var11, var10, var12, var14.field405, true, null);
                }
                arg2.method57(arg1, arg3, arg0, var15, var30, class87.field2173[arg8], arg8 * 512, 0, 0, var13, var16);
            } else if (arg4 == 5) {
                int var31 = 16;
                int var32 = arg2.method85(arg1, arg3, arg0);
                if (var32 != 0) {
                    var31 = class83.method717(6, var32 >> 14 & 0x7FFF).field430;
                }
                class88 var33;
                if (var14.field405 == -1 && var14.field404 == null) {
                    var33 = var14.method161(var10, (byte) -43, 0, 4, var9, var12, var11);
                } else {
                    var33 = new class32(arg6, 4, 0, var9, var11, var10, var12, var14.field405, true, null);
                }
                arg2.method57(arg1, arg3, arg0, var15, var33, class87.field2173[arg8], arg8 * 512, class58.field1522[arg8] * var31, class142.field3513[arg8] * var31, var13, var16);
            } else if (arg4 == 6) {
                class88 var34;
                if (var14.field405 == -1 && var14.field404 == null) {
                    var34 = var14.method161(var10, (byte) -82, 0, 4, var9, var12, var11);
                } else {
                    var34 = new class32(arg6, 4, 0, var9, var11, var10, var12, var14.field405, true, null);
                }
                arg2.method57(arg1, arg3, arg0, var15, var34, 256, arg8, 0, 0, var13, var16);
            } else {
                if (arg7 != -4388) {
                    method1066(false, -120);
                }
                if (arg4 == 7) {
                    class88 var35;
                    if (var14.field405 == -1 && var14.field404 == null) {
                        var35 = var14.method161(var10, (byte) -91, 0, 4, var9, var12, var11);
                    } else {
                        var35 = new class32(arg6, 4, 0, var9, var11, var10, var12, var14.field405, true, null);
                    }
                    arg2.method57(arg1, arg3, arg0, var15, var35, 512, arg8, 0, 0, var13, var16);
                } else if (arg4 == 8) {
                    class88 var36;
                    if (var14.field405 == -1 && var14.field404 == null) {
                        var36 = var14.method161(var10, (byte) -54, 0, 4, var9, var12, var11);
                    } else {
                        var36 = new class32(arg6, 4, 0, var9, var11, var10, var12, var14.field405, true, null);
                    }
                    arg2.method57(arg1, arg3, arg0, var15, var36, 768, arg8, 0, 0, var13, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public static final void method1069(int arg0) {
        class134.field3276.method869((byte) 11, 37);
        class130.field3194++;
        field3208++;
        if (class27.field679 != -1) {
            class83.method719(class27.field679, 118);
            class31.field731 = -1;
            class52.field1243 = true;
            class130.field3190 = true;
            class27.field679 = -1;
        }
        if (class87.field2162 != -1) {
            class83.method719(class87.field2162, 67);
            class113.field2832 = true;
            class31.field731 = -1;
            class87.field2162 = -1;
        }
        if (class119.field2923 != -1) {
            class83.method719(class119.field2923, 116);
            class119.field2923 = -1;
            class73.method663(30, (byte) 52);
        }
        if (arg0 > -108) {
            field3229 = null;
        }
        if (class36.field916 != -1) {
            class83.method719(class36.field916, 121);
            class36.field916 = -1;
        }
        if (class23.field555 != -1) {
            class83.method719(class23.field555, 75);
            class31.field731 = -1;
            class23.field555 = -1;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
    public static void method1070(byte arg0) {
        field3221 = null;
        field3229 = null;
        field3226 = null;
        field3230 = null;
        field3223 = null;
        field3217 = null;
        if (arg0 != 13) {
            method1064(null, -74, 45);
        }
        field3222 = null;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
    public static final void method1071(byte arg0) {
        if (arg0 <= 40) {
            field3228 = -48;
        }
        field3213++;
        if (class112.field2804 != 0 && class112.field2804 != 3 || class49.field1179 != 1) {
            return;
        }
        int var1 = class23.field540 - 575;
        int var2 = class4.field75 - 9;
        if (var1 < 0 || var2 < 0 || var1 >= 146 || var2 >= 151) {
            return;
        }
        var1 -= 73;
        int var3 = class32.field777 + class140.field3478 & 0x7FF;
        var2 -= 75;
        int var4 = class40.field982[var3];
        int var5 = class40.field981[var3];
        int var6 = (class23.field556 + 256) * var5 >> 8;
        int var7 = (class23.field556 + 256) * var4 >> 8;
        int var8 = var2 * var7 + var1 * var6 >> 11;
        int var9 = class69.field1770.field3115 + var8 >> 7;
        int var10 = var2 * var6 - var1 * var7 >> 11;
        int var11 = class69.field1770.field3077 - var10 >> 7;
        boolean var12 = class52.method432(true, 0, class69.field1770.field3096[0], 0, var11, 0, 0, var9, class69.field1770.field3100[0], (byte) 113, 0, 1);
        if (!var12) {
            return;
        }
        class134.field3276.method514((byte) 73, var1);
        class134.field3276.method514((byte) 73, var2);
        class134.field3276.method467(class140.field3478, true);
        class134.field3276.method514((byte) 73, 57);
        class134.field3276.method514((byte) 73, class32.field777);
        class134.field3276.method514((byte) 73, class23.field556);
        class134.field3276.method514((byte) 73, 89);
        class134.field3276.method467(class69.field1770.field3115, true);
        class134.field3276.method467(class69.field1770.field3077, true);
        class134.field3276.method514((byte) 73, class7.field206);
        class134.field3276.method514((byte) 73, 63);
        return;
    }
}
