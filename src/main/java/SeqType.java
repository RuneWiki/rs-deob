import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class SeqType {

    @OriginalMember(owner = "jc", name = "g", descriptor = "I")
    public int field1004 = -1;

    @OriginalMember(owner = "jc", name = "i", descriptor = "Z")
    public boolean field1006 = false;

    @OriginalMember(owner = "jc", name = "j", descriptor = "I")
    public int field1007 = 5;

    @OriginalMember(owner = "jc", name = "k", descriptor = "I")
    public int field1008 = -1;

    @OriginalMember(owner = "jc", name = "l", descriptor = "I")
    public int field1009 = -1;

    @OriginalMember(owner = "jc", name = "m", descriptor = "I")
    public int field1010 = 99;

    @OriginalMember(owner = "jc", name = "c", descriptor = "I")
    public int field1000;

    @OriginalMember(owner = "jc", name = "a", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "jc", name = "n", descriptor = "Z")
    public static boolean field1011;

    @OriginalMember(owner = "jc", name = "d", descriptor = "[I")
    public int[] field1001;

    @OriginalMember(owner = "jc", name = "e", descriptor = "[I")
    public int[] field1002;

    @OriginalMember(owner = "jc", name = "f", descriptor = "[I")
    public int[] field1003;

    @OriginalMember(owner = "jc", name = "h", descriptor = "[I")
    public int[] field1005;

    @OriginalMember(owner = "jc", name = "b", descriptor = "[Ljc;")
    public static SeqType[] field999;

    @OriginalMember(owner = "jc", name = "a", descriptor = "(ILub;)V")
    public static void method318(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(575, arg1.method250(null, 3, "seq.dat"));
        field998 = var2.method211();
        if (field999 == null) {
            field999 = new SeqType[field998];
        }
        for (int var3 = 0; var3 < field998; var3++) {
            if (field999[var3] == null) {
                field999[var3] = new SeqType();
            }
            field999[var3].method319(var2, (byte) 6);
        }
        if (arg0 < 9 || arg0 > 9) {
            ;
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Lkb;B)V")
    public void method319(Packet arg0, byte arg1) {
        if (arg1 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method209();
                if (var4 == 0) {
                    if (this.field1000 == 0) {
                        this.field1000 = 1;
                        this.field1001 = new int[1];
                        this.field1001[0] = -1;
                        this.field1002 = new int[1];
                        this.field1002[0] = -1;
                        this.field1003 = new int[1];
                        this.field1003[0] = -1;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1000 = arg0.method209();
                    this.field1001 = new int[this.field1000];
                    this.field1002 = new int[this.field1000];
                    this.field1003 = new int[this.field1000];
                    for (int var5 = 0; var5 < this.field1000; var5++) {
                        this.field1001[var5] = arg0.method211();
                        this.field1002[var5] = arg0.method211();
                        if (this.field1002[var5] == 65535) {
                            this.field1002[var5] = -1;
                        }
                        this.field1003[var5] = arg0.method211();
                        if (this.field1003[var5] == 0) {
                            this.field1003[var5] = AnimFrame.field85[this.field1001[var5]].field86;
                        }
                        if (this.field1003[var5] == 0) {
                            this.field1003[var5] = 1;
                        }
                    }
                } else if (var4 == 2) {
                    this.field1004 = arg0.method211();
                } else if (var4 == 3) {
                    int var6 = arg0.method209();
                    this.field1005 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1005[var7] = arg0.method209();
                    }
                    this.field1005[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1006 = true;
                } else if (var4 == 5) {
                    this.field1007 = arg0.method209();
                } else if (var4 == 6) {
                    this.field1008 = arg0.method211();
                } else if (var4 == 7) {
                    this.field1009 = arg0.method211();
                } else if (var4 == 8) {
                    this.field1010 = arg0.method209();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
