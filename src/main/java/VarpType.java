import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class VarpType {

    @OriginalMember(owner = "lc", name = "i", descriptor = "Z")
    public boolean field1060 = false;

    @OriginalMember(owner = "lc", name = "j", descriptor = "Z")
    public boolean field1061 = true;

    @OriginalMember(owner = "lc", name = "l", descriptor = "Z")
    public boolean field1063 = false;

    @OriginalMember(owner = "lc", name = "n", descriptor = "Z")
    public boolean field1065 = false;

    @OriginalMember(owner = "lc", name = "a", descriptor = "I")
    private static int field1052 = 3;

    @OriginalMember(owner = "lc", name = "b", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "lc", name = "d", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "lc", name = "g", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "lc", name = "h", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "lc", name = "k", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "lc", name = "m", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "lc", name = "f", descriptor = "Ljava/lang/String;")
    public String field1057;

    @OriginalMember(owner = "lc", name = "e", descriptor = "[I")
    public static int[] field1056;

    @OriginalMember(owner = "lc", name = "c", descriptor = "[Llc;")
    public static VarpType[] field1054;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lub;I)V")
    public static void method323(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(0, arg0.method250("varp.dat", null, 8));
        field1055 = 0;
        field1053 = var2.method211();
        if (field1054 == null) {
            field1054 = new VarpType[field1053];
        }
        if (field1056 == null) {
            field1056 = new int[field1053];
        }
        for (int var3 = 0; var3 < field1053; var3++) {
            if (field1054[var3] == null) {
                field1054[var3] = new VarpType();
            }
            field1054[var3].method324(var2, var3, (byte) 6);
        }
        if (arg1 < field1052 || arg1 > field1052) {
            field1052 = 167;
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lkb;IB)V")
    public void method324(Packet arg0, int arg1, byte arg2) {
        if (arg2 == 6) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        while (true) {
            int var6 = arg0.method209();
            if (var6 == 0) {
                return;
            }
            if (var6 == 1) {
                this.field1058 = arg0.method209();
            } else if (var6 == 2) {
                this.field1059 = arg0.method209();
            } else if (var6 == 3) {
                this.field1060 = true;
                field1056[field1055++] = arg1;
            } else if (var6 == 4) {
                this.field1061 = false;
            } else if (var6 == 5) {
                this.field1062 = arg0.method211();
            } else if (var6 == 6) {
                this.field1063 = true;
            } else if (var6 == 7) {
                this.field1064 = arg0.method214();
            } else if (var6 == 8) {
                this.field1065 = true;
            } else if (var6 == 10) {
                this.field1057 = arg0.method216();
            } else {
                System.out.println("Error unrecognised config code: " + var6);
            }
        }
    }
}
