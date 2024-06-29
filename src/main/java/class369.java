import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class369 {

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public int field4973;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public int field4978;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "B")
    public byte field4985;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public int field4976;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    private int field4971;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field4967 = 0;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "F")
    public static float field4972;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public int field4969;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public int field4970;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public int field4975;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public int field4977;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public int field4979;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public int field4981;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public int field4982;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public int field4983;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "Lns;")
    public class369 field4984;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lac;I)Lss;")
    public static final class396 method2130(class501 arg0, int arg1) {
        field4968++;
        if (arg1 != -19935) {
            method2130(null, 47);
        }
        class497 var2 = class248.method1532(arg0, 91);
        int var3 = arg0.method2840(false);
        int var4 = arg0.method2840(false);
        int var5 = arg0.method2845(arg1 + 19934);
        return new class396(var2.field6762, var2.field6763, var2.field6765, var2.field6754, var2.field6764, var2.field6757, var2.field6760, var2.field6759, var2.field6758, var3, var4, var5);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Ldf;")
    public final class366 method2131(int arg0) {
        if (arg0 == 32745) {
            field4974++;
            return class412.method2395((byte) -28, this.field4971);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIII)Lns;")
    public final class369 method2132(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            field4966++;
            return new class369(this.field4971, arg3, arg1, arg0, this.field4985);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(IIIIB)V")
    public class369(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4973 = arg1;
        this.field4978 = arg2;
        this.field4985 = arg4;
        this.field4976 = arg3;
        this.field4971 = arg0;
    }
}
