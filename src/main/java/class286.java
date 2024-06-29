import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class286 extends class55 {

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "[I")
    public static int[] field4414 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "[I")
    public static int[] field4423 = new int[2048];

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "[I")
    public static int[] field4430 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "Lrc;")
    public static class9 field4428 = new class9(64);

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    public static int field4431 = 0;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4432 = "Unable to find ";

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field4433 = 0;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public int field4419;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public int field4420;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public int field4421;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "Ljava/lang/String;")
    public String field4426;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "[I")
    public int[] field4425;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "[I")
    public int[] field4429;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "[Lc;")
    public class284[] field4418;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "[Ljava/lang/String;")
    public String[] field4422;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)I")
    public static final int method1909(int arg0, int arg1, int arg2) {
        if (arg1 != 26408) {
            method1909(-41, -102, 68);
        }
        field4417++;
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
    public static final void method1910(int arg0) {
        field4424++;
        class289 var1 = class280.field4251;
        synchronized (class280.field4251) {
            class109.field1465 = class91.field1237;
            class228.field3210++;
            if (arg0 <= class296.field4675) {
                while (class296.field4675 != class178.field2539) {
                    int var2 = class136.field1978[class178.field2539];
                    class178.field2539 = class178.field2539 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class260.field3784[var2] = true;
                    } else {
                        class260.field3784[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class260.field3784[var3] = false;
                }
                class296.field4675 = class178.field2539;
            }
            class91.field1237 = class90.field1231;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4415++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg2 - arg6;
        int var12 = arg4 - arg6;
        int var13 = arg4 * arg4;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var16 << 1;
        int var18 = var13 << 1;
        int var19 = var14 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = var13 - ((var21 - 1) * var19);
        int var24 = (arg5 - var21) * var14 + var18;
        int var25 = (1 - var22) * var15 + var17;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var14 << 2;
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var18 * 3;
        int var32 = (var21 - 3) * var19;
        int var33 = var17 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg4 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class268.field3919[arg0];
        class76.method463(arg1 - arg2, 0, arg3, arg1 - var11, var39);
        class76.method463(arg1 - var11, 0, arg7, arg1 + var11, var39);
        class76.method463(arg1 + var11, 0, arg3, arg1 + arg2, var39);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var10++;
                        var26 += var37;
                        var37 += var30;
                        var25 += var33;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var25 += -var38;
                var38 -= var29;
                var26 += -var34;
                var34 -= var29;
            }
            if (var24 < 0) {
                while (var24 < 0) {
                    var24 += var31;
                    var8++;
                    var31 += var28;
                    var23 += var35;
                    var35 += var28;
                }
            }
            if (var23 < 0) {
                var24 += var31;
                var8++;
                var23 += var35;
                var31 += var28;
                var35 += var28;
            }
            var24 += -var36;
            int var41 = arg1 + var8;
            var36 -= var27;
            var23 += -var32;
            int var42 = arg1 - var8;
            var32 -= var27;
            var9--;
            int var43 = arg0 - var9;
            int var44 = arg0 + var9;
            if (var40) {
                int var45 = arg1 + var10;
                int var46 = arg1 - var10;
                class76.method463(var42, 0, arg3, var46, class268.field3919[var43]);
                class76.method463(var46, 0, arg7, var45, class268.field3919[var43]);
                class76.method463(var45, arg5 ^ 0x1, arg3, var41, class268.field3919[var43]);
                class76.method463(var42, arg5 - 1, arg3, var46, class268.field3919[var44]);
                class76.method463(var46, 0, arg7, var45, class268.field3919[var44]);
                class76.method463(var45, 0, arg3, var41, class268.field3919[var44]);
            } else {
                class76.method463(var42, 0, arg3, var41, class268.field3919[var43]);
                class76.method463(var42, 0, arg3, var41, class268.field3919[var44]);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1912(byte arg0, Throwable arg1) throws IOException {
        String var2;
        if ((arg1 instanceof class197)) {
            class197 var3 = (class197) arg1;
            arg1 = var3.field2807;
            var2 = var3.field2803 + " | ";
        } else {
            var2 = "";
        }
        field4416++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg0 <= 6) {
            method1909(72, -50, 73);
        }
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)V")
    public static void method1913(int arg0) {
        field4430 = null;
        field4432 = null;
        field4428 = null;
        field4414 = null;
        if (arg0 == 1) {
            field4423 = null;
        }
    }
}
