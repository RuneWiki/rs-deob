import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class376 extends class11 {

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    private int field5500 = 0;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
    private int field5501 = 1;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
    private int field5502 = 0;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "Lar;")
    public static class479 field5508 = new class479();

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "[I")
    public static int[] field5509 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public static int field5510 = 0;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BC)Z", line = 4)
    public static final boolean method2241(byte arg0, char arg1) {
        if (arg0 != 81) {
            method2242(119, 124, 117);
        }
        ++field5504;
        return ~arg1 <= -49 && ~arg1 >= -58;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lsi;II)V", line = 15)
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (arg1 > -40) {
            field5510 = 84;
        }
        ++field5507;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field5501 = arg0.method2348(-2);
                }
            } else {
                this.field5500 = arg0.method2348(-2);
            }
        } else {
            this.field5502 = arg0.method2348(-2);
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(II)[I", line = 57)
    public final int[] method44(int arg0, int arg1) {
        ++field5505;
        if (arg0 > -42) {
            this.method43((class391) null, -73, -79);
        }
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            int var4 = class328.field4484[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class90.field1316 < ~var6; ++var6) {
                int var7 = class448.field6606[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field5502 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field5501 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field5501;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field5500 == 0) {
                    var12 = class132.field1928[var12 >> 4 & 255] + 4096 >> 1;
                } else if (~this.field5500 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 167)
    public class376() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(III)Lid;", line = 134)
    public static final class413 method2242(int arg0, int arg1, int arg2) {
        class486 var3 = class89.field1305[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class413 var4 = var3.field7097;
            var3.field7097 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)Lhj;", line = 149)
    public static final class400 method2243(int arg0) {
        ++field5506;
        if (arg0 != 47) {
            field5508 = null;
        }
        try {
            return (class400) Class.forName("tv").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)V", line = 170)
    public static void method2244(int arg0) {
        field5509 = null;
        if (arg0 != 0) {
            field5510 = -78;
        }
        field5508 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()V", line = 186)
    public static final void method2245() {
        for (int var0 = 0; var0 < class304.field4159; ++var0) {
            class116 var1 = class420.field6132[var0];
            class41.method349(var1);
            class420.field6132[var0] = null;
        }
        class304.field4159 = 0;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V", line = 200)
    public final void method42(boolean arg0) {
        if (arg0) {
            class144.method971((byte) 26);
            ++field5503;
        }
    }
}
