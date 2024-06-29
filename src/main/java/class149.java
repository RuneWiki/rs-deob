import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class149 {

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "Ljava/lang/String;")
    public String field1844;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "[[I")
    public static int[][] field1840 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "Lig;")
    public static class206 field1845 = new class206(1, 7);

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "J")
    public static long field1838;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
    public static void method881(byte arg0) {
        if (arg0 > -22) {
            method882(-54, (byte) 32, false, null);
        }
        field1840 = null;
        field1845 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IBZLjava/lang/String;)I")
    public static final int method882(int arg0, byte arg1, boolean arg2, String arg3) {
        field1841++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (arg1 < 89) {
            return 7;
        }
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)Z")
    public static final boolean method883(int arg0, int arg1, int arg2) {
        if (arg0 == -37) {
            field1837++;
            boolean var3 = (arg2 & 0x37) == 0 ? class626.method3595(arg1, (byte) 72, arg2) : class564.method3263(arg2, arg1, (byte) -114);
            return (arg1 & 0x10000) != 0 | class330.method2154(arg1, arg2, (byte) 29) | var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(B)V")
    public static final void method884(byte arg0) {
        class290.field4016 = false;
        class446.field6666 = null;
        if (arg0 <= 63) {
            field1840 = null;
        }
        field1835++;
        class410.method2598(97);
    }

    @OriginalMember(owner = "client!cda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1839++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class149(String arg0, int arg1) {
        this.field1843 = arg1;
        this.field1844 = arg0;
    }
}
