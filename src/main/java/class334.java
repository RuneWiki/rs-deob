import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public abstract class class334 extends class766 {

    @OriginalMember(owner = "client!ica", name = "B", descriptor = "Z")
    public boolean field4747;

    @OriginalMember(owner = "client!ica", name = "w", descriptor = "[Lica;")
    public class334[] field4742;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!ica", name = "q", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!ica", name = "r", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!ica", name = "t", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!ica", name = "u", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!ica", name = "v", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!ica", name = "y", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!ica", name = "A", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!ica", name = "C", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!ica", name = "D", descriptor = "I")
    public int field4749;

    @OriginalMember(owner = "client!ica", name = "x", descriptor = "Lso;")
    public class116 field4743;

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "Lbo;")
    public class34 field4734;

    @OriginalMember(owner = "client!ica", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4738;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V")
    public static void method2048(byte arg0) {
        field4738 = null;
        int var1 = -57 % ((38 - arg0) / 48);
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IILuf;)I")
    public static final int method2049(int arg0, int arg1, class519 arg2) {
        field4735++;
        if (!client.method885(arg2).method1248(arg0, true) && arg2.field7139 == null) {
            return -1;
        } else if (arg1 == -1) {
            return arg2.field7187 == null || arg0 >= arg2.field7187.length ? -1 : arg2.field7187[arg0];
        } else {
            return -47;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IZLol;)V")
    public void method29(int arg0, boolean arg1, class431 arg2) {
        if (arg1) {
            this.field4742 = null;
        }
        field4739++;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZII)V")
    public void method2050(boolean arg0, int arg1, int arg2) {
        field4745++;
        int var4 = this.field4749 == 255 ? arg2 : this.field4749;
        if (this.field4747) {
            this.field4743 = new class116(var4, arg2, arg1);
        } else {
            this.field4734 = new class34(var4, arg2, arg1);
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
    public void method1064(int arg0) {
        field4741++;
        if (arg0 >= -126) {
            method2049(-16, -10, null);
        }
        if (this.field4747) {
            this.field4743.method1028((byte) 50);
            this.field4743 = null;
        } else {
            this.field4734.method274(127);
            this.field4734 = null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lnfa;[Lmfa;)V")
    public static final void method2051(class745 arg0, class217[] arg1) {
        if (class398.field5491) {
            int var2 = arg0.method1424(4, arg1);
            class29.field307.method504(var2, arg1);
        }
        if (class678.field9594 == class454.field6207) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class208) {
                var5 = ((class208) arg0).field3027;
                var6 = ((class208) arg0).field3035;
            } else {
                var5 = arg0.field10347 >> class679.field9600;
                var6 = arg0.field10350 >> class679.field9600;
            }
            class29.field307.method440(class495.field6799[0].method2478(true, arg0.field10350, arg0.field10347), class661.method3703(var5, var6), class143.method1148(var5, var6), class203.method1426(var5, var6));
        }
        class162 var7 = arg0.method204(class29.field307, -1);
        if (var7 == null) {
            return;
        }
        if (arg0.field10346) {
            class749[] var8 = var7.field2500;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class749 var10 = var8[var9];
                if (var10.field10404) {
                    class528.method3090(3985, var10.field10401 + var10.field10400, var10.field10405 - var10.field10400, var10.field10403 - var10.field10400, var10.field10402 + var10.field10400);
                }
            }
        }
        if (var7.field2497) {
            var7.field2501 = arg0;
            if (class494.field6789) {
                class724 var11 = class316.field4495;
                synchronized (class316.field4495) {
                    class316.field4495.method4020(var7, (byte) 118);
                    return;
                }
            }
            class316.field4495.method4020(var7, (byte) 118);
            return;
        }
        class432.method2588(var7, -126);
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)V")
    public void method27(byte arg0) {
        field4733++;
        if (arg0 >= -27) {
            method2051(null, null);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZI)[[I")
    public int[][] method283(boolean arg0, int arg1) {
        if (arg0) {
            field4744++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(II)[I")
    public int[] method28(int arg0, int arg1) {
        if (arg1 != -22563988) {
            this.method1065(-123);
        }
        field4736++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(III)[I")
    public final int[] method2052(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field4743 = null;
        }
        field4748++;
        return this.field4742[arg0].field4747 ? this.field4742[arg0].method28(arg2, arg1 ^ 0xFEA7B36C) : this.field4742[arg0].method283(true, arg2)[0];
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)I")
    public int method1065(int arg0) {
        field4740++;
        if (arg0 != -1) {
            this.method2054(94);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(III)[[I")
    public final int[][] method2053(int arg0, int arg1, int arg2) {
        field4737++;
        if (arg0 != 1) {
            this.method28(87, -91);
        }
        if (this.field4742[arg1].field4747) {
            int[] var4 = this.field4742[arg1].method28(arg2, -22563988);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4742[arg1].method283(true, arg2);
        }
    }

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "(I)I")
    public int method2054(int arg0) {
        field4746++;
        return arg0 == -21437 ? -1 : 3;
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(IZ)V")
    public class334(int arg0, boolean arg1) {
        this.field4747 = arg1;
        this.field4742 = new class334[arg0];
    }
}
