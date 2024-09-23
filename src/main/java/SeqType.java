import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class SeqType {

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1033 = -1;

    @OriginalMember(owner = "jc", name = "k", descriptor = "Z")
    public boolean field1035 = false;

    @OriginalMember(owner = "jc", name = "l", descriptor = "I")
    public int field1036 = 5;

    @OriginalMember(owner = "jc", name = "m", descriptor = "I")
    public int field1037 = -1;

    @OriginalMember(owner = "jc", name = "n", descriptor = "I")
    public int field1038 = -1;

    @OriginalMember(owner = "jc", name = "o", descriptor = "I")
    public int field1039 = 99;

    @OriginalMember(owner = "jc", name = "a", descriptor = "Z")
    private static boolean field1025 = true;

    @OriginalMember(owner = "jc", name = "b", descriptor = "I")
    private static int field1026 = 473;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "jc", name = "p", descriptor = "Z")
    public static boolean field1040;

    @OriginalMember(owner = "jc", name = "f", descriptor = "[I")
    public int[] field1030;

    @OriginalMember(owner = "jc", name = "g", descriptor = "[I")
    public int[] field1031;

    @OriginalMember(owner = "jc", name = "h", descriptor = "[I")
    public int[] field1032;

    @OriginalMember(owner = "jc", name = "j", descriptor = "[I")
    public int[] field1034;

    @OriginalMember(owner = "jc", name = "d", descriptor = "[Ljc;")
    public static SeqType[] field1028;

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Lub;I)V")
    public static void method326(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(363, arg0.read("seq.dat", null, (byte) 2));
        if (arg1 <= 0) {
            field1025 = !field1025;
        }
        field1027 = var2.method218();
        if (field1028 == null) {
            field1028 = new SeqType[field1027];
        }
        for (int var3 = 0; var3 < field1027; var3++) {
            if (field1028[var3] == null) {
                field1028[var3] = new SeqType();
            }
            field1028[var3].method327(false, var2);
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ZLkb;)V")
    public void method327(boolean arg0, Packet arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method216();
                if (var4 == 0) {
                    if (this.field1029 == 0) {
                        this.field1029 = 1;
                        this.field1030 = new int[1];
                        this.field1030[0] = -1;
                        this.field1031 = new int[1];
                        this.field1031[0] = -1;
                        this.field1032 = new int[1];
                        this.field1032[0] = -1;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1029 = arg1.method216();
                    this.field1030 = new int[this.field1029];
                    this.field1031 = new int[this.field1029];
                    this.field1032 = new int[this.field1029];
                    for (int var5 = 0; var5 < this.field1029; var5++) {
                        this.field1030[var5] = arg1.method218();
                        this.field1031[var5] = arg1.method218();
                        if (this.field1031[var5] == 65535) {
                            this.field1031[var5] = -1;
                        }
                        this.field1032[var5] = arg1.method218();
                        if (this.field1032[var5] == 0) {
                            this.field1032[var5] = AnimFrame.instances[this.field1030[var5]].delay;
                        }
                        if (this.field1032[var5] == 0) {
                            this.field1032[var5] = 1;
                        }
                    }
                } else if (var4 == 2) {
                    this.field1033 = arg1.method218();
                } else if (var4 == 3) {
                    int var6 = arg1.method216();
                    this.field1034 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1034[var7] = arg1.method216();
                    }
                    this.field1034[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1035 = true;
                } else if (var4 == 5) {
                    this.field1036 = arg1.method216();
                } else if (var4 == 6) {
                    this.field1037 = arg1.method218();
                } else if (var4 == 7) {
                    this.field1038 = arg1.method218();
                } else if (var4 == 8) {
                    this.field1039 = arg1.method216();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
