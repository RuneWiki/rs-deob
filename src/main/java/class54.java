import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class54 extends InputStream {

    @OriginalMember(owner = "client!gja", name = "e", descriptor = "Lke;")
    public static class622 field750 = new class622(130, -1);

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!gja", name = "d", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!gja", name = "f", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "Ljava/lang/String;")
    public static String field748;

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V")
    public static void method347(int arg0) {
        field750 = null;
        if (arg0 != 32427) {
            method348(null, true, null, null, true, null);
        }
        field748 = null;
    }

    @OriginalMember(owner = "client!gja", name = "read", descriptor = "()I")
    public final int read() {
        field749++;
        class117.method820(false, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lkf;ZLda;Lha;ZLjava/lang/String;)V")
    public static final void method348(class263 arg0, boolean arg1, class67 arg2, class66 arg3, boolean arg4, String arg5) {
        field751++;
        boolean var6 = !class780.field10754 || class659.method3764((byte) -77);
        if (!var6) {
            return;
        }
        if (arg1) {
            method347(127);
        }
        if (class780.field10754 && var6) {
            class263 var12 = class414.field5851;
            class67 var13 = arg3.method403(var12, class609.field8597, true);
            int var14 = var12.method1736(250, null, arg5, 0);
            int var15 = var12.method1734(250, var12.field3711, 0, arg5, null);
            int var16 = class134.field1742.field8827;
            int var17 = var16 + 4;
            int var18 = var17 * 2 + var14;
            int var19 = var17 * 2 + var15;
            if (class397.field5652 > var19) {
                var19 = class397.field5652;
            }
            if (var18 < class476.field6770) {
                var18 = class476.field6770;
            }
            int var20 = class241.field3465.method2164(class785.field10790, 0, var18) + class52.field743;
            int var21 = class224.field3220.method1378((byte) 113, class264.field3734, var19) + class238.field3432;
            if (class607.field8578) {
                var20 += class17.method143(-128);
                var21 += class638.method3629(19728);
            }
            arg3.method482(class419.field5901, false).method788(class758.field10462.field8827 + var20, class758.field10462.field8822 + var21, var18 - class758.field10462.field8827 * 2, -(class758.field10462.field8822 * 2) + var19, 1, 0, 0);
            arg3.method482(class758.field10462, true).method785(var20, var21);
            class758.field10462.method3585();
            arg3.method482(class758.field10462, true).method785(var18 + var20 - var16, var21);
            class758.field10462.method3575();
            arg3.method482(class758.field10462, true).method785(var20 + var18 - var16, var21 - (-var19 + var16));
            class758.field10462.method3585();
            arg3.method482(class758.field10462, true).method785(var20, var21 + var19 - var16);
            class758.field10462.method3575();
            arg3.method482(class134.field1742, true).method791(var20, class758.field10462.field8822 + var21, var16, var19 - class758.field10462.field8822 * 2);
            class134.field1742.method3577();
            arg3.method482(class134.field1742, true).method791(class758.field10462.field8827 + var20, var21, var18 - (class758.field10462.field8827 * 2), var16);
            class134.field1742.method3577();
            arg3.method482(class134.field1742, true).method791(var18 + var20 - var16, var21 - -class758.field10462.field8822, var16, var19 - (class758.field10462.field8822 * 2));
            class134.field1742.method3577();
            arg3.method482(class134.field1742, true).method791(class758.field10462.field8827 + var20, var19 + var21 + -var16, var18 - (class758.field10462.field8827 * 2), var16);
            class134.field1742.method3577();
            var13.method516(var17 + var21, -(var17 * 2) + var19, arg5, 0, 0, 1, var18 - (var17 * 2), 0, class421.field5945 | 0xFF000000, var17 + var20, (byte) 89, 1, null, null, null, -1);
            class223.method1546(var18, var20, (byte) 127, var19, var21);
        } else {
            int var7 = arg0.method1736(250, null, arg5, 0);
            int var8 = arg0.method1733(arg5, null, 250, -128) * 13;
            byte var9 = 4;
            int var10 = var9 + 6;
            int var11 = var9 + 6;
            arg3.method474(var10 - var9, -var9 + var11, var7 - (-var9 - var9), var8 + var9 + var9, -16777216, 0);
            arg3.method457(var10 - var9, -var9 + var11, var9 + var9 + var7, var8 + var9 + var9, -1, 0);
            arg2.method516(var11, var8, arg5, 0, 0, 1, var7, 0, -1, var10, (byte) 89, 1, null, null, null, -1);
            class223.method1546(var9 + var9 + var7, -var9 + var10, (byte) 120, var8 + var9 + var9, -var9 + var11);
        }
        if (!arg4) {
            return;
        }
        try {
            if (class607.field8578) {
                class360.method2260((byte) 107);
            } else {
                arg3.method416((byte) -63);
            }
        } catch (class138 var22) {
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I[BZ)V")
    public static final void method349(int arg0, byte[] arg1, boolean arg2) {
        if (class106.field1308 == null) {
            class106.field1308 = new class120(20000);
        }
        field747++;
        class106.field1308.method885(arg1, -18983, arg1.length, 0);
        if (arg0 != 24828) {
            method349(87, null, false);
        }
        if (!arg2) {
            return;
        }
        class559.method3238((byte) 120, class106.field1308.field1556);
        class194.field2859 = new class162[class542.field7602];
        int var3 = 0;
        for (int var4 = class132.field1729; var4 <= class585.field8280; var4++) {
            class162 var5 = class434.method2599(var4, false);
            if (var5 != null) {
                class194.field2859[var3++] = var5;
            }
        }
        class195.field2874 = false;
        class422.field5968 = class109.method731(116);
        class106.field1308 = null;
    }
}
