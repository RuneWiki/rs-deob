import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class481 {

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public int field6757;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public int field6759;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public int field6756;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public int field6764;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "Lje;")
    public class421 field6752;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
    public int field6765;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public int field6767;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "B")
    public byte field6766;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field6761 = 0;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "[I")
    public static int[] field6763 = new int[1000];

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "Ldfa;")
    public class175 field6760;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "Lqk;")
    public class18 field6758;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "Ldga;")
    public class218 field6753;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "Luia;")
    public class382 field6755;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "[Lrca;")
    public static class478[] field6754;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method2863(int arg0) {
        field6754 = null;
        int var1 = 97 % ((arg0 - 39) / 35);
        field6763 = null;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)Z")
    public final boolean method2864(int arg0) {
        field6762++;
        if (arg0 > -4) {
            this.field6757 = -58;
        }
        return this.field6766 == 2 || this.field6766 == 3;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(BIIIIIILje;)V")
    public class481(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class421 arg7) {
        this.field6757 = arg4;
        this.field6759 = arg6;
        this.field6756 = arg1;
        this.field6764 = arg2;
        this.field6752 = arg7;
        this.field6765 = arg3;
        this.field6767 = arg5;
        this.field6766 = arg0;
    }
}
