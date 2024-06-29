import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class340 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Luc;")
    public static class27 field4338 = new class27(2, 4);

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Ljd;")
    public static class216 field4342 = new class216(8, 1);

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field4345 = 0;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field4344 = 0;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field4343 = 0;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field4346 = 0;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lpfa;")
    public static class275 field4339;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "[[B")
    public static byte[][] field4340;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1950(int arg0) {
        class208 var1 = class634.field8597;
        synchronized (class634.field8597) {
            class634.field8597.method1218(105);
            if (arg0 != 0) {
                method1951(null, null, -32, null, null, false);
            }
        }
        field4341++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;Lub;ILta;Loa;Z)V", line = 17)
    public static final void method1951(String arg0, class20 arg1, int arg2, class201 arg3, class650 arg4, boolean arg5) {
        field4337++;
        if (arg2 >= -94) {
            field4344 = -5;
        }
        if (class647.field8755 && class242.method1452(-943154398)) {
            class20 var11 = class151.field1800;
            class201 var12 = arg4.method414(var11, class558.field6984, true);
            int var13 = var11.method120((byte) 114, 250, arg0, null);
            int var14 = var11.method119(var11.field215, 250, arg0, null, 0);
            int var15 = class151.field1798.field6193;
            int var16 = var15 + 4;
            int var17 = var16 * 2 + var13;
            int var18 = var16 * 2 + var14;
            if (var17 < class315.field3948) {
                var17 = class315.field3948;
            }
            if (var18 < class457.field5702) {
                var18 = class457.field5702;
            }
            int var19 = class480.field5979.method3205(class696.field9640, -7963, var17) + class409.field5262;
            int var20 = class577.field7749.method1445(2, class634.field8596, var18) + class664.field9024;
            arg4.method402(class221.field2567, false).method2552(class379.field4871.field6193 + var19, class379.field4871.field6195 + var20, var17 - (class379.field4871.field6193 * 2), -(class379.field4871.field6195 * 2) + var18);
            arg4.method402(class379.field4871, true).method2556(var19, var20);
            class379.field4871.method2692();
            arg4.method402(class379.field4871, true).method2556(var17 + var19 - var15, var20);
            class379.field4871.method2689();
            arg4.method402(class379.field4871, true).method2556(var19 + var17 - var15, var18 + var20 + -var15);
            class379.field4871.method2692();
            arg4.method402(class379.field4871, true).method2556(var19, var20 + var18 - var15);
            class379.field4871.method2689();
            arg4.method402(class151.field1798, true).method2552(var19, class379.field4871.field6195 + var20, var15, var18 - (class379.field4871.field6195 * 2));
            class151.field1798.method2688();
            arg4.method402(class151.field1798, true).method2552(class379.field4871.field6193 + var19, var20, var17 - (class379.field4871.field6193 * 2), var15);
            class151.field1798.method2688();
            arg4.method402(class151.field1798, true).method2552(var19 + var17 - var15, class379.field4871.field6195 + var20, var15, var18 - (class379.field4871.field6195 * 2));
            class151.field1798.method2688();
            arg4.method402(class151.field1798, true).method2552(class379.field4871.field6193 + var19, var20 - -var18 - var15, var17 - (class379.field4871.field6193 * 2), var15);
            class151.field1798.method2688();
            var12.method1175(class160.field1886 | 0xFF000000, 0, arg0, var18 - (var16 * 2), 1, null, (byte) -34, var19 + var16, null, 0, var16 + var20, var17 - var16 * 2, 1, 0, -1, null);
            class434.method2390(var19, var17, var18, var20, (byte) -20);
        } else {
            int var6 = arg1.method120((byte) 122, 250, arg0, null);
            int var7 = arg1.method123(250, arg0, null, -63) * 13;
            byte var8 = 4;
            int var9 = var8 + 6;
            int var10 = var8 + 6;
            arg4.method475(var9 - var8, -var8 + var10, var6 + var8 + var8, var7 + var8 - -var8, -16777216, 0);
            arg4.method435(var9 - var8, -var8 + var10, var6 + var8 + var8, var7 + var8 + var8, -1, 0);
            arg3.method1175(-1, 0, arg0, var7, 1, null, (byte) -34, var9, null, 0, var10, var6, 1, 0, -1, null);
            class434.method2390(var9 - var8, var6 - (-var8 - var8), var7 + var8 + var8, -var8 + var10, (byte) -20);
        }
        if (arg5) {
            try {
                arg4.method318();
            } catch (class202 var21) {
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V", line = 101)
    public static void method1952(boolean arg0) {
        field4340 = null;
        field4339 = null;
        field4342 = null;
        field4338 = null;
        if (!arg0) {
            field4340 = null;
        }
    }
}
