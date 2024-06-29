import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class312 extends class300 {

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    private int field5001 = 1365;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    private int field5009 = 20;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    private int field5003 = 0;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    private int field5010 = 0;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "[I")
    public static int[] field5006 = new int[5];

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field5005 = 0;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "[Lji;")
    public static class99[] field4997 = new class99[4];

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "B")
    public static byte field5007;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)V")
    public static final void method2095(int arg0) {
        ++field5008;
        if (arg0 >= 12) {
            class49.field626.method1510(10283);
            class58.field857.method1510(10283);
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class312() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIZLvg;I)V")
    public static final void method2096(int arg0, int arg1, int arg2, boolean arg3, class251 arg4, int arg5) {
        ++field5000;
        if (~arg4.field4110 != 0 || arg4.field4097 != null) {
            int var6 = 0;
            if (~arg2 < ~arg4.field4103) {
                var6 += -arg4.field4103 + arg2;
            } else if (arg4.field4105 > arg2) {
                var6 += -arg2 + arg4.field4105;
            }
            if (arg3) {
                field5011 = 10;
            }
            if (arg4.field4121 < arg1) {
                var6 += -arg4.field4121 + arg1;
            } else if (arg4.field4116 > arg1) {
                var6 += arg4.field4116 - arg1;
            }
            int var7 = class235.field3792 * arg4.field4100 >> 8;
            if (~arg4.field4122 != -1 && ~(var6 + -64) >= ~arg4.field4122 && class235.field3792 != 0 && arg4.field4114 == arg5) {
                var6 -= 64;
                if (var6 < 0) {
                    var6 = 0;
                }
                int var8 = (-var6 + arg4.field4122) * var7 / arg4.field4122;
                if (arg4.field4099 == null) {
                    if (~arg4.field4110 <= -1) {
                        class101 var9 = class101.method685(class49.field619, arg4.field4110, 0);
                        if (var9 != null) {
                            class131 var10 = var9.method682().method836(class86.field1322);
                            class145 var11 = class145.method985(var10, 100, var8);
                            var11.method953(-1);
                            class81.field1231.method1927(var11);
                            arg4.field4099 = var11;
                        }
                    }
                } else {
                    arg4.field4099.method974(var8);
                }
                if (arg4.field4102 != null) {
                    arg4.field4102.method974(var8);
                    if (!arg4.field4102.method1762(-18974)) {
                        arg4.field4102 = null;
                    }
                } else {
                    if (arg4.field4097 != null && (arg4.field4117 -= arg0) <= 0) {
                        int var12 = (int) ((double) arg4.field4097.length * Math.random());
                        class101 var13 = class101.method685(class49.field619, arg4.field4097[var12], 0);
                        if (var13 != null) {
                            class131 var14 = var13.method682().method836(class86.field1322);
                            class145 var15 = class145.method985(var14, 100, var8);
                            var15.method953(0);
                            class81.field1231.method1927(var15);
                            arg4.field4102 = var15;
                            arg4.field4117 = arg4.field4119 - -((int) (Math.random() * (double) (-arg4.field4119 + arg4.field4120)));
                            return;
                        }
                    }
                }
            } else {
                if (arg4.field4099 != null) {
                    class81.field1231.method1931(arg4.field4099);
                    arg4.field4099 = null;
                }
                if (arg4.field4102 != null) {
                    class81.field1231.method1931(arg4.field4102);
                    arg4.field4102 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (arg1 > -43) {
            this.field5010 = -49;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 == -4) {
                        this.field5003 = arg0.method1186((byte) -111);
                    }
                } else {
                    this.field5010 = arg0.method1186((byte) -82);
                }
            } else {
                this.field5009 = arg0.method1186((byte) -82);
            }
        } else {
            this.field5001 = arg0.method1186((byte) -50);
        }
        ++field4999;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)V")
    public static void method2097(byte arg0) {
        field5006 = null;
        if (arg0 == 54) {
            field4997 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        if (arg1 != -957953300) {
            field5007 = 90;
        }
        int[] var3 = super.field4797.method217(arg0, true);
        if (super.field4797.field470) {
            for (int var4 = 0; class180.field2826 > var4; ++var4) {
                int var5 = (class5.field73[var4] << 12) / this.field5001 + this.field5010;
                int var6 = (class235.field3797[arg0] << 12) / this.field5001 + this.field5003;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; ~(var11 + var12) > -16385 && this.field5009 > var13; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 - -var7 + var11;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 >= this.field5009 - 1 ? 0 : (var13 << 12) / this.field5009;
            }
        }
        ++field5004;
        return var3;
    }
}
