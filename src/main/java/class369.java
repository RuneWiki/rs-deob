import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class369 {

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "Lff;")
    private class9 field4867 = new class9();

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "[[I")
    public static int[][] field4869 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4870 = "";

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "Z")
    public static boolean field4872 = false;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    public static int field4875 = 1337;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "Laca;")
    public static class618 field4864;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "Lff;")
    private class9 field4877;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "[S")
    public static short[] field4865;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 4)
    public static void method2065(int arg0) {
        if (arg0 == 6) {
            field4870 = null;
            field4865 = null;
            field4869 = null;
            field4864 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)Lff;", line = 35)
    public final class9 method2066(byte arg0) {
        field4866++;
        class9 var2 = this.field4867.field65;
        if (this.field4867 == var2) {
            this.field4877 = null;
            return null;
        } else {
            this.field4877 = var2.field65;
            return arg0 == -82 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V", line = 57)
    public final void method2067(int arg0) {
        while (true) {
            class9 var2 = this.field4867.field65;
            if (this.field4867 == var2) {
                int var3 = -47 / ((arg0 - 78) / 45);
                field4868++;
                this.field4877 = null;
                return;
            }
            var2.method48(-1);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)Lff;", line = 83)
    public final class9 method2068(boolean arg0) {
        if (!arg0) {
            field4870 = null;
        }
        field4871++;
        class9 var2 = this.field4877;
        if (this.field4867 == var2) {
            this.field4877 = null;
            return null;
        } else {
            this.field4877 = var2.field65;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(Z)I", line = 105)
    public final int method2069(boolean arg0) {
        field4873++;
        int var2 = 0;
        if (arg0) {
            for (class9 var3 = this.field4867.field65; var3 != this.field4867; var3 = var3.field65) {
                var2++;
            }
            return var2;
        } else {
            return -16;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lff;I)V", line = 130)
    public final void method2070(class9 arg0, int arg1) {
        int var3 = -2 % ((1 - arg1) / 54);
        if (arg0.field70 != null) {
            arg0.method48(-1);
        }
        field4863++;
        arg0.field65 = this.field4867;
        arg0.field70 = this.field4867.field70;
        arg0.field70.field65 = arg0;
        arg0.field65.field70 = arg0;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)Let;", line = 149)
    public static final class509 method2071(int arg0, int arg1, int arg2) {
        field4874++;
        class509 var3 = class61.method348(arg0, true);
        if (arg1 == -1) {
            return var3;
        } else if (arg2 == -20190) {
            return var3 == null || var3.field7101 == null || arg1 >= var3.field7101.length ? null : var3.field7101[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(Z)Lff;", line = 174)
    public final class9 method2072(boolean arg0) {
        field4876++;
        class9 var2 = this.field4867.field65;
        if (this.field4867 == var2) {
            return null;
        }
        if (arg0) {
            this.method2068(false);
        }
        var2.method48(-1);
        return var2;
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V", line = 195)
    public class369() {
        this.field4867.field65 = this.field4867;
        this.field4867.field70 = this.field4867;
    }
}
