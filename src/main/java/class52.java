import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class52 extends class88 {

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "Lhj;")
    public static class69 field923 = class181.method1318("http:)4)4", (byte) -106);

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field916 = -1;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field929 = 50;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "[Lhj;")
    public static class69[] field926 = new class69[field929];

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "[I")
    public static int[] field928 = new int[field929];

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "[I")
    public static int[] field917 = new int[field929];

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "[I")
    public static int[] field930 = new int[field929];

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "Lhj;")
    public static class69 field924 = class181.method1318("welle:", (byte) -121);

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "[I")
    public static int[] field921 = new int[field929];

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "[I")
    public static int[] field934 = new int[field929];

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "[I")
    public static int[] field920 = new int[field929];

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "[I")
    public static int[] field932 = new int[field929];

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "[I")
    public int[] field915;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "[I")
    public int[] field922;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "[I")
    public int[] field935;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "[Lue;")
    public class86[] field914;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "[Lue;")
    public class86[] field919;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "[[[B")
    public byte[][][] field925;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Loh;ZI)V")
    public static final void method306(class259 arg0, boolean arg1, int arg2) {
        field918++;
        int var3 = arg0.field4640;
        int var4 = (int) arg0.field1685;
        arg0.method632(arg2 ^ 0xFFFFDF9B);
        if (arg1) {
            class16.method100(2893, var3);
        }
        class236.method1669(var3, (byte) -27);
        class50 var5 = client.method1144((byte) -9, var4);
        if (var5 != null) {
            class204.method1478(var5, false);
        }
        int var6 = class177.field3218;
        if (arg2 != 3) {
            method307(-42);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (class170.method1242(class208.field3782[var7], -108)) {
                class221.method1570(var7, (byte) -30);
            }
        }
        if (class177.field3218 == 1) {
            class103.field1936 = false;
            class224.method1588(class134.field2493, (byte) 59, class46.field662, class200.field3613, class65.field1262);
        } else {
            class224.method1588(class134.field2493, (byte) 59, class46.field662, class200.field3613, class65.field1262);
            int var8 = class26.field378.method1606(class229.field4201);
            for (int var9 = 0; var9 < class177.field3218; var9++) {
                int var10 = class26.field378.method1606(class224.method1589(false, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class65.field1262 = var8 + 8;
            class134.field2493 = class177.field3218 * 15 + 22;
        }
        if (class35.field483 != -1) {
            class215.method1548(1, class35.field483, 33);
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
    public static void method307(int arg0) {
        field934 = null;
        field923 = null;
        field926 = null;
        field932 = null;
        field930 = null;
        field928 = null;
        field924 = null;
        if (arg0 != 26480) {
            method307(4);
        }
        field917 = null;
        field920 = null;
        field921 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
    public static final void method308(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field936++;
        if (arg0 != -3) {
            method309((byte) 57);
        }
        if (arg3 >= class201.field3629 && arg3 <= class35.field485) {
            int var5 = class240.method1700(class166.field3075, arg2, arg0 + 129, class19.field252);
            int var6 = class240.method1700(class166.field3075, arg4, arg0 ^ 0x1, class19.field252);
            class211.method1524(var5, var6, arg1, (byte) 58, arg3);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
    public static final void method309(byte arg0) {
        field913++;
        if (arg0 != 6) {
            method307(-64);
        }
        class199.field3595.method294(false);
        int var1 = class199.field3595.method305(8, 8);
        if (var1 < class46.field659) {
            for (int var2 = var1; var2 < class46.field659; var2++) {
                class108.field2071[class88.field1681++] = class245.field4490[var2];
            }
        }
        if (var1 > class46.field659) {
            throw new RuntimeException("gnpov1");
        }
        class46.field659 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class245.field4490[var3];
            class38 var5 = class131.field2428[var4];
            int var6 = class199.field3595.method305(1, 8);
            if (var6 == 0) {
                class245.field4490[class46.field659++] = var4;
                var5.field4041 = class180.field3272;
            } else {
                int var7 = class199.field3595.method305(2, 8);
                if (var7 == 0) {
                    class245.field4490[class46.field659++] = var4;
                    var5.field4041 = class180.field3272;
                    class102.field1908[class156.field2917++] = var4;
                } else if (var7 == 1) {
                    class245.field4490[class46.field659++] = var4;
                    var5.field4041 = class180.field3272;
                    int var8 = class199.field3595.method305(3, 8);
                    var5.method1576(4, var8, false);
                    int var9 = class199.field3595.method305(1, arg0 ^ 0xE);
                    if (var9 == 1) {
                        class102.field1908[class156.field2917++] = var4;
                    }
                } else if (var7 == 2) {
                    class245.field4490[class46.field659++] = var4;
                    var5.field4041 = class180.field3272;
                    int var10 = class199.field3595.method305(3, 8);
                    var5.method1576(arg0 - 2, var10, true);
                    int var11 = class199.field3595.method305(3, 8);
                    var5.method1576(4, var11, true);
                    int var12 = class199.field3595.method305(1, 8);
                    if (var12 == 1) {
                        class102.field1908[class156.field2917++] = var4;
                    }
                } else if (var7 == 3) {
                    class108.field2071[class88.field1681++] = var4;
                }
            }
        }
    }
}
