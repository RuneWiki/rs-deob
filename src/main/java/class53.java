import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class53 extends class139 {

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "Lve;")
    public class195 field772;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field769 = 0;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public static int field775 = 0;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field776 = 0;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method402(byte arg0, String arg1) {
        if (arg0 <= 30) {
            method404(-26, true);
        }
        field773++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class20.field222; var2++) {
            if (arg1.equalsIgnoreCase(class104.field1508[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class186.field2993.field344);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZI)I")
    public static final int method403(int arg0, boolean arg1, int arg2) {
        field771++;
        if (arg1) {
            field776 = -60;
        }
        int var3 = class2.method5(4, arg2 + 91923, -68, arg0 + 45365) - (-(class2.method5(2, arg2 - -37821, 97, arg0 + 10294) + -128 >> 1) - (class2.method5(1, arg2, -75, arg0) - 128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)V")
    public static final void method404(int arg0, boolean arg1) {
        if (arg0 <= 86) {
            field775 = 109;
        }
        field774++;
        byte[][] var2 = class283.field4500;
        byte var3 = 4;
        for (int var4 = 0; var4 < var3; var4++) {
            class126.method908(-104);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class121.field1771[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x39EA3D7) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0xFFD159) >> 14;
                            int var10 = var7 >> 1 & 0x3;
                            int var11 = (var7 & 0x3FFE) >> 3;
                            int var12 = (var9 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class286.field4548.length; var13++) {
                                if (class286.field4548[var13] == var12 && var2[var13] != null) {
                                    class165.method1217(var6 * 8, var2[var13], (var9 & 0x7) * 8, var8, arg1, var5 * 8, (var11 & 0x7) * 8, var4, (byte) -54, class138.field2237, var10);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lve;)V")
    public class53(class195 arg0) {
        this.field772 = arg0;
    }
}
