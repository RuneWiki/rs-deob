import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class325 {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Z")
    private boolean field4796 = false;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    private int field4801 = -1;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "[Ljava/lang/String;")
    private String[] field4807 = new String[0];

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    private int field4798;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "Ldl;")
    public static class57 field4809 = new class57(0, 0);

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "Lqea;")
    public static class112 field4802;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
    private final void method2041(int arg0, int arg1) {
        field4806++;
        String[] var3 = new String[this.method2043(true, arg0)];
        class476.method2794(this.field4807, 0, var3, 0, this.field4807.length);
        if (arg1 < 29) {
            this.field4801 = 105;
        }
        this.field4807 = var3;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBLpu;IZJI)V")
    public static final void method2042(int arg0, byte arg1, class522 arg2, int arg3, boolean arg4, long arg5, int arg6) {
        class6.method37(arg5, -13723, arg2, arg3, arg4, arg6, 10000, arg0);
        field4808++;
        if (arg1 >= -79) {
            field4802 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZI)I")
    private final int method2043(boolean arg0, int arg1) {
        field4804++;
        if (!arg0) {
            field4802 = null;
        }
        int var3 = this.field4807.length;
        while (arg1 >= var3) {
            if (!this.field4796) {
                var3 += this.field4798;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field4798 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILjava/lang/String;B)V")
    private final void method2044(int arg0, String arg1, byte arg2) {
        if (arg2 >= -10) {
            this.toString();
        }
        field4799++;
        if (this.field4801 < arg0) {
            this.field4801 = arg0;
        }
        if (this.field4807.length <= arg0) {
            this.method2041(arg0, 40);
        }
        this.field4807[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2045(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4805++;
        class196.field2799[class186.field2673++] = new class327(arg1, arg0, arg6, arg2, arg2, arg6, arg8, arg3, arg3, arg8, arg7, arg7, arg4, arg4);
        if (arg5 != -1) {
            method2047(64);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method2046(int arg0) {
        field4797++;
        String[] var2 = new String[this.field4801 + 1];
        class476.method2794(this.field4807, 0, var2, arg0, this.field4801 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(IZ)V")
    public class325(int arg0, boolean arg1) {
        this.field4796 = arg1;
        this.field4798 = arg0;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
    public static void method2047(int arg0) {
        field4802 = null;
        field4809 = null;
        if (arg0 >= -69) {
            method2047(-33);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2048(int arg0, String arg1) {
        field4803++;
        this.method2044(this.field4801 + arg0, arg1, (byte) -106);
    }

    @OriginalMember(owner = "client!ws", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4800++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field4801; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field4807[var2]);
        }
        var1.append("]");
        return var1.toString();
    }
}
