import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class303 extends class328 {

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "I")
    private int field4377 = -1;

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "I")
    public static int field4378 = 0;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "Lbv;")
    public static class567 field4376 = new class567("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "I")
    public int field4382;

    @OriginalMember(owner = "client!gq", name = "M", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!gq", name = "N", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "[I")
    public int[] field4375;

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V", line = 3)
    public class303() {
        super(0, false);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BILco;)V", line = 8)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field4379;
        if (~arg1 == -1) {
            this.field4377 = arg2.method1745(32132);
        }
        if (arg0 <= 75) {
            this.method1((byte) 0, 75, (class268) null);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIII)V", line = 21)
    public static final void method1891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == -1) {
            ++field4374;
            if (arg5 - arg1 >= class183.field2638 && arg1 + arg5 <= class268.field3911 && -arg1 + arg4 >= class222.field3350 && class409.field6071 >= arg1 + arg4) {
                class608.method3457(arg3, arg6, arg1, arg5, arg4, arg0, true);
            } else {
                class521.method2944(arg3, arg0, arg1, arg4, arg6, -31262, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)I", line = 38)
    public final int method1892(byte arg0) {
        if (arg0 != 122) {
            this.field4377 = 115;
        }
        ++field4381;
        return this.field4377;
    }

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)Lgb;", line = 56)
    public static final class153 method1893(int arg0) {
        ++field4372;
        if (class212.field3106 != null && class609.field8666 != null) {
            class609.field8666.method1875(class212.field3106, (byte) 29);
            class153 var1 = (class153) class609.field8666.method1877(-19613);
            if (arg0 < 123) {
                method1895(-67);
            }
            if (var1 == null) {
                return null;
            } else {
                class192 var2 = class212.field3095.method70(var1.field2298, 117);
                return var2 != null && var2.field2744 && var2.method1272(-128, class212.field3090) ? var1 : class42.method376(116);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)[[I", line = 84)
    public int[][] method7(int arg0, int arg1) {
        int var3 = 34 / ((arg1 - 46) / 54);
        ++field4380;
        int[][] var4 = super.field4725.method1886((byte) -117, arg0);
        if (super.field4725.field4371 && this.method1894(false)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = this.field4382 * (class527.field7334 == this.field4384 ? arg0 : this.field4384 * arg0 / class527.field7334);
            if (~class449.field6539 == ~this.field4382) {
                for (int var9 = 0; var9 < class449.field6539; ++var9) {
                    int var10 = this.field4375[var8++];
                    var7[var9] = class424.method2540(var10, 255) << 4;
                    var6[var9] = class424.method2540(65280, var10) >> 4;
                    var5[var9] = class424.method2540(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~class449.field6539 < ~var11; ++var11) {
                    int var12 = this.field4382 * var11 / class449.field6539;
                    int var13 = this.field4375[var8 + var12];
                    var7[var11] = class424.method2540(255, var13) << 4;
                    var6[var11] = class424.method2540(var13, 65280) >> 4;
                    var5[var11] = class424.method2540(var13, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)Z", line = 155)
    public final boolean method1894(boolean arg0) {
        ++field4373;
        if (this.field4375 != null) {
            return true;
        } else if (arg0) {
            return false;
        } else if (~this.field4377 <= -1) {
            class518 var2 = ~class458.field6600 <= -1 ? class518.method2922(class145.field2232, class458.field6600, this.field4377) : class518.method2917(class145.field2232, this.field4377);
            var2.method2925();
            this.field4375 = var2.method2921();
            this.field4382 = var2.field7202;
            this.field4384 = var2.field7195;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V", line = 182)
    public final void method456(int arg0) {
        super.method456(arg0);
        ++field4383;
        this.field4375 = null;
    }

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)V", line = 196)
    public static void method1895(int arg0) {
        field4376 = null;
        if (arg0 != 0) {
            field4378 = -20;
        }
    }
}
