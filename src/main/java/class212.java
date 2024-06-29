import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class212 extends class561 {

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Z")
    public volatile boolean field2732 = true;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Z")
    public static boolean field2729 = false;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Lov;")
    public static class346 field2731;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Z")
    public boolean field2728;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Z")
    public boolean field2730;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static void method1346(int arg0) {
        field2731 = null;
        if (arg0 != 1) {
            method1347(73, 80, (byte) -25, 71, -117);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBII)V")
    public static final void method1347(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 53) {
            field2731 = null;
        }
        class272.field3457.field7707 = 0;
        field2727++;
        class272.field3457.method3060(class17.field190.field3141, -25098);
        class272.field3457.method3060(arg0, -25098);
        class272.field3457.method3060(arg3, -25098);
        class272.field3457.method3042(arg1, 115);
        class272.field3457.method3042(arg4, -54);
        class552.field7731 = 0;
        class245.field3098 = 1;
        class192.field2503 = -3;
        class250.field3136 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)[B")
    public abstract byte[] method712(byte arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)I")
    public abstract int method709(byte arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqa;Llb;III)V")
    public static final void method1348(class167 arg0, class239 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class260.field3211) {
            class563 var5 = class199.field2605[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field7891 != null && var5.field7891.method64(-1)) {
                arg1.method54(0, 78, 0, arg0, class456.field6523, true, var5.field7891);
            }
        }
        if (arg4 < class260.field3211) {
            class563 var6 = class199.field2605[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field7891 != null && var6.field7891.method64(-1)) {
                arg1.method54(class456.field6523, 98, 0, arg0, 0, true, var6.field7891);
            }
        }
        if (arg3 < class260.field3211 && arg4 < class541.field7566) {
            class563 var7 = class199.field2605[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field7891 != null && var7.field7891.method64(-1)) {
                arg1.method54(class456.field6523, 87, 0, arg0, class456.field6523, true, var7.field7891);
            }
        }
        if (arg3 < class260.field3211 && arg4 > 0) {
            class563 var8 = class199.field2605[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field7891 != null && var8.field7891.method64(-1)) {
                arg1.method54(-class456.field6523, 83, 0, arg0, class456.field6523, true, var8.field7891);
            }
        }
    }
}
