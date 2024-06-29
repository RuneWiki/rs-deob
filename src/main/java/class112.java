import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class112 extends class256 {

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field2143 = 0;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "Lmg;")
    private class252 field2139;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLqk;)V")
    public final void method786(byte arg0, class200 arg1) {
        while (true) {
            int var3 = arg1.method1408((byte) -28);
            if (var3 == 0) {
                field2140++;
                if (arg0 < 10) {
                    field2144 = 10;
                    return;
                }
                return;
            }
            this.method792(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)I")
    public final int method787(int arg0, int arg1, int arg2) {
        field2133++;
        if (this.field2139 == null) {
            return arg2;
        } else if (arg0 == 0) {
            class2 var4 = (class2) this.field2139.method1698((long) arg1, (byte) -94);
            return var4 == null ? arg2 : var4.field24;
        } else {
            return -126;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Ljd;")
    public static final class86 method788(int arg0, int arg1) {
        field2138++;
        if (arg0 >= -29) {
            return null;
        } else if (arg1 < 100000) {
            return class109.method783(2, new class86[] { class16.field459, class4.method26(false, arg1), class44.field986 });
        } else if (arg1 < 10000000) {
            return class109.method783(2, new class86[] { class50.field1052, class4.method26(false, arg1 / 1000), class93.field1875, class44.field986 });
        } else {
            return class109.method783(2, new class86[] { class88.field1753, class4.method26(false, arg1 / 1000000), class44.field985, class44.field986 });
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
    public static final void method789(int arg0, int arg1) {
        if (arg0 != 10436) {
            method789(77, 42);
        }
        field2134++;
        class88.field1739.method693(6, arg1);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BILjd;)Ljd;")
    public final class86 method790(byte arg0, int arg1, class86 arg2) {
        field2136++;
        if (this.field2139 == null) {
            return arg2;
        } else {
            int var4 = -5 % ((47 - arg0) / 42);
            class232 var5 = (class232) this.field2139.method1698((long) arg1, (byte) 116);
            return var5 == null ? arg2 : var5.field4205;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V")
    public static final void method791(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2141++;
        if (arg4 != 15599) {
            method788(-100, -29);
        }
        if (class50.field1050 <= arg1 && arg1 <= class56.field1143) {
            int var5 = class171.method1221(class129.field2473, class49.field1044, 21419, arg0);
            int var6 = class171.method1221(class129.field2473, class49.field1044, 21419, arg2);
            class133.method945(var6, arg1, var5, arg3, arg4 ^ 0x3B72);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZLqk;)V")
    private final void method792(int arg0, boolean arg1, class200 arg2) {
        if (arg0 == 249) {
            int var4 = arg2.method1408((byte) -24);
            if (this.field2139 == null) {
                int var5 = class156.method1139(var4, -70);
                this.field2139 = new class252(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1408((byte) -77) == 1;
                int var8 = arg2.method1405(-3);
                class207 var9;
                if (var7) {
                    var9 = new class232(arg2.method1376((byte) 24));
                } else {
                    var9 = new class2(arg2.method1386(-4603));
                }
                this.field2139.method1699(-28407, var9, (long) var8);
            }
        }
        field2142++;
        if (!arg1) {
            this.method787(47, 113, -25);
        }
    }
}
