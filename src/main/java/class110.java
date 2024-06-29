import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class110 implements class104 {

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Ldb;")
    private class17 field1713 = new class17(256);

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lpf;")
    private class294 field1704;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lpf;")
    private class294 field1712;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[Lrd;")
    private class273[] field1707;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1701 = 0;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1706 = 1;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1708 = 0;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1710 = "Allocated memory";

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Lvf;")
    public static class104 field1711;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Lpf;")
    public static class294 field1705;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(II)Lwh;")
    public class198 method699(int arg0, int arg1) {
        field1702++;
        class1 var3 = this.field1713.method122((long) arg1, (byte) -81);
        if (var3 != null) {
            return (class198) var3;
        }
        if (arg0 != -1) {
            this.method699(-63, -116);
        }
        byte[] var4 = this.field1712.method1942(arg1, 27157);
        if (var4 == null) {
            return null;
        } else {
            class198 var5 = new class198(new class248(var4));
            this.field1713.method119((long) arg1, var5, arg0 + 1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method700(int arg0) {
        field1705 = null;
        field1710 = null;
        if (arg0 != -5287) {
            method700(120);
        }
        field1711 = null;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(II)Lrd;")
    public final class273 method661(int arg0, int arg1) {
        if (arg0 <= 8) {
            return null;
        } else {
            field1703++;
            return this.field1707[arg1];
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Z")
    public final boolean method663(int arg0, byte arg1) {
        if (arg1 >= -22) {
            return false;
        } else {
            field1709++;
            class198 var3 = this.method699(-1, arg0);
            return var3 != null && var3.method1243(this, this.field1704, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IFZIII)[I")
    public final int[] method662(int arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 <= 99) {
            this.method661(-111, 42);
        }
        field1700++;
        return this.method699(-1, arg4).method1239(-12746, arg2, arg0, (double) arg1, arg3, this.field1704, this, this.field1707[arg4].field4098);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lpf;Lpf;Lpf;)V")
    public class110(class294 arg0, class294 arg1, class294 arg2) {
        this.field1704 = arg2;
        this.field1712 = arg1;
        class248 var4 = new class248(arg0.method1973(1, 0, 0));
        int var5 = var4.method1575(false);
        this.field1707 = new class273[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1593((byte) 27) == 1) {
                this.field1707[var6] = new class273();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field1707[var7] != null) {
                this.field1707[var7].field4106 = var4.method1593((byte) 27) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field1707[var8] != null) {
                this.field1707[var8].field4102 = var4.method1593((byte) 27) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1707[var9] != null) {
                this.field1707[var9].field4099 = var4.method1593((byte) 27) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field1707[var10] != null) {
                var4.method1593((byte) 27);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field1707[var11] != null) {
                var4.method1604(4);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field1707[var12] != null) {
                var4.method1604(4);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field1707[var13] != null) {
                var4.method1604(4);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field1707[var14] != null) {
                var4.method1604(4);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field1707[var15] != null) {
                this.field1707[var15].field4105 = (short) var4.method1575(false);
            }
        }
        if (var4.field3748 < var4.field3723.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field1707[var16] != null) {
                    var4.method1604(4);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field1707[var17] != null) {
                    var4.method1604(4);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field1707[var18] != null) {
                    var4.method1593((byte) 27);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field1707[var19] != null) {
                    this.field1707[var19].field4098 = var4.method1593((byte) 27) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field1707[var20] != null) {
                    var4.method1604(4);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field1707[var21] != null) {
                    var4.method1593((byte) 27);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field1707[var22] != null) {
                    var4.method1593((byte) 27);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field1707[var23] != null) {
                    var4.method1593((byte) 27);
                }
            }
        }
    }
}
