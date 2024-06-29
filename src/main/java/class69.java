import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class69 extends class83 {

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field1131 = 0;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lub;")
    public static class168 field1130 = null;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "Lck;")
    public static class1 field1135 = new class1(64);

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "[I")
    public static int[] field1137 = new int[4096];

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1138 = "Hidden";

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "[I")
    public static int[] field1139;

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class69() {
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V")
    public class69(int arg0) {
        this.field1127 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method419(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 >= class126.field2222 && arg7 <= class118.field2098 && arg1 >= class118.field2094 && arg6 <= class89.field1582) {
            class17.method90((byte) 71, arg1, arg6, arg4, arg7, arg0, arg3, arg5);
        } else {
            class258.method1717(arg5, arg1, true, arg7, arg3, arg4, arg0, arg6);
        }
        if (arg2 <= 18) {
            method421((byte[]) null, 127, 110, -101);
        }
        field1134++;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public static void method420(int arg0) {
        field1135 = null;
        field1139 = null;
        field1137 = null;
        if (arg0 != -1761652242) {
            field1131 = 39;
        }
        field1138 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIII)Z")
    public static final boolean method421(byte[] arg0, int arg1, int arg2, int arg3) {
        boolean var4 = true;
        if (arg1 != 2) {
            return false;
        }
        field1133++;
        int var5 = -1;
        class101 var6 = new class101(arg0);
        label60: while (true) {
            int var7 = var6.method664(-118);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var5 += var7;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var6.method692(27029);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 >> 6 & 0x3F;
                    int var13 = var6.method669((byte) 36) >> 2;
                    int var14 = var8 & 0x3F;
                    int var15 = arg3 + var12;
                    int var16 = var14 + arg2;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class206 var17 = class10.method64(arg1 + 62, var5);
                        if (var13 != 22 || class172.field2828 || var17.field3432 != 0 || var17.field3387 == 1 || var17.field3436) {
                            if (!var17.method1366((byte) 4)) {
                                class33.field483++;
                                var4 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var6.method692(27029);
                if (var10 == 0) {
                    break;
                }
                var6.method669((byte) 36);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILdl;)V")
    public static final void method422(int arg0, int arg1, int arg2, class46 arg3) {
        if (arg3.field770 == 0) {
            arg3.field806 = arg3.field645;
        } else if (arg3.field770 == 1) {
            arg3.field806 = (arg1 - arg3.field715) / 2 + arg3.field645;
        } else if (arg3.field770 == 2) {
            arg3.field806 = arg1 - arg3.field715 - arg3.field645;
        } else if (arg3.field770 == 3) {
            arg3.field806 = arg3.field645 * arg1 >> 14;
        } else if (arg3.field770 == 4) {
            arg3.field806 = (arg3.field645 * arg1 >> 14) + (arg1 - arg3.field715) / 2;
        } else {
            arg3.field806 = arg1 - (arg3.field645 * arg1 >> 14) - arg3.field715;
        }
        field1128++;
        if (arg3.field692 == 0) {
            arg3.field758 = arg3.field740;
        } else if (arg3.field692 == 1) {
            arg3.field758 = (arg2 - arg3.field701) / 2 + arg3.field740;
        } else if (arg3.field692 == 2) {
            arg3.field758 = arg2 - arg3.field701 - arg3.field740;
        } else if (arg3.field692 == 3) {
            arg3.field758 = arg3.field740 * arg2 >> 14;
        } else if (arg3.field692 == 4) {
            arg3.field758 = (arg3.field740 * arg2 >> 14) + (arg2 - arg3.field701) / 2;
        } else {
            arg3.field758 = arg2 - (arg3.field740 * arg2 >> 14) - arg3.field701;
        }
        if (class285.field4510 && (client.method1922(arg3).field3096 != 0 || arg3.field812 == 0)) {
            if (arg3.field806 < 0) {
                arg3.field806 = 0;
            } else if (arg1 < (arg3.field806 + arg3.field715)) {
                arg3.field806 = arg1 - arg3.field715;
            }
            if (arg3.field758 < 0) {
                arg3.field758 = 0;
            } else if (arg3.field758 + arg3.field701 > arg2) {
                arg3.field758 = arg2 - arg3.field701;
            }
        }
        if (arg0 <= 98) {
            field1138 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIZIZ)V")
    public static final void method423(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (arg1 < arg0) {
            int var7 = arg1;
            int var8 = (arg0 + arg1) / 2;
            class236 var9 = class237.field3908[var8];
            class237.field3908[var8] = class237.field3908[arg0];
            class237.field3908[arg0] = var9;
            for (int var10 = arg1; var10 < arg0; var10++) {
                if (class206.method1371(arg4, arg6, 0, arg3, arg2, var9, class237.field3908[var10]) <= 0) {
                    class236 var11 = class237.field3908[var10];
                    class237.field3908[var10] = class237.field3908[var7];
                    class237.field3908[var7++] = var11;
                }
            }
            class237.field3908[arg0] = class237.field3908[var7];
            class237.field3908[var7] = var9;
            method423(var7 - 1, arg1, arg2, arg3, arg4, 97, arg6);
            method423(arg0, var7 + 1, arg2, arg3, arg4, 110, arg6);
        }
        field1132++;
        int var12 = 102 % ((16 - arg5) / 51);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lne;Lvh;Lvh;Lvh;B)Z")
    public static final boolean method424(class78 arg0, class108 arg1, class108 arg2, class108 arg3, byte arg4) {
        if (arg4 != 72) {
            field1130 = null;
        }
        class19.field299 = arg3;
        class248.field4083 = arg0;
        class28.field421 = arg2;
        field1136++;
        class253.field4144 = arg1;
        return true;
    }
}
