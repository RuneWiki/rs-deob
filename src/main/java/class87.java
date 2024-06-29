import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class class87 extends class90 {

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "Lo;")
    public static class332 field1236 = new class332("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!fq", name = "w", descriptor = "Lse;")
    public static class146 field1237;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "[[S")
    public static short[][] field1233;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
    public static final void method692(byte arg0) {
        field1234++;
        class468.field6580.method2459(300);
        for (class146 var1 = (class146) class451.field6377.method2456(32101); var1 != null; var1 = (class146) class451.field6377.method2461(301)) {
            if (var1.field2056 < 1000) {
                var1.method283(2);
                class468.field6580.method2453((byte) -119, var1);
            }
        }
        class468.field6580.method2452(-4912, class451.field6377);
        if (arg0 > -50) {
            field1233 = null;
        }
        int var2 = -1;
        if (class260.field3872 != null) {
            var2 = class260.field3872.method911((byte) 77);
        }
        if (!class166.field2335) {
            if (var2 == 0 && (class358.field5435 == 1 && class186.field2817 > 2 || class468.method2745(127))) {
                var2 = 2;
            }
            if (var2 == 2 && class186.field2817 > 0 && class260.field3872 != null) {
                if (class100.field1419 == null && class346.field5284 == 0) {
                    class150.method1020(class260.field3872.method912(-14721), (byte) -118, class260.field3872.method907(-126));
                } else {
                    class486.field6833 = 2;
                }
            }
            if (var2 == 0 && class186.field2817 > 0) {
                class296.method1858(false);
            }
            if (class100.field1419 != null || class346.field5284 != 0) {
                return;
            }
            class486.field6833 = 0;
            class340.field5102 = null;
            return;
        }
        if (var2 == -1) {
            int var3 = class78.field1105.method1975(83);
            int var4 = class78.field1105.method1984((byte) -95);
            if (var3 < class432.field6144 - 10 || var3 > (class330.field4935 + class432.field6144 + 10) || class99.field1414 - 10 > var4 || var4 > class99.field1414 + class450.field6355 + 10) {
                class166.field2335 = false;
                class247.method1579(class99.field1414, class330.field4935, -2472, class432.field6144, class450.field6355);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var5 = class432.field6144;
        int var6 = class99.field1414;
        int var7 = class330.field4935;
        int var8 = class260.field3872.method912(-14721);
        int var9 = class260.field3872.method907(-123);
        int var10 = -1;
        for (int var11 = 0; var11 < class186.field2817; var11++) {
            if (class486.field6828) {
                int var15 = var6 + ((class186.field2817 + -1 + -var11) * 16) + 33;
                if (var5 < var8 && var8 < var5 + var7 && (var15 - 13) < var9 && var15 + 4 > var9) {
                    var10 = var11;
                }
            } else {
                int var16 = var6 + ((class186.field2817 - (var11 + 1)) * 16) + 31;
                if (var8 > var5 && var5 + var7 > var8 && var9 > var16 - 13 && var9 < var16 + 3) {
                    var10 = var11;
                }
            }
        }
        if (var10 != -1) {
            int var12 = 0;
            class122 var13 = new class122(class451.field6377);
            for (class146 var14 = (class146) var13.method857(16986); var14 != null; var14 = (class146) var13.method860(0)) {
                if (var10 == var12) {
                    class401.method2404(var8, 0, var14, var9);
                }
                var12++;
            }
        }
        class166.field2335 = false;
        class247.method1579(class99.field1414, class330.field4935, -2472, class432.field6144, class450.field6355);
        return;
    }

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "(I)V")
    public static void method693(int arg0) {
        field1236 = null;
        field1237 = null;
        field1233 = null;
        if (arg0 != 10) {
            method692((byte) 19);
        }
    }

    static {
        new class332((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
    }
}
