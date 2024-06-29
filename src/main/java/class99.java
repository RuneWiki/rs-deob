import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class99 extends class592 {

    @OriginalMember(owner = "client!aaa", name = "I", descriptor = "Z")
    public static boolean field1324 = false;

    @OriginalMember(owner = "client!aaa", name = "J", descriptor = "I")
    public static int field1325 = -1;

    @OriginalMember(owner = "client!aaa", name = "F", descriptor = "J")
    public static long field1321 = 0L;

    @OriginalMember(owner = "client!aaa", name = "K", descriptor = "[Z")
    public static boolean[] field1326 = new boolean[100];

    @OriginalMember(owner = "client!aaa", name = "P", descriptor = "Ljava/lang/String;")
    public static String field1331 = null;

    @OriginalMember(owner = "client!aaa", name = "Q", descriptor = "[I")
    public static int[] field1332 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!aaa", name = "N", descriptor = "[I")
    public static int[] field1329 = new int[25];

    @OriginalMember(owner = "client!aaa", name = "C", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!aaa", name = "D", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!aaa", name = "E", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!aaa", name = "G", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!aaa", name = "H", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!aaa", name = "L", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!aaa", name = "M", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!aaa", name = "O", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIBI)V")
    public final void method551(int arg0, int arg1, byte arg2, int arg3) {
        ++field1320;
        if (arg2 != -10) {
            field1324 = false;
        }
        super.field8558 = arg3;
        super.field8550 = arg0;
        super.field8556 = arg1;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)Z")
    public static final boolean method552(int arg0, int arg1, int arg2) {
        if (arg0 <= 46) {
            method556((byte) -76);
        }
        ++field1323;
        return (arg2 & 2048) != 0;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Ltaa;ZLtaa;IIBZ)I")
    public static final int method553(class272 arg0, boolean arg1, class272 arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        ++field1322;
        int var7 = class568.method3175(arg2, arg0, 16, arg4, arg1);
        if (var7 != 0) {
            return !arg1 ? var7 : -var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class568.method3175(arg2, arg0, 16, arg3, arg6);
            int var9 = 120 % ((arg5 - 36) / 38);
            return !arg6 ? var8 : -var8;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(IIIIIF)V")
    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(II)Lrh;")
    public static final class44 method554(int arg0, int arg1) {
        ++field1319;
        class44[] var2 = class329.method2047(false);
        for (int var3 = 0; var3 < var2.length; ++var3) {
            class44 var4 = var2[var3];
            if (var4.field627 == arg0) {
                return var4;
            }
        }
        if (arg1 != -14821) {
            method555((class167) null, (class335) null, 52);
        }
        return null;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lqa;Ljg;I)I")
    public static final int method555(class167 arg0, class335 arg1, int arg2) {
        ++field1318;
        if (arg1.field4693 == arg2) {
            if (~arg1.field4683 != 0) {
                class41 var3 = arg0.field2114.method2151(true, !arg0.method195() ? arg1.field4682 : arg1.field4683);
                if (!var3.field604) {
                    return var3.field612;
                }
            }
            return arg1.field4674;
        } else {
            return arg1.field4693;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)V")
    public static void method556(byte arg0) {
        field1329 = null;
        field1326 = null;
        if (arg0 != -59) {
            method553((class272) null, false, (class272) null, -113, -96, (byte) -103, true);
        }
        field1331 = null;
        field1332 = null;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BF)V")
    public final void method557(byte arg0, float arg1) {
        if (arg0 == 106) {
            super.field8559 = arg1;
            ++field1330;
        }
    }
}
