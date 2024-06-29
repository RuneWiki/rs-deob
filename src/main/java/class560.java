import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class560 extends class3 {

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "Lfha;")
    private class522 field7951 = new class522();

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "I")
    private int field7967 = 256;

    @OriginalMember(owner = "client!vp", name = "L", descriptor = "I")
    private int field7969 = 256;

    @OriginalMember(owner = "client!vp", name = "M", descriptor = "I")
    private int field7970 = 0;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
    private int field7959;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "Lbfa;")
    public static class574 field7954 = new class574();

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "[I")
    public static int[] field7960 = new int[] { 25000, 2000 };

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field7949;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
    public static int field7952;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
    public static int field7955;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "I")
    public static int field7964;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
    public static int field7965;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
    private int field7966;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "Lcd;")
    public static class22 field7963;

    @OriginalMember(owner = "client!vp", name = "K", descriptor = "Z")
    private boolean field7968;

    @OriginalMember(owner = "client!vp", name = "N", descriptor = "Z")
    private boolean field7971;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZ)V")
    public final synchronized void method3348(int arg0, boolean arg1) {
        if (arg0 == 0) {
            this.field7971 = arg1;
            field7961++;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "()Lua;")
    public final class3 method4() {
        field7965++;
        return null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    private final synchronized void method3349(byte arg0) {
        int var2 = -48 / ((1 - arg0) / 61);
        field7955++;
        class16 var3 = this.method3353(false);
        if (var3 != null) {
            var3.method3065(-17363);
            this.field7970--;
            this.field7966 = 0;
            class162.field2241.method2764(var3.method81((byte) 98), var3, -4900);
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)I")
    public final synchronized int method3350(byte arg0) {
        field7958++;
        return arg0 > -82 ? -59 : this.field7970;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    public final synchronized void method6(int arg0) {
        field7953++;
        if (this.field7971) {
            return;
        }
        while (true) {
            class16 var2 = this.method3353(false);
            if (var2 == null) {
                if (this.field7968) {
                    this.method3065(-17363);
                    class162.field2241.method2762((byte) -126);
                }
                return;
            }
            if (var2.field208[0].length - this.field7966 > arg0) {
                this.field7966 += arg0;
                return;
            }
            arg0 -= var2.field208[0].length - this.field7966;
            this.method3349((byte) 118);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(DII)Lnq;")
    public final class16 method3351(double arg0, int arg1, int arg2) {
        field7956++;
        long var5 = (long) (arg1 | this.field7959 << 0);
        if (arg2 != -661362368) {
            return null;
        }
        class16 var7 = (class16) class162.field2241.method2761((byte) 94, var5);
        if (var7 == null) {
            var7 = new class16(new short[this.field7959][arg1], arg0);
        } else {
            var7.field205 = arg0;
            class162.field2241.method2763(var5, (byte) -93);
        }
        return var7;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
    public final void method3352(int arg0, int arg1) {
        this.field7967 = arg1;
        field7947++;
        this.field7969 = arg1;
        if (arg0 != 30693) {
            this.field7967 = 106;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)Lnq;")
    private final synchronized class16 method3353(boolean arg0) {
        if (arg0) {
            this.method3352(-123, 38);
        }
        field7952++;
        return (class16) this.field7951.method3118((byte) 73);
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "()I")
    public final int method5() {
        field7950++;
        return 1;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V")
    public static void method3354(int arg0) {
        field7954 = null;
        if (arg0 == 0) {
            field7960 = null;
            field7963 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "(I)D")
    public final synchronized double method3355(int arg0) {
        if (arg0 != 29733) {
            return 0.18148803663589044D;
        }
        field7957++;
        if (this.field7970 < 1) {
            return -1.0D;
        } else {
            class16 var2 = (class16) this.field7951.method3118((byte) 73);
            return var2 == null ? -1.0D : var2.field205 - (double) ((float) var2.field208[0].length / (float) class757.field10509);
        }
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "()Lua;")
    public final class3 method8() {
        field7962++;
        return null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lnq;B)V")
    public final synchronized void method3356(class16 arg0, byte arg1) {
        while (this.field7970 >= 100) {
            this.field7951.method3115(true);
            this.field7970--;
        }
        field7946++;
        this.field7951.method3116(29066, arg0);
        this.field7970++;
        int var3 = 58 % ((arg1 - 39) / 62);
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(B)V")
    public final synchronized void method3357(byte arg0) {
        this.field7968 = true;
        field7948++;
        if (arg0 >= -29) {
            this.method4();
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "([III)V")
    public final synchronized void method10(int[] arg0, int arg1, int arg2) {
        field7949++;
        if (this.field7971) {
            return;
        }
        if (this.method3353(false) != null) {
            int var4 = arg1 + arg2;
            if (class379.field5336) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field7959 == 2) {
                var6 = 1;
            }
            while (arg1 < var4) {
                class16 var7 = this.method3353(false);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field208;
                while (arg1 < var4 && var8[0].length > this.field7966) {
                    if (class379.field5336) {
                        arg0[arg1++] = var8[var5][this.field7966] * this.field7969;
                        arg0[arg1++] = var8[var6][this.field7966] * this.field7967;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field7966] * this.field7969 + (var8[var6][this.field7966] * this.field7967);
                    }
                    this.field7966++;
                }
                if (var8[0].length <= this.field7966) {
                    this.method3349((byte) 105);
                }
            }
        } else if (this.field7968) {
            this.method3065(-17363);
            class162.field2241.method2762((byte) -33);
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(I)V")
    public class560(int arg0) {
        this.field7959 = arg0;
    }
}
