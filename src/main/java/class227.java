import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class227 extends class23 {

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lqd;")
    public static class40 field3745 = class147.method1106(")3", (byte) -99);

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public static int field3747 = 0;

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "[S")
    public static short[] field3754 = new short[] { 59, 37, 6, 31, 4, 1, 44, 47 };

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "Z")
    public static boolean field3755;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIZ)V", line = 7)
    public static final void method1589(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        for (int var6 = arg0; var6 <= (arg0 + arg4); var6++) {
            for (int var7 = arg3; var7 <= arg2 + arg3; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class104.field1845[arg1][var7][var6] = 127;
                }
            }
        }
        field3751++;
        for (int var8 = arg0; var8 < arg0 + arg4; var8++) {
            for (int var9 = arg3; var9 < (arg2 + arg3); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class78.field1316[arg1][var9][var8] = arg1 <= 0 ? 0 : class78.field1316[arg1 - 1][var9][var8];
                }
            }
        }
        if (!arg5) {
            method1593(false, -117L);
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var10 = arg0 + 1; var10 < (arg0 + arg4); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class78.field1316[arg1][arg3][var10] = class78.field1316[arg1][arg3 - 1][var10];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var11 = arg3 + 1; var11 < (arg2 + arg3); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class78.field1316[arg1][var11][arg0] = class78.field1316[arg1][var11][arg0 - 1];
                }
            }
        }
        if (arg3 < 0 || arg0 < 0 || arg3 >= 104 || arg0 >= 104) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 > 0 && class78.field1316[arg1][arg3 - 1][arg0] != 0) {
                class78.field1316[arg1][arg3][arg0] = class78.field1316[arg1][arg3 - 1][arg0];
            } else if (arg0 > 0 && class78.field1316[arg1][arg3][arg0 - 1] != 0) {
                class78.field1316[arg1][arg3][arg0] = class78.field1316[arg1][arg3][arg0 - 1];
            } else if (arg3 > 0 && arg0 > 0 && class78.field1316[arg1][arg3 - 1][arg0 - 1] != 0) {
                class78.field1316[arg1][arg3][arg0] = class78.field1316[arg1][arg3 - 1][arg0 - 1];
            }
        } else if (arg3 > 0 && class78.field1316[arg1 - 1][arg3 - 1][arg0] != class78.field1316[arg1][arg3 - 1][arg0]) {
            class78.field1316[arg1][arg3][arg0] = class78.field1316[arg1][arg3 - 1][arg0];
        } else if (arg0 > 0 && class78.field1316[arg1 - 1][arg3][arg0 - 1] != class78.field1316[arg1][arg3][arg0 - 1]) {
            class78.field1316[arg1][arg3][arg0] = class78.field1316[arg1][arg3][arg0 - 1];
        } else if (arg3 > 0 && arg0 > 0 && class78.field1316[arg1][arg3 - 1][arg0 - 1] != class78.field1316[arg1 - 1][arg3 - 1][arg0 - 1]) {
            class78.field1316[arg1][arg3][arg0] = class78.field1316[arg1][arg3 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V", line = 129)
    public static final void method1590(int arg0, int arg1) {
        field3749++;
        if (arg0 == -1 || !class255.method1799(arg0, false)) {
            return;
        }
        class213[] var2 = class44.field845[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class213 var4 = var2[var3];
            if (var4.field3483 != null) {
                class109 var5 = new class109();
                var5.field1910 = var4;
                var5.field1908 = var4.field3483;
                class239.method1675(-7182, var5, 2000000);
            }
        }
        if (arg1 != 47) {
            method1592(true);
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)Lwa;", line = 170)
    public static final class76 method1591(int arg0, int arg1) {
        class76 var2 = (class76) class209.field3340.method1345((long) arg1, arg0 ^ 0x38FC);
        field3750++;
        if (var2 != null) {
            return var2;
        }
        class76 var3 = class232.method1609(false, class10.field166, true, arg1, class25.field447);
        if (arg0 == 21770) {
            if (var3 != null) {
                class209.field3340.method1350(var3, (long) arg1, arg0 ^ 0xFFFFAAB6);
            }
            return var3;
        } else {
            return (class76) null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V", line = 189)
    public static void method1592(boolean arg0) {
        field3745 = null;
        if (!arg0) {
            field3754 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZJ)V", line = 200)
    public static final void method1593(boolean arg0, long arg1) {
        field3743++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class233.field3844 < 100 || class267.field4457) || class233.field3844 >= 200) {
            class303.method2071(class264.field4421, 96, 0, class92.field1667);
            return;
        }
        class40 var3 = class199.method1401(arg1, 1).method372((byte) -104);
        for (int var4 = 0; var4 < class233.field3844; var4++) {
            if (class2.field20[var4] == arg1) {
                class303.method2071(class264.field4421, 127, 0, class153.method1192(new class40[] { var3, class195.field3148 }, (byte) 124));
                return;
            }
        }
        if (!arg0) {
            method1594(-7, 97, 125, -3, 67, 114, 116, 66, 71, -19);
        }
        for (int var5 = 0; var5 < class239.field3968; var5++) {
            if (class282.field4751[var5] == arg1) {
                class303.method2071(class264.field4421, 13, 0, class153.method1192(new class40[] { class142.field2391, var3, class293.field4926 }, (byte) -81));
                return;
            }
        }
        if (var3.method345(class255.field4233.field4319, false)) {
            class303.method2071(class264.field4421, 56, 0, class87.field1558);
            return;
        }
        class41.field784++;
        class15.field242[class233.field3844] = var3;
        class2.field20[class233.field3844] = arg1;
        class72.field1277[class233.field3844] = 0;
        class237.field3898[class233.field3844] = class264.field4421;
        class268.field4466[class233.field3844] = 0;
        class298.field4986[class233.field3844] = false;
        class166.field2754 = class60.field1152;
        class233.field3844++;
        class19.field295.method1464(64, 0);
        class19.field295.method241(arg1, 109);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIIII)V", line = 273)
    public static final void method1594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 >= -62) {
            field3755 = true;
        }
        field3753++;
        if (class125.field2164 <= arg6 && class48.field941 >= arg6 && class125.field2164 <= arg2 && class48.field941 >= arg2 && arg3 >= class125.field2164 && arg3 <= class48.field941 && class125.field2164 <= arg7 && class48.field941 >= arg7 && arg9 >= class220.field3664 && arg9 <= class72.field1275 && arg5 >= class220.field3664 && arg5 <= class72.field1275 && class220.field3664 <= arg8 && class72.field1275 >= arg8 && class220.field3664 <= arg1 && class72.field1275 >= arg1) {
            class312.method2156(arg7, arg9, arg2, arg8, arg5, arg6, arg3, -26746, arg0, arg1);
        } else {
            class104.method782(arg0, arg3, arg1, arg9, -119, arg5, arg2, arg6, arg8, arg7);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)[I", line = 302)
    public final int[] method32(byte arg0, int arg1) {
        int[] var3 = this.field403.method724((byte) -81, arg1);
        if (arg0 != -94) {
            method1593(true, -62L);
        }
        if (this.field403.field1760) {
            int[] var4 = this.method174(0, arg0 ^ 0xFFFFFFA2, arg1);
            for (int var5 = 0; var5 < class52.field1007; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        field3752++;
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILsd;)V", line = 344)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field3744++;
        if (arg0 == 0) {
            this.field415 = arg2.method226(arg1 ^ 0xFF) == 1;
        }
        if (arg1 != 0) {
            field3745 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 368)
    public class227() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[[I", line = 377)
    public final int[][] method17(int arg0, int arg1) {
        field3748++;
        int[][] var3 = this.field417.method1251(arg1, 123);
        if (this.field417.field2751) {
            int[][] var4 = this.method173(0, arg1, (byte) 13);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class52.field1007; var11++) {
                var10[var11] = 4096 - var5[var11];
                var8[var11] = 4096 - var7[var11];
                var9[var11] = 4096 - var6[var11];
            }
        }
        return arg0 < 30 ? (int[][]) ((int[][]) null) : var3;
    }
}
