import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class71 implements Runnable {

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[Leb;")
    public volatile class31[] field1488 = new class31[2];

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Z")
    public volatile boolean field1502 = false;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Z")
    public volatile boolean field1493 = false;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Ltd;")
    public static class136 field1489 = class145.method1172("Die Adresse dieses Computers wurde gesperrt)1", 45);

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lk;")
    public static class69 field1492 = new class69();

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Ltd;")
    public static class136 field1496 = class145.method1172("null", 45);

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1494 = 0;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Ltd;")
    public static class136 field1501 = class145.method1172("Ein kostenloses Spielkonto erstellen)3", 45);

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Ltd;")
    private static class136 field1498 = class145.method1172("glow2:", 45);

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Ltd;")
    public static class136 field1495 = class145.method1172("auf einer freien Welt zu spielen)3", 45);

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "[I")
    public static int[] field1503 = new int[99];

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Ltd;")
    public static class136 field1500 = field1498;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Ltd;")
    private static class136 field1505 = class145.method1172("yellow:", 45);

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Ltd;")
    public static class136 field1497 = field1505;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Ltd;")
    public static class136 field1504 = field1505;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Ltd;")
    public static class136 field1499 = field1498;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "Z")
    public static boolean field1507 = false;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Ltd;")
    private static class136 field1508;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "Ltd;")
    public static class136 field1510;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "Ltd;")
    public static class136 field1509;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Ld;")
    public class22 field1490;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Leb;")
    public static class31 field1506;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lmd;")
    public static class87 field1486;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "[I")
    public static int[] field1491;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "[I")
    public static int[] field1511;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method527(int arg0) {
        field1503 = null;
        field1500 = null;
        field1508 = null;
        field1504 = null;
        field1486 = null;
        field1498 = null;
        field1489 = null;
        field1506 = null;
        field1492 = null;
        field1497 = null;
        field1499 = null;
        field1496 = null;
        if (arg0 < 102) {
            method528(null, (byte) 116, null, null);
        }
        field1491 = null;
        field1509 = null;
        field1510 = null;
        field1511 = null;
        field1501 = null;
        field1495 = null;
        field1505 = null;
    }

    @OriginalMember(owner = "client!kb", name = "run", descriptor = "()V")
    public final void run() {
        this.field1493 = true;
        try {
            while (!this.field1502) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class31 var2 = this.field1488[var1];
                    if (var2 != null) {
                        var2.method258(104);
                    }
                }
                class9.method42(0, 10L);
                class2.method17(null, this.field1490, -1);
            }
        } catch (Exception var9) {
            class53.method433(var9, false, null);
        } finally {
            Object var6 = null;
            this.field1493 = false;
        }
        field1487++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Component;BLmd;Lmd;)V")
    public static final void method528(Component arg0, byte arg1, class87 arg2, class87 arg3) {
        field1484++;
        if (class29.field635) {
            return;
        }
        class114.method890();
        byte[] var4 = arg3.method658(arg1 ^ 0xFFFFD544, class127.field3019, class81.field1934);
        class116.field2653 = new class10(var4, arg0);
        client.field450 = class116.field2653.method57();
        class62.field1326 = class155.method1215(class81.field1934, class2.field24, -126, arg2);
        class112.field2609 = class155.method1215(class81.field1934, class147.field3408, -128, arg2);
        class43.field990 = class155.method1215(class81.field1934, class56.field1279, -124, arg2);
        class99.field2401 = class31.method274(class74.field1651, arg2, class81.field1934, (byte) -113);
        class86.field2016 = class31.method274(class62.field1318, arg2, class81.field1934, (byte) -113);
        class78.field1802 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class78.field1802[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class78.field1802[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class78.field1802[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class78.field1802[var8 + 192] = 16777215;
        }
        class91.field2150 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class91.field2150[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class91.field2150[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class91.field2150[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class91.field2150[var12 + 192] = 16777215;
        }
        class109.field2570 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class109.field2570[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class109.field2570[var14 + 64] = var14 * 262144 + 255;
        }
        int var15 = 0;
        if (arg1 != 33) {
            field1496 = null;
        }
        while (var15 < 64) {
            class109.field2570[var15 + 128] = var15 * 1024 + 16711935;
            var15++;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class109.field2570[var16 + 192] = 16777215;
        }
        class74.field1687 = new int[32768];
        class105.field2489 = new int[32768];
        class135.field3162 = new int[256];
        class67.method495((byte) 118, null);
        class81.field1904 = class81.field1934;
        class41.field965 = new int[32768];
        class15.field310 = new int[32768];
        class105.field2488 = 0;
        if (class147.field3400 == 0) {
            class113.field2627 = true;
        } else {
            class113.field2627 = false;
        }
        class155.field3545 = false;
        class81.field1929 = class81.field1934;
        if (class113.field2627) {
            class125.method958(arg1 - 33, 2);
        } else {
            class37.method319(2, class81.field1934, class77.field1758, class39.field921, arg1 - 136, 255, false);
        }
        class129.method1061((byte) 97, false);
        class29.field635 = true;
        class116.field2653.method51(0, 0);
        client.field450.method51(382, 0);
        class62.field1326.method693(382 - class62.field1326.field2170 / 2, 18);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILmd;)V")
    public static final void method529(int arg0, class87 arg1) {
        field1483++;
        class33.field754 = arg1;
        class93.field2196 = class33.field754.method666(0, 16);
        if (arg0 != 64) {
            field1504 = null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1503[var1] = var0 / 4;
        }
        field1508 = class145.method1172("We suspect someone knows your password)3", 45);
        field1510 = class145.method1172("Versteckt", 45);
        field1509 = field1508;
    }
}
