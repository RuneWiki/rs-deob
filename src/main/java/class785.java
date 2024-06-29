import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class785 extends class617 {

    @OriginalMember(owner = "client!nca", name = "C", descriptor = "I")
    private int field10775 = 0;

    @OriginalMember(owner = "client!nca", name = "X", descriptor = "I")
    public int field10788 = -1;

    @OriginalMember(owner = "client!nca", name = "Q", descriptor = "I")
    public int field10781 = -1;

    @OriginalMember(owner = "client!nca", name = "S", descriptor = "Z")
    private boolean field10783 = false;

    @OriginalMember(owner = "client!nca", name = "eb", descriptor = "I")
    public int field10795 = 0;

    @OriginalMember(owner = "client!nca", name = "gb", descriptor = "Lbu;")
    public static class21 field10797 = new class21(116, 16);

    @OriginalMember(owner = "client!nca", name = "cb", descriptor = "F")
    public static float field10793;

    @OriginalMember(owner = "client!nca", name = "A", descriptor = "I")
    public static int field10774;

    @OriginalMember(owner = "client!nca", name = "E", descriptor = "I")
    public int field10776;

    @OriginalMember(owner = "client!nca", name = "I", descriptor = "I")
    public int field10778;

    @OriginalMember(owner = "client!nca", name = "O", descriptor = "I")
    public int field10779;

    @OriginalMember(owner = "client!nca", name = "P", descriptor = "I")
    public static int field10780;

    @OriginalMember(owner = "client!nca", name = "R", descriptor = "I")
    public static int field10782;

    @OriginalMember(owner = "client!nca", name = "T", descriptor = "I")
    public static int field10784;

    @OriginalMember(owner = "client!nca", name = "U", descriptor = "I")
    public static int field10785;

    @OriginalMember(owner = "client!nca", name = "V", descriptor = "I")
    public static int field10786;

    @OriginalMember(owner = "client!nca", name = "W", descriptor = "I")
    public static int field10787;

    @OriginalMember(owner = "client!nca", name = "Y", descriptor = "I")
    public static int field10789;

    @OriginalMember(owner = "client!nca", name = "Z", descriptor = "I")
    public int field10790;

    @OriginalMember(owner = "client!nca", name = "ab", descriptor = "I")
    public static int field10791;

    @OriginalMember(owner = "client!nca", name = "bb", descriptor = "I")
    public static int field10792;

    @OriginalMember(owner = "client!nca", name = "db", descriptor = "I")
    public static int field10794;

    @OriginalMember(owner = "client!nca", name = "fb", descriptor = "I")
    public static int field10796;

    @OriginalMember(owner = "client!nca", name = "G", descriptor = "Lrf;")
    public static class90 field10777;

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(IIIII)V")
    public class785(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "(Z)Z")
    public final boolean method909(boolean arg0) {
        ++field10785;
        if (arg0) {
            this.field10783 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(Lha;I)Lrn;")
    public final class281 method901(class65 arg0, int arg1) {
        ++field10780;
        if (arg1 <= 50) {
            field10777 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "(I)Z")
    public final boolean method906(int arg0) {
        int var2 = 120 % ((11 - arg0) / 35);
        ++field10792;
        return this.field10783;
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)V")
    public static void method4303(int arg0) {
        field10797 = null;
        if (arg0 != 2) {
            method4304((byte) -80, -2);
        }
        field10777 = null;
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(ILha;)V")
    public final void method912(int arg0, class65 arg1) {
        if (arg0 < 52) {
            this.field10779 = 102;
        }
        ++field10791;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(BI)Ljba;")
    public static final class418 method4304(byte arg0, int arg1) {
        ++field10784;
        if (~arg1 <= -1 && arg1 < 100) {
            return arg0 >= -35 ? null : class147.field2133[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "(I)I")
    public final int method917(int arg0) {
        if (arg0 != -1760267218) {
            this.field10778 = -46;
        }
        ++field10787;
        return this.field10775;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method902(int arg0, int arg1, int arg2, class65 arg3) {
        ++field10774;
        if (arg1 != -17458) {
            return true;
        } else {
            class326 var5 = arg3.method514();
            var5.method1869(super.field5742, super.field5741 + -10, super.field5746);
            class689 var6 = class313.field4456.method1681(this.field10779, 88);
            class496 var7 = var6.method3892(-1, (class190) null, (class607) null, -5, arg3, 131072, 0, 0, this.field10790);
            if (var7 != null && (!class576.field8120 ? var7.method95(arg0, arg2, var5, true, var6.field9632) : var7.method77(arg0, arg2, var5, true, var6.field9632, class740.field10205))) {
                return true;
            } else {
                if (this.field10781 != -1) {
                    class689 var8 = class313.field4456.method1681(this.field10781, 90);
                    class496 var9 = var8.method3892(-1, (class190) null, (class607) null, -5, arg3, 131072, 0, 0, this.field10776);
                    if (var9 != null && (class576.field8120 ? var9.method77(arg0, arg2, var5, true, var8.field9632, class740.field10205) : var9.method95(arg0, arg2, var5, true, var8.field9632))) {
                        return true;
                    }
                }
                if (~this.field10788 != 0) {
                    class689 var10 = class313.field4456.method1681(this.field10788, 118);
                    class496 var11 = var10.method3892(-1, (class190) null, (class607) null, arg1 + 17453, arg3, 131072, 0, 0, this.field10778);
                    if (var11 != null && (class576.field8120 ? var11.method77(arg0, arg2, var5, true, var10.field9632, class740.field10205) : var11.method95(arg0, arg2, var5, true, var10.field9632))) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "(B)I")
    public final int method2546(byte arg0) {
        ++field10796;
        class689 var2 = class313.field4456.method1681(this.field10779, 126);
        int var3 = 117 % ((arg0 - -27) / 42);
        int var4 = var2.field9632;
        if (~this.field10781 != 0) {
            class689 var5 = class313.field4456.method1681(this.field10781, 83);
            if (var4 < var5.field9632) {
                var4 = var5.field9632;
            }
        }
        if (this.field10788 != -1) {
            class689 var6 = class313.field4456.method1681(this.field10788, 116);
            if (~var6.field9632 < ~var4) {
                var4 = var6.field9632;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lha;I)Lmaa;")
    public final class495 method918(class65 arg0, int arg1) {
        ++field10794;
        class48 var3 = class89.method667(super.field5755, super.field5742 >> class645.field9018, super.field5746 >> class645.field9018);
        class399 var4 = class266.method1725(super.field5755, super.field5742 >> class645.field9018, super.field5746 >> class645.field9018);
        int var5 = 0;
        if (var3 != null && var3.field605.field9359) {
            var5 = var3.field605.method916(true);
        }
        if (var4 != null && -var5 < var4.field5479) {
            var5 = -var4.field5479;
        }
        if (~this.field10795 != ~var5) {
            super.field5741 -= this.field10795;
            this.field10795 = var5;
            super.field5741 += var5;
        }
        if (arg1 != -30514) {
            field10797 = null;
        }
        class326 var6 = arg0.method514();
        var6.method1873();
        if (~this.field10795 == -1) {
            boolean var7 = false;
            boolean var8 = false;
            boolean var9 = false;
            class294 var10 = class208.field3219[super.field5749];
            int var11 = this.field10775 << 1;
            int var13 = -var11 / 2;
            int var14 = -var11 / 2;
            int var15 = var10.method1918(super.field5742 + var13, (byte) 127, super.field5746 + var14);
            int var16 = var11 / 2;
            int var17 = -var11 / 2;
            int var18 = var10.method1918(super.field5742 + var16, (byte) 126, super.field5746 + var17);
            int var19 = -var11 / 2;
            int var20 = var11 / 2;
            int var21 = var10.method1918(super.field5742 + var19, (byte) 126, super.field5746 + var20);
            int var22 = var11 / 2;
            int var23 = var11 / 2;
            int var24 = var10.method1918(super.field5742 + var22, (byte) 126, super.field5746 + var23);
            int var25 = var15 < var18 ? var15 : var18;
            int var26 = var24 > var21 ? var21 : var24;
            int var27 = var24 <= var18 ? var24 : var18;
            int var28 = var15 >= var21 ? var21 : var15;
            if (~var11 != -1) {
                int var29 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (-var26 + var25), (double) var11));
                if (var29 != 0) {
                    var6.method1877(var29);
                }
            }
            if (~var11 != -1) {
                int var30 = (int) (Math.atan2((double) (-var27 + var28), (double) var11) * 2607.5945876176133D) & 16383;
                if (var30 != 0) {
                    var6.method1895(-var30);
                }
            }
            int var31 = var15 + var24;
            if (var31 > var18 + var21) {
                var31 = var18 - -var21;
            }
            int var32 = (var31 >> 1) + -super.field5741;
            if (~var32 != -1) {
                var6.method1878(0, var32, 0);
            }
        }
        var6.method1878(super.field5742, super.field5741 + -10, super.field5746);
        class495 var33 = class86.method652(true, 0, 3);
        this.field10775 = 0;
        this.field10783 = false;
        if (~this.field10788 != 0) {
            class496 var34 = class313.field4456.method1681(this.field10788, arg1 + 30628).method3892(-1, (class190) null, (class607) null, arg1 ^ 30517, arg0, 2048, 0, 0, this.field10778);
            if (var34 != null) {
                if (!class576.field8120) {
                    var34.method88(var6, var33.field7067[2], 0);
                } else {
                    var34.method106(var6, var33.field7067[2], class740.field10205, 0);
                }
                this.field10783 |= var34.method121();
                this.field10775 = var34.method75();
            }
        }
        if (~this.field10781 != 0) {
            class496 var35 = class313.field4456.method1681(this.field10781, 120).method3892(-1, (class190) null, (class607) null, -5, arg0, 2048, 0, 0, this.field10776);
            if (var35 != null) {
                if (!class576.field8120) {
                    var35.method88(var6, var33.field7067[1], 0);
                } else {
                    var35.method106(var6, var33.field7067[1], class740.field10205, 0);
                }
                this.field10783 |= var35.method121();
                if (~var35.method75() < ~this.field10775) {
                    this.field10775 = var35.method75();
                }
            }
        }
        class496 var36 = class313.field4456.method1681(this.field10779, 119).method3892(-1, (class190) null, (class607) null, -5, arg0, 2048, 0, 0, this.field10790);
        if (var36 != null) {
            if (!class576.field8120) {
                var36.method88(var6, var33.field7067[0], 0);
            } else {
                var36.method106(var6, var33.field7067[0], class740.field10205, 0);
            }
            this.field10783 |= var36.method121();
            if (~var36.method75() < ~this.field10775) {
                this.field10775 = var36.method75();
            }
        }
        return var33;
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(Z)I")
    public final int method916(boolean arg0) {
        ++field10789;
        if (!arg0) {
            method4303(31);
        }
        return -10;
    }
}
