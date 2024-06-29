import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class102 {

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Z")
    public boolean field1784 = true;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public int field1771;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public int field1770;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public int field1776;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public int field1783;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Ljf;")
    public static class229 field1775 = class212.method1457((byte) 119, "null");

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Ljf;")
    public static class229 field1781 = class212.method1457((byte) 77, "um");

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1778 = 0;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lfc;")
    public static class226 field1773;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 6)
    public static void method682(int arg0) {
        field1773 = null;
        if (arg0 != 64) {
            field1781 = (class229) null;
        }
        field1775 = null;
        field1781 = null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 18)
    public static final void method683(int arg0) {
        field1780++;
        if (arg0 != -944426104) {
            field1778 = -88;
        }
        for (int var1 = 0; var1 < class100.field1762; var1++) {
            int var2 = class201.field3529[var1];
            class33 var3 = class192.field3334[var2];
            int var4 = class171.field2972.method93(false);
            if ((var4 & 0x40) != 0) {
                var4 += class171.field2972.method93(false) << 8;
            }
            class194.method1327(var3, var2, var4, arg0 + 944426104);
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V", line = 53)
    public static final void method684(int arg0) {
        class164.method1111((long) class199.field3475);
        if (class16.field263 != -1) {
            class120.method851(arg0 ^ 0x0, class16.field263);
        }
        field1779++;
        for (int var1 = 0; var1 < class241.field4250; var1++) {
            if (class244.field4341[var1]) {
                class107.field1883[var1] = true;
            }
            class201.field3510[var1] = class244.field4341[var1];
            class244.field4341[var1] = false;
        }
        class8.field80 = null;
        class96.field1703 = arg0;
        if (class108.field1900) {
            class205.field3589 = true;
        }
        class225.field3850 = -1;
        class211.field3628 = class199.field3475;
        if (class16.field263 != -1) {
            class241.field4250 = 0;
            class203.method1424(class16.field263, -1, class78.field1429, 0, 0, (byte) 115, class175.field3046, 0, 0);
        }
        if (class108.field1900) {
            class163.method1100();
        } else {
            class114.method818();
        }
        class146.field2540 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lvg;B)V", line = 101)
    public static final void method685(class266 arg0, byte arg1) {
        if (arg0.field4570 != null) {
            arg0.field4570.field3305 = 0;
        }
        field1782++;
        arg0.field4569 = false;
        if (arg1 <= -57) {
            for (class266 var2 = arg0.method611(); var2 != null; var2 = arg0.method620()) {
                method685(var2, (byte) -107);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZ[B)Ljf;", line = 123)
    public static final class229 method686(int arg0, int arg1, boolean arg2, byte[] arg3) {
        if (!arg2) {
            field1773 = (class226) null;
        }
        field1772++;
        class229 var4 = new class229();
        var4.field3973 = 0;
        var4.field3944 = new byte[arg0];
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            if (arg3[var5] != 0) {
                var4.field3944[var4.field3973++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/awt/Component;II)Lga;", line = 153)
    public static final class19 method687(int arg0, Component arg1, int arg2, int arg3) {
        field1777++;
        try {
            Class var4 = Class.forName("pe");
            class19 var5 = (class19) var4.getDeclaredConstructor().newInstance();
            if (arg2 >= -120) {
                method682(-120);
            }
            var5.method185((byte) 103, arg1, arg3, arg0);
            return var5;
        } catch (Throwable var8) {
            class179 var7 = new class179();
            var7.method185((byte) -39, arg1, arg3, arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIIZ)V", line = 205)
    public class102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1768 = arg0;
        this.field1771 = arg2;
        this.field1770 = arg5;
        this.field1769 = arg1;
        this.field1776 = arg3;
        this.field1784 = arg6;
        this.field1783 = arg4;
    }
}
