import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class326 {

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lvi;")
    public static class560 field4747 = new class560(8);

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lcb;")
    public static class318 field4748 = new class318(26, 7);

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "[I")
    public static int[] field4749 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field4750 = -50;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 3)
    public static void method2088(int arg0) {
        field4748 = null;
        field4749 = null;
        int var1 = -76 / ((-arg0 - 40) / 63);
        field4747 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)I", line = 16)
    public static final int method2089(int arg0, boolean arg1) {
        if (arg1) {
            method2088(-50);
        }
        field4746++;
        return (arg0 & 0x3F9AF) >> 11;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Z", line = 28)
    public static final boolean method2090(int arg0, int arg1, int arg2) {
        field4742++;
        if (arg1 == 0) {
            return (arg0 & 0x8000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V", line = 40)
    public static final void method2091(boolean arg0, int arg1) {
        class522.field7230 = -1;
        if (arg1 == 37) {
            class561.field7650 = 3.0F;
        } else if (arg1 == 50) {
            class561.field7650 = 4.0F;
        } else if (arg1 == 75) {
            class561.field7650 = 6.0F;
        } else if (arg1 == 100) {
            class561.field7650 = 8.0F;
        } else if (arg1 == 200) {
            class561.field7650 = 16.0F;
        }
        field4743++;
        class522.field7230 = -1;
        if (!arg0) {
            field4750 = -59;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)Z", line = 74)
    public static final boolean method2092(int arg0, int arg1, int arg2) {
        field4745++;
        if (arg2 != -1) {
            method2093((byte) 57, null);
        }
        return class654.method3621(arg0, 47, arg1) | (arg0 & 0x70000) != 0 || class528.method3000(arg0, (byte) 117, arg1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 85)
    public static final byte[] method2093(byte arg0, String arg1) {
        field4741++;
        int var2 = arg1.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (arg0 != 8) {
            return null;
        }
        if (var3 - 2 >= var2 || class637.method3472(-1, arg1.charAt(var3 - 2)) == -1) {
            var4 -= 2;
        } else if ((var3 - 1) >= var2 || class637.method3472(-1, arg1.charAt(var3 - 1)) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class569.method3210(var5, false, 0, arg1);
        return var5;
    }
}
