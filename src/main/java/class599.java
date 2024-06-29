import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class599 {

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field7949 = 1401;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "Ldb;")
    public static class298 field7948 = new class298(22, 6);

    @OriginalMember(owner = "client!or", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field7950 = new String[100];

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public int field7944;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public int field7945;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public int field7947;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Loa;BLub;Lee;)V", line = 3)
    public static final void method3298(class651 arg0, byte arg1, class20 arg2, class634 arg3) {
        field7943++;
        class468 var4 = arg3.method3508(arg0, 103);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1035();
        if (var5 < var4.method1028()) {
            var5 = var4.method1028();
        }
        byte var6 = 10;
        int var7 = arg2.field322;
        int var8 = arg2.field323;
        int var9 = 0;
        if (arg1 > -111) {
            method3299((byte) -95, -23);
        }
        int var10 = 0;
        int var11 = 0;
        if (arg3.field8541 != null) {
            var9 = class664.field9424.method2846(false, null, class161.field2546, null, arg3.field8541);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class161.field2546[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class225.field3188.method599(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class225.field3188.method596() + (class225.field3188.method595() / 2);
        }
        int var15 = arg2.field322 + (var5 / 2);
        if ((class567.field7527 + var5) > var7) {
            var7 = class567.field7527;
            var15 = var10 / 2 + class567.field7527 + (var5 / 2) + var6 + 5;
        } else if (var7 > (class567.field7521 - var5)) {
            var15 = class567.field7521 - var6 - (var10 / 2) - (var5 / 2) - 5;
            var7 = class567.field7521 - var5;
        }
        int var16 = arg2.field323;
        if (class567.field7510 + var5 > var8) {
            var16 = var5 / 2 + class567.field7510 + var6;
            var8 = class567.field7510;
        } else if (var8 > class567.field7514 - var5) {
            var16 = class567.field7514 - var6 - (var5 / 2) - var11;
            var8 = class567.field7514 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg2.field322), (double) (var8 - arg2.field323)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method2636((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field8541 != null) {
            var18 = var15 - var10 / 2 - 5;
            var19 = var16;
            var20 = var18 + var10 + 10;
            var21 = (var16 + (var9 * class225.field3188.method596())) + 3;
            if (arg3.field8555 != 0) {
                arg0.method3567(var20 - var18, var18, var21 - var16, var16, arg3.field8555, (byte) 122);
            }
            if (arg3.field8530 != 0) {
                arg0.method3572((byte) -33, var18, arg3.field8530, var21 - var16, var16, var20 - var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class161.field2546[var22];
                if (var9 - 1 > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class225.field3188.method597(arg0, var23, var15, var16, arg3.field8546, true);
                var16 += class225.field3188.method596();
            }
        }
        if (arg3.field8554 == -1 && arg3.field8541 == null) {
            return;
        }
        class459 var24 = new class459(arg2);
        int var25 = var5 >> 1;
        var24.field6221 = var8 + var25;
        var24.field6222 = var7 + var25;
        var24.field6223 = var19;
        var24.field6228 = var21;
        var24.field6230 = var18;
        var24.field6225 = var8 - var25;
        var24.field6227 = var20;
        var24.field6231 = var7 - var25;
        class187.field2784.method3265(var24, (byte) -101);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BI)Lff;", line = 152)
    public static final class9 method3299(byte arg0, int arg1) {
        field7946++;
        class9[] var2 = class287.method1779((byte) -97);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class9 var4 = var2[var3];
            if (var4.field194 == arg1) {
                return var4;
            }
        }
        if (arg0 <= 120) {
            field7950 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 181)
    public static void method3300(int arg0) {
        field7950 = null;
        if (arg0 != 10) {
            field7950 = null;
        }
        field7948 = null;
    }
}
