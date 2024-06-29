import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class class7 {

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "[I")
    public static int[] field86 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field83 = 0;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "Lpn;")
    public static class49 field87 = new class49(75, 8);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 4)
    public static void method31(int arg0) {
        if (arg0 != -27059) {
            field86 = null;
        }
        field86 = null;
        field87 = null;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZJII)V", line = 30)
    public static final void method34(boolean arg0, long arg1, int arg2, int arg3) {
        field85++;
        if (arg0) {
            method31(-89);
        }
        int var5 = ((int) arg1 & 0x7D953) >> 14;
        int var6 = ((int) arg1 & 0x3CEF95) >> 20;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class64.method432(var5, 0, (byte) 108, var6, arg2, 0, true, arg3, 0);
            return;
        }
        class395 var8 = class247.field3693.method2281(var7, -9380);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field5826;
            var9 = var8.field5830;
        } else {
            var9 = var8.field5826;
            var10 = var8.field5830;
        }
        int var11 = var8.field5834;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class64.method432(0, var9, (byte) -120, 0, arg2, var10, true, arg3, var11);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lfh;ILjava/lang/String;)I", line = 78)
    public static final int method35(class194 arg0, int arg1, String arg2) {
        field82++;
        int var3 = arg0.field2982;
        byte[] var4 = class499.method2981(arg2, (byte) 125);
        arg0.method1349(var4.length, 1521286424);
        arg0.field2982 += class179.field2761.method1874(arg1, 0, arg0.field2973, arg0.field2982, var4, var4.length);
        return arg0.field2982 - var3;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)Z")
    public abstract boolean method30(int arg0, int arg1);

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Lmd;")
    public abstract class214 method32(int arg0);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
    public abstract void method33(byte arg0);

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
    public abstract void method36(byte arg0);
}
