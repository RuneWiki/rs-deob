import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class543 {

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Z")
    public static boolean field8033 = false;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field8032;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "Lvg;")
    public static class622 field8034;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IC)Z")
    public static final boolean method3188(int arg0, char arg1) {
        field8032++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class36.method212(-28476, arg1)) {
            return true;
        } else {
            char[] var2 = class697.field9822;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class537.field7886;
            for (int var5 = arg0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public static void method3189(int arg0) {
        field8034 = null;
        if (arg0 <= 80) {
            field8033 = true;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BII)Z")
    public static final boolean method3190(byte arg0, int arg1, int arg2) {
        if (arg0 <= 88) {
            method3190((byte) -127, 38, 94);
        }
        field8031++;
        return (arg1 & 0x800) != 0;
    }
}
