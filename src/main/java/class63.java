import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class63 {

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    private int field768 = 0;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public int field774 = -1;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Z")
    public boolean field766 = true;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public int field773 = 128;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "J")
    public static long field771 = 0L;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "[Lir;")
    public static class22[] field776 = new class22[14];

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lob;")
    public static class521 field767 = new class521(66, 15);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
    private final void method546(int arg0, int arg1) {
        field763++;
        double var3 = (double) ((arg1 & 0xFFCA67) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFBC) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = (double) arg0;
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
        this.field777 = (int) (var17 * 256.0D);
        this.field769 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (var17 > 0.5D) {
            this.field775 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field775 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field769 < 0) {
            this.field769 = 0;
        } else if (this.field769 > 255) {
            this.field769 = 255;
        }
        if (this.field777 < 0) {
            this.field777 = 0;
        } else if (this.field777 > 255) {
            this.field777 = 255;
        }
        if (this.field775 < 1) {
            this.field775 = 1;
        }
        this.field770 = (int) ((double) this.field775 * var19);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Z")
    public static final boolean method547(int arg0, int arg1, int arg2) {
        field764++;
        int var3 = -22 % ((-arg1 - 41) / 46);
        return class426.method2662(0, arg0, arg2) | (arg0 & 0x60000) != 0 || class262.method1748(arg0, (byte) 120, arg2) || class78.method672(arg0, 14826, arg2);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lhp;II)V")
    private final void method548(class217 arg0, int arg1, int arg2) {
        if (arg2 > -109) {
            this.field769 = -43;
        }
        if (arg1 == 1) {
            this.field768 = arg0.method1548(31529);
            this.method546(0, this.field768);
        } else if (arg1 == 2) {
            this.field774 = arg0.method1511(-49);
            if (this.field774 == 65535) {
                this.field774 = -1;
            }
        } else if (arg1 == 3) {
            this.field773 = arg0.method1511(120) << 0;
        } else if (arg1 == 4) {
            this.field766 = false;
        }
        field765++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method549(int arg0) {
        field767 = null;
        field776 = null;
        if (arg0 != 0) {
            method549(-128);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLhp;)V")
    public final void method550(byte arg0, class217 arg1) {
        if (arg0 >= -8) {
            this.method548(null, -54, -46);
        }
        field772++;
        while (true) {
            int var3 = arg1.method1515((byte) 122);
            if (var3 == 0) {
                return;
            }
            this.method548(arg1, var3, -113);
        }
    }

    static {
        new class234("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
    }
}
