import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class107 {

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "Lgb;")
    public static class163 field1154 = new class163();

    @OriginalMember(owner = "client!cea", name = "h", descriptor = "[I")
    public static int[] field1159 = new int[1];

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "[F")
    public static float[] field1158 = new float[4];

    @OriginalMember(owner = "client!cea", name = "i", descriptor = "Lal;")
    public static class307 field1160 = new class307();

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!cea", name = "j", descriptor = "Lpc;")
    public static class35 field1161;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1156;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lnp;[BI)V", line = 3)
    public final void method580(class115 arg0, byte[] arg1, int arg2) {
        field1152++;
        if (arg0.field1269[arg0.field1218] != 31 || arg0.field1269[arg0.field1218 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1156 == null) {
            this.field1156 = new Inflater(true);
        }
        try {
            this.field1156.setInput(arg0.field1269, arg0.field1218 + 10, arg2 - arg0.field1218 - (10 - arg0.field1269.length));
            this.field1156.inflate(arg1);
        } catch (Exception var4) {
            this.field1156.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1156.reset();
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(III)Z", line = 30)
    public static final boolean method581(int arg0, int arg1, int arg2) {
        field1153++;
        if (arg1 != 116) {
            field1157 = 103;
        }
        return class427.method2468(-1, arg2, arg0) || class102.method555(-122, arg2, arg0);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "([BI)[B", line = 50)
    public final byte[] method582(byte[] arg0, int arg1) {
        field1155++;
        class115 var3 = new class115(arg0);
        var3.field1218 = arg0.length - 4;
        int var4 = var3.method666(-4);
        if (arg1 != -6719) {
            this.field1156 = null;
        }
        var3.field1218 = 0;
        byte[] var5 = new byte[var4];
        this.method580(var3, var5, -8);
        return var5;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V", line = 73)
    public static void method583(int arg0) {
        field1160 = null;
        field1154 = null;
        field1158 = null;
        if (arg0 != -32) {
            field1159 = null;
        }
        field1159 = null;
        field1161 = null;
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(III)V", line = 94)
    private class107(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "()V", line = 111)
    public class107() {
        this(-1, 1000000, 1000000);
    }
}
