import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OKDOXVFL")
public class class40 {

    @OriginalMember(owner = "OKDOXVFL", name = "a", descriptor = "J")
    public long field1190;

    @OriginalMember(owner = "OKDOXVFL", name = "b", descriptor = "LOKDOXVFL;")
    public class40 field1191;

    @OriginalMember(owner = "OKDOXVFL", name = "c", descriptor = "LOKDOXVFL;")
    public class40 field1192;

    @OriginalMember(owner = "OKDOXVFL", name = "d", descriptor = "Z")
    public static boolean field1193;

    @OriginalMember(owner = "OKDOXVFL", name = "a", descriptor = "()V")
    public void method398() {
        if (this.field1192 != null) {
            this.field1192.field1191 = this.field1191;
            this.field1191.field1192 = this.field1192;
            this.field1191 = null;
            this.field1192 = null;
        }
    }
}
