import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class393 {

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Lhg;")
    private class413 field5548 = new class413();

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "J")
    public static long field5542 = 0L;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lwq;")
    public static class92 field5547 = new class92();

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Ltq;")
    public static class376 field5553;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Lhg;")
    private class413 field5550;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Lhg;", line = 4)
    public final class413 method2506(byte arg0) {
        field5546++;
        class413 var2 = this.field5548.field5941;
        if (arg0 != -63) {
            this.field5550 = null;
        }
        if (this.field5548 == var2) {
            this.field5550 = null;
            return null;
        } else {
            this.field5550 = var2.field5941;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIII)V", line = 25)
    public static final void method2507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5545++;
        int var7 = arg1 - arg5;
        int var8 = arg3 + arg5;
        for (int var9 = arg3; var9 < var8; var9++) {
            class296.method1954(arg4, arg2, class291.field4067[var9], arg6, ~arg0);
        }
        int var10 = arg2 - arg5;
        if (arg0 != 0) {
            method2507(5, -32, -45, -20, -104, -94, 65);
        }
        for (int var11 = arg1; var11 > var7; var11--) {
            class296.method1954(arg4, arg2, class291.field4067[var11], arg6, -1);
        }
        int var12 = arg5 + arg6;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class291.field4067[var13];
            class296.method1954(arg4, var12, var14, arg6, -1);
            class296.method1954(arg4, arg2, var14, var10, arg0 - 1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 71)
    public final void method2508(int arg0) {
        field5540++;
        int var2 = 51 / ((54 - arg0) / 34);
        while (true) {
            class413 var3 = this.field5548.field5938;
            if (this.field5548 == var3) {
                this.field5550 = null;
                return;
            }
            var3.method2635(-13388);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Lhg;", line = 98)
    public final class413 method2509(byte arg0) {
        field5541++;
        if (arg0 != 51) {
            return null;
        }
        class413 var2 = this.field5548.field5938;
        if (this.field5548 == var2) {
            this.field5550 = null;
            return null;
        } else {
            this.field5550 = var2.field5938;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)I", line = 122)
    public final int method2510(int arg0) {
        field5549++;
        int var2 = arg0;
        for (class413 var3 = this.field5548.field5938; var3 != this.field5548; var3 = var3.field5938) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILhg;)V", line = 141)
    public final void method2511(int arg0, class413 arg1) {
        int var3 = 78 % ((arg0 + 62) / 53);
        if (arg1.field5941 != null) {
            arg1.method2635(-13388);
        }
        field5544++;
        arg1.field5938 = this.field5548;
        arg1.field5941 = this.field5548.field5941;
        arg1.field5941.field5938 = arg1;
        arg1.field5938.field5941 = arg1;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)Lhg;", line = 158)
    public final class413 method2512(byte arg0) {
        field5551++;
        if (arg0 != 46) {
            return null;
        }
        class413 var2 = this.field5548.field5938;
        if (this.field5548 == var2) {
            return null;
        } else {
            var2.method2635(-13388);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)V", line = 177)
    public static void method2513(byte arg0) {
        if (arg0 == -50) {
            field5547 = null;
            field5553 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 205)
    public class393() {
        this.field5548.field5938 = this.field5548;
        this.field5548.field5941 = this.field5548;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)Z", line = 215)
    public final boolean method2514(int arg0) {
        field5543++;
        if (arg0 != 0) {
            this.method2509((byte) -17);
        }
        return this.field5548.field5938 == this.field5548;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)Lhg;", line = 229)
    public final class413 method2515(int arg0) {
        field5552++;
        class413 var2 = this.field5550;
        if (this.field5548 == var2) {
            this.field5550 = null;
            return null;
        }
        if (arg0 != 0) {
            this.method2512((byte) -78);
        }
        this.field5550 = var2.field5938;
        return var2;
    }
}
