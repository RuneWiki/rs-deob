import jaclib.memory.heap.NativeHeap;
import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class498 extends class698 {

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7409;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "Leda;")
    public static class116 field7406 = new class116(37, -2);

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field7413 = 0;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "Ljava/applet/Applet;")
    public static Applet field7410;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(CI)C")
    public static final char method2979(char arg0, int arg1) {
        field7405++;
        if ((char) arg1 == arg0) {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V")
    public class498(int arg0) {
        this.field7409 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static void method2980(byte arg0) {
        field7406 = null;
        field7410 = null;
        int var1 = 95 % ((arg0 + 66) / 54);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)I")
    public static final int method2981(int arg0, int arg1, int arg2) {
        field7407++;
        if (arg1 != 115) {
            method2983(-31);
        }
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg0 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Z)V")
    public final void method2982(boolean arg0) {
        this.field7409.method2027();
        field7408++;
        if (!arg0) {
            field7406 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static final void method2983(int arg0) {
        int var1 = 110 % ((-arg0 - 81) / 36);
        for (int var2 = 0; var2 < 100; var2++) {
            class636.field9030[var2] = true;
        }
        field7411++;
    }
}
