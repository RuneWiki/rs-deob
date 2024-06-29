import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class15 {

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field387 = 1;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field388 = 0;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Lpe;")
    public static class109 field391 = class141.method1120(":chalreq:", 0);

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lbe;")
    public static class13 field390 = new class13(8);

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Lpe;")
    public static class109 field396 = class141.method1120("::", 0);

    @OriginalMember(owner = "client!c", name = "r", descriptor = "Lpe;")
    public static class109 field398 = class141.method1120(" x ", 0);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lpe;")
    private static class109 field395 = class141.method1120(" is already on your friend list", 0);

    @OriginalMember(owner = "client!c", name = "s", descriptor = "Lpe;")
    public static class109 field399 = field395;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Lpe;")
    public static class109 field397 = class141.method1120("Anmelde)2Zeitlimit -Uberschritten)3", 0);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Lcf;")
    public static class21 field394;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Lna;")
    public static class91 field383;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "Lna;")
    public static class91 field389;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lba;")
    public static class9 field381;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public abstract void method173(boolean arg0);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V")
    public static void method174(boolean arg0) {
        field391 = null;
        field395 = null;
        field394 = null;
        if (arg0) {
            return;
        }
        field383 = null;
        field381 = null;
        field399 = null;
        field389 = null;
        field397 = null;
        field398 = null;
        field396 = null;
        field390 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
    public abstract int method175(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)Z")
    public static final boolean method176(boolean arg0, int arg1) {
        field392++;
        if (arg0) {
            method176(false, -87);
        }
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static final void method177(byte arg0) {
        field386++;
        if (arg0 != -38) {
            return;
        }
        if (class139.field3039 > 0) {
            class68.method525(arg0 ^ 0xFFFFFC33);
        } else {
            class118.method958(false, 40);
            class149.field3312 = class153.field3363;
            class153.field3363 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLlc;B)V")
    public static final void method178(boolean arg0, class79 arg1, byte arg2) {
        int var3 = (int) arg1.field267;
        field393++;
        int var4 = arg1.field1655;
        arg1.method101((byte) 124);
        if (arg0) {
            class2.method17(var4, 52);
        }
        if (arg2 != 5) {
            return;
        }
        class143.method1129(12192, var4);
        class154 var5 = class44.method403(var3, true);
        if (var5 != null) {
            class138.method1092(0, var5);
        }
        class3.field64 = false;
        class63.field1302 = 0;
        class8.method76(class17.field435, class57.field1147, (byte) 105, class71.field1430, class91.field1945);
        if (class19.field472 != -1) {
            class38.method365(1, class19.field472, 2945);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([Lwa;II)V")
    public static final void method179(class154[] arg0, int arg1, int arg2) {
        if (arg2 < 35) {
            method174(false);
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class154 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field3476 == 0) {
                    if (var4.field3520 != null) {
                        method179(var4.field3520, arg1, 48);
                    }
                    class79 var5 = (class79) class134.field2916.method505((byte) -46, (long) var4.field3514);
                    if (var5 != null) {
                        class38.method365(arg1, var5.field1655, 2945);
                    }
                }
                if (arg1 == 0 && var4.field3406 != null) {
                    class93 var6 = new class93();
                    var6.field2001 = var4.field3406;
                    var6.field2014 = var4;
                    class123.method1003(var6, (byte) 82);
                }
                if (arg1 == 1 && var4.field3453 != null) {
                    if (var4.field3478 >= 0) {
                        class154 var7 = class44.method403(var4.field3514, true);
                        if (var7 == null || var7.field3520 == null || var4.field3478 >= var7.field3520.length || var7.field3520[var4.field3478] != var4) {
                            continue;
                        }
                    }
                    class93 var8 = new class93();
                    var8.field2001 = var4.field3453;
                    var8.field2014 = var4;
                    class123.method1003(var8, (byte) 47);
                }
            }
        }
        field385++;
    }
}
