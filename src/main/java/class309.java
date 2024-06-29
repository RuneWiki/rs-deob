import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class309 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Z")
    public static boolean field4812 = true;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field4811 = 0;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4819 = new String[200];

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lii;")
    public static class250 field4810 = new class250(16);

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field4822 = 0;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public int field4816;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Lnf;")
    public static class262 field4820;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lgi;")
    public static class310 field4815;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Ljava/lang/String;")
    public String field4818;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILjd;I)[Lrj;", line = 5)
    public static final class269[] method2118(int arg0, int arg1, class95 arg2, int arg3) {
        field4813++;
        return class31.method233(arg3, arg1, arg0, arg2) ? class168.method1275(false) : null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 20)
    public static void method2119(int arg0) {
        field4810 = null;
        if (arg0 == 0) {
            field4815 = null;
            field4820 = null;
            field4819 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BII)I", line = 34)
    public static final int method2120(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 200) {
            field4821 = 63;
        }
        field4817++;
        return class308.method2110(-117, arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lmd;I)V", line = 45)
    public static final void method2121(class244 arg0, int arg1) {
        if (arg0.field3701 != null) {
            arg0.field3701.field3719 = 0;
        }
        arg0.field3704 = false;
        if (arg1 != 0) {
            field4820 = (class262) null;
        }
        for (class244 var2 = arg0.method145(); var2 != null; var2 = arg0.method142()) {
            method2121(var2, 0);
        }
        field4814++;
    }
}
