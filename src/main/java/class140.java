import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class140 {

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public int field2041 = 8;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public int field2047 = 16777215;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Lmga;")
    public static class739 field2044 = new class739(73, 0);

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Ltja;")
    public static class288 field2049 = new class288(13, 7);

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public int field2043;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public int field2045;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Z")
    public boolean field2037;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljp;IZ)V", line = 12)
    private final void method1076(class376 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field2049 = null;
        }
        field2039++;
        if (arg1 == 1) {
            this.field2041 = arg0.method2359(-1);
        } else if (arg1 == 2) {
            this.field2037 = true;
        } else if (arg1 == 3) {
            this.field2045 = arg0.method2355(3);
            this.field2042 = arg0.method2355(3);
            this.field2040 = arg0.method2355(3);
        } else if (arg1 == 4) {
            this.field2043 = arg0.method2398(-1372747256);
        } else if (arg1 == 5) {
            this.field2046 = arg0.method2359(-1);
        } else if (arg1 == 6) {
            this.field2047 = arg0.method2373(1223262424);
            return;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjp;)V", line = 59)
    public final void method1077(byte arg0, class376 arg1) {
        field2038++;
        if (arg0 < 117) {
            return;
        }
        while (true) {
            int var3 = arg1.method2398(-1372747256);
            if (var3 == 0) {
                return;
            }
            this.method1076(arg1, var3, true);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 90)
    public static void method1078(int arg0) {
        field2049 = null;
        if (arg0 <= 2) {
            method1078(-9);
        }
        field2044 = null;
    }
}
