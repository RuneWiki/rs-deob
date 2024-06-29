import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class67 extends class222 {

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Z")
    public static boolean field1224 = false;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field1227 = 0;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Lmb;")
    public static class160 field1229 = new class160();

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "Z")
    public static boolean field1233 = true;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field1234 = 500;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "B")
    public byte field1225;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lcf;")
    public class93 field1223;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "Lcf;")
    public class93 field1226;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "[I")
    public static int[] field1220;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "[I")
    public static int[] field1230;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public static void method458(byte arg0) {
        if (arg0 == 59) {
            field1220 = null;
            field1230 = null;
            field1229 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
    public static final int method459(int arg0, int arg1) {
        field1232++;
        if (arg1 != 10077) {
            method459(62, -122);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILtg;)Ltg;")
    public static final class181 method460(int arg0, class181 arg1) {
        int var2 = 80 / ((arg0 + 55) / 61);
        field1221++;
        class181 var3 = client.method1116(arg1);
        if (var3 == null) {
            var3 = arg1.field3344;
        }
        return var3;
    }
}
