import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("oc")
public class VarpType {

    @OriginalMember(owner = "oc", name = "h", descriptor = "Z")
    public boolean field1118 = false;

    @OriginalMember(owner = "oc", name = "i", descriptor = "Z")
    public boolean field1119 = true;

    @OriginalMember(owner = "oc", name = "k", descriptor = "Z")
    public boolean field1121 = false;

    @OriginalMember(owner = "oc", name = "m", descriptor = "Z")
    public boolean field1123 = false;

    @OriginalMember(owner = "oc", name = "a", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "oc", name = "c", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "oc", name = "f", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "oc", name = "g", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "oc", name = "j", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "oc", name = "l", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "oc", name = "e", descriptor = "Ljava/lang/String;")
    public String field1115;

    @OriginalMember(owner = "oc", name = "d", descriptor = "[I")
    public static int[] field1114;

    @OriginalMember(owner = "oc", name = "b", descriptor = "[Loc;")
    public static VarpType[] field1112;

    @OriginalMember(owner = "oc", name = "a", descriptor = "(Lyb;I)V")
    public static void method378(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method299("varp.dat", null), true);
        field1113 = 0;
        if (arg1 <= 0) {
            return;
        }
        field1111 = var2.method233();
        if (field1112 == null) {
            field1112 = new VarpType[field1111];
        }
        if (field1114 == null) {
            field1114 = new int[field1111];
        }
        for (int var3 = 0; var3 < field1111; var3++) {
            if (field1112[var3] == null) {
                field1112[var3] = new VarpType();
            }
            field1112[var3].method379(565, var3, var2);
        }
    }

    @OriginalMember(owner = "oc", name = "a", descriptor = "(IILmb;)V")
    public void method379(int arg0, int arg1, Packet arg2) {
        int var4 = 93 / arg0;
        while (true) {
            int var5 = arg2.method231();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1116 = arg2.method231();
            } else if (var5 == 2) {
                this.field1117 = arg2.method231();
            } else if (var5 == 3) {
                this.field1118 = true;
                field1114[field1113++] = arg1;
            } else if (var5 == 4) {
                this.field1119 = false;
            } else if (var5 == 5) {
                this.field1120 = arg2.method233();
            } else if (var5 == 6) {
                this.field1121 = true;
            } else if (var5 == 7) {
                this.field1122 = arg2.method236();
            } else if (var5 == 8) {
                this.field1123 = true;
            } else if (var5 == 10) {
                this.field1115 = arg2.method238();
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
