import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class222 extends class694 {

    @OriginalMember(owner = "client!dea", name = "F", descriptor = "I")
    private int field3198 = 2048;

    @OriginalMember(owner = "client!dea", name = "G", descriptor = "I")
    private int field3199 = 2048;

    @OriginalMember(owner = "client!dea", name = "N", descriptor = "I")
    private int field3205 = 12288;

    @OriginalMember(owner = "client!dea", name = "K", descriptor = "I")
    private int field3202 = 8192;

    @OriginalMember(owner = "client!dea", name = "M", descriptor = "I")
    private int field3204 = 4096;

    @OriginalMember(owner = "client!dea", name = "R", descriptor = "I")
    private int field3209 = 0;

    @OriginalMember(owner = "client!dea", name = "T", descriptor = "I")
    private int field3211 = 0;

    @OriginalMember(owner = "client!dea", name = "H", descriptor = "[[F")
    public static float[][] field3200 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!dea", name = "J", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!dea", name = "L", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!dea", name = "O", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!dea", name = "P", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!dea", name = "Q", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!dea", name = "S", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!dea", name = "U", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!dea", name = "V", descriptor = "Z")
    public static boolean field3213;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "(III)Z")
    public static final boolean method1422(int arg0, int arg1, int arg2) {
        if (arg1 > -127) {
            return false;
        } else {
            ++field3201;
            if (arg2 == 11) {
                arg2 = 10;
            }
            class620 var3 = class164.field2499.method2013(arg0, false);
            if (~arg2 <= -6 && ~arg2 >= -9) {
                arg2 = 4;
            }
            return var3.method3446(0, arg2);
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "()V")
    public class222() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "(III)Z")
    private final boolean method1423(int arg0, int arg1, int arg2) {
        ++field3206;
        int var4 = (arg0 - -arg1) * this.field3205 >> 12;
        int var5 = class388.field5445[(1047122 & var4 * 255) >> 12];
        if (arg2 < 90) {
            return true;
        } else {
            int var6 = (var5 << 12) / this.field3205;
            int var7 = (var6 << 12) / this.field3202;
            int var8 = this.field3204 * var7 >> 12;
            return ~var8 < ~(-arg1 + arg0) && -arg1 + arg0 > -var8;
        }
    }

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "(I)V")
    public final void method40(int arg0) {
        if (arg0 > 5) {
            class280.method1698(123);
            ++field3212;
        }
    }

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "(III)Z")
    private final boolean method1424(int arg0, int arg1, int arg2) {
        ++field3208;
        int var4 = (-arg1 + arg2) * this.field3205 >> 12;
        int var5 = class388.field5445[(1047792 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field3205;
        if (arg0 != 801355756) {
            return false;
        } else {
            int var7 = (var6 << 12) / this.field3202;
            int var8 = this.field3204 * var7 >> 12;
            return arg1 + arg2 < var8 && ~(-var8) > ~(arg1 + arg2);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V")
    public static void method1425(byte arg0) {
        field3200 = null;
        if (arg0 != 54) {
            field3213 = false;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field3207;
        int var4 = 63 / ((58 - arg2) / 63);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field3202 = arg1.method743((byte) -63);
                                }
                            } else {
                                this.field3204 = arg1.method743((byte) -19);
                            }
                        } else {
                            this.field3205 = arg1.method743((byte) -52);
                        }
                    } else {
                        this.field3199 = arg1.method743((byte) -22);
                    }
                } else {
                    this.field3209 = arg1.method743((byte) -2);
                }
            } else {
                this.field3211 = arg1.method743((byte) -116);
            }
        } else {
            this.field3198 = arg1.method743((byte) -73);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field3210;
        if (arg0 < 112) {
            return null;
        } else {
            int[] var3 = super.field9751.method2712(arg1, (byte) 118);
            if (super.field9751.field6674) {
                int var4 = class105.field1409[arg1] + -2048;
                for (int var5 = 0; class465.field6544 > var5; ++var5) {
                    int var6 = class346.field4994[var5] + -2048;
                    int var7 = this.field3198 + var6;
                    int var8 = var7 < -2048 ? var7 + 4096 : var7;
                    int var9 = ~var8 < -2049 ? var8 - 4096 : var8;
                    int var10 = var4 - -this.field3211;
                    int var11 = var10 < -2048 ? var10 + 4096 : var10;
                    int var12 = var11 > 2048 ? var11 - 4096 : var11;
                    int var13 = var6 - -this.field3209;
                    int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                    int var15 = ~var14 >= -2049 ? var14 : var14 - 4096;
                    int var16 = this.field3199 + var4;
                    int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                    int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                    var3[var5] = !this.method1424(801355756, var9, var12) && !this.method1423(var18, var15, 116) ? 0 : 4096;
                }
            }
            return var3;
        }
    }
}
