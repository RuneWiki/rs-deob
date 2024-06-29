import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class15 extends class26 {

    @OriginalMember(owner = "mapview!i", name = "B", descriptor = "I")
    public static int field150 = 0;

    @OriginalMember(owner = "mapview!i", name = "z", descriptor = "Lv;")
    public static class40 field148 = class24.method170("Clothes Shop", (byte) 126);

    @OriginalMember(owner = "mapview!i", name = "F", descriptor = "Lv;")
    public static class40 field154 = class24.method170("labels)3dat", (byte) 127);

    @OriginalMember(owner = "mapview!i", name = "E", descriptor = "Lv;")
    public static class40 field153 = class24.method170("Cooking Range", (byte) -86);

    @OriginalMember(owner = "mapview!i", name = "G", descriptor = "I")
    public static int field155 = 0;

    @OriginalMember(owner = "mapview!i", name = "H", descriptor = "Lv;")
    public static class40 field156 = class24.method170("Crafting Shop", (byte) -80);

    @OriginalMember(owner = "mapview!i", name = "A", descriptor = "Lv;")
    public static class40 field149 = class24.method170("Loading", (byte) 49);

    @OriginalMember(owner = "mapview!i", name = "C", descriptor = "Lv;")
    public static class40 field151 = class24.method170("Anvil", (byte) -116);

    @OriginalMember(owner = "mapview!i", name = "I", descriptor = "Z")
    public static boolean field157 = true;

    @OriginalMember(owner = "mapview!i", name = "J", descriptor = "Z")
    public static boolean field158 = false;

    @OriginalMember(owner = "mapview!i", name = "y", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "mapview!i", name = "x", descriptor = "[B")
    public static byte[] field146;

    @OriginalMember(owner = "mapview!i", name = "D", descriptor = "[I")
    public static int[] field152;

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "([BZZZ)V", line = 26)
    private class15(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method83(new DataInputStream(new ByteArrayInputStream(arg0)), arg3, (byte) -70);
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(I)[Le;", line = 36)
    public static final class9[] method79(int arg0) {
        class9[] var1 = new class9[class11.field114];
        for (int var2 = 0; class11.field114 > var2; ++var2) {
            class9 var3 = new class9();
            var3.field112 = class35.field465[var2];
            var3.field111 = field152[var2];
            var3.field109 = class11.field116[var2];
            var3.field110 = class41.field532[var2];
            int var4 = var3.field110 * var3.field109;
            byte[] var5 = class8.field99[var2];
            var3.field113 = new int[var4];
            for (int var6 = 0; var4 > var6; ++var6) {
                var3.field113[var6] = class16.field167[class39.method241(var5[var6], 255)];
            }
            var1[var2] = var3;
        }
        class18.method104(0);
        if (arg0 != -22354) {
            method80((byte) -20);
        }
        return var1;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B)B", line = 105)
    public static final byte method80(byte arg0) {
        int var1 = 123 / ((arg0 - -71) / 44);
        return class23.field267 == null ? 0 : class23.field267[class20.field213];
    }

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "(I)V", line = 131)
    public static void method81(int arg0) {
        field153 = null;
        field156 = null;
        field146 = null;
        int var1 = -69 / ((50 - arg0) / 61);
        field149 = null;
        field151 = null;
        field154 = null;
        field152 = null;
        field148 = null;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(IZ)I", line = 147)
    public static final int method82(int arg0, boolean arg1) {
        if (~arg0 <= -66 && -91 <= ~arg0) {
            arg0 += 32;
        }
        if (!arg1) {
            method81(99);
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/io/DataInputStream;ZB)V", line = 173)
    private final void method83(DataInputStream arg0, boolean arg1, byte arg2) throws IOException {
        if (!arg1) {
        }
        int var4 = arg0.read();
        int var5 = arg0.readInt();
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        class5 var7 = new class5(var5 - -5);
        var7.method36((byte) -76, var4);
        var7.method37(0, var6);
        if (arg2 == -70) {
            arg0.readFully(var7.field66, var7.field64, var5);
            this.method188(-1, var7.field66);
            for (int var8 = 0; var8 < super.field392; ++var8) {
                int var9 = arg0.read();
                int var10 = arg0.readInt();
                int var11 = var10;
                if (~var9 != -1) {
                    var10 += 4;
                }
                class5 var12 = new class5(var10 + 5);
                var12.method36((byte) -86, var9);
                var12.method37(0, var11);
                while (33554432 < var10) {
                    arg0.readFully(var12.field66, var12.field64, 33554432);
                    var10 -= 33554432;
                    var12.field64 += 33554432;
                }
                arg0.readFully(var12.field66, var12.field64, var10);
                if (super.field404) {
                    super.field388[super.field398[var8]] = var12.field66;
                } else {
                    super.field388[super.field398[var8]] = class16.method84(false, var12.field66, (byte) 12);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "([BZZ)V", line = 240)
    public class15(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }
}
