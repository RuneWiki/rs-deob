import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class37 {

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Ljava/lang/String;")
    public static String field550 = null;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Ljava/lang/String;")
    public static String field553 = "green:";

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[I")
    public static int[] field551 = new int[256];

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "S")
    public static short field555 = 256;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Lui;")
    public static class98 field557 = new class98(64);

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Z")
    public static boolean field554;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "[[[B")
    public static byte[][][] field559;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 5)
    public static void method302(int arg0) {
        field550 = null;
        field551 = null;
        field559 = (byte[][][]) null;
        field557 = null;
        field553 = null;
        if (arg0 != 15571) {
            method302(-20);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;", line = 26)
    public static final String method303(int arg0, String[] arg1, int arg2, int arg3) {
        field558++;
        if (arg3 == 0) {
            return "";
        } else if (~arg3 == arg0) {
            String var4 = arg1[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = 0;
            int var6 = arg2 + arg3;
            for (int var7 = arg2; var7 < var6; var7++) {
                String var8 = arg1[var7];
                if (var8 == null) {
                    var5 += 4;
                } else {
                    var5 += var8.length();
                }
            }
            StringBuffer var9 = new StringBuffer(var5);
            for (int var10 = arg2; var10 < var6; var10++) {
                String var11 = arg1[var10];
                if (var11 == null) {
                    var9.append("null");
                } else {
                    var9.append(var11);
                }
            }
            return var9.toString();
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V", line = 85)
    public static final void method304(int arg0, int arg1) {
        field556++;
        class100.field1452.method645(arg1, (byte) -113);
        if (arg0 != 0) {
            method303(65, (String[]) null, 98, 19);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([Ljava/lang/Object;[IIBI)V", line = 112)
    public static final void method305(Object[] arg0, int[] arg1, int arg2, byte arg3, int arg4) {
        field552++;
        if (arg3 <= 27) {
            method304(-69, -125);
        }
        if (arg4 >= arg2) {
            return;
        }
        int var5 = (arg2 + arg4) / 2;
        int var6 = arg1[var5];
        arg1[var5] = arg1[arg2];
        int var7 = arg4;
        arg1[arg2] = var6;
        Object var8 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var8;
        for (int var9 = arg4; var9 < arg2; var9++) {
            if (arg1[var9] < (var9 & 0x1) + var6) {
                int var10 = arg1[var9];
                arg1[var9] = arg1[var7];
                arg1[var7] = var10;
                Object var11 = arg0[var9];
                arg0[var9] = arg0[var7];
                arg0[var7++] = var11;
            }
        }
        arg1[arg2] = arg1[var7];
        arg1[var7] = var6;
        arg0[arg2] = arg0[var7];
        arg0[var7] = var8;
        method305(arg0, arg1, var7 - 1, (byte) 108, arg4);
        method305(arg0, arg1, arg2, (byte) 103, var7 + 1);
    }
}
