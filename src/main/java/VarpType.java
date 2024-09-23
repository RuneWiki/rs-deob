import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class VarpType {

    @OriginalMember(owner = "lc", name = "b", descriptor = "B")
    private byte field1057 = 3;

    @OriginalMember(owner = "lc", name = "k", descriptor = "Z")
    public boolean field1066 = false;

    @OriginalMember(owner = "lc", name = "l", descriptor = "Z")
    public boolean field1067 = true;

    @OriginalMember(owner = "lc", name = "n", descriptor = "Z")
    public boolean field1069 = false;

    @OriginalMember(owner = "lc", name = "p", descriptor = "Z")
    public boolean field1071 = false;

    @OriginalMember(owner = "lc", name = "a", descriptor = "Z")
    private static boolean field1056 = true;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    private static int field1058;

    @OriginalMember(owner = "lc", name = "d", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "lc", name = "f", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "lc", name = "i", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "lc", name = "j", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "lc", name = "m", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "lc", name = "o", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "lc", name = "h", descriptor = "Ljava/lang/String;")
    public String field1063;

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public static int[] field1062;

    @OriginalMember(owner = "lc", name = "e", descriptor = "[Llc;")
    public static VarpType[] field1060;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILub;)V")
    public static void method322(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method249("varp.dat", true, null), field1056);
        field1061 = 0;
        if (arg0 != 0) {
            field1058 = 33;
        }
        field1059 = var2.method210();
        if (field1060 == null) {
            field1060 = new VarpType[field1059];
        }
        if (field1062 == null) {
            field1062 = new int[field1059];
        }
        for (int var3 = 0; var3 < field1059; var3++) {
            if (field1060[var3] == null) {
                field1060[var3] = new VarpType();
            }
            field1060[var3].method323((byte) 3, var2, var3);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(BLkb;I)V")
    public void method323(byte arg0, Packet arg1, int arg2) {
        if (this.field1057 != arg0) {
            return;
        }
        boolean var4 = false;
        while (true) {
            int var5 = arg1.method208();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1064 = arg1.method208();
            } else if (var5 == 2) {
                this.field1065 = arg1.method208();
            } else if (var5 == 3) {
                this.field1066 = true;
                field1062[field1061++] = arg2;
            } else if (var5 == 4) {
                this.field1067 = false;
            } else if (var5 == 5) {
                this.field1068 = arg1.method210();
            } else if (var5 == 6) {
                this.field1069 = true;
            } else if (var5 == 7) {
                this.field1070 = arg1.method213();
            } else if (var5 == 8) {
                this.field1071 = true;
            } else if (var5 == 10) {
                this.field1063 = arg1.method215();
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
