import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class371 extends class435 {

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "Lvh;")
    public static class125 field5134 = new class125(67, -1);

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "[I")
    public static int[] field5144 = new int[6];

    @OriginalMember(owner = "client!rr", name = "K", descriptor = "I")
    public static int field5147 = -1;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public int field5127;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public int field5129;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public int field5130;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public int field5131;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    public int field5132;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    public int field5136;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "I")
    public int field5137;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
    public int field5138;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
    public int field5139;

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
    public int field5140;

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
    public int field5143;

    @OriginalMember(owner = "client!rr", name = "I", descriptor = "I")
    public int field5145;

    @OriginalMember(owner = "client!rr", name = "L", descriptor = "I")
    public int field5148;

    @OriginalMember(owner = "client!rr", name = "M", descriptor = "I")
    public int field5149;

    @OriginalMember(owner = "client!rr", name = "N", descriptor = "I")
    public int field5150;

    @OriginalMember(owner = "client!rr", name = "O", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!rr", name = "Q", descriptor = "I")
    public int field5153;

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "Lfm;")
    public class251 field5146;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "Law;")
    public class506 field5142;

    @OriginalMember(owner = "client!rr", name = "R", descriptor = "Llc;")
    public class652 field5154;

    @OriginalMember(owner = "client!rr", name = "P", descriptor = "Ltk;")
    public class95 field5152;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V", line = 7)
    public final void method2216(boolean arg0) {
        this.field5154 = null;
        this.field5146 = null;
        if (arg0) {
            method2218(null, (byte) -125);
        }
        this.field5142 = null;
        this.field5152 = null;
        field5133++;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(Z)V", line = 21)
    public static void method2217(boolean arg0) {
        if (arg0) {
            field5144 = null;
        }
        field5144 = null;
        field5134 = null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([SB)[S", line = 36)
    public static final short[] method2218(short[] arg0, byte arg1) {
        field5128++;
        if (arg0 == null) {
            return null;
        } else if (arg1 <= 112) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class553.method3241(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }
}
