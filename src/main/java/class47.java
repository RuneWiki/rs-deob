import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class class47 {

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field804 = -1;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lmb;")
    private static class132 field801 = class166.method1092("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", 119);

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "[Z")
    public static boolean[] field809 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lmb;")
    public static class132 field808 = field801;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lmb;")
    public static class132 field799 = class166.method1092("Sprites geladen)3", 114);

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lmb;")
    public static class132 field811 = class166.method1092("Sie haben gerade eine andere Welt verlassen)3", 114);

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Lmb;")
    public static class132 field812 = class166.method1092("::fps ", 124);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lmb;")
    private static class132 field798 = class166.method1092("Try again in 60 secs)3)3)3", 117);

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Lmb;")
    public static class132 field815 = field798;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Lbf;")
    public static class18 field810;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "[[[B")
    public static byte[][][] field816;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZI)V")
    public abstract void method310(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method311(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field797++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg1 - arg3;
        int var12 = arg6 - arg3;
        if (arg2 != -32) {
            return;
        }
        int var13 = arg1 * arg1;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var22) * var15 + var20;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var21) * var13 + var17;
        int var26 = var16 - (var22 - 1) * var19;
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var17 * 3;
        int var31 = var16 << 2;
        int var32 = (var21 - 3) * var18;
        int var33 = var20 * 3;
        int var34 = (var22 - 3) * var19;
        int var35 = var29;
        int var36 = (arg6 - 1) * var27;
        int var37 = var31;
        int var38 = (var12 - 1) * var28;
        int[] var39 = class61.field1033[arg7];
        class23.method153(arg4, var39, true, arg0 - arg1, arg0 - var11);
        class23.method153(arg5, var39, true, arg0 - var11, arg0 - -var11);
        class23.method153(arg4, var39, true, arg0 + var11, arg0 + arg1);
        while (var9 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var8++;
                    var24 += var35;
                    var35 += var29;
                    var25 += var30;
                    var30 += var29;
                }
            }
            if (var24 < 0) {
                var25 += var30;
                var8++;
                var30 += var29;
                var24 += var35;
                var35 += var29;
            }
            var25 += -var36;
            var36 -= var27;
            var24 += -var32;
            var32 -= var27;
            boolean var40 = var12 >= var9;
            if (var40) {
                if (var23 < 0) {
                    while (var23 < 0) {
                        var10++;
                        var23 += var33;
                        var26 += var37;
                        var37 += var31;
                        var33 += var31;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var37;
                    var23 += var33;
                    var37 += var31;
                    var33 += var31;
                }
                var26 += -var34;
                var23 += -var38;
                var38 -= var28;
                var34 -= var28;
            }
            var9--;
            int var41 = arg7 - var9;
            int var42 = arg0 + var8;
            int var43 = arg7 + var9;
            int var44 = arg0 - var8;
            if (var40) {
                int var45 = arg0 + var10;
                int var46 = arg0 - var10;
                class23.method153(arg4, class61.field1033[var41], true, var44, var46);
                class23.method153(arg5, class61.field1033[var41], true, var46, var45);
                class23.method153(arg4, class61.field1033[var41], true, var45, var42);
                class23.method153(arg4, class61.field1033[var43], true, var44, var46);
                class23.method153(arg5, class61.field1033[var43], true, var46, var45);
                class23.method153(arg4, class61.field1033[var43], true, var45, var42);
            } else {
                class23.method153(arg4, class61.field1033[var41], true, var44, var42);
                class23.method153(arg4, class61.field1033[var43], true, var44, var42);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIII)V")
    public static final void method312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field807++;
        int var6 = class159.method1034(arg5, (byte) 83, class169.field3161, class17.field254);
        int var7 = class159.method1034(arg3, (byte) 115, class169.field3161, class17.field254);
        int var8 = class159.method1034(arg4, (byte) 105, class135.field2542, class168.field3083);
        int var9 = class159.method1034(arg2, (byte) 92, class135.field2542, class168.field3083);
        if (arg0 == 4) {
            for (int var10 = var6; var10 <= var7; var10++) {
                class23.method153(arg1, class61.field1033[var10], true, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
    public abstract void method313(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field802++;
        if (arg4 < 128 || arg0 < 128 || arg4 > 13056 || arg0 > 13056) {
            class169.field3137 = -1;
            class26.field425 = -1;
            return;
        }
        int var8 = class195.method1239(arg0, class139.field2615, false, arg4) - arg5;
        int var9 = arg0 - client.field545;
        int var10 = var8 - class140.field2629;
        int var11 = class50.field853[class64.field1064];
        int var12 = class50.field851[class64.field1064];
        int var13 = class50.field853[class234.field4215];
        int var14 = class50.field851[class234.field4215];
        int var15 = arg4 - field814;
        int var16 = var9 * var13 + var14 * var15 >> 16;
        if (arg3 != -13057) {
            field798 = null;
        }
        int var17 = var9 * var14 - var13 * var15 >> 16;
        int var19 = var10 * var12 - var11 * var17 >> 16;
        int var20 = var10 * var11 + var12 * var17 >> 16;
        if (var20 >= 50) {
            class26.field425 = (var19 << 9) / var20 + arg6;
            class169.field3137 = (var16 << 9) / var20 + arg1;
        } else {
            class26.field425 = -1;
            class169.field3137 = -1;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)Z")
    public static final boolean method315(boolean arg0) {
        field800++;
        long var1 = class113.method769(127);
        int var3 = (int) (var1 - class35.field564);
        if (var3 > 200) {
            var3 = 200;
        }
        class226.field4100 += var3;
        class35.field564 = var1;
        if (class55.field923 == 0 && class200.field3689 == 0 && class34.field558 == 0 && class105.field1960 == 0) {
            return true;
        } else if (class130.field2397 == null) {
            return false;
        } else {
            try {
                if (class226.field4100 > 30000) {
                    throw new IOException();
                }
                while (class200.field3689 < 20 && class105.field1960 > 0) {
                    class198 var4 = (class198) class95.field1680.method811((byte) -4);
                    class112 var5 = new class112(4);
                    var5.method747(1, (byte) -76);
                    var5.method736(-126, (int) var4.field2760);
                    class130.field2397.method419(-67, var5.field2157, 0, 4);
                    class152.field2771.method810(var4, var4.field2760, -18274);
                    class105.field1960--;
                    class200.field3689++;
                }
                if (arg0) {
                    method315(true);
                }
                while (class55.field923 < 20 && class34.field558 > 0) {
                    class198 var6 = (class198) class104.field1948.method848(0);
                    class112 var7 = new class112(4);
                    var7.method747(0, (byte) -124);
                    var7.method736(21, (int) var6.field2760);
                    class130.field2397.method419(-99, var7.field2157, 0, 4);
                    var6.method306((byte) -123);
                    class101.field1897.method810(var6, var6.field2760, -18274);
                    class55.field923++;
                    class34.field558--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class130.field2397.method424(5000);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class226.field4100 = 0;
                    byte var10 = 0;
                    if (class37.field608 == null) {
                        var10 = 8;
                    } else if (class194.field3603 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class230.field4150.field2157.length - class37.field608.field3683;
                        int var12 = 512 - class194.field3603;
                        if (var11 - class230.field4150.field2133 < var12) {
                            var12 = var11 - class230.field4150.field2133;
                        }
                        if (var9 < var12) {
                            var12 = var9;
                        }
                        class130.field2397.method418(class230.field4150.field2157, (byte) 124, class230.field4150.field2133, var12);
                        if (class91.field1606 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class230.field4150.field2157[class230.field4150.field2133 + var13] = (byte) class122.method804(class230.field4150.field2157[class230.field4150.field2133 + var13], class91.field1606);
                            }
                        }
                        class230.field4150.field2133 += var12;
                        class194.field3603 += var12;
                        if (class230.field4150.field2133 == var11) {
                            if (class37.field608.field2760 == 16711935L) {
                                class183.field3376 = class230.field4150;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class155 var15 = class106.field1979[var14];
                                    if (var15 != null) {
                                        class183.field3376.field2133 = var14 * 8 + 5;
                                        int var16 = class183.field3376.method759(75);
                                        int var17 = class183.field3376.method759(118);
                                        var15.method1016(var17, var16, 0);
                                    }
                                }
                            } else {
                                class173.field3234.reset();
                                class173.field3234.update(class230.field4150.field2157, 0, var11);
                                int var18 = (int) class173.field3234.getValue();
                                if (class37.field608.field3682 != var18) {
                                    try {
                                        class130.field2397.method423(true);
                                    } catch (Exception var30) {
                                    }
                                    class130.field2397 = null;
                                    class91.field1606 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class158.field2872++;
                                    return false;
                                }
                                class158.field2872 = 0;
                                class75.field1245 = 0;
                                class37.field608.field3680.method1014(class230.field4150.field2157, (int) (class37.field608.field2760 & 0xFFFFL), (byte) 107, (class37.field608.field2760 & 0xFF0000L) == 16711680L, class111.field2100);
                            }
                            class37.field608.method995((byte) 117);
                            class194.field3603 = 0;
                            class230.field4150 = null;
                            class37.field608 = null;
                            if (class111.field2100) {
                                class200.field3689--;
                            } else {
                                class55.field923--;
                            }
                        } else {
                            if (class194.field3603 != 512) {
                                break;
                            }
                            class194.field3603 = 0;
                        }
                    } else {
                        int var19 = var10 - class162.field2941.field2133;
                        if (var19 > var9) {
                            var19 = var9;
                        }
                        class130.field2397.method418(class162.field2941.field2157, (byte) 109, class162.field2941.field2133, var19);
                        if (class91.field1606 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class162.field2941.field2157[class162.field2941.field2133 + var20] = (byte) class122.method804(class162.field2941.field2157[class162.field2941.field2133 + var20], class91.field1606);
                            }
                        }
                        class162.field2941.field2133 += var19;
                        if (class162.field2941.field2133 < var10) {
                            break;
                        }
                        if (class37.field608 == null) {
                            class162.field2941.field2133 = 0;
                            int var21 = class162.field2941.method716(-1308);
                            int var22 = class162.field2941.method739(75);
                            long var23 = (long) ((var21 << 16) + var22);
                            int var25 = class162.field2941.method716(-1308);
                            int var26 = class162.field2941.method759(109);
                            class198 var27 = (class198) class152.field2771.method806(-1, var23);
                            class111.field2100 = true;
                            if (var27 == null) {
                                var27 = (class198) class101.field1897.method806(-1, var23);
                                class111.field2100 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            int var28 = var25 == 0 ? 5 : 9;
                            class37.field608 = var27;
                            class230.field4150 = new class112(var26 + var28 + class37.field608.field3683);
                            class230.field4150.method747(var25, (byte) -80);
                            class230.field4150.method726((byte) 91, var26);
                            class162.field2941.field2133 = 0;
                            class194.field3603 = 8;
                        } else if (class194.field3603 == 0) {
                            if (class162.field2941.field2157[0] == -1) {
                                class162.field2941.field2133 = 0;
                                class194.field3603 = 1;
                            } else {
                                class37.field608 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class130.field2397.method423(true);
                } catch (Exception var29) {
                }
                class75.field1245++;
                class130.field2397 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method316(byte arg0) {
        field799 = null;
        field809 = null;
        field812 = null;
        field808 = null;
        field801 = null;
        field798 = null;
        field816 = null;
        field810 = null;
        int var1 = -4 % ((-arg0 - 58) / 36);
        field811 = null;
        field815 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILpb;Lpb;Lpb;)V")
    public static final void method317(int arg0, class165 arg1, class165 arg2, class165 arg3) {
        class65.field1073 = arg1.method1065(class189.field3481, -1);
        class238.field4294 = arg2.method1065(class110.field2067, -1);
        field806++;
        class240.field4318 = arg2.method1065(class187.field3459, arg0 - 6);
        if (arg0 != 5) {
            method317(-78, null, null, null);
        }
        class62.field1046 = arg2.method1065(class138.field2595, arg0 ^ 0xFFFFFFFA);
        class11.field152 = arg2.method1065(class171.field3195, -1);
        class214.field3910 = arg2.method1065(class222.field4036, -1);
        class101.field1903 = arg2.method1065(class153.field2791, arg0 ^ 0xFFFFFFFA);
        class72.field1213 = arg2.method1065(class133.field2498, -1);
        class103.field1934 = arg2.method1065(class131.field2424, -1);
        class182.field3342 = arg2.method1065(class152.field2775, arg0 - 6);
        class1.field6 = arg2.method1065(class34.field554, arg0 ^ 0xFFFFFFFA);
        class145.field2710 = arg3.method1065(class186.field3442, -1);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBI)V")
    public abstract void method318(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(III)V")
    public class47(int arg0, int arg1, int arg2) {
        this.field818 = arg0;
        this.field817 = arg1;
        this.field803 = arg2;
    }
}
