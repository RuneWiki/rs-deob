import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class35 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "[I")
    public static int[] field511 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field513 = 0;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "[Lce;")
    public static class126[] field512 = new class126[1000];

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Lce;")
    public static class126 field515 = class206.method1445(-7923, ")1o");

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lce;")
    public static class126 field517 = class206.method1445(-7923, "Fallen lassen");

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZZ)V", line = 5)
    public static final void method192(boolean arg0, boolean arg1) {
        field516++;
        byte var2;
        byte[][] var3;
        if (class56.field846 && arg1) {
            var2 = 1;
            var3 = class314.field5388;
        } else {
            var2 = 4;
            var3 = class128.field2200;
        }
        int var4 = var3.length;
        int var5 = 0;
        if (!arg0) {
            field513 = 44;
        }
        while (var5 < var4) {
            int var6 = (class148.field2732[var5] & 0xFF) * 64 - class138.field2473;
            int var7 = (class148.field2732[var5] >> 8) * 64 - class58.field914;
            byte[] var8 = var3[var5];
            if (var8 != null) {
                class181.method1294(arg0);
                class128.method887(var8, var7, arg1, class107.field1691 * 8 - 48, (byte) 100, class94.field1475, class23.field329 * 8 - 48, var6);
            }
            var5++;
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class148.field2732[var9] >> 8) * 64 - class58.field914;
            byte[] var11 = var3[var9];
            int var12 = (class148.field2732[var9] & 0xFF) * 64 - class138.field2473;
            if (var11 == null && class107.field1691 < 800) {
                class181.method1294(true);
                for (int var13 = 0; var13 < var2; var13++) {
                    class213.method1481(var12, var13, false, var10, 64, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 105)
    public static void method193(int arg0) {
        field512 = null;
        field517 = null;
        if (arg0 != -11269) {
            method194(-85, -55, 89, -7, (byte) -96, -92, -71);
        }
        field515 = null;
        field511 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIBII)V", line = 138)
    public static final void method194(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field514++;
        if (arg4 <= 44) {
            field511 = (int[]) null;
        }
        if ((arg6 - arg0) >= class321.field5489 && class52.field795 >= (arg0 + arg6) && class197.field3372 <= arg1 - arg0 && class194.field3302 >= arg0 + arg1) {
            class195.method1380(arg1, arg5, arg3, arg6, -1, arg2, arg0);
        } else {
            class123.method826((byte) 64, arg5, arg3, arg2, arg0, arg6, arg1);
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 169)
    public class35() {
        new class17();
    }
}
