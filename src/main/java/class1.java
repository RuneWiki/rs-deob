import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 extends class5 {

    @OriginalMember(owner = "mapview!a", name = "y", descriptor = "[J")
    private static long[] field1 = new long[256];

    @OriginalMember(owner = "mapview!a", name = "A", descriptor = "Lf;")
    public static class10 field3 = class23.method139("Kebab Seller", (byte) -56);

    @OriginalMember(owner = "mapview!a", name = "z", descriptor = "Lf;")
    public static class10 field2 = class23.method139("Prev page", (byte) -51);

    @OriginalMember(owner = "mapview!a", name = "C", descriptor = "Lf;")
    public static class10 field5;

    @OriginalMember(owner = "mapview!a", name = "B", descriptor = "[[B")
    public static byte[][] field4;

    @OriginalMember(owner = "mapview!a", name = "D", descriptor = "[Z")
    public static boolean[] field6;

    @OriginalMember(owner = "mapview!a", name = "G", descriptor = "Lf;")
    public static class10 field9;

    @OriginalMember(owner = "mapview!a", name = "E", descriptor = "Lf;")
    public static class10 field7;

    @OriginalMember(owner = "mapview!a", name = "F", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "mapview!a", name = "H", descriptor = "[I")
    public static int[] field10;

    @OriginalMember(owner = "mapview!a", name = "<init>", descriptor = "([BZZ)V", line = 19)
    public class1(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!a", name = "<init>", descriptor = "([BZZZ)V", line = 28)
    private class1(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method2(new DataInputStream(new ByteArrayInputStream(arg0)), arg3, 8);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Z)V", line = 37)
    public static void method1(boolean arg0) {
        field4 = (byte[][]) null;
        field7 = null;
        field10 = null;
        field2 = null;
        field9 = null;
        if (!arg0) {
            field6 = (boolean[]) null;
        }
        field1 = null;
        field5 = null;
        field3 = null;
        field6 = null;
    }

    static {
        for (int var0 = 0; 256 > var0; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; 8 > var3; ++var3) {
                if (~(var1 & 1L) == -2L) {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                } else {
                    var1 >>>= 1;
                }
            }
            field1[var0] = var1;
        }
        field5 = class23.method139("Platelegs Shop", (byte) -125);
        field4 = new byte[50][];
        field6 = new boolean[112];
        field9 = class23.method139("details)3dat", (byte) -108);
        field7 = class23.method139("Makeover Mage", (byte) -76);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/io/DataInputStream;ZI)V", line = 76)
    private final void method2(DataInputStream arg0, boolean arg1, int arg2) throws IOException {
        if (arg1) {
        }
        int var4 = arg0.read();
        int var5 = arg0.readInt();
        if (arg2 != 8) {
            field1 = (long[]) null;
        }
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        class28 var7 = new class28(var5 + 5);
        var7.method185(var4, 127);
        var7.method187(-29685, var6);
        arg0.readFully(var7.field392, var7.field389, var5);
        this.method32(var7.field392, (byte) 127);
        for (int var8 = 0; ~var8 > ~super.field50; ++var8) {
            int var9 = arg0.read();
            int var10 = arg0.readInt();
            int var11 = var10;
            if (~var9 != -1) {
                var10 += 4;
            }
            class28 var12 = new class28(var10 + 5);
            var12.method185(var9, 125);
            var12.method187(-29685, var11);
            while (33554432 < var10) {
                var10 -= 33554432;
                arg0.readFully(var12.field392, var12.field389, 33554432);
                var12.field389 += 33554432;
            }
            arg0.readFully(var12.field392, var12.field389, var10);
            if (!super.field41) {
                super.field35[super.field32[var8]] = class31.method199(var12.field392, false, 99);
            } else {
                super.field35[super.field32[var8]] = var12.field392;
            }
        }
    }
}
