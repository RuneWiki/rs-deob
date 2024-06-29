import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class69 {

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lraa;I)Lraa;", line = 4)
    public static final class353 method652(class353 arg0, int arg1) {
        field1069++;
        if (~arg0.field5202 != arg1) {
            return class65.method638(arg0.field5202, 1668949296);
        }
        int var2 = arg0.field5349 >>> 16;
        class84 var3 = new class84(class36.field340);
        for (class520 var4 = (class520) var3.method751((byte) 106); var4 != null; var4 = (class520) var3.method750(113)) {
            if (var4.field7511 == var2) {
                return class65.method638((int) var4.field1039, 1668949296);
            }
        }
        return null;
    }
}
