import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class10 {

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field287 = null;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field291 = new String[5];

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field293 = 0;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIBIII)V", line = 14)
    public static final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        if (arg7 == arg9 && arg3 == arg4 && arg1 == arg2 && arg0 == arg8) {
            class140.method967(true, arg8, arg1, arg7, arg5, arg3);
        } else {
            int var10 = arg7;
            int var11 = arg3;
            int var12 = arg3 * 3;
            int var13 = arg7 * 3;
            int var14 = arg9 * 3;
            int var15 = arg4 * 3;
            int var16 = arg2 * 3;
            int var17 = arg0 * 3;
            int var18 = arg1 + var14 - var16 - arg7;
            int var19 = arg8 + var15 - var17 - arg3;
            int var20 = var16 + var13 - var14 - var14;
            int var21 = var14 - var13;
            int var22 = var17 + var12 - var15 - var15;
            int var23 = var15 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var22 * var25;
                int var31 = var23 * var24;
                int var32 = (var28 + var30 + var31 >> 12) + arg3;
                int var33 = var21 * var24;
                int var34 = (var27 + var29 + var33 >> 12) + arg7;
                class140.method967(true, var32, var34, var10, arg5, var11);
                var10 = var34;
                var11 = var32;
            }
        }
        int var35 = 59 % ((arg6 + 53) / 62);
        field288++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V", line = 88)
    public static final void method102(int arg0, int arg1) {
        field289++;
        class352.field5619 = arg0;
        class144.field2426 = 0;
        class222.field3671 = 1;
        class316.field5136 = arg1;
        class257.field4202 = null;
        class359.field5720 = -1;
        class181.field3110 = false;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)[B", line = 110)
    public static final synchronized byte[] method103(int arg0, int arg1) {
        field292++;
        if (arg1 == 100 && class220.field3646 > 0) {
            byte[] var2 = class153.field2614[--class220.field3646];
            class153.field2614[class220.field3646] = null;
            return var2;
        } else if (arg1 == 5000 && class260.field4264 > 0) {
            byte[] var3 = class8.field271[--class260.field4264];
            class8.field271[class260.field4264] = null;
            return var3;
        } else {
            int var4 = -55 / ((6 - arg0) / 52);
            if (arg1 == 30000 && class86.field1504 > 0) {
                byte[] var5 = class314.field5111[--class86.field1504];
                class314.field5111[class86.field1504] = null;
                return var5;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 149)
    public static void method104(int arg0) {
        field287 = null;
        field291 = null;
        if (arg0 != -291381620) {
            method104(115);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)Z", line = 161)
    public static final boolean method105(int arg0) {
        if (arg0 != 0) {
            method103(-99, -57);
        }
        field286++;
        try {
            return class132.method933((byte) -83);
        } catch (IOException var5) {
            class359.method2538(0);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class65.field1240 + "," + class359.field5721 + "," + class155.field2629 + " - " + class205.field3414 + "," + (class96.field1750.field139[0] + class272.field4426) + "," + (class96.field1750.field170[0] + class21.field543) + " - ";
            for (int var4 = 0; var4 < class205.field3414 && var4 < 50; var4++) {
                var3 = var3 + class342.field5413.field2496[var4] + ",";
            }
            class348.method2493(-26700, var6, var3);
            class345.method2433((byte) -106);
            return true;
        }
    }
}
