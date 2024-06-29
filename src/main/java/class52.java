import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 extends class128 {

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "Lid;")
    public static class60 field1306 = class11.method72("Verbinde mit Server)3)3)3", (byte) -21);

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "Lid;")
    public static class60 field1304 = class11.method72("Unerwartete Antwort vom Anmelde)2Server", (byte) -95);

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field1315 = 0;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "Lid;")
    public static class60 field1311 = class11.method72(")4l", (byte) -43);

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "Lid;")
    private static class60 field1317 = class11.method72("You can(Wt add yourself to your own ignore list", (byte) -18);

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "Lid;")
    public static class60 field1329 = field1317;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "Lid;")
    private static class60 field1330 = class11.method72("Please enter your username)3", (byte) -108);

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field1314 = 0;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "Lid;")
    public static class60 field1307 = field1330;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public int field1300;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "Ldb;")
    public class24 field1316;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "Lie;")
    public static class61 field1331;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "Lkc;")
    public class72 field1333;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "Llc;")
    public class79 field1312;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "Lm;")
    public class83 field1326;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "Ljava/awt/Image;")
    public static Image field1327;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "[I")
    public static int[] field1335;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILie;)V")
    public static final void method387(int arg0, class61 arg1) {
        field1308++;
        class14.field284 = arg1;
        if (arg0 != 257003024) {
            field1330 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1301++;
        int var7 = 0;
        int var8 = 2048 - arg0 & arg4;
        int var9 = 2048 - arg2 & 0x7FF;
        int var10 = 0;
        int var11 = arg1;
        if (var9 != 0) {
            int var12 = class127.field2900[var9];
            int var13 = class127.field2899[var9];
            int var14 = var10 * var13 - arg1 * var12 >> 16;
            var11 = var10 * var12 + arg1 * var13 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class127.field2900[var8];
            int var16 = class127.field2899[var8];
            int var17 = var7 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var7 * var15 >> 16;
            var7 = var17;
        }
        class63.field1567 = arg2;
        class74.field1787 = arg0;
        class101.field2461 = arg5 - var10;
        class140.field3198 = arg3 - var7;
        class128.field2931 = arg6 - var11;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static void method389(byte arg0) {
        field1307 = null;
        field1329 = null;
        field1327 = null;
        field1317 = null;
        field1306 = null;
        field1335 = null;
        field1304 = null;
        field1330 = null;
        if (arg0 != 15) {
            field1315 = -52;
        }
        field1331 = null;
        field1311 = null;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
    public final void method390(int arg0) {
        this.field1316 = null;
        this.field1326 = null;
        this.field1333 = null;
        field1328++;
        this.field1312 = null;
        if (arg0 != 2047) {
            method389((byte) 86);
        }
    }
}
