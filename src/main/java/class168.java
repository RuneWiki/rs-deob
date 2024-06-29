import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class168 extends RuntimeException {

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3000;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Ljava/lang/String;")
    public String field2996;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Z")
    public static boolean field2998 = false;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "[S")
    public static short[] field3001 = new short[256];

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Lcl;")
    public static class114 field2997 = new class114();

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "[I")
    public static int[] field3005 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "[I")
    public static int[] field3006 = new int[500];

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Llc;")
    public static class143 field3004 = class66.method374("Module texte charg-B", -1);

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "Llc;")
    public static class143 field3002 = class66.method374("0", -1);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "Lgf;")
    public static class7 field3008;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "[[Z")
    public static boolean[][] field3007;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public static void method1105(byte arg0) {
        field3008 = null;
        field3005 = null;
        field3004 = null;
        int var1 = 109 / ((-arg0 - 36) / 58);
        field2997 = null;
        field3002 = null;
        field3001 = null;
        field3006 = null;
        field3007 = null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)[Lek;")
    public static final class160[] method1106(byte arg0) {
        class160[] var1 = new class160[class167.field2986];
        field2999++;
        for (int var2 = 0; var2 < class167.field2986; var2++) {
            int var3 = class41.field697[var2] * class153.field2766[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class282.field4961[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class111.field1961[class129.method777(var5[var6], 255)];
            }
            var1[var2] = new class160(class257.field4628, class70.field1332, class126.field2226[var2], class32.field536[var2], class41.field697[var2], class153.field2766[var2], var4);
        }
        if (arg0 > -87) {
            method1106((byte) 4);
        }
        class258.method1708(0);
        return var1;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class168(Throwable arg0, String arg1) {
        this.field3000 = arg0;
        this.field2996 = arg1;
    }
}
