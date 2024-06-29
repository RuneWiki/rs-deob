import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class194 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3071 = "red:";

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "S")
    public static short field3072 = 205;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "[I")
    public static int[] field3075 = new int[1000];

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Z")
    public static boolean field3069 = false;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lgd;")
    public static class76 field3073;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I")
    public static final int method1315(int arg0, int arg1, int arg2) {
        field3074++;
        int var3 = 7 % ((arg0 - 59) / 63);
        int var4 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var4 = arg1 * var4;
            }
            arg2 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 == 1) {
            return arg1 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1316(String arg0, int arg1) {
        field3070++;
        int var2 = class140.method947(arg0, (byte) -79);
        if (arg1 != var2) {
            int[] var3 = class230.field3654.method1758(class93.field1596.field3243[var2] >> 14 & 0x3FFF, class93.field1596.field3243[var2] & 0x3FFF, (byte) -94, class93.field1596.field3243[var2] >> 28 & 0x3);
            class223.method1501(var3[2], (byte) 74, var3[1]);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1317(int arg0) {
        if (arg0 != 1332050396) {
            method1316((String) null, -50);
        }
        field3075 = null;
        field3071 = null;
        field3073 = null;
    }
}
