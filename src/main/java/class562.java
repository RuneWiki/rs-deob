import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class562 {

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    private int field7685;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "[Llj;")
    private class477[] field7691;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Llp;")
    public static class270 field7686 = new class270(1, 2, 2, 0);

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field7689 = new String[100];

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "Z")
    public static boolean field7692 = false;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "Ljj;")
    public static class398 field7693 = new class398(64, 7);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "J")
    private long field7688;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "Llj;")
    private class477 field7682;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BJ)Llj;", line = 8)
    public final class477 method3168(byte arg0, long arg1) {
        field7684++;
        if (arg0 != 26) {
            return null;
        }
        this.field7688 = arg1;
        class477 var4 = this.field7691[(int) ((long) (this.field7685 - 1) & arg1)];
        for (this.field7682 = var4.field6447; this.field7682 != var4; this.field7682 = this.field7682.field6447) {
            if (this.field7682.field6449 == arg1) {
                class477 var5 = this.field7682;
                this.field7682 = this.field7682.field6447;
                return var5;
            }
        }
        this.field7682 = null;
        return null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Lsaa;", line = 49)
    public static final class507 method3169(int arg0, int arg1) {
        field7690++;
        if (arg1 < 88) {
            method3171((byte) 83);
        }
        class507[] var2 = class173.method1152(true);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class507 var4 = var2[var3];
            if (var4.field6860 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IJLlj;)V", line = 80)
    public final void method3170(int arg0, long arg1, class477 arg2) {
        if (arg2.field6446 != null) {
            arg2.method2669(-29226);
        }
        field7687++;
        class477 var5 = this.field7691[(int) (arg1 & (long) (this.field7685 - 1))];
        arg2.field6446 = var5.field6446;
        arg2.field6447 = var5;
        if (arg0 == 0) {
            arg2.field6446.field6447 = arg2;
            arg2.field6449 = arg1;
            arg2.field6447.field6446 = arg2;
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(I)V", line = 102)
    public class562(int arg0) {
        this.field7685 = arg0;
        this.field7691 = new class477[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class477 var3 = this.field7691[var2] = new class477();
            var3.field6446 = var3;
            var3.field6447 = var3;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 127)
    public static void method3171(byte arg0) {
        field7693 = null;
        if (arg0 > -68) {
            method3169(48, 86);
        }
        field7686 = null;
        field7689 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Llj;", line = 150)
    public final class477 method3172(int arg0) {
        field7683++;
        if (this.field7682 == null) {
            return null;
        }
        class477 var2 = this.field7691[(int) (this.field7688 & (long) (this.field7685 - 1))];
        if (arg0 != 2721) {
            this.method3170(115, -124L, null);
        }
        while (this.field7682 != var2) {
            if (this.field7682.field6449 == this.field7688) {
                class477 var3 = this.field7682;
                this.field7682 = this.field7682.field6447;
                return var3;
            }
            this.field7682 = this.field7682.field6447;
        }
        this.field7682 = null;
        return null;
    }
}
