import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class173 {

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Z")
    public boolean field2562 = false;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field2559 = new String[100];

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public int field2555;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "J")
    public long field2568;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Lgd;")
    public class310 field2560;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)Lng;", line = 11)
    public static final class162 method1259(byte arg0, int arg1) {
        field2557++;
        class162 var2 = (class162) class34.field431.method1432((byte) 121, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class57.field853.method1507(class179.method1297(81, arg1), (byte) -126, class146.method1087(arg1, -989985305));
        class162 var4 = new class162();
        var4.field2412 = arg1;
        if (var3 != null) {
            var4.method1164(new class35(var3), (byte) 77);
        }
        var4.method1168(106);
        class34.field431.method1436(false, var4, (long) arg1);
        if (arg0 != 119) {
            method1260(-4, 12);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V", line = 42)
    public static final void method1260(int arg0, int arg1) {
        field2561++;
        class278 var2 = (class278) class171.field2547.method203(1710, (long) arg1);
        if (var2 != null && arg0 >= 4) {
            for (int var3 = 0; var3 < var2.field4272.length; var3++) {
                var2.field4272[var3] = -1;
                var2.field4274[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 69)
    public static void method1261(byte arg0) {
        if (arg0 > -102) {
            field2559 = (String[]) null;
        }
        field2559 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z", line = 83)
    public static final boolean method1262(int arg0, int arg1, int arg2) {
        field2569++;
        class101 var3 = class281.method1984(arg2, false);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (~arg0 <= arg1 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method787(arg0, arg1 ^ 0xFFFFBEF8);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILna;Ljava/awt/Frame;)V", line = 100)
    public static final void method1263(int arg0, class26 arg1, Frame arg2) {
        field2563++;
        if (arg0 != 100) {
            return;
        }
        while (true) {
            class233 var3 = arg1.method166(arg2, 7);
            while (var3.field3585 == 0) {
                class97.method768(10L, 97);
            }
            if (var3.field3585 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class97.method768(100L, arg0 ^ 0x5B);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)Lvd;", line = 126)
    public static final class134 method1264(int arg0) {
        field2554++;
        int var1 = 8 % ((50 - arg0) / 63);
        int var2 = class323.field5027[0] * class111.field1756[0];
        byte[] var3 = class274.field4162[0];
        class134 var6;
        if (class16.field190[0]) {
            byte[] var7 = class138.field2153[0];
            int[] var8 = new int[var2];
            for (int var9 = 0; var9 < var2; var9++) {
                var8[var9] = class147.method1098(class142.method1078(var7[var9], 255) << 24, class57.field843[class142.method1078(var3[var9], 255)]);
            }
            var6 = new class192(class150.field2273, class98.field1453, class271.field4096[0], class101.field1541[0], class111.field1756[0], class323.field5027[0], var8);
        } else {
            int[] var4 = new int[var2];
            for (int var5 = 0; var5 < var2; var5++) {
                var4[var5] = class57.field843[class142.method1078(255, var3[var5])];
            }
            var6 = new class134(class150.field2273, class98.field1453, class271.field4096[0], class101.field1541[0], class111.field1756[0], class323.field5027[0], var4);
        }
        class265.method1835(10);
        return var6;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 172)
    public static final void method1265(int arg0) {
        class244.field3675.method1428(10935);
        field2558++;
        if (arg0 <= 42) {
            field2566 = -61;
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V", line = 185)
    public static final void method1266(int arg0) {
        field2556++;
        class243.field3660.method1433(30);
        if (arg0 <= 41) {
            field2559 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILoa;IIII)V", line = 197)
    public static final void method1267(int arg0, int arg1, class288 arg2, int arg3, int arg4, int arg5, int arg6) {
        class89.method723(arg6, arg3, 122, arg2.field4507, arg2.field4496, arg5, arg0, arg1);
        if (arg4 != 8222) {
            field2559 = (String[]) null;
        }
        field2567++;
    }
}
