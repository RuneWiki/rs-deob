import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class643 extends class674 {

    @OriginalMember(owner = "client!gea", name = "m", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!gea", name = "n", descriptor = "I")
    public int field8612;

    @OriginalMember(owner = "client!gea", name = "o", descriptor = "I")
    public static int field8613;

    @OriginalMember(owner = "client!gea", name = "p", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!gea", name = "q", descriptor = "I")
    public int field8615;

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!gea", name = "t", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!gea", name = "w", descriptor = "I")
    public int field8621;

    @OriginalMember(owner = "client!gea", name = "x", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!gea", name = "y", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
    public int field8624;

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "J")
    public long field8620;

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "Ldp;")
    public static class375 field8616;

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(B)I", line = 3)
    public final int method2574(byte arg0) {
        if (arg0 != 2) {
            method3591(45, 89);
        }
        field8611++;
        return this.field8612;
    }

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "(Z)V", line = 15)
    public static void method3590(boolean arg0) {
        if (arg0) {
            method3592(-97L, -67, -87);
        }
        field8616 = null;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)Ljn;", line = 28)
    public static final class324 method3591(int arg0, int arg1) {
        field8614++;
        class324[] var2 = class297.method1950(3);
        if (arg1 >= -50) {
            field8616 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field4478 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)J", line = 57)
    public final long method2575(byte arg0) {
        field8622++;
        if (arg0 >= -13) {
            this.field8621 = 85;
        }
        return this.field8620;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(JII)Ljava/lang/String;", line = 72)
    public static final String method3592(long arg0, int arg1, int arg2) {
        class569.method3335(25856, arg0);
        field8623++;
        int var4 = class614.field8252.get(5);
        int var5 = class614.field8252.get(2) + 1;
        if (arg1 != -26589) {
            method3593(-43, -91, -78, -101);
        }
        int var6 = class614.field8252.get(1);
        return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)I", line = 91)
    public final int method2571(boolean arg0) {
        if (!arg0) {
            field8616 = null;
        }
        field8613++;
        return this.field8621;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)I", line = 102)
    public final int method2573(byte arg0) {
        field8618++;
        if (arg0 != -111) {
            this.method2571(false);
        }
        return this.field8615;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIII)I", line = 113)
    public static final int method3593(int arg0, int arg1, int arg2, int arg3) {
        field8617++;
        if (arg3 != 2) {
            return 71;
        } else if ((class692.field9623[arg1][arg0][arg2] & 0x8) == 0) {
            return arg1 <= 0 || (class692.field9623[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)I", line = 133)
    public final int method2572(int arg0) {
        if (arg0 != 12122) {
            this.method2574((byte) -83);
        }
        field8619++;
        return this.field8624;
    }
}
