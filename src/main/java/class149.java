import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class149 {

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public int field2238;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "[I")
    public int[] field2239;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "[I")
    public int[] field2237;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "Lob;")
    public static class521 field2241 = new class521(14, -1);

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1040(long arg0, int arg1) {
        field2240++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % (long) arg1) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class342.field5078[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V")
    public static void method1041(boolean arg0) {
        if (!arg0) {
            method1040(127L, -78);
        }
        field2241 = null;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(I)V")
    public class149(int arg0) {
        this.field2238 = arg0;
        this.field2239 = new int[this.field2238];
        this.field2237 = new int[this.field2238];
    }
}
