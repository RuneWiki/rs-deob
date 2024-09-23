import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JJVWTXNE")
public class class30 {

    @OriginalMember(owner = "JJVWTXNE", name = "a", descriptor = "J")
    public long field984;

    @OriginalMember(owner = "JJVWTXNE", name = "b", descriptor = "LJJVWTXNE;")
    public class30 field985;

    @OriginalMember(owner = "JJVWTXNE", name = "c", descriptor = "LJJVWTXNE;")
    public class30 field986;

    @OriginalMember(owner = "JJVWTXNE", name = "d", descriptor = "Z")
    public static boolean field987;

    @OriginalMember(owner = "JJVWTXNE", name = "a", descriptor = "()V")
    public void method334() {
        if (this.field986 != null) {
            this.field986.field985 = this.field985;
            this.field985.field986 = this.field986;
            this.field985 = null;
            this.field986 = null;
        }
    }
}
