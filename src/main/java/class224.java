import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class224 extends class182 {

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    private int field3776 = 204;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    private int field3781 = 1;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    private int field3780 = 1;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public static int field3774 = 0;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "Z")
    public static boolean field3777 = false;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field3778 = 0;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "Ljava/lang/String;")
    public static String field3783 = "wave2:";

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "I")
    public static int field3785 = 1;

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field3786 = "purple:";

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "(I)Ljava/lang/String;")
    public static final String method1588(int arg0) {
        ++field3782;
        String var1 = "www";
        if (~class27.field470 != -1) {
            var1 = "www-wtqa";
        }
        if (arg0 <= 23) {
            method1590(-107);
        }
        String var2 = "";
        if (class103.field1649 != null) {
            var2 = "/p=" + class103.field1649;
        }
        return "http://" + var1 + ".runescape.com/l=" + class49.field834 + "/a=" + class105.field1736 + var2 + "/";
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3776 = arg1.method1821((byte) 51);
                }
            } else {
                this.field3781 = arg1.method1802((byte) 115);
            }
        } else {
            this.field3780 = arg1.method1802((byte) -112);
        }
        if (arg0) {
            method1588(70);
        }
        ++field3779;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIB)I")
    public static final int method1589(int arg0, int arg1, byte arg2) {
        int var3 = -20 / ((75 - arg2) / 34);
        ++field3784;
        int var4 = arg1 + -1 & arg0 >> 31;
        return ((arg0 >>> 31) + arg0) % arg1 - -var4;
    }

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "(I)V")
    public static void method1590(int arg0) {
        field3783 = null;
        field3786 = null;
        if (arg0 >= -127) {
            field3786 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class224() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        if (arg0) {
            method1588(-99);
        }
        ++field3775;
        int[] var3 = super.field2911.method77(arg1, -80);
        if (super.field2911.field287) {
            for (int var4 = 0; ~class4.field116 < ~var4; ++var4) {
                int var5 = class207.field3415[var4];
                int var6 = var5 % (4096 / this.field3780) * this.field3780;
                int var7 = this.field3780 * var5 >> 12;
                int var8 = class66.field1112[arg1];
                int var9 = this.field3781 * var8 >> 12;
                int var10 = var8 % (4096 / this.field3781) * this.field3781;
                if (var10 < this.field3776) {
                    for (var7 -= var9; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var6 > ~this.field3776) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var6 < this.field3776) {
                    int var11;
                    for (var11 = var7 - var9; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }
}
