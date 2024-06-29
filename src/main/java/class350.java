import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public abstract class class350 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4783 = new CRC32();

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 3)
    public static void method2119(int arg0) {
        field4783 = null;
        if (arg0 >= -106) {
            method2119(-125);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILpd;)Lpd;")
    public abstract class216 method2120(int arg0, class216 arg1);
}
