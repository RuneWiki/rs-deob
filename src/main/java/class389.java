import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class389 extends class609 {

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Z")
    public static boolean field5774 = true;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "[I")
    public static int[] field5767 = new int[1000];

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field5775 = 0;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Lwg;")
    public class389 field5770;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Lwg;")
    public class389 field5773;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLmo;)Lfc;", line = 7)
    public static final class233 method2395(boolean arg0, class695 arg1) {
        field5769++;
        class233 var2 = new class233();
        if (arg0) {
            method2395(true, null);
        }
        var2.field3623 = arg1.method3847((byte) 118);
        var2.field3622 = class452.field6508.method361(-111, var2.field3623);
        return var2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 22)
    public final void method2396(int arg0) {
        field5766++;
        if (this.field5770 == null) {
            return;
        }
        this.field5770.field5773 = this.field5773;
        this.field5773.field5770 = this.field5770;
        if (arg0 == 1000) {
            this.field5770 = null;
            this.field5773 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 41)
    public static final void method2397(boolean arg0) {
        if (arg0) {
            return;
        }
        field5768++;
        if (class287.field4270.method2747(120, class328.field4859) || class97.field1532 == class58.field1112) {
            class636.method3541((byte) 111, class282.field4228);
            if (class58.field1112 != class566.field7976) {
                class315.method1987((byte) -32);
            }
        } else {
            class264.method1738(512, class312.field4619, false, class360.field5169, 11);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 64)
    public static void method2398(byte arg0) {
        int var1 = -7 % ((-arg0 - 17) / 56);
        field5767 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Ljava/lang/String;", line = 73)
    public static final String method2399(int arg0, int arg1) {
        field5771++;
        String var2 = Integer.toString(arg0);
        if (arg1 != 11) {
            field5775 = -80;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class274.field4149.method1804(7175, class512.field7203) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class274.field4151.method1804(arg1 ^ 0x1C0C, class512.field7203) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLjava/io/File;)[B", line = 103)
    public static final byte[] method2400(byte arg0, File arg1) {
        if (arg0 > -27) {
            method2397(true);
        }
        field5772++;
        return class105.method839(-738, arg1, (int) arg1.length());
    }
}
