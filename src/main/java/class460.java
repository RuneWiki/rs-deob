import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class460 extends class270 {

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "[S")
    public static short[] field6397 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Lrt;")
    public static class208 field6400;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILiaa;)Lkq;", line = 6)
    public static final class541 method2622(int arg0, class452 arg1) {
        field6398++;
        String var2 = arg1.method2516(arg0 + 23745);
        class215 var3 = class220.method1292(75)[arg1.method2541(88)];
        class278 var4 = class437.method2415(-76)[arg1.method2541(127)];
        int var5 = arg1.method2549((byte) 32);
        int var6 = arg1.method2549((byte) 32);
        if (arg0 == -23645) {
            int var7 = arg1.method2575((byte) -48);
            int var8 = arg1.method2575((byte) -48);
            return new class541(var2, var3, var4, var5, var6, var7, var8);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Liaa;B)Ljava/lang/String;", line = 40)
    public static final String method2623(class452 arg0, byte arg1) {
        field6399++;
        if (arg1 != -125) {
            method2624((byte) 86);
        }
        return class163.method990(arg0, false, 32767);
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)V", line = 59)
    public static void method2624(byte arg0) {
        field6400 = null;
        if (arg0 != -88) {
            field6397 = null;
        }
        field6397 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
    public abstract int method785(int arg0);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)I")
    public abstract int method784(byte arg0);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)J")
    public abstract long method788(boolean arg0);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)I")
    public abstract int method787(int arg0);

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)I")
    public abstract int method786(int arg0);
}
