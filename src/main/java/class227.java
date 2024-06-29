import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class227 {

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "B")
    public byte field3146;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    public int field3153;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "Lds;")
    public class227 field3149;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field3144 = -1;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "F")
    public static float field3158;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public int field3145;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public int field3150;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "Lmk;")
    public static class156 field3151;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "Lrk;")
    public static class427 field3137;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "[I")
    public static int[] field3138;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "[[Z")
    public static boolean[][] field3147;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 12)
    public static void method1530(int arg0) {
        field3137 = null;
        field3138 = null;
        if (arg0 == -1) {
            field3147 = null;
            field3151 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIB)V", line = 45)
    public class227(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field3146 = arg4;
        this.field3154 = arg1;
        this.field3153 = arg3;
        this.field3148 = arg2;
        this.field3152 = arg0;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIII)V", line = 58)
    public static final void method1531(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3139++;
        class450 var5 = class59.method540(8, arg3, 1000);
        var5.method2800(arg0 - 1934);
        if (arg0 != 2190) {
            field3138 = null;
        }
        var5.field6509 = arg2;
        var5.field6498 = arg1;
        var5.field6503 = arg4;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lds;I)V", line = 73)
    public class227(class227 arg0, int arg1) {
        this.field3149 = arg0;
        this.field3154 = this.field3149.field3154 + arg1;
        this.field3148 = this.field3149.field3148 + arg1;
        this.field3153 = this.field3149.field3153 + arg1;
        this.field3152 = this.field3149.field3152;
        this.field3146 = this.field3149.field3146;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lrk;B)V", line = 86)
    public static final void method1532(class427 arg0, byte arg1) {
        field3156++;
        if (arg1 <= -101) {
            class276.field3723 = arg0;
            class155.field2358 = class276.field3723.method2626(19, 34);
        }
    }
}
