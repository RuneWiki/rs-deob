import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RDFTSKWD")
public class class47 extends class3 {

    @OriginalMember(owner = "client!RDFTSKWD", name = "n", descriptor = "Z")
    private boolean field1289 = false;

    @OriginalMember(owner = "client!RDFTSKWD", name = "o", descriptor = "Z")
    public boolean field1290 = false;

    @OriginalMember(owner = "client!RDFTSKWD", name = "q", descriptor = "I")
    private int field1292 = 45895;

    @OriginalMember(owner = "client!RDFTSKWD", name = "p", descriptor = "LTYXORIIC;")
    private class54 field1291;

    @OriginalMember(owner = "client!RDFTSKWD", name = "r", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "client!RDFTSKWD", name = "s", descriptor = "I")
    public int field1294;

    @OriginalMember(owner = "client!RDFTSKWD", name = "t", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!RDFTSKWD", name = "u", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "client!RDFTSKWD", name = "m", descriptor = "I")
    public int field1288;

    @OriginalMember(owner = "client!RDFTSKWD", name = "k", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client!RDFTSKWD", name = "l", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client!RDFTSKWD", name = "<init>", descriptor = "(IIIIIIIB)V")
    public class47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        this.field1291 = class54.field1407[arg3];
        this.field1293 = arg0;
        this.field1294 = arg6;
        if (arg7 == 1) {
            boolean var9 = false;
        } else {
            this.field1289 = !this.field1289;
        }
        this.field1295 = arg1;
        this.field1296 = arg5;
        this.field1288 = arg2 + arg4;
        this.field1290 = false;
    }

    @OriginalMember(owner = "client!RDFTSKWD", name = "a", descriptor = "(II)V")
    public final void method407(int arg0, int arg1) {
        this.field1287 += arg1;
        if (arg0 != -24812) {
            this.field1292 = 151;
        }
        while (true) {
            do {
                do {
                    if (this.field1287 <= this.field1291.field1411.method390(this.field1286, (byte) -99)) {
                        return;
                    }
                    this.field1287 -= this.field1291.field1411.method390(this.field1286, (byte) -99);
                    this.field1286++;
                } while (this.field1286 < this.field1291.field1411.field1148);
            } while (this.field1286 >= 0 && this.field1286 < this.field1291.field1411.field1148);
            this.field1286 = 0;
            this.field1290 = true;
        }
    }

    @OriginalMember(owner = "client!RDFTSKWD", name = "a", descriptor = "(B)LUNLYQRUD;")
    public final class56 method10(byte arg0) {
        if (arg0 != 93) {
            this.field1289 = !this.field1289;
        }
        class56 var2 = this.field1291.method436();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1291.field1411.field1149[this.field1286];
        class56 var4 = new class56(true, var2, false, 8, class6.method178(var3, 688));
        if (!this.field1290) {
            var4.method449(956);
            var4.method450(936, var3);
            var4.field1466 = null;
            var4.field1465 = null;
        }
        if (this.field1291.field1414 != 128 || this.field1291.field1415 != 128) {
            var4.method458(this.field1291.field1414, this.field1291.field1415, false, this.field1291.field1414);
        }
        if (this.field1291.field1416 != 0) {
            if (this.field1291.field1416 == 90) {
                var4.method453(0);
            }
            if (this.field1291.field1416 == 180) {
                var4.method453(0);
                var4.method453(0);
            }
            if (this.field1291.field1416 == 270) {
                var4.method453(0);
                var4.method453(0);
                var4.method453(0);
            }
        }
        var4.method459(this.field1291.field1417 + 64, this.field1291.field1418 + 850, -30, -50, -30, true);
        return var4;
    }
}
