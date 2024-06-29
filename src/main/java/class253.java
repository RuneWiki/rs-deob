import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class253 implements class140 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field4460 = 0;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Lsg;")
    public static class30 field4467 = class167.method1221((byte) 33, "www)2wtrc");

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field4464 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Lsg;")
    public static class30 field4466 = class167.method1221((byte) 33, "Mem:");

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "[I")
    public static int[] field4469 = new int[] { 0, 0, 0, 0, 0, 0, 0, -2, 24, -1, 8, 0, 6, 0, 0, 0, 0, 0, 7, 0, 0, 2, 5, 10, 0, 0, 0, -2, -2, 0, 0, 0, 0, 2, 0, 0, 0, 14, 0, 5, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 14, -1, 4, -2, 4, 0, 0, 0, 0, 0, 10, 0, 20, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 4, 0, 0, 0, -1, 0, 0, 4, 0, 6, 0, 2, 0, 0, 0, 6, 0, 2, -1, 0, 0, 0, -2, 0, 0, 0, 0, 10, -1, 0, 0, 0, -2, 15, 0, 1, 9, 8, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 6, 0, 7, 0, 0, 5, 2, 9, 6, 3, 5, -2, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 7, 0, 0, 0, 6, 0, 0, 0, 8, 12, 0, 2, 3, 12, 1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 6, -2, 0, 0, 0, 6, 5, 0, 0, -1, 8, 0, 0, 10, 0, -1, -1, 0, -2, 0, 2, 0, 3, 0, 0, 0, 0, 0, -2, 0, 0, -1, 7, 0, -1, 0, 15, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 3, -2, 4, 0, 0, 0, 6, 0, 1, 0, -1, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 1, 0, 1, 10, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lsg;")
    public static class30 field4463 = class167.method1221((byte) 33, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Lsg;")
    public static class30 field4470 = class167.method1221((byte) 33, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Z")
    public static boolean field4465 = true;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)Llc;")
    public static final class136 method1760(int arg0, boolean arg1) {
        class136 var2 = (class136) class68.field1495.method1644((byte) -119, (long) arg0);
        field4462++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class227.field4055.method1115(arg0, (byte) -111, 4);
        if (!arg1) {
            field4465 = true;
        }
        class136 var4 = new class136();
        if (var3 != null) {
            var4.method1026(arg0, new class8(var3), true);
        }
        class68.field1495.method1646((long) arg0, var4, -108);
        return var4;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)V")
    public static final void method1761(int arg0, byte arg1) {
        if (arg1 <= 78) {
            return;
        }
        field4473++;
        class230.method1634((byte) -128);
        class122.method933(false);
        int var2 = class134.method1009((byte) 125, arg0).field1805;
        if (var2 == 0) {
            return;
        }
        int var3 = class142.field2741[arg0];
        if (var2 == 5) {
            class154.field2913 = var3;
        }
        if (var2 == 9) {
            class125.field2448 = var3;
        }
        if (var2 == 6) {
            class15.field322 = var3;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IJ[II)Lsg;")
    public final class30 method1050(int arg0, long arg1, int[] arg2, int arg3) {
        field4474++;
        if (arg3 == 0) {
            class93 var6 = class48.method474(-90, arg2[0]);
            return var6.method752((int) arg1, (byte) -84);
        }
        if (arg0 != 12) {
            method1761(53, (byte) -33);
        }
        if (arg3 == 1 || arg3 == 10) {
            class168 var7 = class201.method1425(72, (int) arg1);
            return var7.field3162;
        } else if (arg3 == 6 || arg3 == 7) {
            return class48.method474(arg0 - 125, arg2[0]).method752((int) arg1, (byte) -41);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method1762(int arg0) {
        field4470 = null;
        field4467 = null;
        field4466 = null;
        field4469 = null;
        field4463 = null;
        if (arg0 >= -67) {
            method1764((byte) 70, -15);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static final void method1763(int arg0) {
        if (arg0 != -24483) {
            field4470 = null;
        }
        field4472++;
        class123.field2419.method1650(90);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)V")
    public static final void method1764(byte arg0, int arg1) {
        field4471++;
        if (class193.field3485 == arg1) {
            return;
        }
        if (class193.field3485 == 0) {
            class2.method16((byte) 25);
        }
        if (arg1 == 40) {
            class17.method173(-114);
        }
        if (arg1 != 40 && class106.field2130 != null) {
            class106.field2130.method1516(-101);
            class106.field2130 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class231.field4109 = 1;
            class200.field3576 = 0;
            class86.field1771 = 0;
            class123.field2421 = 1;
            class67.field1471 = 0;
            class201.method1427((byte) -114);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 5) {
            class268.method1840(class134.field2625, true);
        } else {
            class33.method327(-126);
        }
        boolean var3 = class193.field3485 == 5 || class193.field3485 == 10 || class193.field3485 == 28;
        if (arg0 != -85) {
            return;
        }
        if (var2 != var3) {
            if (var2) {
                class102.field2072 = class221.field3980;
                if (class246.field4382 == 0) {
                    class29.method243(2, arg0 + 24668);
                } else {
                    class150.method1087(2, false, 255, 0, class221.field3980, class139.field2713, 1);
                }
                class262.field4618.method353((byte) 98, false);
            } else {
                class29.method243(2, 24583);
                class262.field4618.method353((byte) 98, true);
            }
        }
        class193.field3485 = arg1;
    }
}
