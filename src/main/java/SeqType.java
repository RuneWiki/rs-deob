import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class SeqType {

    @OriginalMember(owner = "fc", name = "h", descriptor = "I")
    public int field932 = -1;

    @OriginalMember(owner = "fc", name = "k", descriptor = "I")
    public int field935 = 5;

    @OriginalMember(owner = "fc", name = "l", descriptor = "I")
    public int field936 = -1;

    @OriginalMember(owner = "fc", name = "m", descriptor = "I")
    public int field937 = -1;

    @OriginalMember(owner = "fc", name = "n", descriptor = "I")
    public int field938 = 99;

    @OriginalMember(owner = "fc", name = "a", descriptor = "I")
    private static int field925 = 268;

    @OriginalMember(owner = "fc", name = "b", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "fc", name = "d", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "fc", name = "j", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "fc", name = "o", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "fc", name = "e", descriptor = "[I")
    public int[] field929;

    @OriginalMember(owner = "fc", name = "f", descriptor = "[I")
    public int[] field930;

    @OriginalMember(owner = "fc", name = "g", descriptor = "[I")
    public int[] field931;

    @OriginalMember(owner = "fc", name = "i", descriptor = "[I")
    public int[] field933;

    @OriginalMember(owner = "fc", name = "c", descriptor = "[Lfc;")
    public static SeqType[] field927;

    @OriginalMember(owner = "fc", name = "a", descriptor = "(Ltb;I)V")
    public static void method279(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method225(0, null, "seq.dat"), (byte) 63);
        if (arg1 != -47511) {
            return;
        }
        field926 = var2.method187();
        if (field927 == null) {
            field927 = new SeqType[field926];
        }
        for (int var3 = 0; var3 < field926; var3++) {
            if (field927[var3] == null) {
                field927[var3] = new SeqType();
            }
            field927[var3].method280((byte) 4, var2);
        }
    }

    @OriginalMember(owner = "fc", name = "a", descriptor = "(BLjb;)V")
    public void method280(byte arg0, Packet arg1) {
        if (arg0 == 4) {
            boolean var3 = false;
        } else {
            field925 = -49;
        }
        while (true) {
            while (true) {
                int var4 = arg1.method185();
                if (var4 == 0) {
                    if (this.field928 == 0) {
                        this.field928 = 1;
                        this.field929 = new int[1];
                        this.field929[0] = -1;
                        this.field930 = new int[1];
                        this.field930[0] = -1;
                        this.field931 = new int[1];
                        this.field931[0] = -1;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field928 = arg1.method185();
                    this.field929 = new int[this.field928];
                    this.field930 = new int[this.field928];
                    this.field931 = new int[this.field928];
                    for (int var5 = 0; var5 < this.field928; var5++) {
                        this.field929[var5] = arg1.method187();
                        this.field930[var5] = arg1.method187();
                        if (this.field930[var5] == 65535) {
                            this.field930[var5] = -1;
                        }
                        this.field931[var5] = arg1.method187();
                        if (this.field931[var5] == 0) {
                            this.field931[var5] = AnimFrame.field73[this.field929[var5]].field74;
                        }
                        if (this.field931[var5] == 0) {
                            this.field931[var5] = 1;
                        }
                    }
                } else if (var4 == 2) {
                    this.field932 = arg1.method187();
                } else if (var4 == 3) {
                    int var6 = arg1.method185();
                    this.field933 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field933[var7] = arg1.method185();
                    }
                    this.field933[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field934 = arg1.method187();
                } else if (var4 == 5) {
                    this.field935 = arg1.method185();
                } else if (var4 == 6) {
                    this.field936 = arg1.method187();
                } else if (var4 == 7) {
                    this.field937 = arg1.method187();
                } else if (var4 == 8) {
                    this.field938 = arg1.method185();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
