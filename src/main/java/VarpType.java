import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ic")
public class VarpType {

    @OriginalMember(owner = "ic", name = "i", descriptor = "Z")
    public boolean field968 = false;

    @OriginalMember(owner = "ic", name = "j", descriptor = "Z")
    public boolean field969 = true;

    @OriginalMember(owner = "ic", name = "a", descriptor = "Z")
    private static boolean field960 = true;

    @OriginalMember(owner = "ic", name = "b", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "ic", name = "d", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "ic", name = "g", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "ic", name = "h", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "ic", name = "k", descriptor = "I")
    public int field970;

    @OriginalMember(owner = "ic", name = "f", descriptor = "Ljava/lang/String;")
    public String field965;

    @OriginalMember(owner = "ic", name = "e", descriptor = "[I")
    public static int[] field964;

    @OriginalMember(owner = "ic", name = "c", descriptor = "[Lic;")
    public static VarpType[] field962;

    @OriginalMember(owner = "ic", name = "a", descriptor = "(ZLub;)V")
    public static void method300(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method242((byte) 6, null, "varp.dat"), 4);
        field963 = 0;
        if (!arg0) {
            field960 = !field960;
        }
        field961 = var2.method203();
        if (field962 == null) {
            field962 = new VarpType[field961];
        }
        if (field964 == null) {
            field964 = new int[field961];
        }
        for (int var3 = 0; var3 < field961; var3++) {
            if (field962[var3] == null) {
                field962[var3] = new VarpType();
            }
            field962[var3].method301(var3, var2, field960);
        }
    }

    @OriginalMember(owner = "ic", name = "a", descriptor = "(ILkb;Z)V")
    public void method301(int arg0, Packet arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        while (true) {
            int var4 = arg1.method201();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field966 = arg1.method201();
            } else if (var4 == 2) {
                this.field967 = arg1.method201();
            } else if (var4 == 3) {
                this.field968 = true;
                field964[field963++] = arg0;
            } else if (var4 == 4) {
                this.field969 = false;
            } else if (var4 == 5) {
                this.field970 = arg1.method203();
            } else if (var4 == 10) {
                this.field965 = arg1.method208();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
