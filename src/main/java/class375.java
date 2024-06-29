import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class375 {

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "[Lefa;")
    public static class40[] field5394 = new class40[0];

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "Ljj;")
    public static class398 field5397 = new class398(43, 7);

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
    public static int field5399 = 0;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "Lsaa;")
    public static class507 field5396;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V")
    public static void method2285(byte arg0) {
        if (arg0 >= 2) {
            field5397 = null;
            field5396 = null;
            field5394 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)V")
    public static final void method2286(byte arg0) {
        if (arg0 != -5) {
            field5399 = 93;
        }
        class167.method1115(0);
        field5393++;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILcr;IIII)Ljava/awt/Frame;")
    public static final Frame method2287(int arg0, class112 arg1, int arg2, int arg3, int arg4, int arg5) {
        field5395++;
        if (!arg1.method611(0)) {
            return null;
        }
        if (~arg5 == arg2) {
            class556[] var6 = class466.method2640((byte) -21, arg1);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field7596 == arg3 && var6[var8].field7592 == arg4 && (arg0 == 0 || var6[var8].field7598 == arg0) && (!var7 || arg5 < var6[var8].field7599)) {
                    var7 = true;
                    arg5 = var6[var8].field7599;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class280 var9 = arg1.method623(arg4, (byte) -127, arg5, arg0, arg3);
        while (var9.field3773 == 0) {
            class660.method3668(-1, 10L);
        }
        Frame var10 = (Frame) var9.field3772;
        if (var10 == null) {
            return null;
        } else if (var9.field3773 == 2) {
            class157.method1050(arg1, var10, arg2 ^ 0xFFFFFFC7);
            return null;
        } else {
            return var10;
        }
    }
}
