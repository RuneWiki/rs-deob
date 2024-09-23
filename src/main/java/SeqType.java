import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class SeqType {

    @OriginalMember(owner = "jc", name = "j", descriptor = "I")
    public int field1031 = -1;

    @OriginalMember(owner = "jc", name = "l", descriptor = "Z")
    public boolean field1033 = false;

    @OriginalMember(owner = "jc", name = "m", descriptor = "I")
    public int field1034 = 5;

    @OriginalMember(owner = "jc", name = "n", descriptor = "I")
    public int field1035 = -1;

    @OriginalMember(owner = "jc", name = "o", descriptor = "I")
    public int field1036 = -1;

    @OriginalMember(owner = "jc", name = "p", descriptor = "I")
    public int field1037 = 99;

    @OriginalMember(owner = "jc", name = "a", descriptor = "B")
    private static byte field1022 = 6;

    @OriginalMember(owner = "jc", name = "b", descriptor = "Z")
    private static boolean field1023 = true;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    private static int field1024;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "jc", name = "f", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "jc", name = "q", descriptor = "Z")
    public static boolean field1038;

    @OriginalMember(owner = "jc", name = "g", descriptor = "[I")
    public int[] field1028;

    @OriginalMember(owner = "jc", name = "h", descriptor = "[I")
    public int[] field1029;

    @OriginalMember(owner = "jc", name = "i", descriptor = "[I")
    public int[] field1030;

    @OriginalMember(owner = "jc", name = "k", descriptor = "[I")
    public int[] field1032;

    @OriginalMember(owner = "jc", name = "e", descriptor = "[Ljc;")
    public static SeqType[] field1026;

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ILub;)V")
    public static void method317(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method249("seq.dat", true, null), field1023);
        field1025 = var2.method210();
        if (field1026 == null) {
            field1026 = new SeqType[field1025];
        }
        for (int var3 = 0; var3 < field1025; var3++) {
            if (field1026[var3] == null) {
                field1026[var3] = new SeqType();
            }
            field1026[var3].method318(field1022, var2);
        }
        if (arg0 != 0) {
            field1024 = -35;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(BLkb;)V")
    public void method318(byte arg0, Packet arg1) {
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            field1024 = -449;
        }
        while (true) {
            while (true) {
                int var4 = arg1.method208();
                if (var4 == 0) {
                    if (this.field1027 == 0) {
                        this.field1027 = 1;
                        this.field1028 = new int[1];
                        this.field1028[0] = -1;
                        this.field1029 = new int[1];
                        this.field1029[0] = -1;
                        this.field1030 = new int[1];
                        this.field1030[0] = -1;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1027 = arg1.method208();
                    this.field1028 = new int[this.field1027];
                    this.field1029 = new int[this.field1027];
                    this.field1030 = new int[this.field1027];
                    for (int var5 = 0; var5 < this.field1027; var5++) {
                        this.field1028[var5] = arg1.method210();
                        this.field1029[var5] = arg1.method210();
                        if (this.field1029[var5] == 65535) {
                            this.field1029[var5] = -1;
                        }
                        this.field1030[var5] = arg1.method210();
                        if (this.field1030[var5] == 0) {
                            this.field1030[var5] = AnimFrame.field87[this.field1028[var5]].field88;
                        }
                        if (this.field1030[var5] == 0) {
                            this.field1030[var5] = 1;
                        }
                    }
                } else if (var4 == 2) {
                    this.field1031 = arg1.method210();
                } else if (var4 == 3) {
                    int var6 = arg1.method208();
                    this.field1032 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1032[var7] = arg1.method208();
                    }
                    this.field1032[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1033 = true;
                } else if (var4 == 5) {
                    this.field1034 = arg1.method208();
                } else if (var4 == 6) {
                    this.field1035 = arg1.method210();
                } else if (var4 == 7) {
                    this.field1036 = arg1.method210();
                } else if (var4 == 8) {
                    this.field1037 = arg1.method208();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
