import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class78 {

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static volatile int field978 = -1;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field977 = new String[500];

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Lab;")
    public static class269 field980 = new class269();

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[IIB)V")
    public static final void method433(int arg0, int arg1, int[] arg2, int arg3, byte arg4) {
        field981++;
        if (arg4 != 123) {
            method439((String) null, -70);
        }
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        arg1--;
        while (var5 > arg1) {
            int var7 = arg1 + 1;
            arg2[var7] = arg3;
            int var8 = var7 + 1;
            arg2[var8] = arg3;
            int var9 = var8 + 1;
            arg2[var9] = arg3;
            int var10 = var9 + 1;
            arg2[var10] = arg3;
            int var11 = var10 + 1;
            arg2[var11] = arg3;
            int var12 = var11 + 1;
            arg2[var12] = arg3;
            int var13 = var12 + 1;
            arg2[var13] = arg3;
            arg1 = var13 + 1;
            arg2[arg1] = arg3;
        }
        while (arg1 < var6) {
            arg1++;
            arg2[arg1] = arg3;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method434(String arg0, byte arg1) {
        if (arg1 == -109) {
            System.out.println("Error: " + class45.method255(arg0, arg1 + 4, "\n", "%0a"));
            field979++;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static void method435(boolean arg0) {
        field980 = null;
        field977 = null;
        if (arg0) {
            method435(true);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lpd;B)V")
    public static final void method436(class96 arg0, byte arg1) {
        field976++;
        int var2 = arg0.method539(-401085592);
        class106.field1420 = new class191[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class106.field1420[var3] = new class191();
            class106.field1420[var3].field3083 = arg0.method539(-401085592);
            class106.field1420[var3].field3076 = arg0.method555(5679);
        }
        class44.field560 = arg0.method539(-401085592);
        class82.field1023 = arg0.method539(-401085592);
        class75.field936 = arg0.method539(-401085592);
        class84.field1046 = new class216[class82.field1023 + 1 - class44.field560];
        if (arg1 <= 123) {
            return;
        }
        for (int var4 = 0; var4 < class75.field936; var4++) {
            int var5 = arg0.method539(-401085592);
            class216 var6 = class84.field1046[var5] = new class216();
            var6.field3843 = arg0.method584(255);
            var6.field3844 = arg0.method597(-1197332568);
            var6.field3466 = class44.field560 + var5;
            var6.field3472 = arg0.method555(5679);
            var6.field3469 = arg0.method555(5679);
        }
        class4.field61 = arg0.method597(-1197332568);
        class294.field4667 = true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static final void method437(byte arg0) {
        class138.field2215.method1699(0);
        class17.field201.method1699(0);
        field975++;
        if (arg0 < 107) {
            field977 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
    public static final void method438(byte arg0, int arg1) {
        field982++;
        class104.field1395.method1695(arg1, arg0 ^ 0x7);
        class101.field1338.method1695(arg1, 0);
        class236.field3908.method1695(arg1, arg0 ^ 0x7);
        if (arg0 != 7) {
            method438((byte) -39, -114);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method439(String arg0, int arg1) {
        if (arg1 != -11660) {
            field978 = 24;
        }
        field974++;
        return class84.method461(10, true, 120, arg0);
    }
}
