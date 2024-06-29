import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class139 extends class304 {

    @OriginalMember(owner = "client!en", name = "S", descriptor = "I")
    private int field2082 = 4096;

    @OriginalMember(owner = "client!en", name = "U", descriptor = "I")
    private int field2084 = 4096;

    @OriginalMember(owner = "client!en", name = "eb", descriptor = "I")
    private int field2094 = 4096;

    @OriginalMember(owner = "client!en", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2080 = " is already on your friend list.";

    @OriginalMember(owner = "client!en", name = "T", descriptor = "I")
    public static volatile int field2083 = 0;

    @OriginalMember(owner = "client!en", name = "cb", descriptor = "[I")
    public static int[] field2092 = new int[50];

    @OriginalMember(owner = "client!en", name = "V", descriptor = "Ljava/lang/String;")
    public static String field2085 = "scroll:";

    @OriginalMember(owner = "client!en", name = "db", descriptor = "I")
    public static int field2093 = 0;

    @OriginalMember(owner = "client!en", name = "R", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!en", name = "W", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!en", name = "Y", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!en", name = "Z", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!en", name = "bb", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!en", name = "fb", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!en", name = "ab", descriptor = "Ljd;")
    public static class95 field2090;

    @OriginalMember(owner = "client!en", name = "X", descriptor = "[I")
    public static int[] field2087;

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V", line = 18)
    public class139() {
        super(1, false);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 23)
    public static final boolean method1046(String arg0, byte arg1) {
        if (arg1 != -41) {
            field2086 = 6;
        }
        field2089++;
        return class281.method1948(true, arg0, 48, 10);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lwm;II)V", line = 34)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field2081++;
        if (arg2 != -2828) {
            field2083 = 3;
        }
        if (arg1 == 0) {
            this.field2082 = arg0.method1755(false);
        } else if (arg1 == 1) {
            this.field2094 = arg0.method1755(false);
        } else if (arg1 == 2) {
            this.field2084 = arg0.method1755(false);
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II)[[I", line = 78)
    public final int[][] method75(int arg0, int arg1) {
        field2091++;
        if (arg1 != 0) {
            method1046((String) null, (byte) -94);
        }
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (this.field4663.field1820) {
            int[][] var4 = this.method2082(0, (byte) -92, arg0);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class218.field3333; var11++) {
                int var12 = var8[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (var12 == var13 && var13 == var14) {
                    var6[var11] = this.field2082 * var12 >> 12;
                    var9[var11] = this.field2094 * var13 >> 12;
                    var10[var11] = this.field2084 * var14 >> 12;
                } else {
                    var6[var11] = this.field2082;
                    var9[var11] = this.field2094;
                    var10[var11] = this.field2084;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V", line = 148)
    public static void method1047(int arg0) {
        field2087 = null;
        field2085 = null;
        field2092 = null;
        field2090 = null;
        if (arg0 != 2) {
            field2092 = (int[]) null;
        }
        field2080 = null;
    }
}
