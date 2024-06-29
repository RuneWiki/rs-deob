import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class604 extends InputStream {

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "[I")
    public static int[] field8497 = new int[14];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Ltf;")
    public static class701 field8491;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[[[Lru;")
    public static class499[][][] field8494;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)[Lhb;")
    public static final class347[] method3376(int arg0) {
        if (arg0 != 127) {
            field8491 = null;
        }
        field8490++;
        return new class347[] { class45.field445, class412.field5525, class70.field693 };
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLvi;ZZ)V")
    public static final void method3377(byte arg0, class633 arg1, boolean arg2, boolean arg3) {
        field8496++;
        int var4 = arg1.field8920;
        int var5 = (int) arg1.field4176;
        arg1.method1922(74);
        if (arg3) {
            class22.method100((byte) 8, var4);
        }
        class301.method1749(var4, 65535);
        class452 var6 = class92.method464(var5, -167823504);
        if (var6 != null) {
            class130.method741(var6, 26034);
        }
        class571.method3226(-119);
        if (!arg2 && class209.field2466 != -1) {
            class633.method3561(false, class209.field2466, 1);
        }
        class289 var7 = new class289(class14.field117);
        int var8 = 22 % ((86 - arg0) / 38);
        for (class633 var9 = (class633) var7.method1686((byte) -4); var9 != null; var9 = (class633) var7.method1683(-1)) {
            if (!var9.method1925(14325)) {
                var9 = (class633) var7.method1686((byte) -4);
                if (var9 == null) {
                    return;
                }
            }
            if (var9.field8921 == 3) {
                int var10 = (int) var9.field4176;
                if ((var10 >>> 16) == var4) {
                    method3377((byte) -7, var9, arg2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method3378(byte arg0) {
        field8494 = null;
        field8497 = null;
        field8491 = null;
        if (arg0 != 95) {
            field8491 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
    public static final int method3379(int arg0, int arg1) {
        int var2 = -64 % ((arg0 - 6) / 51);
        field8493++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!jh", name = "read", descriptor = "()I")
    public final int read() {
        class452.method2602(30000L, (byte) -97);
        field8495++;
        return -1;
    }
}
