import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class620 extends class533 {

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public int field8719 = -1;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "[I")
    public static int[] field8721 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public int field8720;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Ljava/lang/String;")
    public String field8717;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "Ljava/lang/String;")
    public String field8718;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Liaa;I)Lkda;", line = 5)
    public static final class352 method3478(class452 arg0, int arg1) {
        ++field8715;
        class215 var2 = class220.method1292(58)[arg0.method2541(arg1 + -35981)];
        class278 var3 = class437.method2415(arg1 + -36167)[arg0.method2541(81)];
        if (arg1 != 36068) {
            return null;
        } else {
            int var4 = arg0.method2549((byte) 32);
            int var5 = arg0.method2549((byte) 32);
            int var6 = arg0.method2574(-1758460248);
            int var7 = arg0.method2574(-1758460248);
            int var8 = arg0.method2575((byte) -48);
            return new class352(var2, var3, var4, var5, var6, var7, var8);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V", line = 38)
    public static void method3479(byte arg0) {
        field8721 = null;
        int var1 = 51 / ((arg0 - 91) / 32);
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)Lqf;", line = 47)
    public final class623 method3480(byte arg0) {
        ++field8723;
        if (arg0 <= 70) {
            this.method3480((byte) 23);
        }
        return class385.field5152[super.field7624];
    }
}
