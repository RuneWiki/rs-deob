import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class289 extends class13 {

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    private int field3489;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lwg;")
    private class449 field3484;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    private int field3491;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    private int field3485;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    private int field3481;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    private int field3487;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    private int field3486;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "Lhj;")
    public static class596 field3490 = new class596(0, -1);

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field3493 = 0;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "Lbj;")
    public static class257 field3494;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Lmia;")
    private class69 field3482;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V", line = 6)
    public static void method1696(boolean arg0) {
        field3490 = null;
        field3494 = null;
        if (!arg0) {
            field3494 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lmia;", line = 17)
    public final class69 method190(int arg0) {
        field3483++;
        if (this.field3482 == null) {
            class682.field9338[1] = this.field3485;
            class682.field9338[4] = this.field3487;
            class682.field9338[3] = this.field3489;
            class682.field9338[5] = this.field3486;
            class682.field9338[2] = this.field3491;
            class682.field9338[0] = this.field3481;
            class162 var2 = this.field3484.field890;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1137(12429, class682.field9338[var5])) {
                    return null;
                }
                class359 var7 = var2.method1138(class682.field9338[var5], 91);
                int var8 = var7.field4451 ? 64 : 128;
                if (var7.field4453 > 0) {
                    var3 = 1;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class668.field9173[var6] = var2.method1135(class682.field9338[var6], 1.0F, false, var4, var4, (byte) -26);
            }
            this.field3482 = this.field3484.method46(var3 != 0, 120, class668.field9173, var4);
        }
        if (arg0 != 0) {
            this.method190(44);
        }
        return this.field3482;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V", line = 85)
    public static final void method1697(int arg0, int arg1, int arg2) {
        field3480++;
        class714 var3 = class350.method2072((long) arg1, 7, (byte) 126);
        var3.method4043(6380);
        int var4 = 45 % ((arg0 + 9) / 42);
        var3.field10021 = arg2;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lwg;IIIIII)V", line = 105)
    public class289(class449 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3489 = arg4;
        this.field3484 = arg0;
        this.field3491 = arg3;
        this.field3485 = arg2;
        this.field3481 = arg1;
        this.field3487 = arg5;
        this.field3486 = arg6;
    }
}
