import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class24 extends class186 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BF)V")
    public final void method160(byte arg0, float arg1) {
        int var3 = Float.floatToRawIntBits(arg1);
        this.field3066[this.field3044++] = (byte) (var3 >> 24);
        this.field3066[this.field3044++] = (byte) (var3 >> 16);
        int var4 = 117 % ((arg0 - 51) / 63);
        this.field3066[this.field3044++] = (byte) (var3 >> 8);
        this.field3066[this.field3044++] = (byte) var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(FB)V")
    public final void method161(float arg0, byte arg1) {
        int var3 = Float.floatToRawIntBits(arg0);
        this.field3066[this.field3044++] = (byte) var3;
        this.field3066[this.field3044++] = (byte) (var3 >> 8);
        int var4 = -62 % ((arg1 + 45) / 62);
        this.field3066[this.field3044++] = (byte) (var3 >> 16);
        this.field3066[this.field3044++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V")
    public class24(int arg0) {
        super(arg0);
    }
}
