import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 implements Runnable {

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lv;")
    private static class146 field1296 = class159.method1226((byte) -37, "Free world");

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Lv;")
    public static class146 field1293 = class159.method1226((byte) -37, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1300 = 0;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Lv;")
    public static class146 field1299 = class159.method1226((byte) -37, " loggt sich ein)3");

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field1301 = 0;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[[[I")
    public static int[][][] field1297 = new int[4][13][13];

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "[I")
    public static int[] field1308 = new int[32];

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Lv;")
    public static class146 field1306 = field1296;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1294 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Luf;")
    public static class145 field1298;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Ldd;")
    public static class26 field1290;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lgf;")
    public static class48 field1295;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lla;")
    public static class77 field1292;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Lla;")
    public static class77 field1302;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBLv;)V")
    public static final void method399(int arg0, byte arg1, class146 arg2) {
        field1289++;
        class26.field566++;
        class82.field1990.method265((byte) -85, 114);
        class82.field1990.method791(false, arg0);
        if (arg1 > -91) {
            method399(-62, (byte) 57, null);
        }
        class82.field1990.method779(arg2.method1101(124), (byte) -108);
    }

    @OriginalMember(owner = "client!ib", name = "run", descriptor = "()V")
    public final void run() {
        field1305++;
        try {
            while (true) {
                class152 var1 = class9.field166;
                class18 var2;
                synchronized (class9.field166) {
                    var2 = (class18) class9.field166.method1138(25852);
                }
                if (var2 == null) {
                    class6.method51(100L, -14344);
                    Object var6 = class119.field2764;
                    synchronized (class119.field2764) {
                        if (class117.field2724 <= 1) {
                            class117.field2724 = 0;
                            class119.field2764.notifyAll();
                            return;
                        }
                        class117.field2724--;
                    }
                } else {
                    if (var2.field293 == 0) {
                        var2.field298.method880(var2.field285.length, (int) var2.field679, var2.field285, -69);
                        class152 var4 = class9.field166;
                        synchronized (class9.field166) {
                            var2.method217(-1264);
                        }
                    } else if (var2.field293 == 1) {
                        var2.field285 = var2.field298.method881(-92, (int) var2.field679);
                        class152 var3 = class9.field166;
                        synchronized (class9.field166) {
                            class15.field241.method1136(var2, false);
                        }
                    }
                    Object var5 = class119.field2764;
                    synchronized (class119.field2764) {
                        if (class117.field2724 <= 1) {
                            class117.field2724 = 0;
                            class119.field2764.notifyAll();
                            return;
                        }
                        class117.field2724 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class122.method921((byte) 90, null, var17);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method400(int arg0) {
        field1306 = null;
        field1308 = null;
        field1298 = null;
        field1302 = null;
        field1295 = null;
        field1299 = null;
        field1290 = null;
        field1292 = null;
        if (arg0 <= 79) {
            field1307 = -107;
        }
        field1293 = null;
        field1297 = null;
        field1296 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[BII)I")
    public static final int method401(int arg0, byte[] arg1, int arg2, int arg3) {
        field1291++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class22.field361[(arg1[var5] ^ var4) & 0xFF];
        }
        if (arg2 >= -16) {
            field1294 = 17;
        }
        return ~var4;
    }
}
