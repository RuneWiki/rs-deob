import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class NpcType {

    @OriginalMember(owner = "bc", name = "b", descriptor = "Z")
    private boolean field840 = true;

    @OriginalMember(owner = "bc", name = "h", descriptor = "J")
    private long field846 = -1L;

    @OriginalMember(owner = "bc", name = "k", descriptor = "B")
    public byte field849 = 1;

    @OriginalMember(owner = "bc", name = "n", descriptor = "I")
    public int field852 = -1;

    @OriginalMember(owner = "bc", name = "o", descriptor = "I")
    public int field853 = -1;

    @OriginalMember(owner = "bc", name = "p", descriptor = "I")
    public int field854 = -1;

    @OriginalMember(owner = "bc", name = "q", descriptor = "I")
    public int field855 = -1;

    @OriginalMember(owner = "bc", name = "r", descriptor = "I")
    public int field856 = -1;

    @OriginalMember(owner = "bc", name = "s", descriptor = "Z")
    private boolean field857 = false;

    @OriginalMember(owner = "bc", name = "w", descriptor = "I")
    public int field861 = -1;

    @OriginalMember(owner = "bc", name = "x", descriptor = "I")
    public int field862 = -1;

    @OriginalMember(owner = "bc", name = "y", descriptor = "I")
    public int field863 = -1;

    @OriginalMember(owner = "bc", name = "z", descriptor = "Z")
    public boolean field864 = true;

    @OriginalMember(owner = "bc", name = "A", descriptor = "I")
    public int field865 = -1;

    @OriginalMember(owner = "bc", name = "B", descriptor = "I")
    private int field866 = 128;

    @OriginalMember(owner = "bc", name = "C", descriptor = "I")
    private int field867 = 128;

    @OriginalMember(owner = "bc", name = "a", descriptor = "I")
    private static int field839 = 9;

    @OriginalMember(owner = "bc", name = "D", descriptor = "Ls;")
    public static LruCache field868 = new LruCache(-24, 30);

    @OriginalMember(owner = "bc", name = "c", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "bc", name = "g", descriptor = "I")
    private static int field845;

    @OriginalMember(owner = "bc", name = "e", descriptor = "Lkb;")
    private static Packet field843;

    @OriginalMember(owner = "bc", name = "i", descriptor = "Ljava/lang/String;")
    public String field847;

    @OriginalMember(owner = "bc", name = "j", descriptor = "[B")
    public byte[] field848;

    @OriginalMember(owner = "bc", name = "d", descriptor = "[I")
    private static int[] field842;

    @OriginalMember(owner = "bc", name = "l", descriptor = "[I")
    private int[] field850;

    @OriginalMember(owner = "bc", name = "m", descriptor = "[I")
    private int[] field851;

    @OriginalMember(owner = "bc", name = "t", descriptor = "[I")
    private int[] field858;

    @OriginalMember(owner = "bc", name = "u", descriptor = "[I")
    private int[] field859;

    @OriginalMember(owner = "bc", name = "f", descriptor = "[Lbc;")
    private static NpcType[] field844;

    @OriginalMember(owner = "bc", name = "v", descriptor = "[Ljava/lang/String;")
    public String[] field860;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lub;)V")
    public static final void method286(Jagfile arg0) {
        field843 = new Packet((byte) 64, arg0.method257(null, "npc.dat", -31149));
        Packet var1 = new Packet((byte) 64, arg0.method257(null, "npc.idx", -31149));
        field841 = var1.method218();
        field842 = new int[field841];
        int var2 = 2;
        for (int var3 = 0; var3 < field841; var3++) {
            field842[var3] = var2;
            var2 += var1.method218();
        }
        field844 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field844[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(I)V")
    public static final void method287(int arg0) {
        field868 = null;
        field842 = null;
        field844 = null;
        while (arg0 >= 0) {
            field839 = -135;
        }
        field843 = null;
    }

    @OriginalMember(owner = "bc", name = "b", descriptor = "(I)Lbc;")
    public static final NpcType method288(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field844[var1].field846) {
                return field844[var1];
            }
        }
        field845 = (field845 + 1) % 20;
        NpcType var2 = field844[field845] = new NpcType();
        field843.field624 = field842[arg0];
        var2.field846 = arg0;
        var2.method289(field843, true);
        return var2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lkb;Z)V")
    private final void method289(Packet arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method216();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method216();
                    this.field850 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field850[var5] = arg0.method218();
                    }
                } else if (var3 == 2) {
                    this.field847 = arg0.method223();
                } else if (var3 == 3) {
                    this.field848 = arg0.method224((byte) -66);
                } else if (var3 == 12) {
                    this.field849 = arg0.method217();
                } else if (var3 == 13) {
                    this.field852 = arg0.method218();
                } else if (var3 == 14) {
                    this.field853 = arg0.method218();
                } else if (var3 == 16) {
                    this.field857 = true;
                } else if (var3 == 17) {
                    this.field853 = arg0.method218();
                    this.field854 = arg0.method218();
                    this.field855 = arg0.method218();
                    this.field856 = arg0.method218();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field860 == null) {
                        this.field860 = new String[5];
                    }
                    this.field860[var3 - 30] = arg0.method223();
                    if (this.field860[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field860[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method216();
                    this.field858 = new int[var6];
                    this.field859 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field858[var7] = arg0.method218();
                        this.field859[var7] = arg0.method218();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method216();
                    this.field851 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field851[var9] = arg0.method218();
                    }
                } else if (var3 == 90) {
                    this.field861 = arg0.method218();
                } else if (var3 == 91) {
                    this.field862 = arg0.method218();
                } else if (var3 == 92) {
                    this.field863 = arg0.method218();
                } else if (var3 == 93) {
                    this.field864 = false;
                } else if (var3 == 95) {
                    this.field865 = arg0.method218();
                } else if (var3 == 97) {
                    this.field866 = arg0.method218();
                } else if (var3 == 98) {
                    this.field867 = arg0.method218();
                }
            }
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(II[I)Leb;")
    public final Model method290(int arg0, int arg1, int[] arg2) {
        Object var4 = null;
        Model var5 = (Model) field868.method103(this.field846);
        if (var5 == null) {
            Model[] var6 = new Model[this.field850.length];
            for (int var7 = 0; var7 < this.field850.length; var7++) {
                var6[var7] = new Model(this.field850[var7], (byte) 1);
            }
            if (var6.length == 1) {
                var5 = var6[0];
            } else {
                var5 = new Model(-406, var6, var6.length);
            }
            if (this.field858 != null) {
                for (int var8 = 0; var8 < this.field858.length; var8++) {
                    var5.method134(this.field858[var8], this.field859[var8]);
                }
            }
            var5.method127(false);
            var5.method137(64, 850, -30, -50, -30, true);
            field868.method104(var5, this.field846, false);
        }
        Model var9 = new Model(-406, var5, !this.field857);
        if (arg0 != -1 && arg1 != -1) {
            var9.method129(arg0, arg1, arg2, 584);
        } else if (arg0 != -1) {
            var9.method128(arg0, 5565);
        }
        if (this.field866 != 128 || this.field867 != 128) {
            var9.method136(this.field867, this.field866, false, this.field866);
        }
        var9.method124(6);
        var9.field489 = null;
        var9.field488 = null;
        if (this.field849 == 1) {
            var9.field490 = true;
        }
        return var9;
    }

    @OriginalMember(owner = "bc", name = "c", descriptor = "(I)Leb;")
    public final Model method291(int arg0) {
        if (this.field851 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field851.length];
        while (arg0 >= 0) {
            this.field840 = !this.field840;
        }
        for (int var3 = 0; var3 < this.field851.length; var3++) {
            var2[var3] = new Model(this.field851[var3], (byte) 1);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(-406, var2, var2.length);
        }
        if (this.field858 != null) {
            for (int var5 = 0; var5 < this.field858.length; var5++) {
                var4.method134(this.field858[var5], this.field859[var5]);
            }
        }
        return var4;
    }
}
