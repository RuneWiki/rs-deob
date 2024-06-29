import java.math.BigInteger;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class186 {

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2606 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Llc;")
    public static class435 field2610 = new class435(69, 3);

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Lqp;")
    public static class715 field2611 = new class715(4);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2607;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "[Lbi;")
    public static class117[] field2604;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 7)
    public static void method1316(int arg0) {
        field2611 = null;
        if (arg0 > 58) {
            field2606 = null;
            field2604 = null;
            field2610 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V", line = 30)
    public static final void method1317(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2609++;
        if (arg0 >= -48) {
            return;
        }
        class503 var5 = class512.method3112(4, arg4, 0);
        var5.method3075((byte) 85);
        var5.field7310 = arg1;
        var5.field7312 = arg2;
        var5.field7313 = arg3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([BLsl;I)V", line = 47)
    public final void method1318(byte[] arg0, class479 arg1, int arg2) {
        field2605++;
        if (arg1.field6800[arg1.field6864] != 31 || arg1.field6800[arg1.field6864 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2607 == null) {
            this.field2607 = new Inflater(true);
        }
        try {
            this.field2607.setInput(arg1.field6800, arg1.field6864 + 10, arg1.field6800.length - (arg1.field6864 + 8 + 10));
            this.field2607.inflate(arg0);
        } catch (Exception var5) {
            this.field2607.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        int var4 = -44 % ((-arg2 - 14) / 58);
        this.field2607.reset();
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([BI)[B", line = 78)
    public final byte[] method1319(byte[] arg0, int arg1) {
        field2603++;
        class479 var3 = new class479(arg0);
        var3.field6864 = arg0.length - 4;
        if (arg1 < 112) {
            field2610 = null;
        }
        int var4 = var3.method2923((byte) -123);
        byte[] var5 = new byte[var4];
        var3.field6864 = 0;
        this.method1318(var5, var3, -118);
        return var5;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(III)V", line = 101)
    private class186(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V", line = 114)
    public class186() {
        this(-1, 1000000, 1000000);
    }
}
