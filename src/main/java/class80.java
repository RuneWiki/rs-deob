import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class80 {

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field946 = 0;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "[I")
    public static int[] field949 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "F")
    public static float field954;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Lwj;")
    public static class130 field947;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Ljg;")
    public static class158 field950;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "Lb;")
    public static class262 field952;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "[I")
    public static int[] field948;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[[[Lbh;")
    public static class234[][][] field943;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method478(String arg0, String arg1, String arg2, int arg3, int arg4) {
        if (arg4 != 8) {
            field954 = 0.7152555F;
        }
        field953++;
        class21.method125(arg1, arg2, arg3, arg0, (byte) -86, -1);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method479(int arg0) {
        field947 = null;
        if (arg0 < 12) {
            method478((String) null, (String) null, (String) null, 59, -65);
        }
        field949 = null;
        field943 = null;
        field952 = null;
        field950 = null;
        field948 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)V")
    public static final void method480(int arg0, int arg1, int arg2) {
        field944++;
        if (arg1 < 120) {
            return;
        }
        if (class104.field1411 != arg2) {
            class87.field1178 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class87.field1178[var3] = (var3 << 12) / arg2;
            }
            class71.field836 = arg2 * 32;
            class112.field1487 = arg2 - 1;
            class104.field1411 = arg2;
        }
        if (class257.field3727 == arg0) {
            return;
        }
        if (class104.field1411 == arg0) {
            class143.field2045 = class87.field1178;
        } else {
            class143.field2045 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class143.field2045[var4] = (var4 << 12) / arg0;
            }
        }
        class257.field3727 = arg0;
        class166.field2391 = arg0 - 1;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
    public class80() {
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lfl;)V")
    public class80(class80 arg0) {
        this.field951 = arg0.field951;
        this.field955 = arg0.field955;
        this.field945 = arg0.field945;
        this.field956 = arg0.field956;
    }
}
