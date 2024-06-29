import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "[I")
    public static int[] field30 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ldt;B)Ldv;", line = 7)
    public static final class684 method26(class254 arg0, byte arg1) {
        field32++;
        String var2 = arg0.method1699(-104);
        class673 var3 = class746.method4088((byte) 118)[arg0.method1731((byte) 64)];
        class705 var4 = class717.method3966((byte) 27)[arg0.method1731((byte) 64)];
        int var5 = arg0.method1695(423951304);
        int var6 = arg0.method1695(423951304);
        int var7 = arg0.method1731((byte) 64);
        int var8 = arg0.method1731((byte) 64);
        int var9 = arg0.method1731((byte) 64);
        int var10 = arg0.method1728((byte) 14);
        int var11 = arg0.method1728((byte) 33);
        int var12 = arg0.method1672(-16516);
        int var13 = arg0.method1672(-16516);
        if (arg1 <= 70) {
            method27(-109);
        }
        int var14 = arg0.method1672(-16516);
        return new class684(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V", line = 44)
    public static void method27(int arg0) {
        if (arg0 != 4) {
            field30 = null;
        }
        field30 = null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIILjava/lang/Class;)Lnga;", line = 56)
    public static final class539 method28(int arg0, int arg1, int arg2, Class arg3) {
        class194 var4 = class443.field6387[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class511 var5 = var4.field2525; var5 != null; var5 = var5.field7127) {
            class539 var6 = var5.field7126;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field7466 == arg1 && var6.field7467 == arg2) {
                return var6;
            }
        }
        return null;
    }
}
