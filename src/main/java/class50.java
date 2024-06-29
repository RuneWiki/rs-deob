import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class50 extends class53 {

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "[I")
    public static int[] field826 = new int[200];

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public static int field830 = 10;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "Lp;")
    private static class280 field832 = class18.method140((byte) -117, "Unable to find ");

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "Lp;")
    private static class280 field829 = class18.method140((byte) -127, "Checking for updates )2 ");

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "Lp;")
    public static class280 field825 = field832;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "Lp;")
    public static class280 field828 = field829;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "Lma;")
    public static class187 field831;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "Lhe;")
    private class19 field819;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static void method366(boolean arg0) {
        field831 = null;
        field826 = null;
        field825 = null;
        if (arg0) {
            method367(-54, (class25) null);
        }
        field829 = null;
        field828 = null;
        field832 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILlj;)V")
    public static final void method367(int arg0, class25 arg1) {
        field820++;
        if (class191.field3338 != null) {
            try {
                class191.field3338.method1307(95, 0L);
                class191.field3338.method1306(arg1.field475, arg1.field481, 24, (byte) 81);
            } catch (Exception var2) {
            }
        }
        arg1.field481 += 24;
        if (arg0 != 0) {
            method366(true);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZI)I")
    public final int method368(int arg0, boolean arg1, int arg2) {
        field818++;
        if (!arg1) {
            field826 = null;
        }
        if (this.field819 == null) {
            return arg0;
        } else {
            class190 var4 = (class190) this.field819.method150((long) arg2, 119);
            return var4 == null ? arg0 : var4.field3329;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Llj;B)V")
    public final void method369(class25 arg0, byte arg1) {
        field821++;
        while (true) {
            int var3 = arg0.method189((byte) -103);
            if (var3 == 0) {
                if (arg1 == 126) {
                    return;
                } else {
                    this.method368(18, false, -17);
                    return;
                }
            }
            this.method372(arg0, var3, 0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILp;)Lp;")
    public final class280 method370(int arg0, int arg1, class280 arg2) {
        field823++;
        if (this.field819 == null) {
            return arg2;
        } else {
            int var4 = -81 % ((-arg0 - 28) / 39);
            class238 var5 = (class238) this.field819.method150((long) arg1, 101);
            return var5 == null ? arg2 : var5.field4124;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[I)[I")
    public static final int[] method371(int arg0, int[] arg1) {
        field824++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class143.method988(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Llj;II)V")
    private final void method372(class25 arg0, int arg1, int arg2) {
        field822++;
        if (arg2 != 0 || arg1 != 249) {
            return;
        }
        int var4 = arg0.method189((byte) -103);
        if (this.field819 == null) {
            int var5 = class79.method585(var4, -805756542);
            this.field819 = new class19(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method189((byte) -103) == 1;
            int var8 = arg0.method230(15046);
            class161 var9;
            if (var7) {
                var9 = new class238(arg0.method198(false));
            } else {
                var9 = new class190(arg0.method199((byte) -85));
            }
            this.field819.method148(arg2 - 1, var9, (long) var8);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLp;)I")
    public static final int method373(boolean arg0, class280 arg1) {
        field827++;
        if (arg0) {
            return 72;
        }
        for (int var2 = 0; var2 < class142.field2500.length; var2++) {
            if (class142.field2500[var2].method1887((byte) 32, arg1)) {
                return var2;
            }
        }
        return -1;
    }
}
