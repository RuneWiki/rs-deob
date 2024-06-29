import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class421 {

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public int field6367 = 0;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public int field6368 = 0;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lfr;")
    private class231 field6361 = new class231(64);

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Lsu;")
    private class370 field6371 = null;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Lqs;")
    private class496 field6360;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Lqs;")
    private class496 field6370;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
    public static int[] field6362 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field6365 = -1;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[Lsq;")
    public static class145[] field6364 = new class145[14];

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lug;")
    public static class322 field6363;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)Lr;", line = 26)
    public final class71 method2586(int arg0, boolean arg1) {
        field6366++;
        class71 var3 = (class71) this.field6361.method1593((byte) -70, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field6370.method2926(arg0 & 0x7FFF, -53, 1);
        } else {
            var4 = this.field6360.method2926(arg0, -89, 1);
        }
        class71 var5 = new class71();
        var5.field1237 = this;
        if (var4 != null) {
            var5.method504((byte) 94, new class23(var4));
        }
        if (arg0 >= 32768) {
            var5.method502(!arg1);
        }
        this.field6361.method1595(var5, (long) arg0, (byte) 86);
        if (arg1) {
            this.field6371 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(J[IBLrr;)Ljava/lang/String;", line = 60)
    public final String method2587(long arg0, int[] arg1, byte arg2, class280 arg3) {
        field6369++;
        if (this.field6371 != null) {
            String var6 = this.field6371.method110(arg1, arg3, 0, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg2 > -121) {
            field6363 = null;
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(ILqs;Lqs;Lsu;)V", line = 109)
    public class421(int arg0, class496 arg1, class496 arg2, class370 arg3) {
        this.field6371 = arg3;
        this.field6360 = arg1;
        this.field6370 = arg2;
        if (this.field6360 != null) {
            this.field6367 = this.field6360.method2940(1, -10511);
        }
        if (this.field6370 != null) {
            this.field6368 = this.field6370.method2940(1, -10511);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 87)
    public static void method2588(int arg0) {
        if (arg0 != 14) {
            field6362 = null;
        }
        field6362 = null;
        field6364 = null;
        field6363 = null;
    }
}
