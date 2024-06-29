import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class306 extends class334 {

    @OriginalMember(owner = "client!wia", name = "E", descriptor = "I")
    private int field4376 = 3072;

    @OriginalMember(owner = "client!wia", name = "H", descriptor = "I")
    private int field4378 = 1024;

    @OriginalMember(owner = "client!wia", name = "K", descriptor = "I")
    private int field4381 = 2048;

    @OriginalMember(owner = "client!wia", name = "F", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!wia", name = "I", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!wia", name = "J", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!wia", name = "L", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!wia", name = "M", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!wia", name = "N", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)V")
    public final void method27(byte arg0) {
        ++field4383;
        if (arg0 >= -27) {
            this.method27((byte) -16);
        }
        this.field4381 = this.field4376 - this.field4378;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field4747 = arg2.method2557(14929) == 1;
                }
            } else {
                this.field4376 = arg2.method2565((byte) -93);
            }
        } else {
            this.field4378 = arg2.method2565((byte) -97);
        }
        ++field4380;
        if (arg1) {
            method1890(-19);
        }
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "()V")
    public class306() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZ)Lis;")
    public static final class119 method1889(int arg0, boolean arg1) {
        ++field4377;
        class119 var2 = (class119) class379.field5318.method2882((long) arg0, (byte) -121);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class588.field8445.method3019(1, arg0, 57);
            if (arg1) {
                return null;
            } else {
                class119 var4 = new class119();
                var4.field2032 = arg0;
                if (var3 != null) {
                    var4.method1054(125, new class431(var3));
                }
                var4.method1046(27);
                if (var4.field2034 == 2 && class639.field9007.method4253((long) arg0, -1) == null) {
                    class639.field9007.method4252(false, new class725(class720.field10059), (long) arg0);
                    class778.field10672[class720.field10059++] = var4;
                }
                class379.field5318.method2890(-7307, (long) arg0, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method283(boolean arg0, int arg1) {
        ++field4384;
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (!arg0) {
            method1889(-96, true);
        }
        if (super.field4734.field425) {
            int[][] var4 = this.method2053(1, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class439.field6099; ++var11) {
                var8[var11] = (var5[var11] * this.field4381 >> 12) + this.field4378;
                var9[var11] = this.field4378 - -(var6[var11] * this.field4381 >> 12);
                var10[var11] = (var7[var11] * this.field4381 >> 12) + this.field4378;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wia", name = "g", descriptor = "(I)V")
    public static final void method1890(int arg0) {
        ++class302.field4342;
        class34.field423 = 0;
        class709.field9921 = 0;
        ++field4382;
        class276.method1768(1);
        int var1 = -2 % ((arg0 - 19) / 57);
        class183.method1327(true);
        class500.method2920(false);
        boolean var2 = false;
        for (int var3 = 0; var3 < class709.field9921; ++var3) {
            int var6 = class167.field2542[var3];
            class647 var7 = (class647) class486.field6697.method4253((long) var6, -1);
            class506 var8 = var7.field9191;
            if (class383.field5382 && class533.method3101(var6, true)) {
                class95.method796(-22907);
            }
            if (class302.field4342 != var8.field4087) {
                if (var8.field6964.method1297(-63)) {
                    class580.method3407(var8, -30920);
                }
                var8.method2965(524288, (class179) null);
                var7.method4237(-1);
                var2 = true;
            }
        }
        if (var2) {
            class51.field731 = class486.field6697.method4257(115);
            class486.field6697.method4256(5669, class654.field9252);
        }
        if (class549.field7634 != class48.field674.field5983) {
            throw new RuntimeException("gnp1 pos:" + class48.field674.field5983 + " psize:" + class549.field7634);
        } else {
            for (int var4 = 0; var4 < class657.field9270; ++var4) {
                if (class486.field6697.method4253((long) class350.field4963[var4], -1) == null) {
                    throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class657.field9270);
                }
            }
            if (-class657.field9270 + class51.field731 != 0) {
                throw new RuntimeException("gnp3 mis:" + (-class657.field9270 + class51.field731));
            } else {
                for (int var5 = 0; class51.field731 > var5; ++var5) {
                    if (~class302.field4342 != ~class654.field9252[var5].field9191.field4087) {
                        throw new RuntimeException("gnp4 uk:" + class654.field9252[var5].field9191.field4051);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field4379;
        int[] var3 = super.field4743.method1027((byte) -125, arg0);
        if (arg1 != -22563988) {
            this.field4376 = -49;
        }
        if (super.field4743.field1993) {
            int[] var4 = this.method2052(0, 0, arg0);
            for (int var5 = 0; var5 < class439.field6099; ++var5) {
                var3[var5] = (var4[var5] * this.field4381 >> 12) + this.field4378;
            }
        }
        return var3;
    }
}
