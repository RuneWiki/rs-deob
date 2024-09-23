import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class NpcType {

    @OriginalMember(owner = "bc", name = "c", descriptor = "Z")
    private boolean field854 = false;

    @OriginalMember(owner = "bc", name = "k", descriptor = "J")
    private long field862 = -1L;

    @OriginalMember(owner = "bc", name = "n", descriptor = "B")
    public byte field865 = 1;

    @OriginalMember(owner = "bc", name = "q", descriptor = "I")
    public int field868 = -1;

    @OriginalMember(owner = "bc", name = "r", descriptor = "I")
    public int field869 = -1;

    @OriginalMember(owner = "bc", name = "s", descriptor = "I")
    public int field870 = -1;

    @OriginalMember(owner = "bc", name = "t", descriptor = "I")
    public int field871 = -1;

    @OriginalMember(owner = "bc", name = "u", descriptor = "I")
    public int field872 = -1;

    @OriginalMember(owner = "bc", name = "v", descriptor = "Z")
    private boolean field873 = false;

    @OriginalMember(owner = "bc", name = "z", descriptor = "I")
    public int field877 = -1;

    @OriginalMember(owner = "bc", name = "A", descriptor = "I")
    public int field878 = -1;

    @OriginalMember(owner = "bc", name = "B", descriptor = "I")
    public int field879 = -1;

    @OriginalMember(owner = "bc", name = "C", descriptor = "Z")
    public boolean field880 = true;

    @OriginalMember(owner = "bc", name = "D", descriptor = "I")
    public int field881 = -1;

    @OriginalMember(owner = "bc", name = "E", descriptor = "I")
    private int field882 = 128;

    @OriginalMember(owner = "bc", name = "F", descriptor = "I")
    private int field883 = 128;

    @OriginalMember(owner = "bc", name = "a", descriptor = "B")
    private static byte field852 = 8;

    @OriginalMember(owner = "bc", name = "b", descriptor = "B")
    private static byte field853 = 4;

    @OriginalMember(owner = "bc", name = "G", descriptor = "Ls;")
    public static LruCache field884 = new LruCache(2, 30);

    @OriginalMember(owner = "bc", name = "f", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    private static int field861;

    @OriginalMember(owner = "bc", name = "h", descriptor = "Lkb;")
    private static Packet field859;

    @OriginalMember(owner = "bc", name = "l", descriptor = "Ljava/lang/String;")
    public String field863;

    @OriginalMember(owner = "bc", name = "d", descriptor = "Z")
    private static boolean field855;

    @OriginalMember(owner = "bc", name = "e", descriptor = "Z")
    private static boolean field856;

    @OriginalMember(owner = "bc", name = "m", descriptor = "[B")
    public byte[] field864;

    @OriginalMember(owner = "bc", name = "g", descriptor = "[I")
    private static int[] field858;

    @OriginalMember(owner = "bc", name = "o", descriptor = "[I")
    private int[] field866;

    @OriginalMember(owner = "bc", name = "p", descriptor = "[I")
    private int[] field867;

    @OriginalMember(owner = "bc", name = "w", descriptor = "[I")
    private int[] field874;

    @OriginalMember(owner = "bc", name = "x", descriptor = "[I")
    private int[] field875;

    @OriginalMember(owner = "bc", name = "i", descriptor = "[Lbc;")
    private static NpcType[] field860;

    @OriginalMember(owner = "bc", name = "y", descriptor = "[Ljava/lang/String;")
    public String[] field876;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lub;)V")
    public static final void method279(Jagfile arg0) {
        field859 = new Packet(arg0.method250(field853, "npc.dat", null), 0);
        Packet var1 = new Packet(arg0.method250(field853, "npc.idx", null), 0);
        field857 = var1.method211();
        field858 = new int[field857];
        int var2 = 2;
        for (int var3 = 0; var3 < field857; var3++) {
            field858[var3] = var2;
            var2 += var1.method211();
        }
        field860 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field860[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Z)V")
    public static final void method280(boolean arg0) {
        field884 = null;
        field858 = null;
        field860 = null;
        if (arg0) {
            field856 = !field856;
        }
        field859 = null;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(I)Lbc;")
    public static final NpcType method281(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field860[var1].field862) {
                return field860[var1];
            }
        }
        field861 = (field861 + 1) % 20;
        NpcType var2 = field860[field861] = new NpcType();
        field859.field623 = field858[arg0];
        var2.field862 = arg0;
        var2.method282(field852, field859);
        return var2;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(BLkb;)V")
    private final void method282(byte arg0, Packet arg1) {
        if (arg0 == 8) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            while (true) {
                int var5 = arg1.method209();
                if (var5 == 0) {
                    return;
                }
                if (var5 == 1) {
                    int var6 = arg1.method209();
                    this.field866 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field866[var7] = arg1.method211();
                    }
                } else if (var5 == 2) {
                    this.field863 = arg1.method216();
                } else if (var5 == 3) {
                    this.field864 = arg1.method217(0);
                } else if (var5 == 12) {
                    this.field865 = arg1.method210();
                } else if (var5 == 13) {
                    this.field868 = arg1.method211();
                } else if (var5 == 14) {
                    this.field869 = arg1.method211();
                } else if (var5 == 16) {
                    this.field873 = true;
                } else if (var5 == 17) {
                    this.field869 = arg1.method211();
                    this.field870 = arg1.method211();
                    this.field871 = arg1.method211();
                    this.field872 = arg1.method211();
                } else if (var5 >= 30 && var5 < 40) {
                    if (this.field876 == null) {
                        this.field876 = new String[5];
                    }
                    this.field876[var5 - 30] = arg1.method216();
                    if (this.field876[var5 - 30].equalsIgnoreCase("hidden")) {
                        this.field876[var5 - 30] = null;
                    }
                } else if (var5 == 40) {
                    int var8 = arg1.method209();
                    this.field874 = new int[var8];
                    this.field875 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field874[var9] = arg1.method211();
                        this.field875[var9] = arg1.method211();
                    }
                } else if (var5 == 60) {
                    int var10 = arg1.method209();
                    this.field867 = new int[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field867[var11] = arg1.method211();
                    }
                } else if (var5 == 90) {
                    this.field877 = arg1.method211();
                } else if (var5 == 91) {
                    this.field878 = arg1.method211();
                } else if (var5 == 92) {
                    this.field879 = arg1.method211();
                } else if (var5 == 93) {
                    this.field880 = false;
                } else if (var5 == 95) {
                    this.field881 = arg1.method211();
                } else if (var5 == 97) {
                    this.field882 = arg1.method211();
                } else if (var5 == 98) {
                    this.field883 = arg1.method211();
                }
            }
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(II[I)Leb;")
    public final Model method283(int arg0, int arg1, int[] arg2) {
        Object var4 = null;
        Model var5 = (Model) field884.method102(this.field862);
        if (var5 == null) {
            Model[] var6 = new Model[this.field866.length];
            for (int var7 = 0; var7 < this.field866.length; var7++) {
                var6[var7] = new Model(this.field866[var7], 6);
            }
            if (var6.length == 1) {
                var5 = var6[0];
            } else {
                var5 = new Model(20363, var6, var6.length);
            }
            if (this.field874 != null) {
                for (int var8 = 0; var8 < this.field874.length; var8++) {
                    var5.method133(this.field874[var8], this.field875[var8]);
                }
            }
            var5.method126(797);
            var5.method136(64, 850, -30, -50, -30, true);
            field884.method103(var5, this.field862, -21658);
        }
        Model var9 = new Model(20363, var5, !this.field873);
        if (arg0 != -1 && arg1 != -1) {
            var9.method128(arg1, arg0, (byte) 7, arg2);
        } else if (arg0 != -1) {
            var9.method127(arg0, (byte) -89);
        }
        if (this.field882 != 128 || this.field883 != 128) {
            var9.method135(this.field883, -221, this.field882, this.field882);
        }
        var9.method123(field855);
        var9.field486 = null;
        var9.field485 = null;
        if (this.field865 == 1) {
            var9.field487 = true;
        }
        return var9;
    }

    @OriginalMember(owner = "bc", name = "b", descriptor = "(I)Leb;")
    public final Model method284(int arg0) {
        if (this.field867 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field867.length];
        if (arg0 <= 0) {
            this.field854 = !this.field854;
        }
        for (int var3 = 0; var3 < this.field867.length; var3++) {
            var2[var3] = new Model(this.field867[var3], 6);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(20363, var2, var2.length);
        }
        if (this.field874 != null) {
            for (int var5 = 0; var5 < this.field874.length; var5++) {
                var4.method133(this.field874[var5], this.field875[var5]);
            }
        }
        return var4;
    }
}
