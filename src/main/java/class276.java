import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class276 {

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Llm;")
    private class49 field3985 = new class49();

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lwd;")
    private class179 field3987 = new class179();

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    private int field3989;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    private int field3988;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Llk;")
    private class638 field3986;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[I")
    public static int[] field3983 = new int[32];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static void method1797(boolean arg0) {
        field3983 = null;
        if (!arg0) {
            method1797(true);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(JI)V")
    public final void method1798(long arg0, int arg1) {
        field3984++;
        class49 var4 = (class49) this.field3986.method3669(false, arg0);
        if (var4 != null) {
            var4.method527(-11229);
            var4.method416(arg1 ^ 0x6E4D);
            this.field3988++;
        }
        if (arg1 != 18630) {
            this.method1798(67L, 50);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Llm;IJ)V")
    public final void method1799(class49 arg0, int arg1, long arg2) {
        field3981++;
        if (~this.field3988 == arg1) {
            class49 var5 = this.field3987.method1137((byte) 120);
            var5.method527(-11229);
            var5.method416(9867);
            if (this.field3985 == var5) {
                class49 var6 = this.field3987.method1137((byte) 99);
                var6.method527(-11229);
                var6.method416(9867);
            }
        } else {
            this.field3988--;
        }
        this.field3986.method3666((byte) 65, arg2, arg0);
        this.field3987.method1139((byte) -84, arg0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IJ)Llm;")
    public final class49 method1800(int arg0, long arg1) {
        field3980++;
        class49 var4 = (class49) this.field3986.method3669(false, arg1);
        if (arg0 == -1) {
            if (var4 != null) {
                this.field3987.method1139((byte) -84, var4);
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public final void method1801(int arg0) {
        int var2 = -5 / ((arg0 - 44) / 51);
        field3982++;
        this.field3987.method1143(-114);
        this.field3986.method3672(0);
        this.field3985 = new class49();
        this.field3988 = this.field3989;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
    public class276(int arg0) {
        this.field3989 = arg0;
        this.field3988 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3986 = new class638(var2);
    }
}
