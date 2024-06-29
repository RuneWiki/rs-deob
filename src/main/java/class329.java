import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class329 extends class164 {

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public static int field5084 = 0;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "Ljava/lang/String;")
    public static String field5088 = "Loading interfaces - ";

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "Z")
    public static boolean field5093 = true;

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "I")
    public static int field5097 = 0;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "B")
    public byte field5090;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    public int field5096;

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "Lgn;")
    public class303 field5095;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(Z)I", line = 5)
    public final int method991(boolean arg0) {
        field5098++;
        if (!arg0) {
            method2228(56);
        }
        return this.field5095 == null ? 0 : this.field5095.field4679 * 100 / (this.field5095.field4716.length - this.field5090);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)I", line = 28)
    public static final int method2224(int arg0, int arg1) {
        field5086++;
        int var2 = -126 % ((36 - arg0) / 51);
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V", line = 39)
    public static final void method2225(int arg0) {
        class280.field4324 = null;
        if (arg0 == 100) {
            field5092++;
            class283.field4342 = null;
            class185.field2831 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 54)
    public static final boolean method2226(String arg0, int arg1) {
        field5094++;
        if (arg1 < 28) {
            method2225(-32);
        }
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class190.field2891; var2++) {
            if (arg0.equalsIgnoreCase(class317.field4978[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)V", line = 80)
    public static final void method2227(int arg0, int arg1) {
        field5091++;
        if (class177.field2713 == arg0 && arg0 != 0) {
            class145 var2 = class151.field2386[arg0];
            var2.method321(class88.field1333);
        }
        if (arg1 != -100) {
            field5084 = 122;
        }
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(I)V", line = 121)
    public static void method2228(int arg0) {
        field5088 = null;
        if (arg0 != 100) {
            field5087 = 97;
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)[B", line = 134)
    public final byte[] method992(int arg0) {
        int var2 = -118 % ((arg0 + 48) / 45);
        field5089++;
        if (this.field2528 || this.field5095.field4679 < (this.field5095.field4716.length - this.field5090)) {
            throw new RuntimeException();
        }
        return this.field5095.field4716;
    }
}
