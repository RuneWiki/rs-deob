import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class173 {

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Lvh;")
    private class328 field2594 = new class328(64);

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Lpj;")
    private class132 field2590;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "J")
    public static long field2588 = 20000000L;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "[I")
    public static int[] field2593 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2589 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "Lpj;")
    public static class132 field2598;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "Lun;")
    public static class386 field2597;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIZ)I")
    public static final int method1186(int arg0, int arg1, boolean arg2) {
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        field2591++;
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        if (arg2) {
            method1189(-102);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static final void method1187(int arg0) {
        field2595++;
        class124 var1 = null;
        try {
            if (arg0 != -1) {
                method1191(32, null, null, 52);
            }
            class260 var2 = class503.field6878.method628(14, "2", true);
            while (var2.field3702 == 0) {
                class419.method2390(arg0 ^ 0xFFFFFFCA, 1L);
            }
            if (var2.field3702 == 1) {
                var1 = (class124) var2.field3706;
                byte[] var3 = new byte[(int) var1.method882(-40)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method884((byte) -40, var4, var3.length - var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class353.method2096(false, new class96(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method886(true);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public final void method1188(byte arg0) {
        field2586++;
        class328 var2 = this.field2594;
        synchronized (this.field2594) {
            this.field2594.method1987(-31085);
        }
        if (arg0 >= -39) {
            method1191(55, null, null, 64);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public static void method1189(int arg0) {
        field2593 = null;
        if (arg0 == -7565) {
            field2589 = null;
            field2598 = null;
            field2597 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
    public final void method1190(int arg0) {
        field2596++;
        if (arg0 != -27091) {
            field2598 = null;
        }
        class328 var2 = this.field2594;
        synchronized (this.field2594) {
            this.field2594.method1997(1);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[BLjava/lang/String;I)I")
    public static final int method1191(int arg0, byte[] arg1, String arg2, int arg3) {
        field2587++;
        int var4 = arg3;
        int var5 = arg2.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class265.method1621(arg2.charAt(var6), -1);
            int var8 = var6 + 1 < var5 ? class265.method1621(arg2.charAt(var6 + 1), arg0) : -1;
            int var9 = var5 <= var6 + 2 ? -1 : class265.method1621(arg2.charAt(var6 + 2), arg0);
            int var10 = var5 > var6 + 3 ? class265.method1621(arg2.charAt(var6 + 3), -1) : -1;
            arg1[arg3++] = (byte) class266.method1624(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg1[arg3++] = (byte) class266.method1624(var9 >>> 2, class249.method1537(var8, 15) << 4);
            if (var10 == -1) {
                break;
            }
            arg1[arg3++] = (byte) class266.method1624(class249.method1537(192, var9 << 6), var10);
        }
        if (arg0 != -1) {
            method1186(-104, 98, false);
        }
        return arg3 - var4;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)V")
    public final void method1192(int arg0, byte arg1) {
        field2599++;
        class328 var3 = this.field2594;
        synchronized (this.field2594) {
            this.field2594.method1989(arg0, (byte) 120);
            if (arg1 >= -91) {
                field2598 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Ltq;")
    public final class574 method1193(int arg0, int arg1) {
        field2585++;
        class328 var3 = this.field2594;
        class574 var4;
        synchronized (this.field2594) {
            var4 = (class574) this.field2594.method1986((byte) -116, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field2590;
        byte[] var6;
        synchronized (this.field2590) {
            var6 = this.field2590.method940(class192.method1279(1696991210, arg1), class245.method1515(arg0 + 2729, arg1), 0);
        }
        class574 var7 = new class574();
        if (var6 != null) {
            var7.method3155(new class96(var6), true);
        }
        class328 var8 = this.field2594;
        synchronized (this.field2594) {
            this.field2594.method1985(var7, (long) arg1, (byte) -102);
        }
        return arg0 == -1706 ? var7 : null;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ldd;ILpj;)V")
    public class173(class647 arg0, int arg1, class132 arg2) {
        this.field2590 = arg2;
        if (this.field2590 != null) {
            int var4 = this.field2590.method917((byte) -74) - 1;
            this.field2590.method936(var4, -127);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)V")
    public final void method1194(int arg0, int arg1) {
        field2592++;
        class328 var3 = this.field2594;
        synchronized (this.field2594) {
            this.field2594.method1997(1);
            this.field2594 = new class328(arg0);
            int var4 = -99 % ((-arg1 - 87) / 34);
        }
    }
}
