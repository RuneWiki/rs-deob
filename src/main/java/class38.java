import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class38 extends class238 {

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public int field494 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public int field497 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public int field500 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public int field501 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public int field498 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public int field499 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public int field505 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public int field507 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "Lvr;")
    public class80 field506;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "Lwf;")
    public static class79 field502 = new class79(21, 15);

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Lus;")
    public static class1 field509 = new class1(89, 8);

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "Z")
    public static boolean field510 = false;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "[I")
    public static int[] field511;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZIB)V")
    public static final void method251(boolean arg0, int arg1, byte arg2) {
        field493++;
        class456 var3 = class264.method1626(0, arg1, arg0);
        if (var3 == null) {
            return;
        }
        if (arg2 <= 80) {
            method252(66, (byte) -92);
        }
        for (int var4 = 0; var4 < var3.field6410.length; var4++) {
            var3.field6410[var4] = -1;
            var3.field6415[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)Lk;")
    public static final class365 method252(int arg0, byte arg1) {
        field503++;
        class365[] var2 = class456.method2674(116);
        int var3 = 0;
        if (arg1 > -123) {
            return null;
        }
        while (var3 < var2.length) {
            class365 var4 = var2[var3];
            if (var4.field5249 == arg0) {
                return var4;
            }
            var3++;
        }
        return null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method253(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field495++;
        class161.method1005(arg2, 0, arg3, arg5, arg8, true, arg6, arg1, arg7, arg4);
        if (arg0 != -103) {
            method251(true, 49, (byte) 48);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method254(int arg0, String arg1) {
        field504++;
        if (arg0 > -113) {
            field510 = true;
        }
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method255(int arg0) {
        field502 = null;
        field509 = null;
        if (arg0 != -23537) {
            field510 = true;
        }
        field511 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)V")
    public static final void method256(int arg0, int arg1, int arg2, int arg3) {
        field496++;
        class489 var4 = class116.method731(-625541408, 9, arg3);
        if (arg0 <= 64) {
            method254(-55, (String) null);
        }
        var4.method2863(255);
        var4.field6892 = arg2;
        var4.field6895 = arg1;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBI)Z")
    public final boolean method257(int arg0, byte arg1, int arg2) {
        field508++;
        if (this.field498 <= arg2 && this.field494 >= arg2 && arg0 >= this.field505 && arg0 <= this.field499) {
            return true;
        } else if (arg2 >= this.field507 && arg2 <= this.field497 && arg0 >= this.field500 && arg0 <= this.field501) {
            return true;
        } else {
            int var4 = -112 / ((46 - arg1) / 60);
            return false;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lvr;)V")
    public class38(class80 arg0) {
        this.field506 = arg0;
    }
}
