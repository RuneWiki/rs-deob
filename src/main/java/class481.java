import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class481 extends class17 {

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    private int field6700 = 0;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    private int field6698 = 4096;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "Lkn;")
    public static class530 field6697 = new class530(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field6704 = 0;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)V", line = 3)
    public static void method2770(int arg0) {
        field6697 = null;
        int var1 = -5 / ((arg0 - -70) / 32);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lwm;II)V", line = 12)
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field6698 = arg0.method2338(0);
            }
        } else {
            this.field6700 = arg0.method2338(0);
        }
        ++field6699;
        if (arg2 != 5159) {
            method2775(-32);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I", line = 50)
    public final int[] method27(int arg0, int arg1) {
        if (arg1 < 53) {
            this.field6700 = -36;
        }
        ++field6696;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int[] var4 = this.method88(arg0, -4526, 0);
            for (int var5 = 0; class530.field7763 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field6700 && var6 <= this.field6698 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 85)
    public class481() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "(I)V", line = 89)
    public static final void method2771(int arg0) {
        ++field6703;
        class10.field140 = 0;
        class289.field4229 = new class78[arg0];
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)V", line = 99)
    public static final void method2772(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 << 3;
        int var5 = arg2 << arg3;
        ++field6695;
        int var6 = arg1 << 3;
        class153.field2204 = (float) var4;
        class327.field4768 = (float) var5;
        if (class504.field7461 == 2) {
            class8.field122 = var4;
            class194.field2743 = var6;
            class41.field450 = var5;
        }
        class97.method688(-16503);
        class264.field3877 = true;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILgq;Lgq;)V", line = 124)
    public static final void method2773(int arg0, int arg1, int arg2, class362 arg3, class362 arg4) {
        class239 var5 = class104.method713(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field3474 = arg3;
            var5.field3471 = arg4;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IIII)V", line = 139)
    public static final void method2774(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -9 / ((arg0 - -18) / 40);
        ++field6701;
        class45 var5 = class354.method2094(arg2, (byte) -68, 11);
        var5.method260(9188);
        var5.field516 = arg3;
        var5.field504 = arg1;
    }

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "(I)V", line = 153)
    public static final void method2775(int arg0) {
        if (arg0 == 0) {
            if (class385.field5414 != null) {
                class22.field286.method2754((byte) 96);
                class189.method1206();
                class239.method1509(-27199);
                class267.method1689(false);
                class332.method1989((byte) 72);
                class255.method1646(true);
                if (class74.field903 != null) {
                    class74.field903.method2483((byte) -31);
                }
                class2.method21(true);
                class366.method2160(8560);
                class132.method841((byte) -106);
                class315.method1896(false, 64);
                class507.method3025(-113);
                for (int var1 = 0; ~var1 > -2049; ++var1) {
                    class22 var5 = class378.field5355[var1];
                    if (var5 != null) {
                        var5.field3371 = null;
                        for (int var6 = 0; ~var6 > ~var5.field3374.length; ++var6) {
                            var5.field3374[var6] = null;
                        }
                    }
                }
                for (int var2 = 0; ~var2 > ~field6704; ++var2) {
                    class429 var3 = class367.field5245[var2].field5353;
                    if (var3 != null) {
                        for (int var4 = 0; ~var4 > ~var3.field3374.length; ++var4) {
                            var3.field3374[var4] = null;
                        }
                    }
                }
                class260.field3846 = null;
                class375.field5329 = null;
                class385.field5414.method1801(0);
                class385.field5414 = null;
            }
            ++field6702;
        }
    }
}
