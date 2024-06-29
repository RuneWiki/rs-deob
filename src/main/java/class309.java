import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class309 extends class7 {

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "[I")
    public static int[] field4891 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "C")
    private char field4884;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public int field4893;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "Ljava/lang/String;")
    public String field4889;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "[[[Lwe;")
    public static class232[][][] field4886;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljg;I)V", line = 3)
    public final void method2069(class186 arg0, int arg1) {
        if (arg1 != -18650) {
            return;
        }
        field4885++;
        while (true) {
            int var3 = arg0.method1322(false);
            if (var3 == 0) {
                return;
            }
            this.method2074(arg0, var3, true);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lmp;ILhe;Le;Le;ZIIIIZI)Lgl;", line = 31)
    public static final class356 method2070(class452 arg0, int arg1, class208 arg2, class312 arg3, class312 arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field4890++;
        class356 var12 = class428.method2653(arg2, arg3, arg6, arg9, arg7 ^ 0x6B2F, arg1, arg8, arg11);
        if (var12 != null) {
            return var12;
        }
        class97 var13 = class155.method1092(true, arg6);
        if (arg9 > 1 && var13.field1307 != null) {
            int var14 = -1;
            for (int var15 = 0; var15 < 10; var15++) {
                if (arg9 >= var13.field1350[var15] && var13.field1350[var15] != 0) {
                    var14 = var13.field1307[var15];
                }
            }
            if (var14 != -1) {
                var13 = class155.method1092(true, var14);
            }
        }
        class86 var16 = class21.method154(var13.field1367, class308.field4878, 0, (byte) 34);
        if (var16 == null) {
            return null;
        }
        if (var13.field1366 != null) {
            for (int var17 = 0; var17 < var13.field1366.length; var17++) {
                if (var13.field1357 == null || var17 >= var13.field1357.length) {
                    var16.method523(var13.field1301[var17], 90, var13.field1366[var17]);
                } else {
                    var16.method523(class223.field3714[var13.field1357[var17] & 0xFF], arg7 ^ 0x6B3E, var13.field1366[var17]);
                }
            }
        }
        if (var13.field1329 != null) {
            for (int var18 = 0; var18 < var13.field1329.length; var18++) {
                var16.method534(var13.field1354[var18], true, var13.field1329[var18]);
            }
        }
        if (arg2 != null) {
            for (int var19 = 0; var19 < 5; var19++) {
                if (arg2.field3342[var19] < class343.field5287[var19].length) {
                    var16.method523(class343.field5287[var19][arg2.field3342[var19]], 115, class128.field2030[var19]);
                }
                if (arg2.field3342[var19] < class245.field4028[var19].length) {
                    var16.method523(class245.field4028[var19][arg2.field3342[var19]], 108, class140.field2179[var19]);
                }
            }
        }
        int var20 = 1024;
        boolean var21 = false;
        if (var13.field1319 != 128 || var13.field1315 != 128 || var13.field1313 != 128) {
            var20 |= 0x7;
            var21 = true;
        }
        class348 var22 = arg4.method639(var16, var20, 0, var13.field1362 + 64, var13.field1355 + 768);
        if (!var22.method59()) {
            return null;
        }
        if (var21) {
            var22.method12(var13.field1319, var13.field1315, var13.field1313);
        }
        class356 var23 = null;
        if (var13.field1291 != -1) {
            var23 = method2070(arg0, 1, arg2, arg3, arg4, true, var13.field1293, 27498, 0, 10, true, 0);
            if (var23 == null) {
                return null;
            }
        } else if (var13.field1296 != -1) {
            var23 = method2070(arg0, arg1, arg2, arg3, arg4, true, var13.field1339, 27498, 0, arg9, false, arg11);
            if (var23 == null) {
                return null;
            }
        }
        int var24 = var13.field1302;
        arg4.method589(16, 16, 512, 512);
        if (arg10) {
            var24 = (int) ((double) var24 * 1.5D);
        } else if (arg1 == 2) {
            var24 = (int) ((double) var24 * 1.04D);
        }
        class435 var25 = arg4.method704();
        var25.method1988();
        arg4.method693(var25);
        arg4.method714(1.0F);
        arg4.method683(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        class435 var26 = arg4.method713();
        if (arg7 != 27498) {
            field4891 = null;
        }
        var26.method1989(-var13.field1303 << 3);
        var26.method1994(var13.field1304 << 3);
        var26.method1995(var13.field1341, (class258.field4177[var13.field1369 << 3] * var24 >> 15) + var13.field1344 - var22.method57() / 2, (class258.field4173[var13.field1369 << 3] * var24 >> 15) + var13.field1344);
        var26.method1993(var13.field1369 << 3);
        int var27 = arg4.method690();
        int var28 = arg4.method702();
        arg4.method582(50, Integer.MAX_VALUE);
        arg4.method558();
        arg4.method609();
        arg4.method563(0, 0, 36, 32, 0, 0);
        var22.method26(var26, (class170) null, 1);
        arg4.method582(var27, var28);
        int[] var29 = arg4.method675(0, 0, 36, 32);
        if (arg1 >= 1) {
            var29 = class60.method394(var29, true, -16777215);
            if (arg1 >= 2) {
                var29 = class60.method394(var29, true, -1);
            }
        }
        if (arg11 != 0) {
            class316.method2108(arg11, var29, (byte) -112);
        }
        arg4.method703(var29, 0, 36, 36, 32).method2327(0, 0);
        if (var13.field1291 != -1) {
            var23.method2327(0, 0);
        } else if (var13.field1296 != -1) {
            var23.method2327(0, 0);
        }
        if (arg8 == 1 || arg8 == 2 && (var13.field1299 == 1 || arg9 != 1) && arg9 != -1) {
            arg0.method2810(0, -16777215, -256, 9, true, class179.method1228(arg9, -19703));
        }
        int[] var30 = arg4.method675(0, 0, 36, 32);
        for (int var31 = 0; var31 < var30.length; var31++) {
            if ((var30[var31] & 0xFFFFFF) == 0) {
                var30[var31] = 0;
            } else {
                var30[var31] = class35.method227(var30[var31], -16777216);
            }
        }
        class356 var32;
        if (arg5) {
            var32 = arg4.method703(var30, 0, 36, 36, 32);
        } else {
            var32 = arg3.method703(var30, 0, 36, 36, 32);
        }
        if (!arg5) {
            class117 var33 = new class117();
            var33.field1630 = arg8;
            var33.field1626 = arg11;
            var33.field1622 = arg2 != null;
            var33.field1623 = arg1;
            var33.field1614 = arg6;
            var33.field1621 = arg3.field4911;
            var33.field1615 = arg9;
            class110.field1528.method2469(var33, 0, var32);
        }
        return var32;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 264)
    public static final boolean method2071(int arg0, String arg1) {
        if (arg0 <= 75) {
            return false;
        }
        field4892++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class418.field6190; var2++) {
            if (arg1.equalsIgnoreCase(class315.field4955[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class21.field282[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIB)V", line = 297)
    public static final void method2072(int arg0, int arg1, int arg2, byte arg3) {
        field4887++;
        if (class423.field6252 == null) {
            return;
        }
        long var4 = (long) (arg2 | arg0 << 28 | arg1 << 14);
        class9 var6 = (class9) class312.field4924.method1770(-880, var4);
        if (var6 == null) {
            class38.method262(arg0, arg2, arg1);
            return;
        }
        class271 var7 = (class271) var6.field109.method253((byte) -6);
        if (var7 == null) {
            class38.method262(arg0, arg2, arg1);
            return;
        }
        class193 var8 = (class193) class38.method262(arg0, arg2, arg1);
        if (var8 == null) {
            var8 = new class193();
        } else {
            var8.field3140 = var8.field3141 = -1;
        }
        var8.field3132 = var7.field4350;
        var8.field3139 = var7.field4351;
        label48: while (true) {
            class271 var9 = (class271) var6.field109.method247((byte) 48);
            if (var9 == null) {
                break;
            }
            if (var8.field3139 != var9.field4351) {
                var8.field3140 = var9.field4351;
                var8.field3146 = var9.field4350;
                while (true) {
                    class271 var10 = (class271) var6.field109.method247((byte) -125);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field3139 != var10.field4351 && var8.field3140 != var10.field4351) {
                        var8.field3141 = var10.field4351;
                        var8.field3134 = var10.field4350;
                    }
                }
            }
        }
        int var11 = class58.method386(arg0, (byte) -102, (arg2 << 7) + 64, (arg1 << 7) - -64);
        class214.method1504(arg0, arg2, arg1, var11, var8);
        if (arg3 > -5) {
            method2071(24, (String) null);
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Z", line = 380)
    public final boolean method2073(int arg0) {
        if (arg0 != -116) {
            this.field4889 = null;
        }
        field4883++;
        return this.field4884 == 's';
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljg;IZ)V", line = 394)
    private final void method2074(class186 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            this.field4884 = class394.method2488(-1206145460, arg0.method1327((byte) -96));
        } else if (arg1 == 2) {
            this.field4893 = arg0.method1284(8388607);
        } else if (arg1 == 5) {
            this.field4889 = arg0.method1270(-9970);
        }
        if (arg2) {
            field4888++;
        }
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V", line = 422)
    public static void method2075(int arg0) {
        field4891 = null;
        if (arg0 != 19973) {
            field4886 = null;
        }
        field4886 = null;
    }
}
