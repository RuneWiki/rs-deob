import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class123 extends class137 {

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public int field2931;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "Laf;")
    private static class7 field2932 = class48.method406(40, "Loaded update list");

    @OriginalMember(owner = "client!re", name = "z", descriptor = "[I")
    public static int[] field2930 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!re", name = "D", descriptor = "Laf;")
    public static class7 field2934 = field2932;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Laf;")
    private static class7 field2935 = class48.method406(40, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field2933 = 0;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "Laf;")
    public static class7 field2938 = field2935;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Laf;")
    public static class7 field2941 = class48.method406(40, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "[I")
    public static int[] field2939;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method986(int arg0) {
        if (arg0 != 9) {
            return;
        }
        field2934 = null;
        field2932 = null;
        field2930 = null;
        field2935 = null;
        field2939 = null;
        field2938 = null;
        field2941 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method987(int arg0, byte[] arg1) {
        class122 var2 = new class122(arg1);
        field2940++;
        int var3 = var2.method931((byte) 124);
        if (arg0 < 103) {
            method986(-113);
        }
        int var4 = var2.method972(104);
        if (var4 < 0 || class55.field1336 != 0 && class55.field1336 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method955(true, var4, 0, var7);
            return var7;
        } else {
            int var5 = var2.method972(-117);
            if (var5 < 0 || class55.field1336 != 0 && class55.field1336 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class128.method1060(var6, var5, arg1, var4, 9);
            } else {
                class28.field729.method380(-10, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class123() {
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I)V")
    public class123(int arg0) {
        this.field2931 = arg0;
    }
}
