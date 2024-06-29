import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public abstract class class355 extends class179 {

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "Z")
    public volatile boolean field5053 = true;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
    public static int field5046 = 0;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "Ljj;")
    public static class156 field5045 = new class156(8);

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "Z")
    public boolean field5051;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "Z")
    public boolean field5052;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "[I")
    public static int[] field5054;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)[B")
    public abstract byte[] method1883(int arg0);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lsc;Z)Z")
    public static final boolean method2276(class395 arg0, boolean arg1) {
        field5047++;
        class45 var2 = class451.method2812(107, arg0.method1013(arg1));
        if (var2.field699 == -1) {
            return true;
        } else {
            class239 var3 = class402.method2549(var2.field699, 128);
            return var3.field3446 == -1 ? true : var3.method1745(-1184447798);
        }
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)I")
    public abstract int method1884(int arg0);

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)V")
    public static final void method2277(int arg0, int arg1) {
        field5050++;
        class221 var2 = class447.method2795(6, (byte) -49, arg1);
        var2.method1689(-97);
        if (arg0 < 49) {
            method2276((class395) null, false);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III[J[Ljava/lang/Object;)V")
    public static final void method2278(int arg0, int arg1, int arg2, long[] arg3, Object[] arg4) {
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var9;
            for (int var10 = arg0; var10 < arg1; var10++) {
                if (arg3[var10] < ((long) (var10 & 0x1) + var7)) {
                    long var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var13 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var13;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var9;
            method2278(arg0, var6 - 1, 29, arg3, arg4);
            method2278(var6 + 1, arg1, 101, arg3, arg4);
        }
        field5049++;
        int var14 = -59 / ((arg2 + 58) / 60);
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)V")
    public static void method2279(int arg0) {
        field5054 = null;
        field5045 = null;
        int var1 = 40 % ((-arg0 - 66) / 53);
    }
}
