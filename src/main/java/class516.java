import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class516 {

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    private int field7044;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public int field7046;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V", line = 3)
    public final void method2944(int arg0, int arg1) {
        if (arg1 == -6011) {
            this.field7044 = 0;
            field7043++;
            this.field7046 = arg0;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIII)Z", line = 16)
    public final boolean method2945(int arg0, int arg1, int arg2, int arg3) {
        field7049++;
        int var5 = this.field7044;
        if (this.field7046 == arg2 && this.field7044 == 0) {
            return false;
        }
        boolean var8;
        if (this.field7044 == 0) {
            if (arg2 > this.field7046 && arg2 <= this.field7046 + arg3 || arg2 < this.field7046 && (this.field7046 - arg3) <= arg2) {
                this.field7046 = arg2;
                return false;
            }
            var8 = true;
        } else if (this.field7044 > 0 && this.field7046 < arg2) {
            int var6 = this.field7044 * this.field7044 / (arg3 * 2);
            int var7 = this.field7046 + var6;
            if (arg2 > var7 && this.field7046 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field7044 < 0 && this.field7046 > arg2) {
            int var9 = this.field7044 * this.field7044 / (arg3 * 2);
            int var10 = this.field7046 - var9;
            if (var10 > arg2 && var10 <= this.field7046) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg2 > this.field7046) {
                this.field7044 += arg3;
                if (arg1 != 0 && this.field7044 > arg1) {
                    this.field7044 = arg1;
                }
            } else {
                this.field7044 -= arg3;
                if (arg1 != 0 && -arg1 > this.field7044) {
                    this.field7044 = -arg1;
                }
            }
            if (this.field7044 != var5) {
                int var11 = this.field7044 * this.field7044 / (arg3 * 2);
                if (this.field7046 < arg2) {
                    if (arg2 < (this.field7046 + var11)) {
                        this.field7044 = var5;
                    }
                } else if (arg2 < this.field7046 && this.field7046 - var11 < arg2) {
                    this.field7044 = var5;
                }
            }
        } else if (this.field7044 <= 0) {
            this.field7044 += arg3;
            if (this.field7044 > 0) {
                this.field7044 = 0;
            }
        } else {
            this.field7044 -= arg3;
            if (this.field7044 < 0) {
                this.field7044 = 0;
            }
        }
        int var12 = -42 / ((arg0 + 65) / 37);
        this.field7046 += this.field7044 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V", line = 158)
    public static final void method2946(byte arg0) {
        if (arg0 != 101) {
            method2946((byte) 103);
        }
        field7047++;
        for (class539 var1 = (class539) class393.field5553.method1436(28964); var1 != null; var1 = (class539) class393.field5553.method1443((byte) 6)) {
            class284 var2 = var1.field7278;
            if (var2.field3879) {
                var1.method2340(arg0 ^ 0xFFFFFFFB);
                var2.method1752(2048);
            } else if (var2.field3892 <= class186.field2697) {
                var2.method1749(class41.field479, 0);
                if (var2.field3879) {
                    var1.method2340(-119);
                } else {
                    class190.method1291(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)I", line = 198)
    public final int method2947(int arg0) {
        if (arg0 != 8720) {
            this.field7044 = -109;
        }
        field7045++;
        return this.field7046 & 0x3FFF;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V", line = 209)
    public final void method2948(int arg0) {
        this.field7046 &= 0x3FFF;
        if (arg0 != -31225) {
            this.field7044 = -103;
        }
        field7048++;
    }
}
