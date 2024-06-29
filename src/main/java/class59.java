import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class59 {

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Lng;")
    private class190 field837 = new class190(256);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Lsr;")
    private class136 field835;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lhj;")
    private class338 field836;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Lrq;")
    public final class195 method391(int arg0, int arg1) {
        Object var3 = this.field837.method1246((byte) -114, (long) arg0);
        if (var3 != null) {
            return (class195) var3;
        } else if (arg1 != 256) {
            return (class195) null;
        } else if (this.field835.method610((byte) 0, arg0)) {
            class164 var4 = this.field835.method607(false, arg0);
            int var5 = var4.field2301 ? 64 : 128;
            class195 var7;
            if (var4.field2320 && this.field836.method1780()) {
                float[] var6 = this.field835.method616(var5, 16155, 0.7F, false, arg0, var5);
                var7 = new class195(this.field836, 3553, 34842, var5, var5, var4.field2305 != 0, var6, 6408);
            } else {
                int[] var8 = this.field835.method608(arg0, 0.7F, var5, false, -67, var5);
                short var9 = 6408;
                var7 = new class195(this.field836, 3553, var9, var5, var5, var4.field2305 != 0, var8, false);
            }
            var7.method1295(var4.field2323, var4.field2308);
            this.field837.method1247((long) arg0, (byte) 53, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public final void method392(boolean arg0) {
        this.field837.method1249(1);
        if (!arg0) {
            this.method391(-44, 52);
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lhj;Lsr;)V")
    public class59(class338 arg0, class136 arg1) {
        this.field835 = arg1;
        this.field836 = arg0;
    }
}
