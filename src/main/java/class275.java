import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class275 {

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field4457 = 0;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4458 = "Connection lost.";

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "[I")
    public static int[] field4453 = new int[5];

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Lpi;")
    public static class201 field4452 = new class201(2);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1911(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class156.field2438 * arg3 + class106.field1812 * arg0 >> 16;
        int var6 = class106.field1812 * arg3 - class156.field2438 * arg0 >> 16;
        int var7 = class86.field1366 * var6 + class284.field4568 * arg1 >> 16;
        int var8 = class86.field1366 * arg1 - class284.field4568 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class86.field1366 * var6 + class284.field4568 * arg2 >> 16;
        int var12 = class86.field1366 * arg2 - class284.field4568 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class51.field709 && var13 < class51.field709) {
            return false;
        } else if (var9 > class202.field2972 && var13 > class202.field2972) {
            return false;
        } else if (var10 < class249.field3765 && var14 < class249.field3765) {
            return false;
        } else {
            return var10 <= class246.field3613 || var14 <= class246.field3613;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method1912(int arg0, int arg1, Random arg2) {
        field4451++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class101.method792(true, arg0)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            if (arg1 >= -79) {
                field4456 = 102;
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class304.method2068(var4, true, arg0);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
    public static final void method1913(int arg0, int arg1) {
        if (arg0 != 50) {
            return;
        }
        field4454++;
        if (arg1 == -1 || !class44.field578[arg1]) {
            return;
        }
        class53.field805.method1888(arg1, 121);
        if (class134.field2195[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class134.field2195[arg1].length; var3++) {
            if (class134.field2195[arg1][var3] != null) {
                if (class134.field2195[arg1][var3].field4129 == 2) {
                    var2 = false;
                } else {
                    class134.field2195[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class134.field2195[arg1] = null;
        }
        class44.field578[arg1] = false;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public static void method1914(boolean arg0) {
        field4452 = null;
        if (arg0) {
            field4452 = null;
        }
        field4458 = null;
        field4453 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static final void method1915(byte arg0) {
        class242.field3548.method1420((byte) -119);
        if (arg0 != -63) {
            method1912(-77, 38, (Random) null);
        }
        field4450++;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
    public static final void method1916(byte arg0) {
        field4455++;
        while (true) {
            class47 var1;
            class248 var3;
            do {
                var1 = (class47) class136.field2214.method11(4);
                if (var1 == null) {
                    int var26 = 49 / ((arg0 - 51) / 63);
                    return;
                }
                if (var1.field662 >= 0) {
                    int var2 = var1.field662 - 1;
                    var3 = class255.field3856[var2];
                } else {
                    int var4 = -var1.field662 - 1;
                    if (class279.field4498 == var4) {
                        var3 = class213.field3139;
                    } else {
                        var3 = class92.field1475[var4];
                    }
                }
            } while (var3 == null);
            class93 var5 = class48.method297(false, var1.field648);
            int var6;
            int var7;
            if (var1.field663 == 1 || var1.field663 == 3) {
                var6 = var5.field1557;
                var7 = var5.field1544;
            } else {
                var6 = var5.field1544;
                var7 = var5.field1557;
            }
            int var8 = (var6 >> 1) + var1.field656;
            int var9 = var1.field656 + (var6 + 1 >> 1);
            int var10 = (var7 >> 1) + var1.field650;
            int[][] var11 = class103.field1792[class37.field474];
            int var12 = (var7 + 1 >> 1) + var1.field650;
            int var13 = var11[var8][var12] + var11[var9][var10] + var11[var8][var10] + var11[var9][var12] >> 2;
            class4 var14 = null;
            int var15 = class210.field3105[var1.field664];
            if (var15 == 0) {
                class231 var19 = class146.method1086(class37.field474, var1.field656, var1.field650);
                if (var19 != null) {
                    var14 = var19.field3401;
                }
            } else if (var15 == 1) {
                class272 var18 = class225.method1562(class37.field474, var1.field656, var1.field650);
                if (var18 != null) {
                    var14 = var18.field4402;
                }
            } else if (var15 == 2) {
                class156 var16 = class191.method1360(class37.field474, var1.field656, var1.field650);
                if (var16 != null) {
                    var14 = var16.field2436;
                }
            } else if (var15 == 3) {
                class214 var17 = class221.method1538(class37.field474, var1.field656, var1.field650);
                if (var17 != null) {
                    var14 = var17.field3150;
                }
            }
            if (var14 != null) {
                class241.method1651(var1.field649 + 1, var15, -1, class37.field474, 0, 0, var1.field650, var1.field646 + 1, -84, var1.field656);
                var3.field3746 = var13;
                var3.field3674 = class199.field2930 + var1.field649;
                var3.field3742 = var14;
                var3.field3728 = class199.field2930 + var1.field646;
                int var20 = var1.field655;
                var3.field3729 = var1.field656 * 128 + var6 * 64;
                int var21 = var1.field660;
                int var22 = var1.field661;
                var3.field3683 = var1.field650 * 128 + var7 * 64;
                if (var21 < var20) {
                    int var23 = var20;
                    var20 = var21;
                    var21 = var23;
                }
                var3.field3666 = var1.field656 + var20;
                var3.field3673 = var1.field656 + var21;
                int var24 = var1.field651;
                if (var22 > var24) {
                    int var25 = var22;
                    var22 = var24;
                    var24 = var25;
                }
                var3.field3701 = var1.field650 + var22;
                var3.field3735 = var1.field650 + var24;
            }
        }
    }
}
