import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class430 {

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public int field6113;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public int field6121;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Lrl;")
    public class430 field6109;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "Ls;")
    public class154 field6114;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Lpm;")
    public static class349 field6116 = new class349(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field6118 = 0;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "[I")
    public static int[] field6122 = new int[50];

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public int field6111;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public int field6117;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public int field6119;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public static void method2677(int arg0) {
        if (arg0 != -31674) {
            method2679((byte) -105, -84, 83);
        }
        field6116 = null;
        field6122 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BIIIII)I")
    public static final int method2678(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6112++;
        if (arg0 != 52) {
            field6116 = null;
        }
        if (class439.field6280 == null) {
            return 0;
        }
        if (arg3 < 3) {
            int var6 = arg1 >> 7;
            int var7 = arg2 >> 7;
            if (arg5 < 0 || arg4 < 0 || arg5 > class80.field1034 - 1 || arg4 > class381.field5414 - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class80.field1034 - 1 < var6 || class381.field5414 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class320.field4692[1][arg1 >> 7][arg2 >> 7] & 0x2) != 0;
            if ((arg1 & 0x7F) == 0) {
                boolean var9 = (class320.field4692[1][var6 - 1][arg2 >> 7] & 0x2) != 0;
                boolean var10 = (class320.field4692[1][var6][arg2 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class320.field4692[1][arg5][arg4] & 0x2) != 0;
                }
            }
            if ((arg2 & 0x7F) == 0) {
                boolean var11 = (class320.field4692[1][arg1 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class320.field4692[1][arg1 >> 7][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class320.field4692[1][arg5][arg4] & 0x2) != 0;
                }
            }
            if (var8) {
                arg3++;
            }
        }
        return class439.field6280[arg3].method360(arg1, arg2);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BII)I")
    public static final int method2679(byte arg0, int arg1, int arg2) {
        int var3 = -14 / ((-arg0 - 5) / 61);
        if (arg2 > arg1) {
            int var4 = arg1;
            arg1 = arg2;
            arg2 = var4;
        }
        field6110++;
        while (arg2 != 0) {
            int var5 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var5;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
    public static final void method2680(int arg0, int arg1) {
        field6120++;
        if (arg1 != 0) {
            field6118 = -83;
        }
        class276 var2 = class264.method1816((byte) -117, arg0, 1);
        var2.method1870((byte) 126);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILlf;)V")
    public static final void method2681(int arg0, class130 arg1) {
        field6115++;
        if (arg1.field1851.length - arg1.field1880 < 1) {
            return;
        }
        int var2 = arg1.method837(true);
        if (var2 < 0 || var2 > 15) {
            return;
        }
        byte var3;
        if (var2 == 15) {
            var3 = 37;
        } else if (var2 == 14) {
            var3 = 36;
        } else if (var2 == 13) {
            var3 = 35;
        } else if (var2 == 12) {
            var3 = 34;
        } else if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg1.field1851.length - arg1.field1880)) {
            return;
        }
        class355.field5139 = arg1.method837(true);
        if (class355.field5139 < 1) {
            class355.field5139 = 1;
        } else if (class355.field5139 > 4) {
            class355.field5139 = 4;
        }
        class238.method1625(arg1.method837(true) == 1, -71);
        class181.field2561 = arg1.method837(true) == 1;
        class247.field3703 = arg1.method837(true) == 1;
        class103.field1326 = arg1.method837(true) == 1;
        class145.field2182 = arg1.method837(true) == 1 ? 1 : 0;
        class266.field3908 = arg1.method837(true) == 1;
        class189.field2714 = arg1.method837(true) == 1;
        class79.field1027 = arg1.method837(true) == 1;
        class194.field2802 = arg1.method837(true);
        if (class194.field2802 > 2) {
            class194.field2802 = 2;
        }
        if (var2 < 2) {
            class120.field1626 = arg1.method837(true) == 1;
            arg1.method837(true);
        } else {
            class120.field1626 = arg1.method837(true) == 1;
        }
        class51.field664 = arg1.method837(true) == 1;
        class125.field1678 = arg1.method837(true) == 1;
        class26.field339 = arg1.method837(true);
        if (class26.field339 > 2) {
            class26.field339 = 2;
        }
        class233.field3451 = class26.field339;
        class358.field5172 = arg1.method837(true) == 1;
        class266.field3910 = arg1.method837(true);
        if (class266.field3910 > 127) {
            class266.field3910 = 127;
        }
        class131.field1914 = arg1.method837(true);
        class170.field2398 = arg1.method837(true);
        if (class170.field2398 > 127) {
            class170.field2398 = 127;
        }
        if (var2 >= 1) {
            class291.field4225 = arg1.method798(false);
            class145.field2183 = arg1.method798(false);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method837(true);
        }
        if (var2 >= 4) {
            int var4 = arg1.method837(true);
            if (var4 < 0 || var4 > 2) {
                var4 = 0;
            }
            if (class306.field4461 < 96) {
                var4 = 0;
            }
            class230.method1595(arg0 - 32285, var4);
        }
        if (var2 >= 5) {
            class393.field5523 = arg1.method815(true);
        }
        if (arg0 != 32203) {
            return;
        }
        int var5 = 0;
        if (var2 >= 6) {
            class220.field3168 = var5 = arg1.method837(true);
        }
        if (class220.field3168 != 1 && class220.field3168 != 2) {
            class220.field3168 = 2;
        }
        if (var2 >= 7) {
            class338.field4903 = arg1.method837(true) == 1;
        }
        if (var2 >= 8) {
            class24.field304 = arg1.method837(true) == 1;
        }
        if (var2 >= 9) {
            class68.field910 = arg1.method837(true);
        }
        if (class68.field910 < 0 || class68.field910 > class171.method1220(false, class306.field4461)) {
            class68.field910 = 0;
        }
        if (var2 >= 10) {
            class255.field3795 = arg1.method837(true) != 0;
        }
        if (var2 >= 11) {
            class84.field1077 = arg1.method837(true) != 0;
        }
        if (var2 >= 12) {
            class145.field2182 = arg1.method837(true);
        }
        if (class145.field2182 < 0 || class145.field2182 > 2) {
            class145.field2182 = 1;
        }
        if (var2 >= 13) {
            class324.field4717 = arg1.method837(true) == 1;
        }
        if (var2 >= 14) {
            class374.field5319 = arg1.method837(true);
        } else if (var5 == 0) {
            class374.field5319 = 2;
        } else {
            class374.field5319 = 1;
        }
        if (class374.field5319 < 0 || class374.field5319 > 3) {
            class374.field5319 = 2;
        }
        if (var2 >= 15) {
            class70.field930 = arg1.method837(true);
            if (class70.field930 < 0 || class70.field930 > 4) {
                class70.field930 = class409.field5869 == 1 ? 2 : 4;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(II)V")
    public class430(int arg0, int arg1) {
        this.field6113 = arg1;
        this.field6121 = arg0;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lrl;I)V")
    public class430(class430 arg0, int arg1) {
        this.field6109 = arg0;
        this.field6113 = this.field6109.field6113 + arg1;
        this.field6121 = this.field6109.field6121;
        this.field6114 = this.field6109.field6114;
    }
}
