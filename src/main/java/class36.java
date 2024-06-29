import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[I")
    private int[] field811;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Ljd;")
    private static class86 field812 = class122.method868("Your ignore list is full)3 Max of 100 users)3", true);

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Ljd;")
    public static class86 field808 = field812;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lqh;")
    public static class195 field809 = new class195(5000);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Z")
    public static final boolean method270(byte arg0, int arg1) {
        field806++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else if (arg0 > -109) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method271(int arg0) {
        field812 = null;
        field808 = null;
        if (arg0 != -30089) {
            field809 = null;
        }
        field809 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBIJ)Z")
    public static final boolean method272(int arg0, byte arg1, int arg2, long arg3) {
        field805++;
        int var5 = (int) arg3 >> 20 & 0x3;
        int var6 = (int) arg3 >> 14 & 0x1F;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class117 var8 = class268.method1845(var7, (byte) -53);
            int var9 = var8.field2257;
            int var10;
            int var11;
            if (var5 == 0 || var5 == 2) {
                var10 = var8.field2307;
                var11 = var8.field2273;
            } else {
                var10 = var8.field2273;
                var11 = var8.field2307;
            }
            if (var5 != 0) {
                var9 = (var9 << var5 & 0xF) + (var9 >> 4 - var5);
            }
            class48.method375(var10, var9, true, class124.field2412.field707[0], arg0, 0, 0, 2, arg2, class124.field2412.field705[0], var11, -24761);
        } else {
            class48.method375(0, 0, true, class124.field2412.field707[0], arg0, var6 + 1, var5, 2, arg2, class124.field2412.field705[0], 0, -24761);
        }
        if (arg1 >= -121) {
            method271(17);
        }
        class141.field2673 = 0;
        class198.field3523 = 2;
        class187.field3316 = class39.field906;
        class162.field3051 = class185.field3288;
        return true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
    public final int method273(int arg0, int arg1) {
        if (arg0 >= -117) {
            return -47;
        }
        field810++;
        int var3 = (this.field811.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field811[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field811[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZLbj;I)Lei;")
    public static final class167 method274(int arg0, boolean arg1, class151 arg2, int arg3) {
        field807++;
        if (class163.method1181(arg2, arg3, 10475, arg0)) {
            return arg1 ? class1.method4((byte) 108) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
    public static final void method275(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class51.field1074 = -1;
        class156.field2952 = class38.field894 * arg4 / arg2;
        field813++;
        class152.field2875 = -1;
        class274.field4814 = class263.field4668 * arg1 / arg3;
        class188.method1293(arg0 - 19957);
        if (arg0 != 20003) {
            field809 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "([I)V")
    public class36(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field811 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field811[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field811[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field811[var5 + var5] = arg0[var4];
            this.field811[var5 + var5 + 1] = var4++;
        }
    }
}
