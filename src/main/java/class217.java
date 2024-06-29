import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class217 extends class477 {

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "I")
    public static int field2795 = 0;

    @OriginalMember(owner = "client!dp", name = "I", descriptor = "I")
    public static int field2805 = 999999;

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!dp", name = "z", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!dp", name = "E", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!dp", name = "F", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!dp", name = "G", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!dp", name = "J", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!dp", name = "C", descriptor = "J")
    public static long field2799;

    @OriginalMember(owner = "client!dp", name = "A", descriptor = "Ljava/lang/String;")
    public String field2798;

    @OriginalMember(owner = "client!dp", name = "y", descriptor = "[C")
    public char[] field2796;

    @OriginalMember(owner = "client!dp", name = "H", descriptor = "[C")
    public char[] field2804;

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "[I")
    public int[] field2794;

    @OriginalMember(owner = "client!dp", name = "D", descriptor = "[I")
    public int[] field2800;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ldga;I)V")
    public final void method1337(class138 arg0, int arg1) {
        field2802++;
        while (true) {
            int var3 = arg0.method957((byte) -78);
            if (var3 == 0) {
                if (arg1 == 3) {
                    return;
                } else {
                    this.field2798 = null;
                    return;
                }
            }
            this.method1339((byte) -106, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(CI)I")
    public final int method1338(char arg0, int arg1) {
        field2797++;
        if (this.field2800 == null) {
            return -1;
        }
        if (arg1 < 30) {
            this.field2804 = null;
        }
        for (int var3 = 0; var3 < this.field2800.length; var3++) {
            if (this.field2796[var3] == arg0) {
                return this.field2800[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BILdga;)V")
    private final void method1339(byte arg0, int arg1, class138 arg2) {
        if (arg0 != -106) {
            this.method1338('0', -77);
        }
        field2806++;
        if (arg1 == 1) {
            this.field2798 = arg2.method907(false);
        } else if (arg1 == 2) {
            int var4 = arg2.method957((byte) -87);
            this.field2800 = new int[var4];
            this.field2796 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2800[var5] = arg2.method922((byte) -128);
                byte var6 = arg2.method950(false);
                this.field2796[var5] = var6 == 0 ? 0 : class679.method3748(var6, -161);
            }
        } else if (arg1 == 3) {
            int var7 = arg2.method957((byte) -75);
            this.field2794 = new int[var7];
            this.field2804 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2794[var8] = arg2.method922((byte) -114);
                byte var9 = arg2.method950(false);
                this.field2804[var8] = var9 == 0 ? 0 : class679.method3748(var9, -161);
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public final void method1340(int arg0) {
        if (this.field2794 != null) {
            for (int var2 = 0; var2 < this.field2794.length; var2++) {
                this.field2794[var2] = class288.method1722(this.field2794[var2], 32768);
            }
        }
        if (arg0 != 0) {
            return;
        }
        field2801++;
        if (this.field2800 != null) {
            for (int var3 = 0; var3 < this.field2800.length; var3++) {
                this.field2800[var3] = class288.method1722(this.field2800[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(CI)I")
    public final int method1341(char arg0, int arg1) {
        field2803++;
        if (arg1 <= 113) {
            this.method1341((char) 65435, -121);
        }
        if (this.field2794 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2794.length; var3++) {
            if (this.field2804[var3] == arg0) {
                return this.field2794[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)Z")
    public static final boolean method1342(int arg0, int arg1, int arg2) {
        if (arg2 != 384) {
            field2795 = 73;
        }
        field2793++;
        return (arg1 & 0x180) != 0;
    }
}
