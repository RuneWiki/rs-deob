import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class568 extends class623 {

    @OriginalMember(owner = "client!bu", name = "v", descriptor = "I")
    public int field7931 = 0;

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "[I")
    public static int[] field7928 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!bu", name = "w", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!bu", name = "x", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZLtn;)V")
    public final void method3197(boolean arg0, class179 arg1) {
        if (arg0) {
            field7928 = null;
        }
        while (true) {
            int var3 = arg1.method1094(255);
            if (var3 == 0) {
                field7930++;
                return;
            }
            this.method3201(var3, arg1, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V")
    public static void method3198(int arg0) {
        field7928 = null;
        int var1 = 52 / ((arg0 + 51) / 56);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZI)I")
    public static final int method3199(boolean arg0, int arg1) {
        if (arg0) {
            field7928 = null;
        }
        field7929++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BII)Z")
    public static final boolean method3200(byte arg0, int arg1, int arg2) {
        if (arg0 <= 124) {
            field7928 = null;
        }
        field7933++;
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILtn;B)V")
    private final void method3201(int arg0, class179 arg1, byte arg2) {
        if (arg2 != 93) {
            method3198(22);
        }
        if (arg0 == 2) {
            this.field7931 = arg1.method1107(false);
        }
        field7932++;
    }
}
