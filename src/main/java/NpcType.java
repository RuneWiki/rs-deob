import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class NpcType {

    @OriginalMember(owner = "yb", name = "f", descriptor = "J")
    private long field778 = -1L;

    @OriginalMember(owner = "yb", name = "i", descriptor = "B")
    public byte field781 = 1;

    @OriginalMember(owner = "yb", name = "l", descriptor = "I")
    public int field784 = -1;

    @OriginalMember(owner = "yb", name = "m", descriptor = "I")
    public int field785 = -1;

    @OriginalMember(owner = "yb", name = "n", descriptor = "I")
    public int field786 = -1;

    @OriginalMember(owner = "yb", name = "o", descriptor = "I")
    public int field787 = -1;

    @OriginalMember(owner = "yb", name = "p", descriptor = "I")
    public int field788 = -1;

    @OriginalMember(owner = "yb", name = "q", descriptor = "Z")
    private boolean field789 = false;

    @OriginalMember(owner = "yb", name = "u", descriptor = "I")
    public int field793 = -1;

    @OriginalMember(owner = "yb", name = "v", descriptor = "I")
    public int field794 = -1;

    @OriginalMember(owner = "yb", name = "w", descriptor = "I")
    public int field795 = -1;

    @OriginalMember(owner = "yb", name = "x", descriptor = "Z")
    public boolean field796 = true;

    @OriginalMember(owner = "yb", name = "y", descriptor = "I")
    public int field797 = -1;

    @OriginalMember(owner = "yb", name = "z", descriptor = "I")
    private int field798 = 128;

    @OriginalMember(owner = "yb", name = "A", descriptor = "I")
    private int field799 = 128;

    @OriginalMember(owner = "yb", name = "B", descriptor = "Ls;")
    public static LruCache field800 = new LruCache(-24094, 30);

    @OriginalMember(owner = "yb", name = "a", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "yb", name = "e", descriptor = "I")
    private static int field777;

    @OriginalMember(owner = "yb", name = "c", descriptor = "Lkb;")
    private static Packet field775;

    @OriginalMember(owner = "yb", name = "g", descriptor = "Ljava/lang/String;")
    public String field779;

    @OriginalMember(owner = "yb", name = "h", descriptor = "[B")
    public byte[] field780;

    @OriginalMember(owner = "yb", name = "b", descriptor = "[I")
    private static int[] field774;

    @OriginalMember(owner = "yb", name = "j", descriptor = "[I")
    private int[] field782;

    @OriginalMember(owner = "yb", name = "k", descriptor = "[I")
    private int[] field783;

    @OriginalMember(owner = "yb", name = "r", descriptor = "[I")
    private int[] field790;

    @OriginalMember(owner = "yb", name = "s", descriptor = "[I")
    private int[] field791;

    @OriginalMember(owner = "yb", name = "d", descriptor = "[Lyb;")
    private static NpcType[] field776;

    @OriginalMember(owner = "yb", name = "t", descriptor = "[Ljava/lang/String;")
    public String[] field792;

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Lub;)V")
    public static final void method257(Jagfile arg0) {
        field775 = new Packet(arg0.method242((byte) 6, null, "npc.dat"), 4);
        Packet var1 = new Packet(arg0.method242((byte) 6, null, "npc.idx"), 4);
        field773 = var1.method203();
        field774 = new int[field773];
        int var2 = 2;
        for (int var3 = 0; var3 < field773; var3++) {
            field774[var3] = var2;
            var2 += var1.method203();
        }
        field776 = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field776[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(I)V")
    public static final void method258(int arg0) {
        if (arg0 <= 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
        field800 = null;
        field774 = null;
        field776 = null;
        field775 = null;
    }

    @OriginalMember(owner = "yb", name = "b", descriptor = "(I)Lyb;")
    public static final NpcType method259(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field776[var1].field778) {
                return field776[var1];
            }
        }
        field777 = (field777 + 1) % 20;
        NpcType var2 = field776[field777] = new NpcType();
        field775.field606 = field774[arg0];
        var2.field778 = arg0;
        var2.method260(213, field775);
        return var2;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(ILkb;)V")
    private final void method260(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method201();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.method201();
                    this.field782 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field782[var6] = arg1.method203();
                    }
                } else if (var4 == 2) {
                    this.field779 = arg1.method208();
                } else if (var4 == 3) {
                    this.field780 = arg1.method209(true);
                } else if (var4 == 12) {
                    this.field781 = arg1.method202();
                } else if (var4 == 13) {
                    this.field784 = arg1.method203();
                } else if (var4 == 14) {
                    this.field785 = arg1.method203();
                } else if (var4 == 16) {
                    this.field789 = true;
                } else if (var4 == 17) {
                    this.field785 = arg1.method203();
                    this.field786 = arg1.method203();
                    this.field787 = arg1.method203();
                    this.field788 = arg1.method203();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field792 == null) {
                        this.field792 = new String[5];
                    }
                    this.field792[var4 - 30] = arg1.method208();
                } else if (var4 == 40) {
                    int var7 = arg1.method201();
                    this.field790 = new int[var7];
                    this.field791 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field790[var8] = arg1.method203();
                        this.field791[var8] = arg1.method203();
                    }
                } else if (var4 == 60) {
                    int var9 = arg1.method201();
                    this.field783 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field783[var10] = arg1.method203();
                    }
                } else if (var4 == 90) {
                    this.field793 = arg1.method203();
                } else if (var4 == 91) {
                    this.field794 = arg1.method203();
                } else if (var4 == 92) {
                    this.field795 = arg1.method203();
                } else if (var4 == 93) {
                    this.field796 = false;
                } else if (var4 == 95) {
                    this.field797 = arg1.method203();
                } else if (var4 == 97) {
                    this.field798 = arg1.method203();
                } else if (var4 == 98) {
                    this.field799 = arg1.method203();
                }
            }
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(II[I)Leb;")
    public final Model method261(int arg0, int arg1, int[] arg2) {
        Object var4 = null;
        Model var5 = (Model) field800.method99(this.field778);
        if (var5 == null) {
            Model[] var6 = new Model[this.field782.length];
            for (int var7 = 0; var7 < this.field782.length; var7++) {
                var6[var7] = new Model(this.field782[var7], 298);
            }
            if (var6.length == 1) {
                var5 = var6[0];
            } else {
                var5 = new Model(false, var6.length, var6);
            }
            if (this.field790 != null) {
                for (int var8 = 0; var8 < this.field790.length; var8++) {
                    var5.method129(this.field790[var8], this.field791[var8]);
                }
            }
            var5.method122((byte) 3);
            var5.method132(64, 850, -30, -50, -30, true);
            field800.method100(this.field778, 7, var5);
        }
        Model var9 = new Model(false, !this.field789, var5);
        if (arg0 != -1 && arg1 != -1) {
            var9.method124(arg0, 2, arg2, arg1);
        } else if (arg0 != -1) {
            var9.method123(7, arg0);
        }
        if (this.field798 != 128 || this.field799 != 128) {
            var9.method131(728, this.field798, this.field799, this.field798);
        }
        var9.method120(569);
        var9.field469 = null;
        var9.field468 = null;
        if (this.field781 == 1) {
            var9.field470 = true;
        }
        return var9;
    }

    @OriginalMember(owner = "yb", name = "c", descriptor = "(I)Leb;")
    public final Model method262(int arg0) {
        if (this.field783 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field783.length];
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field783.length; var3++) {
            var2[var3] = new Model(this.field783[var3], 298);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(false, var2.length, var2);
        }
        if (this.field790 != null) {
            for (int var5 = 0; var5 < this.field790.length; var5++) {
                var4.method129(this.field790[var5], this.field791[var5]);
            }
        }
        return var4;
    }
}
