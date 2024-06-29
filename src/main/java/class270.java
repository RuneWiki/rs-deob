import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class270 {

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "Llc;")
    public static class135 field3865 = new class135("", 14);

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "Lec;")
    public static class40 field3866 = new class40(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "Lvf;")
    public static class166 field3868 = new class166();

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "[I")
    public static int[] field3870 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "[[I")
    public static int[][] field3869 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
    public static void method1631(byte arg0) {
        field3870 = null;
        if (arg0 < 45) {
            method1635(-12, (class116) null);
        }
        field3868 = null;
        field3869 = null;
        field3866 = null;
        field3865 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1632(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 - arg3 >= class75.field912 && class453.field6396 >= (arg3 + arg6) && class357.field5123 <= (arg0 - arg3) && arg0 + arg3 <= class328.field4729) {
            class127.method607(arg1, -127, arg5, arg3, arg0, arg6, arg4);
        } else {
            class172.method850((byte) 20, arg6, arg5, arg1, arg0, arg4, arg3);
        }
        if (arg2 <= 13) {
            method1634(true);
        }
        field3867++;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "([IIIII)V")
    public static final void method1633(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= 86) {
            return;
        }
        field3863++;
        arg3--;
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var11 = var10 + 1;
            arg0[var11] = arg2;
            int var12 = var11 + 1;
            arg0[var12] = arg2;
            int var13 = var12 + 1;
            arg0[var13] = arg2;
            arg3 = var13 + 1;
            arg0[arg3] = arg2;
        }
        while (var6 > arg3) {
            arg3++;
            arg0[arg3] = arg2;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V")
    public static final void method1634(boolean arg0) {
        if (arg0) {
            class293.field4356 = class159.field1901;
            class398.field5667 = class361.field5208;
        } else {
            class293.field4356 = class105.field1264;
            class398.field5667 = class443.field6329;
        }
        class346.field4937 = class293.field4356.length;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILtd;)Z")
    public static final boolean method1635(int arg0, class116 arg1) {
        field3864++;
        class415 var2 = class173.field2084.method2297(50, arg1.method16(false));
        if (var2.field5932 == -1) {
            return true;
        }
        if (arg0 > -59) {
            method1631((byte) -64);
        }
        class417 var3 = class44.field568.method1311((byte) 0, var2.field5932);
        return var3.field6005 == -1 ? true : var3.method2479(false);
    }
}
