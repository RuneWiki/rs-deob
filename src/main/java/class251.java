import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class251 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lwi;")
    private class330 field3485 = new class330(64);

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Lwi;")
    public class330 field3500 = new class330(50);

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Lwi;")
    public class330 field3503 = new class330(5);

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Luu;")
    public class191 field3497;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Liv;")
    public class65 field3492;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Luu;")
    private class191 field3484;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Z")
    public boolean field3486;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
    public static int[] field3487 = new int[256];

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Z")
    public static boolean field3494;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Lof;")
    public static class446 field3498;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "Lni;")
    public static class367 field3499;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "[I")
    public static int[] field3502;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public int field3504;

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
            field3487[var0] = var1;
        }
        field3496 = 0;
        field3494 = false;
        field3498 = new class446("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");
        field3499 = new class367(72, -1);
        field3502 = new int[] { 1, 2, 4, 8 };
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V", line = 5)
    public final void method1621(byte arg0, int arg1) {
        field3493++;
        this.field3504 = arg1;
        class330 var3 = this.field3500;
        synchronized (this.field3500) {
            this.field3500.method2127((byte) -46);
            int var4 = -55 / ((arg0 + 43) / 56);
        }
        class330 var5 = this.field3503;
        synchronized (this.field3503) {
            this.field3503.method2127((byte) -81);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V", line = 25)
    public final void method1622(int arg0, boolean arg1) {
        if (arg0 != -30353) {
            this.method1628((byte) 94);
        }
        field3483++;
        if (arg1 != this.field3486) {
            this.field3486 = arg1;
            this.method1627((byte) 72);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 41)
    public final void method1623(int arg0) {
        field3490++;
        class330 var2 = this.field3500;
        synchronized (this.field3500) {
            this.field3500.method2127((byte) -71);
        }
        class330 var3 = this.field3503;
        synchronized (this.field3503) {
            if (arg0 > 79) {
                this.field3503.method2127((byte) 126);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 58)
    public static void method1624(int arg0) {
        if (arg0 != 0) {
            method1624(74);
        }
        field3498 = null;
        field3502 = null;
        field3499 = null;
        field3487 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V", line = 73)
    public final void method1625(boolean arg0, int arg1) {
        class330 var3 = this.field3485;
        synchronized (this.field3485) {
            this.field3485.method2140(-127, arg1);
        }
        field3489++;
        if (arg0) {
            field3499 = null;
        }
        class330 var4 = this.field3500;
        synchronized (this.field3500) {
            this.field3500.method2140(-106, arg1);
        }
        class330 var5 = this.field3503;
        synchronized (this.field3503) {
            this.field3503.method2140(-111, arg1);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(BI)Lmv;", line = 95)
    public final class258 method1626(byte arg0, int arg1) {
        field3488++;
        class330 var3 = this.field3485;
        class258 var4;
        synchronized (this.field3485) {
            var4 = (class258) this.field3485.method2133((long) arg1, (byte) 34);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field3484;
        byte[] var6;
        synchronized (this.field3484) {
            if (arg0 != -15) {
                this.method1627((byte) -65);
            }
            var6 = this.field3484.method1281(class319.method1995((byte) -48, arg1), class319.method1996(arg1, -12981), arg0 + 91);
        }
        class258 var7 = new class258();
        var7.field3631 = arg1;
        var7.field3621 = this;
        if (var6 != null) {
            var7.method1667(new class164(var6), (byte) 127);
        }
        var7.method1661((byte) 1);
        class330 var8 = this.field3485;
        synchronized (this.field3485) {
            this.field3485.method2131(var7, (long) arg1, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 128)
    public final void method1627(byte arg0) {
        class330 var2 = this.field3485;
        synchronized (this.field3485) {
            this.field3485.method2127((byte) -36);
        }
        field3491++;
        class330 var3 = this.field3500;
        synchronized (this.field3500) {
            this.field3500.method2127((byte) 121);
        }
        class330 var4 = this.field3503;
        synchronized (this.field3503) {
            this.field3503.method2127((byte) -111);
            if (arg0 != 72) {
                this.field3484 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V", line = 148)
    public final void method1628(byte arg0) {
        field3495++;
        class330 var2 = this.field3485;
        synchronized (this.field3485) {
            this.field3485.method2135(0);
        }
        class330 var3 = this.field3500;
        synchronized (this.field3500) {
            this.field3500.method2135(0);
        }
        class330 var4 = this.field3503;
        synchronized (this.field3503) {
            if (arg0 > -72) {
                this.method1625(false, -102);
            }
            this.field3503.method2135(0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Liv;IZLuu;Luu;)V", line = 233)
    public class251(class65 arg0, int arg1, boolean arg2, class191 arg3, class191 arg4) {
        this.field3497 = arg4;
        this.field3492 = arg0;
        this.field3484 = arg3;
        this.field3486 = arg2;
        if (this.field3484 != null) {
            int var6 = this.field3484.method1294(-1) - 1;
            this.field3484.method1290(false, var6);
        }
    }
}
