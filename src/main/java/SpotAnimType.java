import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class SpotAnimType {

    @OriginalMember(owner = "kc", name = "h", descriptor = "Z")
    public boolean field1019 = false;

    @OriginalMember(owner = "kc", name = "i", descriptor = "[I")
    public int[] field1020 = new int[6];

    @OriginalMember(owner = "kc", name = "j", descriptor = "[I")
    public int[] field1021 = new int[6];

    @OriginalMember(owner = "kc", name = "k", descriptor = "I")
    public int field1022 = 128;

    @OriginalMember(owner = "kc", name = "l", descriptor = "I")
    public int field1023 = 128;

    @OriginalMember(owner = "kc", name = "a", descriptor = "Z")
    private static boolean field1012 = true;

    @OriginalMember(owner = "kc", name = "b", descriptor = "I")
    private static int field1013 = -251;

    @OriginalMember(owner = "kc", name = "p", descriptor = "Ls;")
    public static LruCache field1027 = new LruCache(30, 4);

    @OriginalMember(owner = "kc", name = "c", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "kc", name = "e", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "kc", name = "f", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "kc", name = "m", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "kc", name = "n", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "kc", name = "o", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "kc", name = "g", descriptor = "Ljc;")
    public SeqType field1018;

    @OriginalMember(owner = "kc", name = "d", descriptor = "[Lkc;")
    public static SpotAnimType[] field1015;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ILub;)V")
    public static void method320(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(575, arg1.method250(null, 3, "spotanim.dat"));
        field1014 = var2.method211();
        if (arg0 != 9) {
            field1012 = !field1012;
        }
        if (field1015 == null) {
            field1015 = new SpotAnimType[field1014];
        }
        for (int var3 = 0; var3 < field1014; var3++) {
            if (field1015[var3] == null) {
                field1015[var3] = new SpotAnimType();
            }
            field1015[var3].field1016 = var3;
            field1015[var3].method321(var2, (byte) 6);
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(Lkb;B)V")
    public void method321(Packet arg0, byte arg1) {
        if (arg1 != 6) {
            field1013 = 454;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method209();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1017 = arg0.method211();
                } else if (var3 == 2) {
                    this.field1018 = SeqType.field999[arg0.method211()];
                } else if (var3 == 3) {
                    this.field1019 = true;
                } else if (var3 == 4) {
                    this.field1022 = arg0.method211();
                } else if (var3 == 5) {
                    this.field1023 = arg0.method211();
                } else if (var3 == 6) {
                    this.field1024 = arg0.method211();
                } else if (var3 == 7) {
                    this.field1025 = arg0.method209();
                } else if (var3 == 8) {
                    this.field1026 = arg0.method209();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1020[var3 - 40] = arg0.method211();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1021[var3 - 50] = arg0.method211();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "()Leb;")
    public Model method322() {
        Model var1 = (Model) field1027.method102((long) this.field1016);
        if (var1 != null) {
            return var1;
        }
        Model var2 = new Model(-26552, this.field1017);
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1020[0] != 0) {
                var2.method133(this.field1020[var3], this.field1021[var3]);
            }
        }
        field1027.method103(3, var2, (long) this.field1016);
        return var2;
    }
}
