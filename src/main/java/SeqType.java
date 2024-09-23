import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class SeqType {

    @OriginalMember(owner = "gc", name = "h", descriptor = "I")
    public int field943 = -1;

    @OriginalMember(owner = "gc", name = "k", descriptor = "I")
    public int field946 = 5;

    @OriginalMember(owner = "gc", name = "l", descriptor = "I")
    public int field947 = -1;

    @OriginalMember(owner = "gc", name = "m", descriptor = "I")
    public int field948 = -1;

    @OriginalMember(owner = "gc", name = "n", descriptor = "I")
    public int field949 = 99;

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private static boolean field936 = true;

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "gc", name = "j", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "gc", name = "o", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "gc", name = "e", descriptor = "[I")
    public int[] field940;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[I")
    public int[] field941;

    @OriginalMember(owner = "gc", name = "g", descriptor = "[I")
    public int[] field942;

    @OriginalMember(owner = "gc", name = "i", descriptor = "[I")
    public int[] field944;

    @OriginalMember(owner = "gc", name = "c", descriptor = "[Lgc;")
    public static SeqType[] field938;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ZLub;)V")
    public static void method295(boolean arg0, Jagfile arg1) {
        if (!arg0) {
            field936 = !field936;
        }
        Packet var2 = new Packet(arg1.method242((byte) 6, null, "seq.dat"), 4);
        field937 = var2.method203();
        if (field938 == null) {
            field938 = new SeqType[field937];
        }
        for (int var3 = 0; var3 < field937; var3++) {
            if (field938[var3] == null) {
                field938[var3] = new SeqType();
            }
            field938[var3].method296(213, var2);
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ILkb;)V")
    public void method296(int arg0, Packet arg1) {
        int var3 = 81 / arg0;
        while (true) {
            while (true) {
                int var4 = arg1.method201();
                if (var4 == 0) {
                    if (this.field939 == 0) {
                        this.field939 = 1;
                        this.field940 = new int[1];
                        this.field940[0] = -1;
                        this.field941 = new int[1];
                        this.field941[0] = -1;
                        this.field942 = new int[1];
                        this.field942[0] = -1;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field939 = arg1.method201();
                    this.field940 = new int[this.field939];
                    this.field941 = new int[this.field939];
                    this.field942 = new int[this.field939];
                    for (int var5 = 0; var5 < this.field939; var5++) {
                        this.field940[var5] = arg1.method203();
                        this.field941[var5] = arg1.method203();
                        if (this.field941[var5] == 65535) {
                            this.field941[var5] = -1;
                        }
                        this.field942[var5] = arg1.method203();
                        if (this.field942[var5] == 0) {
                            this.field942[var5] = AnimFrame.field82[this.field940[var5]].field83;
                        }
                        if (this.field942[var5] == 0) {
                            this.field942[var5] = 1;
                        }
                    }
                } else if (var4 == 2) {
                    this.field943 = arg1.method203();
                } else if (var4 == 3) {
                    int var6 = arg1.method201();
                    this.field944 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field944[var7] = arg1.method201();
                    }
                    this.field944[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field945 = arg1.method203();
                } else if (var4 == 5) {
                    this.field946 = arg1.method201();
                } else if (var4 == 6) {
                    this.field947 = arg1.method203();
                } else if (var4 == 7) {
                    this.field948 = arg1.method203();
                } else if (var4 == 8) {
                    this.field949 = arg1.method201();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
