import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class575 extends class334 {

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
    private int field8290 = 585;

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "[F")
    public static float[] field8289 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "I")
    public static int field8294 = 1403;

    @OriginalMember(owner = "client!wn", name = "N", descriptor = "[I")
    public static int[] field8296 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
    public static int field8295 = 0;

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!wn", name = "I", descriptor = "I")
    public static int field8291;

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLfm;)I")
    public static final int method3389(byte arg0, class281 arg1) {
        if (arg0 >= -111) {
            method3389((byte) 86, (class281) null);
        }
        ++field8291;
        if (~arg1.field4117 == -1) {
            return 0;
        } else {
            if (~arg1.field4054 != 0) {
                class281 var2 = null;
                if (~arg1.field4054 <= -32769) {
                    if (~arg1.field4054 <= -32769) {
                        var2 = class588.field8451[arg1.field4054 + -32768];
                    }
                } else {
                    class647 var3 = (class647) class486.field6697.method4253((long) arg1.field4054, -1);
                    if (var3 != null) {
                        var2 = var3.field9191;
                    }
                }
                if (var2 != null) {
                    int var4 = -var2.field10347 + arg1.field10347;
                    int var5 = -var2.field10350 + arg1.field10350;
                    if (~var4 != -1 || var5 != 0) {
                        arg1.method1791(16383 & (int) (2607.5945876176133D * Math.atan2((double) var4, (double) var5)), (byte) 106);
                    }
                }
            }
            if (!(arg1 instanceof class21)) {
                if (arg1 instanceof class506) {
                    class506 var6 = (class506) arg1;
                    if (var6.field6949 != -1 && (var6.field4141 == 0 || ~var6.field4144 < -1)) {
                        int var7 = -((-class222.field3266 + -class222.field3266 + var6.field6949) * 256) + var6.field10347;
                        int var8 = -((-class697.field9798 + var6.field6940 + -class697.field9798) * 256) + var6.field10350;
                        if (~var7 != -1 || var8 != 0) {
                            var6.method1791(16383 & (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D), (byte) -100);
                        }
                        var6.field6949 = -1;
                    }
                }
            } else {
                class21 var9 = (class21) arg1;
                if (var9.field211 != -1 && (~var9.field4141 == -1 || var9.field4144 > 0)) {
                    var9.method1791(var9.field211, (byte) -122);
                    var9.field211 = -1;
                }
            }
            return arg1.method1784((byte) -20);
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
    public class575() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)V")
    public static void method3390(byte arg0) {
        if (arg0 != 69) {
            field8294 = 64;
        }
        field8289 = null;
        field8296 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field8293;
        int[] var3 = super.field4743.method1027((byte) -100, arg0);
        if (super.field4743.field1993) {
            int var4 = class527.field7361[arg0];
            for (int var5 = 0; class439.field6099 > var5; ++var5) {
                int var6 = class295.field4296[var5];
                if (this.field8290 < var6 && var6 < -this.field8290 + 4096 && 2048 - this.field8290 < var4 && this.field8290 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field8290 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field8290 + 2048 < var6 && var6 < this.field8290 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field8290;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field8290 + 2048);
                } else if (this.field8290 <= var4 && var4 <= -this.field8290 + 4096) {
                    if (~this.field8290 >= ~var6 && ~var6 >= ~(-this.field8290 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field8290 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field8290;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field8290);
                }
            }
        }
        if (arg1 != -22563988) {
            this.method28(105, 127);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)I")
    public static final int method3391(int arg0, int arg1) {
        ++field8292;
        int var2 = 48 / ((arg0 - -61) / 42);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        ++field8288;
        if (~arg0 == -1) {
            this.field8290 = arg2.method2565((byte) -94);
        }
        if (arg1) {
            field8294 = 21;
        }
    }
}
