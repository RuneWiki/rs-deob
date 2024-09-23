import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class NpcType {

    @OriginalMember(owner = "bc", name = "a", descriptor = "Z")
    private boolean field842 = false;

    @OriginalMember(owner = "bc", name = "g", descriptor = "J")
    private long field848 = -1L;

    @OriginalMember(owner = "bc", name = "j", descriptor = "B")
    public byte field851 = 1;

    @OriginalMember(owner = "bc", name = "m", descriptor = "I")
    public int field854 = -1;

    @OriginalMember(owner = "bc", name = "n", descriptor = "I")
    public int field855 = -1;

    @OriginalMember(owner = "bc", name = "o", descriptor = "I")
    public int field856 = -1;

    @OriginalMember(owner = "bc", name = "p", descriptor = "I")
    public int field857 = -1;

    @OriginalMember(owner = "bc", name = "q", descriptor = "I")
    public int field858 = -1;

    @OriginalMember(owner = "bc", name = "r", descriptor = "Z")
    private boolean field859 = false;

    @OriginalMember(owner = "bc", name = "v", descriptor = "I")
    public int field863 = -1;

    @OriginalMember(owner = "bc", name = "w", descriptor = "I")
    public int field864 = -1;

    @OriginalMember(owner = "bc", name = "x", descriptor = "I")
    public int field865 = -1;

    @OriginalMember(owner = "bc", name = "y", descriptor = "Z")
    public boolean field866 = true;

    @OriginalMember(owner = "bc", name = "z", descriptor = "I")
    public int field867 = -1;

    @OriginalMember(owner = "bc", name = "A", descriptor = "I")
    private int field868 = 128;

    @OriginalMember(owner = "bc", name = "B", descriptor = "I")
    private int field869 = 128;

    @OriginalMember(owner = "bc", name = "C", descriptor = "Ls;")
    public static LruCache field870 = new LruCache((byte) 0, 30);

    @OriginalMember(owner = "bc", name = "b", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "bc", name = "f", descriptor = "I")
    private static int field847;

    @OriginalMember(owner = "bc", name = "d", descriptor = "Lkb;")
    private static Packet field845;

    @OriginalMember(owner = "bc", name = "h", descriptor = "Ljava/lang/String;")
    public String field849;

    @OriginalMember(owner = "bc", name = "i", descriptor = "[B")
    public byte[] field850;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[I")
    private static int[] field844;

    @OriginalMember(owner = "bc", name = "k", descriptor = "[I")
    private int[] field852;

    @OriginalMember(owner = "bc", name = "l", descriptor = "[I")
    private int[] field853;

    @OriginalMember(owner = "bc", name = "s", descriptor = "[I")
    private int[] field860;

    @OriginalMember(owner = "bc", name = "t", descriptor = "[I")
    private int[] field861;

    @OriginalMember(owner = "bc", name = "e", descriptor = "[Lbc;")
    private static NpcType[] field846;

    @OriginalMember(owner = "bc", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field862;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lub;)V")
    public static final void method286(Jagfile arg0) {
        field845 = new Packet(363, arg0.read("npc.dat", null, (byte) 2));
        Packet var1 = new Packet(363, arg0.read("npc.idx", null, (byte) 2));
        field843 = var1.method218();
        field844 = new int[field843];
        int var2 = 2;
        for (int var3 = 0; var3 < field843; var3++) {
            field844[var3] = var2;
            var2 += var1.method218();
        }
        field846 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field846[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Z)V")
    public static final void method287(boolean arg0) {
        field870 = null;
        field844 = null;
        field846 = null;
        if (!arg0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field845 = null;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(I)Lbc;")
    public static final NpcType method288(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field846[var1].field848) {
                return field846[var1];
            }
        }
        field847 = (field847 + 1) % 20;
        NpcType var2 = field846[field847] = new NpcType();
        field845.field622 = field844[arg0];
        var2.field848 = arg0;
        var2.method289(false, field845);
        return var2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ZLkb;)V")
    private final void method289(boolean arg0, Packet arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method216();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method216();
                    this.field852 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field852[var5] = arg1.method218();
                    }
                } else if (var3 == 2) {
                    this.field849 = arg1.method223();
                } else if (var3 == 3) {
                    this.field850 = arg1.method224((byte) 31);
                } else if (var3 == 12) {
                    this.field851 = arg1.method217();
                } else if (var3 == 13) {
                    this.field854 = arg1.method218();
                } else if (var3 == 14) {
                    this.field855 = arg1.method218();
                } else if (var3 == 16) {
                    this.field859 = true;
                } else if (var3 == 17) {
                    this.field855 = arg1.method218();
                    this.field856 = arg1.method218();
                    this.field857 = arg1.method218();
                    this.field858 = arg1.method218();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field862 == null) {
                        this.field862 = new String[5];
                    }
                    this.field862[var3 - 30] = arg1.method223();
                    if (this.field862[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field862[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method216();
                    this.field860 = new int[var6];
                    this.field861 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field860[var7] = arg1.method218();
                        this.field861[var7] = arg1.method218();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method216();
                    this.field853 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field853[var9] = arg1.method218();
                    }
                } else if (var3 == 90) {
                    this.field863 = arg1.method218();
                } else if (var3 == 91) {
                    this.field864 = arg1.method218();
                } else if (var3 == 92) {
                    this.field865 = arg1.method218();
                } else if (var3 == 93) {
                    this.field866 = false;
                } else if (var3 == 95) {
                    this.field867 = arg1.method218();
                } else if (var3 == 97) {
                    this.field868 = arg1.method218();
                } else if (var3 == 98) {
                    this.field869 = arg1.method218();
                }
            }
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(II[I)Leb;")
    public final Model method290(int arg0, int arg1, int[] arg2) {
        Object var4 = null;
        Model var5 = (Model) field870.method103(this.field848);
        if (var5 == null) {
            Model[] var6 = new Model[this.field852.length];
            for (int var7 = 0; var7 < this.field852.length; var7++) {
                var6[var7] = new Model(false, this.field852[var7]);
            }
            if (var6.length == 1) {
                var5 = var6[0];
            } else {
                var5 = new Model(0, var6, var6.length);
            }
            if (this.field860 != null) {
                for (int var8 = 0; var8 < this.field860.length; var8++) {
                    var5.method134(this.field860[var8], this.field861[var8]);
                }
            }
            var5.method127(4);
            var5.method137(64, 850, -30, -50, -30, true);
            field870.method104(6, this.field848, var5);
        }
        Model var9 = new Model(0, var5, !this.field859);
        if (arg0 != -1 && arg1 != -1) {
            var9.method129(arg1, 3, arg0, arg2);
        } else if (arg0 != -1) {
            var9.method128(-16599, arg0);
        }
        if (this.field868 != 128 || this.field869 != 128) {
            var9.method136(this.field868, 2, this.field869, this.field868);
        }
        var9.method124(2992);
        var9.field480 = null;
        var9.field479 = null;
        if (this.field851 == 1) {
            var9.field481 = true;
        }
        return var9;
    }

    @OriginalMember(owner = "bc", name = "b", descriptor = "(Z)Leb;")
    public final Model method291(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field853 == null) {
            return null;
        } else {
            Model[] var2 = new Model[this.field853.length];
            for (int var3 = 0; var3 < this.field853.length; var3++) {
                var2[var3] = new Model(false, this.field853[var3]);
            }
            Model var4;
            if (var2.length == 1) {
                var4 = var2[0];
            } else {
                var4 = new Model(0, var2, var2.length);
            }
            if (this.field860 != null) {
                for (int var5 = 0; var5 < this.field860.length; var5++) {
                    var4.method134(this.field860[var5], this.field861[var5]);
                }
            }
            return var4;
        }
    }
}
