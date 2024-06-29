import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class128 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lid;")
    private static class60 field2917 = class11.method72("Too many connections from your address)3", (byte) 109);

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lid;")
    public static class60 field2924 = field2917;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lid;")
    public static class60 field2922 = class11.method72("<)4col> x", (byte) -31);

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lid;")
    public static class60 field2926 = class11.method72("0(U", (byte) -44);

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2921 = 0;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lid;")
    private static class60 field2932 = class11.method72("go back to the main RuneScape webpage", (byte) 121);

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lid;")
    public static class60 field2927 = field2932;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field2933 = 0;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lid;")
    public static class60 field2934 = class11.method72("Abbrechen", (byte) -127);

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Lid;")
    public static class60 field2936 = class11.method72(" (X", (byte) 97);

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "J")
    public static long field2925;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "J")
    public long field2929;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lsc;")
    public class128 field2918;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lsc;")
    public class128 field2920;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BJ)V")
    public static final void method1007(byte arg0, long arg1) {
        field2923++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class39.method306((byte) 107, arg1 - 1L);
            class39.method306((byte) 111, 1L);
        } else {
            class39.method306((byte) 96, arg1);
        }
        if (arg0 <= 65) {
            method1008(60);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1008(int arg0) {
        field2926 = null;
        if (arg0 != 8338) {
            field2927 = null;
        }
        field2922 = null;
        field2927 = null;
        field2924 = null;
        field2932 = null;
        field2917 = null;
        field2936 = null;
        field2934 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public final void method1009(byte arg0) {
        if (arg0 <= 49) {
            field2922 = null;
        }
        field2919++;
        if (this.field2918 != null) {
            this.field2918.field2920 = this.field2920;
            this.field2920.field2918 = this.field2918;
            this.field2918 = null;
            this.field2920 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Z")
    public final boolean method1010(int arg0) {
        field2930++;
        if (this.field2918 == null) {
            return false;
        } else {
            if (arg0 >= -106) {
                method1008(-88);
            }
            return true;
        }
    }
}
