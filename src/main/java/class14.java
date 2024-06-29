import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class14 {

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "Lua;")
    public static class41 field132 = class16.method86("Jewellery", true);

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "[[B")
    public static byte[][] field131 = new byte[50][];

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "Lua;")
    public static class41 field130 = class16.method86("Rare Trees", true);

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "Lea;")
    public static class10 field127;

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field128;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(IIII[II[BIIII)V", line = 9)
    public static final void method79(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = ((arg10 & 0xFF00) * arg5 & 0xFF0000) + ((arg10 & 0xFF00FF) * arg5 & 0xFF00FF00) >> 8;
        int var12 = 256 - arg5;
        int var13 = -arg8;
        if (arg0 > -53) {
            field132 = null;
        }
        while (var13 < 0) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                if (arg6[arg9++] == 0) {
                    arg3++;
                } else {
                    int var15 = arg4[arg3];
                    arg4[arg3++] = (class38.method213(-16711936, var12 * class38.method213(16711935, var15)) + class38.method213(16711680, var12 * class38.method213(65280, var15)) >> 8) + var11;
                }
            }
            arg9 += arg2;
            arg3 += arg7;
            var13++;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)V", line = 49)
    public static void method80(int arg0) {
        field127 = null;
        if (arg0 != 27673) {
            field126 = -47;
        }
        field131 = null;
        field132 = null;
        field130 = null;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I[Lua;)Lua;", line = 88)
    public static final class41 method81(int arg0, class41[] arg1) {
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg0 > -76) {
            method80(-113);
        }
        return class43.method252(arg1.length, 0, arg1, 0);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([BBLja;)V", line = 107)
    public final void method82(byte[] arg0, byte arg1, class19 arg2) {
        if (arg2.field157[arg2.field158] != 31 || arg2.field157[arg2.field158 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field128 == null) {
            this.field128 = new Inflater(true);
        }
        try {
            this.field128.setInput(arg2.field157, arg2.field158 + 10, arg2.field157.length - 8 - (arg2.field158 + 10));
            this.field128.inflate(arg0);
        } catch (Exception var5) {
            this.field128.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field128.reset();
        if (arg1 != 115) {
            this.method82(null, (byte) -96, null);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "()V", line = 132)
    public class14() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(III)V", line = 151)
    private class14(int arg0, int arg1, int arg2) {
    }
}
