import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class629 extends class613 {

    @OriginalMember(owner = "client!go", name = "G", descriptor = "Lfh;")
    private class653 field8682 = new class653();

    @OriginalMember(owner = "client!go", name = "M", descriptor = "I")
    private int field8688 = 256;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    private int field8690 = 0;

    @OriginalMember(owner = "client!go", name = "N", descriptor = "I")
    private int field8689 = 256;

    @OriginalMember(owner = "client!go", name = "E", descriptor = "I")
    private int field8680;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!go", name = "v", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!go", name = "w", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!go", name = "z", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!go", name = "A", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!go", name = "B", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!go", name = "C", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!go", name = "D", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    private int field8685;

    @OriginalMember(owner = "client!go", name = "x", descriptor = "Lnd;")
    public static class547 field8673;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "Z")
    private boolean field8686;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "Z")
    private boolean field8687;

    @OriginalMember(owner = "client!go", name = "y", descriptor = "[I")
    public static int[] field8674;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field8664;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)I")
    public final synchronized int method3525(byte arg0) {
        if (arg0 > -124) {
            field8674 = null;
        }
        field8666++;
        return this.field8690;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "([III)V")
    public final synchronized void method338(int[] arg0, int arg1, int arg2) {
        field8665++;
        if (this.field8687) {
            return;
        }
        if (this.method3532((byte) 71) != null) {
            int var4 = arg1 + arg2;
            if (class360.field4662) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field8680 == 2) {
                var6 = 1;
            }
            while (var4 > arg1) {
                class562 var7 = this.method3532((byte) 113);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field7913;
                while (arg1 < var4 && var8[0].length > this.field8685) {
                    if (class360.field4662) {
                        arg0[arg1++] = var8[var5][this.field8685] * this.field8688;
                        arg0[arg1++] = var8[var6][this.field8685] * this.field8689;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field8685] * this.field8688 + var8[var6][this.field8685] * this.field8689;
                    }
                    this.field8685++;
                }
                if (this.field8685 >= var8[0].length) {
                    this.method3526(-26443);
                }
            }
        } else if (this.field8686) {
            this.method1175(-2);
            class89.field1232.method3965(false);
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "()Llea;")
    public final class613 method327() {
        field8684++;
        return null;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
    private final synchronized void method3526(int arg0) {
        field8667++;
        class562 var2 = this.method3532((byte) 118);
        if (var2 == null) {
            return;
        }
        var2.method1175(-2);
        this.field8685 = 0;
        if (arg0 != -26443) {
            this.method3525((byte) 7);
        }
        this.field8690--;
        class89.field1232.method3966(arg0 + 28110, var2.method3244(false), var2);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "()Llea;")
    public final class613 method317() {
        field8678++;
        return null;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)D")
    public final synchronized double method3527(int arg0) {
        field8676++;
        if (arg0 != 0) {
            return -0.904716528355287D;
        } else if (this.field8690 < 1) {
            return -1.0D;
        } else {
            class562 var2 = (class562) this.field8682.method3672(-1);
            return var2 == null ? -1.0D : var2.field7916 - (double) ((float) var2.field7913[0].length / (float) class541.field7490);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IDI)Ltv;")
    public final class562 method3528(int arg0, double arg1, int arg2) {
        field8681++;
        if (arg2 != 1871634688) {
            this.field8687 = false;
        }
        long var5 = (long) (this.field8680 << 0 | arg0);
        class562 var7 = (class562) class89.field1232.method3962(-113, var5);
        if (var7 == null) {
            var7 = new class562(new short[this.field8680][arg0], arg1);
        } else {
            var7.field7916 = arg1;
            class89.field1232.method3963(-72, var5);
        }
        return var7;
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "()I")
    public final int method349() {
        field8677++;
        return 1;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZB)V")
    public final synchronized void method3529(boolean arg0, byte arg1) {
        this.field8687 = arg0;
        field8675++;
        if (arg1 != 50) {
            this.method3526(-10);
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(B)V")
    public static final void method3530(byte arg0) {
        int var1 = 107 / ((arg0 - 16) / 46);
        class124.field1784 = 0;
        class405.field5127 = 0;
        field8671++;
        for (int var2 = 0; var2 < class405.field5126; var2++) {
            int var3 = class15.field303 * var2;
            for (int var4 = 0; var4 < class15.field303; var4++) {
                int var5 = var3 + var4;
                class313.field4093[var5].method2341(class409.field5194 * var4, class543.field7592 * var2, class409.field5194, class543.field7592, 0, 0, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
    public static void method3531(boolean arg0) {
        field8674 = null;
        field8664 = null;
        if (!arg0) {
            field8673 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(B)Ltv;")
    private final synchronized class562 method3532(byte arg0) {
        if (arg0 < 43) {
            field8664 = null;
        }
        field8663++;
        return (class562) this.field8682.method3672(-1);
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V")
    public static final void method3533(int arg0) {
        if (arg0 != 21562) {
            method3533(115);
        }
        field8679++;
        class609.field8448.method1240(false);
        int var1 = class609.field8448.method1235(8, -4080);
        if (var1 < class646.field8947) {
            for (int var2 = var1; var2 < class646.field8947; var2++) {
                class346.field4368[class701.field9759++] = class751.field10483[var2];
            }
        }
        if (class646.field8947 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class646.field8947 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class751.field10483[var3];
            class733 var5 = ((class592) class207.field2745.method1160((long) var4, arg0 - 21441)).field8280;
            int var6 = class609.field8448.method1235(1, arg0 - 25642);
            if (var6 == 0) {
                class751.field10483[class646.field8947++] = var4;
                var5.field231 = class194.field2656;
            } else {
                int var7 = class609.field8448.method1235(2, -4080);
                if (var7 == 0) {
                    class751.field10483[class646.field8947++] = var4;
                    var5.field231 = class194.field2656;
                    class414.field5284[class28.field502++] = var4;
                } else if (var7 == 1) {
                    class751.field10483[class646.field8947++] = var4;
                    var5.field231 = class194.field2656;
                    int var8 = class609.field8448.method1235(3, -4080);
                    var5.method4088(1, var8, arg0 - 21475);
                    int var9 = class609.field8448.method1235(1, -4080);
                    if (var9 == 1) {
                        class414.field5284[class28.field502++] = var4;
                    }
                } else if (var7 == 2) {
                    class751.field10483[class646.field8947++] = var4;
                    var5.field231 = class194.field2656;
                    if (class609.field8448.method1235(1, arg0 - 25642) == 1) {
                        int var10 = class609.field8448.method1235(3, -4080);
                        var5.method4088(2, var10, 116);
                        int var11 = class609.field8448.method1235(3, -4080);
                        var5.method4088(2, var11, -85);
                    } else {
                        int var12 = class609.field8448.method1235(3, -4080);
                        var5.method4088(0, var12, -64);
                    }
                    int var13 = class609.field8448.method1235(1, -4080);
                    if (var13 == 1) {
                        class414.field5284[class28.field502++] = var4;
                    }
                } else if (var7 == 3) {
                    class346.field4368[class701.field9759++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public final synchronized void method335(int arg0) {
        field8670++;
        if (this.field8687) {
            return;
        }
        while (true) {
            class562 var2 = this.method3532((byte) 117);
            if (var2 == null) {
                if (this.field8686) {
                    this.method1175(-2);
                    class89.field1232.method3965(false);
                }
                return;
            }
            if ((var2.field7913[0].length - this.field8685) > arg0) {
                this.field8685 += arg0;
                return;
            }
            arg0 -= var2.field7913[0].length - this.field8685;
            this.method3526(-26443);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ltv;I)V")
    public final synchronized void method3534(class562 arg0, int arg1) {
        field8672++;
        while (this.field8690 >= 100) {
            this.field8682.method3665(23290);
            this.field8690--;
        }
        int var3 = -120 % ((70 - arg1) / 54);
        this.field8682.method3671(arg0, false);
        this.field8690++;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(Z)V")
    public final synchronized void method3535(boolean arg0) {
        field8668++;
        this.field8686 = arg0;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
    public final void method3536(int arg0, int arg1) {
        this.field8689 = arg0;
        if (arg1 != 14088) {
            this.field8688 = 98;
        }
        this.field8688 = arg0;
        field8683++;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(Z)V")
    public static final void method3537(boolean arg0) {
        if (arg0) {
            class197.field2689 = class665.field9356;
            class195.field2669 = class395.field5009;
        } else {
            class197.field2689 = class123.field1778;
            class195.field2669 = class707.field9826;
        }
        class29.field515 = class197.field2689.length;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;ZIZ)Z")
    public static final boolean method3538(String arg0, boolean arg1, int arg2, boolean arg3) {
        field8669++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = arg3;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg2) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(I)V")
    public class629(int arg0) {
        this.field8680 = arg0;
    }
}
