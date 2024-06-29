import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class199 {

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lqi;")
    private class259 field3559;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Lae;")
    private class238 field3562;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lqb;")
    private class84 field3558;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lvf;")
    public static class265 field3556 = class87.method582(-46, "Veuillez patienter )2 tentative de r-Btablissement)3");

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lvf;")
    public static class265 field3550 = class87.method582(-46, "Mem:");

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lng;")
    private class135 field3554;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "[I")
    public static int[] field3553;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "[Lse;")
    private class10[] field3564;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Li;Li;ZBI)Lse;")
    private final class10 method1370(class182 arg0, class182 arg1, boolean arg2, byte arg3, int arg4) {
        field3555++;
        if (this.field3554 == null) {
            throw new RuntimeException();
        }
        this.field3554.field2449 = arg4 * 8 + 5;
        if (this.field3554.field2483.length <= this.field3554.field2449) {
            throw new RuntimeException();
        } else if (this.field3564[arg4] == null) {
            int var6 = this.field3554.method949(arg3 + 3958);
            if (arg3 != -25) {
                this.field3554 = null;
            }
            int var7 = this.field3554.method949(3933);
            class10 var8 = new class10(arg4, arg0, arg1, this.field3559, this.field3562, var6, var7, arg2);
            this.field3564[arg4] = var8;
            return var8;
        } else {
            return this.field3564[arg4];
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZLte;Lfl;Lfl;B)V")
    public static final void method1371(boolean arg0, class251 arg1, class192 arg2, class192 arg3, byte arg4) {
        class277.field4903 = arg2;
        class281.field4956 = arg0;
        field3551++;
        class195.field3502 = arg3;
        int var5 = class277.field4903.method1315(0) - 1;
        class97.field1718 = class277.field4903.method1331(var5, (byte) 122) + var5 * 256;
        class169.field3065 = arg1;
        if (arg4 != 8) {
            method1371(true, (class251) null, (class192) null, (class192) null, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public final void method1372(int arg0) {
        field3549++;
        if (this.field3564 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3564.length; var2++) {
            if (this.field3564[var2] != null) {
                this.field3564[var2].method86(true);
            }
        }
        for (int var3 = arg0; var3 < this.field3564.length; var3++) {
            if (this.field3564[var3] != null) {
                this.field3564[var3].method73(false);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public static final void method1373(int arg0) {
        if (arg0 >= 54) {
            field3560++;
            class145.method1007(false, 179);
            System.gc();
            class70.method497(116, 25);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method1374(byte arg0) {
        field3553 = null;
        if (arg0 != -122) {
            method1371(false, (class251) null, (class192) null, (class192) null, (byte) -104);
        }
        field3556 = null;
        field3550 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Li;BLi;I)Lse;")
    public final class10 method1375(class182 arg0, byte arg1, class182 arg2, int arg3) {
        field3561++;
        if (arg1 != 82) {
            this.method1376(true);
        }
        return this.method1370(arg2, arg0, true, (byte) -25, arg3);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Z")
    public final boolean method1376(boolean arg0) {
        field3552++;
        if (!arg0) {
            this.method1372(-123);
        }
        if (this.field3554 != null) {
            return true;
        }
        if (this.field3558 == null) {
            if (this.field3559.method1709(20)) {
                return false;
            }
            this.field3558 = this.field3559.method1715(255, 255, true, true, (byte) 0);
        }
        if (this.field3558.field1315) {
            return false;
        } else {
            this.field3554 = new class135(this.field3558.method493(77));
            this.field3564 = new class10[(this.field3554.field2483.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lqi;Lae;)V")
    public class199(class259 arg0, class238 arg1) {
        this.field3559 = arg0;
        this.field3562 = arg1;
        if (!this.field3559.method1709(20)) {
            this.field3558 = this.field3559.method1715(255, 255, true, true, (byte) 0);
        }
    }
}
