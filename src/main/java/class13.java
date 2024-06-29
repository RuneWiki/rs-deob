import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class13 extends class170 {

    @OriginalMember(owner = "client!he", name = "P", descriptor = "[B")
    public byte[] field259;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "Lsc;")
    public static class181 field260 = class149.method967(255, "sl_back");

    @OriginalMember(owner = "client!he", name = "O", descriptor = "Lsc;")
    public static class181 field258 = class149.method967(255, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field262 = 0;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "Ldg;")
    public static class90 field265;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "Ldg;")
    public static class90 field266;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
    public static void method125(int arg0) {
        field260 = null;
        field265 = null;
        field266 = null;
        field258 = null;
        if (arg0 >= -51) {
            method125(114);
        }
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Z")
    public static final boolean method126(int arg0) {
        field263++;
        try {
            if (arg0 != 0) {
                field266 = null;
            }
            return class159.method1068((byte) -67);
        } catch (IOException var4) {
            class124.method804(103);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class100.field1680 + "," + class182.field3211 + "," + class52.field812 + " - " + class108.field1772 + "," + (class253.field4420 + class258.field4507.field2672[0]) + "," + (class258.field4507.field2623[0] + class222.field3844) + " - ";
            for (int var3 = 0; class108.field1772 > var3 && var3 < 50; var3++) {
                var2 = var2 + class76.field1223.field3977[var3] + ",";
            }
            class83.method565(var5, var2, 123);
            class207.method1376((byte) 106);
            return true;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILjb;)[Ltg;")
    public static final class107[] method127(int arg0, int arg1, int arg2, class11 arg3) {
        field256++;
        if (class242.method1646(arg2, (byte) -64, arg3, arg0)) {
            if (arg1 != 0) {
                method127(26, 25, -65, (class11) null);
            }
            return class60.method431(255);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
    public class13(byte[] arg0) {
        this.field259 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)I")
    public static final int method128(int arg0, int arg1) {
        field257++;
        double var2 = (double) ((arg0 & 0xFF9F) >> 8) / 256.0D;
        double var4 = (double) (arg0 & 0xFF) / 256.0D;
        double var6 = (double) ((arg0 & arg1) >> 16) / 256.0D;
        double var8 = var6;
        if (var6 > var2) {
            var8 = var2;
        }
        if (var4 < var8) {
            var8 = var4;
        }
        double var10 = var6;
        if (var2 > var6) {
            var10 = var2;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        if (var10 < var4) {
            var10 = var4;
        }
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var12 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var12 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var6 == var10) {
                var14 = (var2 - var4) / (var10 - var8);
            } else if (var2 == var10) {
                var14 = (var4 - var6) / (var10 - var8) + 2.0D;
            } else if (var4 == var10) {
                var14 = (var6 - var2) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var14 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var12 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var20 >> 2 << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }
}
