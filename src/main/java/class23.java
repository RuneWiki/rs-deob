import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class23 {

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "Lt;")
    public static class31 field196 = class14.method84(120, "Pub)4Bar");

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Lt;")
    public static class31 field200 = class14.method84(118, "Kebab Seller");

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "J")
    public long field197;

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "Lm;")
    public class23 field198;

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "Lm;")
    public class23 field199;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)V", line = 14)
    public final void method132(int arg0) {
        if (this.field199 == null) {
            return;
        }
        this.field199.field198 = this.field198;
        if (arg0 == 25914) {
            this.field198.field199 = this.field199;
            this.field199 = null;
            this.field198 = null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(I)V", line = 51)
    public static void method133(int arg0) {
        field196 = null;
        field200 = null;
        if (arg0 != 12670) {
            method133(51);
        }
    }
}
