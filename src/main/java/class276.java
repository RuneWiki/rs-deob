import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class276 extends class96 {

    @OriginalMember(owner = "client!vt", name = "O", descriptor = "I")
    private int field3528 = 4096;

    @OriginalMember(owner = "client!vt", name = "K", descriptor = "I")
    private int field3524 = 16;

    @OriginalMember(owner = "client!vt", name = "P", descriptor = "I")
    private int field3529 = 2000;

    @OriginalMember(owner = "client!vt", name = "S", descriptor = "I")
    private int field3532 = 0;

    @OriginalMember(owner = "client!vt", name = "Z", descriptor = "I")
    private int field3539 = 0;

    @OriginalMember(owner = "client!vt", name = "N", descriptor = "Lgt;")
    public static class65 field3527 = new class65("runescape", 0);

    @OriginalMember(owner = "client!vt", name = "T", descriptor = "I")
    public static int field3533 = 0;

    @OriginalMember(owner = "client!vt", name = "Y", descriptor = "[Ljava/lang/String;")
    public static String[] field3538 = new String[200];

    @OriginalMember(owner = "client!vt", name = "L", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!vt", name = "M", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!vt", name = "Q", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!vt", name = "R", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!vt", name = "U", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!vt", name = "V", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!vt", name = "W", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!vt", name = "X", descriptor = "[I")
    public static int[] field3537;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(Z)V", line = 5)
    public static void method1697(boolean arg0) {
        field3537 = null;
        field3527 = null;
        field3538 = null;
        if (arg0) {
            method1698((byte) 15);
        }
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(B)Ljava/lang/String;", line = 17)
    public static final String method1698(byte arg0) {
        ++field3536;
        String var1 = "www";
        if (class282.field3603 != class222.field2867) {
            if (class524.field7764 != class222.field2867) {
                if (class222.field2867 == class203.field2656) {
                    var1 = "www-wtwip";
                }
            } else {
                var1 = "www-wtqa";
            }
        } else {
            var1 = "www-wtrc";
        }
        String var2 = "";
        if (arg0 != -85) {
            method1698((byte) -94);
        }
        if (class297.field3851 != null) {
            var2 = "/p=" + class297.field3851;
        }
        return "http://" + var1 + "." + class494.field7234.field825 + ".com/l=" + class379.field4920 + "/a=" + class326.field4189 + var2 + "/";
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)V", line = 48)
    public final void method390(int arg0) {
        if (arg0 < 15) {
            method1699((int[]) null, 85, -126, true, 97, (class463) null);
        }
        class18.method112(-86);
        ++field3535;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(II)[I", line = 65)
    public final int[] method37(int arg0, int arg1) {
        ++field3534;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (arg1 != 255) {
            field3538 = null;
        }
        if (super.field1331.field863) {
            int var4 = this.field3528 >> 1;
            int[][] var5 = super.field1331.method398(12054);
            Random var6 = new Random((long) this.field3539);
            for (int var7 = 0; this.field3529 > var7; ++var7) {
                int var8 = this.field3528 <= 0 ? this.field3532 : this.field3532 + class179.method1160(Integer.MIN_VALUE, var6, this.field3528) - var4;
                int var9 = (var8 & 4080) >> 4;
                int var10 = class179.method1160(Integer.MIN_VALUE, var6, class269.field3403);
                int var11 = class179.method1160(Integer.MIN_VALUE, var6, class477.field6965);
                int var12 = (class234.field3041[var9] * this.field3524 >> 12) + var10;
                int var13 = var11 - -(class40.field587[var9] * this.field3524 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class179.method1160(Integer.MIN_VALUE, var6, 4096) >> 2) + 1024;
                    int var27 = var13 > var11 ? 1 : -1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = (var28 - var10) * var25 + var26 - -1024;
                        int var30 = var28 & class292.field3781;
                        int var31 = class380.field4948 & var21;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (var24 > 0) {
                            var21 -= -var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "([IIIZILgk;)Lcw;", line = 202)
    public static final class386 method1699(int[] arg0, int arg1, int arg2, boolean arg3, int arg4, class463 arg5) {
        if (arg2 != -13) {
            return null;
        } else {
            ++field3531;
            if (!arg5.field6817 && (!class158.method1064(arg1, (byte) -63) || !class158.method1064(arg4, (byte) -119))) {
                return arg5.field6833 ? new class386(arg5, 34037, arg1, arg4, arg3, arg0) : new class386(arg5, arg1, arg4, class124.method788(arg1, arg2 ^ 119), class124.method788(arg4, -117), arg0);
            } else {
                return new class386(arg5, 3553, arg1, arg4, arg3, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(ZI)Z", line = 221)
    public static final boolean method1700(boolean arg0, int arg1) {
        ++field3530;
        if (arg0) {
            field3538 = null;
        }
        return ~arg1 <= -13 && ~arg1 >= -18;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V", line = 232)
    public class276() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IILbt;)V", line = 246)
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field3526;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field3528 = arg2.method568((byte) 110);
                        }
                    } else {
                        this.field3532 = arg2.method568((byte) 110);
                    }
                } else {
                    this.field3524 = arg2.method617(arg1 ^ -3);
                }
            } else {
                this.field3529 = arg2.method568((byte) 110);
            }
        } else {
            this.field3539 = arg2.method617(2);
        }
        if (arg1 != -1) {
            field3533 = -61;
        }
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(III)Z", line = 309)
    public static final boolean method1701(int arg0, int arg1, int arg2) {
        ++field3525;
        if (arg2 != -1) {
            field3527 = null;
        }
        return ~(arg1 & 65536) != -1;
    }
}
