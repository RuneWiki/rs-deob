import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class39 {

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Llh;")
    private class364 field589 = new class364(16);

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lhh;")
    private class84 field586;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Z")
    public static boolean field587;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ltn;Lea;IIIILqa;II)V")
    public static final void method298(class58 arg0, class381 arg1, int arg2, int arg3, int arg4, int arg5, class162 arg6, int arg7, int arg8) {
        if (arg3 != 0) {
            field587 = false;
        }
        field584++;
        class210 var9 = class495.field7209.method1835(36, arg7);
        if (var9 == null || !var9.field3041 || !var9.method1401(class526.field7733, arg3 ^ 0x69)) {
            return;
        }
        if (var9.field3035 != null) {
            int[] var10 = new int[var9.field3035.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class403.field5944 == 4) {
                    var13 = (int) class66.field1161 & 0x3FFF;
                } else {
                    var13 = (int) class66.field1161 + class8.field114 & 0x3FFF;
                }
                int var14 = class324.field4966[var13];
                int var15 = class324.field4974[var13];
                if (class403.field5944 != 4) {
                    var15 = var15 * 256 / (class43.field662 + 256);
                    var14 = var14 * 256 / (class43.field662 + 256);
                }
                var10[var11 * 2] = ((var9.field3035[var11 * 2] * 4 + arg5) * var15 + (var9.field3035[var11 * 2 + 1] * 4 + arg8) * var14 >> 15) + arg0.field925 / 2 + arg4;
                var10[var11 * 2 + 1] = arg0.field896 / 2 + arg2 - ((arg8 - -(var9.field3035[var11 * 2 + 1] * 4)) * var15 - (var9.field3035[var11 * 2] * 4 + arg5) * var14 >> 15);
            }
            class299.method1841(arg6, var10, var9.field3019, arg0.field964, arg0.field870);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg6.method460(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[(var12 + 1) * 2 + 1], var9.field3050, 1, arg1, arg4, arg2);
            }
            arg6.method460(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field3050, 1, arg1, arg4, arg2);
        }
        class528 var16 = null;
        if (var9.field3042 != -1) {
            var16 = var9.method1404(arg6, arg3 - 142664515, false);
            if (var16 != null) {
                class271.method1739(arg4, var16, (byte) 42, arg8, arg2, arg0, arg5, arg1);
            }
        }
        if (var9.field3039 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method139();
        }
        class488 var18 = class125.field1923;
        class12 var19 = class469.field6896;
        if (var9.field3015 == 1) {
            var18 = class55.field808;
            var19 = class42.field639;
        }
        if (var9.field3015 == 2) {
            var18 = class526.field7731;
            var19 = class476.field6998;
        }
        class367.method2361((byte) -107, var17, arg4, arg5, var9.field3020, var19, arg2, arg8, var18, arg1, arg0, var9.field3039);
        return;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBII)I")
    public static final int method299(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -56) {
            method298(null, null, 49, -71, -40, -59, null, 90, -105);
        }
        field591++;
        if (arg0 <= arg3) {
            return arg3 > arg2 ? arg2 : arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)Lva;")
    public final class342 method300(int arg0, byte arg1) {
        field594++;
        class364 var3 = this.field589;
        class342 var4;
        synchronized (this.field589) {
            var4 = (class342) this.field589.method2339(-99, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field586.method683(30, arg0, 5);
        class342 var6 = new class342();
        if (arg1 >= -33) {
            return null;
        }
        if (var5 != null) {
            var6.method2229(17304, new class303(var5));
        }
        class364 var7 = this.field589;
        synchronized (this.field589) {
            this.field589.method2342((long) arg0, var6, 63);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(IB)V")
    public final void method301(int arg0, byte arg1) {
        class364 var3 = this.field589;
        synchronized (this.field589) {
            this.field589.method2348(arg0, 45);
        }
        field585++;
        if (arg1 != 44) {
            method298(null, null, -74, 116, -54, -117, null, -87, -26);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public final void method302(int arg0) {
        field593++;
        if (arg0 <= 53) {
            this.field589 = null;
        }
        class364 var2 = this.field589;
        synchronized (this.field589) {
            this.field589.method2350((byte) 112);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public final void method303(byte arg0) {
        field590++;
        class364 var2 = this.field589;
        synchronized (this.field589) {
            this.field589.method2349(0);
            if (arg0 < 97) {
                this.method302(-29);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lmt;ILhh;)V")
    public class39(class271 arg0, int arg1, class84 arg2) {
        this.field586 = arg2;
        this.field586.method656((byte) 122, 30);
    }

    static {
        new class180("clan_chat", "clanchat", "conversation_clan", "clan_chat");
    }
}
