import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class31 extends class253 {

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public static int field390 = 0;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "[S")
    public static short[] field384 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "Lec;")
    public static class25 field393 = new class25(64);

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field396 = -1;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "[S")
    public static short[] field399 = new short[] { 16, 41, 28, 13, 29, 32, 40, 1 };

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Lfa;")
    public static class273 field388;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "Lfa;")
    public static class273 field397;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "Lbe;")
    public static class30 field398;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
    public final void method47(int arg0, int arg1, int arg2) {
        ++field389;
        if (arg1 < -47) {
            int var4 = this.field387 * arg2 >> 12;
            int var5 = this.field385 * arg2 >> 12;
            int var6 = this.field395 * arg0 >> 12;
            int var7 = this.field383 * arg0 >> 12;
            class119.method780(var7, var6, super.field4014, var5, var4, (byte) 48);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)Lak;")
    public static final class146 method184(int arg0, byte arg1) {
        ++field386;
        class146 var2 = (class146) class201.field3195.method149((byte) -66, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 != -19) {
                method184(-64, (byte) -91);
            }
            class146 var3 = class287.method2017(class143.field2223, class179.field2780, false, arg1 + 19, arg0);
            if (var3 != null) {
                class201.field3195.method152(var3, (long) arg0, true);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method185(byte arg0) {
        if (arg0 > 16) {
            field398 = null;
            field384 = null;
            field397 = null;
            field393 = null;
            field388 = null;
            field399 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZLkk;)Ljava/lang/String;")
    public static final String method186(int arg0, boolean arg1, class254 arg2) {
        if (arg1) {
            method185((byte) 95);
        }
        ++field382;
        if (!client.method1085(arg2).method1647((byte) -126, arg0) && arg2.field4032 == null) {
            return null;
        } else if (arg2.field4099 != null && arg2.field4099.length > arg0 && arg2.field4099[arg0] != null && ~arg2.field4099[arg0].trim().length() != -1) {
            return arg2.field4099[arg0];
        } else {
            return class266.field4381 ? "Hidden-" + arg0 : null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZI)V")
    public final void method44(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method44(62, false, 58);
        }
        ++field394;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBI)V")
    public final void method40(int arg0, byte arg1, int arg2) {
        if (arg1 != -14) {
            field388 = null;
        }
        ++field381;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lfa;II)Llm;")
    public static final class236 method187(class273 arg0, int arg1, int arg2) {
        int var3 = -111 % ((arg1 - -31) / 32);
        ++field391;
        byte[] var4 = arg0.method1884(arg2, (byte) 62);
        return var4 == null ? null : new class236(var4);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIII)V")
    public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field387 = arg0;
        this.field395 = arg3;
        this.field383 = arg1;
        this.field385 = arg2;
    }
}
