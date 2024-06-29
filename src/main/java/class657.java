import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class657 {

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
    public int field9164;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "[I")
    public int[] field9165;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "[I")
    public int[] field9162;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "Luk;")
    public static class265 field9166;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
    public static final void method3614(int arg0) {
        for (int var1 = 0; var1 < class159.field1994.length; var1++) {
            for (int var2 = 0; var2 < class159.field1994[0].length; var2++) {
                for (int var3 = 0; var3 < class159.field1994[0][0].length; var3++) {
                    class159.field1994[var1][var2][var3] = 0;
                }
            }
        }
        field9163++;
        if (arg0 > -51) {
            method3615(false);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Z)V")
    public static void method3615(boolean arg0) {
        if (arg0) {
            field9166 = null;
        }
        field9166 = null;
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(I)V")
    public class657(int arg0) {
        this.field9164 = arg0;
        this.field9165 = new int[this.field9164];
        this.field9162 = new int[this.field9164];
    }
}
