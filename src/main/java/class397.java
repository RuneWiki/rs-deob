import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class397 {

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Lpc;")
    public class36 field5762 = new class36();

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "Lvq;")
    public static class24 field5768 = new class24(91, 3);

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "Z")
    public static boolean field5769 = false;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "Lpc;")
    private class36 field5766;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2490(boolean arg0) {
        if (!arg0) {
            method2491(-83);
        }
        field5768 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 14)
    public static final void method2491(int arg0) {
        field5767++;
        if (arg0 >= -41) {
            field5768 = null;
        }
        class106.field1432.method600(-79);
        class403.field5828.method214(7031);
        class154.field2078.method214(7031);
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)Lpc;", line = 27)
    public final class36 method2492(int arg0) {
        field5763++;
        class36 var2 = this.field5766;
        if (arg0 != 91) {
            return null;
        } else if (this.field5762 == var2) {
            this.field5766 = null;
            return null;
        } else {
            this.field5766 = var2.field510;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)Lpc;", line = 49)
    public final class36 method2493(int arg0) {
        field5761++;
        if (arg0 != 91) {
            field5768 = null;
        }
        class36 var2 = this.field5762.field510;
        if (this.field5762 == var2) {
            this.field5766 = null;
            return null;
        } else {
            this.field5766 = var2.field510;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V", line = 75)
    public final void method2494(byte arg0) {
        field5764++;
        if (arg0 <= 41) {
            this.field5766 = null;
        }
        while (true) {
            class36 var2 = this.field5762.field510;
            if (this.field5762 == var2) {
                this.field5766 = null;
                return;
            }
            var2.method332((byte) -122);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZLpc;)V", line = 97)
    public final void method2495(boolean arg0, class36 arg1) {
        field5765++;
        if (arg1.field511 != null) {
            arg1.method332((byte) -72);
        }
        arg1.field510 = this.field5762;
        arg1.field511 = this.field5762.field511;
        arg1.field511.field510 = arg1;
        if (arg0) {
            this.field5766 = null;
        }
        arg1.field510.field511 = arg1;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V", line = 124)
    public class397() {
        this.field5762.field511 = this.field5762;
        this.field5762.field510 = this.field5762;
    }
}
