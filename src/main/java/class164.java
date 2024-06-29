import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class164 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[[I")
    public static int[][] field2396 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Z")
    public static boolean field2394 = false;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lia;")
    public static class23 field2397;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method1160(int arg0) {
        field2397 = null;
        field2396 = null;
        if (arg0 >= -106) {
            method1162(-119, (byte) -65, -7);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[Ljava/lang/String;BI)Ljava/lang/String;")
    public static final String method1161(int arg0, String[] arg1, byte arg2, int arg3) {
        field2395++;
        if (arg2 != 74) {
            field2396 = null;
        }
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg1[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBI)I")
    public static final int method1162(int arg0, byte arg1, int arg2) {
        field2398++;
        if (arg1 == 78) {
            return arg0 == 4 || arg0 == 5 ? class332.field5142[arg2 & 0x3] : 256;
        } else {
            return 47;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)V")
    public static final void method1163(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 << arg2;
        field2399++;
        int var5 = arg0 << 3;
        int var6 = arg1 << 3;
        class99.field1428 = var5;
        class482.field7022 = var6;
        if (class432.field6409 == 2) {
            class522.field7715 = var4;
            class353.field5478 = var5;
            class30.field461 = var6;
        }
        class225.method1525(3);
        class314.field4804 = true;
    }
}
