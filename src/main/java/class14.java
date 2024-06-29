import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class14 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
    public static int[] field159 = new int[1024];

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lpi;")
    public static class201 field161 = new class201(50);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field162;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILhc;[B)V")
    public final void method97(int arg0, class53 arg1, byte[] arg2) {
        field160++;
        if (~arg1.field758[arg1.field735] != arg0 || arg1.field758[arg1.field735 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field162 == null) {
            this.field162 = new Inflater(true);
        }
        try {
            this.field162.setInput(arg1.field758, arg1.field735 + 10, -10 - arg1.field735 - (8 - arg1.field758.length));
            this.field162.inflate(arg2);
        } catch (Exception var4) {
            this.field162.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field162.reset();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Lph;")
    public static final class269 method98(int arg0, int arg1) {
        field163++;
        class269 var2 = (class269) class181.field2724.method1418((long) arg1, 0);
        if (var2 != null) {
            return var2;
        } else if (arg0 == -32) {
            byte[] var3 = class6.field58.method1868(arg1, 1, 1);
            class269 var4 = new class269();
            if (var3 != null) {
                var4.method1859((byte) 46, new class53(var3), arg1);
            }
            class181.field2724.method1421((long) arg1, var4, (byte) 32);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Lgh;")
    public static final class226 method99(int arg0, int arg1, int arg2) {
        class313 var3 = class223.field3286[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class226 var4 = var3.field5013;
            var3.field5013 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method100(int arg0) {
        field161 = null;
        field159 = null;
        if (arg0 != 1) {
            field159 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class14() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(III)V")
    private class14(int arg0, int arg1, int arg2) {
    }
}
