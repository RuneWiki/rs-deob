import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class120 {

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Ldu;")
    private class360 field1917 = new class360(256);

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "Ldu;")
    private class360 field1923 = new class360(256);

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Lwu;")
    private class376 field1921;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Lwu;")
    private class376 field1922;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([III)Lct;", line = 16)
    public final class147 method970(int[] arg0, int arg1, int arg2) {
        field1918++;
        int var4 = 110 % ((-arg1 - 25) / 49);
        if (this.field1921.method2198(0) == 1) {
            return this.method971(0, -82, arg0, arg2);
        } else if (this.field1921.method2195(arg2, 0) == 1) {
            return this.method971(arg2, -128, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[II)Lct;", line = 43)
    private final class147 method971(int arg0, int arg1, int[] arg2, int arg3) {
        field1915++;
        int var5 = ((arg0 & 0xC0000FFF) << 4 | arg0 >>> 12) ^ arg3;
        int var6 = var5 | arg0 << 16;
        if (arg1 >= -70) {
            this.method971(-36, 109, null, -102);
        }
        long var7 = (long) var6;
        class147 var9 = (class147) this.field1923.method2135(var7, (byte) 31);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class174 var10 = class174.method1219(this.field1921, arg0, arg3);
            if (var10 == null) {
                return null;
            }
            class147 var11 = var10.method1220();
            this.field1923.method2143(-1, var11, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field2322.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([IBII)Lct;", line = 79)
    private final class147 method972(int[] arg0, byte arg1, int arg2, int arg3) {
        field1916++;
        int var5 = (arg3 >>> 12 | arg3 << 4 & 0xFFFD) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class147 var9 = (class147) this.field1923.method2135(var7, (byte) 31);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class627 var10 = (class627) this.field1917.method2135(var7, (byte) 31);
            if (var10 == null) {
                var10 = class627.method3453(this.field1922, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field1917.method2143(-1, var10, var7);
            }
            class147 var11 = var10.method3450(arg0);
            if (arg1 < 45) {
                this.method973(null, (byte) 112, 1);
            }
            if (var11 == null) {
                return null;
            } else {
                var10.method3564(true);
                this.field1923.method2143(-1, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lwu;Lwu;)V", line = 152)
    public class120(class376 arg0, class376 arg1) {
        this.field1921 = arg0;
        this.field1922 = arg1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([IBI)Lct;", line = 129)
    public final class147 method973(int[] arg0, byte arg1, int arg2) {
        field1920++;
        if (this.field1922.method2198(0) == 1) {
            return this.method972(arg0, (byte) 88, arg2, 0);
        } else if (this.field1922.method2195(arg2, 0) == 1) {
            return this.method972(arg0, (byte) 81, 0, arg2);
        } else {
            int var4 = 39 / ((arg1 + 11) / 41);
            throw new RuntimeException();
        }
    }
}
