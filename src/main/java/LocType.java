import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class LocType {

    @OriginalMember(owner = "xb", name = "i", descriptor = "I")
    private int field738 = -1;

    @OriginalMember(owner = "xb", name = "a", descriptor = "I")
    private static int field730 = -494;

    @OriginalMember(owner = "xb", name = "b", descriptor = "Z")
    private static boolean field731 = true;

    @OriginalMember(owner = "xb", name = "P", descriptor = "Ls;")
    public static LruCache field771 = new LruCache(-24094, 500);

    @OriginalMember(owner = "xb", name = "Q", descriptor = "Ls;")
    public static LruCache field772 = new LruCache(-24094, 30);

    @OriginalMember(owner = "xb", name = "z", descriptor = "B")
    private byte field755;

    @OriginalMember(owner = "xb", name = "A", descriptor = "B")
    private byte field756;

    @OriginalMember(owner = "xb", name = "d", descriptor = "I")
    private static int field733;

    @OriginalMember(owner = "xb", name = "h", descriptor = "I")
    private static int field737;

    @OriginalMember(owner = "xb", name = "p", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "xb", name = "q", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "xb", name = "x", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "xb", name = "y", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "xb", name = "D", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "xb", name = "E", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "xb", name = "H", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "xb", name = "I", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "xb", name = "J", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "xb", name = "K", descriptor = "I")
    private int field766;

    @OriginalMember(owner = "xb", name = "L", descriptor = "I")
    private int field767;

    @OriginalMember(owner = "xb", name = "M", descriptor = "I")
    private int field768;

    @OriginalMember(owner = "xb", name = "N", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "xb", name = "f", descriptor = "Lkb;")
    private static Packet field735;

    @OriginalMember(owner = "xb", name = "l", descriptor = "Ljava/lang/String;")
    public String field741;

    @OriginalMember(owner = "xb", name = "c", descriptor = "Z")
    public static boolean field732;

    @OriginalMember(owner = "xb", name = "r", descriptor = "Z")
    public boolean field747;

    @OriginalMember(owner = "xb", name = "s", descriptor = "Z")
    public boolean field748;

    @OriginalMember(owner = "xb", name = "t", descriptor = "Z")
    public boolean field749;

    @OriginalMember(owner = "xb", name = "u", descriptor = "Z")
    private boolean field750;

    @OriginalMember(owner = "xb", name = "v", descriptor = "Z")
    private boolean field751;

    @OriginalMember(owner = "xb", name = "w", descriptor = "Z")
    public boolean field752;

    @OriginalMember(owner = "xb", name = "C", descriptor = "Z")
    private boolean field758;

    @OriginalMember(owner = "xb", name = "F", descriptor = "Z")
    private boolean field761;

    @OriginalMember(owner = "xb", name = "G", descriptor = "Z")
    public boolean field762;

    @OriginalMember(owner = "xb", name = "O", descriptor = "Z")
    public boolean field770;

    @OriginalMember(owner = "xb", name = "m", descriptor = "[B")
    public byte[] field742;

    @OriginalMember(owner = "xb", name = "e", descriptor = "[I")
    private static int[] field734;

    @OriginalMember(owner = "xb", name = "j", descriptor = "[I")
    private int[] field739;

    @OriginalMember(owner = "xb", name = "k", descriptor = "[I")
    private int[] field740;

    @OriginalMember(owner = "xb", name = "n", descriptor = "[I")
    private int[] field743;

    @OriginalMember(owner = "xb", name = "o", descriptor = "[I")
    private int[] field744;

    @OriginalMember(owner = "xb", name = "g", descriptor = "[Lxb;")
    private static LocType[] field736;

    @OriginalMember(owner = "xb", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field757;

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Lub;)V")
    public static final void method251(Jagfile arg0) {
        field735 = new Packet(arg0.method242((byte) 6, null, "loc.dat"), 4);
        Packet var1 = new Packet(arg0.method242((byte) 6, null, "loc.idx"), 4);
        field733 = var1.method203();
        field734 = new int[field733];
        int var2 = 2;
        for (int var3 = 0; var3 < field733; var3++) {
            field734[var3] = var2;
            var2 += var1.method203();
        }
        field736 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field736[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(I)V")
    public static final void method252(int arg0) {
        field771 = null;
        field772 = null;
        field734 = null;
        if (arg0 <= 0) {
            field731 = !field731;
        }
        field736 = null;
        field735 = null;
    }

    @OriginalMember(owner = "xb", name = "b", descriptor = "(I)Lxb;")
    public static final LocType method253(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field736[var1].field738 == arg0) {
                return field736[var1];
            }
        }
        field737 = (field737 + 1) % 10;
        LocType var2 = field736[field737];
        field735.field606 = field734[arg0];
        var2.field738 = arg0;
        var2.method254();
        var2.method255(213, field735);
        return var2;
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "()V")
    private final void method254() {
        this.field739 = null;
        this.field740 = null;
        this.field741 = null;
        this.field742 = null;
        this.field743 = null;
        this.field744 = null;
        this.field745 = 1;
        this.field746 = 1;
        this.field747 = true;
        this.field748 = true;
        this.field749 = false;
        this.field750 = false;
        this.field751 = false;
        this.field752 = false;
        this.field753 = -1;
        this.field754 = 16;
        this.field755 = 0;
        this.field756 = 0;
        this.field757 = null;
        this.field758 = false;
        this.field759 = -1;
        this.field760 = -1;
        this.field761 = false;
        this.field762 = true;
        this.field763 = 128;
        this.field764 = 128;
        this.field765 = 128;
        this.field769 = 0;
        this.field766 = 0;
        this.field767 = 0;
        this.field768 = 0;
        this.field770 = false;
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(ILkb;)V")
    private final void method255(int arg0, Packet arg1) {
        int var3 = -1;
        if (arg0 <= 0) {
            field730 = 167;
        }
        while (true) {
            while (true) {
                int var4 = arg1.method201();
                if (var4 == 0) {
                    if (this.field740 == null) {
                        this.field740 = new int[0];
                    }
                    if (var3 == -1) {
                        this.field749 = false;
                        if (this.field740.length > 0 && this.field740[0] == 10) {
                            this.field749 = true;
                        }
                        if (this.field757 != null) {
                            this.field749 = true;
                            return;
                        }
                    }
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.method201();
                    this.field740 = new int[var5];
                    this.field739 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field739[var6] = arg1.method203();
                        this.field740[var6] = arg1.method201();
                    }
                } else if (var4 == 2) {
                    this.field741 = arg1.method208();
                } else if (var4 == 3) {
                    this.field742 = arg1.method209(true);
                } else if (var4 == 14) {
                    this.field745 = arg1.method201();
                } else if (var4 == 15) {
                    this.field746 = arg1.method201();
                } else if (var4 == 17) {
                    this.field747 = false;
                } else if (var4 == 18) {
                    this.field748 = false;
                } else if (var4 == 19) {
                    var3 = arg1.method201();
                    if (var3 == 1) {
                        this.field749 = true;
                    }
                } else if (var4 == 21) {
                    this.field750 = true;
                } else if (var4 == 22) {
                    this.field751 = true;
                } else if (var4 == 23) {
                    this.field752 = true;
                } else if (var4 == 24) {
                    this.field753 = arg1.method203();
                    if (this.field753 == 65535) {
                        this.field753 = -1;
                    }
                } else if (var4 == 25) {
                    this.field758 = true;
                } else if (var4 == 28) {
                    this.field754 = arg1.method201();
                } else if (var4 == 29) {
                    this.field755 = arg1.method202();
                } else if (var4 == 39) {
                    this.field756 = arg1.method202();
                } else if (var4 >= 30 && var4 < 39) {
                    if (this.field757 == null) {
                        this.field757 = new String[5];
                    }
                    this.field757[var4 - 30] = arg1.method208();
                } else if (var4 == 40) {
                    int var7 = arg1.method201();
                    this.field743 = new int[var7];
                    this.field744 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field743[var8] = arg1.method203();
                        this.field744[var8] = arg1.method203();
                    }
                } else if (var4 == 60) {
                    this.field759 = arg1.method203();
                } else if (var4 == 62) {
                    this.field761 = true;
                } else if (var4 == 64) {
                    this.field762 = false;
                } else if (var4 == 65) {
                    this.field763 = arg1.method203();
                } else if (var4 == 66) {
                    this.field764 = arg1.method203();
                } else if (var4 == 67) {
                    this.field765 = arg1.method203();
                } else if (var4 == 68) {
                    this.field760 = arg1.method203();
                } else if (var4 == 69) {
                    this.field769 = arg1.method201();
                } else if (var4 == 70) {
                    this.field766 = arg1.method204();
                } else if (var4 == 71) {
                    this.field767 = arg1.method204();
                } else if (var4 == 72) {
                    this.field768 = arg1.method204();
                } else if (var4 == 73) {
                    this.field770 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(IIIIIII)Leb;")
    public final Model method256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -1;
        for (int var9 = 0; var9 < this.field740.length; var9++) {
            if (this.field740[var9] == arg0) {
                var8 = var9;
                break;
            }
        }
        if (var8 == -1) {
            return null;
        }
        long var10 = ((long) (arg6 + 1) << 32) + (long) ((this.field738 << 6) + (var8 << 3) + arg1);
        if (field732) {
            var10 = 0L;
        }
        if (!this.field750 && !this.field751) {
            Model var12 = (Model) field772.method99(var10);
            if (var12 != null) {
                return var12;
            }
        }
        if (var8 >= this.field739.length) {
            return null;
        }
        int var13 = this.field739[var8];
        if (var13 == -1) {
            return null;
        }
        boolean var14 = this.field761 ^ arg1 > 3;
        if (var14) {
            var13 += 65536;
        }
        Model var15 = (Model) field771.method99((long) var13);
        if (var15 == null) {
            var15 = new Model(var13 & 0xFFFF, 298);
            if (var14) {
                var15.method130(-25737);
            }
            field771.method100((long) var13, 7, var15);
        }
        boolean var16;
        if (this.field763 == 128 && this.field764 == 128 && this.field765 == 128) {
            var16 = false;
        } else {
            var16 = true;
        }
        boolean var17;
        if (this.field766 == 0 && this.field767 == 0 && this.field768 == 0) {
            var17 = false;
        } else {
            var17 = true;
        }
        Model var18 = new Model(-428, !this.field751, var15, this.field743 == null, arg1 == 0 && !this.field750 && arg6 == -1 && !var16 && !var17, !this.field758);
        if (arg6 != -1) {
            var18.method122((byte) 3);
            var18.method123(7, arg6);
            var18.field469 = null;
            var18.field468 = null;
        }
        while (arg1-- > 0) {
            var18.method126((byte) 0);
        }
        if (this.field743 != null) {
            for (int var19 = 0; var19 < this.field743.length; var19++) {
                var18.method129(this.field743[var19], this.field744[var19]);
            }
        }
        if (var16) {
            var18.method131(728, this.field763, this.field764, this.field765);
        }
        if (this.field750) {
            int var20 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var21 = 0; var21 < var18.field436; var21++) {
                int var22 = var18.field437[var21];
                int var23 = var18.field439[var21];
                int var24 = (arg3 - arg2) * (var22 + 64) / 128 + arg2;
                int var25 = (arg4 - arg5) * (var22 + 64) / 128 + arg5;
                int var26 = (var25 - var24) * (var23 + 64) / 128 + var24;
                var18.field438[var21] += var26 - var20;
            }
        }
        if (var17) {
            var18.method128(this.field768, 0, this.field766, this.field767);
        }
        var18.method132(this.field755 + 64, this.field756 * 5 + 768, -50, -10, -50, !this.field751);
        if (this.field747) {
            var18.field465 = var18.field461;
        }
        if (!this.field750 && !this.field751) {
            field772.method100(var10, 7, var18);
        }
        return var18;
    }
}
