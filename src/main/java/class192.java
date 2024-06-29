import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class192 extends class105 {

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
    private int field3720;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "Leh;")
    public static class47 field3715 = class195.method1282((byte) -4, "Registrierter Benutzer");

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    public static int field3716 = 0;

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "Leh;")
    public static class47 field3726 = class195.method1282((byte) -4, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!vc", name = "nb", descriptor = "[I")
    public static int[] field3730 = new int[128];

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "Leh;")
    public static class47 field3724 = class195.method1282((byte) -4, "null");

    @OriginalMember(owner = "client!vc", name = "mb", descriptor = "Leh;")
    public static class47 field3729 = class195.method1282((byte) -4, "null");

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "Leh;")
    public static class47 field3722 = class195.method1282((byte) -4, " <col=ffffff>");

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!vc", name = "kb", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!vc", name = "lb", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!vc", name = "ob", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "[I")
    public static int[] field3717;

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
    private class192(int arg0) {
        super(0, true);
        this.field3720 = 4096;
        this.field3720 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1258(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class44.field882 * arg2 + class162.field3150 * arg0 >> 16;
        int var5 = class162.field3150 * arg2 - class44.field882 * arg0 >> 16;
        int var6 = class193.field3753 * arg1 + class149.field2918 * var5 >> 16;
        int var7 = class149.field2918 * arg1 - class193.field3753 * var5 >> 16;
        if (var6 >= 50 && var6 <= arg3) {
            int var8 = (var4 << 9) / var6 + class2.field24;
            int var9 = (var7 << 9) / var6 + class59.field1141;
            return var8 >= class23.field458 && var8 <= class64.field1406 && var9 >= class173.field3350 && var9 <= class196.field3819;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1259(int arg0, Component arg1) {
        arg1.removeMouseListener(class160.field3105);
        arg1.removeMouseMotionListener(class160.field3105);
        arg1.removeFocusListener(class160.field3105);
        ++field3723;
        class31.field590 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILeh;Leh;ILah;ZI)V")
    public static final void method1260(int arg0, class47 arg1, class47 arg2, int arg3, class9 arg4, boolean arg5, int arg6) {
        int var7 = arg4.method75(arg1, 31499);
        ++field3728;
        if (arg0 == 128) {
            int var8 = arg4.method77(arg2, var7, true);
            class177.method1181(arg6, var8, var7, arg4, arg5, arg3, 1);
        }
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)I")
    public static final int method1261(int arg0) {
        ++field3727;
        int var1 = class39.method335(class33.field639, class196.field3827, class98.field2086, arg0 + 20641);
        if (~(var1 - class188.field3655) > -801 && ~(class182.field3490[class196.field3827][class33.field639 >> 7][class98.field2086 >> 7] & 4) != -1) {
            return class196.field3827;
        } else {
            if (arg0 != 255) {
                field3721 = 80;
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class192() {
        this(4096);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field3720 = (arg1.method604((byte) -128) << 12) / 255;
        }
        ++field3731;
        if (arg2 != -256) {
            method1259(72, (Component) null);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIILkb;Lkb;IIJ)V")
    public static final void method1262(int arg0, int arg1, int arg2, int arg3, class92 arg4, class92 arg5, int arg6, int arg7, long arg8) {
        if (arg4 != null || arg5 != null) {
            class44 var10 = new class44();
            var10.field874 = arg8;
            var10.field887 = arg1 * 128 + 64;
            var10.field883 = arg2 * 128 + 64;
            var10.field880 = arg3;
            var10.field876 = arg4;
            var10.field878 = arg5;
            var10.field888 = arg6;
            var10.field884 = arg7;
            for (int var11 = arg0; var11 >= 0; --var11) {
                if (class173.field3351[var11][arg1][arg2] == null) {
                    class173.field3351[var11][arg1][arg2] = new class152(var11, arg1, arg2);
                }
            }
            class173.field3351[arg0][arg1][arg2].field2991 = var10;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
    public static void method1263(byte arg0) {
        field3717 = null;
        if (arg0 > -18) {
            method1262(25, 18, 60, -7, (class92) null, (class92) null, -56, 104, -35L);
        }
        field3729 = null;
        field3722 = null;
        field3724 = null;
        field3730 = null;
        field3715 = null;
        field3726 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field3725;
        int[] var3 = super.field2192.method336(-118, arg0);
        if (super.field2192.field770) {
            class128.method959(var3, 0, class149.field2928, this.field3720);
        }
        if (arg1 < 78) {
            method1259(-67, (Component) null);
        }
        return var3;
    }
}
