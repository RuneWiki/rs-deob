import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class670 {

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Laq;")
    private class494 field9397 = new class494(128);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lgga;")
    private class513 field9394;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lda;")
    public static class443 field9398;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lpt;", line = 8)
    public final class584 method3759(int arg0, int arg1) {
        field9396++;
        class494 var3 = this.field9397;
        class584 var4;
        synchronized (this.field9397) {
            var4 = (class584) this.field9397.method2882((long) arg0, (byte) -59);
            int var5 = -13 % ((-arg1 - 58) / 55);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field9394.method3019(class564.method3289(arg0, -85), class192.method1370(true, arg0), 94);
        class584 var7 = new class584();
        if (var6 != null) {
            var7.method3432(new class431(var6), 14979);
        }
        class494 var8 = this.field9397;
        synchronized (this.field9397) {
            this.field9397.method2890(-7307, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 36)
    public static void method3760(byte arg0) {
        field9398 = null;
        if (arg0 >= -32) {
            method3760((byte) 93);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBI)I", line = 53)
    public static final int method3761(int arg0, byte arg1, int arg2) {
        if (arg1 != -10) {
            field9398 = null;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        field9395++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lmca;ILgga;)V", line = 74)
    public class670(class41 arg0, int arg1, class513 arg2) {
        this.field9394 = arg2;
        if (this.field9394 != null) {
            int var4 = this.field9394.method3011((byte) -107) - 1;
            this.field9394.method3007(-1, var4);
        }
    }
}
