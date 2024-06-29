import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class441 {

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    private int field6054;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "[Lge;")
    private class499[] field6053;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "Lvj;")
    public static class304 field6045 = new class304(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!go", name = "j", descriptor = "Z")
    public static boolean field6050 = false;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Z")
    public static boolean field6048 = false;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "Z")
    public static boolean field6052 = true;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "J")
    private long field6046;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "Las;")
    public static class104 field6049;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "Lge;")
    private class499 field6043;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "[I")
    public static int[] field6051;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
    public static void method2540(boolean arg0) {
        field6045 = null;
        if (!arg0) {
            field6052 = false;
        }
        field6049 = null;
        field6051 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(JLge;I)V")
    public final void method2541(long arg0, class499 arg1, int arg2) {
        if (arg1.field6900 != null) {
            arg1.method2856(0);
        }
        field6042++;
        class499 var5 = this.field6053[(int) (arg0 & (long) (this.field6054 + arg2))];
        arg1.field6903 = var5;
        arg1.field6900 = var5.field6900;
        arg1.field6900.field6903 = arg1;
        arg1.field6896 = arg0;
        arg1.field6903.field6900 = arg1;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IJ)Lge;")
    public final class499 method2542(int arg0, long arg1) {
        if (arg0 != -31) {
            return null;
        }
        field6047++;
        this.field6046 = arg1;
        class499 var4 = this.field6053[(int) ((long) (this.field6054 - 1) & arg1)];
        for (this.field6043 = var4.field6903; this.field6043 != var4; this.field6043 = this.field6043.field6903) {
            if (this.field6043.field6896 == arg1) {
                class499 var5 = this.field6043;
                this.field6043 = this.field6043.field6903;
                return var5;
            }
        }
        this.field6043 = null;
        return null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public static final void method2543(byte arg0) {
        field6055++;
        if (class281.field3698 == class132.field1908) {
            return;
        }
        if (arg0 != 99) {
            method2540(false);
        }
        try {
            class87.method637(arg0 - 193, class170.field2476, "tbrefresh");
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Lge;")
    public final class499 method2544(int arg0) {
        field6044++;
        if (this.field6043 == null) {
            return null;
        }
        int var2 = -53 % ((29 - arg0) / 63);
        class499 var3 = this.field6053[(int) ((long) (this.field6054 - 1) & this.field6046)];
        while (this.field6043 != var3) {
            if (this.field6043.field6896 == this.field6046) {
                class499 var4 = this.field6043;
                this.field6043 = this.field6043.field6903;
                return var4;
            }
            this.field6043 = this.field6043.field6903;
        }
        this.field6043 = null;
        return null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BLmd;)Luc;")
    public static final class23 method2545(byte arg0, class379 arg1) {
        field6041++;
        if (arg0 >= -78) {
            field6045 = null;
        }
        return new class23(arg1.method2202(-26372), arg1.method2202(-26372), arg1.method2202(-26372), arg1.method2202(-26372), arg1.method2202(-26372), arg1.method2202(-26372), arg1.method2202(-26372), arg1.method2202(-26372), arg1.method2249((byte) 89), arg1.method2238(255));
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(I)V")
    public class441(int arg0) {
        this.field6054 = arg0;
        this.field6053 = new class499[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class499 var3 = this.field6053[var2] = new class499();
            var3.field6903 = var3;
            var3.field6900 = var3;
        }
    }
}
