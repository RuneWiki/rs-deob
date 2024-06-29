import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class154 extends class166 {

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public static int field3088 = 0;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lcd;")
    private static class23 field3080 = class54.method414("This computers address has been blocked", -1);

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "Lcd;")
    public static class23 field3089 = field3080;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Lsa;")
    public static class162 field3074 = new class162(50);

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "Lcf;")
    public static class25 field3096 = new class25();

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "Lcd;")
    public static class23 field3097 = class54.method414("M", -1);

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public int field3083;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public int field3084;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public int field3085;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "Llf;")
    public class104 field3090;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Lta;")
    public class171 field3077;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "Lta;")
    public class171 field3087;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "[I")
    public int[] field3076;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "[S")
    public static short[] field3091;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lea;IIIIB)V")
    public static final void method948(class38 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != -8) {
            return;
        }
        field3078++;
        int var6 = arg1 * arg1 + arg2 * arg2;
        if (var6 <= 4225 || var6 >= 90000) {
            class107.method697(arg2, (byte) -25, arg1, arg0, arg3, arg4);
            return;
        }
        int var7 = class67.field1580 + class48.field1155 & 0x7FF;
        int var8 = class140.field2878[var7];
        int var9 = var8 * 256 / (class107.field2292 + 256);
        int var10 = class140.field2891[var7];
        int var11 = var10 * 256 / (class107.field2292 + 256);
        int var12 = arg1 * var9 + arg2 * var11 >> 16;
        int var13 = arg1 * var11 - arg2 * var9 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        class170.field3389.method304(arg3 + var16 + 98 - 10, arg4 - var17 - 20 + 83, 20, 20, 15, 15, var14, 256);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static void method949(boolean arg0) {
        if (!arg0) {
            field3089 = null;
        }
        field3080 = null;
        field3096 = null;
        field3091 = null;
        field3097 = null;
        field3074 = null;
        field3089 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILcd;Lkh;Lcd;Lkh;)Lcg;")
    public static final class26 method950(int arg0, class23 arg1, class97 arg2, class23 arg3, class97 arg4) {
        field3094++;
        int var5 = arg2.method647((byte) -71, arg1);
        int var6 = 0 / ((arg0 - 45) / 59);
        int var7 = arg2.method642(var5, (byte) -125, arg3);
        return class109.method707(arg2, (byte) 5, var7, var5, arg4);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
    public final void method951(byte arg0) {
        if (arg0 != -13) {
            this.field3073 = -34;
        }
        field3079++;
        int var2 = this.field3085;
        class104 var3 = this.field3090.method685((byte) -125);
        if (var3 == null) {
            this.field3084 = 0;
            this.field3086 = 0;
            this.field3075 = 0;
            this.field3076 = null;
            this.field3085 = -1;
        } else {
            this.field3086 = var3.field2265;
            this.field3085 = var3.field2261;
            this.field3076 = var3.field2246;
            this.field3084 = var3.field2233;
            this.field3075 = var3.field2251 * 128;
        }
        if (this.field3085 != var2 && this.field3077 != null) {
            class2.field25.method1247(this.field3077);
            this.field3077 = null;
        }
    }
}
