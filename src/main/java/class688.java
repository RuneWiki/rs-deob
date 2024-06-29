import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class688 {

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "Lo;")
    public static class208 field9595 = new class208(14, 0, 4, 1);

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "I")
    public static int field9599 = 0;

    @OriginalMember(owner = "client!dca", name = "h", descriptor = "I")
    public static int field9600 = 0;

    @OriginalMember(owner = "client!dca", name = "k", descriptor = "I")
    public static int field9603 = -1;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public static int field9593;

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "Lfs;")
    public static class607 field9602;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "[B")
    public byte[] field9598;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "[S")
    public short[] field9594;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "[S")
    public short[] field9596;

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "[S")
    public short[] field9601;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method3910(int arg0, String arg1) {
        field9593++;
        int var2 = arg1.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var2 <= (var3 - 2) || class485.method2880(false, arg1.charAt(var3 - 2)) == -1) {
            var4 -= 2;
        } else if (var3 - 1 >= var2 || class485.method2880(false, arg1.charAt(var3 - 1)) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        if (arg0 >= -84) {
            method3912(false);
        }
        class490.method2900((byte) 117, var5, 0, arg1);
        return var5;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)Lnd;")
    public static final class138 method3911(int arg0) {
        if (arg0 <= 104) {
            method3911(-76);
        }
        field9597++;
        return class254.field3765.length > class172.field2188 ? class254.field3765[class172.field2188++] : null;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Z)V")
    public static void method3912(boolean arg0) {
        if (arg0) {
            field9602 = null;
            field9595 = null;
        }
    }
}
