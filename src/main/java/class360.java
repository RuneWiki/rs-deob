import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class360 extends Exception {

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lgr;")
    public static class530 field5277 = new class530(32, -1);

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "D")
    public static double field5281;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ldu;[[BI)V", line = 4)
    public static final void method2273(class418 arg0, byte[][] arg1, int arg2) {
        field5279++;
        int var3 = class429.field6176.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class284.field3961[var4] >> 8) * 64 - class41.field693;
                int var7 = (class284.field3961[var4] & 0xFF) * 64 - class71.field1085;
                class569.method3387(0);
                arg0.method2545(class211.field3164, class6.field57, var7, (byte) 90, var5, var6);
            }
        }
        if (arg2 != 255) {
            field5281 = 0.4790411416964123D;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lla;Ld;B)V", line = 40)
    public static final void method2274(class423 arg0, class267 arg1, byte arg2) {
        int var3 = 41 / ((arg2 - 59) / 58);
        field5280++;
        class453.field6479 = arg1;
        class48.field794 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZBII)Lla;", line = 53)
    public static final class423 method2275(boolean arg0, byte arg1, int arg2, int arg3) {
        int var4 = 3 % ((arg1 + 6) / 37);
        field5278++;
        class247 var5 = null;
        if (class426.field6158 != null) {
            var5 = new class247(arg3, class426.field6158, class230.field3424[arg3], 1000000);
        }
        class59.field983[arg3] = class264.field3788.method2099(var5, (byte) 4, arg3, class704.field9923);
        class59.field983[arg3].method1603((byte) 116);
        return new class423(class59.field983[arg3], arg0, arg2);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 72)
    public static void method2276(int arg0) {
        field5277 = null;
        if (arg0 < 32) {
            field5276 = -70;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILjava/lang/Class;)Ljf;", line = 85)
    public static final class638 method2277(int arg0, int arg1, int arg2, Class arg3) {
        class375 var4 = class565.field8185[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class208 var5 = var4.field5425; var5 != null; var5 = var5.field3146) {
            class638 var6 = var5.field3144;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field9038 == arg1 && var6.field9035 == arg2) {
                return var6;
            }
        }
        return null;
    }
}
