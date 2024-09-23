import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mc")
public class SeqType {

    @OriginalMember(owner = "mc", name = "g", descriptor = "I")
    public int field1074 = -1;

    @OriginalMember(owner = "mc", name = "i", descriptor = "Z")
    public boolean field1076 = false;

    @OriginalMember(owner = "mc", name = "j", descriptor = "I")
    public int field1077 = 5;

    @OriginalMember(owner = "mc", name = "k", descriptor = "I")
    public int field1078 = -1;

    @OriginalMember(owner = "mc", name = "l", descriptor = "I")
    public int field1079 = -1;

    @OriginalMember(owner = "mc", name = "m", descriptor = "I")
    public int field1080 = 99;

    @OriginalMember(owner = "mc", name = "a", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "mc", name = "c", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "mc", name = "n", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "mc", name = "d", descriptor = "[I")
    public int[] field1071;

    @OriginalMember(owner = "mc", name = "e", descriptor = "[I")
    public int[] field1072;

    @OriginalMember(owner = "mc", name = "f", descriptor = "[I")
    private int[] field1073;

    @OriginalMember(owner = "mc", name = "h", descriptor = "[I")
    public int[] field1075;

    @OriginalMember(owner = "mc", name = "b", descriptor = "[Lmc;")
    public static SeqType[] field1069;

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lyb;B)V")
    public static void method368(Jagfile arg0, byte arg1) {
        Packet var2 = new Packet(699, arg0.method295("seq.dat", null));
        field1068 = var2.method233();
        if (arg1 != 7) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1069 == null) {
            field1069 = new SeqType[field1068];
        }
        for (int var4 = 0; var4 < field1068; var4++) {
            if (field1069[var4] == null) {
                field1069[var4] = new SeqType();
            }
            field1069[var4].method370(false, var2);
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(II)I")
    public int method369(int arg0, int arg1) {
        int var3 = this.field1073[arg1];
        if (arg0 != 7) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var3 == 0) {
            AnimFrame var5 = AnimFrame.method60(this.field1071[arg1], -30419);
            if (var5 != null) {
                var3 = this.field1073[arg1] = var5.field153;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ZLmb;)V")
    public void method370(boolean arg0, Packet arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method231();
                if (var3 == 0) {
                    if (this.field1070 == 0) {
                        this.field1070 = 1;
                        this.field1071 = new int[1];
                        this.field1071[0] = -1;
                        this.field1072 = new int[1];
                        this.field1072[0] = -1;
                        this.field1073 = new int[1];
                        this.field1073[0] = -1;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1070 = arg1.method231();
                    this.field1071 = new int[this.field1070];
                    this.field1072 = new int[this.field1070];
                    this.field1073 = new int[this.field1070];
                    for (int var4 = 0; var4 < this.field1070; var4++) {
                        this.field1071[var4] = arg1.method233();
                        this.field1072[var4] = arg1.method233();
                        if (this.field1072[var4] == 65535) {
                            this.field1072[var4] = -1;
                        }
                        this.field1073[var4] = arg1.method233();
                    }
                } else if (var3 == 2) {
                    this.field1074 = arg1.method233();
                } else if (var3 == 3) {
                    int var5 = arg1.method231();
                    this.field1075 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1075[var6] = arg1.method231();
                    }
                    this.field1075[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1076 = true;
                } else if (var3 == 5) {
                    this.field1077 = arg1.method231();
                } else if (var3 == 6) {
                    this.field1078 = arg1.method233();
                } else if (var3 == 7) {
                    this.field1079 = arg1.method233();
                } else if (var3 == 8) {
                    this.field1080 = arg1.method231();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
