import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class104 extends class172 {

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "Lac;")
    public class135 field1817;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "Lid;")
    public static class149 field1813 = class60.method382("null", (byte) 46);

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field1814 = 0;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "Lid;")
    public static class149 field1818 = class60.method382("Chargement du module texte )2 ", (byte) 83);

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "Lid;")
    public static class149 field1821 = class60.method382("Prendre", (byte) 41);

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "Z")
    public static boolean field1819 = false;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)I")
    public static final int method733(int arg0) {
        field1820++;
        return arg0 == 100 ? 2 : 124;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
    public static void method734(int arg0) {
        field1813 = null;
        if (arg0 != -1) {
            field1814 = -54;
        }
        field1821 = null;
        field1818 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)Z")
    public static final boolean method735(int arg0, boolean arg1) {
        field1822++;
        if (class226.field3953[arg0]) {
            return true;
        } else if (class45.field688.method1558((byte) 109, arg0)) {
            int var2 = class45.field688.method1559(arg0, 64);
            if (var2 == 0) {
                class226.field3953[arg0] = true;
                return true;
            }
            if (class14.field206[arg0] == null) {
                class14.field206[arg0] = new class47[var2];
            }
            if (arg1) {
                return true;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class14.field206[arg0][var3] == null) {
                    byte[] var4 = class45.field688.method1562(-809612665, var3, arg0);
                    if (var4 != null) {
                        class47 var5 = class14.field206[arg0][var3] = new class47();
                        var5.field834 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method304(20327, new class74(var4));
                        } else {
                            var5.method299(-5, new class74(var4));
                        }
                    }
                }
            }
            class226.field3953[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)V")
    public static final void method736(byte arg0, int arg1) {
        if (arg0 != -113) {
            method738((byte) -98);
        }
        field1823++;
        class216 var2 = class139.method972(arg1, false, 11);
        var2.method1457(0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lal;I)V")
    public static final void method737(class230 arg0, int arg1) {
        field1824++;
        if (arg1 != -51) {
            method735(-108, false);
        }
        class47.field802 = arg0;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lac;)V")
    public class104(class135 arg0) {
        this.field1817 = arg0;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)V")
    public static final void method738(byte arg0) {
        field1815++;
        if (arg0 == -3) {
            class9.field118.method1290((byte) 30);
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IZ)V")
    public static final void method739(int arg0, boolean arg1) {
        class129.field2285 = -1;
        if (arg0 == 37) {
            class199.field3616 = 3.0F;
        } else if (arg0 == 50) {
            class199.field3616 = 4.0F;
        } else if (arg0 == 75) {
            class199.field3616 = 6.0F;
        } else if (arg0 == 100) {
            class199.field3616 = 8.0F;
        } else if (arg0 == 200) {
            class199.field3616 = 16.0F;
        }
        class129.field2285 = -1;
        field1816++;
        if (!arg1) {
            field1819 = false;
        }
    }
}
