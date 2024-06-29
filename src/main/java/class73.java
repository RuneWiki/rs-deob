import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class73 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[Ldj;")
    public static class44[] field1380 = new class44[500];

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1384 = 0;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field1386 = -1;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "[Lue;")
    public static class215[] field1390 = new class215[4];

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1385 = new CRC32();

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Ldj;")
    private static class44 field1394 = class89.method650(255, "wave2:");

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Ldj;")
    public static class44 field1400 = class89.method650(255, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "Ldj;")
    public static class44 field1395 = field1394;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "[I")
    public static int[] field1396 = new int[1000];

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "Ldj;")
    public static class44 field1397 = class89.method650(255, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "[I")
    public static int[] field1403 = new int[50];

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "Ldj;")
    private static class44 field1393 = class89.method650(255, "Password: ");

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Ldj;")
    public static class44 field1392 = field1393;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "Ldj;")
    public static class44 field1402 = class89.method650(255, "Hierhin gehen");

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Ldj;")
    public static class44 field1399 = class89.method650(255, "Ablegen");

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Ldj;")
    public static class44 field1398 = field1394;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field1401 = 0;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public int field1381;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lwc;")
    public static class233 field1391;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)I")
    public static final int method568(int arg0, int arg1, int arg2) {
        class93 var3 = (class93) class54.field990.method828((long) arg0, (byte) -40);
        field1382++;
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = arg2;
            for (int var5 = 0; var5 < var3.field1734.length; var5++) {
                if (var3.field1729[var5] == arg1) {
                    var4 += var3.field1734[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method569(byte arg0) {
        field1402 = null;
        field1391 = null;
        field1399 = null;
        if (arg0 >= -16) {
            return;
        }
        field1385 = null;
        field1390 = null;
        field1394 = null;
        field1392 = null;
        field1400 = null;
        field1393 = null;
        field1380 = null;
        field1395 = null;
        field1403 = null;
        field1396 = null;
        field1398 = null;
        field1397 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljf;IZ)V")
    public static final void method570(class104 arg0, int arg1, boolean arg2) {
        field1387++;
        int var3 = arg0.field1893;
        int var4 = (int) arg0.field3186;
        arg0.method1148(-13215);
        if (arg1 != -15535) {
            method570(null, 56, false);
        }
        if (arg2) {
            class58.method442(var3, 1);
        }
        class108.method780(var3, -29566);
        class223 var5 = class213.method1379(var4, -10051);
        if (var5 != null) {
            class225.method1457(-116, var5);
        }
        class179.field3071 = 0;
        class58.field1086 = false;
        class42.method285(class7.field150, class122.field2176, 0, class10.field212, class121.field2157);
        if (class201.field3575 != -1) {
            class5.method36(class201.field3575, true, 1);
        }
    }
}
