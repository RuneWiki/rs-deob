import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class595 {

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public int field8438;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "[I")
    public int[] field8433;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "[I")
    public int[] field8439;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "S")
    public static short field8436 = 1;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Lr;")
    public static class167 field8435;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)Z")
    public static final boolean method3475(int arg0, int arg1, int arg2) {
        field8437++;
        if (arg0 == 37) {
            return (arg2 & 0x580) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I)V")
    public class595(int arg0) {
        this.field8438 = arg0;
        this.field8433 = new int[this.field8438];
        this.field8439 = new int[this.field8438];
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static void method3476(byte arg0) {
        if (arg0 > -111) {
            field8435 = null;
        }
        field8435 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method3477(int arg0, String arg1) {
        field8434++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        if (arg0 != 31485) {
            method3475(-11, 81, -90);
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }
}
