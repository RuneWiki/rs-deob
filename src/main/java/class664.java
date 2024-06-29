import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class664 extends class66 implements class291 {

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "[I")
    public static int[] field9247 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!nea", name = "q", descriptor = "I")
    public static int field9238 = 0;

    @OriginalMember(owner = "client!nea", name = "w", descriptor = "I")
    public static int field9244 = 0;

    @OriginalMember(owner = "client!nea", name = "y", descriptor = "I")
    public static int field9246 = 0;

    @OriginalMember(owner = "client!nea", name = "G", descriptor = "Lhga;")
    public static class158 field9253 = new class158(106, -2);

    @OriginalMember(owner = "client!nea", name = "I", descriptor = "Lhga;")
    public static class158 field9255 = new class158(95, 8);

    @OriginalMember(owner = "client!nea", name = "A", descriptor = "C")
    public char field9248;

    @OriginalMember(owner = "client!nea", name = "r", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!nea", name = "s", descriptor = "I")
    public int field9240;

    @OriginalMember(owner = "client!nea", name = "t", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!nea", name = "u", descriptor = "I")
    public static int field9242;

    @OriginalMember(owner = "client!nea", name = "v", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!nea", name = "x", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!nea", name = "B", descriptor = "I")
    public int field9249;

    @OriginalMember(owner = "client!nea", name = "D", descriptor = "I")
    public static int field9250;

    @OriginalMember(owner = "client!nea", name = "F", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!nea", name = "H", descriptor = "I")
    public int field9254;

    @OriginalMember(owner = "client!nea", name = "E", descriptor = "J")
    public long field9251;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(B)C", line = 8)
    public final char method2051(byte arg0) {
        if (arg0 == 104) {
            field9241++;
            return this.field9248;
        } else {
            return 'w';
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)I", line = 24)
    public final int method2050(byte arg0) {
        if (arg0 < 15) {
            field9247 = null;
        }
        field9250++;
        return this.field9249;
    }

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "(I)J", line = 39)
    public final long method2054(int arg0) {
        if (arg0 <= 7) {
            return 34L;
        } else {
            field9252++;
            return this.field9251;
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)I", line = 50)
    public final int method2053(int arg0) {
        field9245++;
        return arg0 == 4006 ? this.field9240 : -11;
    }

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "(B)V", line = 69)
    public static void method3805(byte arg0) {
        field9247 = null;
        field9253 = null;
        if (arg0 > -67) {
            method3805((byte) 92);
        }
        field9255 = null;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)I", line = 81)
    public final int method2052(int arg0) {
        if (arg0 == -28552) {
            field9242++;
            return this.field9254;
        } else {
            return 42;
        }
    }
}
