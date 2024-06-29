import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public abstract class class202 {

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field2945 = 0;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "[I")
    public static int[] field2940 = new int[2];

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public static void method1525(int arg0) {
        if (arg0 != -2092404400) {
            field2940 = null;
        }
        field2940 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)I")
    public static final int method1526(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field2944++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg1 == -2092404400) {
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        } else {
            return -55;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
    public abstract void method1527(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(III)V")
    public abstract void method1528(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
    public abstract void method1529(int arg0);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lpo;)V")
    public abstract void method1530(class202 arg0);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "()V")
    public abstract void method1531();

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public abstract void method1532(int arg0);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IZ)V")
    public static final void method1533(int arg0, boolean arg1) {
        class243.field3541 = -1;
        class270.field4049 = -1;
        field2942++;
        if (!arg1) {
            field2940 = null;
        }
        class110.field1797 = arg0;
        class441.method2748(-106);
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V")
    public abstract void method1534(int arg0);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III[I)V")
    public abstract void method1535(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
    public static final void method1536(byte arg0) {
        field2947++;
        int var1 = -102 / ((-arg0 - 71) / 44);
        for (class431 var2 = (class431) class321.field4640.method157((byte) -125); var2 != null; var2 = (class431) class321.field4640.method145(-101)) {
            class204 var3 = var2.field6222;
            if (class367.field5213 != var3.field6509 || var3.field2980 < class267.field4002) {
                var2.method251(110);
                var3.method1546(122);
            } else if (var3.field2974 <= class267.field4002) {
                if (var3.field2979 > 0) {
                    class98 var4 = class447.field6512[var3.field2979 - 1];
                    if (var4 != null && var4.field6520 >= 0 && class183.field2703 * 128 > var4.field6520 && var4.field6519 >= 0 && (class66.field1056 * 128) > var4.field6519) {
                        var3.method1545(class109.method957(var4.field6519, var4.field6520, var3.field6509, 20663) - var3.field2969, true, var4.field6520, class267.field4002, var4.field6519);
                    }
                }
                if (var3.field2979 < 0) {
                    int var5 = -var3.field2979 - 1;
                    class127 var6;
                    if (class379.field5381 == var5) {
                        var6 = class86.field1394;
                    } else {
                        var6 = class367.field5225[var5];
                    }
                    if (var6 != null && var6.field6520 >= 0 && var6.field6520 < (class183.field2703 * 128) && var6.field6519 >= 0 && (class66.field1056 * 128) > var6.field6519) {
                        var3.method1545(class109.method957(var6.field6519, var6.field6520, var3.field6509, 20663) - var3.field2969, true, var6.field6520, class267.field4002, var6.field6519);
                    }
                }
                var3.method1544(class409.field5967, -16003);
                class74.method587(var3, true);
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1538(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2943++;
        if ((class278.field4176[0][arg0][arg1] & 0x2) != 0) {
            return true;
        }
        if (arg3 != 582) {
            method1525(-92);
        }
        if ((class278.field4176[arg4][arg0][arg1] & 0x10) == 0) {
            return arg2 == class339.method2199(arg0, arg3 - 25119, arg4, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([I)V")
    public abstract void method1539(int[] arg0);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V")
    public static final void method1540(int arg0, String arg1, String arg2, boolean arg3, String arg4, int arg5) {
        if (!arg3) {
            field2940 = null;
        }
        class292.method2038((String) null, (byte) -124, arg4, arg0, -1, arg5, arg2, arg1);
        field2941++;
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V")
    public abstract void method1541(int arg0);

    @OriginalMember(owner = "client!po", name = "f", descriptor = "(I)V")
    public abstract void method1542(int arg0);
}
