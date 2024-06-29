import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class69 extends class44 {

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Z")
    public static boolean field1270 = true;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lkb;")
    public static class93 field1275 = class76.method390("me", 0);

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field1277 = 127;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Lkb;")
    public static class93 field1278 = class76.method390("Verbindung abgebrochen)3", 0);

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1280 = Calendar.getInstance();

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "[I")
    public static int[] field1281 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "Lkb;")
    private static class93 field1284 = class76.method390("To create a new account you need to", 0);

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "Lkb;")
    private static class93 field1283 = class76.method390("Please enter your password)3", 0);

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "Lkb;")
    public static class93 field1285 = field1283;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "Lkb;")
    public static class93 field1282 = field1284;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Lkb;")
    public class93 field1279;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjg;)V")
    public static final void method365(int arg0, class89 arg1) {
        class92.field1680 = arg1;
        class153.field2994 = class92.field1680.method456(arg0, arg0 ^ 0xFFFFFFF0);
        field1272++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILh;)V")
    public static final void method366(int arg0, class65 arg1) {
        field1274++;
        int var2 = arg1.field1056;
        if (var2 == 324) {
            if (class127.field2396 == -1) {
                class27.field438 = arg1.field1098;
                class127.field2396 = arg1.field1089;
            }
            if (class81.field1471.field2767) {
                arg1.field1089 = class127.field2396;
            } else {
                arg1.field1089 = class27.field438;
            }
        } else if (arg0 == var2) {
            if (class127.field2396 == -1) {
                class127.field2396 = arg1.field1089;
                class27.field438 = arg1.field1098;
            }
            if (class81.field1471.field2767) {
                arg1.field1089 = class27.field438;
            } else {
                arg1.field1089 = class127.field2396;
            }
        } else if (var2 == 327) {
            arg1.field1111 = 150;
            arg1.field1157 = (int) (Math.sin((double) class21.field338 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1037 = -1;
            arg1.field1174 = 5;
        } else if (var2 == 328) {
            if (class106.field1940.field550 == null) {
                arg1.field1037 = 0;
            } else {
                arg1.field1111 = 150;
                arg1.field1157 = (int) (Math.sin((double) class21.field338 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field1174 = 5;
                arg1.field1037 = ((int) class106.field1940.field550.method482(89) << 11) + 2047;
                arg1.field1173 = class106.field1940.field2054;
                arg1.field1043 = class106.field1940.field2018;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
    public static void method367(byte arg0) {
        field1280 = null;
        field1283 = null;
        field1285 = null;
        if (arg0 >= -35) {
            method365(68, null);
        }
        field1275 = null;
        field1278 = null;
        field1284 = null;
        field1282 = null;
        field1281 = null;
    }
}
