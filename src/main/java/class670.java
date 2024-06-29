import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class670 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Z")
    public static boolean field9423 = false;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field9421;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field9426;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Ljava/lang/String;")
    public static String field9425;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
    public static final int method3834(int arg0, int arg1) {
        field9420++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1 != 23538) {
            field9425 = null;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static void method3835(byte arg0) {
        int var1 = -41 % ((arg0 - 30) / 56);
        field9425 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIZJI)Ljava/lang/String;")
    public static final String method3836(int arg0, int arg1, boolean arg2, long arg3, int arg4) {
        field9422++;
        char var6 = ',';
        char var7 = '.';
        if (arg4 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        int var8 = 120 / ((-arg0 - 30) / 56);
        boolean var9 = false;
        if (arg3 < 0L) {
            var9 = true;
            arg3 = -arg3;
        }
        StringBuffer var10 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var11 = 0; var11 < arg1; var11++) {
                int var12 = (int) arg3;
                arg3 /= 10L;
                var10.append((char) (var12 + 48 - ((int) arg3 * 10)));
            }
            var10.append(var6);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg3;
            arg3 /= 10L;
            var10.append((char) (var14 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var9) {
                    var10.append('-');
                }
                return var10.reverse().toString();
            }
            if (arg2) {
                var13++;
                if (var13 % 3 == 0) {
                    var10.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZILec;)V")
    public static final void method3837(boolean arg0, int arg1, class103 arg2) {
        field9421++;
        if (class596.field8577 >= 50) {
            return;
        }
        if (arg0) {
            method3834(110, -70);
        }
        if (arg2 == null || arg2.field1488 == null || arg1 >= arg2.field1488.length || arg2.field1488[arg1] == null) {
            return;
        }
        int var3 = arg2.field1488[arg1][0];
        int var4 = var3 >> 8;
        int var5 = var3 >> 5 & 0x7;
        if (arg2.field1488[arg1].length > 1) {
            int var6 = (int) ((double) arg2.field1488[arg1].length * Math.random());
            if (var6 > 0) {
                var4 = arg2.field1488[arg1][var6];
            }
        }
        int var7 = 256;
        if (arg2.field1482 != null && arg2.field1470 != null) {
            var7 = class403.method2449(arg2.field1482[arg1], (byte) -71, arg2.field1470[arg1]);
        }
        if (arg2.field1471) {
            class167.method1060(0, (byte) 122, false, var4, var7, var5, 255);
        } else {
            class151.method967(0, 255, var5, var4, var7, 0);
        }
    }
}
