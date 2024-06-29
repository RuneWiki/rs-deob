import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class236 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field3624 = 0;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lpj;")
    public static class284 field3632 = new class284();

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field3635 = 2301979;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "S")
    public short field3627;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Z")
    public boolean field3620;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Z")
    public boolean field3622;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Z")
    public boolean field3626;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Z")
    public boolean field3631;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "[Lhc;")
    public static class128[] field3633;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Lvh;")
    public static final class58 method1591(int arg0, int arg1) {
        if (arg1 != 20909) {
            field3635 = 86;
        }
        class58 var2 = (class58) class249.field3868.method945((long) arg0, true);
        field3628++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class244.field3788.method1605(-128, arg0, 16);
        class58 var4 = new class58();
        if (var3 != null) {
            var4.method480(-1, new class54(var3));
        }
        class249.field3868.method941(var4, (long) arg0, -8447);
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILjk;II)V")
    public static final void method1592(int arg0, int arg1, class297 arg2, int arg3, int arg4) {
        field3625++;
        if (class283.field4336 < 3) {
            ((class289) class92.field1389).method1228(arg1, arg3, arg2.field4627, arg2.field4531, class92.field1389.field3948 / 2, class92.field1389.field3936 / 2, (int) class89.field1349, 256, arg2.field4550, arg2.field4645);
        } else {
            class72.method558(arg1, arg3, 0, arg2.field4550, arg2.field4645);
        }
        class285.field4371[arg4] = true;
        if (arg0 != 256) {
            field3634 = -20;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method1593(int arg0) {
        if (arg0 != 31447) {
            method1597(125, -120, 113, -51, (byte) 45, -128);
        }
        field3633 = null;
        field3632 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1594(int arg0, int arg1, String arg2) {
        field3623++;
        class246.field3832++;
        class59.field964.method1540(205, (byte) -2);
        class59.field964.method443(true, class37.method286(25077, arg2));
        if (arg0 != -16891) {
            field3632 = null;
        }
        class59.field964.method403(arg1, (byte) -107);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILbf;)V")
    public static final void method1595(int arg0, class281 arg1) {
        if (arg0 == 6777) {
            field3621++;
            class209.field3128 = arg1;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)J")
    public static final long method1596(int arg0, int arg1, int arg2) {
        class201 var3 = class3.field40[arg0][arg1][arg2];
        return var3 == null || var3.field3024 == null ? 0L : var3.field3024.field2583;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1597(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (class91.field1381 >= arg2 && arg5 >= class175.field2557) {
            boolean var6;
            if (arg1 < class196.field2961) {
                var6 = false;
                arg1 = class196.field2961;
            } else if (arg1 > class84.field1287) {
                var6 = false;
                arg1 = class84.field1287;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg0 < class196.field2961) {
                arg0 = class196.field2961;
                var7 = false;
            } else if (class84.field1287 < arg0) {
                var7 = false;
                arg0 = class84.field1287;
            } else {
                var7 = true;
            }
            if (class175.field2557 <= arg2) {
                class222.method1519((byte) -115, arg1, class241.field3751[arg2++], arg0, arg3);
            } else {
                arg2 = class175.field2557;
            }
            if (arg5 > class91.field1381) {
                arg5 = class91.field1381;
            } else {
                class222.method1519((byte) -114, arg1, class241.field3751[arg5--], arg0, arg3);
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg5; var8++) {
                    int[] var9 = class241.field3751[var8];
                    var9[arg1] = var9[arg0] = arg3;
                }
            } else if (var6) {
                for (int var11 = arg2; var11 <= arg5; var11++) {
                    class241.field3751[var11][arg1] = arg3;
                }
            } else if (var7) {
                for (int var10 = arg2; var10 <= arg5; var10++) {
                    class241.field3751[var10][arg0] = arg3;
                }
            }
        }
        field3629++;
        if (arg4 != 123) {
            method1595(115, (class281) null);
        }
    }
}
