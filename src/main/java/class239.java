import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class239 {

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "Lse;")
    private class332 field3375;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "Lje;")
    private class300 field3372;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "Lag;")
    private class302 field3374;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3370 = "green:";

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field3379 = 0;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "Lil;")
    private class265 field3376;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "[Lkk;")
    private class372[] field3371;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljb;ZILjb;I)Lkk;")
    private final class372 method1484(class425 arg0, boolean arg1, int arg2, class425 arg3, int arg4) {
        field3378++;
        if (this.field3376 == null) {
            throw new RuntimeException();
        }
        this.field3376.field3915 = arg2 * 8 + 5;
        if (this.field3376.field3915 >= this.field3376.field3879.length) {
            throw new RuntimeException();
        } else if (this.field3371[arg2] == null) {
            int var6 = this.field3376.method1666(arg4 + 32066);
            if (arg4 == -32068) {
                int var7 = this.field3376.method1666(-2);
                class372 var8 = new class372(arg2, arg0, arg3, this.field3375, this.field3372, var6, var7, arg1);
                this.field3371[arg2] = var8;
                return var8;
            } else {
                return null;
            }
        } else {
            return this.field3371[arg2];
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
    public static void method1485(byte arg0) {
        if (arg0 != 0) {
            field3370 = null;
        }
        field3370 = null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public final void method1486(int arg0) {
        field3380++;
        if (this.field3371 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3371.length; var2++) {
            if (this.field3371[var2] != null) {
                this.field3371[var2].method2452((byte) 2);
            }
        }
        for (int var3 = 0; var3 < this.field3371.length; var3++) {
            if (this.field3371[var3] != null) {
                this.field3371[var3].method2444(false);
            }
        }
        if (arg0 < 65) {
            field3370 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BILjb;Ljb;)Lkk;")
    public final class372 method1487(byte arg0, int arg1, class425 arg2, class425 arg3) {
        field3373++;
        return arg0 <= 43 ? null : this.method1484(arg3, true, arg1, arg2, -32068);
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lse;Lje;)V")
    public class239(class332 arg0, class300 arg1) {
        this.field3375 = arg0;
        this.field3372 = arg1;
        if (!this.field3375.method2201(-27332)) {
            this.field3374 = this.field3375.method2200(255, true, (byte) 0, 255, 20);
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)Z")
    public final boolean method1488(byte arg0) {
        if (arg0 != -90) {
            this.method1484((class425) null, true, -2, (class425) null, 108);
        }
        field3377++;
        if (this.field3376 != null) {
            return true;
        }
        if (this.field3374 == null) {
            if (this.field3375.method2201(-27332)) {
                return false;
            }
            this.field3374 = this.field3375.method2200(255, true, (byte) 0, 255, 20);
        }
        if (this.field3374.field5481) {
            return false;
        } else {
            this.field3376 = new class265(this.field3374.method461(6));
            this.field3371 = new class372[(this.field3376.field3879.length - 5) / 8];
            return true;
        }
    }
}
