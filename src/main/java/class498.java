import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class498 {

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "[I")
    public static int[] field7097 = new int[2048];

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "J")
    public static long field7095 = 0L;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field7096 = 0;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "I")
    private int field7098;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public int field7100;

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
    public static void method2994(int arg0) {
        field7097 = null;
        if (arg0 != 2) {
            method2994(71);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)V")
    public final void method2995(int arg0, int arg1) {
        this.field7098 = 0;
        this.field7100 = arg1;
        if (arg0 != -25629) {
            field7097 = null;
        }
        field7094++;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZI[B)V")
    public static final void method2996(boolean arg0, int arg1, byte[] arg2) {
        if (class168.field2473 == null) {
            class168.field2473 = new class35(20000);
        }
        field7104++;
        class168.field2473.method283(arg1, (byte) 114, arg2, arg2.length);
        if (!arg0) {
            return;
        }
        class615.method3537(class168.field2473.field483, (byte) -81);
        class261.field3819 = new class483[class660.field9306];
        int var3 = 0;
        for (int var4 = class453.field6399; var4 <= class66.field1199; var4++) {
            class483 var5 = class66.method696(var4, (byte) -103);
            if (var5 != null) {
                class261.field3819[var3++] = var5;
            }
        }
        class540.field7594 = false;
        class560.field7957 = class742.method4128(1);
        class168.field2473 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIII)Z")
    public final boolean method2997(int arg0, int arg1, int arg2, int arg3) {
        field7101++;
        int var5 = this.field7098;
        if (this.field7100 == arg2 && this.field7098 == 0) {
            return false;
        }
        boolean var8;
        if (this.field7098 == 0) {
            if (this.field7100 < arg2 && this.field7100 + arg1 >= arg2 || arg2 < this.field7100 && this.field7100 - arg1 <= arg2) {
                this.field7100 = arg2;
                return false;
            }
            var8 = true;
        } else if (this.field7098 > 0 && this.field7100 < arg2) {
            int var6 = this.field7098 * this.field7098 / (arg1 * 2);
            int var7 = this.field7100 + var6;
            if (var7 < arg2 && this.field7100 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field7098 < 0 && arg2 < this.field7100) {
            int var9 = this.field7098 * this.field7098 / (arg1 * 2);
            int var10 = this.field7100 - var9;
            if (var10 > arg2 && this.field7100 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field7100 >= arg2) {
                this.field7098 -= arg1;
                if (arg0 != 0 && -arg0 > this.field7098) {
                    this.field7098 = -arg0;
                }
            } else {
                this.field7098 += arg1;
                if (arg0 != 0 && arg0 < this.field7098) {
                    this.field7098 = arg0;
                }
            }
            if (this.field7098 != var5) {
                int var11 = this.field7098 * this.field7098 / (arg1 * 2);
                if (this.field7100 < arg2) {
                    if (arg2 < this.field7100 + var11) {
                        this.field7098 = var5;
                    }
                } else if (arg2 < this.field7100 && arg2 > this.field7100 - var11) {
                    this.field7098 = var5;
                }
            }
        } else if (this.field7098 > 0) {
            this.field7098 -= arg1;
            if (this.field7098 < 0) {
                this.field7098 = 0;
            }
        } else {
            this.field7098 += arg1;
            if (this.field7098 > 0) {
                this.field7098 = 0;
            }
        }
        this.field7100 += this.field7098 + var5 >> 1;
        if (arg3 != -4674) {
            this.method2995(76, -14);
        }
        return var8;
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
    public final void method2998(int arg0) {
        this.field7100 &= arg0;
        field7102++;
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)I")
    public final int method2999(int arg0) {
        field7103++;
        if (arg0 != 16383) {
            method2994(16);
        }
        return this.field7100 & 0x3FFF;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZIII)I")
    public static final int method3000(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            return 107;
        }
        field7099++;
        if (arg2 >= arg3) {
            return arg2 > arg1 ? arg1 : arg2;
        } else {
            return arg3;
        }
    }
}
