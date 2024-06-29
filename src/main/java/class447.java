import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class447 {

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lwf;")
    private class117 field6262 = new class117(64);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lkda;")
    private class328 field6260;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public int field6264;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lada;")
    public static class144 field6261 = new class144(92, 8);

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field6263 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Lll;", line = 5)
    public final class307 method2708(int arg0, int arg1) {
        field6259++;
        class117 var3 = this.field6262;
        class307 var4;
        synchronized (this.field6262) {
            var4 = (class307) this.field6262.method842(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field6260;
        byte[] var6;
        synchronized (this.field6260) {
            var6 = this.field6260.method1966(arg0, arg1, true);
        }
        class307 var7 = new class307();
        if (var6 != null) {
            var7.method1873(new class148(var6), 14992);
        }
        class117 var8 = this.field6262;
        synchronized (this.field6262) {
            this.field6262.method835((byte) 123, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 33)
    public static void method2709(int arg0) {
        field6261 = null;
        int var1 = 0 / ((arg0 - 63) / 55);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lbt;ILkda;)V", line = 62)
    public class447(class39 arg0, int arg1, class328 arg2) {
        this.field6260 = arg2;
        this.field6264 = this.field6260.method1975(126, 19);
    }
}
