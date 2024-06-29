import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class95 {

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "Lco;")
    private class210 field1183 = new class210(256);

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "Lic;")
    private class246 field1184;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "Leg;")
    private class394 field1182;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Ltr;")
    public final class151 method468(int arg0, int arg1) {
        Object var3 = this.field1183.method1163((byte) -47, (long) arg1);
        if (var3 != null) {
            return (class151) var3;
        } else if (!this.field1182.method575(arg1, (byte) 112)) {
            return null;
        } else if (arg0 == -1) {
            class189 var4 = this.field1182.method577(arg1, -127);
            int var5 = var4.field2592 ? 64 : 128;
            class151 var7;
            if (var4.field2577 && this.field1184.method1373()) {
                float[] var6 = this.field1182.method579(arg1, var5, false, 0.7F, var5, 11554);
                var7 = new class151(this.field1184, 3553, 34842, var5, var5, var4.field2578 != 0, var6, 6408);
            } else {
                int[] var8 = this.field1182.method573(false, -113, arg1, 0.7F, var5, var5);
                short var9 = 6408;
                var7 = new class151(this.field1184, 3553, var9, var5, var5, var4.field2578 != 0, var8, false);
            }
            var7.method733(var4.field2590, var4.field2572);
            this.field1183.method1172((long) arg1, 1, var7);
            return var7;
        } else {
            return (class151) null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public final void method469(byte arg0) {
        this.field1183.method1165((byte) 118);
        if (arg0 != 6) {
            this.method468(-115, 57);
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lic;Leg;)V")
    public class95(class246 arg0, class394 arg1) {
        this.field1184 = arg0;
        this.field1182 = arg1;
    }
}
