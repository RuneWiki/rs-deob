import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class29 {

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "Ldaa;")
    private class454 field314 = new class454();

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "Lpf;")
    private class30 field320 = new class30();

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "Lsi;")
    private class769 field317;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "[I")
    public static int[] field309 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "Z")
    public static boolean field315 = false;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "Lha;")
    public static class475 field307;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "Lrs;")
    public static class730 field313;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field311;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V")
    public final void method240(boolean arg0) {
        field308++;
        this.field320.method253((byte) -18);
        this.field317.method4249((byte) 75);
        this.field314 = new class454();
        this.field319 = this.field318;
        if (arg0) {
            field313 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(Z)V")
    public static void method241(boolean arg0) {
        field313 = null;
        if (arg0) {
            field315 = true;
        }
        field309 = null;
        field307 = null;
        field311 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
    public static final void method242(byte arg0) {
        if (class184.field2797 <= 0) {
            class57.field883 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class334.field4738.length; var2++) {
                if (class334.field4738[var2].indexOf("--> ") != -1) {
                    var1++;
                    if (class184.field2797 == var1) {
                        class57.field883 = class334.field4738[var2].substring(class334.field4738[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        }
        if (arg0 == -40) {
            field305++;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLdaa;J)V")
    public final void method243(byte arg0, class454 arg1, long arg2) {
        field316++;
        if (this.field319 == 0) {
            class454 var5 = this.field320.method247(-32331);
            var5.method4237(arg0 ^ 0x3);
            var5.method2665(24902);
            if (this.field314 == var5) {
                class454 var6 = this.field320.method247(arg0 - 32327);
                var6.method4237(-1);
                var6.method2665(arg0 + 24906);
            }
        } else {
            this.field319--;
        }
        if (arg0 == -4) {
            this.field317.method4252(false, arg1, arg2);
            this.field320.method248((byte) 84, arg1);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(JI)V")
    public final void method244(long arg0, int arg1) {
        field306++;
        class454 var4 = (class454) this.field317.method4253(arg0, arg1 + 20284);
        if (arg1 != -20285) {
            field307 = null;
        }
        if (var4 != null) {
            var4.method4237(-1);
            var4.method2665(24902);
            this.field319++;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IJ)Ldaa;")
    public final class454 method245(int arg0, long arg1) {
        field310++;
        if (arg0 != 4768) {
            field315 = false;
        }
        class454 var4 = (class454) this.field317.method4253(arg1, -1);
        if (var4 != null) {
            this.field320.method248((byte) 69, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BI)Z")
    public static final boolean method246(byte arg0, int arg1) {
        field312++;
        if (arg0 >= -23) {
            field307 = null;
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(I)V")
    public class29(int arg0) {
        this.field319 = arg0;
        this.field318 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field317 = new class769(var2);
    }
}
