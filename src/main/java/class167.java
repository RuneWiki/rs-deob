import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class167 extends class566 {

    @OriginalMember(owner = "client!cfa", name = "K", descriptor = "[[B")
    private byte[][] field2464 = new byte[10][];

    @OriginalMember(owner = "client!cfa", name = "L", descriptor = "Lud;")
    private class35 field2465 = new class35(null);

    @OriginalMember(owner = "client!cfa", name = "N", descriptor = "Lud;")
    private class35 field2467 = new class35(null);

    @OriginalMember(owner = "client!cfa", name = "G", descriptor = "Leq;")
    private class209 field2460;

    @OriginalMember(owner = "client!cfa", name = "F", descriptor = "I")
    private int field2459;

    @OriginalMember(owner = "client!cfa", name = "E", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!cfa", name = "I", descriptor = "I")
    private int field2462;

    @OriginalMember(owner = "client!cfa", name = "M", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!cfa", name = "O", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!cfa", name = "H", descriptor = "Loga;")
    public static class471 field2461;

    @OriginalMember(owner = "client!cfa", name = "J", descriptor = "[I")
    private int[] field2463;

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "(Z)V", line = 8)
    public final void method1241(boolean arg0) {
        field2458++;
        if (this.field2463 == null || arg0) {
            return;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2462 + var2 >= this.field2463.length) {
                return;
            }
            if (this.field2464[var2] == null && this.field2460.method1469((byte) -91, this.field2463[this.field2462 + var2], 0)) {
                this.field2464[var2] = this.field2460.method1453(0, 127, this.field2463[this.field2462 + var2]);
            }
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I[B)I", line = 42)
    public final int method1242(int arg0, byte[] arg1) throws IOException {
        int var3 = 15 % ((-arg0 - 23) / 37);
        field2466++;
        if (this.field2463 == null) {
            if (!this.field2460.method1469((byte) -125, this.field2459, 0)) {
                return 0;
            }
            byte[] var4 = this.field2460.method1453(0, -128, this.field2459);
            if (var4 == null) {
                throw new IllegalStateException("");
            }
            this.field2467.field483 = var4;
            this.field2467.field469 = 0;
            int var5 = var4.length >> 1;
            this.field2463 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2463[var6] = this.field2467.method253(-13900);
            }
        }
        if (this.field2462 >= this.field2463.length) {
            return -1;
        }
        this.method1241(false);
        this.field2467.field483 = arg1;
        this.field2467.field469 = 0;
        do {
            if (this.field2467.field469 >= this.field2467.field483.length) {
                this.field2467.field483 = null;
                return arg1.length;
            }
            if (this.field2465.field483 == null) {
                if (this.field2464[0] == null) {
                    this.field2467.field483 = null;
                    return this.field2467.field469;
                }
                this.field2465.field483 = this.field2464[0];
            }
            int var7 = this.field2467.field483.length - this.field2467.field469;
            int var8 = this.field2465.field483.length - this.field2465.field469;
            if (var8 > var7) {
                this.field2465.method260(this.field2467.field483, -120, var7, this.field2467.field469);
                this.field2467.field483 = null;
                return arg1.length;
            }
            this.field2467.method283(this.field2465.field469, (byte) -28, this.field2465.field483, var8);
            this.field2465.field483 = null;
            this.field2465.field469 = 0;
            this.field2462++;
            for (int var9 = 0; var9 < 9; var9++) {
                this.field2464[var9] = this.field2464[var9 + 1];
            }
            this.field2464[9] = null;
        } while (this.field2463.length > this.field2462);
        this.field2467.field483 = null;
        return this.field2467.field469;
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(ILeq;I)V", line = 135)
    public class167(int arg0, class209 arg1, int arg2) {
        super(arg0);
        this.field2460 = arg1;
        this.field2459 = arg2;
    }

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "(I)V", line = 149)
    public static void method1243(int arg0) {
        field2461 = null;
        if (arg0 != 0) {
            field2468 = 80;
        }
    }
}
