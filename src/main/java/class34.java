import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class34 extends class235 {

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "Z")
    public boolean field587 = false;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "Lsb;")
    public static class98 field597 = class47.method368("zap", 0);

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "Lwa;")
    public static class219 field594 = new class219(16);

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "Lsb;")
    public static class98 field598 = class47.method368("Welt", 0);

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "Lq;")
    public static class148 field586;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "Ljava/awt/Font;")
    public static Font field588;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method293(int arg0) {
        if (arg0 != -22061) {
            return;
        }
        field594 = null;
        field588 = null;
        field597 = null;
        field586 = null;
        field598 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BII)V")
    public static final void method294(byte arg0, int arg1, int arg2) {
        field589++;
        int var3 = 0;
        if (arg0 != 116) {
            field588 = null;
        }
        while (var3 < class158.field2881) {
            class242 var4 = class114.method851(var3, 1);
            if (var4 != null) {
                int var5 = var4.field4191;
                if (var5 >= 0 && !class160.field2897.method138(var5, 0)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field4199 >= 0) {
                    int var10 = var4.field4199;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 & 0x380) + (var10 + arg1 & 0xFC00) + var11;
                    var6 = class160.field2895[class115.method856(var12, (byte) -43, 96)];
                } else if (var5 >= 0) {
                    var6 = class160.field2895[class115.method856(class160.field2897.method139(var5, false), (byte) -19, 96)];
                } else if (var4.field4194 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field4194;
                    int var8 = (var7 & 0x7F) + arg2;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg1 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class160.field2895[class115.method856(var9, (byte) -41, 96)];
                }
                class108.field1939[var3 + 1] = var6;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIII)I")
    public static final int method295(int arg0, int arg1, int arg2, int arg3) {
        field591++;
        int var4 = arg2 / arg1;
        int var5 = arg0 / arg1;
        int var6 = arg1 - arg3 & arg2;
        int var7 = arg1 - 1 & arg0;
        int var8 = class52.method391(var4, (byte) -90, var5);
        int var9 = class52.method391(var4 + 1, (byte) -125, var5);
        int var10 = class52.method391(var4, (byte) -92, var5 + 1);
        int var11 = class52.method391(var4 + 1, (byte) -114, var5 + 1);
        int var12 = class147.method1082(-1, var6, var9, arg1, var8);
        int var13 = class147.method1082(-1, var6, var11, arg1, var10);
        return class147.method1082(arg3 - 2, var7, var13, arg1, var12);
    }
}
