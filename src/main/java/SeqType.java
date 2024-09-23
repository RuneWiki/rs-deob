import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jc")
public class SeqType {

    @OriginalMember(owner = "jc", name = "h", descriptor = "I")
    public int field1028 = -1;

    @OriginalMember(owner = "jc", name = "j", descriptor = "Z")
    public boolean field1030 = false;

    @OriginalMember(owner = "jc", name = "k", descriptor = "I")
    public int field1031 = 5;

    @OriginalMember(owner = "jc", name = "l", descriptor = "I")
    public int field1032 = -1;

    @OriginalMember(owner = "jc", name = "m", descriptor = "I")
    public int field1033 = -1;

    @OriginalMember(owner = "jc", name = "n", descriptor = "I")
    public int field1034 = 99;

    @OriginalMember(owner = "jc", name = "a", descriptor = "I")
    private static int field1021 = 3;

    @OriginalMember(owner = "jc", name = "b", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "jc", name = "d", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "jc", name = "o", descriptor = "Z")
    public static boolean field1035;

    @OriginalMember(owner = "jc", name = "e", descriptor = "[I")
    public int[] field1025;

    @OriginalMember(owner = "jc", name = "f", descriptor = "[I")
    public int[] field1026;

    @OriginalMember(owner = "jc", name = "g", descriptor = "[I")
    public int[] field1027;

    @OriginalMember(owner = "jc", name = "i", descriptor = "[I")
    public int[] field1029;

    @OriginalMember(owner = "jc", name = "c", descriptor = "[Ljc;")
    public static SeqType[] field1023;

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Lub;I)V")
    public static void method318(Jagfile arg0, int arg1) {
        if (arg1 < field1021 || arg1 > field1021) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Packet var3 = new Packet(0, arg0.method250("seq.dat", null, 8));
        field1022 = var3.method211();
        if (field1023 == null) {
            field1023 = new SeqType[field1022];
        }
        for (int var4 = 0; var4 < field1022; var4++) {
            if (field1023[var4] == null) {
                field1023[var4] = new SeqType();
            }
            field1023[var4].method319(var3, 0);
        }
    }

    @OriginalMember(owner = "jc", name = "a", descriptor = "(Lkb;I)V")
    public void method319(Packet arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method209();
                if (var3 == 0) {
                    if (this.field1024 == 0) {
                        this.field1024 = 1;
                        this.field1025 = new int[1];
                        this.field1025[0] = -1;
                        this.field1026 = new int[1];
                        this.field1026[0] = -1;
                        this.field1027 = new int[1];
                        this.field1027[0] = -1;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1024 = arg0.method209();
                    this.field1025 = new int[this.field1024];
                    this.field1026 = new int[this.field1024];
                    this.field1027 = new int[this.field1024];
                    for (int var4 = 0; var4 < this.field1024; var4++) {
                        this.field1025[var4] = arg0.method211();
                        this.field1026[var4] = arg0.method211();
                        if (this.field1026[var4] == 65535) {
                            this.field1026[var4] = -1;
                        }
                        this.field1027[var4] = arg0.method211();
                        if (this.field1027[var4] == 0) {
                            this.field1027[var4] = AnimFrame.field90[this.field1025[var4]].field91;
                        }
                        if (this.field1027[var4] == 0) {
                            this.field1027[var4] = 1;
                        }
                    }
                } else if (var3 == 2) {
                    this.field1028 = arg0.method211();
                } else if (var3 == 3) {
                    int var5 = arg0.method209();
                    this.field1029 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1029[var6] = arg0.method209();
                    }
                    this.field1029[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1030 = true;
                } else if (var3 == 5) {
                    this.field1031 = arg0.method209();
                } else if (var3 == 6) {
                    this.field1032 = arg0.method211();
                } else if (var3 == 7) {
                    this.field1033 = arg0.method211();
                } else if (var3 == 8) {
                    this.field1034 = arg0.method209();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
