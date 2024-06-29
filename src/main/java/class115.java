import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class115 extends class90 {

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "Z")
    public static boolean field1597 = true;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "Z")
    public static boolean field1600 = false;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public static int field1604 = 0;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "Lsh;")
    public static class472 field1603 = new class472(55, -2);

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    public static int field1605 = 0;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "Z")
    public static volatile boolean field1607 = false;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "Lct;")
    public static class285 field1606 = new class285(14, -1);

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "Lfa;")
    private class371 field1595;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "Ljc;")
    public static class448 field1608;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 3)
    public final String method818(int arg0, int arg1, String arg2) {
        field1592++;
        if (arg0 < 34) {
            return null;
        } else if (this.field1595 == null) {
            return arg2;
        } else {
            class81 var4 = (class81) this.field1595.method2305((long) arg1, (byte) 99);
            return var4 == null ? arg2 : var4.field1141;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lre;B)V", line = 26)
    public final void method819(class446 arg0, byte arg1) {
        if (arg1 <= 50) {
            return;
        }
        while (true) {
            int var3 = arg0.method2628(49152);
            if (var3 == 0) {
                field1601++;
                return;
            }
            this.method823((byte) -122, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIBIII)V", line = 55)
    public static final void method820(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -83) {
            return;
        }
        class208[] var7 = class365.field5522;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class208 var9 = var7[var8];
            if (var9 != null && var9.field3129 == 2) {
                class439.method2551(arg2, (var9.field3141 - class68.field922 << 7) + var9.field3144, arg6, var9.field3138, -30226, arg4 >> 1, var9.field3130 * 2, (var9.field3136 - class468.field6588 << 7) + var9.field3140, arg5 >> 1);
                if (class429.field6114[0] > -1 && (class452.field6418 % 20) < 10) {
                    class293.field4415[var9.field3135].method1958(arg0 - (12 - class429.field6114[0]), arg1 - 28 + class429.field6114[1]);
                }
            }
        }
        field1596++;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V", line = 86)
    public static final void method821(int arg0) {
        class488.field6847 = 0;
        field1599++;
        class106.field1483 = -1;
        class24.field320 = -1;
        if (arg0 >= 97) {
            class37.field492 = -1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Z", line = 100)
    public static final boolean method822(int arg0, int arg1) {
        if (arg0 != 19321) {
            field1603 = null;
        }
        field1594++;
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BILre;)V", line = 114)
    private final void method823(byte arg0, int arg1, class446 arg2) {
        if (arg0 >= -113) {
            this.method819((class446) null, (byte) -13);
        }
        field1602++;
        if (arg1 != 249) {
            return;
        }
        int var4 = arg2.method2628(49152);
        if (this.field1595 == null) {
            int var5 = class158.method1078((byte) -116, var4);
            this.field1595 = new class371(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method2628(49152) == 1;
            int var8 = arg2.method2613(-25778);
            class35 var9;
            if (var7) {
                var9 = new class81(arg2.method2582((byte) -51));
            } else {
                var9 = new class145(arg2.method2604(12));
            }
            this.field1595.method2307((long) var8, var9, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBI)I", line = 159)
    public final int method824(int arg0, byte arg1, int arg2) {
        field1593++;
        if (this.field1595 == null) {
            return arg0;
        } else if (arg1 >= -34) {
            return 23;
        } else {
            class145 var4 = (class145) this.field1595.method2305((long) arg2, (byte) 74);
            return var4 == null ? arg0 : var4.field2054;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 179)
    public static void method825(byte arg0) {
        field1606 = null;
        field1603 = null;
        field1608 = null;
        if (arg0 < 7) {
            method820(-92, 92, 34, (byte) -25, -69, -46, 80);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Lgo;", line = 198)
    public static final class287 method826(int arg0, int arg1, int arg2) {
        class337 var3 = class170.field2427[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5058;
    }
}
