import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class226 extends class359 {

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public int field3084;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "[I")
    public static int[] field3080 = new int[256];

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field3082;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static void method1457(int arg0) {
        if (arg0 != 1) {
            method1457(-38);
        }
        field3080 = null;
        field3082 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(II)V")
    public class226(int arg0, int arg1) {
        this.field3081 = arg1;
        this.field3084 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3080[var0] = var1;
        }
    }
}
