import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class574 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    private int field7702;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    private int field7706;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    private int field7707;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    private int field7713;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public int field7716;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public int field7709;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public int field7717;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public int field7714;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public int field7711;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public int field7701;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "Z")
    public static boolean field7712 = false;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Ljw;")
    public static class581 field7703 = new class581(79, -1);

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IILbba;)V")
    public static final void method3208(int arg0, int arg1, class124 arg2) {
        field7705++;
        int var3 = -1;
        int var4 = 0;
        if (class100.field1401 < arg2.field1836) {
            class271.method1760(127, arg2);
        } else if (arg2.field1803 >= class100.field1401) {
            class473.method2779((byte) 75, arg2);
        } else {
            class124.method1012(true, arg2, false);
            var4 = class148.field2078;
            var3 = class232.field3166;
        }
        if (arg2.field2257 < 512 || arg2.field2259 < 512 || arg2.field2257 >= class597.field8132 * 512 - 512 || class628.field8800 * 512 - 512 <= arg2.field2259) {
            arg2.field1803 = 0;
            arg2.field1836 = 0;
            var3 = -1;
            var4 = 0;
            arg2.field1799 = null;
            arg2.field1827 = -1;
            arg2.field2257 = arg2.field1890[0] * 512 + (arg2.method655(-126) * 256);
            arg2.field2259 = arg2.field1884[0] * 512 + (arg2.method655(-128) * 256);
            arg2.method1017(100);
            for (int var5 = 0; var5 < arg2.field1833.length; var5++) {
                arg2.field1833[var5].field1898 = -1;
            }
        }
        if (class551.field7456 == arg2 && (arg2.field2257 < 6144 || arg2.field2259 < 6144 || arg2.field2257 >= (class597.field8132 * 512 - 6144) || arg2.field2259 >= (class628.field8800 * 512 - 6144))) {
            arg2.field1803 = 0;
            var3 = -1;
            var4 = 0;
            arg2.field1836 = 0;
            arg2.field1827 = -1;
            arg2.field1799 = null;
            arg2.field2257 = arg2.field1890[0] * 512 + arg2.method655(-128) * 256;
            arg2.field2259 = arg2.field1884[0] * 512 + (arg2.method655(-126) * 256);
            arg2.method1017(-81);
            for (int var6 = 0; var6 < arg2.field1833.length; var6++) {
                arg2.field1833[var6].field1898 = -1;
            }
        }
        int var7 = class338.method2147(arg2, -21);
        class433.method2625(-126, arg2);
        class598.method3326((byte) 69, var7, arg2, var3, var4);
        if (arg1 > -36) {
            method3213(-77, null);
        }
        class348.method2199(arg2, var3, -25478);
        class139.method1072(arg2, -1);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static final void method3209(int arg0) {
        field7708++;
        for (int var1 = 0; var1 < 5; var1++) {
            class220.field2986[var1] = false;
        }
        class421.field6033 = -1;
        class255.field3802 = -1;
        class704.field9868 = -1;
        class518.field7072 = -1;
        class230.field3142 = 0;
        class394.field5811 = 0;
        class502.field6938 = 1;
        if (arg0 != 27315) {
            method3208(-93, 75, null);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public static void method3210(int arg0) {
        if (arg0 >= 55) {
            field7703 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIIIIII)V")
    public final void method3211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field7713 = arg6 * arg6;
        this.field7702 = arg8;
        this.field7706 = arg9;
        field7715++;
        this.field7707 = arg1;
        if (arg2 != 19974) {
            field7703 = null;
        }
        this.field7701 = this.field7702 + arg7;
        this.field7716 = this.field7706 + arg5;
        this.field7709 = this.field7706 + arg10;
        this.field7714 = this.field7702 + arg3;
        this.field7717 = this.field7707 + arg0;
        this.field7711 = this.field7707 + arg4;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIBI)Z")
    public final boolean method3212(int arg0, int arg1, byte arg2, int arg3) {
        field7710++;
        if (this.field7701 > arg3 || this.field7714 < arg3) {
            return false;
        } else if (arg1 < this.field7717 || this.field7711 < arg1) {
            return false;
        } else if (arg0 >= this.field7716 && this.field7709 >= arg0) {
            if (arg2 > -93) {
                method3210(-65);
            }
            int var5 = arg3 - this.field7702;
            int var6 = arg0 - this.field7706;
            return this.field7713 > (var5 * var5 + var6 * var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjp;)V")
    public static final void method3213(int arg0, class376 arg1) {
        field7704++;
        int var2 = arg1.method2370(arg0 ^ 0xFFFFFFFE);
        class604.field8210 = new class51[var2];
        for (int var3 = arg0; var3 < var2; var3++) {
            class604.field8210[var3] = new class51();
            class604.field8210[var3].field738 = arg1.method2370(arg0 ^ 0xFFFFFFFE);
            class604.field8210[var3].field740 = arg1.method2350(0);
        }
        class620.field8351 = arg1.method2370(arg0 - 2);
        class767.field10587 = arg1.method2370(-2);
        class450.field6278 = arg1.method2370(-2);
        class124.field1825 = new class513[class767.field10587 + 1 - class620.field8351];
        for (int var4 = 0; var4 < class450.field6278; var4++) {
            int var5 = arg1.method2370(-2);
            class513 var6 = class124.field1825[var5] = new class513();
            var6.field10846 = arg1.method2398(-1372747256);
            var6.field10838 = arg1.method2384(91);
            var6.field7034 = class620.field8351 + var5;
            var6.field7030 = arg1.method2350(0);
            var6.field7035 = arg1.method2350(arg0);
        }
        class133.field1961 = arg1.method2384(arg0 + 35);
        class168.field2262 = true;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field7702 = arg0;
        this.field7706 = arg2;
        this.field7707 = arg1;
        this.field7713 = arg3 * arg3;
        this.field7716 = this.field7706 + arg8;
        this.field7709 = this.field7706 + arg9;
        this.field7717 = this.field7707 + arg6;
        this.field7714 = this.field7702 + arg5;
        this.field7711 = this.field7707 + arg7;
        this.field7701 = this.field7702 + arg4;
    }
}
