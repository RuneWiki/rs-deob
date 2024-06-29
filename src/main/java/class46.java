import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class46 extends class22 {

    @OriginalMember(owner = "client!hd", name = "Eb", descriptor = "Lwb;")
    private static class130 field1245 = class26.method212("New User", -32376);

    @OriginalMember(owner = "client!hd", name = "Bb", descriptor = "Lwb;")
    public static class130 field1242 = field1245;

    @OriginalMember(owner = "client!hd", name = "tb", descriptor = "Lwb;")
    public static class130 field1234 = class26.method212(" Millionen", -32376);

    @OriginalMember(owner = "client!hd", name = "ub", descriptor = "Lwb;")
    private static class130 field1235 = class26.method212("Try again in 60 secs)3)3)3", -32376);

    @OriginalMember(owner = "client!hd", name = "Ib", descriptor = "Lwb;")
    public static class130 field1249 = class26.method212("::errortest", -32376);

    @OriginalMember(owner = "client!hd", name = "Ab", descriptor = "Lwb;")
    public static class130 field1241 = class26.method212("System)2Update in: ", -32376);

    @OriginalMember(owner = "client!hd", name = "Db", descriptor = "Lwb;")
    public static class130 field1244 = class26.method212("Benutzen Sie bitte eine andere Welt)3", -32376);

    @OriginalMember(owner = "client!hd", name = "Fb", descriptor = "I")
    public static int field1246 = 0;

    @OriginalMember(owner = "client!hd", name = "Kb", descriptor = "Lwb;")
    private static class130 field1251 = class26.method212("Enter amount:", -32376);

    @OriginalMember(owner = "client!hd", name = "zb", descriptor = "Z")
    public static boolean field1240 = false;

    @OriginalMember(owner = "client!hd", name = "Gb", descriptor = "Lwb;")
    public static class130 field1247 = field1235;

    @OriginalMember(owner = "client!hd", name = "xb", descriptor = "Lwb;")
    public static class130 field1238 = class26.method212("Side panel redrawn", -32376);

    @OriginalMember(owner = "client!hd", name = "Lb", descriptor = "Lwb;")
    public static class130 field1252 = class26.method212(" x", -32376);

    @OriginalMember(owner = "client!hd", name = "wb", descriptor = "Lwb;")
    public static class130 field1237 = field1251;

    @OriginalMember(owner = "client!hd", name = "sb", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!hd", name = "vb", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!hd", name = "yb", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!hd", name = "Cb", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!hd", name = "Hb", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!hd", name = "Jb", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!hd", name = "Mb", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(B)Lr;", line = 24)
    public final class102 method10(byte arg0) {
        field1250++;
        return arg0 == -38 ? class84.method630((byte) 11, this.field1233).method552(true, arg0 + 165, this.field1248) : null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)I", line = 35)
    public static final int method418(byte arg0, int arg1, int arg2) {
        if (arg0 <= 62) {
            return 122;
        }
        field1243++;
        int var3 = class14.method109(arg1 + 45365, 4, arg2 + 91923, (byte) -125) + (class14.method109(arg1 + 10294, 2, arg2 + 37821, (byte) -125) + -128 >> 1) + (class14.method109(arg1, 1, arg2, (byte) -127) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V", line = 86)
    public static void method419(boolean arg0) {
        if (!arg0) {
            method419(false);
        }
        field1252 = null;
        field1244 = null;
        field1242 = null;
        field1235 = null;
        field1245 = null;
        field1237 = null;
        field1234 = null;
        field1247 = null;
        field1251 = null;
        field1241 = null;
        field1249 = null;
        field1238 = null;
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(B)V", line = 108)
    public static final void method420(byte arg0) {
        field1253++;
        class20.field575.method83((byte) -116);
        int var1 = 33 / ((arg0 - 31) / 48);
        for (int var2 = 0; var2 < 32; var2++) {
            class4.field155[var2] = 0L;
        }
        for (int var3 = 0; var3 < 32; var3++) {
            class72.field1833[var3] = 0L;
        }
        class35.field1011 = 0;
    }
}
