import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class36 extends class5 {

    @OriginalMember(owner = "mapview!u", name = "B", descriptor = "[[B")
    public static byte[][] field447 = new byte[250][];

    @OriginalMember(owner = "mapview!u", name = "D", descriptor = "Lba;")
    public static class4 field449 = class14.method105((byte) -77, "(U");

    @OriginalMember(owner = "mapview!u", name = "E", descriptor = "I")
    public static int field450 = -1;

    @OriginalMember(owner = "mapview!u", name = "H", descriptor = "Lba;")
    public static class4 field453 = class14.method105((byte) -77, "_");

    @OriginalMember(owner = "mapview!u", name = "C", descriptor = "[J")
    public static long[] field448 = new long[32];

    @OriginalMember(owner = "mapview!u", name = "F", descriptor = "I")
    public static int field451 = -1;

    @OriginalMember(owner = "mapview!u", name = "G", descriptor = "[Lba;")
    public static class4[] field452;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(II[B)I", line = 6)
    public static final int method228(int arg0, int arg1, byte[] arg2) {
        int var3 = 110 / ((arg1 - 62) / 55);
        return class16.method121(arg0, arg2, 0, (byte) 124);
    }

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "([BZZ)V", line = 22)
    public class36(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(B)V", line = 37)
    public static void method229(byte arg0) {
        field452 = null;
        field453 = null;
        field448 = null;
        field449 = null;
        if (arg0 != -23) {
            field451 = 49;
        }
        field447 = (byte[][]) null;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IZLjava/io/DataInputStream;)V", line = 56)
    private final void method230(int arg0, boolean arg1, DataInputStream arg2) throws IOException {
        if (arg1) {
        }
        int var4 = arg2.read();
        int var5 = arg2.readInt();
        int var6 = var5;
        if (~var4 != arg0) {
            var5 += 4;
        }
        class20 var7 = new class20(var5 - -5);
        var7.method144(var4, arg0 + -1287058071);
        var7.method142(var6, (byte) 77);
        arg2.readFully(var7.field236, var7.field224, var5);
        this.method58(arg0 ^ -103, var7.field236);
        for (int var8 = 0; ~var8 > ~super.field97; ++var8) {
            int var9 = arg2.read();
            int var10 = arg2.readInt();
            int var11 = var10;
            if (var9 != 0) {
                var10 += 4;
            }
            class20 var12 = new class20(var10 + 5);
            var12.method144(var9, arg0 + -1287058071);
            var12.method142(var11, (byte) 106);
            while (33554432 < var10) {
                arg2.readFully(var12.field236, var12.field224, 33554432);
                var12.field224 += 33554432;
                var10 -= 33554432;
            }
            arg2.readFully(var12.field236, var12.field224, var10);
            super.field117[super.field111[var8]] = var12.field236;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "([BZZZ)V", line = 120)
    private class36(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method230(-1, arg3, new DataInputStream(new ByteArrayInputStream(arg0)));
    }
}
