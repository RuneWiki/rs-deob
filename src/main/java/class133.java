import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class133 {

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    private int field1768 = 0;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "Lica;")
    private class205 field1757;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "[F")
    public static float[] field1756 = new float[4];

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "Lmba;")
    public static class203 field1764 = new class203();

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1767 = null;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "Lqa;")
    public static class167 field1758;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "Ljd;")
    private class496 field1759;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)[Lvv;")
    public static final class640[] method811(byte arg0) {
        if (arg0 >= -92) {
            method812(-74, -103, -85);
        }
        field1762++;
        return new class640[] { class640.field9303, class462.field6679, class377.field5548 };
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)Z")
    public static final boolean method812(int arg0, int arg1, int arg2) {
        field1763++;
        if (!class309.method1899(arg2, (byte) -93, arg0)) {
            return false;
        } else if (arg1 == 5) {
            return class200.method1297(arg2, arg0, (byte) -27) | (arg0 & 0xB000) != 0 | class542.method3184(6, arg0, arg2) ? true : (class587.method3425(arg2, arg0, 47) | class281.method1769(-3273, arg2, arg0)) & (arg2 & 0x37) == 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)Ljd;")
    public final class496 method813(int arg0) {
        if (arg0 < 26) {
            method815((byte) -126, null);
        }
        field1769++;
        if (this.field1768 > 0 && this.field1757.field3046[this.field1768 - 1] != this.field1759) {
            class496 var2 = this.field1759;
            this.field1759 = var2.field7469;
            return var2;
        }
        while (this.field1757.field3047 > this.field1768) {
            class496 var3 = this.field1757.field3046[this.field1768++].field7469;
            if (this.field1757.field3046[this.field1768 - 1] != var3) {
                this.field1759 = var3.field7469;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(III)V")
    public static final void method814(int arg0, int arg1, int arg2) {
        field1765++;
        class621 var3 = class442.method2691(arg2, 16, true);
        var3.method3592((byte) 121);
        if (arg0 != 5) {
            method816((byte) 84);
        }
        var3.field9068 = arg1;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method815(byte arg0, String[] arg1) {
        field1761++;
        if (arg0 != 48) {
            field1758 = null;
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V")
    public static void method816(byte arg0) {
        field1764 = null;
        if (arg0 != -75) {
            field1766 = 101;
        }
        field1767 = null;
        field1758 = null;
        field1756 = null;
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "()V")
    public class133() {
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)Ljd;")
    public final class496 method817(int arg0) {
        this.field1768 = 0;
        if (arg0 != 26858) {
            field1770 = 64;
        }
        field1760++;
        return this.method813(arg0 ^ 0x6899);
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lica;)V")
    public class133(class205 arg0) {
        this.field1757 = arg0;
    }
}
