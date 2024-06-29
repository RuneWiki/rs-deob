import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class307 extends class222 {

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    private int field4682;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    private int field4675;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    private int field4671;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    private int field4684;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "[I")
    public static int[] field4678 = new int[100];

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "Z")
    public static boolean field4679 = false;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field4677 = new String[500];

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "F")
    public static float field4681;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "Lim;")
    public static class249 field4685;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V", line = 5)
    public final void method1035(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field4671 = 10;
        }
        field4680++;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V", line = 34)
    public static final void method2116(int arg0) {
        field4676++;
        if (arg0 < 61) {
            method2118(-41);
        }
        class284.field4295.method2176((byte) -62);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIILna;II)Z", line = 54)
    public static final boolean method2117(int arg0, int arg1, int arg2, int arg3, class22 arg4, int arg5, int arg6) {
        field4686++;
        int var7 = -41 % ((-arg5 - 29) / 52);
        class45 var8 = class197.method1356((byte) -11, arg4.field300);
        if (var8.field573 == -1) {
            return true;
        }
        int var9;
        if (arg4.field286) {
            int var10 = arg4.field310 + arg2;
            var9 = var10 & 0x3;
        } else {
            var9 = 0;
        }
        class59 var11 = var8.method292(var9, (byte) -128);
        if (var11 == null) {
            return false;
        }
        int var12 = arg4.field330;
        int var13 = arg4.field293;
        if ((var9 & 0x1) == 1) {
            var13 = arg4.field330;
            var12 = arg4.field293;
        }
        int var14 = var11.field2361;
        int var15 = var11.field2360;
        if (var8.field564) {
            var15 = var13 * 4;
            var14 = var12 * 4;
        }
        if (var8.field574 == 0) {
            var11.method398(arg0 * 4 + 48, (-arg3 + 104 + -var13) * 4 + 48, var14, var15);
        } else {
            var11.method400(arg0 * 4 + 48, (-arg3 + -var13 + 104) * 4 + 48, var14, var15, var8.field574);
        }
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZ)V", line = 112)
    public final void method1042(int arg0, int arg1, boolean arg2) {
        int var4 = this.field4671 * arg0 >> 12;
        field4672++;
        if (arg2) {
            method2118(84);
        }
        int var5 = this.field4684 * arg0 >> 12;
        int var6 = this.field4675 * arg1 >> 12;
        int var7 = this.field4682 * arg1 >> 12;
        class200.method1373(var5, var7, var6, var4, this.field3380, (byte) 31);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIIIIII)V", line = 129)
    public class307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4682 = arg3;
        this.field4675 = arg1;
        this.field4671 = arg0;
        this.field4684 = arg2;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V", line = 142)
    public static void method2118(int arg0) {
        field4685 = null;
        field4678 = null;
        field4677 = null;
        if (arg0 != 1194478476) {
            method2118(-64);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)V", line = 154)
    public final void method1037(int arg0, int arg1, int arg2) {
        field4674++;
        int var4 = this.field4671 * arg0 >> 12;
        int var5 = this.field4684 * arg0 >> 12;
        int var6 = this.field4675 * arg1 >> 12;
        if (arg2 > -66) {
            field4681 = 1.0052887F;
        }
        int var7 = this.field4682 * arg1 >> 12;
        class191.method1302(this.field3380, var5, var4, var7, (byte) 120, var6, this.field3381, this.field3382);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZIZI)V", line = 173)
    public static final void method2119(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field4673++;
        class84.field1252 = 0L;
        boolean var5 = arg1;
        int var6 = class48.method329((byte) 81);
        if (arg4 > 0 != var6 > 0) {
            var5 = true;
        }
        if (arg4 == 3 || var6 == 3) {
            arg3 = true;
        }
        if (class262.field3966.startsWith("mac") && arg4 > 0) {
            arg3 = true;
        }
        if (arg3 && arg4 > 0) {
            var5 = true;
        }
        class291.method2039(arg2, arg0, var5, true, arg3, var6, arg4);
    }
}
