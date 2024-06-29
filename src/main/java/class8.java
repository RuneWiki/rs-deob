import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 extends class5 {

    @OriginalMember(owner = "mapview!da", name = "D", descriptor = "Lr;")
    public static class33 field108 = class29.method192("Woodcutting stump", (byte) 126);

    @OriginalMember(owner = "mapview!da", name = "H", descriptor = "[J")
    public static long[] field112 = new long[32];

    @OriginalMember(owner = "mapview!da", name = "E", descriptor = "Lr;")
    public static class33 field109 = class29.method192("Hunter Store", (byte) 126);

    @OriginalMember(owner = "mapview!da", name = "G", descriptor = "Lr;")
    public static class33 field111 = class29.method192("Spice Shop", (byte) 126);

    @OriginalMember(owner = "mapview!da", name = "A", descriptor = "Lr;")
    public static class33 field105 = class29.method192("Brewery", (byte) 126);

    @OriginalMember(owner = "mapview!da", name = "C", descriptor = "I")
    public static int field107 = 0;

    @OriginalMember(owner = "mapview!da", name = "M", descriptor = "I")
    public static int field117 = 0;

    @OriginalMember(owner = "mapview!da", name = "J", descriptor = "Lr;")
    public static class33 field114 = class29.method192("Bank", (byte) 126);

    @OriginalMember(owner = "mapview!da", name = "O", descriptor = "Lr;")
    public static class33 field119 = class29.method192("Please wait)3)3)3 Rendering Map", (byte) 126);

    @OriginalMember(owner = "mapview!da", name = "I", descriptor = "[[B")
    public static byte[][] field113 = new byte[50][];

    @OriginalMember(owner = "mapview!da", name = "K", descriptor = "Lr;")
    public static class33 field115 = class29.method192("Candle Shop", (byte) 126);

    @OriginalMember(owner = "mapview!da", name = "L", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "mapview!da", name = "N", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "mapview!da", name = "B", descriptor = "[B")
    public static byte[] field106;

    @OriginalMember(owner = "mapview!da", name = "F", descriptor = "[Le;")
    public static class9[] field110;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(II)I", line = 7)
    public static int method49(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "([BZZZ)V", line = 25)
    private class8(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method50(false, arg3, new DataInputStream(new ByteArrayInputStream(arg0)));
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(ZZLjava/io/DataInputStream;)V", line = 47)
    private final void method50(boolean arg0, boolean arg1, DataInputStream arg2) throws IOException {
        if (arg0) {
            field112 = (long[]) null;
        }
        if (arg1) {
        }
        int var4 = arg2.read();
        int var5 = arg2.readInt();
        int var6 = var5;
        if (~var4 != -1) {
            var5 += 4;
        }
        class20 var7 = new class20(var5 + 5);
        var7.method130(arg0, var4);
        var7.method131(var6, (byte) 38);
        arg2.readFully(var7.field205, var7.field206, var5);
        this.method37(var7.field205, (byte) 2);
        for (int var8 = 0; ~super.field63 < ~var8; ++var8) {
            int var9 = arg2.read();
            int var10 = arg2.readInt();
            int var11 = var10;
            if (var9 != 0) {
                var10 += 4;
            }
            class20 var12 = new class20(var10 + 5);
            var12.method130(false, var9);
            var12.method131(var11, (byte) 45);
            while (~var10 < -33554433) {
                arg2.readFully(var12.field205, var12.field206, 33554432);
                var12.field206 += 33554432;
                var10 -= 33554432;
            }
            arg2.readFully(var12.field205, var12.field206, var10);
            super.field46[super.field51[var8]] = class12.method85(false, var12.field205, (byte) 107);
        }
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "([BZZ)V", line = 104)
    public class8(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lv;", line = 110)
    public static final class37 method51(Throwable arg0, String arg1) {
        class37 var2;
        if (arg0 instanceof class37) {
            var2 = (class37) arg0;
            var2.field502 = var2.field502 + ' ' + arg1;
        } else {
            var2 = new class37(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(B)V", line = 157)
    public static void method52(byte arg0) {
        field111 = null;
        field109 = null;
        field113 = (byte[][]) null;
        field108 = null;
        field110 = null;
        field105 = null;
        field115 = null;
        field119 = null;
        field106 = null;
        field112 = null;
        if (arg0 > 19) {
            field114 = null;
        }
    }
}
