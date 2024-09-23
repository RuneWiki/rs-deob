import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class NpcType {

    @OriginalMember(owner = "bc", name = "g", descriptor = "J")
    private long field828 = -1L;

    @OriginalMember(owner = "bc", name = "j", descriptor = "B")
    public byte field831 = 1;

    @OriginalMember(owner = "bc", name = "m", descriptor = "I")
    public int field834 = -1;

    @OriginalMember(owner = "bc", name = "n", descriptor = "I")
    public int field835 = -1;

    @OriginalMember(owner = "bc", name = "o", descriptor = "I")
    public int field836 = -1;

    @OriginalMember(owner = "bc", name = "p", descriptor = "I")
    public int field837 = -1;

    @OriginalMember(owner = "bc", name = "q", descriptor = "I")
    public int field838 = -1;

    @OriginalMember(owner = "bc", name = "r", descriptor = "Z")
    private boolean field839 = false;

    @OriginalMember(owner = "bc", name = "v", descriptor = "I")
    public int field843 = -1;

    @OriginalMember(owner = "bc", name = "w", descriptor = "I")
    public int field844 = -1;

    @OriginalMember(owner = "bc", name = "x", descriptor = "I")
    public int field845 = -1;

    @OriginalMember(owner = "bc", name = "y", descriptor = "Z")
    public boolean field846 = true;

    @OriginalMember(owner = "bc", name = "z", descriptor = "I")
    public int field847 = -1;

    @OriginalMember(owner = "bc", name = "A", descriptor = "I")
    private int field848 = 128;

    @OriginalMember(owner = "bc", name = "B", descriptor = "I")
    private int field849 = 128;

    @OriginalMember(owner = "bc", name = "a", descriptor = "I")
    private static int field822 = -31746;

    @OriginalMember(owner = "bc", name = "C", descriptor = "Ls;")
    public static LruCache field850 = new LruCache(30, 4);

    @OriginalMember(owner = "bc", name = "b", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "bc", name = "f", descriptor = "I")
    private static int field827;

    @OriginalMember(owner = "bc", name = "d", descriptor = "Lkb;")
    private static Packet field825;

    @OriginalMember(owner = "bc", name = "h", descriptor = "Ljava/lang/String;")
    public String field829;

    @OriginalMember(owner = "bc", name = "i", descriptor = "[B")
    public byte[] field830;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[I")
    private static int[] field824;

    @OriginalMember(owner = "bc", name = "k", descriptor = "[I")
    private int[] field832;

    @OriginalMember(owner = "bc", name = "l", descriptor = "[I")
    private int[] field833;

    @OriginalMember(owner = "bc", name = "s", descriptor = "[I")
    private int[] field840;

    @OriginalMember(owner = "bc", name = "t", descriptor = "[I")
    private int[] field841;

    @OriginalMember(owner = "bc", name = "e", descriptor = "[Lbc;")
    private static NpcType[] field826;

    @OriginalMember(owner = "bc", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field842;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lub;)V")
    public static final void method279(Jagfile arg0) {
        field825 = new Packet(575, arg0.method250(null, 3, "npc.dat"));
        Packet var1 = new Packet(575, arg0.method250(null, 3, "npc.idx"));
        field823 = var1.method211();
        field824 = new int[field823];
        int var2 = 2;
        for (int var3 = 0; var3 < field823; var3++) {
            field824[var3] = var2;
            var2 += var1.method211();
        }
        field826 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field826[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Z)V")
    public static final void method280(boolean arg0) {
        field850 = null;
        if (!arg0) {
            field822 = -171;
        }
        field824 = null;
        field826 = null;
        field825 = null;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(I)Lbc;")
    public static final NpcType method281(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field826[var1].field828) {
                return field826[var1];
            }
        }
        field827 = (field827 + 1) % 20;
        NpcType var2 = field826[field827] = new NpcType();
        field825.field612 = field824[arg0];
        var2.field828 = arg0;
        var2.method282(field825, (byte) 6);
        return var2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lkb;B)V")
    private final void method282(Packet arg0, byte arg1) {
        if (arg1 != 6) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = arg0.method209();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg0.method209();
                    this.field832 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field832[var6] = arg0.method211();
                    }
                } else if (var4 == 2) {
                    this.field829 = arg0.method216();
                } else if (var4 == 3) {
                    this.field830 = arg0.method217(true);
                } else if (var4 == 12) {
                    this.field831 = arg0.method210();
                } else if (var4 == 13) {
                    this.field834 = arg0.method211();
                } else if (var4 == 14) {
                    this.field835 = arg0.method211();
                } else if (var4 == 16) {
                    this.field839 = true;
                } else if (var4 == 17) {
                    this.field835 = arg0.method211();
                    this.field836 = arg0.method211();
                    this.field837 = arg0.method211();
                    this.field838 = arg0.method211();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field842 == null) {
                        this.field842 = new String[5];
                    }
                    this.field842[var4 - 30] = arg0.method216();
                    if (this.field842[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field842[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg0.method209();
                    this.field840 = new int[var7];
                    this.field841 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field840[var8] = arg0.method211();
                        this.field841[var8] = arg0.method211();
                    }
                } else if (var4 == 60) {
                    int var9 = arg0.method209();
                    this.field833 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field833[var10] = arg0.method211();
                    }
                } else if (var4 == 90) {
                    this.field843 = arg0.method211();
                } else if (var4 == 91) {
                    this.field844 = arg0.method211();
                } else if (var4 == 92) {
                    this.field845 = arg0.method211();
                } else if (var4 == 93) {
                    this.field846 = false;
                } else if (var4 == 95) {
                    this.field847 = arg0.method211();
                } else if (var4 == 97) {
                    this.field848 = arg0.method211();
                } else if (var4 == 98) {
                    this.field849 = arg0.method211();
                }
            }
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(II[I)Leb;")
    public final Model method283(int arg0, int arg1, int[] arg2) {
        Object var4 = null;
        Model var5 = (Model) field850.method102(this.field828);
        if (var5 == null) {
            Model[] var6 = new Model[this.field832.length];
            for (int var7 = 0; var7 < this.field832.length; var7++) {
                var6[var7] = new Model(-26552, this.field832[var7]);
            }
            if (var6.length == 1) {
                var5 = var6[0];
            } else {
                var5 = new Model(0, var6, var6.length);
            }
            if (this.field840 != null) {
                for (int var8 = 0; var8 < this.field840.length; var8++) {
                    var5.method133(this.field840[var8], this.field841[var8]);
                }
            }
            var5.method126(true);
            var5.method136(64, 850, -30, -50, -30, true);
            field850.method103(3, var5, this.field828);
        }
        Model var9 = new Model(0, var5, !this.field839);
        if (arg0 != -1 && arg1 != -1) {
            var9.method128(arg2, arg1, true, arg0);
        } else if (arg0 != -1) {
            var9.method127(arg0, -227);
        }
        if (this.field848 != 128 || this.field849 != 128) {
            var9.method135(this.field848, this.field848, this.field849, -27239);
        }
        var9.method123(-220);
        var9.field480 = null;
        var9.field479 = null;
        if (this.field831 == 1) {
            var9.field481 = true;
        }
        return var9;
    }

    @OriginalMember(owner = "bc", name = "b", descriptor = "(I)Leb;")
    public final Model method284(int arg0) {
        if (this.field833 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field833.length];
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field833.length; var3++) {
            var2[var3] = new Model(-26552, this.field833[var3]);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(0, var2, var2.length);
        }
        if (this.field840 != null) {
            for (int var5 = 0; var5 < this.field840.length; var5++) {
                var4.method133(this.field840[var5], this.field841[var5]);
            }
        }
        return var4;
    }
}
