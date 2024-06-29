import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class218 extends class135 {

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "[Lkk;")
    public class233[] field3550;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3547 = "Use";

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public static int field3542 = 0;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "[I")
    public static int[] field3544 = new int[14];

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3551 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)Z")
    public final boolean method1471(int arg0, int arg1) {
        field3545++;
        if (arg1 != 0) {
            field3547 = null;
        }
        return this.field3550[arg0].field3748;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class215 var20 = new class215(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class90.field1382[var21][arg1][arg2] == null) {
                    class90.field1382[var21][arg1][arg2] = new class49(var21, arg1, arg2);
                }
            }
            class90.field1382[arg0][arg1][arg2].field638 = var20;
        } else if (arg3 == 1) {
            class215 var22 = new class215(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class90.field1382[var23][arg1][arg2] == null) {
                    class90.field1382[var23][arg1][arg2] = new class49(var23, arg1, arg2);
                }
            }
            class90.field1382[arg0][arg1][arg2].field638 = var22;
        } else {
            class81 var24 = new class81(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class90.field1382[var25][arg1][arg2] == null) {
                    class90.field1382[var25][arg1][arg2] = new class49(var25, arg1, arg2);
                }
            }
            class90.field1382[arg0][arg1][arg2].field632 = var24;
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V")
    public static void method1473(int arg0) {
        field3544 = null;
        field3547 = null;
        if (arg0 < -96) {
            field3551 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)Z")
    public final boolean method1474(int arg0, int arg1) {
        field3548++;
        if (arg0 >= -101) {
            this.method1474(-110, 106);
        }
        return this.field3550[arg1].field3738;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1475(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg1 >= class51.field710 && arg1 <= class96.field1484) {
            int var5 = class34.method273(class189.field2984, arg0, false, class110.field1669);
            int var6 = class34.method273(class189.field2984, arg3, arg4, class110.field1669);
            class23.method160(arg1, -94, arg2, var6, var5);
        }
        field3543++;
        if (arg4) {
            field3551 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
    public static final int method1476(int arg0, String arg1, String arg2, int arg3) {
        int var4 = arg2.length();
        field3541++;
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var7 - var9 < var5) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg2.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class52.method381(false, var22);
            var9 = class52.method381(false, var24);
            char var26 = class229.method1567(var22, false, arg3);
            char var27 = class229.method1567(var24, false, arg3);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class207.method1406(32519, arg3, var28) - class207.method1406(32519, arg3, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var5 - var11 - 1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg2.charAt(var16);
            char var19 = arg1.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class207.method1406(arg0 + 32518, arg3, var20) - class207.method1406(32519, arg3, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        if (arg0 != 1) {
            field3542 = -44;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class207.method1406(32519, arg3, var14) - class207.method1406(32519, arg3, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(II)I")
    public static final int method1477(int arg0, int arg1) {
        if (arg0 != 0) {
            field3551 = null;
        }
        class170 var2 = class163.method1117((byte) -80, arg1);
        field3546++;
        int var3 = var2.field2660;
        int var4 = var2.field2661;
        int var5 = var2.field2672;
        int var6 = class146.field2150[var3 - var4];
        return class258.field4166[var5] >> var4 & var6;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ldl;Ldl;IZ)V")
    public class218(class123 arg0, class123 arg1, int arg2, boolean arg3) {
        class46 var5 = new class46();
        int var6 = arg0.method820(arg2, 112);
        this.field3550 = new class233[var6];
        int[] var7 = arg0.method817((byte) 125, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method807((byte) 121, var7[var8], arg2);
            class152 var10 = null;
            int var11 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            for (class152 var12 = (class152) var5.method350(8240); var12 != null; var12 = (class152) var5.method353((byte) -117)) {
                if (var12.field2259 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method808(var11, (byte) 116, 0);
                } else {
                    var13 = arg1.method808(0, (byte) -30, var11);
                }
                var10 = new class152(var11, var13);
                var5.method349(var10, true);
            }
            this.field3550[var7[var8]] = new class233(var9, var10);
        }
    }
}
