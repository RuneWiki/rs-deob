import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class451 {

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Z")
    public boolean field6709 = true;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public int field6717 = 128;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public int field6720 = -1;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    private int field6726 = 0;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Lao;")
    public static class191 field6716 = new class191(57, 6);

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Lho;")
    public static class103 field6718 = new class103(9, -1);

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Ljc;")
    public static class305 field6722 = new class305("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "Lao;")
    public static class191 field6725;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public int field6711;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public int field6712;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public int field6713;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public int field6719;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lug;I)V")
    public final void method2795(class396 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2388((byte) -128);
            if (var3 == 0) {
                if (arg1 != 16407) {
                    return;
                }
                field6715++;
                return;
            }
            this.method2796(arg0, -256, var3);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lug;II)V")
    private final void method2796(class396 arg0, int arg1, int arg2) {
        field6721++;
        if (arg1 != -256) {
            return;
        }
        if (arg2 == 1) {
            this.field6726 = arg0.method2396((byte) 67);
            this.method2798((byte) -101, this.field6726);
        } else if (arg2 == 2) {
            this.field6720 = arg0.method2386(-23648);
            if (this.field6720 == 65535) {
                this.field6720 = -1;
            }
        } else if (arg2 == 3) {
            this.field6717 = arg0.method2386(-23648) << 0;
        } else if (arg2 == 4) {
            this.field6709 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static final void method2797(byte arg0) {
        class280.field3716 = true;
        if (arg0 != 47) {
            method2801((byte) -98);
        }
        field6724++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)V")
    private final void method2798(byte arg0, int arg1) {
        field6708++;
        double var3 = (double) ((arg1 & 0xFF41A2) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF77) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field6713 = (int) (var15 * 256.0D);
        this.field6719 = (int) (var17 * 256.0D);
        if (arg0 >= -61) {
            field6723 = -23;
        }
        double var19 = var13 / 6.0D;
        if (this.field6713 < 0) {
            this.field6713 = 0;
        } else if (this.field6713 > 255) {
            this.field6713 = 255;
        }
        if (var17 > 0.5D) {
            this.field6712 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field6712 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field6719 < 0) {
            this.field6719 = 0;
        } else if (this.field6719 > 255) {
            this.field6719 = 255;
        }
        if (this.field6712 < 1) {
            this.field6712 = 1;
        }
        this.field6711 = (int) ((double) this.field6712 * var19);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIBI)V")
    public static final void method2799(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if ((arg1 - arg2) >= class307.field4111 && arg1 + arg2 <= class91.field1086 && arg4 - arg2 >= class169.field2184 && arg2 + arg4 <= class386.field5620) {
            class305.method1821(arg4, arg1, arg2, arg0, false);
        } else {
            class337.method1964(arg1, arg0, arg2, -25746, arg4);
        }
        if (arg3 < -15) {
            field6710++;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZI)I")
    public static final int method2800(int arg0, boolean arg1, int arg2) {
        field6714++;
        if (arg1) {
            field6725 = null;
        }
        return arg0 == 4 || arg0 == 5 ? class417.field6026[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
    public static void method2801(byte arg0) {
        field6725 = null;
        field6716 = null;
        if (arg0 != 54) {
            field6723 = -94;
        }
        field6722 = null;
        field6718 = null;
    }

    static {
        new class305("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field6725 = new class191(42, 4);
    }
}
