import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class289 extends class334 {

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    private int field4222 = 4096;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    private int field4219 = 0;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field4225 = 0;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "[Lth;")
    public static class131[] field4221;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)V")
    public static void method1823(int arg0) {
        field4221 = null;
        if (arg0 < 0) {
            field4221 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field4747 = ~arg2.method2557(14929) == -2;
                }
            } else {
                this.field4222 = arg2.method2565((byte) -97);
            }
        } else {
            this.field4219 = arg2.method2565((byte) -82);
        }
        if (arg1) {
            method1824(74, (class281) null);
        }
        ++field4220;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method283(boolean arg0, int arg1) {
        ++field4223;
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (!arg0) {
            return null;
        } else {
            if (super.field4734.field425) {
                int[][] var4 = this.method2053(1, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class439.field6099; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (~var12 <= ~this.field4219) {
                        if (var12 <= this.field4222) {
                            var8[var11] = var12;
                        } else {
                            var8[var11] = this.field4222;
                        }
                    } else {
                        var8[var11] = this.field4219;
                    }
                    if (this.field4219 > var13) {
                        var9[var11] = this.field4219;
                    } else if (~var13 < ~this.field4222) {
                        var9[var11] = this.field4222;
                    } else {
                        var9[var11] = var13;
                    }
                    if (var14 >= this.field4219) {
                        if (~var14 < ~this.field4222) {
                            var10[var11] = this.field4222;
                        } else {
                            var10[var11] = var14;
                        }
                    } else {
                        var10[var11] = this.field4219;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class289() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILfm;)V")
    public static final void method1824(int arg0, class281 arg1) {
        ++field4218;
        if (arg1.field4098 != null || arg1.field4125 != null) {
            boolean var2 = true;
            for (int var3 = 0; ~arg1.field4098.length < ~var3; ++var3) {
                int var4 = -1;
                if (arg1.field4098 != null) {
                    var4 = arg1.field4098[var3];
                }
                if (var4 == -1) {
                    if (!arg1.method1793(-1, var3, false)) {
                        var2 = false;
                    }
                } else {
                    var2 = false;
                    boolean var5 = false;
                    boolean var6 = false;
                    int var9;
                    int var10;
                    if ((var4 & -1073741824) != -1073741824) {
                        if ((var4 & 32768) == 0) {
                            class647 var7 = (class647) class486.field6697.method4253((long) var4, -1);
                            if (var7 == null) {
                                arg1.method1793(-1, var3, false);
                                continue;
                            }
                            class506 var8 = var7.field9191;
                            var9 = -var8.field10347 + arg1.field10347;
                            var10 = arg1.field10350 - var8.field10350;
                        } else {
                            int var11 = var4 & 32767;
                            class21 var12 = class588.field8451[var11];
                            if (var12 == null) {
                                arg1.method1793(-1, var3, false);
                                continue;
                            }
                            var10 = -var12.field10350 + arg1.field10350;
                            var9 = -var12.field10347 + arg1.field10347;
                        }
                    } else {
                        int var13 = 268435455 & var4;
                        int var14 = var13 >> 14;
                        var9 = -256 - (-class222.field3266 + var14) * 512 + arg1.field10347;
                        int var15 = var13 & 16383;
                        var10 = -((-class697.field9798 + var15) * 512) - (256 - arg1.field10350);
                    }
                    if (~var9 != -1 || var10 != 0) {
                        arg1.method1793((int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 16383, var3, false);
                    }
                }
            }
            if (arg0 != -8619) {
                field4221 = null;
            }
            if (var2) {
                arg1.field4125 = null;
                arg1.field4098 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field4224;
        int[] var3 = super.field4743.method1027((byte) -83, arg0);
        if (arg1 != -22563988) {
            this.field4222 = -119;
        }
        if (super.field4743.field1993) {
            int[] var4 = this.method2052(0, 0, arg0);
            for (int var5 = 0; class439.field6099 > var5; ++var5) {
                int var6 = var4[var5];
                if (this.field4219 > var6) {
                    var3[var5] = this.field4219;
                } else if (this.field4222 < var6) {
                    var3[var5] = this.field4222;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(III)Z")
    public static final boolean method1825(int arg0, int arg1, int arg2) {
        ++field4226;
        if (arg2 >= -30) {
            return true;
        } else {
            return (34 & arg0) != 0;
        }
    }
}
