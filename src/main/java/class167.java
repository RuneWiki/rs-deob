import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class167 {

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field2982 = 0;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field2980 = 0;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Llc;")
    private static class143 field2981 = class66.method374("flash3:", -1);

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Llc;")
    public static class143 field2983 = field2981;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field2994 = 0;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "[[B")
    public static byte[][] field2990 = new byte[50][];

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Llc;")
    public static class143 field2989 = field2981;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field2988 = 0;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)Z")
    public static final boolean method1099(int arg0, int arg1) {
        field2987++;
        if (arg0 == 14316) {
            return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ)I")
    public static final int method1100(int arg0, boolean arg1) {
        field2993++;
        return arg1 ? 51 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public static final void method1101(boolean arg0) {
        field2984++;
        while (class161.field2902.method809(class42.field708, -2542) >= 27) {
            int var1 = class161.field2902.method798(15, 8);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class259.field4648[var1] == null) {
                class259.field4648[var1] = new class187();
                var2 = true;
            }
            class187 var3 = class259.field4648[var1];
            class56.field1093[class212.field3945++] = var1;
            var3.field4146 = class146.field2635;
            if (var3.field3384 != null && var3.field3384.method487(91)) {
                class5.method22(114, var3);
            }
            int var4 = class161.field2902.method798(5, 8);
            int var5 = class161.field2902.method798(1, 8);
            int var6 = class58.field1118[class161.field2902.method798(3, 8)];
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var2) {
                var3.field4168 = var3.field4183 = var6;
            }
            int var7 = class161.field2902.method798(1, 8);
            if (var7 == 1) {
                class135.field2379[class268.field4809++] = var1;
            }
            var3.method1219((byte) 79, class154.method1018(106, class161.field2902.method798(14, 8)));
            int var8 = class161.field2902.method798(5, 8);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1557(6622, var3.field3384.field1531);
            var3.field4113 = var3.field3384.field1528;
            var3.field4137 = var3.field3384.field1556;
            var3.field4141 = var3.field3384.field1551;
            var3.field4181 = var3.field3384.field1519;
            var3.field4142 = var3.field3384.field1571;
            var3.field4114 = var3.field3384.field1553;
            var3.field4157 = var3.field3384.field1525;
            var3.field4125 = var3.field3384.field1555;
            if (var3.field4125 == 0) {
                var3.field4183 = 0;
            }
            var3.method1552(var3.method218((byte) -21), class229.field4195.field4148[0] + var4, var5 == 1, class229.field4195.field4115[0] + var8, (byte) -84);
            if (var3.field3384.method487(112)) {
                class266.method1772((class209) null, 0, var3.field4115[0], var3.field4148[0], class170.field3044, 128, (class32) null, var3);
            }
        }
        class161.field2902.method800(arg0);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method1102(int arg0) {
        field2983 = null;
        field2981 = null;
        if (arg0 == 0) {
            field2989 = null;
            field2990 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)V")
    public static final void method1103(int arg0, int arg1, int arg2, int arg3) {
        field2991++;
        if (arg0 == -157) {
            class166 var4 = class262.method1746(-80, arg1, 9);
            var4.method1097((byte) -74);
            var4.field2979 = arg2;
            var4.field2978 = arg3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIZILgf;I)V")
    public static final void method1104(int arg0, int arg1, int arg2, boolean arg3, int arg4, class7 arg5, int arg6) {
        class85.field1515 = arg4;
        int var7 = 32 % ((arg6 - 48) / 62);
        class7.field121 = arg5;
        class238.field4309 = arg2;
        class88.field1599 = arg1;
        class24.field416 = 1;
        field2985++;
        class189.field3419 = arg3;
        class70.field1339 = arg0;
    }
}
