import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class224 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public int field3766 = -1;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    private int field3767 = 0;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public int field3771 = 128;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
    public boolean field3774 = true;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lce;")
    public static class126 field3772 = class206.method1445(-7923, "");

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Lce;")
    public static class126 field3784 = field3772;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field3787 = 0;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field3788 = 0;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "Lce;")
    public static class126 field3789 = field3772;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field3775;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public int field3781;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public int field3782;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lcc;")
    public static class313 field3769;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILbb;I)V", line = 4)
    private final void method1531(int arg0, int arg1, class134 arg2, int arg3) {
        if (arg1 != -5) {
            return;
        }
        if (arg0 == 1) {
            this.field3767 = arg2.method949(20732);
            this.method1535(107, this.field3767);
        } else if (arg0 == 2) {
            this.field3766 = arg2.method942(true);
            if (this.field3766 == 65535) {
                this.field3766 = -1;
            }
        } else if (arg0 == 3) {
            this.field3771 = arg2.method942(true);
        } else if (arg0 == 4) {
            this.field3774 = false;
        }
        field3785++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILbb;)V", line = 44)
    public final void method1532(int arg0, int arg1, class134 arg2) {
        field3768++;
        while (true) {
            int var4 = arg2.method948(-121);
            if (var4 == 0) {
                if (arg0 != -11880) {
                    method1536((class126) null, (class126) null, -111, -113, (short) -121, 107L, -84, 3);
                }
                return;
            }
            this.method1531(var4, -5, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[B)Z", line = 66)
    public static final boolean method1533(int arg0, byte[] arg1) {
        field3783++;
        class134 var2 = new class134(arg1);
        int var3 = var2.method948(arg0 ^ 0xFFFFFF78);
        if (arg0 != 255) {
            field3789 = (class126) null;
        }
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method948(arg0 - 379) == 1;
        if (var4) {
            class59.method411((byte) -108, var2);
        }
        class5.method31(var2, arg0 - 129);
        return true;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 110)
    public static void method1534(int arg0) {
        field3784 = null;
        if (arg0 == 1) {
            field3789 = null;
            field3769 = null;
            field3772 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V", line = 135)
    private final void method1535(int arg0, int arg1) {
        field3770++;
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        if (arg0 <= 101) {
            this.field3767 = 79;
        }
        double var7 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var9 = 0.0D;
        double var11 = var7;
        if (var3 < var7) {
            var11 = var3;
        }
        double var13 = 0.0D;
        double var15 = var7;
        if (var5 < var11) {
            var11 = var5;
        }
        if (var7 < var3) {
            var15 = var3;
        }
        if (var15 < var5) {
            var15 = var5;
        }
        double var17 = (var11 + var15) / 2.0D;
        if (var11 != var15) {
            if (var7 == var15) {
                var9 = (var3 - var5) / (var15 - var11);
            } else if (var3 == var15) {
                var9 = (var5 - var7) / (var15 - var11) + 2.0D;
            } else if (var5 == var15) {
                var9 = (var7 - var3) / (var15 - var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var15 - var11) / (var11 + var15);
            }
            if (var17 >= 0.5D) {
                var13 = (var15 - var11) / (2.0D - var15 - var11);
            }
        }
        this.field3775 = (int) (var17 * 256.0D);
        if (this.field3775 < 0) {
            this.field3775 = 0;
        } else if (this.field3775 > 255) {
            this.field3775 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field3782 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field3782 = (int) (var13 * var17 * 512.0D);
        }
        this.field3778 = (int) (var13 * 256.0D);
        if (this.field3778 < 0) {
            this.field3778 = 0;
        } else if (this.field3778 > 255) {
            this.field3778 = 255;
        }
        double var19 = var9 / 6.0D;
        if (this.field3782 < 1) {
            this.field3782 = 1;
        }
        this.field3781 = (int) ((double) this.field3782 * var19);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lce;Lce;IISJII)V", line = 228)
    public static final void method1536(class126 arg0, class126 arg1, int arg2, int arg3, short arg4, long arg5, int arg6, int arg7) {
        field3776++;
        if (arg2 >= -112 || class51.field783 || class173.field3067 >= 500) {
            return;
        }
        class296.field4932[class173.field3067] = arg1;
        class214.field3636[class173.field3067] = arg0;
        class131.field2247[class173.field3067] = arg6 == -1 ? class202.field3465 : arg6;
        class84.field1341[class173.field3067] = arg4;
        class194.field3304[class173.field3067] = arg5;
        class34.field506[class173.field3067] = arg3;
        class9.field115[class173.field3067] = arg7;
        class173.field3067++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIZIIII)V", line = 265)
    public static final void method1537(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4) {
            field3784 = (class126) null;
        }
        for (int var9 = 0; var9 < class228.field3852.field887; var9++) {
            if (class228.field3852.method388((byte) -127, var9)) {
                int var10 = class306.field5140 + class143.field2602 - class228.field3852.field877[var9] - 1;
                int var11 = class228.field3852.field881[var9] - class220.field3702;
                int var12 = arg3 + ((arg6 - arg3) * (var11 - arg1) / (arg8 - arg1));
                int var13 = class228.field3852.method394(false, var9);
                int var14 = 16777215;
                int var15 = (var10 - arg5) * (arg7 - arg0) / (arg2 - arg5) + arg0;
                class164 var16 = null;
                if (var13 == 0) {
                    if ((double) class232.field3896 == 3.0D) {
                        var16 = class202.field3456;
                    }
                    if ((double) class232.field3896 == 4.0D) {
                        var16 = class228.field3844;
                    }
                    if ((double) class232.field3896 == 6.0D) {
                        var16 = class55.field833;
                    }
                    if ((double) class232.field3896 >= 8.0D) {
                        var16 = class289.field4797;
                    }
                }
                if (var13 == 1) {
                    if ((double) class232.field3896 == 3.0D) {
                        var16 = class55.field833;
                    }
                    if ((double) class232.field3896 == 4.0D) {
                        var16 = class289.field4797;
                    }
                    if ((double) class232.field3896 == 6.0D) {
                        var16 = class294.field4898;
                    }
                    if ((double) class232.field3896 >= 8.0D) {
                        var16 = class55.field829;
                    }
                }
                if (var13 == 2) {
                    var14 = 16755200;
                    if ((double) class232.field3896 == 3.0D) {
                        var16 = class294.field4898;
                    }
                    if ((double) class232.field3896 == 4.0D) {
                        var16 = class55.field829;
                    }
                    if ((double) class232.field3896 == 6.0D) {
                        var16 = class159.field2864;
                    }
                    if ((double) class232.field3896 >= 8.0D) {
                        var16 = class39.field630;
                    }
                }
                if (class228.field3852.field878[var9] != -1) {
                    var14 = class228.field3852.field878[var9];
                }
                if (var16 != null) {
                    int var17 = class118.field1987.method2155(class228.field3852.field885[var9], (int[]) null, class245.field4156);
                    int var18 = var15 - (var17 - 1) * var16.method1199() / 2;
                    int var19 = var18 + var16.method1200() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        class126 var21 = class245.field4156[var20];
                        if ((var17 - 1) > var20) {
                            var21.method870(var21.method878((byte) -124) - 4, -1);
                        }
                        var16.method1205(var21, var12, var19, var14, true);
                        var19 += var16.method1199();
                    }
                }
            }
        }
        field3780++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)[Ltm;", line = 398)
    public static final class161[] method1538(byte arg0) {
        if (arg0 != 25) {
            field3784 = (class126) null;
        }
        if (class221.field3727 == null) {
            class161[] var1 = class160.method1177(class161.field2907, -99);
            class161[] var2 = new class161[var1.length];
            int var3 = 0;
            label57: for (int var4 = 0; var4 < var1.length; var4++) {
                class161 var5 = var1[var4];
                if ((var5.field2914 <= 0 || var5.field2914 >= 24) && var5.field2911 >= 800 && var5.field2906 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class161 var7 = var2[var6];
                        if (var5.field2911 == var7.field2911 && var5.field2906 == var7.field2906) {
                            if (var5.field2914 > var7.field2914) {
                                var2[var6] = var5;
                            }
                            continue label57;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class221.field3727 = new class161[var3];
            class230.method1566(var2, 0, class221.field3727, 0, var3);
            int[] var8 = new int[class221.field3727.length];
            for (int var9 = 0; var9 < class221.field3727.length; var9++) {
                class161 var10 = class221.field3727[var9];
                var8[var9] = var10.field2911 * var10.field2906;
            }
            class48.method297(class221.field3727, arg0 ^ 0x19, var8);
        }
        field3779++;
        return class221.field3727;
    }
}
