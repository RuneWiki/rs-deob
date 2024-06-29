import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class270 {

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Ltl;")
    private class400 field3993 = new class400(64);

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Lui;")
    private class451 field3997;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public int field3994;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field3992 = 0;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "[I")
    public static int[] field3996 = new int[13];

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "Lsh;")
    public static class472 field3990 = new class472(41, 3);

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field3998 = 0;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public static int field4000 = 0;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "Lqm;")
    public static class262 field3999;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)Lad;")
    public final class9 method1754(byte arg0, int arg1) {
        field3989++;
        class400 var3 = this.field3993;
        class9 var4;
        synchronized (this.field3993) {
            var4 = (class9) this.field3993.method2393(-121, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 < 38) {
            return null;
        } else {
            byte[] var5 = this.field3997.method2691(arg1, 19, 0);
            class9 var6 = new class9();
            if (var5 != null) {
                var6.method101(new class446(var5), (byte) 124);
            }
            class400 var7 = this.field3993;
            synchronized (this.field3993) {
                this.field3993.method2395(0, var6, (long) arg1);
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
    public static void method1755(boolean arg0) {
        if (!arg0) {
            field3990 = null;
        }
        field3990 = null;
        field3999 = null;
        field3996 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIII)V")
    public static final void method1756(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3995++;
        float var5 = (float) class189.field2914 / (float) class189.field2899;
        int var6 = arg3;
        int var7 = arg1;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg0 - (arg3 - var6) / 2;
        if (arg4 <= 19) {
            return;
        }
        int var9 = arg2 - (arg1 - var7) / 2;
        class294.field4429 = -1;
        class384.field5692 = class189.field2899 * var8 / var6;
        class303.field4512 = -1;
        class446.field6309 = class189.field2914 - (class189.field2914 * var9 / var7);
        class174.method1195(-111);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lse;Z)I")
    public static final int method1757(class146 arg0, boolean arg1) {
        field3991++;
        String var2 = class340.method2087(arg1, arg0);
        if (arg1) {
            method1757((class146) null, false);
        }
        int[] var3 = null;
        if (class9.method104(arg0.field2056, 0)) {
            var3 = class23.field309.method2364((byte) 118, (int) arg0.field2066).field2795;
        } else if (arg0.field2057 != -1) {
            var3 = class23.field309.method2364((byte) 118, arg0.field2057).field2795;
        } else if (class120.method851((byte) -111, arg0.field2056)) {
            class349 var4 = class18.field241[(int) arg0.field2066];
            if (var4 != null) {
                class273 var5 = var4.field5309;
                if (var5.field4107 != null) {
                    var5 = var5.method1781(class315.field4736, true);
                }
                if (var5 != null) {
                    var3 = var5.field4142;
                }
            }
        } else if (class450.method2656(1008, arg0.field2056)) {
            Object var6 = null;
            class271 var7;
            if (arg0.field2056 == 1008) {
                var7 = class206.field3124.method338((byte) 111, (int) arg0.field2066);
            } else {
                var7 = class206.field3124.method338((byte) 106, (int) (arg0.field2066 >>> 32 & 0x7FFFFFFFL));
            }
            if (var7.field4015 != null) {
                var7 = var7.method1759(class315.field4736, true);
            }
            if (var7 != null) {
                var3 = var7.field4029;
            }
        }
        if (var3 != null) {
            var2 = var2 + class220.method1450(-1, var3);
        }
        int var8 = class131.field1828.method2(var2, class163.field2265, -102);
        if (arg0.field2060) {
            var8 += class45.field636.method798() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lgp;ILui;)V")
    public class270(class430 arg0, int arg1, class451 arg2) {
        this.field3997 = arg2;
        this.field3994 = this.field3997.method2662(19, (byte) -7);
    }
}
