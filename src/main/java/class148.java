import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class148 implements class422 {

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "Lpu;")
    private class522 field2164;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)Lvj;")
    public final class405 method638(byte arg0) {
        int var2 = 1 / ((arg0 - 67) / 45);
        field2165++;
        return class405.field5930;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "([Lrga;II)V")
    public static final void method1057(class215[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class215 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field3026;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field3026 > (var7 & 0x1) + var6) {
                class215 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1057(arg0, arg1, var4 - 1);
        method1057(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIII)I")
    public static final int method1058(int arg0, int arg1, int arg2, int arg3) {
        field2166++;
        int var4 = -22 / ((8 - arg3) / 40);
        int var5 = ((arg0 & 0xFF00) * arg1 & 0xFF0000 | (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
        int var6 = 255 - arg1;
        return (((arg2 & 0xFF00FF) * var6 & 0xFF00FF00 | (arg2 & 0xFF00) * var6 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lpu;)V")
    public class148(class522 arg0) {
        this.field2164 = arg0;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)I")
    public final int method640(int arg0) {
        field2167++;
        if (this.field2164.method3004(0)) {
            return 100;
        } else if (arg0 == 11442) {
            return this.field2164.method2990(54);
        } else {
            return -29;
        }
    }
}
