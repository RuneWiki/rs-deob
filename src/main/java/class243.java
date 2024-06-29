import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class243 {

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "B")
    public byte field3275;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Z")
    public static boolean field3267 = false;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "D")
    public static double field3265;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Ljd;")
    public class243 field3281;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Lrh;")
    public class279 field3278;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lcl;")
    public class280 field3274;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "Lcl;")
    public class280 field3277;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lgs;")
    public class48 field3272;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lkp;")
    public class516 field3269;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lkp;")
    public class516 field3270;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Lie;")
    public class6 field3280;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "S")
    public short field3271;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "S")
    public short field3273;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "S")
    public short field3276;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "S")
    public short field3279;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)[Ltja;", line = 4)
    public static final class288[] method1569(byte arg0) {
        field3266++;
        return arg0 == 43 ? new class288[] { class59.field815, class69.field963, class195.field2609, class132.field1950, class676.field9477, class600.field8162, class389.field5665, class582.field7780, class688.field9674, class686.field9644, class419.field6013, class164.field2218, class39.field628, class140.field2049, class83.field1174 } : null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 27)
    public final void method1570(int arg0) {
        while (this.field3272 != null) {
            class48 var2 = this.field3272.field726;
            this.field3272.method370(-25016);
            this.field3272 = var2;
        }
        if (arg0 == 29301) {
            field3268++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V", line = 44)
    public class243(int arg0) {
        this.field3275 = (byte) arg0;
    }
}
