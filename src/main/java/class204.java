import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class204 {

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    private int field3066 = -1;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    private int field3056;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    private int field3057;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    private int field3063;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    private int field3060;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "[Lkf;")
    private class144[] field3065;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "[Lkf;")
    private class144[] field3064;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lkf;")
    private class144 field3058;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    private int field3055;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    private int field3061;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Lpk;")
    public static class237 field3059;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lwh;")
    private class289 field3062;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1354(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field3060 == -1) {
            class72.method576(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field3062 == null) {
                this.field3062 = class119.field1790.method1833(false, (byte) -120, class119.field1781, this.field3055, this.field3060);
            }
            if (!class119.field1790.method1834((byte) -125, this.field3060)) {
                class72.method576(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field3062 != null) {
                int var10 = arg4 * arg5 / -512;
                int var11;
                for (var11 = arg4 * var9 / 512 + (arg3 - arg4) / 2; var11 > arg4; var11 -= arg4) {
                }
                while (var11 < 0) {
                    var11 += arg4;
                }
                while (var10 > arg4) {
                    var10 -= arg4;
                }
                while (var10 < 0) {
                    var10 += arg4;
                }
                for (int var12 = var11 - arg4; var12 < class72.field1173; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class72.field1175; var13 += arg4) {
                        this.field3062.method1225(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field3061 - 1; var14 >= 0; var14--) {
            this.field3064[var14].method981(arg1, arg2, arg3, arg4, arg5, var9, this.field3058);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    private final void method1354(int arg0) {
        if (this.field3066 == arg0) {
            return;
        }
        this.field3066 = arg0;
        int var2 = class259.method1747(arg0, 5539);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field3055 != var2) {
            this.field3055 = var2;
            this.field3062 = null;
        }
        if (this.field3065 == null) {
            return;
        }
        this.field3061 = 0;
        int[] var3 = new int[this.field3065.length];
        for (int var4 = 0; var4 < this.field3065.length; var4++) {
            class144 var5 = this.field3065[var4];
            if (var5.method986(this.field3056, this.field3057, this.field3063, this.field3066)) {
                var3[this.field3061] = var5.field2082;
                this.field3064[this.field3061++] = var5;
            }
        }
        class189.method1268(this.field3061 - 1, (byte) 121, 0, var3, this.field3064);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()V")
    public static void method1355() {
        field3059 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lpk;)V")
    public static final void method1356(class237 arg0) {
        field3059 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I[Lkf;IIII)V")
    public class204(int arg0, class144[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3056 = arg3;
        this.field3057 = arg4;
        this.field3063 = arg5;
        this.field3060 = arg0;
        this.field3065 = arg1;
        if (arg1 == null) {
            this.field3064 = null;
            this.field3058 = null;
        } else {
            this.field3064 = new class144[arg1.length];
            this.field3058 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
