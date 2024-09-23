import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class NpcType {

    @OriginalMember(owner = "xb", name = "i", descriptor = "J")
    private long field758 = -1L;

    @OriginalMember(owner = "xb", name = "l", descriptor = "B")
    public byte field761 = 1;

    @OriginalMember(owner = "xb", name = "o", descriptor = "I")
    public int field764 = -1;

    @OriginalMember(owner = "xb", name = "p", descriptor = "I")
    public int field765 = -1;

    @OriginalMember(owner = "xb", name = "q", descriptor = "I")
    public int field766 = -1;

    @OriginalMember(owner = "xb", name = "r", descriptor = "I")
    public int field767 = -1;

    @OriginalMember(owner = "xb", name = "s", descriptor = "I")
    public int field768 = -1;

    @OriginalMember(owner = "xb", name = "t", descriptor = "Z")
    private boolean field769 = false;

    @OriginalMember(owner = "xb", name = "x", descriptor = "I")
    public int field773 = -1;

    @OriginalMember(owner = "xb", name = "y", descriptor = "I")
    public int field774 = -1;

    @OriginalMember(owner = "xb", name = "z", descriptor = "I")
    public int field775 = -1;

    @OriginalMember(owner = "xb", name = "A", descriptor = "Z")
    public boolean field776 = true;

    @OriginalMember(owner = "xb", name = "B", descriptor = "I")
    public int field777 = -1;

    @OriginalMember(owner = "xb", name = "C", descriptor = "I")
    private int field778 = 128;

    @OriginalMember(owner = "xb", name = "D", descriptor = "I")
    private int field779 = 128;

    @OriginalMember(owner = "xb", name = "b", descriptor = "I")
    private static int field751 = -612;

    @OriginalMember(owner = "xb", name = "c", descriptor = "B")
    private static byte field752 = 2;

    @OriginalMember(owner = "xb", name = "E", descriptor = "Lr;")
    public static LruCache field780 = new LruCache(-947, 30);

    @OriginalMember(owner = "xb", name = "d", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "xb", name = "h", descriptor = "I")
    private static int field757;

    @OriginalMember(owner = "xb", name = "f", descriptor = "Ljb;")
    private static Packet field755;

    @OriginalMember(owner = "xb", name = "j", descriptor = "Ljava/lang/String;")
    public String field759;

    @OriginalMember(owner = "xb", name = "a", descriptor = "Z")
    private static boolean field750;

    @OriginalMember(owner = "xb", name = "k", descriptor = "[B")
    public byte[] field760;

    @OriginalMember(owner = "xb", name = "e", descriptor = "[I")
    private static int[] field754;

    @OriginalMember(owner = "xb", name = "m", descriptor = "[I")
    private int[] field762;

    @OriginalMember(owner = "xb", name = "n", descriptor = "[I")
    private int[] field763;

    @OriginalMember(owner = "xb", name = "u", descriptor = "[I")
    private int[] field770;

    @OriginalMember(owner = "xb", name = "v", descriptor = "[I")
    private int[] field771;

    @OriginalMember(owner = "xb", name = "g", descriptor = "[Lxb;")
    private static NpcType[] field756;

    @OriginalMember(owner = "xb", name = "w", descriptor = "[Ljava/lang/String;")
    public String[] field772;

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Ltb;)V")
    public static final void method241(Jagfile arg0) {
        field755 = new Packet(arg0.method225(0, null, "npc.dat"), (byte) 63);
        Packet var1 = new Packet(arg0.method225(0, null, "npc.idx"), (byte) 63);
        field753 = var1.method187();
        field754 = new int[field753];
        int var2 = 2;
        for (int var3 = 0; var3 < field753; var3++) {
            field754[var3] = var2;
            var2 += var1.method187();
        }
        field756 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field756[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(I)V")
    public static final void method242(int arg0) {
        field780 = null;
        field754 = null;
        field756 = null;
        if (arg0 <= 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field755 = null;
    }

    @OriginalMember(owner = "xb", name = "b", descriptor = "(I)Lxb;")
    public static final NpcType method243(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field756[var1].field758) {
                return field756[var1];
            }
        }
        field757 = (field757 + 1) % 20;
        NpcType var2 = field756[field757] = new NpcType();
        field755.field586 = field754[arg0];
        var2.field758 = arg0;
        var2.method244((byte) 4, field755);
        return var2;
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(BLjb;)V")
    private final void method244(byte arg0, Packet arg1) {
        if (arg0 != 4) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = arg1.method185();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.method185();
                    this.field762 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field762[var6] = arg1.method187();
                    }
                } else if (var4 == 2) {
                    this.field759 = arg1.method192();
                } else if (var4 == 3) {
                    this.field760 = arg1.method193((byte) 2);
                } else if (var4 == 12) {
                    this.field761 = arg1.method186();
                } else if (var4 == 13) {
                    this.field764 = arg1.method187();
                } else if (var4 == 14) {
                    this.field765 = arg1.method187();
                } else if (var4 == 16) {
                    this.field769 = true;
                } else if (var4 == 17) {
                    this.field765 = arg1.method187();
                    this.field766 = arg1.method187();
                    this.field767 = arg1.method187();
                    this.field768 = arg1.method187();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field772 == null) {
                        this.field772 = new String[5];
                    }
                    this.field772[var4 - 30] = arg1.method192();
                } else if (var4 == 40) {
                    int var7 = arg1.method185();
                    this.field770 = new int[var7];
                    this.field771 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field770[var8] = arg1.method187();
                        this.field771[var8] = arg1.method187();
                    }
                } else if (var4 == 60) {
                    int var9 = arg1.method185();
                    this.field763 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field763[var10] = arg1.method187();
                    }
                } else if (var4 == 90) {
                    this.field773 = arg1.method187();
                } else if (var4 == 91) {
                    this.field774 = arg1.method187();
                } else if (var4 == 92) {
                    this.field775 = arg1.method187();
                } else if (var4 == 93) {
                    this.field776 = false;
                } else if (var4 == 95) {
                    this.field777 = arg1.method187();
                } else if (var4 == 97) {
                    this.field778 = arg1.method187();
                } else if (var4 == 98) {
                    this.field779 = arg1.method187();
                }
            }
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(II[I)Ldb;")
    public final Model method245(int arg0, int arg1, int[] arg2) {
        Object var4 = null;
        Model var5 = (Model) field780.method84(this.field758);
        if (var5 == null) {
            Model[] var6 = new Model[this.field762.length];
            for (int var7 = 0; var7 < this.field762.length; var7++) {
                var6[var7] = new Model(this.field762[var7], field750);
            }
            if (var6.length == 1) {
                var5 = var6[0];
            } else {
                var5 = new Model(var6.length, false, var6);
            }
            if (this.field770 != null) {
                for (int var8 = 0; var8 < this.field770.length; var8++) {
                    var5.method115(this.field770[var8], this.field771[var8]);
                }
            }
            var5.method108(0);
            var5.method118(64, 850, -30, -50, -30, true);
            field780.method85(var5, this.field758, field752);
        }
        Model var9 = new Model(!this.field769, false, var5);
        if (arg0 != -1 && arg1 != -1) {
            var9.method110(arg0, arg1, arg2, field751);
        } else if (arg0 != -1) {
            var9.method109(false, arg0);
        }
        if (this.field778 != 128 || this.field779 != 128) {
            var9.method117(this.field779, this.field778, false, this.field778);
        }
        var9.method106(false);
        var9.field455 = null;
        var9.field454 = null;
        return var9;
    }

    @OriginalMember(owner = "xb", name = "c", descriptor = "(I)Ldb;")
    public final Model method246(int arg0) {
        label46: while (true) {
            if (arg0 >= 0) {
                int var6 = 1;
                while (true) {
                    if (var6 <= 0) {
                        continue label46;
                    }
                    var6++;
                }
            }
            if (this.field763 == null) {
                return null;
            }
            Model[] var2 = new Model[this.field763.length];
            for (int var3 = 0; var3 < this.field763.length; var3++) {
                var2[var3] = new Model(this.field763[var3], field750);
            }
            Model var4;
            if (var2.length == 1) {
                var4 = var2[0];
            } else {
                var4 = new Model(var2.length, false, var2);
            }
            if (this.field770 != null) {
                for (int var5 = 0; var5 < this.field770.length; var5++) {
                    var4.method115(this.field770[var5], this.field771[var5]);
                }
            }
            return var4;
        }
    }
}
