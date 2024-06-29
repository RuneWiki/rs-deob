import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class260 extends class622 {

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "[[Z")
    public static boolean[][] field3209 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field3214 = 1339;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Lkr;")
    public static class329 field3215;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dn", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field3216;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIBI)Z")
    public static final boolean method1551(int arg0, int arg1, byte arg2, int arg3) {
        field3210++;
        if (arg2 != -57) {
            method1554(-24, -75, true, -117, 96, -3, -23);
        }
        class246 var4 = (class246) class146.method798(arg0, arg3, arg1);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class244.method1512(arg2 + 57, var4);
        }
        class246 var6 = (class246) class49.method273(arg0, arg3, arg1, field3216 == null ? (field3216 = method1555("vaa")) : field3216);
        if (var6 != null) {
            var5 &= class244.method1512(0, var6);
        }
        class246 var7 = (class246) class380.method2313(arg0, arg3, arg1);
        if (var7 != null) {
            var5 &= class244.method1512(0, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)V")
    public static final void method1552(int arg0, byte arg1) {
        field3212++;
        if (arg1 <= -67) {
            class632 var2 = class641.method3699(-106, 4, arg0);
            var2.method3655(0);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public static void method1553(int arg0) {
        int var1 = -56 % ((arg0 + 17) / 46);
        field3209 = null;
        field3215 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZIIII)V")
    public static final void method1554(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg2) {
            method1554(14, -71, true, 61, 114, 1, 13);
        }
        class617[] var7 = class610.field8771;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class617 var9 = var7[var8];
            if (var9 != null && var9.field8891 == 2) {
                class627.method3626(arg5, arg0, arg6 >> 1, true, var9.field8892 * 2, var9.field8886, var9.field8890, arg1 >> 1, var9.field8884);
                if (class155.field2011[0] > -1 && class7.field61 % 20 < 10) {
                    class428.field5842[var9.field8888].method632(arg4 + class155.field2011[0] - 12, class155.field2011[1] - 28 + arg3);
                }
            }
        }
        field3213++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1555(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
