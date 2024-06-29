import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class574 {

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "[I")
    public static int[] field8346 = new int[50];

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field8345 = 0;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public int field8337;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public int field8341;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Lps;")
    public static class5 field8343;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "[Lnda;")
    public class655[] field8336;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static final void method3300(int arg0) {
        field8344++;
        class373.field5521 = -1;
        class65.field1038 = 0;
        class338.field4907 = arg0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lgk;I)V")
    public final void method3301(class540 arg0, int arg1) {
        field8342++;
        this.field8337 = arg0.method3154((byte) -95);
        this.field8341 = arg0.method3169(26488);
        this.field8336 = new class655[arg0.method3115(29871)];
        class139[] var3 = class317.method1968(true);
        for (int var4 = arg1; var4 < this.field8336.length; var4++) {
            this.field8336[var4] = this.method3302(arg0, var3[arg0.method3115(29871)], arg1);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lgk;Lmh;I)Lnda;")
    private final class655 method3302(class540 arg0, class139 arg1, int arg2) {
        field8338++;
        if (class20.field385 == arg1) {
            return class434.method2579(arg0, (byte) 107);
        } else if (class125.field1826 == arg1) {
            return class406.method2499((byte) -120, arg0);
        } else if (class350.field5178 == arg1) {
            return class196.method1281(67, arg0);
        } else if (class498.field7042 == arg1) {
            return class295.method1839(arg0, arg2);
        } else if (class625.field9042 == arg1) {
            return class409.method2512(arg0, false);
        } else if (class338.field4916 == arg1) {
            return class596.method3395((byte) 93, arg0);
        } else {
            if (arg2 != 0) {
                method3300(-53);
            }
            if (class639.field9182 == arg1) {
                return class295.method1842(arg0, arg2 ^ 0x5B);
            } else if (class538.field7897 == arg1) {
                return class329.method2027(29115, arg0);
            } else if (class460.field6627 == arg1) {
                return class567.method3267(arg0, (byte) -51);
            } else if (class285.field3809 == arg1) {
                return class587.method3352(255, arg0);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIB)V")
    public static final void method3303(boolean arg0, int arg1, byte arg2) {
        field8347++;
        class15 var3 = class262.method1577((byte) -17, arg1, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field330.length; var4++) {
            var3.field330[var4] = -1;
            var3.field328[var4] = 0;
        }
        if (arg2 != -125) {
            method3305(43);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Z")
    public static final boolean method3304(int arg0, int arg1, int arg2) {
        field8340++;
        if (arg1 <= 107) {
            field8343 = null;
        }
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public static void method3305(int arg0) {
        field8343 = null;
        field8346 = null;
        if (arg0 != 18008) {
            field8346 = null;
        }
    }
}
