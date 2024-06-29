import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class169 extends class466 {

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
    private int field2440 = -1;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
    public static int field2443 = 0;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "F")
    public static float field2445;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    public int field2439;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    public int field2449;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "Lcda;")
    public static class147 field2444;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "[I")
    public int[] field2447;

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class169() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)[[I")
    public int[][] method33(int arg0, boolean arg1) {
        ++field2446;
        if (arg1) {
            field2444 = null;
        }
        int[][] var3 = super.field6569.method828((byte) -122, arg0);
        if (super.field6569.field1934 && this.method1079((byte) 47)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field2439 * (~class564.field7814 == ~this.field2449 ? arg0 : this.field2449 * arg0 / class564.field7814);
            if (class312.field4207 == this.field2439) {
                for (int var8 = 0; ~var8 > ~class312.field4207; ++var8) {
                    int var9 = this.field2447[var7++];
                    var6[var8] = class589.method3454(var9, 255) << 4;
                    var5[var8] = class589.method3454(65280, var9) >> 4;
                    var4[var8] = class589.method3454(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~class312.field4207 < ~var10; ++var10) {
                    int var11 = this.field2439 * var10 / class312.field4207;
                    int var12 = this.field2447[var7 + var11];
                    var6[var10] = class589.method3454(var12, 255) << 4;
                    var5[var10] = class589.method3454(65280, var12) >> 4;
                    var4[var10] = class589.method3454(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public final void method1078(int arg0) {
        ++field2438;
        super.method1078(-126);
        this.field2447 = null;
        if (arg0 > -89) {
            this.field2449 = 64;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)Z")
    public final boolean method1079(byte arg0) {
        ++field2442;
        if (arg0 != 47) {
            method1080(13, -102, -32, (Object) null);
        }
        if (this.field2447 != null) {
            return true;
        } else if (this.field2440 >= 0) {
            class38 var2 = class341.field4600 >= 0 ? class38.method399(class368.field5010, class341.field4600, this.field2440) : class38.method396(class368.field5010, this.field2440);
            var2.method408();
            this.field2447 = var2.method395();
            this.field2449 = var2.field783;
            this.field2439 = var2.field785;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
    public static final byte[] method1080(int arg0, int arg1, int arg2, Object arg3) {
        ++field2441;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class375.method2221(arg0, var4, 100, arg1);
        } else {
            if (arg2 != 255) {
                method1081(-63);
            }
            if (arg3 instanceof class271) {
                class271 var5 = (class271) arg3;
                return var5.method1762(arg1, arg2 + 745, arg0);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
    public static void method1081(int arg0) {
        if (arg0 == -13645) {
            field2444 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)I")
    public final int method1082(int arg0) {
        ++field2448;
        if (arg0 != 0) {
            this.method6((class11) null, -5, -82);
        }
        return this.field2440;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        ++field2450;
        if (arg1 != -5062) {
            field2445 = 0.91973567F;
        }
        if (~arg2 == -1) {
            this.field2440 = arg0.method93((byte) 103);
        }
    }
}
