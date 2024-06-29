import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class157 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Lbh;")
    private class538 field2136 = new class538(128);

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lwu;")
    private class557 field2140;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2141 = 0;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[Lsg;")
    public static class17[] field2137;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 8)
    public static void method990(boolean arg0) {
        if (arg0) {
            field2137 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)Liu;", line = 21)
    public final class507 method991(int arg0, boolean arg1) {
        field2138++;
        class538 var3 = this.field2136;
        class507 var4;
        synchronized (this.field2136) {
            var4 = (class507) this.field2136.method3200((long) arg0, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2140.method3322(class163.method1015(-6816, arg0), class160.method998(arg0, -37), (byte) 90);
        class507 var6 = new class507();
        if (var5 != null) {
            var6.method3030(new class26(var5), 5);
        }
        if (arg1) {
            return null;
        }
        class538 var7 = this.field2136;
        synchronized (this.field2136) {
            this.field2136.method3199((byte) 78, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lwj;ILwu;)V", line = 60)
    public class157(class121 arg0, int arg1, class557 arg2) {
        this.field2140 = arg2;
        if (this.field2140 != null) {
            int var4 = this.field2140.method3341((byte) -118) - 1;
            this.field2140.method3333(var4, 3443);
        }
    }
}
