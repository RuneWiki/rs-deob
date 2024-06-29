import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class123 {

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "J")
    public static long field1685 = 0L;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "[I")
    public static int[] field1688;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "Z")
    public static boolean field1689;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "Lvh;")
    public static class240 field1686;

    static {
        new class83("Select", "Auswählen", "Sélectionner", "Selecionar");
        field1688 = new int[] { 28, 35, 40, 44 };
        field1689 = false;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V", line = 5)
    public static void method810(byte arg0) {
        field1688 = null;
        field1686 = null;
        if (arg0 != 81) {
            field1686 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V", line = 16)
    public final void method811(byte arg0) {
        if (arg0 >= -15) {
            this.method813(-46, 3);
        }
        field1683++;
        this.field1677 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIILss;)V", line = 29)
    public static final void method812(int arg0, int arg1, int arg2, class295 arg3) {
        field1684++;
        class239.field3278 = arg0;
        class290.field3895 = arg2;
        if (arg1 == 0) {
            class492.field7281 = arg3;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V", line = 44)
    public final void method813(int arg0, int arg1) {
        this.field1677 = arg0;
        field1678++;
        this.field1681 = 0;
        if (arg1 > -113) {
            this.field1681 = -13;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V", line = 57)
    public static final void method814(int arg0) {
        class374.field5239.method67(-126);
        field1690++;
        if (arg0 > -47) {
            field1685 = -110L;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIII)Z", line = 68)
    public final boolean method815(int arg0, int arg1, int arg2, int arg3) {
        field1682++;
        int var5 = this.field1681;
        if (this.field1677 == arg2 && this.field1681 == 0) {
            return false;
        }
        if (arg0 != 0) {
            this.method811((byte) -38);
        }
        boolean var6;
        if (this.field1681 == 0) {
            if (arg2 > this.field1677 && arg2 <= (this.field1677 + arg3) || this.field1677 > arg2 && (this.field1677 - arg3) <= arg2) {
                this.field1677 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field1681 > 0 && this.field1677 < arg2) {
            int var7 = this.field1681 * this.field1681 / (arg3 * 2);
            int var8 = this.field1677 + var7;
            if (arg2 > var8 && var8 >= this.field1677) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field1681 < 0 && this.field1677 > arg2) {
            int var9 = this.field1681 * this.field1681 / (arg3 * 2);
            int var10 = this.field1677 - var9;
            if (arg2 < var10 && var10 <= this.field1677) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field1677 < arg2) {
                this.field1681 += arg3;
                if (arg1 != 0 && arg1 < this.field1681) {
                    this.field1681 = arg1;
                }
            } else {
                this.field1681 -= arg3;
                if (arg1 != 0 && this.field1681 < -arg1) {
                    this.field1681 = -arg1;
                }
            }
            if (this.field1681 != var5) {
                int var11 = this.field1681 * this.field1681 / (arg3 * 2);
                if (arg2 <= this.field1677) {
                    if (this.field1677 > arg2 && arg2 > this.field1677 - var11) {
                        this.field1681 = var5;
                    }
                } else if (arg2 < this.field1677 + var11) {
                    this.field1681 = var5;
                }
            }
        } else if (this.field1681 <= 0) {
            this.field1681 += arg3;
            if (this.field1681 > 0) {
                this.field1681 = 0;
            }
        } else {
            this.field1681 -= arg3;
            if (this.field1681 < 0) {
                this.field1681 = 0;
            }
        }
        this.field1677 += this.field1681 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I", line = 212)
    public final int method816(int arg0) {
        if (arg0 < 69) {
            return -82;
        } else {
            field1679++;
            return this.field1677 & 0x3FFF;
        }
    }
}
