import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class87 {

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Ldh;")
    public static class9 field1283 = new class9();

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Z")
    public static boolean field1286 = false;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lbk;")
    public static class136 field1281;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lwi;")
    public static class233 field1285;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "[[[B")
    public static byte[][][] field1287;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIILpe;IJZ)Z")
    public static final boolean method543(int arg0, int arg1, int arg2, int arg3, int arg4, class258 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class219.method1496(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lbk;ILbk;)V")
    public static final void method544(class136 arg0, int arg1, class136 arg2) {
        if (arg1 >= -64) {
            method547(29);
        }
        class54.field670 = arg2;
        field1279++;
        class8.field77 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method545(byte arg0) {
        field1283 = null;
        field1285 = null;
        field1281 = null;
        if (arg0 != -32) {
            field1285 = null;
        }
        field1287 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static final void method546(byte arg0) {
        field1284++;
        if (class173.field2914 == null || class20.field231 == null) {
            class20.field231 = new int[256];
            class173.field2914 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class173.field2914[var1] = (int) (Math.sin(var2) * 4096.0D);
                class20.field231[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 < 80) {
            field1286 = true;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)[Lub;")
    public static final class43[] method547(int arg0) {
        field1278++;
        class43[] var1 = new class43[class76.field1102];
        for (int var2 = 0; var2 < class76.field1102; var2++) {
            int var3 = class77.field1126[var2] * class31.field392[var2];
            byte[] var4 = class203.field3645[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class84.field1237[class65.method409(255, var4[var6])];
            }
            var1[var2] = new class233(class149.field2391, class92.field1347, class234.field4169[var2], class240.field4261[var2], class77.field1126[var2], class31.field392[var2], var5);
        }
        if (arg0 == 27762) {
            class168.method1099(false);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)I")
    public static final int method548(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            field1281 = null;
        }
        int var3 = 0;
        field1280++;
        while (arg2 > 0) {
            arg2--;
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
        }
        return var3;
    }
}
