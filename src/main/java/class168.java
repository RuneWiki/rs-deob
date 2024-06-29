import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class168 {

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lvh;")
    public static class125 field2745 = new class125(29, 11);

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "[I")
    public static int[] field2749 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2743;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "[Lf;")
    public static class257[] field2748;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method1262(int arg0) {
        field2749 = null;
        field2745 = null;
        if (arg0 != 3) {
            method1262(76);
        }
        field2748 = null;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class168() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z")
    public static final boolean method1263(int arg0) {
        field2744++;
        class702 var1 = (class702) class187.field2932.method3905(-121);
        if (var1 == null) {
            return false;
        }
        int var2 = 127 % ((arg0 - 5) / 43);
        for (int var3 = 0; var3 < var1.field9931; var3++) {
            if (var1.field9936[var3] != null && var1.field9936[var3].field8787 == 0) {
                return false;
            }
            if (var1.field9927[var3] != null && var1.field9927[var3].field8787 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([BILek;)V")
    public final void method1264(byte[] arg0, int arg1, class465 arg2) {
        field2746++;
        if (~arg2.field6719[arg2.field6710] != arg1 || arg2.field6719[arg2.field6710 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2743 == null) {
            this.field2743 = new Inflater(true);
        }
        try {
            this.field2743.setInput(arg2.field6719, arg2.field6710 + 10, -18 - (arg2.field6710 - arg2.field6719.length));
            this.field2743.inflate(arg0);
        } catch (Exception var4) {
            this.field2743.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2743.reset();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([BB)[B")
    public final byte[] method1265(byte[] arg0, byte arg1) {
        int var3 = -6 % ((arg1 - 53) / 48);
        field2742++;
        class465 var4 = new class465(arg0);
        var4.field6710 = arg0.length - 4;
        int var5 = var4.method2719(true);
        var4.field6710 = 0;
        byte[] var6 = new byte[var5];
        this.method1264(var6, -32, var4);
        return var6;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(III)V")
    private class168(int arg0, int arg1, int arg2) {
    }
}
