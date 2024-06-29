import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class174 {

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "F")
    public float field2710 = 1.0F;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "F")
    public float field2720 = 0.25F;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "F")
    public float field2708 = 1.0F;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public int field2717;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "F")
    public float field2713;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "F")
    public float field2723;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public int field2722;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "F")
    public float field2711;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public int field2707;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Llf;")
    public class151 field2716;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Loe;")
    public static class127 field2714 = new class127(5, -1);

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "[I")
    public static int[] field2719 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Ljava/awt/Frame;")
    public static Frame field2726;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method1089(int arg0) {
        field2726 = null;
        field2719 = null;
        if (arg0 == -50) {
            field2714 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method1090(byte arg0, String arg1) {
        field2721++;
        if (arg0 > -111) {
            method1092(45, -34, 22, 4);
        }
        return class423.method2474(true, 10, arg1, (byte) -82);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lha;B)V")
    public final void method1091(class40 arg0, byte arg1) {
        field2706++;
        if (arg1 <= 70) {
            this.field2711 = -0.68187296F;
        }
        this.field2708 = (float) (arg0.method257((byte) 27) * 8) / 255.0F;
        this.field2720 = (float) (arg0.method257((byte) 121) * 8) / 255.0F;
        this.field2710 = (float) (arg0.method257((byte) 115) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1092(int arg0, int arg1, int arg2, int arg3) {
        if (class39.method218(arg0, arg1, arg2)) {
            int var4 = arg1 << class239.field3602;
            int var5 = arg2 << class239.field3602;
            return class262.method1590(var4 + 1, class99.field1801[arg0].method318(arg1, arg2) + arg3, var5 + 1) && class262.method1590(class434.field6362 + var4 - 1, class99.field1801[arg0].method318(arg1 + 1, arg2) + arg3, var5 + 1) && class262.method1590(class434.field6362 + var4 - 1, class99.field1801[arg0].method318(arg1 + 1, arg2 + 1) + arg3, class434.field6362 + var5 - 1) && class262.method1590(var4 + 1, class99.field1801[arg0].method318(arg1, arg2 + 1) + arg3, class434.field6362 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLha;)Ljava/lang/String;")
    public static final String method1093(byte arg0, class40 arg1) {
        if (arg0 != -109) {
            field2719 = null;
        }
        field2715++;
        return class160.method1024(arg1, 32767, false);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)V")
    public static final void method1094(byte arg0, int arg1) {
        field2709++;
        class57.field977 = arg1;
        class288 var2 = class93.field1667;
        synchronized (class93.field1667) {
            class93.field1667.method1761(-117);
        }
        class288 var3 = class33.field452;
        synchronized (class33.field452) {
            class33.field452.method1761(-126);
            if (arg0 != 119) {
                method1093((byte) 49, null);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lja;I)Z")
    public final boolean method1095(class174 arg0, int arg1) {
        field2718++;
        int var3 = -18 / ((arg1 + 46) / 49);
        return this.field2722 == arg0.field2722 && this.field2713 == arg0.field2713 && this.field2711 == arg0.field2711 && this.field2723 == arg0.field2723 && this.field2720 == arg0.field2720 && this.field2708 == arg0.field2708 && this.field2710 == arg0.field2710 && this.field2725 == arg0.field2725 && this.field2707 == arg0.field2707 && this.field2716 == arg0.field2716;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class174() {
        this.field2717 = -50;
        this.field2713 = 1.1523438F;
        this.field2723 = 1.2F;
        this.field2722 = class103.field1832;
        this.field2711 = 0.69921875F;
        this.field2724 = -60;
        this.field2725 = class76.field1369;
        this.field2712 = -50;
        this.field2707 = 0;
        this.field2716 = class295.field4487;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lha;)V")
    public class174(class40 arg0) {
        int var2 = arg0.method257((byte) 70);
        if (class463.field7116.field2972 && class329.field4937.method1986() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field2722 = class103.field1832;
            } else {
                this.field2722 = arg0.method255((byte) 96);
            }
            if ((var2 & 0x2) == 0) {
                this.field2713 = 1.1523438F;
            } else {
                this.field2713 = (float) arg0.method254((byte) -55) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field2711 = 0.69921875F;
            } else {
                this.field2711 = (float) arg0.method254((byte) -73) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field2723 = 1.2F;
            } else {
                this.field2723 = (float) arg0.method254((byte) -83) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method255((byte) 96);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method254((byte) -115);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method254((byte) -108);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method254((byte) -56);
            }
            this.field2722 = class103.field1832;
            this.field2711 = 0.69921875F;
            this.field2723 = 1.2F;
            this.field2713 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2724 = -60;
            this.field2712 = -50;
            this.field2717 = -50;
        } else {
            this.field2712 = arg0.method249(false);
            this.field2724 = arg0.method249(false);
            this.field2717 = arg0.method249(false);
        }
        if ((var2 & 0x20) == 0) {
            this.field2725 = class76.field1369;
        } else {
            this.field2725 = arg0.method255((byte) 96);
        }
        if ((var2 & 0x40) == 0) {
            this.field2707 = 0;
        } else {
            this.field2707 = arg0.method254((byte) -78);
        }
        if ((var2 & 0x80) == 0) {
            this.field2716 = class295.field4487;
        } else {
            int var3 = arg0.method254((byte) -62);
            int var4 = arg0.method254((byte) -114);
            int var5 = arg0.method254((byte) -107);
            int var6 = arg0.method254((byte) -76);
            int var7 = arg0.method254((byte) -119);
            int var8 = arg0.method254((byte) -128);
            this.field2716 = class311.method1861(var8, var7, var6, var3, -29965, var4, var5);
        }
    }

    static {
        new class423("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
