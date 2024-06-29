import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class486 {

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "B")
    public byte field6733 = 0;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "B")
    public byte field6744;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "B")
    public byte field6737;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "S")
    public short field6731;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "S")
    public short field6738;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Lwfa;")
    public static class181 field6740 = new class181();

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field6752 = 0;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
    public static int field6753 = 0;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "B")
    public byte field6727;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "B")
    public byte field6732;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "B")
    public byte field6734;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "B")
    public byte field6735;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "Lub;")
    public class20 field6751;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Lhfa;")
    public class281 field6726;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "Lwv;")
    public class32 field6743;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "Les;")
    public class348 field6748;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Lti;")
    public class404 field6728;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Lti;")
    public class404 field6729;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "Lhl;")
    public class486 field6745;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "Lal;")
    public class86 field6741;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "Lal;")
    public class86 field6750;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "S")
    public short field6749;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Z")
    public boolean field6730;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Z")
    public boolean field6736;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Z")
    public boolean field6742;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "[Lxa;")
    public static class461[] field6754;

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(III)V")
    public class486(int arg0, int arg1, int arg2) {
        this.field6737 = this.field6744 = (byte) arg0;
        this.field6731 = (short) arg2;
        this.field6738 = (short) arg1;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
    public static void method2737(boolean arg0) {
        field6754 = null;
        field6740 = null;
        if (!arg0) {
            field6752 = -79;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)V")
    public static final void method2738(byte arg0, int arg1) {
        field6746++;
        class669.field9441 = 3;
        if (arg0 == -61) {
            class351.field5051 = arg1;
            class126.field1759 = 100;
            class648.field9186 = -1;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public final void method2739(byte arg0) {
        field6747++;
        while (this.field6751 != null) {
            class20 var2 = this.field6751.field284;
            this.field6751.method103(-101);
            this.field6751 = var2;
        }
        if (arg0 != 91) {
            this.field6743 = null;
        }
        this.field6733 = 0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)I")
    public static final int method2740(int arg0, int arg1) {
        int var2 = -73 % ((43 - arg1) / 56);
        field6739++;
        return arg0 >>> 8;
    }
}
