import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class89 {

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Lka;")
    private class408 field1253 = new class408(256);

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "Lgf;")
    private class202 field1252;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "Lmm;")
    private class357 field1251;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public final void method712(int arg0) {
        this.field1253.method2530((byte) -69);
        if (arg0 != 2989) {
            this.field1253 = (class408) null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Lhn;")
    public final class257 method713(int arg0, int arg1) {
        Object var3 = this.field1253.method2529(0, (long) arg0);
        if (var3 != null) {
            return (class257) var3;
        }
        if (arg1 != 64) {
            this.method713(-28, -98);
        }
        if (!this.field1252.method1360((byte) -106, arg0)) {
            return null;
        }
        class55 var4 = this.field1252.method1366(arg0, -11039);
        int var5 = var4.field708 ? 64 : 128;
        class257 var7;
        if (var4.field717 && this.field1251.method226()) {
            float[] var6 = this.field1252.method1359(arg0, false, (byte) -118, var5, var5, 0.7F);
            var7 = new class257(this.field1251, 3553, 34842, var5, var5, var4.field705 != 0, var6, 6408);
        } else {
            short var8 = 6408;
            int[] var9 = this.field1252.method1368(false, 0.7F, var5, var5, (byte) -74, arg0);
            var7 = new class257(this.field1251, 3553, var8, var5, var5, var4.field705 != 0, var9, false);
        }
        var7.method1659(var4.field714, var4.field699);
        this.field1253.method2527(arg1 ^ 0x9, (long) arg0, var7);
        return var7;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lmm;Lgf;)V")
    public class89(class357 arg0, class202 arg1) {
        this.field1252 = arg1;
        this.field1251 = arg0;
    }
}
