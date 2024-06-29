import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class182 extends class282 {

    @OriginalMember(owner = "client!im", name = "N", descriptor = "Ldh;")
    public final class170 field3143;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "Lki;")
    private final class164 field3144;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "I")
    public static int field3149 = 0;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public int field3145;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
    public int field3146;

    @OriginalMember(owner = "client!im", name = "R", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "I")
    public int field3150;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!im", name = "X", descriptor = "I")
    public int field3153;

    @OriginalMember(owner = "client!im", name = "Y", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(BIII)V", line = 18)
    public final void method1248(byte arg0, int arg1, int arg2, int arg3) {
        this.field3145 = arg3;
        int var5 = 51 % ((arg0 + 73) / 48);
        this.field3151 = arg1;
        field3154++;
        this.field3147 = arg2;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ldh;Lki;)V", line = 44)
    public class182(class170 arg0, class164 arg1) {
        this.field3143 = arg0;
        this.field3144 = arg1;
    }
}
