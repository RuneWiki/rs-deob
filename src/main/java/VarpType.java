import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class VarpType {

    @OriginalMember(owner = "lc", name = "c", descriptor = "B")
    private byte field1076 = 9;

    @OriginalMember(owner = "lc", name = "k", descriptor = "Z")
    public boolean field1084 = false;

    @OriginalMember(owner = "lc", name = "l", descriptor = "Z")
    public boolean field1085 = true;

    @OriginalMember(owner = "lc", name = "n", descriptor = "Z")
    public boolean field1087 = false;

    @OriginalMember(owner = "lc", name = "p", descriptor = "Z")
    public boolean field1089 = false;

    @OriginalMember(owner = "lc", name = "a", descriptor = "B")
    private static byte field1074 = 4;

    @OriginalMember(owner = "lc", name = "b", descriptor = "B")
    private static byte field1075 = 9;

    @OriginalMember(owner = "lc", name = "d", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "lc", name = "f", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "lc", name = "i", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "lc", name = "j", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "lc", name = "m", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "lc", name = "o", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "lc", name = "h", descriptor = "Ljava/lang/String;")
    public String field1081;

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public static int[] field1080;

    @OriginalMember(owner = "lc", name = "e", descriptor = "[Llc;")
    public static VarpType[] field1078;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILub;)V")
    public static void method323(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method250(field1074, "varp.dat", null), 0);
        field1079 = 0;
        field1077 = var2.method211();
        if (field1078 == null) {
            field1078 = new VarpType[field1077];
        }
        if (field1080 == null) {
            field1080 = new int[field1077];
        }
        for (int var3 = 0; var3 < field1077; var3++) {
            if (field1078[var3] == null) {
                field1078[var3] = new VarpType();
            }
            field1078[var3].method324(var2, var3, field1075);
        }
        if (arg0 != 4) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lkb;IB)V")
    public void method324(Packet arg0, int arg1, byte arg2) {
        if (this.field1076 == arg2) {
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
                this.field1082 = arg0.method209();
            } else if (var6 == 2) {
                this.field1083 = arg0.method209();
            } else if (var6 == 3) {
                this.field1084 = true;
                field1080[field1079++] = arg1;
            } else if (var6 == 4) {
                this.field1085 = false;
            } else if (var6 == 5) {
                this.field1086 = arg0.method211();
            } else if (var6 == 6) {
                this.field1087 = true;
            } else if (var6 == 7) {
                this.field1088 = arg0.method214();
            } else if (var6 == 8) {
                this.field1089 = true;
            } else if (var6 == 10) {
                this.field1081 = arg0.method216();
            } else {
                System.out.println("Error unrecognised config code: " + var6);
            }
        }
    }
}
