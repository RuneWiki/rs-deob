import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class144 extends class82 {

    @OriginalMember(owner = "client!wq", name = "T", descriptor = "I")
    private int field1740 = 0;

    @OriginalMember(owner = "client!wq", name = "V", descriptor = "I")
    private int field1742 = 0;

    @OriginalMember(owner = "client!wq", name = "Q", descriptor = "I")
    private int field1737 = 0;

    @OriginalMember(owner = "client!wq", name = "L", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!wq", name = "M", descriptor = "I")
    private int field1733;

    @OriginalMember(owner = "client!wq", name = "N", descriptor = "I")
    private int field1734;

    @OriginalMember(owner = "client!wq", name = "O", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!wq", name = "P", descriptor = "I")
    private int field1736;

    @OriginalMember(owner = "client!wq", name = "R", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!wq", name = "S", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!wq", name = "U", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!wq", name = "W", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!wq", name = "X", descriptor = "I")
    private int field1744;

    @OriginalMember(owner = "client!wq", name = "Y", descriptor = "I")
    private int field1745;

    @OriginalMember(owner = "client!wq", name = "Z", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!wq", name = "ab", descriptor = "I")
    public static int field1747;

    static {
        new class180("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(II)[[I", line = 3)
    public final int[][] method481(int arg0, int arg1) {
        ++field1747;
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (super.field992.field7962) {
            int[][] var4 = this.method488(0, arg1, arg0 ^ 1001);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class629.field9033; ++var11) {
                this.method796(var5[var11], var7[var11], arg0 + -1071, var6[var11]);
                this.field1744 += this.field1737;
                this.field1736 += this.field1740;
                this.field1745 += this.field1742;
                while (this.field1736 < 0) {
                    this.field1736 += 4096;
                }
                while (~this.field1736 < -4097) {
                    this.field1736 -= 4096;
                }
                if (~this.field1745 > -1) {
                    this.field1745 = 0;
                }
                if (this.field1744 < 0) {
                    this.field1744 = 0;
                }
                if (this.field1745 > 4096) {
                    this.field1745 = 4096;
                }
                if (this.field1744 > 4096) {
                    this.field1744 = 4096;
                }
                this.method795(this.field1744, this.field1736, this.field1745, -1822);
                var8[var11] = this.field1734;
                var9[var11] = this.field1738;
                var10[var11] = this.field1733;
            }
        }
        if (arg0 != 1000) {
            this.field1745 = -108;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "(I)V", line = 73)
    public static final void method793(int arg0) {
        ++field1746;
        if (class306.field3898) {
            class306.field3898 = false;
            class442.field6107 = null;
            class590.field8548 = null;
            if (arg0 != -1298951220) {
                field1735 = -97;
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZI[B)V", line = 91)
    public static final void method794(boolean arg0, int arg1, byte[] arg2) {
        if (class177.field2146 == null) {
            class177.field2146 = new class374(20000);
        }
        ++field1732;
        class177.field2146.method2096(-53, 0, arg2.length, arg2);
        if (arg0) {
            class308.method1702(false, class177.field2146.field4929);
            class544.field7971 = new class29[class415.field5392];
            int var3 = 0;
            for (int var4 = class90.field1119; var4 <= class204.field2443; ++var4) {
                class29 var5 = class303.method1675((byte) 78, var4);
                if (var5 != null) {
                    class544.field7971[var3++] = var5;
                }
            }
            class620.field8959 = false;
            class547.field8050 = class190.method1030(false);
            class177.field2146 = null;
        }
        if (arg1 != -4813) {
            method794(true, 108, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIII)V", line = 133)
    private final void method795(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1822) {
            this.field1733 = 63;
        }
        ++field1741;
        int var5 = ~arg0 >= -2049 ? (4096 - -arg2) * arg0 >> 12 : arg0 - -arg2 + -(arg0 * arg2 >> 12);
        if (~var5 < -1) {
            int var6 = arg1 * 6;
            int var7 = -var5 + arg0 + arg0;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (~var9 == -1) {
                this.field1738 = var14;
                this.field1734 = var5;
                this.field1733 = var7;
                return;
            }
            if (var9 == 1) {
                this.field1734 = var15;
                this.field1733 = var7;
                this.field1738 = var5;
                return;
            }
            if (var9 == 2) {
                this.field1738 = var5;
                this.field1733 = var14;
                this.field1734 = var7;
                return;
            }
            if (var9 == 3) {
                this.field1734 = var7;
                this.field1733 = var5;
                this.field1738 = var15;
                return;
            }
            if (~var9 == -5) {
                this.field1733 = var5;
                this.field1738 = var7;
                this.field1734 = var14;
                return;
            }
            if (var9 == 5) {
                this.field1738 = var7;
                this.field1734 = var5;
                this.field1733 = var15;
                return;
            }
        } else {
            this.field1734 = this.field1738 = this.field1733 = arg0;
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V", line = 246)
    public class144() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(IIII)V", line = 251)
    private final void method796(int arg0, int arg1, int arg2, int arg3) {
        ++field1739;
        int var5 = arg0 > arg3 ? arg0 : arg3;
        int var6 = arg0 >= arg3 ? arg3 : arg0;
        int var7 = var5 >= arg1 ? var5 : arg1;
        int var8 = ~arg1 <= ~var6 ? var6 : arg1;
        if (arg2 >= -53) {
            this.method796(-12, 22, -124, 48);
        }
        int var9 = -var8 + var7;
        this.field1744 = (var7 + var8) / 2;
        if (~this.field1744 < -1 && ~this.field1744 > -4097) {
            this.field1745 = (var9 << 12) / (this.field1744 > 2048 ? -(this.field1744 * 2) + 8192 : this.field1744 * 2);
        } else {
            this.field1745 = 0;
        }
        if (~var9 >= -1) {
            this.field1736 = 0;
        } else {
            int var10 = (var7 - arg0 << 12) / var9;
            int var11 = (var7 - arg3 << 12) / var9;
            int var12 = (var7 - arg1 << 12) / var9;
            if (~arg0 != ~var7) {
                if (arg3 == var7) {
                    this.field1736 = ~arg1 != ~var8 ? -var12 + 12288 : var10 + 4096;
                } else {
                    this.field1736 = ~arg0 != ~var8 ? -var10 + 20480 : 12288 - -var11;
                }
            } else {
                this.field1736 = ~arg3 == ~var8 ? var12 + 20480 : -var11 + 4096;
            }
            this.field1736 /= 6;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILos;)V", line = 313)
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field1743;
        int var4 = 44 / ((arg1 - -69) / 42);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field1737 = (arg2.method2124(-126) << 12) / 100;
                }
            } else {
                this.field1742 = (arg2.method2124(-124) << 12) / 100;
            }
        } else {
            this.field1740 = arg2.method2089(true);
        }
    }
}
