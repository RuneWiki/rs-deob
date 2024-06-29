import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class281 extends class263 {

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Ljava/lang/String;")
    public String field3582;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)I", line = 3)
    public static final int method1708(int arg0, boolean arg1) {
        field3584++;
        int var2 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
        int var3 = ((var2 & 0xCCCCCCCC) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        if (!arg1) {
            method1708(-71, true);
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IZ)I", line = 22)
    public static final int method1709(int arg0, boolean arg1) {
        field3583++;
        if (class391.field5010 == null) {
            return 0;
        } else if (arg1 || class580.field7774 == null) {
            int var2 = 0;
            for (int var3 = 0; var3 < class391.field5010.length; var3++) {
                int var4 = class391.field5010[var3];
                if (class608.field8288.method1669((byte) -44, var4)) {
                    var2++;
                }
                if (class578.field7760.method1669((byte) 107, var4)) {
                    var2++;
                }
            }
            if (arg0 == 2) {
                return var2;
            } else {
                return -3;
            }
        } else {
            return class391.field5010.length * 2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 59)
    public class281() {
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 61)
    public class281(String arg0, int arg1) {
        this.field3582 = arg0;
    }
}
