import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class340 extends class28 {

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "[I")
    public static int[] field5261 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "Lof;")
    public static class446 field5259 = new class446("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "Lla;")
    public static class319 field5267 = new class319(57, -2);

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "Lip;")
    public static class508 field5268 = new class508("", 15);

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public static final void method2196(String arg0, String arg1, boolean arg2) {
        class452.field6813 = arg1;
        class530.field7794 = arg0;
        ++field5263;
        if (class445.field6688 != 3 && (class452.field6813.equals("") || class530.field7794.equals(""))) {
            class79.method542(3, (byte) 52);
        } else if (arg2) {
            if (class445.field6688 != 1) {
                class532.field7830 = 0;
                class489.field7230 = -1;
            }
            class458.field6861 = false;
            class79.method542(-3, (byte) 50);
            class468.field7002 = 0;
            class470.field7016 = 0;
            class380.field5793 = 1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIIF)V")
    public class340(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BF)V")
    public final void method256(byte arg0, float arg1) {
        ++field5266;
        if (arg0 == 101) {
            super.field414 = arg1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)V")
    public static void method2197(int arg0) {
        field5259 = null;
        if (arg0 != 3) {
            method2196((String) null, (String) null, true);
        }
        field5268 = null;
        field5261 = null;
        field5267 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lwk;I)V")
    public static final void method2198(class96 arg0, int arg1) {
        ++field5260;
        if (arg1 < 66) {
            field5267 = null;
        }
        class179 var2 = (class179) class424.field6459.method1747((long) arg0.field3882, false);
        if (var2 != null) {
            if (var2.field2400 != null) {
                class31.field463.method883(var2.field2400);
                var2.field2400 = null;
            }
            var2.method25(-13489);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)V")
    public final void method259(int arg0, int arg1, int arg2, int arg3) {
        super.field401 = arg0;
        ++field5265;
        super.field406 = arg1;
        super.field402 = arg3;
        if (arg2 != 2) {
            field5268 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIII)V")
    public static final void method2199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class507.field7462 = arg5;
        class503.field7423 = arg4;
        ++field5262;
        class360.field5524 = arg0;
        class354.field5477 = arg1;
        int var6 = -105 / ((arg2 - 63) / 62);
        class174.field2332 = arg3;
        if (~class174.field2332 <= -101) {
            int var7 = class360.field5524 * 128 + 64;
            int var8 = class503.field7423 * 128 + 64;
            int var9 = class352.method2264(-118, class367.field5618, var8, var7) - class354.field5477;
            int var10 = -class199.field2646 + var7;
            int var11 = var9 - class26.field384;
            int var12 = -class140.field1869 + var8;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
            class296.field4378 = (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) & 16383;
            class49.field702 = 16383 & (int) (-2607.5945876176133D * Math.atan2((double) var10, (double) var12));
            class334.field5197 = 0;
            if (~class296.field4378 > -1025) {
                class296.field4378 = 1024;
            }
            if (~class296.field4378 < -3073) {
                class296.field4378 = 3072;
            }
        }
        field5269 = 2;
    }
}
