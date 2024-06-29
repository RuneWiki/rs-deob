import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class23 {

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field350 = -1;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lpg;")
    public static class492 field348 = new class492(37, 2);

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lgo;")
    public static class331 field352 = new class331("runescape", 0);

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lcm;")
    public static class449 field353 = new class449(70, -1);

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field354 = 0;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Loa;")
    public static class33 field349;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[[I")
    public static int[][] field356;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)Z", line = 3)
    public static final boolean method173(int arg0, int arg1, int arg2, int arg3) {
        if (!class263.method1697(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class386.field5882;
        int var5 = arg2 << class386.field5882;
        int var6 = class455.field6683[arg0].method849(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class386.field5882 - 7);
        int var8 = var6 - (0xE6 << class386.field5882 - 7);
        int var9 = var6 - (0xEE << class386.field5882 - 7);
        if (arg3 == 1) {
            if (var4 > class346.field5413) {
                if (!class421.method2537(var4, var6, var5)) {
                    return false;
                }
                if (!class421.method2537(var4, var6, class380.field5804 + var5)) {
                    return false;
                }
                if (!class421.method2537(var4, var6, class215.field2995 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class421.method2537(var4, var7, var5)) {
                    return false;
                }
                if (!class421.method2537(var4, var7, class380.field5804 + var5)) {
                    return false;
                }
                if (!class421.method2537(var4, var7, class215.field2995 + var5)) {
                    return false;
                }
            }
            if (!class421.method2537(var4, var8, var5)) {
                return false;
            } else if (class421.method2537(var4, var8, class380.field5804 + var5)) {
                return class421.method2537(var4, var8, class215.field2995 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class178.field2540) {
                if (!class421.method2537(var4, var6, class215.field2995 + var5)) {
                    return false;
                }
                if (!class421.method2537(class380.field5804 + var4, var6, class215.field2995 + var5)) {
                    return false;
                }
                if (!class421.method2537(class215.field2995 + var4, var6, class215.field2995 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class421.method2537(var4, var7, class215.field2995 + var5)) {
                    return false;
                }
                if (!class421.method2537(class380.field5804 + var4, var7, class215.field2995 + var5)) {
                    return false;
                }
                if (!class421.method2537(class215.field2995 + var4, var7, class215.field2995 + var5)) {
                    return false;
                }
            }
            if (!class421.method2537(var4, var8, class215.field2995 + var5)) {
                return false;
            } else if (class421.method2537(class380.field5804 + var4, var8, class215.field2995 + var5)) {
                return class421.method2537(class215.field2995 + var4, var8, class215.field2995 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class346.field5413) {
                if (!class421.method2537(class215.field2995 + var4, var6, var5)) {
                    return false;
                }
                if (!class421.method2537(class215.field2995 + var4, var6, class380.field5804 + var5)) {
                    return false;
                }
                if (!class421.method2537(class215.field2995 + var4, var6, class215.field2995 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class421.method2537(class215.field2995 + var4, var7, var5)) {
                    return false;
                }
                if (!class421.method2537(class215.field2995 + var4, var7, class380.field5804 + var5)) {
                    return false;
                }
                if (!class421.method2537(class215.field2995 + var4, var7, class215.field2995 + var5)) {
                    return false;
                }
            }
            if (!class421.method2537(class215.field2995 + var4, var8, var5)) {
                return false;
            } else if (class421.method2537(class215.field2995 + var4, var8, class380.field5804 + var5)) {
                return class421.method2537(class215.field2995 + var4, var8, class215.field2995 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class178.field2540) {
                if (!class421.method2537(var4, var6, var5)) {
                    return false;
                }
                if (!class421.method2537(class380.field5804 + var4, var6, var5)) {
                    return false;
                }
                if (!class421.method2537(class215.field2995 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class421.method2537(var4, var7, var5)) {
                    return false;
                }
                if (!class421.method2537(class380.field5804 + var4, var7, var5)) {
                    return false;
                }
                if (!class421.method2537(class215.field2995 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class421.method2537(var4, var8, var5)) {
                return false;
            } else if (class421.method2537(class380.field5804 + var4, var8, var5)) {
                return class421.method2537(class215.field2995 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class421.method2537(class380.field5804 + var4, var9, class380.field5804 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class421.method2537(var4, var8, class215.field2995 + var5);
        } else if (arg3 == 32) {
            return class421.method2537(class215.field2995 + var4, var8, class215.field2995 + var5);
        } else if (arg3 == 64) {
            return class421.method2537(class215.field2995 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class421.method2537(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 227)
    public static void method180(byte arg0) {
        field353 = null;
        if (arg0 < -33) {
            field348 = null;
            field356 = null;
            field349 = null;
            field352 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBIII)V", line = 259)
    public static final void method187(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class75.field1006.field1292 = 0;
        field351++;
        class75.field1006.method625(class442.field6581.field2934, false);
        class75.field1006.method625(arg0, false);
        class75.field1006.method625(arg2, false);
        class75.field1006.method600(arg3, arg1 - 12982);
        if (arg1 != 91) {
            return;
        }
        class75.field1006.method600(arg4, arg1 ^ 0xFFFFCDFE);
        class443.field6602 = -3;
        class16.field266 = 1;
        class152.field2186 = 0;
        class35.field567 = 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[I)V")
    public abstract void method174(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "(I)V")
    public abstract void method175(int arg0);

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "([I)V")
    public abstract void method176(int[] arg0);

    @OriginalMember(owner = "client!ia", name = "ZA", descriptor = "(III)V")
    public abstract void method177(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "ma", descriptor = "(I)V")
    public abstract void method178(int arg0);

    @OriginalMember(owner = "client!ia", name = "ba", descriptor = "(Lia;)V")
    public abstract void method179(class23 arg0);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public abstract void method181(int arg0);

    @OriginalMember(owner = "client!ia", name = "YA", descriptor = "(I)V")
    public abstract void method182(int arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lia;")
    public abstract class23 method183();

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "(IIIIII)V")
    public abstract void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "(III)V")
    public abstract void method185(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "na", descriptor = "(I)V")
    public abstract void method186(int arg0);

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "(III[I)V")
    public abstract void method188(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "HA", descriptor = "()V")
    public abstract void method189();
}
