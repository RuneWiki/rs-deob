import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class108 {

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1659 = 0;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1658 = 0;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[I")
    public static int[] field1657;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[[Z")
    public static boolean[][] field1656;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static final void method703(byte arg0) {
        if ((class60.field842 > class7.field106)) {
            class7.field106 = (float) ((double) class7.field106 / 30.0D + (double) class7.field106);
            if (class60.field842 < class7.field106) {
                class7.field106 = class60.field842;
            }
            class17.method117(13);
        } else if (class60.field842 < class7.field106) {
            class7.field106 = (float) ((double) class7.field106 - (double) class7.field106 / 30.0D);
            if (class7.field106 < class60.field842) {
                class7.field106 = class60.field842;
            }
            class17.method117(13);
        }
        if (class57.field804 != -1 && class94.field1463 != -1) {
            int var1 = class57.field804 - class219.field3563;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class219.field3563 += var1;
            int var2 = class94.field1463 - class158.field2435;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class94.field1463 = -1;
                class57.field804 = -1;
            }
            class158.field2435 += var2;
            class17.method117(13);
        }
        int var3 = 69 / ((-arg0 - 3) / 35);
        field1654++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;ZIZ)Z")
    public static final boolean method704(String arg0, boolean arg1, int arg2, boolean arg3) {
        field1655++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (!arg3) {
            field1656 = null;
        }
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static void method705(boolean arg0) {
        field1656 = null;
        if (!arg0) {
            field1656 = null;
        }
        field1657 = null;
    }
}
