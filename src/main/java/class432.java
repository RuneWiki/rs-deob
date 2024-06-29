import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class432 {

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public int field6243 = -1;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field6238 = new String[100];

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field6242 = 0;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Lba;")
    public class356 field6245;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Lkp;")
    public static class456 field6237;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "[I")
    public int[] field6241;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field6240;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method2626(int arg0) {
        field6238 = null;
        if (arg0 != 255) {
            method2628(-11, 47, -101);
        }
        field6237 = null;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public static final void method2627(int arg0) {
        class99.field1767.method3698(false);
        field6239++;
        class1.field54.method1509(10134);
        if (arg0 != 255) {
            field6238 = null;
        }
        class467.field6618.method1898(false);
        class237.field3521.method3516(500);
        class317.field4681.method811(1);
        class268.field3985.method248((byte) 80);
        class357.field5338.method2100(arg0 ^ 0xFFFFFF65);
        class261.field3825.method1310(arg0 ^ 0x83);
        class661.field9519.method623(105);
        class107.field1851.method1669((byte) 126);
        class373.field5557.method1153((byte) -4);
        class597.field8568.method2800((byte) -42);
        class342.field5099.method3359(-9);
        class119.field2137.method2828(-106);
        client.field4124.method982(64);
        class475.field6813.method1519(-1);
        class92.field1672.method3559(-123);
        class428.field6168.method2737(116);
        class589.field8478.method2248(arg0 + 16980);
        class598.field8575.method3331(false);
        class159.method1233((byte) 16);
        class399.method2451((byte) -112);
        class244.method1618(-7);
        class55.method641(arg0 - 255);
        if (class625.field9027 != class36.field1029) {
            for (int var1 = 0; var1 < class386.field5663.length; var1++) {
                class386.field5663[var1] = null;
            }
            class59.field1340 = 0;
        }
        class244.method1620(112);
        class317.method2045(-99);
        class241.method1598((byte) -99);
        class26.method489(100);
        class33.method514(arg0 + 12265);
        class683.field9703.method1913(true);
        class623.field9017.method103();
        class459.method2752(15918);
        class706.method3942(1);
        class669.field9559.method2225((byte) -123);
        class247.field3726.method2225((byte) -101);
        class213.field3263.method2225((byte) -84);
        class82.field1600.method2225((byte) -75);
        class35.field1027.method2225((byte) -113);
        class13.field722.method2225((byte) -74);
        class46.field1128.method2225((byte) -84);
        class344.field5127.method2225((byte) -90);
        class632.field9092.method2225((byte) -84);
        class135.field2394.method2225((byte) -104);
        class662.field9534.method2225((byte) -66);
        class325.field4766.method2225((byte) -102);
        class481.field6912.method2225((byte) -71);
        class95.field1708.method2225((byte) -68);
        class444.field6395.method2225((byte) -63);
        class324.field4757.method2225((byte) -87);
        class455.field6494.method2225((byte) -109);
        class323.field4720.method2225((byte) -114);
        class136.field2418.method2225((byte) -96);
        class51.field1188.method2225((byte) -70);
        class405.field5852.method2225((byte) -109);
        class420.field6053.method2225((byte) -107);
        class706.field9942.method2225((byte) -89);
        class613.field8924.method2225((byte) -94);
        class302.field4506.method2225((byte) -64);
        class143.field2508.method2225((byte) -121);
        class150.field2566.method2225((byte) -122);
        class117.field2085.method2225((byte) -103);
        class385.field5656.method2225((byte) -85);
        class150.field2578.method2225((byte) -112);
        class51.field1187.method2225((byte) -64);
        class252.field3751.method2225((byte) -89);
        class206.field3155.method1913(true);
        class183.field2943.method1913(true);
        class37.field1048.method1913(true);
        class192.field3025.method1913(true);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Lar;")
    public static final class636 method2628(int arg0, int arg1, int arg2) {
        class370 var3 = class257.field3792[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5497;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[IBIIIII)V")
    public static final void method2629(int arg0, int[] arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6244++;
        if (arg6 > 0 && !class141.method1144(0, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class141.method1144(0, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg3 == 32993) {
            int var8 = 0;
            int var9 = arg4 <= arg6 ? arg4 : arg6;
            int var10 = arg6 >> 1;
            int var11 = arg4 >> 1;
            int var12 = -110 / ((arg2 + 21) / 53);
            int[] var13 = arg1;
            int[] var14 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var8, arg7, arg6, arg4, 0, arg3, arg5, var13, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = 0;
                int var16 = 0;
                int var17 = arg6 + var16;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var20 = 0; var20 < var10; var20++) {
                        int var21 = var13[var16++];
                        int var22 = var13[var16++];
                        int var23 = var13[var17++];
                        int var24 = var21 >> 24 & 0xFF;
                        int var25 = var13[var17++];
                        int var26 = var21 >> 16 & 0xFF;
                        int var27 = var21 & 0xFF;
                        int var28 = var21 >> 8 & 0xFF;
                        int var29 = (var22 >> 24 & 0xFF) + var24;
                        int var30 = ((var22 & 0xFF1F) >> 8) + var28;
                        int var31 = (var22 & 0xFF) + var27;
                        int var32 = ((var22 & 0xFF3077) >> 16) + var26;
                        int var33 = (var23 & 0xFF) + var31;
                        int var34 = (var23 >> 24 & 0xFF) + var29;
                        int var35 = ((var23 & 0xFF1B97) >> 16) + var32;
                        int var36 = (var23 >> 8 & 0xFF) + var30;
                        int var37 = (var25 & 0xFF) + var33;
                        int var38 = ((var25 & 0xFFFF62) >> 16) + var35;
                        int var39 = (var25 >> 8 & 0xFF) + var36;
                        int var40 = (var25 >> 24 & 0xFF) + var34;
                        var14[var15++] = class2.method189(class481.method2919(var37 >> 2, 255), class2.method189(class481.method2919(var39 << 6, 65280), class2.method189(class481.method2919(-16777216, var40 << 22), class481.method2919(1020, var38) << 14)));
                    }
                    var17 += arg6;
                    var16 += arg6;
                }
                int[] var19 = var14;
                var14 = var13;
                arg4 = var11;
                arg6 = var10;
                var13 = var19;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZII)V")
    public static final void method2630(boolean arg0, int arg1, int arg2) {
        field6246++;
        if (!arg0) {
            field6242 = 111;
        }
        class19 var3 = class373.method2355(97, arg1, 6);
        var3.method432(104);
        var3.field829 = arg2;
    }
}
