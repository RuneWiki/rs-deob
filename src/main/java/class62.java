import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class62 extends InputStream {

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field938 = 0;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lfd;")
    public static class243 field933 = new class243(64);

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lwm;")
    public static class152 field942 = null;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lwm;")
    public static class152 field940 = class157.method1048(")0", 126);

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field944 = 0;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Lwm;")
    public static class152 field945 = class157.method1048("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 96);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lah;")
    public static class205 field941;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lah;III)[Lmj;", line = 4)
    public static final class229[] method403(class205 arg0, int arg1, int arg2, int arg3) {
        field935++;
        if (arg1 != 0) {
            method406(47);
        }
        return class86.method566(arg3, arg0, arg2, 1) ? class87.method572(false) : null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V", line = 25)
    public static final void method404(byte arg0, int arg1) {
        int var2 = -116 % ((arg0 - 71) / 42);
        field932++;
        class303 var3 = class90.method589(false, arg1, 7);
        var3.method2114((byte) 106);
    }

    @OriginalMember(owner = "client!de", name = "read", descriptor = "()I", line = 38)
    public final int read() {
        field936++;
        class4.method19(0, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILah;)V", line = 48)
    public static final void method405(int arg0, class205 arg1) {
        class180.field2871 = arg1.method1374(class216.field3508, (byte) -52);
        if (arg0 != 21557) {
            method404((byte) -74, 21);
        }
        field939++;
        class48.field753 = arg1.method1374(class251.field4277, (byte) -52);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 70)
    public static final void method406(int arg0) {
        field937++;
        int var1 = 10 / ((-arg0 - 21) / 44);
        class254.field4394.method1613(-22696);
        class194.field3087.method1613(-22696);
        class152.field2430.method1613(-22696);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 87)
    public static void method407(byte arg0) {
        field933 = null;
        field940 = null;
        field942 = null;
        field945 = null;
        field941 = null;
        if (arg0 != 64) {
            field940 = (class152) null;
        }
    }
}
