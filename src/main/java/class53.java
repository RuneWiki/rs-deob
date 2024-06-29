import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field1133 = 0;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Z")
    public static boolean field1134 = true;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1135 = 0;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Llc;")
    public static class69 field1140 = class69.method470((byte) -123, "@yel@*V");

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field1136 = new Object();

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Llc;")
    public static class69 field1143 = class69.method470((byte) -96, "l");

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Llc;")
    public static class69 field1145 = class69.method470((byte) -116, "Connecting to update server");

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Llc;")
    public static class69 field1142 = class69.method470((byte) -117, "It(Ws a ");

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1144 = -1;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "[[B")
    public static byte[][] field1146 = new byte[1000][];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Ljava/awt/Image;")
    public static Image field1137;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[Lda;")
    public static class20[] field1139;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lkc;IBI)Lcb;")
    public static final class15 method339(class63 arg0, int arg1, byte arg2, int arg3) {
        field1138++;
        if (class101.method768(500, arg1, arg0, arg3)) {
            if (arg2 != 24) {
                method342(true, -24, -15);
            }
            return class108.method809(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method340(int arg0) {
        field1145 = null;
        field1146 = null;
        field1139 = null;
        field1137 = null;
        if (arg0 == 0) {
            field1136 = null;
            field1143 = null;
            field1142 = null;
            field1140 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)I")
    public static final int method341(int arg0, int arg1, int arg2, int arg3) {
        field1132++;
        if (arg0 != 0) {
            field1143 = null;
        }
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class43.field856[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * class22.field451[var6][var4][var5 + 1] + class22.field451[var6][var4 + 1][var5 + 1] * var7 >> 7;
        int var10 = (128 - var7) * class22.field451[var6][var4][var5] + class22.field451[var6][var4 + 1][var5] * var7 >> 7;
        return (128 - var8) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZII)I")
    public static final int method342(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field1143 = null;
        }
        field1141++;
        int var3 = class120.method878(arg2 + 45365, (byte) 88, arg1 + 91923, 4) + (class120.method878(arg2 + 10294, (byte) -91, arg1 + 37821, 2) - 128 >> 1) + (class120.method878(arg2, (byte) 73, arg1, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
