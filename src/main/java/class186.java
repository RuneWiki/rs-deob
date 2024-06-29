import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class186 extends class273 {

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "Ljd;")
    public static class86 field3297 = class122.method868(" zuerst von Ihrer Ignorieren)2Liste(Q", true);

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "[Lgj;")
    public static class224[] field3294 = new class224[2048];

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "Ljd;")
    public static class86 field3298 = class122.method868("loc", true);

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    public static int field3299 = 0;

    @OriginalMember(owner = "client!vi", name = "fb", descriptor = "Ljd;")
    public static class86 field3303 = class122.method868("Lade Sprites )2 ", true);

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3295 = new CRC32();

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!vi", name = "cb", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!vi", name = "db", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!vi", name = "gb", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!vi", name = "eb", descriptor = "Lbj;")
    public static class151 field3302;

    @OriginalMember(owner = "client!vi", name = "hb", descriptor = "Lbj;")
    public static class151 field3305;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "[Ltj;")
    public static class260[] field3292;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)Z")
    public static final boolean method1278(int arg0, int arg1) {
        if (arg1 != -2964) {
            field3295 = null;
        }
        ++field3290;
        return ~(arg0 >> 31 & 1) != -1;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class186() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(BI)I")
    public static final int method1279(byte arg0, int arg1) {
        int var2 = -65 % ((arg0 - 38) / 42);
        ++field3293;
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZIII)V")
    public static final void method1280(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field3296;
        int var5 = 0;
        if (!arg1) {
            field3294 = null;
        }
        while (~var5 > ~class51.field1062) {
            if (~(class216.field3902[var5] + class127.field2439[var5]) < ~arg0 && ~(arg0 + arg4) < ~class127.field2439[var5] && arg2 < class37.field842[var5] + class31.field665[var5] && class37.field842[var5] < arg2 + arg3) {
                class21.field540[var5] = true;
            }
            ++var5;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field3301;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            int[][] var4 = this.method1859(arg1, 0, 3);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class176.field3200 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        if (arg0 != -7420) {
            method1282((class86) null, -85, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)V")
    public static void method1281(int arg0) {
        field3305 = null;
        field3294 = null;
        field3302 = null;
        field3298 = null;
        field3303 = null;
        field3295 = null;
        field3292 = null;
        if (arg0 != 255) {
            method1280(-120, false, -99, 70, 82);
        }
        field3297 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljd;IZ)V")
    public static final void method1282(class86 arg0, int arg1, boolean arg2) {
        class86 var3 = arg0.method585(33);
        ++field3304;
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class78.field1541; ++var6) {
            class69 var9 = class272.method1853(0, var6);
            if ((!arg2 || var9.field1374) && var9.field1391 == -1 && var9.field1401 == -1 && var9.field1376 == 0 && ~var9.field1421.method585(arg1 ^ -1949295104).method604(var3, true) != 0) {
                if (var5 >= 250) {
                    class272.field4771 = null;
                    class143.field2710 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var5 > var11; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class260.field4661 = 0;
        class143.field2710 = var5;
        class272.field4771 = var4;
        class86[] var7 = new class86[class143.field2710];
        if (arg1 == -1949295071) {
            for (int var8 = 0; class143.field2710 > var8; ++var8) {
                var7[var8] = class272.method1853(class177.method1249(arg1, -1949295071), var4[var8]).field1421;
            }
            class102.method735(class272.field4771, arg1 + 1949270051, var7);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIBI)V")
    public static final void method1283(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field3300;
        class56.method412(arg2, (byte) -102, arg1 + arg4, class249.field4420[arg0], -arg1 + arg4);
        int var5 = 0;
        int var6 = arg1;
        int var7 = -1;
        int var8 = -arg1;
        while (var5 < var6) {
            var7 += 2;
            ++var5;
            var8 += var7;
            if (~var8 <= -1) {
                int var9 = arg4 + var5;
                --var6;
                var8 -= var6 << 1;
                int var10 = arg4 - var5;
                int[] var11 = class249.field4420[arg0 + var6];
                int[] var12 = class249.field4420[arg0 - var6];
                class56.method412(arg2, (byte) -100, var9, var11, var10);
                class56.method412(arg2, (byte) -124, var9, var12, var10);
            }
            int var13 = arg4 - -var6;
            int var14 = arg4 - var6;
            int[] var15 = class249.field4420[arg0 + var5];
            int[] var16 = class249.field4420[-var5 + arg0];
            class56.method412(arg2, (byte) -128, var13, var15, var14);
            class56.method412(arg2, (byte) -107, var13, var16, var14);
        }
        if (arg3 > -111) {
            field3295 = null;
        }
    }
}
