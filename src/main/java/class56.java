import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Z")
    public boolean field1145 = true;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lcc;")
    public static class209 field1147 = class95.method669(118, "Konfig geladen)3");

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lji;")
    public static class42 field1149 = null;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lcc;")
    public static class209 field1151 = class95.method669(89, "Connexion au serveur de mise -9 jour en cours");

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lcc;")
    private static class209 field1155 = class95.method669(109, "red:");

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lcc;")
    public static class209 field1140 = field1155;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lcc;")
    public static class209 field1146 = field1155;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Lsj;")
    public static class49 field1156;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BII)Z")
    public static final boolean method436(byte arg0, int arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg0 != 2) {
            field1140 = null;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class218 var3 = class245.method1711(27093, arg1);
        field1152++;
        return var3.method1530(arg2, (byte) -65);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(JB)Lcc;")
    public static final class209 method437(long arg0, byte arg1) {
        field1138++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class229.field4166[(int) (var8 - (arg0 * 37L))];
            }
            class209 var7 = new class209();
            var7.field3786 = var6;
            if (arg1 <= 2) {
                return null;
            } else {
                var7.field3811 = var6.length;
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLtf;)Ljc;")
    public static final class239 method438(byte arg0, class106 arg1) {
        field1139++;
        if (arg0 >= -66) {
            method439((class264) null);
        }
        return new class239(arg1.method738(255), arg1.method738(255), arg1.method738(255), arg1.method738(255), arg1.method776(121), arg1.method774((byte) 113));
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lca;)V")
    public static final void method439(class264 arg0) {
        for (int var1 = arg0.field4746; var1 <= arg0.field4747; var1++) {
            for (int var2 = arg0.field4741; var2 <= arg0.field4731; var2++) {
                class109 var3 = class106.field2089[arg0.field4749][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2203; var4++) {
                        if (var3.field2189[var4] == arg0) {
                            var3.field2203--;
                            for (int var5 = var4; var5 < var3.field2203; var5++) {
                                var3.field2189[var5] = var3.field2189[var5 + 1];
                                var3.field2194[var5] = var3.field2194[var5 + 1];
                            }
                            var3.field2189[var3.field2203] = null;
                            break;
                        }
                    }
                    var3.field2199 = 0;
                    for (int var6 = 0; var6 < var3.field2203; var6++) {
                        var3.field2199 |= var3.field2194[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method440(int arg0) {
        if (arg0 == 102) {
            field1157++;
            if (class168.field3023 == 5) {
                class168.field3023 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)V")
    public static final void method441(boolean arg0, int arg1) {
        field1141++;
        if (!arg0 && class122.field2408 == null || arg1 > class122.field2408.length) {
            class122.field2408 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static final void method442(int arg0) {
        field1153++;
        int var1 = class111.field2246.length;
        if (arg0 > -108) {
            return;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class111.field2246[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class199.field3561; var4++) {
                    if (class47.field913[var2] == class157.field2862[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class157.field2862[class199.field3561] = class47.field913[var2];
                    var3 = class199.field3561++;
                }
                class106 var6 = new class106(class111.field2246[var2]);
                while (var6.field2085 < class111.field2246[var2].length && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method736(121);
                    int var9 = var8 & 0x3F;
                    int var10 = var8 >> 14;
                    int var11 = (var8 & 0x1FFB) >> 7;
                    int var12 = (class47.field913[var2] >> 8) * 64 + var11 - class174.field3178;
                    int var13 = (class47.field913[var2] & 0xFF) * 64 + (var9 - class245.field4444);
                    class237 var14 = class78.method549(105, var6.method736(127));
                    if (class60.field1207[var7] == null && (var14.field4247 & 0x1) > 0 && class167.field3005 == var10 && var12 >= 0 && var12 + var14.field4277 < 104 && var13 >= 0 && (var14.field4277 + var13) < 104) {
                        class60.field1207[var7] = new class163();
                        class163 var15 = class60.field1207[var7];
                        class249.field4492[class219.field3996++] = var7;
                        var15.field1512 = class163.field2968;
                        var15.method1127(-116, var14);
                        var15.method571((byte) 14, var15.field2969.field4277);
                        var15.field1570 = var15.field1504 = class161.field2918[var15.field2969.field4291];
                        var15.field1543 = var15.field2969.field4279;
                        var15.field1520 = var15.field2969.field4296;
                        var15.field1516 = var15.field2969.field4263;
                        var15.field1544 = var15.field2969.field4236;
                        var15.field1511 = var15.field2969.field4259;
                        if (var15.field1516 == 0) {
                            var15.field1504 = 0;
                        }
                        var15.field1561 = var15.field2969.field4293;
                        var15.field1569 = var15.field2969.field4235;
                        var15.field1549 = var15.field2969.field4264;
                        var15.method574(var13, var15.method577((byte) -122), true, (byte) 100, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 2) {
            field1151 = null;
        }
        field1150++;
        if (arg3 < 1 || arg7 < 1 || arg3 > 102 || arg7 > 102) {
            return;
        }
        if (!class186.method1273(55) && (class285.field5023[0][arg3][arg7] & 0x2) == 0) {
            int var8 = arg0;
            if ((class285.field5023[arg0][arg3][arg7] & 0x8) != 0) {
                var8 = 0;
            }
            if (class167.field3005 != var8) {
                return;
            }
        }
        int var9 = arg0;
        if (arg0 < 3 && (class285.field5023[1][arg3][arg7] & 0x2) == 2) {
            var9 = arg0 + 1;
        }
        class190.method1307(arg0, arg7, var9, (byte) -74, arg5, arg3, class122.field2404[arg0]);
        if (arg2 < 0) {
            return;
        }
        boolean var10 = class52.field1022;
        class52.field1022 = true;
        class138.method962(false, class122.field2404[arg0], var9, arg0, false, 0, arg3, arg2, arg4, arg1, arg7);
        class52.field1022 = var10;
        return;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
    public static void method444(int arg0) {
        field1147 = null;
        field1155 = null;
        field1146 = null;
        if (arg0 == -17338) {
            field1140 = null;
            field1156 = null;
            field1149 = null;
            field1151 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1145 = arg6;
        this.field1143 = arg3;
        this.field1159 = arg5;
        this.field1160 = arg4;
        this.field1148 = arg2;
        this.field1142 = arg1;
        this.field1144 = arg0;
    }
}
