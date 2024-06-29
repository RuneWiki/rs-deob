import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class class43 {

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[[Z")
    public static boolean[][] field658 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[I")
    public static int[] field654 = new int[13];

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field659 = 100;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Lb;")
    public static class183 field655;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lqj;ILqj;)V", line = 9)
    public static final void method310(class296 arg0, int arg1, class296 arg2) {
        class301.field4166 = arg2;
        if (arg1 >= -74) {
            field658 = null;
        }
        field660++;
        class448.field6484 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)V", line = 27)
    public static final void method311(int arg0) {
        if (arg0 != -13042) {
            return;
        }
        class393.method2559(5, 0);
        field657++;
        class143.method979(0, 5);
        class407.method2611(5, 0);
        class23.method153(5, -1);
        class403.method2598(5, 0);
        class105.method717((byte) 118, 5);
        class381.method2489(5, 128);
        class398.method2568(5, (byte) 112);
        class107.method725(5, 94);
        class214.method1374((byte) -39, 5);
        class401.method2589((byte) 112, 5);
        class153.method1032(arg0 ^ 0x32AE, 5);
        class40.method281(5, 77);
        class275.method1691(1437815908, 5);
        class414.method2655(arg0 ^ 0x32F1, 5);
        class24.method167(5, 7);
        class36.method263((byte) -9, 5);
        class64.method437((byte) 126, 5);
        class13.method76(256, 5);
        class26.method215(5, 1097);
        class152.method1029((byte) -34, 50);
        class337.method2099(5, false);
        class179.method1192(5, true);
        class411.field5967.method1254(5, 121);
        class26.field424.method1254(5, arg0 + 13004);
        class222.field2977.method1254(5, arg0 + 13021);
        class2.field21.method1254(5, 118);
        class111.field1640.method1254(5, -95);
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V", line = 66)
    public static void method312(byte arg0) {
        if (arg0 != 26) {
            field655 = null;
        }
        field654 = null;
        field658 = null;
        field655 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Lsq;", line = 83)
    public static final class97 method313(int arg0, int arg1) {
        field656++;
        class97 var2 = (class97) class357.field5038.method1246((byte) -115, (long) arg0);
        if (arg1 >= -10) {
            field653 = -43;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class427.field6137.method1920(arg0, false, 0);
        class97 var4 = new class97();
        if (var3 != null) {
            var4.method691(new class371(var3), -1);
        }
        var4.method692((byte) 87);
        class357.field5038.method1247((long) arg0, (byte) 53, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZIILaa;ILqh;)V")
    public abstract void method129(int arg0, boolean arg1, int arg2, int arg3, class281 arg4, int arg5, class43 arg6);

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
    public abstract void method135(byte arg0);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Laa;I)Lcn;")
    public abstract class300 method131(class281 arg0, int arg1);

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)Z")
    public abstract boolean method137(int arg0);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILaa;)Z")
    public abstract boolean method136(int arg0, int arg1, int arg2, class281 arg3);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Laa;Z)V")
    public abstract void method128(class281 arg0, boolean arg1);
}
