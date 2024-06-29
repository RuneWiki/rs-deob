import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class210 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Lhj;")
    public static class69 field3818 = class181.method1318("Starte 3D)2Softwarebibliothek)3", (byte) -111);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field3817 = -1;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Lhj;")
    public static class69 field3825 = class181.method1318(":clanreq:", (byte) -115);

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lka;")
    public static class243 field3822 = new class243();

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Lnc;")
    public static class83 field3819;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method896(Component arg0, byte arg1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)I")
    public abstract int method898(byte arg0);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBIII)V")
    public static final void method1515(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class151.field2797; var5++) {
            if (class101.field1891[var5] + class129.field2410[var5] > arg0 && class101.field1891[var5] < (arg0 + arg3) && arg2 < (class181.field3300[var5] + class202.field3646[var5]) && class181.field3300[var5] < (arg2 + arg4)) {
                class49.field723[var5] = true;
            }
        }
        int var6 = -37 % ((-arg1 - 45) / 47);
        field3820++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public static void method1516(boolean arg0) {
        field3818 = null;
        field3819 = null;
        if (!arg0) {
            field3818 = null;
        }
        field3825 = null;
        field3822 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I")
    public static final int method1517(int arg0, int arg1) {
        int var2 = -81 % ((49 - arg1) / 33);
        field3823++;
        if (class165.field3051 == 1) {
            return 7;
        } else if (class165.field3051 == 2) {
            return 20;
        } else if (arg0 == 15) {
            return 13;
        } else if (arg0 == 16) {
            return 3;
        } else if (arg0 == 22) {
            return 8;
        } else if (arg0 == 31) {
            return 14;
        } else if (arg0 == 38) {
            return 2;
        } else if (arg0 == 43) {
            return 15;
        } else if (arg0 == 48) {
            return 17;
        } else if (arg0 == 58) {
            return 11;
        } else if (arg0 == 69) {
            return 6;
        } else if (arg0 == 74) {
            return 20;
        } else if (arg0 == 77) {
            return 1;
        } else if (arg0 == 101) {
            return 12;
        } else if (arg0 == 103) {
            return 19;
        } else if (arg0 == 152) {
            return 16;
        } else if (arg0 == 161) {
            return 4;
        } else if (arg0 == 162) {
            return 9;
        } else if (arg0 == 166) {
            return 10;
        } else if (arg0 == 179) {
            return 18;
        } else if (arg0 == 191) {
            return 5;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method897(Component arg0, byte arg1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lnc;I)V")
    public static final void method1518(class83 arg0, int arg1) {
        if (arg1 != 191) {
            field3818 = null;
        }
        class124.field2307 = arg0;
        field3821++;
        class3.field9 = class124.field2307.method594(4, (byte) 115);
    }
}
