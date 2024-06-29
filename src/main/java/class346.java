import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class346 extends class114 {

    @OriginalMember(owner = "client!ew", name = "y", descriptor = "Lof;")
    public static class446 field5336 = new class446("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!ew", name = "t", descriptor = "I")
    public int field5331;

    @OriginalMember(owner = "client!ew", name = "u", descriptor = "I")
    public int field5332;

    @OriginalMember(owner = "client!ew", name = "v", descriptor = "I")
    public int field5333;

    @OriginalMember(owner = "client!ew", name = "A", descriptor = "I")
    public int field5338;

    @OriginalMember(owner = "client!ew", name = "B", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!ew", name = "C", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!ew", name = "F", descriptor = "Ln;")
    public static class14 field5342;

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "Lip;")
    public class508 field5337;

    @OriginalMember(owner = "client!ew", name = "w", descriptor = "Ljava/lang/String;")
    public String field5334;

    @OriginalMember(owner = "client!ew", name = "D", descriptor = "[I")
    public int[] field5341;

    @OriginalMember(owner = "client!ew", name = "G", descriptor = "[I")
    public int[] field5343;

    @OriginalMember(owner = "client!ew", name = "x", descriptor = "[Llp;")
    public class272[] field5335;

    @OriginalMember(owner = "client!ew", name = "H", descriptor = "[Ljava/lang/String;")
    public String[] field5344;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)[Lpa;", line = 3)
    public static final class254[] method2239(byte arg0) {
        int var1 = -30 / ((-arg0 - 24) / 45);
        field5340++;
        return new class254[] { class530.field7796, class478.field7078, class530.field7784, class240.field3375, class41.field605, class153.field1992, class24.field347, class352.field5444, class208.field2878, class126.field1712, class49.field700, class448.field6744, class279.field3960, class276.field3937, class333.field5184 };
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILdq;III)Ljava/awt/Frame;", line = 16)
    public static final Frame method2240(int arg0, int arg1, class500 arg2, int arg3, int arg4, int arg5) {
        field5339++;
        if (!arg2.method2983((byte) 12)) {
            return null;
        }
        if (~arg5 == arg3) {
            class62[] var6 = class380.method2386(arg2, arg3 + 4);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field886 == arg1 && var6[var8].field887 == arg4 && (arg0 == 0 || var6[var8].field884 == arg0) && (!var7 || var6[var8].field889 > arg5)) {
                    var7 = true;
                    arg5 = var6[var8].field889;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class234 var9 = arg2.method3000(arg1, arg0, arg5, arg4, -503554192);
        while (var9.field3322 == 0) {
            class388.method2433(10L, -104);
        }
        Frame var10 = (Frame) var9.field3324;
        if (var10 == null) {
            return null;
        } else if (var9.field3322 == 2) {
            class91.method612(0, arg2, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(B)V", line = 92)
    public static void method2241(byte arg0) {
        field5336 = null;
        field5342 = null;
        if (arg0 != 22) {
            method2239((byte) 118);
        }
    }
}
