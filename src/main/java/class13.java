import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class13 extends class285 {

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "Z")
    public static boolean field151 = false;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "Ljava/lang/String;")
    public static String field154 = null;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IBI)I", line = 5)
    private final int method73(int arg0, byte arg1, int arg2) {
        field150++;
        int var4 = arg2 * 57 + arg0;
        if (arg1 != -84) {
            this.method73(29, (byte) 124, -21);
        }
        int var5 = var4 ^ var4 << 1;
        return 4096 - ((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 19)
    public static final String method74(int arg0, long arg1) {
        int var3 = -92 % ((-arg0 - 77) / 41);
        field155++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            long var4 = arg1;
            int var6 = 0;
            while (var4 != 0L) {
                var4 /= 37L;
                var6++;
            }
            StringBuffer var7 = new StringBuffer(var6);
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                char var10 = class323.field5017[(int) (var8 - (arg1 * 37L))];
                if (var10 == '_') {
                    var10 = ' ';
                    int var11 = var7.length() - 1;
                    var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                }
                var7.append(var10);
            }
            var7.reverse();
            var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
            return var7.toString();
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 68)
    public class13() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIIIIII)V", line = 76)
    public static final void method75(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class336.field5249 <= arg1 && class191.field3131 >= arg4 && arg3 >= class98.field1410 && class279.field4497 >= arg2) {
            if (arg5 == 1) {
                class44.method239(arg6, arg4, arg2, arg1, arg3, arg0 - 32057);
            } else {
                class57.method362(arg2, arg3, arg4, arg5, true, arg1, arg6);
            }
        } else if (arg5 == 1) {
            class252.method1817(-14242, arg4, arg1, arg2, arg6, arg3);
        } else {
            class119.method834(310, arg3, arg5, arg4, arg2, arg6, arg1);
        }
        field153++;
        if (arg0 != -85) {
            field154 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V", line = 110)
    public static void method76(boolean arg0) {
        field154 = null;
        if (!arg0) {
            method77(-27, -86, 58);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)Z", line = 122)
    public static final boolean method77(int arg0, int arg1, int arg2) {
        int var3 = class130.field2057[arg0][arg1][arg2];
        if (-class146.field2275 == var3) {
            return false;
        } else if (class146.field2275 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class66.method442(var4 + 1, class110.field1642[arg0][arg1][arg2], var5 + 1) && class66.method442(var4 + 128 - 1, class110.field1642[arg0][arg1 + 1][arg2], var5 + 1) && class66.method442(var4 + 128 - 1, class110.field1642[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class66.method442(var4 + 1, class110.field1642[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class130.field2057[arg0][arg1][arg2] = class146.field2275;
                return true;
            } else {
                class130.field2057[arg0][arg1][arg2] = -class146.field2275;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)[I", line = 149)
    public final int[] method60(boolean arg0, int arg1) {
        if (!arg0) {
            method74(-122, -103L);
        }
        int[] var3 = this.field4573.method1116(106, arg1);
        field152++;
        if (this.field4573.field2420) {
            int var4 = class27.field382[arg1];
            for (int var5 = 0; var5 < class287.field4599; var5++) {
                var3[var5] = this.method73(class48.field669[var5], (byte) -84, var4) % 4096;
            }
        }
        return var3;
    }
}
