import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class79 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Loa;")
    public static class99 field1391 = class221.method1463(2844, ")3");

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Loa;")
    public static class99 field1390 = class221.method1463(2844, "name_icons");

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1395 = 100;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1399 = 0;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Z")
    public static boolean field1398 = false;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lwk;")
    public static class273 field1396 = new class273(30);

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Ltf;")
    public static class107 field1392;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)I")
    public static final int method551(byte arg0, int arg1) {
        field1397++;
        double var2 = (double) ((arg1 & 0xFF053E) >> 16) / 256.0D;
        double var4 = (double) (arg1 & 0xFF) / 256.0D;
        double var6 = var2;
        double var8 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (var8 > var2) {
            var6 = var8;
        }
        if (var4 > var6) {
            var6 = var4;
        }
        double var10 = var2;
        double var12 = 0.0D;
        double var14 = 0.0D;
        if (var8 < var2) {
            var10 = var8;
        }
        if (var10 > var4) {
            var10 = var4;
        }
        double var16 = (var6 + var10) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var6 != var10) {
            if (var16 < 0.5D) {
                var14 = (var6 - var10) / (var6 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var6 - var10) / (2.0D - var6 - var10);
            }
            if (var2 == var6) {
                var12 = (var8 - var4) / (var6 - var10);
            } else if (var6 == var8) {
                var12 = (var4 - var2) / (var6 - var10) + 2.0D;
            } else if (var4 == var6) {
                var12 = (var2 - var8) / (var6 - var10) + 4.0D;
            }
        }
        int var19 = (int) (var14 * 256.0D);
        double var20 = var12 / 6.0D;
        int var22 = -113 / ((21 - arg0) / 35);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var18 > 243) {
            var19 >>= 0x4;
        } else if (var18 > 217) {
            var19 >>= 0x3;
        } else if (var18 > 192) {
            var19 >>= 0x2;
        } else if (var18 > 179) {
            var19 >>= 0x1;
        }
        int var23 = (int) (var20 * 256.0D);
        return (var18 >> 1) + (var19 >> 5 << 7) + (var23 >> 2 << 10);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)V")
    public static final void method552(boolean arg0, int arg1) {
        class291.field5100 = null;
        class129.field2261 = null;
        class273.field4825 = null;
        class55.field902 = null;
        class22.field256 = null;
        class165.field2890 = 0;
        class139.field2471 = null;
        class76.field1351 = null;
        field1394++;
        class182.field3204 = null;
        class190.field3353 = null;
        class13.field126 = null;
        if (arg0 && class261.field4557 != null) {
            class240.field4149 = class261.field4557.field3968;
        } else {
            class240.field4149 = null;
        }
        class261.field4557 = null;
        class144.field2537.method534(1);
        class108.field1954 = null;
        class121.field2128 = null;
        if (arg1 < 71) {
            field1391 = null;
        }
        class65.field1108 = -1;
        class94.field1587 = null;
        class78.field1383 = null;
        class100.field1716 = null;
        class130.field2268 = null;
        class88.field1515 = null;
        class22.field266 = null;
        class44.field775 = -1;
        class125.field2186 = null;
        class127.field2206 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method553(byte arg0) {
        field1391 = null;
        field1392 = null;
        field1396 = null;
        int var1 = -59 % ((27 - arg0) / 61);
        field1390 = null;
    }
}
