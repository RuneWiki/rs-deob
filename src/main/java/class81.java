import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class81 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field1053 = -1;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "F")
    public static float field1052;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Z")
    public static boolean field1055;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BZZII)V", line = 3)
    public static final void method577(String arg0, String arg1, byte arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field1054++;
        class438.field6162.field9720 = 1;
        String var7 = arg1.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg6 != -1) {
            class49 var11 = class188.field2466.method3449(2529, arg6);
            if (var11 == null || arg3 != var11.method399(16709)) {
                return;
            }
            if (var11.method399(16709)) {
                var10 = var11.field715;
            } else {
                var9 = var11.field720;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class190.field2488.field10026; var13++) {
            class167 var16 = class190.field2488.method3944(256, var13);
            if ((!arg4 || var16.field2168) && var16.field2190 == -1 && var16.field2188 == -1 && var16.field2143 == 0 && var16.field2149.toLowerCase().indexOf(var7) != -1) {
                if (arg6 != -1) {
                    if (arg3) {
                        if (!arg0.equals(var16.method1047(false, var10, arg6))) {
                            continue;
                        }
                    } else if (arg5 != var16.method1048(false, arg6, var9)) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class721.field10154 = -1;
                    class114.field1405 = null;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        if (arg2 >= -106) {
            field1053 = -61;
        }
        class627.field8739 = 0;
        class114.field1405 = var8;
        class721.field10154 = var12;
        String[] var14 = new String[class721.field10154];
        for (int var15 = 0; var15 < class721.field10154; var15++) {
            var14[var15] = class190.field2488.method3944(256, var8[var15]).field2149;
        }
        class680.method3656(var14, 64, class114.field1405);
        class438.field6162.method3835((byte) -106);
        class438.field6162.field9720 = 2;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 122)
    public static final String method578(int arg0, long arg1) {
        field1056++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % (long) arg0 == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class77.field1025[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 169)
    public static final void method579(int arg0) {
        field1057++;
        if (arg0 != -1) {
            method579(49);
        }
        class506.field7140.method3251(false);
        class508.field7176.method2563(false);
        class56.field803.method2563(false);
    }
}
