import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class VarpType {

    @OriginalMember(owner = "hc", name = "h", descriptor = "Z")
    public boolean field959 = false;

    @OriginalMember(owner = "hc", name = "i", descriptor = "Z")
    public boolean field960 = true;

    @OriginalMember(owner = "hc", name = "a", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "hc", name = "c", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "hc", name = "f", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "hc", name = "g", descriptor = "I")
    public int field958;

    @OriginalMember(owner = "hc", name = "j", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "hc", name = "e", descriptor = "Ljava/lang/String;")
    public String field956;

    @OriginalMember(owner = "hc", name = "d", descriptor = "[I")
    public static int[] field955;

    @OriginalMember(owner = "hc", name = "b", descriptor = "[Lhc;")
    public static VarpType[] field953;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Ltb;I)V")
    public static void method284(Jagfile arg0, int arg1) {
        if (arg1 != -47511) {
            return;
        }
        Packet var2 = new Packet(arg0.method225(0, null, "varp.dat"), (byte) 63);
        field954 = 0;
        field952 = var2.method187();
        if (field953 == null) {
            field953 = new VarpType[field952];
        }
        if (field955 == null) {
            field955 = new int[field952];
        }
        for (int var3 = 0; var3 < field952; var3++) {
            if (field953[var3] == null) {
                field953[var3] = new VarpType();
            }
            field953[var3].method285(var2, var3, 0);
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(Ljb;II)V")
    public void method285(Packet arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        while (true) {
            int var4 = arg0.method185();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field957 = arg0.method185();
            } else if (var4 == 2) {
                this.field958 = arg0.method185();
            } else if (var4 == 3) {
                this.field959 = true;
                field955[field954++] = arg1;
            } else if (var4 == 4) {
                this.field960 = false;
            } else if (var4 == 5) {
                this.field961 = arg0.method187();
            } else if (var4 == 10) {
                this.field956 = arg0.method192();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
