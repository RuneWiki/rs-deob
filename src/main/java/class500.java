import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class500 {

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "[I")
    private int[] field7119;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "F")
    public static float field7118;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)I")
    public final int method2981(int arg0, int arg1) {
        if (arg1 >= -109) {
            method2984(-40, -13);
        }
        field7116++;
        int var3 = (this.field7119.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field7119[var4 - (-var4 - 1)];
            if (var5 == -1) {
                return -1;
            }
            if (this.field7119[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIZII)V")
    public static final void method2982(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 != 0) {
            field7118 = -0.17859875F;
        }
        field7120++;
        if ((arg3 ? class527.field7429.field2630 : class527.field7429.field2658) != 0 && arg4 != 0 && class132.field2373 < 50 && arg5 != -1) {
            class286.field4264[class132.field2373++] = new class373((byte) (arg3 ? 3 : 2), arg5, arg4, arg2, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)Lho;")
    public static final class135 method2983(byte arg0) {
        field7115++;
        if (arg0 != -8) {
            method2983((byte) 72);
        }
        class325.field4769 = 0;
        return class25.method478(true);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)V")
    public static final void method2984(int arg0, int arg1) {
        if (arg1 != -1) {
            method2984(106, -71);
        }
        field7117++;
        class19 var2 = class373.method2355(75, arg0, 14);
        var2.method438(arg1 + 807);
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "([I)V")
    public class500(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field7119 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field7119[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field7119[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field7119[var5 + var5] = arg0[var4];
            this.field7119[var5 + var5 + 1] = var4++;
        }
    }
}
