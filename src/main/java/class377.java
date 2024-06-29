import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class377 extends class62 {

    @OriginalMember(owner = "client!os", name = "D", descriptor = "Lada;")
    public static class144 field5198 = new class144(20, -1);

    @OriginalMember(owner = "client!os", name = "J", descriptor = "I")
    public static int field5204 = 2;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "F")
    public static float field5205;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "Loa;")
    public static class597 field5200;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(II)V", line = 5)
    public static final void method2250(int arg0, int arg1) {
        if (~class219.field3190 != -1) {
            class511.field7276 = arg0;
        } else {
            class129.field1796.method1107(arg0, 16384);
        }
        ++field5202;
        if (arg1 >= -35) {
            field5198 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lqa;B)V", line = 23)
    public static final void method2251(class208 arg0, byte arg1) {
        ++field5203;
        if (~class428.field5755 != ~class541.field8119.field8501) {
            if (arg1 > 39) {
                if (class420.field5697 != null) {
                    if (class5.method12(arg0, (byte) 24, class541.field8119.field8501)) {
                        class428.field5755 = class541.field8119.field8501;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)[[I", line = 44)
    public final int[][] method409(int arg0, byte arg1) {
        ++field5197;
        if (arg1 > -20) {
            field5198 = null;
        }
        int[][] var3 = super.field772.method2906(8, arg0);
        if (super.field772.field6899) {
            int[] var4 = this.method408(arg0, 2, (byte) -69);
            int[][] var5 = this.method407(0, (byte) 41, arg0);
            int[][] var6 = this.method407(1, (byte) 41, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class438.field5847; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!os", name = "h", descriptor = "(I)V", line = 124)
    public static void method2252(int arg0) {
        if (arg0 > -108) {
            field5200 = null;
        }
        field5200 = null;
        field5198 = null;
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(II)[I", line = 135)
    public final int[] method13(int arg0, int arg1) {
        ++field5201;
        if (arg1 != 656024161) {
            method2251((class208) null, (byte) 73);
        }
        int[] var3 = super.field774.method3086(arg0, -2);
        if (super.field774.field7499) {
            int[] var4 = this.method408(arg0, 0, (byte) -69);
            int[] var5 = this.method408(arg0, 1, (byte) -69);
            int[] var6 = this.method408(arg0, 2, (byte) -69);
            for (int var7 = 0; var7 < class438.field5847; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (var8 != 0) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V", line = 187)
    public class377() {
        super(3, false);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lgw;II)V", line = 193)
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            super.field788 = ~arg0.method1032((byte) -33) == -2;
        }
        ++field5199;
        if (arg1 != -1) {
            this.method13(-10, -10);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lk;III[Z)Z", line = 213)
    public static final boolean method2253(class485 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class165.field2609 != class114.field1609) {
            int var6 = class207.field3077[arg1].method1233(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class176 var8 = class207.field3077[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1233(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1240(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1241(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }
}
