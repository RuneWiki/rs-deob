import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class387 {

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "F")
    public float field5611 = 0.25F;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "F")
    public float field5614 = 1.0F;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "F")
    public float field5620 = 1.0F;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public int field5604;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "F")
    public float field5605;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "Lwh;")
    public class149 field5610;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public int field5615;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public int field5618;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public int field5617;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public int field5607;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "F")
    public float field5613;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public int field5609;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "F")
    public float field5616;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Lej;")
    public static class124 field5608 = new class124(26, 7);

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5623 = new Rectangle[100];

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "F")
    public static float field5624;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "[I")
    public static int[] field5621;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIII)Z", line = 9)
    public static final boolean method2439(int arg0, int arg1, int arg2, int arg3) {
        field5619++;
        class528.field7304.method770(arg2, arg0, arg1, class705.field9567);
        int var4 = class705.field9567[2];
        if (var4 < 50) {
            return false;
        }
        class705.field9567[2] = var4;
        class705.field9567[0] = class705.field9567[0] * class205.field2958 / var4 + class239.field3495;
        class705.field9567[1] = class705.field9567[1] * class492.field6809 / var4 + class665.field9084;
        if (arg3 != -7596) {
            field5623 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILcea;)V", line = 30)
    public final void method2440(int arg0, class215 arg1) {
        field5622++;
        this.field5614 = (float) (arg1.method1535(255) * 8) / 255.0F;
        this.field5611 = (float) (arg1.method1535(arg0 + 247) * 8) / 255.0F;
        this.field5620 = (float) (arg0 * arg1.method1535(arg0 + 247)) / 255.0F;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V", line = 285)
    public class387() {
        this.field5604 = -50;
        this.field5605 = 1.2F;
        this.field5610 = class454.field6406;
        this.field5615 = 0;
        this.field5618 = class521.field7238;
        this.field5617 = -60;
        this.field5607 = -50;
        this.field5613 = 0.69921875F;
        this.field5609 = class521.field7233;
        this.field5616 = 1.1523438F;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lcea;)V", line = 302)
    public class387(class215 arg0) {
        int var2 = arg0.method1535(255);
        if (class693.field9368.field4427.method3195(-32350) == 1 && class112.field1938.method318() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field5609 = class521.field7233;
            } else {
                this.field5609 = arg0.method1533((byte) -126);
            }
            if ((var2 & 0x2) == 0) {
                this.field5616 = 1.1523438F;
            } else {
                this.field5616 = (float) arg0.method1478(842397944) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field5613 = 0.69921875F;
            } else {
                this.field5613 = (float) arg0.method1478(842397944) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field5605 = 1.2F;
            } else {
                this.field5605 = (float) arg0.method1478(842397944) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1533((byte) -126);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1478(842397944);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1478(842397944);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1478(842397944);
            }
            this.field5609 = class521.field7233;
            this.field5616 = 1.1523438F;
            this.field5613 = 0.69921875F;
            this.field5605 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field5617 = -60;
            this.field5604 = -50;
            this.field5607 = -50;
        } else {
            this.field5607 = arg0.method1520(13638);
            this.field5617 = arg0.method1520(13638);
            this.field5604 = arg0.method1520(13638);
        }
        if ((var2 & 0x20) == 0) {
            this.field5618 = class521.field7238;
        } else {
            this.field5618 = arg0.method1533((byte) -126);
        }
        if ((var2 & 0x40) == 0) {
            this.field5615 = 0;
        } else {
            this.field5615 = arg0.method1478(842397944);
        }
        if ((var2 & 0x80) == 0) {
            this.field5610 = class454.field6406;
        } else {
            int var3 = arg0.method1478(842397944);
            int var4 = arg0.method1478(842397944);
            int var5 = arg0.method1478(842397944);
            int var6 = arg0.method1478(842397944);
            int var7 = arg0.method1478(842397944);
            int var8 = arg0.method1478(842397944);
            this.field5610 = class460.method2726(var7, var6, var3, var8, var4, -1, var5);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lbp;B)Z", line = 63)
    public final boolean method2441(class387 arg0, byte arg1) {
        field5612++;
        if (arg1 == 84) {
            return this.field5609 == arg0.field5609 && this.field5616 == arg0.field5616 && this.field5613 == arg0.field5613 && this.field5605 == arg0.field5605 && this.field5611 == arg0.field5611 && this.field5614 == arg0.field5614 && this.field5620 == arg0.field5620 && this.field5618 == arg0.field5618 && this.field5615 == arg0.field5615 && this.field5610 == arg0.field5610;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLii;Llga;ILha;I)Z", line = 78)
    public static final boolean method2442(byte arg0, class553 arg1, class710 arg2, int arg3, class59 arg4, int arg5) {
        field5606++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field7636 != null) {
            var7 = (class489.field6798 - class489.field6794) * (arg1.field7640 + arg2.field9634 - class489.field6796) / (class489.field6787 - class489.field6796) + class489.field6794;
            var8 = class489.field6790 - ((arg2.field9633 + arg1.field7615 - class489.field6779) * (class489.field6790 - class489.field6784) / (class489.field6799 - class489.field6779));
            var9 = class489.field6790 - ((arg1.field7652 + arg2.field9633 - class489.field6779) * (class489.field6790 - class489.field6784) / (class489.field6799 - class489.field6779));
            var6 = (arg2.field9634 + arg1.field7648 - class489.field6796) * (class489.field6798 - class489.field6794) / (class489.field6787 - class489.field6796) + class489.field6794;
        }
        class496 var10 = null;
        int var11 = 0;
        if (arg0 > -29) {
            field5623 = null;
        }
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg1.field7623 != -1) {
            if (arg2.field9630 && arg1.field7650 != -1) {
                var10 = arg1.method3181(true, arg4, (byte) 127);
            } else {
                var10 = arg1.method3181(false, arg4, (byte) 127);
            }
            if (var10 != null) {
                var11 = arg2.field9635 - (var10.method1618() + 1 >> 1);
                var12 = arg2.field9635 + (var10.method1618() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg2.field9637 - (var10.method1614() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg2.field9637 + (var10.method1614() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class342 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg1.field7642 != null) {
            var15 = class448.method2677(arg1.field7621, 10144);
            if (var15 != null) {
                var16 = class635.field8727.method3394(arg1.field7642, null, class745.field10133, (byte) 87, null);
                int var24 = arg2.field9637 - (class489.field6790 - class489.field6784) * arg1.field7613 / (class489.field6799 - class489.field6779);
                var17 = (class489.field6798 - class489.field6794) * arg1.field7611 / (class489.field6787 - class489.field6796) + arg2.field9635;
                if (var10 == null) {
                    var18 = var24 - var16 * var15.method2157() / 2;
                } else {
                    var18 = var24 - ((var10.method1614() >> 1) + (var16 * var15.method2162()));
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class745.field10133[var25];
                    if (var25 < var16 - 1) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method2161(var26);
                    if (var19 < var27) {
                        var19 = var27;
                    }
                }
                var20 = arg5 + var17 - (var19 / 2);
                var21 = var19 / 2 + arg5 + var17;
                if (var20 < var6) {
                    var6 = var20;
                }
                var22 = arg3 + var18;
                if (var21 > var7) {
                    var7 = var21;
                }
                var23 = arg3 + var18 + var15.method2162() * var16;
                if (var8 > var22) {
                    var8 = var22;
                }
                if (var23 > var9) {
                    var9 = var23;
                }
            }
        }
        if (class489.field6794 > var7 || class489.field6798 < var6 || class489.field6784 > var9 || var8 > class489.field6790) {
            return true;
        }
        class489.method2873(arg4, arg2, arg1);
        if (var10 != null) {
            if (class505.field7035 > 0 && (class443.field6305 != -1 && class443.field6305 == arg2.field9629 || class699.field9460 != -1 && class699.field9460 == arg1.field7641)) {
                int var28;
                if (class723.field9806 <= 50) {
                    var28 = class723.field9806 * 2;
                } else {
                    var28 = 200 - (class723.field9806 * 2);
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg4.method618((byte) -105, var29, var10.method1626() / 2 + 7, arg2.field9635, arg2.field9637);
                arg4.method618((byte) -120, var29, var10.method1626() / 2 + 5, arg2.field9635, arg2.field9637);
                arg4.method618((byte) -126, var29, var10.method1626() / 2 + 3, arg2.field9635, arg2.field9637);
                arg4.method618((byte) -112, var29, var10.method1626() / 2 + 1, arg2.field9635, arg2.field9637);
                arg4.method618((byte) -123, var29, var10.method1626() / 2, arg2.field9635, arg2.field9637);
            }
            var10.method2925(arg2.field9635 - (var10.method1618() >> 1), arg2.field9637 + -(var10.method1614() >> 1));
        }
        if (arg1.field7642 != null && var15 != null) {
            class755.method4213(var15, arg2, var17, 64, var16, arg4, var18, var19, arg1);
        }
        if (arg1.field7623 != -1 || arg1.field7642 != null) {
            class682 var30 = new class682(arg2);
            var30.field9242 = var13;
            var30.field9249 = var22;
            var30.field9243 = var11;
            var30.field9234 = var23;
            var30.field9241 = var20;
            var30.field9231 = var14;
            var30.field9233 = var21;
            var30.field9246 = var12;
            class591.field8075.method1273(var30, -20180);
        }
        return false;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 267)
    public static void method2443(int arg0) {
        field5608 = null;
        field5623 = null;
        field5621 = null;
        if (arg0 != 25165) {
            field5623 = null;
        }
    }
}
