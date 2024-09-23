import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class NpcType {

    @OriginalMember(owner = "bc", name = "h", descriptor = "J")
    private long field849 = -1L;

    @OriginalMember(owner = "bc", name = "k", descriptor = "B")
    public byte field852 = 1;

    @OriginalMember(owner = "bc", name = "n", descriptor = "I")
    public int field855 = -1;

    @OriginalMember(owner = "bc", name = "o", descriptor = "I")
    public int field856 = -1;

    @OriginalMember(owner = "bc", name = "p", descriptor = "I")
    public int field857 = -1;

    @OriginalMember(owner = "bc", name = "q", descriptor = "I")
    public int field858 = -1;

    @OriginalMember(owner = "bc", name = "r", descriptor = "I")
    public int field859 = -1;

    @OriginalMember(owner = "bc", name = "s", descriptor = "Z")
    private boolean field860 = false;

    @OriginalMember(owner = "bc", name = "w", descriptor = "I")
    public int field864 = -1;

    @OriginalMember(owner = "bc", name = "x", descriptor = "I")
    public int field865 = -1;

    @OriginalMember(owner = "bc", name = "y", descriptor = "I")
    public int field866 = -1;

    @OriginalMember(owner = "bc", name = "z", descriptor = "Z")
    public boolean field867 = true;

    @OriginalMember(owner = "bc", name = "A", descriptor = "I")
    public int field868 = -1;

    @OriginalMember(owner = "bc", name = "B", descriptor = "I")
    private int field869 = 128;

    @OriginalMember(owner = "bc", name = "C", descriptor = "I")
    private int field870 = 128;

    @OriginalMember(owner = "bc", name = "a", descriptor = "B")
    private static byte field842 = 6;

    @OriginalMember(owner = "bc", name = "b", descriptor = "Z")
    private static boolean field843 = true;

    @OriginalMember(owner = "bc", name = "D", descriptor = "Ls;")
    public static LruCache field871 = new LruCache(17295, 30);

    @OriginalMember(owner = "bc", name = "c", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "bc", name = "g", descriptor = "I")
    private static int field848;

    @OriginalMember(owner = "bc", name = "e", descriptor = "Lkb;")
    private static Packet field846;

    @OriginalMember(owner = "bc", name = "i", descriptor = "Ljava/lang/String;")
    public String field850;

    @OriginalMember(owner = "bc", name = "j", descriptor = "[B")
    public byte[] field851;

    @OriginalMember(owner = "bc", name = "d", descriptor = "[I")
    private static int[] field845;

    @OriginalMember(owner = "bc", name = "l", descriptor = "[I")
    private int[] field853;

    @OriginalMember(owner = "bc", name = "m", descriptor = "[I")
    private int[] field854;

    @OriginalMember(owner = "bc", name = "t", descriptor = "[I")
    private int[] field861;

    @OriginalMember(owner = "bc", name = "u", descriptor = "[I")
    private int[] field862;

    @OriginalMember(owner = "bc", name = "f", descriptor = "[Lbc;")
    private static NpcType[] field847;

    @OriginalMember(owner = "bc", name = "v", descriptor = "[Ljava/lang/String;")
    public String[] field863;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lub;)V")
    public static final void method278(Jagfile arg0) {
        field846 = new Packet(arg0.method249("npc.dat", true, null), field843);
        Packet var1 = new Packet(arg0.method249("npc.idx", true, null), field843);
        field844 = var1.method210();
        field845 = new int[field844];
        int var2 = 2;
        for (int var3 = 0; var3 < field844; var3++) {
            field845[var3] = var2;
            var2 += var1.method210();
        }
        field847 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field847[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Z)V")
    public static final void method279(boolean arg0) {
        if (arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field871 = null;
        field845 = null;
        field847 = null;
        field846 = null;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(I)Lbc;")
    public static final NpcType method280(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field847[var1].field849) {
                return field847[var1];
            }
        }
        field848 = (field848 + 1) % 20;
        NpcType var2 = field847[field848] = new NpcType();
        field846.field622 = field845[arg0];
        var2.field849 = arg0;
        var2.method281(field842, field846);
        return var2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(BLkb;)V")
    private final void method281(byte arg0, Packet arg1) {
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = arg1.method208();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.method208();
                    this.field853 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field853[var6] = arg1.method210();
                    }
                } else if (var4 == 2) {
                    this.field850 = arg1.method215();
                } else if (var4 == 3) {
                    this.field851 = arg1.method216(525);
                } else if (var4 == 12) {
                    this.field852 = arg1.method209();
                } else if (var4 == 13) {
                    this.field855 = arg1.method210();
                } else if (var4 == 14) {
                    this.field856 = arg1.method210();
                } else if (var4 == 16) {
                    this.field860 = true;
                } else if (var4 == 17) {
                    this.field856 = arg1.method210();
                    this.field857 = arg1.method210();
                    this.field858 = arg1.method210();
                    this.field859 = arg1.method210();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field863 == null) {
                        this.field863 = new String[5];
                    }
                    this.field863[var4 - 30] = arg1.method215();
                    if (this.field863[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field863[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg1.method208();
                    this.field861 = new int[var7];
                    this.field862 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field861[var8] = arg1.method210();
                        this.field862[var8] = arg1.method210();
                    }
                } else if (var4 == 60) {
                    int var9 = arg1.method208();
                    this.field854 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field854[var10] = arg1.method210();
                    }
                } else if (var4 == 90) {
                    this.field864 = arg1.method210();
                } else if (var4 == 91) {
                    this.field865 = arg1.method210();
                } else if (var4 == 92) {
                    this.field866 = arg1.method210();
                } else if (var4 == 93) {
                    this.field867 = false;
                } else if (var4 == 95) {
                    this.field868 = arg1.method210();
                } else if (var4 == 97) {
                    this.field869 = arg1.method210();
                } else if (var4 == 98) {
                    this.field870 = arg1.method210();
                }
            }
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(II[I)Leb;")
    public final Model method282(int arg0, int arg1, int[] arg2) {
        Object var4 = null;
        Model var5 = (Model) field871.method101(this.field849);
        if (var5 == null) {
            Model[] var6 = new Model[this.field853.length];
            for (int var7 = 0; var7 < this.field853.length; var7++) {
                var6[var7] = new Model(this.field853[var7], true);
            }
            if (var6.length == 1) {
                var5 = var6[0];
            } else {
                var5 = new Model(16925, var6.length, var6);
            }
            if (this.field861 != null) {
                for (int var8 = 0; var8 < this.field861.length; var8++) {
                    var5.method132(this.field861[var8], this.field862[var8]);
                }
            }
            var5.method125((byte) -17);
            var5.method135(64, 850, -30, -50, -30, true);
            field871.method102(this.field849, var5, (byte) 3);
        }
        Model var9 = new Model(16925, !this.field860, var5);
        if (arg0 != -1 && arg1 != -1) {
            var9.method127(2, arg1, arg2, arg0);
        } else if (arg0 != -1) {
            var9.method126(arg0, (byte) 1);
        }
        if (this.field869 != 128 || this.field870 != 128) {
            var9.method134(this.field870, 28022, this.field869, this.field869);
        }
        var9.method122(9);
        var9.field480 = null;
        var9.field479 = null;
        if (this.field852 == 1) {
            var9.field481 = true;
        }
        return var9;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(B)Leb;")
    public final Model method283(byte arg0) {
        if (arg0 != 88) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field854 == null) {
            return null;
        }
        Model[] var3 = new Model[this.field854.length];
        for (int var4 = 0; var4 < this.field854.length; var4++) {
            var3[var4] = new Model(this.field854[var4], true);
        }
        Model var5;
        if (var3.length == 1) {
            var5 = var3[0];
        } else {
            var5 = new Model(16925, var3.length, var3);
        }
        if (this.field861 != null) {
            for (int var6 = 0; var6 < this.field861.length; var6++) {
                var5.method132(this.field861[var6], this.field862[var6]);
            }
        }
        return var5;
    }
}
