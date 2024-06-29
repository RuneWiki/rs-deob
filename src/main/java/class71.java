import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class71 extends class329 {

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "[[Z")
    public static boolean[][] field953 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!mea", name = "v", descriptor = "Lki;")
    public static class320 field962 = new class320();

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!mea", name = "r", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!mea", name = "u", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!mea", name = "x", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!mea", name = "A", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "J")
    public static long field966;

    @OriginalMember(owner = "client!mea", name = "y", descriptor = "Lwp;")
    public static class453 field965;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "Lkp;")
    public class507 field952;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "Lkp;")
    public class507 field954;

    @OriginalMember(owner = "client!mea", name = "t", descriptor = "Ljava/lang/String;")
    public String field960;

    @OriginalMember(owner = "client!mea", name = "s", descriptor = "Z")
    public boolean field959;

    @OriginalMember(owner = "client!mea", name = "w", descriptor = "[Ljava/lang/Object;")
    public Object[] field963;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lpl;B)V", line = 9)
    public static final void method419(class612 arg0, byte arg1) {
        class622.field8710 = arg0.method3341("p11_full", 50);
        field958++;
        class201.field2536 = arg0.method3341("p12_full", 119);
        if (arg1 <= 11) {
            field965 = null;
        }
        class413.field5162 = arg0.method3341("b12_full", -119);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method420(boolean arg0) {
        field951++;
        class277.field3470.method451((byte) 29);
        class289.field3592.method950((byte) 118);
        class520.field7094.method3700((byte) 88);
        class500.field6585.setBackground(Color.black);
        class179.field2313 = -1;
        class277.field3470 = class3.method12(class500.field6585, 10);
        class289.field3592 = class667.method3743(class500.field6585, 6611, arg0);
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(Z)V", line = 52)
    public static void method421(boolean arg0) {
        if (arg0) {
            field953 = null;
        }
        field965 = null;
        field953 = null;
        field962 = null;
    }
}
