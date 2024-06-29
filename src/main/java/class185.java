import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class185 {

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field2958 = -1;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "Lab;")
    public static class269 field2963 = new class269();

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field2964 = 10;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public int field2957;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public int field2959;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "J")
    public long field2961;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Lpb;")
    public class264 field2954;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Lpb;")
    public class264 field2955;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "Lpb;")
    public class264 field2965;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
    public static final void method1294(int arg0, int arg1, int arg2) {
        field2960++;
        if (arg0 >= -34) {
            field2963 = null;
        }
        if (class210.method1477((byte) 52, arg2)) {
            class244.method1700(99, arg1, class75.field937[arg2]);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static void method1295(byte arg0) {
        field2963 = null;
        if (arg0 != -39) {
            method1297((class123) null, (byte) -43);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method1296(byte arg0, String arg1) {
        field2956++;
        long var2 = 0L;
        if (arg0 != -103) {
            return -22L;
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lwb;B)Lwb;")
    public static final class123 method1297(class123 arg0, byte arg1) {
        field2953++;
        if (arg0.field1911 != -1) {
            return class61.method358(arg0.field1911, -126);
        }
        if (arg1 <= 52) {
            field2964 = -39;
        }
        int var2 = arg0.field1844 >>> 16;
        class83 var3 = new class83(class92.field1139);
        for (class86 var4 = (class86) var3.method458(-1); var4 != null; var4 = (class86) var3.method459((byte) -72)) {
            if (var4.field1064 == var2) {
                return class61.method358((int) var4.field3923, -124);
            }
        }
        return null;
    }
}
