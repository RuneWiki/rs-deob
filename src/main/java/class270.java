import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class270 {

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
    public static int[] field3681 = new int[50];

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3684;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[Llq;")
    public static class327[] field3680;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[Z")
    public static boolean[] field3678;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "[[I")
    public static int[][] field3683;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1658(int arg0) {
        field3683 = null;
        field3684 = null;
        if (arg0 != -16805) {
            field3687 = 83;
        }
        field3680 = null;
        field3678 = null;
        field3681 = null;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static final void method1659(int arg0) {
        for (class147 var1 = (class147) class196.field2721.method2307(false); var1 != null; var1 = (class147) class196.field2721.method2311(arg0 ^ 0xFFFFEC06)) {
            var1.method1011();
        }
        field3677++;
        if (arg0 != 2) {
            method1661((class296) null, -106);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BII)V")
    public static final void method1660(byte arg0, int arg1, int arg2) {
        field3686++;
        class413 var3 = class300.method1936(arg2, (byte) -11);
        int var4 = var3.field5996;
        int var5 = var3.field5997;
        int var6 = var3.field5994;
        int var7 = class48.field731[var6 - var5];
        if (arg0 >= -120) {
            method1659(-72);
        }
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class357.method2309(var4, true, var8 & arg1 << var5 | ~var8 & class447.field6439[var4]);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lqj;I)V")
    public static final void method1661(class296 arg0, int arg1) {
        field3685++;
        class321.field4395 = arg0;
        int var2 = 7 % ((-arg1 - 74) / 33);
        class321.field4395.method1911(0, 35);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([BB)Lvf;")
    public static final class84 method1662(byte[] arg0, byte arg1) {
        field3688++;
        class84 var2 = new class84();
        class371 var3 = new class371(arg0);
        var3.field5273 = var3.field5258.length - 2;
        int var4 = var3.method2403((byte) 89);
        int var5 = var3.field5258.length - var4 - 2 - 12;
        var3.field5273 = var5;
        int var6 = var3.method2413((byte) -30);
        var2.field1289 = var3.method2403((byte) 127);
        if (arg1 != -108) {
            method1662((byte[]) null, (byte) -1);
        }
        var2.field1300 = var3.method2403((byte) 66);
        var2.field1292 = var3.method2403((byte) 45);
        var2.field1288 = var3.method2403((byte) 67);
        int var7 = var3.method2429(0);
        if (var7 > 0) {
            var2.field1291 = new class223[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2403((byte) 111);
                class223 var10 = new class223(class164.method1089(var9, (byte) -102));
                var2.field1291[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method2413((byte) -30);
                    int var12 = var3.method2413((byte) -30);
                    var10.method1419((long) var11, 55, new class23(var12));
                }
            }
        }
        var3.field5273 = 0;
        var2.field1297 = var3.method2402((byte) 33);
        var2.field1301 = new int[var6];
        var2.field1296 = new int[var6];
        var2.field1295 = new String[var6];
        int var13 = 0;
        while (var3.field5273 < var5) {
            int var14 = var3.method2403((byte) 123);
            if (var14 == 3) {
                var2.field1295[var13] = var3.method2422(-1).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field1301[var13] = var3.method2429(0);
            } else {
                var2.field1301[var13] = var3.method2413((byte) -30);
            }
            var2.field1296[var13++] = var14;
        }
        return var2;
    }
}
