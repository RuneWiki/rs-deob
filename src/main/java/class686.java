import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class class686 {

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "I")
    public static int field9577 = 0;

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "I")
    public static int field9576;

    @OriginalMember(owner = "client!uja", name = "c", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!uja", name = "e", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!uja", name = "d", descriptor = "[Lho;")
    public static class318[] field9579;

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(ZII)V", line = 3)
    public static final void method3905(boolean arg0, int arg1, int arg2) {
        field9580++;
        class717 var3 = class159.method1020(arg0, false, arg1);
        if (var3 != null && arg2 < -69) {
            for (int var4 = 0; var4 < var3.field9937.length; var4++) {
                var3.field9937[var4] = -1;
                var3.field9935[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(B)V", line = 33)
    public static void method3906(byte arg0) {
        field9579 = null;
        if (arg0 <= 72) {
            field9579 = null;
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(I)V", line = 45)
    public static final void method3907(int arg0) {
        class479.method2853(true);
        field9578++;
        class104.field1197 = null;
        class554.field7677 = null;
        client.field1307 = null;
        if (arg0 <= 71) {
            field9577 = -15;
        }
        class194.field2513 = null;
        class405.field5707 = null;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(ILiaa;)[I", line = 65)
    public static final int[] method3908(int arg0, class116 arg1) {
        field9576++;
        class511 var2 = new class511(arg0);
        int[] var3 = new int[4];
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method3005(arg0 ^ 0x2F9, 10);
        var2.method3003(var3[0], -23061);
        var2.method3003(var3[1], -23061);
        var2.method3003(var3[2], -23061);
        var2.method3003(var3[3], -23061);
        for (int var5 = 0; var5 < 10; var5++) {
            var2.method3003((int) (Math.random() * 9.9999999E7D), -23061);
        }
        var2.method2986((int) (Math.random() * 9.9999999E7D), -51);
        var2.method3010(class592.field8339, (byte) 95, class459.field6424);
        arg1.field1575.method2997((byte) -25, var2.field6979, 0, var2.field6962);
        return var3;
    }
}
