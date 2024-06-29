import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class208 extends class31 {

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "[I")
    private int[] field3077 = new int[512];

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field3075 = -1;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lxa;")
    public static class461 field3076;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public static final void method1374(int arg0) {
        field3073++;
        class124 var1 = null;
        try {
            if (arg0 != -31847) {
                return;
            }
            class260 var2 = class503.field6878.method628(14, "3", false);
            while (var2.field3702 == 0) {
                class419.method2390(126, 1L);
            }
            if (var2.field3702 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class124) var2.field3706;
            byte[] var3 = new byte[(int) var1.method882(-63)];
            if (var3.length == 0) {
                class683.field9609 = "";
                class110.field1492 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method884((byte) -40, var4, var3.length - var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class96 var6 = new class96(var3);
                int var7 = var6.method718(78);
                if (var7 > 60) {
                    throw new RuntimeException("Bad length");
                }
                var6.field1301 = var7 + 1;
                if (!var6.method717(-31)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field1301 = 1;
                int var8 = var6.method718(-55);
                if (var8 > 2) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class683.field9609 = var6.method711((byte) 122);
                class110.field1492 = var6.method711((byte) 120);
                if (var8 < 1) {
                    class174.field2608 = class287.field3995;
                } else {
                    class174.field2608 = var6.method743((byte) -99);
                }
                if (var8 < 2) {
                    class451.field6293 = class531.field7245;
                } else {
                    class451.field6293 = var6.method715(true);
                }
            }
        } catch (Exception var10) {
            class683.field9609 = "";
            class110.field1492 = "";
        }
        try {
            if (var1 != null) {
                var1.method886(true);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjr;)Los;")
    public static final class406 method1375(int arg0, class96 arg1) {
        field3072++;
        if (arg0 != 1) {
            method1375(-79, null);
        }
        int var2 = arg1.method743((byte) -123);
        return new class406(var2);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static void method1376(byte arg0) {
        if (arg0 < 59) {
            field3075 = 47;
        }
        field3076 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Loa;Lgfa;III)V")
    public static final void method1377(class638 arg0, class687 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class137.field1931) {
            class486 var5 = class658.field9266[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field6748 != null && var5.field6748.method140(0)) {
                arg1.method143(0, class658.field9268, var5.field6748, 97, 0, true, arg0);
            }
        }
        if (arg4 < class137.field1931) {
            class486 var6 = class658.field9266[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field6748 != null && var6.field6748.method140(0)) {
                arg1.method143(class658.field9268, 0, var6.field6748, 61, 0, true, arg0);
            }
        }
        if (arg3 < class137.field1931 && arg4 < class22.field308) {
            class486 var7 = class658.field9266[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field6748 != null && var7.field6748.method140(0)) {
                arg1.method143(class658.field9268, class658.field9268, var7.field6748, -89, 0, true, arg0);
            }
        }
        if (arg3 < class137.field1931 && arg4 > 0) {
            class486 var8 = class658.field9266[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field6748 != null && var8.field6748.method140(0)) {
                arg1.method143(-class658.field9268, class658.field9268, var8.field6748, -101, 0, true, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)I")
    public static final int method1378(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            method1375(113, null);
        }
        field3074++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IFIIFBFFI[FI)V")
    public final void method137(int arg0, float arg1, int arg2, int arg3, float arg4, byte arg5, float arg6, float arg7, int arg8, float[] arg9, int arg10) {
        field3078++;
        int var12 = (int) ((float) arg0 * arg7 - 1.0F);
        if (arg5 != -95) {
            return;
        }
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg2 * arg1 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg3 * arg4 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg10 * arg4;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        float var23 = class37.method173(var21, 10);
        int var24 = var20 & var17;
        int var25 = var19 & var17;
        int var26 = this.field3077[var25];
        int var27 = this.field3077[var24];
        for (int var28 = 0; var28 < arg2; var28++) {
            float var29 = (float) var28 * arg1;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            float var34 = class37.method173(var32, arg5 ^ 0xFFFFFFAB);
            int var35 = var31 & var15;
            int var36 = var30 & var15;
            int var37 = this.field3077[var26 + var36];
            int var38 = this.field3077[var26 + var35];
            int var39 = this.field3077[var27 + var36];
            int var40 = this.field3077[var35 + var27];
            for (int var41 = 0; var41 < arg0; var41++) {
                float var42 = (float) var41 * arg7;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                float var47 = class37.method173(var45, 10);
                int var48 = var44 & var13;
                int var49 = var43 & var13;
                arg9[arg8++] = class83.method647(3, class83.method647(3, class83.method647(3, class127.method900(var32, var45, class602.method3336(arg5, -20551), class249.method1537(7, this.field3077[var40 + var48]), var21), var47, class127.method900(var32, var46, arg5 + 20599, class249.method1537(7, this.field3077[var40 + var49]), var21)), var34, class83.method647(3, class127.method900(var33, var45, class602.method3336(arg5, -20551), class249.method1537(7, this.field3077[var39 + var48]), var21), var47, class127.method900(var33, var46, 20504, class249.method1537(this.field3077[var39 + var49], 7), var21))), var23, class83.method647(3, class83.method647(3, class127.method900(var32, var45, 20504, class249.method1537(this.field3077[var48 + var38], 7), var22), var47, class127.method900(var32, var46, 20504, class249.method1537(this.field3077[var38 + var49], 7), var22)), var34, class83.method647(3, class127.method900(var33, var45, 20504, class249.method1537(this.field3077[var37 + var48], 7), var22), var47, class127.method900(var33, var46, 20504, class249.method1537(7, this.field3077[var49 + var37]), var22)))) * arg6;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V")
    public class208(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field3077[var3] = this.field3077[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field3077[var5];
            this.field3077[var5] = this.field3077[var5 + 256] = this.field3077[var4];
            this.field3077[var4] = this.field3077[var4 + 256] = var6;
        }
    }
}
