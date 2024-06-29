import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class223 {

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public int field3621;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public int field3618;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public int field3608;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Ltl;")
    private static class59 field3611 = class85.method639("glow1:", 9588);

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Ltl;")
    public static class59 field3616 = field3611;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Ltl;")
    public static class59 field3617 = class85.method639("Wordpack geladen)3", 9588);

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field3619 = 0;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Ltl;")
    public static class59 field3623 = field3611;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Ltl;")
    public static class59 field3614 = class85.method639(" loggt sich aus)3", 9588);

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field3613 = 0;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "[[I")
    public static int[][] field3625 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field3626 = 0;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field3627 = 0;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[I")
    public static int[] field3612;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 7)
    public static void method1539(int arg0) {
        field3611 = null;
        field3617 = null;
        field3625 = (int[][]) null;
        if (arg0 >= -34) {
            field3616 = (class59) null;
        }
        field3616 = null;
        field3612 = null;
        field3614 = null;
        field3623 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)Z", line = 23)
    public static final boolean method1540(boolean arg0) {
        field3615++;
        try {
            return arg0 ? class77.method607(1) : true;
        } catch (IOException var5) {
            class86.method650(-72);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class151.field2485 + "," + class162.field2641 + "," + class183.field3063 + " - " + class146.field2387 + "," + (class286.field4920.field1729[0] + class197.field3249) + "," + (class286.field4920.field1773[0] + class187.field3135) + " - ";
            for (int var4 = 0; class146.field2387 > var4 && var4 < 50; var4++) {
                var3 = var3 + class18.field236.field2758[var4] + ",";
            }
            class306.method2126(var3, -13, var6);
            class311.method2147(-124);
            return true;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 71)
    public static final void method1541(int arg0) {
        field3609++;
        for (class308 var1 = (class308) class27.field357.method536(2); var1 != null; var1 = (class308) class27.field357.method533(24)) {
            if (var1.field5226) {
                var1.method2136(-15031);
            }
        }
        int var2 = -31 % ((-arg0 - 43) / 37);
        for (class308 var3 = (class308) class130.field2157.method536(2); var3 != null; var3 = (class308) class130.field2157.method533(24)) {
            if (var3.field5226) {
                var3.method2136(-15031);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lme;B)V", line = 105)
    public static final void method1542(class295 arg0, byte arg1) {
        field3622++;
        if (arg1 == -43) {
            class119.field1964 = arg0;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Z", line = 124)
    public static final boolean method1543(int arg0, int arg1) {
        field3620++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        }
        if (arg1 != 128) {
            field3619 = 84;
        }
        if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(III)V", line = 152)
    public class223(int arg0, int arg1, int arg2) {
        this.field3621 = arg2;
        this.field3618 = arg0;
        this.field3608 = arg1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZIZZII)Loj;", line = 177)
    public static final class260 method1544(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        class44 var8 = class81.method616(arg6, (byte) 25);
        if (arg0 > 1 && var8.field686 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg0 >= var8.field706[var10] && var8.field706[var10] != 0) {
                    var9 = var8.field686[var10];
                }
            }
            if (var9 != -1) {
                var8 = class81.method616(var9, (byte) 25);
            }
        }
        class258 var11 = var8.method298(100);
        field3624++;
        if (var11 == null) {
            return null;
        }
        class47 var12 = null;
        if (var8.field673 != -1) {
            var12 = (class47) method1544(10, 0, true, 1, false, true, var8.field684, 102);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field657 != -1) {
            var12 = (class47) method1544(arg0, arg1, true, arg3, false, false, var8.field701, 85);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class272.field4709;
        int var14 = class272.field4704;
        int[] var15 = new int[4];
        int var16 = class272.field4701;
        class272.method1896(var15);
        class47 var17 = new class47(36, 32);
        class272.method1912(var17.field757, 36, 32);
        class298.method2079();
        class298.method2084(16, 16);
        int var18 = var8.field676;
        class298.field5104 = false;
        if (arg5) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg3 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        if (arg7 < 58) {
            return (class260) null;
        }
        int var19 = class298.field5094[var8.field722] * var18 >> 16;
        int var20 = class298.field5095[var8.field722] * var18 >> 16;
        var11.method427(0, var8.field665, var8.field664, var8.field722, var8.field681, var20 + var8.field669 - (var11.method152() / 2), var19 - -var8.field669);
        if (arg3 >= 1) {
            var17.method349(1);
            if (arg3 >= 2) {
                var17.method349(16777215);
            }
            class272.method1912(var17.field757, 36, 32);
        }
        if (arg1 != 0) {
            var17.method345(arg1);
        }
        if (var8.field673 != -1) {
            var12.method337(0, 0);
        } else if (var8.field657 != -1) {
            class272.method1912(var12.field757, 36, 32);
            var17.method337(0, 0);
            var17 = var12;
        }
        if (arg4 && (var8.field682 == 1 || arg0 != 1) && arg0 != -1) {
            class212.field3475.method720(class265.method1838(-98, arg0), 0, 9, 16776960, 1);
        }
        class272.method1912(var13, var14, var16);
        class272.method1906(var15);
        class298.method2079();
        class298.field5104 = true;
        return class55.field815 && !arg2 ? new class122(var17) : var17;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
    public abstract void method1148(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(III)V")
    public abstract void method1149(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(III)V")
    public abstract void method1144(int arg0, int arg1, int arg2);
}
