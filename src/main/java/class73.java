import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class73 extends class66 {

    @OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!gv", name = "u", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
    public static int field923 = 0;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "I")
    public static int field917 = 0;

    @OriginalMember(owner = "client!gv", name = "t", descriptor = "J")
    public static long field920 = 0L;

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!gv", name = "v", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!gv", name = "y", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!gv", name = "B", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!gv", name = "C", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!gv", name = "D", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)I", line = 5)
    public final int method738(int arg0) {
        field926++;
        return arg0 <= 39 ? 57 : this.field919 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)Z", line = 17)
    public final boolean method739(byte arg0) {
        if (arg0 != -48) {
            this.method739((byte) -112);
        }
        field929++;
        return (this.field919 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)I", line = 30)
    public final int method740(int arg0) {
        if (arg0 != -25706) {
            this.method738(21);
        }
        field928++;
        return class411.method2617(this.field919, (byte) 112);
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(I)Z", line = 45)
    public final boolean method741(int arg0) {
        field927++;
        int var2 = 30 / ((arg0 - 3) / 44);
        return (this.field919 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(II)V", line = 61)
    public class73(int arg0, int arg1) {
        this.field919 = arg0;
        this.field921 = arg1;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)Z", line = 74)
    public final boolean method742(int arg0, int arg1) {
        if (arg1 > -41) {
            field920 = -12L;
        }
        field922++;
        return (this.field919 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "(I)Z", line = 88)
    public final boolean method743(int arg0) {
        field925++;
        if (arg0 != -1) {
            this.method743(-48);
        }
        return ((this.field919 & 0x2E2EFC) >> 21) != 0;
    }
}
