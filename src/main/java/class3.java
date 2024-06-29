import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class3 {

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public int field40 = -1;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Z")
    public boolean field41 = true;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public int field49 = 0;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public int field45 = -1;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lij;")
    private static class50 field39 = class78.method578(121, "Hidden");

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[J")
    public static long[] field42 = new long[32];

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Lij;")
    public static class50 field48 = field39;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field52 = 0;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "J")
    public static long field53 = 0L;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Lda;")
    public static class22 field46;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II[BIZI[Llj;I)V")
    public static final void method15(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4, int arg5, class44[] arg6, int arg7) {
        field47++;
        byte var8;
        if (arg4) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg4) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg3 + var10 > 0 && arg3 + var10 < 103 && (arg5 + var11) > 0 && arg5 + var11 < 103) {
                            arg6[var9].field814[arg3 + var10][arg5 + var11] = class51.method413(arg6[var9].field814[arg3 + var10][arg5 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class217 var12 = new class217(arg2);
        int var13 = 0;
        if (arg1 != -3) {
            method16(46);
        }
        while (var8 > var13) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class17.method131(var12, 0, var13, arg3 + var14, arg7, arg5 + var15, arg0, true, arg4);
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method16(int arg0) {
        field46 = null;
        field42 = null;
        field48 = null;
        if (arg0 != 3) {
            field53 = 48L;
        }
        field39 = null;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
    public static final void method17(int arg0) {
        field43++;
        class119.field2109.method1596(-94);
        int var1 = class119.field2109.method1600(2, 8);
        if (var1 < class6.field77) {
            for (int var2 = var1; var2 < class6.field77; var2++) {
                class104.field1896[class207.field3446++] = class153.field2678[var2];
            }
        }
        if (var1 > class6.field77) {
            throw new RuntimeException("gnpov1");
        }
        class6.field77 = 0;
        if (arg0 <= 81) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class153.field2678[var3];
            class53 var5 = class41.field764[var4];
            int var6 = class119.field2109.method1600(2, 1);
            if (var6 == 0) {
                class153.field2678[class6.field77++] = var4;
                var5.field3981 = class244.field4245;
            } else {
                int var7 = class119.field2109.method1600(2, 2);
                if (var7 == 0) {
                    class153.field2678[class6.field77++] = var4;
                    var5.field3981 = class244.field4245;
                    class249.field4322[class170.field2855++] = var4;
                } else if (var7 == 1) {
                    class153.field2678[class6.field77++] = var4;
                    var5.field3981 = class244.field4245;
                    int var8 = class119.field2109.method1600(2, 3);
                    var5.method1607(false, var8, 1);
                    int var9 = class119.field2109.method1600(2, 1);
                    if (var9 == 1) {
                        class249.field4322[class170.field2855++] = var4;
                    }
                } else if (var7 == 2) {
                    class153.field2678[class6.field77++] = var4;
                    var5.field3981 = class244.field4245;
                    int var10 = class119.field2109.method1600(2, 3);
                    var5.method1607(true, var10, 1);
                    int var11 = class119.field2109.method1600(2, 3);
                    var5.method1607(true, var11, 1);
                    int var12 = class119.field2109.method1600(2, 1);
                    if (var12 == 1) {
                        class249.field4322[class170.field2855++] = var4;
                    }
                } else if (var7 == 3) {
                    class104.field1896[class207.field3446++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILwd;I)V")
    private final void method18(int arg0, int arg1, class217 arg2, int arg3) {
        field50++;
        if (arg0 != 0) {
            this.field40 = 43;
        }
        if (arg1 == 1) {
            this.field49 = class157.method1094(-16711936, arg2.method1447(-11));
        } else if (arg1 == 2) {
            this.field40 = arg2.method1487(arg0 + 255);
        } else if (arg1 == 3) {
            this.field40 = arg2.method1441(-17);
            if (this.field40 == 65535) {
                this.field40 = -1;
                return;
            }
        } else if (arg1 == 5) {
            this.field41 = false;
            return;
        } else if (arg1 == 7) {
            this.field45 = class157.method1094(-16711936, arg2.method1447(arg0 + 117));
            return;
        } else if (arg1 == 8) {
            field52 = arg3;
            return;
        } else {
            if (arg1 == 9) {
                arg2.method1441(94);
            } else if (arg1 != 10) {
                if (arg1 == 11) {
                    arg2.method1487(255);
                } else if (arg1 != 12) {
                    if (arg1 == 13) {
                        arg2.method1447(124);
                        return;
                    }
                    if (arg1 == 14) {
                        arg2.method1487(255);
                        return;
                    }
                }
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZBIZZI)Ljd;")
    public static final class85 method19(int arg0, int arg1, boolean arg2, byte arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        field38++;
        class239 var8 = class15.method111(arg1, false);
        if (arg4 > 1 && var8.field4115 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg4 >= var8.field4054[var10] && var8.field4054[var10] != 0) {
                    var9 = var8.field4115[var10];
                }
            }
            if (var9 != -1) {
                var8 = class15.method111(var9, false);
            }
        }
        class149 var11 = var8.method1613(0);
        if (var11 == null) {
            return null;
        }
        class169 var12 = null;
        if (var8.field4058 != -1) {
            var12 = (class169) method19(0, var8.field4047, true, (byte) 105, 10, true, false, 1);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4055 != -1) {
            var12 = (class169) method19(arg0, var8.field4064, false, (byte) 105, arg4, true, false, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class158.field2729;
        if (arg3 != 105) {
            field53 = -84L;
        }
        int var14 = class158.field2724;
        int var15 = class158.field2730;
        int[] var16 = new int[4];
        class158.method1098(var16);
        class169 var17 = new class169(36, 32);
        class158.method1117(var17.field2836, 36, 32);
        class13.method90();
        class13.method104(16, 16);
        class13.field312 = false;
        int var18 = var8.field4049;
        if (arg2) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg7 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class13.field313[var8.field4086] * var18 >> 16;
        int var20 = class13.field311[var8.field4086] * var18 >> 16;
        var11.method752(0, var8.field4119, var8.field4107, var8.field4086, var8.field4052, var19 + (var8.field4074 - (var11.method126() / 2)), var8.field4074 + var20);
        if (arg7 >= 1) {
            var17.method1179(1);
            if (arg7 >= 2) {
                var17.method1179(16777215);
            }
            class158.method1117(var17.field2836, 36, 32);
        }
        if (arg0 != 0) {
            var17.method1173(arg0);
        }
        if (var8.field4058 != -1) {
            var12.method673(0, 0);
        } else if (var8.field4055 != -1) {
            class158.method1117(var12.field2836, 36, 32);
            var17.method673(0, 0);
            var17 = var12;
        }
        if (arg6 && (var8.field4117 == 1 || arg4 != 1) && arg4 != -1) {
            class26.field557.method1058(class7.method46(arg3 + 919, arg4), 0, 9, 16776960, 1);
        }
        class158.method1117(var13, var14, var15);
        class158.method1120(var16);
        class13.method90();
        class13.field312 = true;
        return var17;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    public static final void method20(int arg0) {
        class160.field2758 &= 0x7FF;
        if (class19.field406 < 128) {
            class19.field406 = 128;
        }
        int var1 = class17.field376 >> 7;
        if (class19.field406 > 383) {
            class19.field406 = 383;
        }
        int var2 = class161.field2768 >> 7;
        field51++;
        int var3 = class187.method1260((byte) 35, class17.field376, class161.field2768, class201.field3312);
        int var4 = 0;
        if (arg0 > -59) {
            return;
        }
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class201.field3312;
                    if (var7 < 3 && (class210.field3495[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class245.field4257[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class186.field3048) {
            class186.field3048 += (var9 - class186.field3048) / 24;
        } else if (class186.field3048 > var9) {
            class186.field3048 += (var9 - class186.field3048) / 80;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILwd;)V")
    public final void method21(int arg0, int arg1, class217 arg2) {
        int var4 = -97 % ((arg0 - 50) / 52);
        field44++;
        while (true) {
            int var5 = arg2.method1487(255);
            if (var5 == 0) {
                return;
            }
            this.method18(0, var5, arg2, arg1);
        }
    }
}
