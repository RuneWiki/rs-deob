import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class133 {

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Lfa;")
    public static class198 field2093 = new class198();

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "[I")
    public static int[] field2096 = new int[50];

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2095 = "Starting 3d Library";

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "S")
    public static short field2094 = 1;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "[[B")
    public static byte[][] field2097 = new byte[1000][];

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2100 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "Llb;")
    public static class211 field2098;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/lang/String;Llb;)Lem;", line = 6)
    public static final class11 method1006(byte arg0, String arg1, class211 arg2) {
        field2086++;
        int var3 = arg2.method1519((byte) 16, arg1);
        if (var3 == -1) {
            return new class11(0);
        }
        int[] var4 = arg2.method1508(0, var3);
        class11 var5 = new class11(var4.length);
        int var6 = -107 / ((arg0 + 34) / 45);
        for (int var7 = 0; var7 < var5.field112; var7++) {
            class35 var8 = new class35(arg2.method1507(var4[var7], (byte) 52, var3));
            var5.field119[var7] = var8.method279(67);
            var5.field111[var7] = var8.method242((byte) -93);
            var5.field125[var7] = (short) var8.method300(-1394191632);
            var5.field109[var7] = (short) var8.method300(-1394191632);
            var5.field123[var7] = var8.method299(-116);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lek;I)V", line = 40)
    public static final void method1007(class184 arg0, int arg1) {
        field2092++;
        if (class210.field3299 == arg0.field2847) {
            class40.field597[arg0.field2899] = true;
        }
        if (arg1 <= 47) {
            method1011(-17);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBI)I", line = 57)
    public static final int method1008(int arg0, byte arg1, int arg2) {
        if (arg1 != -78) {
            field2100 = (String[]) null;
        }
        field2087++;
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(CB)Z", line = 79)
    public static final boolean method1009(char arg0, byte arg1) {
        field2088++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg1 != 40) {
            field2097 = (byte[][]) ((byte[][]) null);
        }
        if (arg0 != '\u0000') {
            char[] var2 = class282.field4360;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 116)
    public static final void method1010(byte arg0) {
        int var1 = 0;
        field2091++;
        if (arg0 != 121) {
            field2100 = (String[]) null;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class86.method711(true, -127, var1, var2, class250.field3746, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 172)
    public static void method1011(int arg0) {
        field2097 = (byte[][]) null;
        field2095 = null;
        field2093 = null;
        field2098 = null;
        field2096 = null;
        field2100 = null;
        if (arg0 >= -109) {
            method1011(-46);
        }
    }
}
