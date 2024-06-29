import java.math.BigInteger;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class104 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "[I")
    public static int[] field1661 = new int[32];

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1663 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Lqd;")
    public static class173 field1665 = new class173(4);

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1662;

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class104() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
    public static void method743(boolean arg0) {
        field1661 = null;
        field1663 = null;
        if (!arg0) {
            method743(false);
        }
        field1665 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([BILwd;)V")
    public final void method744(byte[] arg0, int arg1, class162 arg2) {
        if (arg1 > -17) {
            return;
        }
        field1664++;
        if (arg2.field2573[arg2.field2568] != 31 || arg2.field2573[arg2.field2568 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1662 == null) {
            this.field1662 = new Inflater(true);
        }
        try {
            this.field1662.setInput(arg2.field2573, arg2.field2568 + 10, -arg2.field2568 + -8 + arg2.field2573.length + -10);
            this.field1662.inflate(arg0);
        } catch (Exception var4) {
            this.field1662.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1662.reset();
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(III)V")
    private class104(int arg0, int arg1, int arg2) {
    }
}
