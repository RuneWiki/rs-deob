import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class168 extends class43 {

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public volatile int field1962 = -1;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "Ljava/lang/String;")
    public volatile String field1966;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field1963 = 0;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "Z")
    public static boolean field1968 = true;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Lhq;")
    public static class365 field1960 = new class365(64);

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "[[[B")
    public static byte[][][] field1959;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 4)
    public static void method1068(int arg0) {
        field1960 = null;
        if (arg0 != -295) {
            method1068(103);
        }
        field1959 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILbg;)V", line = 17)
    public static final void method1069(int arg0, class242 arg1) {
        field1967++;
        byte[] var2 = new byte[24];
        if (class357.field4846 != null) {
            try {
                class357.field4846.method2634(-10092, 0L);
                class357.field4846.method2635(var2, (byte) 0);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg0 != -1) {
            method1069(78, (class242) null);
        }
        arg1.method1544(24, arg0 ^ 0xFFFFFF8A, 0, var2);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)I", line = 64)
    public static final int method1070(int arg0, boolean arg1) {
        field1964++;
        double var2 = (double) ((arg0 & 0xFFA06A) >> 16) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF3A) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        if (!arg1) {
            field1963 = 111;
        }
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + (((var20 >> 2 & 0x3F) << 10) + (var22 >> 1));
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V", line = 164)
    public static final void method1071(int arg0) {
        class430.method2618(-7195);
        field1965++;
        class238.method1525(arg0);
        class15.method88(-1);
        class367.method2318(10);
        class175.method1101(-29833);
        class413.method2554((byte) -95);
        class419.method2570(0);
        class6.method21((byte) 67);
        class17.method99(-114);
        class451.method2794((byte) 70);
        class379.method2356(-1);
        class274.method1723(72);
        class158.method1006(true);
        class214.method1311((byte) 121);
        class238.method1528(true);
        class299.method1897(90);
        class265.method1662(2);
        class398.method2455(24213);
        class75.method444((byte) 105);
        class167.method1060((byte) 126);
        class240.method1532(-116);
        class203.method1242(17831);
        class59.method344((byte) 120);
        class18.field209.method2290(arg0 ^ 0x3607);
        class320.field4295.method2290(13831);
        class382.field5232.method2290(arg0 + 13831);
        class241.field3162.method2290(13831);
        class93.field1101.method2290(13831);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 204)
    public class168(String arg0) {
        this.field1966 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V", line = 224)
    public static final void method1072(int arg0) {
        class367.field5003 = arg0;
        for (int var1 = 0; var1 < class43.field512; var1++) {
            for (int var2 = 0; var2 < class262.field3367; var2++) {
                if (class347.field4722[arg0][var1][var2] == null) {
                    class347.field4722[arg0][var1][var2] = new class316(arg0, var1, var2);
                }
            }
        }
    }
}
