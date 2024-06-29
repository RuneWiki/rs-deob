import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class16 {

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "Lba;")
    public static class4 field204 = class14.method105((byte) -96, "Silk Trader");

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "Lba;")
    public static class4 field206 = class14.method105((byte) -66, "Short)2cut");

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "Lba;")
    public static class4 field209 = class14.method105((byte) -113, "Amulet Shop");

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "[J")
    public static long[] field208 = new long[32];

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "Lba;")
    public static class4 field207 = class14.method105((byte) -88, "Fishing Spot");

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "J")
    public long field210;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "Lha;")
    public class16 field203;

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "Lha;")
    public class16 field205;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Z)V", line = 17)
    public final void method118(boolean arg0) {
        if (!arg0) {
            this.field205 = null;
        }
        if (this.field205 != null) {
            this.field205.field203 = this.field203;
            this.field203.field205 = this.field205;
            this.field205 = null;
            this.field203 = null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I[B)[B", line = 37)
    public static final byte[] method119(int arg0, byte[] arg1) {
        if (arg0 != -20736) {
            field208 = null;
        }
        class20 var2 = new class20(arg1);
        int var3 = var2.method143(-3695);
        int var4 = var2.method134((byte) -9);
        if (var4 < 0 || class15.field201 != 0 && class15.field201 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method145(var4, (byte) -108, 0, var5);
            return var5;
        } else {
            int var6 = var2.method134((byte) 121);
            if (var6 < 0 || class15.field201 != 0 && var6 > class15.field201) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class7.method72(var7, var6, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var10) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)V", line = 125)
    public static void method120(byte arg0) {
        field207 = null;
        if (arg0 <= 44) {
            method120((byte) 72);
        }
        field208 = null;
        field209 = null;
        field206 = null;
        field204 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I[BIB)I", line = 145)
    public static final int method121(int arg0, byte[] arg1, int arg2, byte arg3) {
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class3.field75[(arg1[var5] ^ var4) & 0xFF];
        }
        return arg3 < 115 ? 21 : ~var4;
    }
}
