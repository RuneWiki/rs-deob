import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class440 extends class377 implements class238 {

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "Z")
    private boolean field5915 = false;

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "Lmw;")
    public class518 field5916;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "Z")
    private boolean field5907;

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "[I")
    public static int[] field5918 = new int[1];

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "[I")
    public static int[] field5917 = new int[3];

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!mf", name = "lb", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!mf", name = "mb", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "Loba;")
    private class276 field5899;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lha;I)V", line = 3)
    public final void method931(class66 arg0, int arg1) {
        int var3 = -25 % ((arg1 - 28) / 63);
        ++field5910;
        this.field5916.method3110(arg0, (byte) 98);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)I", line = 13)
    public final int method929(byte arg0) {
        ++field5913;
        if (arg0 != -45) {
            this.method929((byte) -126);
        }
        return this.field5916.field7289;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)I", line = 25)
    public final int method928(int arg0) {
        ++field5900;
        if (arg0 != 13272) {
            method2599((byte) -82);
        }
        return this.field5916.field7322;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)Z", line = 36)
    public final boolean method504(byte arg0) {
        ++field5911;
        if (arg0 != -24) {
            this.method935(9);
        }
        return this.field5915;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(Z)Z", line = 49)
    public final boolean method503(boolean arg0) {
        if (arg0) {
            this.field5899 = null;
        }
        ++field5912;
        return false;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lgt;I)V", line = 62)
    public final void method2597(class481 arg0, int arg1) {
        this.field5916.method3101(arg1 + 24259, arg0);
        if (arg1 != -24259) {
            method2599((byte) -2);
        }
        ++field5906;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBILha;)Z", line = 73)
    public final boolean method501(int arg0, byte arg1, int arg2, class66 arg3) {
        ++field5902;
        class498 var5 = this.field5916.method3102(131072, false, false, -26, arg3);
        if (var5 == null) {
            return false;
        } else {
            class778 var6 = arg3.method576();
            var6.method130(super.field4765 + super.field823, super.field809, super.field4767 + super.field813);
            if (arg1 <= 19) {
                this.method500((class66) null, -39);
            }
            return class502.field7084 ? var5.method379(arg0, arg2, var6, false, 0, class621.field8528) : var5.method363(arg0, arg2, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(ILha;)Lrk;", line = 96)
    public final class35 method502(int arg0, class66 arg1) {
        ++field5898;
        class498 var3 = this.field5916.method3102(2048, false, true, -36, arg1);
        if (var3 == null) {
            return null;
        } else {
            class778 var4 = arg1.method576();
            var4.method130(super.field823 - -super.field4765, super.field809, super.field4767 + super.field813);
            class35 var5 = class415.method2476(1, (byte) 104, this.field5907);
            int var6 = super.field823 >> 9;
            int var7 = super.field813 >> 9;
            this.field5916.method3109(true, var6, var6, var3, -17230, var7, var4, var7, arg1);
            int var8 = 111 % ((47 - arg0) / 63);
            if (!class502.field7084) {
                var3.method355(var4, var5.field537[0], 0);
            } else {
                var3.method388(var4, var5.field537[0], class621.field8528, 0);
            }
            if (this.field5916.field7301 != null) {
                class460 var9 = this.field5916.field7301.method4244();
                if (class502.field7084) {
                    arg1.method590(var9, class621.field8528);
                } else {
                    arg1.method582(var9);
                }
            }
            this.field5915 = var3.method380() || this.field5916.field7301 != null;
            if (this.field5899 == null) {
                this.field5899 = class792.method4369(super.field809, super.field823, var3, (byte) -5, super.field813);
            } else {
                class521.method3120(112, super.field809, this.field5899, super.field813, var3, super.field823);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "(I)Lhd;", line = 147)
    public static final class773 method2598(int arg0) {
        ++field5920;
        class573 var1 = null;
        class773 var2 = new class773(class672.field9229, 0);
        try {
            class561 var3 = class521.field7389.method3792(true, false, "");
            while (~var3.field7769 == -1) {
                class594.method3405(1L, 16711680);
            }
            if (~var3.field7769 == arg0) {
                var1 = (class573) var3.field7768;
                byte[] var4 = new byte[(int) var1.method3321(arg0 ^ -30971)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var1.method3322(var5, var4.length + -var5, var4, -11433);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class773(new class403(var4), class672.field9229, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var1 != null) {
                var1.method3319(122);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)I", line = 197)
    public final int method927(int arg0) {
        ++field5909;
        if (arg0 != -24482) {
            this.method501(-54, (byte) -115, -33, (class66) null);
        }
        return this.field5916.field7296;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lha;Ltba;IIIIIZIIIII)V", line = 209)
    public class440(class66 arg0, class174 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field5916 = new class518(arg0, arg1, arg10, arg11, super.field808, arg3, this, arg7, arg12);
        this.field5907 = arg1.field2171 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Z", line = 218)
    public final boolean method935(int arg0) {
        ++field5919;
        if (arg0 != 25271) {
            field5918 = null;
        }
        return this.field5916.method3108((byte) 119);
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(B)V", line = 234)
    public static void method2599(byte arg0) {
        if (arg0 != -1) {
            field5918 = null;
        }
        field5918 = null;
        field5917 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILha;)V", line = 248)
    public final void method930(int arg0, class66 arg1) {
        ++field5905;
        this.field5916.method3099(arg0 + -14354, arg1);
        if (arg0 != 14353) {
            this.method502(-16, (class66) null);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V", line = 262)
    public final void method936(boolean arg0) {
        if (arg0) {
            this.method500((class66) null, 49);
        }
        ++field5901;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLha;)Loba;", line = 272)
    public final class276 method507(boolean arg0, class66 arg1) {
        ++field5914;
        return arg0 ? null : this.field5899;
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)I", line = 284)
    public final int method509(int arg0) {
        ++field5903;
        int var2 = -12 % ((arg0 - -38) / 56);
        return this.field5916.method3106(false);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lha;I)V", line = 294)
    public final void method500(class66 arg0, int arg1) {
        ++field5904;
        class498 var3 = this.field5916.method3102(262144, false, true, arg1 ^ 68, arg0);
        if (arg1 != -1) {
            this.field5916 = null;
        }
        if (var3 != null) {
            int var4 = super.field823 >> 9;
            int var5 = super.field813 >> 9;
            class778 var6 = arg0.method576();
            var6.method130(super.field823, super.field809, super.field813);
            this.field5916.method3109(false, var4, var4, var3, -17230, var5, var6, var5, arg0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)I", line = 319)
    public final int method508(int arg0) {
        if (arg0 != -4798) {
            return 31;
        } else {
            ++field5908;
            return this.field5916.method3098((byte) -15);
        }
    }
}
