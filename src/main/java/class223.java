import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class223 extends class445 {

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "Lld;")
    public class105 field2963 = new class105();

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "Lhi;")
    public static class125 field2964 = class72.method471((byte) 87);

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "Lr;")
    public static class110 field2965;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZIIB)V")
    public static final void method1261(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        field2960++;
        int var6 = arg1 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class408.field5583 - class153.field2150) * var6 / 100 + class153.field2150;
        if (class107.field1606 > var7) {
            var7 = class107.field1606;
        } else if (var7 > class33.field507) {
            var7 = class33.field507;
        }
        int var8 = arg1 * 512 * var7 / (arg3 * 334);
        int var9 = 33 % ((-arg5 - 1) / 34);
        if (class138.field2009 > var8) {
            short var13 = class138.field2009;
            var7 = arg3 * var13 * 334 / (arg1 * 512);
            if (var7 > class33.field507) {
                var7 = class33.field507;
                int var14 = arg1 * var7 * 512 / (var13 * 334);
                int var15 = (arg3 - var14) / 2;
                if (arg2) {
                    class98.field1432.method2006();
                    class98.field1432.method2222(arg1, arg0, arg4, -16777216, 109, var15);
                    class98.field1432.method2222(arg1, arg0 + arg3 - var15, arg4, -16777216, 124, var15);
                }
                arg3 -= var15 * 2;
                arg0 += var15;
            }
        } else if (var8 > class145.field2092) {
            short var10 = class145.field2092;
            var7 = var10 * 334 * arg3 / (arg1 * 512);
            if (class107.field1606 > var7) {
                var7 = class107.field1606;
                int var11 = arg3 * 334 * var10 / (var7 * 512);
                int var12 = (arg1 - var11) / 2;
                if (arg2) {
                    class98.field1432.method2006();
                    class98.field1432.method2222(var12, arg0, arg4, -16777216, 115, arg3);
                    class98.field1432.method2222(var12, arg0, arg1 + arg4 - var12, -16777216, 99, arg3);
                }
                arg1 -= var12 * 2;
                arg4 += var12;
            }
        }
        class148.field2111 = arg0;
        class385.field5338 = arg4;
        class422.field5730 = (short) arg3;
        class171.field2350 = arg1 * var7 / 334;
        class13.field182 = (short) arg1;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
    public static final void method1262(int arg0) {
        field2962++;
        for (class363 var1 = (class363) class78.field1054.method652((byte) 37); var1 != null; var1 = (class363) class78.field1054.method653(73)) {
            if (var1.field4977 > 0) {
                var1.field4977--;
            }
            if (var1.field4977 != 0) {
                if (var1.field4980 > 0) {
                    var1.field4980--;
                }
                if (var1.field4980 == 0 && var1.field4976 >= 1 && var1.field4978 >= 1 && class295.field3947 - 2 >= var1.field4976 && class39.field567 - 2 >= var1.field4978 && (var1.field4971 < 0 || class477.method2786(5, var1.field4971, var1.field4970))) {
                    class69.method456(var1.field4972, var1.field4976, var1.field4971, var1.field4986, var1.field4983, (byte) 122, -1, var1.field4970, var1.field4978);
                    var1.field4980 = -1;
                    if (var1.field4984 == var1.field4971 && var1.field4984 == -1) {
                        var1.method2614((byte) -116);
                    } else if (var1.field4984 == var1.field4971 && var1.field4986 == var1.field4985 && var1.field4973 == var1.field4970) {
                        var1.method2614((byte) -115);
                    }
                }
            } else if (var1.field4984 < 0 || class477.method2786(5, var1.field4984, var1.field4973)) {
                class69.method456(var1.field4972, var1.field4976, var1.field4984, var1.field4985, var1.field4983, (byte) 122, -1, var1.field4973, var1.field4978);
                var1.method2614((byte) -84);
            }
        }
        if (arg0 != 13116) {
            method1263(34);
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
    public static void method1263(int arg0) {
        if (arg0 <= -107) {
            field2964 = null;
            field2965 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lbt;I)Ljava/lang/String;")
    public static final String method1264(class32 arg0, int arg1) {
        field2961++;
        return arg1 == -16086 ? class33.method255(32767, arg0, (byte) 117) : null;
    }
}
