import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class class328 extends class108 {

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "Z")
    public boolean field4728;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "[Lvn;")
    public class328[] field4727;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "Liu;")
    public static class517 field4734 = new class517(7, 2);

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public int field4719;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "Lqw;")
    public class302 field4725;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "Lft;")
    public class513 field4720;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)[[I")
    public final int[][] method2040(int arg0, int arg1, int arg2) {
        field4726++;
        if (arg2 != 0) {
            this.method1((byte) 41, 75, null);
        }
        if (this.field4727[arg0].field4728) {
            int[] var4 = this.field4727[arg0].method4(arg1, 121);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4727[arg0].method7(arg1, 120);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)[I")
    public int[] method4(int arg0, int arg1) {
        int var3 = 123 % ((48 - arg1) / 56);
        field4721++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)V")
    public void method461(int arg0, int arg1, int arg2) {
        field4729++;
        int var4 = this.field4719 == 255 ? arg1 : this.field4719;
        if (this.field4728) {
            this.field4720 = new class513(var4, arg1, arg0);
        } else {
            this.field4725 = new class302(var4, arg1, arg0);
        }
        int var5 = -113 / ((35 - arg2) / 35);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public void method2(int arg0) {
        if (arg0 > -97) {
            field4734 = null;
        }
        field4735++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)I")
    public int method1892(byte arg0) {
        if (arg0 != 122) {
            this.field4728 = true;
        }
        field4722++;
        return -1;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lgp;Lgp;I)I")
    public static final int method2041(class561 arg0, class561 arg1, int arg2) {
        field4730++;
        int var3 = arg2;
        if (arg1.method3186((byte) 57, class517.field7194)) {
            var3 = arg2 + 1;
        }
        if (arg1.method3186((byte) 57, class97.field1697)) {
            var3++;
        }
        if (arg1.method3186((byte) 57, class404.field6021)) {
            var3++;
        }
        if (arg0.method3186((byte) 57, class517.field7194)) {
            var3++;
        }
        if (arg0.method3186((byte) 57, class97.field1697)) {
            var3++;
        }
        if (arg0.method3186((byte) 57, class404.field6021)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIB)[I")
    public final int[] method2042(int arg0, int arg1, byte arg2) {
        field4731++;
        if (arg2 == 119) {
            return this.field4727[arg0].field4728 ? this.field4727[arg0].method4(arg1, arg2 - 12) : this.field4727[arg0].method7(arg1, 111)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)V")
    public static void method2043(byte arg0) {
        field4734 = null;
        if (arg0 != -59) {
            method2041(null, null, 95);
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public void method456(int arg0) {
        if (this.field4728) {
            this.field4720.method2873(24115);
            this.field4720 = null;
        } else {
            this.field4725.method1890((byte) -82);
            this.field4725 = null;
        }
        if (arg0 == 7) {
            field4724++;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IZ)V")
    public class328(int arg0, boolean arg1) {
        this.field4728 = arg1;
        this.field4727 = new class328[arg0];
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)[[I")
    public int[][] method7(int arg0, int arg1) {
        int var3 = -114 / ((arg1 - 46) / 54);
        field4733++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BILco;)V")
    public void method1(byte arg0, int arg1, class268 arg2) {
        if (arg0 <= 75) {
            this.field4720 = null;
        }
        field4723++;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)I")
    public int method458(int arg0) {
        if (arg0 != 20025) {
            this.method2(46);
        }
        field4732++;
        return -1;
    }
}
