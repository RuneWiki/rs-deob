import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class52 extends Canvas {

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field1300;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "[I")
    public static int[] field1301 = new int[256];

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lad;")
    private static class5 field1298 = class88.method674("Moderator option: Mute player for 48 hours: <OFF>", -95);

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lad;")
    public static class5 field1297 = field1298;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field1295 = 0;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "Lad;")
    private static class5 field1312;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Lad;")
    private static class5 field1304;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Lad;")
    public static class5 field1307;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lad;")
    public static class5 field1310;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "Lad;")
    public static class5 field1316;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Lad;")
    private static class5 field1315;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Lad;")
    public static class5 field1314;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Lad;")
    public static class5 field1308;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lsb;")
    public static class110 field1317;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Ltb;")
    public static class116 field1305;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "[I")
    public static int[] field1311;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "[Lub;")
    public static class122[] field1313;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1301[var0] = var1;
        }
        field1312 = class88.method674("Login limit exceeded)3", -60);
        field1304 = class88.method674("Examine", 82);
        field1307 = field1304;
        field1310 = field1312;
        field1309 = 99;
        field1306 = 20;
        field1316 = class88.method674("scrollen:", -122);
        field1315 = class88.method674("wishes to duel with you)3", -60);
        field1314 = class88.method674("@or3@", -94);
        field1308 = field1315;
    }

    @OriginalMember(owner = "client!id", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 9)
    public final void paint(Graphics arg0) {
        field1302++;
        this.field1300.paint(arg0);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)Ls;", line = 19)
    public static final class108 method434(int arg0, boolean arg1) {
        field1294++;
        class108 var2 = (class108) class102.field2494.method98(-8, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class73.field1747.method857(30580, 13, arg0);
        class108 var4 = new class108();
        var4.field2718 = arg0;
        if (var3 != null) {
            var4.method880(-4113, new class39(var3));
        }
        class102.field2494.method102((long) arg0, var4, 100);
        if (arg1) {
            method434(-128, true);
        }
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 45)
    public final void update(Graphics arg0) {
        this.field1300.update(arg0);
        field1299++;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IZ)Lrc;", line = 54)
    public static final class105 method435(int arg0, boolean arg1) {
        field1303++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (arg1) {
            field1315 = null;
        }
        if (class121.field3013[var2] == null || class121.field3013[var2][var3] == null) {
            boolean var4 = class116.method928(41, var2);
            if (!var4) {
                return null;
            }
        }
        return class121.field3013[var2][var3];
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 90)
    public static void method436(int arg0) {
        field1304 = null;
        field1314 = null;
        field1298 = null;
        if (arg0 > -114) {
            field1317 = null;
        }
        field1305 = null;
        field1317 = null;
        field1313 = null;
        field1315 = null;
        field1316 = null;
        field1308 = null;
        field1312 = null;
        field1311 = null;
        field1310 = null;
        field1301 = null;
        field1307 = null;
        field1297 = null;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 173)
    public class52(Component arg0) {
        this.field1300 = arg0;
    }
}
