import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class146 {

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "[I")
    private int[] field3047;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lea;")
    public static class38 field3040 = null;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field3038 = 0;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lea;")
    private static class38 field3039 = class9.method46((byte) 101, " from your friend list first)3");

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lea;")
    public static class38 field3044 = class9.method46((byte) 117, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lea;")
    private static class38 field3048 = class9.method46((byte) 112, "Members only world");

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Lea;")
    public static class38 field3051 = field3048;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lea;")
    public static class38 field3043 = field3039;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Lea;")
    private static class38 field3053 = class9.method46((byte) 109, "wave2:");

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Lea;")
    public static class38 field3054 = class9.method46((byte) 105, "Art");

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Lea;")
    public static class38 field3045 = field3053;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field3052 = -1;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "[Lea;")
    public static class38[] field3046 = new class38[1000];

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lea;")
    public static class38 field3057 = field3053;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "J")
    public static long field3042;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Lob;")
    public static class127 field3049;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Lq;")
    public static class143 field3050;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILdd;)V")
    public static final void method1042(int arg0, class32 arg1) {
        class199.field3930 = arg1;
        if (arg0 != 24434) {
            field3046 = null;
        }
        field3037++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZILpf;II)V")
    public static final void method1043(int arg0, boolean arg1, int arg2, class140 arg3, int arg4, int arg5) {
        field3056++;
        if (class37.field784 >= 50 || (arg3.field2915 == null || arg3.field2915.length <= arg0)) {
            return;
        }
        int var6 = arg3.field2915[arg0];
        if (var6 == 0) {
            return;
        }
        if (arg2 != -27816) {
            field3043 = null;
        }
        int var7 = var6 & 0xF;
        int var8 = var6 >> 8;
        int var9 = var6 >> 4 & 0x7;
        if (var7 == 0) {
            if (arg1) {
                class156.method1087((byte) -100, 0, var9, var8);
            }
        } else if (class113.field2522 != 0) {
            int var10 = (arg4 - 64) / 128;
            class117.field2562[class37.field784] = var8;
            class83.field1965[class37.field784] = var9;
            int var11 = (arg5 - 64) / 128;
            class192.field3801[class37.field784] = 0;
            class181.field3649[class37.field784] = null;
            class143.field2987[class37.field784] = (var10 << 16) + (var11 << 8) + var7;
            class37.field784++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method1044(int arg0) {
        field3053 = null;
        field3048 = null;
        field3050 = null;
        field3046 = null;
        field3045 = null;
        field3039 = null;
        field3049 = null;
        field3051 = null;
        field3044 = null;
        field3040 = null;
        field3057 = null;
        if (arg0 != 24932) {
            method1042(-2, null);
        }
        field3054 = null;
        field3043 = null;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([I)V")
    public class146(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3047 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3047[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3047[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3047[var5 + var5] = arg0[var4];
            this.field3047[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
    public final int method1045(int arg0, int arg1) {
        field3041++;
        int var3 = (this.field3047.length >> 1) + arg0;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field3047[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3047[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
