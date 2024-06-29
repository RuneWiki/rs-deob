import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class101 extends class428 {

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "Lal;")
    public static class401 field1227 = new class401(8);

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field1231 = 0;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field1233 = -1;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "Z")
    public static boolean field1234 = false;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "Lcr;")
    public static class206 field1230;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Lg;")
    public static class470 field1229;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Ljava/lang/String;")
    public String field1225;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static final void method492(byte arg0) {
        if (arg0 < 92) {
            method492((byte) -26);
        }
        field1219++;
        class89 var1 = class146.method695(15, 0, (byte) -64);
        var1.method448(13);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
    public static void method493(byte arg0) {
        field1230 = null;
        field1229 = null;
        int var1 = 16 / ((12 - arg0) / 58);
        field1227 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILg;I)Lsr;")
    public static final class146 method494(int arg0, class470 arg1, int arg2) {
        field1221++;
        byte[] var3 = arg1.method2779(1, arg0);
        if (arg2 != -19998) {
            field1234 = false;
        }
        return var3 == null ? null : new class146(var3);
    }
}
