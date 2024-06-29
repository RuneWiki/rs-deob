import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class178 extends class488 {

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Liba;")
    public class531 field2754;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Z")
    public static boolean field2755 = false;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lwh;II[B)V")
    public class178(class148 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2754 = class479.method2883(arg2, arg1, 6406, arg0, arg3, 497309962, false, 6406);
        this.field2754.method636(false, 10497, false);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILsca;)Lsca;")
    public static final class46 method1261(int arg0, class46 arg1) {
        field2753++;
        if (arg1.field557 != -1) {
            return class405.method2580(arg1.field557, -109);
        }
        if (arg0 < 80) {
            field2755 = false;
        }
        int var2 = arg1.field610 >>> 16;
        class270 var3 = new class270(class291.field4168);
        for (class421 var4 = (class421) var3.method1721(0); var4 != null; var4 = (class421) var3.method1723(true)) {
            if (var4.field6282 == var2) {
                return class405.method2580((int) var4.field2810, -77);
            }
        }
        return null;
    }
}
