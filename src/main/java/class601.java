import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class601 {

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Leo;")
    public static class313 field8185 = new class313(8, 1);

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field8188;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([BLdt;B)V", line = 5)
    public final void method3368(byte[] arg0, class254 arg1, byte arg2) {
        field8186++;
        if (arg1.field3789[arg1.field3725] != 31 || arg1.field3789[arg1.field3725 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field8188 == null) {
            this.field8188 = new Inflater(true);
        }
        try {
            this.field8188.setInput(arg1.field3789, arg1.field3725 + 10, -arg1.field3725 + -10 + arg1.field3789.length + -8);
            this.field8188.inflate(arg0);
            if (arg2 <= 119) {
                field8185 = null;
            }
        } catch (Exception var4) {
            this.field8188.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field8188.reset();
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 35)
    public static void method3369(int arg0) {
        field8185 = null;
        if (arg0 != 0) {
            field8185 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V", line = 45)
    public class601() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([BI)[B", line = 49)
    public final byte[] method3370(byte[] arg0, int arg1) {
        if (arg1 <= 29) {
            field8185 = null;
        }
        field8187++;
        class254 var3 = new class254(arg0);
        var3.field3725 = arg0.length - 4;
        int var4 = var3.method1679(-3);
        var3.field3725 = 0;
        byte[] var5 = new byte[var4];
        this.method3368(var5, var3, (byte) 125);
        return var5;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(III)V", line = 79)
    private class601(int arg0, int arg1, int arg2) {
    }
}
