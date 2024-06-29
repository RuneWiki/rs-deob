import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class12 {

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
    public static int field125 = 0;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V", line = 11)
    public static final void method53(int arg0) {
        if (arg0 < 14) {
            method53(12);
        }
        field124++;
        class790.method4321();
        for (int var1 = 0; var1 < 4; var1++) {
            class179.field2391[var1].method1961((byte) -36);
        }
        class493.method2749(false);
        class146.method836(0);
        class703.method3806(-29889);
        System.gc();
        class576.field7320.method937();
    }

    @OriginalMember(owner = "client!iea", name = "toString", descriptor = "()Ljava/lang/String;", line = 37)
    public final String toString() {
        field126++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZI)V", line = 45)
    public static final void method54(boolean arg0, int arg1) {
        field127++;
        if (class693.field8903 == 0) {
            class687.field8841.method3555(-122, arg1);
        } else {
            class745.field10115 = arg1;
        }
        if (!arg0) {
            method53(63);
        }
    }
}
