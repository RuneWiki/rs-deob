import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class84 {

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "Lgq;")
    public static class418 field1204 = new class418(128);

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "[[I")
    public static int[][] field1205 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field1210 = -1;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "[I")
    public static int[] field1206;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method603(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1209++;
        class72 var5 = (class72) class8.field145.method384((long) arg3, true);
        if (var5 == null) {
            var5 = new class72();
            class8.field145.method381(true, var5, (long) arg3);
        }
        if (var5.field1038.length <= arg1) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field1038.length; var8++) {
                var6[var8] = var5.field1038[var8];
                var7[var8] = var5.field1040[var8];
            }
            for (int var9 = var5.field1038.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1040 = var7;
            var5.field1038 = var6;
        }
        var5.field1038[arg1] = arg2;
        if (arg4 != -8127) {
            field1205 = null;
        }
        var5.field1040[arg1] = arg0;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V", line = 56)
    public static final void method604(int arg0) {
        class368 var1 = class30.field430;
        synchronized (class30.field430) {
            class129.field1788 = class271.field3936;
            class39.field541++;
            class124.field1728 = class423.field6235;
            class323.field4747 = class312.field4572;
            class252.field3464 = class99.field1388;
            class319.field4668 = class323.field4738;
            class32.field453 = class26.field364;
            class278.field4047 = class215.field2864;
            class99.field1388 = 0;
        }
        if (arg0 > -18) {
            method605(false);
        }
        field1207++;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V", line = 83)
    public static void method605(boolean arg0) {
        field1204 = null;
        field1205 = null;
        field1206 = null;
        if (arg0) {
            field1210 = 64;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Lgs;", line = 100)
    public static final class40 method606(int arg0, int arg1) {
        field1208++;
        class189 var2 = class263.field3816;
        class40 var4;
        synchronized (class263.field3816) {
            int var3 = -100 % ((arg1 + 45) / 49);
            var4 = (class40) class263.field3816.method1137((long) arg0, 2108653711);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = class188.field2527.method2261(arg0, 3, 105);
        class40 var6 = new class40();
        if (var5 != null) {
            var6.method290(new class228(var5), (byte) -89);
        }
        class189 var7 = class263.field3816;
        synchronized (class263.field3816) {
            class263.field3816.method1144((long) arg0, var6, -3480);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)V", line = 138)
    public static final void method607(boolean arg0, int arg1) {
        field1203++;
        class263 var2 = class47.method337(2, 0, arg1);
        var2.method1806(arg0);
    }
}
