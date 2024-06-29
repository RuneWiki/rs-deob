import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class199 extends class567 {

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!vu", name = "u", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!vu", name = "s", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!vu", name = "x", descriptor = "I")
    public int field3097;

    @OriginalMember(owner = "client!vu", name = "r", descriptor = "I")
    public static int field3091 = -1;

    @OriginalMember(owner = "client!vu", name = "y", descriptor = "Lmo;")
    public static class482 field3098 = new class482(8);

    @OriginalMember(owner = "client!vu", name = "z", descriptor = "[Lhea;")
    public static class374[] field3099 = new class374[14];

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!vu", name = "t", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!vu", name = "v", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!vu", name = "w", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)V")
    public static void method1394(int arg0) {
        field3098 = null;
        if (arg0 != 256) {
            method1395((byte) -103);
        }
        field3099 = null;
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lvn;Lmf;IIIIIIIIIIIII)V")
    public class199(class186 arg0, class409 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3086 = arg11;
        this.field3094 = arg14;
        this.field3092 = arg13;
        this.field3089 = arg10;
        this.field3088 = arg9;
        this.field3097 = arg12;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public static final void method1395(byte arg0) {
        if (arg0 != -38) {
            method1395((byte) 114);
        }
        for (class673 var1 = (class673) class150.field2533.method3905(-128); var1 != null; var1 = (class673) class150.field2533.method3899(0)) {
            if (class42.method346(100, var1.field9544)) {
                class533.method3132(var1, false);
            }
        }
        field3093++;
        if (class400.field5784 == 1) {
            class586.method3380((byte) -94);
            return;
        }
        class41.method336(arg0 ^ 0xFFFFFFDA, class150.field2534, class69.field1093, class485.field6918, class273.field3904);
        int var2 = class246.field3584.method2870(true, class343.field4773.method2059(class238.field3511, true));
        for (class673 var3 = (class673) class150.field2533.method3905(arg0 - 71); var3 != null; var3 = (class673) class150.field2533.method3899(arg0 ^ 0xFFFFFFDA)) {
            int var4 = class640.method3599(-1009, var3);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class273.field3904 = class400.field5784 * 16 + (client.field1383 ? 26 : 22);
        class69.field1093 = var2 + 8;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)Lkq;")
    public class696 method726(int arg0) {
        field3090++;
        return arg0 == -17 ? class584.field8558 : null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZZ)I")
    public static final int method1396(boolean arg0, boolean arg1) {
        field3096++;
        if (class634.field8978 == null) {
            return 0;
        } else if (arg1 || class314.field4361 == null) {
            int var2 = 0;
            if (!arg0) {
                return -57;
            }
            for (int var3 = 0; var3 < class634.field8978.length; var3++) {
                int var4 = class634.field8978[var3];
                if (class609.field8758.method2077(0, var4)) {
                    var2++;
                }
                if (class662.field9306.method2077(0, var4)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class634.field8978.length * 2;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIII)Lufa;")
    public static final class141 method1397(int arg0, int arg1, int arg2, int arg3) {
        field3087++;
        class293 var4 = class541.field7946[arg0][arg3][arg2];
        if (var4 == null) {
            return null;
        }
        class141 var5 = null;
        int var6 = -1;
        for (class198 var7 = var4.field4097; var7 != null; var7 = var7.field3078) {
            class144 var8 = var7.field3085;
            if (var8 instanceof class141) {
                class141 var9 = (class141) var8;
                int var10 = (var9.method1108(arg1 ^ 0x83) - 1) * 256 + 252;
                int var11 = var9.field3155 - var10 >> 9;
                int var12 = var9.field3154 - var10 >> 9;
                int var13 = var9.field3155 + var10 >> 9;
                int var14 = var9.field3154 + var10 >> 9;
                if (var11 <= arg3 && var12 <= arg2 && arg3 <= var13 && var14 >= arg2) {
                    int var15 = (var13 + 1 - arg3) * (var14 + 1 - arg2);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        if (arg1 != 252) {
            method1394(80);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIB)V")
    public static final void method1398(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 << 3;
        field3095++;
        int var5 = arg2 << 3;
        int var6 = arg1 << 3;
        int var7 = 32 / ((arg3 - 47) / 63);
        class473.field6790 = var6;
        if (class40.field544 == 2) {
            class666.field9366 = var4;
            class694.field9854 = var5;
            class432.field6220 = var6;
        }
        class636.field9031 = var4;
        class689.method3882((byte) 86);
        class406.field5822 = true;
    }
}
