import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class746 {

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "Z")
    public static boolean field10195 = false;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "J")
    public static long field10198 = 0L;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field10200 = -1;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "Lbt;")
    public static class437 field10199 = new class437(2, 8);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "B")
    public byte field10192;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field10193;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field10197;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public int field10201;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "Ljava/lang/String;")
    public String field10194;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V", line = 5)
    public static void method4054(byte arg0) {
        field10199 = null;
        if (arg0 != -51) {
            method4055(120, -74, -57, 92);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIII)I", line = 28)
    public static final int method4055(int arg0, int arg1, int arg2, int arg3) {
        field10197++;
        int var4 = 31 / ((38 - arg0) / 44);
        int var5 = arg3 / arg2;
        int var6 = arg3 & arg2 - 1;
        int var7 = arg1 / arg2;
        int var8 = arg2 - 1 & arg1;
        int var9 = class240.method1576((byte) 106, var7, var5);
        int var10 = class240.method1576((byte) 106, var7, var5 + 1);
        int var11 = class240.method1576((byte) 106, var7 + 1, var5);
        int var12 = class240.method1576((byte) 106, var7 + 1, var5 + 1);
        int var13 = class372.method2134(arg2, var6, var9, var10, -90);
        int var14 = class372.method2134(arg2, var6, var11, var12, -111);
        return class372.method2134(arg2, var8, var13, var14, -95);
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(B)[Lvha;", line = 61)
    public static final class71[] method4056(byte arg0) {
        field10196++;
        if (arg0 <= 86) {
            method4056((byte) 47);
        }
        return new class71[] { class790.field10827, class106.field1447, class463.field6015 };
    }
}
