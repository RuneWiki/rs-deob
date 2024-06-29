import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class37 extends class120 {

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    private int field713;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    private int field726;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    private int field712;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    private int field715;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    private int field721;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    private int field725;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    private int field720;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    private int field717;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Lrf;")
    public static class79 field714 = new class79();

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "Lfb;")
    public static class237 field723;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V", line = 5)
    public static void method288(int arg0) {
        if (arg0 != -216954932) {
            method289(104, false);
        }
        field714 = null;
        field723 = null;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 15)
    public class37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field713 = arg0;
        this.field726 = arg6;
        this.field712 = arg5;
        this.field715 = arg3;
        this.field721 = arg1;
        this.field725 = arg7;
        this.field720 = arg2;
        this.field717 = arg4;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)V", line = 35)
    public static final void method289(int arg0, boolean arg1) {
        class268.method1782(true);
        if (arg0 != -943652756) {
            return;
        }
        field724++;
        if (class38.field730 != 30 && class38.field730 != 25) {
            return;
        }
        class132.field2239++;
        if (class132.field2239 < 50 && !arg1) {
            return;
        }
        class132.field2239 = 0;
        if (!class264.field4098 && class177.field2860 != null) {
            class63.field1211++;
            class14.field263.method80(81, (byte) 118);
            try {
                class177.field2860.method611((byte) 60, 0, class14.field263.field3273, class14.field263.field3249);
                class14.field263.field3249 = 0;
            } catch (IOException var3) {
                class264.field4098 = true;
            }
        }
        class268.method1782(true);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V", line = 76)
    public final void method290(int arg0, int arg1, int arg2) {
        field718++;
        int var4 = this.field713 * arg1 >> 12;
        int var5 = this.field720 * arg1 >> 12;
        if (arg0 >= -46) {
            this.field713 = -109;
        }
        int var6 = this.field721 * arg2 >> 12;
        int var7 = this.field726 * arg1 >> 12;
        int var8 = this.field712 * arg2 >> 12;
        int var9 = this.field715 * arg2 >> 12;
        int var10 = this.field725 * arg2 >> 12;
        int var11 = this.field717 * arg1 >> 12;
        class180.method1139(var7, false, var9, var11, var4, var10, this.field2084, var8, var6, var5);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V", line = 103)
    public static final void method291(int arg0, int arg1) {
        field716++;
        class2 var2 = class212.method1433(arg1, arg0, -13802);
        var2.method16((byte) 101);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIZ)V", line = 115)
    public final void method292(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field728++;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZ)V", line = 127)
    public final void method293(int arg0, int arg1, boolean arg2) {
        field719++;
        if (arg2) {
            field723 = (class237) null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)I", line = 142)
    public static final int method294(byte arg0) {
        int var1 = -100 / ((68 - arg0) / 51);
        field722++;
        return class215.field3438 == 0 ? 0 : class141.field2335[class215.field3438].method187();
    }
}
