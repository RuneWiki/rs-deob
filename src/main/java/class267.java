import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class267 extends RuntimeException {

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3978;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Ljava/lang/String;")
    public String field3973;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lla;")
    public static class307 field3975;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
    public static final void method1663(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3981++;
        if (arg1 != 0) {
            method1663(106, -30, 9, -31, -104);
        }
        if (arg3 <= arg2) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                class306.field4574[var5][arg4] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg3; var6++) {
                class306.field4574[var6][arg4] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZIZ)V")
    public static final void method1664(boolean arg0, int arg1, boolean arg2) {
        field3980++;
        class411 var3 = class171.method1179(arg0, true, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field6200.length; var4++) {
            var3.field6200[var4] = -1;
            var3.field6201[var4] = 0;
        }
        if (arg2) {
            field3975 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIFIZIII)[I")
    public static final int[] method1665(int arg0, int arg1, float arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field3974++;
        int var8 = 90 % ((-arg5 - 20) / 33);
        int[] var9 = new int[arg1];
        class96 var10 = new class96();
        var10.field1498 = arg6;
        var10.field1493 = arg7;
        var10.field1491 = arg4;
        var10.field1502 = arg3;
        var10.field1487 = (int) (arg2 * 4096.0F);
        var10.field1497 = arg0;
        var10.method748((byte) 110);
        class275.method1714(84, 1, arg1);
        var10.method750(-108, var9, 0);
        return var9;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lcs;")
    public static final class219 method1666(int arg0) {
        field3972++;
        if (class137.field2025 == null || class516.field7570 == null) {
            return null;
        } else if (arg0 == 0) {
            for (class219 var1 = (class219) class516.field7570.method3162((byte) -125); var1 != null; var1 = (class219) class516.field7570.method3162((byte) -77)) {
                class473 var2 = class137.field2014.method699(var1.field3137, 115);
                if (var2 != null && var2.field6941 && var2.method2818(class137.field2016, arg0 - 124)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static void method1667(boolean arg0) {
        if (!arg0) {
            field3975 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class267(Throwable arg0, String arg1) {
        this.field3978 = arg0;
        this.field3973 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static final void method1668(byte arg0) {
        if (arg0 <= 26) {
            method1665(-118, -64, 1.678507F, -114, true, -13, -65, -13);
        }
        class97.method758(class520.field7622, false);
        class467.field6797++;
        field3977++;
        class43.field559.method2754(0, 5574);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)V")
    public static final void method1669(boolean arg0) {
        field3976++;
        for (int var1 = 0; var1 < 5; var1++) {
            class233.field3277[var1] = false;
        }
        class247.field3403 = class350.field5383;
        class96.field1501 = -1;
        class264.field3943 = class431.field6396;
        class350.field5388 = 5;
        class215.field3065 = 0;
        class305.field4564 = 0;
        class305.field4563 = class282.field4263;
        if (!arg0) {
            method1664(true, -14, false);
        }
        class163.field2431 = class86.field1350;
        class98.field1512 = class201.field2925;
        class15.field202 = class393.field5897;
        class39.field520 = -1;
    }
}
