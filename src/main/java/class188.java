import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class188 extends class164 {

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field2708;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "Z")
    public static boolean field2710 = false;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "Lbi;")
    public static class91 field2711;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)Lgg;", line = 5)
    public static final class79 method1300(int arg0) {
        field2714++;
        if (arg0 >= -102) {
            field2712 = 19;
        }
        return class69.field899;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V", line = 16)
    public static void method1301(byte arg0) {
        field2711 = null;
        if (arg0 != 27) {
            field2711 = (class91) null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 34)
    public final Object method1075(byte arg0) {
        if (arg0 > -14) {
            this.method1075((byte) -103);
        }
        field2707++;
        return this.field2708;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 45)
    public class188(Object arg0) {
        this.field2708 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(BI)I", line = 56)
    public static final int method1302(byte arg0, int arg1) {
        int var2 = 67 / ((19 - arg0) / 37);
        field2715++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Llc;I)V", line = 65)
    public static final void method1303(class175 arg0, int arg1) {
        field2713++;
        class127.field1747 = class22.method144(class14.field179, arg0, (byte) -108);
        class242.field3643 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class81.field1040[var2] & 0xFF0000) >> 16);
            int var4 = class81.field1040[var2 + 1] >> 16 & 0xFF;
            int var5 = (class81.field1040[var2 + 1] & 0xFF00) >> 8;
            float var6 = ((float) var4 - var3) / 64.0F;
            float var7 = (float) ((class81.field1040[var2] & 0xFF00) >> 8);
            float var8 = ((float) var5 - var7) / 64.0F;
            float var9 = (float) (class81.field1040[var2] & 0xFF);
            int var10 = class81.field1040[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var9) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class242.field3643[var2 * 64 + var12] = class48.method283(class48.method283((int) var3 << 16, (int) var7 << 8), (int) var9);
                var7 += var8;
                var3 += var6;
                var9 += var11;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class242.field3643[var13] = class81.field1040[3];
        }
        class318.field4889 = new int[32768];
        class153.field2108 = new int[32768];
        class27.method170((byte) -82, (class234) null);
        class152.field2101 = new int[32768];
        class165.field2285 = new int[32768];
        class244.field3682 = new class189(128, 254);
        if (arg1 >= -20) {
            field2710 = true;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)Z", line = 135)
    public final boolean method1074(byte arg0) {
        field2709++;
        return arg0 == 47 ? false : false;
    }
}
