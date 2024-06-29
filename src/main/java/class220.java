import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class220 {

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "J")
    public long field4022 = 0L;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field4003 = 0;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lmb;")
    public static class132 field4007 = class166.method1092("Zugewiesener Speicher)3", 119);

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "[I")
    public static int[] field4015 = new int[5];

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Lmb;")
    public static class132 field4005 = class166.method1092("mapfunction", 119);

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Lmb;")
    public static class132 field4016 = class166.method1092(":chalreq:", 119);

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field4008 = 1;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Lmb;")
    private static class132 field4024 = class166.method1092(" from your friend list first)3", 123);

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field4021 = 0;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lmb;")
    public static class132 field4013 = field4024;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public int field4004;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public int field4010;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public int field4017;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lmf;")
    public class136 field4019;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "Lmf;")
    public class136 field4023;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILkd;)Lmb;")
    public static final class132 method1370(int arg0, int arg1, class112 arg2) {
        int var3 = 10 % ((arg1 + 54) / 46);
        field4012++;
        try {
            class132 var4 = new class132();
            var4.field2479 = arg2.method754(4695);
            if (var4.field2479 > arg0) {
                var4.field2479 = arg0;
            }
            var4.field2446 = new byte[var4.field2479];
            arg2.field2133 += class58.field976.method1166((byte) -99, var4.field2479, arg2.field2157, arg2.field2133, var4.field2446, 0);
            return var4;
        } catch (Exception var5) {
            return class209.field3798;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static final void method1371(int arg0) {
        class230.field4153 &= 0x7FF;
        if (class229.field4130 < 128) {
            class229.field4130 = 128;
        }
        field4014++;
        int var1 = class187.field3460 >> 7;
        int var2 = 0;
        int var3 = class21.field310 >> 7;
        if (class229.field4130 > 383) {
            class229.field4130 = 383;
        }
        int var4 = class195.method1239(class21.field310, class139.field2615, false, class187.field3460);
        if (var1 > 3 && var3 > 3 && var1 < 100 && var3 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var3 - 4; var6 <= var3 + 4; var6++) {
                    int var7 = class139.field2615;
                    if (var7 < 3 && (class148.field2722[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class190.field3531[var7][var5][var6];
                    if (var2 < var8) {
                        var2 = var8;
                    }
                }
            }
        }
        int var9 = -101 % ((-arg0 - 47) / 41);
        int var10 = var2 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (class167.field3046 < var10) {
            class167.field3046 += (var10 - class167.field3046) / 24;
        } else if (class167.field3046 > var10) {
            class167.field3046 += (var10 - class167.field3046) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static void method1372(int arg0) {
        field4007 = null;
        field4015 = null;
        if (arg0 > 70) {
            field4016 = null;
            field4013 = null;
            field4005 = null;
            field4024 = null;
        }
    }
}
