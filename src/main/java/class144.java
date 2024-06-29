import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class144 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "[[B")
    public static byte[][] field2214 = new byte[1000][];

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Luf;")
    public static class168 field2219 = class148.method1019(-1720, "slr2)3ws?order=LPWM");

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Luf;")
    private static class168 field2220 = class148.method1019(-1720, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Luf;")
    public static class168 field2222 = class148.method1019(-1720, "(Y");

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Luf;")
    public static class168 field2212 = field2220;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Luf;")
    public static class168 field2224 = class148.method1019(-1720, "scrollen:");

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lej;")
    public static class204 field2218 = new class204(64);

    @OriginalMember(owner = "client!d", name = "n", descriptor = "[I")
    public static int[] field2225 = new int[25];

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Luf;")
    public static class168 field2226 = class148.method1019(-1720, "Fallen lassen");

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "[[[I")
    public static int[][][] field2216;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V", line = 5)
    public static void method983(boolean arg0) {
        field2218 = null;
        field2225 = null;
        field2220 = null;
        field2219 = null;
        field2226 = null;
        field2214 = (byte[][]) null;
        field2216 = (int[][][]) null;
        field2212 = null;
        if (arg0) {
            field2219 = (class168) null;
        }
        field2222 = null;
        field2224 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)Z", line = 27)
    public static final boolean method984(int arg0, boolean arg1) {
        field2215++;
        if (arg1) {
            method984(-18, true);
        }
        return ((arg0 & 0x1F0032F2) >> 28) != 0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 42)
    public static final void method985(int arg0) {
        if (class157.field2493 != null) {
            class157.field2493.method1229(545);
            class157.field2493 = null;
        }
        class102.method765((byte) 95);
        field2213++;
        class43.method238();
        for (int var1 = 0; var1 < 4; var1++) {
            class140.field2176[var1].method1728(16777216);
        }
        class110.method818(arg0 - 1445985368);
        System.gc();
        class178.method1278(2, 11727);
        class122.field1895 = -1;
        class5.field55 = false;
        class111.method823(true, -117);
        class182.field2916 = 0;
        class276.field4641 = arg0;
        class253.field4311 = false;
        for (int var2 = 0; var2 < class43.field534.length; var2++) {
            class43.field534[var2] = null;
        }
        class167.field2676 = 0;
        class2.field15 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class9.field117[var3] = null;
            class114.field1778[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class190.field3065[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class71.field952[var5][var6][var7] = null;
                }
            }
        }
        class82.method524((byte) -37);
        class68.method382(15979);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[I[JII)V", line = 178)
    public static final void method986(int arg0, int[] arg1, long[] arg2, int arg3, int arg4) {
        if (arg3 > arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var9;
            for (int var10 = arg0; var10 < arg3; var10++) {
                if (((long) (var10 & 0x1) + var7) > arg2[var10]) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var9;
            method986(arg0, arg1, arg2, var6 - 1, 0);
            method986(var6 + 1, arg1, arg2, arg3, 0);
        }
        if (arg4 == 0) {
            field2223++;
        }
    }
}
