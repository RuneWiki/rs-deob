import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class366 {

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lks;")
    public class165 field5126 = new class165();

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Z")
    public boolean field5133 = false;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5121 = "purple:";

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[C")
    public static char[] field5124 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5128 = " from your ignore list first.";

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field5130 = -1;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field5127 = 0;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5131 = "level: ";

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public int field5132;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public int field5134;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lam;")
    public static class286 field5120;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lmc;")
    public static class316 field5125;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[J[Ljava/lang/Object;BI)V")
    public static final void method2218(int arg0, long[] arg1, Object[] arg2, byte arg3, int arg4) {
        field5122++;
        if (arg4 < arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var9;
            for (int var10 = arg4; var10 < arg0; var10++) {
                if (arg1[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    Object var13 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var13;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var9;
            method2218(var6 - 1, arg1, arg2, (byte) -47, arg4);
            method2218(arg0, arg1, arg2, (byte) -47, var6 + 1);
        }
        if (arg3 != -47) {
            field5125 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([Ljava/lang/String;IBI)Ljava/lang/String;")
    public static final String method2219(String[] arg0, int arg1, byte arg2, int arg3) {
        field5123++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg0[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            if (arg2 != 86) {
                method2218(-84, (long[]) null, (Object[]) null, (byte) 76, 111);
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method2220(int arg0) {
        field5124 = null;
        field5131 = null;
        field5128 = null;
        field5120 = null;
        field5121 = null;
        if (arg0 == -3894) {
            field5125 = null;
        }
    }
}
