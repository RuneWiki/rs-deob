import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class118 {

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Ljd;")
    public static class85 field2108 = class221.method1499("leuchten3:", (byte) -66);

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Z")
    public static boolean field2109 = false;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2113 = 0;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lge;")
    public static class68 field2107;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2112;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[Lc;")
    public static class103[] field2105;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[Lra;")
    public static class221[] field2111;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([BBLik;)V")
    public final void method823(byte[] arg0, byte arg1, class247 arg2) {
        field2106++;
        if (arg2.field4238[arg2.field4224] != 31 || arg2.field4238[arg2.field4224 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2112 == null) {
            this.field2112 = new Inflater(true);
        }
        try {
            if (arg1 != 18) {
                field2107 = null;
            }
            this.field2112.setInput(arg2.field4238, arg2.field4224 + 10, arg2.field4238.length + -10 + -arg2.field4224 - 8);
            this.field2112.inflate(arg0);
        } catch (Exception var4) {
            this.field2112.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2112.reset();
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class118() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method824(int arg0) {
        field2108 = null;
        field2107 = null;
        field2111 = null;
        if (arg0 != 64) {
            field2109 = true;
        }
        field2105 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILik;)V")
    public static final void method825(int arg0, class247 arg1) {
        if (arg0 >= -31) {
            return;
        }
        field2110++;
        while (true) {
            while (arg1.field4224 < arg1.field4238.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1711((byte) -67) == 1) {
                    var2 = true;
                    var3 = arg1.method1711((byte) -67);
                    var4 = arg1.method1711((byte) -67);
                }
                int var5 = arg1.method1711((byte) -67);
                int var6 = arg1.method1711((byte) -67);
                int var7 = class79.field1458 - (var6 * 64 + -class196.field3371) - 1;
                int var8 = var5 * 64 - class21.field303;
                if (var8 >= 0 && var7 - 63 >= 0 && var8 + 63 < class100.field1793 && class79.field1458 > var7) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var11 < (var3 * 8 + 8) && var4 * 8 <= var12 && (var4 * 8 + 8) > var12) {
                                byte var13 = arg1.method1690(true);
                                if (var13 != 0) {
                                    if (class239.field4121[var10][var9] == null) {
                                        class239.field4121[var10][var9] = new byte[4096];
                                    }
                                    class239.field4121[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1690(true);
                                    if (class8.field109[var10][var9] == null) {
                                        class8.field109[var10][var9] = new byte[4096];
                                    }
                                    class8.field109[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1690(true);
                        if (var16 != 0) {
                            arg1.field4224++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(III)V")
    private class118(int arg0, int arg1, int arg2) {
    }
}
