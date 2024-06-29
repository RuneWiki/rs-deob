import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class325 extends class5 {

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "J")
    public long field5013;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Lge;")
    public class325 field5017;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "Lge;")
    public class325 field5018;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Z")
    public static boolean field5020;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([BIZ)Ljava/lang/Object;", line = 10)
    public static final Object method2253(byte[] arg0, int arg1, boolean arg2) {
        field5012++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class103.field1510) {
            try {
                class166 var3 = (class166) Class.forName("am").getDeclaredConstructor().newInstance();
                var3.method1262(false, arg0);
                return var3;
            } catch (Throwable var5) {
                class103.field1510 = true;
            }
        }
        if (arg1 != 2) {
            method2258(109, -59);
        }
        return arg2 ? class238.method1657(arg0, 127) : arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[JII[I)V", line = 46)
    public static final void method2254(int arg0, long[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg2 < 94) {
            return;
        }
        if (arg0 < arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var9;
            for (int var10 = arg0; var10 < arg3; var10++) {
                if (arg1[var10] < ((long) (var10 & 0x1) + var7)) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var13 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var13;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var9;
            method2254(arg0, arg1, 102, var6 - 1, arg4);
            method2254(var6 + 1, arg1, 109, arg3, arg4);
        }
        field5014++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V", line = 101)
    public static final void method2255(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5015++;
        class188 var5 = class147.method1111(-83, arg3, 4);
        var5.method1392((byte) -48);
        var5.field2955 = arg2;
        int var6 = 0 / ((-arg1 - 18) / 49);
        var5.field2959 = arg0;
        var5.field2954 = arg4;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[S[Ljava/lang/String;)V", line = 118)
    public static final void method2256(int arg0, short[] arg1, String[] arg2) {
        class270.method1888(arg0, arg2, arg2.length - 1, (byte) -108, arg1);
        field5011++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 126)
    public final void method2257(boolean arg0) {
        field5019++;
        if (this.field5018 == null) {
            return;
        }
        this.field5018.field5017 = this.field5017;
        if (arg0) {
            this.field5013 = -102L;
        }
        this.field5017.field5018 = this.field5018;
        this.field5018 = null;
        this.field5017 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Lih;", line = 151)
    public static final class320 method2258(int arg0, int arg1) {
        field5016++;
        class320 var2 = (class320) class149.field2259.method730((long) arg1, (byte) 90);
        if (arg0 != 25494) {
            field5020 = false;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class182.field2887.method696(class323.method2243(arg1, 1922), (byte) 120, class223.method1592(arg1, (byte) -101));
        class320 var4 = new class320();
        if (var3 != null) {
            var4.method2223(new class254(var3), -84);
        }
        class149.field2259.method734((byte) -14, (long) arg1, var4);
        return var4;
    }
}
