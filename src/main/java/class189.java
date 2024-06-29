import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class189 {

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field3014 = 7759444;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public int field3006;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public int field3008;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public int field3013;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "J")
    public long field3012;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Lgd;")
    public class310 field3004;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lgd;")
    public class310 field3005;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lgd;")
    public class310 field3007;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI[Lek;)V", line = 7)
    public static final void method1363(byte arg0, int arg1, class184[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class184 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field2945 == 0) {
                    if (var4.field2946 != null) {
                        method1363((byte) -42, arg1, var4.field2946);
                    }
                    class111 var5 = (class111) client.field3794.method203(1710, (long) var4.field2806);
                    if (var5 != null) {
                        class243.method1685(arg1, -12359, var5.field1750);
                    }
                }
                if (arg1 == 0 && var4.field2956 != null) {
                    class167 var6 = new class167();
                    var6.field2510 = var4.field2956;
                    var6.field2518 = var4;
                    class272.method1889(1, var6);
                }
                if (arg1 == 1 && var4.field2809 != null) {
                    if (var4.field2893 >= 0) {
                        class184 var7 = class100.method781((byte) 48, var4.field2806);
                        if (var7 == null || var7.field2946 == null || var4.field2893 >= var7.field2946.length || var7.field2946[var4.field2893] != var4) {
                            continue;
                        }
                    }
                    class167 var8 = new class167();
                    var8.field2510 = var4.field2809;
                    var8.field2518 = var4;
                    class272.method1889(1, var8);
                }
            }
        }
        if (arg0 >= -2) {
            method1363((byte) 44, -56, (class184[]) null);
        }
        field3002++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Lvd;", line = 85)
    public static final class134 method1364(int arg0) {
        field3011++;
        byte[] var1 = class274.field4162[0];
        int var2 = class323.field5027[0] * class111.field1756[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class57.field843[class142.method1078(var1[var4], 255)];
        }
        class134 var5 = new class134(class150.field2273, class98.field1453, class271.field4096[0], class101.field1541[arg0], class111.field1756[0], class323.field5027[0], var3);
        class265.method1835(10);
        return var5;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 110)
    public static final String method1365(boolean arg0, int arg1) {
        if (arg0) {
            method1365(false, 114);
        }
        field3003++;
        return class271.field4097[arg1].length() <= 0 ? class27.field307[arg1] : class27.field307[arg1] + class37.field562 + class271.field4097[arg1];
    }
}
