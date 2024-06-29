import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class221 {

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Lhf;")
    private class139 field3537 = new class139();

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field3534 = 0;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field3536 = -1;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Lhf;")
    private class139 field3541;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Lhf;")
    public final class139 method1580(int arg0) {
        field3540++;
        if (arg0 != 32) {
            return null;
        }
        class139 var2 = this.field3537.field2250;
        if (this.field3537 == var2) {
            this.field3541 = null;
            return null;
        } else {
            this.field3541 = var2.field2250;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Lhf;")
    public final class139 method1581(int arg0) {
        field3535++;
        class139 var2 = this.field3537.field2250;
        if (this.field3537 == var2) {
            return null;
        }
        var2.method986(0);
        if (arg0 < 72) {
            field3534 = 50;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)I")
    public final int method1582(int arg0) {
        field3543++;
        int var2 = arg0;
        class139 var3 = this.field3537.field2250;
        while (this.field3537 != var3) {
            var3 = var3.field2250;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Lhf;")
    public final class139 method1583(boolean arg0) {
        field3542++;
        if (arg0) {
            return null;
        }
        class139 var2 = this.field3541;
        if (this.field3537 == var2) {
            this.field3541 = null;
            return null;
        } else {
            this.field3541 = var2.field2250;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lhf;B)V")
    public final void method1584(class139 arg0, byte arg1) {
        if (arg0.field2249 != null) {
            arg0.method986(0);
        }
        arg0.field2249 = this.field3537.field2249;
        if (arg1 <= 109) {
            method1586(-31, (byte) 32);
        }
        field3539++;
        arg0.field2250 = this.field3537;
        arg0.field2249.field2250 = arg0;
        arg0.field2250.field2249 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class221() {
        this.field3537.field2250 = this.field3537;
        this.field3537.field2249 = this.field3537;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public final void method1585(byte arg0) {
        field3538++;
        while (true) {
            class139 var2 = this.field3537.field2250;
            if (this.field3537 == var2) {
                if (arg0 != -2) {
                    this.method1580(70);
                }
                this.field3541 = null;
                return;
            }
            var2.method986(arg0 ^ 0xFFFFFFFE);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)Lui;")
    public static final class235 method1586(int arg0, byte arg1) {
        field3544++;
        class235 var2 = (class235) class216.field3426.method1553((long) arg0, (byte) -96);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class28.field326.method643(arg0, 32, false);
        class235 var4 = new class235();
        if (var3 != null) {
            var4.method1666(new class152(var3), 53);
        }
        var4.method1662(-114);
        class216.field3426.method1551(var4, 0, (long) arg0);
        if (arg1 <= 70) {
            field3536 = 53;
        }
        return var4;
    }
}
