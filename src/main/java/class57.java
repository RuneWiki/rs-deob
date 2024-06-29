import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class57 {

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public static int field791 = 0;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "Z")
    public static boolean field793 = false;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "S")
    public static short field797 = 256;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field794;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
    public static final void method401(int arg0) {
        class572.method3310(false);
        field796++;
        class290.method1858((byte) 47);
        if (arg0 != -24289) {
            field797 = 55;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZLrg;[B)V")
    public final void method402(boolean arg0, class645 arg1, byte[] arg2) {
        field795++;
        if (arg1.field9068[arg1.field9084] != 31 || arg1.field9068[arg1.field9084 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field794 == null) {
            this.field794 = new Inflater(true);
        }
        try {
            this.field794.setInput(arg1.field9068, arg1.field9084 + 10, -arg1.field9084 - 10 + arg1.field9068.length + -8);
            if (!arg0) {
                this.method403(null, false);
            }
            this.field794.inflate(arg2);
        } catch (Exception var4) {
            this.field794.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field794.reset();
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "([BZ)[B")
    public final byte[] method403(byte[] arg0, boolean arg1) {
        field792++;
        class645 var3 = new class645(arg0);
        var3.field9084 = arg0.length - 4;
        int var4 = var3.method3740((byte) -24);
        byte[] var5 = new byte[var4];
        var3.field9084 = 0;
        this.method402(arg1, var3, var5);
        return var5;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIILwh;[I[I)Lei;")
    public static final class178 method404(int arg0, int arg1, int arg2, class148 arg3, int[] arg4, int[] arg5) {
        field790++;
        byte[] var6 = new byte[arg0 * arg2];
        for (int var7 = 0; var7 < arg0; var7++) {
            int var8 = arg2 * var7 + arg5[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg1 <= 43) {
            method404(-67, 98, -15, null, null, null);
        }
        return new class178(arg3, arg2, arg0, var6);
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V")
    public class57() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(III)V")
    private class57(int arg0, int arg1, int arg2) {
    }
}
