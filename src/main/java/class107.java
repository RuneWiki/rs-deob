import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class107 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lub;")
    private class15 field1366 = new class15(256);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lbk;")
    private class211 field1367;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lig;")
    private class132 field1368;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lhf;")
    public final class225 method628(int arg0, int arg1) {
        Object var3 = this.field1366.method99(true, (long) arg1);
        if (var3 != null) {
            return (class225) var3;
        } else if (this.field1367.method1471(-31571, arg1)) {
            class287 var4 = this.field1367.method1475(arg1, arg0 ^ 0xFFFFDC45);
            int var5 = var4.field4164 ? 64 : 128;
            if (arg0 != -26292) {
                return (class225) null;
            }
            class225 var7;
            if (var4.field4181 && this.field1368.method971()) {
                float[] var6 = this.field1367.method1476(arg1, 0.7F, var5, (byte) 17, false, var5);
                var7 = new class225(this.field1368, 3553, 34842, var5, var5, var4.field4185 != 0, var6, 6408);
            } else {
                short var8 = 6408;
                int[] var9 = this.field1367.method1470(0.7F, arg1, var5, 3962, var5, false);
                var7 = new class225(this.field1368, 3553, var8, var5, var5, var4.field4185 != 0, var9, false);
            }
            var7.method1580(var4.field4183, var4.field4173);
            this.field1366.method90(var7, (long) arg1, 0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public final void method629(int arg0) {
        this.field1366.method102((byte) -113);
        if (arg0 < 50) {
            this.field1366 = (class15) null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lig;Lbk;)V")
    public class107(class132 arg0, class211 arg1) {
        this.field1367 = arg1;
        this.field1368 = arg0;
    }
}
