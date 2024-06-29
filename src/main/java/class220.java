import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class220 {

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static volatile int field3626 = 0;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "Z")
    public static boolean field3627 = true;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public int field3628;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public int field3630;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public int field3632;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public int field3635;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    public int field3639;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "Lmo;")
    public static class447 field3636;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "[B")
    public byte[] field3629;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "[B")
    public byte[] field3631;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(CB)B", line = 11)
    public static final byte method1571(char arg0, byte arg1) {
        if (arg1 != -100) {
            method1571('6', (byte) 25);
        }
        field3638++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZIIIII)Z", line = 157)
    public static final boolean method1572(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0) {
            method1571((char) 65485, (byte) -26);
        }
        field3634++;
        for (int var6 = arg5; var6 <= arg4; var6++) {
            for (int var7 = arg1; var7 <= arg2; var7++) {
                if (class241.field3993[var6][var7] == arg3 && class97.field1364[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V", line = 188)
    public static void method1573(byte arg0) {
        field3636 = null;
        int var1 = 114 % ((-arg0 - 56) / 46);
    }
}
