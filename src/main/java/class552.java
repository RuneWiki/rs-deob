import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class552 {

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "Ljda;")
    private class224 field7732 = new class224();

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "Ljh;")
    private class158 field7743 = new class158();

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    private int field7745;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    private int field7741;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "Lmp;")
    private class758 field7742;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "J")
    public static long field7730 = 0L;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field7737 = 0;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "D")
    public static double field7733;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BI)V")
    public static final void method3231(byte arg0, int arg1) {
        field7734++;
        int var2 = 97 % ((arg0 + 42) / 51);
        if (class683.field9617 == 1) {
            class8.field138 = arg1;
        } else if (class683.field9617 == 2) {
            class115.field1839 = arg1;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLud;)Lcn;")
    public static final class512 method3232(byte arg0, class35 arg1) {
        field7735++;
        String var2 = arg1.method272(2);
        class338 var3 = class405.method2488(true)[arg1.method273(255)];
        class692 var4 = class701.method3940(1)[arg1.method273(255)];
        int var5 = arg1.method225((byte) 77);
        if (arg0 <= 50) {
            field7730 = 88L;
        }
        int var6 = arg1.method225((byte) 118);
        int var7 = arg1.method273(255);
        int var8 = arg1.method273(255);
        int var9 = arg1.method273(255);
        int var10 = arg1.method253(-13900);
        int var11 = arg1.method253(-13900);
        int var12 = arg1.method234((byte) -102);
        int var13 = arg1.method234((byte) -98);
        int var14 = arg1.method234((byte) -126);
        return new class512(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method3233(byte arg0, String arg1) {
        int var2 = 20 % ((31 - arg0) / 43);
        field7739++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public final void method3234(int arg0) {
        this.field7743.method1199(false);
        if (arg0 != -26409) {
            this.method3237(101L, null, 10);
        }
        field7731++;
        this.field7742.method4204((byte) 80);
        this.field7732 = new class224();
        this.field7745 = this.field7741;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZJ)V")
    public final void method3235(boolean arg0, long arg1) {
        field7744++;
        if (arg0) {
            method3231((byte) -12, -78);
        }
        class224 var4 = (class224) this.field7742.method4203(true, arg1);
        if (var4 != null) {
            var4.method3617(1);
            var4.method1553(-119);
            this.field7745++;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(JB)Ljda;")
    public final class224 method3236(long arg0, byte arg1) {
        if (arg1 != 107) {
            return null;
        }
        field7738++;
        class224 var4 = (class224) this.field7742.method4203(true, arg0);
        if (var4 != null) {
            this.field7743.method1203(var4, -101);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(JLjda;I)V")
    public final void method3237(long arg0, class224 arg1, int arg2) {
        if (this.field7745 == 0) {
            class224 var5 = this.field7743.method1200(false);
            var5.method3617(1);
            var5.method1553(-102);
            if (this.field7732 == var5) {
                class224 var6 = this.field7743.method1200(false);
                var6.method3617(1);
                var6.method1553(arg2 - 16198);
            }
        } else {
            this.field7745--;
        }
        field7740++;
        this.field7742.method4211(arg1, (byte) 75, arg0);
        if (arg2 != 16205) {
            field7733 = -0.886267713418764D;
        }
        this.field7743.method1203(arg1, arg2 ^ 0xFFFFC0D6);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)Z")
    public static final boolean method3238(int arg0, int arg1, int arg2) {
        if (arg1 >= -78) {
            return false;
        } else {
            field7736++;
            return (arg2 & 0x20) != 0;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIB[BLjava/lang/String;I)I")
    public static final int method3239(int arg0, int arg1, byte arg2, byte[] arg3, String arg4, int arg5) {
        field7729++;
        if (arg2 > -33) {
            method3231((byte) -49, 51);
        }
        int var6 = arg0 - arg1;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg5 + var7] = -97;
            } else {
                arg3[arg5 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(I)V")
    public class552(int arg0) {
        this.field7745 = arg0;
        this.field7741 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field7742 = new class758(var2);
    }
}
