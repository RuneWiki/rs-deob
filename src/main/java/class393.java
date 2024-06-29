import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class393 {

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "Lwe;")
    private class408 field5912 = new class408();

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "Lre;")
    private class603 field5919 = new class603();

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    private int field5915;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    private int field5916;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "Lhe;")
    private class372 field5913;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "Z")
    public static boolean field5909 = true;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static int field5906 = -50;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "Lada;")
    public static class164 field5917 = new class164();

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "[I")
    public static int[] field5918 = new int[8];

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V", line = 3)
    public static void method2512(byte arg0) {
        if (arg0 >= 32) {
            field5917 = null;
            field5918 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZII)Z", line = 14)
    public static final boolean method2513(boolean arg0, int arg1, int arg2) {
        field5914++;
        if (arg0) {
            return (arg2 & 0xC580) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 25)
    public final void method2514(int arg0) {
        field5911++;
        this.field5919.method3503(-16);
        this.field5913.method2289(1393);
        this.field5912 = new class408();
        if (arg0 > -124) {
            method2513(true, 4, -104);
        }
        this.field5916 = this.field5915;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(JB)Lwe;", line = 49)
    public final class408 method2515(long arg0, byte arg1) {
        int var4 = 84 % ((-arg1 - 29) / 61);
        field5908++;
        class408 var5 = (class408) this.field5913.method2287(arg0, (byte) -117);
        if (var5 != null) {
            this.field5919.method3505(var5, 4);
        }
        return var5;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IJ)V", line = 79)
    public final void method2516(int arg0, long arg1) {
        field5905++;
        if (arg0 != -51) {
            this.field5916 = 41;
        }
        class408 var4 = (class408) this.field5913.method2287(arg1, (byte) -117);
        if (var4 != null) {
            var4.method1304((byte) 7);
            var4.method2597(-86);
            this.field5916++;
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V", line = 101)
    public static final void method2517(byte arg0) {
        field5907++;
        if (arg0 < 74) {
            method2512((byte) -58);
        }
        class243[] var1 = class373.field5546;
        synchronized (class373.field5546) {
            for (int var2 = 0; var2 < class373.field5546.length; var2++) {
                class373.field5546[var2] = new class243();
                class430.field6436[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(I)V", line = 182)
    public class393(int arg0) {
        this.field5915 = arg0;
        this.field5916 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5913 = new class372(var2);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(JILwe;)V", line = 142)
    public final void method2518(long arg0, int arg1, class408 arg2) {
        if (this.field5916 == 0) {
            class408 var5 = this.field5919.method3510(-45);
            var5.method1304((byte) 7);
            var5.method2597(-63);
            if (this.field5912 == var5) {
                class408 var6 = this.field5919.method3510(-57);
                var6.method1304((byte) 7);
                var6.method2597(arg1 - 22416);
            }
        } else {
            this.field5916--;
        }
        if (arg1 != 22363) {
            this.method2518(-123L, -46, null);
        }
        field5910++;
        this.field5913.method2278((byte) -76, arg0, arg2);
        this.field5919.method3505(arg2, 4);
    }
}
