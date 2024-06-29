import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class561 {

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
    public int field7972;

    @OriginalMember(owner = "client!jaa", name = "m", descriptor = "B")
    public byte field7979;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public int field7967;

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
    public int field7974;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public int field7970;

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "I")
    public int field7977;

    @OriginalMember(owner = "client!jaa", name = "l", descriptor = "[Lcw;")
    public static class165[] field7978 = new class165[100];

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "Lpr;")
    public static class407 field7968 = new class407(34, 6);

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "Lcea;")
    public static class196 field7981 = new class196();

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!jaa", name = "n", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lgg;")
    public class159 field7969;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "Lofa;")
    public class297 field7973;

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "Lwb;")
    public class298 field7976;

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "Lbh;")
    public class34 field7975;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)[Lnaa;")
    public static final class65[] method3158(int arg0) {
        if (arg0 == 7575) {
            field7980++;
            return new class65[] { class61.field628, class61.field631, class61.field632, class61.field633, class61.field634, class61.field635, class61.field636, class61.field637, class61.field638, class61.field639, class61.field640, class61.field641, class61.field642, class61.field643 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
    public static void method3159(byte arg0) {
        field7968 = null;
        field7978 = null;
        int var1 = -127 % ((arg0 - 35) / 56);
        field7981 = null;
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(BIIIII)V")
    public class561(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7972 = arg5;
        this.field7979 = arg0;
        this.field7967 = arg2;
        this.field7974 = arg1;
        this.field7970 = arg4;
        this.field7977 = arg3;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)Z")
    public final boolean method3160(boolean arg0) {
        field7971++;
        if (arg0) {
            field7968 = null;
        }
        return this.field7979 == 2 || this.field7979 == 3;
    }
}
