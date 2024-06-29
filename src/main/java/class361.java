import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class361 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Llg;")
    private class237 field5162 = new class237(256);

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lao;")
    private class157 field5163;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lul;")
    private class343 field5164;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 5)
    public final void method2329(byte arg0) {
        this.field5162.method1618(0);
        if (arg0 < 65) {
            this.field5163 = (class157) null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lrj;", line = 16)
    public final class354 method2330(int arg0, int arg1) {
        Object var3 = this.field5162.method1625((long) arg0, 0);
        if (var3 != null) {
            return (class354) var3;
        } else if (this.field5164.method1328((byte) 109, arg0)) {
            class336 var4 = this.field5164.method1329((byte) -88, arg0);
            int var5 = var4.field4768 ? 64 : 128;
            class354 var7;
            if (var4.field4773 && this.field5163.method647()) {
                float[] var6 = this.field5164.method1326(false, arg1 ^ 0xD97, var5, arg0, var5, 0.7F);
                var7 = new class354(this.field5163, 3553, 34842, var5, var5, var4.field4775 != 0, var6, 6408);
            } else {
                short var8 = 6408;
                int[] var9 = this.field5164.method1324(false, arg0, var5, 0.7F, 1580, var5);
                var7 = new class354(this.field5163, 3553, var8, var5, var5, var4.field4775 != 0, var9, false);
            }
            var7.method2254(var4.field4769, var4.field4776);
            if (arg1 != 3553) {
                this.method2330(-58, 0);
            }
            this.field5162.method1622((byte) 13, var7, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lao;Lul;)V", line = 64)
    public class361(class157 arg0, class343 arg1) {
        this.field5163 = arg0;
        this.field5164 = arg1;
    }
}
