import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class115 extends class444 {

    @OriginalMember(owner = "client!di", name = "H", descriptor = "B")
    public byte field1984 = 5;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field1974 = 0;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public int field1976;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    public int field1979;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "Lxa;")
    public static class468 field1980;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "Z")
    public boolean field1978;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "[J")
    public static long[] field1971;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)Z")
    public static final boolean method914(byte arg0, int arg1, int arg2) {
        field1977++;
        if (arg0 <= 98) {
            field1980 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
    public static void method915(int arg0) {
        field1980 = null;
        if (arg0 != 60) {
            method918(-73, -58, -76);
        }
        field1971 = null;
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V")
    public static final void method916(int arg0) {
        field1981++;
        if (arg0 < 5) {
            return;
        }
        int var1 = class664.field9426;
        int[] var2 = class55.field762;
        for (int var3 = 0; var3 < var1; var3++) {
            class403 var4 = class572.field7601[var2[var3]];
            if (var4 != null) {
                class37.method293(var4.method2317((byte) 40), var4, 121);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method917(byte arg0, String arg1) {
        field1970++;
        int var2 = arg1.length();
        if (arg0 != -124) {
            return null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
    public static final void method918(int arg0, int arg1, int arg2) {
        if (arg2 < 101) {
            method916(-73);
        }
        field1985++;
        class170 var3 = class105.field1570[arg0][arg1];
        if (var3 != null) {
            class517.field6897 = var3.field2626;
            class300.field4195 = var3.field2622;
            class348.field4776 = var3.field2623;
        }
        class575.method3151((byte) -100);
    }
}
