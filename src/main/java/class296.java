import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class296 extends class183 {

    @OriginalMember(owner = "client!gm", name = "W", descriptor = "Ljf;")
    private static class229 field5062 = class212.method1457((byte) 110, "purple:");

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "I")
    public static int field5059 = 0;

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "Ljf;")
    public static class229 field5065 = field5062;

    @OriginalMember(owner = "client!gm", name = "db", descriptor = "Ljf;")
    public static class229 field5069 = class212.method1457((byte) 86, " ");

    @OriginalMember(owner = "client!gm", name = "ab", descriptor = "Ljf;")
    public static class229 field5066 = field5062;

    @OriginalMember(owner = "client!gm", name = "bb", descriptor = "Ljf;")
    public static class229 field5067 = class212.method1457((byte) 77, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!gm", name = "eb", descriptor = "Ljf;")
    public static class229 field5070 = class212.method1457((byte) 109, "Titelbild geladen)3");

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!gm", name = "fb", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!gm", name = "cb", descriptor = "Lek;")
    public static class185 field5068;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(B)V", line = 4)
    public static void method2046(byte arg0) {
        field5070 = null;
        field5065 = null;
        field5067 = null;
        field5062 = null;
        field5066 = null;
        field5068 = null;
        field5069 = null;
        if (arg0 != 102) {
            field5070 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lkh;B)Ldd;", line = 30)
    public static final class252 method2047(class14 arg0, byte arg1) {
        field5064++;
        class252 var2 = new class252();
        if (arg1 != 81) {
            method2047((class14) null, (byte) 71);
        }
        var2.field4410 = arg0.method116(arg1 - 82);
        var2.field4403 = class27.method242(var2.field4410, -30280);
        return var2;
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(I)V", line = 51)
    public static final void method2048(int arg0) {
        field5060++;
        for (class165 var1 = (class165) class83.field1589.method2078(-103); var1 != null; var1 = (class165) class83.field1589.method2080(5)) {
            if (var1.field2843) {
                var1.method1133(0);
            }
        }
        for (class165 var2 = (class165) class125.field2203.method2078(-99); var2 != null; var2 = (class165) class125.field2203.method2080(5)) {
            if (var2.field2843) {
                var2.method1133(0);
            }
        }
        if (arg0 >= -110) {
            field5065 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(II)[I", line = 105)
    public final int[] method10(int arg0, int arg1) {
        field5071++;
        int[] var3 = this.field3161.method664(arg0, 0);
        if (arg1 != -1) {
            field5067 = (class229) null;
        }
        if (this.field3161.field1736) {
            class36.method319(var3, 0, class22.field393, class42.field746[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 142)
    public class296() {
        super(0, true);
    }
}
