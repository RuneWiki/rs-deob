import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class352 extends class56 {

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    private int field4374 = 1365;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    private int field4373 = 0;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    private int field4376 = 0;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    private int field4379 = 20;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Llja;")
    public static class744 field4377 = new class744(72, 2);

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 3)
    public class352() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V", line = 10)
    public static void method2075(int arg0) {
        field4377 = null;
        if (arg0 != 1365) {
            field4377 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILes;)V", line = 20)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 == 3) {
                        this.field4376 = arg2.method2390((byte) 103);
                    }
                } else {
                    this.field4373 = arg2.method2390((byte) -102);
                }
            } else {
                this.field4379 = arg2.method2390((byte) 109);
            }
        } else {
            this.field4374 = arg2.method2390((byte) -112);
        }
        ++field4371;
        if (arg0 >= -44) {
            this.field4379 = 55;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 78)
    public static final String method2076(String arg0, boolean arg1) {
        if (arg1) {
            method2076((String) null, true);
        }
        ++field4380;
        if (class329.field4066.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class329.field4066.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else {
            return class329.field4066.startsWith("mac") ? "lib" + arg0 + ".dylib" : null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V", line = 101)
    public static final void method2077(byte arg0) {
        ++field4375;
        class613.method3469(31897);
        class320.field3967 = null;
        class185.field2245 = null;
        class322.field3995 = null;
        class102.field1321 = null;
        class647.field8807 = 0;
        class359.field4466 = 0;
        class742.field10346 = 0;
        class583.field7964.field5262 = 0;
        class123.method958(true);
        class433.method2563(-24708);
        for (int var1 = 0; ~var1 > -2049; ++var1) {
            class61.field825[var1] = null;
        }
        class300.field3596 = null;
        for (int var2 = 0; class370.field4599 > var2; ++var2) {
            class388 var4 = class616.field8293[var2].field3210;
            if (var4 != null) {
                var4.field3377 = -1;
            }
        }
        class426.method2543(30);
        class719.field10094 = -1;
        class131.field1617 = -1;
        class7.field100 = 1;
        class48.method454(10, -1);
        for (int var3 = 0; ~var3 > -101; ++var3) {
            class255.field2977[var3] = true;
        }
        class74.method694(105);
        class629.field8600 = 0L;
        if (arg0 != 113) {
            method2078(35, -106, -106, 126, -55, 65, 54, 115, 84);
        }
        class538.field7582 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIII)V", line = 166)
    public static final void method2078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4372;
        if (arg7 < -126) {
            class343.method2035(arg4, 0, arg1, arg0, arg2, arg5, (byte) -23, arg8, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[I", line = 178)
    public final int[] method145(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field4373 = 97;
        }
        ++field4378;
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            for (int var4 = 0; ~class642.field8759 < ~var4; ++var4) {
                int var5 = (class648.field8837[var4] << 12) / this.field4374 + this.field4373;
                int var6 = (class349.field4354[arg1] << 12) / this.field4374 - -this.field4376;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; ~(var11 + var12) > -16385 && ~var13 > ~this.field4379; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var7 + var11;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~(this.field4379 + -1) < ~var13 ? (var13 << 12) / this.field4379 : 0;
            }
        }
        return var3;
    }
}
