import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class12 extends class3 {

    @OriginalMember(owner = "mapview!g", name = "B", descriptor = "I")
    public static int field183 = 0;

    @OriginalMember(owner = "mapview!g", name = "y", descriptor = "Lna;")
    public static class26 field180 = class30.method205((byte) 31, "Archery Shop");

    @OriginalMember(owner = "mapview!g", name = "E", descriptor = "Lna;")
    public static class26 field186 = class30.method205((byte) 90, "Apothecary");

    @OriginalMember(owner = "mapview!g", name = "C", descriptor = "Lna;")
    public static class26 field184 = class30.method205((byte) 39, "Loom");

    @OriginalMember(owner = "mapview!g", name = "D", descriptor = "Lna;")
    public static class26 field185 = class30.method205((byte) 80, "Anvil");

    @OriginalMember(owner = "mapview!g", name = "A", descriptor = "Lna;")
    public static class26 field182 = class30.method205((byte) 16, "Scimitar Shop");

    @OriginalMember(owner = "mapview!g", name = "F", descriptor = "Lna;")
    public static class26 field187 = class30.method205((byte) 121, "Bank");

    @OriginalMember(owner = "mapview!g", name = "z", descriptor = "Lj;")
    public static class18 field181;

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "([BZZZ)V", line = 11)
    private class12(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method82(arg3, new DataInputStream(new ByteArrayInputStream(arg0)), 33554432);
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(BIBII)V", line = 21)
    public static final void method80(byte arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = arg1 >> 6;
        int var6 = arg4 >> 6;
        int var7 = 124 / ((arg0 - -5) / 53);
        if (class25.field353[arg3][var6][var5] == null) {
            class25.field353[arg3][var6][var5] = new byte[4096];
        }
        class25.field353[arg3][var6][var5][class36.method227(arg4 << 6, 4032) + class36.method227(arg1, 63)] = arg2;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(B)V", line = 64)
    public static void method81(byte arg0) {
        field180 = null;
        field182 = null;
        field181 = null;
        field187 = null;
        field186 = null;
        int var1 = -124 % ((44 - arg0) / 63);
        field185 = null;
        field184 = null;
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "([BZZ)V", line = 86)
    public class12(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(ZLjava/io/DataInputStream;I)V", line = 99)
    private final void method82(boolean arg0, DataInputStream arg1, int arg2) throws IOException {
        int var4 = arg1.read();
        int var5 = arg1.readInt();
        if (arg2 != 33554432) {
            field184 = (class26) null;
        }
        if (!arg0) {
        }
        int var6 = var5;
        if (~var4 != -1) {
            var5 += 4;
        }
        class4 var7 = new class4(var5 - -5);
        var7.method40((byte) -103, var4);
        var7.method41(var6, (byte) -74);
        arg1.readFully(var7.field138, var7.field132, var5);
        this.method30(24892, var7.field138);
        for (int var8 = 0; var8 < super.field128; ++var8) {
            int var9 = arg1.read();
            int var10 = arg1.readInt();
            int var11 = var10;
            if (var9 != 0) {
                var10 += 4;
            }
            class4 var12 = new class4(var10 + 5);
            var12.method40((byte) -23, var9);
            var12.method41(var11, (byte) -74);
            while (var10 > 33554432) {
                var10 -= 33554432;
                arg1.readFully(var12.field138, var12.field132, 33554432);
                var12.field132 += 33554432;
            }
            arg1.readFully(var12.field138, var12.field132, var10);
            if (super.field118) {
                super.field109[super.field107[var8]] = var12.field138;
            } else {
                super.field109[super.field107[var8]] = class35.method226(false, var12.field138, 136);
            }
        }
    }
}
