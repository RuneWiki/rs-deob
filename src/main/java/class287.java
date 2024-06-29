import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public abstract class class287 extends class78 {

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Lsd;")
    public static class74 field4297 = new class74(67, 15);

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public int field4302;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public int field4303;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public int field4306;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "Let;")
    public static class274 field4307;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "Z")
    public boolean field4299;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static final void method1817(int arg0) {
        class210 var1 = class160.field1926;
        synchronized (class160.field1926) {
            class160.field1926.method1165((byte) 118);
        }
        if (arg0 < 48) {
            method1817(64);
        }
        field4301++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)Z")
    public static final boolean method1818(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class174.field2095; var3++) {
            class85 var4 = class388.field5563[var3];
            if (var4.field1038 == 1) {
                int var5 = var4.field1047 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1044 * var5 >> 8) + var4.field1041;
                    int var7 = (var4.field1029 * var5 >> 8) + var4.field1034;
                    int var8 = (var4.field1032 * var5 >> 8) + var4.field1036;
                    int var9 = (var4.field1030 * var5 >> 8) + var4.field1025;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1038 == 2) {
                int var10 = arg0 - var4.field1047;
                if (var10 > 0) {
                    int var11 = (var4.field1044 * var10 >> 8) + var4.field1041;
                    int var12 = (var4.field1029 * var10 >> 8) + var4.field1034;
                    int var13 = (var4.field1032 * var10 >> 8) + var4.field1036;
                    int var14 = (var4.field1030 * var10 >> 8) + var4.field1025;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1038 == 3) {
                int var15 = var4.field1041 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1035 * var15 >> 8) + var4.field1047;
                    int var17 = (var4.field1039 * var15 >> 8) + var4.field1027;
                    int var18 = (var4.field1032 * var15 >> 8) + var4.field1036;
                    int var19 = (var4.field1030 * var15 >> 8) + var4.field1025;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1038 == 4) {
                int var20 = arg2 - var4.field1041;
                if (var20 > 0) {
                    int var21 = (var4.field1035 * var20 >> 8) + var4.field1047;
                    int var22 = (var4.field1039 * var20 >> 8) + var4.field1027;
                    int var23 = (var4.field1032 * var20 >> 8) + var4.field1036;
                    int var24 = (var4.field1030 * var20 >> 8) + var4.field1025;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1038 == 5) {
                int var25 = arg1 - var4.field1036;
                if (var25 > 0) {
                    int var26 = (var4.field1035 * var25 >> 8) + var4.field1047;
                    int var27 = (var4.field1039 * var25 >> 8) + var4.field1027;
                    int var28 = (var4.field1044 * var25 >> 8) + var4.field1041;
                    int var29 = (var4.field1029 * var25 >> 8) + var4.field1034;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
    public final void method32(int arg0) {
        if (arg0 == -2) {
            field4300++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZIIII)V")
    public static final void method1819(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4304++;
        int var6 = class353.method2142((byte) -104, class328.field4729, arg5, class357.field5123);
        int var7 = class353.method2142((byte) -99, class328.field4729, arg2, class357.field5123);
        int var8 = class353.method2142((byte) 118, class453.field6396, arg3, class75.field912);
        int var9 = class353.method2142((byte) -54, class453.field6396, arg4, class75.field912);
        int var10 = var6;
        if (!arg1) {
            method1818(76, 110, 85);
        }
        while (var10 <= var7) {
            class270.method1633(class240.field3303[var10], var9, arg0, var8, 104);
            var10++;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static void method1820(byte arg0) {
        int var1 = 119 / ((-arg0 - 73) / 50);
        field4307 = null;
        field4297 = null;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)Z")
    public final boolean method33(int arg0) {
        if (arg0 == 1957) {
            field4298++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIZLa;IBLoj;)V")
    public final void method23(int arg0, int arg1, boolean arg2, class78 arg3, int arg4, byte arg5, class280 arg6) {
        field4305++;
        if (arg5 == -65) {
            throw new IllegalStateException();
        }
    }
}
