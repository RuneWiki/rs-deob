import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FRLKXEIS")
public class class17 extends class45 {

    @OriginalMember(owner = "FRLKXEIS", name = "i", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "FRLKXEIS", name = "g", descriptor = "LFRLKXEIS;")
    public class17 field844;

    @OriginalMember(owner = "FRLKXEIS", name = "h", descriptor = "LFRLKXEIS;")
    public class17 field845;

    @OriginalMember(owner = "FRLKXEIS", name = "b", descriptor = "()V")
    public void method292() {
        if (this.field845 != null) {
            this.field845.field844 = this.field844;
            this.field844.field845 = this.field845;
            this.field844 = null;
            this.field845 = null;
        }
    }
}
