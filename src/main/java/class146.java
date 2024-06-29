import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class146 extends class185 {

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    private int field2184;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    private int field2181;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    private int field2189;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "Z")
    public static boolean field2186 = false;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field2190 = 0;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "Lkb;")
    public static class39 field2188;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)V", line = 5)
    public static final void method1024(boolean arg0, int arg1) {
        field2180++;
        class109.method755(class36.field478, class277.field4382, class121.field1837, class149.field2233);
        class109.method751(class121.field1849, class50.field693, arg0);
        class109.method748((float) class250.field3981, (float) class327.field5095, (float) class245.field3887);
        class109.method753();
        class240.field3793 = class313.field4867;
        if (arg1 != 4486) {
            field2190 = -21;
        }
        class110.field1653 = class333.field5169;
        class110.field1650 = class284.field4489;
        class110.field1651 = class35.field470;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)V", line = 29)
    public final void method718(int arg0, int arg1, byte arg2) {
        int var4 = -21 / ((-arg2 - 39) / 61);
        field2192++;
        int var5 = this.field2184 * arg0 >> 12;
        int var6 = this.field2181 * arg1 >> 12;
        int var7 = this.field2189 * arg0 >> 12;
        int var8 = this.field2193 * arg1 >> 12;
        class4.method16(var7, var5, this.field2973, this.field2972, true, var8, var6, this.field2974);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIZII)V", line = 53)
    public static final void method1025(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        for (int var6 = arg1; var6 <= arg0; var6++) {
            class245.method1738(48, class310.field4841[var6], arg2, arg4, arg5);
        }
        field2183++;
        if (arg3) {
            method1025(-59, 39, -125, false, -120, 90);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIIII)V", line = 69)
    public class146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2184 = arg0;
        this.field2181 = arg3;
        this.field2193 = arg1;
        this.field2189 = arg2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lha;", line = 86)
    public static final class318 method1026(int arg0, int arg1) {
        field2191++;
        int var2 = -34 / ((-arg1 - 13) / 37);
        return (class318) class225.field3581.method1743((long) arg0, (byte) -112);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBI)V", line = 97)
    public final void method717(int arg0, byte arg1, int arg2) {
        if (arg1 < 43) {
            this.field2181 = -92;
        }
        field2187++;
        int var4 = this.field2189 * arg2 >> 12;
        int var5 = this.field2184 * arg2 >> 12;
        int var6 = this.field2193 * arg0 >> 12;
        int var7 = this.field2181 * arg0 >> 12;
        class113.method781(var7, -5121, this.field2972, var6, var5, var4);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZIIIII)V", line = 120)
    public static final void method1027(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class113.field1691 = arg3;
        field2185++;
        class198.field3258 = arg2;
        class286.field4522 = arg4;
        class222.field3535 = arg1;
        if (arg0) {
            return;
        }
        class93.field1442 = arg5;
        if (class93.field1442 >= 100) {
            int var6 = class198.field3258 * 128 + 64;
            int var7 = class113.field1691 * 128 + 64;
            int var8 = class227.method1653(var6, var7, -12282, class148.field2209) - class222.field3535;
            int var9 = var6 - class74.field983;
            int var10 = var8 - class161.field2644;
            int var11 = var7 - class27.field388;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class281.field4425 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class185.field2971 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class281.field4425 < 128) {
                class281.field4425 = 128;
            }
            if (class281.field4425 > 383) {
                class281.field4425 = 383;
            }
        }
        class282.field4461 = 2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V", line = 166)
    public final void method721(int arg0, int arg1, int arg2) {
        field2182++;
        if (arg1 != -1) {
            method1027(false, 50, 32, -123, 30, 86);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V", line = 176)
    public static void method1028(int arg0) {
        field2188 = null;
        if (arg0 != 1862790444) {
            method1025(-30, 75, -4, false, 41, 94);
        }
    }
}
