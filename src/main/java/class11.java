import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class11 extends class19 {

    @OriginalMember(owner = "mapview!f", name = "r", descriptor = "[B")
    public byte[] field173;

    @OriginalMember(owner = "mapview!f", name = "n", descriptor = "I")
    public int field169;

    @OriginalMember(owner = "mapview!f", name = "k", descriptor = "I")
    public static int field166 = -1;

    @OriginalMember(owner = "mapview!f", name = "m", descriptor = "Lk;")
    public static class21 field168 = class14.method92((byte) 57, "Jewellery");

    @OriginalMember(owner = "mapview!f", name = "p", descriptor = "Lk;")
    public static class21 field171 = class14.method92((byte) 57, "Cookery Shop");

    @OriginalMember(owner = "mapview!f", name = "l", descriptor = "Lk;")
    public static class21 field167 = class14.method92((byte) 57, "Mining Site");

    @OriginalMember(owner = "mapview!f", name = "j", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "mapview!f", name = "o", descriptor = "Ljava/lang/String;")
    public static String field170;

    @OriginalMember(owner = "mapview!f", name = "q", descriptor = "[I")
    public static int[] field172;

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(I)I", line = 19)
    public final int method70(int arg0) {
        this.field169 += 2;
        return arg0 == 27779 ? ((this.field173[this.field169 - 2] & 0xFF) << 8) + (this.field173[this.field169 - 1] & 0xFF) : -25;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 34)
    public static final void method71(Throwable arg0, int arg1, String arg2) {
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class19.method113(arg0, 89);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', (char) arg1);
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class16 var8 = class30.field371.method107(7796, new URL(class30.field371.field227.getCodeBase(), "clienterror.ws?c=" + class32.field387 + "&u=" + class12.field183 + "&v1=" + class18.field229 + "&v2=" + class18.field222 + "&e=" + var7));
            while (var8.field203 == 0) {
                class10.method67(1, 1L);
            }
            if (var8.field203 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field201;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "(I)V", line = 81)
    public static void method72(int arg0) {
        int var1 = 61 / ((arg0 - 5) / 42);
        field172 = null;
        field170 = null;
        field168 = null;
        field171 = null;
        field167 = null;
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(B)I", line = 93)
    public final int method73(byte arg0) {
        if (arg0 != -97) {
            field165 = 37;
        }
        return this.field173[this.field169++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(ZI)V", line = 103)
    public final void method74(boolean arg0, int arg1) {
        this.field173[this.field169++] = (byte) arg1;
        if (arg0) {
            this.method76(-45, 36, -3, null);
        }
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(Z)I", line = 130)
    public final int method75(boolean arg0) {
        this.field169 += 3;
        if (arg0) {
            field172 = null;
        }
        return ((this.field173[this.field169 - 2] & 0xFF) << 8) + ((this.field173[this.field169 - 3] & 0xFF) << 16) + (this.field173[this.field169 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(III[I)V", line = 147)
    public final void method76(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = this.field169;
        this.field169 = arg1;
        int var6 = (arg0 - arg1) / arg2;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method81(-105);
            int var9 = -957401312;
            int var10 = this.method81(-105);
            int var11 = 32;
            int var12 = -1640531527;
            while (var11-- > 0) {
                var10 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 - -arg3[var9 >>> 11 & 0x3];
                var9 -= var12;
                var8 -= (var10 << 4 ^ var10 >>> 5) + var10 ^ var9 - -arg3[var9 & 0x3];
            }
            this.field169 -= 8;
            this.method82(var8, 0);
            this.method82(var10, 0);
        }
        this.field169 = var5;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(IZ[BI)V", line = 209)
    public final void method77(int arg0, boolean arg1, byte[] arg2, int arg3) {
        for (int var5 = arg3; var5 < arg3 + arg0; var5++) {
            arg2[var5] = this.field173[this.field169++];
        }
        if (!arg1) {
            field165 = 47;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "(I)B", line = 224)
    public final byte method78(int arg0) {
        return arg0 == 26035 ? this.field173[this.field169++] : -28;
    }

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "(I)Lk;", line = 247)
    public final class21 method79(int arg0) {
        if (arg0 != -9709) {
            field165 = 115;
        }
        int var2 = this.field169;
        while (this.field173[this.field169++] != 0) {
        }
        return method80(this.field169 - var2 - 1, -45, this.field173, var2);
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(II[BI)Lk;", line = 288)
    private static final class21 method80(int arg0, int arg1, byte[] arg2, int arg3) {
        class21 var4 = new class21();
        var4.field256 = 0;
        var4.field259 = new byte[arg0];
        if (arg1 > -20) {
            method71(null, -118, null);
        }
        for (int var5 = arg3; var5 < arg3 + arg0; var5++) {
            if (arg2[var5] != 0) {
                var4.field259[var4.field256++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!f", name = "f", descriptor = "(I)I", line = 337)
    public final int method81(int arg0) {
        this.field169 += 4;
        return arg0 > -96 ? -49 : (this.field173[this.field169 - 1] & 0xFF) + (((this.field173[this.field169 - 3] & 0xFF) << 16) + (this.field173[this.field169 - 4] << 24 & -16777216) + ((this.field173[this.field169 - 2] & 0xFF) << 8));
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "(I)V", line = 350)
    public class11(int arg0) {
        this.field173 = class23.method154(arg0, 0);
        this.field169 = 0;
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "([B)V", line = 358)
    public class11(byte[] arg0) {
        this.field173 = arg0;
        this.field169 = 0;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(II)V", line = 370)
    public final void method82(int arg0, int arg1) {
        this.field173[this.field169++] = (byte) (arg0 >> 24);
        this.field173[this.field169++] = (byte) (arg0 >> 16);
        this.field173[this.field169++] = (byte) (arg0 >> 8);
        if (arg1 == 0) {
            this.field173[this.field169++] = (byte) arg0;
        }
    }
}
