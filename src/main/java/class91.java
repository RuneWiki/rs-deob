import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class91 extends class262 {

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
    private int field1444 = -1;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "[I")
    public static int[] field1440 = new int[1000];

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "[I")
    public static int[] field1442 = new int[100];

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field1435 = 0;

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "Lok;")
    public static class146 field1451 = class235.method1724(-12908, "Annuler");

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "Llc;")
    public static class160 field1434 = new class160();

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "I")
    public static int field1454 = 0;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "Lje;")
    public static class70 field1439;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "[I")
    public int[] field1450;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 3)
    public static final void method623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class217 var20 = new class217(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class203.field3382[var21][arg1][arg2] == null) {
                    class203.field3382[var21][arg1][arg2] = new class11(var21, arg1, arg2);
                }
            }
            class203.field3382[arg0][arg1][arg2].field222 = var20;
        } else if (arg3 == 1) {
            class217 var22 = new class217(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class203.field3382[var23][arg1][arg2] == null) {
                    class203.field3382[var23][arg1][arg2] = new class11(var23, arg1, arg2);
                }
            }
            class203.field3382[arg0][arg1][arg2].field222 = var22;
        } else {
            class162 var24 = new class162(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class203.field3382[var25][arg1][arg2] == null) {
                    class203.field3382[var25][arg1][arg2] = new class11(var25, arg1, arg2);
                }
            }
            class203.field3382[arg0][arg1][arg2].field210 = var24;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)Z", line = 52)
    public final boolean method624(boolean arg0) {
        field1449++;
        if (this.field1450 != null) {
            return true;
        } else if (this.field1444 >= 0) {
            class307 var2 = class239.field3983 < 0 ? class45.method315(class35.field653, this.field1444, -108) : class161.method1265((byte) 106, class239.field3983, class35.field653, this.field1444);
            var2.method2164();
            this.field1448 = var2.field1155;
            this.field1450 = var2.field5243;
            this.field1437 = var2.field1145;
            return true;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V", line = 84)
    public static final void method625(int arg0) {
        int var1 = -31 % ((arg0 - 31) / 34);
        int var2 = class248.method1813((byte) 121);
        if (var2 == 0) {
            class300.field5075 = (byte[][][]) null;
            class210.method1579(-25802, 0);
        } else if (var2 == 1) {
            class110.method747((byte) 0, true);
            class210.method1579(-25802, 512);
            class292.method2089((byte) -115);
        } else {
            class110.method747((byte) (class260.field4321 - 4 & 0xFF), true);
            class210.method1579(-25802, 2);
        }
        field1452++;
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)I", line = 115)
    public final int method626(int arg0) {
        field1453++;
        return arg0 == 1 ? this.field1444 : 22;
    }

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V", line = 126)
    public static final void method627(int arg0) {
        class102.field1651 = null;
        class144.field2395 = null;
        class46.field794 = null;
        field1445++;
        class21.field406 = null;
        class124.field2027 = null;
        class39.field691 = null;
        class99.field1604 = null;
        class274.field4725 = null;
        class126.field2056 = null;
        class66.field1121 = null;
        class227.field3786 = null;
        class190.field3149 = null;
        class187.field3109 = null;
        field1439 = null;
        class39.field695 = null;
        class175.field2926 = null;
        if (arg0 != -200924) {
            return;
        }
        class268.field4613 = null;
        class124.field2042 = null;
        class25.field448 = null;
        class75.field1216 = null;
        class179.field3012 = null;
        class195.field3250 = null;
        class35.field657 = null;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(B)V", line = 166)
    public static void method628(byte arg0) {
        field1434 = null;
        field1439 = null;
        field1440 = null;
        field1442 = null;
        if (arg0 >= 79) {
            field1451 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)[[I", line = 190)
    public int[][] method87(int arg0, int arg1) {
        field1446++;
        if (arg0 != 7) {
            this.field1437 = 80;
        }
        int[][] var3 = this.field4347.method536(arg1, 4096);
        if (this.field4347.field1202 && this.method624(false)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = this.field1437 * (class104.field1676 == this.field1448 ? arg1 : this.field1448 * arg1 / class104.field1676);
            int[] var7 = var3[1];
            if (class98.field1598 == this.field1437) {
                for (int var8 = 0; var8 < class98.field1598; var8++) {
                    int var9 = this.field1450[var6++];
                    var5[var8] = class82.method582(var9 << 4, 4080);
                    var7[var8] = class82.method582(var9 >> 4, 4080);
                    var4[var8] = class82.method582(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class98.field1598; var10++) {
                    int var11 = this.field1437 * var10 / class98.field1598;
                    int var12 = this.field1450[var6 + var11];
                    var5[var10] = class82.method582(255, var12) << 4;
                    var7[var10] = class82.method582(4080, var12 >> 4);
                    var4[var10] = class82.method582(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)I", line = 261)
    public static final int method629(int arg0, int arg1, int arg2, int arg3) {
        field1438++;
        int var4 = arg3 / arg1;
        int var5 = arg3 & arg1 - 1;
        int var6 = arg0 / arg1;
        int var7 = arg0 & arg1 - 1;
        int var8 = class75.method552(var4, var6, (byte) 121);
        int var9 = class75.method552(var4 + 1, var6, (byte) 125);
        int var10 = class75.method552(var4, var6 + 1, (byte) -70);
        int var11 = class75.method552(var4 + 1, var6 + 1, (byte) -45);
        int var12 = class96.method665(var9, arg1, var5, 1633803553, var8);
        int var13 = class96.method665(var11, arg1, var5, arg2 + 1633800093, var10);
        if (arg2 != 3460) {
            field1434 = (class160) null;
        }
        return class96.method665(var13, arg1, var7, 1633803553, var12);
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 291)
    public class91() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lwe;II)V", line = 299)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field1441++;
        if (arg1 != 2048) {
            method627(116);
        }
        if (arg2 == 0) {
            this.field1444 = arg0.method379(-2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V", line = 324)
    public final void method630(byte arg0) {
        field1443++;
        super.method630((byte) -64);
        if (arg0 >= -56) {
            field1454 = 119;
        }
        this.field1450 = null;
    }
}
