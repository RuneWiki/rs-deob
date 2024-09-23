import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class SeqType {

    @OriginalMember(owner = "jc", name = "i", descriptor = "I")
    public int field1048 = -1;

    @OriginalMember(owner = "jc", name = "k", descriptor = "Z")
    public boolean field1050 = false;

    @OriginalMember(owner = "jc", name = "l", descriptor = "I")
    public int field1051 = 5;

    @OriginalMember(owner = "jc", name = "m", descriptor = "I")
    public int field1052 = -1;

    @OriginalMember(owner = "jc", name = "n", descriptor = "I")
    public int field1053 = -1;

    @OriginalMember(owner = "jc", name = "o", descriptor = "I")
    public int field1054 = 99;

    @OriginalMember(owner = "jc", name = "a", descriptor = "B")
    private static byte field1040 = 8;

    @OriginalMember(owner = "jc", name = "b", descriptor = "B")
    private static byte field1041 = 4;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "jc", name = "e", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "jc", name = "p", descriptor = "Z")
    public static boolean field1055;

    @OriginalMember(owner = "jc", name = "f", descriptor = "[I")
    public int[] field1045;

    @OriginalMember(owner = "jc", name = "g", descriptor = "[I")
    public int[] field1046;

    @OriginalMember(owner = "jc", name = "h", descriptor = "[I")
    public int[] field1047;

    @OriginalMember(owner = "jc", name = "j", descriptor = "[I")
    public int[] field1049;

    @OriginalMember(owner = "jc", name = "d", descriptor = "[Ljc;")
    public static SeqType[] field1043;

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ILub;)V")
    public static void method318(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method250(field1041, "seq.dat", null), 0);
        field1042 = var2.method211();
        if (field1043 == null) {
            field1043 = new SeqType[field1042];
        }
        for (int var3 = 0; var3 < field1042; var3++) {
            if (field1043[var3] == null) {
                field1043[var3] = new SeqType();
            }
            field1043[var3].method319(field1040, var2);
        }
        if (arg0 < 4 || arg0 > 4) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(BLkb;)V")
    public void method319(byte arg0, Packet arg1) {
        if (arg0 != 8) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method209();
                if (var4 == 0) {
                    if (this.field1044 == 0) {
                        this.field1044 = 1;
                        this.field1045 = new int[1];
                        this.field1045[0] = -1;
                        this.field1046 = new int[1];
                        this.field1046[0] = -1;
                        this.field1047 = new int[1];
                        this.field1047[0] = -1;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1044 = arg1.method209();
                    this.field1045 = new int[this.field1044];
                    this.field1046 = new int[this.field1044];
                    this.field1047 = new int[this.field1044];
                    for (int var5 = 0; var5 < this.field1044; var5++) {
                        this.field1045[var5] = arg1.method211();
                        this.field1046[var5] = arg1.method211();
                        if (this.field1046[var5] == 65535) {
                            this.field1046[var5] = -1;
                        }
                        this.field1047[var5] = arg1.method211();
                        if (this.field1047[var5] == 0) {
                            this.field1047[var5] = AnimFrame.field89[this.field1045[var5]].field90;
                        }
                        if (this.field1047[var5] == 0) {
                            this.field1047[var5] = 1;
                        }
                    }
                } else if (var4 == 2) {
                    this.field1048 = arg1.method211();
                } else if (var4 == 3) {
                    int var6 = arg1.method209();
                    this.field1049 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1049[var7] = arg1.method209();
                    }
                    this.field1049[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1050 = true;
                } else if (var4 == 5) {
                    this.field1051 = arg1.method209();
                } else if (var4 == 6) {
                    this.field1052 = arg1.method211();
                } else if (var4 == 7) {
                    this.field1053 = arg1.method211();
                } else if (var4 == 8) {
                    this.field1054 = arg1.method209();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
