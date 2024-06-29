import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class431 {

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "J")
    public static long field6194 = 0L;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Z")
    public static boolean field6192;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lcs;B)V")
    public static final void method2659(class335 arg0, byte arg1) {
        field6193++;
        boolean var2 = false;
        if (class703.field9918 == arg0.field4586 || arg0.field4545 == -1 || arg0.field4535 != 0) {
            var2 = true;
        } else {
            class131 var3 = class610.field8698.method2999(arg0.field4545, false);
            if (var3.field1783 || arg0.field4551 + 1 > var3.field1812[arg0.field4605]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field4586 - arg0.field4628;
            int var5 = class703.field9918 - arg0.field4628;
            int var6 = arg0.field4582 * 512 + arg0.method2053(true) * 256;
            int var7 = arg0.field4559 * 512 + arg0.method2053(true) * 256;
            int var8 = arg0.field4580 * 512 + arg0.method2053(true) * 256;
            int var9 = arg0.field4626 * 512 + arg0.method2053(true) * 256;
            arg0.field3923 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field3916 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field4643 = 0;
        if (arg1 >= -48) {
            method2659(null, (byte) 94);
        }
        if (arg0.field4590 == 0) {
            arg0.method2061((byte) 84, 8192, false);
        }
        if (arg0.field4590 == 1) {
            arg0.method2061((byte) 110, 12288, false);
        }
        if (arg0.field4590 == 2) {
            arg0.method2061((byte) 125, 0, false);
        }
        if (arg0.field4590 == 3) {
            arg0.method2061((byte) -115, 4096, false);
        }
    }

    static {
        new class387("", 76);
    }
}
