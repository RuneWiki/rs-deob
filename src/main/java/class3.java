import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class3 extends class46 {

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "[I")
    private int[] field37 = new int[this.field604];

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "Lkg;")
    public static class223 field33 = null;

    @OriginalMember(owner = "client!ht", name = "E", descriptor = "Ljn;")
    public static class409 field40 = new class409("Hidden", "Versteckt", "Caché", "Oculto");

    @OriginalMember(owner = "client!ht", name = "I", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "client!ht", name = "J", descriptor = "I")
    public static int field45 = 0;

    @OriginalMember(owner = "client!ht", name = "K", descriptor = "I")
    public static int field46 = 0;

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ht", name = "A", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "client!ht", name = "D", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ht", name = "F", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ht", name = "H", descriptor = "Lct;")
    public static class104 field43;

    @OriginalMember(owner = "client!ht", name = "G", descriptor = "[B")
    private byte[] field42;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIII)V", line = 13)
    public static final void method23(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field41;
        int var5 = 0;
        if (arg4 == 255) {
            while (class147.field1996 > var5) {
                Rectangle var6 = class267.field3958[var5];
                if (~(var6.x + var6.width) < ~arg1 && var6.x < arg1 + arg3 && arg0 < var6.y - -var6.height && var6.y < arg0 + arg2) {
                    class344.field5053[var5] = true;
                }
                ++var5;
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZLfp;I[[IB)V", line = 36)
    public static final void method24(boolean arg0, class9 arg1, int arg2, int[][] arg3, byte arg4) {
        ++field32;
        if (arg4 > -43) {
            method23(90, -4, 117, -115, 66);
        }
        for (int var5 = 0; arg2 > var5; ++var5) {
            int[][] var6;
            if (arg3 == null) {
                var6 = null;
            } else {
                var6 = new int[class195.field2745 + 1][class78.field984 - -1];
                for (int var7 = 0; ~class78.field984 <= ~var7; ++var7) {
                    for (int var8 = 0; ~var8 >= ~class195.field2745; ++var8) {
                        var6[var8][var7] = class264.field3910[var5][var8][var7] + -arg3[var8][var7];
                    }
                }
            }
            int var9 = 0;
            int var10 = 0;
            if (!arg0) {
                if (class307.field4535) {
                    var9 |= 2;
                }
                if (class13.field224) {
                    var10 |= 8;
                }
                if (~class213.field3010 != -1) {
                    if (~var5 == -1 || ~class451.field6661 <= -97) {
                        var10 |= 16;
                    }
                    var9 |= 1;
                }
            }
            if (class307.field4535) {
                var10 |= 7;
            }
            class378 var11 = arg1.method92(class195.field2745, class78.field984, class264.field3910[var5], var6, 128, var9, var10);
            class252.method1664(var5, var11);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V", line = 124)
    public final void method25(byte arg0) {
        this.field29 = Math.abs(this.field29);
        if (arg0 == -97) {
            ++field35;
            if (this.field29 >= 4096) {
                this.field29 = 4095;
            }
            this.method30(this.field38++, (byte) (this.field29 >> 4));
            this.field29 = 0;
        }
    }

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)V", line = 140)
    public static void method26(int arg0) {
        if (arg0 != 8) {
            method24(true, (class9) null, 127, (int[][]) null, (byte) -86);
        }
        field40 = null;
        field43 = null;
        field33 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V", line = 152)
    public final void method27(boolean arg0) {
        this.field38 = 0;
        this.field29 = 0;
        if (arg0) {
            method24(false, (class9) null, -81, (int[][]) null, (byte) 68);
        }
        ++field31;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(IIIIIF)V", line = 164)
    public class3(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field604 < ~var7; ++var7) {
            this.field37[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZZ)V", line = 181)
    public static final void method28(boolean arg0, boolean arg1) {
        ++field39;
        int[] var2 = null;
        byte var3;
        byte[][] var4;
        if (arg0) {
            var3 = 1;
            var4 = class215.field3066;
        } else {
            var3 = 4;
            var4 = class24.field336;
        }
        int var5 = 0;
        if (!arg1) {
            field40 = null;
        }
        while (var3 > var5) {
            class60.method457(14597);
            for (int var6 = 0; var6 < class195.field2745 >> 3; ++var6) {
                for (int var7 = 0; ~var7 > ~(class78.field984 >> 3); ++var7) {
                    boolean var8 = false;
                    int var9 = class75.field960[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = 3 & var9 >> 24;
                        if (!arg0 || var10 == 0) {
                            int var11 = (7 & var9) >> 1;
                            int var12 = (var9 & 16764478) >> 14;
                            int var13 = (var9 & 16380) >> 3;
                            int var14 = (var12 / 8 << 8) - -(var13 / 8);
                            for (int var15 = 0; ~class356.field5174.length < ~var15; ++var15) {
                                if (class356.field5174[var15] == var14 && var4[var15] != null) {
                                    int[] var16 = class113.method798(var7 * 8, var10, class382.field5610, class74.field942, var5, arg0, 0, var11, var4[var15], var13, var6 * 8, var12);
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class26.method272(var6 * 8, (byte) -68, 8, var5, var7 * 8, 8);
                    }
                }
            }
            ++var5;
        }
        if (var2 != null) {
            class187.field2613 = class308.method2054(var2[3], false, var2[1], var2[2], var2[0]);
            class240.field3568 = var2[4];
        } else {
            class187.field2613 = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBI)V", line = 289)
    public final void method29(int arg0, byte arg1, int arg2) {
        if (arg1 <= 105) {
            this.field29 = 19;
        }
        this.field29 += this.field37[arg0] * arg2 >> 12;
        ++field34;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IB)V", line = 304)
    public void method30(int arg0, byte arg1) {
        ++field30;
        this.field42[this.field38++] = (byte) (127 + (class386.method2438(arg1, 255) >> 1));
    }
}
