import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class84 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1295 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lol;")
    public static class220 field1294 = new class220();

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Ljf;")
    public static class216 field1301 = new class216(4);

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field1302 = 0;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Z")
    public static boolean field1293;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BC)Z")
    public static final boolean method572(byte arg0, char arg1) {
        if (arg0 < 44) {
            method572((byte) -66, (char) 65424);
        }
        field1298++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static final void method573(int arg0) {
        class28.field338 = null;
        class262.field4250 = null;
        field1292++;
        class196.field3103 = null;
        if (arg0 < 115) {
            method575(-48, '\u000e', (byte) 61, (StringBuffer) null);
        }
        class163.field2537 = null;
        class5.field69 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method574(byte arg0) {
        field1294 = null;
        field1301 = null;
        field1295 = null;
        if (arg0 <= 56) {
            method572((byte) 113, (char) 65413);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ICBLjava/lang/StringBuffer;)Ljava/lang/StringBuffer;")
    public static final StringBuffer method575(int arg0, char arg1, byte arg2, StringBuffer arg3) {
        field1299++;
        if (arg2 < 99) {
            method573(72);
        }
        int var4 = arg3.length();
        arg3.setLength(arg0);
        for (int var5 = var4; var5 < arg0; var5++) {
            arg3.setCharAt(var5, arg1);
        }
        return arg3;
    }
}
