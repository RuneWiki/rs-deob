import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class230 {

    @OriginalMember(owner = "client!he", name = "s", descriptor = "J")
    public long field4029 = 0L;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[Lub;")
    public static class227[] field4014 = new class227[1000];

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Lub;")
    public static class227 field4026 = class257.method1749("<col=00ffff>", 17263);

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lub;")
    public static class227 field4019 = null;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lub;")
    public static class227 field4027 = class257.method1749("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 17263);

    @OriginalMember(owner = "client!he", name = "u", descriptor = "[J")
    public static long[] field4031 = new long[100];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public int field4022;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public int field4023;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public int field4025;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public int field4032;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public int field4033;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Ln;")
    public static class138 field4024;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lfh;")
    public class180 field4021;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method1551(int arg0) {
        field4024 = null;
        field4027 = null;
        field4019 = null;
        field4014 = null;
        field4031 = null;
        field4026 = null;
        if (arg0 != -8240) {
            method1552((byte) -57, -32);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)V")
    public static final void method1552(byte arg0, int arg1) {
        field4011++;
        if (!class195.method1234(arg1, (byte) -5)) {
            return;
        }
        class105[] var2 = class102.field1792[arg1];
        int var3 = 83 % ((59 - arg0) / 35);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class105 var5 = var2[var4];
            if (var5 != null) {
                var5.field1944 = 0;
                var5.field1908 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
    public static final void method1553(int arg0, int arg1) {
        class108 var2 = class261.field4539[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class108 var4 = class261.field4539[var3][arg0][arg1] = class261.field4539[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2018--;
                for (int var5 = 0; var5 < var4.field2012; var5++) {
                    class230 var6 = var4.field2021[var5];
                    if ((var6.field4029 >> 29 & 0x3L) == 2L && var6.field4032 == arg0 && var6.field4025 == arg1) {
                        var6.field4022--;
                    }
                }
            }
        }
        if (class261.field4539[0][arg0][arg1] == null) {
            class261.field4539[0][arg0][arg1] = new class108(0, arg0, arg1);
        }
        class261.field4539[0][arg0][arg1].field2015 = var2;
        class261.field4539[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[I)[I")
    public static final int[] method1554(int arg0, int[] arg1) {
        if (arg0 != -571) {
            field4014 = null;
        }
        field4030++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class68.method424(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
    public static final void method1555(int arg0, int arg1, int arg2) {
        if (arg0 != 238) {
            return;
        }
        field4017++;
        int var3 = 0;
        short var4 = 256;
        if (class225.field3839 > 0) {
            class175.method1117(-1, class225.field3839);
            class225.field3839 = 0;
        }
        int var5 = class111.field2066 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < (var4 - 1); var7++) {
            int var8 = (var4 - var7) * class243.field4214[var7] / var4;
            if (var8 < 0) {
                var8 = 0;
            }
            var3 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class111.field2069[arg1 + (var5++)];
                int var12 = class142.field2448[var3++];
                if (var12 == 0) {
                    class251.field4346.field2756[var6++] = var11;
                } else {
                    int var13 = var12 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 238 - var12;
                    int var15 = class133.field2316[var12];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class251.field4346.field2756[var6++] = class76.method446(-16711936, class76.method446(var15, 16711935) * var13 + (var14 * class76.method446(var11, 16711935))) + class76.method446(var14 * class76.method446(65280, var11) + var13 * class76.method446(var15, 65280), 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class251.field4346.field2756[var6++] = class111.field2069[var5++ + arg1];
            }
            var5 += class111.field2066 - 128;
        }
        class251.field4346.method784(arg1, arg2);
    }
}
