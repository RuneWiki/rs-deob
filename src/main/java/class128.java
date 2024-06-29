import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class128 {

    @OriginalMember(owner = "client!om", name = "c", descriptor = "F")
    public static float field2089;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public int field2088;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    private int field2095;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method1080(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2092++;
        int var6 = arg4 - arg2;
        int var7 = arg1 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class191.method1478(arg1, arg2, arg0, arg3, arg5 ^ 0xFFFFF751);
            }
        } else if (var7 == 0) {
            class307.method2099(arg2, arg0, arg3, arg4, 22721);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (class185.field2727 > arg2) {
                var10 = var9 + (class185.field2727 * var8 >> 12);
                var11 = class185.field2727;
            } else if (class278.field4184 < arg2) {
                var10 = (class278.field4184 * var8 >> 12) + var9;
                var11 = class278.field4184;
            } else {
                var10 = arg0;
                var11 = arg2;
            }
            int var12;
            int var13;
            if (arg4 < class185.field2727) {
                var12 = class185.field2727;
                var13 = var9 + (class185.field2727 * var8 >> 12);
            } else if (class278.field4184 < arg4) {
                var13 = (class278.field4184 * var8 >> 12) + var9;
                var12 = class278.field4184;
            } else {
                var12 = arg4;
                var13 = arg1;
            }
            if (arg5 != -2261) {
                field2089 = -0.45669612F;
            }
            if (class308.field4507 > var10) {
                var11 = (class308.field4507 - var9 << 12) / var8;
                var10 = class308.field4507;
            } else if (var10 > class383.field5497) {
                var10 = class383.field5497;
                var11 = (class383.field5497 - var9 << 12) / var8;
            }
            if (var13 < class308.field4507) {
                var13 = class308.field4507;
                var12 = (class308.field4507 - var9 << 12) / var8;
            } else if (class383.field5497 < var13) {
                var13 = class383.field5497;
                var12 = (class383.field5497 - var9 << 12) / var8;
            }
            class288.method2026(var10, -1, var11, var13, var12, arg3);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Lhb;", line = 105)
    public final class344 method1081(boolean arg0) {
        field2087++;
        class344 var2 = (class344) class250.field3610.method103(0, (long) this.field2095);
        if (var2 != null) {
            return var2;
        }
        class344 var3 = class344.method2217(class151.field2309, this.field2095, 0);
        if (arg0) {
            return null;
        } else {
            if (var3 != null) {
                class250.field3610.method113(var3, 0, (long) this.field2095);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILec;B)V", line = 126)
    public final void method1082(int arg0, class37 arg1, byte arg2) {
        field2094++;
        if (arg2 != 32) {
            return;
        }
        while (true) {
            int var4 = arg1.method271((byte) 109);
            if (var4 == 0) {
                return;
            }
            this.method1083(arg1, var4, -2, arg0);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lec;III)V", line = 151)
    private final void method1083(class37 arg0, int arg1, int arg2, int arg3) {
        field2090++;
        if (~arg1 == arg2) {
            this.field2095 = arg0.method320((byte) -87);
        } else if (arg1 == 2) {
            this.field2091 = arg0.method271((byte) 108);
            this.field2088 = arg0.method271((byte) 118);
            return;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)I", line = 174)
    public static final int method1084(int arg0, int arg1) {
        if (arg0 != -2) {
            method1080(108, 59, -21, 67, -55, 52);
        }
        field2093++;
        return arg1 >>> 7;
    }
}
