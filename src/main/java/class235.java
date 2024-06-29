import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class235 extends class187 {

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    private int field3785;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public int field3774;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    private int field3773;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public int field3780;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    private int field3776;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    private int field3786;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    private int field3771;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    private int field3767;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "Led;")
    public static class334 field3784;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZII)Z", line = 4)
    public final boolean method1599(boolean arg0, int arg1, int arg2) {
        field3783++;
        if (arg0) {
            this.method1605(22, -61, (byte) 91);
        }
        return arg1 >= this.field3774 && this.field3780 >= arg1 && this.field3777 <= arg2 && arg2 <= this.field3778;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIBI)V", line = 24)
    public static final void method1600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3768++;
        if (arg6 != 117) {
            method1603((class303) null, 94);
        }
        int var8 = 0;
        int var9 = arg2 - 334;
        int var10 = 2048 - arg5 & 0x7FF;
        int var11 = 2048 - arg3 & 0x7FF;
        if (var9 < 0) {
            var9 = 0;
        } else if (var9 > 100) {
            var9 = 100;
        }
        int var12 = 0;
        int var13 = class310.field4922 + ((class280.field4320 - class310.field4922) * var9 / 100);
        int var14 = arg4 * var13 >> 8;
        int var15 = var14;
        if (var10 != 0) {
            int var16 = class12.field127[var10];
            int var17 = class12.field121[var10];
            var12 = -var14 * var17 >> 16;
            var15 = var14 * var16 >> 16;
        }
        if (var11 != 0) {
            int var18 = class12.field121[var11];
            var8 = var15 * var18 >> 16;
            int var19 = class12.field127[var11];
            var15 = var15 * var19 >> 16;
        }
        class305.field4781 = arg3;
        class298.field4598 = arg0 - var8;
        class199.field2989 = arg5;
        class169.field2579 = arg7 - var12;
        class225.field3592 = arg1 - var15;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V", line = 82)
    public static final void method1601(int arg0) {
        field3772++;
        class221.field3513.method1298((byte) 110);
        if (arg0 > -52) {
            method1603((class303) null, -100);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljj;I)V", line = 94)
    public static final void method1602(class80 arg0, int arg1) {
        field3782++;
        for (class229 var2 = (class229) class203.field3066.method10((byte) 37); var2 != null; var2 = (class229) class203.field3066.method13((byte) -32)) {
            if (var2.field3674 == arg0) {
                if (var2.field3690 != null) {
                    class74.field1102.method221(var2.field3690);
                    var2.field3690 = null;
                }
                var2.method1284(0);
                return;
            }
        }
        if (arg1 <= 104) {
            field3784 = (class334) null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lgn;I)V", line = 135)
    public static final void method1603(class303 arg0, int arg1) {
        field3781++;
        int var2 = arg0.method2003(arg1 - 12757);
        if (arg1 != 12880) {
            return;
        }
        class54.field765 = new class271[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class54.field765[var3] = new class271();
            class54.field765[var3].field4166 = arg0.method2003(-50);
            class54.field765[var3].field4160 = arg0.method2045((byte) -23);
        }
        class35.field447 = arg0.method2003(arg1 ^ 0xFFFFCDB5);
        class230.field3718 = arg0.method2003(-2);
        class305.field4776 = arg0.method2003(arg1 - 12982);
        class138.field2134 = new class130[class230.field3718 + 1 - class35.field447];
        for (int var4 = 0; var4 < class305.field4776; var4++) {
            int var5 = arg0.method2003(-98);
            class130 var6 = class138.field2134[var5] = new class130();
            var6.field4226 = arg0.method2043((byte) -109);
            var6.field4236 = arg0.method1996(-87);
            var6.field2029 = class35.field447 + var5;
            var6.field2032 = arg0.method2045((byte) 113);
            var6.field2033 = arg0.method2045((byte) 108);
        }
        class146.field2309 = arg0.method1996(-97);
        class164.field2526 = true;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)[I", line = 185)
    public final int[] method1604(byte arg0, int arg1, int arg2) {
        if (arg0 >= -15) {
            return (int[]) null;
        } else {
            field3770++;
            return new int[] { this.field3776, this.field3774 + arg1 - this.field3786, -this.field3771 + this.field3777 + arg2 };
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)[I", line = 202)
    public final int[] method1605(int arg0, int arg1, byte arg2) {
        field3779++;
        return arg2 >= -39 ? (int[]) null : new int[] { this.field3773, this.field3786 + arg1 - this.field3774, this.field3771 - this.field3777 + arg0 };
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(III)Z", line = 217)
    public final boolean method1606(int arg0, int arg1, int arg2) {
        if (arg0 != 28698) {
            this.field3771 = 50;
        }
        field3775++;
        return arg1 >= this.field3786 && this.field3785 >= arg1 && this.field3771 <= arg2 && this.field3767 >= arg2;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V", line = 234)
    public static final void method1607(int arg0) {
        int var1 = -9 / ((-arg0 - 35) / 37);
        class255.field3981.method1296(255);
        field3769++;
        class242.field3826.method1296(255);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII)Z", line = 244)
    public final boolean method1608(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > -7) {
            this.method1608(-32, -10, 28, -11);
        }
        field3787++;
        return this.field3773 == arg0 && arg2 >= this.field3786 && arg2 <= this.field3785 && this.field3771 <= arg3 && arg3 <= this.field3767;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V", line = 260)
    public static void method1609(int arg0) {
        if (arg0 == 100) {
            field3784 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 275)
    public class235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3785 = arg4;
        this.field3774 = arg6;
        this.field3773 = arg0;
        this.field3778 = arg9;
        this.field3780 = arg8;
        this.field3776 = arg1;
        this.field3777 = arg7;
        this.field3786 = arg2;
        this.field3771 = arg3;
        this.field3767 = arg5;
    }
}
