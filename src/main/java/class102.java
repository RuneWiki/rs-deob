import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class102 {

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Z")
    public static boolean field1282 = false;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Z")
    public static boolean field1283 = false;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lmda;")
    public class274 field1285;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILwq;)Lwq;", line = 9)
    public static final class176 method709(int arg0, class176 arg1) {
        field1286++;
        if (arg0 > -44) {
            method709(41, null);
        }
        class176 var2 = client.method2055(arg1);
        if (var2 == null) {
            var2 = arg1.field2631;
        }
        return var2;
    }
}
