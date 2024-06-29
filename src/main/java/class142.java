import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class142 {

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "Lno;")
    public static class5 field2395 = new class5();

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "S")
    public static short field2399 = 32767;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "Z")
    public static boolean field2398 = false;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "B")
    public byte field2387;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "B")
    public byte field2390;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "B")
    public byte field2394;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "B")
    public byte field2400;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "S")
    public short field2389;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Z")
    public boolean field2385;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "Z")
    public boolean field2391;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Z")
    public boolean field2392;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "Z")
    public boolean field2393;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "Z")
    public boolean field2397;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 8)
    public static final String method972(int arg0, byte arg1) {
        field2388++;
        if (arg1 != 37) {
            method976((Object[]) null, (int[]) null, -21, (byte) 43, 48);
        }
        return class300.field4889[arg0].length() > 0 ? class317.field5173[arg0] + class145.field2430 + class300.field4889[arg0] : class317.field5173[arg0];
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIIIIII)V", line = 25)
    public static final void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2386++;
        class107 var10 = null;
        for (class107 var11 = (class107) class123.field2165.method431(arg7 ^ arg7); var11 != null; var11 = (class107) class123.field2165.method439(arg7 ^ 0xFFFF90A6)) {
            if (var11.field1950 == arg2 && var11.field1944 == arg1 && var11.field1936 == arg5 && var11.field1952 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class107();
            var10.field1950 = arg2;
            var10.field1936 = arg5;
            var10.field1952 = arg3;
            var10.field1944 = arg1;
            class27.method217(var10, (byte) -76);
            class123.field2165.method437(var10, (byte) 51);
        }
        var10.field1948 = arg8;
        var10.field1942 = arg6;
        var10.field1940 = arg4;
        var10.field1939 = arg0;
        var10.field1951 = arg9;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V", line = 67)
    public static final void method974(int arg0, int arg1) {
        field2396++;
        class73.method555((byte) -104);
        class332.method2349(29937);
        if (arg1 != 1) {
            return;
        }
        int var2 = class79.method595(arg0, (byte) -45).field2162;
        if (var2 == 0) {
            return;
        }
        int var3 = class334.field5322[arg0];
        if (var2 == 5) {
            class301.field4895 = var3;
        }
        if (var2 == 6) {
            class49.field1024 = var3;
        }
        if (var2 == 9) {
            class238.field3971 = var3;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 116)
    public static void method975(byte arg0) {
        field2395 = null;
        int var1 = 123 % ((-arg0 - 46) / 43);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([Ljava/lang/Object;[IIBI)V", line = 127)
    public static final void method976(Object[] arg0, int[] arg1, int arg2, byte arg3, int arg4) {
        if (arg4 > arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg2;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg2; var9 < arg4; var9++) {
                if ((var7 + (var9 & 0x1)) > arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    Object var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method976(arg0, arg1, arg2, (byte) 111, var6 - 1);
            method976(arg0, arg1, var6 + 1, (byte) 111, arg4);
        }
        field2384++;
        if (arg3 != 111) {
            method974(-95, -45);
        }
    }
}
