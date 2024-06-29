import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class390 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public int field5642;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public int field5641;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public int field5645;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public int field5640;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "J")
    public static long field5643;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lhe;", line = 3)
    public final class390 method2412(int arg0, int arg1) {
        field5644++;
        if (arg0 < 94) {
            method2413(74);
        }
        return new class390(this.field5642, arg1, this.field5645, this.field5640);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 22)
    public static final void method2413(int arg0) {
        field5646++;
        for (class119 var1 = (class119) class197.field2555.method679((byte) -86); var1 != null; var1 = (class119) class197.field2555.method681(-39)) {
            if (var1.field1607) {
                var1.method855(false);
            }
        }
        class119 var2 = (class119) class205.field2641.method679((byte) -86);
        if (arg0 != 16205) {
            return;
        }
        while (var2 != null) {
            if (var2.field1607) {
                var2.method855(false);
            }
            var2 = (class119) class205.field2641.method681(-92);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIII)V", line = 54)
    public class390(int arg0, int arg1, int arg2, int arg3) {
        this.field5642 = arg0;
        this.field5641 = arg1;
        this.field5645 = arg2;
        this.field5640 = arg3;
    }
}
