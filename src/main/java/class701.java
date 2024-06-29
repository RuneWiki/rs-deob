import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class701 {

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public int field9846;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public int field9847;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public int field9849;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public int field9845;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field9844;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field9848;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "J")
    public static long field9843;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lgn;", line = 11)
    public final class701 method3956(int arg0, int arg1) {
        if (arg1 > -100) {
            return null;
        } else {
            field9844++;
            return new class701(this.field9845, arg0, this.field9849, this.field9847);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIII)V", line = 22)
    public class701(int arg0, int arg1, int arg2, int arg3) {
        this.field9846 = arg1;
        this.field9847 = arg3;
        this.field9849 = arg2;
        this.field9845 = arg0;
    }
}
