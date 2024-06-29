import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class288 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
    public static int[] field4608 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field4612 = 3353893;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lag;")
    public class288 field4610;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Lag;")
    public class288 field4614;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field4607;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method1967(int arg0) {
        if (arg0 != 512) {
            field4607 = null;
        }
        field4608 = null;
        field4607 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1968(int arg0, String arg1) {
        field4611++;
        if (arg1 == null) {
            return false;
        } else if (arg0 == 1792) {
            for (int var2 = 0; var2 < class47.field659; var2++) {
                if (arg1.equalsIgnoreCase(class292.field4639[var2])) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public final void method1969(byte arg0) {
        if (arg0 != 93) {
            method1968(-69, (String) null);
        }
        field4613++;
        if (this.field4614 != null) {
            this.field4614.field4610 = this.field4610;
            this.field4610.field4614 = this.field4614;
            this.field4614 = null;
            this.field4610 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)Lrg;")
    public static final class268 method1970(byte arg0, int arg1) {
        field4609++;
        class268 var2 = (class268) class43.field566.method1418((long) arg1, 0);
        if (arg0 != -43) {
            field4612 = 82;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class231.field3394.method1868(class25.method170(arg0 + 31953, arg1), class209.method1478((byte) 102, arg1), arg0 ^ 0xFFFFFFD4);
        class268 var4 = new class268();
        if (var3 != null) {
            var4.method1851(new class53(var3), 88);
        }
        class43.field566.method1421((long) arg1, var4, (byte) 113);
        return var4;
    }
}
