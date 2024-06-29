import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class472 {

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "Lbu;")
    public class529 field6384 = null;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "Lbu;")
    public class529 field6385 = null;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "[Lqw;")
    public class379[] field6383 = null;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "[Lqw;")
    public class379[] field6387 = null;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "Lbu;")
    public class529 field6388 = null;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "Z")
    public boolean field6386;

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lpea;)V", line = 24)
    public class472(class641 arg0) {
        this.field6386 = arg0.field9025;
        class470.method2646((byte) 98, arg0);
        if (this.field6386) {
            byte[] var2 = class648.method3605(true, class211.field2761, false);
            this.field6385 = new class529(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class648.method3605(true, class236.field3080, false);
            this.field6384 = new class529(arg0, 6410, 128, 128, 16, var3, 6410);
            class546 var4 = arg0.field8942;
            if (var4.method3075(35632)) {
                byte[] var5 = class648.method3605(true, class518.field7142, false);
                this.field6388 = new class529(arg0, 6408, 128, 128, 16);
                class529 var6 = new class529(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method3074(var6, 2.0F, this.field6388, (byte) 76)) {
                    this.field6388.method1595((byte) -99);
                } else {
                    this.field6388.method1588((byte) -122);
                    this.field6388 = null;
                }
                var6.method1588((byte) -122);
                return;
            }
        } else {
            this.field6387 = new class379[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class55.method349(var7 * 128 * 128 * 2, 32768, class211.field2761, (byte) 50);
                this.field6387[var7] = new class379(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field6383 = new class379[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class55.method349(var8 * 16384 * 2, 32768, class236.field3080, (byte) 50);
                this.field6383[var8] = new class379(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }
}
