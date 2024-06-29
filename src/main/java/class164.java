import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class164 {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lal;")
    private class52 field2577 = new class52(256);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lsq;")
    private class96 field2576;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lah;")
    private class215 field2575;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public final void method1157(int arg0) {
        this.field2577.method335((byte) -52);
        if (arg0 != 0) {
            this.method1157(-75);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lai;")
    public final class355 method1158(int arg0, int arg1) {
        Object var3 = this.field2577.method331((byte) 69, (long) arg0);
        if (var3 != null) {
            return (class355) var3;
        } else if (this.field2575.method985(arg0, (byte) -16)) {
            if (arg1 != -1) {
                this.field2576 = (class96) null;
            }
            class266 var4 = this.field2575.method989(arg0, (byte) 107);
            int var5 = var4.field4282 ? 64 : 128;
            class355 var7;
            if (var4.field4274 && this.field2576.method657()) {
                float[] var6 = this.field2575.method990(arg0, var5, 0.7F, (byte) 108, false, var5);
                var7 = new class355(this.field2576, 3553, 34842, var5, var5, var4.field4271 != 0, var6, 6408);
            } else {
                short var8 = 6408;
                int[] var9 = this.field2575.method984(arg0, var5, false, false, 0.7F, var5);
                var7 = new class355(this.field2576, 3553, var8, var5, var5, var4.field4271 != 0, var9, false);
            }
            var7.method2309(var4.field4278, var4.field4275);
            this.field2577.method341(54, (long) arg0, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lsq;Lah;)V")
    public class164(class96 arg0, class215 arg1) {
        this.field2576 = arg0;
        this.field2575 = arg1;
    }
}
