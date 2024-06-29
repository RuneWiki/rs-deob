import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class85 {

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public int field1321 = 0;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public int field1327 = 0;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public int field1332 = -1;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public int field1333 = 0;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public int field1336 = -1;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public int field1338 = -1;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public int field1328 = 0;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public int field1325 = 0;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public int field1341 = -1;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public int field1335 = -1;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public int field1323 = -1;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public int field1326 = 0;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public int field1342 = 0;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public int field1319 = -1;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public int field1349 = -1;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public int field1347 = -1;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public int field1352 = -1;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public int field1346 = 0;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public int field1337 = 0;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public int field1354 = -1;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public int field1334 = -1;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public int field1340 = -1;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public int field1355 = -1;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public int field1348 = 0;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public int field1353 = -1;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public int field1356 = -1;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Lqj;")
    public static class147 field1324 = null;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "[[I")
    public static int[][] field1345 = new int[5][5000];

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "[[I")
    public int[][] field1351;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method584(byte arg0, String arg1) {
        field1322++;
        if (arg1 == null) {
            return -1;
        }
        if (arg0 != -122) {
            field1345 = null;
        }
        for (int var2 = 0; var2 < class228.field3692; var2++) {
            if (arg1.equalsIgnoreCase(class94.field1464[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILlj;)V")
    private final void method585(int arg0, int arg1, class25 arg2) {
        if (arg1 != 19901) {
            this.field1336 = 75;
        }
        field1350++;
        if (arg0 == 1) {
            this.field1319 = arg2.method190(-3);
            this.field1347 = arg2.method190(-3);
            if (this.field1319 == 65535) {
                this.field1319 = -1;
            }
            if (this.field1347 == 65535) {
                this.field1347 = -1;
            }
        } else if (arg0 == 2) {
            this.field1336 = arg2.method190(-3);
        } else if (arg0 == 3) {
            this.field1334 = arg2.method190(-3);
        } else if (arg0 == 4) {
            this.field1338 = arg2.method190(-3);
        } else if (arg0 == 5) {
            this.field1323 = arg2.method190(arg1 - 19904);
        } else if (arg0 == 6) {
            this.field1354 = arg2.method190(-3);
        } else if (arg0 == 7) {
            this.field1353 = arg2.method190(-3);
        } else if (arg0 == 8) {
            this.field1340 = arg2.method190(-3);
        } else if (arg0 == 9) {
            this.field1356 = arg2.method190(-3);
        } else if (arg0 == 26) {
            this.field1325 = (short) (arg2.method201(255) * 4);
            this.field1342 = (short) (arg2.method201(255) * 4);
        } else if (arg0 == 27) {
            if (this.field1351 == null) {
                this.field1351 = new int[12][];
            }
            int var4 = arg2.method201(arg1 - 19646);
            this.field1351[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field1351[var4][var5] = arg2.method226(255);
            }
        } else if (arg0 == 29) {
            this.field1333 = arg2.method201(255);
        } else if (arg0 == 30) {
            this.field1321 = arg2.method190(-3);
        } else if (arg0 == 31) {
            this.field1326 = arg2.method201(255);
        } else if (arg0 == 32) {
            this.field1337 = arg2.method190(arg1 - 19904);
        } else if (arg0 == 33) {
            this.field1327 = arg2.method226(255);
        } else if (arg0 == 34) {
            this.field1328 = arg2.method201(arg1 - 19646);
        } else if (arg0 == 35) {
            this.field1348 = arg2.method190(-3);
        } else if (arg0 == 36) {
            this.field1346 = arg2.method226(255);
        } else if (arg0 == 37) {
            this.field1332 = arg2.method201(255);
        } else if (arg0 == 38) {
            this.field1335 = arg2.method190(arg1 - 19904);
        } else if (arg0 == 39) {
            this.field1349 = arg2.method190(-3);
        } else if (arg0 == 40) {
            this.field1341 = arg2.method190(-3);
        } else if (arg0 == 41) {
            this.field1355 = arg2.method190(-3);
        } else if (arg0 == 42) {
            this.field1352 = arg2.method190(-3);
        } else if (arg0 == 43) {
            arg2.method190(-3);
        } else if (arg0 == 44) {
            arg2.method190(-3);
        } else if (arg0 == 45) {
            arg2.method190(-3);
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Llj;I)V")
    public final void method586(class25 arg0, int arg1) {
        field1339++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method201(255);
            if (var3 == 0) {
                return;
            }
            this.method585(var3, 19901, arg0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIZZIZZ)Lhc;")
    public static final class229 method587(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, boolean arg6, boolean arg7) {
        field1331++;
        class253 var8 = class162.method1112(arg1, (byte) 108);
        if (arg2 > 1 && var8.field4037 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field4046[var10] <= arg2 && var8.field4046[var10] != 0) {
                    var9 = var8.field4037[var10];
                }
            }
            if (var9 != -1) {
                var8 = class162.method1112(var9, (byte) 109);
            }
        }
        class156 var11 = var8.method1701(-1);
        if (var11 == null) {
            return null;
        }
        class12 var12 = null;
        if (var8.field4032 != -1) {
            var12 = (class12) method587(0, var8.field4091, 10, true, true, 1, false, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4050 != -1) {
            var12 = (class12) method587(arg0, var8.field4067, arg2, false, true, arg5, false, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class127.field1875;
        int var14 = class127.field1873;
        int[] var15 = new int[4];
        int var16 = class127.field1874;
        class127.method863(var15);
        class12 var17 = new class12(36, 32);
        class127.method867(var17.field152, 36, 32);
        class171.method1209();
        class171.method1198(16, 16);
        int var18 = var8.field4049;
        if (arg3) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg5 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class171.field2678 = false;
        int var19 = class171.field2680[var8.field4052] * var18 >> 16;
        int var20 = class171.field2675[var8.field4052] * var18 >> 16;
        var11.method735(0, var8.field4075, var8.field4039, var8.field4052, var8.field4076, var20 + var8.field4056 - (var11.method363() / 2), var8.field4056 + var19, -1L);
        if (arg5 >= 1) {
            var17.method88(1);
            if (arg5 >= 2) {
                var17.method88(16777215);
            }
            class127.method867(var17.field152, 36, 32);
        }
        if (arg0 != 0) {
            var17.method75(arg0);
        }
        if (var8.field4032 != -1) {
            var12.method71(0, 0);
        } else if (var8.field4050 != -1) {
            class127.method867(var12.field152, 36, 32);
            var17.method71(0, 0);
            var17 = var12;
        }
        if (arg6 && (var8.field4072 == 1 || arg2 != 1) && arg2 != -1) {
            class38.field522.method1325(class165.method1138(arg2, -127), 0, 9, 16776960, 1);
        }
        class127.method867(var13, var14, var16);
        class127.method878(var15);
        class171.method1209();
        class171.field2678 = arg7;
        return var17;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static final void method588(int arg0) {
        field1343++;
        if (class253.field4099 != null) {
            class235.method1598(class253.field4099, (byte) 66);
            class253.field4099 = null;
        }
        if (arg0 <= 99) {
            method588(83);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
    public static final void method589(int arg0, int arg1, int arg2) {
        class211.field3295[arg2] = arg1;
        field1320++;
        if (arg0 != 19110) {
            field1345 = null;
        }
        class16 var3 = (class16) class202.field3168.method665((byte) 93, (long) arg2);
        if (var3 == null) {
            class16 var4 = new class16(4611686018427387905L);
            class202.field3168.method662(0, var4, (long) arg2);
        } else if (var3.field188 != 4611686018427387905L) {
            var3.field188 = class260.method1785((byte) -107) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public static void method590(boolean arg0) {
        if (!arg0) {
            method592(false, (class123) null, -12, -50);
        }
        field1345 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public final void method591(byte arg0) {
        if (arg0 < 54) {
            method588(-75);
        }
        field1329++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLdl;II)Lfg;")
    public static final class12 method592(boolean arg0, class123 arg1, int arg2, int arg3) {
        field1344++;
        if (class214.method1445((byte) 118, arg1, arg2, arg3)) {
            return arg0 ? class98.method652(-25405) : null;
        } else {
            return null;
        }
    }
}
