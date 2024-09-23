import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("oc")
public class VarpType {

    @OriginalMember(owner = "oc", name = "h", descriptor = "Z")
    public boolean field1105 = false;

    @OriginalMember(owner = "oc", name = "i", descriptor = "Z")
    public boolean field1106 = true;

    @OriginalMember(owner = "oc", name = "k", descriptor = "Z")
    public boolean field1108 = false;

    @OriginalMember(owner = "oc", name = "m", descriptor = "Z")
    public boolean field1110 = false;

    @OriginalMember(owner = "oc", name = "a", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "oc", name = "c", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "oc", name = "f", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "oc", name = "g", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "oc", name = "j", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "oc", name = "l", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "oc", name = "e", descriptor = "Ljava/lang/String;")
    public String field1102;

    @OriginalMember(owner = "oc", name = "d", descriptor = "[I")
    public static int[] field1101;

    @OriginalMember(owner = "oc", name = "b", descriptor = "[Loc;")
    public static VarpType[] field1099;

    @OriginalMember(owner = "oc", name = "a", descriptor = "(Lyb;B)V")
    public static void method374(Jagfile arg0, byte arg1) {
        Packet var2 = new Packet(699, arg0.method295("varp.dat", null));
        field1100 = 0;
        field1098 = var2.method233();
        if (arg1 != 7) {
            return;
        }
        boolean var3 = false;
        if (field1099 == null) {
            field1099 = new VarpType[field1098];
        }
        if (field1101 == null) {
            field1101 = new int[field1098];
        }
        for (int var4 = 0; var4 < field1098; var4++) {
            if (field1099[var4] == null) {
                field1099[var4] = new VarpType();
            }
            field1099[var4].method375(var2, var4, -11);
        }
    }

    @OriginalMember(owner = "oc", name = "a", descriptor = "(Lmb;II)V")
    public void method375(Packet arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg0.method231();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1103 = arg0.method231();
            } else if (var5 == 2) {
                this.field1104 = arg0.method231();
            } else if (var5 == 3) {
                this.field1105 = true;
                field1101[field1100++] = arg1;
            } else if (var5 == 4) {
                this.field1106 = false;
            } else if (var5 == 5) {
                this.field1107 = arg0.method233();
            } else if (var5 == 6) {
                this.field1108 = true;
            } else if (var5 == 7) {
                this.field1109 = arg0.method236();
            } else if (var5 == 8) {
                this.field1110 = true;
            } else if (var5 == 10) {
                this.field1102 = arg0.method238();
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
