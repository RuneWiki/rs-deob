import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class373 {

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public int field5126 = 16777215;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public int field5133 = 8;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "[S")
    public static short[] field5127 = new short[256];

    @OriginalMember(owner = "client!as", name = "j", descriptor = "Lrc;")
    public static class108 field5135 = new class108(98, 7);

    @OriginalMember(owner = "client!as", name = "n", descriptor = "Lhq;")
    public static class30 field5139 = new class30("", 17);

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public int field5129;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public int field5130;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public int field5131;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public int field5132;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public int field5136;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "Lgd;")
    public static class237 field5128;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "Lld;")
    public static class73 field5137;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "Z")
    public boolean field5140;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "[[I")
    public static int[][] field5141;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lkk;II)V")
    private final void method2275(class161 arg0, int arg1, int arg2) {
        if (arg1 != 8) {
            return;
        }
        field5134++;
        if (arg2 == 1) {
            this.field5133 = arg0.method1134(-16848);
        } else if (arg2 == 2) {
            this.field5140 = true;
        } else if (arg2 == 3) {
            this.field5130 = arg0.method1163(9988);
            this.field5132 = arg0.method1163(9988);
            this.field5131 = arg0.method1163(9988);
        } else if (arg2 == 4) {
            this.field5129 = arg0.method1172((byte) -112);
        } else if (arg2 == 5) {
            this.field5136 = arg0.method1134(arg1 ^ 0xFFFFBE38);
        } else if (arg2 == 6) {
            this.field5126 = arg0.method1178((byte) 63);
            return;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
    public static void method2276(byte arg0) {
        field5139 = null;
        field5137 = null;
        field5141 = null;
        field5128 = null;
        field5135 = null;
        field5127 = null;
        if (arg0 < 78) {
            method2276((byte) 51);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lkk;B)V")
    public final void method2277(class161 arg0, byte arg1) {
        if (arg1 != 18) {
            return;
        }
        field5138++;
        while (true) {
            int var3 = arg0.method1172((byte) -108);
            if (var3 == 0) {
                return;
            }
            this.method2275(arg0, 8, var3);
        }
    }
}
