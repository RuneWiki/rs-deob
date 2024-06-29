import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class437 extends class585 {

    @OriginalMember(owner = "client!uw", name = "K", descriptor = "Z")
    private boolean field5897 = true;

    @OriginalMember(owner = "client!uw", name = "P", descriptor = "Z")
    private boolean field5902 = true;

    @OriginalMember(owner = "client!uw", name = "I", descriptor = "Lbu;")
    public static class21 field5896 = new class21(117, 3);

    @OriginalMember(owner = "client!uw", name = "L", descriptor = "[I")
    public static int[] field5898 = new int[2];

    @OriginalMember(owner = "client!uw", name = "R", descriptor = "J")
    public static long field5904 = 20000000L;

    @OriginalMember(owner = "client!uw", name = "E", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!uw", name = "G", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!uw", name = "H", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!uw", name = "M", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!uw", name = "N", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!uw", name = "O", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!uw", name = "Q", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "()V", line = 3)
    public class437() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZI)[[I", line = 9)
    public final int[][] method58(boolean arg0, int arg1) {
        if (arg0) {
            field5904 = 34L;
        }
        ++field5900;
        int[][] var3 = super.field8265.method1576((byte) -77, arg1);
        if (super.field8265.field3546) {
            int[][] var4 = this.method3417(0, this.field5902 ? -arg1 + class305.field4391 : arg1, (byte) 113);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field5897) {
                for (int var11 = 0; ~class293.field4278 < ~var11; ++var11) {
                    var8[var11] = var5[-var11 + class625.field8759];
                    var9[var11] = var6[-var11 + class625.field8759];
                    var10[var11] = var7[-var11 + class625.field8759];
                }
            } else {
                for (int var12 = 0; ~class293.field4278 < ~var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IILso;)Ljava/lang/String;", line = 76)
    public static final String method2612(int arg0, int arg1, class494 arg2) {
        ++field5901;
        try {
            int var3 = arg2.method2993(29);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field7042 += class166.field2626.method1651(123, 0, arg2.field7050, var3, arg2.field7042, var4);
            if (arg0 != 24289) {
                field5898 = null;
            }
            return class74.method589(var4, 0, 0, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(II)[I", line = 107)
    public final int[] method55(int arg0, int arg1) {
        ++field5899;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 <= 123) {
            this.field5902 = true;
        }
        if (super.field8255.field3677) {
            int[] var4 = this.method3415(-128, 0, !this.field5902 ? arg0 : -arg0 + class305.field4391);
            if (!this.field5897) {
                class595.method3473(var4, 0, var3, 0, class293.field4278);
            } else {
                for (int var5 = 0; class293.field4278 > var5; ++var5) {
                    var3[var5] = var4[class625.field8759 - var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lso;II)V", line = 152)
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field8266 = arg0.method2964((byte) 58) == 1;
                }
            } else {
                this.field5902 = ~arg0.method2964((byte) 126) == -2;
            }
        } else {
            this.field5897 = arg0.method2964((byte) 64) == 1;
        }
        ++field5903;
        if (arg1 != 1) {
            this.method54((class494) null, -121, 90);
        }
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)V", line = 201)
    public static void method2613(int arg0) {
        if (arg0 != 17777) {
            field5904 = 55L;
        }
        field5898 = null;
        field5896 = null;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZB)V", line = 216)
    public static final void method2614(boolean arg0, byte arg1) {
        ++field5895;
        if (arg0) {
            if (class371.field5137 != -1) {
                class584.method3413(116, class371.field5137);
            }
            for (class744 var2 = (class744) class11.field217.method2243((byte) 100); var2 != null; var2 = (class744) class11.field217.method2248(-15690)) {
                if (!var2.method3386((byte) 74)) {
                    var2 = (class744) class11.field217.method2243((byte) 100);
                    if (var2 == null) {
                        break;
                    }
                }
                class698.method3932((byte) 94, var2, true, false);
            }
            class371.field5137 = -1;
            class11.field217 = new class353(8);
            class581.method3406(-95);
            class371.field5137 = class152.field2155;
            class661.method3773(false, -73);
            class351.method2224((byte) 119);
            class379.method2356(class371.field5137);
        }
        class777.method4275(-67);
        class34.field469 = false;
        if (arg1 == -66) {
            class83.method631((byte) -113);
            class275.field3980 = -1;
            class758.method4211(class572.field8073, false);
            class210.field3250 = new class702();
            class210.field3250.field4670[0] = class768.field10571 / 2;
            class210.field3250.field5742 = class768.field10571 * 512 / 2;
            class210.field3250.field5746 = class350.field4898 * 512 / 2;
            class472.field6622 = 0;
            class614.field8619 = 0;
            class210.field3250.field4672[0] = class350.field4898 / 2;
            if (class416.field5704 == 2) {
                class472.field6622 = class345.field4813 << 9;
                class614.field8619 = class287.field4226 << 9;
            } else {
                class109.method834(89);
            }
            class37.method289((byte) 68);
        }
    }
}
