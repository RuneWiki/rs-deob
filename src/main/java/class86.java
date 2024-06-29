import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class86 {

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1624 = " has logged in.";

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Z")
    public static boolean field1617 = false;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "[[B")
    public static byte[][] field1618 = new byte[250][];

    @OriginalMember(owner = "client!al", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field1623 = null;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field1616 = 0;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Lbi;", line = 11)
    public static final class71 method599(int arg0) {
        field1625++;
        if (arg0 < 56) {
            return (class71) null;
        }
        try {
            return (class71) Class.forName("b").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BZ)V", line = 27)
    public static final void method600(byte arg0, boolean arg1) {
        if (arg0 != -20) {
            method599(-28);
        }
        class122.method791(class88.field1658, class158.field2580, -91, class134.field2257, arg1);
        field1626++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIII)V", line = 42)
    public static final void method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1621++;
        int var7 = class8.method73(8, class186.field3028, class59.field1162, arg0);
        int var8 = class8.method73(arg1 ^ 0x191D, class186.field3028, class59.field1162, arg4);
        int var9 = class8.method73(arg1 ^ 0x191D, class259.field4024, class147.field2416, arg2);
        int var10 = class8.method73(arg1 ^ 0x191D, class259.field4024, class147.field2416, arg5);
        int var11 = class8.method73(arg1 ^ 0x191D, class186.field3028, class59.field1162, arg0 + arg3);
        int var12 = class8.method73(8, class186.field3028, class59.field1162, arg4 - arg3);
        for (int var13 = var7; var13 < var11; var13++) {
            class241.method1598(arg6, -7, class155.field2522[var13], var10, var9);
        }
        if (arg1 != 6421) {
            field1623 = (String[]) null;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class241.method1598(arg6, -7, class155.field2522[var14], var10, var9);
        }
        int var15 = class8.method73(8, class259.field4024, class147.field2416, arg2 + arg3);
        int var16 = class8.method73(arg1 - 6413, class259.field4024, class147.field2416, arg5 - arg3);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class155.field2522[var17];
            class241.method1598(arg6, arg1 - 6428, var18, var15, var9);
            class241.method1598(arg6, -7, var18, var10, var16);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLbm;)V", line = 91)
    public static final void method602(byte arg0, class307 arg1) {
        field1620++;
        class335.field5144 = arg1;
        if (arg0 != -116) {
            method599(-107);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZZJLjava/lang/String;ZIIILjava/lang/String;I)V", line = 108)
    public static final void method603(int arg0, boolean arg1, boolean arg2, long arg3, String arg4, boolean arg5, int arg6, int arg7, int arg8, String arg9, int arg10) {
        field1619++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class202 var14 = new class202(128);
        var14.method1311(10, 10964);
        var14.method1313((arg5 ? 2 : 0) | (arg1 ? 1 : 0) | (arg2 ? 4 : 0), -376480);
        var14.method1353((byte) -105, arg3);
        var14.method1359(16705, var12[0]);
        var14.method1309(90, arg4);
        var14.method1359(16705, var12[1]);
        var14.method1313(class190.field3090, -376480);
        var14.method1311(arg10, 10964);
        var14.method1311(arg8, 10964);
        var14.method1359(16705, var12[2]);
        var14.method1313(arg7, -376480);
        var14.method1313(arg0, -376480);
        var14.method1359(16705, var12[3]);
        var14.method1347(class79.field1557, 0, class341.field5301);
        if (arg6 < 120) {
            method602((byte) -75, (class307) null);
        }
        class202 var15 = new class202(350);
        var15.method1309(63, arg9);
        int var16 = 8 - class295.method1975((byte) 126, arg9) % 8;
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1311((int) (Math.random() * 255.0D), 10964);
        }
        var15.method1336(false, var12);
        class14.field263.field3249 = 0;
        class14.field263.method1311(22, 10964);
        class14.field263.method1313(var15.field3249 + var14.field3249 + 2, -376480);
        class14.field263.method1313(537, -376480);
        class14.field263.method1332(var14.field3273, var14.field3249, (byte) 0, 0);
        class14.field263.method1332(var15.field3273, var15.field3249, (byte) 0, 0);
        class196.field3157 = 0;
        class341.field5296 = 0;
        class40.field775 = -3;
        class53.field1075 = 1;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V", line = 179)
    public static void method604(int arg0) {
        if (arg0 > -65) {
            method601(55, 126, -22, -2, -48, 33, -11);
        }
        field1618 = (byte[][]) null;
        field1624 = null;
        field1623 = null;
    }
}
