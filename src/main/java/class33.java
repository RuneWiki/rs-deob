import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field740 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public int field738 = 0;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Ltd;")
    public static class136 field751 = class145.method1172("mn", 45);

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Ltd;")
    public static class136 field748 = class145.method1172(")4slr)3ws?order=LPWM", 45);

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field755 = 2;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "Ltd;")
    public static class136 field758 = class145.method1172(" Sekunde(Xn(Y -Ubertragen)3", 45);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public int field742;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public int field743;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Lqa;")
    public class112 field752;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lmd;")
    public static class87 field754;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
    public static final boolean method291(int arg0, int arg1) {
        field757++;
        if (arg1 > -79) {
            return false;
        } else {
            return (arg0 >> 28 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method292(int arg0) {
        field758 = null;
        field754 = null;
        field748 = null;
        if (arg0 <= 24) {
            field748 = null;
        }
        field751 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)I")
    public static final int method293(int arg0, int arg1, int arg2) {
        field739++;
        class79 var3 = (class79) class88.field2088.method109(32, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = arg1; var5 < var3.field1809.length; var5++) {
                if (var3.field1806[var5] == arg0) {
                    var4 += var3.field1809[var5];
                }
            }
            return var4;
        }
    }
}
