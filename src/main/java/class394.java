import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class394 {

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Lmq;")
    private class104 field5545 = new class104(256);

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Lfc;")
    private class343 field5546;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Ltm;")
    public static class112 field5536 = new class112("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Z")
    public static boolean field5548 = true;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Lfn;")
    public static class52 field5549;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Laq;")
    public static class385 field5543;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BB)Z")
    public static final boolean method2348(byte[] arg0, byte arg1) {
        field5544++;
        class425 var2 = new class425(arg0);
        int var3 = var2.method2503(true);
        if (arg1 != 68) {
            return false;
        } else if (var3 == 1) {
            boolean var4 = var2.method2503(true) == 1;
            if (var4) {
                class290.method1787(-1, var2);
            }
            class361.method2166(var2, (byte) 90);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
    public static final void method2349(int arg0, byte arg1) {
        int var2 = 88 / ((arg1 - 13) / 58);
        field5547++;
        class265 var3 = class440.method2554(arg0, 2, 5);
        var3.method1677(21748);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIBII)V")
    public static final void method2350(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field5539++;
        int var6 = class229.method1443(class53.field874, arg5, class8.field174, (byte) -68);
        int var7 = class229.method1443(class53.field874, arg4, class8.field174, (byte) -68);
        if (arg3 >= -37) {
            method2355(-80);
        }
        int var8 = class229.method1443(class299.field4121, arg2, class248.field3487, (byte) -68);
        int var9 = class229.method1443(class299.field4121, arg1, class248.field3487, (byte) -68);
        for (int var10 = var6; var10 <= var7; var10++) {
            class80.method554(class2.field16[var10], 114, arg0, var9, var8);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public final void method2351(byte arg0) {
        field5538++;
        class104 var2 = this.field5545;
        synchronized (this.field5545) {
            this.field5545.method654(false);
            if (arg0 != 87) {
                this.method2351((byte) -41);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public static final void method2352() {
        class54.method424(1, class109.field1542);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lfc;Lfc;I)V")
    public static final void method2353(class343 arg0, class343 arg1, int arg2) {
        field5535++;
        class105.field1509 = arg0;
        class466.field6540 = arg1;
        int var3 = 36 % ((arg2 + 46) / 58);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(CI)Z")
    public static final boolean method2354(char arg0, int arg1) {
        field5542++;
        if (arg1 <= 25) {
            method2361((byte) 0);
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static final void method2355(int arg0) {
        class161.field2310 = 0;
        field5540++;
        class250.field3514.method1552((byte) 117);
        if (arg0 != 127) {
            method2348((byte[]) null, (byte) -67);
        }
        class250.field3514.method1553((byte) -81, class7.field125);
        class161.field2310++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lfc;B)V")
    public static final void method2356(class343 arg0, byte arg1) {
        class446.field6167 = arg0.method2042(arg1 ^ 0x72, "titlebg");
        field5532++;
        if (arg1 != 22) {
            method2360(91, (byte) 125);
        }
        class239.field3369 = arg0.method2042(100, "logo");
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(IB)Llq;")
    public final class429 method2357(int arg0, byte arg1) {
        field5533++;
        if (arg1 != -42) {
            field5536 = null;
        }
        class104 var3 = this.field5545;
        class429 var4;
        synchronized (this.field5545) {
            var4 = (class429) this.field5545.method659((long) arg0, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5546.method2029(26, arg0, 0);
        class429 var6 = new class429();
        if (var5 != null) {
            var6.method2517(new class425(var5), (byte) 69);
        }
        class104 var7 = this.field5545;
        synchronized (this.field5545) {
            this.field5545.method653(78, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
    public final void method2358(int arg0, int arg1) {
        field5541++;
        class104 var3 = this.field5545;
        synchronized (this.field5545) {
            this.field5545.method666(arg1, false);
            if (arg0 != -3946) {
                method2356((class343) null, (byte) -116);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
    public final void method2359(byte arg0) {
        field5534++;
        class104 var2 = this.field5545;
        synchronized (this.field5545) {
            this.field5545.method656(93);
        }
        if (arg0 != 36) {
            method2361((byte) -18);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(IB)I")
    public static final int method2360(int arg0, byte arg1) {
        field5537++;
        if (arg1 <= 26) {
            field5548 = true;
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
    public static void method2361(byte arg0) {
        field5549 = null;
        field5543 = null;
        field5536 = null;
        if (arg0 <= 79) {
            method2349(28, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ldk;ILfc;)V")
    public class394(class328 arg0, int arg1, class343 arg2) {
        this.field5546 = arg2;
        this.field5546.method2054(0, 26);
    }

    static {
        new class112("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field5549 = new class52(45, 14);
    }
}
