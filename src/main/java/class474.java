import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class474 {

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "Lpp;")
    private class356 field6911 = new class356();

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field6910 = 0;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "Lpr;")
    public static class407 field6909 = new class407(103, 0);

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "Lpp;")
    private class356 field6917;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)Lpp;")
    public final class356 method2763(int arg0) {
        field6915++;
        class356 var2 = this.field6917;
        if (this.field6911 == var2) {
            this.field6917 = null;
            return null;
        }
        if (arg0 != -23638) {
            this.field6911 = null;
        }
        this.field6917 = var2.field4673;
        return var2;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
    public static void method2764(byte arg0) {
        field6909 = null;
        int var1 = 66 / ((arg0 - 59) / 59);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILpp;)V")
    public final void method2765(int arg0, class356 arg1) {
        if (arg1.field4675 != null) {
            arg1.method1968((byte) -116);
        }
        field6916++;
        arg1.field4675 = this.field6911.field4675;
        arg1.field4673 = this.field6911;
        arg1.field4675.field4673 = arg1;
        arg1.field4673.field4675 = arg1;
        if (arg0 != 0) {
            field6910 = -111;
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)Lpp;")
    public final class356 method2766(byte arg0) {
        if (arg0 != 82) {
            field6910 = -45;
        }
        field6918++;
        class356 var2 = this.field6911.field4673;
        if (this.field6911 == var2) {
            return null;
        } else {
            var2.method1968((byte) -120);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V")
    public final void method2767(int arg0) {
        while (true) {
            class356 var2 = this.field6911.field4673;
            if (this.field6911 == var2) {
                field6914++;
                this.field6917 = null;
                if (arg0 != 16993) {
                    this.method2765(-125, null);
                    return;
                }
                return;
            }
            var2.method1968((byte) -97);
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(B)I")
    public final int method2768(byte arg0) {
        field6912++;
        if (arg0 != -26) {
            field6908 = -59;
        }
        int var2 = 0;
        for (class356 var3 = this.field6911.field4673; var3 != this.field6911; var3 = var3.field4673) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)Lpp;")
    public final class356 method2769(int arg0) {
        field6913++;
        class356 var2 = this.field6911.field4673;
        if (this.field6911 == var2) {
            this.field6917 = null;
            return null;
        }
        this.field6917 = var2.field4673;
        if (arg0 != 0) {
            this.method2766((byte) -46);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
    public class474() {
        this.field6911.field4675 = this.field6911;
        this.field6911.field4673 = this.field6911;
    }
}
