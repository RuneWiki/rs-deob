import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class32 extends class46 {

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "[B")
    public byte[] field492;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "[I")
    public static int[] field491 = new int[128];

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "Leg;")
    public static class52 field493 = new class52();

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "Lmb;")
    private static class132 field495 = class166.method1092("Your account has been disabled)3", 119);

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "Lmb;")
    public static class132 field498 = class166.method1092("null", 116);

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "Lmb;")
    public static class132 field496 = class166.method1092("cookiehost", 126);

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    public static int field499 = 0;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "Lmb;")
    public static class132 field502 = class166.method1092("Wordpack geladen)3", 116);

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "Lmb;")
    public static class132 field501 = field495;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "Lnb;")
    public static class143 field500;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "Lpb;")
    public static class165 field497;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lii;ILmb;)Lmb;")
    public static final class132 method228(class96 arg0, int arg1, class132 arg2) {
        if (arg1 != 0) {
            field496 = null;
        }
        field494++;
        if (arg2.method893((byte) 45, class35.field565) == -1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.method893((byte) 45, class66.field1086);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method893((byte) 45, class229.field4135);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method893((byte) 45, class53.field891);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method893((byte) 45, class151.field2763);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method893((byte) 45, class157.field2856);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method893((byte) 45, class2.field15);
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    class132 var9 = class75.field1247;
                                                    if (class75.field1244 != null) {
                                                        var9 = class238.method1509((byte) -102, class75.field1244.field2265);
                                                        try {
                                                            if (class75.field1244.field2269 != null) {
                                                                byte[] var10 = ((String) class75.field1244.field2269).getBytes("ISO-8859-1");
                                                                var9 = class161.method1039(0, 0, var10.length, var10);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg2 = class187.method1197(new class132[] { arg2.method886(~arg1, 0, var8), var9, arg2.method873((byte) 58, var8 + 4) }, -71);
                                                }
                                            }
                                            arg2 = class187.method1197(new class132[] { arg2.method886(~arg1, 0, var7), class153.method1003(arg1 ^ 0xFFFFFFAE, class4.method21(-1, 4, arg0)), arg2.method873((byte) 58, var7 + 2) }, arg1 - 79);
                                        }
                                    }
                                    arg2 = class187.method1197(new class132[] { arg2.method886(-1, 0, var6), class153.method1003(-82, class4.method21(-1, 3, arg0)), arg2.method873((byte) 58, var6 + 2) }, -128);
                                }
                            }
                            arg2 = class187.method1197(new class132[] { arg2.method886(~arg1, 0, var5), class153.method1003(-82, class4.method21(-1, 2, arg0)), arg2.method873((byte) 58, var5 + 2) }, arg1 ^ 0xFFFFFFB4);
                        }
                    }
                    arg2 = class187.method1197(new class132[] { arg2.method886(~arg1, 0, var4), class153.method1003(-82, class4.method21(-1, 1, arg0)), arg2.method873((byte) 58, var4 + 2) }, -75);
                }
            }
            arg2 = class187.method1197(new class132[] { arg2.method886(-1, 0, var3), class153.method1003(-82, class4.method21(arg1 - 1, 0, arg0)), arg2.method873((byte) 58, var3 + 2) }, -103);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public static void method229(boolean arg0) {
        field497 = null;
        field496 = null;
        field495 = null;
        field491 = null;
        field500 = null;
        field501 = null;
        field502 = null;
        field493 = null;
        field498 = null;
        if (arg0) {
            method229(true);
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([B)V")
    public class32(byte[] arg0) {
        this.field492 = arg0;
    }
}
