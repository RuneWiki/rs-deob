import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class116 {

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "Lmia;")
    public static class63 field1599 = new class63(20, 4);

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(III)I")
    public static final int method854(int arg0, int arg1, int arg2) {
        field1597++;
        if (arg2 == 224) {
            return arg0 == 1 || arg0 == 3 ? class466.field6833[arg1 & 0x3] : class742.field10408[arg1 & 0x3];
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(CI)Z")
    public static final boolean method855(char arg0, int arg1) {
        field1598++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class571.method3307(arg0, 90)) {
            return true;
        } else {
            char[] var2 = class637.field8948;
            if (arg1 != 16253) {
                field1599 = null;
            }
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class473.field6891;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V")
    public static void method856(byte arg0) {
        field1599 = null;
        if (arg0 < 50) {
            field1599 = null;
        }
    }
}
