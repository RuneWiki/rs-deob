import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 extends class124 {

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "Lpe;")
    public static class109 field1287 = class141.method1120("event_opbase", 0);

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "Lpe;")
    public static class109 field1290 = class141.method1120("und die Schaltfl-=che (WSpielkonto erstellen(W am", 0);

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "Z")
    public static boolean field1291 = false;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "Lpe;")
    public static class109 field1293 = class141.method1120("Spieler", 0);

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    public static int field1295 = 0;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "Lj;")
    public static class62 field1288 = new class62();

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "Lpe;")
    public static class109 field1300 = class141.method1120("Zu viele Verbindungen von Ihrer Adresse)3", 0);

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "Ljf;")
    public static class68 field1299 = new class68(5000);

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "Lpe;")
    public static class109 field1301 = class141.method1120("Spiel)2Engine wird gestartet)3)3)3", 0);

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    public static int field1302 = 0;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
    public static int field1303 = 0;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lbe;I)V")
    public final void method497(class13 arg0, int arg1) {
        if (arg1 != 0) {
            field1290 = null;
        }
        while (true) {
            int var3 = arg0.method142(27467);
            if (var3 == 0) {
                field1296++;
                return;
            }
            this.method502(~arg1, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public static void method498(int arg0) {
        field1290 = null;
        field1293 = null;
        if (arg0 != 21) {
            method498(36);
        }
        field1301 = null;
        field1288 = null;
        field1287 = null;
        field1300 = null;
        field1299 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)Lwc;")
    public static final class156 method499(boolean arg0, int arg1) {
        field1286++;
        class156 var2 = (class156) class3.field59.method93((byte) 103, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0) {
            method498(68);
        }
        byte[] var3 = class44.field935.method742(0, 10, arg1);
        if (var3 == null) {
            return null;
        }
        class156 var4 = new class156();
        class13 var5 = new class13(var3);
        var5.field309 = var5.field279.length - 12;
        int var6 = var5.method112(arg0);
        int var7 = 0;
        var4.field3593 = var5.method105(1375221240);
        var4.field3596 = var5.method105(1375221240);
        var4.field3586 = var5.method105(1375221240);
        var4.field3594 = var5.method105(1375221240);
        var5.field309 = 0;
        var4.field3591 = var5.method115(26249);
        var4.field3589 = new int[var6];
        var4.field3590 = new int[var6];
        var4.field3584 = new class109[var6];
        while (var5.field279.length - 12 > var5.field309) {
            int var8 = var5.method105(1375221240);
            if (var8 == 3) {
                var4.field3584[var7] = var5.method140(0);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field3589[var7] = var5.method142(27467);
            } else {
                var4.field3589[var7] = var5.method112(false);
            }
            var4.field3590[var7++] = var8;
        }
        class3.field59.method97((long) arg1, (byte) 72, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
    public static final void method500(byte arg0) {
        class48.field993 = null;
        field1294++;
        class121.field2684 = null;
        class119.field2648 = null;
        if (arg0 < 6) {
            field1290 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)V")
    public static final void method501(int arg0, int arg1, int arg2, int arg3) {
        field1297++;
        if (class126.field2797 != 0 && arg2 != 0 && class64.field1320 < 50) {
            class152.field3354[class64.field1320] = arg3;
            class43.field922[class64.field1320] = arg2;
            class131.field2868[class64.field1320] = arg0;
            class154.field3444[class64.field1320] = null;
            class137.field2998[class64.field1320] = 0;
            class64.field1320++;
        }
        int var4 = -5 % ((arg1 + 57) / 37);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILbe;I)V")
    private final void method502(int arg0, class13 arg1, int arg2) {
        field1292++;
        if (arg0 == -1 && arg2 == 1) {
            this.field1285 = arg1.method105(arg0 ^ 0xAE07CA07);
            this.field1289 = arg1.method142(27467);
            this.field1298 = arg1.method142(27467);
        }
    }
}
