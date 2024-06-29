import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class161 {

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "Lht;")
    public class544 field1891 = null;

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "[Lem;")
    private class212[] field1898 = null;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "[Lem;")
    public class212[] field1896 = null;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "Z")
    public boolean field1890;

    @OriginalMember(owner = "client!tca", name = "j", descriptor = "S")
    public static short field1899 = 32767;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "[I")
    public static int[] field1892 = new int[32];

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
    public static int field1900 = 0;

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method989(int arg0) {
        if (arg0 != 16) {
            method991(55);
        }
        field1894++;
        if (this.field1890) {
            return this.field1891 != null;
        } else {
            return this.field1896 != null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZIIII)V", line = 24)
    public static final void method990(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1893++;
        int var6 = class654.method3659(-7690, arg5, class377.field4848, class125.field1524);
        int var7 = class654.method3659(-7690, arg3, class377.field4848, class125.field1524);
        int var8 = class654.method3659(-7690, arg0, class337.field4186, class292.field3700);
        int var9 = class654.method3659(-7690, arg4, class337.field4186, class292.field3700);
        if (arg1) {
            for (int var10 = var6; var10 <= var7; var10++) {
                class390.method2223(var8, arg2, class30.field364[var10], (byte) -117, var9);
            }
        }
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V", line = 52)
    public static final void method991(int arg0) {
        class394.field5025.method1913((byte) 88);
        field1897++;
        class95.field1235 = arg0;
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lkea;)V", line = 86)
    public class161(class223 arg0) {
        this.field1890 = arg0.field2805;
        if (this.field1890 && !arg0.method360(-5, class493.field6140, class100.field1288)) {
            this.field1890 = false;
        }
        if (this.field1890 || arg0.method357(-22567, class100.field1288, class493.field6140)) {
            class381.method2188(1);
            if (this.field1890) {
                byte[] var2 = class343.method1956(class558.field6980, false, 0);
                this.field1891 = arg0.method349(128, 16, var2, (byte) 20, 128, class493.field6140);
                byte[] var3 = class343.method1956(class637.field8626, false, 0);
                arg0.method349(128, 16, var3, (byte) 20, 128, class493.field6140);
            } else {
                this.field1896 = new class212[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class346.method1997(32768, var4 * 128 * 128 * 2, -21928, class558.field6980);
                    this.field1896[var4] = arg0.method1286(128, var7, (byte) -107, true, class493.field6140, 128);
                }
                this.field1898 = new class212[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class346.method1997(32768, var5 * 128 * 2 * 128, -21928, class637.field8626);
                    this.field1898[var5] = arg0.method1286(128, var6, (byte) 106, true, class493.field6140, 128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)V", line = 78)
    public static void method992(int arg0) {
        int var1 = -89 / ((29 - arg0) / 62);
        field1892 = null;
    }
}
