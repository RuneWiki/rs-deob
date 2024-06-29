import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class89 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field2104 = 0;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Ltd;")
    public static class136 field2107 = class145.method1172("Das ist eine Mitglieder)2Welt(Q", 45);

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "[Ltd;")
    public static class136[] field2103 = new class136[200];

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static volatile int field2108 = 0;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Ltd;")
    private static class136 field2113 = class145.method1172("Players", 45);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Ltd;")
    public static class136 field2100 = field2113;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lue;")
    public static class143 field2105 = new class143(64);

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "J")
    public static volatile long field2115 = 0L;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "Ltd;")
    private static class136 field2119 = class145.method1172("flash3:", 45);

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Ltd;")
    public static class136 field2116 = field2119;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "Ltd;")
    public static class136 field2118 = field2119;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "Ltd;")
    private static class136 field2120 = class145.method1172("Cancel", 45);

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Ltd;")
    public static class136 field2114 = field2120;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field2117 = 1;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Laf;")
    public static class7 field2102;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method676(int arg0) {
        field2100 = null;
        field2114 = null;
        field2120 = null;
        field2102 = null;
        field2116 = null;
        field2118 = null;
        field2119 = null;
        if (arg0 != 1) {
            field2116 = null;
        }
        field2105 = null;
        field2107 = null;
        field2103 = null;
        field2113 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public static final void method677(int arg0) {
        for (int var1 = 0; var1 < class51.field1145; var1++) {
            int var2 = class139.field3237[var1];
            class67 var3 = class122.field2846[var2];
            if (var3 != null) {
                class149.method1190(0, var3.field1428.field2307, var3);
            }
        }
        field2106++;
        if (arg0 != 1) {
            method678(-45, 82, 37, 69, -10, 20, 84, -2);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method678(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 > -106) {
            field2117 = 63;
        }
        field2111++;
        if (arg1 < 1 || arg4 < 1 || arg1 > 102 || arg4 > 102) {
            return;
        }
        if (class65.field1399 && class62.field1331 != arg6) {
            return;
        }
        int var8 = 0;
        boolean var9 = false;
        boolean var10 = true;
        if (arg0 == 0) {
            var8 = class146.field3366.method739(arg6, arg1, arg4);
        }
        boolean var11 = false;
        if (arg0 == 1) {
            var8 = class146.field3366.method773(arg6, arg1, arg4);
        }
        if (arg0 == 2) {
            var8 = class146.field3366.method787(arg6, arg1, arg4);
        }
        if (arg0 == 3) {
            var8 = class146.field3366.method755(arg6, arg1, arg4);
        }
        if (var8 != 0) {
            int var12 = var8 >> 14 & 0x7FFF;
            int var13 = class146.field3366.method759(arg6, arg1, arg4, var8);
            int var14 = var13 & 0x1F;
            int var15 = var13 >> 6 & 0x3;
            if (arg0 == 0) {
                class146.field3366.method776(arg6, arg1, arg4);
                class128 var16 = class142.method1154(var12, 126);
                if (var16.field3026 != 0) {
                    class4.field83[arg6].method615(var16.field3033, var14, (byte) 96, arg1, arg4, var15);
                }
            }
            if (arg0 == 1) {
                class146.field3366.method757(arg6, arg1, arg4);
            }
            if (arg0 == 2) {
                class146.field3366.method747(arg6, arg1, arg4);
                class128 var17 = class142.method1154(var12, 38);
                if (var17.field3076 + arg1 > 103 || var17.field3076 + arg4 > 103 || var17.field3071 + arg1 > 103 || arg4 + var17.field3071 > 103) {
                    return;
                }
                if (var17.field3026 != 0) {
                    class4.field83[arg6].method614(var17.field3033, var17.field3076, var15, var17.field3071, arg1, arg4, true);
                }
            }
            if (arg0 == 3) {
                class146.field3366.method786(arg6, arg1, arg4);
                class128 var18 = class142.method1154(var12, 62);
                if (var18.field3026 == 1) {
                    class4.field83[arg6].method617(4096, arg4, arg1);
                }
            }
        }
        if (arg7 < 0) {
            return;
        }
        int var19 = arg6;
        if (arg6 < 3 && (class125.field2895[1][arg1][arg4] & 0x2) == 2) {
            var19 = arg6 + 1;
        }
        class75.method547(class4.field83[arg6], var19, arg4, arg3, arg6, arg7, arg5, class146.field3366, (byte) 36, arg1);
        return;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II[II[I[Lbc;)V")
    public static final void method679(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, class11[] arg5) {
        if (arg1 < arg0) {
            int var6 = arg0 + 1;
            int var7 = arg1 - 1;
            int var8 = (arg1 + arg0) / 2;
            class11 var9 = arg5[var8];
            arg5[var8] = arg5[arg1];
            arg5[arg1] = var9;
            while (var6 > var7) {
                boolean var10 = true;
                do {
                    var6--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg4[var11] == 2) {
                            var12 = var9.field185;
                            var13 = arg5[var6].field185;
                        } else if (arg4[var11] == 1) {
                            var12 = var9.field197;
                            if (var12 == -1 && arg2[var11] == 1) {
                                var12 = 2001;
                            }
                            var13 = arg5[var6].field197;
                            if (var13 == -1 && arg2[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (arg4[var11] == 3) {
                            var12 = var9.field181 ? 1 : 0;
                            var13 = arg5[var6].field181 ? 1 : 0;
                        } else {
                            var13 = arg5[var6].field182;
                            var12 = var9.field182;
                        }
                        if (var12 != var13) {
                            if ((arg2[var11] != 1 || var13 <= var12) && (arg2[var11] != 0 || var12 <= var13)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var7++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg4[var15] == 2) {
                            var16 = var9.field185;
                            var17 = arg5[var7].field185;
                        } else if (arg4[var15] == 1) {
                            var17 = arg5[var7].field197;
                            var16 = var9.field197;
                            if (var16 == -1 && arg2[var15] == 1) {
                                var16 = 2001;
                            }
                            if (var17 == -1 && arg2[var15] == 1) {
                                var17 = 2001;
                            }
                        } else if (arg4[var15] == 3) {
                            var17 = arg5[var7].field181 ? 1 : 0;
                            var16 = var9.field181 ? 1 : 0;
                        } else {
                            var16 = var9.field182;
                            var17 = arg5[var7].field182;
                        }
                        if (var16 != var17) {
                            if ((arg2[var15] != 1 || var17 >= var16) && (arg2[var15] != 0 || var16 >= var17)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var7 < var6) {
                    class11 var18 = arg5[var7];
                    arg5[var7] = arg5[var6];
                    arg5[var6] = var18;
                }
            }
            method679(var6, arg1, arg2, 17322, arg4, arg5);
            method679(arg0, var6 + 1, arg2, arg3, arg4, arg5);
        }
        if (arg3 == 17322) {
            field2110++;
        }
    }
}
