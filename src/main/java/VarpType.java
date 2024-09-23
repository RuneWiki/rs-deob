import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class VarpType {

    @OriginalMember(owner = "lc", name = "h", descriptor = "Z")
    public boolean field1035 = false;

    @OriginalMember(owner = "lc", name = "i", descriptor = "Z")
    public boolean field1036 = true;

    @OriginalMember(owner = "lc", name = "k", descriptor = "Z")
    public boolean field1038 = false;

    @OriginalMember(owner = "lc", name = "m", descriptor = "Z")
    public boolean field1040 = false;

    @OriginalMember(owner = "lc", name = "a", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "lc", name = "f", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "lc", name = "g", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "lc", name = "j", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "lc", name = "l", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "lc", name = "e", descriptor = "Ljava/lang/String;")
    public String field1032;

    @OriginalMember(owner = "lc", name = "d", descriptor = "[I")
    public static int[] field1031;

    @OriginalMember(owner = "lc", name = "b", descriptor = "[Llc;")
    public static VarpType[] field1029;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILub;)V")
    public static void method323(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(575, arg1.method250(null, 3, "varp.dat"));
        field1030 = 0;
        if (arg0 < 9 || arg0 > 9) {
            return;
        }
        field1028 = var2.method211();
        if (field1029 == null) {
            field1029 = new VarpType[field1028];
        }
        if (field1031 == null) {
            field1031 = new int[field1028];
        }
        for (int var3 = 0; var3 < field1028; var3++) {
            if (field1029[var3] == null) {
                field1029[var3] = new VarpType();
            }
            field1029[var3].method324(var3, -47834, var2);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(IILkb;)V")
    public void method324(int arg0, int arg1, Packet arg2) {
        if (arg1 != -47834) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method209();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1033 = arg2.method209();
            } else if (var5 == 2) {
                this.field1034 = arg2.method209();
            } else if (var5 == 3) {
                this.field1035 = true;
                field1031[field1030++] = arg0;
            } else if (var5 == 4) {
                this.field1036 = false;
            } else if (var5 == 5) {
                this.field1037 = arg2.method211();
            } else if (var5 == 6) {
                this.field1038 = true;
            } else if (var5 == 7) {
                this.field1039 = arg2.method214();
            } else if (var5 == 8) {
                this.field1040 = true;
            } else if (var5 == 10) {
                this.field1032 = arg2.method216();
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
