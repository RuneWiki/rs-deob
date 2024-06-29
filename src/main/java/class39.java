import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class39 extends class210 {

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "Ljd;")
    private static class92 field874 = class202.method1325((byte) 90, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "Ljd;")
    private static class92 field878 = class202.method1325((byte) 90, "Prepared visibility map");

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "Ljd;")
    public static class92 field880 = class202.method1325((byte) 90, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "Ljd;")
    public static class92 field886 = class202.method1325((byte) 90, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public static int field890 = 0;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Ljd;")
    public static class92 field879 = field874;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "Ljd;")
    public static class92 field892 = class202.method1325((byte) 90, "<img=1>");

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public static int field891 = 0;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "Z")
    public static boolean field883 = false;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "[I")
    public static int[] field893 = new int[32768];

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "Ljd;")
    private static class92 field894 = class202.method1325((byte) 90, "flash1:");

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "Ljd;")
    public static class92 field885 = field894;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "Ljd;")
    public static class92 field888 = field894;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "Ljd;")
    public static class92 field875 = field878;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "B")
    public byte field884;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "Ljd;")
    public class92 field877;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "Ljd;")
    public class92 field887;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "[I")
    public static int[] field876;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BILac;)V")
    public static final void method253(byte arg0, int arg1, class4 arg2) {
        class103.method707(-1, arg1, arg2.field246, arg2.field208);
        int var3 = 13 % ((-arg0 - 51) / 58);
        field881++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([La;II)V")
    public static final void method254(class1[] arg0, int arg1, int arg2) {
        field882++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class1 var5 = arg0[var3];
            if (var5 != null) {
                if (var5.field10 == 0) {
                    if (var5.field55 != null) {
                        method254(var5.field55, arg1, 65);
                    }
                    class105 var6 = (class105) class118.field2394.method216(-89, (long) var5.field100);
                    if (var6 != null) {
                        class81.method551(var6.field2155, arg1, (byte) 97);
                    }
                }
                if (arg1 == 0 && var5.field12 != null) {
                    class156 var7 = new class156();
                    var7.field3108 = var5.field12;
                    var7.field3103 = var5;
                    class2.method18(var7, 6645);
                }
                if (arg1 == 1 && var5.field63 != null) {
                    if (var5.field90 >= 0) {
                        class1 var8 = class175.method1155(var5.field100, (byte) -119);
                        if (var8 == null || var8.field55 == null || var5.field90 >= var8.field55.length || var8.field55[var5.field90] != var5) {
                            continue;
                        }
                    }
                    class156 var9 = new class156();
                    var9.field3103 = var5;
                    var9.field3108 = var5.field63;
                    class2.method18(var9, 6645);
                }
            }
        }
        int var4 = -67 / ((arg2 + 73) / 32);
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    public static void method255(int arg0) {
        field878 = null;
        field886 = null;
        field874 = null;
        field888 = null;
        if (arg0 != 0) {
            method255(107);
        }
        field876 = null;
        field875 = null;
        field892 = null;
        field880 = null;
        field893 = null;
        field894 = null;
        field879 = null;
        field885 = null;
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V")
    public static final void method256(int arg0) {
        while (true) {
            if (class185.field3497.method400(class148.field2930, 0) >= 27) {
                int var1 = class185.field3497.method408((byte) -32, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class107.field2187[var1] == null) {
                        class107.field2187[var1] = new class129();
                        var2 = true;
                    }
                    class129 var3 = class107.field2187[var1];
                    field893[class96.field1928++] = var1;
                    var3.field244 = class158.field3150;
                    var3.field2592 = class117.method786((byte) 88, class185.field3497.method408((byte) -32, 14));
                    int var4 = class185.field3497.method408((byte) -32, 5);
                    int var5 = class185.field3497.method408((byte) -32, 1);
                    int var6 = class111.field2268[class185.field3497.method408((byte) -32, 3)];
                    if (var2) {
                        var3.field243 = var3.field234 = var6;
                    }
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var7 = class185.field3497.method408((byte) -32, 1);
                    if (var7 == 1) {
                        class135.field2710[class208.field4003++] = var1;
                    }
                    int var8 = class185.field3497.method408((byte) -32, 5);
                    var3.field211 = var3.field2592.field1963;
                    var3.field192 = var3.field2592.field1958;
                    var3.field224 = var3.field2592.field1983;
                    var3.field201 = var3.field2592.field1947;
                    var3.field217 = var3.field2592.field1936;
                    var3.field195 = var3.field2592.field1976;
                    var3.field205 = var3.field2592.field1985;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    if (var3.field195 == 0) {
                        var3.field234 = 0;
                    }
                    var3.field247 = var3.field2592.field1939;
                    var3.field197 = var3.field2592.field1952;
                    var3.method29(class15.field423.field233[0] + var4, var5 == 1, class15.field423.field198[0] + var8, 3);
                    continue;
                }
            }
            if (arg0 != -19959) {
                method254(null, 82, -109);
            }
            class185.field3497.method406(8);
            field872++;
            return;
        }
    }
}
