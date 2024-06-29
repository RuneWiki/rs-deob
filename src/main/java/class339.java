import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class339 extends class340 {

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    private int field5000;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    private int field4999;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    private int field4994;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    private int field4997;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    private int field4998;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    private int field4990;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Lok;")
    private class228 field4996;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field4989 = -1;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "[I")
    public static int[] field4993 = new int[4096];

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "Lqe;")
    private class431 field4992;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "Lsh;")
    public static class62 field4991;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4993[var0] = class496.method2868(var0, (byte) -49);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 29)
    public static void method2131(int arg0) {
        int var1 = -40 / ((79 - arg0) / 33);
        field4993 = null;
        field4991 = null;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)Lqe;", line = 40)
    public final class431 method733(byte arg0) {
        field4995++;
        if (arg0 != 20) {
            return null;
        }
        if (this.field4992 == null) {
            class209 var2 = this.field4996.field2384;
            class368.field5269[5] = this.field5000;
            class368.field5269[0] = this.field4994;
            class368.field5269[2] = this.field4998;
            class368.field5269[3] = this.field4999;
            class368.field5269[4] = this.field4990;
            class368.field5269[1] = this.field4997;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1383(class368.field5269[var5], 67)) {
                    return null;
                }
                class159 var7 = var2.method1386(class368.field5269[var5], arg0 - 6534);
                int var8 = var7.field2304 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field2296 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class369.field5273[var6] = var2.method1381(var4, class368.field5269[var6], 1.0F, var4, -105, false);
            }
            this.field4992 = new class431(this.field4996, 6407, var4, var3, class369.field5273);
        }
        return this.field4992;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lok;IIIIII)V", line = 102)
    public class339(class228 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5000 = arg6;
        this.field4999 = arg4;
        this.field4994 = arg1;
        this.field4997 = arg2;
        this.field4998 = arg3;
        this.field4990 = arg5;
        this.field4996 = arg0;
    }
}
