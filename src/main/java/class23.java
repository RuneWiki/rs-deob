import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class23 extends class20 {

    @OriginalMember(owner = "mapview!la", name = "y", descriptor = "Ld;")
    public static class7 field247 = class38.method251((byte) 75, "map");

    @OriginalMember(owner = "mapview!la", name = "C", descriptor = "Ld;")
    public static class7 field251 = class38.method251((byte) 113, "Next page");

    @OriginalMember(owner = "mapview!la", name = "D", descriptor = "Ld;")
    public static class7 field252 = class38.method251((byte) -82, "Crafting Shop");

    @OriginalMember(owner = "mapview!la", name = "z", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "mapview!la", name = "A", descriptor = "Lh;")
    public static class15 field249;

    @OriginalMember(owner = "mapview!la", name = "B", descriptor = "[Le;")
    public static class9[] field250;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(ZBLjava/io/DataInputStream;)V", line = 5)
    private final void method161(boolean arg0, byte arg1, DataInputStream arg2) throws IOException {
        if (arg0) {
        }
        int var4 = arg2.read();
        int var5 = arg2.readInt();
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        class35 var7 = new class35(var5 + 5);
        var7.method226(27488, var4);
        if (arg1 != 107) {
            field251 = (class7) null;
        }
        var7.method233(true, var6);
        arg2.readFully(var7.field463, var7.field470, var5);
        this.method147(0, var7.field463);
        for (int var8 = 0; ~super.field208 < ~var8; ++var8) {
            int var9 = arg2.read();
            int var10 = arg2.readInt();
            int var11 = var10;
            if (var9 != 0) {
                var10 += 4;
            }
            class35 var12 = new class35(var10 + 5);
            var12.method226(27488, var9);
            var12.method233(true, var11);
            while (~var10 < -33554433) {
                var10 -= 33554432;
                arg2.readFully(var12.field463, var12.field470, 33554432);
                var12.field470 += 33554432;
            }
            arg2.readFully(var12.field463, var12.field470, var10);
            super.field209[super.field220[var8]] = class28.method206(6, var12.field463, false);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "<init>", descriptor = "([BZZ)V", line = 74)
    public class23(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)V", line = 91)
    public static void method162(int arg0) {
        field247 = null;
        field251 = null;
        field252 = null;
        field250 = null;
        field249 = null;
        if (arg0 != 149) {
            field247 = (class7) null;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(II)I", line = 108)
    public static final int method163(int arg0, int arg1) {
        if (~arg1 <= -66 && 90 >= arg1) {
            arg1 += 32;
        }
        if (arg0 != 90) {
            field249 = (class15) null;
        }
        return arg1;
    }

    @OriginalMember(owner = "mapview!la", name = "<init>", descriptor = "([BZZZ)V", line = 121)
    private class23(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method161(arg3, (byte) 107, new DataInputStream(new ByteArrayInputStream(arg0)));
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IBI)B", line = 139)
    public static final byte method164(int arg0, byte arg1, int arg2) {
        int var3 = 103 % ((arg1 - 45) / 49);
        int var4 = arg2 >> 6;
        int var5 = arg0 >> 6;
        if (class25.field274[var5][var4] == null) {
            return 0;
        } else {
            return class25.field274[var5][var4].field164 == null ? class25.field274[var5][var4].field166 : class25.field274[var5][var4].field164[(4032 & arg0) + arg2 & 63];
        }
    }
}
