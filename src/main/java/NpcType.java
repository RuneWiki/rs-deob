import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class NpcType {

    @OriginalMember(owner = "bc", name = "g", descriptor = "J")
    private long field847 = -1L;

    @OriginalMember(owner = "bc", name = "j", descriptor = "B")
    public byte field850 = 1;

    @OriginalMember(owner = "bc", name = "m", descriptor = "I")
    public int field853 = -1;

    @OriginalMember(owner = "bc", name = "n", descriptor = "I")
    public int field854 = -1;

    @OriginalMember(owner = "bc", name = "o", descriptor = "I")
    public int field855 = -1;

    @OriginalMember(owner = "bc", name = "p", descriptor = "I")
    public int field856 = -1;

    @OriginalMember(owner = "bc", name = "q", descriptor = "I")
    public int field857 = -1;

    @OriginalMember(owner = "bc", name = "r", descriptor = "Z")
    private boolean field858 = false;

    @OriginalMember(owner = "bc", name = "v", descriptor = "I")
    public int field862 = -1;

    @OriginalMember(owner = "bc", name = "w", descriptor = "I")
    public int field863 = -1;

    @OriginalMember(owner = "bc", name = "x", descriptor = "I")
    public int field864 = -1;

    @OriginalMember(owner = "bc", name = "y", descriptor = "Z")
    public boolean field865 = true;

    @OriginalMember(owner = "bc", name = "z", descriptor = "I")
    public int field866 = -1;

    @OriginalMember(owner = "bc", name = "A", descriptor = "I")
    private int field867 = 128;

    @OriginalMember(owner = "bc", name = "B", descriptor = "I")
    private int field868 = 128;

    @OriginalMember(owner = "bc", name = "a", descriptor = "Z")
    private static boolean field841 = true;

    @OriginalMember(owner = "bc", name = "C", descriptor = "Ls;")
    public static LruCache field869 = new LruCache(30, (byte) 4);

    @OriginalMember(owner = "bc", name = "b", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "bc", name = "f", descriptor = "I")
    private static int field846;

    @OriginalMember(owner = "bc", name = "d", descriptor = "Lkb;")
    private static Packet field844;

    @OriginalMember(owner = "bc", name = "h", descriptor = "Ljava/lang/String;")
    public String field848;

    @OriginalMember(owner = "bc", name = "i", descriptor = "[B")
    public byte[] field849;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[I")
    private static int[] field843;

    @OriginalMember(owner = "bc", name = "k", descriptor = "[I")
    private int[] field851;

    @OriginalMember(owner = "bc", name = "l", descriptor = "[I")
    private int[] field852;

    @OriginalMember(owner = "bc", name = "s", descriptor = "[I")
    private int[] field859;

    @OriginalMember(owner = "bc", name = "t", descriptor = "[I")
    private int[] field860;

    @OriginalMember(owner = "bc", name = "e", descriptor = "[Lbc;")
    private static NpcType[] field845;

    @OriginalMember(owner = "bc", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field861;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lub;)V")
    public static final void method279(Jagfile arg0) {
        field844 = new Packet(0, arg0.method250("npc.dat", null, 8));
        Packet var1 = new Packet(0, arg0.method250("npc.idx", null, 8));
        field842 = var1.method211();
        field843 = new int[field842];
        int var2 = 2;
        for (int var3 = 0; var3 < field842; var3++) {
            field843[var3] = var2;
            var2 += var1.method211();
        }
        field845 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field845[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(B)V")
    public static final void method280(byte arg0) {
        field869 = null;
        if (arg0 == -123) {
            field843 = null;
            field845 = null;
            field844 = null;
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(I)Lbc;")
    public static final NpcType method281(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field845[var1].field847) {
                return field845[var1];
            }
        }
        field846 = (field846 + 1) % 20;
        NpcType var2 = field845[field846] = new NpcType();
        field844.field621 = field843[arg0];
        var2.field847 = arg0;
        var2.method282(field844, 0);
        return var2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lkb;I)V")
    private final void method282(Packet arg0, int arg1) {
        if (arg1 != 0) {
            field841 = !field841;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method209();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method209();
                    this.field851 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field851[var5] = arg0.method211();
                    }
                } else if (var3 == 2) {
                    this.field848 = arg0.method216();
                } else if (var3 == 3) {
                    this.field849 = arg0.method217(497);
                } else if (var3 == 12) {
                    this.field850 = arg0.method210();
                } else if (var3 == 13) {
                    this.field853 = arg0.method211();
                } else if (var3 == 14) {
                    this.field854 = arg0.method211();
                } else if (var3 == 16) {
                    this.field858 = true;
                } else if (var3 == 17) {
                    this.field854 = arg0.method211();
                    this.field855 = arg0.method211();
                    this.field856 = arg0.method211();
                    this.field857 = arg0.method211();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field861 == null) {
                        this.field861 = new String[5];
                    }
                    this.field861[var3 - 30] = arg0.method216();
                    if (this.field861[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field861[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method209();
                    this.field859 = new int[var6];
                    this.field860 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field859[var7] = arg0.method211();
                        this.field860[var7] = arg0.method211();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method209();
                    this.field852 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field852[var9] = arg0.method211();
                    }
                } else if (var3 == 90) {
                    this.field862 = arg0.method211();
                } else if (var3 == 91) {
                    this.field863 = arg0.method211();
                } else if (var3 == 92) {
                    this.field864 = arg0.method211();
                } else if (var3 == 93) {
                    this.field865 = false;
                } else if (var3 == 95) {
                    this.field866 = arg0.method211();
                } else if (var3 == 97) {
                    this.field867 = arg0.method211();
                } else if (var3 == 98) {
                    this.field868 = arg0.method211();
                }
            }
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(II[I)Leb;")
    public final Model method283(int arg0, int arg1, int[] arg2) {
        Object var4 = null;
        Model var5 = (Model) field869.method102(this.field847);
        if (var5 == null) {
            Model[] var6 = new Model[this.field851.length];
            for (int var7 = 0; var7 < this.field851.length; var7++) {
                var6[var7] = new Model(0, this.field851[var7]);
            }
            if (var6.length == 1) {
                var5 = var6[0];
            } else {
                var5 = new Model(6, var6.length, var6);
            }
            if (this.field859 != null) {
                for (int var8 = 0; var8 < this.field859.length; var8++) {
                    var5.method133(this.field859[var8], this.field860[var8]);
                }
            }
            var5.method126(-36895);
            var5.method136(64, 850, -30, -50, -30, true);
            field869.method103(this.field847, 1567, var5);
        }
        Model var9 = new Model(6, !this.field858, var5);
        if (arg0 != -1 && arg1 != -1) {
            var9.method128(6, arg2, arg1, arg0);
        } else if (arg0 != -1) {
            var9.method127(1, arg0);
        }
        if (this.field867 != 128 || this.field868 != 128) {
            var9.method135(this.field867, this.field867, true, this.field868);
        }
        var9.method123(983);
        var9.field479 = null;
        var9.field478 = null;
        if (this.field850 == 1) {
            var9.field480 = true;
        }
        return var9;
    }

    @OriginalMember(owner = "bc", name = "b", descriptor = "(I)Leb;")
    public final Model method284(int arg0) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field852 == null) {
            return null;
        }
        Model[] var3 = new Model[this.field852.length];
        for (int var4 = 0; var4 < this.field852.length; var4++) {
            var3[var4] = new Model(0, this.field852[var4]);
        }
        Model var5;
        if (var3.length == 1) {
            var5 = var3[0];
        } else {
            var5 = new Model(6, var3.length, var3);
        }
        if (this.field859 != null) {
            for (int var6 = 0; var6 < this.field859.length; var6++) {
                var5.method133(this.field859[var6], this.field860[var6]);
            }
        }
        return var5;
    }
}
