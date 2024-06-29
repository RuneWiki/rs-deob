import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class514 {

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "[Z")
    public static boolean[] field7145 = new boolean[200];

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
    public static int field7142 = 0;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field7147 = new String[100];

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "Z")
    public static boolean field7140;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIBII)V", line = 7)
    public static final void method3005(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field7144++;
        class594 var5 = class692.method3869(arg4, (byte) 105, 8);
        var5.method3378(-25490);
        var5.field8126 = arg1;
        if (arg2 < -57) {
            var5.field8124 = arg0;
            var5.field8125 = arg3;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)V", line = 34)
    public static void method3006(boolean arg0) {
        if (!arg0) {
            field7142 = -25;
        }
        field7147 = null;
        field7145 = null;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)Z", line = 45)
    public static final boolean method3007(int arg0, int arg1, int arg2) {
        if (arg0 != 12644) {
            method3005(55, -60, (byte) -29, -35, -112);
        }
        field7148++;
        return (arg2 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IBIII)I", line = 57)
    public static final int method3008(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field7143++;
        int var5 = 65536 - class255.field3695[arg3 * 8192 / arg2] >> 1;
        return arg1 == 22 ? ((65536 - var5) * arg4 >> 16) + (arg0 * var5 >> 16) : -73;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IC)Z", line = 70)
    public static final boolean method3009(int arg0, char arg1) {
        field7146++;
        if (arg0 >= -107) {
            field7145 = null;
        }
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class211.field3001;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "([[BILvaa;)V", line = 104)
    public static final void method3010(byte[][] arg0, int arg1, class469 arg2) {
        field7141++;
        int var3 = class109.field1900.length;
        if (arg1 != 65536) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class199.field2905[var4] >> 8) * 64 - class221.field3177;
                int var7 = (class199.field2905[var4] & 0xFF) * 64 - class367.field5236;
                class15.method120(false);
                arg2.method2763(var5, class19.field295, var7, class272.field3822, var6, arg1 ^ 0x1054F);
            }
        }
    }
}
