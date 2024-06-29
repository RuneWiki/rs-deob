import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class145 extends class86 {

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "[S")
    public static short[] field2080 = new short[256];

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
    public static int field2089 = -1;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "Lqo;")
    private class141 field2087;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lof;B)V")
    public static final void method959(class321 arg0, byte arg1) {
        field2085++;
        int var2 = 0;
        arg0.method2077(8);
        for (int var3 = 0; var3 < class442.field6574; var3++) {
            int var15 = class320.field4896[var3];
            if ((class493.field7206[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class493.field7206[var15] = (byte) class286.method1860(class493.field7206[var15], 2);
                    var2--;
                } else {
                    int var16 = arg0.method2084((byte) -118, 1);
                    if (var16 == 0) {
                        var2 = class167.method1177(arg0, 5);
                        class493.field7206[var15] = (byte) class286.method1860(class493.field7206[var15], 2);
                    } else {
                        class412.method2504((byte) -119, var15, arg0);
                    }
                }
            }
        }
        arg0.method2085(7);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method2077(8);
        for (int var4 = 0; var4 < class442.field6574; var4++) {
            int var13 = class320.field4896[var4];
            if ((class493.field7206[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class493.field7206[var13] = (byte) class286.method1860(class493.field7206[var13], 2);
                    var2--;
                } else {
                    int var14 = arg0.method2084((byte) -118, 1);
                    if (var14 == 0) {
                        var2 = class167.method1177(arg0, 5);
                        class493.field7206[var13] = (byte) class286.method1860(class493.field7206[var13], 2);
                    } else {
                        class412.method2504((byte) -116, var13, arg0);
                    }
                }
            }
        }
        arg0.method2085(7);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method2077(8);
        for (int var5 = 0; var5 < class40.field621; var5++) {
            int var11 = class520.field7705[var5];
            if ((class493.field7206[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class493.field7206[var11] = (byte) class286.method1860(class493.field7206[var11], 2);
                } else {
                    int var12 = arg0.method2084((byte) -118, 1);
                    if (var12 == 0) {
                        var2 = class167.method1177(arg0, 5);
                        class493.field7206[var11] = (byte) class286.method1860(class493.field7206[var11], 2);
                    } else if (class366.method2297(arg0, var11, 110)) {
                        class493.field7206[var11] = (byte) class286.method1860(class493.field7206[var11], 2);
                    }
                }
            }
        }
        arg0.method2085(7);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method2077(8);
        for (int var6 = 0; var6 < class40.field621; var6++) {
            int var9 = class520.field7705[var6];
            if ((class493.field7206[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class493.field7206[var9] = (byte) class286.method1860(class493.field7206[var9], 2);
                } else {
                    int var10 = arg0.method2084((byte) -118, 1);
                    if (var10 == 0) {
                        var2 = class167.method1177(arg0, 5);
                        class493.field7206[var9] = (byte) class286.method1860(class493.field7206[var9], 2);
                    } else if (class366.method2297(arg0, var9, 123)) {
                        class493.field7206[var9] = (byte) class286.method1860(class493.field7206[var9], 2);
                    }
                }
            }
        }
        arg0.method2085(7);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class40.field621 = 0;
        class442.field6574 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class493.field7206[var7] = (byte) (class493.field7206[var7] >> 1);
            class322 var8 = class439.field6539[var7];
            if (var8 == null) {
                class520.field7705[class40.field621++] = var7;
            } else {
                class320.field4896[class442.field6574++] = var7;
            }
        }
        if (arg1 > -124) {
            field2089 = 82;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method960(String arg0, int arg1, int arg2) {
        field2086++;
        if (this.field2087 == null) {
            return arg0;
        }
        if (arg1 != 2) {
            field2089 = 110;
        }
        class44 var4 = (class44) this.field2087.method943((long) arg2, -1);
        return var4 == null ? arg0 : var4.field652;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)I")
    public final int method961(int arg0, int arg1, int arg2) {
        field2088++;
        if (this.field2087 == null) {
            return arg2;
        }
        if (arg1 != 32309) {
            field2089 = 15;
        }
        class74 var4 = (class74) this.field2087.method943((long) arg0, arg1 - 32310);
        return var4 == null ? arg2 : var4.field998;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ltl;II)V")
    private final void method962(class91 arg0, int arg1, int arg2) {
        if (arg2 < 64) {
            field2089 = -95;
        }
        if (arg1 == 249) {
            int var4 = arg0.method618((byte) 100);
            if (this.field2087 == null) {
                int var5 = class353.method2231(var4, (byte) -84);
                this.field2087 = new class141(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method618((byte) 100) == 1;
                int var8 = arg0.method641(32455);
                class467 var9;
                if (var7) {
                    var9 = new class44(arg0.method621(2029169511));
                } else {
                    var9 = new class74(arg0.method626((byte) 100));
                }
                this.field2087.method940((long) var8, -99, var9);
            }
        }
        field2083++;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIZZI)V")
    public static final void method963(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        int var5 = 106 / ((arg1 + 54) / 63);
        class24.method197(arg0, arg4, arg2, arg3, 0, class485.field7076.length - 1, 408247197);
        field2082++;
        class403.field6109 = null;
        class346.field5420 = 0;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
    public static void method964(int arg0) {
        if (arg0 != 1) {
            method966((byte) 103);
        }
        field2080 = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ltl;B)V")
    public final void method965(class91 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method618((byte) 100);
            if (var3 == 0) {
                field2084++;
                if (arg1 != -105) {
                    field2080 = null;
                    return;
                }
                return;
            }
            this.method962(arg0, var3, 73);
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
    public static final void method966(byte arg0) {
        if (arg0 > -18) {
            field2089 = -65;
        }
        field2079++;
        if (class74.field999 != class367.field5658) {
            try {
                class131.method841(class498.field7279, -14144, "tbrefresh");
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIILwd;I)V")
    public static final void method967(int arg0, int arg1, int arg2, int arg3, class119 arg4, int arg5) {
        field2081++;
        if (arg4.field1682 == -1 && arg4.field1661 == null) {
            return;
        }
        int var6 = arg1;
        if (arg4.field1668 < arg5) {
            var6 = arg5 + arg1 - arg4.field1668;
        } else if (arg5 < arg4.field1669) {
            var6 = arg4.field1669 + arg1 - arg5;
        }
        int var7 = class96.field1399.field5221 * arg4.field1671 >> 8;
        if (arg3 > arg4.field1666) {
            var6 += arg3 - arg4.field1666;
        } else if (arg4.field1680 > arg3) {
            var6 += arg4.field1680 - arg3;
        }
        if (arg4.field1676 == 0 || arg4.field1676 < var6 - 64 || class96.field1399.field5221 == 0 || arg4.field1673 != arg0) {
            if (arg4.field1681 != null) {
                class325.field4996.method1274(arg4.field1681);
                arg4.field1681 = null;
            }
            if (arg4.field1665 != null) {
                class325.field4996.method1274(arg4.field1665);
                arg4.field1665 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg4.field1676 - var6) * var7 / arg4.field1676;
        if (arg4.field1681 != null) {
            arg4.field1681.method1228(var8);
        } else if (arg4.field1682 >= 0) {
            class400 var9 = class400.method2458(class29.field459, arg4.field1682, 0);
            if (var9 != null) {
                class343 var10 = var9.method2457().method2200(class316.field4824);
                class175 var11 = class175.method1256(var10, 100, var8);
                var11.method1257(-1);
                class325.field4996.method1272(var11);
                arg4.field1681 = var11;
            }
        }
        if (arg4.field1665 != null) {
            arg4.field1665.method1228(var8);
            if (!arg4.field1665.method2788(-127)) {
                arg4.field1665 = null;
                return;
            }
            return;
        }
        if (arg4.field1661 == null || (arg4.field1685 -= arg2) > 0) {
            return;
        }
        int var12 = (int) ((double) arg4.field1661.length * Math.random());
        class400 var13 = class400.method2458(class29.field459, arg4.field1661[var12], 0);
        if (var13 == null) {
            return;
        }
        class343 var14 = var13.method2457().method2200(class316.field4824);
        class175 var15 = class175.method1256(var14, 100, var8);
        var15.method1257(0);
        class325.field4996.method1272(var15);
        arg4.field1665 = var15;
        arg4.field1685 = arg4.field1664 + (int) (Math.random() * (double) (arg4.field1675 - arg4.field1664));
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method968(String arg0, boolean arg1) {
        field2090++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class204.field2873; var2++) {
            if (arg0.equalsIgnoreCase(class42.field640[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class381.field5815[var2])) {
                return true;
            }
        }
        if (arg1) {
            field2089 = 3;
        }
        return false;
    }
}
