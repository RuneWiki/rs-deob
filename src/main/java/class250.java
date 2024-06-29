import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class250 extends class280 {

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    private final int field4029;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    private final int field4040;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    private final int field4033;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    private final int field4043;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "Lck;")
    public static class119 field4032 = class298.method1987((byte) 104, "Okay");

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field4038 = 0;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Lck;")
    private static class119 field4030 = class298.method1987((byte) 94, "Free world");

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "Lck;")
    public static class119 field4036 = field4030;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field4042 = -1;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(IIIIIII)V", line = 4)
    public class250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4029 = arg0;
        this.field4040 = arg1;
        this.field4033 = arg3;
        this.field4043 = arg2;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)V", line = 27)
    public final void method528(int arg0, int arg1, int arg2) {
        field4034++;
        int var4 = this.field4029 * arg2 >> 12;
        int var5 = this.field4043 * arg2 >> 12;
        if (arg0 != 12623) {
            field4037 = 86;
        }
        int var6 = this.field4033 * arg1 >> 12;
        int var7 = this.field4040 * arg1 >> 12;
        class113.method719(var4, var7, 89, this.field4633, this.field4635, var5, this.field4634, var6);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([BIII)Lck;", line = 50)
    public static final class119 method1615(byte[] arg0, int arg1, int arg2, int arg3) {
        field4039++;
        class119 var4 = new class119();
        var4.field1838 = new byte[arg1];
        var4.field1825 = 0;
        int var5 = arg2;
        if (arg3 >= -72) {
            return (class119) null;
        }
        while (var5 < (arg1 + arg2)) {
            if (arg0[var5] != 0) {
                var4.field1838[var4.field1825++] = arg0[var5];
            }
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V", line = 84)
    public final void method530(int arg0, int arg1, int arg2) {
        field4041++;
        int var4 = this.field4029 * arg2 >> 12;
        if (arg0 == 2) {
            int var5 = this.field4043 * arg2 >> 12;
            int var6 = this.field4033 * arg1 >> 12;
            int var7 = this.field4040 * arg1 >> 12;
            class59.method438(var6, var4, false, this.field4633, var7, var5);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBI)V", line = 108)
    public final void method532(int arg0, byte arg1, int arg2) {
        int var4 = this.field4029 * arg2 >> 12;
        int var5 = this.field4043 * arg2 >> 12;
        int var6 = this.field4033 * arg0 >> 12;
        field4031++;
        int var7 = this.field4040 * arg0 >> 12;
        if (arg1 <= -71) {
            class255.method1639(var4, var6, this.field4635, this.field4634, (byte) -109, var7, var5);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 137)
    public static void method1616(int arg0) {
        field4036 = null;
        field4032 = null;
        field4030 = null;
        int var1 = 3 / ((arg0 + 54) / 49);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIBLva;Lva;)Ltb;", line = 157)
    public static final class290 method1617(int arg0, int arg1, byte arg2, class36 arg3, class36 arg4) {
        field4035++;
        if (class56.method414(arg0, arg4, false, arg1)) {
            if (arg2 != -51) {
                field4032 = (class119) null;
            }
            return class162.method1031((byte) -22, arg3.method261(-1, arg1, arg0));
        } else {
            return null;
        }
    }
}
