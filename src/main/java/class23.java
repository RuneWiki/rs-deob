import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class23 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Ljf;")
    public static class216 field291 = new class216(64);

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Z")
    public static boolean field295 = true;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/String;B)I")
    public static final int method123(int arg0, String arg1, byte arg2) {
        field293++;
        if (arg2 != -65) {
            method127((byte) -121);
        }
        return class215.method1505(arg0, -113, true, arg1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static final String method124(long arg0, boolean arg1) {
        field292++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1) {
                field291 = null;
            }
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class38.field467[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V")
    public static final void method125(int arg0, byte arg1) {
        field294++;
        class158.field2349.method1514(arg0, (byte) -55);
        if (arg1 >= -95) {
            field291 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILcd;)Lcd;")
    public abstract class64 method126(int arg0, class64 arg1);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static void method127(byte arg0) {
        if (arg0 != -101) {
            field291 = null;
        }
        field291 = null;
    }
}
