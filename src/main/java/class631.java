import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class631 {

    @OriginalMember(owner = "client!lia", name = "g", descriptor = "Lmp;")
    public static class565 field8939 = new class565();

    @OriginalMember(owner = "client!lia", name = "h", descriptor = "Lin;")
    public static class380 field8940 = new class380(38, 6);

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "I")
    public static int field8934;

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!lia", name = "e", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!lia", name = "f", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field8935;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Ldaa;ILdaa;)V")
    public static final void method3600(class454 arg0, int arg1, class454 arg2) {
        if (arg2.field6211 != null) {
            arg2.method2665(24902);
        }
        field8934++;
        arg2.field6213 = arg0.field6213;
        arg2.field6211 = arg0;
        arg2.field6211.field6213 = arg2;
        if (arg1 == 0) {
            arg2.field6213.field6211 = arg2;
        }
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "()V")
    public class631() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V")
    public static void method3601(int arg0) {
        field8940 = null;
        if (arg0 == 0) {
            field8939 = null;
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Ljava/lang/String;IB)I")
    public static final int method3602(String arg0, int arg1, byte arg2) {
        int var3 = -41 / ((arg2 - 48) / 52);
        field8933++;
        return class436.method2601(true, arg0, arg1, 6408);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lol;I[B)V")
    public final void method3603(class431 arg0, int arg1, byte[] arg2) {
        field8936++;
        if (arg0.field6002[arg0.field5983] != 31 || arg0.field6002[arg0.field5983 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field8935 == null) {
            this.field8935 = new Inflater(true);
        }
        try {
            this.field8935.setInput(arg0.field6002, arg0.field5983 + 10, arg0.field6002.length + -10 + -arg0.field5983 - 8);
            if (arg1 != 116) {
                this.method3603(null, -9, null);
            }
            this.field8935.inflate(arg2);
        } catch (Exception var4) {
            this.field8935.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field8935.reset();
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(B[B)[B")
    public final byte[] method3604(byte arg0, byte[] arg1) {
        field8938++;
        class431 var3 = new class431(arg1);
        var3.field5983 = arg1.length - 4;
        int var4 = var3.method2570(-57);
        int var5 = 118 / ((arg0 + 26) / 56);
        byte[] var6 = new byte[var4];
        var3.field5983 = 0;
        this.method3603(var3, 116, var6);
        return var6;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(III)Z")
    public static final boolean method3605(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method3602(null, -57, (byte) -76);
        }
        field8937++;
        return class630.method3598(arg0, (byte) -125, arg1) || class518.method3033(arg0, -113, arg1);
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(III)V")
    private class631(int arg0, int arg1, int arg2) {
    }
}
