import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class211 {

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field3282 = -2;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Ljo;")
    public class211 field3280;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "Ljo;")
    public class211 field3285;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1296(int arg0) {
        field3281++;
        if (arg0 >= 85) {
            class345.field5121 = new class4();
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 20)
    public final void method1297(byte arg0) {
        field3283++;
        if (this.field3280 == null) {
            return;
        }
        this.field3280.field3285 = this.field3285;
        int var2 = -12 / ((arg0 + 89) / 34);
        this.field3285.field3280 = this.field3280;
        this.field3280 = null;
        this.field3285 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ltq;I)Ltq;", line = 37)
    public static final class427 method1298(class427 arg0, int arg1) {
        field3286++;
        if (arg1 <= 12) {
            return null;
        }
        class427 var2 = client.method1172(arg0);
        if (var2 == null) {
            var2 = arg0.field6220;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)I", line = 59)
    public static final int method1299(int arg0, int arg1, int arg2) {
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        int var4 = 9 / ((-arg1 - 62) / 39);
        field3277++;
        while (arg2 != 0) {
            int var5 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var5;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIBIIIII)V", line = 85)
    public static final void method1300(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3278++;
        if (arg2 <= 44) {
            method1301(null, 69, 110);
        }
        int var8 = class167.method1056(class478.field7310, (byte) -128, class248.field3808, arg7);
        int var9 = class167.method1056(class478.field7310, (byte) -125, class248.field3808, arg5);
        int var10 = class167.method1056(class320.field4818, (byte) -123, class355.field5296, arg6);
        int var11 = class167.method1056(class320.field4818, (byte) -126, class355.field5296, arg1);
        int var12 = class167.method1056(class478.field7310, (byte) -123, class248.field3808, arg7 + arg0);
        int var13 = class167.method1056(class478.field7310, (byte) -124, class248.field3808, arg5 - arg0);
        for (int var14 = var8; var14 < var12; var14++) {
            class78.method566(class69.field1212[var14], var11, arg3, -7, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class78.method566(class69.field1212[var15], var11, arg3, -7, var10);
        }
        int var16 = class167.method1056(class320.field4818, (byte) -128, class355.field5296, arg0 + arg6);
        int var17 = class167.method1056(class320.field4818, (byte) -127, class355.field5296, arg1 - arg0);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class69.field1212[var18];
            class78.method566(var19, var16, arg3, -7, var10);
            class78.method566(var19, var17, arg4, -7, var16);
            class78.method566(var19, var11, arg3, -7, var17);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 139)
    public static final void method1301(String arg0, int arg1, int arg2) {
        if (arg1 >= -26) {
            field3282 = 47;
        }
        field3279++;
        int var3 = class328.field4921;
        int[] var4 = class280.field4247;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class47 var7 = class224.field3450[var4[var6]];
            if (var7 != null && class286.field4329 != var7 && var7.field685 != null && var7.field685.equalsIgnoreCase(arg0)) {
                if (arg2 == 1) {
                    class400.method2379((byte) -75, class429.field6297);
                    class434.field6365++;
                    class230.field3508.method268(0, 97);
                    class230.field3508.method252(var4[var6], -98);
                } else if (arg2 == 4) {
                    class400.method2379((byte) -75, class218.field3354);
                    class320.field4810++;
                    class230.field3508.method221(-1, 0);
                    class230.field3508.method263(var4[var6], (byte) -123);
                } else if (arg2 == 5) {
                    class400.method2379((byte) -75, class329.field4935);
                    class436.field6390++;
                    class230.field3508.method246((byte) -35, var4[var6]);
                    class230.field3508.method268(0, 80);
                } else if (arg2 == 6) {
                    class214.field3316++;
                    class400.method2379((byte) -75, class49.field755);
                    class230.field3508.method252(var4[var6], -102);
                    class230.field3508.method221(-1, 0);
                } else if (arg2 == 7) {
                    class219.field3365++;
                    class400.method2379((byte) -75, class375.field5473);
                    class230.field3508.method263(var4[var6], (byte) -67);
                    class230.field3508.method225(0, -100);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class499.method3000((byte) -48, class480.field7318.method2473(class406.field5898, -82) + arg0);
        }
    }
}
