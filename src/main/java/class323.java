import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class323 {

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public int field4592 = 2048;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public int field4596 = 2048;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public int field4597 = 0;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public int field4590 = 0;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Z")
    public static boolean field4589 = false;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "Ldia;")
    public static class235 field4591 = new class235("", 10);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
    public static void method1954(boolean arg0) {
        if (!arg0) {
            field4591 = null;
        }
        field4591 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lee;Z)V")
    public final void method1955(class677 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method3821((byte) -124);
            if (var3 == 0) {
                field4595++;
                if (!arg1) {
                    field4591 = null;
                    return;
                }
                return;
            }
            this.method1957(var3, -5, arg0);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IZI)I")
    public static final int method1956(int arg0, boolean arg1, int arg2) {
        field4593++;
        int var3 = class62.method537(arg2 - 1, arg0 + -1, -15800) + class62.method537(arg2 - 1, arg0 - -1, -15800) + (class62.method537(arg2 + 1, arg0 + -1, -15800) - -class62.method537(arg2 + 1, arg0 + 1, -15800));
        if (!arg1) {
            field4591 = null;
        }
        int var4 = class62.method537(arg2, arg0 - 1, -15800) - (-class62.method537(arg2, arg0 + 1, -15800) - class62.method537(arg2 - 1, arg0, -15800)) + class62.method537(arg2 + 1, arg0, -15800);
        int var5 = class62.method537(arg2, arg0, -15800);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IILee;)V")
    private final void method1957(int arg0, int arg1, class677 arg2) {
        if (arg0 == 1) {
            this.field4597 = arg2.method3821((byte) -75);
        } else if (arg0 == 2) {
            this.field4596 = arg2.method3807(-1);
        } else if (arg0 == 3) {
            this.field4592 = arg2.method3807(-1);
        } else if (arg0 == 4) {
            this.field4590 = arg2.method3771((byte) -10);
        }
        field4594++;
        if (arg1 != -5) {
            this.method1955(null, true);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method1958(int arg0, String arg1, char arg2) {
        field4588++;
        int var3 = class233.method1476(33, arg2, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var9;
            for (var9 = var6; arg2 != arg1.charAt(var9); var9++) {
            }
            var4[var5++] = arg1.substring(var6, var9);
            var6 = var9 + 1;
        }
        int var8 = -104 % ((arg0 + 46) / 41);
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
    public static final void method1959(byte arg0) {
        if (arg0 >= -111) {
            return;
        }
        for (int var1 = 0; var1 < class176.field2654; var1++) {
            int var2 = class353.method2114(class176.field2654, -429911713, class252.field3472 + var1) * class237.field3335;
            for (int var3 = 0; var3 < class237.field3335; var3++) {
                int var4 = var2 + class353.method2114(class237.field3335, -429911713, class446.field6124 + var3);
                if (class577.field7567[var4] == class595.field7749) {
                    class550.field7256[var4].method232(0, 0, class300.field4261, class296.field4227, class300.field4261 * var3, class296.field4227 * var1, true, true);
                }
            }
        }
        field4598++;
    }
}
