import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class203 {

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    private int field3672 = 128;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Z")
    public boolean field3679 = false;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    private int field3681 = 0;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    private int field3682 = 128;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    private int field3673 = 0;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public int field3688 = -1;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    private int field3693 = 0;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field3677 = -1;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lke;")
    private static class256 field3674 = class316.method2202("wishes to trade with you)3", 27626);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field3668 = -1;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "[I")
    public static int[] field3686 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lke;")
    public static class256 field3685 = field3674;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Lke;")
    private static class256 field3690 = class316.method2202("Loading textures )2 ", 27626);

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Lke;")
    public static class256 field3687 = class316.method2202(")4a=", 27626);

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lke;")
    public static class256 field3669 = field3690;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public int field3683;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    private int field3691;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[S")
    private short[] field3671;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[S")
    private short[] field3675;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "[S")
    private short[] field3689;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "[S")
    private short[] field3692;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Lha;", line = 7)
    public final class26 method1440(int arg0, byte arg1) {
        field3684++;
        class26 var3 = (class26) class36.field642.method2077(arg1 - 13419, (long) this.field3683);
        if (var3 == null) {
            class315 var4 = class315.method2191(class213.field3809, this.field3691, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3692 != null) {
                for (int var5 = 0; var5 < this.field3692.length; var5++) {
                    var4.method2175(this.field3692[var5], this.field3675[var5]);
                }
            }
            if (this.field3671 != null) {
                for (int var6 = 0; var6 < this.field3671.length; var6++) {
                    var4.method2193(this.field3671[var6], this.field3689[var6]);
                }
            }
            var3 = var4.method2195(this.field3693 + 64, this.field3681 + 850, -30, -50, -30);
            class36.field642.method2074(var3, (long) this.field3683, -1);
        }
        class26 var7;
        if (this.field3688 == -1 || arg0 == -1) {
            var7 = var3.method175(true, true);
        } else {
            var7 = class250.method1682(this.field3688, true).method797(var3, arg0, (byte) 39);
        }
        if (this.field3682 != 128 || this.field3672 != 128) {
            var7.method170(this.field3682, this.field3672, this.field3682);
        }
        if (arg1 != 11) {
            method1445((byte) 17);
        }
        if (this.field3673 != 0) {
            if (this.field3673 == 90) {
                var7.method163();
            }
            if (this.field3673 == 180) {
                var7.method176();
            }
            if (this.field3673 == 270) {
                var7.method174();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lra;I)V", line = 86)
    public final void method1441(class41 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method357(false);
            if (var3 == 0) {
                field3670++;
                if (arg1 != 0) {
                    field3668 = 14;
                }
                return;
            }
            this.method1443(26405, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjk;IIIIIII)V", line = 106)
    public static final void method1442(int arg0, class273 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg2 & 0x3;
        field3676++;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg1.field4711;
            var11 = arg1.field4662;
        } else {
            var10 = arg1.field4662;
            var11 = arg1.field4711;
        }
        int var12;
        int var13;
        if ((arg6 + var11) <= 104) {
            var12 = (var11 + 1 >> 1) + arg6;
            var13 = (var11 >> 1) + arg6;
        } else {
            var13 = arg6;
            var12 = arg6 + 1;
        }
        int var14 = 8 % ((-arg4 - 30) / 61);
        int var15;
        int var16;
        if ((arg7 + var10) > 104) {
            var15 = arg7 + 1;
            var16 = arg7;
        } else {
            var16 = (var10 >> 1) + arg7;
            var15 = (var10 + 1 >> 1) + arg7;
        }
        int var17 = (arg7 << 7) + (var10 << 6);
        int[][] var18 = class118.field2090[arg8];
        int var19 = var18[var15][var13] + var18[var16][var12] + var18[var16][var13] + var18[var15][var12] >> 2;
        int var20 = (arg6 << 7) + (var11 << 6);
        int var21 = 0;
        if (arg8 != 0) {
            int[][] var22 = class118.field2090[0];
            var21 = var19 - (var22[var15][var13] + var22[var16][var13] + var22[var16][var12] + var22[var15][var12] >> 2);
        }
        int[][] var23 = (int[][]) null;
        if (arg8 < 3) {
            var23 = class118.field2090[arg8 + 1];
        }
        class196 var24 = arg1.method1882(false, true, (class232) null, var23, var20, var17, false, var19, arg3, var18, arg2);
        class123.method847(var24.field3595, var17 - arg0, var21, var20 - arg5);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILra;)V", line = 186)
    private final void method1443(int arg0, int arg1, class41 arg2) {
        if (arg0 != 26405) {
            method1444(120, 44);
        }
        field3680++;
        if (arg1 == 1) {
            this.field3691 = arg2.method346(-16);
        } else if (arg1 == 2) {
            this.field3688 = arg2.method346(-16);
        } else if (arg1 == 4) {
            this.field3682 = arg2.method346(arg0 ^ 0xFFFF98D5);
        } else if (arg1 == 5) {
            this.field3672 = arg2.method346(-16);
        } else if (arg1 == 6) {
            this.field3673 = arg2.method346(-16);
        } else if (arg1 == 7) {
            this.field3693 = arg2.method357(false);
        } else if (arg1 == 8) {
            this.field3681 = arg2.method357(false);
        } else if (arg1 == 9) {
            this.field3679 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method357(false);
            this.field3692 = new short[var4];
            this.field3675 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3692[var5] = (short) arg2.method346(-16);
                this.field3675[var5] = (short) arg2.method346(arg0 - 26421);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method357(false);
            this.field3671 = new short[var6];
            this.field3689 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3671[var7] = (short) arg2.method346(-16);
                this.field3689[var7] = (short) arg2.method346(-16);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I", line = 304)
    public static final int method1444(int arg0, int arg1) {
        int var2 = -84 % ((arg0 + 61) / 41);
        field3678++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 314)
    public static void method1445(byte arg0) {
        field3687 = null;
        field3686 = null;
        if (arg0 != -80) {
            method1442(-115, (class273) null, -33, -40, 117, 97, 119, 46, 18);
        }
        field3685 = null;
        field3690 = null;
        field3674 = null;
        field3669 = null;
    }
}
