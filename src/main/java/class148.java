import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class148 {

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lja;")
    private static class62 field3486 = class30.method243(43, "Unable to connect)3");

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lja;")
    public static class62 field3494 = class30.method243(43, "Versteckt");

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Lja;")
    public static class62 field3490 = field3486;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Lja;")
    public static class62 field3495 = field3486;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field3496 = 0;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lja;")
    public static class62 field3482 = class30.method243(43, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Lja;")
    public static class62 field3497 = class30.method243(43, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Lja;")
    public static class62 field3492 = class30.method243(43, "<col=ffffff>");

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Lc;")
    public static class18 field3501 = new class18(64);

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field3502 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "J")
    public long field3493;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "J")
    public static long field3498;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lvd;")
    public class148 field3485;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lvd;")
    public class148 field3491;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lfe;")
    public static class41 field3481;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Lja;")
    public static final class62 method1174(int arg0, byte arg1) {
        if (arg1 < 28) {
            return null;
        }
        field3483++;
        class62 var2 = class31.method249(true, arg0);
        for (int var3 = var2.method460((byte) 38) - 3; var3 > 0; var3 -= 3) {
            var2 = class70.method594(new class62[] { var2.method445(var3, (byte) 92, 0), class133.field3049, var2.method471((byte) -110, var3) }, 1229);
        }
        if (var2.method460((byte) 38) > 9) {
            return class70.method594(new class62[] { class139.field3234, var2.method445(var2.method460((byte) 38) - 8, (byte) 98, 0), class28.field701, class96.field2247, var2, class86.field2071 }, 1229);
        } else if (var2.method460((byte) 38) > 6) {
            return class70.method594(new class62[] { class29.field712, var2.method445(var2.method460((byte) 38) - 4, (byte) -53, 0), class138.field3221, class96.field2247, var2, class86.field2071 }, 1229);
        } else {
            return class70.method594(new class62[] { class93.field2171, var2, class82.field1983 }, 1229);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)Lff;")
    public static final class42 method1175(int arg0, int arg1) {
        class42 var2 = (class42) class46.field1049.method129((long) arg0, 24838);
        field3487++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class26.field610.method867(5, 15, arg0);
        class42 var4 = new class42();
        if (arg1 > -16) {
            method1177((byte) -83);
        }
        if (var3 != null) {
            var4.method314(-106, new class128(var3));
        }
        class46.field1049.method128((byte) -88, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public final void method1176(byte arg0) {
        field3499++;
        if (this.field3491 == null) {
            return;
        }
        this.field3491.field3485 = this.field3485;
        int var2 = 82 / ((-arg0 - 57) / 62);
        this.field3485.field3491 = this.field3491;
        this.field3485 = null;
        this.field3491 = null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public static void method1177(byte arg0) {
        field3482 = null;
        field3501 = null;
        field3490 = null;
        if (arg0 > -28) {
            field3498 = -62L;
        }
        field3497 = null;
        field3486 = null;
        field3495 = null;
        field3481 = null;
        field3492 = null;
        field3494 = null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)Lja;")
    public static final class62 method1178(int arg0, int arg1) {
        field3480++;
        class62 var2 = new class62();
        var2.field1538 = arg1;
        var2.field1504 = new byte[arg0];
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static final void method1179(int arg0) {
        if (arg0 <= 104) {
            field3502 = 42;
        }
        field3488++;
        try {
            if (class43.field1011 == 1) {
                int var1 = class94.field2215.method53(true);
                if (var1 > 0 && class94.field2215.method52(0)) {
                    int var2 = var1 - class62.field1535;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class94.field2215.method58((byte) -21, var2);
                } else {
                    class94.field2215.method50((byte) -118);
                    class94.field2215.method26(117);
                    if (class15.field368 == null) {
                        class43.field1011 = 0;
                    } else {
                        class43.field1011 = 2;
                    }
                    class8.field226 = null;
                    class142.field3315 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class94.field2215.method50((byte) -45);
            class142.field3315 = null;
            class43.field1011 = 0;
            class8.field226 = null;
            class15.field368 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Z")
    public final boolean method1180(int arg0) {
        if (arg0 >= -24) {
            return false;
        } else {
            field3489++;
            return this.field3491 != null;
        }
    }
}
