import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class264 extends class351 {

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    private int field3836;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    private int field3837;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    private int field3833;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    private int field3832;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "Lll;")
    public static class54 field3831 = new class54();

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    public static int field3844 = 0;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "Lcd;")
    public static class271 field3841;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "[Luj;")
    public static class158[] field3842;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "[[B")
    public static byte[][] field3838;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)V", line = 14)
    public final void method1294(int arg0, int arg1, byte arg2) {
        field3829++;
        int var4 = this.field3836 * arg0 >> 12;
        if (arg2 <= -108) {
            int var5 = this.field3837 * arg0 >> 12;
            int var6 = this.field3832 * arg1 >> 12;
            int var7 = this.field3833 * arg1 >> 12;
            class201.method1475(var5, this.field5481, var4, this.field5486, (byte) 75, this.field5479, var7, var6);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 34)
    public static void method1816(byte arg0) {
        if (arg0 >= 3) {
            field3831 = null;
            field3842 = null;
            field3841 = null;
            field3838 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V", line = 55)
    public static final void method1817(int arg0, int arg1) {
        class104.field1351.method2264((byte) 51, arg1);
        class231.field3307.method2264((byte) 112, arg1);
        if (arg0 != 2) {
            field3844 = 21;
        }
        field3834++;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II)I", line = 71)
    public static final int method1818(int arg0, int arg1) {
        field3828++;
        return arg0 < 23 ? -47 : arg1 >>> 10;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lll;III)V", line = 84)
    public static final void method1819(class54 arg0, int arg1, int arg2, int arg3) {
        class287.field4140.method409(1986850152);
        if (arg2 != 5938) {
            field3841 = (class271) null;
        }
        field3835++;
        if (class30.field352) {
            return;
        }
        for (class352 var4 = (class352) arg0.method413(1253231568); var4 != null; var4 = (class352) arg0.method419(81)) {
            class287 var5 = class282.method1924(true, var4.field5493);
            if (class306.method2142(var5, -1)) {
                class260.method1792(arg1, false, var4, arg3, var5);
                if (var4.field5498) {
                    class61.method450(10, var4, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V", line = 122)
    public final void method1297(int arg0, int arg1, int arg2) {
        field3830++;
        int var4 = this.field3836 * arg1 >> 12;
        int var5 = this.field3837 * arg1 >> 12;
        int var6 = this.field3832 * arg2 >> 12;
        int var7 = this.field3833 * arg2 >> 12;
        if (arg0 != 1380163464) {
            this.field3832 = 89;
        }
        class94.method678(var6, var4, this.field5481, var7, true, var5);
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(IIIIIII)V", line = 139)
    public class264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3836 = arg0;
        this.field3837 = arg2;
        this.field3833 = arg1;
        this.field3832 = arg3;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;IIIIIILgl;Lwf;)V", line = 157)
    public static final void method1820(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class281 arg8, class333 arg9) {
        field3839++;
        int var10 = arg6 * arg6 + (arg4 * arg4);
        int var11 = (int) class247.field3601 + class354.field5534 & 0x7FF;
        int var12 = Math.max(arg9.field5056 / 2, arg9.field5172 / 2) + 10;
        if (var12 * var12 < var10) {
            return;
        }
        int var13 = class350.field5474[var11];
        int var14 = var13 * 256 / (class318.field4690 + 256);
        int var15 = class350.field5476[var11];
        int var16 = var15 * 256 / (class318.field4690 + 256);
        int var17 = arg4 * var16 + (arg6 * var14) >> 16;
        int var18 = arg8.method1902(arg1, 100);
        int var19 = arg8.method1913(arg1, 100, 0);
        int var20 = arg4 * var14 - (arg6 * var16) >> 16;
        if (arg2 != 27497) {
            method1819((class54) null, -86, -41, -86);
        }
        int var21 = var17 - var18 / 2;
        if (-arg9.field5056 > var21 || var21 > arg9.field5056 || -arg9.field5172 > var20 || var20 > arg9.field5172) {
            return;
        }
        if (class47.field623) {
            class129.method992((class361) arg9.method2325(false, (byte) -18));
        } else {
            class37.method244(arg9.field5195, arg9.field5057);
        }
        arg8.method1901(arg1, var21 - (-(arg9.field5056 / 2) - arg5), arg9.field5172 / 2 + -var20 + -arg7 + -var19 + arg3, var18, 50, arg0, 0, 256, 1, 0, 0);
        if (class47.field623) {
            class129.method998();
        } else {
            class37.method254();
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZ)V", line = 204)
    public final void method1295(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field3843++;
        }
    }
}
