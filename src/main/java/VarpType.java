import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class VarpType {

    @OriginalMember(owner = "lc", name = "j", descriptor = "Z")
    public boolean field1066 = false;

    @OriginalMember(owner = "lc", name = "k", descriptor = "Z")
    public boolean field1067 = true;

    @OriginalMember(owner = "lc", name = "m", descriptor = "Z")
    public boolean field1069 = false;

    @OriginalMember(owner = "lc", name = "o", descriptor = "Z")
    public boolean field1071 = false;

    @OriginalMember(owner = "lc", name = "a", descriptor = "I")
    private static int field1057 = 473;

    @OriginalMember(owner = "lc", name = "b", descriptor = "I")
    private static int field1058 = 13703;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "lc", name = "h", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "lc", name = "i", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "lc", name = "l", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "lc", name = "n", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "lc", name = "g", descriptor = "Ljava/lang/String;")
    public String field1063;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[I")
    public static int[] field1062;

    @OriginalMember(owner = "lc", name = "d", descriptor = "[Llc;")
    public static VarpType[] field1060;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lub;I)V")
    public static void method331(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(363, arg0.read("varp.dat", null, (byte) 2));
        field1061 = 0;
        int var3 = 28 / arg1;
        field1059 = var2.method218();
        if (field1060 == null) {
            field1060 = new VarpType[field1059];
        }
        if (field1062 == null) {
            field1062 = new int[field1059];
        }
        for (int var4 = 0; var4 < field1059; var4++) {
            if (field1060[var4] == null) {
                field1060[var4] = new VarpType();
            }
            field1060[var4].method332(field1058, var4, var2);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(IILkb;)V")
    public void method332(int arg0, int arg1, Packet arg2) {
        if (arg0 != 13703) {
            return;
        }
        while (true) {
            int var4 = arg2.method216();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1064 = arg2.method216();
            } else if (var4 == 2) {
                this.field1065 = arg2.method216();
            } else if (var4 == 3) {
                this.field1066 = true;
                field1062[field1061++] = arg1;
            } else if (var4 == 4) {
                this.field1067 = false;
            } else if (var4 == 5) {
                this.field1068 = arg2.method218();
            } else if (var4 == 6) {
                this.field1069 = true;
            } else if (var4 == 7) {
                this.field1070 = arg2.method221();
            } else if (var4 == 8) {
                this.field1071 = true;
            } else if (var4 == 10) {
                this.field1063 = arg2.method223();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
