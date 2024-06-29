import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class207 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Ljd;")
    public static class86 field3754 = class122.method868("overlay2", true);

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "[Ljd;")
    public static class86[] field3755 = new class86[200];

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "S")
    public static short field3761 = 32767;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "J")
    public long field3759;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Lce;")
    public class207 field3762;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lce;")
    public class207 field3765;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLbj;[Lmk;[Lei;[Lmk;[Lmk;[Lmk;)V")
    public static final void method1471(byte arg0, class151 arg1, class101[] arg2, class167[] arg3, class101[] arg4, class101[] arg5, class101[] arg6) {
        class3.field34 = arg3;
        class229.field4166 = arg4;
        field3758++;
        class159.field2983 = arg2;
        class220.field3951 = arg6;
        class188.field3338 = arg1;
        class37.field833 = arg5;
        class3.field33.method1739(true);
        int var7 = class188.field3338.method1079(-102, class113.field2154);
        if (arg0 == 62) {
            int[] var8 = class188.field3338.method1093(var7, (byte) -127);
            for (int var9 = 0; var9 < var8.length; var9++) {
                class3.field33.method1731(arg0 - 11, class9.method57(new class200(class188.field3338.method1084((byte) -127, var7, var8[var9])), (byte) -103));
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZIZLfj;IILfj;)I")
    public static final int method1472(boolean arg0, int arg1, boolean arg2, class239 arg3, int arg4, int arg5, class239 arg6) {
        if (arg4 != 1) {
            method1475(-2, -77, (byte) -37);
        }
        field3757++;
        int var7 = class214.method1518(arg0, arg6, -14233, arg1, arg3);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class214.method1518(arg2, arg6, arg4 ^ 0xFFFFC866, arg5, arg3);
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZ)I")
    public static final int method1473(int arg0, int arg1, boolean arg2) {
        field3763++;
        if (!arg2) {
            return 20;
        }
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method1474(int arg0) {
        field3755 = null;
        field3754 = null;
        int var1 = -37 % ((arg0 + 3) / 63);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIB)V")
    public static final void method1475(int arg0, int arg1, byte arg2) {
        field3764++;
        class161 var3 = class204.method1456(true, 12, arg1);
        var3.method1174(0);
        if (arg2 > -40) {
            method1475(80, -86, (byte) -70);
        }
        var3.field3027 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Z")
    public final boolean method1476(int arg0) {
        field3753++;
        if (this.field3762 == null) {
            return false;
        } else if (arg0 == 200) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
    public final void method1477(int arg0) {
        field3756++;
        if (this.field3762 == null) {
            return;
        }
        this.field3762.field3765 = this.field3765;
        this.field3765.field3762 = this.field3762;
        this.field3765 = null;
        this.field3762 = null;
        if (arg0 != 1) {
            this.field3765 = null;
        }
    }
}
