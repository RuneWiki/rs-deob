import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class7 {

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Lsc;")
    private static class181 field120 = class149.method967(255, "Players");

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field122 = 0;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lsc;")
    private static class181 field117 = class149.method967(255, "Hidden");

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Lsc;")
    public static class181 field124 = field120;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Lsc;")
    public static class181 field125 = field117;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lvb;")
    public static class247 field118 = new class247();

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field127 = 0;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "[I")
    public static int[] field128 = new int[256];

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field123;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static final void method53(int arg0) {
        class110.field1796.method1790(arg0 ^ 0xFFFFDB23);
        field119++;
        class210.field3596.method1790(arg0 + 9437);
        class47.field744.method1790(0);
        class184.field3238.method1790(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class7() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    public static void method54(boolean arg0) {
        field124 = null;
        field125 = null;
        field118 = null;
        field120 = null;
        field128 = null;
        field117 = null;
        if (arg0) {
            field125 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)I")
    public static final int method55(byte arg0, int arg1, int arg2) {
        field126++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg0 <= 36 ? 122 : (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(III)V")
    private class7(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B[BLvf;)V")
    public final void method56(byte arg0, byte[] arg1, class230 arg2) {
        field121++;
        if (arg0 != -87) {
            field124 = null;
        }
        if (arg2.field3977[arg2.field3933] != 31 || arg2.field3977[arg2.field3933 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field123 == null) {
            this.field123 = new Inflater(true);
        }
        try {
            this.field123.setInput(arg2.field3977, arg2.field3933 + 10, arg2.field3977.length - 10 - arg2.field3933 - 8);
            this.field123.inflate(arg1);
        } catch (Exception var4) {
            this.field123.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field123.reset();
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field128[var0] = var1;
        }
    }
}
