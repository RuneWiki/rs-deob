import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class116 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field1951 = 0;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "Lmh;")
    private static class128 field1965 = class22.method156(124, "scroll:");

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lmh;")
    public static class128 field1959 = field1965;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Lmh;")
    public static class128 field1964 = class22.method156(127, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Lmh;")
    public static class128 field1950 = field1965;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "Z")
    public static boolean field1969 = true;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Lmh;")
    public static class128 field1963 = class22.method156(124, "1");

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "[I")
    public static int[] field1972 = new int[5];

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public int field1956;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public int field1958;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public int field1961;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Ldj;")
    public static class314 field1957;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field1962;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "[B")
    public byte[] field1966;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "[B")
    public byte[] field1970;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 6)
    public static final void method695(int arg0) {
        field1967++;
        if (class257.field4426[96]) {
            class143.field2443 += (-class143.field2443 - 24) / 2;
        } else if (class257.field4426[97]) {
            class143.field2443 += (24 - class143.field2443) / 2;
        } else {
            class143.field2443 /= 2;
        }
        if (class257.field4426[98]) {
            class283.field4870 += (12 - class283.field4870) / 2;
        } else if (class257.field4426[99]) {
            class283.field4870 += (-class283.field4870 - 12) / 2;
        } else {
            class283.field4870 /= 2;
        }
        class115.field1945 += class283.field4870 / 2;
        int var1 = class53.field1033 + class163.field2796.field478;
        class118.field1997 += class143.field2443 / 2;
        if (arg0 != 0) {
            method697((byte) -85);
        }
        int var2 = class215.field3788 + class163.field2796.field418;
        if (class253.field4367 - var1 < -500 || (class253.field4367 - var1) > 500 || class164.field2822 - var2 < -500 || (class164.field2822 - var2) > 500) {
            class253.field4367 = var1;
            class164.field2822 = var2;
        }
        if (class164.field2822 != var2) {
            class164.field2822 += (var2 - class164.field2822) / 16;
        }
        if (class253.field4367 != var1) {
            class253.field4367 += (var1 - class253.field4367) / 16;
        }
        class121.method736((byte) 75);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLjava/lang/Object;Z)[B", line = 57)
    public static final byte[] method696(byte arg0, Object arg1, boolean arg2) {
        field1954++;
        if (arg0 <= 7) {
            return (byte[]) null;
        } else if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg1);
            return arg2 ? class38.method259((byte) -77, var3) : var3;
        } else if ((arg1 instanceof class110)) {
            class110 var4 = (class110) arg1;
            return var4.method541(-12635);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 105)
    public static void method697(byte arg0) {
        field1964 = null;
        field1957 = null;
        field1959 = null;
        if (arg0 != -88) {
            return;
        }
        field1972 = null;
        field1963 = null;
        field1965 = null;
        field1950 = null;
        field1962 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)I", line = 122)
    public static final int method698(int arg0, int arg1, int arg2) {
        if (arg0 != -22575) {
            return 15;
        }
        field1953++;
        class245 var3 = (class245) class151.field2591.method728(false, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4184.length; var5++) {
                if (var3.field4185[var5] == arg1) {
                    var4 += var3.field4184[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Lvd;", line = 165)
    public static final class127 method699(int arg0) {
        if (arg0 == 5) {
            class127 var1 = new class127(class72.field1327, class132.field2294, class151.field2607[0], class266.field4603[0], class125.field2106[0], class178.field3128[0], class157.field2690[0], class205.field3614);
            class15.method113(65);
            field1955++;
            return var1;
        } else {
            return (class127) null;
        }
    }
}
