import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class194 implements Runnable {

    @OriginalMember(owner = "client!s", name = "p", descriptor = "[Ln;")
    public volatile class141[] field3614 = new class141[2];

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Z")
    public volatile boolean field3608 = false;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Z")
    public volatile boolean field3615 = false;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[I")
    public static int[] field3606 = new int[32];

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lmb;")
    public static class132 field3602 = class166.method1092("huffman", 119);

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[I")
    public static int[] field3607 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field3612 = 0;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field3605 = 0;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lmb;")
    public static class132 field3600 = class166.method1092(")1p", 126);

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3603 = 0;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lmb;")
    public static class132 field3610 = class166.method1092("::", 124);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Ln;")
    public static class141 field3609;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Lpb;")
    public static class165 field3613;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lhf;")
    public class83 field3604;

    @OriginalMember(owner = "client!s", name = "run", descriptor = "()V")
    public final void run() {
        this.field3615 = true;
        try {
            while (!this.field3608) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class141 var2 = this.field3614[var1];
                    if (var2 != null) {
                        var2.method951(29943);
                    }
                }
                class130.method856(1, 10L);
                class45.method304(null, this.field3604, 1);
            }
        } catch (Exception var9) {
            class92.method571(null, var9, 33);
        } finally {
            Object var6 = null;
            this.field3615 = false;
        }
        field3601++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILmb;)V")
    public static final void method1235(int arg0, class132 arg1) {
        field3611++;
        class11.field147 = arg1;
        class125.method824((byte) 117);
        if (arg0 != 0) {
            method1235(23, null);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method1236(byte arg0) {
        field3609 = null;
        field3607 = null;
        field3613 = null;
        field3610 = null;
        field3606 = null;
        field3602 = null;
        if (arg0 >= -74) {
            field3610 = null;
        }
        field3600 = null;
    }
}
