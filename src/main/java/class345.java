import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class345 extends class713 {

    @OriginalMember(owner = "client!hda", name = "H", descriptor = "[[B")
    private byte[][] field4738 = new byte[10][];

    @OriginalMember(owner = "client!hda", name = "J", descriptor = "Lsl;")
    private class479 field4740 = new class479(null);

    @OriginalMember(owner = "client!hda", name = "P", descriptor = "Lsl;")
    private class479 field4746 = new class479(null);

    @OriginalMember(owner = "client!hda", name = "M", descriptor = "I")
    private int field4743;

    @OriginalMember(owner = "client!hda", name = "O", descriptor = "Lla;")
    private class423 field4745;

    @OriginalMember(owner = "client!hda", name = "I", descriptor = "Llc;")
    public static class435 field4739 = new class435(8, 10);

    @OriginalMember(owner = "client!hda", name = "Q", descriptor = "Ldj;")
    public static class703 field4747 = new class703(11, 0, 1, 2);

    @OriginalMember(owner = "client!hda", name = "R", descriptor = "Lgr;")
    public static class530 field4748 = new class530(79, 8);

    @OriginalMember(owner = "client!hda", name = "K", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!hda", name = "L", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!hda", name = "N", descriptor = "I")
    private int field4744;

    @OriginalMember(owner = "client!hda", name = "T", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!hda", name = "S", descriptor = "Lhga;")
    public static class300 field4749;

    @OriginalMember(owner = "client!hda", name = "G", descriptor = "[I")
    private int[] field4737;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I[B)I")
    public final int method2113(int arg0, byte[] arg1) throws IOException {
        field4742++;
        if (this.field4737 == null) {
            if (!this.field4745.method2613(0, this.field4743, -27)) {
                return 0;
            }
            byte[] var3 = this.field4745.method2600(0, this.field4743, 0);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field4746.field6800 = var3;
            this.field4746.field6864 = 0;
            int var4 = var3.length >> 1;
            this.field4737 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4737[var5] = this.field4746.method2882(-1);
            }
        }
        if (this.field4744 >= this.field4737.length) {
            return -1;
        }
        this.method2114(false);
        this.field4746.field6800 = arg1;
        this.field4746.field6864 = 0;
        do {
            if (this.field4746.field6800.length <= this.field4746.field6864) {
                if (arg0 > -112) {
                    this.method2114(true);
                }
                this.field4746.field6800 = null;
                return arg1.length;
            }
            if (this.field4740.field6800 == null) {
                if (this.field4738[0] == null) {
                    this.field4746.field6800 = null;
                    return this.field4746.field6864;
                }
                this.field4740.field6800 = this.field4738[0];
            }
            int var6 = this.field4746.field6800.length - this.field4746.field6864;
            int var7 = this.field4740.field6800.length - this.field4740.field6864;
            if (var6 < var7) {
                this.field4740.method2867(-290150072, this.field4746.field6800, var6, this.field4746.field6864);
                this.field4746.field6800 = null;
                return arg1.length;
            }
            this.field4746.method2898(this.field4740.field6864, this.field4740.field6800, (byte) -105, var7);
            this.field4744++;
            this.field4740.field6864 = 0;
            this.field4740.field6800 = null;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field4738[var8] = this.field4738[var8 + 1];
            }
            this.field4738[9] = null;
        } while (this.field4744 < this.field4737.length);
        this.field4746.field6800 = null;
        return this.field4746.field6864;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(ILla;I)V")
    public class345(int arg0, class423 arg1, int arg2) {
        super(arg0);
        this.field4743 = arg2;
        this.field4745 = arg1;
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(Z)V")
    public final void method2114(boolean arg0) {
        field4741++;
        if (this.field4737 == null) {
            return;
        }
        if (arg0) {
            this.method2114(false);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4737.length <= (this.field4744 + var2)) {
                return;
            }
            if (this.field4738[var2] == null && this.field4745.method2613(0, this.field4737[this.field4744 + var2], -106)) {
                this.field4738[var2] = this.field4745.method2600(0, this.field4737[this.field4744 + var2], 0);
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "([J[Ljava/lang/Object;Z)V")
    public static final void method2115(long[] arg0, Object[] arg1, boolean arg2) {
        field4750++;
        class127.method900(arg1, arg0.length - 1, arg0, 0, (byte) 59);
        if (arg2) {
            field4739 = null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "(B)V")
    public static void method2116(byte arg0) {
        if (arg0 >= 126) {
            field4747 = null;
            field4748 = null;
            field4739 = null;
            field4749 = null;
        }
    }
}
