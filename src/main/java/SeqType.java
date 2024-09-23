import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class SeqType {

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1023 = -1;

    @OriginalMember(owner = "jc", name = "j", descriptor = "Z")
    public boolean field1025 = false;

    @OriginalMember(owner = "jc", name = "k", descriptor = "I")
    public int field1026 = 5;

    @OriginalMember(owner = "jc", name = "l", descriptor = "I")
    public int field1027 = -1;

    @OriginalMember(owner = "jc", name = "m", descriptor = "I")
    public int field1028 = -1;

    @OriginalMember(owner = "jc", name = "n", descriptor = "I")
    public int field1029 = 99;

    @OriginalMember(owner = "jc", name = "a", descriptor = "I")
    private static int field1016 = -23163;

    @OriginalMember(owner = "jc", name = "b", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "jc", name = "o", descriptor = "Z")
    public static boolean field1030;

    @OriginalMember(owner = "jc", name = "e", descriptor = "[I")
    public int[] field1020;

    @OriginalMember(owner = "jc", name = "f", descriptor = "[I")
    public int[] field1021;

    @OriginalMember(owner = "jc", name = "g", descriptor = "[I")
    public int[] field1022;

    @OriginalMember(owner = "jc", name = "i", descriptor = "[I")
    public int[] field1024;

    @OriginalMember(owner = "jc", name = "c", descriptor = "[Ljc;")
    public static SeqType[] field1018;

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ILub;)V")
    public static void method326(int arg0, Jagfile arg1) {
        if (arg0 != -5880) {
            return;
        }
        Packet var2 = new Packet((byte) 64, arg1.method257(null, "seq.dat", -31149));
        field1017 = var2.method218();
        if (field1018 == null) {
            field1018 = new SeqType[field1017];
        }
        for (int var3 = 0; var3 < field1017; var3++) {
            if (field1018[var3] == null) {
                field1018[var3] = new SeqType();
            }
            field1018[var3].method327(var2, true);
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Lkb;Z)V")
    public void method327(Packet arg0, boolean arg1) {
        if (!arg1) {
            field1016 = 194;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method216();
                if (var3 == 0) {
                    if (this.field1019 == 0) {
                        this.field1019 = 1;
                        this.field1020 = new int[1];
                        this.field1020[0] = -1;
                        this.field1021 = new int[1];
                        this.field1021[0] = -1;
                        this.field1022 = new int[1];
                        this.field1022[0] = -1;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1019 = arg0.method216();
                    this.field1020 = new int[this.field1019];
                    this.field1021 = new int[this.field1019];
                    this.field1022 = new int[this.field1019];
                    for (int var4 = 0; var4 < this.field1019; var4++) {
                        this.field1020[var4] = arg0.method218();
                        this.field1021[var4] = arg0.method218();
                        if (this.field1021[var4] == 65535) {
                            this.field1021[var4] = -1;
                        }
                        this.field1022[var4] = arg0.method218();
                        if (this.field1022[var4] == 0) {
                            this.field1022[var4] = AnimFrame.field89[this.field1020[var4]].field90;
                        }
                        if (this.field1022[var4] == 0) {
                            this.field1022[var4] = 1;
                        }
                    }
                } else if (var3 == 2) {
                    this.field1023 = arg0.method218();
                } else if (var3 == 3) {
                    int var5 = arg0.method216();
                    this.field1024 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1024[var6] = arg0.method216();
                    }
                    this.field1024[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1025 = true;
                } else if (var3 == 5) {
                    this.field1026 = arg0.method216();
                } else if (var3 == 6) {
                    this.field1027 = arg0.method218();
                } else if (var3 == 7) {
                    this.field1028 = arg0.method218();
                } else if (var3 == 8) {
                    this.field1029 = arg0.method216();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
