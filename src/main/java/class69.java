import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class69 extends class446 {

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field1017 = new String[100];

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "[I")
    public static int[] field1021 = new int[2];

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "Lnq;")
    public static class268 field1020;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(CI)Z")
    public static final boolean method533(char arg0, int arg1) {
        if (arg1 <= 108) {
            return false;
        }
        field1019++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class95.field1335;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public static void method534(int arg0) {
        if (arg0 > 81) {
            field1020 = null;
            field1021 = null;
            field1017 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILep;Lms;IIBLsg;I)V")
    public static final void method535(int arg0, class241 arg1, class453 arg2, int arg3, int arg4, byte arg5, class226 arg6, int arg7) {
        field1018++;
        if (arg6 == null) {
            return;
        }
        int var8;
        if (class128.field1807 == 4) {
            var8 = (int) class333.field4599 & 0x3FFF;
        } else {
            var8 = (int) class333.field4599 + class126.field1778 & 0x3FFF;
        }
        int var9 = Math.max(arg2.field6342 / 2, arg2.field6447 / 2) + 10;
        int var10 = arg3 * arg3 + (arg4 * arg4);
        if (var10 > var9 * var9 || arg5 > -100) {
            return;
        }
        int var11 = class133.field1913[var8];
        int var12 = class133.field1908[var8];
        if (class128.field1807 != 4) {
            var11 = var11 * 256 / (class374.field5308 + 256);
            var12 = var12 * 256 / (class374.field5308 + 256);
        }
        int var13 = arg3 * var12 + arg4 * var11 >> 15;
        int var14 = arg4 * var12 - (arg3 * var11) >> 15;
        arg6.method585(arg0 + arg2.field6342 / 2 + var13 - (arg6.method597() / 2), arg2.field6447 / 2 + -var14 + arg7 - arg6.method596() / 2, arg1, arg0, arg7);
    }

    static {
        new class442((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field1022 = 0;
    }
}
