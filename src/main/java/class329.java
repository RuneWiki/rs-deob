import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class329 {

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "Lsr;")
    public class135 field5150 = new class135();

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "F")
    public static float field5153 = 0.0F;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "Lne;")
    public static class172 field5152 = null;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "Llk;")
    public static class349 field5148 = new class349();

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "Lal;")
    public static class52 field5155 = new class52(64);

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "[I")
    public static int[] field5159 = new int[13];

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "Z")
    public static boolean field5158 = false;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "Lsr;")
    private class135 field5151;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Lgl;")
    public static class356 field5147;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "[Lgl;")
    public static class356[] field5157;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)Lsr;", line = 5)
    public final class135 method2179(int arg0) {
        field5154++;
        class135 var2 = this.field5151;
        if (this.field5150 == var2) {
            this.field5151 = null;
            return null;
        } else {
            this.field5151 = var2.field2114;
            return arg0 == 64 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lsr;I)V", line = 28)
    public final void method2180(class135 arg0, int arg1) {
        field5145++;
        if (arg0.field2120 != null) {
            arg0.method992(3);
        }
        arg0.field2114 = this.field5150;
        if (arg1 != 64) {
            this.field5151 = null;
        }
        arg0.field2120 = this.field5150.field2120;
        arg0.field2120.field2114 = arg0;
        arg0.field2114.field2120 = arg0;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V", line = 47)
    public static void method2181(int arg0) {
        field5157 = null;
        if (arg0 != 0) {
            return;
        }
        field5147 = null;
        field5152 = null;
        field5159 = null;
        field5155 = null;
        field5148 = null;
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)Lsr;", line = 64)
    public final class135 method2182(int arg0) {
        if (arg0 != 64) {
            this.method2184(66);
        }
        field5156++;
        class135 var2 = this.field5150.field2114;
        if (this.field5150 == var2) {
            this.field5151 = null;
            return null;
        } else {
            this.field5151 = var2.field2114;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BIIII)V", line = 93)
    public static final void method2183(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field5149++;
        if (arg0 != 106) {
            return;
        }
        if (class406.field6033 <= (arg4 - arg1) && arg4 + arg1 <= class185.field3005 && class99.field1378 <= arg3 - arg1 && class396.field5925 >= (arg1 + arg3)) {
            class258.method1783(arg3, (byte) 50, arg2, arg4, arg1);
        } else {
            class136.method995(arg2, arg4, arg1, -1, arg3);
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V", line = 114)
    public class329() {
        this.field5150.field2120 = this.field5150;
        this.field5150.field2114 = this.field5150;
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)V", line = 129)
    public final void method2184(int arg0) {
        field5146++;
        if (arg0 != 64) {
            this.field5151 = null;
        }
        while (true) {
            class135 var2 = this.field5150.field2114;
            if (this.field5150 == var2) {
                this.field5151 = null;
                return;
            }
            var2.method992(arg0 ^ 0x43);
        }
    }
}
