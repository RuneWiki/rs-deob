import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class26 {

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lrc;")
    public static class105 field591 = class43.method374("compass", 0);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lrc;")
    private static class105 field589 = class43.method374("white:", 0);

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lrc;")
    public static class105 field595 = field589;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Lrc;")
    public static class105 field601 = class43.method374("p11_full", 0);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field588 = 0;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lrc;")
    private static class105 field603 = class43.method374("RuneScape has been updated(Q", 0);

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lrc;")
    public static class105 field593 = field603;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lrc;")
    public static class105 field600 = class43.method374("Suche nach Updates )2 ", 0);

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lmb;")
    public static class74 field594 = new class74(4096);

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Lrc;")
    private static class105 field606 = class43.method374("Enter name of friend to add to list", 0);

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Lrc;")
    public static class105 field607 = class43.method374("backright1", 0);

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Lrc;")
    private static class105 field605 = class43.method374("Enter message to send to ", 0);

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Lrc;")
    public static class105 field608 = field605;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lrc;")
    public static class105 field604 = field606;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[[[B")
    public static byte[][][] field596;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "[[[B")
    public static byte[][][] field602;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lpb;Lpb;B)V", line = 24)
    public static final void method241(class92 arg0, class92 arg1, byte arg2) {
        class18.field419 = arg1;
        class98.field2260 = arg0;
        field590++;
        if (arg2 != -17) {
            method241(null, null, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 48)
    public static void method242(int arg0) {
        field593 = null;
        if (arg0 != 1) {
            method243(85);
        }
        field604 = null;
        field607 = null;
        field591 = null;
        field601 = null;
        field589 = null;
        field608 = null;
        field603 = null;
        field606 = null;
        field595 = null;
        field594 = null;
        field600 = null;
        field605 = null;
        field596 = null;
        field602 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 82)
    public static final void method243(int arg0) {
        field597++;
        for (int var1 = 0; var1 < class104.field2353; var1++) {
            int var10002 = client.field446[var1]--;
            if (client.field446[var1] >= -10) {
                class47 var3 = class72.field1594[var1];
                if (var3 == null) {
                    var3 = class47.method390(class72.field1589, class115.field2673[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    client.field446[var1] += var3.method388();
                    class72.field1594[var1] = var3;
                }
                if (client.field446[var1] < 0) {
                    int var4;
                    if (class34.field799[var1] == 0) {
                        var4 = class60.field1341;
                    } else {
                        int var5 = (class34.field799[var1] & 0xFF) * 128;
                        int var6 = class34.field799[var1] >> 16 & 0xFF;
                        int var7 = class34.field799[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class119.field2842.field1274;
                        int var9 = var6 * 128 + 64 - class119.field2842.field1229;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var8 + var9 - 128;
                        if (var5 < var10) {
                            client.field446[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class92.field2152 / var5;
                    }
                    class20 var11 = var3.method389().method226(class106.field2436);
                    class68 var12 = class68.method573(var11, 100, var4);
                    var12.method570(class30.field696[var1] - 1);
                    class34.field787.method1004(var12);
                    client.field446[var1] = -100;
                }
            } else {
                class104.field2353--;
                for (int var2 = var1; var2 < class104.field2353; var2++) {
                    class115.field2673[var2] = class115.field2673[var2 + 1];
                    class72.field1594[var2] = class72.field1594[var2 + 1];
                    class30.field696[var2] = class30.field696[var2 + 1];
                    client.field446[var2] = client.field446[var2 + 1];
                    class34.field799[var2] = class34.field799[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != -14892) {
            method241(null, null, (byte) -115);
        }
        if (class60.field1336 <= 0) {
            return;
        }
        class60.field1336 -= 20;
        if (class60.field1336 < 0) {
            class60.field1336 = 0;
        }
        if (class60.field1336 == 0 && class116.field2700 != 0 && class9.field174 != -1) {
            class96.method797(class116.field2700, false, 0, 77, class9.field174, 0, class57.field1203);
            return;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)[B", line = 200)
    public static final synchronized byte[] method244(byte arg0, int arg1) {
        field598++;
        int var2 = 27 / ((3 - arg0) / 47);
        if (arg1 == 100 && class95.field2198 > 0) {
            byte[] var3 = class130.field3162[--class95.field2198];
            class130.field3162[class95.field2198] = null;
            return var3;
        } else if (arg1 == 5000 && class39.field904 > 0) {
            byte[] var4 = class93.field2164[--class39.field904];
            class93.field2164[class39.field904] = null;
            return var4;
        } else if (arg1 == 30000 && class28.field638 > 0) {
            byte[] var5 = class28.field626[--class28.field638];
            class28.field626[class28.field638] = null;
            return var5;
        } else {
            return new byte[arg1];
        }
    }
}
