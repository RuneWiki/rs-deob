import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class289 extends class585 {

    @OriginalMember(owner = "client!vja", name = "I", descriptor = "I")
    private int field4235 = 4096;

    @OriginalMember(owner = "client!vja", name = "L", descriptor = "I")
    private int field4238 = 0;

    @OriginalMember(owner = "client!vja", name = "K", descriptor = "Lfba;")
    public static class27 field4237 = new class27(5, -1);

    @OriginalMember(owner = "client!vja", name = "M", descriptor = "Lwv;")
    public static class37 field4239 = new class37(13, 3);

    @OriginalMember(owner = "client!vja", name = "E", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!vja", name = "G", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!vja", name = "H", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!vja", name = "J", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method55(int arg0, int arg1) {
        ++field4232;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 < 123) {
            return null;
        } else {
            if (super.field8255.field3677) {
                int[] var4 = this.method3415(-127, 0, arg0);
                for (int var5 = 0; ~var5 > ~class293.field4278; ++var5) {
                    int var6 = var4[var5];
                    if (this.field4238 > var6) {
                        var3[var5] = this.field4238;
                    } else if (~var6 >= ~this.field4235) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field4235;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lso;II)V", line = 48)
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field4233;
        if (arg1 == 1) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        super.field8266 = ~arg0.method2964((byte) 47) == -2;
                    }
                } else {
                    this.field4235 = arg0.method2998(true);
                }
            } else {
                this.field4238 = arg0.method2998(true);
            }
        }
    }

    @OriginalMember(owner = "client!vja", name = "<init>", descriptor = "()V", line = 92)
    public class289() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIIIBZZ)V", line = 106)
    public static final void method1858(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, boolean arg6) {
        if (~arg3 > ~arg0) {
            int var7 = (arg3 - -arg0) / 2;
            int var8 = arg3;
            class204 var9 = class386.field5355[var7];
            class386.field5355[var7] = class386.field5355[arg0];
            class386.field5355[arg0] = var9;
            for (int var10 = arg3; var10 < arg0; ++var10) {
                if (class57.method393(class386.field5355[var10], arg2, arg5, (byte) -114, arg6, arg1, var9) <= 0) {
                    class204 var11 = class386.field5355[var10];
                    class386.field5355[var10] = class386.field5355[var8];
                    class386.field5355[var8++] = var11;
                }
            }
            class386.field5355[arg0] = class386.field5355[var8];
            class386.field5355[var8] = var9;
            method1858(var8 + -1, arg1, arg2, arg3, (byte) 46, arg5, arg6);
            method1858(arg0, arg1, arg2, var8 + 1, (byte) 46, arg5, arg6);
        }
        ++field4236;
        if (arg4 != 46) {
            method1859((byte) 121);
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(ZI)[[I", line = 153)
    public final int[][] method58(boolean arg0, int arg1) {
        ++field4234;
        int[][] var3 = super.field8265.method1576((byte) 67, arg1);
        if (super.field8265.field3546) {
            int[][] var4 = this.method3417(0, arg1, (byte) 113);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class293.field4278 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 >= this.field4238) {
                    if (this.field4235 >= var12) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field4235;
                    }
                } else {
                    var8[var11] = this.field4238;
                }
                if (~this.field4238 >= ~var13) {
                    if (var13 <= this.field4235) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field4235;
                    }
                } else {
                    var9[var11] = this.field4238;
                }
                if (var14 < this.field4238) {
                    var10[var11] = this.field4238;
                } else if (var14 > this.field4235) {
                    var10[var11] = this.field4235;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        if (arg0) {
            field4239 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vja", name = "e", descriptor = "(B)V", line = 230)
    public static void method1859(byte arg0) {
        field4239 = null;
        if (arg0 <= 66) {
            method1858(112, -6, 77, -84, (byte) 81, false, true);
        }
        field4237 = null;
    }
}
