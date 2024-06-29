import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class51 extends class408 implements class18 {

    @OriginalMember(owner = "client!aea", name = "C", descriptor = "I")
    private int field728 = -1;

    @OriginalMember(owner = "client!aea", name = "S", descriptor = "I")
    private int field742 = -1;

    @OriginalMember(owner = "client!aea", name = "K", descriptor = "Lwh;")
    private class148 field735;

    @OriginalMember(owner = "client!aea", name = "A", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "client!aea", name = "J", descriptor = "I")
    private int field734;

    @OriginalMember(owner = "client!aea", name = "F", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!aea", name = "H", descriptor = "I")
    private int field733;

    @OriginalMember(owner = "client!aea", name = "E", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "client!aea", name = "L", descriptor = "Lmia;")
    public static class63 field736 = new class63(27, 8);

    @OriginalMember(owner = "client!aea", name = "R", descriptor = "[Lae;")
    public static class253[] field741 = new class253[14];

    @OriginalMember(owner = "client!aea", name = "P", descriptor = "Lmia;")
    public static class63 field739 = new class63(36, 4);

    @OriginalMember(owner = "client!aea", name = "U", descriptor = "Lwl;")
    public static class410 field743 = new class410();

    @OriginalMember(owner = "client!aea", name = "V", descriptor = "Lmia;")
    public static class63 field744 = new class63(16, -1);

    @OriginalMember(owner = "client!aea", name = "Q", descriptor = "F")
    public static float field740;

    @OriginalMember(owner = "client!aea", name = "y", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!aea", name = "B", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!aea", name = "D", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!aea", name = "G", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!aea", name = "M", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!aea", name = "O", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!aea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field724++;
        this.method370((byte) 109);
        super.finalize();
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII)Lns;")
    public static final class405 method369(int arg0, int arg1, int arg2, int arg3) {
        field729++;
        class186 var4 = class80.field1136[arg0][arg2][arg3];
        if (var4 == null) {
            return null;
        }
        class405 var5 = null;
        int var6 = -1;
        class754 var7 = var4.field2830;
        if (arg1 > -75) {
            method371(null);
        }
        while (var7 != null) {
            class119 var8 = var7.field10542;
            if (var8 instanceof class405) {
                class405 var9 = (class405) var8;
                int var10 = (var9.method2579(false) * 256 - 256) + 252;
                int var11 = var9.field8423 - var10 >> 9;
                int var12 = var9.field8428 - var10 >> 9;
                int var13 = var9.field8423 + var10 >> 9;
                int var14 = var9.field8428 + var10 >> 9;
                if (arg2 >= var11 && var12 <= arg3 && var13 >= arg2 && arg3 <= var14) {
                    int var15 = (var13 + 1 - arg2) * (var14 + 1 - arg3);
                    if (var15 > var6) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
            var7 = var7.field10537;
        }
        return var5;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)V")
    public final void method370(byte arg0) {
        field727++;
        if (this.field733 > 0) {
            this.field735.method1038(this.field730, this.field733, -24271);
            this.field733 = 0;
        }
        if (arg0 < 95) {
            method369(40, 71, 113, -79);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lvs;)V")
    public static final void method371(class593 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class593 var2 = null;
            for (class593 var3 = class577.field8153[var1]; var3 != null; var3 = var3.field8431) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class577.field8153[var1] = var3.field8431;
                    } else {
                        var2.field8431 = var3.field8431;
                    }
                    class226.field3323 = true;
                    return;
                }
                var2 = var3;
            }
            class593 var4 = null;
            for (class593 var5 = class614.field8664[var1]; var5 != null; var5 = var5.field8431) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class614.field8664[var1] = var5.field8431;
                    } else {
                        var4.field8431 = var5.field8431;
                    }
                    class226.field3323 = true;
                    return;
                }
                var4 = var5;
            }
            class593 var6 = null;
            for (class593 var7 = class374.field5677[var1]; var7 != null; var7 = var7.field8431) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class374.field5677[var1] = var7.field8431;
                    } else {
                        var6.field8431 = var7.field8431;
                    }
                    class226.field3323 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
    public final void method106(int arg0) {
        field725++;
        OpenGL.glFramebufferRenderbufferEXT(this.field728, this.field742, 36161, 0);
        this.field728 = -1;
        this.field742 = -1;
        if (arg0 <= 14) {
            method371(null);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V")
    public final void method372(int arg0, int arg1, int arg2) {
        field738++;
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, arg2, this.field733);
        this.field728 = arg0;
        this.field742 = arg1;
    }

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "(I)V")
    public static void method373(int arg0) {
        field736 = null;
        field743 = null;
        field741 = null;
        field739 = null;
        field744 = null;
        if (arg0 != 4028) {
            method375(-5);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZIII)V")
    public static final void method374(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field732++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        if (!arg1) {
            method373(-4);
        }
        int var8 = -1;
        class238.method1577(arg0, class664.field9322[arg3], arg4 + arg2, -arg2 + arg4, (byte) -11);
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class664.field9322[arg3 + var6];
                int[] var10 = class664.field9322[arg3 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class238.method1577(arg0, var9, var11, var12, (byte) 127);
                class238.method1577(arg0, var10, var11, var12, (byte) 124);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class664.field9322[arg3 + var5];
            int[] var16 = class664.field9322[arg3 - var5];
            class238.method1577(arg0, var15, var13, var14, (byte) 1);
            class238.method1577(arg0, var16, var13, var14, (byte) -42);
        }
    }

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "(I)I")
    public static final int method375(int arg0) {
        field737++;
        if (class483.field6967) {
            return 6;
        } else if (class456.field6722 == null) {
            return 0;
        } else {
            if (arg0 != 1) {
                method373(-123);
            }
            int var1 = class456.field6722.field4972;
            if (class66.method585(var1, (byte) -58)) {
                return 1;
            } else if (class88.method713(arg0 - 1, var1)) {
                return 2;
            } else if (class348.method2203((byte) 87, var1)) {
                return 3;
            } else if (class615.method3555(var1, 5066)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lwh;III)V")
    public class51(class148 arg0, int arg1, int arg2, int arg3) {
        this.field735 = arg0;
        this.field726 = arg2;
        this.field734 = arg1;
        this.field731 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class542.field7730, 0);
        this.field733 = class542.field7730[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field733);
        OpenGL.glRenderbufferStorageEXT(36161, this.field734, this.field726, this.field731);
        this.field730 = this.field731 * this.field726 * this.field735.method1101(125, this.field734);
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lwh;IIII)V")
    public class51(class148 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field726 = arg2;
        this.field735 = arg0;
        this.field734 = arg1;
        this.field731 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class542.field7730, 0);
        this.field733 = class542.field7730[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field733);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field734, this.field726, this.field731);
        this.field730 = this.field731 * this.field726 * this.field735.method1101(124, this.field734);
    }
}
