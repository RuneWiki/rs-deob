import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class LocType {

    @OriginalMember(owner = "wb", name = "h", descriptor = "I")
    private int field719 = -1;

    @OriginalMember(owner = "wb", name = "b", descriptor = "B")
    private static byte field713 = 2;

    @OriginalMember(owner = "wb", name = "K", descriptor = "Lr;")
    public static LruCache field748 = new LruCache(-947, 500);

    @OriginalMember(owner = "wb", name = "L", descriptor = "Lr;")
    public static LruCache field749 = new LruCache(-947, 30);

    @OriginalMember(owner = "wb", name = "y", descriptor = "B")
    private byte field736;

    @OriginalMember(owner = "wb", name = "z", descriptor = "B")
    private byte field737;

    @OriginalMember(owner = "wb", name = "c", descriptor = "I")
    private static int field714;

    @OriginalMember(owner = "wb", name = "g", descriptor = "I")
    private static int field718;

    @OriginalMember(owner = "wb", name = "o", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "wb", name = "p", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "wb", name = "w", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "wb", name = "x", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "wb", name = "C", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "wb", name = "D", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "wb", name = "G", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "wb", name = "H", descriptor = "I")
    private int field745;

    @OriginalMember(owner = "wb", name = "I", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "wb", name = "J", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "wb", name = "e", descriptor = "Ljb;")
    private static Packet field716;

    @OriginalMember(owner = "wb", name = "k", descriptor = "Ljava/lang/String;")
    public String field722;

    @OriginalMember(owner = "wb", name = "a", descriptor = "Z")
    private static boolean field712;

    @OriginalMember(owner = "wb", name = "q", descriptor = "Z")
    public boolean field728;

    @OriginalMember(owner = "wb", name = "r", descriptor = "Z")
    public boolean field729;

    @OriginalMember(owner = "wb", name = "s", descriptor = "Z")
    public boolean field730;

    @OriginalMember(owner = "wb", name = "t", descriptor = "Z")
    private boolean field731;

    @OriginalMember(owner = "wb", name = "u", descriptor = "Z")
    private boolean field732;

    @OriginalMember(owner = "wb", name = "v", descriptor = "Z")
    public boolean field733;

    @OriginalMember(owner = "wb", name = "B", descriptor = "Z")
    private boolean field739;

    @OriginalMember(owner = "wb", name = "E", descriptor = "Z")
    private boolean field742;

    @OriginalMember(owner = "wb", name = "F", descriptor = "Z")
    public boolean field743;

    @OriginalMember(owner = "wb", name = "l", descriptor = "[B")
    public byte[] field723;

    @OriginalMember(owner = "wb", name = "d", descriptor = "[I")
    private static int[] field715;

    @OriginalMember(owner = "wb", name = "i", descriptor = "[I")
    private int[] field720;

    @OriginalMember(owner = "wb", name = "j", descriptor = "[I")
    private int[] field721;

    @OriginalMember(owner = "wb", name = "m", descriptor = "[I")
    private int[] field724;

    @OriginalMember(owner = "wb", name = "n", descriptor = "[I")
    private int[] field725;

    @OriginalMember(owner = "wb", name = "f", descriptor = "[Lwb;")
    private static LocType[] field717;

    @OriginalMember(owner = "wb", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field738;

    @OriginalMember(owner = "wb", name = "a", descriptor = "(Ltb;)V")
    public static final void method235(Jagfile arg0) {
        field716 = new Packet(arg0.method225(0, null, "loc.dat"), (byte) 63);
        Packet var1 = new Packet(arg0.method225(0, null, "loc.idx"), (byte) 63);
        field714 = var1.method187();
        field715 = new int[field714];
        int var2 = 2;
        for (int var3 = 0; var3 < field714; var3++) {
            field715[var3] = var2;
            var2 += var1.method187();
        }
        field717 = new LocType[10];
        for (int var4 = 0; var4 < 10; var4++) {
            field717[var4] = new LocType();
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(I)V")
    public static final void method236(int arg0) {
        field748 = null;
        field749 = null;
        field715 = null;
        field717 = null;
        int var1 = 5 / arg0;
        field716 = null;
    }

    @OriginalMember(owner = "wb", name = "b", descriptor = "(I)Lwb;")
    public static final LocType method237(int arg0) {
        for (int var1 = 0; var1 < 10; var1++) {
            if (field717[var1].field719 == arg0) {
                return field717[var1];
            }
        }
        field718 = (field718 + 1) % 10;
        LocType var2 = field717[field718];
        field716.field586 = field715[arg0];
        var2.field719 = arg0;
        var2.method238();
        var2.method239((byte) 4, field716);
        return var2;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "()V")
    private final void method238() {
        this.field720 = null;
        this.field721 = null;
        this.field722 = null;
        this.field723 = null;
        this.field724 = null;
        this.field725 = null;
        this.field726 = 1;
        this.field727 = 1;
        this.field728 = true;
        this.field729 = true;
        this.field730 = false;
        this.field731 = false;
        this.field732 = false;
        this.field733 = false;
        this.field734 = -1;
        this.field735 = 16;
        this.field736 = 0;
        this.field737 = 0;
        this.field738 = null;
        this.field739 = false;
        this.field740 = -1;
        this.field741 = -1;
        this.field742 = false;
        this.field743 = true;
        this.field744 = 128;
        this.field745 = 128;
        this.field746 = 128;
        this.field747 = 0;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(BLjb;)V")
    private final void method239(byte arg0, Packet arg1) {
        if (arg0 != 4) {
            throw new NullPointerException();
        }
        int var3 = -1;
        while (true) {
            while (true) {
                int var4 = arg1.method185();
                if (var4 == 0) {
                    if (this.field721 == null) {
                        this.field721 = new int[0];
                    }
                    if (var3 == -1) {
                        this.field730 = false;
                        if (this.field721.length > 0 && this.field721[0] == 10) {
                            this.field730 = true;
                        }
                        if (this.field738 != null) {
                            this.field730 = true;
                        }
                    }
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.method185();
                    this.field721 = new int[var5];
                    this.field720 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field720[var6] = arg1.method187();
                        this.field721[var6] = arg1.method185();
                    }
                } else if (var4 == 2) {
                    this.field722 = arg1.method192();
                } else if (var4 == 3) {
                    this.field723 = arg1.method193((byte) 2);
                } else if (var4 == 14) {
                    this.field726 = arg1.method185();
                } else if (var4 == 15) {
                    this.field727 = arg1.method185();
                } else if (var4 == 17) {
                    this.field728 = false;
                } else if (var4 == 18) {
                    this.field729 = false;
                } else if (var4 == 19) {
                    var3 = arg1.method185();
                    if (var3 == 1) {
                        this.field730 = true;
                    }
                } else if (var4 == 21) {
                    this.field731 = true;
                } else if (var4 == 22) {
                    this.field732 = true;
                } else if (var4 == 23) {
                    this.field733 = true;
                } else if (var4 == 24) {
                    this.field734 = arg1.method187();
                    if (this.field734 == 65535) {
                        this.field734 = -1;
                    }
                } else if (var4 == 25) {
                    this.field739 = true;
                } else if (var4 == 28) {
                    this.field735 = arg1.method185();
                } else if (var4 == 29) {
                    this.field736 = arg1.method186();
                } else if (var4 == 39) {
                    this.field737 = arg1.method186();
                } else if (var4 >= 30 && var4 < 39) {
                    if (this.field738 == null) {
                        this.field738 = new String[5];
                    }
                    this.field738[var4 - 30] = arg1.method192();
                } else if (var4 == 40) {
                    int var7 = arg1.method185();
                    this.field724 = new int[var7];
                    this.field725 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field724[var8] = arg1.method187();
                        this.field725[var8] = arg1.method187();
                    }
                } else if (var4 == 60) {
                    this.field740 = arg1.method187();
                } else if (var4 == 62) {
                    this.field742 = true;
                } else if (var4 == 64) {
                    this.field743 = false;
                } else if (var4 == 65) {
                    this.field744 = arg1.method187();
                } else if (var4 == 66) {
                    this.field745 = arg1.method187();
                } else if (var4 == 67) {
                    this.field746 = arg1.method187();
                } else if (var4 == 68) {
                    this.field741 = arg1.method187();
                } else if (var4 == 69) {
                    this.field747 = arg1.method185();
                }
            }
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(IIIIIII)Ldb;")
    public final Model method240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = -1;
        for (int var9 = 0; var9 < this.field721.length; var9++) {
            if (this.field721[var9] == arg0) {
                var8 = var9;
                break;
            }
        }
        if (var8 == -1) {
            return null;
        }
        long var10 = ((long) (arg6 + 1) << 32) + (long) ((this.field719 << 6) + (var8 << 3) + arg1);
        if (!this.field731 && !this.field732) {
            Model var12 = (Model) field749.method84(var10);
            if (var12 != null) {
                return var12;
            }
        }
        if (var8 >= this.field720.length) {
            return null;
        }
        int var13 = this.field720[var8];
        if (var13 == -1) {
            return null;
        }
        boolean var14 = this.field742 ^ arg1 > 3;
        if (var14) {
            var13 += 65536;
        }
        Model var15 = (Model) field748.method84((long) var13);
        if (var15 == null) {
            var15 = new Model(var13 & 0xFFFF, field712);
            if (var14) {
                var15.method116(5);
            }
            field748.method85(var15, (long) var13, field713);
        }
        boolean var16;
        if (this.field744 == 128 && this.field745 == 128 && this.field746 == 128) {
            var16 = false;
        } else {
            var16 = true;
        }
        Model var17 = new Model(this.field724 == null, !this.field739, var15, 440, !this.field732, arg1 == 0 && !this.field731 && arg6 == -1 && !var16);
        if (arg6 != -1) {
            var17.method108(0);
            var17.method109(false, arg6);
            var17.field455 = null;
            var17.field454 = null;
        }
        while (arg1-- > 0) {
            var17.method112(0);
        }
        if (this.field724 != null) {
            for (int var18 = 0; var18 < this.field724.length; var18++) {
                var17.method115(this.field724[var18], this.field725[var18]);
            }
        }
        if (var16) {
            var17.method117(this.field745, this.field744, false, this.field746);
        }
        if (this.field731) {
            int var19 = (arg2 + arg3 + arg4 + arg5) / 4;
            for (int var20 = 0; var20 < var17.field422; var20++) {
                int var21 = var17.field423[var20];
                int var22 = var17.field425[var20];
                int var23 = (arg3 - arg2) * (var21 + 64) / 128 + arg2;
                int var24 = (arg4 - arg5) * (var21 + 64) / 128 + arg5;
                int var25 = (var24 - var23) * (var22 + 64) / 128 + var23;
                var17.field424[var20] += var25 - var19;
            }
        }
        var17.method118(this.field736 + 64, this.field737 * 5 + 768, -50, -10, -50, !this.field732);
        if (this.field728) {
            var17.field451 = var17.field447;
        }
        if (!this.field731 && !this.field732) {
            field749.method85(var17, var10, field713);
        }
        return var17;
    }
}
