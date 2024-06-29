import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LQFXNPID")
public class class31 extends class17 {

    @OriginalMember(owner = "client!LQFXNPID", name = "n", descriptor = "Z")
    public boolean field1002 = false;

    @OriginalMember(owner = "client!LQFXNPID", name = "s", descriptor = "I")
    private int field1007 = 41952;

    @OriginalMember(owner = "client!LQFXNPID", name = "t", descriptor = "LQUXKFXEA;")
    private class45 field1008;

    @OriginalMember(owner = "client!LQFXNPID", name = "o", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "client!LQFXNPID", name = "p", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!LQFXNPID", name = "q", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!LQFXNPID", name = "r", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!LQFXNPID", name = "k", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!LQFXNPID", name = "l", descriptor = "I")
    private int field1000;

    @OriginalMember(owner = "client!LQFXNPID", name = "m", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!LQFXNPID", name = "<init>", descriptor = "(IIIIIIII)V")
    public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1008 = class45.field1307[arg6];
        this.field1003 = arg0;
        this.field1004 = arg4;
        this.field1005 = arg7;
        this.field1006 = arg2;
        this.field999 = arg3 + arg5;
        this.field1002 = false;
        if (arg1 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "client!LQFXNPID", name = "a", descriptor = "(IB)V")
    public final void method282(int arg0, byte arg1) {
        this.field1001 += arg0;
        if (arg1 != 5) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field1001 <= this.field1008.field1311.method280(-204, this.field1000)) {
                        return;
                    }
                    this.field1001 -= this.field1008.field1311.method280(-204, this.field1000) + 1;
                    this.field1000++;
                } while (this.field1000 < this.field1008.field1311.field983);
            } while (this.field1000 >= 0 && this.field1000 < this.field1008.field1311.field983);
            this.field1000 = 0;
            this.field1002 = true;
        }
    }

    @OriginalMember(owner = "client!LQFXNPID", name = "a", descriptor = "(I)LKDWDYCIL;")
    public final class25 method185(int arg0) {
        class25 var2 = this.field1008.method413();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1008.field1311.field984[this.field1000];
        class25 var4 = new class25((byte) -48, false, var2, class48.method423(var3, this.field1007), true);
        if (!this.field1002) {
            var4.method253(0);
            var4.method254(var3, 151);
            var4.field907 = null;
            var4.field906 = null;
        }
        if (this.field1008.field1314 != 128 || this.field1008.field1315 != 128) {
            var4.method262((byte) 3, this.field1008.field1314, this.field1008.field1314, this.field1008.field1315);
        }
        if (this.field1008.field1316 != 0) {
            if (this.field1008.field1316 == 90) {
                var4.method257(true);
            }
            if (this.field1008.field1316 == 180) {
                var4.method257(true);
                var4.method257(true);
            }
            if (this.field1008.field1316 == 270) {
                var4.method257(true);
                var4.method257(true);
                var4.method257(true);
            }
        }
        var4.method263(this.field1008.field1317 + 64, this.field1008.field1318 + 850, -30, -50, -30, true);
        if (arg0 < 9 || arg0 > 9) {
            throw new NullPointerException();
        }
        return var4;
    }
}
