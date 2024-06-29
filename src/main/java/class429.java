import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class429 extends class125 {

    @OriginalMember(owner = "client!aw", name = "o", descriptor = "[I")
    public static int[] field6180 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!aw", name = "n", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!aw", name = "p", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!aw", name = "r", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!aw", name = "s", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "Lla;")
    public static class423 field6177;

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "[Ltga;")
    public static class255[] field6178;

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "[[B")
    public static byte[][] field6176;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        if (!arg0) {
            field6177 = null;
        }
        ++field6184;
        return 1;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (super.field1732 < 1 || super.field1732 > 3) {
            super.field1732 = this.method158((byte) -120);
        }
        if (!arg0) {
            field6178 = null;
        }
        ++field6179;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
    public static void method2652(int arg0) {
        field6180 = null;
        field6178 = null;
        field6177 = null;
        field6176 = null;
        if (arg0 != 104) {
            field6178 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        if (arg0 > -32) {
            this.method156(true);
        }
        super.field1732 = arg1;
        ++field6183;
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(Z)I")
    public final int method2653(boolean arg0) {
        ++field6182;
        if (arg0) {
            field6175 = -58;
        }
        return super.field1732;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BB)V")
    public static final void method2654(byte arg0, byte arg1) {
        if (class651.field9345 == null) {
            class651.field9345 = new byte[4][class184.field2546][class240.field3555];
        }
        if (arg0 != 52) {
            field6175 = 118;
        }
        ++field6174;
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var3 = 0; ~var3 > ~class184.field2546; ++var3) {
                for (int var4 = 0; var4 < class240.field3555; ++var4) {
                    class651.field9345[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lgp;)V")
    public class429(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        int var2 = -67 / ((-63 - arg0) / 49);
        ++field6181;
        return super.field1733.method3303(-1).method2046(-122) ? 3 : 2;
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(ILgp;)V")
    public class429(int arg0, class549 arg1) {
        super(arg0, arg1);
    }
}
