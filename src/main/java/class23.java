import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class23 extends class522 implements class401 {

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "Lmv;")
    public class522 field337;

    @OriginalMember(owner = "client!ks", name = "Q", descriptor = "[C")
    public static char[] field346 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "F")
    public static float field333;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ks", name = "N", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!ks", name = "O", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ks", name = "P", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ks", name = "R", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ks", name = "S", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!ks", name = "T", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!ks", name = "U", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!ks", name = "V", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ks", name = "W", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!ks", name = "Y", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ks", name = "X", descriptor = "Lok;")
    public static class74 field353;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "[[I")
    public static int[][] field335;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)I")
    public final int method222(byte arg0) {
        field350++;
        return arg0 > -99 ? -17 : 0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)I")
    public final int method223(int arg0) {
        field349++;
        if (arg0 != -19634) {
            this.method225(null, (byte) -34);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lya;IIILqj;IZ)V")
    public final void method224(class11 arg0, int arg1, int arg2, int arg3, class419 arg4, int arg5, boolean arg6) {
        field336++;
        int var8 = -48 % ((arg5 - 24) / 62);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lya;B)V")
    public final void method225(class11 arg0, byte arg1) {
        field344++;
        int var3 = 116 / ((42 - arg1) / 36);
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(B)V")
    public static void method226(byte arg0) {
        int var1 = -110 % ((14 - arg0) / 50);
        field335 = null;
        field346 = null;
        field353 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lrm;IIIII)V")
    public static final void method227(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1095 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class98.field1508[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class466 var13 = class486.field7238[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field1095; var14++) {
                            if (arg0.field1092[var14] == var13.field6794) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field1092[arg0.field1095++] = var13.field6794;
                        if (arg0.field1095 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field1095; var15 < 4; var15++) {
            arg0.field1092[var15] = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method228(int arg0, String arg1) {
        field352++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class222.field3162; var2++) {
            if (arg1.equalsIgnoreCase(class134.field1996[var2])) {
                return true;
            }
        }
        if (arg0 == 35) {
            return arg1.equalsIgnoreCase(class410.field6198.field7063);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)V")
    public final void method229(boolean arg0) {
        field354++;
        if (arg0) {
            field341 = 110;
        }
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)Z")
    public final boolean method230(int arg0) {
        if (arg0 != -22611) {
            field341 = 41;
        }
        field331++;
        return false;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLya;)V")
    public final void method231(byte arg0, class11 arg1) {
        field338++;
        if (arg0 != 33) {
            this.method225(null, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)Z")
    public final boolean method232(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field345++;
            return false;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method233(int arg0, class11 arg1, int arg2, int arg3) {
        if (arg2 == 2) {
            field332++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lya;I)V")
    public final void method234(class11 arg0, int arg1) {
        if (arg1 != 28007) {
            field346 = null;
        }
        field348++;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIB)I")
    public static final int method235(int arg0, int arg1, byte arg2) {
        field340++;
        int var3 = class158.method1125(arg0 + 91923, (byte) 75, arg1 + 45365, 4) - (128 - (class158.method1125(arg0 + 37821, (byte) -122, arg1 + 10294, 2) - 128 >> 1) - (class158.method1125(arg0, (byte) -87, arg1, 1) - 128 >> 2));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return arg2 >= -64 ? -42 : var4;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(IIIIIIIIIILmv;)V")
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class522 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class195.method1288(arg1, arg0, (byte) -61));
        this.field337 = arg10;
    }

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "(I)I")
    public final int method236(int arg0) {
        field334++;
        if (arg0 != 0) {
            this.method240(-87);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method237(byte arg0, String arg1) {
        field351++;
        if (arg1 == null) {
            return;
        }
        if (!(class222.field3162 < 100 || class226.field3195) || class222.field3162 >= 200) {
            class264.method1653((byte) 121, class208.field3007.method2103(class30.field430, (byte) 34));
            return;
        }
        String var2 = class491.method2932((byte) 49, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class222.field3162; var3++) {
            String var8 = class491.method2932((byte) 105, class134.field1996[var3]);
            if (var8 != null && var8.equals(var2)) {
                class264.method1653((byte) 113, arg1 + class58.field796.method2103(class30.field430, (byte) 34));
                return;
            }
            if (class227.field3207[var3] != null) {
                String var9 = class491.method2932((byte) 105, class227.field3207[var3]);
                if (var9 != null && var9.equals(var2)) {
                    class264.method1653((byte) 126, arg1 + class58.field796.method2103(class30.field430, (byte) 34));
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class411.field6211; var4++) {
            String var6 = class491.method2932((byte) 120, class60.field827[var4]);
            if (var6 != null && var6.equals(var2)) {
                class264.method1653((byte) 114, class254.field3446.method2103(class30.field430, (byte) 34) + arg1 + class365.field5575.method2103(class30.field430, (byte) 34));
                return;
            }
            if (class505.field7431[var4] != null) {
                String var7 = class491.method2932((byte) 115, class505.field7431[var4]);
                if (var7 != null && var7.equals(var2)) {
                    class264.method1653((byte) 119, class254.field3446.method2103(class30.field430, (byte) 34) + arg1 + class365.field5575.method2103(class30.field430, (byte) 34));
                    return;
                }
            }
        }
        if (class491.method2932((byte) 89, class410.field6198.field7063).equals(var2)) {
            class264.method1653((byte) 125, class234.field3294.method2103(class30.field430, (byte) 34));
            return;
        }
        class52.field673++;
        class97.method758(class224.field3170, false);
        class43.field559.method2754(class521.method3084(arg1, 69), 5574);
        class43.field559.method2731(arg1, (byte) -125);
        int var5 = -105 / ((-arg0 - 9) / 37);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Lya;I)Lmo;")
    public final class268 method238(class11 arg0, int arg1) {
        if (arg1 != -1) {
            field353 = null;
        }
        field339++;
        return null;
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
    public final void method239(int arg0) {
        field342++;
        if (arg0 >= -38) {
            field346 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)I")
    public final int method240(int arg0) {
        field347++;
        if (arg0 != -15578) {
            method237((byte) -36, null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILya;I)Lt;")
    public final class398 method241(int arg0, class11 arg1, int arg2) {
        int var4 = 45 % ((62 - arg2) / 42);
        field343++;
        return null;
    }
}
