import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class291 {

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lge;")
    private class511 field4323 = new class511(256);

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lbt;")
    private class33 field4318;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Ll;")
    private class16 field4321;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 7)
    public final void method1862(int arg0) {
        field4319++;
        this.field4323.method2989(false, arg0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V", line = 16)
    public final void method1863(boolean arg0) {
        if (arg0) {
            this.method1864(21, 74);
        }
        this.field4323.method2990((byte) -117);
        field4324++;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lbt;Ll;)V", line = 81)
    public class291(class33 arg0, class16 arg1) {
        this.field4318 = arg0;
        this.field4321 = arg1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Luk;", line = 35)
    public final class176 method1864(int arg0, int arg1) {
        field4320++;
        Object var3 = this.field4323.method2982(0, (long) arg1);
        if (var3 != null) {
            return (class176) var3;
        } else if (this.field4321.method92(12624, arg1)) {
            class39 var4 = this.field4321.method93((byte) 127, arg1);
            int var5 = var4.field823 ? 64 : this.field4318.field607;
            class176 var7;
            if (var4.field827 && this.field4318.method292()) {
                float[] var6 = this.field4321.method95(var5, arg1, 0.7F, -92, false, var5);
                var7 = new class176(this.field4318, 3553, 34842, var5, var5, var4.field824 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field818) {
                    var8 = this.field4321.method91(var5, false, var5, arg1, 0.7F, (byte) 26);
                } else {
                    var8 = this.field4321.method94((byte) -111, 0.7F, false, var5, var5, arg1);
                }
                var7 = new class176(this.field4318, 3553, 6408, var5, var5, var4.field824 != 0, var8, false);
            }
            if (arg0 <= 23) {
                this.method1864(-77, -73);
            }
            var7.method1226(var4.field826, var4.field820, (byte) -80);
            this.field4323.method2981(var7, 82, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }
}
