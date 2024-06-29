import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class514 {

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "Lbi;")
    private class483 field7211;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public int field7210;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "Lbda;")
    public static class508 field7213 = new class508();

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public static int field7217 = 0;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field7216 = 0;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "[I")
    public static int[] field7215 = new int[3];

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "Z")
    public static boolean field7214 = false;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "[[I")
    public static int[][] field7220 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "[I")
    public static int[] field7218;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lup;Lcs;Lha;B)V")
    public static final void method2991(class278 arg0, class344 arg1, class60 arg2, byte arg3) {
        field7208++;
        class481 var4 = arg0.method1647(arg2, (byte) -81);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method143();
        if (var4.method144() > var5) {
            var5 = var4.method144();
        }
        byte var6 = 10;
        int var7 = arg1.field4351;
        int var8 = arg1.field4350;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field3522 != null) {
            var9 = class165.field2306.method1624(arg0.field3522, class689.field9587, false, null, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class689.field9587[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class127.field1809.method3269(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class127.field1809.method3270() * var9 + class127.field1809.method3268() / 2;
        }
        int var15 = var5 / 2 + arg1.field4351;
        int var16 = arg1.field4350;
        if ((class73.field1052 + var5) > var7) {
            var15 = class73.field1052 + var6 + 5 - (-(var5 / 2) + -(var10 / 2));
            var7 = class73.field1052;
        } else if (class73.field1048 - var5 < var7) {
            var7 = class73.field1048 - var5;
            var15 = class73.field1048 - var5 / 2 - (var10 / 2) - var6 - 5;
        }
        int var17 = -32 % ((54 - arg3) / 39);
        if (var8 < class73.field1045 + var5) {
            var16 = var5 / 2 + class73.field1045 + var6;
            var8 = class73.field1045;
        } else if (var8 > class73.field1044 - var5) {
            var8 = class73.field1044 - var5;
            var16 = class73.field1044 - (var5 / 2) - var6 - var11;
        }
        int var18 = (int) (Math.atan2((double) (var7 - arg1.field4351), (double) (var8 - arg1.field4350)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method2765((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var18);
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        int var22 = -2;
        if (arg0.field3522 != null) {
            var19 = var15 - var10 / 2 - 5;
            var20 = var16;
            var22 = class127.field1809.method3270() * var9 + var16 + 3;
            var21 = var10 + var19 + 10;
            if (arg0.field3516 != 0) {
                arg2.method544(arg0.field3516, var22 - var16, var19, 18553, var21 - var19, var16);
            }
            if (arg0.field3525 != 0) {
                arg2.method532(var22 - var16, -var19 + var21, var19, var16, true, arg0.field3525);
            }
            for (int var23 = 0; var23 < var9; var23++) {
                String var24 = class689.field9587[var23];
                if ((var9 - 1) > var23) {
                    var24 = var24.substring(0, var24.length() - 4);
                }
                class127.field1809.method3271(arg2, var24, var15, var16, arg0.field3534, true);
                var16 += class127.field1809.method3270();
            }
        }
        if (arg0.field3530 == -1 && arg0.field3522 == null) {
            return;
        }
        class586 var25 = new class586(arg1);
        int var26 = var5 >> 1;
        var25.field8179 = var19;
        var25.field8178 = var20;
        var25.field8182 = var21;
        var25.field8191 = var7 + var26;
        var25.field8183 = var22;
        var25.field8190 = var8 + var26;
        var25.field8180 = var8 - var26;
        var25.field8184 = var7 - var26;
        class537.field7459.method3671(var25, false);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Z")
    public static final boolean method2992(int arg0, int arg1) {
        if (arg1 >= -3) {
            return true;
        } else {
            field7212++;
            return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!jq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field7211.method2831(123, this.field7210);
        field7209++;
        super.finalize();
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
    public static void method2993(byte arg0) {
        field7218 = null;
        field7215 = null;
        field7220 = null;
        field7213 = null;
        if (arg0 != -122) {
            field7220 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILsh;Lhg;)Llk;")
    public static final class589 method2994(int arg0, class71 arg1, class693 arg2) {
        field7219++;
        if (arg0 != -29488) {
            method2993((byte) -73);
        }
        class589 var3 = class659.method3711(arg0 + 29488);
        var3.field8246 = arg2;
        var3.field8248 = arg2.field9631;
        if (var3.field8248 == -1) {
            var3.field8251 = new class180(260);
        } else if (var3.field8248 == -2) {
            var3.field8251 = new class180(10000);
        } else if (var3.field8248 <= 18) {
            var3.field8251 = new class180(20);
        } else if (var3.field8248 > 98) {
            var3.field8251 = new class180(260);
        } else {
            var3.field8251 = new class180(100);
        }
        var3.field8251.method1231(arg1, 8);
        var3.field8251.method1233(var3.field8246.method3883(-35424733), 17695);
        var3.field8252 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lbi;II)V")
    public class514(class483 arg0, int arg1, int arg2) {
        this.field7211 = arg0;
        this.field7210 = arg2;
    }
}
