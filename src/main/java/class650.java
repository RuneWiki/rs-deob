import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class650 implements class307 {

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "[I")
    public static int[] field9306 = new int[8];

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "[Lhm;")
    public static class202[] field9310;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IZ)V", line = 6)
    public final void method1754(int arg0, boolean arg1) {
        class181.method1060(class412.field5471, class112.field1300, class147.field1646[class18.field149], 304, class234.field2986[class18.field149], class95.field1068[class18.field149]);
        if (arg0 <= 61) {
            method3671(-10, -39, -10);
        }
        field9311++;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V", line = 17)
    public final void method1752(int arg0) {
        if (arg0 != 13901) {
            field9306 = null;
        }
        field9309++;
        class149.method818(-1);
    }

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)V", line = 33)
    public static void method3668(int arg0) {
        field9310 = null;
        field9306 = null;
        if (arg0 != 37) {
            method3670(3, 74, -52, false, null);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILjava/lang/String;)J", line = 44)
    public static final long method3669(int arg0, String arg1) {
        field9302++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (1 - (65 - var6));
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        if (arg0 != -16514) {
            field9307 = -16;
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIZLjava/lang/String;)V", line = 87)
    public static final void method3670(int arg0, int arg1, int arg2, boolean arg3, String arg4) {
        field9308++;
        class397.method2177(false, arg1, arg4, null, arg3, arg2, 64);
        if (arg0 != -98) {
            method3670(-36, -100, 0, true, null);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(III)B", line = 104)
    public static final byte method3671(int arg0, int arg1, int arg2) {
        field9304++;
        if (arg2 == 9) {
            int var3 = -99 / ((30 - arg1) / 45);
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V", line = 125)
    public final void method1750(byte arg0) {
        if (arg0 != 39) {
            field9306 = null;
        }
        field9303++;
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)I", line = 135)
    public final int method1753(int arg0) {
        field9312++;
        if (arg0 != 26630) {
            this.method1750((byte) -59);
        }
        return 100;
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(B)Z", line = 146)
    public final boolean method1751(byte arg0) {
        if (arg0 != -29) {
            field9307 = 51;
        }
        field9305++;
        return true;
    }
}
