import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 extends class45 {

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "Z")
    public static boolean field697 = false;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "[I")
    public static int[] field690 = new int[32768];

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "[[I")
    public static int[][] field685 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "[S")
    public static short[] field701 = new short[500];

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "Lqe;")
    public static class168 field705 = class66.method448("(U0a )2 via: ", -128);

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field700 = 50;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "[I")
    public static int[] field694 = new int[field700];

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "[I")
    public static int[] field692 = new int[field700];

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
    public static int[] field693 = new int[field700];

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "Lqe;")
    private static class168 field704 = class66.method448("Members only world", 88);

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "[Lqe;")
    public static class168[] field688 = new class168[field700];

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "[I")
    public static int[] field689 = new int[field700];

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "[I")
    public static int[] field691 = new int[field700];

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Lqe;")
    public static class168 field687 = field704;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "[I")
    public static int[] field695 = new int[field700];

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "[I")
    public static int[] field696 = new int[field700];

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field686;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILgg;I)V")
    public static final void method356(int arg0, int arg1, class222 arg2, int arg3) {
        if (arg2.field216 == arg3 && arg3 != -1) {
            class237 var4 = class213.method1370(-1, arg3);
            int var5 = var4.field4044;
            if (var5 == 1) {
                arg2.field168 = 0;
                arg2.field189 = 0;
                arg2.field174 = 0;
                arg2.field170 = arg0;
                class122.method830(false, (byte) 109, arg2.field189, arg2.field190, arg2.field166, var4);
            }
            if (var5 == 2) {
                arg2.field168 = 0;
            }
        } else if (arg3 == -1 || arg2.field216 == -1 || class213.method1370(-1, arg3).field4043 >= class213.method1370(-1, arg2.field216).field4043) {
            arg2.field216 = arg3;
            arg2.field170 = arg0;
            arg2.field189 = 0;
            arg2.field220 = arg2.field228;
            arg2.field168 = 0;
            arg2.field174 = 0;
            if (arg2.field216 != -1) {
                class122.method830(false, (byte) 118, arg2.field189, arg2.field190, arg2.field166, class213.method1370(-1, arg2.field216));
            }
        }
        if (arg1 < 4) {
            field705 = null;
        }
        field699++;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
    public static void method357(int arg0) {
        field686 = null;
        field688 = null;
        field689 = null;
        field693 = null;
        field704 = null;
        field705 = null;
        field691 = null;
        field685 = null;
        field694 = null;
        if (arg0 != 1) {
            method357(117);
        }
        field696 = null;
        field701 = null;
        field695 = null;
        field692 = null;
        field690 = null;
        field687 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)I")
    public static final int method358(byte arg0, int arg1) {
        field702++;
        if (arg1 == 16711935) {
            return -1;
        } else if (arg0 == -7) {
            return class35.method219(28583, arg1);
        } else {
            return -12;
        }
    }
}
