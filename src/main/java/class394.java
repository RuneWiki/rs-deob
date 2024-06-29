import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class394 extends class665 {

    @OriginalMember(owner = "client!uba", name = "w", descriptor = "I")
    public int field5846;

    @OriginalMember(owner = "client!uba", name = "x", descriptor = "I")
    public int field5847;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "I")
    private int field5836;

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
    private int field5841;

    @OriginalMember(owner = "client!uba", name = "D", descriptor = "I")
    public int field5852;

    @OriginalMember(owner = "client!uba", name = "v", descriptor = "I")
    private int field5845;

    @OriginalMember(owner = "client!uba", name = "A", descriptor = "I")
    private int field5850;

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "I")
    public int field5842;

    @OriginalMember(owner = "client!uba", name = "F", descriptor = "I")
    private int field5854;

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "[I")
    public static int[] field5839 = new int[8];

    @OriginalMember(owner = "client!uba", name = "z", descriptor = "Lwba;")
    public static class46 field5849 = new class46();

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!uba", name = "t", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!uba", name = "u", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!uba", name = "y", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!uba", name = "C", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!uba", name = "E", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V", line = 6)
    public static void method2427(byte arg0) {
        field5839 = null;
        field5849 = null;
        if (arg0 != 65) {
            field5849 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZII)Z", line = 17)
    public final boolean method2428(boolean arg0, int arg1, int arg2) {
        field5843++;
        if (arg0) {
            this.field5852 = -9;
        }
        return this.field5842 <= arg1 && this.field5852 >= arg1 && arg2 >= this.field5846 && arg2 <= this.field5847;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "([IIII)V", line = 32)
    public final void method2429(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[0] = 0;
        field5848++;
        if (arg1 == 1849648140) {
            arg0[1] = this.field5842 + arg2 - this.field5845;
            arg0[2] = -this.field5850 - (-this.field5846 - arg3);
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "([IIII)V", line = 48)
    public final void method2430(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[2] = -this.field5846 - (-this.field5850 - arg1);
        if (arg3 >= -11) {
            method2427((byte) -75);
        }
        field5837++;
        arg0[1] = arg2 + this.field5845 - this.field5842;
        arg0[0] = this.field5841;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIZ)Z", line = 67)
    public final boolean method2431(int arg0, int arg1, boolean arg2) {
        field5834++;
        if (arg2) {
            method2433(104, -44);
        }
        return this.field5845 <= arg1 && this.field5836 >= arg1 && this.field5850 <= arg0 && this.field5854 >= arg0;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIII)Z", line = 82)
    public final boolean method2432(int arg0, int arg1, int arg2, int arg3) {
        field5851++;
        int var5 = -70 / ((-arg0 - 77) / 36);
        return this.field5841 == arg1 && this.field5845 <= arg3 && arg3 <= this.field5836 && arg2 >= this.field5850 && arg2 <= this.field5854;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)V", line = 96)
    public static final void method2433(int arg0, int arg1) {
        field5840++;
        if (!class312.method1978(false, arg0)) {
            return;
        }
        class49[] var2 = class181.field2558[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class49 var4 = var2[var3];
            if (var4 != null) {
                var4.field886 = 0;
                var4.field870 = 0;
                var4.field942 = 1;
            }
        }
        if (arg1 != 1) {
            method2433(73, 88);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 132)
    public static final void method2434(String arg0, int arg1) {
        field5838++;
        if (arg1 != 1) {
            field5835 = 120;
        }
        class376.method2265(0, 0, "", "", (byte) -120, "", arg0);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIBIII)V", line = 152)
    public static final void method2435(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field5853++;
        int var6 = arg1 - arg4;
        int var7 = arg5 - arg3;
        if (arg2 != -16) {
            method2433(10, -114);
        }
        if (var6 == 0) {
            if (var7 != 0) {
                class542.method3075(arg4, arg0, arg2 + 399358944, arg3, arg5);
            }
        } else if (var7 == 0) {
            class129.method966(arg1, (byte) 96, arg4, arg0, arg3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg1 < class15.field153) {
                var11 = (class15.field153 * var8 >> 12) + var9;
                var10 = class15.field153;
            } else if (class248.field3859 >= arg1) {
                var10 = arg1;
                var11 = arg5;
            } else {
                var11 = (class248.field3859 * var8 >> 12) + var9;
                var10 = class248.field3859;
            }
            int var12;
            int var13;
            if (arg4 < class15.field153) {
                var12 = class15.field153;
                var13 = (class15.field153 * var8 >> 12) + var9;
            } else if (arg4 <= class248.field3859) {
                var12 = arg4;
                var13 = arg3;
            } else {
                var12 = class248.field3859;
                var13 = (class248.field3859 * var8 >> 12) + var9;
            }
            if (class520.field7329 > var11) {
                var11 = class520.field7329;
                var10 = (class520.field7329 - var9 << 12) / var8;
            } else if (var11 > class239.field3747) {
                var10 = (class239.field3747 - var9 << 12) / var8;
                var11 = class239.field3747;
            }
            if (var13 < class520.field7329) {
                var12 = (class520.field7329 - var9 << 12) / var8;
                var13 = class520.field7329;
            } else if (var13 > class239.field3747) {
                var12 = (class239.field3747 - var9 << 12) / var8;
                var13 = class239.field3747;
            }
            class14.method77(var11, var13, var10, var12, true, arg0);
        }
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IIIIIIIII)V", line = 260)
    public class394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5846 = arg6;
        this.field5847 = arg8;
        this.field5836 = arg3;
        this.field5841 = arg0;
        this.field5852 = arg7;
        this.field5845 = arg1;
        this.field5850 = arg2;
        this.field5842 = arg5;
        this.field5854 = arg4;
    }
}
