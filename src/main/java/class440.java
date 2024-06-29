import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class440 {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Z")
    public boolean field6422 = false;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public int field6420 = 64;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public int field6431 = -1;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field6419 = 2;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public int field6425 = 1;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
    public boolean field6430 = false;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public int field6433 = 64;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field6424 = -1;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILae;II)V")
    private final void method2573(int arg0, class156 arg1, int arg2, int arg3) {
        int var5 = -35 % ((arg3 - 56) / 38);
        if (arg0 == 1) {
            this.field6431 = arg1.method993((byte) -114);
            if (this.field6431 == 65535) {
                this.field6431 = -1;
            }
        } else if (arg0 == 2) {
            this.field6420 = arg1.method993((byte) -114) + 1;
            this.field6433 = arg1.method993((byte) -106) + 1;
        } else if (arg0 == 3) {
            arg1.method946(69);
        } else if (arg0 == 4) {
            this.field6419 = arg1.method941((byte) 127);
        } else if (arg0 == 5) {
            this.field6425 = arg1.method941((byte) 124);
        } else if (arg0 == 6) {
            this.field6422 = true;
        } else if (arg0 == 7) {
            this.field6430 = true;
        }
        field6427++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)I")
    public static final int method2574(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg2 != -14399) {
            method2574(-5, -76, -32, 117);
        }
        field6429++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lae;II)V")
    public final void method2575(class156 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method941((byte) 127);
            if (var4 == 0) {
                if (arg1 != -8) {
                    field6432 = -58;
                }
                field6428++;
                return;
            }
            this.method2573(var4, arg0, arg2, 118);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILwd;)Z")
    public static final boolean method2576(int arg0, class170 arg1) {
        field6421++;
        if (arg0 != 255) {
            method2576(39, null);
        }
        if (arg1 == null) {
            return false;
        } else if (!arg1.field2268) {
            return false;
        } else if (!arg1.method1076(0, class249.field3571)) {
            return false;
        } else if (class230.field3213.method2310((byte) -64, (long) arg1.field2246) == null) {
            return class55.field854.method2310((byte) -102, (long) arg1.field2242) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static final void method2577(int arg0) {
        field6423++;
        if (arg0 != 3031) {
            field6424 = -15;
        }
        if (class450.field6559 < 0) {
            return;
        }
        long var1 = class109.method653(false);
        class450.field6559 = (int) ((long) class450.field6559 - (var1 - class190.field2702));
        if (class450.field6559 > 0) {
            int var3 = (class450.field6559 << 8) / class173.field2369;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            class289.field4143 = ((class250.field3608 & 0xFF00) * var3 + (class199.field2777.field1573 & 0xFF00) * var4 & 0xFF0000) + ((class250.field3608 & 0xFF00FF) * var3 + (class199.field2777.field1573 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            float var6 = 1.0F - var5;
            class239.field3339 = class304.field4408 * var3 + class199.field2777.field1579 * var4 >> 8;
            class477.field6871 = (class199.field2777.field1568 - class298.field4333) * var6 + class298.field4333;
            class483.field6991 = (class199.field2777.field1571 - class487.field7261) * var6 + class487.field7261;
            class430.field6326 = ((class213.field3012 & 0xFF00FF) * var3 + ((class199.field2777.field1575 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class213.field3012 & 0xFF00) * var3 + ((class199.field2777.field1575 & 0xFF00) * var4) & 0xFF0000) >>> 8;
            class166.field2174 = (class199.field2777.field1576 - class428.field6301) * var6 + class428.field6301;
            class89.field1213 = (class199.field2777.field1577 - class359.field5336) * var6 + class359.field5336;
            class140.field1836 = (class199.field2777.field1584 - class210.field2968) * var6 + class210.field2968;
            class445.field6494 = (class199.field2777.field1578 - class392.field5806) * var6 + class392.field5806;
            if (class188.field2681 != class199.field2777.field1585) {
                class93.field1256 = class298.field4343.method817(class188.field2681, class199.field2777.field1585, var6, class93.field1256);
            }
        } else {
            class477.field6871 = class199.field2777.field1568;
            class89.field1213 = class199.field2777.field1577;
            class239.field3339 = class199.field2777.field1579;
            class445.field6494 = class199.field2777.field1578;
            class166.field2174 = class199.field2777.field1576;
            class450.field6559 = -1;
            class93.field1256 = class199.field2777.field1585;
            class289.field4143 = class199.field2777.field1573;
            class430.field6326 = class199.field2777.field1575;
            class140.field1836 = class199.field2777.field1584;
            class483.field6991 = class199.field2777.field1571;
        }
        class190.field2702 = var1;
    }

    static {
        new class194("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }
}
