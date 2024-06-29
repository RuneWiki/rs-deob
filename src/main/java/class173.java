import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class173 extends class241 {

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public int field3137 = 0;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public int field3145 = -1;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "Loh;")
    public static class263 field3146 = class253.method1681(-118, "<br>");

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public static volatile int field3150 = 0;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    public static int field3152 = 0;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public int field3144;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public int field3153;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Lue;")
    public static class86 field3139;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
    public static void method1138(int arg0) {
        field3146 = null;
        field3139 = null;
        if (arg0 != 0) {
            field3139 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)Lcf;")
    public static final class91 method1139(byte arg0, int arg1) {
        if (arg0 != -90) {
            method1140(-119, 0, 82);
        }
        class91 var2 = (class91) class166.field3015.method1464((byte) 41, (long) arg1);
        field3143++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class218.field3876.method596(-121, 1, arg1 & 0x7FFF);
        } else {
            var3 = class219.field3881.method596(arg0 ^ 0xFFFFFFA9, 1, arg1);
        }
        class91 var4 = new class91();
        if (var3 != null) {
            var4.method644(new class194(var3), (byte) -123);
        }
        if (arg1 >= 32768) {
            var4.method643(0);
        }
        class166.field3015.method1472((byte) -29, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Lic;")
    public static final class138 method1140(int arg0, int arg1, int arg2) {
        class2 var3 = class18.field417[arg0][arg1][arg2];
        return var3 == null ? null : var3.field45;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILdd;ZIILdd;Z)I")
    public static final int method1141(int arg0, class130 arg1, boolean arg2, int arg3, int arg4, class130 arg5, boolean arg6) {
        field3156++;
        int var7 = class106.method715(arg4, arg5, arg1, arg6, -6);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (~arg3 == arg0) {
            return 0;
        } else {
            int var8 = class106.method715(arg3, arg5, arg1, arg2, -6);
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
    public static final void method1142(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class49.field1062[var1] = false;
        }
        class98.field1894 = -1;
        class20.field466 = arg0;
        field3141++;
        class89.field1772 = 1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 + arg3;
        field3148++;
        int var8 = arg4 - arg3;
        int var9 = arg1 - arg3;
        int var10 = arg2;
        if (arg6 != 1) {
            field3150 = 119;
        }
        while (var10 < var7) {
            class191.method1255(arg0, arg5, arg1, 86, class38.field870[var10]);
            var10++;
        }
        int var11 = arg0 + arg3;
        for (int var12 = arg4; var12 > var8; var12--) {
            class191.method1255(arg0, arg5, arg1, 106, class38.field870[var12]);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class38.field870[var13];
            class191.method1255(arg0, arg5, var11, 64, var14);
            class191.method1255(var9, arg5, arg1, 94, var14);
        }
    }
}
