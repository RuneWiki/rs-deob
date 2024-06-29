import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class175 {

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public int field2982;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lia;")
    private static class257 field2986 = class28.method234(-33, "Allocated memory");

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lia;")
    public static class257 field2985 = field2986;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[J")
    public static long[] field2981 = new long[100];

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lmb;")
    public static class178 field2990;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lvb;")
    public static class226 field2991;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "[I")
    public static int[] field2984;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method1186(byte arg0) {
        field2990 = null;
        field2985 = null;
        field2984 = null;
        field2991 = null;
        field2986 = null;
        field2981 = null;
        if (arg0 < 96) {
            field2985 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BII[Lhj;)V")
    public static final void method1187(byte arg0, int arg1, int arg2, class132[] arg3) {
        field2992++;
        if (arg0 < 65) {
            field2981 = null;
        }
        if (arg1 >= arg2) {
            return;
        }
        int var4 = arg1 - 1;
        int var5 = arg2 + 1;
        int var6 = (arg1 + arg2) / 2;
        class132 var7 = arg3[var6];
        arg3[var6] = arg3[arg1];
        arg3[arg1] = var7;
        while (var4 < var5) {
            boolean var8 = true;
            do {
                var5--;
                for (int var9 = 0; var9 < 4; var9++) {
                    int var10;
                    int var11;
                    if (class17.field372[var9] == 2) {
                        var10 = arg3[var5].field2370;
                        var11 = var7.field2370;
                    } else if (class17.field372[var9] == 1) {
                        var10 = arg3[var5].field2361;
                        var11 = var7.field2361;
                        if (var11 == -1 && class44.field1029[var9] == 1) {
                            var11 = 2001;
                        }
                        if (var10 == -1 && class44.field1029[var9] == 1) {
                            var10 = 2001;
                        }
                    } else if (class17.field372[var9] == 3) {
                        var11 = var7.field2364 ? 1 : 0;
                        var10 = arg3[var5].field2364 ? 1 : 0;
                    } else {
                        var11 = var7.field2375;
                        var10 = arg3[var5].field2375;
                    }
                    if (var10 != var11) {
                        if ((class44.field1029[var9] != 1 || var11 >= var10) && (class44.field1029[var9] != 0 || var11 <= var10)) {
                            var8 = false;
                        }
                        break;
                    }
                    if (var9 == 3) {
                        var8 = false;
                    }
                }
            } while (var8);
            boolean var12 = true;
            do {
                var4++;
                for (int var13 = 0; var13 < 4; var13++) {
                    int var14;
                    int var15;
                    if (class17.field372[var13] == 2) {
                        var14 = var7.field2370;
                        var15 = arg3[var4].field2370;
                    } else if (class17.field372[var13] == 1) {
                        var14 = var7.field2361;
                        if (var14 == -1 && class44.field1029[var13] == 1) {
                            var14 = 2001;
                        }
                        var15 = arg3[var4].field2361;
                        if (var15 == -1 && class44.field1029[var13] == 1) {
                            var15 = 2001;
                        }
                    } else if (class17.field372[var13] == 3) {
                        var15 = arg3[var4].field2364 ? 1 : 0;
                        var14 = var7.field2364 ? 1 : 0;
                    } else {
                        var15 = arg3[var4].field2375;
                        var14 = var7.field2375;
                    }
                    if (var14 != var15) {
                        if ((class44.field1029[var13] != 1 || var15 >= var14) && (class44.field1029[var13] != 0 || var15 <= var14)) {
                            var12 = false;
                        }
                        break;
                    }
                    if (var13 == 3) {
                        var12 = false;
                    }
                }
            } while (var12);
            if (var4 < var5) {
                class132 var16 = arg3[var4];
                arg3[var4] = arg3[var5];
                arg3[var5] = var16;
            }
        }
        method1187((byte) 78, arg1, var5, arg3);
        method1187((byte) 85, var5 + 1, arg2, arg3);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Z")
    public static final boolean method1188(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class20.field420; var3++) {
            class217 var4 = class179.field3090[var3];
            if (var4.field3690 == 1) {
                int var5 = var4.field3680 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3671 * var5 >> 8) + var4.field3669;
                    int var7 = (var4.field3672 * var5 >> 8) + var4.field3689;
                    int var8 = (var4.field3674 * var5 >> 8) + var4.field3670;
                    int var9 = (var4.field3679 * var5 >> 8) + var4.field3683;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3690 == 2) {
                int var10 = arg0 - var4.field3680;
                if (var10 > 0) {
                    int var11 = (var4.field3671 * var10 >> 8) + var4.field3669;
                    int var12 = (var4.field3672 * var10 >> 8) + var4.field3689;
                    int var13 = (var4.field3674 * var10 >> 8) + var4.field3670;
                    int var14 = (var4.field3679 * var10 >> 8) + var4.field3683;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3690 == 3) {
                int var15 = var4.field3669 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3678 * var15 >> 8) + var4.field3680;
                    int var17 = (var4.field3666 * var15 >> 8) + var4.field3667;
                    int var18 = (var4.field3674 * var15 >> 8) + var4.field3670;
                    int var19 = (var4.field3679 * var15 >> 8) + var4.field3683;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3690 == 4) {
                int var20 = arg2 - var4.field3669;
                if (var20 > 0) {
                    int var21 = (var4.field3678 * var20 >> 8) + var4.field3680;
                    int var22 = (var4.field3666 * var20 >> 8) + var4.field3667;
                    int var23 = (var4.field3674 * var20 >> 8) + var4.field3670;
                    int var24 = (var4.field3679 * var20 >> 8) + var4.field3683;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3690 == 5) {
                int var25 = arg1 - var4.field3670;
                if (var25 > 0) {
                    int var26 = (var4.field3678 * var25 >> 8) + var4.field3680;
                    int var27 = (var4.field3666 * var25 >> 8) + var4.field3667;
                    int var28 = (var4.field3671 * var25 >> 8) + var4.field3669;
                    int var29 = (var4.field3672 * var25 >> 8) + var4.field3689;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)Lfe;")
    public static final class155 method1189(boolean arg0) {
        field2994++;
        class155 var1 = new class155(class20.field427, class9.field184, class57.field1212[0], class154.field2701[0], class72.field1411[0], class193.field3287[0], class137.field2454[0], class3.field92);
        class126.method875(arg0);
        return arg0 ? null : var1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[Lq;IZ[B)V")
    public static final void method1190(int arg0, int arg1, class238[] arg2, int arg3, boolean arg4, byte[] arg5) {
        class152 var6 = new class152(arg5);
        if (arg3 <= 117) {
            method1189(false);
        }
        field2987++;
        int var7 = -1;
        while (true) {
            int var8 = var6.method1053(32767);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1055(-32768);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 12;
                int var12 = var9 & 0x3F;
                int var13 = var6.method1051((byte) -42);
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg0 + var12;
                int var17 = var9 >> 6 & 0x3F;
                int var18 = var17 + arg1;
                if (var18 > 0 && var16 > 0 && var18 < 103 && var16 < 103) {
                    class238 var19 = null;
                    if (!arg4) {
                        int var20 = var11;
                        if ((class233.field4007[1][var18][var16] & 0x2) == 2) {
                            var20 = var11 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class24.method213(var19, var15, !arg4, var11, (byte) -109, var18, var16, var11, var14, var7, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class175() {
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lsa;)V")
    public class175(class175 arg0) {
        this.field2983 = arg0.field2983;
        this.field2989 = arg0.field2989;
        this.field2995 = arg0.field2995;
        this.field2982 = arg0.field2982;
    }
}
