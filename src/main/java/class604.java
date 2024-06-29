import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class604 extends class321 {

    @OriginalMember(owner = "client!ida", name = "w", descriptor = "I")
    public int field8725 = -1;

    @OriginalMember(owner = "client!ida", name = "v", descriptor = "I")
    public int field8724 = 0;

    @OriginalMember(owner = "client!ida", name = "x", descriptor = "Z")
    public boolean field8726 = true;

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "I")
    public int field8728 = 0;

    @OriginalMember(owner = "client!ida", name = "u", descriptor = "I")
    public int field8723 = 12800;

    @OriginalMember(owner = "client!ida", name = "F", descriptor = "I")
    public int field8734 = 12800;

    @OriginalMember(owner = "client!ida", name = "H", descriptor = "I")
    public int field8736 = -1;

    @OriginalMember(owner = "client!ida", name = "D", descriptor = "I")
    public int field8732;

    @OriginalMember(owner = "client!ida", name = "C", descriptor = "Ljava/lang/String;")
    public String field8731;

    @OriginalMember(owner = "client!ida", name = "B", descriptor = "I")
    public int field8730;

    @OriginalMember(owner = "client!ida", name = "I", descriptor = "Ljava/lang/String;")
    public String field8737;

    @OriginalMember(owner = "client!ida", name = "L", descriptor = "Ldc;")
    public class302 field8739;

    @OriginalMember(owner = "client!ida", name = "y", descriptor = "[I")
    public static int[] field8727 = new int[250];

    @OriginalMember(owner = "client!ida", name = "A", descriptor = "Lmb;")
    public static class383 field8729 = new class383();

    @OriginalMember(owner = "client!ida", name = "t", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!ida", name = "E", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!ida", name = "G", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!ida", name = "K", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!ida", name = "M", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!ida", name = "N", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)V", line = 8)
    public final void method3444(byte arg0) {
        this.field8723 = 12800;
        field8741++;
        this.field8734 = 12800;
        this.field8724 = 0;
        this.field8728 = 0;
        for (class468 var2 = (class468) this.field8739.method1904(false); var2 != null; var2 = (class468) this.field8739.method1901(116)) {
            if (this.field8724 < var2.field6737) {
                this.field8724 = var2.field6737;
            }
            if (var2.field6731 > this.field8728) {
                this.field8728 = var2.field6731;
            }
            if (this.field8723 > var2.field6728) {
                this.field8723 = var2.field6728;
            }
            if (this.field8734 > var2.field6727) {
                this.field8734 = var2.field6727;
            }
        }
        int var3 = 15 / ((arg0 + 22) / 40);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(III[I)Z", line = 42)
    public final boolean method3445(int arg0, int arg1, int arg2, int[] arg3) {
        field8735++;
        if (arg2 != -6410) {
            return true;
        }
        for (class468 var5 = (class468) this.field8739.method1904(false); var5 != null; var5 = (class468) this.field8739.method1901(120)) {
            if (var5.method2705(true, arg1, arg0)) {
                var5.method2704((byte) 27, arg0, arg3, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BI)I", line = 76)
    public static final int method3446(byte arg0, int arg1) {
        if (arg0 != -48) {
            field8727 = null;
        }
        field8740++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "([IIII)Z", line = 112)
    public final boolean method3447(int[] arg0, int arg1, int arg2, int arg3) {
        field8722++;
        for (class468 var5 = (class468) this.field8739.method1904(false); var5 != null; var5 = (class468) this.field8739.method1901(107)) {
            if (var5.method2701(-28440, arg2, arg1)) {
                var5.method2703(arg0, arg2, arg1, true);
                return true;
            }
        }
        if (arg3 != -6038) {
            this.field8728 = -122;
        }
        return false;
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 235)
    public class604(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field8725 = arg4;
        this.field8732 = arg3;
        this.field8731 = arg2;
        this.field8730 = arg0;
        this.field8737 = arg1;
        this.field8736 = arg6;
        this.field8726 = arg5;
        if (this.field8736 == 255) {
            this.field8736 = 0;
        }
        this.field8739 = new class302();
    }

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "(B)V", line = 146)
    public static void method3448(byte arg0) {
        if (arg0 == -64) {
            field8729 = null;
            field8727 = null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)Z", line = 171)
    public final boolean method3449(int arg0, int arg1, int arg2) {
        field8733++;
        for (class468 var4 = (class468) this.field8739.method1904(false); var4 != null; var4 = (class468) this.field8739.method1901(117)) {
            if (var4.method2705(true, arg2, arg1)) {
                return true;
            }
        }
        return arg0 != 1;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIBI[I)Z", line = 194)
    public final boolean method3450(int arg0, int arg1, byte arg2, int arg3, int[] arg4) {
        field8738++;
        if (arg2 < 57) {
            method3448((byte) -83);
        }
        for (class468 var6 = (class468) this.field8739.method1904(false); var6 != null; var6 = (class468) this.field8739.method1901(115)) {
            if (var6.method2702(arg1, arg3, arg0, -6636)) {
                var6.method2704((byte) 27, arg3, arg4, arg1);
                return true;
            }
        }
        return false;
    }
}
