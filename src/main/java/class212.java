import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class212 extends class213 {

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Lvd;")
    private static class222 field3937 = method1357("skill)2", 10731);

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "Lvd;")
    private static class222 field3941 = method1357("Please check your message)2centre for details)3", 10731);

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "Lvd;")
    public static class222 field3934 = field3937;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "Lvd;")
    public static class222 field3939 = field3941;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public static int field3943 = -1;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "B")
    public byte field3936;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "Lve;")
    public class223 field3938;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
    public static void method1355(int arg0) {
        field3937 = null;
        field3939 = null;
        field3934 = null;
        if (arg0 <= 93) {
            field3943 = -16;
        }
        field3941 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I")
    public static final int method1356(int arg0, int arg1, int arg2) {
        field3935++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (arg2 != 16853) {
                field3939 = null;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;I)Lvd;")
    public static final class222 method1357(String arg0, int arg1) {
        field3940++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class222 var5 = new class222();
        var5.field4163 = new byte[var3];
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field4163[var5.field4121++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field4163[var5.field4121++] = (byte) var6;
            }
        }
        if (arg1 != 10731) {
            method1356(-19, 30, -27);
        }
        var5.method1430((byte) 116);
        return var5.method1413(4096);
    }
}
