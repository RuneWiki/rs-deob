import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class350 extends class183 {

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field5176 = 0;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "C")
    public char field5180;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public int field5177;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public int field5178;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "J")
    public long field5167;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lve;")
    public class350 field5168;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Z")
    public boolean field5172;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "[I")
    public static int[] field5171;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)J")
    public final long method1216(boolean arg0) {
        field5179++;
        return arg0 ? -124L : this.field5167;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method2177(boolean arg0, int arg1, String arg2) {
        field5170++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = arg1;
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class507.field7412.field1993 : class507.field7412.field1990);
        for (int var8 = var6; var8 < var7; var8++) {
            class276 var11 = class507.field7412.method963(var8, (byte) 87);
            if (var11.field4202 && var11.method1819(1).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class419.field6258 = null;
                    class316.field4778 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class419.field6258 = var4;
        class19.field248 = 0;
        class316.field4778 = var5;
        String[] var9 = new String[class316.field4778];
        for (int var10 = 0; var10 < class316.field4778; var10++) {
            var9[var10] = class507.field7412.method963(var4[var10], (byte) 87).method1819(1);
        }
        class310.method1981(65, var9, class419.field6258);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
    public final int method1217(int arg0) {
        if (arg0 < 105) {
            method2177(true, -61, null);
        }
        field5169++;
        return this.field5177;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Z")
    public final boolean method1214(boolean arg0) {
        field5166++;
        return arg0 ? this.field5172 : true;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Lwg;")
    public static final class296 method2178(int arg0, int arg1) {
        field5175++;
        class296 var2 = (class296) class359.field5331.method87((long) arg1, -2062335807);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class445.field6530.method2536(0, arg0, arg1);
        class296 var4 = new class296();
        if (var3 != null) {
            var4.method1922(arg1, (byte) -99, new class217(var3));
        }
        class359.field5331.method84((long) arg1, var4, (byte) 27);
        return var4;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)I")
    public final int method1215(byte arg0) {
        field5173++;
        int var2 = -123 % ((arg0 - 43) / 41);
        return this.field5178;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)C")
    public final char method1221(int arg0) {
        field5165++;
        return arg0 == 15030 ? this.field5180 : '\u0011';
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
    public static void method2179(byte arg0) {
        if (arg0 <= 35) {
            field5171 = null;
        }
        field5171 = null;
    }
}
