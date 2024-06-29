import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class20 {

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field260 = 0;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Lii;")
    public static class227 field258 = new class227(64);

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field263 = null;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([II[III)V", line = 6)
    public static final void method121(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg4 > arg3) {
            int var5 = arg3;
            int var6 = (arg3 + arg4) / 2;
            int var7 = arg0[var6];
            arg0[var6] = arg0[arg4];
            arg0[arg4] = var7;
            int var8 = arg2[var6];
            arg2[var6] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (((var9 & 0x1) + var7) < arg0[var9]) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var5];
                    arg2[var5++] = var11;
                }
            }
            arg0[arg4] = arg0[var5];
            arg0[var5] = var7;
            arg2[arg4] = arg2[var5];
            arg2[var5] = var8;
            method121(arg0, 85, arg2, arg3, var5 - 1);
            method121(arg0, 122, arg2, var5 + 1, arg4);
        }
        if (arg1 < 2) {
            field263 = (String) null;
        }
        field261++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 66)
    public static void method122(int arg0) {
        int var1 = 120 % ((-arg0 - 22) / 33);
        field263 = null;
        field258 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLvi;)V", line = 79)
    public static final void method123(byte arg0, class7 arg1) {
        int var2 = -1;
        if (arg0 != -105) {
            return;
        }
        field259++;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        if (arg1.field103 == 0) {
            var5 = class256.method1858(arg1.field102, arg1.field86, arg1.field88);
        }
        if (arg1.field103 == 1) {
            var5 = class267.method1938(arg1.field102, arg1.field86, arg1.field88);
        }
        if (arg1.field103 == 2) {
            var5 = class56.method332(arg1.field102, arg1.field86, arg1.field88);
        }
        if (arg1.field103 == 3) {
            var5 = class208.method1431(arg1.field102, arg1.field86, arg1.field88);
        }
        if (var5 != 0L) {
            var4 = (int) var5 >> 20 & 0x3;
            var3 = ((int) var5 & 0x7F445) >> 14;
            var2 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
        }
        arg1.field89 = var3;
        arg1.field87 = var2;
        arg1.field95 = var4;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;", line = 129)
    public static final String method124(int arg0, String[] arg1, int arg2, int arg3) {
        field262++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var11 = arg1[arg0];
            return var11 == null ? "null" : var11.toString();
        } else {
            int var4 = arg2 + arg0;
            int var5 = 0;
            for (int var6 = arg0; var6 < var4; var6++) {
                String var7 = arg1[var6];
                if (var7 == null) {
                    var5 += 4;
                } else {
                    var5 += var7.length();
                }
            }
            if (arg3 != 3) {
                field263 = (String) null;
            }
            StringBuffer var8 = new StringBuffer(var5);
            for (int var9 = arg0; var9 < var4; var9++) {
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

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 196)
    public static final void method125(int arg0) {
        field257++;
        if (arg0 != 47) {
            method121((int[]) null, -91, (int[]) null, -31, -19);
        }
        if (class162.field2236) {
            return;
        }
        class90.field1125 = true;
        if (class258.field3925) {
            class184.field2664 = (float) ((int) class184.field2664 + 47 & 0xFFFFFFF0);
        } else {
            class163.field2261 += (12.0F - class163.field2261) / 2.0F;
        }
        class162.field2236 = true;
    }
}
