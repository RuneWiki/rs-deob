import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class30 {

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    private int field941;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "J")
    private long field939;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Lqfa;")
    public static class85 field950 = new class85(7, 4);

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Z")
    public static boolean field951 = false;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Lrd;")
    public static class310 field938;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method496(int arg0) {
        if (arg0 <= 76) {
            field940 = -45;
        }
        field950 = null;
        field938 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILds;)V")
    private final void method497(int arg0, class14 arg1) {
        field942++;
        if (arg0 == 192) {
            this.field939 |= (arg1.field723 << this.field941++ * class14.field738);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method498(String arg0, byte arg1) {
        field947++;
        if (arg0 == null) {
            return;
        }
        if (!(class164.field2749 < 200 || class35.field1012) || class164.field2749 >= 200) {
            class108.method974(4, class265.field3885.method1733(255, class140.field2466), 3867);
            String var2 = class265.field3886.method1733(255, class140.field2466);
            if (var2 != null) {
                class108.method974(4, var2, 3867);
            }
            return;
        }
        if (arg1 < 90) {
            method496(-23);
        }
        String var3 = class655.method3728(arg0, true);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class164.field2749; var4++) {
            String var9 = class655.method3728(class343.field5109[var4], true);
            if (var9 != null && var9.equals(var3)) {
                class108.method974(4, arg0 + class265.field3913.method1733(255, class140.field2466), 3867);
                return;
            }
            if (class673.field9579[var4] != null) {
                String var10 = class655.method3728(class673.field9579[var4], true);
                if (var10 != null && var10.equals(var3)) {
                    class108.method974(4, arg0 + class265.field3913.method1733(255, class140.field2466), 3867);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class296.field4436; var5++) {
            String var7 = class655.method3728(class518.field7306[var5], true);
            if (var7 != null && var7.equals(var3)) {
                class108.method974(4, class265.field3918.method1733(255, class140.field2466) + arg0 + class265.field3919.method1733(255, class140.field2466), 3867);
                return;
            }
            if (class291.field4370[var5] != null) {
                String var8 = class655.method3728(class291.field4370[var5], true);
                if (var8 != null && var8.equals(var3)) {
                    class108.method974(4, class265.field3918.method1733(255, class140.field2466) + arg0 + class265.field3919.method1733(255, class140.field2466), 3867);
                    return;
                }
            }
        }
        if (class655.method3728(class532.field7456.field8631, true).equals(var3)) {
            class108.method974(4, class265.field3916.method1733(255, class140.field2466), 3867);
            return;
        }
        class377.field5603++;
        class275 var6 = class185.method1355(0, class219.field3318, class395.field5772);
        var6.field4103.method693((byte) 106, class511.method3019(arg0, -127));
        var6.field4103.method750(117, arg0);
        class140.method1141(var6, 19321);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)I")
    public static final int method499(int arg0, int arg1) {
        field943++;
        return arg1 == 0 ? arg0 & 0xFF : 58;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Z")
    public static final boolean method500(int arg0, int arg1, int arg2) {
        if (arg1 > -93) {
            return false;
        } else {
            field952++;
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)I")
    private final int method501(byte arg0, int arg1) {
        field949++;
        if (arg0 != 22) {
            method500(-27, -99, -41);
        }
        return (int) (this.field939 >> class14.field738 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)Lds;")
    public final class14 method502(int arg0, int arg1) {
        if (arg0 < 89) {
            method498(null, (byte) -37);
        }
        field946++;
        return class14.method373((byte) -79, this.method501((byte) 22, arg1));
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)I")
    public final int method503(byte arg0) {
        if (arg0 != -95) {
            this.method501((byte) -40, 75);
        }
        field944++;
        return this.field941;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I[BILjava/lang/String;)I")
    public static final int method504(int arg0, byte[] arg1, int arg2, String arg3) {
        field945++;
        int var4 = arg3.length();
        int var5 = arg2;
        for (int var6 = arg0; var6 < var4; var6++) {
            char var7 = arg3.charAt(var6);
            if (var7 <= '\u007F') {
                arg1[var5++] = (byte) var7;
            } else if (var7 <= '߿') {
                arg1[var5++] = (byte) class2.method189(192, var7 >> 6);
                arg1[var5++] = (byte) class2.method189(class481.method2919(63, var7), 128);
            } else {
                arg1[var5++] = (byte) class2.method189(var7 >> 12, 224);
                arg1[var5++] = (byte) class2.method189(class481.method2919(var7 >> 6, 63), 128);
                arg1[var5++] = (byte) class2.method189(class481.method2919(var7, 63), 128);
            }
        }
        return var5 - arg2;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lds;)V")
    public class30(class14 arg0) {
        this.field941 = 1;
        this.field939 = arg0.field723;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLjava/awt/Canvas;)Luf;")
    public static final class416 method505(byte arg0, Canvas arg1) {
        field948++;
        int var2 = 26 % ((arg0 + 51) / 50);
        try {
            Class var3 = Class.forName("ec");
            class416 var4 = (class416) var3.getDeclaredConstructor().newInstance();
            var4.method819(arg1, 1);
            return var4;
        } catch (Throwable var6) {
            class77 var5 = new class77();
            var5.method819(arg1, 1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "([Lds;)V")
    public class30(class14[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method497(192, arg0[var2]);
        }
    }
}
