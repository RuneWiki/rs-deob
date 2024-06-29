import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class368 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "B")
    public byte field4944;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public int field4945;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Z")
    public boolean field4954;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "S")
    public short field4946;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public int field4955;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public int field4947;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public int field4951;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public int field4952;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "S")
    public short field4953;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "S")
    public short field4950;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "[I")
    public static int[] field4959 = new int[5];

    @OriginalMember(owner = "client!df", name = "o", descriptor = "[I")
    public static int[] field4958 = new int[2];

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Lcr;")
    public static class531 field4949 = new class531();

    @OriginalMember(owner = "client!df", name = "n", descriptor = "F")
    public static float field4957;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 8)
    public static void method2125(byte arg0) {
        if (arg0 < 116) {
            field4949 = null;
        }
        field4949 = null;
        field4958 = null;
        field4959 = null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)[Lgfa;", line = 21)
    public static final class696[] method2126(byte arg0) {
        int var1 = 17 / ((arg0 - 49) / 39);
        field4956++;
        return new class696[] { class665.field9414, class158.field1921, class628.field8999, class40.field753, class308.field4082, class171.field2091, class99.field1337, class234.field3128, class519.field7616, class470.field6565, class170.field2071, class16.field294, class538.field7828, class705.field9976 };
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 33)
    public static final void method2127(int arg0) {
        field4948++;
        class38 var1 = null;
        try {
            class477 var2 = class517.field7570.method1505("2", -1, true);
            if (arg0 != 0) {
                return;
            }
            while (var2.field6693 == 0) {
                class151.method974((byte) -102, 1L);
            }
            if (var2.field6693 == 1) {
                var1 = (class38) var2.field6695;
                byte[] var3 = new byte[(int) var1.method445(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method440(var4, -93, var3.length - var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class81.method668(new class389(var3), -11519);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method442((byte) -72);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 93)
    public class368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field4944 = (byte) arg8;
        this.field4945 = arg3;
        this.field4954 = arg10;
        this.field4946 = (short) arg5;
        this.field4955 = arg0;
        this.field4947 = arg11;
        this.field4951 = arg1;
        this.field4952 = arg2;
        this.field4953 = (short) arg6;
        this.field4950 = (short) arg4;
    }
}
